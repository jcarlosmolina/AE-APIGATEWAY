package com.keralty.ae.api.contsindocsol;

import com.keralty.ae.persistence.ContSinDocSol;
import com.keralty.ae.persistence.oid.ContSinDocSolOid;
import com.keralty.ae.service.ContSinDocSolService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.contsindocsol.siu.CrearRequest;
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

@Path("/api/ContSinDocSolApi")
@RequestScoped
public class ContSinDocSolApi {

    @RestClient
    ContSinDocSolService service;

    JsonWebToken jwt; 

    public ContSinDocSolApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{contSinDocSolidContSinDocSol}")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Gestor","MesaDeApoyo"})
    public ContSinDocSol getInstance(Long contSinDocSolidContSinDocSol) {
    	return service.getById(contSinDocSolidContSinDocSol);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Gestor","MesaDeApoyo"})
    public List<ContSinDocSol> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Gestor","MesaDeApoyo"})
    public ContSinDocSol getByOid(ContSinDocSolOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Gestor","MesaDeApoyo"})
    public ContSinDocSol getByOIDWithHV(ContSinDocSolOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetContSinDocSolDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Gestor","MesaDeApoyo"})
    public InstanceResponseViewModel getContSinDocSolDynamic(QueryRequest request) {
        return service.getContSinDocSolDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Gestor","MesaDeApoyo"})
    public PopulationResponseViewModel getContSinDocSolPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/crear")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse contSinDocSolCrear(CrearRequest request) {
        return service.crear(request);
    }
    
}
