package com.keralty.ae.service;

import com.keralty.ae.persistence.AbstractAppEntity;
import com.keralty.ae.persistence.oid.TitularOid;
import com.keralty.ae.persistence.Titular;
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

@Path("/api/TitularApi")
@RegisterRestClient(configKey="ae-personas")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aepersonas}")
public interface TitularService {
    // Query methods

    /*
     * Returns the population of class Titular
     *
     * @return Population of class Titular
     */
    List<Titular> get();
    /*
     * Returns the population of class Titular that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class Titular matching the search criteria
     */
    @GET
    @Path("/")
    List<Titular> get(QueryRequest queryRequest);
    
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
     * Returns an instance of Titular by ID
     *
     * @param aesolicitudesidsolicitud Identification field aesolicitudesidsolicitud
     *
     * @return Instance of Titular
     */
    @GET
    @Path("/{aesolicitudesidsolicitud}")
    Titular getById(@PathParam("aesolicitudesidsolicitud") Long aesolicitudesidsolicitud);
    
    /*
     * Returns an instance of Titular by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Titular
     */
    @GET
    @Path("/getByOid")
    Titular getByOID(@RequestBody TitularOid oid);
    
    /*
     * Returns an instance of Titular by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Titular
     */
    @GET
    @Path("/getByOIDWithHV")
    Titular getByOIDWithHV(@RequestBody TitularOid oid);

    /*
     * Returns an instance of Titular by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of Titular
     */
    Titular getByJsonOid(String jsonOid);

    /*
     * Returns the list of instances of Titular related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Titular
     */
    List<Titular> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns the list of instances of Titular related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Titular
     */
    List<Titular> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns a set of displayset items for an instance of Titular
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Set of displayset items for an instance of Titular
     */
    @POST
    @Path(value = "/GetTitularDynamic")
    InstanceResponseViewModel getTitularDynamic(@RequestBody QueryRequest request);

    /*
     * Returns the supplementary info for a given instance
     *
     * @param oid Instance OID
     *
     * @param dsName DisplaySet name
     *
     * @return Supplementary info for a given instance
     */
    String getSuppInfo(TitularOid oid, String dsName);


    /*
     * Implements service actualizarCodigo
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/actualizarCodigo")
    ServiceResponse actualizarCodigo(@RequestBody com.keralty.ae.viewmodel.titular.siu.ActualizarCodigoRequest request);
}
