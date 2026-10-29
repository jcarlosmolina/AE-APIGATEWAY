package com.keralty.integraciones.contract;


import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.keralty.ae.exception.LogManagement;
import com.keralty.ae.global.STDFunctions;
import com.keralty.integraciones.CallBHUtils;
import com.keralty.integraciones.contract.cover.request.CoverRequest;
import com.keralty.integraciones.contract.cover.request.CoverRequestBase;
import com.keralty.integraciones.contract.cover.request.Coverage;
import com.keralty.integraciones.contract.cover.request.InsurancePlan;
import com.keralty.integraciones.contract.cover.request.Subject;
import com.keralty.integraciones.contract.cover.response.CoverFamilyResponse;
import com.keralty.integraciones.contract.getcontractparty.request.GetContractPartyRequest;
import com.keralty.integraciones.token.TokenUtils;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ContractUtils {
 
	TokenUtils tokenUtils;

	CallBHUtils callBHUtils;

	@RestClient
	ContractProxy contractProxy;

	@ConfigProperty(name="com.keralty.integraciones.maxintentosllamada", defaultValue = "1" )
    private int maxIntentosLlamada;

    private int maxReintentos401 = 2;
	
	@Inject
	public ContractUtils(TokenUtils tokenUtils, CallBHUtils callBHUtils) {
		this.tokenUtils = tokenUtils;
		this.callBHUtils = callBHUtils;
	}
	
	/*
	 * Devuelve los contratos de una persona llamando a 'cover'
	 */
	public ConsultarContratoResponse consultarContratoDePersona(ConsultarContratoDePersonaRequest request) {
		
		CoverRequest requestCover = new CoverRequest();
		requestCover.setLastValid(true);
		requestCover.setSwFamily(false);
		requestCover.setSubject(new Subject());
		requestCover.getSubject().setIdentifier(new ArrayList<InsurancePlan>());
		InsurancePlan id = new InsurancePlan();
		id.setType("TIPO_IDENTIFICACION");
		id.setValue(request.getTipoIdentificacion());
		requestCover.getSubject().addIdentifier(id);
		id = new InsurancePlan();
		id.setType("NUMERO_IDENTIFICACION");
		id.setValue(request.getNumeroIdentificacion());
		requestCover.getSubject().addIdentifier(id);
		requestCover.setDate(request.getFecha());
		
		ConsultarContratoResponse response = callCover(requestCover, "1", request.getNumSolicitud());
		response.calcularTieneEPSSanitas(request.getFecha());
		return response;
	}

	/*
	 * Devuelve los contratos asociados de una persona llamando a 'cover'
	 */
	public ConsultarContratoResponse consultarContratosAsociadosDePersona(ConsultarContratoDePersonaRequest request) {
		
		CoverRequest requestCover = new CoverRequest();
		requestCover.setLastValid(false);
		requestCover.setSwFamily(false);
		requestCover.setIsHolder(false);
		requestCover.setSubject(new Subject());
		requestCover.getSubject().setIdentifier(new ArrayList<InsurancePlan>());
		InsurancePlan id = new InsurancePlan();
		id.setType("TIPO_IDENTIFICACION");
		id.setValue(request.getTipoIdentificacion());
		requestCover.getSubject().addIdentifier(id);
		id = new InsurancePlan();
		id.setType("NUMERO_IDENTIFICACION");
		id.setValue(request.getNumeroIdentificacion());
		requestCover.getSubject().addIdentifier(id);
		requestCover.setDate(request.getFecha());
		
		ConsultarContratoResponse response = callCover(requestCover, "1", request.getNumSolicitud());

		response.calcularTieneEPSSanitas(request.getFecha());

		// Eliminamos de la respuesta los contratos con c�digo de producto 30
		if (response.isExito() && response.getCoverResponse() != null && response.getCoverResponse().getCoverFamilyResponse() != null) {
			Iterator<CoverFamilyResponse> iter = response.getCoverResponse().getCoverFamilyResponse().iterator();
			while (iter.hasNext()) {
				CoverFamilyResponse coverFamilyResponse = iter.next();
				if (coverFamilyResponse.getInsurancePlan() != null && 
						"30".equalsIgnoreCase(coverFamilyResponse.getIdentifierPorType(coverFamilyResponse.getInsurancePlan().getIdentifier(), "CODIGO_PRODUCTO"))) {
					iter.remove();
				}
			}
		}
		
		return response;
	}
	
	/*
	 * Auxiliar para llamar a la capacidad 'cover'
	 */
	private ConsultarContratoResponse callCover(CoverRequestBase requestCover, String tipoConsulta, String numSolicitud) {
		ConsultarContratoResponse response = new ConsultarContratoResponse();
		
		// Datos de headers
		String idPeticion = "AE" + numSolicitud;
		String idTerminal = "1";
		String usuario = "";
		try {
			usuario = callBHUtils.getUsuario();
		} catch (Exception e) {
			LogManagement.error("CTR-0005. Error recuperando usuario. " + e.getMessage());
			response.setExito(false);
			response.setTextoError(STDFunctions.getTextoErrorUsuarioFinal("CTR-0005"));
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
			LogManagement.error("CTR-0010. Error obteniendo token. " + e.getMessage());
			response.setExito(false);
			response.setTextoError(STDFunctions.getTextoErrorUsuarioFinal("CTR-0010"));
			return response;
		}
		while (numIntentos <= maxIntentosLlamada && numReintentos401 < maxReintentos401) {

            startTime = System.currentTimeMillis();
            fechaHora = STDFunctions.systemDateTimeFun();	
        	try {
        		response.setCoverResponse(contractProxy.cover(token, 
        				idPeticion, 
        				idTerminal, 
        				usuario, 
        				callBHUtils.getRequestDate(), 
        				tipoConsulta, 
        				requestCover));
        		endTime = System.currentTimeMillis();
        		mensajeError = "";
        		//response.checkError();
        		response.setExito(true);
        		break;
        	} catch (Exception e) {
        		endTime = System.currentTimeMillis();
        		mensajeError = e.getMessage();
    			if (mensajeError != null && mensajeError.indexOf("401") >= 0) {
					LogManagement.info("Contract cover. Reintento por 401");
    				// Guardamos la llamada al WS
    				tiempoEjecucion = (double) ((endTime - startTime)/1000.0f);
    				callBHUtils.guardarLlamadaBH(fechaHora, usuario, 
    						"cover",
    						"Contract", 
    						numSolicitud, 
    						requestCover, response.getCoverResponse(), tiempoEjecucion, mensajeError);
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
						LogManagement.error("CTR-0020. Error obteniendo token. " + e.getMessage());
						response.setExito(false);
						response.setTextoError(STDFunctions.getTextoErrorUsuarioFinal("CTR-0020"));
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
			response.setTextoError(STDFunctions.getTextoErrorUsuarioFinal("CTR-0030"));
		}
		
		tiempoEjecucion = (double) ((endTime - startTime)/1000.0f);
		// Guardamos la llamada al WS
		callBHUtils.guardarLlamadaBH(fechaHora, usuario, 
				"cover",
				"Contract", 
				numSolicitud, 
				requestCover, response.getCoverResponse(), tiempoEjecucion, mensajeError);
		
		return response;
        		
	}
	
	/*
	 * Devuelve los datos de un contrato llamando a 'cover' y a 'GetContractParty' de manera opcional
	 */
	public ConsultarContratoResponse consultarContrato(ConsultarContratoRequest request) {
		
		CoverRequest requestCover = new CoverRequest();
		requestCover.setLastValid(true);
		requestCover.setSwFamily(true);
		requestCover.setPlanType("PLAN");
		requestCover.setCoverage(new Coverage());
		requestCover.getCoverage().setInsurancePlan(new InsurancePlan());
		requestCover.getCoverage().getInsurancePlan().setType("CODIGO_PRODUCTO");
		requestCover.getCoverage().getInsurancePlan().setValue(request.getCodigoLegalProducto());

		requestCover.getCoverage().setContract(new ArrayList<InsurancePlan>());
		
		InsurancePlan plan = new InsurancePlan();
		plan.setType("PLAN");
		plan.setValue(request.getCodigoLegalPlan());
		requestCover.getCoverage().addContract(plan);

		InsurancePlan contrato = new InsurancePlan();
		contrato.setType("CONTRATO");
		contrato.setValue(request.getNumContrato());
		requestCover.getCoverage().addContract(contrato);
	
		if (request.getNumeroFamilia() != null && !request.getNumeroFamilia().isEmpty()) {
			InsurancePlan familia = new InsurancePlan();
			familia.setType("FAMILIA");
			familia.setValue(request.getNumeroFamilia());
			requestCover.getCoverage().addContract(familia);
		}
		ConsultarContratoResponse response = callCover(requestCover, "2", request.getNumSolicitud());
		
		if (response.isExito() && request.isBuscarEnContractParty()) {
			callGetContractParty(response, request);
		}
		
		return response;
	}

	
	/*
	 * Devuelve los datos de un contrato llamando a 'cover' y a 'GetContractParty' de manera opcional aunqeu no esté en vigor
	 */
	public ConsultarContratoResponse consultarContratoNoLastValid(ConsultarContratoRequest request) {
		
		CoverRequest requestCover = new CoverRequest();
		requestCover.setLastValid(false);
		requestCover.setSwFamily(true);
		requestCover.setPlanType("");
		requestCover.setCoverage(new Coverage());
		requestCover.getCoverage().setInsurancePlan(new InsurancePlan());
		requestCover.getCoverage().getInsurancePlan().setType("CODIGO_PRODUCTO");
		requestCover.getCoverage().getInsurancePlan().setValue(request.getCodigoLegalProducto());

		requestCover.getCoverage().setContract(new ArrayList<InsurancePlan>());
		
		InsurancePlan plan = new InsurancePlan();
		plan.setType("PLAN");
		plan.setValue(request.getCodigoLegalPlan());
		requestCover.getCoverage().addContract(plan);

		InsurancePlan contrato = new InsurancePlan();
		contrato.setType("CONTRATO");
		contrato.setValue(request.getNumContrato());
		requestCover.getCoverage().addContract(contrato);
	
		if (request.getNumeroFamilia() != null && !request.getNumeroFamilia().isEmpty()) {
			InsurancePlan familia = new InsurancePlan();
			familia.setType("FAMILIA");
			familia.setValue(request.getNumeroFamilia());
			requestCover.getCoverage().addContract(familia);
		}
		ConsultarContratoResponse response = callCover(requestCover, "2", request.getNumSolicitud());
		
		if (response.isExito() && request.isBuscarEnContractParty()) {
			callGetContractParty(response, request);
		}
		
		return response;
	}
	
	/*
	 * Devuelve los datos de un contrato llamando a 'cover' (sin enviar el tag lastValid) y a 'GetContractParty' de manera opcional
	 */
	public ConsultarContratoResponse consultarContratoSinLastValid(ConsultarContratoRequest request) {
		
		CoverRequestBase requestCover = new CoverRequestBase();
		requestCover.setSwFamily(true);
		requestCover.setPlanType("PLAN");
		requestCover.setCoverage(new Coverage());
		requestCover.getCoverage().setInsurancePlan(new InsurancePlan());
		requestCover.getCoverage().getInsurancePlan().setType("CODIGO_PRODUCTO");
		requestCover.getCoverage().getInsurancePlan().setValue(request.getCodigoLegalProducto());

		requestCover.getCoverage().setContract(new ArrayList<InsurancePlan>());
		
		InsurancePlan plan = new InsurancePlan();
		plan.setType("PLAN");
		plan.setValue(request.getCodigoLegalPlan());
		requestCover.getCoverage().addContract(plan);

		InsurancePlan contrato = new InsurancePlan();
		contrato.setType("CONTRATO");
		contrato.setValue(request.getNumContrato());
		requestCover.getCoverage().addContract(contrato);
	
		if (request.getNumeroFamilia() != null && !request.getNumeroFamilia().isEmpty()) {
			InsurancePlan familia = new InsurancePlan();
			familia.setType("FAMILIA");
			familia.setValue(request.getNumeroFamilia());
			requestCover.getCoverage().addContract(familia);
		}
		ConsultarContratoResponse response = callCover(requestCover, "2", request.getNumSolicitud());
		
		if (response.isExito() && request.isBuscarEnContractParty()) {
			callGetContractParty(response, request);
		}
		
		return response;
	}
	
	/*
	 * Auxiliar para llamar a 'GetContractParty'
	 */
	private void callGetContractParty(ConsultarContratoResponse response, ConsultarContratoRequest request) {
		
		// Datos de headers
		String idPeticion = "AE" + request.getNumSolicitud();
		String idTerminal = "1";
		String usuario = "";
		try {
			usuario = callBHUtils.getUsuario();
		} catch (Exception e) {
			LogManagement.error("CTR-0105. Error recuperando usuario. " + e.getMessage());
			response.setExito(false);
			response.setTextoError(STDFunctions.getTextoErrorUsuarioFinal("CTR-0105"));
			return;
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
			LogManagement.error("CTR-0110. Error obteniendo token. " + e.getMessage());
			response.setExito(false);
			response.setTextoError(STDFunctions.getTextoErrorUsuarioFinal("CTR-0110"));
			return;
		}
		GetContractPartyRequest getPartyRequest = new GetContractPartyRequest();
		getPartyRequest.asignarInfoContrato(request.getCodigoLegalProducto(), request.getCodigoLegalPlan(), request.getNumContrato());
		while (numIntentos <= maxIntentosLlamada && numReintentos401 < maxReintentos401) {

            startTime = System.currentTimeMillis();
            fechaHora = STDFunctions.systemDateTimeFun();	
        	try {
        		response.setGetContractPartyResponse(contractProxy.getContractParty(token, 
        				idPeticion, 
        				idTerminal, 
        				usuario, 
        				callBHUtils.getRequestDate(), 
        				getPartyRequest));
        		endTime = System.currentTimeMillis();
        		mensajeError = "";
        		response.setExito(true);
        		break;
        	} catch (Exception e) {
        		endTime = System.currentTimeMillis();
        		mensajeError = e.getMessage();
    			if (mensajeError != null && mensajeError.indexOf("401") >= 0) {
					LogManagement.info("GetContractParty. Reintento por 401");
    				// Guardamos la llamada al WS
    				tiempoEjecucion = (double) ((endTime - startTime)/1000.0f);
    				callBHUtils.guardarLlamadaBH(fechaHora, usuario, 
    						"getContractParty",
    						"Contract", 
    						request.getNumSolicitud(), 
    						getPartyRequest, response.getGetContractPartyResponse(), tiempoEjecucion, mensajeError);
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
						LogManagement.error("CTR-0120. Error obteniendo token. " + e.getMessage());
						response.setExito(false);
						response.setTextoError(STDFunctions.getTextoErrorUsuarioFinal("CTR-0120"));
						return;
					}
    				numReintentos401++;			
    			} else {
    				numIntentos++;
        		}
        	}
        }
		if (mensajeError != null && !mensajeError.isEmpty()) {
			response.setExito(false);
			response.setTextoError(STDFunctions.getTextoErrorUsuarioFinal("CTR-0130"));
		}
		
		tiempoEjecucion = (double) ((endTime - startTime)/1000.0f);
		// Guardamos la llamada al WS
		callBHUtils.guardarLlamadaBH(fechaHora, usuario, 
				"getContractParty",
				"Contract", 
				request.getNumSolicitud(), 
				getPartyRequest, response.getGetContractPartyResponse(), tiempoEjecucion, mensajeError);
	}
}
