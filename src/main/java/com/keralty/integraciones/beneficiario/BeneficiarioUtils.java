package com.keralty.integraciones.beneficiario;


import java.sql.Timestamp;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.keralty.ae.exception.LogManagement;
import com.keralty.ae.global.STDFunctions;
import com.keralty.integraciones.CallBHUtils;
import com.keralty.integraciones.beneficiario.response.ConsultarBeneficiarioResponse;
import com.keralty.integraciones.token.TokenUtils;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class BeneficiarioUtils {

	TokenUtils tokenUtils;
 
	CallBHUtils callBHUtils;

	@RestClient
	BeneficiarioProxy beneficiarioProxy;

	@ConfigProperty(name="com.keralty.integraciones.maxintentosllamada", defaultValue = "1" )
    private int maxIntentosLlamada;

    private int maxReintentos401 = 2;
	
	@Inject
	public BeneficiarioUtils(TokenUtils tokenUtils, CallBHUtils callBHUtils) {
		this.tokenUtils = tokenUtils;
		this.callBHUtils = callBHUtils;
	}
	
	
	public String consultarCausaExclusionBeneficiario(ConsultarBeneficiarioRequest request) {
		String causaExclusion = "";

    	if (request.getCodigoLegalProducto() == null || request.getCodigoLegalProducto().isEmpty() ) {
    		return causaExclusion;
    	}
    	if (request.getCodigoLegalPlan() == null || request.getCodigoLegalPlan().isEmpty()) {
    		return causaExclusion;
    	}
    	if (request.getNumContrato() == null || request.getNumContrato().isEmpty()) {
    		return causaExclusion;
    	}
    	if (request.getNumeroFamilia() == null || request.getNumeroFamilia().isEmpty()) {
    		return causaExclusion;
    	}
    	if (request.getTipoIdentificacion() == null || request.getTipoIdentificacion().isEmpty()) {
    		return causaExclusion;
    	}
    	if (request.getNumeroIdentificacion() == null || request.getNumeroIdentificacion().isEmpty()) {
    		return causaExclusion;
    	}		
		ConsultarBeneficiarioResponse response = consultarBeneficiaro(request);
		if (response != null && response.isExito() && response.getContrato() != null && !response.getContrato().isEmpty() &&
				response.getContrato().get(0).getInformacionBeneficiarios() != null) {
			
			causaExclusion = response.getContrato().get(0).getInformacionBeneficiarios().getCausaExclusion();
			
		}
		return causaExclusion;
	}
	
	public ConsultarBeneficiarioResponse consultarBeneficiaro(ConsultarBeneficiarioRequest request) {
		ConsultarBeneficiarioResponse response = new ConsultarBeneficiarioResponse();
		
	
		// Datos de headers
		String idPeticion = "AE" + request.getNumSolicitud();
		String usuario = "";
		try {
			usuario = callBHUtils.getUsuario();
		} catch (Exception e) {
			LogManagement.error("BEN-0005. Error recuperando usuario. " + e.getMessage());
			response.setError(STDFunctions.getTextoErrorUsuarioFinal("BEN-0005"));
			return response;
		}
		
        long startTime = System.currentTimeMillis();
        Timestamp fechaHora = STDFunctions.systemDateTimeFun();	
        String mensajeError = "";
        long endTime = startTime;
		Double tiempoEjecucion = 0.0;
		int numIntentos = 1;
		int numReintentos401 = 0;

		String token = "";
		try {
			token = tokenUtils.getTokenValue();
		} catch (Exception e) {
			LogManagement.error("BEN-0010. Error obteniendo token. " + e.getMessage());
			response.setError(STDFunctions.getTextoErrorUsuarioFinal("BEN-0010"));
			return response;
		}
		
		String params = "producto/" + request.getCodigoLegalProducto();
		params += "/codigoplan/" + request.getCodigoLegalPlan();
		params += "/numcontrato/" + request.getNumContrato();
		params += "/numerofamilia/" + request.getNumeroFamilia();
		params += "/tipoidentificacionbeneficiario/" + request.getTipoIdentificacion();
		params += "/numidentificacionbeneficiario/" + request.getNumeroIdentificacion();
		params += "/numusuario/null/fechaconsultaprestacionservicio/null";
		while (numIntentos <= maxIntentosLlamada && numReintentos401 < maxReintentos401) {

            startTime = System.currentTimeMillis();
            fechaHora = STDFunctions.systemDateTimeFun();	
        	try {
        		response = beneficiarioProxy.consultar(token, 
        				idPeticion, 
        				usuario, 
        				callBHUtils.getRequestDateTime(),
        				params);
        		endTime = System.currentTimeMillis();
        		if (response.isExito()) {
            		mensajeError = "";
        		} else {
            		mensajeError = response.getMensajeError();
        		}
        		break;
        	} catch (Exception e) {
        		endTime = System.currentTimeMillis();
        		mensajeError = e.getMessage();
    			if (mensajeError != null && mensajeError.indexOf("401") >= 0) {
					LogManagement.info("Beneficiarios consultar. Reintento por 401");
    				// Guardamos la llamada al WS
    				tiempoEjecucion = (double) ((endTime - startTime)/1000.0f);
    				callBHUtils.guardarLlamadaBH(fechaHora, usuario, 
    						"consultar",
    						"Beneficiario", 
    						request.getNumSolicitud(), 
    						params, response, tiempoEjecucion, mensajeError);
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
						LogManagement.error("BEN-0020. Error obteniendo token. " + e2.getMessage());
						response.setError(STDFunctions.getTextoErrorUsuarioFinal("BEN-0020"));
						return response;
					}
    				numReintentos401++;			
    			} else {
    				numIntentos++;
        		}
        	}
        }
		if (mensajeError != null && !mensajeError.isEmpty()) {
			LogManagement.error("BEN-0030. " + mensajeError);
			response.setError(STDFunctions.getTextoErrorUsuarioFinal("BEN-0030"));
		}
		
		tiempoEjecucion = (double) ((endTime - startTime)/1000.0f);
		// Guardamos la llamada al WS
		callBHUtils.guardarLlamadaBH(fechaHora, usuario, 
				"consultar",
				"Beneficiario", 
				request.getNumSolicitud(), 
				params, response, tiempoEjecucion, mensajeError);
        
		return response;
	}
}

