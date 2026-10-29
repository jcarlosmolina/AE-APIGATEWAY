package com.keralty.ae.service;

import com.keralty.ae.persistence.AbstractAppEntity;
import com.keralty.ae.persistence.DocumentoNovedad;
import com.keralty.ae.persistence.oid.DocumentoNovedadOid;
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

@Path("/api/DocumentoNovedadApi")
@RegisterRestClient(configKey="ae-novedades")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aenovedades}")
public interface DocumentoNovedadService {
    // Query methods

    /*
     * Returns the population of class DocumentoNovedad
     *
     * @return Population of class DocumentoNovedad
     */
    List<DocumentoNovedad> get();
    
    /*
     * Gets the preloaded list of objects of class DocumentoNovedad
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Preloaded list of objects of class DocumentoNovedad
     */
    List<PreloadResponseViewModel> getPreload(QueryRequest queryRequest);
    /*
     * Returns the population of class DocumentoNovedad that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class DocumentoNovedad matching the search criteria
     */
    @GET
    @Path("/")
    List<DocumentoNovedad> get(QueryRequest queryRequest);
    
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
     * Returns an instance of DocumentoNovedad by ID
     *
     * @param documentoNovedadIdDocumento Identification field documentoNovedadIdDocumento
     *
     * @return Instance of DocumentoNovedad
     */
    @GET
    @Path("/{documentoNovedadIdDocumento}")
    DocumentoNovedad getById(@PathParam("documentoNovedadIdDocumento") Long documentoNovedadIdDocumento);
    
    /*
     * Returns an instance of DocumentoNovedad by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of DocumentoNovedad
     */
    @GET
    @Path("/getByOid")
    DocumentoNovedad getByOID(@RequestBody DocumentoNovedadOid oid);
    
    /*
     * Returns an instance of DocumentoNovedad by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of DocumentoNovedad
     */
    @GET
    @Path("/getByOIDWithHV")
    DocumentoNovedad getByOIDWithHV(@RequestBody DocumentoNovedadOid oid);

    /*
     * Returns an instance of DocumentoNovedad by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of DocumentoNovedad
     */
    DocumentoNovedad getByJsonOid(String jsonOid);

    /*
     * Returns the list of instances of DocumentoNovedad related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of DocumentoNovedad
     */
    List<DocumentoNovedad> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns the list of instances of DocumentoNovedad related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of DocumentoNovedad
     */
    List<DocumentoNovedad> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns a set of displayset items for an instance of DocumentoNovedad
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Set of displayset items for an instance of DocumentoNovedad
     */
    @POST
    @Path(value = "/GetDocumentoNovedadDynamic")
    InstanceResponseViewModel getDocumentoNovedadDynamic(@RequestBody QueryRequest request);

    /*
     * Returns the supplementary info for a given instance
     *
     * @param oid Instance OID
     *
     * @param dsName DisplaySet name
     *
     * @return Supplementary info for a given instance
     */
    String getSuppInfo(DocumentoNovedadOid oid, String dsName);


    /*
     * Implements service descargarDocumentoATO
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/descargarDocumentoATO")
    com.keralty.ae.viewmodel.documentonovedad.siu.DescargarDocumentoATOResponse descargarDocumentoATO(@RequestBody com.keralty.ae.viewmodel.documentonovedad.siu.DescargarDocumentoATORequest request);

    /*
     * Checks service descargarDocumentoATO preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/descargarDocumentoATOCheckPreconditions")
    com.keralty.ae.viewmodel.documentonovedad.siu.DescargarDocumentoATOResponse descargarDocumentoATOCheckPreconditions(com.keralty.ae.viewmodel.documentonovedad.siu.DescargarDocumentoATORequest request);

    /*
     * Implements service TAPROBAR
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TAPROBAR")
    ServiceResponse tAPROBAR(@RequestBody com.keralty.ae.viewmodel.documentonovedad.siu.TAPROBARRequest request);

    /*
     * Implements service TDEVOLVER
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TDEVOLVER")
    ServiceResponse tDEVOLVER(@RequestBody com.keralty.ae.viewmodel.documentonovedad.siu.TDEVOLVERRequest request);

    /*
     * Implements service TCREARATO
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TCREARATO")
    ServiceResponse tCREARATO(@RequestBody com.keralty.ae.viewmodel.documentonovedad.siu.TCREARATORequest request);
}
