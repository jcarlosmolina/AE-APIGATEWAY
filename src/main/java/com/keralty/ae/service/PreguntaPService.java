package com.keralty.ae.service;

import com.keralty.ae.persistence.AbstractAppEntity;
import com.keralty.ae.persistence.oid.PreguntaPOid;
import com.keralty.ae.persistence.PreguntaP;
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

@Path("/api/PreguntaPApi")
@RegisterRestClient(configKey="ae-personas")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aepersonas}")
public interface PreguntaPService {
    // Query methods

    /*
     * Returns the population of class PreguntaP
     *
     * @return Population of class PreguntaP
     */
    List<PreguntaP> get();
    /*
     * Returns the population of class PreguntaP that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class PreguntaP matching the search criteria
     */
    @GET
    @Path("/")
    List<PreguntaP> get(QueryRequest queryRequest);
    
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
     * Returns an instance of PreguntaP by ID
     *
     * @param preguntaPIdentificador Identification field preguntaPIdentificador
     *
     * @return Instance of PreguntaP
     */
    @GET
    @Path("/{preguntaPIdentificador}")
    PreguntaP getById(@PathParam("preguntaPIdentificador") Long preguntaPIdentificador);
    
    /*
     * Returns an instance of PreguntaP by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of PreguntaP
     */
    @GET
    @Path("/getByOid")
    PreguntaP getByOID(@RequestBody PreguntaPOid oid);
    
    /*
     * Returns an instance of PreguntaP by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of PreguntaP
     */
    @GET
    @Path("/getByOIDWithHV")
    PreguntaP getByOIDWithHV(@RequestBody PreguntaPOid oid);

    /*
     * Returns an instance of PreguntaP by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of PreguntaP
     */
    PreguntaP getByJsonOid(String jsonOid);

    /*
     * Returns the list of instances of PreguntaP related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of PreguntaP
     */
    List<PreguntaP> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns the list of instances of PreguntaP related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of PreguntaP
     */
    List<PreguntaP> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns a set of displayset items for an instance of PreguntaP
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Set of displayset items for an instance of PreguntaP
     */
    @POST
    @Path(value = "/GetPreguntaPDynamic")
    InstanceResponseViewModel getPreguntaPDynamic(@RequestBody QueryRequest request);

    /*
     * Returns the supplementary info for a given instance
     *
     * @param oid Instance OID
     *
     * @param dsName DisplaySet name
     *
     * @return Supplementary info for a given instance
     */
    String getSuppInfo(PreguntaPOid oid, String dsName);


    /*
     * Implements service crear
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/crear")
    ServiceResponse crear(@RequestBody com.keralty.ae.viewmodel.preguntap.siu.CrearRequest request);

    /*
     * Implements service marcarRespuesta
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/marcarRespuesta")
    ServiceResponse marcarRespuesta(@RequestBody com.keralty.ae.viewmodel.preguntap.siu.MarcarRespuestaRequest request);

    /*
     * Implements service cambiarVieneDeCore
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/cambiarVieneDeCore")
    ServiceResponse cambiarVieneDeCore(@RequestBody com.keralty.ae.viewmodel.preguntap.siu.CambiarVieneDeCoreRequest request);
}
