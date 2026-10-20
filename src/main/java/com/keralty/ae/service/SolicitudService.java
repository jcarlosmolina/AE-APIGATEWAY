package com.keralty.ae.service;

import com.keralty.ae.persistence.AbstractAppEntity;
import com.keralty.ae.persistence.oid.SolicitudOid;
import com.keralty.ae.persistence.Solicitud;
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

@Path("/api/SolicitudApi")
@RegisterRestClient(configKey="ae-solicitudes")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.ae.utils.TokenUtilities.getToken4aesolicitudes}")
public interface SolicitudService {
    // Query methods

    /*
     * Returns the population of class Solicitud
     *
     * @return Population of class Solicitud
     */
    List<Solicitud> get();
    
    /*
     * Gets the preloaded list of objects of class Solicitud
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Preloaded list of objects of class Solicitud
     */
    List<PreloadResponseViewModel> getPreload(QueryRequest queryRequest);
    /*
     * Returns the population of class Solicitud that matches certain search criteria
     *
     * @param queryRequest Search criteria
     *
     * @return Population of class Solicitud matching the search criteria
     */
    @GET
    @Path("/")
    List<Solicitud> get(QueryRequest queryRequest);
    
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
     * Returns an instance of Solicitud by ID
     *
     * @param aesolicitudesidsolicitud Identification field aesolicitudesidsolicitud
     *
     * @return Instance of Solicitud
     */
    @GET
    @Path("/{aesolicitudesidsolicitud}")
    Solicitud getById(@PathParam("aesolicitudesidsolicitud") Long aesolicitudesidsolicitud);
    
    /*
     * Returns an instance of Solicitud by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Solicitud
     */
    @GET
    @Path("/getByOid")
    Solicitud getByOID(@RequestBody SolicitudOid oid);
    
    /*
     * Returns an instance of Solicitud by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of Solicitud
     */
    @GET
    @Path("/getByOIDWithHV")
    Solicitud getByOIDWithHV(@RequestBody SolicitudOid oid);

    /*
     * Returns an instance of Solicitud by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of Solicitud
     */
    Solicitud getByJsonOid(String jsonOid);

    /*
     * Returns the list of instances of Solicitud related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Solicitud
     */
    List<Solicitud> getByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns the list of instances of Solicitud related to a given instance through
     * a given path
     *
     * @param relatedInstance Related instance
     *
     * @param relatedInstancePath Related instance path
     *
     * @return List of instances of Solicitud
     */
    List<Solicitud> getInstancesByRelated(AbstractAppEntity relatedInstance, String relatedInstancePath);

    /*
     * Returns a set of displayset items for an instance of Solicitud
     *
     * @param queryRequest Request object that dictates the search conditions 
     * to retrieve objects
     *
     * @return Set of displayset items for an instance of Solicitud
     */
    @POST
    @Path(value = "/GetSolicitudDynamic")
    InstanceResponseViewModel getSolicitudDynamic(@RequestBody QueryRequest request);

    /*
     * Returns the supplementary info for a given instance
     *
     * @param oid Instance OID
     *
     * @param dsName DisplaySet name
     *
     * @return Supplementary info for a given instance
     */
    String getSuppInfo(SolicitudOid oid, String dsName);


    /*
     * Implements service InsFormaPagoSolicitud
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/InsFormaPagoSolicitud")
    ServiceResponse insFormaPagoSolicitud(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.InsFormaPagoSolicitudRequest request);

    /*
     * Implements service InsPeriodicidadSolicitud
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/InsPeriodicidadSolicitud")
    ServiceResponse insPeriodicidadSolicitud(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.InsPeriodicidadSolicitudRequest request);

    /*
     * Implements service marcarDatosPagoOK
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/marcarDatosPagoOK")
    ServiceResponse marcarDatosPagoOK(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.MarcarDatosPagoOKRequest request);

    /*
     * Implements service anotarObservaciones
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/anotarObservaciones")
    ServiceResponse anotarObservaciones(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.AnotarObservacionesRequest request);

    /*
     * Checks service anotarObservaciones preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/anotarObservacionesCheckPreconditions")
    ServiceResponse anotarObservacionesCheckPreconditions(com.keralty.ae.viewmodel.solicitud.siu.AnotarObservacionesRequest request);

    /*
     * Implements service dummyPreexistencias
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/dummy_Preexistencias")
    ServiceResponse dummyPreexistencias(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.DummyPreexistenciasRequest request);

    /*
     * Checks service dummyPreexistencias preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/dummy_PreexistenciasCheckPreconditions")
    ServiceResponse dummyPreexistenciasCheckPreconditions(com.keralty.ae.viewmodel.solicitud.siu.DummyPreexistenciasRequest request);

    /*
     * Implements service dummyDiferenciasLiq
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/dummy_DiferenciasLiq")
    ServiceResponse dummyDiferenciasLiq(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.DummyDiferenciasLiqRequest request);

    /*
     * Checks service dummyDiferenciasLiq preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/dummy_DiferenciasLiqCheckPreconditions")
    ServiceResponse dummyDiferenciasLiqCheckPreconditions(com.keralty.ae.viewmodel.solicitud.siu.DummyDiferenciasLiqRequest request);

    /*
     * Implements service dummyRedirigir
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/dummy_Redirigir")
    ServiceResponse dummyRedirigir(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.DummyRedirigirRequest request);

    /*
     * Implements service validarAtributosUsuario
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/validarAtributosUsuario")
    com.keralty.ae.viewmodel.solicitud.siu.ValidarAtributosUsuarioResponse validarAtributosUsuario(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.ValidarAtributosUsuarioRequest request);

    /*
     * Checks service validarAtributosUsuario preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/validarAtributosUsuarioCheckPreconditions")
    com.keralty.ae.viewmodel.solicitud.siu.ValidarAtributosUsuarioResponse validarAtributosUsuarioCheckPreconditions(com.keralty.ae.viewmodel.solicitud.siu.ValidarAtributosUsuarioRequest request);

    /*
     * Implements service calcularURLPasarelaPagos
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/calcularURLPasarelaPagos")
    com.keralty.ae.viewmodel.solicitud.siu.CalcularURLPasarelaPagosResponse calcularURLPasarelaPagos(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.CalcularURLPasarelaPagosRequest request);

    /*
     * Implements service enviarEmailURLPago
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/enviarEmailURLPago")
    ServiceResponse enviarEmailURLPago(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.EnviarEmailURLPagoRequest request);

    /*
     * Implements service InsContratoCASolicitud
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/InsContratoCASolicitud")
    ServiceResponse insContratoCASolicitud(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.InsContratoCASolicitudRequest request);

    /*
     * Implements service DelContratoCASolicitud
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/DelContratoCASolicitud")
    ServiceResponse delContratoCASolicitud(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.DelContratoCASolicitudRequest request);

    /*
     * Implements service setCodTarifa
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/setCodTarifa")
    ServiceResponse setCodTarifa(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.SetCodTarifaRequest request);

    /*
     * Implements service dummyDevolverErroresWS
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/dummyDevolverErroresWS")
    com.keralty.ae.viewmodel.solicitud.siu.DummyDevolverErroresWSResponse dummyDevolverErroresWS(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.DummyDevolverErroresWSRequest request);

    /*
     * Implements service marcarNoCompletada
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/marcarNoCompletada")
    ServiceResponse marcarNoCompletada(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.MarcarNoCompletadaRequest request);

    /*
     * Implements service modFechaInicioContratacion
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/modFechaInicioContratacion")
    ServiceResponse modFechaInicioContratacion(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.ModFechaInicioContratacionRequest request);

    /*
     * Implements service asignarNumContrato
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/asignarNumContrato")
    ServiceResponse asignarNumContrato(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.AsignarNumContratoRequest request);

    /*
     * Implements service dummyGenerarSolicitud
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/dummy_GenerarSolicitud")
    ServiceResponse dummyGenerarSolicitud(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.DummyGenerarSolicitudRequest request);

    /*
     * Implements service enviarSMSInfoPago
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/enviarSMSInfoPago")
    ServiceResponse enviarSMSInfoPago(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.EnviarSMSInfoPagoRequest request);

    /*
     * Implements service dummyEstatusSolicitudes
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/dummy_EstatusSolicitudes")
    ServiceResponse dummyEstatusSolicitudes(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.DummyEstatusSolicitudesRequest request);

    /*
     * Implements service modMarcaCarnet
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/modMarcaCarnet")
    ServiceResponse modMarcaCarnet(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.ModMarcaCarnetRequest request);

    /*
     * Checks service modMarcaCarnet preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/modMarcaCarnetCheckPreconditions")
    ServiceResponse modMarcaCarnetCheckPreconditions(com.keralty.ae.viewmodel.solicitud.siu.ModMarcaCarnetRequest request);

    /*
     * Implements service TMODDIRECCION
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TMODDIRECCION")
    ServiceResponse tMODDIRECCION(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.TMODDIRECCIONRequest request);

    /*
     * Checks service TMODDIRECCION preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TMODDIRECCIONCheckPreconditions")
    ServiceResponse tMODDIRECCIONCheckPreconditions(com.keralty.ae.viewmodel.solicitud.siu.TMODDIRECCIONRequest request);

    /*
     * Implements service TMODIFICARINFOPAGO
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TMODIFICARINFOPAGO")
    ServiceResponse tMODIFICARINFOPAGO(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.TMODIFICARINFOPAGORequest request);

    /*
     * Checks service TMODIFICARINFOPAGO preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TMODIFICARINFOPAGOCheckPreconditions")
    ServiceResponse tMODIFICARINFOPAGOCheckPreconditions(com.keralty.ae.viewmodel.solicitud.siu.TMODIFICARINFOPAGORequest request);

    /*
     * Implements service TCREAROMODFIRMA
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TCREAROMODFIRMA")
    ServiceResponse tCREAROMODFIRMA(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.TCREAROMODFIRMARequest request);

    /*
     * Implements service TCREARSEGUNDAFIRMA
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TCREARSEGUNDAFIRMA")
    ServiceResponse tCREARSEGUNDAFIRMA(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.TCREARSEGUNDAFIRMARequest request);

    /*
     * Checks service TCREARSEGUNDAFIRMA preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TCREARSEGUNDAFIRMACheckPreconditions")
    ServiceResponse tCREARSEGUNDAFIRMACheckPreconditions(com.keralty.ae.viewmodel.solicitud.siu.TCREARSEGUNDAFIRMARequest request);

    /*
     * Implements service TENVIARDOC
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TENVIARDOC")
    com.keralty.ae.viewmodel.solicitud.siu.TENVIARDOCResponse tENVIARDOC(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.TENVIARDOCRequest request);

    /*
     * Implements service TNOTIFICARANULACION
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TNOTIFICARANULACION")
    ServiceResponse tNOTIFICARANULACION(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.TNOTIFICARANULACIONRequest request);

    /*
     * Implements service TNOTIFICARCREAR
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TNOTIFICARCREAR")
    ServiceResponse tNOTIFICARCREAR(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.TNOTIFICARCREARRequest request);

    /*
     * Implements service TNOTIFICARINCLUSION
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TNOTIFICARINCLUSION")
    ServiceResponse tNOTIFICARINCLUSION(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.TNOTIFICARINCLUSIONRequest request);

    /*
     * Implements service TINDICARCONTRATANTE2
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TINDICARCONTRATANTE2")
    ServiceResponse tINDICARCONTRATANTE2(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.TINDICARCONTRATANTE2Request request);

    /*
     * Checks service TINDICARCONTRATANTE2 preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TINDICARCONTRATANTE2CheckPreconditions")
    ServiceResponse tINDICARCONTRATANTE2CheckPreconditions(com.keralty.ae.viewmodel.solicitud.siu.TINDICARCONTRATANTE2Request request);

    /*
     * Implements service TINDICARTITULAR2
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TINDICARTITULAR2")
    ServiceResponse tINDICARTITULAR2(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.TINDICARTITULAR2Request request);

    /*
     * Checks service TINDICARTITULAR2 preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TINDICARTITULAR2CheckPreconditions")
    ServiceResponse tINDICARTITULAR2CheckPreconditions(com.keralty.ae.viewmodel.solicitud.siu.TINDICARTITULAR2Request request);

    /*
     * Implements service TCHGTITBENEFCONT
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TCHGTITBENEFCONT")
    ServiceResponse tCHGTITBENEFCONT(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.TCHGTITBENEFCONTRequest request);

    /*
     * Checks service TCHGTITBENEFCONT preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TCHGTITBENEFCONTCheckPreconditions")
    ServiceResponse tCHGTITBENEFCONTCheckPreconditions(com.keralty.ae.viewmodel.solicitud.siu.TCHGTITBENEFCONTRequest request);

    /*
     * Implements service TMARCARCOMPLETADA
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TMARCARCOMPLETADA")
    com.keralty.ae.viewmodel.solicitud.siu.TMARCARCOMPLETADAResponse tMARCARCOMPLETADA(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.TMARCARCOMPLETADARequest request);

    /*
     * Checks service TMARCARCOMPLETADA preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TMARCARCOMPLETADACheckPreconditions")
    com.keralty.ae.viewmodel.solicitud.siu.TMARCARCOMPLETADAResponse tMARCARCOMPLETADACheckPreconditions(com.keralty.ae.viewmodel.solicitud.siu.TMARCARCOMPLETADARequest request);

    /*
     * Implements service TCAMBIARESTADO
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TCAMBIARESTADO")
    ServiceResponse tCAMBIARESTADO(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.TCAMBIARESTADORequest request);

    /*
     * Implements service TCAMBIARESTADOERROR
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TCAMBIARESTADOERROR")
    ServiceResponse tCAMBIARESTADOERROR(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.TCAMBIARESTADOERRORRequest request);

    /*
     * Checks service TCAMBIARESTADOERROR preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TCAMBIARESTADOERRORCheckPreconditions")
    ServiceResponse tCAMBIARESTADOERRORCheckPreconditions(com.keralty.ae.viewmodel.solicitud.siu.TCAMBIARESTADOERRORRequest request);

    /*
     * Implements service TCAMBIARESTDEVAREAMED
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TCAMBIARESTDEVAREAMED")
    com.keralty.ae.viewmodel.solicitud.siu.TCAMBIARESTDEVAREAMEDResponse tCAMBIARESTDEVAREAMED(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.TCAMBIARESTDEVAREAMEDRequest request);

    /*
     * Checks service TCAMBIARESTDEVAREAMED preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TCAMBIARESTDEVAREAMEDCheckPreconditions")
    com.keralty.ae.viewmodel.solicitud.siu.TCAMBIARESTDEVAREAMEDResponse tCAMBIARESTDEVAREAMEDCheckPreconditions(com.keralty.ae.viewmodel.solicitud.siu.TCAMBIARESTDEVAREAMEDRequest request);

    /*
     * Implements service TCAMBIARESTPENDMEDICO
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TCAMBIARESTPENDMEDICO")
    ServiceResponse tCAMBIARESTPENDMEDICO(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.TCAMBIARESTPENDMEDICORequest request);

    /*
     * Checks service TCAMBIARESTPENDMEDICO preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TCAMBIARESTPENDMEDICOCheckPreconditions")
    ServiceResponse tCAMBIARESTPENDMEDICOCheckPreconditions(com.keralty.ae.viewmodel.solicitud.siu.TCAMBIARESTPENDMEDICORequest request);

    /*
     * Implements service TMODENCABEZADO
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TMODENCABEZADO")
    ServiceResponse tMODENCABEZADO(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.TMODENCABEZADORequest request);

    /*
     * Checks service TMODENCABEZADO preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TMODENCABEZADOCheckPreconditions")
    ServiceResponse tMODENCABEZADOCheckPreconditions(com.keralty.ae.viewmodel.solicitud.siu.TMODENCABEZADORequest request);

    /*
     * Implements service TCAMBIARESTANULADO
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TCAMBIARESTANULADO")
    ServiceResponse tCAMBIARESTANULADO(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.TCAMBIARESTANULADORequest request);

    /*
     * Checks service TCAMBIARESTANULADO preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TCAMBIARESTANULADOCheckPreconditions")
    ServiceResponse tCAMBIARESTANULADOCheckPreconditions(com.keralty.ae.viewmodel.solicitud.siu.TCAMBIARESTANULADORequest request);

    /*
     * Implements service TANULARAUTO
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TANULARAUTO")
    ServiceResponse tANULARAUTO(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.TANULARAUTORequest request);

    /*
     * Implements service TMODDIRSCONTRATANTE
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TMODDIRSCONTRATANTE")
    ServiceResponse tMODDIRSCONTRATANTE(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.TMODDIRSCONTRATANTERequest request);

    /*
     * Checks service TMODDIRSCONTRATANTE preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TMODDIRSCONTRATANTECheckPreconditions")
    ServiceResponse tMODDIRSCONTRATANTECheckPreconditions(com.keralty.ae.viewmodel.solicitud.siu.TMODDIRSCONTRATANTERequest request);

    /*
     * Implements service TMODDIRSTITULAR
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TMODDIRSTITULAR")
    ServiceResponse tMODDIRSTITULAR(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.TMODDIRSTITULARRequest request);

    /*
     * Checks service TMODDIRSTITULAR preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TMODDIRSTITULARCheckPreconditions")
    ServiceResponse tMODDIRSTITULARCheckPreconditions(com.keralty.ae.viewmodel.solicitud.siu.TMODDIRSTITULARRequest request);

    /*
     * Implements service TMODENCABEZADOINCL
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TMODENCABEZADOINCL")
    ServiceResponse tMODENCABEZADOINCL(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.TMODENCABEZADOINCLRequest request);

    /*
     * Checks service TMODENCABEZADOINCL preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TMODENCABEZADOINCLCheckPreconditions")
    ServiceResponse tMODENCABEZADOINCLCheckPreconditions(com.keralty.ae.viewmodel.solicitud.siu.TMODENCABEZADOINCLRequest request);

    /*
     * Implements service TCAMBIARESTAPROBMEDICO
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TCAMBIARESTAPROBMEDICO")
    ServiceResponse tCAMBIARESTAPROBMEDICO(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.TCAMBIARESTAPROBMEDICORequest request);

    /*
     * Checks service TCAMBIARESTAPROBMEDICO preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TCAMBIARESTAPROBMEDICOCheckPreconditions")
    ServiceResponse tCAMBIARESTAPROBMEDICOCheckPreconditions(com.keralty.ae.viewmodel.solicitud.siu.TCAMBIARESTAPROBMEDICORequest request);

    /*
     * Implements service TCAMBIARESTADOADMIN
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TCAMBIARESTADOADMIN")
    ServiceResponse tCAMBIARESTADOADMIN(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.TCAMBIARESTADOADMINRequest request);

    /*
     * Implements service TCREAROMODFIRMACONTINC
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TCREAROMODFIRMACONTINC")
    ServiceResponse tCREAROMODFIRMACONTINC(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.TCREAROMODFIRMACONTINCRequest request);

    /*
     * Checks service TCREAROMODFIRMACONTINC preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TCREAROMODFIRMACONTINCCheckPreconditions")
    ServiceResponse tCREAROMODFIRMACONTINCCheckPreconditions(com.keralty.ae.viewmodel.solicitud.siu.TCREAROMODFIRMACONTINCRequest request);

    /*
     * Implements service TPOSTGENERAREXITO
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TPOSTGENERAREXITO")
    ServiceResponse tPOSTGENERAREXITO(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.TPOSTGENERAREXITORequest request);

    /*
     * Implements service TCAMBIARESTADODOC
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TCAMBIARESTADODOC")
    ServiceResponse tCAMBIARESTADODOC(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.TCAMBIARESTADODOCRequest request);

    /*
     * Checks service TCAMBIARESTADODOC preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TCAMBIARESTADODOCCheckPreconditions")
    ServiceResponse tCAMBIARESTADODOCCheckPreconditions(com.keralty.ae.viewmodel.solicitud.siu.TCAMBIARESTADODOCRequest request);

    /*
     * Implements service TREASIGNARUSUARIOS
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TREASIGNARUSUARIOS")
    com.keralty.ae.viewmodel.solicitud.siu.TREASIGNARUSUARIOSResponse tREASIGNARUSUARIOS(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.TREASIGNARUSUARIOSRequest request);

    /*
     * Checks service TREASIGNARUSUARIOS preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TREASIGNARUSUARIOSCheckPreconditions")
    com.keralty.ae.viewmodel.solicitud.siu.TREASIGNARUSUARIOSResponse tREASIGNARUSUARIOSCheckPreconditions(com.keralty.ae.viewmodel.solicitud.siu.TREASIGNARUSUARIOSRequest request);

    /*
     * Implements service TSUBIRDOCUMENTOATO
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TSUBIRDOCUMENTOATO")
    ServiceResponse tSUBIRDOCUMENTOATO(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.TSUBIRDOCUMENTOATORequest request);

    /*
     * Checks service TSUBIRDOCUMENTOATO preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TSUBIRDOCUMENTOATOCheckPreconditions")
    ServiceResponse tSUBIRDOCUMENTOATOCheckPreconditions(com.keralty.ae.viewmodel.solicitud.siu.TSUBIRDOCUMENTOATORequest request);

    /*
     * Implements service TGETPLANTILLAREPORTE
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TGETPLANTILLAREPORTE")
    com.keralty.ae.viewmodel.solicitud.siu.TGETPLANTILLAREPORTEResponse tGETPLANTILLAREPORTE(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.TGETPLANTILLAREPORTERequest request);

    /*
     * Checks service TGETPLANTILLAREPORTE preconditions individually
     *
     * @param request Service request viewmodel
     *
     * @return Service preconditions evaluation result
     */
    @POST
    @Path("/TGETPLANTILLAREPORTECheckPreconditions")
    com.keralty.ae.viewmodel.solicitud.siu.TGETPLANTILLAREPORTEResponse tGETPLANTILLAREPORTECheckPreconditions(com.keralty.ae.viewmodel.solicitud.siu.TGETPLANTILLAREPORTERequest request);

    /*
     * Implements service TENVIARDOCAUTOAUX
     *
     * @param request Service request viewmodel
     *
     * @return Service response ViewModel encapsulating the execution results
     */
    @POST
    @Path("/TENVIARDOCAUTOAUX")
    ServiceResponse tENVIARDOCAUTOAUX(@RequestBody com.keralty.ae.viewmodel.solicitud.siu.TENVIARDOCAUTOAUXRequest request);
}
