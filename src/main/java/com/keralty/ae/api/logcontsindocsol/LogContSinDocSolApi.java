package com.keralty.ae.api.logcontsindocsol;

import com.keralty.ae.persistence.LogContSinDocSol;
import com.keralty.ae.persistence.oid.LogContSinDocSolOid;
import com.keralty.ae.service.LogContSinDocSolService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.InstanceResponseViewModel;
import com.keralty.ae.viewmodel.logcontsindocsol.siu.EliminarRequest;
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

@Path("/api/LogContSinDocSolApi")
@RequestScoped
public class LogContSinDocSolApi {

    @RestClient
    LogContSinDocSolService service;

    JsonWebToken jwt; 

    public LogContSinDocSolApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{logContSinDocSolidLogContSinDocSol}")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin"})
    public LogContSinDocSol getInstance(Long logContSinDocSolidLogContSinDocSol) {
    	return service.getById(logContSinDocSolidLogContSinDocSol);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin"})
    public List<LogContSinDocSol> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin"})
    public LogContSinDocSol getByOid(LogContSinDocSolOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin"})
    public LogContSinDocSol getByOIDWithHV(LogContSinDocSolOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetLogContSinDocSolDynamic")
    @RolesAllowed({"Admin","SuperAdmin"})
    public InstanceResponseViewModel getLogContSinDocSolDynamic(QueryRequest request) {
        return service.getLogContSinDocSolDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Admin","SuperAdmin"})
    public PopulationResponseViewModel getLogContSinDocSolPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/eliminar")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse logContSinDocSolEliminar(EliminarRequest request) {
        return service.eliminar(request);
    }
    
}
