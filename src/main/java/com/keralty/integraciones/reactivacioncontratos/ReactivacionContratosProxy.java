package com.keralty.integraciones.reactivacioncontratos;

import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.keralty.integraciones.reactivacioncontratos.response.SolicitudReactivacionContrato;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("")
@RegisterRestClient(configKey="integraciones_reactivacioncontratos")
public interface ReactivacionContratosProxy {
	
	@GET 
	@Path("/SolicitudReactivacionContrato")
	@Produces(MediaType.APPLICATION_JSON)
	@ClientHeaderParam(name="codAplicacion", value="${com.keralty.integraciones.codaplicacion}")
	@ClientHeaderParam(name="funcionNegocio", value="${com.keralty.integraciones.funcionnegocio}")
	public SolicitudReactivacionContrato consulta(
			@HeaderParam("Authorization") String token, 
			@HeaderParam("idPeticion") String idPeticion, 
			@HeaderParam("idTerminal") String idTerminal, 
			@HeaderParam("usuario") String usuario, 
			@HeaderParam("fechaPeticion") String fechaPeticion, 
			@QueryParam("codProducto") String codProducto,
			@QueryParam("codPlan") String codPlan,
			@QueryParam("numContrato") String numContrato);

	@POST 
	@Path("/SolicitudReactivacionContrato")
	@Produces(MediaType.APPLICATION_JSON)
	@ClientHeaderParam(name="codAplicacion", value="${com.keralty.integraciones.codaplicacion}")
	@ClientHeaderParam(name="funcionNegocio", value="${com.keralty.integraciones.funcionnegocio}")
	public ResponseReactivacionContrato crear(
			@HeaderParam("Authorization") String token, 
			@HeaderParam("idPeticion") String idPeticion, 
			@HeaderParam("idTerminal") String idTerminal, 
			@HeaderParam("usuario") String usuario, 
			@HeaderParam("fechaPeticion") String fechaPeticion, 
			@RequestBody RequestCrearSolicitudReactivacionContrato request);

	@PUT 
	@Path("/SolicitudReactivacionContrato")
	@Produces(MediaType.APPLICATION_JSON)
	@ClientHeaderParam(name="codAplicacion", value="${com.keralty.integraciones.codaplicacion}")
	@ClientHeaderParam(name="funcionNegocio", value="${com.keralty.integraciones.funcionnegocio}")
	public ResponseReactivacionContrato modificar(
			@HeaderParam("Authorization") String token, 
			@HeaderParam("idPeticion") String idPeticion, 
			@HeaderParam("idTerminal") String idTerminal, 
			@HeaderParam("usuario") String usuario, 
			@HeaderParam("fechaPeticion") String fechaPeticion, 
			@RequestBody RequestCrearSolicitudReactivacionContrato request);

	@PUT 
	@Path("/SolicitudReactivacionContrato")
	@Produces(MediaType.APPLICATION_JSON)
	@ClientHeaderParam(name="codAplicacion", value="${com.keralty.integraciones.codaplicacion}")
	@ClientHeaderParam(name="funcionNegocio", value="${com.keralty.integraciones.funcionnegocio}")
	public ResponseReactivacionContrato eliminar(
			@HeaderParam("Authorization") String token, 
			@HeaderParam("idPeticion") String idPeticion, 
			@HeaderParam("idTerminal") String idTerminal, 
			@HeaderParam("usuario") String usuario, 
			@HeaderParam("fechaPeticion") String fechaPeticion, 
			@RequestBody RequestEliminarSolicitudReactivacionContrato request);
	
}
