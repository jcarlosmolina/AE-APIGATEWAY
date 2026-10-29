package com.keralty.ae.service;

import com.keralty.ae.persistence.oid.UsuarioSistemaExternoOid;
import com.keralty.ae.persistence.UsuarioSistemaExterno;
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

@Path("/api/UsuarioSistemaExternoApi")
@RegisterRestClient(configKey="ae-usuarios")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aeusuarios}")
public interface UsuarioSistemaExternoService {
    // Query methods

    /*
     * Returns the population of class UsuarioSistemaExterno
     *
     * @return Population of class UsuarioSistemaExterno
     */
    List<UsuarioSistemaExterno> get();
    /*
     * Returns the population of class UsuarioSistemaExterno that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class UsuarioSistemaExterno matching the search criteria
     */
    @GET
    @Path("/")
    List<UsuarioSistemaExterno> get(QueryRequest queryRequest);
    
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
     * Returns an instance of UsuarioSistemaExterno by ID
     *
     * @param usuarioSistemaExternoLogin Identification field usuarioSistemaExternoLogin
     *
     * @return Instance of UsuarioSistemaExterno
     */
    @GET
    @Path("/{usuarioSistemaExternoLogin}")
    UsuarioSistemaExterno getById(@PathParam("usuarioSistemaExternoLogin") String usuarioSistemaExternoLogin);
    
    /*
     * Returns an instance of UsuarioSistemaExterno by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of UsuarioSistemaExterno
     */
    @GET
    @Path("/getByOid")
    UsuarioSistemaExterno getByOID(@RequestBody UsuarioSistemaExternoOid oid);
    
    /*
     * Returns an instance of UsuarioSistemaExterno by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of UsuarioSistemaExterno
     */
    @GET
    @Path("/getByOIDWithHV")
    UsuarioSistemaExterno getByOIDWithHV(@RequestBody UsuarioSistemaExternoOid oid);

    /*
     * Returns an instance of UsuarioSistemaExterno by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of UsuarioSistemaExterno
     */
    UsuarioSistemaExterno getByJsonOid(String jsonOid);

    /*
     * Returns a set of displayset items for an instance of UsuarioSistemaExterno
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Set of displayset items for an instance of UsuarioSistemaExterno
     */
    @POST
    @Path(value = "/GetUsuarioSistemaExternoDynamic")
    InstanceResponseViewModel getUsuarioSistemaExternoDynamic(@RequestBody QueryRequest request);

    /*
     * Returns the supplementary info for a given instance
     *
     * @param oid Instance OID
     *
     * @param dsName DisplaySet name
     *
     * @return Supplementary info for a given instance
     */
    String getSuppInfo(UsuarioSistemaExternoOid oid, String dsName);


    /*
     * Implements service crear
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/crear")
    ServiceResponse crear(@RequestBody com.keralty.ae.viewmodel.usuariosistemaexterno.siu.CrearRequest request);

    /*
     * Implements service eliminar
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/eliminar")
    ServiceResponse eliminar(@RequestBody com.keralty.ae.viewmodel.usuariosistemaexterno.siu.EliminarRequest request);

    /*
     * Implements service modificar
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/modificar")
    ServiceResponse modificar(@RequestBody com.keralty.ae.viewmodel.usuariosistemaexterno.siu.ModificarRequest request);

    /*
     * Implements service setPassword
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/setPassword")
    ServiceResponse setPassword(@RequestBody com.keralty.ae.viewmodel.usuariosistemaexterno.siu.SetPasswordRequest request);

    /*
     * Implements service changePassword
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/changePassword")
    ServiceResponse changePassword(@RequestBody com.keralty.ae.viewmodel.usuariosistemaexterno.siu.ChangePasswordRequest request);
}
