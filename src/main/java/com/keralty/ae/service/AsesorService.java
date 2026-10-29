package com.keralty.ae.service;

import com.keralty.ae.persistence.AbstractAppEntity;
import com.keralty.ae.persistence.Asesor;
import com.keralty.ae.persistence.oid.AsesorOid;
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

@Path("/api/AsesorApi")
@RegisterRestClient(configKey="ae-usuarios")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aeusuarios}")
public interface AsesorService {
    // Query methods

    /*
     * Returns the population of class Asesor
     *
     * @return Population of class Asesor
     */
    List<Asesor> get();
    
    /*
     * Gets the preloaded list of objects of class Asesor
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Preloaded list of objects of class Asesor
     */
    List<PreloadResponseViewModel> getPreload(QueryRequest queryRequest);
    /*
     * Returns the population of class Asesor that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class Asesor matching the search criteria
     */
    @GET
    @Path("/")
    List<Asesor> get(QueryRequest queryRequest);
    
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
     * Returns an instance of Asesor by ID
     *
     * @param funcionarioId Identification field funcionarioId
     *
     * @return Instance of Asesor
     */
    @GET
    @Path("/{funcionarioId}")
    Asesor getById(@PathParam("funcionarioId") Long funcionarioId);
    
    /*
     * Returns an instance of Asesor by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Asesor
     */
    @GET
    @Path("/getByOid")
    Asesor getByOID(@RequestBody AsesorOid oid);
    
    /*
     * Returns an instance of Asesor by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Asesor
     */
    @GET
    @Path("/getByOIDWithHV")
    Asesor getByOIDWithHV(@RequestBody AsesorOid oid);

    /*
     * Returns an instance of Asesor by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of Asesor
     */
    Asesor getByJsonOid(String jsonOid);

    /*
     * Returns the list of instances of Asesor related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Asesor
     */
    List<Asesor> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns the list of instances of Asesor related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Asesor
     */
    List<Asesor> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns a set of displayset items for an instance of Asesor
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Set of displayset items for an instance of Asesor
     */
    @POST
    @Path(value = "/GetAsesorDynamic")
    InstanceResponseViewModel getAsesorDynamic(@RequestBody QueryRequest request);

    /*
     * Returns the supplementary info for a given instance
     *
     * @param oid Instance OID
     *
     * @param dsName DisplaySet name
     *
     * @return Supplementary info for a given instance
     */
    String getSuppInfo(AsesorOid oid, String dsName);


    /*
     * Implements service TMODIFICARASESOR
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TMODIFICARASESOR")
    ServiceResponse tMODIFICARASESOR(@RequestBody com.keralty.ae.viewmodel.asesor.siu.TMODIFICARASESORRequest request);

    /*
     * Implements service TDELETE
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TDELETE")
    ServiceResponse tDELETE(@RequestBody com.keralty.ae.viewmodel.asesor.siu.TDELETERequest request);

    /*
     * Checks service TDELETE preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TDELETECheckPreconditions")
    ServiceResponse tDELETECheckPreconditions(com.keralty.ae.viewmodel.asesor.siu.TDELETERequest request);

    /*
     * Implements service TMODVISIBILIDAD
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TMODVISIBILIDAD")
    ServiceResponse tMODVISIBILIDAD(@RequestBody com.keralty.ae.viewmodel.asesor.siu.TMODVISIBILIDADRequest request);

    /*
     * Implements service TCARGARDOMINIOPLAN
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TCARGARDOMINIOPLAN")
    ServiceResponse tCARGARDOMINIOPLAN(@RequestBody com.keralty.ae.viewmodel.asesor.siu.TCARGARDOMINIOPLANRequest request);

    /*
     * Implements service changePassword
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/changePassword")
    ServiceResponse changePassword(@RequestBody com.keralty.ae.viewmodel.asesor.siu.ChangePasswordRequest request);
}
