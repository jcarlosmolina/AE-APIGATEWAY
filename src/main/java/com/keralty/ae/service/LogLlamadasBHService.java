package com.keralty.ae.service;

import com.keralty.ae.persistence.LogLlamadasBH;
import com.keralty.ae.persistence.oid.LogLlamadasBHOid;
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

@Path("/api/LogLlamadasBHApi")
@RegisterRestClient(configKey="ae-configuraciones")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aeconfiguraciones}")
public interface LogLlamadasBHService {
    // Query methods

    /*
     * Returns the population of class LogLlamadasBH
     *
     * @return Population of class LogLlamadasBH
     */
    List<LogLlamadasBH> get();
    /*
     * Returns the population of class LogLlamadasBH that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class LogLlamadasBH matching the search criteria
     */
    @GET
    @Path("/")
    List<LogLlamadasBH> get(QueryRequest queryRequest);
    
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
     * Returns an instance of LogLlamadasBH by ID
     *
     * @param logLlamadasBHID Identification field logLlamadasBHID
     *
     * @return Instance of LogLlamadasBH
     */
    @GET
    @Path("/{logLlamadasBHID}")
    LogLlamadasBH getById(@PathParam("logLlamadasBHID") Long logLlamadasBHID);
    
    /*
     * Returns an instance of LogLlamadasBH by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of LogLlamadasBH
     */
    @GET
    @Path("/getByOid")
    LogLlamadasBH getByOID(@RequestBody LogLlamadasBHOid oid);
    
    /*
     * Returns an instance of LogLlamadasBH by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of LogLlamadasBH
     */
    @GET
    @Path("/getByOIDWithHV")
    LogLlamadasBH getByOIDWithHV(@RequestBody LogLlamadasBHOid oid);

    /*
     * Returns an instance of LogLlamadasBH by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of LogLlamadasBH
     */
    LogLlamadasBH getByJsonOid(String jsonOid);

    /*
     * Returns a set of displayset items for an instance of LogLlamadasBH
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Set of displayset items for an instance of LogLlamadasBH
     */
    @POST
    @Path(value = "/GetLogLlamadasBHDynamic")
    InstanceResponseViewModel getLogLlamadasBHDynamic(@RequestBody QueryRequest request);

    /*
     * Returns the supplementary info for a given instance
     *
     * @param oid Instance OID
     *
     * @param dsName DisplaySet name
     *
     * @return Supplementary info for a given instance
     */
    String getSuppInfo(LogLlamadasBHOid oid, String dsName);


    /*
     * Implements service createinstance
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/create_instance")
    ServiceResponse createinstance(@RequestBody com.keralty.ae.viewmodel.logllamadasbh.siu.CreateinstanceRequest request);

    /*
     * Implements service deleteinstance
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/delete_instance")
    ServiceResponse deleteinstance(@RequestBody com.keralty.ae.viewmodel.logllamadasbh.siu.DeleteinstanceRequest request);
}
