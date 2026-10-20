package com.keralty.ae.service;

import com.keralty.ae.viewmodel.globalservices.siu.OGETREPORTERequest;
import com.keralty.ae.viewmodel.globalservices.siu.OGETREPORTEResponse;
import com.keralty.ae.viewmodel.globalservices.siu.OGETREPORTSOLNOVRequest;
import com.keralty.ae.viewmodel.globalservices.siu.OGETREPORTSOLNOVResponse;
import com.keralty.ae.viewmodel.globalservices.siu.OGETREPORTSOLRequest;
import com.keralty.ae.viewmodel.globalservices.siu.OGETREPORTSOLResponse;
import com.keralty.ae.viewmodel.globalservices.siu.TGENFILELEGALIZACOMRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGENFILELEGALIZACOMResponse;
import com.keralty.ae.viewmodel.globalservices.siu.TGENREPALMRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGENREPALMResponse;
import com.keralty.ae.viewmodel.ServiceResponse;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.POST;
import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/api/GlobalServicesApi")
@RegisterRestClient(configKey="ae-reportes")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aereportes}")
public interface GlobalServicesProxy4aereportes {

    @POST
    @Path(value = "/TGENFILELEGALIZACOM")
    public TGENFILELEGALIZACOMResponse tGENFILELEGALIZACOM(TGENFILELEGALIZACOMRequest request);


    @POST
    @Path(value = "/OGETREPORTSOL")
    public OGETREPORTSOLResponse oGETREPORTSOL(OGETREPORTSOLRequest request);


    @POST
    @Path(value = "/OGETREPORTE")
    public OGETREPORTEResponse oGETREPORTE(OGETREPORTERequest request);


    @POST
    @Path(value = "/OGETREPORTSOLNOV")
    public OGETREPORTSOLNOVResponse oGETREPORTSOLNOV(OGETREPORTSOLNOVRequest request);


    @POST
    @Path(value = "/TGENREPALM")
    public TGENREPALMResponse tGENREPALM(TGENREPALMRequest request);

}
