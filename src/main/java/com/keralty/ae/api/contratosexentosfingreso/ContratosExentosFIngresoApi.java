package com.keralty.ae.api.contratosexentosfingreso;

import com.keralty.ae.persistence.ContratosExentosFIngreso;
import com.keralty.ae.persistence.oid.ContratosExentosFIngresoOid;
import com.keralty.ae.service.ContratosExentosFIngresoService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.InstanceResponseViewModel;
import com.keralty.ae.viewmodel.PopulationResponseViewModel;
import com.keralty.ae.viewmodel.PreloadResponseViewModel;
import com.keralty.ae.viewmodel.PreloadViewModel;
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

@Path("/api/ContratosExentosFIngresoApi")
@RequestScoped
public class ContratosExentosFIngresoApi {

    @RestClient
    ContratosExentosFIngresoService service;

    JsonWebToken jwt; 

    public ContratosExentosFIngresoApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{contratosExentosFIngresoidContratosExentosFIngreso}")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","MesaDeApoyo"})
    public ContratosExentosFIngreso getInstance(Long contratosExentosFIngresoidContratosExentosFIngreso) {
    	return service.getById(contratosExentosFIngresoidContratosExentosFIngreso);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","MesaDeApoyo"})
    public List<ContratosExentosFIngreso> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","MesaDeApoyo"})
    public ContratosExentosFIngreso getByOid(ContratosExentosFIngresoOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","MesaDeApoyo"})
    public ContratosExentosFIngreso getByOIDWithHV(ContratosExentosFIngresoOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetContratosExentosFIngresoDynamic")
    @RolesAllowed({"Admin","SuperAdmin","MesaDeApoyo"})
    public InstanceResponseViewModel getContratosExentosFIngresoDynamic(QueryRequest request) {
        return service.getContratosExentosFIngresoDynamic(request);
    }

    @POST
    @Path(value = "/GetWithDisplaySetDynamic")
    @RolesAllowed({"Admin","SuperAdmin","MesaDeApoyo"})
    public PreloadResponseViewModel getContratosExentosFIngresoWithDisplaySetDynamic(QueryRequest request) {
        return (PreloadResponseViewModel) service.getWithDisplaySetDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Admin","SuperAdmin","MesaDeApoyo"})
    public PopulationResponseViewModel getContratosExentosFIngresoPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

}
