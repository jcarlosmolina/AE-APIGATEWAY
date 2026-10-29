package com.keralty.ae.service;

import com.keralty.ae.persistence.AbstractAppEntity;
import com.keralty.ae.persistence.oid.PaisOid;
import com.keralty.ae.persistence.Pais;
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

@Path("/api/PaisApi")
@RegisterRestClient(configKey="ae-configuraciones")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aeconfiguraciones}")
public interface PaisService {
    // Query methods

    /*
     * Returns the population of class Pais
     *
     * @return Population of class Pais
     */
    List<Pais> get();
    
    /*
     * Gets the preloaded list of objects of class Pais
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Preloaded list of objects of class Pais
     */
    List<PreloadResponseViewModel> getPreload(QueryRequest queryRequest);
    /*
     * Returns the population of class Pais that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class Pais matching the search criteria
     */
    @GET
    @Path("/")
    List<Pais> get(QueryRequest queryRequest);
    
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
     * Returns an instance of Pais by ID
     *
     * @param paisCodigo Identification field paisCodigo
     *
     * @return Instance of Pais
     */
    @GET
    @Path("/{paisCodigo}")
    Pais getById(@PathParam("paisCodigo") String paisCodigo);
    
    /*
     * Returns an instance of Pais by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Pais
     */
    @GET
    @Path("/getByOid")
    Pais getByOID(@RequestBody PaisOid oid);
    
    /*
     * Returns an instance of Pais by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Pais
     */
    @GET
    @Path("/getByOIDWithHV")
    Pais getByOIDWithHV(@RequestBody PaisOid oid);

    /*
     * Returns an instance of Pais by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of Pais
     */
    Pais getByJsonOid(String jsonOid);

    /*
     * Returns the list of instances of Pais related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Pais
     */
    List<Pais> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns the list of instances of Pais related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Pais
     */
    List<Pais> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns a set of displayset items for an instance of Pais
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Set of displayset items for an instance of Pais
     */
    @POST
    @Path(value = "/GetPaisDynamic")
    InstanceResponseViewModel getPaisDynamic(@RequestBody QueryRequest request);

    /*
     * Returns the supplementary info for a given instance
     *
     * @param oid Instance OID
     *
     * @param dsName DisplaySet name
     *
     * @return Supplementary info for a given instance
     */
    String getSuppInfo(PaisOid oid, String dsName);


    /*
     * Implements service crear
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/crear")
    ServiceResponse crear(@RequestBody com.keralty.ae.viewmodel.pais.siu.CrearRequest request);

    /*
     * Implements service eliminar
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/eliminar")
    ServiceResponse eliminar(@RequestBody com.keralty.ae.viewmodel.pais.siu.EliminarRequest request);

    /*
     * Checks service eliminar preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/eliminarCheckPreconditions")
    ServiceResponse eliminarCheckPreconditions(com.keralty.ae.viewmodel.pais.siu.EliminarRequest request);
}
