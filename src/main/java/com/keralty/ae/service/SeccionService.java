package com.keralty.ae.service;

import com.keralty.ae.persistence.AbstractAppEntity;
import com.keralty.ae.persistence.oid.SeccionOid;
import com.keralty.ae.persistence.Seccion;
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

@Path("/api/SeccionApi")
@RegisterRestClient(configKey="ae-configuraciones")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aeconfiguraciones}")
public interface SeccionService {
    // Query methods

    /*
     * Returns the population of class Seccion
     *
     * @return Population of class Seccion
     */
    List<Seccion> get();
    
    /*
     * Gets the preloaded list of objects of class Seccion
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Preloaded list of objects of class Seccion
     */
    List<PreloadResponseViewModel> getPreload(QueryRequest queryRequest);
    /*
     * Returns the population of class Seccion that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class Seccion matching the search criteria
     */
    @GET
    @Path("/")
    List<Seccion> get(QueryRequest queryRequest);
    
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
     * Returns an instance of Seccion by ID
     *
     * @param seccionIdentificador Identification field seccionIdentificador
     *
     * @return Instance of Seccion
     */
    @GET
    @Path("/{seccionIdentificador}")
    Seccion getById(@PathParam("seccionIdentificador") Long seccionIdentificador);
    
    /*
     * Returns an instance of Seccion by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Seccion
     */
    @GET
    @Path("/getByOid")
    Seccion getByOID(@RequestBody SeccionOid oid);
    
    /*
     * Returns an instance of Seccion by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Seccion
     */
    @GET
    @Path("/getByOIDWithHV")
    Seccion getByOIDWithHV(@RequestBody SeccionOid oid);

    /*
     * Returns an instance of Seccion by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of Seccion
     */
    Seccion getByJsonOid(String jsonOid);

    /*
     * Returns the list of instances of Seccion related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Seccion
     */
    List<Seccion> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns the list of instances of Seccion related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Seccion
     */
    List<Seccion> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns a set of displayset items for an instance of Seccion
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Set of displayset items for an instance of Seccion
     */
    @POST
    @Path(value = "/GetSeccionDynamic")
    InstanceResponseViewModel getSeccionDynamic(@RequestBody QueryRequest request);

    /*
     * Returns the supplementary info for a given instance
     *
     * @param oid Instance OID
     *
     * @param dsName DisplaySet name
     *
     * @return Supplementary info for a given instance
     */
    String getSuppInfo(SeccionOid oid, String dsName);


    /*
     * Implements service TCREAR
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TCREAR")
    ServiceResponse tCREAR(@RequestBody com.keralty.ae.viewmodel.seccion.siu.TCREARRequest request);

    /*
     * Checks service TCREAR preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TCREARCheckPreconditions")
    ServiceResponse tCREARCheckPreconditions(com.keralty.ae.viewmodel.seccion.siu.TCREARRequest request);

    /*
     * Implements service TMODIFICAR
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TMODIFICAR")
    ServiceResponse tMODIFICAR(@RequestBody com.keralty.ae.viewmodel.seccion.siu.TMODIFICARRequest request);

    /*
     * Checks service TMODIFICAR preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TMODIFICARCheckPreconditions")
    ServiceResponse tMODIFICARCheckPreconditions(com.keralty.ae.viewmodel.seccion.siu.TMODIFICARRequest request);

    /*
     * Implements service TELIMINAR
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TELIMINAR")
    ServiceResponse tELIMINAR(@RequestBody com.keralty.ae.viewmodel.seccion.siu.TELIMINARRequest request);

    /*
     * Checks service TELIMINAR preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TELIMINARCheckPreconditions")
    ServiceResponse tELIMINARCheckPreconditions(com.keralty.ae.viewmodel.seccion.siu.TELIMINARRequest request);
}
