package com.keralty.ae.service;

import com.keralty.ae.persistence.AbstractAppEntity;
import com.keralty.ae.persistence.oid.UsuarioOid;
import com.keralty.ae.persistence.Usuario;
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

@Path("/api/UsuarioApi")
@RegisterRestClient(configKey="ae-personas")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aepersonas}")
public interface UsuarioService {
    // Query methods

    /*
     * Returns the population of class Usuario
     *
     * @return Population of class Usuario
     */
    List<Usuario> get();
    
    /*
     * Gets the preloaded list of objects of class Usuario
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Preloaded list of objects of class Usuario
     */
    List<PreloadResponseViewModel> getPreload(QueryRequest queryRequest);
    /*
     * Returns the population of class Usuario that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class Usuario matching the search criteria
     */
    @GET
    @Path("/")
    List<Usuario> get(QueryRequest queryRequest);
    
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
     * Returns an instance of Usuario by ID
     *
     * @param aesolicitudesidsolicitud Identification field aesolicitudesidsolicitud
     *
     * @param usuarioIdentificador Identification field usuarioIdentificador
     *
     * @return Instance of Usuario
     */
    @GET
    @Path("/{aesolicitudesidsolicitud}/{usuarioIdentificador}")
    Usuario getById(@PathParam("aesolicitudesidsolicitud") Long aesolicitudesidsolicitud, @PathParam("usuarioIdentificador") Long usuarioIdentificador);
    
    /*
     * Returns an instance of Usuario by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Usuario
     */
    @GET
    @Path("/getByOid")
    Usuario getByOID(@RequestBody UsuarioOid oid);
    
    /*
     * Returns an instance of Usuario by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Usuario
     */
    @GET
    @Path("/getByOIDWithHV")
    Usuario getByOIDWithHV(@RequestBody UsuarioOid oid);

    /*
     * Returns an instance of Usuario by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of Usuario
     */
    Usuario getByJsonOid(String jsonOid);

    /*
     * Returns the list of instances of Usuario related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Usuario
     */
    List<Usuario> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns the list of instances of Usuario related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Usuario
     */
    List<Usuario> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns a set of displayset items for an instance of Usuario
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Set of displayset items for an instance of Usuario
     */
    @POST
    @Path(value = "/GetUsuarioDynamic")
    InstanceResponseViewModel getUsuarioDynamic(@RequestBody QueryRequest request);

    /*
     * Returns the supplementary info for a given instance
     *
     * @param oid Instance OID
     *
     * @param dsName DisplaySet name
     *
     * @return Supplementary info for a given instance
     */
    String getSuppInfo(UsuarioOid oid, String dsName);


    /*
     * Implements service showCuesMedico
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/showCuesMedico")
    com.keralty.ae.viewmodel.usuario.siu.ShowCuesMedicoResponse showCuesMedico(@RequestBody com.keralty.ae.viewmodel.usuario.siu.ShowCuesMedicoRequest request);

    /*
     * Checks service showCuesMedico preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/showCuesMedicoCheckPreconditions")
    com.keralty.ae.viewmodel.usuario.siu.ShowCuesMedicoResponse showCuesMedicoCheckPreconditions(com.keralty.ae.viewmodel.usuario.siu.ShowCuesMedicoRequest request);

    /*
     * Implements service TMODIFICARATTR
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TMODIFICARATTR")
    ServiceResponse tMODIFICARATTR(@RequestBody com.keralty.ae.viewmodel.usuario.siu.TMODIFICARATTRRequest request);

    /*
     * Checks service TMODIFICARATTR preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TMODIFICARATTRCheckPreconditions")
    ServiceResponse tMODIFICARATTRCheckPreconditions(com.keralty.ae.viewmodel.usuario.siu.TMODIFICARATTRRequest request);

    /*
     * Implements service TMODUSUARIO
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TMODUSUARIO")
    ServiceResponse tMODUSUARIO(@RequestBody com.keralty.ae.viewmodel.usuario.siu.TMODUSUARIORequest request);

    /*
     * Checks service TMODUSUARIO preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TMODUSUARIOCheckPreconditions")
    ServiceResponse tMODUSUARIOCheckPreconditions(com.keralty.ae.viewmodel.usuario.siu.TMODUSUARIORequest request);

    /*
     * Implements service TELIMINAR
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TELIMINAR")
    ServiceResponse tELIMINAR(@RequestBody com.keralty.ae.viewmodel.usuario.siu.TELIMINARRequest request);

    /*
     * Implements service TCREAROMODANEXOMAT
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TCREAROMODANEXOMAT")
    ServiceResponse tCREAROMODANEXOMAT(@RequestBody com.keralty.ae.viewmodel.usuario.siu.TCREAROMODANEXOMATRequest request);

    /*
     * Checks service TCREAROMODANEXOMAT preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TCREAROMODANEXOMATCheckPreconditions")
    ServiceResponse tCREAROMODANEXOMATCheckPreconditions(com.keralty.ae.viewmodel.usuario.siu.TCREAROMODANEXOMATRequest request);

    /*
     * Implements service TCREAROMODANEXONEO
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TCREAROMODANEXONEO")
    ServiceResponse tCREAROMODANEXONEO(@RequestBody com.keralty.ae.viewmodel.usuario.siu.TCREAROMODANEXONEORequest request);

    /*
     * Checks service TCREAROMODANEXONEO preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TCREAROMODANEXONEOCheckPreconditions")
    ServiceResponse tCREAROMODANEXONEOCheckPreconditions(com.keralty.ae.viewmodel.usuario.siu.TCREAROMODANEXONEORequest request);
}
