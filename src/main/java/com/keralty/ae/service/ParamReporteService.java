package com.keralty.ae.service;

import com.keralty.ae.persistence.AbstractAppEntity;
import com.keralty.ae.persistence.oid.ParamReporteOid;
import com.keralty.ae.persistence.ParamReporte;
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

@Path("/api/ParamReporteApi")
@RegisterRestClient(configKey="ae-configuraciones")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aeconfiguraciones}")
public interface ParamReporteService {
    // Query methods

    /*
     * Returns the population of class ParamReporte
     *
     * @return Population of class ParamReporte
     */
    List<ParamReporte> get();
    /*
     * Returns the population of class ParamReporte that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class ParamReporte matching the search criteria
     */
    @GET
    @Path("/")
    List<ParamReporte> get(QueryRequest queryRequest);
    
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
     * Returns an instance of ParamReporte by ID
     *
     * @param paramReporteidParamReporte Identification field paramReporteidParamReporte
     *
     * @return Instance of ParamReporte
     */
    @GET
    @Path("/{paramReporteidParamReporte}")
    ParamReporte getById(@PathParam("paramReporteidParamReporte") Long paramReporteidParamReporte);
    
    /*
     * Returns an instance of ParamReporte by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of ParamReporte
     */
    @GET
    @Path("/getByOid")
    ParamReporte getByOID(@RequestBody ParamReporteOid oid);
    
    /*
     * Returns an instance of ParamReporte by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of ParamReporte
     */
    @GET
    @Path("/getByOIDWithHV")
    ParamReporte getByOIDWithHV(@RequestBody ParamReporteOid oid);

    /*
     * Returns an instance of ParamReporte by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of ParamReporte
     */
    ParamReporte getByJsonOid(String jsonOid);

    /*
     * Returns the list of instances of ParamReporte related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of ParamReporte
     */
    List<ParamReporte> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns the list of instances of ParamReporte related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of ParamReporte
     */
    List<ParamReporte> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns a set of displayset items for an instance of ParamReporte
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Set of displayset items for an instance of ParamReporte
     */
    @POST
    @Path(value = "/GetParamReporteDynamic")
    InstanceResponseViewModel getParamReporteDynamic(@RequestBody QueryRequest request);

    /*
     * Returns the supplementary info for a given instance
     *
     * @param oid Instance OID
     *
     * @param dsName DisplaySet name
     *
     * @return Supplementary info for a given instance
     */
    String getSuppInfo(ParamReporteOid oid, String dsName);


    /*
     * Implements service modificar
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/modificar")
    ServiceResponse modificar(@RequestBody com.keralty.ae.viewmodel.paramreporte.siu.ModificarRequest request);

    /*
     * Implements service TNEW
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TNEW")
    ServiceResponse tNEW(@RequestBody com.keralty.ae.viewmodel.paramreporte.siu.TNEWRequest request);

    /*
     * Implements service TDELETE
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TDELETE")
    ServiceResponse tDELETE(@RequestBody com.keralty.ae.viewmodel.paramreporte.siu.TDELETERequest request);

    /*
     * Implements service TSUBIR
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TSUBIR")
    ServiceResponse tSUBIR(@RequestBody com.keralty.ae.viewmodel.paramreporte.siu.TSUBIRRequest request);

    /*
     * Implements service TBAJAR
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TBAJAR")
    ServiceResponse tBAJAR(@RequestBody com.keralty.ae.viewmodel.paramreporte.siu.TBAJARRequest request);
}
