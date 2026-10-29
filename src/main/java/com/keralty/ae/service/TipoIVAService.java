package com.keralty.ae.service;

import com.keralty.ae.persistence.AbstractAppEntity;
import com.keralty.ae.persistence.oid.TipoIVAOid;
import com.keralty.ae.persistence.TipoIVA;
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

@Path("/api/TipoIVAApi")
@RegisterRestClient(configKey="ae-configuraciones")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aeconfiguraciones}")
public interface TipoIVAService {
    // Query methods

    /*
     * Returns the population of class TipoIVA
     *
     * @return Population of class TipoIVA
     */
    List<TipoIVA> get();
    
    /*
     * Gets the preloaded list of objects of class TipoIVA
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Preloaded list of objects of class TipoIVA
     */
    List<PreloadResponseViewModel> getPreload(QueryRequest queryRequest);
    /*
     * Returns the population of class TipoIVA that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class TipoIVA matching the search criteria
     */
    @GET
    @Path("/")
    List<TipoIVA> get(QueryRequest queryRequest);
    
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
     * Returns an instance of TipoIVA by ID
     *
     * @param tipoIVACodigo Identification field tipoIVACodigo
     *
     * @return Instance of TipoIVA
     */
    @GET
    @Path("/{tipoIVACodigo}")
    TipoIVA getById(@PathParam("tipoIVACodigo") Long tipoIVACodigo);
    
    /*
     * Returns an instance of TipoIVA by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of TipoIVA
     */
    @GET
    @Path("/getByOid")
    TipoIVA getByOID(@RequestBody TipoIVAOid oid);
    
    /*
     * Returns an instance of TipoIVA by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of TipoIVA
     */
    @GET
    @Path("/getByOIDWithHV")
    TipoIVA getByOIDWithHV(@RequestBody TipoIVAOid oid);

    /*
     * Returns an instance of TipoIVA by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of TipoIVA
     */
    TipoIVA getByJsonOid(String jsonOid);

    /*
     * Returns the list of instances of TipoIVA related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of TipoIVA
     */
    List<TipoIVA> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns the list of instances of TipoIVA related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of TipoIVA
     */
    List<TipoIVA> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns a set of displayset items for an instance of TipoIVA
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Set of displayset items for an instance of TipoIVA
     */
    @POST
    @Path(value = "/GetTipoIVADynamic")
    InstanceResponseViewModel getTipoIVADynamic(@RequestBody QueryRequest request);

    /*
     * Returns the supplementary info for a given instance
     *
     * @param oid Instance OID
     *
     * @param dsName DisplaySet name
     *
     * @return Supplementary info for a given instance
     */
    String getSuppInfo(TipoIVAOid oid, String dsName);


    /*
     * Implements service crear
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/crear")
    ServiceResponse crear(@RequestBody com.keralty.ae.viewmodel.tipoiva.siu.CrearRequest request);

    /*
     * Checks service crear preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/crearCheckPreconditions")
    ServiceResponse crearCheckPreconditions(com.keralty.ae.viewmodel.tipoiva.siu.CrearRequest request);

    /*
     * Implements service eliminar
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/eliminar")
    ServiceResponse eliminar(@RequestBody com.keralty.ae.viewmodel.tipoiva.siu.EliminarRequest request);

    /*
     * Implements service modificar
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/modificar")
    ServiceResponse modificar(@RequestBody com.keralty.ae.viewmodel.tipoiva.siu.ModificarRequest request);

    /*
     * Checks service modificar preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/modificarCheckPreconditions")
    ServiceResponse modificarCheckPreconditions(com.keralty.ae.viewmodel.tipoiva.siu.ModificarRequest request);
}
