package com.keralty.ae.service;

import com.keralty.ae.persistence.AbstractAppEntity;
import com.keralty.ae.persistence.oid.PregCuesMedCOid;
import com.keralty.ae.persistence.PregCuesMedC;
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

@Path("/api/PregCuesMedCApi")
@RegisterRestClient(configKey="ae-personas")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aepersonas}")
public interface PregCuesMedCService {
    // Query methods

    /*
     * Returns the population of class PregCuesMedC
     *
     * @return Population of class PregCuesMedC
     */
    List<PregCuesMedC> get();
    /*
     * Returns the population of class PregCuesMedC that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class PregCuesMedC matching the search criteria
     */
    @GET
    @Path("/")
    List<PregCuesMedC> get(QueryRequest queryRequest);
    
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
     * Returns an instance of PregCuesMedC by ID
     *
     * @param personaCID Identification field personaCID
     *
     * @param pregCuesMedCCodPregunta Identification field pregCuesMedCCodPregunta
     *
     * @return Instance of PregCuesMedC
     */
    @GET
    @Path("/{personaCID}/{pregCuesMedCCodPregunta}")
    PregCuesMedC getById(@PathParam("personaCID") Long personaCID, @PathParam("pregCuesMedCCodPregunta") Long pregCuesMedCCodPregunta);
    
    /*
     * Returns an instance of PregCuesMedC by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of PregCuesMedC
     */
    @GET
    @Path("/getByOid")
    PregCuesMedC getByOID(@RequestBody PregCuesMedCOid oid);
    
    /*
     * Returns an instance of PregCuesMedC by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of PregCuesMedC
     */
    @GET
    @Path("/getByOIDWithHV")
    PregCuesMedC getByOIDWithHV(@RequestBody PregCuesMedCOid oid);

    /*
     * Returns an instance of PregCuesMedC by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of PregCuesMedC
     */
    PregCuesMedC getByJsonOid(String jsonOid);

    /*
     * Returns the list of instances of PregCuesMedC related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of PregCuesMedC
     */
    List<PregCuesMedC> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns the list of instances of PregCuesMedC related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of PregCuesMedC
     */
    List<PregCuesMedC> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns a set of displayset items for an instance of PregCuesMedC
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Set of displayset items for an instance of PregCuesMedC
     */
    @POST
    @Path(value = "/GetPregCuesMedCDynamic")
    InstanceResponseViewModel getPregCuesMedCDynamic(@RequestBody QueryRequest request);

    /*
     * Returns the supplementary info for a given instance
     *
     * @param oid Instance OID
     *
     * @param dsName DisplaySet name
     *
     * @return Supplementary info for a given instance
     */
    String getSuppInfo(PregCuesMedCOid oid, String dsName);

}
