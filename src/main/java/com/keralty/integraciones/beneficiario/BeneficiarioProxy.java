package com.keralty.integraciones.beneficiario;

import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.keralty.integraciones.beneficiario.response.ConsultarBeneficiarioResponse;

import jakarta.ws.rs.Encoded;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("")
@RegisterRestClient(configKey="integraciones_beneficiario")
public interface BeneficiarioProxy {
	
	@GET
	@Path("{params}")
	@ClientHeaderParam(name="Accept", value="*/*")
	@ClientHeaderParam(name="codigoSistema", value="01")
	@ClientHeaderParam(name="tipoConsulta", value="1")
	public ConsultarBeneficiarioResponse consultar(
			@HeaderParam("Authorization") String token, 
			@HeaderParam("idPeticion") String idPeticion, 
			@HeaderParam("idUsuario") String usuario, 
			@HeaderParam("fechaPeticion") String fechaPeticion, 
			@PathParam("params") @Encoded String params);
}
