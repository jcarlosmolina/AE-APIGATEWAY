package com.keralty.ae.api.userfunctions;

import com.keralty.ae.global.UserFunctions;
import com.keralty.ae.persistence.AreaMedica;
import com.keralty.ae.persistence.Asesor;
import com.keralty.ae.persistence.CuestionarioMed;
import com.keralty.ae.persistence.Departamento;
import com.keralty.ae.persistence.Direccion;
import com.keralty.ae.persistence.Eps;
import com.keralty.ae.persistence.EstadoBeneficiario;
import com.keralty.ae.persistence.EstadoCivil;
import com.keralty.ae.persistence.EstadoContrato;
import com.keralty.ae.persistence.EstadoPersona;
import com.keralty.ae.persistence.Funcionario;
import com.keralty.ae.persistence.GrupoAsociado;
import com.keralty.ae.persistence.Municipio;
import com.keralty.ae.persistence.Pais;
import com.keralty.ae.persistence.Parentesco;
import com.keralty.ae.persistence.Periodicidad;
import com.keralty.ae.persistence.Planes;
import com.keralty.ae.persistence.PlantillaEmail;
import com.keralty.ae.persistence.Productos;
import com.keralty.ae.persistence.Rol;
import com.keralty.ae.persistence.Solicitud;
import com.keralty.ae.persistence.SolicitudNovedad;
import com.keralty.ae.persistence.TipoDireccion;
import com.keralty.ae.persistence.TipoIdentificacion;
import com.keralty.ae.service.PersonaCService;
import com.keralty.ae.service.PersonaService;
import com.keralty.ae.service.PlanesService;
import com.keralty.ae.service.PlantillaEmailService;
import com.keralty.ae.service.PreguntaService;
import com.keralty.ae.service.ProductosService;
import com.keralty.ae.service.SolicitudService;
import com.keralty.ae.service.UsuarioService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.userfunctions.FuAnadirTextoRequest;
import com.keralty.ae.viewmodel.userfunctions.FuBuscarDocGestorNumIdRequest;
import com.keralty.ae.viewmodel.userfunctions.FuBuscarDocGestorSolicitudRequest;
import com.keralty.ae.viewmodel.userfunctions.FuCalcularIMCRequest;
import com.keralty.ae.viewmodel.userfunctions.FuCalcularIMCUsuarioRequest;
import com.keralty.ae.viewmodel.userfunctions.FuCallSPgetsemaforoareamedRequest;
import com.keralty.ae.viewmodel.userfunctions.FuCallSPgetsemaforograbadornovRequest;
import com.keralty.ae.viewmodel.userfunctions.FuCallSPgetsemaforograbadorRequest;
import com.keralty.ae.viewmodel.userfunctions.FuCallSPgetusuareamedRequest;
import com.keralty.ae.viewmodel.userfunctions.FuCallSPgetusugrabadornovRequest;
import com.keralty.ae.viewmodel.userfunctions.FuCallSPgetusugrabadorRequest;
import com.keralty.ae.viewmodel.userfunctions.FuCheckRegimenSubsidiadoRequest;
import com.keralty.ae.viewmodel.userfunctions.FuconcatenarConNulosRequest;
import com.keralty.ae.viewmodel.userfunctions.FuContieneCharEspecialRequest;
import com.keralty.ae.viewmodel.userfunctions.FuContratoExentoDocSolRequest;
import com.keralty.ae.viewmodel.userfunctions.FuEnviarEmailDevDocRequest;
import com.keralty.ae.viewmodel.userfunctions.FuEnviarEmailRequest;
import com.keralty.ae.viewmodel.userfunctions.FuEnviarSMSRequest;
import com.keralty.ae.viewmodel.userfunctions.FuEstadoSolicitudRequest;
import com.keralty.ae.viewmodel.userfunctions.FuExisteContratoExentoFIngresoRequest;
import com.keralty.ae.viewmodel.userfunctions.FuformarListaValoresPreguntaRequest;
import com.keralty.ae.viewmodel.userfunctions.FuformarMsgErrorUsrSinDocsRequest;
import com.keralty.ae.viewmodel.userfunctions.FuFormarTextoObservacionesRequest;
import com.keralty.ae.viewmodel.userfunctions.FuGenerarReporteOracleRequest;
import com.keralty.ae.viewmodel.userfunctions.FugetAgenteRequest;
import com.keralty.ae.viewmodel.userfunctions.FugetAreaMedicaPorIdRequest;
import com.keralty.ae.viewmodel.userfunctions.FugetAsesorRequest;
import com.keralty.ae.viewmodel.userfunctions.FuGetCodigoPersonaCORERequest;
import com.keralty.ae.viewmodel.userfunctions.FuGetCodTarifaProdPlanAnyoRequest;
import com.keralty.ae.viewmodel.userfunctions.FugetDepartamentoCLRequest;
import com.keralty.ae.viewmodel.userfunctions.FuGetDirResidenciaPersonaRequest;
import com.keralty.ae.viewmodel.userfunctions.FugetEstadoBeneficiarioCOREPorNombreRequest;
import com.keralty.ae.viewmodel.userfunctions.FugetEstadoBeneficiarioCORERequest;
import com.keralty.ae.viewmodel.userfunctions.FugetEstadoCivilRequest;
import com.keralty.ae.viewmodel.userfunctions.FugetEstadoContratoPorNombreRequest;
import com.keralty.ae.viewmodel.userfunctions.FugetEstadoContratoRequest;
import com.keralty.ae.viewmodel.userfunctions.FugetEstadoPersonaRequest;
import com.keralty.ae.viewmodel.userfunctions.FuGetFechaFinVigenciaUsuarioRequest;
import com.keralty.ae.viewmodel.userfunctions.FuGetFInicioPlanVolRequest;
import com.keralty.ae.viewmodel.userfunctions.FugetFuncionarioPorIdRequest;
import com.keralty.ae.viewmodel.userfunctions.FugetFuncionarioPorLDAPRequest;
import com.keralty.ae.viewmodel.userfunctions.FugetGrupoAsocRequest;
import com.keralty.ae.viewmodel.userfunctions.FuGetIdDocIdentidadEnGestorRequest;
import com.keralty.ae.viewmodel.userfunctions.FugetListaErroresRequest;
import com.keralty.ae.viewmodel.userfunctions.FugetMunicipioCLRequest;
import com.keralty.ae.viewmodel.userfunctions.FuGetNombreAsesorRequest;
import com.keralty.ae.viewmodel.userfunctions.FuGetNombreFuncionarioRequest;
import com.keralty.ae.viewmodel.userfunctions.FugetPaisRequest;
import com.keralty.ae.viewmodel.userfunctions.FugetPlanPorCLRequest;
import com.keralty.ae.viewmodel.userfunctions.FugetPlantillaEmailRequest;
import com.keralty.ae.viewmodel.userfunctions.FugetPrioridadRequest;
import com.keralty.ae.viewmodel.userfunctions.FugetProductoPorCLRequest;
import com.keralty.ae.viewmodel.userfunctions.FuGetReporteSolicitudRequest;
import com.keralty.ae.viewmodel.userfunctions.FugetRolRequest;
import com.keralty.ae.viewmodel.userfunctions.FugetSolicitudByNumeroRequest;
import com.keralty.ae.viewmodel.userfunctions.FugetSolicitudNovedadByNumRadicadoRequest;
import com.keralty.ae.viewmodel.userfunctions.FuGetTextoAvisoFirmaRequest;
import com.keralty.ae.viewmodel.userfunctions.FugetTipoIdentificacionRequest;
import com.keralty.ae.viewmodel.userfunctions.FugetValorParametroConfRequest;
import com.keralty.ae.viewmodel.userfunctions.FugetValorTarifaSegunEdadRequest;
import com.keralty.ae.viewmodel.userfunctions.FuObtenerDocumentoRequest;
import com.keralty.ae.viewmodel.userfunctions.FuSoloLetrasRequest;
import com.keralty.ae.viewmodel.userfunctions.FuSoloNumerosRequest;
import com.keralty.ae.viewmodel.userfunctions.FuStrONullRequest;
import com.keralty.ae.viewmodel.userfunctions.FusubstringTextRequest;
import com.keralty.ae.viewmodel.userfunctions.FuSustituirParamsEnURLRequest;
import com.keralty.ae.viewmodel.userfunctions.FuValidarDominioIncompatiblesRequest;
import com.keralty.ae.viewmodel.userfunctions.FuValidarEmailRequest;
import com.keralty.ae.viewmodel.userfunctions.FuValidarNombreRequest;
import com.keralty.ae.viewmodel.userfunctions.FuValidarTelefonoCelularRequest;
import com.keralty.ae.viewmodel.userfunctions.FuValidarTelefonoFijoRequest;
import jakarta.annotation.security.RolesAllowed;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Produces;
import java.sql.Date;
import org.eclipse.microprofile.jwt.JsonWebToken;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/api/UserFunctionsApi")
@RequestScoped
@RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo","UsuarioSistemaExterno"})
public class UserFunctionsApi {

    UserFunctions service;

    @RestClient
    PreguntaService preguntaSrv;

    @RestClient
    ProductosService productosSrv;

    @RestClient
    PlanesService planesSrv;

    @RestClient
    SolicitudService solicitudSrv;

    @RestClient
    PersonaService personaSrv;

    @RestClient
    PersonaCService personaCSrv;

    @RestClient
    UsuarioService usuarioSrv;

    @RestClient
    PlantillaEmailService plantillaEmailSrv;

    JsonWebToken jwt; 

    @Inject
    public UserFunctionsApi(
                UserFunctions service, 
                JsonWebToken jwt) {
        this.service = service;
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @POST
    @Path(value = "/fu_formarListaValoresPregunta")
    @Produces(MediaType.TEXT_PLAIN)
    public String fuformarListaValoresPregunta(FuformarListaValoresPreguntaRequest request) {
        request.setPfuPreguntaInstance(preguntaSrv.getByOIDWithHV(request.getPfuPregunta()));
        return service.fuformarListaValoresPreguntaFun(request);
    }

    @POST
    @Path(value = "/fu_concatenarConNulos")
    @Produces(MediaType.TEXT_PLAIN)
    public String fuconcatenarConNulos(FuconcatenarConNulosRequest request) {
        return service.fuconcatenarConNulosFun(request);
    }

    @POST
    @Path(value = "/fu_getTipoDirResidencial")
    public TipoDireccion fugetTipoDirResidencial() {
        return service.fugetTipoDirResidencialFun();
    }

    @POST
    @Path(value = "/fu_getTipoDirCorrespondencia")
    public TipoDireccion fugetTipoDirCorrespondencia() {
        return service.fugetTipoDirCorrespondenciaFun();
    }

    @POST
    @Path(value = "/fu_ValidarEmail")
    public Boolean fuValidarEmail(FuValidarEmailRequest request) {
        return service.fuValidarEmailFun(request);
    }

    @POST
    @Path(value = "/fu_ValidarNombre")
    public Boolean fuValidarNombre(FuValidarNombreRequest request) {
        return service.fuValidarNombreFun(request);
    }

    @POST
    @Path(value = "/fu_SoloNumeros")
    public Boolean fuSoloNumeros(FuSoloNumerosRequest request) {
        return service.fuSoloNumerosFun(request);
    }

    @POST
    @Path(value = "/fu_ContieneCharEspecial")
    public Boolean fuContieneCharEspecial(FuContieneCharEspecialRequest request) {
        return service.fuContieneCharEspecialFun(request);
    }

    @POST
    @Path(value = "/fu_getTipoIdentificacion")
    public TipoIdentificacion fugetTipoIdentificacion(FugetTipoIdentificacionRequest request) {
        return service.fugetTipoIdentificacionFun(request);
    }

    @POST
    @Path(value = "/fu_getEstadoCivil")
    public EstadoCivil fugetEstadoCivil(FugetEstadoCivilRequest request) {
        return service.fugetEstadoCivilFun(request);
    }

    @POST
    @Path(value = "/fu_getEstadoPersona")
    public EstadoPersona fugetEstadoPersona(FugetEstadoPersonaRequest request) {
        return service.fugetEstadoPersonaFun(request);
    }

    @POST
    @Path(value = "/fu_getPais")
    public Pais fugetPais(FugetPaisRequest request) {
        return service.fugetPaisFun(request);
    }

    @POST
    @Path(value = "/fu_ValidarTelefonoFijo")
    public Boolean fuValidarTelefonoFijo(FuValidarTelefonoFijoRequest request) {
        return service.fuValidarTelefonoFijoFun(request);
    }

    @POST
    @Path(value = "/fu_ValidarTelefonoCelular")
    public Boolean fuValidarTelefonoCelular(FuValidarTelefonoCelularRequest request) {
        return service.fuValidarTelefonoCelularFun(request);
    }

    @POST
    @Path(value = "/fu_StrONull")
    @Produces(MediaType.TEXT_PLAIN)
    public String fuStrONull(FuStrONullRequest request) {
        return service.fuStrONullFun(request);
    }

    @POST
    @Path(value = "/fu_getEPSSanitas")
    public Eps fugetEPSSanitas() {
        return service.fugetEPSSanitasFun();
    }

    @POST
    @Path(value = "/fu_getParentescoTitular")
    public Parentesco fugetParentescoTitular() {
        return service.fugetParentescoTitularFun();
    }

    @POST
    @Path(value = "/fu_getCuestionarioMedico")
    public CuestionarioMed fugetCuestionarioMedico() {
        return service.fugetCuestionarioMedicoFun();
    }

    @POST
    @Path(value = "/fu_getValorParametroConf")
    @Produces(MediaType.TEXT_PLAIN)
    public String fugetValorParametroConf(FugetValorParametroConfRequest request) {
        return service.fugetValorParametroConfFun(request);
    }

    @POST
    @Path(value = "/fu_getRol")
    public Rol fugetRol(FugetRolRequest request) {
        return service.fugetRolFun(request);
    }

    @POST
    @Path(value = "/fu_substringText")
    @Produces(MediaType.TEXT_PLAIN)
    public String fusubstringText(FusubstringTextRequest request) {
        return service.fusubstringTextFun(request);
    }

    @POST
    @Path(value = "/fu_getValorTarifaSegunEdad")
    public Double fugetValorTarifaSegunEdad(FugetValorTarifaSegunEdadRequest request) {
        request.setPfuProductoInstance(productosSrv.getByOIDWithHV(request.getPfuProducto()));
        request.setPfuPlanInstance(planesSrv.getByOIDWithHV(request.getPfuPlan()));
        return service.fugetValorTarifaSegunEdadFun(request);
    }

    @POST
    @Path(value = "/fu_getGrupoAsoc")
    public GrupoAsociado fugetGrupoAsoc(FugetGrupoAsocRequest request) {
        return service.fugetGrupoAsocFun(request);
    }

    @POST
    @Path(value = "/fu_getEstadoBeneficiarioCORE")
    public EstadoBeneficiario fugetEstadoBeneficiarioCORE(FugetEstadoBeneficiarioCORERequest request) {
        return service.fugetEstadoBeneficiarioCOREFun(request);
    }

    @POST
    @Path(value = "/fu_ObtenerDocumento")
    public byte[] fuObtenerDocumento(FuObtenerDocumentoRequest request) {
        return service.fuObtenerDocumentoFun(request);
    }

    @POST
    @Path(value = "/fu_getPeriodicidadMensual")
    public Periodicidad fugetPeriodicidadMensual() {
        return service.fugetPeriodicidadMensualFun();
    }

    @POST
    @Path(value = "/fu_getPlantillaEmail")
    public PlantillaEmail fugetPlantillaEmail(FugetPlantillaEmailRequest request) {
        request.setPfSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getPfSolicitud()));
        return service.fugetPlantillaEmailFun(request);
    }

    @POST
    @Path(value = "/fu_SustituirParamsEnURL")
    @Produces(MediaType.TEXT_PLAIN)
    public String fuSustituirParamsEnURL(FuSustituirParamsEnURLRequest request) {
        request.setPfuSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getPfuSolicitud()));
        return service.fuSustituirParamsEnURLFun(request);
    }

    @POST
    @Path(value = "/fu_EnviarEmail")
    @Produces(MediaType.TEXT_PLAIN)
    public String fuEnviarEmail(FuEnviarEmailRequest request) {
        return service.fuEnviarEmailFun(request);
    }

    @POST
    @Path(value = "/fu_AnadirTexto")
    @Produces(MediaType.TEXT_PLAIN)
    public String fuAnadirTexto(FuAnadirTextoRequest request) {
        return service.fuAnadirTextoFun(request);
    }

    @POST
    @Path(value = "/fu_getEstadoContrato")
    public EstadoContrato fugetEstadoContrato(FugetEstadoContratoRequest request) {
        return service.fugetEstadoContratoFun(request);
    }

    @POST
    @Path(value = "/fu_getDepartamentoCL")
    public Departamento fugetDepartamentoCL(FugetDepartamentoCLRequest request) {
        return service.fugetDepartamentoCLFun(request);
    }

    @POST
    @Path(value = "/fu_getSolicitudByNumero")
    public Solicitud fugetSolicitudByNumero(FugetSolicitudByNumeroRequest request) {
        return service.fugetSolicitudByNumeroFun(request);
    }

    @POST
    @Path(value = "/fu_getAgente")
    public Funcionario fugetAgente(FugetAgenteRequest request) {
        return service.fugetAgenteFun(request);
    }

    @POST
    @Path(value = "/fu_BuscarDocGestorNumId")
    @Produces(MediaType.TEXT_PLAIN)
    public String fuBuscarDocGestorNumId(FuBuscarDocGestorNumIdRequest request) {
        return service.fuBuscarDocGestorNumIdFun(request);
    }

    @POST
    @Path(value = "/fu_BuscarDocGestorSolicitud")
    @Produces(MediaType.TEXT_PLAIN)
    public String fuBuscarDocGestorSolicitud(FuBuscarDocGestorSolicitudRequest request) {
        return service.fuBuscarDocGestorSolicitudFun(request);
    }

    @POST
    @Path(value = "/fu_SoloLetras")
    public Boolean fuSoloLetras(FuSoloLetrasRequest request) {
        return service.fuSoloLetrasFun(request);
    }

    @POST
    @Path(value = "/fu_GetTextoProteccionDatos")
    @Produces(MediaType.TEXT_PLAIN)
    public String fuGetTextoProteccionDatos() {
        return service.fuGetTextoProteccionDatosFun();
    }

    @POST
    @Path(value = "/fu_getAsesor")
    public Asesor fugetAsesor(FugetAsesorRequest request) {
        return service.fugetAsesorFun(request);
    }

    @POST
    @Path(value = "/fu_getMunicipioCL")
    public Municipio fugetMunicipioCL(FugetMunicipioCLRequest request) {
        return service.fugetMunicipioCLFun(request);
    }

    @POST
    @Path(value = "/fu_GetDirResidenciaPersona")
    public Direccion fuGetDirResidenciaPersona(FuGetDirResidenciaPersonaRequest request) {
        request.setPfPersonaInstance(personaSrv.getByOIDWithHV(request.getPfPersona()));
        return service.fuGetDirResidenciaPersonaFun(request);
    }

    @POST
    @Path(value = "/fu_GetTextoAvisoFirma")
    @Produces(MediaType.TEXT_PLAIN)
    public String fuGetTextoAvisoFirma(FuGetTextoAvisoFirmaRequest request) {
        return service.fuGetTextoAvisoFirmaFun(request);
    }

    @POST
    @Path(value = "/fu_getListaErrores")
    @Produces(MediaType.TEXT_PLAIN)
    public String fugetListaErrores(FugetListaErroresRequest request) {
        request.setPfSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getPfSolicitud()));
        return service.fugetListaErroresFun(request);
    }

    @POST
    @Path(value = "/fu_GetCodTarifaProdPlanAnyo")
    @Produces(MediaType.TEXT_PLAIN)
    public String fuGetCodTarifaProdPlanAnyo(FuGetCodTarifaProdPlanAnyoRequest request) {
        request.setPfProductoInstance(productosSrv.getByOIDWithHV(request.getPfProducto()));
        request.setPfPlanInstance(planesSrv.getByOIDWithHV(request.getPfPlan()));
        return service.fuGetCodTarifaProdPlanAnyoFun(request);
    }

    @POST
    @Path(value = "/fu_getProductoPorCL")
    public Productos fugetProductoPorCL(FugetProductoPorCLRequest request) {
        return service.fugetProductoPorCLFun(request);
    }

    @POST
    @Path(value = "/fu_getPlanPorCL")
    public Planes fugetPlanPorCL(FugetPlanPorCLRequest request) {
        return service.fugetPlanPorCLFun(request);
    }

    @POST
    @Path(value = "/fu_getFuncionarioPorLDAP")
    public Funcionario fugetFuncionarioPorLDAP(FugetFuncionarioPorLDAPRequest request) {
        return service.fugetFuncionarioPorLDAPFun(request);
    }

    @POST
    @Path(value = "/fuFormarTextoObservaciones")
    @Produces(MediaType.TEXT_PLAIN)
    public String fuFormarTextoObservaciones(FuFormarTextoObservacionesRequest request) {
        request.setPfSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getPfSolicitud()));
        return service.fuFormarTextoObservacionesFun(request);
    }

    @POST
    @Path(value = "/fuGetCodigoPersonaCORE")
    public Long fuGetCodigoPersonaCORE(FuGetCodigoPersonaCORERequest request) {
        return service.fuGetCodigoPersonaCOREFun(request);
    }

    @POST
    @Path(value = "/fuGetFechaFinVigenciaUsuario")
    @Produces(MediaType.APPLICATION_JSON)
    public Date fuGetFechaFinVigenciaUsuario(FuGetFechaFinVigenciaUsuarioRequest request) {
        return service.fuGetFechaFinVigenciaUsuarioFun(request);
    }

    @POST
    @Path(value = "/fuGetNombreAsesor")
    @Produces(MediaType.TEXT_PLAIN)
    public String fuGetNombreAsesor(FuGetNombreAsesorRequest request) {
        return service.fuGetNombreAsesorFun(request);
    }

    @POST
    @Path(value = "/fuGetNombreFuncionario")
    @Produces(MediaType.TEXT_PLAIN)
    public String fuGetNombreFuncionario(FuGetNombreFuncionarioRequest request) {
        return service.fuGetNombreFuncionarioFun(request);
    }

    @POST
    @Path(value = "/fu_formarMsgErrorUsrSinDocs")
    @Produces(MediaType.TEXT_PLAIN)
    public String fuformarMsgErrorUsrSinDocs(FuformarMsgErrorUsrSinDocsRequest request) {
        request.setPfSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getPfSolicitud()));
        return service.fuformarMsgErrorUsrSinDocsFun(request);
    }

    @POST
    @Path(value = "/fu_EnviarEmailDevDoc")
    @Produces(MediaType.TEXT_PLAIN)
    public String fuEnviarEmailDevDoc(FuEnviarEmailDevDocRequest request) {
        return service.fuEnviarEmailDevDocFun(request);
    }

    @POST
    @Path(value = "/fu_ContratoExentoDocSol")
    public Boolean fuContratoExentoDocSol(FuContratoExentoDocSolRequest request) {
        return service.fuContratoExentoDocSolFun(request);
    }

    @POST
    @Path(value = "/fu_EstadoSolicitud")
    @Produces(MediaType.TEXT_PLAIN)
    public String fuEstadoSolicitud(FuEstadoSolicitudRequest request) {
        return service.fuEstadoSolicitudFun(request);
    }

    @POST
    @Path(value = "/fuGenerarReporteOracle")
    public byte[] fuGenerarReporteOracle(FuGenerarReporteOracleRequest request) {
        return service.fuGenerarReporteOracleFun(request);
    }

    @POST
    @Path(value = "/fuCalcularIMC")
    public Double fuCalcularIMC(FuCalcularIMCRequest request) {
        request.setPfPersonaCInstance(personaCSrv.getByOIDWithHV(request.getPfPersonaC()));
        return service.fuCalcularIMCFun(request);
    }

    @POST
    @Path(value = "/fu_GetEstadoPersonaError")
    public EstadoBeneficiario fuGetEstadoPersonaError() {
        return service.fuGetEstadoPersonaErrorFun();
    }

    @POST
    @Path(value = "/fuCalcularIMCUsuario")
    public Double fuCalcularIMCUsuario(FuCalcularIMCUsuarioRequest request) {
        request.setPfUsuarioInstance(usuarioSrv.getByOIDWithHV(request.getPfUsuario()));
        return service.fuCalcularIMCUsuarioFun(request);
    }

    @POST
    @Path(value = "/fu_EnviarSMS")
    @Produces(MediaType.TEXT_PLAIN)
    public String fuEnviarSMS(FuEnviarSMSRequest request) {
        request.setPfSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getPfSolicitud()));
        request.setPfPlantillaInstance(plantillaEmailSrv.getByOIDWithHV(request.getPfPlantilla()));
        return service.fuEnviarSMSFun(request);
    }

    @POST
    @Path(value = "/fu_getFuncionarioPorId")
    public Funcionario fugetFuncionarioPorId(FugetFuncionarioPorIdRequest request) {
        return service.fugetFuncionarioPorIdFun(request);
    }

    @POST
    @Path(value = "/fuCallSPgetusugrabador")
    public Long fuCallSPgetusugrabador(FuCallSPgetusugrabadorRequest request) {
        return service.fuCallSPgetusugrabadorFun(request);
    }

    @POST
    @Path(value = "/fuCallSPgetusugrabadornov")
    public Long fuCallSPgetusugrabadornov(FuCallSPgetusugrabadornovRequest request) {
        return service.fuCallSPgetusugrabadornovFun(request);
    }

    @POST
    @Path(value = "/fuCallSPgetusuareamed")
    public Long fuCallSPgetusuareamed(FuCallSPgetusuareamedRequest request) {
        return service.fuCallSPgetusuareamedFun(request);
    }

    @POST
    @Path(value = "/fu_getAreaMedicaPorId")
    public AreaMedica fugetAreaMedicaPorId(FugetAreaMedicaPorIdRequest request) {
        return service.fugetAreaMedicaPorIdFun(request);
    }

    @POST
    @Path(value = "/fugetPrioridad")
    public Long fugetPrioridad(FugetPrioridadRequest request) {
        return service.fugetPrioridadFun(request);
    }

    @POST
    @Path(value = "/fuCallSPgetsemaforograbador")
    public Double fuCallSPgetsemaforograbador(FuCallSPgetsemaforograbadorRequest request) {
        return service.fuCallSPgetsemaforograbadorFun(request);
    }

    @POST
    @Path(value = "/fuCallSPgetsemaforograbadornov")
    public Double fuCallSPgetsemaforograbadornov(FuCallSPgetsemaforograbadornovRequest request) {
        return service.fuCallSPgetsemaforograbadornovFun(request);
    }

    @POST
    @Path(value = "/fuCallSPgetsemaforoareamed")
    public Double fuCallSPgetsemaforoareamed(FuCallSPgetsemaforoareamedRequest request) {
        return service.fuCallSPgetsemaforoareamedFun(request);
    }

    @POST
    @Path(value = "/fu_getSolicitudNovedadByNumRadicado")
    public SolicitudNovedad fugetSolicitudNovedadByNumRadicado(FugetSolicitudNovedadByNumRadicadoRequest request) {
        return service.fugetSolicitudNovedadByNumRadicadoFun(request);
    }

    @POST
    @Path(value = "/fuGetFechaDesdeVarFiltro")
    @Produces(MediaType.APPLICATION_JSON)
    public Date fuGetFechaDesdeVarFiltro() {
        return service.fuGetFechaDesdeVarFiltroFun();
    }

    @POST
    @Path(value = "/fuCheckRegimenSubsidiado")
    public Long fuCheckRegimenSubsidiado(FuCheckRegimenSubsidiadoRequest request) {
        return service.fuCheckRegimenSubsidiadoFun(request);
    }

    @POST
    @Path(value = "/fuGetFInicioPlanVol")
    @Produces(MediaType.APPLICATION_JSON)
    public Date fuGetFInicioPlanVol(FuGetFInicioPlanVolRequest request) {
        return service.fuGetFInicioPlanVolFun(request);
    }

    @POST
    @Path(value = "/fuValidarDominioIncompatibles")
    public Boolean fuValidarDominioIncompatibles(FuValidarDominioIncompatiblesRequest request) {
        request.setPfSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getPfSolicitud()));
        return service.fuValidarDominioIncompatiblesFun(request);
    }

    @POST
    @Path(value = "/fuExisteContratoExentoFIngreso")
    public Boolean fuExisteContratoExentoFIngreso(FuExisteContratoExentoFIngresoRequest request) {
        return service.fuExisteContratoExentoFIngresoFun(request);
    }

    @POST
    @Path(value = "/fuGetFechaLimiteDescargaDoc")
    @Produces(MediaType.APPLICATION_JSON)
    public Date fuGetFechaLimiteDescargaDoc() {
        return service.fuGetFechaLimiteDescargaDocFun();
    }

    @POST
    @Path(value = "/fuGetTkn")
    @Produces(MediaType.TEXT_PLAIN)
    public String fuGetTkn() {
        return service.fuGetTknFun();
    }

    @POST
    @Path(value = "/fuGetReporteSolicitud")
    public byte[] fuGetReporteSolicitud(FuGetReporteSolicitudRequest request) {
        request.setPfSolicitudInstance(solicitudSrv.getByOIDWithHV(request.getPfSolicitud()));
        return service.fuGetReporteSolicitudFun(request);
    }

    @POST
    @Path(value = "/fu_getEstadoBeneficiarioCOREPorNombre")
    public EstadoBeneficiario fugetEstadoBeneficiarioCOREPorNombre(FugetEstadoBeneficiarioCOREPorNombreRequest request) {
        return service.fugetEstadoBeneficiarioCOREPorNombreFun(request);
    }

    @POST
    @Path(value = "/fu_getEstadoContratoPorNombre")
    public EstadoContrato fugetEstadoContratoPorNombre(FugetEstadoContratoPorNombreRequest request) {
        return service.fugetEstadoContratoPorNombreFun(request);
    }

    @POST
    @Path(value = "/fuGetIdDocIdentidadEnGestor")
    @Produces(MediaType.TEXT_PLAIN)
    public String fuGetIdDocIdentidadEnGestor(FuGetIdDocIdentidadEnGestorRequest request) {
        return service.fuGetIdDocIdentidadEnGestorFun(request);
    }

    @POST
    @Path(value = "/fuGetIURLDescargaATOMIC")
    @Produces(MediaType.TEXT_PLAIN)
    public String fuGetIURLDescargaATOMIC() {
        return service.fuGetIURLDescargaATOMICFun();
    }
}
