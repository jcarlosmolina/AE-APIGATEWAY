package com.keralty.ae.service;

import com.keralty.ae.viewmodel.globalservices.siu.OGSOLNOVSETTRAMITADORequest;
import com.keralty.ae.viewmodel.globalservices.siu.OGSOLNOVSETTRAMITADOResponse;
import com.keralty.ae.viewmodel.globalservices.siu.TGSOLNOVSETTRARequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGSOLNOVSETTRAResponse;
import com.keralty.ae.viewmodel.ServiceResponse;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.POST;
import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/api/GlobalServicesApi")
@RegisterRestClient(configKey="ae-novedades")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aenovedades}")
public interface GlobalServicesProxy4aenovedades {

    @POST
    @Path(value = "/OGSOLNOVSETTRAMITADO")
    public OGSOLNOVSETTRAMITADOResponse oGSOLNOVSETTRAMITADO(OGSOLNOVSETTRAMITADORequest request);


    @POST
    @Path(value = "/TGSOLNOVSETTRA")
    public TGSOLNOVSETTRAResponse tGSOLNOVSETTRA(TGSOLNOVSETTRARequest request);

}
