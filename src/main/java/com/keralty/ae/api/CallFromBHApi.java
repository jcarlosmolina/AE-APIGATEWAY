package com.keralty.ae.api;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.keralty.ae.service.GlobalServicesProxy4aegenerasolicitud;
import com.keralty.ae.viewmodel.globalservices.siu.TGRPTACTRINCRequest;
import com.keralty.ae.viewmodel.globalservices.siu.TGRPTACTRINCResponse;
import com.keralty.integraciones.contractresponse.request.ContractResponseRequest;
import com.keralty.integraciones.contractresponse.response.ContractResponseResponse;

import jakarta.annotation.security.RolesAllowed;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/restsrv")
@RequestScoped
@RolesAllowed({"UsuarioSistemaExterno"})
public class CallFromBHApi {

	@RestClient
    GlobalServicesProxy4aegenerasolicitud proxy4aegenerasolicitud;

    @POST
    @Path(value = "/rptacontrato/registerContractResponse")
    public ContractResponseResponse tGRPTACTRNEW(ContractResponseRequest request) {
        return proxy4aegenerasolicitud.tGRPTACTRNEW(request);
    }

    @POST
    @Path(value = "/rptacontrato/includeBeneficiaryResponse")
    public ContractResponseResponse tGRPTACTRINC(ContractResponseRequest request) {
        return proxy4aegenerasolicitud.tGRPTACTRINC(request);
    }

}
