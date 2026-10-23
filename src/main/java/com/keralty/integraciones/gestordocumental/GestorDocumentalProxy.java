package com.keralty.integraciones.gestordocumental;

import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.keralty.integraciones.gestordocumental.buscar.response.ResponseBuscarDocumentos;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("")
@RegisterRestClient(configKey="integraciones_gestordocumental")
public interface GestorDocumentalProxy {
	
	@POST 
	@Path("/search")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ResponseBuscarDocumentos search(
			@HeaderParam("Authorization") String token, 
			@RequestBody String request);
}