package com.keralty.ae.service;

import com.keralty.ae.persistence.AbstractAppEntity;
import com.keralty.ae.persistence.oid.PriorizacionSolicitudesOid;
import com.keralty.ae.persistence.PriorizacionSolicitudes;
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

@Path("/api/PriorizacionSolicitudesApi")
@RegisterRestClient(configKey="ae-configuraciones")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aeconfiguraciones}")
public interface PriorizacionSolicitudesService {
    // Query methods

    /*
     * Returns the population of class PriorizacionSolicitudes
     *
     * @return Population of class PriorizacionSolicitudes
     */
    List<PriorizacionSolicitudes> get();
    /*
     * Returns the population of class PriorizacionSolicitudes that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class PriorizacionSolicitudes matching the search criteria
     */
    @GET
    @Path("/")
    List<PriorizacionSolicitudes> get(QueryRequest queryRequest);
    
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
     * Returns an instance of PriorizacionSolicitudes by ID
     *
     * @param priorizacionSolicitudesEstadoSolicitud Identification field priorizacionSolicitudesEstadoSolicitud
     *
     * @param priorizacionSolicitudesEstadoDoc Identification field priorizacionSolicitudesEstadoDoc
     *
     * @return Instance of PriorizacionSolicitudes
     */
    @GET
    @Path("/{priorizacionSolicitudesEstadoSolicitud}/{priorizacionSolicitudesEstadoDoc}")
    PriorizacionSolicitudes getById(@PathParam("priorizacionSolicitudesEstadoSolicitud") Long priorizacionSolicitudesEstadoSolicitud, @PathParam("priorizacionSolicitudesEstadoDoc") Long priorizacionSolicitudesEstadoDoc);
    
    /*
     * Returns an instance of PriorizacionSolicitudes by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of PriorizacionSolicitudes
     */
    @GET
    @Path("/getByOid")
    PriorizacionSolicitudes getByOID(@RequestBody PriorizacionSolicitudesOid oid);
    
    /*
     * Returns an instance of PriorizacionSolicitudes by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of PriorizacionSolicitudes
     */
    @GET
    @Path("/getByOIDWithHV")
    PriorizacionSolicitudes getByOIDWithHV(@RequestBody PriorizacionSolicitudesOid oid);

    /*
     * Returns an instance of PriorizacionSolicitudes by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of PriorizacionSolicitudes
     */
    PriorizacionSolicitudes getByJsonOid(String jsonOid);

    /*
     * Returns the list of instances of PriorizacionSolicitudes related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of PriorizacionSolicitudes
     */
    List<PriorizacionSolicitudes> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns the list of instances of PriorizacionSolicitudes related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of PriorizacionSolicitudes
     */
    List<PriorizacionSolicitudes> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns a set of displayset items for an instance of PriorizacionSolicitudes
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Set of displayset items for an instance of PriorizacionSolicitudes
     */
    @POST
    @Path(value = "/GetPriorizacionSolicitudesDynamic")
    InstanceResponseViewModel getPriorizacionSolicitudesDynamic(@RequestBody QueryRequest request);

    /*
     * Returns the supplementary info for a given instance
     *
     * @param oid Instance OID
     *
     * @param dsName DisplaySet name
     *
     * @return Supplementary info for a given instance
     */
    String getSuppInfo(PriorizacionSolicitudesOid oid, String dsName);


    /*
     * Implements service TCREAR
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TCREAR")
    ServiceResponse tCREAR(@RequestBody com.keralty.ae.viewmodel.priorizacionsolicitudes.siu.TCREARRequest request);

    /*
     * Implements service TELIMINAR
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TELIMINAR")
    ServiceResponse tELIMINAR(@RequestBody com.keralty.ae.viewmodel.priorizacionsolicitudes.siu.TELIMINARRequest request);

    /*
     * Implements service TMODIFICAR
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TMODIFICAR")
    ServiceResponse tMODIFICAR(@RequestBody com.keralty.ae.viewmodel.priorizacionsolicitudes.siu.TMODIFICARRequest request);
}
