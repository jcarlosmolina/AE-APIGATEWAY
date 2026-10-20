package com.keralty.ae.service;

import com.keralty.ae.persistence.AbstractAppEntity;
import com.keralty.ae.persistence.FamiliaNovedad;
import com.keralty.ae.persistence.oid.FamiliaNovedadOid;
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

@Path("/api/FamiliaNovedadApi")
@RegisterRestClient(configKey="ae-novedades")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aenovedades}")
public interface FamiliaNovedadService {
    // Query methods

    /*
     * Returns the population of class FamiliaNovedad
     *
     * @return Population of class FamiliaNovedad
     */
    List<FamiliaNovedad> get();
    
    /*
     * Gets the preloaded list of objects of class FamiliaNovedad
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Preloaded list of objects of class FamiliaNovedad
     */
    List<PreloadResponseViewModel> getPreload(QueryRequest queryRequest);
    /*
     * Returns the population of class FamiliaNovedad that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class FamiliaNovedad matching the search criteria
     */
    @GET
    @Path("/")
    List<FamiliaNovedad> get(QueryRequest queryRequest);
    
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
     * Returns an instance of FamiliaNovedad by ID
     *
     * @param familiaNovedadidFamiliaNovedad Identification field familiaNovedadidFamiliaNovedad
     *
     * @return Instance of FamiliaNovedad
     */
    @GET
    @Path("/{familiaNovedadidFamiliaNovedad}")
    FamiliaNovedad getById(@PathParam("familiaNovedadidFamiliaNovedad") Long familiaNovedadidFamiliaNovedad);
    
    /*
     * Returns an instance of FamiliaNovedad by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of FamiliaNovedad
     */
    @GET
    @Path("/getByOid")
    FamiliaNovedad getByOID(@RequestBody FamiliaNovedadOid oid);
    
    /*
     * Returns an instance of FamiliaNovedad by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of FamiliaNovedad
     */
    @GET
    @Path("/getByOIDWithHV")
    FamiliaNovedad getByOIDWithHV(@RequestBody FamiliaNovedadOid oid);

    /*
     * Returns an instance of FamiliaNovedad by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of FamiliaNovedad
     */
    FamiliaNovedad getByJsonOid(String jsonOid);

    /*
     * Returns the list of instances of FamiliaNovedad related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of FamiliaNovedad
     */
    List<FamiliaNovedad> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns the list of instances of FamiliaNovedad related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of FamiliaNovedad
     */
    List<FamiliaNovedad> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns a set of displayset items for an instance of FamiliaNovedad
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Set of displayset items for an instance of FamiliaNovedad
     */
    @POST
    @Path(value = "/GetFamiliaNovedadDynamic")
    InstanceResponseViewModel getFamiliaNovedadDynamic(@RequestBody QueryRequest request);

    /*
     * Returns the supplementary info for a given instance
     *
     * @param oid Instance OID
     *
     * @param dsName DisplaySet name
     *
     * @return Supplementary info for a given instance
     */
    String getSuppInfo(FamiliaNovedadOid oid, String dsName);


    /*
     * Implements service TFIRMARTITULAR
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TFIRMARTITULAR")
    ServiceResponse tFIRMARTITULAR(@RequestBody com.keralty.ae.viewmodel.familianovedad.siu.TFIRMARTITULARRequest request);

    /*
     * Implements service TSETDIRCORR
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TSETDIRCORR")
    ServiceResponse tSETDIRCORR(@RequestBody com.keralty.ae.viewmodel.familianovedad.siu.TSETDIRCORRRequest request);

    /*
     * Checks service TSETDIRCORR preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TSETDIRCORRCheckPreconditions")
    ServiceResponse tSETDIRCORRCheckPreconditions(com.keralty.ae.viewmodel.familianovedad.siu.TSETDIRCORRRequest request);

    /*
     * Implements service TADDTITULAR
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TADDTITULAR")
    ServiceResponse tADDTITULAR(@RequestBody com.keralty.ae.viewmodel.familianovedad.siu.TADDTITULARRequest request);

    /*
     * Checks service TADDTITULAR preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TADDTITULARCheckPreconditions")
    ServiceResponse tADDTITULARCheckPreconditions(com.keralty.ae.viewmodel.familianovedad.siu.TADDTITULARRequest request);

    /*
     * Implements service TFIRMARNUEVOTITULAR
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TFIRMARNUEVOTITULAR")
    ServiceResponse tFIRMARNUEVOTITULAR(@RequestBody com.keralty.ae.viewmodel.familianovedad.siu.TFIRMARNUEVOTITULARRequest request);

    /*
     * Checks service TFIRMARNUEVOTITULAR preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TFIRMARNUEVOTITULARCheckPreconditions")
    ServiceResponse tFIRMARNUEVOTITULARCheckPreconditions(com.keralty.ae.viewmodel.familianovedad.siu.TFIRMARNUEVOTITULARRequest request);

    /*
     * Implements service TDELETE
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TDELETE")
    ServiceResponse tDELETE(@RequestBody com.keralty.ae.viewmodel.familianovedad.siu.TDELETERequest request);

    /*
     * Checks service TDELETE preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TDELETECheckPreconditions")
    ServiceResponse tDELETECheckPreconditions(com.keralty.ae.viewmodel.familianovedad.siu.TDELETERequest request);

    /*
     * Implements service TCREARMANUAL
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TCREARMANUAL")
    ServiceResponse tCREARMANUAL(@RequestBody com.keralty.ae.viewmodel.familianovedad.siu.TCREARMANUALRequest request);

    /*
     * Implements service TMODIFICARMANUAL
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TMODIFICARMANUAL")
    ServiceResponse tMODIFICARMANUAL(@RequestBody com.keralty.ae.viewmodel.familianovedad.siu.TMODIFICARMANUALRequest request);

    /*
     * Implements service TCREARUSUMANUAL
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TCREARUSUMANUAL")
    ServiceResponse tCREARUSUMANUAL(@RequestBody com.keralty.ae.viewmodel.familianovedad.siu.TCREARUSUMANUALRequest request);
}
