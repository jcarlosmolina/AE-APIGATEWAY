package com.keralty.ae.service;

import com.keralty.ae.persistence.AbstractAppEntity;
import com.keralty.ae.persistence.oid.ProteccionDatosOid;
import com.keralty.ae.persistence.ProteccionDatos;
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

@Path("/api/ProteccionDatosApi")
@RegisterRestClient(configKey="ae-solicitudes")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aesolicitudes}")
public interface ProteccionDatosService {
    // Query methods

    /*
     * Returns the population of class ProteccionDatos
     *
     * @return Population of class ProteccionDatos
     */
    List<ProteccionDatos> get();
    /*
     * Returns the population of class ProteccionDatos that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class ProteccionDatos matching the search criteria
     */
    @GET
    @Path("/")
    List<ProteccionDatos> get(QueryRequest queryRequest);
    
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
     * Returns an instance of ProteccionDatos by ID
     *
     * @param proteccionDatosIdentificador Identification field proteccionDatosIdentificador
     *
     * @return Instance of ProteccionDatos
     */
    @GET
    @Path("/{proteccionDatosIdentificador}")
    ProteccionDatos getById(@PathParam("proteccionDatosIdentificador") Long proteccionDatosIdentificador);
    
    /*
     * Returns an instance of ProteccionDatos by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of ProteccionDatos
     */
    @GET
    @Path("/getByOid")
    ProteccionDatos getByOID(@RequestBody ProteccionDatosOid oid);
    
    /*
     * Returns an instance of ProteccionDatos by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of ProteccionDatos
     */
    @GET
    @Path("/getByOIDWithHV")
    ProteccionDatos getByOIDWithHV(@RequestBody ProteccionDatosOid oid);

    /*
     * Returns an instance of ProteccionDatos by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of ProteccionDatos
     */
    ProteccionDatos getByJsonOid(String jsonOid);

    /*
     * Returns the list of instances of ProteccionDatos related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of ProteccionDatos
     */
    List<ProteccionDatos> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns the list of instances of ProteccionDatos related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of ProteccionDatos
     */
    List<ProteccionDatos> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns a set of displayset items for an instance of ProteccionDatos
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Set of displayset items for an instance of ProteccionDatos
     */
    @POST
    @Path(value = "/GetProteccionDatosDynamic")
    InstanceResponseViewModel getProteccionDatosDynamic(@RequestBody QueryRequest request);

    /*
     * Returns the supplementary info for a given instance
     *
     * @param oid Instance OID
     *
     * @param dsName DisplaySet name
     *
     * @return Supplementary info for a given instance
     */
    String getSuppInfo(ProteccionDatosOid oid, String dsName);


    /*
     * Implements service TCREARPROTECCIONDATOSNA
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TCREARPROTECCIONDATOSNA")
    com.keralty.ae.viewmodel.protecciondatos.siu.TCREARPROTECCIONDATOSNAResponse tCREARPROTECCIONDATOSNA(@RequestBody com.keralty.ae.viewmodel.protecciondatos.siu.TCREARPROTECCIONDATOSNARequest request);

    /*
     * Implements service TCREARPROTECCIONDATOSINC
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TCREARPROTECCIONDATOSINC")
    com.keralty.ae.viewmodel.protecciondatos.siu.TCREARPROTECCIONDATOSINCResponse tCREARPROTECCIONDATOSINC(@RequestBody com.keralty.ae.viewmodel.protecciondatos.siu.TCREARPROTECCIONDATOSINCRequest request);

    /*
     * Implements service TCREARSOLNOVEDAD
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TCREARSOLNOVEDAD")
    com.keralty.ae.viewmodel.protecciondatos.siu.TCREARSOLNOVEDADResponse tCREARSOLNOVEDAD(@RequestBody com.keralty.ae.viewmodel.protecciondatos.siu.TCREARSOLNOVEDADRequest request);

    /*
     * Implements service TCREARSOLNOVEDADEXCEPCION
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TCREARSOLNOVEDADEXCEPCION")
    com.keralty.ae.viewmodel.protecciondatos.siu.TCREARSOLNOVEDADEXCEPCIONResponse tCREARSOLNOVEDADEXCEPCION(@RequestBody com.keralty.ae.viewmodel.protecciondatos.siu.TCREARSOLNOVEDADEXCEPCIONRequest request);
}
