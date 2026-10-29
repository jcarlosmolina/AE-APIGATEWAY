package com.keralty.ae.service;

import com.keralty.ae.viewmodel.globalservices.siu.TGADDUSUARIODECONTRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSELECCONTRATOASOCRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSELECCONTRATOASOCTITRequest;
import com.keralty.ae.viewmodel.ServiceResponse;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.POST;
import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/api/GlobalServicesApi")
@RegisterRestClient(configKey="ae-personas")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aepersonas}")
public interface GlobalServicesProxy4aepersonas {

    @POST
    @Path(value = "/TGSELECCONTRATOASOC")
    public ServiceResponse tGSELECCONTRATOASOC(TGSELECCONTRATOASOCRequest request);


    @POST
    @Path(value = "/TGSELECCONTRATOASOCCheckPreconditions")
    public ServiceResponse tGSELECCONTRATOASOCCheckPreconditions(TGSELECCONTRATOASOCRequest request);

    @POST
    @Path(value = "/TGADDUSUARIODECONT")
    public ServiceResponse tGADDUSUARIODECONT(TGADDUSUARIODECONTRequest request);


    @POST
    @Path(value = "/TGSELECCONTRATOASOCTIT")
    public ServiceResponse tGSELECCONTRATOASOCTIT(TGSELECCONTRATOASOCTITRequest request);


    @POST
    @Path(value = "/TGSELECCONTRATOASOCTITCheckPreconditions")
    public ServiceResponse tGSELECCONTRATOASOCTITCheckPreconditions(TGSELECCONTRATOASOCTITRequest request);
}
