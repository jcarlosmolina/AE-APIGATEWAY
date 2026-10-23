package com.keralty.integraciones.coverage;

import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.keralty.integraciones.coverage.coverageheader.request.CoverageHeaderRequest;
import com.keralty.integraciones.coverage.coverageheader.response.CoverageHeaderResponse;

import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("")
@RegisterRestClient(configKey="integraciones_coverage")
public interface CoverageProxy {
	
	@POST
	@Path("/coverageHeader")
	@ClientHeaderParam(name="Content-Type", value="application/json")
	@ClientHeaderParam(name="Accept", value="application/json")
	@ClientHeaderParam(name="codAplicacion", value="${com.keralty.integraciones.codaplicacion}")
	@ClientHeaderParam(name="funcionNegocio", value="${com.keralty.integraciones.funcionnegocio}")
	public CoverageHeaderResponse coverageHeader(
			@HeaderParam("Authorization") String token, 
			@HeaderParam("idPeticion") String idPeticion, 
			@HeaderParam("idTerminal") String idTerminal, 
			@HeaderParam("usuario") String usuario, 
			@HeaderParam("fechaPeticion") String fechaPeticion, 
			@HeaderParam("tipoConsulta") String tipoConsulta, 
			@RequestBody CoverageHeaderRequest request);
}
