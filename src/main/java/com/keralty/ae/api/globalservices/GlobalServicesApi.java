package com.keralty.ae.api.globalservices;

import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.globalservices.siu.OGANULARSOLAUXRequest;
import com.keralty.ae.viewmodel.globalservices.siu.OGANULARSOLRequest;
import com.keralty.ae.viewmodel.globalservices.siu.OGASIGUSUARIOSRequest;
import com.keralty.ae.viewmodel.globalservices.siu.OGASIGUSUARIOSResponse;
import com.keralty.ae.viewmodel.globalservices.siu.OGCARGAPLANASESORRequest;
import com.keralty.ae.viewmodel.globalservices.siu.OGCARGAPLANASESORResponse;
import com.keralty.ae.viewmodel.globalservices.siu.OGCARGAVISASESORESRequest;
import com.keralty.ae.viewmodel.globalservices.siu.OGCARGAVISASESORESResponse;
import com.keralty.ae.viewmodel.globalservices.siu.OGENERARSOLICITUD2Request;
import com.keralty.ae.viewmodel.globalservices.siu.OGENERARSOLICITUD2Response;
import com.keralty.ae.viewmodel.globalservices.siu.OGETREPORTERequest;
import com.keralty.ae.viewmodel.globalservices.siu.OGETREPORTEResponse;
import com.keralty.ae.viewmodel.globalservices.siu.OGETREPORTSOLNOVRequest;
import com.keralty.ae.viewmodel.globalservices.siu.OGETREPORTSOLNOVResponse;
import com.keralty.ae.viewmodel.globalservices.siu.OGETREPORTSOLRequest;
import com.keralty.ae.viewmodel.globalservices.siu.OGETREPORTSOLResponse;
import com.keralty.ae.viewmodel.globalservices.siu.OGSINCAGENTESXPRODRequest;
import com.keralty.ae.viewmodel.globalservices.siu.OGSINCASESORESRequest;
import com.keralty.ae.viewmodel.globalservices.siu.OGSINCASESORESResponse;
import com.keralty.ae.viewmodel.globalservices.siu.OGSINCEPSSRequest;
import com.keralty.ae.viewmodel.globalservices.siu.OGSINCGRUPOSASOCIADOSRequest;
import com.keralty.ae.viewmodel.globalservices.siu.OGSINCMUNICIPIOSRequest;
import com.keralty.ae.viewmodel.globalservices.siu.OGSINCOMPANIASRequest;
import com.keralty.ae.viewmodel.globalservices.siu.OGSINCRONIZARPARAMETRICASRequest;
import com.keralty.ae.viewmodel.globalservices.siu.OGSINCSUCURSALESRequest;
import com.keralty.ae.viewmodel.globalservices.siu.OGSOLICITUDFISICALEERRequest;
import com.keralty.ae.viewmodel.globalservices.siu.OGSOLICITUDFISICALEERResponse;
import com.keralty.ae.viewmodel.globalservices.siu.OGSOLNOVSETTRAMITADORequest;
import com.keralty.ae.viewmodel.globalservices.siu.OGSOLNOVSETTRAMITADOResponse;
import com.keralty.ae.viewmodel.globalservices.siu.REACTIVACIONCONTRATOSRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TCREARAGENTERequest;
import com.keralty.ae.viewmodel.globalservices.siu.TDELCOMBORequest;
import com.keralty.ae.viewmodel.globalservices.siu.TdelcontsindocsolRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGACTDIRECCIONESRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGACTPERSONAENCORERequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGACTPERSONAENCOREResponse;
import com.keralty.ae.viewmodel.globalservices.siu.TGACTTIPOFACTURARequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGADDPLANTREPRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGCREARACTPERSONACORERequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGCREARACTPERSONACOREResponse;
import com.keralty.ae.viewmodel.globalservices.siu.TGCREARCOMBORequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGCREARCONTEXENTORequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGCREARCONTRATOCORERequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGCREARCONTRATOCOREResponse;
import com.keralty.ae.viewmodel.globalservices.siu.TGCREARFINIEPSRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGCREARPERSONACORERequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGCREARPERSONACOREResponse;
import com.keralty.ae.viewmodel.globalservices.siu.TGCREARTARIFARequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGDELCONTRATOEXENTORequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGEDITARCOMBORequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGEDITPLANTREPRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGELIMINARTARIFARequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGENFILELEGALIZACOMRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGENFILELEGALIZACOMResponse;
import com.keralty.ae.viewmodel.globalservices.siu.TGENREPALMRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGENREPALMResponse;
import com.keralty.ae.viewmodel.globalservices.siu.TGFIJARDATOSSINCRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGINCLUSIONCONTRATOCORERequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGINCLUSIONCONTRATOCOREResponse;
import com.keralty.ae.viewmodel.globalservices.siu.TGMODASESORAGENCIARequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGMODFINIEPSRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGNEWASESORAGENCIARequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGNEWASESORAGENCIAResponse;
import com.keralty.ae.viewmodel.globalservices.siu.TGNOTIFICARANULARRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGNOTIFICARCREARRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGNOTIFICARINCLUSIONRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGPOSPROCESARASESORESRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGRPTACTRINCRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGRPTACTRINCResponse;
import com.keralty.ae.viewmodel.globalservices.siu.TGRPTACTRNEWRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGRPTACTRNEWResponse;
import com.keralty.ae.viewmodel.globalservices.siu.TGSELECCONTRATOASOCRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSELECCONTRATOASOCTITRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINC1AGENTEXPRODAUXRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINC1AGENTEXPRODRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINC1ASESORRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINC1GRUPOASOCRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINC1MUNICIPIORequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINCDEPARTAMENTOSRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINCENTIDADESFINRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINCESTADOSBENEFICIARIORequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINCESTADOSCIVILESRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINCESTADOSCONTRATORequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINCESTADOSPERSONARequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINCFORMASPAGORequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINCPAISESRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINCPARENTESCOSRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINCPERIODICIDADESRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINCPLANESRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINCPRODUCTOSRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINCREGIONALESRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINCTIPOSDEENTIDADRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINCTIPOSDIRECCIONRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINCTIPOSIDENTIFICACIONRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINCTIPOSINSTITUCIONRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINCTIPOSSUCURSALRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSOLICITUDFISICACARGARRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSOLNOVSETTRARequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSOLNOVSETTRAResponse;
import com.keralty.ae.viewmodel.globalservices.siu.TGValidadorUsuariosRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGVERIFICARUSUARIORequest;
import com.keralty.ae.viewmodel.globalservices.siu.TMARCARGENERADAENCORRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TMODIFICARAGENTERequest;
import com.keralty.ae.viewmodel.ServiceResponse;
import jakarta.annotation.security.RolesAllowed;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.POST;
import org.eclipse.microprofile.jwt.JsonWebToken;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import com.keralty.ae.service.GlobalServicesProxy4aeconfiguraciones;
import com.keralty.ae.service.GlobalServicesProxy4aeusuarios;
import com.keralty.ae.service.GlobalServicesProxy4aepersonas;
import com.keralty.ae.service.GlobalServicesProxy4aesolicitudes;
import com.keralty.ae.service.GlobalServicesProxy4aereportes;
import com.keralty.ae.service.GlobalServicesProxy4aegenerasolicitud;
import com.keralty.ae.service.GlobalServicesProxy4aenovedades;

@Path("/api/GlobalServicesApi")
@RequestScoped
public class GlobalServicesApi {


    @RestClient
    GlobalServicesProxy4aeusuarios proxy4aeusuarios;

    @RestClient
    GlobalServicesProxy4aeconfiguraciones proxy4aeconfiguraciones;

    @RestClient
    GlobalServicesProxy4aereportes proxy4aereportes;

    @RestClient
    GlobalServicesProxy4aepersonas proxy4aepersonas;

    @RestClient
    GlobalServicesProxy4aesolicitudes proxy4aesolicitudes;

    @RestClient
    GlobalServicesProxy4aenovedades proxy4aenovedades;

    @RestClient
    GlobalServicesProxy4aegenerasolicitud proxy4aegenerasolicitud;

    JsonWebToken jwt; 

    public GlobalServicesApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @POST
    @Path(value = "/TGSINCPRODUCTOS")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tGSINCPRODUCTOS(TGSINCPRODUCTOSRequest request) {
        return proxy4aeconfiguraciones.tGSINCPRODUCTOS(request);
    }

    @POST
    @Path(value = "/TGSINCPLANES")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tGSINCPLANES(TGSINCPLANESRequest request) {
        return proxy4aeconfiguraciones.tGSINCPLANES(request);
    }

    @POST
    @Path(value = "/TGSINCPARENTESCOS")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tGSINCPARENTESCOS(TGSINCPARENTESCOSRequest request) {
        return proxy4aeconfiguraciones.tGSINCPARENTESCOS(request);
    }

    @POST
    @Path(value = "/TGSINCPERIODICIDADES")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tGSINCPERIODICIDADES(TGSINCPERIODICIDADESRequest request) {
        return proxy4aeconfiguraciones.tGSINCPERIODICIDADES(request);
    }

    @POST
    @Path(value = "/TGSINCESTADOSCONTRATO")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tGSINCESTADOSCONTRATO(TGSINCESTADOSCONTRATORequest request) {
        return proxy4aeconfiguraciones.tGSINCESTADOSCONTRATO(request);
    }

    @POST
    @Path(value = "/TGSINCESTADOSBENEFICIARIO")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tGSINCESTADOSBENEFICIARIO(TGSINCESTADOSBENEFICIARIORequest request) {
        return proxy4aeconfiguraciones.tGSINCESTADOSBENEFICIARIO(request);
    }

    @POST
    @Path(value = "/TGSINCREGIONALES")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tGSINCREGIONALES(TGSINCREGIONALESRequest request) {
        return proxy4aeconfiguraciones.tGSINCREGIONALES(request);
    }

    @POST
    @Path(value = "/OGSINCSUCURSALES")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse oGSINCSUCURSALES(OGSINCSUCURSALESRequest request) {
        return proxy4aeconfiguraciones.oGSINCSUCURSALES(request);
    }

    @POST
    @Path(value = "/TGSINC1GRUPOASOC")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse tGSINC1GRUPOASOC(TGSINC1GRUPOASOCRequest request) {
        return proxy4aeconfiguraciones.tGSINC1GRUPOASOC(request);
    }

    @POST
    @Path(value = "/OGSINCGRUPOSASOCIADOS")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse oGSINCGRUPOSASOCIADOS(OGSINCGRUPOSASOCIADOSRequest request) {
        return proxy4aeconfiguraciones.oGSINCGRUPOSASOCIADOS(request);
    }

    @POST
    @Path(value = "/TGSINCESTADOSCIVILES")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tGSINCESTADOSCIVILES(TGSINCESTADOSCIVILESRequest request) {
        return proxy4aeconfiguraciones.tGSINCESTADOSCIVILES(request);
    }

    @POST
    @Path(value = "/TGSINCDEPARTAMENTOS")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tGSINCDEPARTAMENTOS(TGSINCDEPARTAMENTOSRequest request) {
        return proxy4aeconfiguraciones.tGSINCDEPARTAMENTOS(request);
    }

    @POST
    @Path(value = "/TGSINC1ASESOR")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tGSINC1ASESOR(TGSINC1ASESORRequest request) {
        return proxy4aeusuarios.tGSINC1ASESOR(request);
    }

    @POST
    @Path(value = "/OGSINCASESORES")
    @RolesAllowed({"Admin","SuperAdmin","UsuarioSistemaExterno"})
    public OGSINCASESORESResponse oGSINCASESORES(OGSINCASESORESRequest request) {
        return proxy4aeusuarios.oGSINCASESORES(request);
    }

    @POST
    @Path(value = "/OGSINCOMPANIAS")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse oGSINCOMPANIAS(OGSINCOMPANIASRequest request) {
        return proxy4aeconfiguraciones.oGSINCOMPANIAS(request);
    }

    @POST
    @Path(value = "/TGSINC1MUNICIPIO")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse tGSINC1MUNICIPIO(TGSINC1MUNICIPIORequest request) {
        return proxy4aeconfiguraciones.tGSINC1MUNICIPIO(request);
    }

    @POST
    @Path(value = "/OGSINCMUNICIPIOS")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse oGSINCMUNICIPIOS(OGSINCMUNICIPIOSRequest request) {
        return proxy4aeconfiguraciones.oGSINCMUNICIPIOS(request);
    }

    @POST
    @Path(value = "/TGSINCTIPOSDIRECCION")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tGSINCTIPOSDIRECCION(TGSINCTIPOSDIRECCIONRequest request) {
        return proxy4aeconfiguraciones.tGSINCTIPOSDIRECCION(request);
    }

    @POST
    @Path(value = "/TGSINCESTADOSPERSONA")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tGSINCESTADOSPERSONA(TGSINCESTADOSPERSONARequest request) {
        return proxy4aeconfiguraciones.tGSINCESTADOSPERSONA(request);
    }

    @POST
    @Path(value = "/TGSINCFORMASPAGO")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tGSINCFORMASPAGO(TGSINCFORMASPAGORequest request) {
        return proxy4aeconfiguraciones.tGSINCFORMASPAGO(request);
    }

    @POST
    @Path(value = "/TGSINCTIPOSIDENTIFICACION")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tGSINCTIPOSIDENTIFICACION(TGSINCTIPOSIDENTIFICACIONRequest request) {
        return proxy4aeconfiguraciones.tGSINCTIPOSIDENTIFICACION(request);
    }

    @POST
    @Path(value = "/OGSINCEPSS")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse oGSINCEPSS(OGSINCEPSSRequest request) {
        return proxy4aeconfiguraciones.oGSINCEPSS(request);
    }

    @POST
    @Path(value = "/TGSINCPAISES")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tGSINCPAISES(TGSINCPAISESRequest request) {
        return proxy4aeconfiguraciones.tGSINCPAISES(request);
    }

    @POST
    @Path(value = "/TGSELECCONTRATOASOC")
    @RolesAllowed({"Admin","SuperAdmin","Asesor"})
    public ServiceResponse tGSELECCONTRATOASOC(TGSELECCONTRATOASOCRequest request) {
        return proxy4aepersonas.tGSELECCONTRATOASOC(request);
    }

    @POST
    @Path(value = "/TGSELECCONTRATOASOCCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor"})
    public ServiceResponse tGSELECCONTRATOASOCCheckPreconditions(TGSELECCONTRATOASOCRequest request) {
        return proxy4aepersonas.tGSELECCONTRATOASOCCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TGSELECCONTRATOASOCTIT")
    @RolesAllowed({"Admin","SuperAdmin","Asesor"})
    public ServiceResponse tGSELECCONTRATOASOCTIT(TGSELECCONTRATOASOCTITRequest request) {
        return proxy4aepersonas.tGSELECCONTRATOASOCTIT(request);
    }

    @POST
    @Path(value = "/TGSELECCONTRATOASOCTITCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor"})
    public ServiceResponse tGSELECCONTRATOASOCTITCheckPreconditions(TGSELECCONTRATOASOCTITRequest request) {
        return proxy4aepersonas.tGSELECCONTRATOASOCTITCheckPreconditions(request);
    }

    @POST
    @Path(value = "/OGSOLICITUDFISICALEER")
    @RolesAllowed({"Admin","SuperAdmin"})
    public OGSOLICITUDFISICALEERResponse oGSOLICITUDFISICALEER(OGSOLICITUDFISICALEERRequest request) {
        return proxy4aesolicitudes.oGSOLICITUDFISICALEER(request);
    }

    @POST
    @Path(value = "/TGSOLICITUDFISICACARGAR")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tGSOLICITUDFISICACARGAR(TGSOLICITUDFISICACARGARRequest request) {
        return proxy4aesolicitudes.tGSOLICITUDFISICACARGAR(request);
    }

    @POST
    @Path(value = "/TGENFILELEGALIZACOM")
    @RolesAllowed({"Admin","SuperAdmin","Afiliaciones"})
    public TGENFILELEGALIZACOMResponse tGENFILELEGALIZACOM(TGENFILELEGALIZACOMRequest request) {
        return proxy4aereportes.tGENFILELEGALIZACOM(request);
    }


    @POST
    @Path(value = "/TGSINCENTIDADESFIN")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tGSINCENTIDADESFIN(TGSINCENTIDADESFINRequest request) {
        return proxy4aeconfiguraciones.tGSINCENTIDADESFIN(request);
    }

    @POST
    @Path(value = "/TGSINCTIPOSDEENTIDAD")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tGSINCTIPOSDEENTIDAD(TGSINCTIPOSDEENTIDADRequest request) {
        return proxy4aeconfiguraciones.tGSINCTIPOSDEENTIDAD(request);
    }

    @POST
    @Path(value = "/TGSINCTIPOSINSTITUCION")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tGSINCTIPOSINSTITUCION(TGSINCTIPOSINSTITUCIONRequest request) {
        return proxy4aeconfiguraciones.tGSINCTIPOSINSTITUCION(request);
    }

    @POST
    @Path(value = "/TGSINCTIPOSSUCURSAL")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tGSINCTIPOSSUCURSAL(TGSINCTIPOSSUCURSALRequest request) {
        return proxy4aeconfiguraciones.tGSINCTIPOSSUCURSAL(request);
    }

    @POST
    @Path(value = "/TGVERIFICARUSUARIO")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public ServiceResponse tGVERIFICARUSUARIO(TGVERIFICARUSUARIORequest request) {
        return proxy4aeusuarios.tGVERIFICARUSUARIO(request);
    }

    @POST
    @Path(value = "/TGCREARTARIFA")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tGCREARTARIFA(TGCREARTARIFARequest request) {
        return proxy4aeconfiguraciones.tGCREARTARIFA(request);
    }

    @POST
    @Path(value = "/TGELIMINARTARIFA")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tGELIMINARTARIFA(TGELIMINARTARIFARequest request) {
        return proxy4aeconfiguraciones.tGELIMINARTARIFA(request);
    }

    @POST
    @Path(value = "/OGSINCAGENTESXPROD")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse oGSINCAGENTESXPROD(OGSINCAGENTESXPRODRequest request) {
        return proxy4aeusuarios.oGSINCAGENTESXPROD(request);
    }

    @POST
    @Path(value = "/TGSINC1AGENTEXPROD")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tGSINC1AGENTEXPROD(TGSINC1AGENTEXPRODRequest request) {
        return proxy4aeusuarios.tGSINC1AGENTEXPROD(request);
    }

    @POST
    @Path(value = "/TGSINC1AGENTEXPRODAUX")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tGSINC1AGENTEXPRODAUX(TGSINC1AGENTEXPRODAUXRequest request) {
        return proxy4aeusuarios.tGSINC1AGENTEXPRODAUX(request);
    }

    @POST
    @Path(value = "/OGENERARSOLICITUD2")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","MesaDeApoyo"})
    public OGENERARSOLICITUD2Response oGENERARSOLICITUD2(OGENERARSOLICITUD2Request request) {
        return proxy4aegenerasolicitud.oGENERARSOLICITUD2(request);
    }

    @POST
    @Path(value = "/OGENERARSOLICITUD2CheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","MesaDeApoyo"})
    public OGENERARSOLICITUD2Response oGENERARSOLICITUD2CheckPreconditions(OGENERARSOLICITUD2Request request) {
        return proxy4aegenerasolicitud.oGENERARSOLICITUD2CheckPreconditions(request);
    }

    @POST
    @Path(value = "/TGCREARPERSONACORE")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones"})
    public TGCREARPERSONACOREResponse tGCREARPERSONACORE(TGCREARPERSONACORERequest request) {
        return proxy4aegenerasolicitud.tGCREARPERSONACORE(request);
    }

    @POST
    @Path(value = "/TGACTPERSONAENCORE")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones"})
    public TGACTPERSONAENCOREResponse tGACTPERSONAENCORE(TGACTPERSONAENCORERequest request) {
        return proxy4aegenerasolicitud.tGACTPERSONAENCORE(request);
    }

    @POST
    @Path(value = "/TGPOSPROCESARASESORES")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tGPOSPROCESARASESORES(TGPOSPROCESARASESORESRequest request) {
        return proxy4aeusuarios.tGPOSPROCESARASESORES(request);
    }

    @POST
    @Path(value = "/TCREARAGENTE")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tCREARAGENTE(TCREARAGENTERequest request) {
        return proxy4aeusuarios.tCREARAGENTE(request);
    }

    @POST
    @Path(value = "/TCREARAGENTECheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tCREARAGENTECheckPreconditions(TCREARAGENTERequest request) {
        return proxy4aeusuarios.tCREARAGENTECheckPreconditions(request);
    }

    @POST
    @Path(value = "/TMODIFICARAGENTE")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tMODIFICARAGENTE(TMODIFICARAGENTERequest request) {
        return proxy4aeusuarios.tMODIFICARAGENTE(request);
    }

    @POST
    @Path(value = "/TMODIFICARAGENTECheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tMODIFICARAGENTECheckPreconditions(TMODIFICARAGENTERequest request) {
        return proxy4aeusuarios.tMODIFICARAGENTECheckPreconditions(request);
    }

    @POST
    @Path(value = "/TGCREARCONTRATOCORE")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones"})
    public TGCREARCONTRATOCOREResponse tGCREARCONTRATOCORE(TGCREARCONTRATOCORERequest request) {
        return proxy4aegenerasolicitud.tGCREARCONTRATOCORE(request);
    }

    @POST
    @Path(value = "/TGINCLUSIONCONTRATOCORE")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones"})
    public TGINCLUSIONCONTRATOCOREResponse tGINCLUSIONCONTRATOCORE(TGINCLUSIONCONTRATOCORERequest request) {
        return proxy4aegenerasolicitud.tGINCLUSIONCONTRATOCORE(request);
    }

    @POST
    @Path(value = "/TGNOTIFICARCREAR")
    @RolesAllowed({"SuperAdmin","UsuarioSistemaExterno"})
    public ServiceResponse tGNOTIFICARCREAR(TGNOTIFICARCREARRequest request) {
        return proxy4aegenerasolicitud.tGNOTIFICARCREAR(request);
    }

    @POST
    @Path(value = "/TGNOTIFICARINCLUSION")
    @RolesAllowed({"SuperAdmin","UsuarioSistemaExterno"})
    public ServiceResponse tGNOTIFICARINCLUSION(TGNOTIFICARINCLUSIONRequest request) {
        return proxy4aegenerasolicitud.tGNOTIFICARINCLUSION(request);
    }

    @POST
    @Path(value = "/TGNOTIFICARANULAR")
    @RolesAllowed({"SuperAdmin","UsuarioSistemaExterno"})
    public ServiceResponse tGNOTIFICARANULAR(TGNOTIFICARANULARRequest request) {
        return proxy4aegenerasolicitud.tGNOTIFICARANULAR(request);
    }

    @POST
    @Path(value = "/TGNEWASESORAGENCIA")
    @RolesAllowed({"Admin","SuperAdmin"})
    public TGNEWASESORAGENCIAResponse tGNEWASESORAGENCIA(TGNEWASESORAGENCIARequest request) {
        return proxy4aeusuarios.tGNEWASESORAGENCIA(request);
    }

    @POST
    @Path(value = "/TGNEWASESORAGENCIACheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin"})
    public TGNEWASESORAGENCIAResponse tGNEWASESORAGENCIACheckPreconditions(TGNEWASESORAGENCIARequest request) {
        return proxy4aeusuarios.tGNEWASESORAGENCIACheckPreconditions(request);
    }

    @POST
    @Path(value = "/TGMODASESORAGENCIA")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tGMODASESORAGENCIA(TGMODASESORAGENCIARequest request) {
        return proxy4aeusuarios.tGMODASESORAGENCIA(request);
    }

    @POST
    @Path(value = "/TGMODASESORAGENCIACheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tGMODASESORAGENCIACheckPreconditions(TGMODASESORAGENCIARequest request) {
        return proxy4aeusuarios.tGMODASESORAGENCIACheckPreconditions(request);
    }

    @POST
    @Path(value = "/TGCREARACTPERSONACORE")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones"})
    public TGCREARACTPERSONACOREResponse tGCREARACTPERSONACORE(TGCREARACTPERSONACORERequest request) {
        return proxy4aegenerasolicitud.tGCREARACTPERSONACORE(request);
    }

    @POST
    @Path(value = "/tdelcontsindocsol")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tdelcontsindocsol(TdelcontsindocsolRequest request) {
        return proxy4aeconfiguraciones.tdelcontsindocsol(request);
    }

    @POST
    @Path(value = "/OGANULARSOL")
    @RolesAllowed({"SuperAdmin","UsuarioSistemaExterno"})
    public ServiceResponse oGANULARSOL(OGANULARSOLRequest request) {
        return proxy4aesolicitudes.oGANULARSOL(request);
    }

    @POST
    @Path(value = "/OGANULARSOLAUX")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse oGANULARSOLAUX(OGANULARSOLAUXRequest request) {
        return proxy4aesolicitudes.oGANULARSOLAUX(request);
    }

    @POST
    @Path(value = "/TGACTDIRECCIONES")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public ServiceResponse tGACTDIRECCIONES(TGACTDIRECCIONESRequest request) {
        return proxy4aegenerasolicitud.tGACTDIRECCIONES(request);
    }

    @POST
    @Path(value = "/TGACTTIPOFACTURA")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public ServiceResponse tGACTTIPOFACTURA(TGACTTIPOFACTURARequest request) {
        return proxy4aegenerasolicitud.tGACTTIPOFACTURA(request);
    }

    @POST
    @Path(value = "/OGSOLNOVSETTRAMITADO")
    @RolesAllowed({"Admin","SuperAdmin"})
    public OGSOLNOVSETTRAMITADOResponse oGSOLNOVSETTRAMITADO(OGSOLNOVSETTRAMITADORequest request) {
        return proxy4aenovedades.oGSOLNOVSETTRAMITADO(request);
    }

    @POST
    @Path(value = "/TGSOLNOVSETTRA")
    @RolesAllowed({"Admin","SuperAdmin"})
    public TGSOLNOVSETTRAResponse tGSOLNOVSETTRA(TGSOLNOVSETTRARequest request) {
        return proxy4aenovedades.tGSOLNOVSETTRA(request);
    }

    @POST
    @Path(value = "/TGCREARCOMBO")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tGCREARCOMBO(TGCREARCOMBORequest request) {
        return proxy4aeconfiguraciones.tGCREARCOMBO(request);
    }

    @POST
    @Path(value = "/TGCREARCOMBOCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tGCREARCOMBOCheckPreconditions(TGCREARCOMBORequest request) {
        return proxy4aeconfiguraciones.tGCREARCOMBOCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TGEDITARCOMBO")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tGEDITARCOMBO(TGEDITARCOMBORequest request) {
        return proxy4aeconfiguraciones.tGEDITARCOMBO(request);
    }

    @POST
    @Path(value = "/TGEDITARCOMBOCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tGEDITARCOMBOCheckPreconditions(TGEDITARCOMBORequest request) {
        return proxy4aeconfiguraciones.tGEDITARCOMBOCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TDELCOMBO")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tDELCOMBO(TDELCOMBORequest request) {
        return proxy4aeconfiguraciones.tDELCOMBO(request);
    }

    @POST
    @Path(value = "/OGASIGUSUARIOS")
    @RolesAllowed({"Admin","SuperAdmin"})
    public OGASIGUSUARIOSResponse oGASIGUSUARIOS(OGASIGUSUARIOSRequest request) {
        return proxy4aesolicitudes.oGASIGUSUARIOS(request);
    }


    @POST
    @Path(value = "/TGADDPLANTREP")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tGADDPLANTREP(TGADDPLANTREPRequest request) {
        return proxy4aeconfiguraciones.tGADDPLANTREP(request);
    }

    @POST
    @Path(value = "/TGADDPLANTREPCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tGADDPLANTREPCheckPreconditions(TGADDPLANTREPRequest request) {
        return proxy4aeconfiguraciones.tGADDPLANTREPCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TGEDITPLANTREP")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tGEDITPLANTREP(TGEDITPLANTREPRequest request) {
        return proxy4aeconfiguraciones.tGEDITPLANTREP(request);
    }

    @POST
    @Path(value = "/TGEDITPLANTREPCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tGEDITPLANTREPCheckPreconditions(TGEDITPLANTREPRequest request) {
        return proxy4aeconfiguraciones.tGEDITPLANTREPCheckPreconditions(request);
    }

    @POST
    @Path(value = "/OGCARGAVISASESORES")
    @RolesAllowed({"Admin","SuperAdmin"})
    public OGCARGAVISASESORESResponse oGCARGAVISASESORES(OGCARGAVISASESORESRequest request) {
        return proxy4aeusuarios.oGCARGAVISASESORES(request);
    }

    @POST
    @Path(value = "/OGCARGAPLANASESOR")
    @RolesAllowed({"Admin","SuperAdmin"})
    public OGCARGAPLANASESORResponse oGCARGAPLANASESOR(OGCARGAPLANASESORRequest request) {
        return proxy4aeusuarios.oGCARGAPLANASESOR(request);
    }

    @POST
    @Path(value = "/TGCREARFINIEPS")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tGCREARFINIEPS(TGCREARFINIEPSRequest request) {
        return proxy4aeconfiguraciones.tGCREARFINIEPS(request);
    }

    @POST
    @Path(value = "/TGCREARFINIEPSCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tGCREARFINIEPSCheckPreconditions(TGCREARFINIEPSRequest request) {
        return proxy4aeconfiguraciones.tGCREARFINIEPSCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TGMODFINIEPS")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tGMODFINIEPS(TGMODFINIEPSRequest request) {
        return proxy4aeconfiguraciones.tGMODFINIEPS(request);
    }

    @POST
    @Path(value = "/TGMODFINIEPSCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tGMODFINIEPSCheckPreconditions(TGMODFINIEPSRequest request) {
        return proxy4aeconfiguraciones.tGMODFINIEPSCheckPreconditions(request);
    }


    @POST
    @Path(value = "/TGCREARCONTEXENTO")
    @RolesAllowed({"Admin","SuperAdmin","MesaDeApoyo"})
    public ServiceResponse tGCREARCONTEXENTO(TGCREARCONTEXENTORequest request) {
        return proxy4aeconfiguraciones.tGCREARCONTEXENTO(request);
    }

    @POST
    @Path(value = "/TGCREARCONTEXENTOCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","MesaDeApoyo"})
    public ServiceResponse tGCREARCONTEXENTOCheckPreconditions(TGCREARCONTEXENTORequest request) {
        return proxy4aeconfiguraciones.tGCREARCONTEXENTOCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TGDELCONTRATOEXENTO")
    @RolesAllowed({"Admin","SuperAdmin","MesaDeApoyo"})
    public ServiceResponse tGDELCONTRATOEXENTO(TGDELCONTRATOEXENTORequest request) {
        return proxy4aeconfiguraciones.tGDELCONTRATOEXENTO(request);
    }

    @POST
    @Path(value = "/OGETREPORTSOL")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public OGETREPORTSOLResponse oGETREPORTSOL(OGETREPORTSOLRequest request) {
        return proxy4aereportes.oGETREPORTSOL(request);
    }

    @POST
    @Path(value = "/OGETREPORTSOLNOV")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public OGETREPORTSOLNOVResponse oGETREPORTSOLNOV(OGETREPORTSOLNOVRequest request) {
        return proxy4aereportes.oGETREPORTSOLNOV(request);
    }

    @POST
    @Path(value = "/TGENREPALM")
    @RolesAllowed({"Admin","SuperAdmin","RespRegional","Asesor","Afiliaciones"})
    public TGENREPALMResponse tGENREPALM(TGENREPALMRequest request) {
        return proxy4aereportes.tGENREPALM(request);
    }

    @POST
    @Path(value = "/OGETREPORTE")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public OGETREPORTEResponse oGETREPORTE(OGETREPORTERequest request) {
        return proxy4aereportes.oGETREPORTE(request);
    }

    @POST
    @Path(value = "/TGRPTACTRNEW")
    @RolesAllowed({"Admin","SuperAdmin","UsuarioSistemaExterno"})
    public TGRPTACTRNEWResponse tGRPTACTRNEW(TGRPTACTRNEWRequest request) {
        return proxy4aegenerasolicitud.tGRPTACTRNEW(request);
    }

    @POST
    @Path(value = "/TGRPTACTRINC")
    @RolesAllowed({"Admin","SuperAdmin","UsuarioSistemaExterno"})
    public TGRPTACTRINCResponse tGRPTACTRINC(TGRPTACTRINCRequest request) {
        return proxy4aegenerasolicitud.tGRPTACTRINC(request);
    }

    @POST
    @Path(value = "/OGSINCRONIZARPARAMETRICAS")
    @RolesAllowed({"SuperAdmin","UsuarioSistemaExterno"})
    public ServiceResponse oGSINCRONIZARPARAMETRICAS(OGSINCRONIZARPARAMETRICASRequest request) {
        return proxy4aeconfiguraciones.oGSINCRONIZARPARAMETRICAS(request);
    }

    @POST
    @Path(value = "/TGFIJARDATOSSINC")
    public ServiceResponse tGFIJARDATOSSINC(TGFIJARDATOSSINCRequest request) {
        return proxy4aeconfiguraciones.tGFIJARDATOSSINC(request);
    }
}
