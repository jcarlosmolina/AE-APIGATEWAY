package com.keralty.ae.service;

import com.keralty.ae.persistence.AbstractAppEntity;
import com.keralty.ae.persistence.oid.SolicitudNovedadOid;
import com.keralty.ae.persistence.SolicitudNovedad;
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

@Path("/api/SolicitudNovedadApi")
@RegisterRestClient(configKey="ae-novedades")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aenovedades}")
public interface SolicitudNovedadService {
    // Query methods

    /*
     * Returns the population of class SolicitudNovedad
     *
     * @return Population of class SolicitudNovedad
     */
    List<SolicitudNovedad> get();
    
    /*
     * Gets the preloaded list of objects of class SolicitudNovedad
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Preloaded list of objects of class SolicitudNovedad
     */
    List<PreloadResponseViewModel> getPreload(QueryRequest queryRequest);
    /*
     * Returns the population of class SolicitudNovedad that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class SolicitudNovedad matching the search criteria
     */
    @GET
    @Path("/")
    List<SolicitudNovedad> get(QueryRequest queryRequest);
    
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
     * Returns an instance of SolicitudNovedad by ID
     *
     * @param solicitudNovedadId Identification field solicitudNovedadId
     *
     * @return Instance of SolicitudNovedad
     */
    @GET
    @Path("/{solicitudNovedadId}")
    SolicitudNovedad getById(@PathParam("solicitudNovedadId") Long solicitudNovedadId);
    
    /*
     * Returns an instance of SolicitudNovedad by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of SolicitudNovedad
     */
    @GET
    @Path("/getByOid")
    SolicitudNovedad getByOID(@RequestBody SolicitudNovedadOid oid);
    
    /*
     * Returns an instance of SolicitudNovedad by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of SolicitudNovedad
     */
    @GET
    @Path("/getByOIDWithHV")
    SolicitudNovedad getByOIDWithHV(@RequestBody SolicitudNovedadOid oid);

    /*
     * Returns an instance of SolicitudNovedad by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of SolicitudNovedad
     */
    SolicitudNovedad getByJsonOid(String jsonOid);

    /*
     * Returns the list of instances of SolicitudNovedad related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of SolicitudNovedad
     */
    List<SolicitudNovedad> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns the list of instances of SolicitudNovedad related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of SolicitudNovedad
     */
    List<SolicitudNovedad> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns a set of displayset items for an instance of SolicitudNovedad
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Set of displayset items for an instance of SolicitudNovedad
     */
    @POST
    @Path(value = "/GetSolicitudNovedadDynamic")
    InstanceResponseViewModel getSolicitudNovedadDynamic(@RequestBody QueryRequest request);

    /*
     * Returns the supplementary info for a given instance
     *
     * @param oid Instance OID
     *
     * @param dsName DisplaySet name
     *
     * @return Supplementary info for a given instance
     */
    String getSuppInfo(SolicitudNovedadOid oid, String dsName);


    /*
     * Implements service modificarNumMeses
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/modificarNumMeses")
    ServiceResponse modificarNumMeses(@RequestBody com.keralty.ae.viewmodel.solicitudnovedad.siu.ModificarNumMesesRequest request);

    /*
     * Checks service modificarNumMeses preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/modificarNumMesesCheckPreconditions")
    ServiceResponse modificarNumMesesCheckPreconditions(com.keralty.ae.viewmodel.solicitudnovedad.siu.ModificarNumMesesRequest request);

    /*
     * Implements service modificarNuevoNombre
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/modificarNuevoNombre")
    ServiceResponse modificarNuevoNombre(@RequestBody com.keralty.ae.viewmodel.solicitudnovedad.siu.ModificarNuevoNombreRequest request);

    /*
     * Checks service modificarNuevoNombre preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/modificarNuevoNombreCheckPreconditions")
    ServiceResponse modificarNuevoNombreCheckPreconditions(com.keralty.ae.viewmodel.solicitudnovedad.siu.ModificarNuevoNombreRequest request);

    /*
     * Implements service registrarObservaciones
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/registrarObservaciones")
    ServiceResponse registrarObservaciones(@RequestBody com.keralty.ae.viewmodel.solicitudnovedad.siu.RegistrarObservacionesRequest request);

    /*
     * Checks service registrarObservaciones preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/registrarObservacionesCheckPreconditions")
    ServiceResponse registrarObservacionesCheckPreconditions(com.keralty.ae.viewmodel.solicitudnovedad.siu.RegistrarObservacionesRequest request);

    /*
     * Implements service dummyNavegarAModificar
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/dummyNavegarAModificar")
    ServiceResponse dummyNavegarAModificar(@RequestBody com.keralty.ae.viewmodel.solicitudnovedad.siu.DummyNavegarAModificarRequest request);

    /*
     * Implements service dummyVerPDF
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/dummyVerPDF")
    ServiceResponse dummyVerPDF(@RequestBody com.keralty.ae.viewmodel.solicitudnovedad.siu.DummyVerPDFRequest request);

    /*
     * Implements service anotarObservaciones
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/anotarObservaciones")
    ServiceResponse anotarObservaciones(@RequestBody com.keralty.ae.viewmodel.solicitudnovedad.siu.AnotarObservacionesRequest request);

    /*
     * Checks service anotarObservaciones preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/anotarObservacionesCheckPreconditions")
    ServiceResponse anotarObservacionesCheckPreconditions(com.keralty.ae.viewmodel.solicitudnovedad.siu.AnotarObservacionesRequest request);

    /*
     * Implements service dummyEstatusSolicitudes
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/dummy_EstatusSolicitudes")
    ServiceResponse dummyEstatusSolicitudes(@RequestBody com.keralty.ae.viewmodel.solicitudnovedad.siu.DummyEstatusSolicitudesRequest request);

    /*
     * Implements service dummyNavegarAConsultar
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/dummyNavegarAConsultar")
    ServiceResponse dummyNavegarAConsultar(@RequestBody com.keralty.ae.viewmodel.solicitudnovedad.siu.DummyNavegarAConsultarRequest request);

    /*
     * Implements service getRutaPlantilla
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/getRutaPlantilla")
    com.keralty.ae.viewmodel.solicitudnovedad.siu.GetRutaPlantillaResponse getRutaPlantilla(@RequestBody com.keralty.ae.viewmodel.solicitudnovedad.siu.GetRutaPlantillaRequest request);

    /*
     * Checks service getRutaPlantilla preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/getRutaPlantillaCheckPreconditions")
    com.keralty.ae.viewmodel.solicitudnovedad.siu.GetRutaPlantillaResponse getRutaPlantillaCheckPreconditions(com.keralty.ae.viewmodel.solicitudnovedad.siu.GetRutaPlantillaRequest request);

    /*
     * Implements service TCREAR
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TCREAR")
    com.keralty.ae.viewmodel.solicitudnovedad.siu.TCREARResponse tCREAR(@RequestBody com.keralty.ae.viewmodel.solicitudnovedad.siu.TCREARRequest request);

    /*
     * Implements service TADDFAMILIA
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TADDFAMILIA")
    ServiceResponse tADDFAMILIA(@RequestBody com.keralty.ae.viewmodel.solicitudnovedad.siu.TADDFAMILIARequest request);

    /*
     * Checks service TADDFAMILIA preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TADDFAMILIACheckPreconditions")
    ServiceResponse tADDFAMILIACheckPreconditions(com.keralty.ae.viewmodel.solicitudnovedad.siu.TADDFAMILIARequest request);

    /*
     * Implements service TMARCARCOMPLETADA
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TMARCARCOMPLETADA")
    com.keralty.ae.viewmodel.solicitudnovedad.siu.TMARCARCOMPLETADAResponse tMARCARCOMPLETADA(@RequestBody com.keralty.ae.viewmodel.solicitudnovedad.siu.TMARCARCOMPLETADARequest request);

    /*
     * Checks service TMARCARCOMPLETADA preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TMARCARCOMPLETADACheckPreconditions")
    com.keralty.ae.viewmodel.solicitudnovedad.siu.TMARCARCOMPLETADAResponse tMARCARCOMPLETADACheckPreconditions(com.keralty.ae.viewmodel.solicitudnovedad.siu.TMARCARCOMPLETADARequest request);

    /*
     * Implements service TCHGNUEVAPERIODICIDAD
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TCHGNUEVAPERIODICIDAD")
    ServiceResponse tCHGNUEVAPERIODICIDAD(@RequestBody com.keralty.ae.viewmodel.solicitudnovedad.siu.TCHGNUEVAPERIODICIDADRequest request);

    /*
     * Checks service TCHGNUEVAPERIODICIDAD preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TCHGNUEVAPERIODICIDADCheckPreconditions")
    ServiceResponse tCHGNUEVAPERIODICIDADCheckPreconditions(com.keralty.ae.viewmodel.solicitudnovedad.siu.TCHGNUEVAPERIODICIDADRequest request);

    /*
     * Implements service TMARCARTRAMITADA
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TMARCARTRAMITADA")
    com.keralty.ae.viewmodel.solicitudnovedad.siu.TMARCARTRAMITADAResponse tMARCARTRAMITADA(@RequestBody com.keralty.ae.viewmodel.solicitudnovedad.siu.TMARCARTRAMITADARequest request);

    /*
     * Checks service TMARCARTRAMITADA preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TMARCARTRAMITADACheckPreconditions")
    com.keralty.ae.viewmodel.solicitudnovedad.siu.TMARCARTRAMITADAResponse tMARCARTRAMITADACheckPreconditions(com.keralty.ae.viewmodel.solicitudnovedad.siu.TMARCARTRAMITADARequest request);

    /*
     * Implements service TMARCARANULADA
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TMARCARANULADA")
    ServiceResponse tMARCARANULADA(@RequestBody com.keralty.ae.viewmodel.solicitudnovedad.siu.TMARCARANULADARequest request);

    /*
     * Checks service TMARCARANULADA preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TMARCARANULADACheckPreconditions")
    ServiceResponse tMARCARANULADACheckPreconditions(com.keralty.ae.viewmodel.solicitudnovedad.siu.TMARCARANULADARequest request);

    /*
     * Implements service TCREAREXCEPCION
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TCREAREXCEPCION")
    com.keralty.ae.viewmodel.solicitudnovedad.siu.TCREAREXCEPCIONResponse tCREAREXCEPCION(@RequestBody com.keralty.ae.viewmodel.solicitudnovedad.siu.TCREAREXCEPCIONRequest request);

    /*
     * Implements service TCAMBIARESTADODOC
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TCAMBIARESTADODOC")
    ServiceResponse tCAMBIARESTADODOC(@RequestBody com.keralty.ae.viewmodel.solicitudnovedad.siu.TCAMBIARESTADODOCRequest request);

    /*
     * Implements service TREASIGNARUSUARIOS
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TREASIGNARUSUARIOS")
    ServiceResponse tREASIGNARUSUARIOS(@RequestBody com.keralty.ae.viewmodel.solicitudnovedad.siu.TREASIGNARUSUARIOSRequest request);

    /*
     * Implements service TFIRMAR
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TFIRMAR")
    ServiceResponse tFIRMAR(@RequestBody com.keralty.ae.viewmodel.solicitudnovedad.siu.TFIRMARRequest request);
}
