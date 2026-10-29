package com.keralty.ae.service;

import com.keralty.ae.persistence.AbstractAppEntity;
import com.keralty.ae.persistence.oid.SuperAdminOid;
import com.keralty.ae.persistence.SuperAdmin;
import com.keralty.ae.viewmodel.InstanceResponseViewModel;
import com.keralty.ae.viewmodel.PopulationResponseViewModel;
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

@Path("/api/SuperAdminApi")
@RegisterRestClient(configKey="ae-usuarios")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aeusuarios}")
public interface SuperAdminService {
    // Query methods

    /*
     * Returns the population of class SuperAdmin
     *
     * @return Population of class SuperAdmin
     */
    List<SuperAdmin> get();
    /*
     * Returns the population of class SuperAdmin that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class SuperAdmin matching the search criteria
     */
    @GET
    @Path("/")
    List<SuperAdmin> get(QueryRequest queryRequest);
    
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
     * Returns an instance of SuperAdmin by ID
     *
     * @param funcionarioId Identification field funcionarioId
     *
     * @return Instance of SuperAdmin
     */
    @GET
    @Path("/{funcionarioId}")
    SuperAdmin getById(@PathParam("funcionarioId") Long funcionarioId);
    
    /*
     * Returns an instance of SuperAdmin by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of SuperAdmin
     */
    @GET
    @Path("/getByOid")
    SuperAdmin getByOID(@RequestBody SuperAdminOid oid);
    
    /*
     * Returns an instance of SuperAdmin by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of SuperAdmin
     */
    @GET
    @Path("/getByOIDWithHV")
    SuperAdmin getByOIDWithHV(@RequestBody SuperAdminOid oid);

    /*
     * Returns an instance of SuperAdmin by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of SuperAdmin
     */
    SuperAdmin getByJsonOid(String jsonOid);

    /*
     * Returns the list of instances of SuperAdmin related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of SuperAdmin
     */
    List<SuperAdmin> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns the list of instances of SuperAdmin related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of SuperAdmin
     */
    List<SuperAdmin> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns a set of displayset items for an instance of SuperAdmin
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Set of displayset items for an instance of SuperAdmin
     */
    @POST
    @Path(value = "/GetSuperAdminDynamic")
    InstanceResponseViewModel getSuperAdminDynamic(@RequestBody QueryRequest request);

    /*
     * Returns the supplementary info for a given instance
     *
     * @param oid Instance OID
     *
     * @param dsName DisplaySet name
     *
     * @return Supplementary info for a given instance
     */
    String getSuppInfo(SuperAdminOid oid, String dsName);


    /*
     * Implements service changePassword
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/changePassword")
    ServiceResponse changePassword(@RequestBody com.keralty.ae.viewmodel.superadmin.siu.ChangePasswordRequest request);
}
