package com.keralty.ae.service;

import com.keralty.ae.persistence.AbstractAppEntity;
import com.keralty.ae.persistence.oid.UsuarioNovedadOid;
import com.keralty.ae.persistence.UsuarioNovedad;
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

@Path("/api/UsuarioNovedadApi")
@RegisterRestClient(configKey="ae-novedades")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aenovedades}")
public interface UsuarioNovedadService {
    // Query methods

    /*
     * Returns the population of class UsuarioNovedad
     *
     * @return Population of class UsuarioNovedad
     */
    List<UsuarioNovedad> get();
    
    /*
     * Gets the preloaded list of objects of class UsuarioNovedad
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Preloaded list of objects of class UsuarioNovedad
     */
    List<PreloadResponseViewModel> getPreload(QueryRequest queryRequest);
    /*
     * Returns the population of class UsuarioNovedad that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class UsuarioNovedad matching the search criteria
     */
    @GET
    @Path("/")
    List<UsuarioNovedad> get(QueryRequest queryRequest);
    
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
     * Returns an instance of UsuarioNovedad by ID
     *
     * @param usuarioNovedadidUsuarioNovedad Identification field usuarioNovedadidUsuarioNovedad
     *
     * @return Instance of UsuarioNovedad
     */
    @GET
    @Path("/{usuarioNovedadidUsuarioNovedad}")
    UsuarioNovedad getById(@PathParam("usuarioNovedadidUsuarioNovedad") Long usuarioNovedadidUsuarioNovedad);
    
    /*
     * Returns an instance of UsuarioNovedad by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of UsuarioNovedad
     */
    @GET
    @Path("/getByOid")
    UsuarioNovedad getByOID(@RequestBody UsuarioNovedadOid oid);
    
    /*
     * Returns an instance of UsuarioNovedad by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of UsuarioNovedad
     */
    @GET
    @Path("/getByOIDWithHV")
    UsuarioNovedad getByOIDWithHV(@RequestBody UsuarioNovedadOid oid);

    /*
     * Returns an instance of UsuarioNovedad by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of UsuarioNovedad
     */
    UsuarioNovedad getByJsonOid(String jsonOid);

    /*
     * Returns the list of instances of UsuarioNovedad related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of UsuarioNovedad
     */
    List<UsuarioNovedad> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns the list of instances of UsuarioNovedad related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of UsuarioNovedad
     */
    List<UsuarioNovedad> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns a set of displayset items for an instance of UsuarioNovedad
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Set of displayset items for an instance of UsuarioNovedad
     */
    @POST
    @Path(value = "/GetUsuarioNovedadDynamic")
    InstanceResponseViewModel getUsuarioNovedadDynamic(@RequestBody QueryRequest request);

    /*
     * Returns the supplementary info for a given instance
     *
     * @param oid Instance OID
     *
     * @param dsName DisplaySet name
     *
     * @return Supplementary info for a given instance
     */
    String getSuppInfo(UsuarioNovedadOid oid, String dsName);


    /*
     * Implements service modificarSUNumMeses
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/modificarSUNumMeses")
    ServiceResponse modificarSUNumMeses(@RequestBody com.keralty.ae.viewmodel.usuarionovedad.siu.ModificarSUNumMesesRequest request);

    /*
     * Checks service modificarSUNumMeses preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/modificarSUNumMesesCheckPreconditions")
    ServiceResponse modificarSUNumMesesCheckPreconditions(com.keralty.ae.viewmodel.usuarionovedad.siu.ModificarSUNumMesesRequest request);

    /*
     * Implements service cambiarExcluido
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/cambiarExcluido")
    ServiceResponse cambiarExcluido(@RequestBody com.keralty.ae.viewmodel.usuarionovedad.siu.CambiarExcluidoRequest request);

    /*
     * Checks service cambiarExcluido preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/cambiarExcluidoCheckPreconditions")
    ServiceResponse cambiarExcluidoCheckPreconditions(com.keralty.ae.viewmodel.usuarionovedad.siu.CambiarExcluidoRequest request);

    /*
     * Implements service cambiarRO
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/cambiarRO")
    ServiceResponse cambiarRO(@RequestBody com.keralty.ae.viewmodel.usuarionovedad.siu.CambiarRORequest request);

    /*
     * Checks service cambiarRO preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/cambiarROCheckPreconditions")
    ServiceResponse cambiarROCheckPreconditions(com.keralty.ae.viewmodel.usuarionovedad.siu.CambiarRORequest request);

    /*
     * Implements service cambiarPS
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/cambiarPS")
    ServiceResponse cambiarPS(@RequestBody com.keralty.ae.viewmodel.usuarionovedad.siu.CambiarPSRequest request);

    /*
     * Checks service cambiarPS preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/cambiarPSCheckPreconditions")
    ServiceResponse cambiarPSCheckPreconditions(com.keralty.ae.viewmodel.usuarionovedad.siu.CambiarPSRequest request);

    /*
     * Implements service cambiarAS
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/cambiarAS")
    ServiceResponse cambiarAS(@RequestBody com.keralty.ae.viewmodel.usuarionovedad.siu.CambiarASRequest request);

    /*
     * Checks service cambiarAS preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/cambiarASCheckPreconditions")
    ServiceResponse cambiarASCheckPreconditions(com.keralty.ae.viewmodel.usuarionovedad.siu.CambiarASRequest request);

    /*
     * Implements service TDELETE
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TDELETE")
    ServiceResponse tDELETE(@RequestBody com.keralty.ae.viewmodel.usuarionovedad.siu.TDELETERequest request);

    /*
     * Implements service TCAMBIARPARENTESCO
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TCAMBIARPARENTESCO")
    ServiceResponse tCAMBIARPARENTESCO(@RequestBody com.keralty.ae.viewmodel.usuarionovedad.siu.TCAMBIARPARENTESCORequest request);

    /*
     * Checks service TCAMBIARPARENTESCO preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TCAMBIARPARENTESCOCheckPreconditions")
    ServiceResponse tCAMBIARPARENTESCOCheckPreconditions(com.keralty.ae.viewmodel.usuarionovedad.siu.TCAMBIARPARENTESCORequest request);

    /*
     * Implements service TCAMBIARTIPOIDENT
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TCAMBIARTIPOIDENT")
    ServiceResponse tCAMBIARTIPOIDENT(@RequestBody com.keralty.ae.viewmodel.usuarionovedad.siu.TCAMBIARTIPOIDENTRequest request);

    /*
     * Checks service TCAMBIARTIPOIDENT preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TCAMBIARTIPOIDENTCheckPreconditions")
    ServiceResponse tCAMBIARTIPOIDENTCheckPreconditions(com.keralty.ae.viewmodel.usuarionovedad.siu.TCAMBIARTIPOIDENTRequest request);

    /*
     * Implements service TMODIFICARMANUAL
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TMODIFICARMANUAL")
    ServiceResponse tMODIFICARMANUAL(@RequestBody com.keralty.ae.viewmodel.usuarionovedad.siu.TMODIFICARMANUALRequest request);
}
