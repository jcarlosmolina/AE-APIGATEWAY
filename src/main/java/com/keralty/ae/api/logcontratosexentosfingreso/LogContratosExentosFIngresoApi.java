package com.keralty.ae.api.logcontratosexentosfingreso;

import com.keralty.ae.persistence.LogContratosExentosFIngreso;
import com.keralty.ae.persistence.oid.LogContratosExentosFIngresoOid;
import com.keralty.ae.service.LogContratosExentosFIngresoService;
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

@Path("/api/LogContratosExentosFIngresoApi")
@RequestScoped
public class LogContratosExentosFIngresoApi {

    @RestClient
    LogContratosExentosFIngresoService service;

    JsonWebToken jwt; 

    public LogContratosExentosFIngresoApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{logContratosExentosFIngresoidLogContratosExentosFIngreso}")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","MesaDeApoyo"})
    public LogContratosExentosFIngreso getInstance(Long logContratosExentosFIngresoidLogContratosExentosFIngreso) {
    	return service.getById(logContratosExentosFIngresoidLogContratosExentosFIngreso);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","MesaDeApoyo"})
    public List<LogContratosExentosFIngreso> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","MesaDeApoyo"})
    public LogContratosExentosFIngreso getByOid(LogContratosExentosFIngresoOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","MesaDeApoyo"})
    public LogContratosExentosFIngreso getByOIDWithHV(LogContratosExentosFIngresoOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetLogContratosExentosFIngresoDynamic")
    @RolesAllowed({"Admin","SuperAdmin","MesaDeApoyo"})
    public InstanceResponseViewModel getLogContratosExentosFIngresoDynamic(QueryRequest request) {
        return service.getLogContratosExentosFIngresoDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Admin","SuperAdmin","MesaDeApoyo"})
    public PopulationResponseViewModel getLogContratosExentosFIngresoPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

}
