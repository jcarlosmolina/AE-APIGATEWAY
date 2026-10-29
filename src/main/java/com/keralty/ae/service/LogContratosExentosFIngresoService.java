package com.keralty.ae.service;

import com.keralty.ae.persistence.LogContratosExentosFIngreso;
import com.keralty.ae.persistence.oid.LogContratosExentosFIngresoOid;
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

@Path("/api/LogContratosExentosFIngresoApi")
@RegisterRestClient(configKey="ae-configuraciones")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aeconfiguraciones}")
public interface LogContratosExentosFIngresoService {
    // Query methods

    /*
     * Returns the population of class LogContratosExentosFIngreso
     *
     * @return Population of class LogContratosExentosFIngreso
     */
    List<LogContratosExentosFIngreso> get();
    /*
     * Returns the population of class LogContratosExentosFIngreso that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class LogContratosExentosFIngreso matching the search criteria
     */
    @GET
    @Path("/")
    List<LogContratosExentosFIngreso> get(QueryRequest queryRequest);
    
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
     * Returns an instance of LogContratosExentosFIngreso by ID
     *
     * @param logContratosExentosFIngresoidLogContratosExentosFIngreso Identification field logContratosExentosFIngresoidLogContratosExentosFIngreso
     *
     * @return Instance of LogContratosExentosFIngreso
     */
    @GET
    @Path("/{logContratosExentosFIngresoidLogContratosExentosFIngreso}")
    LogContratosExentosFIngreso getById(@PathParam("logContratosExentosFIngresoidLogContratosExentosFIngreso") Long logContratosExentosFIngresoidLogContratosExentosFIngreso);
    
    /*
     * Returns an instance of LogContratosExentosFIngreso by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of LogContratosExentosFIngreso
     */
    @GET
    @Path("/getByOid")
    LogContratosExentosFIngreso getByOID(@RequestBody LogContratosExentosFIngresoOid oid);
    
    /*
     * Returns an instance of LogContratosExentosFIngreso by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of LogContratosExentosFIngreso
     */
    @GET
    @Path("/getByOIDWithHV")
    LogContratosExentosFIngreso getByOIDWithHV(@RequestBody LogContratosExentosFIngresoOid oid);

    /*
     * Returns an instance of LogContratosExentosFIngreso by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of LogContratosExentosFIngreso
     */
    LogContratosExentosFIngreso getByJsonOid(String jsonOid);

    /*
     * Returns a set of displayset items for an instance of LogContratosExentosFIngreso
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Set of displayset items for an instance of LogContratosExentosFIngreso
     */
    @POST
    @Path(value = "/GetLogContratosExentosFIngresoDynamic")
    InstanceResponseViewModel getLogContratosExentosFIngresoDynamic(@RequestBody QueryRequest request);

    /*
     * Returns the supplementary info for a given instance
     *
     * @param oid Instance OID
     *
     * @param dsName DisplaySet name
     *
     * @return Supplementary info for a given instance
     */
    String getSuppInfo(LogContratosExentosFIngresoOid oid, String dsName);

}
