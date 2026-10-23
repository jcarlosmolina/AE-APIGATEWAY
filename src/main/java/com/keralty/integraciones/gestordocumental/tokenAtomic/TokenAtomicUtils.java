package com.keralty.integraciones.gestordocumental.tokenAtomic;


import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.keralty.ae.exception.LogManagement;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.STDFunctions;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TokenAtomicUtils {


	@ConfigProperty(name="com.keralty.integraciones.tokenatomic.url")
	String url;

	@ConfigProperty(name="com.keralty.integraciones.tokenatomic.usr")
	String username;

	@ConfigProperty(name="com.keralty.integraciones.tokenatomic.pwd")
	String password;

	@ConfigProperty(name="com.keralty.integraciones.tokenatomic.clientid")
	String clientId;

	@ConfigProperty(name="com.keralty.integraciones.tokenatomic.clientsecret")
	String clientSecret;


	public TokenAtomicUtils() {

	}

	public String generarTokenParaATOMIC() throws SystemException {

		String retorno = "";

		if (url== null || url.isEmpty()) {
			throw new SystemException("No se ha encontrado la propiedad com.keralty.integraciones.tokenatomic.url");
		}

		if (username == null || username.isEmpty()) {
			throw new SystemException("No se ha encontrado la property com.keralty.integraciones.tokenatomic.usr");
		}
		if (password == null || password.isEmpty()) {
			throw new SystemException("No se ha encontrado la property com.keralty.integraciones.tokenatomic.pwd");
		}
		if (clientId == null || clientId.isEmpty()) {
			throw new SystemException("No se ha encontrado la property com.keralty.integraciones.tokenatomic.clientid");
		}
		if (clientSecret == null || clientSecret.isEmpty()) {
			throw new SystemException("No se ha encontrado la property com.keralty.integraciones.tokenatomic.clientsecret");
		}

		HashMap<String, String> params = new HashMap<>();
		params.put("grant_type", "password");
		params.put("username", username );
		params.put("password", password);
		params.put("client_id", clientId);
		params.put("client_secret", clientSecret);

		String urlParameters = getDataString(params);
		byte[] postData = urlParameters.getBytes(StandardCharsets.UTF_8);
		int postDataLength = postData.length;

		String request = url;
		URL url;
		int numReintentos401 = 0;
		String mensajeError = "";
		while (numReintentos401 < 2) {

			try {
				url = new URL(request);
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setDoOutput(true);
				conn.setInstanceFollowRedirects(false);
				conn.setRequestMethod("POST");
				conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
				conn.setRequestProperty("charset", "utf-8");
				conn.setRequestProperty("Content-Length", Integer.toString(postDataLength));
				conn.setUseCaches(false);
				DataOutputStream wr = new DataOutputStream(conn.getOutputStream());
				wr.write(postData);

				InputStream is = conn.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				StringBuilder response = new StringBuilder();
				String output;
				while ((output = br.readLine()) != null) {
					response.append(output);
				}

				// Analizamos la respuesta obtenida
				// Se debe tomar de la respuesta del Api el access_token
				JsonObject responseJson = new Gson().fromJson(response.toString(), JsonObject.class);
				if (responseJson != null && responseJson.get("access_token") != null) {
					retorno = responseJson.get("access_token").getAsString();
					break;
				}

			} catch (Exception e) {
				mensajeError = e.getMessage();
				if (mensajeError != null && mensajeError.indexOf("401") >= 0) {
				//if (mensajeError != null) {
					LogManagement.info("Gestor Documental. Reintento por 401");
					// Esperamos 2 segundos
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e1) {
						LogManagement.error(e1);
						Thread.currentThread().interrupt();
					}
					numReintentos401++;			
				} else {
					break;
					// throw new SystemException(e);
				}				
			}
		}
		if (mensajeError != null && !mensajeError.isEmpty()) {
			LogManagement.info("Gestor Documental. " + mensajeError);
			throw new SystemException(STDFunctions.getTextoErrorUsuarioFinal("ATOT-1000"));
		}
		
		return retorno;
	}

	private String getDataString(HashMap<String, String> params) throws SystemException {
		StringBuilder result = new StringBuilder();
		try {
			boolean first = true;
			for (Map.Entry<String, String> entry : params.entrySet()) {
				if (first)
					first = false;
				else
					result.append("&");
				result.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
				result.append("=");
				result.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
			}
		} catch (UnsupportedEncodingException e) {
			throw new SystemException(e);
		}

		return result.toString();
	}

}
