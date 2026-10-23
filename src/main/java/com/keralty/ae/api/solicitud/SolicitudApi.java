package com.keralty.ae.api.solicitud;

import com.keralty.ae.persistence.oid.SolicitudOid;
import com.keralty.ae.persistence.Solicitud;
import com.keralty.ae.service.SolicitudService;
import com.keralty.ae.service.MsEnvioDocProxy;
import com.keralty.ae.service.MsEstatusProxy;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.InstanceResponseViewModel;
import com.keralty.ae.viewmodel.PopulationResponseViewModel;
import com.keralty.ae.viewmodel.PreloadResponseViewModel;
import com.keralty.ae.viewmodel.PreloadViewModel;
import com.keralty.ae.viewmodel.QueryRequest;
import com.keralty.ae.viewmodel.ServiceResponse;
import com.keralty.ae.viewmodel.solicitud.siu.AnotarObservacionesRequest;
import com.keralty.ae.viewmodel.solicitud.siu.AsignarNumContratoRequest;
import com.keralty.ae.viewmodel.solicitud.siu.CalcularURLPasarelaPagosRequest;
import com.keralty.ae.viewmodel.solicitud.siu.CalcularURLPasarelaPagosResponse;
import com.keralty.ae.viewmodel.solicitud.siu.DelContratoCASolicitudRequest;
import com.keralty.ae.viewmodel.solicitud.siu.DummyDevolverErroresWSRequest;
import com.keralty.ae.viewmodel.solicitud.siu.DummyDevolverErroresWSResponse;
import com.keralty.ae.viewmodel.solicitud.siu.DummyDiferenciasLiqRequest;
import com.keralty.ae.viewmodel.solicitud.siu.DummyEstatusSolicitudesRequest;
import com.keralty.ae.viewmodel.solicitud.siu.DummyGenerarSolicitudRequest;
import com.keralty.ae.viewmodel.solicitud.siu.DummyPreexistenciasRequest;
import com.keralty.ae.viewmodel.solicitud.siu.DummyRedirigirRequest;
import com.keralty.ae.viewmodel.solicitud.siu.EnviarEmailURLPagoRequest;
import com.keralty.ae.viewmodel.solicitud.siu.EnviarSMSInfoPagoRequest;
import com.keralty.ae.viewmodel.solicitud.siu.InsContratoCASolicitudRequest;
import com.keralty.ae.viewmodel.solicitud.siu.InsFormaPagoSolicitudRequest;
import com.keralty.ae.viewmodel.solicitud.siu.InsPeriodicidadSolicitudRequest;
import com.keralty.ae.viewmodel.solicitud.siu.MarcarDatosPagoOKRequest;
import com.keralty.ae.viewmodel.solicitud.siu.MarcarNoCompletadaRequest;
import com.keralty.ae.viewmodel.solicitud.siu.ModFechaInicioContratacionRequest;
import com.keralty.ae.viewmodel.solicitud.siu.ModMarcaCarnetRequest;
import com.keralty.ae.viewmodel.solicitud.siu.SetCodTarifaRequest;
import com.keralty.ae.viewmodel.solicitud.siu.TANULARAUTORequest;
import com.keralty.ae.viewmodel.solicitud.siu.TCAMBIARESTADOADMINRequest;
import com.keralty.ae.viewmodel.solicitud.siu.TCAMBIARESTADODOCRequest;
import com.keralty.ae.viewmodel.solicitud.siu.TCAMBIARESTADOERRORRequest;
import com.keralty.ae.viewmodel.solicitud.siu.TCAMBIARESTADORequest;
import com.keralty.ae.viewmodel.solicitud.siu.TCAMBIARESTANULADORequest;
import com.keralty.ae.viewmodel.solicitud.siu.TCAMBIARESTAPROBMEDICORequest;
import com.keralty.ae.viewmodel.solicitud.siu.TCAMBIARESTDEVAREAMEDRequest;
import com.keralty.ae.viewmodel.solicitud.siu.TCAMBIARESTDEVAREAMEDResponse;
import com.keralty.ae.viewmodel.solicitud.siu.TCAMBIARESTPENDMEDICORequest;
import com.keralty.ae.viewmodel.solicitud.siu.TCHGTITBENEFCONTRequest;
import com.keralty.ae.viewmodel.solicitud.siu.TCREAROMODFIRMACONTINCRequest;
import com.keralty.ae.viewmodel.solicitud.siu.TCREAROMODFIRMARequest;
import com.keralty.ae.viewmodel.solicitud.siu.TCREARSEGUNDAFIRMARequest;
import com.keralty.ae.viewmodel.solicitud.siu.TENVIARDOCAUTOAUXRequest;
import com.keralty.ae.viewmodel.solicitud.siu.TENVIARDOCRequest;
import com.keralty.ae.viewmodel.solicitud.siu.TENVIARDOCResponse;
import com.keralty.ae.viewmodel.solicitud.siu.TGETPLANTILLAREPORTERequest;
import com.keralty.ae.viewmodel.solicitud.siu.TGETPLANTILLAREPORTEResponse;
import com.keralty.ae.viewmodel.solicitud.siu.TINDICARCONTRATANTE2Request;
import com.keralty.ae.viewmodel.solicitud.siu.TINDICARTITULAR2Request;
import com.keralty.ae.viewmodel.solicitud.siu.TMARCARCOMPLETADARequest;
import com.keralty.ae.viewmodel.solicitud.siu.TMARCARCOMPLETADAResponse;
import com.keralty.ae.viewmodel.solicitud.siu.TMODDIRECCIONRequest;
import com.keralty.ae.viewmodel.solicitud.siu.TMODDIRSCONTRATANTERequest;
import com.keralty.ae.viewmodel.solicitud.siu.TMODDIRSTITULARRequest;
import com.keralty.ae.viewmodel.solicitud.siu.TMODENCABEZADOINCLRequest;
import com.keralty.ae.viewmodel.solicitud.siu.TMODENCABEZADORequest;
import com.keralty.ae.viewmodel.solicitud.siu.TMODIFICARINFOPAGORequest;
import com.keralty.ae.viewmodel.solicitud.siu.TNOTIFICARANULACIONRequest;
import com.keralty.ae.viewmodel.solicitud.siu.TNOTIFICARCREARRequest;
import com.keralty.ae.viewmodel.solicitud.siu.TNOTIFICARINCLUSIONRequest;
import com.keralty.ae.viewmodel.solicitud.siu.TPOSTGENERAREXITORequest;
import com.keralty.ae.viewmodel.solicitud.siu.TREASIGNARUSUARIOSRequest;
import com.keralty.ae.viewmodel.solicitud.siu.TREASIGNARUSUARIOSResponse;
import com.keralty.ae.viewmodel.solicitud.siu.TSUBIRDOCUMENTOATORequest;
import com.keralty.ae.viewmodel.solicitud.siu.ValidarAtributosUsuarioRequest;
import com.keralty.ae.viewmodel.solicitud.siu.ValidarAtributosUsuarioResponse;
import jakarta.annotation.security.RolesAllowed;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.POST;
import java.util.List;
import org.eclipse.microprofile.jwt.JsonWebToken;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/api/SolicitudApi")
@RequestScoped
public class SolicitudApi {

    @RestClient
    SolicitudService service;

    @RestClient
    MsEstatusProxy serviceMsEstatus;

    @RestClient
    MsEnvioDocProxy serviceMsEnvioDoc;

    JsonWebToken jwt; 

    public SolicitudApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{aesolicitudesidsolicitud}")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo","UsuarioSistemaExterno"})
    public Solicitud getInstance(Long aesolicitudesidsolicitud) {
    	return service.getById(aesolicitudesidsolicitud);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo","UsuarioSistemaExterno"})
    public List<Solicitud> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo","UsuarioSistemaExterno"})
    public Solicitud getByOid(SolicitudOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo","UsuarioSistemaExterno"})
    public Solicitud getByOIDWithHV(SolicitudOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetSolicitudDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo","UsuarioSistemaExterno"})
    public InstanceResponseViewModel getSolicitudDynamic(QueryRequest request) {
    	if ("msestatus".equalsIgnoreCase(request.getPiuName()) ) {
    		return serviceMsEstatus.getSolicitudDynamic(request);
    	}    	
    	if ("msenviodoc".equalsIgnoreCase(request.getPiuName()) ) {
    		return serviceMsEnvioDoc.getSolicitudDynamic(request);
    	}
    	return service.getSolicitudDynamic(request);
    }

    @POST
    @Path(value = "/GetWithDisplaySetDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo","UsuarioSistemaExterno"})
    public PreloadResponseViewModel getSolicitudWithDisplaySetDynamic(QueryRequest request) {
        return (PreloadResponseViewModel) service.getWithDisplaySetDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo","UsuarioSistemaExterno"})
    public PopulationResponseViewModel getSolicitudPopulationDynamic(QueryRequest request) {
    	
    	if ("msestatus".equalsIgnoreCase(request.getPiuName()) ||
    		"piu_estatussolicitudesadmin".equalsIgnoreCase(request.getPiuName()) ||
    		"piu_estatussolicitudes_afil".equalsIgnoreCase(request.getPiuName()) ||
    		"piu_estatussolicitudes_areamed".equalsIgnoreCase(request.getPiuName()) ||
    		"piu_estatussolicitudes_asesor".equalsIgnoreCase(request.getPiuName()) ||
    		"piu_estatussol_gestormesa".equalsIgnoreCase(request.getPiuName()) ||
    		"iiu_solicitudestatus_vermas".equalsIgnoreCase(request.getPiuName()) ) {
    		return serviceMsEstatus.getSolicitudPopulationDynamic(request);
    	}

    	if ("msenviodoc".equalsIgnoreCase(request.getPiuName()) ||
    			"iiu_diferenciasliquidacion".equalsIgnoreCase(request.getPiuName()) ||
        		"PIU_EnvioDoc".equalsIgnoreCase(request.getPiuName())) {
        		return serviceMsEnvioDoc.getSolicitudPopulationDynamic(request);
        	}
    	
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/InsFormaPagoSolicitud")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public ServiceResponse solicitudInsFormaPagoSolicitud(InsFormaPagoSolicitudRequest request) {
        return service.insFormaPagoSolicitud(request);
    }
    

    @POST
    @Path(value = "/InsPeriodicidadSolicitud")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public ServiceResponse solicitudInsPeriodicidadSolicitud(InsPeriodicidadSolicitudRequest request) {
        return service.insPeriodicidadSolicitud(request);
    }
    

    @POST
    @Path(value = "/marcarDatosPagoOK")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public ServiceResponse solicitudMarcarDatosPagoOK(MarcarDatosPagoOKRequest request) {
        return service.marcarDatosPagoOK(request);
    }
    

    @POST
    @Path(value = "/anotarObservaciones")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudAnotarObservaciones(AnotarObservacionesRequest request) {
        return service.anotarObservaciones(request);
    }
    

    @POST
    @Path(value = "/anotarObservacionesCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudAnotarObservacionesCheckPreconditions(AnotarObservacionesRequest request) {

        return service.anotarObservacionesCheckPreconditions(request);
    }

    @POST
    @Path(value = "/dummy_Preexistencias")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public ServiceResponse solicitudDummyPreexistencias(DummyPreexistenciasRequest request) {
        return serviceMsEnvioDoc.solicituddummyPreexistencias(request);
    }
    

    @POST
    @Path(value = "/dummyPreexistenciasCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public ServiceResponse solicitudDummyPreexistenciasCheckPreconditions(DummyPreexistenciasRequest request) {

        return serviceMsEnvioDoc.solicituddummyPreexistenciasCheckPreconditions(request);
    }

    @POST
    @Path(value = "/dummy_DiferenciasLiq")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public ServiceResponse solicitudDummyDiferenciasLiq(DummyDiferenciasLiqRequest request) {
        return serviceMsEnvioDoc.solicituddummyDiferenciasLiq(request);
    }
    

    @POST
    @Path(value = "/dummyDiferenciasLiqCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public ServiceResponse solicitudDummyDiferenciasLiqCheckPreconditions(DummyDiferenciasLiqRequest request) {

        return serviceMsEnvioDoc.solicituddummyDiferenciasLiqCheckPreconditions(request);
    }

    @POST
    @Path(value = "/dummy_Redirigir")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","MesaDeApoyo"})
    public ServiceResponse solicitudDummyRedirigir(DummyRedirigirRequest request) {
        return service.dummyRedirigir(request);
    }
    

    @POST
    @Path(value = "/validarAtributosUsuario")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ValidarAtributosUsuarioResponse solicitudValidarAtributosUsuario(ValidarAtributosUsuarioRequest request) {
        return service.validarAtributosUsuario(request);
    }
    

    @POST
    @Path(value = "/validarAtributosUsuarioCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ValidarAtributosUsuarioResponse solicitudValidarAtributosUsuarioCheckPreconditions(ValidarAtributosUsuarioRequest request) {

        return service.validarAtributosUsuarioCheckPreconditions(request);
    }

    @POST
    @Path(value = "/calcularURLPasarelaPagos")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public CalcularURLPasarelaPagosResponse solicitudCalcularURLPasarelaPagos(CalcularURLPasarelaPagosRequest request) {
        return service.calcularURLPasarelaPagos(request);
    }
    

    @POST
    @Path(value = "/enviarEmailURLPago")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public ServiceResponse solicitudEnviarEmailURLPago(EnviarEmailURLPagoRequest request) {
        return service.enviarEmailURLPago(request);
    }
    

    @POST
    @Path(value = "/InsContratoCASolicitud")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudInsContratoCASolicitud(InsContratoCASolicitudRequest request) {
        return service.insContratoCASolicitud(request);
    }
    

    @POST
    @Path(value = "/DelContratoCASolicitud")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudDelContratoCASolicitud(DelContratoCASolicitudRequest request) {
        return service.delContratoCASolicitud(request);
    }
    

    @POST
    @Path(value = "/setCodTarifa")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public ServiceResponse solicitudSetCodTarifa(SetCodTarifaRequest request) {
        return service.setCodTarifa(request);
    }
    

    @POST
    @Path(value = "/dummyDevolverErroresWS")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public DummyDevolverErroresWSResponse solicitudDummyDevolverErroresWS(DummyDevolverErroresWSRequest request) {
        return service.dummyDevolverErroresWS(request);
    }
    

    @POST
    @Path(value = "/marcarNoCompletada")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public ServiceResponse solicitudMarcarNoCompletada(MarcarNoCompletadaRequest request) {
        return service.marcarNoCompletada(request);
    }
    

    @POST
    @Path(value = "/modFechaInicioContratacion")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudModFechaInicioContratacion(ModFechaInicioContratacionRequest request) {
        return service.modFechaInicioContratacion(request);
    }
    

    @POST
    @Path(value = "/asignarNumContrato")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public ServiceResponse solicitudAsignarNumContrato(AsignarNumContratoRequest request) {
        return service.asignarNumContrato(request);
    }
    

    @POST
    @Path(value = "/dummy_GenerarSolicitud")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","MesaDeApoyo"})
    public ServiceResponse solicitudDummyGenerarSolicitud(DummyGenerarSolicitudRequest request) {
        return service.dummyGenerarSolicitud(request);
    }
    

    @POST
    @Path(value = "/enviarSMSInfoPago")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudEnviarSMSInfoPago(EnviarSMSInfoPagoRequest request) {
        return service.enviarSMSInfoPago(request);
    }
    

    @POST
    @Path(value = "/dummy_EstatusSolicitudes")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","MesaDeApoyo"})
    public ServiceResponse solicitudDummyEstatusSolicitudes(DummyEstatusSolicitudesRequest request) {
        return service.dummyEstatusSolicitudes(request);
    }
    

    @POST
    @Path(value = "/modMarcaCarnet")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudModMarcaCarnet(ModMarcaCarnetRequest request) {
        return service.modMarcaCarnet(request);
    }
    

    @POST
    @Path(value = "/modMarcaCarnetCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudModMarcaCarnetCheckPreconditions(ModMarcaCarnetRequest request) {

        return service.modMarcaCarnetCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TMODDIRECCION")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudTMODDIRECCION(TMODDIRECCIONRequest request) {
        return service.tMODDIRECCION(request);
    }
    

    @POST
    @Path(value = "/TMODDIRECCIONCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudTMODDIRECCIONCheckPreconditions(TMODDIRECCIONRequest request) {

        return service.tMODDIRECCIONCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TMODIFICARINFOPAGO")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudTMODIFICARINFOPAGO(TMODIFICARINFOPAGORequest request) {
        return service.tMODIFICARINFOPAGO(request);
    }
    

    @POST
    @Path(value = "/TMODIFICARINFOPAGOCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudTMODIFICARINFOPAGOCheckPreconditions(TMODIFICARINFOPAGORequest request) {

        return service.tMODIFICARINFOPAGOCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TCREAROMODFIRMA")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudTCREAROMODFIRMA(TCREAROMODFIRMARequest request) {
        return service.tCREAROMODFIRMA(request);
    }
    

    @POST
    @Path(value = "/TCREARSEGUNDAFIRMA")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudTCREARSEGUNDAFIRMA(TCREARSEGUNDAFIRMARequest request) {
        return service.tCREARSEGUNDAFIRMA(request);
    }
    

    @POST
    @Path(value = "/TCREARSEGUNDAFIRMACheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudTCREARSEGUNDAFIRMACheckPreconditions(TCREARSEGUNDAFIRMARequest request) {

        return service.tCREARSEGUNDAFIRMACheckPreconditions(request);
    }

    @POST
    @Path(value = "/TENVIARDOC")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public TENVIARDOCResponse solicitudTENVIARDOC(TENVIARDOCRequest request) {
        return serviceMsEnvioDoc.solicitudTENVIARDOC(request);
    }
    

    @POST
    @Path(value = "/TNOTIFICARANULACION")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public ServiceResponse solicitudTNOTIFICARANULACION(TNOTIFICARANULACIONRequest request) {
        return service.tNOTIFICARANULACION(request);
    }
    

    @POST
    @Path(value = "/TNOTIFICARCREAR")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public ServiceResponse solicitudTNOTIFICARCREAR(TNOTIFICARCREARRequest request) {
        return service.tNOTIFICARCREAR(request);
    }
    

    @POST
    @Path(value = "/TNOTIFICARINCLUSION")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public ServiceResponse solicitudTNOTIFICARINCLUSION(TNOTIFICARINCLUSIONRequest request) {
        return service.tNOTIFICARINCLUSION(request);
    }
    

    @POST
    @Path(value = "/TINDICARCONTRATANTE2")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudTINDICARCONTRATANTE2(TINDICARCONTRATANTE2Request request) {
        return service.tINDICARCONTRATANTE2(request);
    }
    

    @POST
    @Path(value = "/TINDICARCONTRATANTE2CheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudTINDICARCONTRATANTE2CheckPreconditions(TINDICARCONTRATANTE2Request request) {

        return service.tINDICARCONTRATANTE2CheckPreconditions(request);
    }

    @POST
    @Path(value = "/TINDICARTITULAR2")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudTINDICARTITULAR2(TINDICARTITULAR2Request request) {
        return service.tINDICARTITULAR2(request);
    }
    

    @POST
    @Path(value = "/TINDICARTITULAR2CheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudTINDICARTITULAR2CheckPreconditions(TINDICARTITULAR2Request request) {

        return service.tINDICARTITULAR2CheckPreconditions(request);
    }

    @POST
    @Path(value = "/TCHGTITBENEFCONT")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudTCHGTITBENEFCONT(TCHGTITBENEFCONTRequest request) {
        return service.tCHGTITBENEFCONT(request);
    }
    

    @POST
    @Path(value = "/TCHGTITBENEFCONTCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudTCHGTITBENEFCONTCheckPreconditions(TCHGTITBENEFCONTRequest request) {

        return service.tCHGTITBENEFCONTCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TMARCARCOMPLETADA")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public TMARCARCOMPLETADAResponse solicitudTMARCARCOMPLETADA(TMARCARCOMPLETADARequest request) {
        return service.tMARCARCOMPLETADA(request);
    }
    

    @POST
    @Path(value = "/TMARCARCOMPLETADACheckPreconditions")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public TMARCARCOMPLETADAResponse solicitudTMARCARCOMPLETADACheckPreconditions(TMARCARCOMPLETADARequest request) {

        return service.tMARCARCOMPLETADACheckPreconditions(request);
    }

    @POST
    @Path(value = "/TCAMBIARESTADO")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public ServiceResponse solicitudTCAMBIARESTADO(TCAMBIARESTADORequest request) {
        return service.tCAMBIARESTADO(request);
    }
    

    @POST
    @Path(value = "/TCAMBIARESTADOERROR")
    @RolesAllowed({"Admin","SuperAdmin","AreaMedica","MesaDeApoyo"})
    public ServiceResponse solicitudTCAMBIARESTADOERROR(TCAMBIARESTADOERRORRequest request) {
        return serviceMsEstatus.solicitudTCAMBIARESTADOERROR(request);
    }

    @POST
    @Path(value = "/TCAMBIARESTADOERRORCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","AreaMedica","MesaDeApoyo"})
    public ServiceResponse solicitudTCAMBIARESTADOERRORCheckPreconditions(TCAMBIARESTADOERRORRequest request) {

        return serviceMsEstatus.solicitudTCAMBIARESTADOERRORCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TCAMBIARESTDEVAREAMED")
    @RolesAllowed({"Admin","SuperAdmin","AreaMedica","Afiliaciones","MesaDeApoyo"})
    public TCAMBIARESTDEVAREAMEDResponse solicitudTCAMBIARESTDEVAREAMED(TCAMBIARESTDEVAREAMEDRequest request) {
        return serviceMsEstatus.solicitudTCAMBIARESTDEVAREAMED(request);
    }
    

    @POST
    @Path(value = "/TCAMBIARESTDEVAREAMEDCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","AreaMedica","Afiliaciones","MesaDeApoyo"})
    public TCAMBIARESTDEVAREAMEDResponse solicitudTCAMBIARESTDEVAREAMEDCheckPreconditions(TCAMBIARESTDEVAREAMEDRequest request) {

        return serviceMsEstatus.solicitudTCAMBIARESTDEVAREAMEDCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TCAMBIARESTPENDMEDICO")
    @RolesAllowed({"Admin","SuperAdmin","AreaMedica","Afiliaciones","MesaDeApoyo"})
    public ServiceResponse solicitudTCAMBIARESTPENDMEDICO(TCAMBIARESTPENDMEDICORequest request) {
        return serviceMsEstatus.solicitudTCAMBIARESTPENDMEDICO(request);
    }
    

    @POST
    @Path(value = "/TCAMBIARESTPENDMEDICOCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","AreaMedica","Afiliaciones","MesaDeApoyo"})
    public ServiceResponse solicitudTCAMBIARESTPENDMEDICOCheckPreconditions(TCAMBIARESTPENDMEDICORequest request) {

        return serviceMsEstatus.solicitudTCAMBIARESTPENDMEDICOCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TMODENCABEZADO")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudTMODENCABEZADO(TMODENCABEZADORequest request) {
        return service.tMODENCABEZADO(request);
    }
    

    @POST
    @Path(value = "/TMODENCABEZADOCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudTMODENCABEZADOCheckPreconditions(TMODENCABEZADORequest request) {

        return service.tMODENCABEZADOCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TCAMBIARESTANULADO")
    @RolesAllowed({"Admin","SuperAdmin","Afiliaciones","MesaDeApoyo"})
    public ServiceResponse solicitudTCAMBIARESTANULADO(TCAMBIARESTANULADORequest request) {
        return serviceMsEstatus.solicitudTCAMBIARESTANULADO(request);
    }
    

    @POST
    @Path(value = "/TCAMBIARESTANULADOCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Afiliaciones","MesaDeApoyo"})
    public ServiceResponse solicitudTCAMBIARESTANULADOCheckPreconditions(TCAMBIARESTANULADORequest request) {

        return serviceMsEstatus.solicitudTCAMBIARESTANULADOCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TANULARAUTO")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse solicitudTANULARAUTO(TANULARAUTORequest request) {
        return service.tANULARAUTO(request);
    }
    

    @POST
    @Path(value = "/TMODDIRSCONTRATANTE")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudTMODDIRSCONTRATANTE(TMODDIRSCONTRATANTERequest request) {
        return service.tMODDIRSCONTRATANTE(request);
    }
    

    @POST
    @Path(value = "/TMODDIRSCONTRATANTECheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudTMODDIRSCONTRATANTECheckPreconditions(TMODDIRSCONTRATANTERequest request) {

        return service.tMODDIRSCONTRATANTECheckPreconditions(request);
    }

    @POST
    @Path(value = "/TMODDIRSTITULAR")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudTMODDIRSTITULAR(TMODDIRSTITULARRequest request) {
        return service.tMODDIRSTITULAR(request);
    }
    

    @POST
    @Path(value = "/TMODDIRSTITULARCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudTMODDIRSTITULARCheckPreconditions(TMODDIRSTITULARRequest request) {

        return service.tMODDIRSTITULARCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TMODENCABEZADOINCL")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudTMODENCABEZADOINCL(TMODENCABEZADOINCLRequest request) {
        return service.tMODENCABEZADOINCL(request);
    }
    

    @POST
    @Path(value = "/TMODENCABEZADOINCLCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudTMODENCABEZADOINCLCheckPreconditions(TMODENCABEZADOINCLRequest request) {

        return service.tMODENCABEZADOINCLCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TCAMBIARESTAPROBMEDICO")
    @RolesAllowed({"Admin","SuperAdmin","AreaMedica"})
    public ServiceResponse solicitudTCAMBIARESTAPROBMEDICO(TCAMBIARESTAPROBMEDICORequest request) {
        return serviceMsEstatus.solicitudTCAMBIARESTAPROBMEDICO(request);
    }
    

    @POST
    @Path(value = "/TCAMBIARESTAPROBMEDICOCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","AreaMedica"})
    public ServiceResponse solicitudTCAMBIARESTAPROBMEDICOCheckPreconditions(TCAMBIARESTAPROBMEDICORequest request) {

        return serviceMsEstatus.solicitudTCAMBIARESTAPROBMEDICOCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TCAMBIARESTADOADMIN")
    @RolesAllowed({"Admin","SuperAdmin","MesaDeApoyo"})
    public ServiceResponse solicitudTCAMBIARESTADOADMIN(TCAMBIARESTADOADMINRequest request) {
    	return serviceMsEstatus.solicitudTCAMBIARESTADOADMIN(request);
    }
    

    @POST
    @Path(value = "/TCREAROMODFIRMACONTINC")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudTCREAROMODFIRMACONTINC(TCREAROMODFIRMACONTINCRequest request) {
        return service.tCREAROMODFIRMACONTINC(request);
    }
    

    @POST
    @Path(value = "/TCREAROMODFIRMACONTINCCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse solicitudTCREAROMODFIRMACONTINCCheckPreconditions(TCREAROMODFIRMACONTINCRequest request) {

        return service.tCREAROMODFIRMACONTINCCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TPOSTGENERAREXITO")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public ServiceResponse solicitudTPOSTGENERAREXITO(TPOSTGENERAREXITORequest request) {
        return service.tPOSTGENERAREXITO(request);
    }
    

    @POST
    @Path(value = "/TCAMBIARESTADODOC")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse solicitudTCAMBIARESTADODOC(TCAMBIARESTADODOCRequest request) {
        return service.tCAMBIARESTADODOC(request);
    }
    

    @POST
    @Path(value = "/TCAMBIARESTADODOCCheckPreconditions")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse solicitudTCAMBIARESTADODOCCheckPreconditions(TCAMBIARESTADODOCRequest request) {

        return service.tCAMBIARESTADODOCCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TREASIGNARUSUARIOS")
    @RolesAllowed({"Admin","SuperAdmin"})
    public TREASIGNARUSUARIOSResponse solicitudTREASIGNARUSUARIOS(TREASIGNARUSUARIOSRequest request) {
    	return serviceMsEstatus.solicitudTREASIGNARUSUARIOS(request);
    }
    

    @POST
    @Path(value = "/TREASIGNARUSUARIOSCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin"})
    public TREASIGNARUSUARIOSResponse solicitudTREASIGNARUSUARIOSCheckPreconditions(TREASIGNARUSUARIOSRequest request) {

        return service.tREASIGNARUSUARIOSCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TSUBIRDOCUMENTOATO")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","MesaDeApoyo"})
    public ServiceResponse solicitudTSUBIRDOCUMENTOATO(TSUBIRDOCUMENTOATORequest request) {
        return service.tSUBIRDOCUMENTOATO(request);
    }
    

    @POST
    @Path(value = "/TSUBIRDOCUMENTOATOCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","MesaDeApoyo"})
    public ServiceResponse solicitudTSUBIRDOCUMENTOATOCheckPreconditions(TSUBIRDOCUMENTOATORequest request) {

        return service.tSUBIRDOCUMENTOATOCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TGETPLANTILLAREPORTE")
    public TGETPLANTILLAREPORTEResponse solicitudTGETPLANTILLAREPORTE(TGETPLANTILLAREPORTERequest request) {
        return service.tGETPLANTILLAREPORTE(request);
    }
    

    @POST
    @Path(value = "/TGETPLANTILLAREPORTECheckPreconditions")
    public TGETPLANTILLAREPORTEResponse solicitudTGETPLANTILLAREPORTECheckPreconditions(TGETPLANTILLAREPORTERequest request) {

        return service.tGETPLANTILLAREPORTECheckPreconditions(request);
    }

    @POST
    @Path(value = "/TENVIARDOCAUTOAUX")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public ServiceResponse solicitudTENVIARDOCAUTOAUX(TENVIARDOCAUTOAUXRequest request) {
        return service.tENVIARDOCAUTOAUX(request);
    }
    
}
