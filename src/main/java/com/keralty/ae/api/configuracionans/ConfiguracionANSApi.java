package com.keralty.ae.api.configuracionans;

import com.keralty.ae.persistence.ConfiguracionANS;
import com.keralty.ae.persistence.oid.ConfiguracionANSOid;
import com.keralty.ae.service.ConfiguracionANSService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.configuracionans.siu.TCREARRequest;
import com.keralty.ae.viewmodel.configuracionans.siu.TELIMINARRequest;
import com.keralty.ae.viewmodel.configuracionans.siu.TMODIFICARRequest;
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

@Path("/api/ConfiguracionANSApi")
@RequestScoped
public class ConfiguracionANSApi {

    @RestClient
    ConfiguracionANSService service;

    JsonWebToken jwt; 

    public ConfiguracionANSApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{configuracionANSId}")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Gestor"})
    public ConfiguracionANS getInstance(Long configuracionANSId) {
    	return service.getById(configuracionANSId);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Gestor"})
    public List<ConfiguracionANS> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Gestor"})
    public ConfiguracionANS getByOid(ConfiguracionANSOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Gestor"})
    public ConfiguracionANS getByOIDWithHV(ConfiguracionANSOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetConfiguracionANSDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Gestor"})
    public InstanceResponseViewModel getConfiguracionANSDynamic(QueryRequest request) {
        return service.getConfiguracionANSDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Gestor"})
    public PopulationResponseViewModel getConfiguracionANSPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/TCREAR")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse configuracionANSTCREAR(TCREARRequest request) {
        return service.tCREAR(request);
    }
    

    @POST
    @Path(value = "/TCREARCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse configuracionANSTCREARCheckPreconditions(TCREARRequest request) {

        return service.tCREARCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TMODIFICAR")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse configuracionANSTMODIFICAR(TMODIFICARRequest request) {
        return service.tMODIFICAR(request);
    }
    

    @POST
    @Path(value = "/TELIMINAR")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse configuracionANSTELIMINAR(TELIMINARRequest request) {
        return service.tELIMINAR(request);
    }
    
}
