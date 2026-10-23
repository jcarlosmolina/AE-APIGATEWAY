package com.keralty.integraciones.enviosms;


import java.sql.Timestamp;
import java.util.Base64;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.keralty.ae.exception.LogManagement;
import com.keralty.ae.global.STDFunctions;
import com.keralty.integraciones.CallBHUtils;
import com.keralty.integraciones.enviosms.direct.request.EnvioSMSRequest;
import com.keralty.integraciones.enviosms.direct.response.EnvioSMSResponse;
import com.keralty.integraciones.enviosms.direct.response.Message;
import com.keralty.integraciones.token.TokenUtils;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class EnvioSMSUtils {

	TokenUtils tokenUtils;

	CallBHUtils callBHUtils;

	@RestClient
	EnvioSMSProxy envioSMSProxy;

	@ConfigProperty(name="com.keralty.integraciones.maxintentosllamada", defaultValue = "0" )
	private int maxIntentosLlamada;

	@ConfigProperty(name="com.keralty.integraciones_enviosms.idusuario", defaultValue = "" )
	private String idUsuario;

	@ConfigProperty(name="com.keralty.integraciones_enviosms.pwd", defaultValue = "" )
	private String pwd;

    private int maxReintentos401 = 2;

	@Inject
	public EnvioSMSUtils(TokenUtils tokenUtils, CallBHUtils callBHUtils) {
		this.tokenUtils = tokenUtils;
		this.callBHUtils = callBHUtils;
	}

	public String envioSMSDirect(String from, String to, String texto, String numSolicitud) {

		String resultado = "";
		EnvioSMSRequest request = new EnvioSMSRequest();
		request.setFrom(from);
		request.setTo(to);
		request.setText(texto);
		
		// Datos de headers
		String usuario = "";
		try {
			usuario = callBHUtils.getUsuario();
		} catch (Exception e) {
			LogManagement.error("SMS-0005. Error recuperando usuario. " + e.getMessage());
			return "SMS-0005. Error recuperando usuario";
		}
		
		// Obtenemos el Token
		String token = "";
		try {
			token = tokenUtils.getTokenValue();
		} catch (Exception e) {
			LogManagement.error("SMS-0010. Error obteniendo token. " + e.getMessage());
			return "SMS-0010. Error obteniendo token";
		}

		// Creamos el ticket.
		// Generar ticket 
		// Para generar el ticket es necesario contar con el usuario y la contrasenya de la cuenta desde donde se va 
		//  a enviar el mensaje de texto, esta cuenta se debe solicitar al negocio, un ejemplo es el siguiente:
		//	A.	Username: "Aladdin": usuario de la cuenta a utilizar
		//	B.	Password: "openSesame": Contrasenya de la cuenta 
		//	C.	String concatenado: "Aladdin:openSesame" 
		//	D.	Hash tras la codificacion Base64: "QWxhZGRpbjpvcGVuU2VzYW1l"
		//	E.	Header de Autenticacion (ticket): "Basic QWxhZGRpbjpvcGVuU2VzYW1l"
		String valor = idUsuario + ":" + pwd;
		String hashToken = Base64.getEncoder().encodeToString(valor.getBytes());
		String ticket = "Basic " + hashToken;
		
		
        long startTime = System.currentTimeMillis();
        Timestamp fechaHora = STDFunctions.systemDateTimeFun();	
        String mensajeError = "";
        long endTime = startTime;
		Double tiempoEjecucion = 0.0;
		int numIntentos = 1;
		int numReintentos401 = 0;
		
        EnvioSMSResponse response = null;
		while (numIntentos <= maxIntentosLlamada && numReintentos401 < maxReintentos401) {

            startTime = System.currentTimeMillis();
            fechaHora = STDFunctions.systemDateTimeFun();
			try {
				response = envioSMSProxy.envioSMSDirect(token, 
						ticket, 
						idUsuario, 
						callBHUtils.getRequestDate(), 
						request); 
        		endTime = System.currentTimeMillis();
        		mensajeError = "";
        		if (response.getMessages() != null && !response.getMessages().isEmpty()) {
        			Message msg = response.getMessages().get(0);
        			if (msg.getStatus() != null) {
        				resultado = msg.getStatus().getGroupID() != null ? msg.getStatus().getGroupID().toString() : "groupId-NULL";	
        				resultado += " " + msg.getStatus().getGroupName() != null ? msg.getStatus().getGroupName() : "groupName-NULL";
        			} else {
        				mensajeError = "SMS-0017. Response no reconocida";
        				resultado = mensajeError;
        			}
        		} else {
        			mensajeError = "SMS-0015. Response no reconocida";
        			resultado = mensajeError;
        		}
        		break;
        	} catch (Exception e) {
        		endTime = System.currentTimeMillis();
        		mensajeError = e.getMessage();
    			if (mensajeError != null && mensajeError.indexOf("401") >= 0) {
					LogManagement.info("enviarSMS ENVIARSMS. Reintento por 401");
    				// Guardamos la llamada al WS
    				tiempoEjecucion = (double) ((endTime - startTime)/1000.0f);
    				callBHUtils.guardarLlamadaBH(fechaHora, usuario, 
    						"envioSMSDirect",
    						"smsenvio", 
    						numSolicitud, 
    						request,
    						response,
    						tiempoEjecucion, mensajeError);
					// Esperamos 2 segundos
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e1) {
						LogManagement.error(e1);
						Thread.currentThread().interrupt();
					}
					try {
						token = tokenUtils.getTokenValue();					
					} catch (Exception e2) {
						LogManagement.error("SMS-0020. Error obteniendo token. " + e.getMessage());
						return "SMS-0020. Error obteniendo token";
					}
    				numReintentos401++;			
    			} else {
    				numIntentos++;
        		}
        	}
        }
		
		tiempoEjecucion = (double) ((endTime - startTime)/1000.0f);
		// Guardamos la llamada al WS
		callBHUtils.guardarLlamadaBH(fechaHora, usuario, 
				"ENVIARSMS",
				"enviarSMS", 
				numSolicitud, 
				request,
				response,
				tiempoEjecucion, mensajeError);
		
		return resultado;
	}
}
