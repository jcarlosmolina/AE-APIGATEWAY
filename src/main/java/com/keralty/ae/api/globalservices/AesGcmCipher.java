package com.keralty.ae.api.globalservices;

import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * Clase para cifrar utilizando AES 256
 */
public class AesGcmCipher {

    private static final String ALGORITHM = "AES/GCM/NoPadding";
    private static final int KEY_SIZE_BYTES = 32;
    private static final int IV_SIZE_BYTES = 12;
    private static final int TAG_SIZE_BITS = 128;
    private static final int TAG_SIZE_BYTES = TAG_SIZE_BITS / 8;

    private static final int MAX_PLAINTEXT_BYTES = 64 * 1024;

    /* Límites del formato [IV][ciphertext + tag] */
    private static final int MIN_DATA_BYTES = IV_SIZE_BYTES + TAG_SIZE_BYTES;
    private static final int MAX_DATA_BYTES =
        IV_SIZE_BYTES + MAX_PLAINTEXT_BYTES + TAG_SIZE_BYTES;

    /* Longitud máxima en Base64 URL sin padding para MAX_DATA_BYTES */
    private static final int MAX_ENCODED_CHARS = (4 * MAX_DATA_BYTES + 2) / 3;

    private final SecretKeySpec secretKey;
    private final SecureRandom secureRandom;

    public AesGcmCipher(byte[] key) {

        if (key == null || key.length != KEY_SIZE_BYTES) {
            throw new IllegalArgumentException(
                "AES-256 requiere una clave de 32 bytes"
            );
        }

        this.secretKey = new SecretKeySpec(key, "AES");
        this.secureRandom = new SecureRandom();
    }

    public String encrypt(String plainText) throws Exception {

        if (plainText == null) {
            throw new IllegalArgumentException("Plaintext is null");
        }

        byte[] input = plainText.getBytes(StandardCharsets.UTF_8);
        if (input.length > MAX_PLAINTEXT_BYTES) {
            throw new IllegalArgumentException("Plaintext too large");
        }

        byte[] iv = new byte[IV_SIZE_BYTES];
        secureRandom.nextBytes(iv);

        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(
            Cipher.ENCRYPT_MODE,
            secretKey,
            new GCMParameterSpec(TAG_SIZE_BITS, iv)
        );

        byte[] encrypted = cipher.doFinal(input);

        /*
         * Formato:
         *
         * [12 bytes IV][ciphertext + 16 bytes authentication tag]
         */
        byte[] result = new byte[Math.addExact(iv.length, encrypted.length)];

        System.arraycopy(iv, 0, result, 0, iv.length);
        System.arraycopy(encrypted, 0, result, iv.length, encrypted.length);

        return Base64.getUrlEncoder()
                .withoutPadding()
                .encodeToString(result);
    }

    public String decrypt(String encryptedText) throws Exception {

        if (encryptedText == null || encryptedText.length() > MAX_ENCODED_CHARS) {
            throw new IllegalArgumentException("Datos cifrados inválidos");
        }

        byte[] data = Base64.getUrlDecoder().decode(encryptedText);

        if (data.length < MIN_DATA_BYTES || data.length > MAX_DATA_BYTES) {
            throw new IllegalArgumentException("Datos cifrados inválidos");
        }

        byte[] iv = Arrays.copyOfRange(data, 0, IV_SIZE_BYTES);
        byte[] encrypted = Arrays.copyOfRange(data, IV_SIZE_BYTES, data.length);

        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(
            Cipher.DECRYPT_MODE,
            secretKey,
            new GCMParameterSpec(TAG_SIZE_BITS, iv)
        );

        byte[] decrypted = cipher.doFinal(encrypted);

        return new String(decrypted, StandardCharsets.UTF_8);
    }
}