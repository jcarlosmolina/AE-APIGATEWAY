package com.keralty.ae.api.logincompatibilidades;

import com.keralty.ae.persistence.LogIncompatibilidades;
import com.keralty.ae.persistence.oid.LogIncompatibilidadesOid;
import com.keralty.ae.service.LogIncompatibilidadesService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.InstanceResponseViewModel;
import com.keralty.ae.viewmodel.logincompatibilidades.siu.TCREARRequest;
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

@Path("/api/LogIncompatibilidadesApi")
@RequestScoped
public class LogIncompatibilidadesApi {

    @RestClient
    LogIncompatibilidadesService service;

    JsonWebToken jwt; 

    public LogIncompatibilidadesApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{logIncompatibilidadesidLogIncompatibilidades}")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin"})
    public LogIncompatibilidades getInstance(Long logIncompatibilidadesidLogIncompatibilidades) {
    	return service.getById(logIncompatibilidadesidLogIncompatibilidades);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin"})
    public List<LogIncompatibilidades> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin"})
    public LogIncompatibilidades getByOid(LogIncompatibilidadesOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin"})
    public LogIncompatibilidades getByOIDWithHV(LogIncompatibilidadesOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetLogIncompatibilidadesDynamic")
    @RolesAllowed({"Admin","SuperAdmin"})
    public InstanceResponseViewModel getLogIncompatibilidadesDynamic(QueryRequest request) {
        return service.getLogIncompatibilidadesDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Admin","SuperAdmin"})
    public PopulationResponseViewModel getLogIncompatibilidadesPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/TCREAR")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse logIncompatibilidadesTCREAR(TCREARRequest request) {
        return service.tCREAR(request);
    }
    
}
