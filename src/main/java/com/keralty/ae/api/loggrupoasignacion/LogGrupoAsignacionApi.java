package com.keralty.ae.api.loggrupoasignacion;

import com.keralty.ae.persistence.LogGrupoAsignacion;
import com.keralty.ae.persistence.oid.LogGrupoAsignacionOid;
import com.keralty.ae.service.LogGrupoAsignacionService;
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

@Path("/api/LogGrupoAsignacionApi")
@RequestScoped
public class LogGrupoAsignacionApi {

    @RestClient
    LogGrupoAsignacionService service;

    JsonWebToken jwt; 

    public LogGrupoAsignacionApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{logGrupoAsignacionId}")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin"})
    public LogGrupoAsignacion getInstance(Long logGrupoAsignacionId) {
    	return service.getById(logGrupoAsignacionId);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin"})
    public List<LogGrupoAsignacion> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin"})
    public LogGrupoAsignacion getByOid(LogGrupoAsignacionOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin"})
    public LogGrupoAsignacion getByOIDWithHV(LogGrupoAsignacionOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetLogGrupoAsignacionDynamic")
    @RolesAllowed({"Admin","SuperAdmin"})
    public InstanceResponseViewModel getLogGrupoAsignacionDynamic(QueryRequest request) {
        return service.getLogGrupoAsignacionDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Admin","SuperAdmin"})
    public PopulationResponseViewModel getLogGrupoAsignacionPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

}
