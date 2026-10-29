package com.keralty.ae.service;

import com.keralty.ae.persistence.AbstractAppEntity;
import com.keralty.ae.persistence.GrupoAsignacionNovedad;
import com.keralty.ae.persistence.oid.GrupoAsignacionNovedadOid;
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

@Path("/api/GrupoAsignacionNovedadApi")
@RegisterRestClient(configKey="ae-configuraciones")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aeconfiguraciones}")
public interface GrupoAsignacionNovedadService {
    // Query methods

    /*
     * Returns the population of class GrupoAsignacionNovedad
     *
     * @return Population of class GrupoAsignacionNovedad
     */
    List<GrupoAsignacionNovedad> get();
    /*
     * Returns the population of class GrupoAsignacionNovedad that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class GrupoAsignacionNovedad matching the search criteria
     */
    @GET
    @Path("/")
    List<GrupoAsignacionNovedad> get(QueryRequest queryRequest);
    
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
     * Returns an instance of GrupoAsignacionNovedad by ID
     *
     * @param grupoAsignacionNovedadId Identification field grupoAsignacionNovedadId
     *
     * @return Instance of GrupoAsignacionNovedad
     */
    @GET
    @Path("/{grupoAsignacionNovedadId}")
    GrupoAsignacionNovedad getById(@PathParam("grupoAsignacionNovedadId") Long grupoAsignacionNovedadId);
    
    /*
     * Returns an instance of GrupoAsignacionNovedad by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of GrupoAsignacionNovedad
     */
    @GET
    @Path("/getByOid")
    GrupoAsignacionNovedad getByOID(@RequestBody GrupoAsignacionNovedadOid oid);
    
    /*
     * Returns an instance of GrupoAsignacionNovedad by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of GrupoAsignacionNovedad
     */
    @GET
    @Path("/getByOIDWithHV")
    GrupoAsignacionNovedad getByOIDWithHV(@RequestBody GrupoAsignacionNovedadOid oid);

    /*
     * Returns an instance of GrupoAsignacionNovedad by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of GrupoAsignacionNovedad
     */
    GrupoAsignacionNovedad getByJsonOid(String jsonOid);

    /*
     * Returns the list of instances of GrupoAsignacionNovedad related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of GrupoAsignacionNovedad
     */
    List<GrupoAsignacionNovedad> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns the list of instances of GrupoAsignacionNovedad related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of GrupoAsignacionNovedad
     */
    List<GrupoAsignacionNovedad> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns a set of displayset items for an instance of GrupoAsignacionNovedad
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Set of displayset items for an instance of GrupoAsignacionNovedad
     */
    @POST
    @Path(value = "/GetGrupoAsignacionNovedadDynamic")
    InstanceResponseViewModel getGrupoAsignacionNovedadDynamic(@RequestBody QueryRequest request);

    /*
     * Returns the supplementary info for a given instance
     *
     * @param oid Instance OID
     *
     * @param dsName DisplaySet name
     *
     * @return Supplementary info for a given instance
     */
    String getSuppInfo(GrupoAsignacionNovedadOid oid, String dsName);


    /*
     * Implements service eliminar
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/eliminar")
    ServiceResponse eliminar(@RequestBody com.keralty.ae.viewmodel.grupoasignacionnovedad.siu.EliminarRequest request);

    /*
     * Implements service TCREAR
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TCREAR")
    ServiceResponse tCREAR(@RequestBody com.keralty.ae.viewmodel.grupoasignacionnovedad.siu.TCREARRequest request);

    /*
     * Checks service TCREAR preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TCREARCheckPreconditions")
    ServiceResponse tCREARCheckPreconditions(com.keralty.ae.viewmodel.grupoasignacionnovedad.siu.TCREARRequest request);

    /*
     * Implements service TASGGRUPO
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TASGGRUPO")
    ServiceResponse tASGGRUPO(@RequestBody com.keralty.ae.viewmodel.grupoasignacionnovedad.siu.TASGGRUPORequest request);

    /*
     * Checks service TASGGRUPO preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TASGGRUPOCheckPreconditions")
    ServiceResponse tASGGRUPOCheckPreconditions(com.keralty.ae.viewmodel.grupoasignacionnovedad.siu.TASGGRUPORequest request);
}
