package com.keralty.ae.api.loghistoricoplanes;

import com.keralty.ae.persistence.LogHistoricoPlanes;
import com.keralty.ae.persistence.oid.LogHistoricoPlanesOid;
import com.keralty.ae.service.LogHistoricoPlanesService;
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

@Path("/api/LogHistoricoPlanesApi")
@RequestScoped
public class LogHistoricoPlanesApi {

    @RestClient
    LogHistoricoPlanesService service;

    JsonWebToken jwt; 

    public LogHistoricoPlanesApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{logHistoricoPlanesidLogHistoricoPlanes}")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin"})
    public LogHistoricoPlanes getInstance(Long logHistoricoPlanesidLogHistoricoPlanes) {
    	return service.getById(logHistoricoPlanesidLogHistoricoPlanes);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin"})
    public List<LogHistoricoPlanes> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin"})
    public LogHistoricoPlanes getByOid(LogHistoricoPlanesOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin"})
    public LogHistoricoPlanes getByOIDWithHV(LogHistoricoPlanesOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetLogHistoricoPlanesDynamic")
    @RolesAllowed({"Admin","SuperAdmin"})
    public InstanceResponseViewModel getLogHistoricoPlanesDynamic(QueryRequest request) {
        return service.getLogHistoricoPlanesDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Admin","SuperAdmin"})
    public PopulationResponseViewModel getLogHistoricoPlanesPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

}
