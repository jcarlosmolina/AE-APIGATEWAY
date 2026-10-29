package com.keralty.integraciones.organization.getorganization;


import java.sql.Timestamp;
import java.util.ArrayList;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.keralty.integraciones.CallBHUtils;
import com.keralty.integraciones.IntegracionesUtils;
import com.keralty.integraciones.organization.getorganization.request.Entry;
import com.keralty.integraciones.organization.getorganization.request.GetOrganizationRequest;
import com.keralty.integraciones.organization.getorganization.request.Request;
import com.keralty.integraciones.token.TokenUtils;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class OrganizationUtils {

	TokenUtils tokenUtils;

	CallBHUtils callBHUtils;

	@RestClient
	OrganizationProxy organizationProxy;

	@ConfigProperty(name="com.keralty.integraciones.maxintentosllamada", defaultValue = "1" )
    private int maxIntentosLlamada;

    private int maxReintentos401 = 2;
	
	@Inject
	public OrganizationUtils(TokenUtils tokenUtils, CallBHUtils callBHUtils) {
		this.tokenUtils = tokenUtils;
		this.callBHUtils = callBHUtils;
	}
	
	

	public ConsultarPersonaJuridicaResponse consultarPersonaJuridica(ConsultarPersonaJuridicaRequest request) {
		
		ConsultarPersonaJuridicaResponse response = new ConsultarPersonaJuridicaResponse();
		
		GetOrganizationRequest getOrgRequest = new GetOrganizationRequest();
		getOrgRequest.setResourceType("Bundle");
		getOrgRequest.setID("bundle-request-organization");
		getOrgRequest.setType("batch");
		getOrgRequest.setEntry(new ArrayList<Entry>());
		Entry entry = new Entry();
		entry.setRequest(new Request());
		entry.getRequest().setMethod("GET");
		entry.getRequest().setURL("organization?identifier=BH|" + request.getTipoIdentificacion() + "-" + request.getNumeroIdentificacion());
		getOrgRequest.addEntry(entry);
		
		// Datos de headers
		String idTerminal = "1";
		String usuario = "";
		try {
			usuario = callBHUtils.getUsuario();
		} catch (Exception e) {
			org.slf4j.LoggerFactory.getLogger(this.getClass().getName()).error("ORG-0001. Error recuperando usuario. " + e.getMessage());
			response.setExito(false);
			response.setTextoError(IntegracionesUtils.getTextoErrorUsuarioFinal("ORG-0001"));
			return response;
		}
		
        long startTime = System.currentTimeMillis();
        Timestamp fechaHora = IntegracionesUtils.systemDateTimeFun();	
        String mensajeError = "";
        long endTime = startTime;
		Double tiempoEjecucion = 0.0;
		int numIntentos = 1;
		int numReintentos401 = 0;

		String token = "";
		try {
			token = tokenUtils.getTokenValue();
		} catch (Exception e) {
			org.slf4j.LoggerFactory.getLogger(this.getClass().getName()).error("ORG-0010. Error obteniendo token. " + e.getMessage());
			response.setExito(false);
			response.setTextoError(IntegracionesUtils.getTextoErrorUsuarioFinal("ORG-0010"));
			return response;
		}
		while (numIntentos <= maxIntentosLlamada && numReintentos401 < maxReintentos401) {

            startTime = System.currentTimeMillis();
            fechaHora = IntegracionesUtils.systemDateTimeFun();
        	try {
        		response.setGetOrganizationResponse(organizationProxy.getOrganization(token, 
        				idTerminal, 
        				usuario, 
        				callBHUtils.getRequestDate(), 
        				"1",
        				getOrgRequest));
        		endTime = System.currentTimeMillis();
        		mensajeError = "";
        		response.checkError();
        		response.localizarDatos();
        		break;
        	} catch (Exception e) {
        		endTime = System.currentTimeMillis();
        		mensajeError = e.getMessage();
    			if (mensajeError != null && mensajeError.indexOf("401") >= 0) {
    				org.slf4j.LoggerFactory.getLogger(this.getClass().getName()).info("Organization getOrganization. Reintento por 401");
    				// Guardamos la llamada al WS
    				tiempoEjecucion = (double) ((endTime - startTime)/1000.0f);
    				callBHUtils.guardarLlamadaBH(fechaHora, usuario, 
    						"getOrganization",
    						"Organization", 
    						request.getNumSolicitud(), 
    						getOrgRequest, response.getGetOrganizationResponse(), tiempoEjecucion, mensajeError);
					// Esperamos 2 segundos
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e1) {
						org.slf4j.LoggerFactory.getLogger(this.getClass().getName()).error(e1.getMessage());
						Thread.currentThread().interrupt();
					}
					try {
						token = tokenUtils.getTokenValue();					
					} catch (Exception e2) {
						org.slf4j.LoggerFactory.getLogger(this.getClass().getName()).error("ORG-0020. Error obteniendo token. " + e.getMessage());
						response.setExito(false);
						response.setTextoError(IntegracionesUtils.getTextoErrorUsuarioFinal("ORG-0020"));
						return response;
					}
    				numReintentos401++;			
    			} else {
    				numIntentos++;
        		}
        	}
        }
		if (mensajeError != null && !mensajeError.isEmpty()) {
			response.setExito(false);
			response.setTextoError(IntegracionesUtils.getTextoErrorUsuarioFinal("ORG-0030"));
		}
		
		tiempoEjecucion = (double) ((endTime - startTime)/1000.0f);
		// Guardamos la llamada al WS
		callBHUtils.guardarLlamadaBH(fechaHora, usuario, 
				"getOrganization",
				"Organization", 
				request.getNumSolicitud(), 
				getOrgRequest, response.getGetOrganizationResponse(), tiempoEjecucion, mensajeError);
		
		return response;
	}
	
}
