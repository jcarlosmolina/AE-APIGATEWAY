package com.keralty.ae.service;

import com.keralty.ae.persistence.AbstractAppEntity;
import com.keralty.ae.persistence.Aesolicitudes;
import com.keralty.ae.persistence.oid.AesolicitudesOid;
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

@Path("/api/Ae_solicitudesApi")
@RegisterRestClient(configKey="ae-solicitudes")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aesolicitudes}")
public interface AesolicitudesService {
    // Query methods

    /*
     * Returns the population of class Aesolicitudes
     *
     * @return Population of class Aesolicitudes
     */
    List<Aesolicitudes> get();
    /*
     * Returns the population of class Aesolicitudes that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class Aesolicitudes matching the search criteria
     */
    @GET
    @Path("/")
    List<Aesolicitudes> get(QueryRequest queryRequest);
    
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
     * Returns an instance of Aesolicitudes by ID
     *
     * @param aesolicitudesidsolicitud Identification field aesolicitudesidsolicitud
     *
     * @return Instance of Aesolicitudes
     */
    @GET
    @Path("/{aesolicitudesidsolicitud}")
    Aesolicitudes getById(@PathParam("aesolicitudesidsolicitud") Long aesolicitudesidsolicitud);
    
    /*
     * Returns an instance of Aesolicitudes by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Aesolicitudes
     */
    @GET
    @Path("/getByOid")
    Aesolicitudes getByOID(@RequestBody AesolicitudesOid oid);
    
    /*
     * Returns an instance of Aesolicitudes by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Aesolicitudes
     */
    @GET
    @Path("/getByOIDWithHV")
    Aesolicitudes getByOIDWithHV(@RequestBody AesolicitudesOid oid);

    /*
     * Returns an instance of Aesolicitudes by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of Aesolicitudes
     */
    Aesolicitudes getByJsonOid(String jsonOid);

    /*
     * Returns the list of instances of Aesolicitudes related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Aesolicitudes
     */
    List<Aesolicitudes> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns the list of instances of Aesolicitudes related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Aesolicitudes
     */
    List<Aesolicitudes> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns a set of displayset items for an instance of Aesolicitudes
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Set of displayset items for an instance of Aesolicitudes
     */
    @POST
    @Path(value = "/GetAesolicitudesDynamic")
    InstanceResponseViewModel getAesolicitudesDynamic(@RequestBody QueryRequest request);

    /*
     * Returns the supplementary info for a given instance
     *
     * @param oid Instance OID
     *
     * @param dsName DisplaySet name
     *
     * @return Supplementary info for a given instance
     */
    String getSuppInfo(AesolicitudesOid oid, String dsName);


    /*
     * Implements service modificarFechaElab
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/modificarFechaElab")
    ServiceResponse modificarFechaElab(@RequestBody com.keralty.ae.viewmodel.aesolicitudes.siu.ModificarFechaElabRequest request);

    /*
     * Implements service TNUEVAAFILIACION
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TNUEVAAFILIACION")
    com.keralty.ae.viewmodel.aesolicitudes.siu.TNUEVAAFILIACIONResponse tNUEVAAFILIACION(@RequestBody com.keralty.ae.viewmodel.aesolicitudes.siu.TNUEVAAFILIACIONRequest request);

    /*
     * Checks service TNUEVAAFILIACION preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TNUEVAAFILIACIONCheckPreconditions")
    com.keralty.ae.viewmodel.aesolicitudes.siu.TNUEVAAFILIACIONResponse tNUEVAAFILIACIONCheckPreconditions(com.keralty.ae.viewmodel.aesolicitudes.siu.TNUEVAAFILIACIONRequest request);

    /*
     * Implements service TINCLUSIONSC
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TINCLUSIONSC")
    com.keralty.ae.viewmodel.aesolicitudes.siu.TINCLUSIONSCResponse tINCLUSIONSC(@RequestBody com.keralty.ae.viewmodel.aesolicitudes.siu.TINCLUSIONSCRequest request);

    /*
     * Checks service TINCLUSIONSC preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TINCLUSIONSCCheckPreconditions")
    com.keralty.ae.viewmodel.aesolicitudes.siu.TINCLUSIONSCResponse tINCLUSIONSCCheckPreconditions(com.keralty.ae.viewmodel.aesolicitudes.siu.TINCLUSIONSCRequest request);
}
