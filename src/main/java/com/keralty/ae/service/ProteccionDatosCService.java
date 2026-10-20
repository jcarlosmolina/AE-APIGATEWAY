package com.keralty.ae.service;

import com.keralty.ae.persistence.AbstractAppEntity;
import com.keralty.ae.persistence.oid.ProteccionDatosCOid;
import com.keralty.ae.persistence.ProteccionDatosC;
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

@Path("/api/ProteccionDatosCApi")
@RegisterRestClient(configKey="ae-solicitudes")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aesolicitudes}")
public interface ProteccionDatosCService {
    // Query methods

    /*
     * Returns the population of class ProteccionDatosC
     *
     * @return Population of class ProteccionDatosC
     */
    List<ProteccionDatosC> get();
    /*
     * Returns the population of class ProteccionDatosC that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class ProteccionDatosC matching the search criteria
     */
    @GET
    @Path("/")
    List<ProteccionDatosC> get(QueryRequest queryRequest);
    
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
     * Returns an instance of ProteccionDatosC by ID
     *
     * @param personaCID Identification field personaCID
     *
     * @param productosProducto Identification field productosProducto
     *
     * @param proteccionDatosCCodigo Identification field proteccionDatosCCodigo
     *
     * @return Instance of ProteccionDatosC
     */
    @GET
    @Path("/{personaCID}/{productosProducto}/{proteccionDatosCCodigo}")
    ProteccionDatosC getById(@PathParam("personaCID") Long personaCID, @PathParam("productosProducto") Long productosProducto, @PathParam("proteccionDatosCCodigo") Long proteccionDatosCCodigo);
    
    /*
     * Returns an instance of ProteccionDatosC by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of ProteccionDatosC
     */
    @GET
    @Path("/getByOid")
    ProteccionDatosC getByOID(@RequestBody ProteccionDatosCOid oid);
    
    /*
     * Returns an instance of ProteccionDatosC by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of ProteccionDatosC
     */
    @GET
    @Path("/getByOIDWithHV")
    ProteccionDatosC getByOIDWithHV(@RequestBody ProteccionDatosCOid oid);

    /*
     * Returns an instance of ProteccionDatosC by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of ProteccionDatosC
     */
    ProteccionDatosC getByJsonOid(String jsonOid);

    /*
     * Returns the list of instances of ProteccionDatosC related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of ProteccionDatosC
     */
    List<ProteccionDatosC> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns the list of instances of ProteccionDatosC related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of ProteccionDatosC
     */
    List<ProteccionDatosC> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns a set of displayset items for an instance of ProteccionDatosC
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Set of displayset items for an instance of ProteccionDatosC
     */
    @POST
    @Path(value = "/GetProteccionDatosCDynamic")
    InstanceResponseViewModel getProteccionDatosCDynamic(@RequestBody QueryRequest request);

    /*
     * Returns the supplementary info for a given instance
     *
     * @param oid Instance OID
     *
     * @param dsName DisplaySet name
     *
     * @return Supplementary info for a given instance
     */
    String getSuppInfo(ProteccionDatosCOid oid, String dsName);

}
