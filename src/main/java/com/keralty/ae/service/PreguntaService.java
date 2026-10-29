package com.keralty.ae.service;

import com.keralty.ae.persistence.AbstractAppEntity;
import com.keralty.ae.persistence.oid.PreguntaOid;
import com.keralty.ae.persistence.Pregunta;
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

@Path("/api/PreguntaApi")
@RegisterRestClient(configKey="ae-configuraciones")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aeconfiguraciones}")
public interface PreguntaService {
    // Query methods

    /*
     * Returns the population of class Pregunta
     *
     * @return Population of class Pregunta
     */
    List<Pregunta> get();
    /*
     * Returns the population of class Pregunta that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class Pregunta matching the search criteria
     */
    @GET
    @Path("/")
    List<Pregunta> get(QueryRequest queryRequest);
    
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
     * Returns an instance of Pregunta by ID
     *
     * @param preguntaNumero Identification field preguntaNumero
     *
     * @return Instance of Pregunta
     */
    @GET
    @Path("/{preguntaNumero}")
    Pregunta getById(@PathParam("preguntaNumero") Long preguntaNumero);
    
    /*
     * Returns an instance of Pregunta by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Pregunta
     */
    @GET
    @Path("/getByOid")
    Pregunta getByOID(@RequestBody PreguntaOid oid);
    
    /*
     * Returns an instance of Pregunta by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Pregunta
     */
    @GET
    @Path("/getByOIDWithHV")
    Pregunta getByOIDWithHV(@RequestBody PreguntaOid oid);

    /*
     * Returns an instance of Pregunta by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of Pregunta
     */
    Pregunta getByJsonOid(String jsonOid);

    /*
     * Returns the list of instances of Pregunta related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Pregunta
     */
    List<Pregunta> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns the list of instances of Pregunta related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Pregunta
     */
    List<Pregunta> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns a set of displayset items for an instance of Pregunta
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Set of displayset items for an instance of Pregunta
     */
    @POST
    @Path(value = "/GetPreguntaDynamic")
    InstanceResponseViewModel getPreguntaDynamic(@RequestBody QueryRequest request);

    /*
     * Returns the supplementary info for a given instance
     *
     * @param oid Instance OID
     *
     * @param dsName DisplaySet name
     *
     * @return Supplementary info for a given instance
     */
    String getSuppInfo(PreguntaOid oid, String dsName);


    /*
     * Implements service InsValorPregunta
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/InsValorPregunta")
    ServiceResponse insValorPregunta(@RequestBody com.keralty.ae.viewmodel.pregunta.siu.InsValorPreguntaRequest request);

    /*
     * Implements service DelValorPregunta
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/DelValorPregunta")
    ServiceResponse delValorPregunta(@RequestBody com.keralty.ae.viewmodel.pregunta.siu.DelValorPreguntaRequest request);

    /*
     * Implements service TCREAR
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TCREAR")
    ServiceResponse tCREAR(@RequestBody com.keralty.ae.viewmodel.pregunta.siu.TCREARRequest request);

    /*
     * Checks service TCREAR preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TCREARCheckPreconditions")
    ServiceResponse tCREARCheckPreconditions(com.keralty.ae.viewmodel.pregunta.siu.TCREARRequest request);

    /*
     * Implements service TMODIFICAR
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TMODIFICAR")
    ServiceResponse tMODIFICAR(@RequestBody com.keralty.ae.viewmodel.pregunta.siu.TMODIFICARRequest request);

    /*
     * Checks service TMODIFICAR preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TMODIFICARCheckPreconditions")
    ServiceResponse tMODIFICARCheckPreconditions(com.keralty.ae.viewmodel.pregunta.siu.TMODIFICARRequest request);

    /*
     * Implements service TELIMINAR
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TELIMINAR")
    ServiceResponse tELIMINAR(@RequestBody com.keralty.ae.viewmodel.pregunta.siu.TELIMINARRequest request);
}
