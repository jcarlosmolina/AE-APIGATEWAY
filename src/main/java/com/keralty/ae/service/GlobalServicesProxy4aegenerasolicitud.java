package com.keralty.ae.service;

import com.keralty.ae.viewmodel.globalservices.siu.OGENERARSOLICITUD2Request;
import com.keralty.ae.viewmodel.globalservices.siu.OGENERARSOLICITUD2Response;
import com.keralty.ae.viewmodel.globalservices.siu.TGACTDIRECCIONESRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGACTPERSONAENCORERequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGACTPERSONAENCOREResponse;
import com.keralty.ae.viewmodel.globalservices.siu.TGACTTIPOFACTURARequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGCREARACTPERSONACORERequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGCREARACTPERSONACOREResponse;
import com.keralty.ae.viewmodel.globalservices.siu.TGCREARCONTRATOCORERequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGCREARCONTRATOCOREResponse;
import com.keralty.ae.viewmodel.globalservices.siu.TGCREARPERSONACORERequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGCREARPERSONACOREResponse;
import com.keralty.ae.viewmodel.globalservices.siu.TGINCLUSIONCONTRATOCORERequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGINCLUSIONCONTRATOCOREResponse;
import com.keralty.ae.viewmodel.globalservices.siu.TGNOTIFICARANULARRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGNOTIFICARCREARRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGNOTIFICARINCLUSIONRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGRPTACTRINCRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGRPTACTRINCResponse;
import com.keralty.ae.viewmodel.globalservices.siu.TGRPTACTRNEWRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGRPTACTRNEWResponse;
import com.keralty.ae.viewmodel.ServiceResponse;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.POST;
import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/api/GlobalServicesApi")
@RegisterRestClient(configKey="ae-generasolicitud")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aegenerasolicitud}")
public interface GlobalServicesProxy4aegenerasolicitud {

    @POST
    @Path(value = "/OGENERARSOLICITUD2")
    public OGENERARSOLICITUD2Response oGENERARSOLICITUD2(OGENERARSOLICITUD2Request request);


    @POST
    @Path(value = "/OGENERARSOLICITUD2CheckPreconditions")
    public OGENERARSOLICITUD2Response oGENERARSOLICITUD2CheckPreconditions(OGENERARSOLICITUD2Request request);

    @POST
    @Path(value = "/TGCREARACTPERSONACORE")
    public TGCREARACTPERSONACOREResponse tGCREARACTPERSONACORE(TGCREARACTPERSONACORERequest request);


    @POST
    @Path(value = "/TGACTPERSONAENCORE")
    public TGACTPERSONAENCOREResponse tGACTPERSONAENCORE(TGACTPERSONAENCORERequest request);


    @POST
    @Path(value = "/TGCREARPERSONACORE")
    public TGCREARPERSONACOREResponse tGCREARPERSONACORE(TGCREARPERSONACORERequest request);


    @POST
    @Path(value = "/TGACTDIRECCIONES")
    public ServiceResponse tGACTDIRECCIONES(TGACTDIRECCIONESRequest request);


    @POST
    @Path(value = "/TGACTTIPOFACTURA")
    public ServiceResponse tGACTTIPOFACTURA(TGACTTIPOFACTURARequest request);


    @POST
    @Path(value = "/TGCREARCONTRATOCORE")
    public TGCREARCONTRATOCOREResponse tGCREARCONTRATOCORE(TGCREARCONTRATOCORERequest request);


    @POST
    @Path(value = "/TGINCLUSIONCONTRATOCORE")
    public TGINCLUSIONCONTRATOCOREResponse tGINCLUSIONCONTRATOCORE(TGINCLUSIONCONTRATOCORERequest request);


    @POST
    @Path(value = "/TGNOTIFICARANULAR")
    public ServiceResponse tGNOTIFICARANULAR(TGNOTIFICARANULARRequest request);


    @POST
    @Path(value = "/TGNOTIFICARCREAR")
    public ServiceResponse tGNOTIFICARCREAR(TGNOTIFICARCREARRequest request);


    @POST
    @Path(value = "/TGNOTIFICARINCLUSION")
    public ServiceResponse tGNOTIFICARINCLUSION(TGNOTIFICARINCLUSIONRequest request);


    @POST
    @Path(value = "/TGRPTACTRNEW")
    public TGRPTACTRNEWResponse tGRPTACTRNEW(TGRPTACTRNEWRequest request);


    @POST
    @Path(value = "/TGRPTACTRINC")
    public TGRPTACTRINCResponse tGRPTACTRINC(TGRPTACTRINCRequest request);

}
