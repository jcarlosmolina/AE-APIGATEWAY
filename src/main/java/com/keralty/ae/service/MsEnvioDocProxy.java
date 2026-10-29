package com.keralty.ae.service;

import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.keralty.ae.viewmodel.InstanceResponseViewModel;
import com.keralty.ae.viewmodel.PopulationResponseViewModel;
import com.keralty.ae.viewmodel.QueryRequest;
import com.keralty.ae.viewmodel.ServiceResponse;
import com.keralty.ae.viewmodel.solicitud.siu.TCAMBIARESTDEVAREAMEDResponse;
import com.keralty.ae.viewmodel.solicitud.siu.TENVIARDOCResponse;
import com.keralty.ae.viewmodel.solicitud.siu.TREASIGNARUSUARIOSResponse;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/api")
@RegisterRestClient(configKey="ae-enviodoc")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4msenviodoc}")
public interface MsEnvioDocProxy {

	/* ************************************* */
	/* Solicitud */
	/* ************************************* */
	
    @POST
    @Path(value = "/SolicitudApi/GetPopulationDynamic")
    PopulationResponseViewModel getSolicitudPopulationDynamic(QueryRequest request);

    @POST
    @Path(value = "/SolicitudApi/GetSolicitudDynamic")
    InstanceResponseViewModel getSolicitudDynamic(QueryRequest request);
    
    @POST
    @Path("/SolicitudApi/TENVIARDOC")
    TENVIARDOCResponse solicitudTENVIARDOC(@RequestBody Object request);

    @POST
    @Path("/SolicitudApi/TCREARSEGUNDAFIRMA")
    ServiceResponse solicitudTCREARSEGUNDAFIRMA(@RequestBody Object request);

    @POST
    @Path("/SolicitudApi/TCREARSEGUNDAFIRMACheckPreconditions")
    ServiceResponse solicitudTCREARSEGUNDAFIRMACheckPreconditions(Object request);

    @POST
    @Path("/SolicitudApi/dummy_Preexistencias")
    ServiceResponse solicituddummyPreexistencias(Object request);

    @POST
    @Path("/SolicitudApi/dummy_PreexistenciasCheckPreconditions")
    ServiceResponse solicituddummyPreexistenciasCheckPreconditions(Object request);

    @POST
    @Path("/SolicitudApi/dummy_DiferenciasLiq")
    ServiceResponse solicituddummyDiferenciasLiq(Object request);

    @POST
    @Path("/SolicitudApi/dummy_DiferenciasLiqCheckPreconditions")
    ServiceResponse solicituddummyDiferenciasLiqCheckPreconditions(Object request);


	/* ************************************* */
    /* Preexistencia */
	/* ************************************* */

    @POST
    @Path(value = "/PreexistenciaApi/GetPopulationDynamic")
    PopulationResponseViewModel preexistenciagetPopulationDynamic(QueryRequest request);

    @POST
    @Path(value = "/PreexistenciaApi/GetSolicitudDynamic")
    InstanceResponseViewModel getPreexistenciaDynamic(QueryRequest request);

    
	/* ************************************* */
    /* Usuario */
	/* ************************************* */

    @POST
    @Path(value = "/UsuarioApi/GetPopulationDynamic")
    PopulationResponseViewModel getUsuarioPopulationDynamic(QueryRequest request);

    @POST
    @Path(value = "/UsuarioApi/GetUsuarioDynamic")
    InstanceResponseViewModel getUsuarioDynamic(QueryRequest request);

}
