package com.keralty.integraciones.enviosms;

import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.keralty.integraciones.enviosms.direct.request.EnvioSMSRequest;
import com.keralty.integraciones.enviosms.direct.response.EnvioSMSResponse;

import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("")
@RegisterRestClient(configKey="integraciones_enviosms")
public interface EnvioSMSProxy {
	
	@POST 
	@Path("/envioSMSDirect")
	@Produces(MediaType.APPLICATION_JSON)
	public EnvioSMSResponse  envioSMSDirect(
			@HeaderParam("Authorization") String token, 
			@HeaderParam("ticket") String ticket, 
			@HeaderParam("idUsuario") String idUsuario, 
			@HeaderParam("fechaPeticion") String fechaPeticion,
			@RequestBody EnvioSMSRequest request);

}
