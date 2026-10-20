package com.keralty.ae.service;

import com.keralty.ae.persistence.ConfiguracionFestivos;
import com.keralty.ae.persistence.oid.ConfiguracionFestivosOid;
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

@Path("/api/ConfiguracionFestivosApi")
@RegisterRestClient(configKey="ae-configuraciones")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aeconfiguraciones}")
public interface ConfiguracionFestivosService {
    // Query methods

    /*
     * Returns the population of class ConfiguracionFestivos
     *
     * @return Population of class ConfiguracionFestivos
     */
    List<ConfiguracionFestivos> get();
    /*
     * Returns the population of class ConfiguracionFestivos that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class ConfiguracionFestivos matching the search criteria
     */
    @GET
    @Path("/")
    List<ConfiguracionFestivos> get(QueryRequest queryRequest);
    
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
     * Returns an instance of ConfiguracionFestivos by ID
     *
     * @param configuracionFestivosId Identification field configuracionFestivosId
     *
     * @return Instance of ConfiguracionFestivos
     */
    @GET
    @Path("/{configuracionFestivosId}")
    ConfiguracionFestivos getById(@PathParam("configuracionFestivosId") Long configuracionFestivosId);
    
    /*
     * Returns an instance of ConfiguracionFestivos by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of ConfiguracionFestivos
     */
    @GET
    @Path("/getByOid")
    ConfiguracionFestivos getByOID(@RequestBody ConfiguracionFestivosOid oid);
    
    /*
     * Returns an instance of ConfiguracionFestivos by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of ConfiguracionFestivos
     */
    @GET
    @Path("/getByOIDWithHV")
    ConfiguracionFestivos getByOIDWithHV(@RequestBody ConfiguracionFestivosOid oid);

    /*
     * Returns an instance of ConfiguracionFestivos by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of ConfiguracionFestivos
     */
    ConfiguracionFestivos getByJsonOid(String jsonOid);

    /*
     * Returns a set of displayset items for an instance of ConfiguracionFestivos
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Set of displayset items for an instance of ConfiguracionFestivos
     */
    @POST
    @Path(value = "/GetConfiguracionFestivosDynamic")
    InstanceResponseViewModel getConfiguracionFestivosDynamic(@RequestBody QueryRequest request);

    /*
     * Returns the supplementary info for a given instance
     *
     * @param oid Instance OID
     *
     * @param dsName DisplaySet name
     *
     * @return Supplementary info for a given instance
     */
    String getSuppInfo(ConfiguracionFestivosOid oid, String dsName);


    /*
     * Implements service crear
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/crear")
    ServiceResponse crear(@RequestBody com.keralty.ae.viewmodel.configuracionfestivos.siu.CrearRequest request);

    /*
     * Implements service eliminar
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/eliminar")
    ServiceResponse eliminar(@RequestBody com.keralty.ae.viewmodel.configuracionfestivos.siu.EliminarRequest request);
}
