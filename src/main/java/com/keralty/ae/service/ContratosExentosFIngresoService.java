package com.keralty.ae.service;

import com.keralty.ae.persistence.ContratosExentosFIngreso;
import com.keralty.ae.persistence.oid.ContratosExentosFIngresoOid;
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

@Path("/api/ContratosExentosFIngresoApi")
@RegisterRestClient(configKey="ae-configuraciones")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aeconfiguraciones}")
public interface ContratosExentosFIngresoService {
    // Query methods

    /*
     * Returns the population of class ContratosExentosFIngreso
     *
     * @return Population of class ContratosExentosFIngreso
     */
    List<ContratosExentosFIngreso> get();
    
    /*
     * Gets the preloaded list of objects of class ContratosExentosFIngreso
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Preloaded list of objects of class ContratosExentosFIngreso
     */
    List<PreloadResponseViewModel> getPreload(QueryRequest queryRequest);
    /*
     * Returns the population of class ContratosExentosFIngreso that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class ContratosExentosFIngreso matching the search criteria
     */
    @GET
    @Path("/")
    List<ContratosExentosFIngreso> get(QueryRequest queryRequest);
    
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
     * Returns an instance of ContratosExentosFIngreso by ID
     *
     * @param contratosExentosFIngresoidContratosExentosFIngreso Identification field contratosExentosFIngresoidContratosExentosFIngreso
     *
     * @return Instance of ContratosExentosFIngreso
     */
    @GET
    @Path("/{contratosExentosFIngresoidContratosExentosFIngreso}")
    ContratosExentosFIngreso getById(@PathParam("contratosExentosFIngresoidContratosExentosFIngreso") Long contratosExentosFIngresoidContratosExentosFIngreso);
    
    /*
     * Returns an instance of ContratosExentosFIngreso by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of ContratosExentosFIngreso
     */
    @GET
    @Path("/getByOid")
    ContratosExentosFIngreso getByOID(@RequestBody ContratosExentosFIngresoOid oid);
    
    /*
     * Returns an instance of ContratosExentosFIngreso by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of ContratosExentosFIngreso
     */
    @GET
    @Path("/getByOIDWithHV")
    ContratosExentosFIngreso getByOIDWithHV(@RequestBody ContratosExentosFIngresoOid oid);

    /*
     * Returns an instance of ContratosExentosFIngreso by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of ContratosExentosFIngreso
     */
    ContratosExentosFIngreso getByJsonOid(String jsonOid);

    /*
     * Returns a set of displayset items for an instance of ContratosExentosFIngreso
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Set of displayset items for an instance of ContratosExentosFIngreso
     */
    @POST
    @Path(value = "/GetContratosExentosFIngresoDynamic")
    InstanceResponseViewModel getContratosExentosFIngresoDynamic(@RequestBody QueryRequest request);

    /*
     * Returns the supplementary info for a given instance
     *
     * @param oid Instance OID
     *
     * @param dsName DisplaySet name
     *
     * @return Supplementary info for a given instance
     */
    String getSuppInfo(ContratosExentosFIngresoOid oid, String dsName);

}
