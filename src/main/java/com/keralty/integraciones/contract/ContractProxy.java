package com.keralty.integraciones.contract;

import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.keralty.integraciones.contract.cover.request.CoverRequestBase;
import com.keralty.integraciones.contract.cover.response.CoverResponse;
import com.keralty.integraciones.contract.getcontractparty.request.GetContractPartyRequest;
import com.keralty.integraciones.contract.getcontractparty.response.GetContractPartyResponse;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("")
@RegisterRestClient(configKey="integraciones_contract")
public interface ContractProxy {
	
	@POST
	@Path("/cover")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@ClientHeaderParam(name="Content-Type", value="application/json")
	@ClientHeaderParam(name="Accept", value="application/json")
	@ClientHeaderParam(name="codAplicacion", value="${com.keralty.integraciones.codaplicacion}")
	@ClientHeaderParam(name="funcionNegocio", value="${com.keralty.integraciones.funcionnegocio}")
	public CoverResponse cover(
			@HeaderParam("Authorization") String token, 
			@HeaderParam("idPeticion") String idPeticion, 
			@HeaderParam("idTerminal") String idTerminal, 
			@HeaderParam("usuario") String usuario, 
			@HeaderParam("fechaPeticion") String fechaPeticion, 
			@HeaderParam("tipoConsulta") String tipoConsulta, 
			@RequestBody CoverRequestBase request);
	
	@POST
	@Path("/getContractParty")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@ClientHeaderParam(name="Content-Type", value="application/json")
	@ClientHeaderParam(name="Accept", value="application/json")
	@ClientHeaderParam(name="queryType", value="2")
	@ClientHeaderParam(name="contractorOwner", value="1")
	@ClientHeaderParam(name="codApplication", value="${com.keralty.integraciones.codaplicacion}")
	@ClientHeaderParam(name="businessFunction", value="${com.keralty.integraciones.funcionnegocio}")
	public GetContractPartyResponse getContractParty(
			@HeaderParam("Authorization") String token, 
			@HeaderParam("idPetition") String idPeticion, 
			@HeaderParam("idTerminal") String idTerminal, 
			@HeaderParam("user") String usuario, 
			@HeaderParam("dateRequest") String fechaPeticion, 
			@RequestBody GetContractPartyRequest request);
	
}
