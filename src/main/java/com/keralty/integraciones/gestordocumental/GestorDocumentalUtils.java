package com.keralty.integraciones.gestordocumental;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.sql.Timestamp;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.keralty.ae.exception.LogManagement;
import com.keralty.ae.global.STDFunctions;
import com.keralty.integraciones.CallBHUtils;
import com.keralty.integraciones.gestordocumental.buscar.response.Document;
import com.keralty.integraciones.gestordocumental.buscar.response.ResponseBuscarDocumentos;
import com.keralty.integraciones.gestordocumental.tokenAtomic.TokenAtomicUtils;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class GestorDocumentalUtils {

	@ConfigProperty(name = "com.keralty.integraciones.atomic.urldescarga", defaultValue = "")
	private String urlDescarga;

	@ConfigProperty(name = "com.keralty.integraciones.atomic.repositoryidentifier", defaultValue = "KERALTY")
	private String repositoryIdentifier;

	CallBHUtils callBHUtils;

	TokenAtomicUtils tokenAtomicUtils;

	@RestClient
	GestorDocumentalProxy gestorDocumentalProxy2;

	@ConfigProperty(name = "com.keralty.integraciones.maxintentosllamada", defaultValue = "0")
	private int maxIntentosLlamada;

	private int maxReintentos401 = 2;

	@Inject
	public GestorDocumentalUtils(CallBHUtils callBHUtils, TokenAtomicUtils tokenAtomicUtils) {
		this.callBHUtils = callBHUtils;
		this.tokenAtomicUtils = tokenAtomicUtils;
	}

	public String obtenerURLUnicoUso(String idGestor, String numSolicitud) {

		String usuario = "";
		try {
			usuario = callBHUtils.getUsuario();
		} catch (Exception e) {
			LogManagement.error("ATO-0005. Error recuperando usuario. " + e.getMessage());
			return "";
		}

		String retorno = "";
		Exception excepcion = null;
		Timestamp fechaHora = STDFunctions.systemDateTimeFun();
		long startTime = System.currentTimeMillis();
		long endTime = startTime;
		Double tiempoEjecucion = 0.0;
		try {
			// Primero obtenemos el Token
			String token = tokenAtomicUtils.generarTokenParaATOMIC();

			if (urlDescarga == null || urlDescarga.isEmpty()) {
				LogManagement.info("No se ha encontrado la property com.keralty.integraciones.atomic.urldescarga");
				return "";
			}

			String request = urlDescarga;
			if (!request.endsWith("/")) {
				request += "/";
			}
			try {
				request += URLEncoder.encode(idGestor, "UTF-8");
			} catch (UnsupportedEncodingException e1) {
				LogManagement.info("ATO-0010. Error al codificar");
			}

			String respuesta = "";
			String textoError = "";
			URL url;
			startTime = System.currentTimeMillis();
			try {
				url = new URL(request);
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setDoOutput(true);
				conn.setDoInput(true);
				conn.setInstanceFollowRedirects(false);
				conn.setRequestMethod("GET");
				conn.setRequestProperty("Authorization", "Bearer " + token);
				conn.setUseCaches(false);
				try {

					InputStream is = conn.getInputStream();
					InputStreamReader isr = new InputStreamReader(is);
					BufferedReader br = new BufferedReader(isr);
					StringBuilder response = new StringBuilder();
					String output;
					while ((output = br.readLine()) != null) {
						response.append(output);
					}
					endTime = System.currentTimeMillis();
					// Analizamos la respuesta obtenida
					respuesta = response.toString();
					JsonObject responseJson = new Gson().fromJson(respuesta, JsonObject.class);
					if (responseJson != null && responseJson.get("response") != null) {
						retorno = responseJson.get("response").getAsString();
					}

				} catch (IOException e) {
					textoError = e.getMessage();
					excepcion = e;
				}
			} catch (MalformedURLException e) {
				textoError = e.getMessage();
				excepcion = e;
			} catch (ProtocolException e) {
				textoError = e.getMessage();
				excepcion = e;
			} catch (IOException e) {
				textoError = e.getMessage();
				excepcion = e;
			}

			tiempoEjecucion = (double) ((endTime - startTime) / 1000.0f);
			callBHUtils.guardarLlamadaBH(fechaHora, usuario, "Descarga", "GestorDocumental", numSolicitud, request,
					respuesta, tiempoEjecucion, textoError);

		} catch (Exception e) {
			excepcion = e;
		}
		if (excepcion != null) {
			LogManagement.error("ATO-0100");
			LogManagement.error(excepcion);
		}

		return retorno;
	}

	public String buscarDocumentoIdentificacion(String numIdentificacion, String numSolicitud) {

		String usuario = "";
		try {
			usuario = callBHUtils.getUsuario();
		} catch (Exception e) {
			LogManagement.error("ATO-0105. Error recuperando usuario. " + e.getMessage());
			return null;
		}

		long startTime = System.currentTimeMillis();
		Timestamp fechaHora = STDFunctions.systemDateTimeFun();
		String mensajeError = "";
		long endTime = startTime;
		Double tiempoEjecucion = 0.0;
		int numIntentos = 1;
		int numReintentos401 = 0;

		String query = String.format("""
				    query {
				      documents(
				        repositoryIdentifier: "%1$s",
				        from: "Document d WITH INCLUDESUBCLASSES",
				        where: "d.[NumeroDocumentoIdentidad] = '%2$s'",
				        orderBy: "DocumentTitle",
				        pageSize: 20
				      ) {
				        documents {
				          className,
				          properties(includes:
				   [
				     "Id",
				     "dateCreated",
				     "DocumentTitle"
				     ]
				 )  {
				            label
				            id
				            value
				          }
				        }
				      }
				    }
				""", repositoryIdentifier, numIdentificacion);

		// Escapamos las comillas dobles y quitamos saltos de línea
		String peticion = String.format("{\"query\": %s}", quote(query));

		String token = null;
		try {
			token = tokenAtomicUtils.generarTokenParaATOMIC();
		} catch (Exception e) {
			LogManagement.error("ATO-0110. Error obteniendo token. " + e.getMessage());
			return null;
		}
		ResponseBuscarDocumentos documentos = null;
		while (numIntentos <= maxIntentosLlamada && numReintentos401 < maxReintentos401) {

			startTime = System.currentTimeMillis();
			fechaHora = STDFunctions.systemDateTimeFun();
			try {
				documentos = null;
				documentos = gestorDocumentalProxy2.search("Bearer " + token, peticion);
				endTime = System.currentTimeMillis();
				mensajeError = "";
				break;
			} catch (Exception e) {
				endTime = System.currentTimeMillis();
				mensajeError = e.getMessage();
				if (mensajeError != null && mensajeError.indexOf("401") >= 0) {
					LogManagement.info("Gestor documental search. Reintento por 401");
					// Guardamos la llamada al WS
					tiempoEjecucion = (double) ((endTime - startTime) / 1000.0f);
					callBHUtils.guardarLlamadaBH(fechaHora, usuario, "search", "GestorDocumental", numSolicitud,
							peticion, documentos, tiempoEjecucion, mensajeError);
					// Esperamos 2 segundos
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e1) {
						LogManagement.error(e1);
						Thread.currentThread().interrupt();
					}
					try {
						token = tokenAtomicUtils.generarTokenParaATOMIC();
					} catch (Exception e2) {
						LogManagement.error("ATO-0120. Error obteniendo token. " + e.getMessage());
						return null;
					}
					numReintentos401++;
				} else {
					numIntentos++;
				}
			}
		}

		tiempoEjecucion = (double) ((endTime - startTime) / 1000.0f);
		// Guardamos la llamada al WS
		callBHUtils.guardarLlamadaBH(fechaHora, usuario, "search", "GestorDocumental", numSolicitud, peticion,
				documentos, tiempoEjecucion, mensajeError);

		Document docIdentidad = null;
		if (documentos != null && documentos.getData() != null && documentos.getData().getDocuments() != null
				&& documentos.getData().getDocuments().getDocuments() != null) {
			for (Document doc : documentos.getData().getDocuments().getDocuments()) {
				if (!"DocumentoIdentidad".equalsIgnoreCase(doc.getClassName())) {
					continue;
				}

				if (docIdentidad == null) {
					docIdentidad = doc;
					continue;
				}
				// Nos quedamos con el más reciente, el que tenga una propiedad con Id
				// "DateCreated" mayor
				if (doc.getProperyValueById("DateCreated")
						.compareTo(docIdentidad.getProperyValueById("DateCreated")) > 0) {
					docIdentidad = doc;
				}
			}
		}

		String retorno = null;
		if (docIdentidad != null) {
			// Devolvemos el Id del documento y la extensión, en un mismo string
			retorno = docIdentidad.getProperyValueById("Id");
			String titulo = docIdentidad.getProperyValueById("DocumentTitle");
			if (titulo != null && titulo.lastIndexOf(".") > 0) {
				retorno += " " + titulo.substring(titulo.lastIndexOf(".") + 1);
			} else {
				retorno += " pdf";
			}

		}
		return retorno;
	}

	private String quote(String s) {
		return "\"" + s.replace("\"", "\\\"").replace("\n", " ") + "\"";
	}

}
