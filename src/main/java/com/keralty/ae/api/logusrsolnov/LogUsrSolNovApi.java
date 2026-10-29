package com.keralty.ae.api.logusrsolnov;

import com.keralty.ae.persistence.LogUsrSolNov;
import com.keralty.ae.persistence.oid.LogUsrSolNovOid;
import com.keralty.ae.service.LogUsrSolNovService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.InstanceResponseViewModel;
import com.keralty.ae.viewmodel.PopulationResponseViewModel;
import com.keralty.ae.viewmodel.QueryRequest;
import jakarta.annotation.security.RolesAllowed;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.POST;
import java.util.List;
import org.eclipse.microprofile.jwt.JsonWebToken;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/api/LogUsrSolNovApi")
@RequestScoped
public class LogUsrSolNovApi {

    @RestClient
    LogUsrSolNovService service;

    JsonWebToken jwt; 

    public LogUsrSolNovApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{logUsrSolNovId}")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","MesaDeApoyo"})
    public LogUsrSolNov getInstance(Long logUsrSolNovId) {
    	return service.getById(logUsrSolNovId);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","MesaDeApoyo"})
    public List<LogUsrSolNov> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","MesaDeApoyo"})
    public LogUsrSolNov getByOid(LogUsrSolNovOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","MesaDeApoyo"})
    public LogUsrSolNov getByOIDWithHV(LogUsrSolNovOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetLogUsrSolNovDynamic")
    @RolesAllowed({"Admin","SuperAdmin","MesaDeApoyo"})
    public InstanceResponseViewModel getLogUsrSolNovDynamic(QueryRequest request) {
        return service.getLogUsrSolNovDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Admin","SuperAdmin","MesaDeApoyo"})
    public PopulationResponseViewModel getLogUsrSolNovPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

}
