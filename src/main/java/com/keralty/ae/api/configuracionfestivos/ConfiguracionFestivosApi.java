package com.keralty.ae.api.configuracionfestivos;

import com.keralty.ae.persistence.ConfiguracionFestivos;
import com.keralty.ae.persistence.oid.ConfiguracionFestivosOid;
import com.keralty.ae.service.ConfiguracionFestivosService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.configuracionfestivos.siu.CrearRequest;
import com.keralty.ae.viewmodel.configuracionfestivos.siu.EliminarRequest;
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

@Path("/api/ConfiguracionFestivosApi")
@RequestScoped
public class ConfiguracionFestivosApi {

    @RestClient
    ConfiguracionFestivosService service;

    JsonWebToken jwt; 

    public ConfiguracionFestivosApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{configuracionFestivosId}")
    @Operation(hidden = true)
    @RolesAllowed({"SuperAdmin","Gestor"})
    public ConfiguracionFestivos getInstance(Long configuracionFestivosId) {
    	return service.getById(configuracionFestivosId);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"SuperAdmin","Gestor"})
    public List<ConfiguracionFestivos> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"SuperAdmin","Gestor"})
    public ConfiguracionFestivos getByOid(ConfiguracionFestivosOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"SuperAdmin","Gestor"})
    public ConfiguracionFestivos getByOIDWithHV(ConfiguracionFestivosOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetConfiguracionFestivosDynamic")
    @RolesAllowed({"SuperAdmin","Gestor"})
    public InstanceResponseViewModel getConfiguracionFestivosDynamic(QueryRequest request) {
        return service.getConfiguracionFestivosDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"SuperAdmin","Gestor"})
    public PopulationResponseViewModel getConfiguracionFestivosPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/crear")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse configuracionFestivosCrear(CrearRequest request) {
        return service.crear(request);
    }
    

    @POST
    @Path(value = "/eliminar")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse configuracionFestivosEliminar(EliminarRequest request) {
        return service.eliminar(request);
    }
    
}
