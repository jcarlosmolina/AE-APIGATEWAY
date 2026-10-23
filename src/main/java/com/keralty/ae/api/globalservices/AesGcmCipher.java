package com.keralty.ae.api.globalservices;

import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Base64;

/**
 * Clase para cifrar utilizando AES 256
 */
public class AesGcmCipher {

    private static final String ALGORITHM = "AES/GCM/NoPadding";
    private static final int KEY_SIZE_BYTES = 32;
    private static final int IV_SIZE_BYTES = 12;
    private static final int TAG_SIZE_BITS = 128;

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

        byte[] iv = new byte[IV_SIZE_BYTES];
        secureRandom.nextBytes(iv);

        Cipher cipher = Cipher.getInstance(ALGORITHM);

        GCMParameterSpec gcmSpec =
            new GCMParameterSpec(TAG_SIZE_BITS, iv);

        cipher.init(
            Cipher.ENCRYPT_MODE,
            secretKey,
            gcmSpec
        );

        byte[] encrypted =
            cipher.doFinal(
                plainText.getBytes(StandardCharsets.UTF_8)
            );

        /*
         * Formato:
         *
         * [12 bytes IV][ciphertext + 16 bytes authentication tag]
         */

        byte[] result =
            new byte[iv.length + encrypted.length];

        System.arraycopy(
            iv,
            0,
            result,
            0,
            iv.length
        );

        System.arraycopy(
            encrypted,
            0,
            result,
            iv.length,
            encrypted.length
        );

        return Base64.getUrlEncoder()
                .withoutPadding()
                .encodeToString(result);
    }

    public String decrypt(String encryptedText) throws Exception {

        byte[] data =
            Base64.getUrlDecoder().decode(encryptedText);

        if (data.length <= IV_SIZE_BYTES) {
            throw new IllegalArgumentException(
                "Datos cifrados inválidos"
            );
        }

        byte[] iv =
            new byte[IV_SIZE_BYTES];

        byte[] encrypted =
            new byte[data.length - IV_SIZE_BYTES];

        System.arraycopy(
            data,
            0,
            iv,
            0,
            IV_SIZE_BYTES
        );

        System.arraycopy(
            data,
            IV_SIZE_BYTES,
            encrypted,
            0,
            encrypted.length
        );

        Cipher cipher =
            Cipher.getInstance(ALGORITHM);

        GCMParameterSpec gcmSpec =
            new GCMParameterSpec(
                TAG_SIZE_BITS,
                iv
            );

        cipher.init(
            Cipher.DECRYPT_MODE,
            secretKey,
            gcmSpec
        );

        byte[] decrypted =
            cipher.doFinal(encrypted);

        return new String(
            decrypted,
            StandardCharsets.UTF_8
        );
    }
}