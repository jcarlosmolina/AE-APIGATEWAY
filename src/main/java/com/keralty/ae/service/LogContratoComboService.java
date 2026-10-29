package com.keralty.ae.service;

import com.keralty.ae.persistence.LogContratoCombo;
import com.keralty.ae.persistence.oid.LogContratoComboOid;
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

@Path("/api/LogContratoComboApi")
@RegisterRestClient(configKey="ae-configuraciones")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aeconfiguraciones}")
public interface LogContratoComboService {
    // Query methods

    /*
     * Returns the population of class LogContratoCombo
     *
     * @return Population of class LogContratoCombo
     */
    List<LogContratoCombo> get();
    /*
     * Returns the population of class LogContratoCombo that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class LogContratoCombo matching the search criteria
     */
    @GET
    @Path("/")
    List<LogContratoCombo> get(QueryRequest queryRequest);
    
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
     * Returns an instance of LogContratoCombo by ID
     *
     * @param logContratoComboId Identification field logContratoComboId
     *
     * @return Instance of LogContratoCombo
     */
    @GET
    @Path("/{logContratoComboId}")
    LogContratoCombo getById(@PathParam("logContratoComboId") Long logContratoComboId);
    
    /*
     * Returns an instance of LogContratoCombo by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of LogContratoCombo
     */
    @GET
    @Path("/getByOid")
    LogContratoCombo getByOID(@RequestBody LogContratoComboOid oid);
    
    /*
     * Returns an instance of LogContratoCombo by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of LogContratoCombo
     */
    @GET
    @Path("/getByOIDWithHV")
    LogContratoCombo getByOIDWithHV(@RequestBody LogContratoComboOid oid);

    /*
     * Returns an instance of LogContratoCombo by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of LogContratoCombo
     */
    LogContratoCombo getByJsonOid(String jsonOid);

    /*
     * Returns a set of displayset items for an instance of LogContratoCombo
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Set of displayset items for an instance of LogContratoCombo
     */
    @POST
    @Path(value = "/GetLogContratoComboDynamic")
    InstanceResponseViewModel getLogContratoComboDynamic(@RequestBody QueryRequest request);

    /*
     * Returns the supplementary info for a given instance
     *
     * @param oid Instance OID
     *
     * @param dsName DisplaySet name
     *
     * @return Supplementary info for a given instance
     */
    String getSuppInfo(LogContratoComboOid oid, String dsName);

}
