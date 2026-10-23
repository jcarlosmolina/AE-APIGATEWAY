package com.keralty.integraciones.patient;


import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.LogManagement;
import com.keralty.ae.global.STDFunctions;
import com.keralty.integraciones.CallBHUtils;
import com.keralty.integraciones.patient.alerts.request.ConsultAlertsRequest;
import com.keralty.integraciones.patient.alerts.request.Identifier;
import com.keralty.integraciones.patient.alerts.response.ConsultAlertsResponse;
import com.keralty.integraciones.patient.basicdata.response.PatientBasicDataResponse;
import com.keralty.integraciones.patient.condition.request.ConditionRequest;
import com.keralty.integraciones.patient.condition.response.ConditionResponse;
import com.keralty.integraciones.patient.contact.response.Address;
import com.keralty.integraciones.patient.contact.response.Telecom;
import com.keralty.integraciones.patient.createbasicdata.request.CreateBasicDataRequest;
import com.keralty.integraciones.patient.createbasicdata.response.CreateBasicDataResponse;
import com.keralty.integraciones.patient.createupdatecontact.request.CreateUpdateContactRequest;
import com.keralty.integraciones.patient.createupdatequestionnare.request.CreateUpdateQuestionnaireRequest;
import com.keralty.integraciones.patient.createupdatequestionnare.request.CreateUpdateRequest;
import com.keralty.integraciones.patient.createupdatequestionnare.response.Response;
import com.keralty.integraciones.patient.questionnaire.request.PatientQuestionnaireRequest;
import com.keralty.integraciones.patient.questionnaire.response.PatientQuestionnaireResponse;
import com.keralty.integraciones.patient.updatebasicdata.request.Entry;
import com.keralty.integraciones.patient.updatebasicdata.request.UpdateBasicDataRequest;
import com.keralty.integraciones.token.TokenUtils;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PatientUtils {

	TokenUtils tokenUtils;

	CallBHUtils callBHUtils;

	@RestClient
	PatientProxy patientProxy;

	@ConfigProperty(name="com.keralty.integraciones.maxintentosllamada", defaultValue = "0" )
	private int maxIntentosLlamada;

	private int maxReintentos401 = 2;

	@Inject
	public PatientUtils(TokenUtils tokenUtils, CallBHUtils callBHUtils) {
		this.tokenUtils = tokenUtils;
		this.callBHUtils = callBHUtils;
	}

	public ConsultarPersonaResponse consultarPersona(ConsultarPersonaRequest request) {

		ConsultarPersonaResponse response = new ConsultarPersonaResponse();
		// Datos de headers
		String idPeticion = "AE" + request.getNumSolicitud();
		String idTerminal = "1";
		String usuario = "";
		try {
			usuario = callBHUtils.getUsuario();
		} catch (Exception e) {
			LogManagement.error("PAT-0005. Error recuperando usuario. " + e.getMessage());
			response.setExito(false);
			response.setTextoError( STDFunctions.getTextoErrorUsuarioFinal("PAT-0005"));
			return response;
		}

		// Obtenemos el Token
		String token = "";
		try {
			token = tokenUtils.getTokenValue();
		} catch (Exception e) {
			LogManagement.error("PAT-0010. Error obteniendo token. " + e.getMessage());
			response.setExito(false);
			response.setTextoError(STDFunctions.getTextoErrorUsuarioFinal("PAT-0010"));
			return response;
		}

		// Llamamos para obtener los datos básicos
		callPatientBasicData(request, response, token, idPeticion, idTerminal, usuario);
		response.calcularDerivados();

		// Datos de contacto
		if (!request.isSoloDatosBasicos() && response.isExito()) {
			callPatientContactInformation(request, response, token, idPeticion, idTerminal, usuario);
		}

		// Estado de la persona
		if (!request.isSoloDatosBasicos() && response.isExito()) {
			callPatientAlerts(request, response, token, idPeticion, idTerminal, usuario);
		}

		return response;
	}

	/**
	 * Realiza la llamada a basicData de Patient
>	 * @param request Petición
	 * @param response Respuesta
	 * @param token Token a emplear
	 * @param idPeticion Identificador de la petición 
	 * @param idTerminal Identificación del terminal
	 * @param usuario Usuario que realiza la petición
	 */
	private void callPatientBasicData(ConsultarPersonaRequest request, ConsultarPersonaResponse response,
			String token, String idPeticion, String idTerminal, String usuario ) {
		long startTime = System.currentTimeMillis();
		Timestamp fechaHora = STDFunctions.systemDateTimeFun();	
		String mensajeError = "";
		long endTime = startTime;
		Double tiempoEjecucion = 0.0;
		int numIntentos = 1;
		int numReintentos401 = 0;

		while (numIntentos <= maxIntentosLlamada && numReintentos401 < maxReintentos401) {

			startTime = System.currentTimeMillis();
			fechaHora = STDFunctions.systemDateTimeFun();	
			try {
				PatientBasicDataResponse patientBasicDataResponse = patientProxy.basicData(token, 
						idPeticion, 
						idTerminal, 
						usuario, 
						callBHUtils.getRequestDate(), 
						"1", 
						request.getNumeroIdentificacion(),
						request.getTipoIdentificacion());
				if (patientBasicDataResponse != null && patientBasicDataResponse.getData() != null && 
						!patientBasicDataResponse.getData().isEmpty()) {
					response.setBasicData(patientBasicDataResponse.getData().get(0));
				}
				endTime = System.currentTimeMillis();
				mensajeError = "";
				response.checkError();
				break;
			} catch (Exception e) {
				endTime = System.currentTimeMillis();
				mensajeError = e.getMessage();
				if (mensajeError != null && mensajeError.indexOf("401") >= 0) {
					LogManagement.info("Patient basicData. Reintento por 401");
					// Guardamos la llamada al WS
					tiempoEjecucion = (double) ((endTime - startTime)/1000.0f);
					callBHUtils.guardarLlamadaBH(fechaHora, usuario, 
							"basicData",
							"Patient", 
							request.getNumSolicitud(), 
							request.getTipoIdentificacion() + " " +request.getNumeroIdentificacion(),
							response.getBasicData(),
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
						LogManagement.error("PAT-0020. Error obteniendo token. " + e.getMessage());
						response.setExito(false);
						response.setTextoError(STDFunctions.getTextoErrorUsuarioFinal("PAT-0020"));
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
			response.setTextoError(STDFunctions.getTextoErrorUsuarioFinal("PAT-0015"));
		}

		tiempoEjecucion = (double) ((endTime - startTime)/1000.0f);
		// Guardamos la llamada al WS
		callBHUtils.guardarLlamadaBH(fechaHora, usuario, 
				"basicData",
				"Patient", 
				request.getNumSolicitud(), 
				request.getTipoIdentificacion() + " " +request.getNumeroIdentificacion(),
				response.getBasicData(),
				tiempoEjecucion, mensajeError);
	}

	/**
	 * Realiza la petición a contactInformation de Patient 
	 * @param request Petición
	 * @param response Respuesta
	 * @param token Token a emplear
	 * @param idPeticion Identificador de la petición 
	 * @param idTerminal Identificación del terminal
	 * @param usuario Usuario que realiza la petición
	 */
	private void callPatientContactInformation(ConsultarPersonaRequest request, ConsultarPersonaResponse response,
			String token, String idPeticion, String idTerminal, String usuario ) {
		long startTime = System.currentTimeMillis();
		Timestamp fechaHora = STDFunctions.systemDateTimeFun();	
		String mensajeError = "";
		long endTime = startTime;
		Double tiempoEjecucion = 0.0;
		int numIntentos = 1;
		int numReintentos401 = 0;

		while (numIntentos <= maxIntentosLlamada && numReintentos401 < maxReintentos401) {

			startTime = System.currentTimeMillis();
			fechaHora = STDFunctions.systemDateTimeFun();	
			try {
				response.setContact(patientProxy.contactInformation(token, 
						idPeticion, 
						idTerminal, 
						usuario, 
						callBHUtils.getRequestDate(), 
						"1", 
						request.getNumeroIdentificacion(),
						request.getTipoIdentificacion()));
				endTime = System.currentTimeMillis();
				mensajeError = "";
				response.checkError();
				break;
			} catch (Exception e) {
				endTime = System.currentTimeMillis();
				mensajeError = e.getMessage();
				if (mensajeError != null && mensajeError.indexOf("401") >= 0) {
					LogManagement.info("Patient contactInformation. Reintento por 401");
					// Guardamos la llamada al WS
					tiempoEjecucion = (double) ((endTime - startTime)/1000.0f);
					callBHUtils.guardarLlamadaBH(fechaHora, usuario, 
							"contactInformation",
							"Patient", 
							request.getNumSolicitud(), 
							request.getTipoIdentificacion() + " " +request.getNumeroIdentificacion(),
							response.getContact(),
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
						LogManagement.error("PAT-0120. Error obteniendo token. " + e.getMessage());
						response.setExito(false);
						response.setTextoError(STDFunctions.getTextoErrorUsuarioFinal("PAT-0120"));
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
			response.setTextoError(STDFunctions.getTextoErrorUsuarioFinal("PAT-0110"));
		}

		tiempoEjecucion = (double) ((endTime - startTime)/1000.0f);
		// Guardamos la llamada al WS
		callBHUtils.guardarLlamadaBH(fechaHora, usuario, 
				"contactInformation",
				"Patient", 
				request.getNumSolicitud(), 
				request.getTipoIdentificacion() + " " +request.getNumeroIdentificacion(),
				response.getContact(),
				tiempoEjecucion, mensajeError);
	}	

	private void callPatientAlerts(ConsultarPersonaRequest request, ConsultarPersonaResponse response,
			String token, String idPeticion, String idTerminal, String usuario ) {
		long startTime = System.currentTimeMillis();
		Timestamp fechaHora = STDFunctions.systemDateTimeFun();	
		String mensajeError = "";
		long endTime = startTime;
		Double tiempoEjecucion = 0.0;
		int numIntentos = 1;
		int numReintentos401 = 0;

		ConsultAlertsRequest requestAlerts = new ConsultAlertsRequest();
		ConsultAlertsResponse consultAlertsResponse = null;
		while (numIntentos <= maxIntentosLlamada && numReintentos401 < maxReintentos401) {

			startTime = System.currentTimeMillis();
			fechaHora = STDFunctions.systemDateTimeFun();	
			try {
				requestAlerts.setAlerType("T");
				requestAlerts.setIdentifier(new ArrayList<Identifier>());
				Identifier id = new Identifier();
				id.setType("TIPO_IDENTIFICACION");
				id.setValue(request.getTipoIdentificacion());
				requestAlerts.getIdentifier().add(id);
				id = new Identifier();
				id.setType("NUMERO_IDENTIFICACION");
				id.setValue(request.getNumeroIdentificacion());
				requestAlerts.getIdentifier().add(id);

				consultAlertsResponse = patientProxy.consultAlerts(token, 
						idPeticion, 
						idTerminal, 
						usuario, 
						callBHUtils.getRequestDate(), 
						requestAlerts);
				if (consultAlertsResponse != null && consultAlertsResponse.getPersonAlerts() != null && 
						consultAlertsResponse.getPersonAlerts().getCode() != null) {
					response.setEstadoPersona(consultAlertsResponse.getPersonAlerts().getCode());
				}
				endTime = System.currentTimeMillis();
				mensajeError = "";
				response.checkError();
				break;
			} catch (Exception e) {
				endTime = System.currentTimeMillis();
				mensajeError = e.getMessage();
				if (mensajeError != null && mensajeError.indexOf("401") >= 0) {
					LogManagement.info("Patient consultAlerts. Reintento por 401");
					// Guardamos la llamada al WS
					tiempoEjecucion = (double) ((endTime - startTime)/1000.0f);
					callBHUtils.guardarLlamadaBH(fechaHora, usuario, 
							"consultAlerts",
							"Patient", 
							request.getNumSolicitud(), 
							requestAlerts,
							consultAlertsResponse,
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
						LogManagement.error("PAT-0030. Error obteniendo token. " + e.getMessage());
						response.setExito(false);
						response.setTextoError(STDFunctions.getTextoErrorUsuarioFinal("PAT-0030"));
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
			response.setTextoError(STDFunctions.getTextoErrorUsuarioFinal("PAT-0035"));
		}

		tiempoEjecucion = (double) ((endTime - startTime)/1000.0f);
		// Guardamos la llamada al WS
		callBHUtils.guardarLlamadaBH(fechaHora, usuario, 
				"consultAlerts",
				"Patient", 
				request.getNumSolicitud(), 
				requestAlerts,
				consultAlertsResponse,
				tiempoEjecucion, mensajeError);
	}
	public CrearActualizarPersonaResponse crearPersona(CrearActualizarPersonaRequest request) {

		CrearActualizarPersonaResponse response = new CrearActualizarPersonaResponse();
		// Datos de headers
		String idPeticion = "AE" + request.getNumSolicitud();
		String idTerminal = "1";
		String usuario = "";
		try {
			usuario = callBHUtils.getUsuario();
		} catch (Exception e) {
			LogManagement.error("PAT-0005. Error recuperando usuario. " + e.getMessage());
			response.setExito(false);
			response.setTextoError( STDFunctions.getTextoErrorUsuarioFinal("PAT-0005"));
			return response;
		}

		// Obtenemos el Token
		String token = "";
		try {
			token = tokenUtils.getTokenValue();
		} catch (Exception e) {
			LogManagement.error("PAT-0010. Error obteniendo token. " + e.getMessage());
			response.setExito(false);
			response.setTextoError(STDFunctions.getTextoErrorUsuarioFinal("PAT-0010"));
			return response;
		}

		// Llamamos para crear los datos básicos de persona
		callCreateBasicData(request, response, token, idPeticion, idTerminal, usuario);

		// Dado que la respuesta no contiene el nuevo Id de la persona, lanzamos una consulta para recuperar su valor
		// Indicado así en correo electrónica de Juan Pablo Ortiz Merchán <juaportiz@colsanitas.com> el 06/03/2025 12:54
		if (response.isExito()) {
			// Llamamos a la consulta
			ConsultarPersonaRequest reqConsultaPersona = new ConsultarPersonaRequest();
			reqConsultaPersona.setNumeroIdentificacion(request.getNumeroIdentificacion());
			reqConsultaPersona.setNumSolicitud(request.getNumSolicitud());
			reqConsultaPersona.setSoloDatosBasicos(true);
			reqConsultaPersona.setTipoIdentificacion(request.getTipoIdentificacion());
			ConsultarPersonaResponse resConsultaPersona = consultarPersona(reqConsultaPersona);
			if (!resConsultaPersona.isExito()) {
				response.setExito(false);
				response.setTextoError("");
				return response;
			}

			// Asignamos el nuevo Id
			response.setCodigoPersona(resConsultaPersona.getCodigo());
		}


		// Datos de contacto
		if (response.isExito()) {
			callCreateContactInformation(request, response, token, idPeticion, idTerminal, usuario);
		}

		return response;
	}

	/**
	 * Invoca al servicio de creacion de los datos basicos de la persona
	 * @param request
	 * @param response
	 * @param token
	 * @param idPeticion
	 * @param idTerminal
	 * @param usuario
	 */
	private void callCreateBasicData(CrearActualizarPersonaRequest request, CrearActualizarPersonaResponse response, String token,
			String idPeticion, String idTerminal, String usuario) {

		long startTime = System.currentTimeMillis();
		Timestamp fechaHora = STDFunctions.systemDateTimeFun();	
		String mensajeError = "";
		long endTime = startTime;
		Double tiempoEjecucion = 0.0;
		int numIntentos = 1;
		int numReintentos401 = 0;

		// Pasamos los datos a la peticion de BH
		CreateBasicDataRequest createBasicDataRequest = new CreateBasicDataRequest();
		createBasicDataRequest.setIdentificacion(request.getTipoIdentificacion(), request.getNumeroIdentificacion());
		createBasicDataRequest.setBirthDate( callBHUtils.formatFechaJson(request.getFechaNacimiento()));
		createBasicDataRequest.setGender(request.getGenero());
		createBasicDataRequest.setNombres(request.getPrimerNombre(), request.getSegundoNombre(), 
				request.getPrimerApellido(), request.getSegundoApellido());

		createBasicDataRequest.setCiudadNacimiento(request.getCodigoMunicioNacimiento(), request.getCodigoDepartamentoNacimiento());

		createBasicDataRequest.setForeing(request.isForeing());

		createBasicDataRequest.setEstadoCivil(request.getEstadoCivil());

		CreateBasicDataResponse createBasicDataResponse = null;
		while (numIntentos <= maxIntentosLlamada && numReintentos401 < maxReintentos401) {

			startTime = System.currentTimeMillis();
			fechaHora = STDFunctions.systemDateTimeFun();	
			try {
				mensajeError = "";
				String responseString = patientProxy.createBasicData(token, 
						idPeticion, 
						idTerminal, 
						usuario, 
						callBHUtils.getRequestDate(), 
						createBasicDataRequest);
				endTime = System.currentTimeMillis();

				ObjectMapper mapper = new ObjectMapper();
				mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
				try {
					List<CreateBasicDataResponse> lista = mapper.readValue(responseString, new TypeReference<List<CreateBasicDataResponse>>() { });
					if (lista != null && !lista.isEmpty()) {
						createBasicDataResponse = lista.get(0);
					}
				} catch(Exception e) {
					LogManagement.info("Patient createBasicData. deserialization error: " + e.getMessage());
					response.setExito(false);
					response.setTextoError(STDFunctions.getTextoErrorUsuarioFinal("PAT-0220"));
					break;
				}	

				if (createBasicDataResponse.isError()) {
					response.setExito(false);
					response.setTextoError(createBasicDataResponse.getTextoError());
					LogManagement.info("Patient createBasicData. " + mensajeError);
				} 
				break;
			} catch (Exception e) {
				endTime = System.currentTimeMillis();
				mensajeError = e.getMessage();
				LogManagement.info("Patient createBasicData. Error: " + mensajeError);
				if (mensajeError != null && mensajeError.indexOf("401") >= 0) {
					LogManagement.info("Patient createBasicData. Reintento por 401");
					// Guardamos la llamada al WS
					tiempoEjecucion = (double) ((endTime - startTime)/1000.0f);
					callBHUtils.guardarLlamadaBH(fechaHora, usuario, 
							"createBasicData",
							"Patient", 
							request.getNumSolicitud(), 
							createBasicDataRequest,
							createBasicDataResponse,
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
						LogManagement.error("PAT-0120. Error obteniendo token. " + e.getMessage());
						response.setExito(false);
						response.setTextoError(STDFunctions.getTextoErrorUsuarioFinal("PAT-0120"));
						return;
					}
					numReintentos401++;			
				} else {
					numIntentos++;
				}
			}
		}
		if (mensajeError != null && !mensajeError.isEmpty()) {
			LogManagement.error("PAT-0150. " + mensajeError);
			response.setExito(false);
			response.setTextoError(STDFunctions.getTextoErrorUsuarioFinal("PAT-0150"));
		}
		tiempoEjecucion = (double) ((endTime - startTime)/1000.0f);
		// Guardamos la llamada al WS
		callBHUtils.guardarLlamadaBH(fechaHora, usuario, 
				"createBasicData",
				"Patient", 
				request.getNumSolicitud(), 
				createBasicDataRequest,
				createBasicDataResponse,
				tiempoEjecucion, mensajeError);

	}

	/**
	 * Invoca al servicio de creacion de los datos de contacto de la persona 
	 * @param request
	 * @param response
	 * @param token
	 * @param idPeticion
	 * @param idTerminal
	 * @param usuario
	 */
	private void callCreateContactInformation(CrearActualizarPersonaRequest request, CrearActualizarPersonaResponse response, String token,
			String idPeticion, String idTerminal, String usuario) {

		CreateUpdateContactRequest crearContactRequest = new CreateUpdateContactRequest();

		// Persona
		crearContactRequest.asignarPersona(request.getTipoIdentificacion(), request.getNumeroIdentificacion());
		
		// Direccion residencia
		if (request.getDireccionResidencia() != null && !request.getDireccionResidencia().isEmpty()) {
			
			crearContactRequest.anyadirDireccion(null, "1", 
					request.getDireccionResidencia(), request.getMunicipioResidencia(), 
					request.getDepartamentoResidencia(), request.getPaisResidencia());
		}
		
		// Telefonos residencia
		if (request.getTelefonoFijoResidencia() != null && !request.getTelefonoFijoResidencia().isEmpty() ) {
			crearContactRequest.anyadirTelefono(null, "1", true, request.getTelefonoFijoResidencia());
		}
		if (request.getTelefonoCelularResidencia() != null && !request.getTelefonoCelularResidencia().isEmpty()) {
			crearContactRequest.anyadirTelefono(null, "1", false, request.getTelefonoCelularResidencia());
		}

		// Direccion correspondencia
		if (request.getDireccionCorrespondencia() != null && !request.getDireccionCorrespondencia().isEmpty()) {
			
			crearContactRequest.anyadirDireccion(null, "5", 
					request.getDireccionCorrespondencia(), request.getMunicipioCorrespondencia(), 
					request.getDepartamentoCorrespondencia(), request.getPaisCorrespondencia());
		}
		
		// Telefonos correspondencia
		if (request.getTelefonoFijoCorrespondencia() != null && !request.getTelefonoFijoCorrespondencia().isEmpty()) {
			crearContactRequest.anyadirTelefono(null, "5", true, request.getTelefonoFijoCorrespondencia());
		}
		if (request.getTelefonoCelularCorrespondencia() != null && !request.getTelefonoCelularCorrespondencia().isEmpty()) {
			crearContactRequest.anyadirTelefono(null, "5", false, request.getTelefonoCelularCorrespondencia());
		}

		// Correo electronico
		if (request.getCorreoElectronico() != null && !request.getCorreoElectronico().isEmpty()) {
			crearContactRequest.anyadirCorreoElectronico(null, request.getCorreoElectronico());
		}
		
		String error = callCreateUpdateInformation(true, crearContactRequest, request.getNumSolicitud(), token, idPeticion, idTerminal, usuario);
		
		if (error != null && !error.isEmpty()) {
			response.setExito(false);
			response.setTextoError(error);
		}
	}

	private void callActualizarContactInformation(CrearActualizarPersonaRequest request, 
			CrearActualizarPersonaResponse response, String token,
			String idPeticion, String idTerminal, String usuario) {

		// Primero consultamos la información de contacto de la persona para saber si tenemos que crear o actualizar cada 
		//  datos de contacto
		ConsultarPersonaRequest requestDatosContacto = new ConsultarPersonaRequest();
		requestDatosContacto.setNumeroIdentificacion(request.getNumeroIdentificacion());
		requestDatosContacto.setNumSolicitud(request.getNumSolicitud());
		requestDatosContacto.setSoloDatosBasicos(false);
		requestDatosContacto.setTipoIdentificacion(request.getTipoIdentificacion());
		ConsultarPersonaResponse responseDatosContacto = new ConsultarPersonaResponse();
		callPatientContactInformation(requestDatosContacto, responseDatosContacto , token, idPeticion, idTerminal, usuario);
		
		if (responseDatosContacto == null || !responseDatosContacto.isExito()) {
			response.setExito(false);
			return;
		}
		
		// Es posible que necesitemos hacer dos llamadas, una pra actualizar los datos existentes y otra para crear los que no existan
		boolean hayQueCrear = false;
		CreateUpdateContactRequest crearContactRequest = new CreateUpdateContactRequest();
		boolean hayQueActualizar = false;
		CreateUpdateContactRequest updateContectRequest = new CreateUpdateContactRequest();

		// Persona
		crearContactRequest.asignarPersona(request.getTipoIdentificacion(), request.getNumeroIdentificacion());
		updateContectRequest.asignarPersona(request.getTipoIdentificacion(), request.getNumeroIdentificacion());
		
		// Direccion residencia
		boolean tieneDirResidencia = false;
		if (request.getDireccionResidencia() != null && !request.getDireccionResidencia().isEmpty()) {

			tieneDirResidencia = true;
			Address dirRes = responseDatosContacto.getDireccionResidencia();
			if (dirRes != null && dirRes.getCode() != null) {
				hayQueActualizar = true;
				updateContectRequest.anyadirDireccion(dirRes.getCode(), "1", 
						request.getDireccionResidencia(), request.getMunicipioResidencia(), 
						request.getDepartamentoResidencia(), request.getPaisResidencia());
			} else {
				hayQueCrear = true;
				crearContactRequest.anyadirDireccion(null, "1", 
						request.getDireccionResidencia(), request.getMunicipioResidencia(), 
						request.getDepartamentoResidencia(), request.getPaisResidencia());
			}
		}
		
		// Telefonos residencia
		if (tieneDirResidencia && request.getTelefonoFijoResidencia() != null && !request.getTelefonoFijoResidencia().isEmpty()) {
			
			Telecom tele = responseDatosContacto.getInfoTelefonoFijoResidencia();
			if (tele != null && tele.getCode() != null) {
				updateContectRequest.anyadirTelefono(tele.getCode(), "1", true, request.getTelefonoFijoResidencia());
				hayQueActualizar = true;
			} else {
				crearContactRequest.anyadirTelefono(null, "1", true, request.getTelefonoFijoResidencia());
				hayQueCrear = true;
			}
		}
		if (tieneDirResidencia && request.getTelefonoCelularResidencia() != null && !request.getTelefonoCelularResidencia().isEmpty()) {
			
			Telecom tele = responseDatosContacto.getInfoTelefonoCelularResidencia();
			if (tele != null && tele.getCode() != null) {
				updateContectRequest.anyadirTelefono(tele.getCode(), "1", false, request.getTelefonoCelularResidencia());
				hayQueActualizar = true;
			} else {
				crearContactRequest.anyadirTelefono(null, "1", false, request.getTelefonoCelularResidencia());
				hayQueCrear = true;
			}
		}

		// Direccion correspondencia
		boolean tieneDirCorrespondencia = false;
		if (request.getDireccionCorrespondencia() != null && !request.getDireccionCorrespondencia().isEmpty()) {
			tieneDirCorrespondencia = true;
			Address dirCorr = responseDatosContacto.getDireccionCorrespondencia();
			if (dirCorr != null && dirCorr.getCode() != null) {
				hayQueActualizar = true;
				updateContectRequest.anyadirDireccion(dirCorr.getCode(), "5", 
						request.getDireccionCorrespondencia(), request.getMunicipioCorrespondencia(), 
						request.getDepartamentoCorrespondencia(), request.getPaisCorrespondencia());
			} else {
				hayQueCrear = true;
				crearContactRequest.anyadirDireccion(null, "5", 
						request.getDireccionCorrespondencia(), request.getMunicipioCorrespondencia(), 
						request.getDepartamentoCorrespondencia(), request.getPaisCorrespondencia());
			}
		}
		
		// Telefonos correspondencia 
		if (tieneDirCorrespondencia && request.getTelefonoFijoCorrespondencia() != null && !request.getTelefonoFijoCorrespondencia().isEmpty()) {
			Telecom tele = responseDatosContacto.getInfoTelefonoFijoCorrespondencia();
			if (tele != null && tele.getCode() != null) {
				updateContectRequest.anyadirTelefono(tele.getCode(), "5", true, request.getTelefonoFijoCorrespondencia());
				hayQueActualizar = true;
			} else {
				crearContactRequest.anyadirTelefono(null, "5", true, request.getTelefonoFijoCorrespondencia());
				hayQueCrear = true;
			}
			
		}
		if (tieneDirCorrespondencia && request.getTelefonoCelularCorrespondencia() != null && !request.getTelefonoCelularCorrespondencia().isEmpty()) {
			Telecom tele = responseDatosContacto.getInfoTelefonoCelularCorrespondencia();
			if (tele != null && tele.getCode() != null) {
				updateContectRequest.anyadirTelefono(tele.getCode(), "5", false, request.getTelefonoCelularCorrespondencia());
				hayQueActualizar = true;
			} else {
				crearContactRequest.anyadirTelefono(null, "5", false, request.getTelefonoCelularCorrespondencia());
				hayQueCrear = true;
			}
		}

		
		// Correo electronico
		if (request.getCorreoElectronico() != null && !request.getCorreoElectronico().isEmpty()) {
			Telecom tele = responseDatosContacto.getInfoCorreoElectronico();
			if (tele != null && tele.getCode() != null) {
				updateContectRequest.anyadirCorreoElectronico(tele.getCode(), request.getCorreoElectronico());
				hayQueActualizar = true;
			} else {
				crearContactRequest.anyadirCorreoElectronico(null, request.getCorreoElectronico());
				hayQueCrear = true;
			}
		}

		
		String error = null;
		if (hayQueCrear) {
			error = callCreateUpdateInformation(true, crearContactRequest, request.getNumSolicitud(), token, idPeticion, idTerminal, usuario);
		}
		if (hayQueActualizar && (error == null || error.isEmpty())) {
			error = callCreateUpdateInformation(false, updateContectRequest, request.getNumSolicitud(), token, idPeticion, idTerminal, usuario);
		}
		
		if (error != null && !error.isEmpty()) {
			response.setExito(false);
			response.setTextoError(error);
		}
	}
	
	private String callCreateUpdateInformation(boolean llamarCrear, CreateUpdateContactRequest request, String numSolicitud, String token,
			String idPeticion, String idTerminal, String usuario) {

		long startTime = System.currentTimeMillis();
		Timestamp fechaHora = STDFunctions.systemDateTimeFun();	
		String mensajeError = "";
		long endTime = startTime;
		Double tiempoEjecucion = 0.0;
		int numIntentos = 1;
		int numReintentos401 = 0;

		String responseString = "";
		while (numIntentos <= maxIntentosLlamada && numReintentos401 < maxReintentos401) {

			startTime = System.currentTimeMillis();
			fechaHora = STDFunctions.systemDateTimeFun();	
			try {
				mensajeError = "";
				if (llamarCrear) {
					responseString = patientProxy.createContactInformation(token, 
							idPeticion, 
							idTerminal, 
							usuario, 
							callBHUtils.getRequestDate(), 
							request);
				} else {
					responseString = patientProxy.updateContactInformation(token, 
							idPeticion, 
							idTerminal, 
							usuario, 
							callBHUtils.getRequestDate(), 
							request);
				}
				endTime = System.currentTimeMillis();

				if (responseString != null && responseString.indexOf("\"status\":\"200 OK\"") < 0 ) {
					mensajeError = "Error creando informacion de contacto";
				}
				
				
				break;
			} catch (Exception e) {
				endTime = System.currentTimeMillis();
				mensajeError = e.getMessage();
				LogManagement.info("Patient createContectInformation. Error: " + mensajeError);
				if (mensajeError != null && mensajeError.indexOf("401") >= 0) {
					LogManagement.info("Patient createContactInformation. Reintento por 401");
					// Guardamos la llamada al WS
					tiempoEjecucion = (double) ((endTime - startTime)/1000.0f);
					callBHUtils.guardarLlamadaBH(fechaHora, usuario, 
							llamarCrear ? "CreateContactInformation" : "updateContactInformation",
							"Patient", 
							numSolicitud, 
							request,
							responseString,
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
						LogManagement.error("PAT-1120. Error obteniendo token. " + e.getMessage());
						return STDFunctions.getTextoErrorUsuarioFinal("PAT-1120");
					}
					numReintentos401++;			
				} else {
					numIntentos++;
				}
			}
		}
		if (mensajeError != null && !mensajeError.isEmpty()) {
			LogManagement.error("PAT-1150. " + mensajeError);
		}
		tiempoEjecucion = (double) ((endTime - startTime)/1000.0f);
		// Guardamos la llamada al WS
		callBHUtils.guardarLlamadaBH(fechaHora, usuario, 
				llamarCrear ? "CreateContactInformation" : "updateContactInformation",
				"Patient", 
				numSolicitud, 
				request,
				responseString,
				tiempoEjecucion, mensajeError);

		return mensajeError;
	}

	
	/**
	 * Devuelve las respuestas del cuestionario médico de la persona indicada en la peticion
	 * @param request
	 * @return
	 */
	public ConsultarCuestionarioMedicoResponse consultarCuestionarioMedico(ConsultarPersonaRequest request) {

		ConsultarCuestionarioMedicoResponse response = new ConsultarCuestionarioMedicoResponse();

		// Datos de headers
		String idPeticion = "AE" + request.getNumSolicitud();
		String idTerminal = "1";
		String usuario = "";
		try {
			usuario = callBHUtils.getUsuario();
		} catch (Exception e) {
			LogManagement.error("PAT-0005. Error recuperando usuario. " + e.getMessage());
			response.setExito(false);
			response.setTextoError( STDFunctions.getTextoErrorUsuarioFinal("PAT-0005"));
			return response;
		}

		// Obtenemos el Token
		String token = "";
		try {
			token = tokenUtils.getTokenValue();
		} catch (Exception e) {
			LogManagement.error("PAT-0010. Error obteniendo token. " + e.getMessage());
			response.setExito(false);
			response.setTextoError(STDFunctions.getTextoErrorUsuarioFinal("PAT-0010"));
			return response;
		}

		// Asignamos los datos de la persona
		PatientQuestionnaireRequest requestCuestionario = new PatientQuestionnaireRequest();
		requestCuestionario.asignarIdentificacion(request.getTipoIdentificacion(), request.getNumeroIdentificacion());

		long startTime = System.currentTimeMillis();
		Timestamp fechaHora = STDFunctions.systemDateTimeFun();	
		String mensajeError = "";
		long endTime = startTime;
		Double tiempoEjecucion = 0.0;
		int numIntentos = 1;
		int numReintentos401 = 0;

		while (numIntentos <= maxIntentosLlamada && numReintentos401 < maxReintentos401) {

			startTime = System.currentTimeMillis();
			fechaHora = STDFunctions.systemDateTimeFun();	
			try {
				PatientQuestionnaireResponse responseQuestionario = patientProxy.getQuestionnaireResponse(token, 
						idPeticion, 
						idTerminal, 
						usuario, 
						requestCuestionario);

				endTime = System.currentTimeMillis();
				mensajeError = "";
				response.setQuestionnaireResponse(responseQuestionario);
				break;
			} catch (Exception e) {
				endTime = System.currentTimeMillis();
				mensajeError = e.getMessage();
				if (mensajeError != null && mensajeError.indexOf("401") >= 0) {
					LogManagement.info("Patient getQuestionnaireResponse. Reintento por 401");
					// Guardamos la llamada al WS
					tiempoEjecucion = (double) ((endTime - startTime)/1000.0f);
					callBHUtils.guardarLlamadaBH(fechaHora, usuario, 
							"getQuestionnaireResponse",
							"Patient", 
							request.getNumSolicitud(), 
							requestCuestionario,
							response.getQuestionnaireResponse(),
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
						LogManagement.error("PAT-0020. Error obteniendo token. " + e.getMessage());
						response.setExito(false);
						response.setTextoError(STDFunctions.getTextoErrorUsuarioFinal("PAT-0020"));
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
			response.setTextoError(STDFunctions.getTextoErrorUsuarioFinal("PAT-0015"));
		}

		tiempoEjecucion = (double) ((endTime - startTime)/1000.0f);
		// Guardamos la llamada al WS
		callBHUtils.guardarLlamadaBH(fechaHora, usuario, 
				"getQuestionnaireResponse",
				"Patient", 
				request.getNumSolicitud(), 
				requestCuestionario,
				response.getQuestionnaireResponse(),
				tiempoEjecucion, mensajeError);

		return response;
	}

	/**
	 * Devuelve las preexistencias de la persona indicada en la request
	 * @param request
	 * @return
	 */
	public ConsultarPreexistenciasResponse consultarPreexistencias(ConsultarPersonaRequest request) {

		ConsultarPreexistenciasResponse response = new ConsultarPreexistenciasResponse();

		// Datos de headers
		String idPeticion = "AE" + request.getNumSolicitud();
		String idTerminal = "1";
		String usuario = "";
		try {
			usuario = callBHUtils.getUsuario();
		} catch (Exception e) {
			LogManagement.error("PAT-0005. Error recuperando usuario. " + e.getMessage());
			response.setExito(false);
			response.setTextoError( STDFunctions.getTextoErrorUsuarioFinal("PAT-0005"));
			return response;
		}

		// Obtenemos el Token
		String token = "";
		try {
			token = tokenUtils.getTokenValue();
		} catch (Exception e) {
			LogManagement.error("PAT-0010. Error obteniendo token. " + e.getMessage());
			response.setExito(false);
			response.setTextoError(STDFunctions.getTextoErrorUsuarioFinal("PAT-0010"));
			return response;
		}

		// Asignamos los datos de la persona
		ConditionRequest requestCondition = new ConditionRequest();
		requestCondition.asignarIdentificacion(request.getTipoIdentificacion(), request.getNumeroIdentificacion());

		long startTime = System.currentTimeMillis();
		Timestamp fechaHora = STDFunctions.systemDateTimeFun();	
		String mensajeError = "";
		long endTime = startTime;
		Double tiempoEjecucion = 0.0;
		int numIntentos = 1;
		int numReintentos401 = 0;

		while (numIntentos <= maxIntentosLlamada && numReintentos401 < maxReintentos401) {

			startTime = System.currentTimeMillis();
			fechaHora = STDFunctions.systemDateTimeFun();	
			try {
				ConditionResponse responseCondition = patientProxy.condition(token, 
						idPeticion, 
						idTerminal, 
						usuario, 
						callBHUtils.getRequestDate(),
						requestCondition);

				endTime = System.currentTimeMillis();
				mensajeError = "";
				response.setConditionResponse(responseCondition);
				break;
			} catch (Exception e) {
				endTime = System.currentTimeMillis();
				mensajeError = e.getMessage();
				if (mensajeError != null && mensajeError.indexOf("401") >= 0) {
					LogManagement.info("Patient Condition. Reintento por 401");
					// Guardamos la llamada al WS
					tiempoEjecucion = (double) ((endTime - startTime)/1000.0f);
					callBHUtils.guardarLlamadaBH(fechaHora, usuario, 
							"Condition",
							"Patient", 
							request.getNumSolicitud(), 
							requestCondition,
							response.getConditionResponse(),
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
						LogManagement.error("PAT-0020. Error obteniendo token. " + e.getMessage());
						response.setExito(false);
						response.setTextoError(STDFunctions.getTextoErrorUsuarioFinal("PAT-0020"));
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
			response.setTextoError(STDFunctions.getTextoErrorUsuarioFinal("PAT-0015"));
		}

		tiempoEjecucion = (double) ((endTime - startTime)/1000.0f);
		// Guardamos la llamada al WS
		callBHUtils.guardarLlamadaBH(fechaHora, usuario, 
				"Condition",
				"Patient", 
				request.getNumSolicitud(), 
				requestCondition,
				response.getConditionResponse(),
				tiempoEjecucion, mensajeError);

		return response;
	}

	public CrearActualizarPersonaResponse actualizarPersona(CrearActualizarPersonaRequest request) {

		CrearActualizarPersonaResponse response = new CrearActualizarPersonaResponse();
		
		// Datos de headers
		String idPeticion = "AE" + request.getNumSolicitud();
		String idTerminal = "1";
		String usuario = "";
		try {
			usuario = callBHUtils.getUsuario();
		} catch (Exception e) {
			LogManagement.error("PAT-1005. Error recuperando usuario. " + e.getMessage());
			response.setExito(false);
			response.setTextoError(STDFunctions.getTextoErrorUsuarioFinal("PAT-1005"));
			return response;
		}

		// Obtenemos el Token
		String token = "";
		try {
			token = tokenUtils.getTokenValue();
		} catch (Exception e) {
			LogManagement.error("PAT-1010. Error obteniendo token. " + e.getMessage());
			response.setExito(false);
			response.setTextoError(STDFunctions.getTextoErrorUsuarioFinal("PAT-1010"));
			return response;
		}

		// Llamamos para actualizar los datos básicos de persona
		response.setTextoError(callUpdateBasicData(request, token, idPeticion, idTerminal, usuario));

		// Datos de contacto
		if (response.getTextoError() == null || response.getTextoError().isEmpty()) {
			callActualizarContactInformation(request, response, token, idPeticion, idTerminal, usuario);
		} 

		response.setExito(response.getTextoError() == null || response.getTextoError().isEmpty());
		return response;
	}

	private String callUpdateBasicData(CrearActualizarPersonaRequest request, String token, String idPeticion, String idTerminal, String usuario) {

		long startTime = System.currentTimeMillis();
		Timestamp fechaHora = STDFunctions.systemDateTimeFun();	
		String mensajeError = "";
		long endTime = startTime;
		Double tiempoEjecucion = 0.0;
		int numIntentos = 1;
		int numReintentos401 = 0;

		// Pasamos los datos a la peticion de BH
		UpdateBasicDataRequest updateBasicDataRequest = new UpdateBasicDataRequest();
		updateBasicDataRequest.asignarIdentificacion(request.getCodigo(), request.getTipoIdentificacion(), request.getNumeroIdentificacion());
		// Cogemos el primer elemento
		Entry entry = updateBasicDataRequest.getEntry().get(0);

		entry.asignarNombres(request.getPrimerNombre(), request.getSegundoNombre(), request.getPrimerApellido(), request.getSegundoApellido());
		entry.asignarCodigoCiudadNacimiento(request.getCodigoMunicioNacimiento());
		entry.asignarEstadoCivil(request.getEstadoCivil());
		entry.asignarFechaNacimiento(request.getFechaNacimiento());
		entry.asignarGenero(request.getGenero());
		entry.asignarExtranjero(request.isForeing());

		CreateBasicDataResponse createBasicDataResponse = null;
		while (numIntentos <= maxIntentosLlamada && numReintentos401 < maxReintentos401) {

			startTime = System.currentTimeMillis();
			fechaHora = STDFunctions.systemDateTimeFun();	
			try {
				mensajeError = "";
				String responseString = patientProxy.updateBasicData(token, 
						idPeticion, 
						idTerminal, 
						usuario, 
						callBHUtils.getRequestDate(), 
						updateBasicDataRequest);
				endTime = System.currentTimeMillis();

				ObjectMapper mapper = new ObjectMapper();
				mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
				try {
					List<CreateBasicDataResponse> lista = mapper.readValue(responseString, new TypeReference<List<CreateBasicDataResponse>>() { });
					if (lista != null && !lista.isEmpty()) {
						createBasicDataResponse = lista.get(0);
					}
				} catch(Exception e) {
					LogManagement.info("Patient updateBasicData. deserialization error: " + e.getMessage());
					mensajeError = STDFunctions.getTextoErrorUsuarioFinal("PAT-1220");
					break;
				}	

				if (createBasicDataResponse.isError()) {
					mensajeError = createBasicDataResponse.getTextoError();
					LogManagement.info("Patient updateBasicData. " + mensajeError);
				} 
				break;
			} catch (Exception e) {
				endTime = System.currentTimeMillis();
				mensajeError = e.getMessage();
				LogManagement.info("Patient updateBasicData. Error: " + mensajeError);
				if (mensajeError != null && mensajeError.indexOf("401") >= 0) {
					LogManagement.info("Patient updateBasicData. Reintento por 401");
					// Guardamos la llamada al WS
					tiempoEjecucion = (double) ((endTime - startTime)/1000.0f);
					callBHUtils.guardarLlamadaBH(fechaHora, usuario, 
							"updateBasicData",
							"Patient", 
							request.getNumSolicitud(), 
							updateBasicDataRequest,
							createBasicDataResponse,
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
						LogManagement.error("PAT-1120. Error obteniendo token. " + e.getMessage());
						mensajeError = STDFunctions.getTextoErrorUsuarioFinal("PAT-1120");
						break;
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
				"updateBasicData",
				"Patient", 
				request.getNumSolicitud(), 
				updateBasicDataRequest,
				createBasicDataResponse,
				tiempoEjecucion, mensajeError);

		return mensajeError;
	}
	
	public String crearActualizarCuestionarioMedico(CrearActualizarCuestionarioRequest request) {

		String respuesta = "";
		
		// Datos de headers
		String idPeticion = "AE" + request.getNumSolicitud();
		String idTerminal = "1";
		String usuario = "";
		try {
			usuario = callBHUtils.getUsuario();
		} catch (Exception e) {
			LogManagement.error("PAT-0005. Error recuperando usuario. " + e.getMessage());
			respuesta = STDFunctions.getTextoErrorUsuarioFinal("PAT-0505");
			return respuesta;
		}

		// Obtenemos el Token
		String token = "";
		try {
			token = tokenUtils.getTokenValue();
		} catch (Exception e) {
			LogManagement.error("PAT-0010. Error obteniendo token. " + e.getMessage());
			respuesta = STDFunctions.getTextoErrorUsuarioFinal("PAT-0510");
			return respuesta;
		}

		// Asignamos los datos de la persona
		CreateUpdateRequest questionnaireRequest = new CreateUpdateRequest();
		questionnaireRequest.asignarIdentificacion(request.getTipoIdentificacion(), request.getNumeroIdentificacion());
		for(RespuestaCuestionario resp : request.getRespuestas()) {
			questionnaireRequest.anyadirRespuesta(resp.getPregunta(), resp.getRespuestaBool(), resp.getRespuestaString());
		}

		long startTime = System.currentTimeMillis();
		Timestamp fechaHora = STDFunctions.systemDateTimeFun();	
		String mensajeError = "";
		long endTime = startTime;
		Double tiempoEjecucion = 0.0;
		int numIntentos = 1;
		int numReintentos401 = 0;
		Response responseQuestionnaire = null;
		while (numIntentos <= maxIntentosLlamada && numReintentos401 < maxReintentos401) {

			startTime = System.currentTimeMillis();
			fechaHora = STDFunctions.systemDateTimeFun();	
			try {
					String responseString = patientProxy.postQuestionnaireResponse(token,
						idPeticion, 
						idTerminal, 
						usuario, 
						callBHUtils.getRequestDate(),
						questionnaireRequest);

				endTime = System.currentTimeMillis();
				
				ObjectMapper mapper = new ObjectMapper();
				mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
				try {
					List<Response> lista = mapper.readValue(responseString, new TypeReference<List<Response>>() { });
					if (lista != null && !lista.isEmpty()) {
						responseQuestionnaire = lista.get(0);
					}
				} catch(Exception e) {
					LogManagement.info("Patient crearActualizarCuestionarioMedico. deserialization error: " + e.getMessage());
					respuesta = STDFunctions.getTextoErrorUsuarioFinal("PAT-0515");
					return respuesta;
				}	

				
				mensajeError = "";
				if (responseQuestionnaire.isError()) {
					mensajeError = responseQuestionnaire.getTextoError();
					LogManagement.info("Patient postQuestionnaireResponse. " + mensajeError);
				} 
				break;
			} catch (Exception e) {
				endTime = System.currentTimeMillis();
				mensajeError = e.getMessage();
				if (mensajeError != null && mensajeError.indexOf("401") >= 0) {
					LogManagement.info("Patient postQuestionnaireResponse. Reintento por 401");
					// Guardamos la llamada al WS
					tiempoEjecucion = (double) ((endTime - startTime)/1000.0f);
					callBHUtils.guardarLlamadaBH(fechaHora, usuario, 
							"postQuestionnaireResponse",
							"Patient", 
							request.getNumSolicitud(), 
							questionnaireRequest,
							responseQuestionnaire,
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
						LogManagement.error("PAT-0520. Error obteniendo token. " + e.getMessage());
						respuesta = STDFunctions.getTextoErrorUsuarioFinal("PAT-0520");
						return respuesta;
					}
					numReintentos401++;			
				} else {
					numIntentos++;
				}
			}
		}
		if (mensajeError != null && !mensajeError.isEmpty()) {
			respuesta = STDFunctions.getTextoErrorUsuarioFinal("PAT-0525");
		}

		tiempoEjecucion = (double) ((endTime - startTime)/1000.0f);
		// Guardamos la llamada al WS
		callBHUtils.guardarLlamadaBH(fechaHora, usuario, 
				"postQuestionnaireResponse",
				"Patient", 
				request.getNumSolicitud(), 
				questionnaireRequest,
				responseQuestionnaire,
				tiempoEjecucion, mensajeError);

		return respuesta;
	}
}
