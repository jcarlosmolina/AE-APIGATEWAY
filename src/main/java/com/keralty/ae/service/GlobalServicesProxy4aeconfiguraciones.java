package com.keralty.ae.service;

import com.keralty.ae.viewmodel.globalservices.siu.OGSINCEPSSRequest;
import com.keralty.ae.viewmodel.globalservices.siu.OGSINCGRUPOSASOCIADOSRequest;
import com.keralty.ae.viewmodel.globalservices.siu.OGSINCMUNICIPIOSRequest;
import com.keralty.ae.viewmodel.globalservices.siu.OGSINCOMPANIASRequest;
import com.keralty.ae.viewmodel.globalservices.siu.OGSINCRONIZARPARAMETRICASRequest;
import com.keralty.ae.viewmodel.globalservices.siu.OGSINCSUCURSALESRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TDELCOMBORequest;
import com.keralty.ae.viewmodel.globalservices.siu.TdelcontsindocsolRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGADDPLANTREPRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGCREARCOMBORequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGCREARCONTEXENTORequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGCREARFINIEPSRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGCREARTARIFARequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGDELCONTRATOEXENTORequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGEDITARCOMBORequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGEDITPLANTREPRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGELIMINARTARIFARequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGFIJARDATOSSINCRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGMODFINIEPSRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINC1COMPANIARequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINC1DEPARTAMENTORequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINC1ENTIDADFINRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINC1EPSRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINC1ESTADOBENEFICIARIORequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINC1ESTADOCIVILRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINC1ESTADOCONTRATORequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINC1ESTADOPERSONARequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINC1FORMAPAGORequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINC1GRUPOASOCAUX2Request;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINC1GRUPOASOCAUXRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINC1GRUPOASOCRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINC1MUNICIPIORequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINC1PAISRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINC1PARENTESCORequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINC1PERIODICIDADRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINC1PLANAUXRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINC1PLANRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINC1PRODUCTORequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINC1REGIONALRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINC1SUCURSALAUXRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINC1SUCURSALRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINC1TIPODIRECCIONRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINC1TIPOENTIDADRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINC1TIPOIDENTIFICACIONRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINC1TIPOINSTITUCIONRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINC1TIPOSUCURSALRequest;
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
import com.keralty.ae.viewmodel.ServiceResponse;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.POST;
import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/api/GlobalServicesApi")
@RegisterRestClient(configKey="ae-configuraciones")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aeconfiguraciones}")
public interface GlobalServicesProxy4aeconfiguraciones {

    @POST
    @Path(value = "/TDELCOMBO")
    public ServiceResponse tDELCOMBO(TDELCOMBORequest request);


    @POST
    @Path(value = "/tdelcontsindocsol")
    public ServiceResponse tdelcontsindocsol(TdelcontsindocsolRequest request);


    @POST
    @Path(value = "/TGADDPLANTREP")
    public ServiceResponse tGADDPLANTREP(TGADDPLANTREPRequest request);


    @POST
    @Path(value = "/TGADDPLANTREPCheckPreconditions")
    public ServiceResponse tGADDPLANTREPCheckPreconditions(TGADDPLANTREPRequest request);

    @POST
    @Path(value = "/TGCREARCOMBO")
    public ServiceResponse tGCREARCOMBO(TGCREARCOMBORequest request);


    @POST
    @Path(value = "/TGCREARCOMBOCheckPreconditions")
    public ServiceResponse tGCREARCOMBOCheckPreconditions(TGCREARCOMBORequest request);

    @POST
    @Path(value = "/TGCREARCONTEXENTO")
    public ServiceResponse tGCREARCONTEXENTO(TGCREARCONTEXENTORequest request);


    @POST
    @Path(value = "/TGCREARCONTEXENTOCheckPreconditions")
    public ServiceResponse tGCREARCONTEXENTOCheckPreconditions(TGCREARCONTEXENTORequest request);

    @POST
    @Path(value = "/TGCREARFINIEPS")
    public ServiceResponse tGCREARFINIEPS(TGCREARFINIEPSRequest request);


    @POST
    @Path(value = "/TGCREARFINIEPSCheckPreconditions")
    public ServiceResponse tGCREARFINIEPSCheckPreconditions(TGCREARFINIEPSRequest request);

    @POST
    @Path(value = "/TGCREARTARIFA")
    public ServiceResponse tGCREARTARIFA(TGCREARTARIFARequest request);


    @POST
    @Path(value = "/TGDELCONTRATOEXENTO")
    public ServiceResponse tGDELCONTRATOEXENTO(TGDELCONTRATOEXENTORequest request);


    @POST
    @Path(value = "/TGEDITARCOMBO")
    public ServiceResponse tGEDITARCOMBO(TGEDITARCOMBORequest request);


    @POST
    @Path(value = "/TGEDITARCOMBOCheckPreconditions")
    public ServiceResponse tGEDITARCOMBOCheckPreconditions(TGEDITARCOMBORequest request);

    @POST
    @Path(value = "/TGEDITPLANTREP")
    public ServiceResponse tGEDITPLANTREP(TGEDITPLANTREPRequest request);


    @POST
    @Path(value = "/TGEDITPLANTREPCheckPreconditions")
    public ServiceResponse tGEDITPLANTREPCheckPreconditions(TGEDITPLANTREPRequest request);

    @POST
    @Path(value = "/TGELIMINARTARIFA")
    public ServiceResponse tGELIMINARTARIFA(TGELIMINARTARIFARequest request);


    @POST
    @Path(value = "/TGMODFINIEPS")
    public ServiceResponse tGMODFINIEPS(TGMODFINIEPSRequest request);


    @POST
    @Path(value = "/TGMODFINIEPSCheckPreconditions")
    public ServiceResponse tGMODFINIEPSCheckPreconditions(TGMODFINIEPSRequest request);

    @POST
    @Path(value = "/TGSINC1COMPANIA")
    public ServiceResponse tGSINC1COMPANIA(TGSINC1COMPANIARequest request);


    @POST
    @Path(value = "/TGSINC1DEPARTAMENTO")
    public ServiceResponse tGSINC1DEPARTAMENTO(TGSINC1DEPARTAMENTORequest request);


    @POST
    @Path(value = "/TGSINC1ENTIDADFIN")
    public ServiceResponse tGSINC1ENTIDADFIN(TGSINC1ENTIDADFINRequest request);


    @POST
    @Path(value = "/TGSINC1EPS")
    public ServiceResponse tGSINC1EPS(TGSINC1EPSRequest request);


    @POST
    @Path(value = "/TGSINC1ESTADOBENEFICIARIO")
    public ServiceResponse tGSINC1ESTADOBENEFICIARIO(TGSINC1ESTADOBENEFICIARIORequest request);


    @POST
    @Path(value = "/TGSINC1ESTADOCIVIL")
    public ServiceResponse tGSINC1ESTADOCIVIL(TGSINC1ESTADOCIVILRequest request);


    @POST
    @Path(value = "/TGSINC1ESTADOCONTRATO")
    public ServiceResponse tGSINC1ESTADOCONTRATO(TGSINC1ESTADOCONTRATORequest request);


    @POST
    @Path(value = "/TGSINC1ESTADOPERSONA")
    public ServiceResponse tGSINC1ESTADOPERSONA(TGSINC1ESTADOPERSONARequest request);


    @POST
    @Path(value = "/TGSINC1FORMAPAGO")
    public ServiceResponse tGSINC1FORMAPAGO(TGSINC1FORMAPAGORequest request);


    @POST
    @Path(value = "/TGSINC1GRUPOASOC")
    public ServiceResponse tGSINC1GRUPOASOC(TGSINC1GRUPOASOCRequest request);


    @POST
    @Path(value = "/TGSINC1GRUPOASOCAUX")
    public ServiceResponse tGSINC1GRUPOASOCAUX(TGSINC1GRUPOASOCAUXRequest request);


    @POST
    @Path(value = "/TGSINC1GRUPOASOCAUX2")
    public ServiceResponse tGSINC1GRUPOASOCAUX2(TGSINC1GRUPOASOCAUX2Request request);


    @POST
    @Path(value = "/TGSINC1MUNICIPIO")
    public ServiceResponse tGSINC1MUNICIPIO(TGSINC1MUNICIPIORequest request);


    @POST
    @Path(value = "/TGSINC1PAIS")
    public ServiceResponse tGSINC1PAIS(TGSINC1PAISRequest request);


    @POST
    @Path(value = "/TGSINC1PARENTESCO")
    public ServiceResponse tGSINC1PARENTESCO(TGSINC1PARENTESCORequest request);


    @POST
    @Path(value = "/TGSINC1PERIODICIDAD")
    public ServiceResponse tGSINC1PERIODICIDAD(TGSINC1PERIODICIDADRequest request);


    @POST
    @Path(value = "/TGSINC1PLAN")
    public ServiceResponse tGSINC1PLAN(TGSINC1PLANRequest request);


    @POST
    @Path(value = "/TGSINC1PLANAUX")
    public ServiceResponse tGSINC1PLANAUX(TGSINC1PLANAUXRequest request);


    @POST
    @Path(value = "/TGSINC1PRODUCTO")
    public ServiceResponse tGSINC1PRODUCTO(TGSINC1PRODUCTORequest request);


    @POST
    @Path(value = "/TGSINC1REGIONAL")
    public ServiceResponse tGSINC1REGIONAL(TGSINC1REGIONALRequest request);


    @POST
    @Path(value = "/TGSINC1SUCURSAL")
    public ServiceResponse tGSINC1SUCURSAL(TGSINC1SUCURSALRequest request);


    @POST
    @Path(value = "/TGSINC1SUCURSALAUX")
    public ServiceResponse tGSINC1SUCURSALAUX(TGSINC1SUCURSALAUXRequest request);


    @POST
    @Path(value = "/TGSINC1TIPODIRECCION")
    public ServiceResponse tGSINC1TIPODIRECCION(TGSINC1TIPODIRECCIONRequest request);


    @POST
    @Path(value = "/TGSINC1TIPOENTIDAD")
    public ServiceResponse tGSINC1TIPOENTIDAD(TGSINC1TIPOENTIDADRequest request);


    @POST
    @Path(value = "/TGSINC1TIPOIDENTIFICACION")
    public ServiceResponse tGSINC1TIPOIDENTIFICACION(TGSINC1TIPOIDENTIFICACIONRequest request);


    @POST
    @Path(value = "/TGSINC1TIPOINSTITUCION")
    public ServiceResponse tGSINC1TIPOINSTITUCION(TGSINC1TIPOINSTITUCIONRequest request);


    @POST
    @Path(value = "/TGSINC1TIPOSUCURSAL")
    public ServiceResponse tGSINC1TIPOSUCURSAL(TGSINC1TIPOSUCURSALRequest request);


    @POST
    @Path(value = "/TGSINCDEPARTAMENTOS")
    public ServiceResponse tGSINCDEPARTAMENTOS(TGSINCDEPARTAMENTOSRequest request);


    @POST
    @Path(value = "/TGFIJARDATOSSINC")
    public ServiceResponse tGFIJARDATOSSINC(TGFIJARDATOSSINCRequest request);


    @POST
    @Path(value = "/TGSINCENTIDADESFIN")
    public ServiceResponse tGSINCENTIDADESFIN(TGSINCENTIDADESFINRequest request);


    @POST
    @Path(value = "/OGSINCEPSS")
    public ServiceResponse oGSINCEPSS(OGSINCEPSSRequest request);


    @POST
    @Path(value = "/TGSINCESTADOSBENEFICIARIO")
    public ServiceResponse tGSINCESTADOSBENEFICIARIO(TGSINCESTADOSBENEFICIARIORequest request);


    @POST
    @Path(value = "/TGSINCESTADOSCIVILES")
    public ServiceResponse tGSINCESTADOSCIVILES(TGSINCESTADOSCIVILESRequest request);


    @POST
    @Path(value = "/TGSINCESTADOSCONTRATO")
    public ServiceResponse tGSINCESTADOSCONTRATO(TGSINCESTADOSCONTRATORequest request);


    @POST
    @Path(value = "/TGSINCESTADOSPERSONA")
    public ServiceResponse tGSINCESTADOSPERSONA(TGSINCESTADOSPERSONARequest request);


    @POST
    @Path(value = "/TGSINCFORMASPAGO")
    public ServiceResponse tGSINCFORMASPAGO(TGSINCFORMASPAGORequest request);


    @POST
    @Path(value = "/OGSINCGRUPOSASOCIADOS")
    public ServiceResponse oGSINCGRUPOSASOCIADOS(OGSINCGRUPOSASOCIADOSRequest request);


    @POST
    @Path(value = "/OGSINCMUNICIPIOS")
    public ServiceResponse oGSINCMUNICIPIOS(OGSINCMUNICIPIOSRequest request);


    @POST
    @Path(value = "/OGSINCOMPANIAS")
    public ServiceResponse oGSINCOMPANIAS(OGSINCOMPANIASRequest request);


    @POST
    @Path(value = "/TGSINCPAISES")
    public ServiceResponse tGSINCPAISES(TGSINCPAISESRequest request);


    @POST
    @Path(value = "/TGSINCPARENTESCOS")
    public ServiceResponse tGSINCPARENTESCOS(TGSINCPARENTESCOSRequest request);


    @POST
    @Path(value = "/TGSINCPERIODICIDADES")
    public ServiceResponse tGSINCPERIODICIDADES(TGSINCPERIODICIDADESRequest request);


    @POST
    @Path(value = "/TGSINCPLANES")
    public ServiceResponse tGSINCPLANES(TGSINCPLANESRequest request);


    @POST
    @Path(value = "/TGSINCPRODUCTOS")
    public ServiceResponse tGSINCPRODUCTOS(TGSINCPRODUCTOSRequest request);


    @POST
    @Path(value = "/TGSINCREGIONALES")
    public ServiceResponse tGSINCREGIONALES(TGSINCREGIONALESRequest request);


    @POST
    @Path(value = "/OGSINCSUCURSALES")
    public ServiceResponse oGSINCSUCURSALES(OGSINCSUCURSALESRequest request);


    @POST
    @Path(value = "/TGSINCTIPOSDEENTIDAD")
    public ServiceResponse tGSINCTIPOSDEENTIDAD(TGSINCTIPOSDEENTIDADRequest request);


    @POST
    @Path(value = "/TGSINCTIPOSDIRECCION")
    public ServiceResponse tGSINCTIPOSDIRECCION(TGSINCTIPOSDIRECCIONRequest request);


    @POST
    @Path(value = "/TGSINCTIPOSIDENTIFICACION")
    public ServiceResponse tGSINCTIPOSIDENTIFICACION(TGSINCTIPOSIDENTIFICACIONRequest request);


    @POST
    @Path(value = "/TGSINCTIPOSINSTITUCION")
    public ServiceResponse tGSINCTIPOSINSTITUCION(TGSINCTIPOSINSTITUCIONRequest request);


    @POST
    @Path(value = "/TGSINCTIPOSSUCURSAL")
    public ServiceResponse tGSINCTIPOSSUCURSAL(TGSINCTIPOSSUCURSALRequest request);


    @POST
    @Path(value = "/OGSINCRONIZARPARAMETRICAS")
    public ServiceResponse oGSINCRONIZARPARAMETRICAS(OGSINCRONIZARPARAMETRICASRequest request);

}
