package com.keralty.ae.service;

import com.keralty.ae.persistence.AbstractAppEntity;
import com.keralty.ae.persistence.ObsEstado;
import com.keralty.ae.persistence.oid.ObsEstadoOid;
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

@Path("/api/ObsEstadoApi")
@RegisterRestClient(configKey="ae-solicitudes")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aesolicitudes}")
public interface ObsEstadoService {
    // Query methods

    /*
     * Returns the population of class ObsEstado
     *
     * @return Population of class ObsEstado
     */
    List<ObsEstado> get();
    /*
     * Returns the population of class ObsEstado that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class ObsEstado matching the search criteria
     */
    @GET
    @Path("/")
    List<ObsEstado> get(QueryRequest queryRequest);
    
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
     * Returns an instance of ObsEstado by ID
     *
     * @param documentoGIdentificador Identification field documentoGIdentificador
     *
     * @param obsEstadoId Identification field obsEstadoId
     *
     * @return Instance of ObsEstado
     */
    @GET
    @Path("/{documentoGIdentificador}/{obsEstadoId}")
    ObsEstado getById(@PathParam("documentoGIdentificador") Long documentoGIdentificador, @PathParam("obsEstadoId") Long obsEstadoId);
    
    /*
     * Returns an instance of ObsEstado by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of ObsEstado
     */
    @GET
    @Path("/getByOid")
    ObsEstado getByOID(@RequestBody ObsEstadoOid oid);
    
    /*
     * Returns an instance of ObsEstado by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of ObsEstado
     */
    @GET
    @Path("/getByOIDWithHV")
    ObsEstado getByOIDWithHV(@RequestBody ObsEstadoOid oid);

    /*
     * Returns an instance of ObsEstado by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of ObsEstado
     */
    ObsEstado getByJsonOid(String jsonOid);

    /*
     * Returns the list of instances of ObsEstado related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of ObsEstado
     */
    List<ObsEstado> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns the list of instances of ObsEstado related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of ObsEstado
     */
    List<ObsEstado> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns a set of displayset items for an instance of ObsEstado
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Set of displayset items for an instance of ObsEstado
     */
    @POST
    @Path(value = "/GetObsEstadoDynamic")
    InstanceResponseViewModel getObsEstadoDynamic(@RequestBody QueryRequest request);

    /*
     * Returns the supplementary info for a given instance
     *
     * @param oid Instance OID
     *
     * @param dsName DisplaySet name
     *
     * @return Supplementary info for a given instance
     */
    String getSuppInfo(ObsEstadoOid oid, String dsName);


    /*
     * Implements service modificar
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/modificar")
    ServiceResponse modificar(@RequestBody com.keralty.ae.viewmodel.obsestado.siu.ModificarRequest request);

    /*
     * Checks service modificar preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/modificarCheckPreconditions")
    ServiceResponse modificarCheckPreconditions(com.keralty.ae.viewmodel.obsestado.siu.ModificarRequest request);
}
