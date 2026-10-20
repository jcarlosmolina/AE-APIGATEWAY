package com.keralty.ae.api.agentexproducto;

import com.keralty.ae.persistence.AgentexProducto;
import com.keralty.ae.persistence.oid.AgentexProductoOid;
import com.keralty.ae.service.AgentexProductoService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.agentexproducto.siu.EliminarRequest;
import com.keralty.ae.viewmodel.agentexproducto.siu.TADDDOMINIORequest;
import com.keralty.ae.viewmodel.agentexproducto.siu.TCREARRequest;
import com.keralty.ae.viewmodel.agentexproducto.siu.TDELDOMINIORequest;
import com.keralty.ae.viewmodel.InstanceResponseViewModel;
import com.keralty.ae.viewmodel.PopulationResponseViewModel;
import com.keralty.ae.viewmodel.PreloadResponseViewModel;
import com.keralty.ae.viewmodel.PreloadViewModel;
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

@Path("/api/AgentexProductoApi")
@RequestScoped
public class AgentexProductoApi {

    @RestClient
    AgentexProductoService service;

    JsonWebToken jwt; 

    public AgentexProductoApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{funcionarioAsesorId}/{agentexProductoId}")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones"})
    public AgentexProducto getInstance(Long funcionarioAsesorId, Long agentexProductoId) {
    	return service.getById(funcionarioAsesorId, agentexProductoId);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones"})
    public List<AgentexProducto> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones"})
    public AgentexProducto getByOid(AgentexProductoOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones"})
    public AgentexProducto getByOIDWithHV(AgentexProductoOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetAgentexProductoDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones"})
    public InstanceResponseViewModel getAgentexProductoDynamic(QueryRequest request) {
        return service.getAgentexProductoDynamic(request);
    }

    @POST
    @Path(value = "/GetWithDisplaySetDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones"})
    public PreloadResponseViewModel getAgentexProductoWithDisplaySetDynamic(QueryRequest request) {
        return (PreloadResponseViewModel) service.getWithDisplaySetDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones"})
    public PopulationResponseViewModel getAgentexProductoPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/eliminar")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse agentexProductoEliminar(EliminarRequest request) {
        return service.eliminar(request);
    }
    

    @POST
    @Path(value = "/TCREAR")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse agentexProductoTCREAR(TCREARRequest request) {
        return service.tCREAR(request);
    }
    

    @POST
    @Path(value = "/TADDDOMINIO")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse agentexProductoTADDDOMINIO(TADDDOMINIORequest request) {
        return service.tADDDOMINIO(request);
    }
    

    @POST
    @Path(value = "/TADDDOMINIOCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse agentexProductoTADDDOMINIOCheckPreconditions(TADDDOMINIORequest request) {

        return service.tADDDOMINIOCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TDELDOMINIO")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse agentexProductoTDELDOMINIO(TDELDOMINIORequest request) {
        return service.tDELDOMINIO(request);
    }
    
}
