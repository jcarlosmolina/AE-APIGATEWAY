package com.keralty.ae.service;

import com.keralty.ae.persistence.AbstractAppEntity;
import com.keralty.ae.persistence.LogGrupoAsignacion;
import com.keralty.ae.persistence.oid.LogGrupoAsignacionOid;
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

@Path("/api/LogGrupoAsignacionApi")
@RegisterRestClient(configKey="ae-configuraciones")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aeconfiguraciones}")
public interface LogGrupoAsignacionService {
    // Query methods

    /*
     * Returns the population of class LogGrupoAsignacion
     *
     * @return Population of class LogGrupoAsignacion
     */
    List<LogGrupoAsignacion> get();
    /*
     * Returns the population of class LogGrupoAsignacion that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class LogGrupoAsignacion matching the search criteria
     */
    @GET
    @Path("/")
    List<LogGrupoAsignacion> get(QueryRequest queryRequest);
    
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
     * Returns an instance of LogGrupoAsignacion by ID
     *
     * @param logGrupoAsignacionId Identification field logGrupoAsignacionId
     *
     * @return Instance of LogGrupoAsignacion
     */
    @GET
    @Path("/{logGrupoAsignacionId}")
    LogGrupoAsignacion getById(@PathParam("logGrupoAsignacionId") Long logGrupoAsignacionId);
    
    /*
     * Returns an instance of LogGrupoAsignacion by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of LogGrupoAsignacion
     */
    @GET
    @Path("/getByOid")
    LogGrupoAsignacion getByOID(@RequestBody LogGrupoAsignacionOid oid);
    
    /*
     * Returns an instance of LogGrupoAsignacion by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of LogGrupoAsignacion
     */
    @GET
    @Path("/getByOIDWithHV")
    LogGrupoAsignacion getByOIDWithHV(@RequestBody LogGrupoAsignacionOid oid);

    /*
     * Returns an instance of LogGrupoAsignacion by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of LogGrupoAsignacion
     */
    LogGrupoAsignacion getByJsonOid(String jsonOid);

    /*
     * Returns the list of instances of LogGrupoAsignacion related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of LogGrupoAsignacion
     */
    List<LogGrupoAsignacion> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns the list of instances of LogGrupoAsignacion related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of LogGrupoAsignacion
     */
    List<LogGrupoAsignacion> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns a set of displayset items for an instance of LogGrupoAsignacion
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Set of displayset items for an instance of LogGrupoAsignacion
     */
    @POST
    @Path(value = "/GetLogGrupoAsignacionDynamic")
    InstanceResponseViewModel getLogGrupoAsignacionDynamic(@RequestBody QueryRequest request);

    /*
     * Returns the supplementary info for a given instance
     *
     * @param oid Instance OID
     *
     * @param dsName DisplaySet name
     *
     * @return Supplementary info for a given instance
     */
    String getSuppInfo(LogGrupoAsignacionOid oid, String dsName);

}
