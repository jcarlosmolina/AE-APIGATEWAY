package com.keralty.ae.service;

import com.keralty.ae.persistence.AbstractAppEntity;
import com.keralty.ae.persistence.Funcionario;
import com.keralty.ae.persistence.oid.FuncionarioOid;
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

@Path("/api/FuncionarioApi")
@RegisterRestClient(configKey="ae-usuarios")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aeusuarios}")
public interface FuncionarioService {
    // Query methods

    /*
     * Returns the population of class Funcionario
     *
     * @return Population of class Funcionario
     */
    List<Funcionario> get();
    
    /*
     * Gets the preloaded list of objects of class Funcionario
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Preloaded list of objects of class Funcionario
     */
    List<PreloadResponseViewModel> getPreload(QueryRequest queryRequest);
    /*
     * Returns the population of class Funcionario that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class Funcionario matching the search criteria
     */
    @GET
    @Path("/")
    List<Funcionario> get(QueryRequest queryRequest);
    
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
     * Returns an instance of Funcionario by ID
     *
     * @param funcionarioId Identification field funcionarioId
     *
     * @return Instance of Funcionario
     */
    @GET
    @Path("/{funcionarioId}")
    Funcionario getById(@PathParam("funcionarioId") Long funcionarioId);
    
    /*
     * Returns an instance of Funcionario by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Funcionario
     */
    @GET
    @Path("/getByOid")
    Funcionario getByOID(@RequestBody FuncionarioOid oid);
    
    /*
     * Returns an instance of Funcionario by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Funcionario
     */
    @GET
    @Path("/getByOIDWithHV")
    Funcionario getByOIDWithHV(@RequestBody FuncionarioOid oid);

    /*
     * Returns an instance of Funcionario by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of Funcionario
     */
    Funcionario getByJsonOid(String jsonOid);

    /*
     * Returns the list of instances of Funcionario related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Funcionario
     */
    List<Funcionario> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns the list of instances of Funcionario related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Funcionario
     */
    List<Funcionario> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns a set of displayset items for an instance of Funcionario
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Set of displayset items for an instance of Funcionario
     */
    @POST
    @Path(value = "/GetFuncionarioDynamic")
    InstanceResponseViewModel getFuncionarioDynamic(@RequestBody QueryRequest request);

    /*
     * Returns the supplementary info for a given instance
     *
     * @param oid Instance OID
     *
     * @param dsName DisplaySet name
     *
     * @return Supplementary info for a given instance
     */
    String getSuppInfo(FuncionarioOid oid, String dsName);


    /*
     * Implements service setPassword
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/setPassword")
    ServiceResponse setPassword(@RequestBody com.keralty.ae.viewmodel.funcionario.siu.SetPasswordRequest request);

    /*
     * Implements service CambRolAgente
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/CambRolAgente")
    ServiceResponse cambRolAgente(@RequestBody com.keralty.ae.viewmodel.funcionario.siu.CambRolAgenteRequest request);

    /*
     * Implements service InsReporteFuncionario
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/InsReporteFuncionario")
    ServiceResponse insReporteFuncionario(@RequestBody com.keralty.ae.viewmodel.funcionario.siu.InsReporteFuncionarioRequest request);

    /*
     * Implements service DelReporteFuncionario
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/DelReporteFuncionario")
    ServiceResponse delReporteFuncionario(@RequestBody com.keralty.ae.viewmodel.funcionario.siu.DelReporteFuncionarioRequest request);

    /*
     * Implements service TCAMBIARDISPONIBLE
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TCAMBIARDISPONIBLE")
    ServiceResponse tCAMBIARDISPONIBLE(@RequestBody com.keralty.ae.viewmodel.funcionario.siu.TCAMBIARDISPONIBLERequest request);

    /*
     * Implements service TBORRAR
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TBORRAR")
    ServiceResponse tBORRAR(@RequestBody com.keralty.ae.viewmodel.funcionario.siu.TBORRARRequest request);

    /*
     * Checks service TBORRAR preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TBORRARCheckPreconditions")
    ServiceResponse tBORRARCheckPreconditions(com.keralty.ae.viewmodel.funcionario.siu.TBORRARRequest request);

    /*
     * Implements service changePassword
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/changePassword")
    ServiceResponse changePassword(@RequestBody com.keralty.ae.viewmodel.funcionario.siu.ChangePasswordRequest request);
}
