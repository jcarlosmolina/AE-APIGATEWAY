package com.keralty.ae.service;

import com.keralty.ae.persistence.LogLlamadasAE;
import com.keralty.ae.persistence.oid.LogLlamadasAEOid;
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

@Path("/api/LogLlamadasAEApi")
@RegisterRestClient(configKey="ae-configuraciones")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aeconfiguraciones}")
public interface LogLlamadasAEService {
    // Query methods

    /*
     * Returns the population of class LogLlamadasAE
     *
     * @return Population of class LogLlamadasAE
     */
    List<LogLlamadasAE> get();
    /*
     * Returns the population of class LogLlamadasAE that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class LogLlamadasAE matching the search criteria
     */
    @GET
    @Path("/")
    List<LogLlamadasAE> get(QueryRequest queryRequest);
    
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
     * Returns an instance of LogLlamadasAE by ID
     *
     * @param logLlamadasAEID Identification field logLlamadasAEID
     *
     * @return Instance of LogLlamadasAE
     */
    @GET
    @Path("/{logLlamadasAEID}")
    LogLlamadasAE getById(@PathParam("logLlamadasAEID") Long logLlamadasAEID);
    
    /*
     * Returns an instance of LogLlamadasAE by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of LogLlamadasAE
     */
    @GET
    @Path("/getByOid")
    LogLlamadasAE getByOID(@RequestBody LogLlamadasAEOid oid);
    
    /*
     * Returns an instance of LogLlamadasAE by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of LogLlamadasAE
     */
    @GET
    @Path("/getByOIDWithHV")
    LogLlamadasAE getByOIDWithHV(@RequestBody LogLlamadasAEOid oid);

    /*
     * Returns an instance of LogLlamadasAE by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of LogLlamadasAE
     */
    LogLlamadasAE getByJsonOid(String jsonOid);

    /*
     * Returns a set of displayset items for an instance of LogLlamadasAE
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Set of displayset items for an instance of LogLlamadasAE
     */
    @POST
    @Path(value = "/GetLogLlamadasAEDynamic")
    InstanceResponseViewModel getLogLlamadasAEDynamic(@RequestBody QueryRequest request);

    /*
     * Returns the supplementary info for a given instance
     *
     * @param oid Instance OID
     *
     * @param dsName DisplaySet name
     *
     * @return Supplementary info for a given instance
     */
    String getSuppInfo(LogLlamadasAEOid oid, String dsName);


    /*
     * Implements service createinstance
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/create_instance")
    ServiceResponse createinstance(@RequestBody com.keralty.ae.viewmodel.logllamadasae.siu.CreateinstanceRequest request);

    /*
     * Implements service deleteinstance
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/delete_instance")
    ServiceResponse deleteinstance(@RequestBody com.keralty.ae.viewmodel.logllamadasae.siu.DeleteinstanceRequest request);
}
