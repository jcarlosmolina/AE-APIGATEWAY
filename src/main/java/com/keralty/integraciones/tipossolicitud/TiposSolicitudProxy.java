package com.keralty.integraciones.tipossolicitud;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.keralty.integraciones.tipossolicitud.response.ResponseTiposSolicitud;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.Path;

@Path("")
@RegisterRestClient(configKey="integraciones_tipossolicitud")
public interface TiposSolicitudProxy {

	@GET
	@Path("/TiposSolicitud")
	ResponseTiposSolicitud TiposSolicitud(@HeaderParam("Authorization") String token);
}
