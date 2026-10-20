package com.keralty.ae.api.rol;

import com.keralty.ae.persistence.oid.RolOid;
import com.keralty.ae.persistence.Rol;
import com.keralty.ae.service.RolService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.InstanceResponseViewModel;
import com.keralty.ae.viewmodel.PopulationResponseViewModel;
import com.keralty.ae.viewmodel.PreloadResponseViewModel;
import com.keralty.ae.viewmodel.PreloadViewModel;
import com.keralty.ae.viewmodel.QueryRequest;
import com.keralty.ae.viewmodel.rol.siu.CrearRequest;
import com.keralty.ae.viewmodel.rol.siu.EliminarRequest;
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

@Path("/api/RolApi")
@RequestScoped
public class RolApi {

    @RestClient
    RolService service;

    JsonWebToken jwt; 

    public RolApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{rolIdentificador}")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","AreaMedica","Gestor","MesaDeApoyo"})
    public Rol getInstance(Long rolIdentificador) {
    	return service.getById(rolIdentificador);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","AreaMedica","Gestor","MesaDeApoyo"})
    public List<Rol> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","AreaMedica","Gestor","MesaDeApoyo"})
    public Rol getByOid(RolOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","AreaMedica","Gestor","MesaDeApoyo"})
    public Rol getByOIDWithHV(RolOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetRolDynamic")
    @RolesAllowed({"Admin","SuperAdmin","AreaMedica","Gestor","MesaDeApoyo"})
    public InstanceResponseViewModel getRolDynamic(QueryRequest request) {
        return service.getRolDynamic(request);
    }

    @POST
    @Path(value = "/GetWithDisplaySetDynamic")
    @RolesAllowed({"Admin","SuperAdmin","AreaMedica","Gestor","MesaDeApoyo"})
    public PreloadResponseViewModel getRolWithDisplaySetDynamic(QueryRequest request) {
        return (PreloadResponseViewModel) service.getWithDisplaySetDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Admin","SuperAdmin","AreaMedica","Gestor","MesaDeApoyo"})
    public PopulationResponseViewModel getRolPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/crear")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse rolCrear(CrearRequest request) {
        return service.crear(request);
    }
    

    @POST
    @Path(value = "/eliminar")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse rolEliminar(EliminarRequest request) {
        return service.eliminar(request);
    }
    

    @POST
    @Path(value = "/eliminarCheckPreconditions")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse rolEliminarCheckPreconditions(EliminarRequest request) {

        return service.eliminarCheckPreconditions(request);
    }
}
