package com.keralty.ae.service;

import com.keralty.ae.persistence.AbstractAppEntity;
import com.keralty.ae.persistence.Dominio;
import com.keralty.ae.persistence.oid.DominioOid;
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

@Path("/api/DominioApi")
@RegisterRestClient(configKey="ae-configuraciones")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aeconfiguraciones}")
public interface DominioService {
    // Query methods

    /*
     * Returns the population of class Dominio
     *
     * @return Population of class Dominio
     */
    List<Dominio> get();
    
    /*
     * Gets the preloaded list of objects of class Dominio
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Preloaded list of objects of class Dominio
     */
    List<PreloadResponseViewModel> getPreload(QueryRequest queryRequest);
    /*
     * Returns the population of class Dominio that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class Dominio matching the search criteria
     */
    @GET
    @Path("/")
    List<Dominio> get(QueryRequest queryRequest);
    
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
     * Returns an instance of Dominio by ID
     *
     * @param dominioNumero Identification field dominioNumero
     *
     * @return Instance of Dominio
     */
    @GET
    @Path("/{dominioNumero}")
    Dominio getById(@PathParam("dominioNumero") Long dominioNumero);
    
    /*
     * Returns an instance of Dominio by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Dominio
     */
    @GET
    @Path("/getByOid")
    Dominio getByOID(@RequestBody DominioOid oid);
    
    /*
     * Returns an instance of Dominio by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Dominio
     */
    @GET
    @Path("/getByOIDWithHV")
    Dominio getByOIDWithHV(@RequestBody DominioOid oid);

    /*
     * Returns an instance of Dominio by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of Dominio
     */
    Dominio getByJsonOid(String jsonOid);

    /*
     * Returns the list of instances of Dominio related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Dominio
     */
    List<Dominio> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns the list of instances of Dominio related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Dominio
     */
    List<Dominio> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns a set of displayset items for an instance of Dominio
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Set of displayset items for an instance of Dominio
     */
    @POST
    @Path(value = "/GetDominioDynamic")
    InstanceResponseViewModel getDominioDynamic(@RequestBody QueryRequest request);

    /*
     * Returns the supplementary info for a given instance
     *
     * @param oid Instance OID
     *
     * @param dsName DisplaySet name
     *
     * @return Supplementary info for a given instance
     */
    String getSuppInfo(DominioOid oid, String dsName);


    /*
     * Implements service crear
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/crear")
    com.keralty.ae.viewmodel.dominio.siu.CrearResponse crear(@RequestBody com.keralty.ae.viewmodel.dominio.siu.CrearRequest request);

    /*
     * Checks service crear preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/crearCheckPreconditions")
    com.keralty.ae.viewmodel.dominio.siu.CrearResponse crearCheckPreconditions(com.keralty.ae.viewmodel.dominio.siu.CrearRequest request);

    /*
     * Implements service InsPeriodicidadDominio
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/InsPeriodicidadDominio")
    ServiceResponse insPeriodicidadDominio(@RequestBody com.keralty.ae.viewmodel.dominio.siu.InsPeriodicidadDominioRequest request);

    /*
     * Implements service DelPeriodicidadDominio
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/DelPeriodicidadDominio")
    ServiceResponse delPeriodicidadDominio(@RequestBody com.keralty.ae.viewmodel.dominio.siu.DelPeriodicidadDominioRequest request);

    /*
     * Implements service InsRolDominio
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/InsRolDominio")
    ServiceResponse insRolDominio(@RequestBody com.keralty.ae.viewmodel.dominio.siu.InsRolDominioRequest request);

    /*
     * Implements service DelRollDominio
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/DelRollDominio")
    ServiceResponse delRollDominio(@RequestBody com.keralty.ae.viewmodel.dominio.siu.DelRollDominioRequest request);

    /*
     * Implements service modDatosRespFirma
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/modDatosRespFirma")
    ServiceResponse modDatosRespFirma(@RequestBody com.keralty.ae.viewmodel.dominio.siu.ModDatosRespFirmaRequest request);

    /*
     * Checks service modDatosRespFirma preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/modDatosRespFirmaCheckPreconditions")
    ServiceResponse modDatosRespFirmaCheckPreconditions(com.keralty.ae.viewmodel.dominio.siu.ModDatosRespFirmaRequest request);

    /*
     * Implements service modImagenFirma
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/modImagenFirma")
    ServiceResponse modImagenFirma(@RequestBody com.keralty.ae.viewmodel.dominio.siu.ModImagenFirmaRequest request);

    /*
     * Checks service modImagenFirma preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/modImagenFirmaCheckPreconditions")
    ServiceResponse modImagenFirmaCheckPreconditions(com.keralty.ae.viewmodel.dominio.siu.ModImagenFirmaRequest request);

    /*
     * Implements service InsFormaPago
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/InsFormaPago")
    ServiceResponse insFormaPago(@RequestBody com.keralty.ae.viewmodel.dominio.siu.InsFormaPagoRequest request);

    /*
     * Implements service DelFormaPago
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/DelFormaPago")
    ServiceResponse delFormaPago(@RequestBody com.keralty.ae.viewmodel.dominio.siu.DelFormaPagoRequest request);

    /*
     * Implements service cambiarDiasVigencia
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/cambiarDiasVigencia")
    ServiceResponse cambiarDiasVigencia(@RequestBody com.keralty.ae.viewmodel.dominio.siu.CambiarDiasVigenciaRequest request);

    /*
     * Checks service cambiarDiasVigencia preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/cambiarDiasVigenciaCheckPreconditions")
    ServiceResponse cambiarDiasVigenciaCheckPreconditions(com.keralty.ae.viewmodel.dominio.siu.CambiarDiasVigenciaRequest request);

    /*
     * Implements service modificarConfSolNovedad
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/modificarConfSolNovedad")
    ServiceResponse modificarConfSolNovedad(@RequestBody com.keralty.ae.viewmodel.dominio.siu.ModificarConfSolNovedadRequest request);

    /*
     * Implements service TELIMINAR
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TELIMINAR")
    ServiceResponse tELIMINAR(@RequestBody com.keralty.ae.viewmodel.dominio.siu.TELIMINARRequest request);

    /*
     * Implements service TINSPLANTILLA
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TINSPLANTILLA")
    ServiceResponse tINSPLANTILLA(@RequestBody com.keralty.ae.viewmodel.dominio.siu.TINSPLANTILLARequest request);

    /*
     * Implements service TINSNOVEDAD
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TINSNOVEDAD")
    ServiceResponse tINSNOVEDAD(@RequestBody com.keralty.ae.viewmodel.dominio.siu.TINSNOVEDADRequest request);

    /*
     * Implements service TADDGRPASESORES
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TADDGRPASESORES")
    ServiceResponse tADDGRPASESORES(@RequestBody com.keralty.ae.viewmodel.dominio.siu.TADDGRPASESORESRequest request);

    /*
     * Implements service TDELGRPASESORES
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TDELGRPASESORES")
    ServiceResponse tDELGRPASESORES(@RequestBody com.keralty.ae.viewmodel.dominio.siu.TDELGRPASESORESRequest request);

    /*
     * Implements service TADDGRPMEDICO
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TADDGRPMEDICO")
    ServiceResponse tADDGRPMEDICO(@RequestBody com.keralty.ae.viewmodel.dominio.siu.TADDGRPMEDICORequest request);

    /*
     * Implements service TDELGRPMEDICO
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TDELGRPMEDICO")
    ServiceResponse tDELGRPMEDICO(@RequestBody com.keralty.ae.viewmodel.dominio.siu.TDELGRPMEDICORequest request);

    /*
     * Implements service TADDREPORTE
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TADDREPORTE")
    ServiceResponse tADDREPORTE(@RequestBody com.keralty.ae.viewmodel.dominio.siu.TADDREPORTERequest request);

    /*
     * Checks service TADDREPORTE preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TADDREPORTECheckPreconditions")
    ServiceResponse tADDREPORTECheckPreconditions(com.keralty.ae.viewmodel.dominio.siu.TADDREPORTERequest request);

    /*
     * Implements service TINSINCOMPATIBLE
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TINSINCOMPATIBLE")
    ServiceResponse tINSINCOMPATIBLE(@RequestBody com.keralty.ae.viewmodel.dominio.siu.TINSINCOMPATIBLERequest request);

    /*
     * Implements service TDELINCOMPATIBLE
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TDELINCOMPATIBLE")
    ServiceResponse tDELINCOMPATIBLE(@RequestBody com.keralty.ae.viewmodel.dominio.siu.TDELINCOMPATIBLERequest request);

    /*
     * Implements service TMODIFICAR
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TMODIFICAR")
    ServiceResponse tMODIFICAR(@RequestBody com.keralty.ae.viewmodel.dominio.siu.TMODIFICARRequest request);
}
