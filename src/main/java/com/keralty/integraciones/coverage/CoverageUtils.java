package com.keralty.integraciones.coverage;


import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Map;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.keralty.ae.exception.LogManagement;
import com.keralty.ae.global.STDFunctions;
import com.keralty.ae.service.DominioService;
import com.keralty.ae.viewmodel.PopulationResponseViewModel;
import com.keralty.ae.viewmodel.QueryRequest;
import com.keralty.integraciones.CallBHUtils;
import com.keralty.integraciones.coverage.coverageheader.request.Coverage;
import com.keralty.integraciones.coverage.coverageheader.request.CoverageHeaderRequest;
import com.keralty.integraciones.coverage.coverageheader.request.InsurancePlan;
import com.keralty.integraciones.coverage.coverageheader.request.Patient;
import com.keralty.integraciones.coverage.coverageheader.response.Datum;
import com.keralty.integraciones.token.TokenUtils;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class CoverageUtils {

	TokenUtils tokenUtils;
 
	CallBHUtils callBHUtils;

	@RestClient
	CoverageProxy coverageProxy;

    @RestClient
    DominioService service;
	
	@ConfigProperty(name="com.keralty.integraciones.maxintentosllamada", defaultValue = "1" )
    private int maxIntentosLlamada;

    private int maxReintentos401 = 2;
	
	@Inject
	public CoverageUtils(TokenUtils tokenUtils, CallBHUtils callBHUtils) {
		this.tokenUtils = tokenUtils;
		this.callBHUtils = callBHUtils;
	}
	
	public ConsultarBeneficiarioResponse consultarBeneficiaro(ConsultarBeneficiarioRequest request) {
		ConsultarBeneficiarioResponse response = new ConsultarBeneficiarioResponse();
		
		CoverageHeaderRequest requestCoverage = new CoverageHeaderRequest();
		requestCoverage.setCoverage(new Coverage());
		requestCoverage.getCoverage().setInsurancePlan(new InsurancePlan());
		requestCoverage.getCoverage().getInsurancePlan().setType("CODIGO_PRODUCTO");
		requestCoverage.getCoverage().getInsurancePlan().setValue(request.getCodigoLegalProducto());
		requestCoverage.getCoverage().setContract(new ArrayList<>());
		
		InsurancePlan plan = new InsurancePlan();
		plan.setType("PLAN");
		plan.setValue(request.getCodigoLegalPlan());
		requestCoverage.getCoverage().getContract().add(plan);
		
		InsurancePlan contrato = new InsurancePlan();
		contrato.setType("CONTRATO");
		contrato.setValue(request.getNumContrato());
		requestCoverage.getCoverage().getContract().add(contrato);

		if (request.getNumeroFamilia() != null && !request.getNumeroFamilia().isEmpty()) {
			InsurancePlan familia = new InsurancePlan();
			familia.setType("FAMILIA");
			familia.setValue(request.getNumeroFamilia());
			requestCoverage.getCoverage().getContract().add(familia);
		}
		//requestCoverage.setDate( callBHUtils.getRequestDate() );
		requestCoverage.setLastValid(true);
		requestCoverage.setSwFamily(false);
		
		requestCoverage.setPatient(new Patient());
		requestCoverage.getPatient().setIdentifier(new ArrayList<>());
		InsurancePlan tipoIdent = new InsurancePlan();
		tipoIdent.setType("TIPO_IDENTIFICACION");
		tipoIdent.setValue(request.getTipoIdentificacion());
		requestCoverage.getPatient().getIdentifier().add(tipoIdent);
		
		InsurancePlan numIdent = new InsurancePlan();
		numIdent.setType("NUMERO_IDENTIFICACION");
		numIdent.setValue(request.getNumeroIdentificacion());
		requestCoverage.getPatient().getIdentifier().add(numIdent);
	
		// Datos de headers
		String idPeticion = "AE" + request.getNumSolicitud();
		String idTerminal = "1";
		String usuario = "";
		try {
			usuario = callBHUtils.getUsuario();
		} catch (Exception e) {
			LogManagement.error("COV-0005. Error recuperando usuario. " + e.getMessage());
			response.setExito(false);
			response.setTextoError(STDFunctions.getTextoErrorUsuarioFinal("COV-0005"));
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
			LogManagement.error("COV-0010. Error obteniendo token. " + e.getMessage());
			response.setExito(false);
			response.setTextoError(STDFunctions.getTextoErrorUsuarioFinal("COV-0010"));
			return response;
		}
		while (numIntentos <= maxIntentosLlamada && numReintentos401 < maxReintentos401) {

            startTime = System.currentTimeMillis();
            fechaHora = STDFunctions.systemDateTimeFun();	
        	try {
        		response.setCoverageHeaderResponse( coverageProxy.coverageHeader(token, 
        				idPeticion, 
        				idTerminal, 
        				usuario, 
        				callBHUtils.getRequestDate(), 
        				"1", 
        				requestCoverage) );
        		endTime = System.currentTimeMillis();
        		mensajeError = "";
        		response.checkError();
        		break;
        	} catch (Exception e) {
        		endTime = System.currentTimeMillis();
        		mensajeError = e.getMessage();
    			if (mensajeError != null && mensajeError.indexOf("401") >= 0) {
					LogManagement.info("Coverage coverageHeader. Reintento por 401");
    				// Guardamos la llamada al WS
    				tiempoEjecucion = (double) ((endTime - startTime)/1000.0f);
    				callBHUtils.guardarLlamadaBH(fechaHora, usuario, 
    						"cover",
    						"Contract", 
    						request.getNumSolicitud(), 
    						requestCoverage, response.getCoverageHeaderResponse(), tiempoEjecucion, mensajeError);
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
						LogManagement.error("COV-0020. Error obteniendo token. " + e.getMessage());
						response.setExito(false);
						response.setTextoError(STDFunctions.getTextoErrorUsuarioFinal("COV-0020"));
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
			response.setTextoError(STDFunctions.getTextoErrorUsuarioFinal("COV-0030"));
		}
		
		tiempoEjecucion = (double) ((endTime - startTime)/1000.0f);
		// Guardamos la llamada al WS
		callBHUtils.guardarLlamadaBH(fechaHora, usuario, 
				"coverageHeader",
				"Coverage", 
				request.getNumSolicitud(), 
				requestCoverage, response.getCoverageHeaderResponse(), tiempoEjecucion, mensajeError);
        
		return response;
	}
	
	public Date getFechaFinVigenciaUsuario(String tipoIdentificacion, String numIdentificacion, String numSolicitud ) {

		Date fechaFinVigencia = null;
		
		try {
			ConsultarBeneficiarioRequest request = new ConsultarBeneficiarioRequest();
			request.setTipoIdentificacion(tipoIdentificacion);
			request.setNumeroIdentificacion(numIdentificacion);
			request.setNumSolicitud(numSolicitud);
			ConsultarBeneficiarioResponse response = consultarBeneficiaro(request );
			
			if (response.isExito() && response.getCoverageHeaderResponse() != null && response.getCoverageHeaderResponse().getData() != null &&
					!response.getCoverageHeaderResponse().getData().isEmpty()) {
				// Localizamos los Dominios que requieren cuestionario médico
				QueryRequest requestDominio = new QueryRequest();
				requestDominio.setDisplaySetItems("productot.codigolegal,plant.codigolegal,reqcuesmed");
				PopulationResponseViewModel responseDominio = service.getPopulationDynamic(requestDominio );
				if (!"000".equals(responseDominio.getResultCode())) {
					LogManagement.error("COV-0200. Error recuperando Dominios. " + responseDominio.getResultDescription());
				} else {
					StringBuilder dominios = new StringBuilder();
					// Solo nos interesan los que requieren cuestionario medico
					for (Map<String, Object> dominio : responseDominio.getResults()) {
						if (dominio.containsKey("reqcuesmed") && "true".equals(dominio.getOrDefault("reqcuesmed", "false").toString())) {
							dominios.append(dominio.getOrDefault("productot-codigolegal", "0").toString() + "-" +
									dominio.getOrDefault("plant-codigolegal", "0").toString());
						}
					}
					
					if ( !dominios.isEmpty() ) {
						for (Datum contrato : response.getCoverageHeaderResponse().getData()) {
							if (contrato.getInsurancePlan() != null && contrato.getContract() != null && 
									dominios.indexOf(contrato.getValue4Type(contrato.getInsurancePlan().getIdentifier(), "CODIGO_PRODUCTO") + "-" +
													 contrato.getValue4Type(contrato.getContract().getIdentifier(), "PLAN")) >=0 ) {
								// El contrato pertenece a un Dominio que requeire cuestionario medico
								// Comparamos la fecha fin de vigencia para quedarnos con la ultima que encontremos
								if (contrato.getCoverage() != null && !contrato.getCoverage().isEmpty() && 
										contrato.getCoverage().get(0).getPeriod() != null && contrato.getCoverage().get(0).getPeriod().getEnd() != null &&
										(fechaFinVigencia == null || contrato.getCoverage().get(0).getPeriod().getEnd().after(fechaFinVigencia))) {
										fechaFinVigencia = contrato.getCoverage().get(0).getPeriod().getEnd();
								}
							}
						}
					}
				}
			}
		} catch(Exception e) {
			LogManagement.error("COV-0100. " + e.getMessage());
		}

		return fechaFinVigencia;
	}
}

