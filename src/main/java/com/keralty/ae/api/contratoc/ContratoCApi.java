package com.keralty.ae.api.contratoc;

import com.keralty.ae.persistence.ContratoC;
import com.keralty.ae.persistence.oid.ContratoCOid;
import com.keralty.ae.service.ContratoCService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.contratoc.siu.TELIMINARRequest;
import com.keralty.ae.viewmodel.contratoc.siu.TNEWDESDEAERequest;
import com.keralty.ae.viewmodel.contratoc.siu.TNEWDESDEAEResponse;
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

@Path("/api/ContratoCApi")
@RequestScoped
public class ContratoCApi {

    @RestClient
    ContratoCService service;

    JsonWebToken jwt; 

    public ContratoCApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{contratoCID}")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public ContratoC getInstance(Long contratoCID) {
    	return service.getById(contratoCID);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public List<ContratoC> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public ContratoC getByOid(ContratoCOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public ContratoC getByOIDWithHV(ContratoCOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetContratoCDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public InstanceResponseViewModel getContratoCDynamic(QueryRequest request) {
        return service.getContratoCDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PopulationResponseViewModel getContratoCPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/TELIMINAR")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse contratoCTELIMINAR(TELIMINARRequest request) {
        return service.tELIMINAR(request);
    }
    

    @POST
    @Path(value = "/TNEWDESDEAE")
    @RolesAllowed({"SuperAdmin"})
    public TNEWDESDEAEResponse contratoCTNEWDESDEAE(TNEWDESDEAERequest request) {
        return service.tNEWDESDEAE(request);
    }
    
}
