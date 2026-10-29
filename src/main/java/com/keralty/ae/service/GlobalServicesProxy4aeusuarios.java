package com.keralty.ae.service;

import com.keralty.ae.viewmodel.globalservices.siu.OGCARGAPLANASESORRequest;
import com.keralty.ae.viewmodel.globalservices.siu.OGCARGAPLANASESORResponse;
import com.keralty.ae.viewmodel.globalservices.siu.OGCARGAVISASESORESRequest;
import com.keralty.ae.viewmodel.globalservices.siu.OGCARGAVISASESORESResponse;
import com.keralty.ae.viewmodel.globalservices.siu.OGSINCAGENTESXPRODRequest;
import com.keralty.ae.viewmodel.globalservices.siu.OGSINCASESORESRequest;
import com.keralty.ae.viewmodel.globalservices.siu.OGSINCASESORESResponse;
import com.keralty.ae.viewmodel.globalservices.siu.OGSINCSUCURSALESRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TCREARAGENTERequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGFIJARDATOSSINCRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGMODASESORAGENCIARequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGNEWASESORAGENCIARequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGNEWASESORAGENCIAResponse;
import com.keralty.ae.viewmodel.globalservices.siu.TGPOSPROCESARASESORESRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGPOSPROCESS1ASESORRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINC1AGENTEXPRODAUXRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINC1AGENTEXPRODRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINC1ASESORAUXRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINC1ASESORRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINC1PRODUCTORequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINC1SUCURSALAUXRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINC1SUCURSALRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINC1TIPOIDENTIFICACIONRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINCPRODUCTOSRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSINCTIPOSIDENTIFICACIONRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGVERIFICARUSUARIORequest;
import com.keralty.ae.viewmodel.globalservices.siu.TMODIFICARAGENTERequest;
import com.keralty.ae.viewmodel.ServiceResponse;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.POST;
import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/api/GlobalServicesApi")
@RegisterRestClient(configKey="ae-usuarios")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aeusuarios}")
public interface GlobalServicesProxy4aeusuarios {

    @POST
    @Path(value = "/OGCARGAPLANASESOR")
    public OGCARGAPLANASESORResponse oGCARGAPLANASESOR(OGCARGAPLANASESORRequest request);


    @POST
    @Path(value = "/OGCARGAVISASESORES")
    public OGCARGAVISASESORESResponse oGCARGAVISASESORES(OGCARGAVISASESORESRequest request);


    @POST
    @Path(value = "/OGSINCAGENTESXPROD")
    public ServiceResponse oGSINCAGENTESXPROD(OGSINCAGENTESXPRODRequest request);


    @POST
    @Path(value = "/TGSINC1AGENTEXPROD")
    public ServiceResponse tGSINC1AGENTEXPROD(TGSINC1AGENTEXPRODRequest request);


    @POST
    @Path(value = "/TGSINCPRODUCTOS")
    public ServiceResponse tGSINCPRODUCTOS(TGSINCPRODUCTOSRequest request);


    @POST
    @Path(value = "/TGSINC1PRODUCTO")
    public ServiceResponse tGSINC1PRODUCTO(TGSINC1PRODUCTORequest request);


    @POST
    @Path(value = "/TGFIJARDATOSSINC")
    public ServiceResponse tGFIJARDATOSSINC(TGFIJARDATOSSINCRequest request);


    @POST
    @Path(value = "/TGSINC1AGENTEXPRODAUX")
    public ServiceResponse tGSINC1AGENTEXPRODAUX(TGSINC1AGENTEXPRODAUXRequest request);


    @POST
    @Path(value = "/OGSINCASESORES")
    public OGSINCASESORESResponse oGSINCASESORES(OGSINCASESORESRequest request);


    @POST
    @Path(value = "/OGSINCSUCURSALES")
    public ServiceResponse oGSINCSUCURSALES(OGSINCSUCURSALESRequest request);


    @POST
    @Path(value = "/TGSINC1SUCURSAL")
    public ServiceResponse tGSINC1SUCURSAL(TGSINC1SUCURSALRequest request);


    @POST
    @Path(value = "/TGSINC1SUCURSALAUX")
    public ServiceResponse tGSINC1SUCURSALAUX(TGSINC1SUCURSALAUXRequest request);


    @POST
    @Path(value = "/TGSINCTIPOSIDENTIFICACION")
    public ServiceResponse tGSINCTIPOSIDENTIFICACION(TGSINCTIPOSIDENTIFICACIONRequest request);


    @POST
    @Path(value = "/TGSINC1TIPOIDENTIFICACION")
    public ServiceResponse tGSINC1TIPOIDENTIFICACION(TGSINC1TIPOIDENTIFICACIONRequest request);


    @POST
    @Path(value = "/TGSINC1ASESOR")
    public ServiceResponse tGSINC1ASESOR(TGSINC1ASESORRequest request);


    @POST
    @Path(value = "/TGSINC1ASESORAUX")
    public ServiceResponse tGSINC1ASESORAUX(TGSINC1ASESORAUXRequest request);


    @POST
    @Path(value = "/TGPOSPROCESARASESORES")
    public ServiceResponse tGPOSPROCESARASESORES(TGPOSPROCESARASESORESRequest request);


    @POST
    @Path(value = "/TCREARAGENTE")
    public ServiceResponse tCREARAGENTE(TCREARAGENTERequest request);


    @POST
    @Path(value = "/TCREARAGENTECheckPreconditions")
    public ServiceResponse tCREARAGENTECheckPreconditions(TCREARAGENTERequest request);

    @POST
    @Path(value = "/TGMODASESORAGENCIA")
    public ServiceResponse tGMODASESORAGENCIA(TGMODASESORAGENCIARequest request);


    @POST
    @Path(value = "/TGMODASESORAGENCIACheckPreconditions")
    public ServiceResponse tGMODASESORAGENCIACheckPreconditions(TGMODASESORAGENCIARequest request);

    @POST
    @Path(value = "/TGNEWASESORAGENCIA")
    public TGNEWASESORAGENCIAResponse tGNEWASESORAGENCIA(TGNEWASESORAGENCIARequest request);


    @POST
    @Path(value = "/TGNEWASESORAGENCIACheckPreconditions")
    public TGNEWASESORAGENCIAResponse tGNEWASESORAGENCIACheckPreconditions(TGNEWASESORAGENCIARequest request);

    @POST
    @Path(value = "/TGPOSPROCESS1ASESOR")
    public ServiceResponse tGPOSPROCESS1ASESOR(TGPOSPROCESS1ASESORRequest request);


    @POST
    @Path(value = "/TGVERIFICARUSUARIO")
    public ServiceResponse tGVERIFICARUSUARIO(TGVERIFICARUSUARIORequest request);


    @POST
    @Path(value = "/TMODIFICARAGENTE")
    public ServiceResponse tMODIFICARAGENTE(TMODIFICARAGENTERequest request);


    @POST
    @Path(value = "/TMODIFICARAGENTECheckPreconditions")
    public ServiceResponse tMODIFICARAGENTECheckPreconditions(TMODIFICARAGENTERequest request);
}
