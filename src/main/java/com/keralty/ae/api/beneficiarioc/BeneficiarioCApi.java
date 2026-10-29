package com.keralty.ae.api.beneficiarioc;

import com.keralty.ae.persistence.BeneficiarioC;
import com.keralty.ae.persistence.oid.BeneficiarioCOid;
import com.keralty.ae.service.BeneficiarioCService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.beneficiarioc.siu.TELIMINARRequest;
import com.keralty.ae.viewmodel.InstanceResponseViewModel;
import com.keralty.ae.viewmodel.PopulationResponseViewModel;
import com.keralty.ae.viewmodel.QueryRequest;
import com.keralty.ae.viewmodel.ServiceResponse;
import jakarta.annotation.security.RolesAllowed;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.POST;
import java.util.List;
import org.eclipse.microprofile.jwt.JsonWebToken;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/api/BeneficiarioCApi")
@RequestScoped
public class BeneficiarioCApi {

    @RestClient
    BeneficiarioCService service;

    JsonWebToken jwt; 

    public BeneficiarioCApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{contratoCContratoCID}/{beneficiarioCID}")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public BeneficiarioC getInstance(Long contratoCContratoCID, Long beneficiarioCID) {
    	return service.getById(contratoCContratoCID, beneficiarioCID);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public List<BeneficiarioC> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public BeneficiarioC getByOid(BeneficiarioCOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public BeneficiarioC getByOIDWithHV(BeneficiarioCOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetBeneficiarioCDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public InstanceResponseViewModel getBeneficiarioCDynamic(QueryRequest request) {
        return service.getBeneficiarioCDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PopulationResponseViewModel getBeneficiarioCPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/TELIMINAR")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse beneficiarioCTELIMINAR(TELIMINARRequest request) {
        return service.tELIMINAR(request);
    }
    
}
