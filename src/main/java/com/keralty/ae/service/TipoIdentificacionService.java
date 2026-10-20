package com.keralty.ae.service;

import com.keralty.ae.persistence.AbstractAppEntity;
import com.keralty.ae.persistence.oid.TipoIdentificacionOid;
import com.keralty.ae.persistence.TipoIdentificacion;
import com.keralty.ae.viewmodel.InstanceResponseViewModel;
import com.keralty.ae.viewmodel.PopulationResponseViewModel;
import com.keralty.ae.viewmodel.PreloadResponseViewModel;
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

@Path("/api/TipoIdentificacionApi")
@RegisterRestClient(configKey="ae-configuraciones")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aeconfiguraciones}")
public interface TipoIdentificacionService {
    // Query methods

    /*
     * Returns the population of class TipoIdentificacion
     *
     * @return Population of class TipoIdentificacion
     */
    List<TipoIdentificacion> get();
    
    /*
     * Gets the preloaded list of objects of class TipoIdentificacion
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Preloaded list of objects of class TipoIdentificacion
     */
    List<PreloadResponseViewModel> getPreload(QueryRequest queryRequest);
    /*
     * Returns the population of class TipoIdentificacion that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class TipoIdentificacion matching the search criteria
     */
    @GET
    @Path("/")
    List<TipoIdentificacion> get(QueryRequest queryRequest);
    
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
     * Returns the list of instances that matches certain search criteria in a preload query
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return List of instances that matches certain search criteria in a preload query
     */
    @POST
    @Path(value = "/GetWithDisplaySetDynamic")
    PreloadResponseViewModel getWithDisplaySetDynamic(QueryRequest queryRequest);
    
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
     * Returns an instance of TipoIdentificacion by ID
     *
     * @param tipoIdentificacionCodigo Identification field tipoIdentificacionCodigo
     *
     * @return Instance of TipoIdentificacion
     */
    @GET
    @Path("/{tipoIdentificacionCodigo}")
    TipoIdentificacion getById(@PathParam("tipoIdentificacionCodigo") Long tipoIdentificacionCodigo);
    
    /*
     * Returns an instance of TipoIdentificacion by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of TipoIdentificacion
     */
    @GET
    @Path("/getByOid")
    TipoIdentificacion getByOID(@RequestBody TipoIdentificacionOid oid);
    
    /*
     * Returns an instance of TipoIdentificacion by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of TipoIdentificacion
     */
    @GET
    @Path("/getByOIDWithHV")
    TipoIdentificacion getByOIDWithHV(@RequestBody TipoIdentificacionOid oid);

    /*
     * Returns an instance of TipoIdentificacion by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of TipoIdentificacion
     */
    TipoIdentificacion getByJsonOid(String jsonOid);

    /*
     * Returns the list of instances of TipoIdentificacion related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of TipoIdentificacion
     */
    List<TipoIdentificacion> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns the list of instances of TipoIdentificacion related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of TipoIdentificacion
     */
    List<TipoIdentificacion> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns a set of displayset items for an instance of TipoIdentificacion
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Set of displayset items for an instance of TipoIdentificacion
     */
    @POST
    @Path(value = "/GetTipoIdentificacionDynamic")
    InstanceResponseViewModel getTipoIdentificacionDynamic(@RequestBody QueryRequest request);

    /*
     * Returns the supplementary info for a given instance
     *
     * @param oid Instance OID
     *
     * @param dsName DisplaySet name
     *
     * @return Supplementary info for a given instance
     */
    String getSuppInfo(TipoIdentificacionOid oid, String dsName);


    /*
     * Implements service crear
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/crear")
    ServiceResponse crear(@RequestBody com.keralty.ae.viewmodel.tipoidentificacion.siu.CrearRequest request);

    /*
     * Implements service eliminar
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/eliminar")
    ServiceResponse eliminar(@RequestBody com.keralty.ae.viewmodel.tipoidentificacion.siu.EliminarRequest request);

    /*
     * Implements service modificar
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/modificar")
    ServiceResponse modificar(@RequestBody com.keralty.ae.viewmodel.tipoidentificacion.siu.ModificarRequest request);

    /*
     * Implements service InsTipoIdentContratante
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/InsTipoIdentContratante")
    ServiceResponse insTipoIdentContratante(@RequestBody com.keralty.ae.viewmodel.tipoidentificacion.siu.InsTipoIdentContratanteRequest request);

    /*
     * Implements service DelTipoIdentContratante
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/DelTipoIdentContratante")
    ServiceResponse delTipoIdentContratante(@RequestBody com.keralty.ae.viewmodel.tipoidentificacion.siu.DelTipoIdentContratanteRequest request);

    /*
     * Implements service InsTipoIdentificacion
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/InsTipoIdentificacion")
    ServiceResponse insTipoIdentificacion(@RequestBody com.keralty.ae.viewmodel.tipoidentificacion.siu.InsTipoIdentificacionRequest request);

    /*
     * Implements service DelTipoIdentificacion
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/DelTipoIdentificacion")
    ServiceResponse delTipoIdentificacion(@RequestBody com.keralty.ae.viewmodel.tipoidentificacion.siu.DelTipoIdentificacionRequest request);

    /*
     * Implements service InsTipoIdentUsuNovedad
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/InsTipoIdentUsuNovedad")
    ServiceResponse insTipoIdentUsuNovedad(@RequestBody com.keralty.ae.viewmodel.tipoidentificacion.siu.InsTipoIdentUsuNovedadRequest request);

    /*
     * Implements service DelTipoIdentUsuNovedad
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/DelTipoIdentUsuNovedad")
    ServiceResponse delTipoIdentUsuNovedad(@RequestBody com.keralty.ae.viewmodel.tipoidentificacion.siu.DelTipoIdentUsuNovedadRequest request);

    /*
     * Implements service InsTipoIdCDUsuNovedad
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/InsTipoIdCDUsuNovedad")
    ServiceResponse insTipoIdCDUsuNovedad(@RequestBody com.keralty.ae.viewmodel.tipoidentificacion.siu.InsTipoIdCDUsuNovedadRequest request);

    /*
     * Implements service DelTipoIdCDUsuNovedad
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/DelTipoIdCDUsuNovedad")
    ServiceResponse delTipoIdCDUsuNovedad(@RequestBody com.keralty.ae.viewmodel.tipoidentificacion.siu.DelTipoIdCDUsuNovedadRequest request);
}
