package com.keralty.integraciones.patient;

import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.keralty.integraciones.patient.alerts.request.ConsultAlertsRequest;
import com.keralty.integraciones.patient.alerts.response.ConsultAlertsResponse;
import com.keralty.integraciones.patient.basicdata.response.PatientBasicDataResponse;
import com.keralty.integraciones.patient.condition.request.ConditionRequest;
import com.keralty.integraciones.patient.condition.response.ConditionResponse;
import com.keralty.integraciones.patient.contact.response.PatientContactResponse;
import com.keralty.integraciones.patient.createbasicdata.request.CreateBasicDataRequest;
import com.keralty.integraciones.patient.createupdatecontact.request.CreateUpdateContactRequest;
import com.keralty.integraciones.patient.createupdatequestionnare.request.CreateUpdateRequest;
import com.keralty.integraciones.patient.createupdatequestionnare.response.Response;
import com.keralty.integraciones.patient.questionnaire.request.PatientQuestionnaireRequest;
import com.keralty.integraciones.patient.questionnaire.response.PatientQuestionnaireResponse;
import com.keralty.integraciones.patient.updatebasicdata.request.UpdateBasicDataRequest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("")
@RegisterRestClient(configKey="integraciones_patient")
public interface PatientProxy {
	
	@GET 
	@Path("/basicData")
	@Produces(MediaType.APPLICATION_JSON)
	@ClientHeaderParam(name="codAplicacion", value="${com.keralty.integraciones.codaplicacion}")
	@ClientHeaderParam(name="funcionNegocio", value="${com.keralty.integraciones.funcionnegocio}")
	public PatientBasicDataResponse basicData(
			@HeaderParam("Authorization") String token, 
			@HeaderParam("idPeticion") String idPeticion, 
			@HeaderParam("idTerminal") String idTerminal, 
			@HeaderParam("usuario") String usuario, 
			@HeaderParam("fechaPeticion") String fechaPeticion, 
			@HeaderParam("tipoConsulta") String tipoConsulta, 
			@QueryParam("identificationNumber") String identificationNumber,
			@QueryParam("identificationType") String identificationType);
	
	@GET 
	@Path("/contactInformation")
	@Produces(MediaType.APPLICATION_JSON)
	@ClientHeaderParam(name="codAplicacion", value="${com.keralty.integraciones.codaplicacion}")
	@ClientHeaderParam(name="funcionNegocio", value="${com.keralty.integraciones.funcionnegocio}")
	public PatientContactResponse contactInformation(
			@HeaderParam("Authorization") String token, 
			@HeaderParam("idPeticion") String idPeticion, 
			@HeaderParam("idTerminal") String idTerminal, 
			@HeaderParam("usuario") String usuario, 
			@HeaderParam("fechaPeticion") String fechaPeticion, 
			@HeaderParam("tipoConsulta") String tipoConsulta, 
			@QueryParam("identificationNumber") String identificationNumber,
			@QueryParam("identificationType") String identificationType);
	
	@POST 
	@Path("/consultAlerts")
	@Produces(MediaType.APPLICATION_JSON)
	@ClientHeaderParam(name="codAplicacion", value="${com.keralty.integraciones.codaplicacion}")
	@ClientHeaderParam(name="funcionNegocio", value="${com.keralty.integraciones.funcionnegocio}")
	@ClientHeaderParam(name="tipoConsulta", value="1")
	public ConsultAlertsResponse  consultAlerts(
			@HeaderParam("Authorization") String token, 
			@HeaderParam("idPeticion") String idPeticion, 
			@HeaderParam("idTerminal") String idTerminal, 
			@HeaderParam("usuario") String usuario, 
			@HeaderParam("fechaPeticion") String fechaPeticion,
			@RequestBody ConsultAlertsRequest request);

	@POST 
	@Path("/createBasicData")
	@Produces(MediaType.APPLICATION_JSON)
	@ClientHeaderParam(name="aplicationCod", value="${com.keralty.integraciones.codaplicacion}")
	@ClientHeaderParam(name="businessFunction", value="${com.keralty.integraciones.funcionnegocio}")
	public String createBasicData(
			@HeaderParam("Authorization") String token, 
			@HeaderParam("petitionId") String idPeticion, 
			@HeaderParam("terminalId") String idTerminal, 
			@HeaderParam("user") String usuario, 
			@HeaderParam("dateRequest") String fechaPeticion,
			@RequestBody CreateBasicDataRequest request);

	@POST 
	@Path("/getQuestionnaireResponse")
	@Produces(MediaType.APPLICATION_JSON)
	@ClientHeaderParam(name="aplicationCod", value="${com.keralty.integraciones.codaplicacion}")
	public PatientQuestionnaireResponse getQuestionnaireResponse(
			@HeaderParam("Authorization") String token, 
			@HeaderParam("petitionId") String idPeticion, 
			@HeaderParam("terminalId") String idTerminal, 
			@HeaderParam("APIuser") String usuario, 
			@RequestBody PatientQuestionnaireRequest request);

	@POST 
	@Path("/Condition")
	@Produces(MediaType.APPLICATION_JSON)
	@ClientHeaderParam(name="aplicationCod", value="${com.keralty.integraciones.codaplicacion}")
	public ConditionResponse condition(
			@HeaderParam("Authorization") String token, 
			@HeaderParam("petitionId") String idPeticion, 
			@HeaderParam("terminalId") String idTerminal, 
			@HeaderParam("APIuser") String usuario, 
			@HeaderParam("dateRequest") String dateRequest, 
			@RequestBody ConditionRequest request);

	@POST 
	@Path("/updateBasicData")
	@Produces(MediaType.APPLICATION_JSON)
	@ClientHeaderParam(name="aplicationCod", value="${com.keralty.integraciones.codaplicacion}")
	@ClientHeaderParam(name="businessFunction", value="${com.keralty.integraciones.funcionnegocio}")
	public String updateBasicData(
			@HeaderParam("Authorization") String token, 
			@HeaderParam("petitionId") String idPeticion, 
			@HeaderParam("terminalId") String idTerminal, 
			@HeaderParam("user") String usuario, 
			@HeaderParam("dateRequest") String fechaPeticion,
			@RequestBody UpdateBasicDataRequest request);

	@POST 
	@Path("/CreateContactInformation")
	@Produces(MediaType.APPLICATION_JSON)
	@ClientHeaderParam(name="aplicationCod", value="${com.keralty.integraciones.codaplicacion}")
	@ClientHeaderParam(name="businessFunction", value="${com.keralty.integraciones.funcionnegocio}")
	public String createContactInformation(
			@HeaderParam("Authorization") String token, 
			@HeaderParam("petitionId") String idPeticion, 
			@HeaderParam("terminalId") String idTerminal, 
			@HeaderParam("user") String usuario, 
			@HeaderParam("dateRequest") String fechaPeticion,
			@RequestBody CreateUpdateContactRequest request);

	@POST 
	@Path("/updateContactInformation")
	@Produces(MediaType.APPLICATION_JSON)
	@ClientHeaderParam(name="aplicationCod", value="${com.keralty.integraciones.codaplicacion}")
	@ClientHeaderParam(name="businessFunction", value="${com.keralty.integraciones.funcionnegocio}")
	public String updateContactInformation(
			@HeaderParam("Authorization") String token, 
			@HeaderParam("petitionId") String idPeticion, 
			@HeaderParam("terminalId") String idTerminal, 
			@HeaderParam("user") String usuario, 
			@HeaderParam("dateRequest") String fechaPeticion,
			@RequestBody CreateUpdateContactRequest request);

	@POST 
	@Path("/postQuestionnaireResponse")
	@Produces(MediaType.APPLICATION_JSON)
	@ClientHeaderParam(name="aplicationCod", value="${com.keralty.integraciones.codaplicacion}")
	@ClientHeaderParam(name="businessFunction", value="${com.keralty.integraciones.funcionnegocio}")
	public String postQuestionnaireResponse(
			@HeaderParam("Authorization") String token, 
			@HeaderParam("petitionId") String idPeticion, 
			@HeaderParam("terminalId") String idTerminal, 
			@HeaderParam("APIuser") String usuario, 
			@HeaderParam("dateRequest") String fechaPeticion,
			@RequestBody CreateUpdateRequest request);
}
