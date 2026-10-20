package com.keralty.ae.service;

import com.keralty.ae.persistence.AbstractAppEntity;
import com.keralty.ae.persistence.DocumentoG;
import com.keralty.ae.persistence.oid.DocumentoGOid;
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

@Path("/api/DocumentoGApi")
@RegisterRestClient(configKey="ae-solicitudes")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aesolicitudes}")
public interface DocumentoGService {
    // Query methods

    /*
     * Returns the population of class DocumentoG
     *
     * @return Population of class DocumentoG
     */
    List<DocumentoG> get();
    /*
     * Returns the population of class DocumentoG that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class DocumentoG matching the search criteria
     */
    @GET
    @Path("/")
    List<DocumentoG> get(QueryRequest queryRequest);
    
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
     * Returns an instance of DocumentoG by ID
     *
     * @param documentoGIdentificador Identification field documentoGIdentificador
     *
     * @return Instance of DocumentoG
     */
    @GET
    @Path("/{documentoGIdentificador}")
    DocumentoG getById(@PathParam("documentoGIdentificador") Long documentoGIdentificador);
    
    /*
     * Returns an instance of DocumentoG by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of DocumentoG
     */
    @GET
    @Path("/getByOid")
    DocumentoG getByOID(@RequestBody DocumentoGOid oid);
    
    /*
     * Returns an instance of DocumentoG by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of DocumentoG
     */
    @GET
    @Path("/getByOIDWithHV")
    DocumentoG getByOIDWithHV(@RequestBody DocumentoGOid oid);

    /*
     * Returns an instance of DocumentoG by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of DocumentoG
     */
    DocumentoG getByJsonOid(String jsonOid);

    /*
     * Returns the list of instances of DocumentoG related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of DocumentoG
     */
    List<DocumentoG> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns the list of instances of DocumentoG related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of DocumentoG
     */
    List<DocumentoG> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns a set of displayset items for an instance of DocumentoG
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Set of displayset items for an instance of DocumentoG
     */
    @POST
    @Path(value = "/GetDocumentoGDynamic")
    InstanceResponseViewModel getDocumentoGDynamic(@RequestBody QueryRequest request);

    /*
     * Returns the supplementary info for a given instance
     *
     * @param oid Instance OID
     *
     * @param dsName DisplaySet name
     *
     * @return Supplementary info for a given instance
     */
    String getSuppInfo(DocumentoGOid oid, String dsName);


    /*
     * Implements service verDetalles
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/verDetalles")
    ServiceResponse verDetalles(@RequestBody com.keralty.ae.viewmodel.documentog.siu.VerDetallesRequest request);

    /*
     * Implements service previsualizarATO
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/previsualizarATO")
    com.keralty.ae.viewmodel.documentog.siu.PrevisualizarATOResponse previsualizarATO(@RequestBody com.keralty.ae.viewmodel.documentog.siu.PrevisualizarATORequest request);

    /*
     * Checks service previsualizarATO preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/previsualizarATOCheckPreconditions")
    com.keralty.ae.viewmodel.documentog.siu.PrevisualizarATOResponse previsualizarATOCheckPreconditions(com.keralty.ae.viewmodel.documentog.siu.PrevisualizarATORequest request);

    /*
     * Implements service TAPROBAR
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TAPROBAR")
    ServiceResponse tAPROBAR(@RequestBody com.keralty.ae.viewmodel.documentog.siu.TAPROBARRequest request);

    /*
     * Checks service TAPROBAR preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TAPROBARCheckPreconditions")
    ServiceResponse tAPROBARCheckPreconditions(com.keralty.ae.viewmodel.documentog.siu.TAPROBARRequest request);

    /*
     * Implements service TDEVOLVER
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TDEVOLVER")
    com.keralty.ae.viewmodel.documentog.siu.TDEVOLVERResponse tDEVOLVER(@RequestBody com.keralty.ae.viewmodel.documentog.siu.TDEVOLVERRequest request);

    /*
     * Checks service TDEVOLVER preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TDEVOLVERCheckPreconditions")
    com.keralty.ae.viewmodel.documentog.siu.TDEVOLVERResponse tDEVOLVERCheckPreconditions(com.keralty.ae.viewmodel.documentog.siu.TDEVOLVERRequest request);
}
