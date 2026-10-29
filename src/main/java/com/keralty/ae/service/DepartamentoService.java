package com.keralty.ae.service;

import com.keralty.ae.persistence.AbstractAppEntity;
import com.keralty.ae.persistence.Departamento;
import com.keralty.ae.persistence.oid.DepartamentoOid;
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

@Path("/api/DepartamentoApi")
@RegisterRestClient(configKey="ae-configuraciones")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aeconfiguraciones}")
public interface DepartamentoService {
    // Query methods

    /*
     * Returns the population of class Departamento
     *
     * @return Population of class Departamento
     */
    List<Departamento> get();
    
    /*
     * Gets the preloaded list of objects of class Departamento
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Preloaded list of objects of class Departamento
     */
    List<PreloadResponseViewModel> getPreload(QueryRequest queryRequest);
    /*
     * Returns the population of class Departamento that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class Departamento matching the search criteria
     */
    @GET
    @Path("/")
    List<Departamento> get(QueryRequest queryRequest);
    
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
     * Returns an instance of Departamento by ID
     *
     * @param departamentoCodigo Identification field departamentoCodigo
     *
     * @return Instance of Departamento
     */
    @GET
    @Path("/{departamentoCodigo}")
    Departamento getById(@PathParam("departamentoCodigo") Long departamentoCodigo);
    
    /*
     * Returns an instance of Departamento by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Departamento
     */
    @GET
    @Path("/getByOid")
    Departamento getByOID(@RequestBody DepartamentoOid oid);
    
    /*
     * Returns an instance of Departamento by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Departamento
     */
    @GET
    @Path("/getByOIDWithHV")
    Departamento getByOIDWithHV(@RequestBody DepartamentoOid oid);

    /*
     * Returns an instance of Departamento by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of Departamento
     */
    Departamento getByJsonOid(String jsonOid);

    /*
     * Returns the list of instances of Departamento related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Departamento
     */
    List<Departamento> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns the list of instances of Departamento related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Departamento
     */
    List<Departamento> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns a set of displayset items for an instance of Departamento
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Set of displayset items for an instance of Departamento
     */
    @POST
    @Path(value = "/GetDepartamentoDynamic")
    InstanceResponseViewModel getDepartamentoDynamic(@RequestBody QueryRequest request);

    /*
     * Returns the supplementary info for a given instance
     *
     * @param oid Instance OID
     *
     * @param dsName DisplaySet name
     *
     * @return Supplementary info for a given instance
     */
    String getSuppInfo(DepartamentoOid oid, String dsName);


    /*
     * Implements service crear
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/crear")
    ServiceResponse crear(@RequestBody com.keralty.ae.viewmodel.departamento.siu.CrearRequest request);

    /*
     * Implements service eliminar
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/eliminar")
    ServiceResponse eliminar(@RequestBody com.keralty.ae.viewmodel.departamento.siu.EliminarRequest request);

    /*
     * Checks service eliminar preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/eliminarCheckPreconditions")
    ServiceResponse eliminarCheckPreconditions(com.keralty.ae.viewmodel.departamento.siu.EliminarRequest request);

    /*
     * Implements service InsDepartamentoC
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/InsDepartamentoC")
    ServiceResponse insDepartamentoC(@RequestBody com.keralty.ae.viewmodel.departamento.siu.InsDepartamentoCRequest request);

    /*
     * Implements service DelDepartamentoC
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/DelDepartamentoC")
    ServiceResponse delDepartamentoC(@RequestBody com.keralty.ae.viewmodel.departamento.siu.DelDepartamentoCRequest request);

    /*
     * Implements service InsDepartamentoCNac
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/InsDepartamentoCNac")
    ServiceResponse insDepartamentoCNac(@RequestBody com.keralty.ae.viewmodel.departamento.siu.InsDepartamentoCNacRequest request);

    /*
     * Implements service DelDepartamentoCNac
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/DelDepartamentoCNac")
    ServiceResponse delDepartamentoCNac(@RequestBody com.keralty.ae.viewmodel.departamento.siu.DelDepartamentoCNacRequest request);

    /*
     * Implements service InsDepartamentoDirSucursalC
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/InsDepartamentoDirSucursalC")
    ServiceResponse insDepartamentoDirSucursalC(@RequestBody com.keralty.ae.viewmodel.departamento.siu.InsDepartamentoDirSucursalCRequest request);

    /*
     * Implements service DelDepartamentoDirSucursalC
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/DelDepartamentoDirSucursalC")
    ServiceResponse delDepartamentoDirSucursalC(@RequestBody com.keralty.ae.viewmodel.departamento.siu.DelDepartamentoDirSucursalCRequest request);
}
