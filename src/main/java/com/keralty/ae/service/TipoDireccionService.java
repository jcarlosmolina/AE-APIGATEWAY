package com.keralty.ae.service;

import com.keralty.ae.persistence.AbstractAppEntity;
import com.keralty.ae.persistence.oid.TipoDireccionOid;
import com.keralty.ae.persistence.TipoDireccion;
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

@Path("/api/TipoDireccionApi")
@RegisterRestClient(configKey="ae-configuraciones")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aeconfiguraciones}")
public interface TipoDireccionService {
    // Query methods

    /*
     * Returns the population of class TipoDireccion
     *
     * @return Population of class TipoDireccion
     */
    List<TipoDireccion> get();
    
    /*
     * Gets the preloaded list of objects of class TipoDireccion
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Preloaded list of objects of class TipoDireccion
     */
    List<PreloadResponseViewModel> getPreload(QueryRequest queryRequest);
    /*
     * Returns the population of class TipoDireccion that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class TipoDireccion matching the search criteria
     */
    @GET
    @Path("/")
    List<TipoDireccion> get(QueryRequest queryRequest);
    
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
     * Returns an instance of TipoDireccion by ID
     *
     * @param tipoDireccionCodigo Identification field tipoDireccionCodigo
     *
     * @return Instance of TipoDireccion
     */
    @GET
    @Path("/{tipoDireccionCodigo}")
    TipoDireccion getById(@PathParam("tipoDireccionCodigo") Long tipoDireccionCodigo);
    
    /*
     * Returns an instance of TipoDireccion by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of TipoDireccion
     */
    @GET
    @Path("/getByOid")
    TipoDireccion getByOID(@RequestBody TipoDireccionOid oid);
    
    /*
     * Returns an instance of TipoDireccion by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of TipoDireccion
     */
    @GET
    @Path("/getByOIDWithHV")
    TipoDireccion getByOIDWithHV(@RequestBody TipoDireccionOid oid);

    /*
     * Returns an instance of TipoDireccion by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of TipoDireccion
     */
    TipoDireccion getByJsonOid(String jsonOid);

    /*
     * Returns the list of instances of TipoDireccion related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of TipoDireccion
     */
    List<TipoDireccion> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns the list of instances of TipoDireccion related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of TipoDireccion
     */
    List<TipoDireccion> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns a set of displayset items for an instance of TipoDireccion
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Set of displayset items for an instance of TipoDireccion
     */
    @POST
    @Path(value = "/GetTipoDireccionDynamic")
    InstanceResponseViewModel getTipoDireccionDynamic(@RequestBody QueryRequest request);

    /*
     * Returns the supplementary info for a given instance
     *
     * @param oid Instance OID
     *
     * @param dsName DisplaySet name
     *
     * @return Supplementary info for a given instance
     */
    String getSuppInfo(TipoDireccionOid oid, String dsName);


    /*
     * Implements service crear
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/crear")
    ServiceResponse crear(@RequestBody com.keralty.ae.viewmodel.tipodireccion.siu.CrearRequest request);

    /*
     * Implements service eliminar
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/eliminar")
    ServiceResponse eliminar(@RequestBody com.keralty.ae.viewmodel.tipodireccion.siu.EliminarRequest request);

    /*
     * Implements service modificar
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/modificar")
    ServiceResponse modificar(@RequestBody com.keralty.ae.viewmodel.tipodireccion.siu.ModificarRequest request);
}
