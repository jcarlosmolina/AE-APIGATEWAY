package com.keralty.ae.api.solicitudnovedad;

import com.keralty.ae.persistence.oid.SolicitudNovedadOid;
import com.keralty.ae.persistence.SolicitudNovedad;
import com.keralty.ae.service.SolicitudNovedadService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.InstanceResponseViewModel;
import com.keralty.ae.viewmodel.PopulationResponseViewModel;
import com.keralty.ae.viewmodel.PreloadResponseViewModel;
import com.keralty.ae.viewmodel.PreloadViewModel;
import com.keralty.ae.viewmodel.QueryRequest;
import com.keralty.ae.viewmodel.ServiceResponse;
import com.keralty.ae.viewmodel.solicitudnovedad.siu.AnotarObservacionesRequest;
import com.keralty.ae.viewmodel.solicitudnovedad.siu.DummyEstatusSolicitudesRequest;
import com.keralty.ae.viewmodel.solicitudnovedad.siu.DummyNavegarAConsultarRequest;
import com.keralty.ae.viewmodel.solicitudnovedad.siu.DummyNavegarAModificarRequest;
import com.keralty.ae.viewmodel.solicitudnovedad.siu.DummyVerPDFRequest;
import com.keralty.ae.viewmodel.solicitudnovedad.siu.GetRutaPlantillaRequest;
import com.keralty.ae.viewmodel.solicitudnovedad.siu.GetRutaPlantillaResponse;
import com.keralty.ae.viewmodel.solicitudnovedad.siu.ModificarNuevoNombreRequest;
import com.keralty.ae.viewmodel.solicitudnovedad.siu.ModificarNumMesesRequest;
import com.keralty.ae.viewmodel.solicitudnovedad.siu.RegistrarObservacionesRequest;
import com.keralty.ae.viewmodel.solicitudnovedad.siu.TADDFAMILIARequest;
import com.keralty.ae.viewmodel.solicitudnovedad.siu.TCAMBIARESTADODOCRequest;
import com.keralty.ae.viewmodel.solicitudnovedad.siu.TCHGNUEVAPERIODICIDADRequest;
import com.keralty.ae.viewmodel.solicitudnovedad.siu.TCREAREXCEPCIONRequest;
import com.keralty.ae.viewmodel.solicitudnovedad.siu.TCREAREXCEPCIONResponse;
import com.keralty.ae.viewmodel.solicitudnovedad.siu.TCREARRequest;
import com.keralty.ae.viewmodel.solicitudnovedad.siu.TCREARResponse;
import com.keralty.ae.viewmodel.solicitudnovedad.siu.TFIRMARRequest;
import com.keralty.ae.viewmodel.solicitudnovedad.siu.TMARCARANULADARequest;
import com.keralty.ae.viewmodel.solicitudnovedad.siu.TMARCARCOMPLETADARequest;
import com.keralty.ae.viewmodel.solicitudnovedad.siu.TMARCARCOMPLETADAResponse;
import com.keralty.ae.viewmodel.solicitudnovedad.siu.TMARCARTRAMITADARequest;
import com.keralty.ae.viewmodel.solicitudnovedad.siu.TMARCARTRAMITADAResponse;
import com.keralty.ae.viewmodel.solicitudnovedad.siu.TREASIGNARUSUARIOSRequest;
import jakarta.annotation.security.RolesAllowed;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.POST;
import java.util.List;
import org.eclipse.microprofile.jwt.JsonWebToken;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/api/SolicitudNovedadApi")
@RequestScoped
public class SolicitudNovedadApi {

    @RestClient
    SolicitudNovedadService service;

    JsonWebToken jwt; 

    public SolicitudNovedadApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{solicitudNovedadId}")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public SolicitudNovedad getInstance(Long solicitudNovedadId) {
    	return service.getById(solicitudNovedadId);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public List<SolicitudNovedad> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public SolicitudNovedad getByOid(SolicitudNovedadOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public SolicitudNovedad getByOIDWithHV(SolicitudNovedadOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetSolicitudNovedadDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public InstanceResponseViewModel getSolicitudNovedadDynamic(QueryRequest request) {
        return service.getSolicitudNovedadDynamic(request);
    }

    @POST
    @Path(value = "/GetWithDisplaySetDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PreloadResponseViewModel getSolicitudNovedadWithDisplaySetDynamic(QueryRequest request) {
        return (PreloadResponseViewModel) service.getWithDisplaySetDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PopulationResponseViewModel getSolicitudNovedadPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/modificarNumMeses")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudNovedadModificarNumMeses(ModificarNumMesesRequest request) {
        return service.modificarNumMeses(request);
    }
    

    @POST
    @Path(value = "/modificarNumMesesCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudNovedadModificarNumMesesCheckPreconditions(ModificarNumMesesRequest request) {

        return service.modificarNumMesesCheckPreconditions(request);
    }

    @POST
    @Path(value = "/modificarNuevoNombre")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudNovedadModificarNuevoNombre(ModificarNuevoNombreRequest request) {
        return service.modificarNuevoNombre(request);
    }
    

    @POST
    @Path(value = "/modificarNuevoNombreCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudNovedadModificarNuevoNombreCheckPreconditions(ModificarNuevoNombreRequest request) {

        return service.modificarNuevoNombreCheckPreconditions(request);
    }

    @POST
    @Path(value = "/registrarObservaciones")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudNovedadRegistrarObservaciones(RegistrarObservacionesRequest request) {
        return service.registrarObservaciones(request);
    }
    

    @POST
    @Path(value = "/registrarObservacionesCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudNovedadRegistrarObservacionesCheckPreconditions(RegistrarObservacionesRequest request) {

        return service.registrarObservacionesCheckPreconditions(request);
    }

    @POST
    @Path(value = "/dummyNavegarAModificar")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","MesaDeApoyo"})
    public ServiceResponse solicitudNovedadDummyNavegarAModificar(DummyNavegarAModificarRequest request) {
        return service.dummyNavegarAModificar(request);
    }
    

    @POST
    @Path(value = "/dummyVerPDF")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","Gestor","MesaDeApoyo"})
    public ServiceResponse solicitudNovedadDummyVerPDF(DummyVerPDFRequest request) {
        return service.dummyVerPDF(request);
    }
    

    @POST
    @Path(value = "/anotarObservaciones")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudNovedadAnotarObservaciones(AnotarObservacionesRequest request) {
        return service.anotarObservaciones(request);
    }
    

    @POST
    @Path(value = "/anotarObservacionesCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudNovedadAnotarObservacionesCheckPreconditions(AnotarObservacionesRequest request) {

        return service.anotarObservacionesCheckPreconditions(request);
    }

    @POST
    @Path(value = "/dummy_EstatusSolicitudes")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","MesaDeApoyo"})
    public ServiceResponse solicitudNovedadDummyEstatusSolicitudes(DummyEstatusSolicitudesRequest request) {
        return service.dummyEstatusSolicitudes(request);
    }
    

    @POST
    @Path(value = "/dummyNavegarAConsultar")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","Gestor","MesaDeApoyo"})
    public ServiceResponse solicitudNovedadDummyNavegarAConsultar(DummyNavegarAConsultarRequest request) {
        return service.dummyNavegarAConsultar(request);
    }
    

    @POST
    @Path(value = "/getRutaPlantilla")
    public GetRutaPlantillaResponse solicitudNovedadGetRutaPlantilla(GetRutaPlantillaRequest request) {
        return service.getRutaPlantilla(request);
    }
    

    @POST
    @Path(value = "/getRutaPlantillaCheckPreconditions")
    public GetRutaPlantillaResponse solicitudNovedadGetRutaPlantillaCheckPreconditions(GetRutaPlantillaRequest request) {

        return service.getRutaPlantillaCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TCREAR")
    @RolesAllowed({"Admin","SuperAdmin","Asesor"})
    public TCREARResponse solicitudNovedadTCREAR(TCREARRequest request) {
        return service.tCREAR(request);
    }
    

    @POST
    @Path(value = "/TADDFAMILIA")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudNovedadTADDFAMILIA(TADDFAMILIARequest request) {
        return service.tADDFAMILIA(request);
    }
    

    @POST
    @Path(value = "/TADDFAMILIACheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudNovedadTADDFAMILIACheckPreconditions(TADDFAMILIARequest request) {

        return service.tADDFAMILIACheckPreconditions(request);
    }

    @POST
    @Path(value = "/TMARCARCOMPLETADA")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public TMARCARCOMPLETADAResponse solicitudNovedadTMARCARCOMPLETADA(TMARCARCOMPLETADARequest request) {
        return service.tMARCARCOMPLETADA(request);
    }
    

    @POST
    @Path(value = "/TMARCARCOMPLETADACheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public TMARCARCOMPLETADAResponse solicitudNovedadTMARCARCOMPLETADACheckPreconditions(TMARCARCOMPLETADARequest request) {

        return service.tMARCARCOMPLETADACheckPreconditions(request);
    }

    @POST
    @Path(value = "/TCHGNUEVAPERIODICIDAD")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudNovedadTCHGNUEVAPERIODICIDAD(TCHGNUEVAPERIODICIDADRequest request) {
        return service.tCHGNUEVAPERIODICIDAD(request);
    }
    

    @POST
    @Path(value = "/TCHGNUEVAPERIODICIDADCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudNovedadTCHGNUEVAPERIODICIDADCheckPreconditions(TCHGNUEVAPERIODICIDADRequest request) {

        return service.tCHGNUEVAPERIODICIDADCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TMARCARTRAMITADA")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","MesaDeApoyo"})
    public TMARCARTRAMITADAResponse solicitudNovedadTMARCARTRAMITADA(TMARCARTRAMITADARequest request) {
        return service.tMARCARTRAMITADA(request);
    }
    

    @POST
    @Path(value = "/TMARCARTRAMITADACheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","MesaDeApoyo"})
    public TMARCARTRAMITADAResponse solicitudNovedadTMARCARTRAMITADACheckPreconditions(TMARCARTRAMITADARequest request) {

        return service.tMARCARTRAMITADACheckPreconditions(request);
    }

    @POST
    @Path(value = "/TMARCARANULADA")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","MesaDeApoyo"})
    public ServiceResponse solicitudNovedadTMARCARANULADA(TMARCARANULADARequest request) {
        return service.tMARCARANULADA(request);
    }
    

    @POST
    @Path(value = "/TMARCARANULADACheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","MesaDeApoyo"})
    public ServiceResponse solicitudNovedadTMARCARANULADACheckPreconditions(TMARCARANULADARequest request) {

        return service.tMARCARANULADACheckPreconditions(request);
    }

    @POST
    @Path(value = "/TCREAREXCEPCION")
    @RolesAllowed({"Admin","SuperAdmin"})
    public TCREAREXCEPCIONResponse solicitudNovedadTCREAREXCEPCION(TCREAREXCEPCIONRequest request) {
        return service.tCREAREXCEPCION(request);
    }
    

    @POST
    @Path(value = "/TCAMBIARESTADODOC")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudNovedadTCAMBIARESTADODOC(TCAMBIARESTADODOCRequest request) {
        return service.tCAMBIARESTADODOC(request);
    }
    

    @POST
    @Path(value = "/TREASIGNARUSUARIOS")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse solicitudNovedadTREASIGNARUSUARIOS(TREASIGNARUSUARIOSRequest request) {
        return service.tREASIGNARUSUARIOS(request);
    }
    

    @POST
    @Path(value = "/TFIRMAR")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudNovedadTFIRMAR(TFIRMARRequest request) {
        return service.tFIRMAR(request);
    }
    
}
