package com.keralty.ae.service;

import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.keralty.ae.viewmodel.InstanceResponseViewModel;
import com.keralty.ae.viewmodel.PopulationResponseViewModel;
import com.keralty.ae.viewmodel.QueryRequest;
import com.keralty.ae.viewmodel.ServiceResponse;
import com.keralty.ae.viewmodel.solicitud.siu.TCAMBIARESTDEVAREAMEDResponse;
import com.keralty.ae.viewmodel.solicitud.siu.TREASIGNARUSUARIOSResponse;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/api")
@RegisterRestClient(configKey="ae-estatus")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4msestatus}")
public interface MsEstatusProxy {

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
    @Path("/SolicitudApi/TCAMBIARESTADOADMIN")
    ServiceResponse solicitudTCAMBIARESTADOADMIN(@RequestBody Object request);

    
    @POST
    @Path("/SolicitudApi/TCAMBIARESTADOERROR")
    ServiceResponse solicitudTCAMBIARESTADOERROR(@RequestBody Object request);

    @POST
    @Path("/SolicitudApi/TCAMBIARESTADOERRORCheckPreconditions")
    ServiceResponse solicitudTCAMBIARESTADOERRORCheckPreconditions(Object request);

    @POST
    @Path("/SolicitudApi/TREASIGNARUSUARIOS")
    TREASIGNARUSUARIOSResponse solicitudTREASIGNARUSUARIOS(@RequestBody Object request);

    @POST
    @Path("/SolicitudApi/TCAMBIARESTDEVAREAMED")
    TCAMBIARESTDEVAREAMEDResponse solicitudTCAMBIARESTDEVAREAMED(@RequestBody Object request);

    @POST
    @Path("/SolicitudApi/TCAMBIARESTDEVAREAMEDCheckPreconditions")
    TCAMBIARESTDEVAREAMEDResponse solicitudTCAMBIARESTDEVAREAMEDCheckPreconditions(Object request);

    @POST
    @Path("/SolicitudApi/TCAMBIARESTPENDMEDICO")
    ServiceResponse solicitudTCAMBIARESTPENDMEDICO(@RequestBody Object request);

    @POST
    @Path("/SolicitudApi/TCAMBIARESTPENDMEDICOCheckPreconditions")
    ServiceResponse solicitudTCAMBIARESTPENDMEDICOCheckPreconditions(Object request);

    @POST
    @Path("/SolicitudApi/TCAMBIARESTAPROBMEDICO")
    ServiceResponse solicitudTCAMBIARESTAPROBMEDICO(@RequestBody Object request);

    @POST
    @Path("/SolicitudApi/TCAMBIARESTAPROBMEDICOCheckPreconditions")
    ServiceResponse solicitudTCAMBIARESTAPROBMEDICOCheckPreconditions(Object request);
    
    @POST
    @Path("/SolicitudApi/TCAMBIARESTANULADO")
    ServiceResponse solicitudTCAMBIARESTANULADO(@RequestBody Object request);

    @POST
    @Path("/SolicitudApi/TCAMBIARESTANULADOCheckPreconditions")
    ServiceResponse solicitudTCAMBIARESTANULADOCheckPreconditions(Object request);
    
    @POST
    @Path("/SolicitudApi/TCAMBIARESTADO")
    ServiceResponse solicitudTCAMBIARESTADO(@RequestBody Object request);
    
    
	/* ************************************* */
    /* Usuario */
	/* ************************************* */

    @POST
    @Path(value = "/UsuarioApi/GetPopulationDynamic")
    PopulationResponseViewModel getUsuarioPopulationDynamic(QueryRequest request);

    @POST
    @Path(value = "/UsuarioApi/GetUsuarioDynamic")
    InstanceResponseViewModel getUsuarioDynamic(QueryRequest request);

	/* ************************************* */
    /* LogEstado */
	/* ************************************* */
    @POST
    @Path(value = "/LogEstadoApi/GetPopulationDynamic")
    PopulationResponseViewModel getLogEstadoPopulationDynamic(QueryRequest request);

	/* ************************************* */
    /* LogAsignaciones */
	/* ************************************* */
    @POST
    @Path(value = "/LogAsignacionesApi/GetPopulationDynamic")
    PopulationResponseViewModel getLogAsignacionesPopulationDynamic(QueryRequest request);
    

	/* ************************************* */
    /* ErrorWS */
	/* ************************************* */
    @POST
    @Path(value = "/ErrorWSApi/GetPopulationDynamic")
    PopulationResponseViewModel getErrorWSPopulationDynamic(QueryRequest request);
}
