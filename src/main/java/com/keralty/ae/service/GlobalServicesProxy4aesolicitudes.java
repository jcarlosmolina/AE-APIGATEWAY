package com.keralty.ae.service;

import com.keralty.ae.viewmodel.globalservices.siu.OGANULARSOLAUXRequest;
import com.keralty.ae.viewmodel.globalservices.siu.OGANULARSOLRequest;
import com.keralty.ae.viewmodel.globalservices.siu.OGASIGUSUARIOSRequest;
import com.keralty.ae.viewmodel.globalservices.siu.OGASIGUSUARIOSResponse;
import com.keralty.ae.viewmodel.globalservices.siu.OGSOLICITUDFISICALEERRequest;
import com.keralty.ae.viewmodel.globalservices.siu.OGSOLICITUDFISICALEERResponse;
import com.keralty.ae.viewmodel.globalservices.siu.TGSOLICITUDFISICACARGARRequest;
import com.keralty.ae.viewmodel.ServiceResponse;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.POST;
import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/api/GlobalServicesApi")
@RegisterRestClient(configKey="ae-solicitudes")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aesolicitudes}")
public interface GlobalServicesProxy4aesolicitudes {

    @POST
    @Path(value = "/OGANULARSOL")
    public ServiceResponse oGANULARSOL(OGANULARSOLRequest request);


    @POST
    @Path(value = "/OGANULARSOLAUX")
    public ServiceResponse oGANULARSOLAUX(OGANULARSOLAUXRequest request);


    @POST
    @Path(value = "/OGASIGUSUARIOS")
    public OGASIGUSUARIOSResponse oGASIGUSUARIOS(OGASIGUSUARIOSRequest request);


    @POST
    @Path(value = "/TGSOLICITUDFISICACARGAR")
    public ServiceResponse tGSOLICITUDFISICACARGAR(TGSOLICITUDFISICACARGARRequest request);


    @POST
    @Path(value = "/OGSOLICITUDFISICALEER")
    public OGSOLICITUDFISICALEERResponse oGSOLICITUDFISICALEER(OGSOLICITUDFISICALEERRequest request);

}
