package com.keralty.ae.service;

import com.keralty.ae.persistence.AbstractAppEntity;
import com.keralty.ae.persistence.AgentexProducto;
import com.keralty.ae.persistence.oid.AgentexProductoOid;
import com.keralty.ae.viewmodel.InstanceResponseViewModel;
import com.keralty.ae.viewmodel.PopulationResponseViewModel;
import com.keralty.ae.viewmodel.PreloadResponseViewModel;
import com.keralty.ae.viewmodel.QueryRequest;
import com.keralty.ae.viewmodel.QueryResponse;
import com.keralty.ae.viewmodel.ServiceResponse;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.POST;
import java.util.List;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/api/AgentexProductoApi")
@RegisterRestClient(configKey="ae-usuarios")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aeusuarios}")
public interface AgentexProductoService {
    // Query methods

    /*
     * Returns the population of class AgentexProducto
     *
     * @return Population of class AgentexProducto
     */
    List<AgentexProducto> get();
    
    /*
     * Gets the preloaded list of objects of class AgentexProducto
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Preloaded list of objects of class AgentexProducto
     */
    List<PreloadResponseViewModel> getPreload(QueryRequest queryRequest);
    /*
     * Returns the population of class AgentexProducto that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class AgentexProducto matching the search criteria
     */
    @GET
    @Path("/")
    List<AgentexProducto> get(QueryRequest queryRequest);
    
    /*
     * Returns the list of instances that matches certain search criteria
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return List of instances that matches certain search criteria
     */
    QueryResponse getDynamic(QueryRequest queryRequest);

    /*
     * Returns the list of instances that matches certain search criteria in a preload query
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return List of instances that matches certain search criteria in a preload query
     */
    @POST
    @Path(value = "/GetWithDisplaySetDynamic")
    PreloadResponseViewModel getWithDisplaySetDynamic(QueryRequest queryRequest);
    
    /*
     * Returns the list of instances that matches certain search criteria in a population IU query
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return List of instances that matches certain search criteria in a population IU query
     */
    @POST
    @Path(value = "/GetPopulationDynamic")
    PopulationResponseViewModel getPopulationDynamic(QueryRequest request);

    /*
     * Returns an instance with a certain structure
     *
     * @param queryRequest Request containing the jsonOID of the instance 
     * and the displaySetItems dictating the structure to retrieve
     *
     * @return Instance matching the jsonOID
     */
    InstanceResponseViewModel getInstanceDynamic(QueryRequest queryRequest);

    /*
     * Returns the population of a class with a certain structure
     *
     * @param relatedInstanceJsonOid Json Oid of the related instance
     *
     * @param relatedInstancePath Path to the related instance
     *
     * @param displaySetItems DisplaySet items for each returned instance
     *
     * @return List of instances
     */
    PopulationResponseViewModel getByRelatedDynamic(String relatedInstanceJsonOid, String relatedInstancePath, String displaySetItems);

    /*
     * Returns an instance of AgentexProducto by ID
     *
     * @param funcionarioAsesorId Identification field funcionarioAsesorId
     *
     * @param agentexProductoId Identification field agentexProductoId
     *
     * @return Instance of AgentexProducto
     */
    @GET
    @Path("/{funcionarioAsesorId}/{agentexProductoId}")
    AgentexProducto getById(@PathParam("funcionarioAsesorId") Long funcionarioAsesorId, @PathParam("agentexProductoId") Long agentexProductoId);
    
    /*
     * Returns an instance of AgentexProducto by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of AgentexProducto
     */
    @GET
    @Path("/getByOid")
    AgentexProducto getByOID(@RequestBody AgentexProductoOid oid);
    
    /*
     * Returns an instance of AgentexProducto by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of AgentexProducto
     */
    @GET
    @Path("/getByOIDWithHV")
    AgentexProducto getByOIDWithHV(@RequestBody AgentexProductoOid oid);

    /*
     * Returns an instance of AgentexProducto by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of AgentexProducto
     */
    AgentexProducto getByJsonOid(String jsonOid);

    /*
     * Returns the list of instances of AgentexProducto related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of AgentexProducto
     */
    List<AgentexProducto> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns the list of instances of AgentexProducto related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of AgentexProducto
     */
    List<AgentexProducto> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns a set of displayset items for an instance of AgentexProducto
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Set of displayset items for an instance of AgentexProducto
     */
    @POST
    @Path(value = "/GetAgentexProductoDynamic")
    InstanceResponseViewModel getAgentexProductoDynamic(@RequestBody QueryRequest request);

    /*
     * Returns the supplementary info for a given instance
     *
     * @param oid Instance OID
     *
     * @param dsName DisplaySet name
     *
     * @return Supplementary info for a given instance
     */
    String getSuppInfo(AgentexProductoOid oid, String dsName);


    /*
     * Implements service eliminar
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/eliminar")
    ServiceResponse eliminar(@RequestBody com.keralty.ae.viewmodel.agentexproducto.siu.EliminarRequest request);

    /*
     * Implements service TCREAR
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TCREAR")
    ServiceResponse tCREAR(@RequestBody com.keralty.ae.viewmodel.agentexproducto.siu.TCREARRequest request);

    /*
     * Implements service TADDDOMINIO
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TADDDOMINIO")
    ServiceResponse tADDDOMINIO(@RequestBody com.keralty.ae.viewmodel.agentexproducto.siu.TADDDOMINIORequest request);

    /*
     * Checks service TADDDOMINIO preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TADDDOMINIOCheckPreconditions")
    ServiceResponse tADDDOMINIOCheckPreconditions(com.keralty.ae.viewmodel.agentexproducto.siu.TADDDOMINIORequest request);

    /*
     * Implements service TDELDOMINIO
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TDELDOMINIO")
    ServiceResponse tDELDOMINIO(@RequestBody com.keralty.ae.viewmodel.agentexproducto.siu.TDELDOMINIORequest request);
}
