package com.keralty.ae.global;
import com.keralty.ae.persistence.AreaMedica;
import com.keralty.ae.persistence.Asesor;
import com.keralty.ae.persistence.CuestionarioMed;
import com.keralty.ae.persistence.Departamento;
import com.keralty.ae.persistence.Direccion;
import com.keralty.ae.persistence.Dominio;
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
import com.keralty.ae.persistence.Persona;
import com.keralty.ae.persistence.PersonaC;
import com.keralty.ae.persistence.Planes;
import com.keralty.ae.persistence.PlantillaEmail;
import com.keralty.ae.persistence.Pregunta;
import com.keralty.ae.persistence.Productos;
import com.keralty.ae.persistence.ProteccionDatos;
import com.keralty.ae.persistence.Rol;
import com.keralty.ae.persistence.Solicitud;
import com.keralty.ae.persistence.SolicitudNovedad;
import com.keralty.ae.persistence.TipoDireccion;
import com.keralty.ae.persistence.TipoIdentificacion;
import com.keralty.ae.persistence.Usuario;
import com.keralty.ae.viewmodel.userfunctions.FuActualizarPersonaCORERequest;
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
import com.keralty.ae.viewmodel.userfunctions.FuCrearPersonaCORERequest;
import com.keralty.ae.viewmodel.userfunctions.FuCrearZipDocumentacionAutoRequest;
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
import com.keralty.ae.viewmodel.userfunctions.FuGetIdDocIdentidadEnGestorRequest;
import com.keralty.ae.viewmodel.userfunctions.FuGetFInicioPlanVolRequest;
import com.keralty.ae.viewmodel.userfunctions.FugetFuncionarioPorIdRequest;
import com.keralty.ae.viewmodel.userfunctions.FugetFuncionarioPorLDAPRequest;
import com.keralty.ae.viewmodel.userfunctions.FugetGrupoAsocRequest;
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
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import java.sql.Date;

import com.keralty.ae.persistence.DetalleTarifa;
import com.keralty.ae.persistence.ParamConfig;
import com.keralty.ae.persistence.PriorizacionSolicitudes;
import com.keralty.ae.persistence.TextoAviso;
import com.keralty.ae.persistence.Valor;
import com.keralty.ae.persistence.FechaIniEPS;
import com.keralty.ae.persistence.oid.DireccionOid;
import com.keralty.ae.persistence.oid.ParamConfigOid;
import com.keralty.ae.persistence.oid.PlanesOid;
import com.keralty.ae.persistence.oid.PriorizacionSolicitudesOid;
import com.keralty.ae.persistence.oid.ProductosOid;
import com.keralty.ae.service.AreaMedicaService;
import com.keralty.ae.service.AsesorService;
import com.keralty.ae.service.CuestionarioMedService;
import com.keralty.ae.service.DepartamentoService;
import com.keralty.ae.service.DetalleTarifaService;
import com.keralty.ae.service.DireccionService;
import com.keralty.ae.service.DominioService;
import com.keralty.ae.service.EpsService;
import com.keralty.ae.service.EstadoBeneficiarioService;
import com.keralty.ae.service.EstadoCivilService;
import com.keralty.ae.service.EstadoContratoService;
import com.keralty.ae.service.EstadoPersonaService;
import com.keralty.ae.service.FuncionarioService;
import com.keralty.ae.service.FechaIniEPSService;
import com.keralty.ae.service.GrupoAsociadoService;
import com.keralty.ae.service.MunicipioService;
import com.keralty.ae.service.PaisService;
import com.keralty.ae.service.ParamConfigService;
import com.keralty.ae.service.ParentescoDomService;
import com.keralty.ae.service.ParentescoService;
import com.keralty.ae.service.PeriodicidadService;
import com.keralty.ae.service.PersonaService;
import com.keralty.ae.service.PlanesService;
import com.keralty.ae.service.PlantillaEmailService;
import com.keralty.ae.service.PriorizacionSolicitudesService;
import com.keralty.ae.service.ProductosService;
import com.keralty.ae.service.RolService;
import com.keralty.ae.service.SolicitudNovedadService;
import com.keralty.ae.service.SolicitudService;
import com.keralty.ae.service.TextoAvisoService;
import com.keralty.ae.service.TipoDireccionService;
import com.keralty.ae.service.TipoIdentificacionService;
import com.keralty.ae.service.TipoIVAService;
import com.keralty.ae.service.UsuarioService;
import com.keralty.ae.service.ValorService;
import com.keralty.ae.viewmodel.FilterRequest;
import com.keralty.ae.viewmodel.FilterVariableRequest;
import com.keralty.ae.viewmodel.InstanceResponseViewModel;
import com.keralty.ae.viewmodel.PopulationResponseViewModel;
import com.keralty.ae.viewmodel.QueryRequest;
import com.keralty.integraciones.contract.ConsultarContratoDePersonaRequest;
import com.keralty.integraciones.contract.ConsultarContratoResponse;
import com.keralty.integraciones.contract.ContractUtils;
import com.keralty.integraciones.contract.cover.response.CoverFamilyResponse;
import com.keralty.integraciones.contract.cover.response.Patient;
import com.keralty.integraciones.coverage.CoverageUtils;
import com.keralty.integraciones.emailnotification.EmailNotificationsUtils;
import com.keralty.integraciones.enviosms.EnvioSMSUtils;
import com.keralty.integraciones.gestordocumental.GestorDocumentalUtils;
import com.keralty.integraciones.gestordocumental.tokenAtomic.TokenAtomicUtils;
import com.keralty.integraciones.patient.ConsultarPersonaRequest;
import com.keralty.integraciones.patient.ConsultarPersonaResponse;
import com.keralty.integraciones.patient.PatientUtils;
import com.keralty.integraciones.token.TokenUtils;


import jakarta.inject.Inject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import com.keralty.ae.exception.LogManagement;
import com.keralty.ae.exception.SystemException;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;
/**
 * User functions
 */
@ApplicationScoped
public class UserFunctions {

	@ConfigProperty(name = "com.keralty.integraciones.atomic.urldescarga", defaultValue = "")
	private String urlDescarga;

	static final String PATH_SEPARATOR = "/";

	@RestClient
	ValorService valorService;
	
	@RestClient
	TipoDireccionService tipoDireccionService;
	
	@RestClient
	TipoIdentificacionService tipoIdentificacionService;
	
	@RestClient
	MunicipioService municipioService;
	
	@RestClient
	DepartamentoService departamentoService;
	
	@RestClient
	EstadoCivilService estadoCivilService;
	
	@RestClient
	EstadoPersonaService estadoPersonaService;
	
	@RestClient
	PaisService paisService;
	
	@RestClient
	ProductosService productosService;
	
	@RestClient
	EpsService epsService;
	
	@RestClient
	ParentescoService parentescoService;
	
	@RestClient
	CuestionarioMedService cuestionarioMedService;
	
	@RestClient
	ParamConfigService paramConfigService;
	
	@RestClient
	RolService rolService;
	
	@RestClient
	PersonaService personaService;
	
	@RestClient
	TipoIVAService tipoIVAService;
	
	@RestClient
	DetalleTarifaService detalleTarifaService;
	
	@RestClient
	DominioService dominioService;
	
	@RestClient
	GrupoAsociadoService grupoAsociadoService;
	
	@RestClient
	EstadoBeneficiarioService estadoBeneficiarioService;
	
	@RestClient
	PeriodicidadService periodicidadService;
	
	@RestClient
	ParentescoDomService parentescoDomService;
	
	@RestClient
	PlanesService planesService;
	
	@RestClient
	EstadoContratoService estadoContratoService;
	
	@RestClient
	UsuarioService usuarioService;
	
	@RestClient
	SolicitudService solicitudService;
	
	@RestClient
	FuncionarioService funcionarioService;
	
	@RestClient
	AsesorService asesorService;
	
	@RestClient
	PriorizacionSolicitudesService priorizacionSolicitudesService;
	
	@RestClient
	SolicitudNovedadService solicitudNovedadService;

	@RestClient
	DireccionService direccionService;

	@RestClient
	PlantillaEmailService plantillaEmailService;
	
	@RestClient
	TextoAvisoService textoAvisoService;

	@RestClient
	FechaIniEPSService fechaIniEPSService;

	@RestClient
	AreaMedicaService areaMedicaService;

	@Inject 
	TokenUtils tokenUtils;

	@Inject 
	TokenAtomicUtils tokenAtomicUtils;
	
	@Inject
	GestorDocumentalUtils gestorDocumentalUtils;

	@Inject 
	ContractUtils contractUtils;

	@Inject 
	EmailNotificationsUtils emailNotificationsUtils;
	
	@Inject 
	EnvioSMSUtils envioSMSUtils;

	@Inject 
	PatientUtils patientUtils;

	@Inject 
	CoverageUtils coverageUtils;


    private static final String EMAIL_PATTERN = 
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    
    private static final String NUMEROS_PATTERN = "^[0-9]+$";
    
    private static final String LETRAS_PATTERN = "^[a-zA-Z]+$";
    
    private static final String TELEFONOFIJO_PATTERN = "\\d{7}";
    
    private static final String TELEFONOCELULAR_PATTERN = "\\d{10}";
    
    private static final String CARACTERESNORMALES_PATTERN = "^[a-zA-Z0-9áäéíóöúüÄÁÉÍÓÖÜÚñÑ\\s\\.\\-]*$";

    
    private static Boolean regexpMatches(String regexp, String text) {
        Boolean result = true;
        if (text != null) {
            java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(regexp);
            java.util.regex.Matcher matcher = pattern.matcher(text);
            result = matcher.matches();
        }
        return result;
    }
    
    private static int countOccurrences(String findStr, String text) {
        int lastIndex = 0;
        int count =0;

        while(lastIndex != -1){

               lastIndex = text.indexOf(findStr,lastIndex);

               if( lastIndex != -1){
                     count ++;
                     lastIndex += findStr.length();
              }
        }
        return count;
    }
    
    private static Boolean hasDifferentDigits(String text) {
        Boolean result = true;
        if (text != null) {
            result = (countOccurrences("0", text) < text.length() &&
                    countOccurrences("1", text) < text.length() &&
                    countOccurrences("2", text) < text.length() &&
                    countOccurrences("3", text) < text.length() &&
                    countOccurrences("4", text) < text.length() &&
                    countOccurrences("5", text) < text.length() &&
                    countOccurrences("6", text) < text.length() &&
                    countOccurrences("7", text) < text.length() &&
                    countOccurrences("8", text) < text.length() &&
                    countOccurrences("9", text) < text.length());
        }
        return result;
    }

    /** 
     * Method that solves the fuformarListaValoresPregunta user function.
     *
     * @param pfuPregunta This parameter represents the pfuPregunta inbound argument.
     *
     * @return Return String value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public String fuformarListaValoresPreguntaFun(Pregunta pfuPregunta) {

        // COMMENTS:
        // Dada una pregunta de un cuestrionario, devuelve una coma lista de los valores posibles para de dicha pregunta
    	
    	if (pfuPregunta == null || pfuPregunta.isNull()) return "";
    	
    	List<FilterVariableRequest> filterVariables = new ArrayList<>();
    	filterVariables.add(new FilterVariableRequest(ValorConstants.VAR_NAME_IFVALORESPREGUNTA_VOPREGUNTA, pfuPregunta.getOid()));
    	FilterRequest filterRequest = new FilterRequest(ValorConstants.FILTER_NAME_IFVALORESPREGUNTA, filterVariables);
    	QueryRequest queryRequest = new QueryRequest(filterRequest);
    	List<Valor> results = valorService.get(queryRequest);
    	StringBuilder result = new StringBuilder();
    	String separator = "";
    	for(Valor valor : results) {
    		result.append(separator);
    		result.append(valor.getValorValorPosible());
    		separator=";";
    	}
        return result.toString();
    }

    public String fuformarListaValoresPreguntaFun(FuformarListaValoresPreguntaRequest request) {
        return fuformarListaValoresPreguntaFun(request.getPfuPreguntaInstance());
    }

    /** 
     * Method that solves the fuconcatenarConNulos user function.
     *
     * @param pfuPrefijo This parameter represents the pfuPrefijo inbound argument.
     *
     * @param pfuString This parameter represents the pfuString inbound argument.
     *
     * @return Return String value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public String fuconcatenarConNulosFun(String pfuPrefijo, String pfuString) {

        // COMMENTS:
        // Funcion que recibe dos parametros, un prefijo y un string que admite nulos. Si el segundo parametro es nulo, devuelve cadena vacia, si no lo es, concatena prefijo y string.
    	String textoADevolver = ""; 
    	try{
	    	String prefijo = "";
	    	if (pfuPrefijo != null && !pfuPrefijo.isEmpty())
	    		prefijo = pfuPrefijo;
	    	
	    	String texto = ""; 
	    	if (pfuString != null && !pfuString.isEmpty())
	    		texto = pfuString; 
	    	
	    	textoADevolver = prefijo + texto; 
	    	
    	} catch (Exception e)  {
    		textoADevolver = "Error ->" + e.getMessage();
		}
    	return textoADevolver; 
    }

    public String fuconcatenarConNulosFun(FuconcatenarConNulosRequest request) {
        return fuconcatenarConNulosFun(request.getPfuPrefijo(), request.getPfuString());
    }

    /** 
     * Method that solves the fugetTipoDirResidencial user function.
     *
     * @return Return TipoDireccion value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public TipoDireccion fugetTipoDirResidencialFun() {

        // COMMENTS:
        // Devuelve el tipo de direccion que corresponde a residencial
    	QueryRequest queryRequest = new QueryRequest(new FilterRequest(TipoDireccionConstants.FILTER_NAME_IFTIPODIRECCIONRESIDENCIAL, new ArrayList<>()));
    	List<TipoDireccion> results = tipoDireccionService.get(queryRequest);
        return results != null && !results.isEmpty() ? results.get(0) : null;
    }

    /** 
     * Method that solves the fugetTipoDirCorrespondencia user function.
     *
     * @return Return TipoDireccion value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public TipoDireccion fugetTipoDirCorrespondenciaFun() {

        // COMMENTS:
        // Devuelve el tipo de direccion que corresponde a correspondencia
    	QueryRequest queryRequest = new QueryRequest(new FilterRequest(TipoDireccionConstants.FILTER_NAME_IFTIPODIRECCIONCORRESPONDENCI, new ArrayList<>()));
    	List<TipoDireccion> results = tipoDireccionService.get(queryRequest);
        return results != null && !results.isEmpty() ? results.get(0) : null;
    }


    /** 
     * Method that solves the fuValidarEmail user function.
     *
     * @param pfuEmail This parameter represents the pfuEmail inbound argument.
     *
     * @return Return java.lang.Boolean value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public java.lang.Boolean fuValidarEmailFun(String pfuEmail) {
        // COMMENTS:
        // Validar que la informacion en e-mail contenga un solo arroba y que despues del caracter arroba exista por lo menos un punto, que no contenga, tildes, ni comas, ni el caracter ñ
        // Si el email recibido es nulo (no lo ha proporcionado) devuelve TRUE, ya que esta funcion se usara en precondiciones. 
        return regexpMatches(EMAIL_PATTERN, pfuEmail);
    }

    public java.lang.Boolean fuValidarEmailFun(FuValidarEmailRequest request) {
        return fuValidarEmailFun(request.getPfuEmail());
    }

    /** 
     * Method that solves the fuValidarNombre user function.
     *
     * @param pfuNombre This parameter represents the pfuNombre inbound argument.
     *
     * @return Return java.lang.Boolean value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public java.lang.Boolean fuValidarNombreFun(String pfuNombre) {

        // COMMENTS:
        // El nombre debe contener al menos un cara¡cter alfabético.
        // Si el nombre recibido es nulo (no lo ha proporcionado) devuelve TRUE, ya que esta función se usará en precondiciones.
 	    if (pfuNombre != null && !pfuNombre.isEmpty()){
		    return regexpMatches(CARACTERESNORMALES_PATTERN, pfuNombre);
	    }
 	    return false;
    }

    public java.lang.Boolean fuValidarNombreFun(FuValidarNombreRequest request) {
        return fuValidarNombreFun(request.getPfuNombre());
    }

    /** 
     * Method that solves the fuSoloNumeros user function.
     *
     * @param pfuNumero This parameter represents the pfuNumero inbound argument.
     *
     * @return Return java.lang.Boolean value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public java.lang.Boolean fuSoloNumerosFun(String pfuNumero) {
        // COMMENTS:
        // El argumento debe contener sólo números.
        // Si el argumento recibido es nulo (no lo ha proporcionado) devuelve TRUE
        return pfuNumero == null || regexpMatches(NUMEROS_PATTERN, pfuNumero);
    }

    public java.lang.Boolean fuSoloNumerosFun(FuSoloNumerosRequest request) {
        return fuSoloNumerosFun(request.getPfuNumero());
    }

    /** 
     * Method that solves the fuContieneCharEspecial user function.
     *
     * @param pfustring This parameter represents the pfustring inbound argument.
     *
     * @return Return java.lang.Boolean value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public java.lang.Boolean fuContieneCharEspecialFun(String pfustring) {

        // COMMENTS:
        // El argumento no debe contener carácteres especiales.
        // Si el argumento recibido es nulo (no lo ha proporcionado) devuelve FALSE 
    	return !regexpMatches(CARACTERESNORMALES_PATTERN, pfustring);
    }

    public java.lang.Boolean fuContieneCharEspecialFun(FuContieneCharEspecialRequest request) {
        return fuContieneCharEspecialFun(request.getPfustring());
    }

    /** 
     * Method that solves the fugetTipoIdentificacion user function.
     *
     * @param pfuNombreCorto This parameter represents the pfuNombreCorto inbound argument.
     *
     * @return Return TipoIdentificacion value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public TipoIdentificacion fugetTipoIdentificacionFun(String pfuNombreCorto) {

        // COMMENTS:
        // Devuelve el tipo de identificación a partir de su nombre corto.
    	
		if (pfuNombreCorto.isEmpty() || pfuNombreCorto == null)
			return null;
    	
    	List<FilterVariableRequest> filterVariables = new ArrayList<>();
    	filterVariables.add(new FilterVariableRequest(TipoIdentificacionConstants.VAR_NAME_IFTIPOIDENTIFICACIONNOMBREC_VNOMBRECORTO, pfuNombreCorto));
    	FilterRequest filterRequest = new FilterRequest(TipoIdentificacionConstants.FILTER_NAME_IFTIPOIDENTIFICACIONNOMBREC, filterVariables);
    	QueryRequest queryRequest = new QueryRequest(filterRequest);
    	List<TipoIdentificacion> results = tipoIdentificacionService.get(queryRequest);
        return results != null && !results.isEmpty() ? results.get(0) : null;
    }

    public TipoIdentificacion fugetTipoIdentificacionFun(FugetTipoIdentificacionRequest request) {
        return fugetTipoIdentificacionFun(request.getPfuNombreCorto());
    }

    /** 
     * Method that solves the fugetEstadoCivil user function.
     *
     * @param pfuCodigo This parameter represents the pfuCodigo inbound argument.
     *
     * @return Return EstadoCivil value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public EstadoCivil fugetEstadoCivilFun(java.lang.Long pfuCodigo) {

        // COMMENTS:
        // Devuelve el estado civil a partir de su código
		if (pfuCodigo == null)
			return null;
        return estadoCivilService.getById(pfuCodigo);
    }

    public EstadoCivil fugetEstadoCivilFun(FugetEstadoCivilRequest request) {
        return fugetEstadoCivilFun(request.getPfuCodigo());
    }

    /** 
     * Method that solves the fugetEstadoPersona user function.
     *
     * @param pfuCodigo This parameter represents the pfuCodigo inbound argument.
     *
     * @return Return EstadoPersona value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public EstadoPersona fugetEstadoPersonaFun(java.lang.Long pfuCodigo) {

        // COMMENTS:
        // Devuelve el estado de la persona a partir de su código
		if (pfuCodigo == null)
			return null;
        return estadoPersonaService.getById(pfuCodigo);
    }

    public EstadoPersona fugetEstadoPersonaFun(FugetEstadoPersonaRequest request) {
        return fugetEstadoPersonaFun(request.getPfuCodigo());
    }

    /** 
     * Method that solves the fugetPais user function.
     *
     * @param pfuCodigo This parameter represents the pfuCodigo inbound argument.
     *
     * @return Return Pais value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public Pais fugetPaisFun(String pfuCodigo) {

        // COMMENTS:
        // Devuelve el  país a partir de su código
		if (pfuCodigo == null)
			return null;
        return paisService.getById(pfuCodigo);
    }

    public Pais fugetPaisFun(FugetPaisRequest request) {
        return fugetPaisFun(request.getPfuCodigo());
    }

    /** 
     * Method that solves the fuValidarTelefonoFijo user function.
     *
     * @param pfuTelefonoFijo This parameter represents the pfuTelefonoFijo inbound argument.
     *
     * @return Return java.lang.Boolean value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public java.lang.Boolean fuValidarTelefonoFijoFun(String pfuTelefonoFijo) {

        // COMMENTS:
        // Validar que la información en teléfono fijo contenga al menos 7 dígitos y que alguno de los 7 sea diferente. 
        // Si el teléfono recibido es nulo (no lo ha proporcionado) devuelve TRUE
        return regexpMatches(TELEFONOFIJO_PATTERN, pfuTelefonoFijo) && hasDifferentDigits(pfuTelefonoFijo);
    }

    public java.lang.Boolean fuValidarTelefonoFijoFun(FuValidarTelefonoFijoRequest request) {
        return fuValidarTelefonoFijoFun(request.getPfuTelefonoFijo());
    }

    /** 
     * Method that solves the fuValidarTelefonoCelular user function.
     *
     * @param pfuTelefonoCelular This parameter represents the pfuTelefonoCelular inbound argument.
     *
     * @return Return java.lang.Boolean value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public java.lang.Boolean fuValidarTelefonoCelularFun(String pfuTelefonoCelular) {

        // COMMENTS:
        // Validar que la información contenga al menos 10 dígitos y que alguno de los 10 sea diferente. 
        // Si el dato recibido es nulo (no lo ha proporcionado) devuelve TRUE
        return regexpMatches(TELEFONOCELULAR_PATTERN, pfuTelefonoCelular) && hasDifferentDigits(pfuTelefonoCelular);
    }

    public java.lang.Boolean fuValidarTelefonoCelularFun(FuValidarTelefonoCelularRequest request) {
        return fuValidarTelefonoCelularFun(request.getPfuTelefonoCelular());
    }

    /** 
     * Method that solves the fuStrONull user function.
     *
     * @param pfuNumero This parameter represents the pfuNumero inbound argument.
     *
     * @return Return String value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public String fuStrONullFun(java.lang.Long pfuNumero) {

        // COMMENTS:
        // Recibe un número. Si el número recibido es null, devuelve null. Si es un número lo convierte a string. 
        //         No se puede usar IntToStr, porque si recibe un null falla. 
        return (pfuNumero != null ? STDFunctions.intToStrFun(pfuNumero) : null);
    }

    public String fuStrONullFun(FuStrONullRequest request) {
        return fuStrONullFun(request.getPfuNumero());
    }

    /** 
     * Method that solves the fugetEPSSanitas user function.
     *
     * @return Return Eps value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public Eps fugetEPSSanitasFun() {

        // COMMENTS:
        // Devuelve la EPS Sanitas, esto es, la primera que tenga la marca de EPS Sanitas a true. Se utiliza en reglas de dependencia. 
    	FilterRequest filterRequest = new FilterRequest(EpsConstants.FILTER_NAME_IFEPSSANITAS, new ArrayList<>());
    	QueryRequest queryRequest = new QueryRequest(filterRequest);
    	List<Eps> results = epsService.get(queryRequest);
    	return results != null && !results.isEmpty() ? results.get(0) : null;
    }

    /** 
     * Method that solves the fugetParentescoTitular user function.
     *
     * @return Return Parentesco value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public Parentesco fugetParentescoTitularFun() {

        // COMMENTS:
        // Devuelve el parentesco titular. Se utiliza en reglas de dependencia. 
    	FilterRequest filterRequest = new FilterRequest(ParentescoConstants.FILTER_NAME_IFPARENTESCOTITULAR, new ArrayList<>());
    	QueryRequest queryRequest = new QueryRequest(filterRequest);
    	List<Parentesco> results = parentescoService.get(queryRequest);
        return results != null && !results.isEmpty() ? results.get(0) : null;
    }

    /** 
     * Method that solves the fugetCuestionarioMedico user function.
     *
     * @return Return CuestionarioMed value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public CuestionarioMed fugetCuestionarioMedicoFun() {

        // COMMENTS:
        // Devuelve la única instancia que debe existir de cuestionario médico.
        //         No hace falta modelar filtro en la clase, recuperaremos toda la población. 
        QueryRequest request = new QueryRequest();
        request.setDisplaySetItems("Numero");
    	List<CuestionarioMed> results = cuestionarioMedService.get(request);
        return results != null && !results.isEmpty() ? results.get(0) : null;

    }

    /** 
     * Method that solves the fugetValorParametroConf user function.
     *
     * @param pfuCodigo This parameter represents the pfuCodigo inbound argument.
     *
     * @return Return String value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public String fugetValorParametroConfFun(String pfuCodigo) {

        // Devuelve el valor del parámetro de configuración cuyo código recibe como argumento. 
		if (pfuCodigo == null)
			return null;
		
		try {
			//ParamConfig result = paramConfigService.getById(pfuCodigo);
			ParamConfig result = paramConfigService.getByOID( new ParamConfigOid(pfuCodigo));
        return result != null ? result.getParamConfigValor() : null;
		} catch(Exception e) {
			org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage() + "\n" + e.getStackTrace());			
			return null;
		}
    }

    public String fugetValorParametroConfFun(FugetValorParametroConfRequest request) {
        return fugetValorParametroConfFun(request.getPfuCodigo());
    }

    /** 
     * Method that solves the fugetRol user function.
     *
     * @param pfuNombre This parameter represents the pfuNombre inbound argument.
     *
     * @return Return Rol value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public Rol fugetRolFun(String pfuNombre) {

        // COMMENTS:
        // Devuelve el rol con el nombre recibido.
		if (pfuNombre == null)
			return null;
    	
        if (pfuNombre.equalsIgnoreCase("ASESOR"))
            pfuNombre = "ASESOR COMERCIAL";
        if (pfuNombre.equalsIgnoreCase("SUPERADMINISTRADOR"))
            pfuNombre = "SUPERADMIN";
    	
    	List<FilterVariableRequest> filterVariables = new ArrayList<>();
    	filterVariables.add(new FilterVariableRequest(RolConstants.VAR_NAME_IFROLPORNOMBRE_VNOMBRE, pfuNombre));
    	FilterRequest filterRequest = new FilterRequest(RolConstants.FILTER_NAME_IFROLPORNOMBRE, filterVariables);
    	QueryRequest queryRequest = new QueryRequest(filterRequest);
    	List<Rol> results = rolService.get(queryRequest);
        return results != null && !results.isEmpty() ? results.get(0) : null;
    }

    public Rol fugetRolFun(FugetRolRequest request) {
        return fugetRolFun(request.getPfuNombre());
    }

    /** 
     * Method that solves the fusubstringText user function.
     *
     * @param pfuText This parameter represents the pfuText inbound argument.
     *
     * @param pfuDesde This parameter represents the pfuDesde inbound argument.
     *
     * @param pfuHasta This parameter represents the pfuHasta inbound argument.
     *
     * @return Return String value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public String fusubstringTextFun(String pfuText, java.lang.Long pfuDesde, java.lang.Long pfuHasta) {

        // Devuelve el substring del texto recibido. Es como la función estándar pero con text. 
    	return STDFunctions.substringFun(pfuText, pfuDesde, pfuHasta);
    }

    public String fusubstringTextFun(FusubstringTextRequest request) {
        return fusubstringTextFun(request.getPfuText(), request.getPfuDesde(), request.getPfuHasta());
    }

    /** 
     * Method that solves the fugetValorTarifaSegunEdad user function.
     *
     * @param pfuProducto This parameter represents the pfuProducto inbound argument.
     *
     * @param pfuPlan This parameter represents the pfuPlan inbound argument.
     *
     * @param pfuEdad This parameter represents the pfuEdad inbound argument.
     *
     * @param pfuTipoContrato This parameter represents the pfuTipoContrato inbound argument.
     *
     * @param pfuVieneTraslado This parameter represents the pfuVieneTraslado inbound argument.
     *
     * @param pfuFechaContratacion This parameter represents the pfuFechaContratacion inbound argument.
     *
     * @return Return java.lang.Double value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public java.lang.Double fugetValorTarifaSegunEdadFun(Productos pfuProducto, Planes pfuPlan, java.lang.Long pfuEdad, java.lang.Long pfuTipoContrato, java.lang.Boolean pfuVieneTraslado, java.sql.Date pfuFechaContratacion) {

        // COMMENTS:
        // Recibe producto, plan, edad, tipo contrato y si viene de traslado. Devuelve el valor 
    	
		if (pfuProducto == null || pfuPlan == null || pfuEdad == null  || pfuTipoContrato == null || pfuVieneTraslado == null)
			return null;
		
		if (pfuVieneTraslado) {
		    String tarifaTrasladoStr = this.fugetValorParametroConfFun("TARIFATRASLADO");
		    if (tarifaTrasladoStr != null && !tarifaTrasladoStr.isEmpty()) {
		        return Double.parseDouble(tarifaTrasladoStr);
		    }
		}
    	
    	List<FilterVariableRequest> filterVariables = new ArrayList<>();
    	filterVariables.add(new FilterVariableRequest(DetalleTarifaConstants.VAR_NAME_IFTARIFASEGUNEDAD_VOPRODUCTO, pfuProducto.getOid()));
    	filterVariables.add(new FilterVariableRequest(DetalleTarifaConstants.VAR_NAME_IFTARIFASEGUNEDAD_VOPLAN, pfuPlan.getOid()));
    	filterVariables.add(new FilterVariableRequest(DetalleTarifaConstants.VAR_NAME_IFTARIFASEGUNEDAD_VEDAD, pfuEdad));
    	filterVariables.add(new FilterVariableRequest(DetalleTarifaConstants.VAR_NAME_IFTARIFASEGUNEDAD_VTIPOCONTRATO, pfuTipoContrato));
    	FilterRequest filterRequest = new FilterRequest(DetalleTarifaConstants.FILTER_NAME_IFTARIFASEGUNEDAD, filterVariables);
    	QueryRequest queryRequest = new QueryRequest(filterRequest);
    	List<DetalleTarifa> results = detalleTarifaService.get(queryRequest);

    	Long anyoContratacion = STDFunctions.getYearFun(pfuFechaContratacion);
    	
    	Optional<DetalleTarifa> result = results.stream().filter(x -> x.getDetalleTarifaAnyo().equals(anyoContratacion)).findFirst();
    	return result.isPresent() ? result.get().getDetalleTarifaValor() : null;
    }

    public java.lang.Double fugetValorTarifaSegunEdadFun(FugetValorTarifaSegunEdadRequest request) {
        return fugetValorTarifaSegunEdadFun(request.getPfuProductoInstance(), request.getPfuPlanInstance(), request.getPfuEdad(), request.getPfuTipoContrato(), request.getPfuVieneTraslado(), request.getPfuFechaContratacion());
    }

    /** 
     * Method that solves the fugetGrupoAsoc user function.
     *
     * @param pfuCodioLegal This parameter represents the pfuCodioLegal inbound argument.
     *
     * @return Return GrupoAsociado value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public GrupoAsociado fugetGrupoAsocFun(String pfuCodioLegal) {
		if (pfuCodioLegal == null)
			return null;
		
		List<FilterVariableRequest> filterVariables = new ArrayList<>();
		filterVariables.add(new FilterVariableRequest(GrupoAsociadoConstants.VAR_NAME_FGRUPOASOCIADOBUSQUEDA_VCODIGOLEGAL, pfuCodioLegal));
		FilterRequest filterRequest = new FilterRequest(GrupoAsociadoConstants.FILTER_NAME_IFGRUPOASOCIADOCODIGOLEGAL, filterVariables);
		QueryRequest queryRequest = new QueryRequest(filterRequest);
		List<GrupoAsociado> results = grupoAsociadoService.get(queryRequest);
        return results != null && !results.isEmpty() ? results.get(0) : null;
    }

    public GrupoAsociado fugetGrupoAsocFun(FugetGrupoAsocRequest request) {
        return fugetGrupoAsocFun(request.getPfuCodioLegal());
    }

    /** 
     * Method that solves the fugetEstadoBeneficiarioCORE user function.
     *
     * @param pfuCodigo This parameter represents the pfuCodigo inbound argument.
     *
     * @return Return EstadoBeneficiario value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public EstadoBeneficiario fugetEstadoBeneficiarioCOREFun(java.lang.Long pfuCodigo) {
		if (pfuCodigo == null)
			return null;
        
		return estadoBeneficiarioService.getById(pfuCodigo);
    }

    public EstadoBeneficiario fugetEstadoBeneficiarioCOREFun(FugetEstadoBeneficiarioCORERequest request) {
        return fugetEstadoBeneficiarioCOREFun(request.getPfuCodigo());
    }

    /** 
     * Method that solves the fuObtenerDocumento user function.
     *
     * @param pPathCompleto This parameter represents the pPathCompleto inbound argument.
     *
     * @return Return byte[] value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public byte[] fuObtenerDocumentoFun(String pPathCompleto) {
        // Please implement the body of your user function
        return new byte[0];
    }

    public byte[] fuObtenerDocumentoFun(FuObtenerDocumentoRequest request) {
        return fuObtenerDocumentoFun(request.getPPathCompleto());
    }

    /** 
     * Method that solves the fugetPeriodicidadMensual user function.
     *
     * @return Return Periodicidad value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public Periodicidad fugetPeriodicidadMensualFun() {

        // COMMENTS:
        // Devuelve la periodicidad mensual
        FilterRequest filterRequest = new FilterRequest(PeriodicidadConstants.FILTER_NAME_IFPERIODICIDADMENSUAL, new ArrayList<>());
    	QueryRequest queryRequest = new QueryRequest(filterRequest);
    	List<Periodicidad> results = periodicidadService.get(queryRequest);
        return results != null && !results.isEmpty() ? results.get(0) : null;
    }

    /** 
     * Method that solves the fugetPlantillaEmail user function.
     *
     * @param pfuCodigo This parameter represents the pfuCodigo inbound argument.
     *
     * @param pfSolicitud This parameter represents the pfSolicitud inbound argument.
     *
     * @return Return PlantillaEmail value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public PlantillaEmail fugetPlantillaEmailFun(java.lang.Long pfuCodigo, Solicitud pfSolicitud) {

        // Recupera una plantilla de email a partir de su código y para la solicitud indicada
    	try {
	    	QueryRequest soliRequest = new QueryRequest();
			soliRequest.setDisplaySetItems("ae_solicitudes.productot.producto,ae_solicitudes.plant.plan");
			soliRequest.setJsonOID(pfSolicitud.getOid().toJson());
			InstanceResponseViewModel solicitudResponse = solicitudService.getSolicitudDynamic(soliRequest);
			String idPlanSolicitud = solicitudResponse.getProperties().get("ae_solicitudes.plant.plan").toString();
			String idProductoSolicitud = solicitudResponse.getProperties().get("ae_solicitudes.productot.producto").toString();
	
	    	List<FilterVariableRequest> filterVariables = new ArrayList<>();
	    	filterVariables.add(new FilterVariableRequest(DominioConstants.VAR_NAME_IFDOMINIOPRODPLAN_VOPRODUCTO, 
	    			new ProductosOid( Long.valueOf(idProductoSolicitud))));
	    	filterVariables.add(new FilterVariableRequest(DominioConstants.VAR_NAME_IFDOMINIOPRODPLAN_VOPLAN, 
	    			new PlanesOid(Long.valueOf(idPlanSolicitud))));
	    	FilterRequest filterRequest = new FilterRequest(DominioConstants.FILTER_NAME_IFDOMINIOPRODPLAN, filterVariables);
	    	QueryRequest queryRequest = new QueryRequest(filterRequest);
	    	List<Dominio> results = dominioService.get(queryRequest);
	    	
	    	String oidDominioJson = results != null && !results.isEmpty() ? results.get(0).getOid().toJson() : null;
	    	if (oidDominioJson != null) {
				QueryRequest plantillasRequest = new QueryRequest();
				plantillasRequest.addFilterByRelated(oidDominioJson, "Dominios");
		    	List<FilterVariableRequest> filterVariablesPlantillaEmail = new ArrayList<>();
		    	filterVariablesPlantillaEmail.add(new FilterVariableRequest(PlantillaEmailConstants.VAR_NAME_IFPLANTILLAEMAILCODIGO_VCODIGO, 
		    			pfuCodigo));
		    	FilterRequest filterPlantillaPorCodigo = new FilterRequest(PlantillaEmailConstants.FILTER_NAME_IFPLANTILLAEMAILCODIGO, filterVariablesPlantillaEmail);
				plantillasRequest.addFilterRequest(filterPlantillaPorCodigo);
				plantillasRequest.setPageSize(1);
				List<PlantillaEmail> listaPlantillas =  plantillaEmailService.get(plantillasRequest);
				if (listaPlantillas != null && !listaPlantillas.isEmpty()) {
					return listaPlantillas.get(0);
				}    	
	    	}
    	} catch(Exception e) {
			org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage() + "\n" + e.getStackTrace());	
    	}
    	return null;
    }

    public PlantillaEmail fugetPlantillaEmailFun(FugetPlantillaEmailRequest request) {
        return fugetPlantillaEmailFun(request.getPfuCodigo(), request.getPfSolicitudInstance());
    }

    /** 
     * Method that solves the fuSustituirParamsEnURL user function.
     *
     * @param pfuURL Valor sacado del fichero de propiedades
     *
     * @param pfuSolicitud This parameter represents the pfuSolicitud inbound argument.
     *
     * @return Return String value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public String fuSustituirParamsEnURLFun(String pfuURL, Solicitud pfuSolicitud) {

        // Devuelve la URL de pago recibida sustituyendo los parámetros por los valores proporcionados.
        //         Según la solicitud sea de nueva afiliación o inclusión la URL tiene más parámetros o menos.  Pero todos ellos se pueden sacar de la solicitud.
    	
    	try{
    		if (pfuURL == null || pfuSolicitud == null || pfuSolicitud.isNull()){
    			return null;
            }
    		
    		String pfuURLSustituida = pfuURL; 
    		
    		if (pfuSolicitud.getSolicitudTramite() == 1) {
    			//Nueva afiliaciÃ³n
    			//Donde empresa: El cÃ³dido del producto ( 10 o 20)
    			//tiposolicitud: El cÃ³digo del plan ( 10,55,.....)
    			//numerosolicitud: El nÃºmero de solicitud que se genere desde afiliaciÃ³n electrÃ³nica.
    			//valor: Es el valor total calculado en la secciÃ³n informaciÃ³n de pago.

    			pfuURLSustituida = pfuURLSustituida.replace("%1", pfuSolicitud.getAesolicitudes().getProductoT().getProductosCodigoLegal());
    			pfuURLSustituida = pfuURLSustituida.replace("%2", pfuSolicitud.getAesolicitudes().getPlanT().getPlanesCodigoLegal());
    			pfuURLSustituida = pfuURLSustituida.replace("%3", pfuSolicitud.getAesolicitudes().getAesolicitudesNumerosolicitud());
    			
    			pfuURLSustituida = pfuURLSustituida.replace("%4", String.valueOf(pfuSolicitud.getSolicituddrvTotalConAnexos().intValue()));
    			
    		} else{
    			//InclusiÃ³n
    			//Donde empresa: El cÃ³dido del producto ( 10 o 20)
    			//producto: El cÃ³digo del plan ( 10,55,.....)
    			//contrato:numero de contrato al que se le realiza la inclusiÃ³n.
    			//tipoidentificacion: Es (CC, CE,PA...) correspondiente al tipo de identificaciÃ³n del contratante si el contrato es familiar, si el contrato es colectivo corresponde al tipo de identificaciÃ³n del titular de la familia.
    			//numeroidentificacion: Correspondiente al nÃºmero de identificaciÃ³n del contratante si el contrato es familiar, si el contrato es colectivo corresponde al nÃºmero de identificaciÃ³n del titular de la familia.
    			//numerosolicitud: El nÃºmero de solicitud que se genere desde afiliaciÃ³n electrÃ³nica.
    			//valor: Es el valor total calculado en la secciÃ³n informaciÃ³n de pago.

    			pfuURLSustituida = pfuURLSustituida.replace("%1", pfuSolicitud.getAesolicitudes().getProductoT().getProductosCodigoLegal());
    			pfuURLSustituida = pfuURLSustituida.replace("%2", pfuSolicitud.getAesolicitudes().getPlanT().getPlanesCodigoLegal());
    			pfuURLSustituida = pfuURLSustituida.replace("%3", pfuSolicitud.getAesolicitudes().getAesolicitudesNumerosolicitud());
    			if (pfuSolicitud.getSolicitudtipoContrato() == 1) {
    				//Contrato familiar
    				pfuURLSustituida = pfuURLSustituida.replace("%4", pfuSolicitud.getContratante().getTipoIdentificacion().getTipoIdentificacionNombreCorto());
    				pfuURLSustituida = pfuURLSustituida.replace("%5", pfuSolicitud.getContratante().getContratanteNumIdentificacion());
    			} else {
    				//Contrato colectivo
    				pfuURLSustituida = pfuURLSustituida.replace("%4", pfuSolicitud.getTitular().getTipoIdentificacion().getTipoIdentificacionNombreCorto());
    				pfuURLSustituida = pfuURLSustituida.replace("%5", pfuSolicitud.getTitular().getTitularNumIdentificacion());
    			}
    			pfuURLSustituida = pfuURLSustituida.replace("%6", pfuSolicitud.getAesolicitudes().getAesolicitudesNumerosolicitud());
    			pfuURLSustituida = pfuURLSustituida.replace("%7", String.valueOf( pfuSolicitud.getSolicituddrvTotalConAnexos().intValue()));
    		}
    		
    		return pfuURLSustituida;
    		
    	} catch (Exception e)  {
    		return null;
		}
    }

    public String fuSustituirParamsEnURLFun(FuSustituirParamsEnURLRequest request) {
        return fuSustituirParamsEnURLFun(request.getPfuURL(), request.getPfuSolicitudInstance());
    }

    /** 
     * Method that solves the fuEnviarEmail user function.
     *
     * @param pfuAsunto This parameter represents the pfuAsunto inbound argument.
     *
     * @param pfuDestinatario This parameter represents the pfuDestinatario inbound argument.
     *
     * @param pfuEmailConfirmacion This parameter represents the pfuEmailConfirmacion inbound argument.
     *
     * @param pfuCuerpo This parameter represents the pfuCuerpo inbound argument.
     *
     * @param pfuNombreAdjunto Si se manda un adjunto, el nombre del adjunto
     *
     * @param pfuAdjunto Si hay adjunto, el adjunto
     *
     * @param pfuNumSolicitud El número de la solicitud en el marco de la cual se envía el email (si es en el marco de una solicitud).
     * GdC37, para el log
     *
     * @return Return String value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public String fuEnviarEmailFun(String pfuAsunto, String pfuDestinatario, String pfuEmailConfirmacion, String pfuCuerpo, String pfuNombreAdjunto, byte[] pfuAdjunto, String pfuNumSolicitud) {

    	String resultado = "";
    	try{
    		if (pfuAsunto == null)
    			return "No se puedo enviar el email por no disponer de asunto";
    		
    		if (pfuDestinatario == null)
    			return "No se puedo enviar el email por no disponer del email del destinatario";   	
    		
    		if (pfuCuerpo == null)
    			return "No se puedo enviar el email por no disponer de cuerpo del mensaje";   
    		
    		resultado = emailNotificationsUtils.enviarCorreo(pfuAsunto, pfuDestinatario, pfuCuerpo, pfuNombreAdjunto, pfuAdjunto, pfuNumSolicitud, pfuEmailConfirmacion);
    	} catch (Exception e)  {
    		String msgError = e.getMessage();
    		if (msgError != null && msgError.length() > 251){
    			msgError = msgError.substring(0, 250);
    		}
    		return msgError;
		}
    	
    	return resultado != null && !resultado.isEmpty() ? resultado : "Email enviado"; 
    }

    public String fuEnviarEmailFun(FuEnviarEmailRequest request) {
        return fuEnviarEmailFun(request.getPfuAsunto(), request.getPfuDestinatario(), request.getPfuEmailConfirmacion(), request.getPfuCuerpo(), request.getPfuNombreAdjunto(), request.getPfuAdjunto(), request.getPfuNumSolicitud());
    }

    /** 
     * Method that solves the fuAnadirTexto user function.
     *
     * @param pfuTexto This parameter represents the pfuTexto inbound argument.
     *
     * @param pfuAnadir This parameter represents the pfuAnadir inbound argument.
     *
     * @return Return String value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public String fuAnadirTextoFun(String pfuTexto, String pfuAnadir) {

        // Recibe como parámetro un text, que es el texto de una plantilla de email. Le añade un salto de línea y el argumento recibido, que es la URL de pago.
        //         Se utilizará desde el envío de las URLs de pago a los contratantes

    	String pfuTextoCompleto = pfuTexto; 
    	
    	try{
    		if (pfuTexto == null)
    			return null;
    		
    		if (pfuAnadir != null && !pfuAnadir.isEmpty()) {
    			pfuTextoCompleto = pfuTextoCompleto + "\n" + pfuAnadir;
    		}
    		
    	} catch (Exception e)  {
    		return null;
		}
    	
    	return pfuTextoCompleto; 
    }

    public String fuAnadirTextoFun(FuAnadirTextoRequest request) {
        return fuAnadirTextoFun(request.getPfuTexto(), request.getPfuAnadir());
    }

    /** 
     * Method that solves the fugetEstadoContrato user function.
     *
     * @param pfuCodigo This parameter represents the pfuCodigo inbound argument.
     *
     * @return Return EstadoContrato value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public EstadoContrato fugetEstadoContratoFun(java.lang.Long pfuCodigo) {
		if (pfuCodigo == null)
			return null;
		
		List<FilterVariableRequest> filterVariables = new ArrayList<>();
		filterVariables.add(new FilterVariableRequest(EstadoContratoConstants.VAR_NAME_IFESTADOCONTRATOCONTRATO_VCODIGO, pfuCodigo));
		FilterRequest filterRequest = new FilterRequest(EstadoContratoConstants.FILTER_NAME_IFESTADOCONTRATOCONTRATO, filterVariables);
		QueryRequest queryRequest = new QueryRequest(filterRequest);
		List<EstadoContrato> results = estadoContratoService.get(queryRequest);
        return results != null && !results.isEmpty() ? results.get(0) : null;
    }

    public EstadoContrato fugetEstadoContratoFun(FugetEstadoContratoRequest request) {
        return fugetEstadoContratoFun(request.getPfuCodigo());
    }

    /** 
     * Method that solves the fugetDepartamentoCL user function.
     *
     * @param pfuCodigoLegal Código legal del departamento
     *
     * @return Return Departamento value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public Departamento fugetDepartamentoCLFun(String pfuCodigoLegal) {
        // Devuelve el departamento a partir de su código legal
    	
        if (pfuCodigoLegal == null || pfuCodigoLegal.isEmpty())
            return null;
        
        List<FilterVariableRequest> filterVariables = new ArrayList<>();
        filterVariables.add(new FilterVariableRequest(DepartamentoConstants.VAR_NAME_FDEPARTAMENTOCODIGOLEGAL_VFCODLEGAL, pfuCodigoLegal));
        FilterRequest filterRequest = new FilterRequest(DepartamentoConstants.FILTER_NAME_FDEPARTAMENTOCODIGOLEGAL, filterVariables);
        QueryRequest queryRequest = new QueryRequest(filterRequest);
        List<Departamento> results = departamentoService.get(queryRequest);
        return results != null && !results.isEmpty() ? results.get(0) : null;
    }

    public Departamento fugetDepartamentoCLFun(FugetDepartamentoCLRequest request) {
        return fugetDepartamentoCLFun(request.getPfuCodigoLegal());
    }

    /** 
     * Method that solves the fugetSolicitudByNumero user function.
     *
     * @param pfuNumSolicitud This parameter represents the pfuNumSolicitud inbound argument.
     *
     * @return Return Solicitud value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public Solicitud fugetSolicitudByNumeroFun(String pfuNumSolicitud) {
        if (pfuNumSolicitud == null || pfuNumSolicitud.isEmpty())
            return null;
        
        List<FilterVariableRequest> filterVariables = new ArrayList<>();
        filterVariables.add(new FilterVariableRequest(SolicitudConstants.VAR_NAME_IFSOLICITUDNUMSOLICITUD_VNUMSOLICITUD, pfuNumSolicitud));
        FilterRequest filterRequest = new FilterRequest(SolicitudConstants.FILTER_NAME_IFSOLICITUDNUMSOLICITUD, filterVariables);
        QueryRequest queryRequest = new QueryRequest(filterRequest);
        List<Solicitud> results = solicitudService.get(queryRequest);
        return results != null && !results.isEmpty() ? results.get(0) : null;
    }

    public Solicitud fugetSolicitudByNumeroFun(FugetSolicitudByNumeroRequest request) {
        return fugetSolicitudByNumeroFun(request.getPfuNumSolicitud());
    }

    /** 
     * Method that solves the fugetAgente user function.
     *
     * @param pfuLogin This parameter represents the pfuLogin inbound argument.
     *
     * @return Return Funcionario value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public Funcionario fugetAgenteFun(String pfuLogin) {
        if (pfuLogin == null)
            return null;
        
        List<FilterVariableRequest> filterVariables = new ArrayList<>();
        filterVariables.add(new FilterVariableRequest(FuncionarioConstants.VAR_NAME_IFILTERFUNCIONARIOPORNUMUSU_VFNUMUSU, pfuLogin));
        FilterRequest filterRequest = new FilterRequest(FuncionarioConstants.FILTER_NAME_IFILTERFUNCIONARIOPORNUMUSU, filterVariables);
        QueryRequest queryRequest = new QueryRequest(filterRequest);
        List<Funcionario> results = funcionarioService.get(queryRequest);
        return results != null && !results.isEmpty() ? results.get(0) : null;
    }

    public Funcionario fugetAgenteFun(FugetAgenteRequest request) {
        return fugetAgenteFun(request.getPfuLogin());
    }

    /** 
     * Method that solves the fuBuscarDocGestorNumId user function.
     *
     * @param pfuNumIdentificacion This parameter represents the pfuNumIdentificacion inbound argument.
     *
     * @param pfuNumSolicitud GdC37: Nº de solicitud en el marco de la cual se realiza la búsqueda. Para log.
     *
     * @return Return String value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public String fuBuscarDocGestorNumIdFun(String pfuNumIdentificacion, String pfuNumSolicitud) {

        // COMMENTS:
        // Busca un documento del gestor documental, que no se ha subido desde AE.
        //         La forma de hacerlo será consumiendo la capacidad SearchDocumentP8
        //         Si se quieren consultar los documentos de tipo Identificación de persona, se invocará la capacidad de la siguiente manera:
        //         En documentClass se especificará DocumentoIdentidad
        //         En lParametersSearch se añadirá un solo parámetro:
        //         o Nombre del parámetro : NumeroDocumentoIdentidad
        //         o Valor :El número de identificación del usuario
        //         
        // Please implement the body of your user function
        return "";
    }

    public String fuBuscarDocGestorNumIdFun(FuBuscarDocGestorNumIdRequest request) {
        return fuBuscarDocGestorNumIdFun(request.getPfuNumIdentificacion(), request.getPfuNumSolicitud());
    }

    /** 
     * Method that solves the fuBuscarDocGestorSolicitud user function.
     *
     * @param pfuNumSolicitud This parameter represents the pfuNumSolicitud inbound argument.
     *
     * @param pfuNumIdentidad This parameter represents the pfuNumIdentidad inbound argument.
     *
     * @return Return String value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public String fuBuscarDocGestorSolicitudFun(String pfuNumSolicitud, String pfuNumIdentidad) {

        // COMMENTS:
        // Buscar un documento del gestor documental, que no se ha subido desde AE.
        //         La forma de hacerlo será consumiendo la capacidad SearchDocumentP8
        //         Si se quieren consular los documentos de tipo solicitud, se invocará la capacidad de la siguiente manera:
        //         En documentClass se especificará AfiliacionesMPSolicitudAfiliacion
        //         En lParametersSearch se añadirán dos parámetros:
        //         o Nombre del parámetro 1: NumeroSolicitud
        //         o Valor : El número de la solicitud
        //         o Nombre del parámetro 2: NumeroDocumentoIdentidad
        //         o Valor: El número de identificación del usuario
        //         
        // Please implement the body of your user function
        return "";
    }

    public String fuBuscarDocGestorSolicitudFun(FuBuscarDocGestorSolicitudRequest request) {
        return fuBuscarDocGestorSolicitudFun(request.getPfuNumSolicitud(), request.getPfuNumIdentidad());
    }

    /** 
     * Method that solves the fuSoloLetras user function.
     *
     * @param pfuNumero This parameter represents the pfuNumero inbound argument.
     *
     * @return Return java.lang.Boolean value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public java.lang.Boolean fuSoloLetrasFun(String pfuNumero) {

        // COMMENTS:
        // El argumento debe contener sólo letras (sin caracteres especiales ni
        // acentos).
        // Si el argumento recibido es nulo (no lo ha proporcionado) devuelve TRUE, ya
        // que esta función se usará en precondiciones.
        // Please implement the body of your user function
            if (pfuNumero == null || pfuNumero.isEmpty()) {
                return true;
            }
    	
            return regexpMatches(LETRAS_PATTERN, pfuNumero);
    }

    public java.lang.Boolean fuSoloLetrasFun(FuSoloLetrasRequest request) {
        return fuSoloLetrasFun(request.getPfuNumero());
    }

    /** 
     * Method that solves the fuGetTextoProteccionDatos user function.
     *
     * @return Return String value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public String fuGetTextoProteccionDatosFun() {

    	TextoAviso textoAviso = textoAvisoService.getById("TXT_PROTDATOS");
    	if (textoAviso == null || textoAviso.isNull()) {
    		return "Texto no encontrado";
    	}
    	
    	return textoAviso.getTextoAvisoValor();    	
    }

    /** 
     * Method that solves the fugetAsesor user function.
     *
     * @param pfuUsuario This parameter represents the pfuUsuario inbound argument.
     *
     * @return Return Asesor value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public Asesor fugetAsesorFun(String pfuUsuario) {
    	if (pfuUsuario == null) {
    		return null;
    	}

    	List<FilterVariableRequest> filterVariables = new ArrayList<>();
    	filterVariables.add(new FilterVariableRequest(AsesorConstants.VAR_NAME_FASESORES_VUSUARIO, pfuUsuario));
    	
    	FilterRequest filterRequest = new FilterRequest(AsesorConstants.FILTER_NAME_FASESORES, filterVariables);
    	QueryRequest queryRequest = new QueryRequest(filterRequest);
    	
    	List<Asesor> results = asesorService.get(queryRequest);
    	return results != null && !results.isEmpty() ? results.get(0) : null;
    }

    public Asesor fugetAsesorFun(FugetAsesorRequest request) {
        return fugetAsesorFun(request.getPfuUsuario());
    }

    /** 
     * Method that solves the fugetMunicipioCL user function.
     *
     * @param pfCodLegal This parameter represents the pfCodLegal inbound argument.
     *
     * @return Return Municipio value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public Municipio fugetMunicipioCLFun(String pfCodLegal) {

        // Devuelve el municipio a partir de su código legal
        if (pfCodLegal == null || pfCodLegal.isEmpty())
            return null;
        
        List<FilterVariableRequest> filterVariables = new ArrayList<>();
        filterVariables.add(new FilterVariableRequest(MunicipioConstants.VAR_NAME_IFMUNICIPIOCODIGOLEGAL_VFCODLEGAL, pfCodLegal));
        FilterRequest filterRequest = new FilterRequest(MunicipioConstants.FILTER_NAME_IFMUNICIPIOCODIGOLEGAL, filterVariables);
        QueryRequest queryRequest = new QueryRequest(filterRequest);
        List<Municipio> results = municipioService.get(queryRequest);
        return results != null && !results.isEmpty() ? results.get(0) : null;
    }

    public Municipio fugetMunicipioCLFun(FugetMunicipioCLRequest request) {
        return fugetMunicipioCLFun(request.getPfCodLegal());
    }

    /** 
     * Method that solves the fuGetDirResidenciaPersona user function.
     *
     * @param pfPersona This parameter represents the pfPersona inbound argument.
     *
     * @return Return Direccion value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public Direccion fuGetDirResidenciaPersonaFun(Persona pfPersona) {

    	if (pfPersona != null && !pfPersona.isNull()) {
    		try {
		    	List<FilterVariableRequest> filterVariables = new ArrayList<>();
		    	filterVariables.add(new FilterVariableRequest(DireccionConstants.VAR_NAME_FDIRECCIONPORPERSONAYTIPO_VFPER, pfPersona.getOid()));
		    	FilterRequest filterRequest = new FilterRequest(DireccionConstants.FILTER_NAME_FDIRECCIONPORPERSONAYTIPO, filterVariables);
		    	QueryRequest queryRequest = new QueryRequest(filterRequest);
		    	queryRequest.setDisplaySetItems("Identificador,TipoDireccion.EsResidencia");
		    	PopulationResponseViewModel results = direccionService.getPopulationDynamic(queryRequest);
		    	if (results != null && results.isOk()) {
		    		for (Map<String, Object> dir : results.getResults()){
		    			if (dir.get("TipoDireccion-EsResidencia") != null && Boolean.valueOf(dir.get("TipoDireccion-EsResidencia").toString())) {
		    				return new Direccion(new DireccionOid( Long.valueOf(dir.get("Identificador").toString())));
		    			}
		    		}
		    		
		    	}
			} catch (Exception e) {
				org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage() + "\n" + e.getStackTrace());	
			}
    	}
        return null;
    }

    public Direccion fuGetDirResidenciaPersonaFun(FuGetDirResidenciaPersonaRequest request) {
        return fuGetDirResidenciaPersonaFun(request.getPfPersonaInstance());
    }

    /** 
     * Method that solves the fuGetTextoAvisoFirma user function.
     *
     * @param pfFirma Indica si es el texto para la primera (1) o la segunda (2) firma
     *
     * @return Return String value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public String fuGetTextoAvisoFirmaFun(java.lang.Long pfFirma) {

        // COMMENTS:
        // Obtiene el texto para mostrar en la firma de una solicitud

    	String id = null;
    	
    	if (pfFirma == 1L){
    		id = "TXT_FIRMA";
    	} else if(pfFirma == 2L){
    		id = "TXT_FIRMA2";
    	}

    	TextoAviso textoAviso = textoAvisoService.getById(id);
    	if (textoAviso == null || textoAviso.isNull()) {
    		return "Texto no encontrado";
    	}
    	return textoAviso.getTextoAvisoValor();
    }

    public String fuGetTextoAvisoFirmaFun(FuGetTextoAvisoFirmaRequest request) {
        return fuGetTextoAvisoFirmaFun(request.getPfFirma());
    }

    /** 
     * Method that solves the fugetListaErrores user function.
     *
     * @param pfSolicitud This parameter represents the pfSolicitud inbound argument.
     *
     * @return Return String value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public String fugetListaErroresFun(Solicitud pfSolicitud) {

        // COMMENTS:
        // Devuelve en un string los errores WS para una solicitud
        // Please implement the body of your user function
        return "";
    }

    public String fugetListaErroresFun(FugetListaErroresRequest request) {
        return fugetListaErroresFun(request.getPfSolicitudInstance());
    }

    /** 
     * Method that solves the fuCrearPersonaCORE user function.
     *
     * @param pfPersona This parameter represents the pfPersona inbound argument.
     *
     * @param pfProtDatos This parameter represents the pfProtDatos inbound argument.
     *
     * @return Return String value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public String fuCrearPersonaCOREFun(Persona pfPersona, ProteccionDatos pfProtDatos) {

        // COMMENTS:
        // Invoca al WS que crea una persona en el CORE
        // Please implement the body of your user function
        return "";
    }

    public String fuCrearPersonaCOREFun(FuCrearPersonaCORERequest request) {
        return fuCrearPersonaCOREFun(request.getPfPersonaInstance(), request.getPfProtDatosInstance());
    }

    /** 
     * Method that solves the fuActualizarPersonaCORE user function.
     *
     * @param pfPersona This parameter represents the pfPersona inbound argument.
     *
     * @param pfProtDatos This parameter represents the pfProtDatos inbound argument.
     *
     * @param pfNumSolicitud GdC 37: El número de solicitud en el marco de la cual llamamos a esta fu, para hacer log.
     *
     * @return Return String value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public String fuActualizarPersonaCOREFun(Persona pfPersona, ProteccionDatos pfProtDatos, String pfNumSolicitud) {

        // COMMENTS:
        // Invoca al WS que actualiza una persona en el CORE
        // Please implement the body of your user function
        return "";
    }

    public String fuActualizarPersonaCOREFun(FuActualizarPersonaCORERequest request) {
        return fuActualizarPersonaCOREFun(request.getPfPersonaInstance(), request.getPfProtDatosInstance(), request.getPfNumSolicitud());
    }

    /** 
     * Method that solves the fuCrearZipDocumentacionAuto user function.
     *
     * @param psSolicitud This parameter represents the psSolicitud inbound argument.
     *
     * @return Return String value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public String fuCrearZipDocumentacionAutoFun(Solicitud psSolicitud) {

        // COMMENTS:
        // Genera los documentos que corresponda para la solictud (los que tengan que enviarse de forma automática) y los empaqueta en un zip. Devuelve el path y nombre del zip
        // Please implement the body of your user function
        return "";
    }

    public String fuCrearZipDocumentacionAutoFun(FuCrearZipDocumentacionAutoRequest request) {
        return fuCrearZipDocumentacionAutoFun(request.getPsSolicitudInstance());
    }

    /** 
     * Method that solves the fuGetCodTarifaProdPlanAnyo user function.
     *
     * @param pfProducto This parameter represents the pfProducto inbound argument.
     *
     * @param pfPlan This parameter represents the pfPlan inbound argument.
     *
     * @param pfAnyo This parameter represents the pfAnyo inbound argument.
     *
     * @param pfTipoContrato This parameter represents the pfTipoContrato inbound argument.
     *
     * @return Return String value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public String fuGetCodTarifaProdPlanAnyoFun(Productos pfProducto, Planes pfPlan, java.lang.Long pfAnyo, java.lang.Long pfTipoContrato) {
        // Please implement the body of your user function
        return "";
    }

    public String fuGetCodTarifaProdPlanAnyoFun(FuGetCodTarifaProdPlanAnyoRequest request) {
        return fuGetCodTarifaProdPlanAnyoFun(request.getPfProductoInstance(), request.getPfPlanInstance(), request.getPfAnyo(), request.getPfTipoContrato());
    }

    /** 
     * Method that solves the fugetProductoPorCL user function.
     *
     * @param pfCodLegalProd This parameter represents the pfCodLegalProd inbound argument.
     *
     * @return Return Productos value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public Productos fugetProductoPorCLFun(String pfCodLegalProd) {

        // Devuelve el  producto a partir de su número
    	List<FilterVariableRequest> filterVariables = new ArrayList<>();
    	filterVariables.add(new FilterVariableRequest(ProductosConstants.VAR_NAME_IFPRODUCTOSPORCODLEGAL_VCODLEGAL, pfCodLegalProd));
    	
    	FilterRequest filterRequest = new FilterRequest(ProductosConstants.FILTER_NAME_IFPRODUCTOSPORCODLEGAL, filterVariables);
    	QueryRequest queryRequest = new QueryRequest(filterRequest);
    	
    	List<Productos> results = productosService.get(queryRequest);
    	return results != null && !results.isEmpty() ? results.get(0) : null;
    }

    public Productos fugetProductoPorCLFun(FugetProductoPorCLRequest request) {
        return fugetProductoPorCLFun(request.getPfCodLegalProd());
    }

    /** 
     * Method that solves the fugetPlanPorCL user function.
     *
     * @param pfCodLegalPlan This parameter represents the pfCodLegalPlan inbound argument.
     *
     * @return Return Planes value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public Planes fugetPlanPorCLFun(String pfCodLegalPlan) {

        // Devuelve el  producto a partir de su número

    	List<FilterVariableRequest> filterVariables = new ArrayList<>();
    	filterVariables.add(new FilterVariableRequest(PlanesConstants.VAR_NAME_FPLANESPORCODLEGAL_VFCODIGOLEGAL, pfCodLegalPlan));
    	
    	FilterRequest filterRequest = new FilterRequest(PlanesConstants.FILTER_NAME_FPLANESPORCODLEGAL, filterVariables);
    	QueryRequest queryRequest = new QueryRequest(filterRequest);
    	
    	List<Planes> results = planesService.get(queryRequest);
    	return results != null && !results.isEmpty() ? results.get(0) : null;

    	
    }

    public Planes fugetPlanPorCLFun(FugetPlanPorCLRequest request) {
        return fugetPlanPorCLFun(request.getPfCodLegalPlan());
    }

    /** 
     * Method that solves the fugetFuncionarioPorLDAP user function.
     *
     * @param pfUsuLDAP This parameter represents the pfUsuLDAP inbound argument.
     *
     * @return Return Funcionario value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public Funcionario fugetFuncionarioPorLDAPFun(String pfUsuLDAP) {
    	List<FilterVariableRequest> filterVariables = new ArrayList<>();
    	filterVariables.add(new FilterVariableRequest(FuncionarioConstants.VAR_NAME_IFILTERPORUSUARIOLDAP_VFUSULDAP, pfUsuLDAP));
    	
    	FilterRequest filterRequest = new FilterRequest(FuncionarioConstants.FILTER_NAME_IFILTERPORUSUARIOLDAP, filterVariables);
    	QueryRequest queryRequest = new QueryRequest(filterRequest);
    	
    	List<Funcionario> results = funcionarioService.get(queryRequest);
    	return results != null && !results.isEmpty() ? results.get(0) : null;
    }

    public Funcionario fugetFuncionarioPorLDAPFun(FugetFuncionarioPorLDAPRequest request) {
        return fugetFuncionarioPorLDAPFun(request.getPfUsuLDAP());
    }

    /** 
     * Method that solves the fuFormarTextoObservaciones user function.
     *
     * @param pfSolicitud This parameter represents the pfSolicitud inbound argument.
     *
     * @return Return String value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public String fuFormarTextoObservacionesFun(Solicitud pfSolicitud) {

        // COMMENTS:
        // El texto a añadir se compone en función del valor de los datos mencinados. De tal manera que:
        //         GdC-14: Req. 60: Observaciones Automáticas
        //         Las observaciones deben ser:
        //         Usuario1: Traer la EPS que se diligencio / indicar fecha de antigüedad/ Parentesco
        //         
        // Please implement the body of your user function
        return "";
    }

    public String fuFormarTextoObservacionesFun(FuFormarTextoObservacionesRequest request) {
        return fuFormarTextoObservacionesFun(request.getPfSolicitudInstance());
    }

    /** 
     * Method that solves the fuGetCodigoPersonaCORE user function.
     *
     * @param tipoId This parameter represents the tipoId inbound argument.
     *
     * @param numId This parameter represents the numId inbound argument.
     *
     * @param numSolicitud GdC 37: El número de solicitud en el marco de la cual se llama a esta fu. Para hacer log.
     *
     * @return Return java.lang.Long value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public java.lang.Long fuGetCodigoPersonaCOREFun(String tipoId, String numId, String numSolicitud) {
		// Buscamos a la persona en el CORE
    	try {
	        ConsultarPersonaRequest request = new ConsultarPersonaRequest();
	        request.setTipoIdentificacion(tipoId);
	        request.setNumeroIdentificacion(numId);
	        request.setNumSolicitud(numSolicitud);
	    	ConsultarPersonaResponse response = patientUtils.consultarPersona(request);
	    	if (response != null && response.isExito()) {
	    		return response.getCodigo();
	    	}
    	}
    	catch(Exception e) {
			org.slf4j.LoggerFactory.getLogger(this.getClass().getName()).error("Error en fuGetCodigoPersonaCOREFun\n" + e.getMessage());
    	}
        return null;
    }

    public java.lang.Long fuGetCodigoPersonaCOREFun(FuGetCodigoPersonaCORERequest request) {
        return fuGetCodigoPersonaCOREFun(request.getTipoId(), request.getNumId(), request.getNumSolicitud());
    }

    /** 
     * Method that solves the fuGetFechaFinVigenciaUsuario user function.
     *
     * @param pfTipoIdentificacion This parameter represents the pfTipoIdentificacion inbound argument.
     *
     * @param pfNumIdentificacion This parameter represents the pfNumIdentificacion inbound argument.
     *
     * @param pfNumSolicitud GcD-37 Log llamadas a BH con el Num solicitud
     *
     * @return Return java.sql.Date value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public java.sql.Date fuGetFechaFinVigenciaUsuarioFun(String pfTipoIdentificacion, String pfNumIdentificacion, String pfNumSolicitud) {

        // GdC10-12: Para obtener los contratos anteriores, invocaremos a la capacidad consultar beneficiario servicio de contratoMP, pasando como parámetros el tipo de identificación y número de identificación.
        //         Las fechas para la comparación son el tag fechaFinVigencia de la sección InformacionBeneficiarios (de la capacidad consultar beneficiario servicio de contratoMP) y nos quedaremos con la mayor de todos aquellos domicnios donde se indica que se debe rellenar el cuestionario médico. Devolvemos null si no tiene contratos anteriores o si para ninguno de ellos su dominio indica que se debe rellenar el cuestionario medico
    	return coverageUtils.getFechaFinVigenciaUsuario(pfTipoIdentificacion, pfNumIdentificacion, pfNumSolicitud);
    }

    public java.sql.Date fuGetFechaFinVigenciaUsuarioFun(FuGetFechaFinVigenciaUsuarioRequest request) {
        return fuGetFechaFinVigenciaUsuarioFun(request.getPfTipoIdentificacion(), request.getPfNumIdentificacion(), request.getPfNumSolicitud());
    }

    /** 
     * Method that solves the fuGetNombreAsesor user function.
     *
     * @param pfUsuario This parameter represents the pfUsuario inbound argument.
     *
     * @return Return String value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public String fuGetNombreAsesorFun(String pfUsuario) {

        // COMMENTS:
        // Devuelve el nombre completo del asesor que tenga como usuario el recibido y no sea de agencia (no sea manual)
    	String nombre = "";
    	if (pfUsuario != null) {
        	List<FilterVariableRequest> filterVariables = new ArrayList<>();
        	filterVariables.add(new FilterVariableRequest(AsesorConstants.VAR_NAME_IFASESORPORUSUARIONOMANUAL_VFUSUARIO, pfUsuario));
        	FilterRequest filterRequest = new FilterRequest(AsesorConstants.FILTER_NAME_IFASESORPORUSUARIONOMANUAL, filterVariables);
        	QueryRequest queryRequest = new QueryRequest(filterRequest);
        	List<Asesor> results = asesorService.get(queryRequest);
        	nombre = results != null && !results.isEmpty() ? results.get(0).getFuncionariodrvNombreCompleto() : "";
    	}
        return nombre;
    }

    public String fuGetNombreAsesorFun(FuGetNombreAsesorRequest request) {
        return fuGetNombreAsesorFun(request.getPfUsuario());
    }

    /** 
     * Method that solves the fuGetNombreFuncionario user function.
     *
     * @param pfUsuario This parameter represents the pfUsuario inbound argument.
     *
     * @return Return String value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public String fuGetNombreFuncionarioFun(String pfUsuario) {
        // COMMENTS:
        // Devuelve el nombre completo del funcionaio que tenga como usuario el recibido y no sea de agencia (no sea manual)
    	Funcionario funcionario = fugetAgenteFun(pfUsuario);
        return funcionario != null ? funcionario.getFuncionariodrvNombreCompleto() : "";
    }

    public String fuGetNombreFuncionarioFun(FuGetNombreFuncionarioRequest request) {
        return fuGetNombreFuncionarioFun(request.getPfUsuario());
    }

    /** 
     * Method that solves the fuformarMsgErrorUsrSinDocs user function.
     *
     * @param pfSolicitud This parameter represents the pfSolicitud inbound argument.
     *
     * @return Return String value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public String fuformarMsgErrorUsrSinDocsFun(Solicitud pfSolicitud) {

        // COMMENTS:
        // Dada una solicitud, devuelve las lista de usuarios a los que les falta alg´nu tip ode documentación
        // Please implement the body of your user function
        return "";
    }

    public String fuformarMsgErrorUsrSinDocsFun(FuformarMsgErrorUsrSinDocsRequest request) {
        return fuformarMsgErrorUsrSinDocsFun(request.getPfSolicitudInstance());
    }

    /** 
     * Method that solves the fuEnviarEmailDevDoc user function.
     *
     * @param pfAsunto This parameter represents the pfAsunto inbound argument.
     *
     * @param pfCuerpo This parameter represents the pfCuerpo inbound argument.
     *
     * @param pfDestinatario This parameter represents the pfDestinatario inbound argument.
     *
     * @param pfEmailConf This parameter represents the pfEmailConf inbound argument.
     *
     * @param ptObservaciones This parameter represents the ptObservaciones inbound argument.
     *
     * @param pfNumSolicitud GdC 37, si el email se envía en el marco de una solicitud, el número de la misma
     *
     * @return Return String value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public String fuEnviarEmailDevDocFun(String pfAsunto, String pfCuerpo, String pfDestinatario, String pfEmailConf, 			String ptObservaciones, String pfNumSolicitud) {
        String body = pfCuerpo;
    	
    	if (ptObservaciones != null && !ptObservaciones.isEmpty()){
    		
    		body += "\n<p>Observaciones:</p>\n";
    		body += "<p>" + ptObservaciones + "</p>";
    	}
    	
        return fuEnviarEmailFun(pfAsunto, pfDestinatario, pfEmailConf, body, null, null, pfNumSolicitud);
    }

    public String fuEnviarEmailDevDocFun(FuEnviarEmailDevDocRequest request) {
        return fuEnviarEmailDevDocFun(request.getPfAsunto(), request.getPfCuerpo(), request.getPfDestinatario(), request.getPfEmailConf(), request.getPtObservaciones(), request.getPfNumSolicitud());
    }

    /** 
     * Method that solves the fuContratoExentoDocSol user function.
     *
     * @param pfNumContrato This parameter represents the pfNumContrato inbound argument.
     *
     * @return Return java.lang.Boolean value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public java.lang.Boolean fuContratoExentoDocSolFun(String pfNumContrato) {
        // Please implement the body of your user function
        return false;
    }

    public java.lang.Boolean fuContratoExentoDocSolFun(FuContratoExentoDocSolRequest request) {
        return fuContratoExentoDocSolFun(request.getPfNumContrato());
    }

    /** 
     * Method that solves the fuEstadoSolicitud user function.
     *
     * @param pfEstadoSol This parameter represents the pfEstadoSol inbound argument.
     *
     * @return Return String value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public String fuEstadoSolicitudFun(java.lang.Long pfEstadoSol) {

        // COMMENTS:
        // Devuelve el estado de la solicitud en texto
        // Please implement the body of your user function
    	String estado = "desconocido"; 
    	if (pfEstadoSol == 0L) {estado = "Error";}
    	if (pfEstadoSol == 1L) {estado = "Radicado";}
    	if (pfEstadoSol == 2L) {estado = "Tramitado";}
    	if (pfEstadoSol == 3L) {estado = "Tramitado con preexistencias";}
    	if (pfEstadoSol == 4L) {estado = "Anulado";}
    	if (pfEstadoSol == 5L) {estado = "Pendiente médico";}
    	if (pfEstadoSol == 6L) {estado = "Devuelta por área médica";}
    	if (pfEstadoSol == 7L) {estado = "Aprobado médico";}
        
        return estado;

    }

    public String fuEstadoSolicitudFun(FuEstadoSolicitudRequest request) {
        return fuEstadoSolicitudFun(request.getPfEstadoSol());
    }

    /** 
     * Method that solves the fuGenerarReporteOracle user function.
     *
     * @param pfNombreReporte This parameter represents the pfNombreReporte inbound argument.
     *
     * @param pfUsuario This parameter represents the pfUsuario inbound argument.
     *
     * @param pfParametros This parameter represents the pfParametros inbound argument.
     *
     * @return Return byte[] value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public byte[] fuGenerarReporteOracleFun(String pfNombreReporte, String pfUsuario, String pfParametros) {
        // Please implement the body of your user function
        return new byte[0];
    }

    public byte[] fuGenerarReporteOracleFun(FuGenerarReporteOracleRequest request) {
        return fuGenerarReporteOracleFun(request.getPfNombreReporte(), request.getPfUsuario(), request.getPfParametros());
    }

    /** 
     * Method that solves the fuCalcularIMC user function.
     *
     * @param pfPersonaC This parameter represents the pfPersonaC inbound argument.
     *
     * @return Return java.lang.Double value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public java.lang.Double fuCalcularIMCFun(PersonaC pfPersonaC) {
        // Please implement the body of your user function
        return Double.valueOf(0);
    }

    public java.lang.Double fuCalcularIMCFun(FuCalcularIMCRequest request) {
        return fuCalcularIMCFun(request.getPfPersonaCInstance());
    }

    /** 
     * Method that solves the fuGetEstadoPersonaError user function.
     *
     * @return Return EstadoBeneficiario value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public EstadoBeneficiario fuGetEstadoPersonaErrorFun() {
        // Please implement the body of your user function
        return null;
    }

    /** 
     * Method that solves the fuCalcularIMCUsuario user function.
     *
     * @param pfUsuario This parameter represents the pfUsuario inbound argument.
     *
     * @return Return java.lang.Double value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public java.lang.Double fuCalcularIMCUsuarioFun(Usuario pfUsuario) {
        // Please implement the body of your user function
        return Double.valueOf(0);
    }

    public java.lang.Double fuCalcularIMCUsuarioFun(FuCalcularIMCUsuarioRequest request) {
        return fuCalcularIMCUsuarioFun(request.getPfUsuarioInstance());
    }

    /** 
     * Method that solves the fuEnviarSMS user function.
     *
     * @param pfSolicitud This parameter represents the pfSolicitud inbound argument.
     *
     * @param pfNumCelulcar This parameter represents the pfNumCelulcar inbound argument.
     *
     * @param pfPlantilla This parameter represents the pfPlantilla inbound argument.
     *
     * @return Return String value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public String fuEnviarSMSFun(Solicitud pfSolicitud, String pfNumCelulcar, PlantillaEmail pfPlantilla) {
        // Please implement the body of your user function
    	String resultado = "";
    	
    	try {
    		String numSolicitud = pfSolicitud.getSolicitudNumRadicado().toString();
    		// Es el nombre del producto de la solicitud
    		String from = "COLSANITAS";
    		// Anyadimos el prefijo de Colombia al numero de celular
    		String to = "57" + pfNumCelulcar;
    		// Formamos el texto utilzando el de la plantilla y sustituyendo los marcadores por los valores de la solicitud
    		String texto = pfPlantilla.getPlantillaEmailTextoMensaje();
    		
    		// Localizamos los datos que se requieren para el envÃ­o
    		List<String> claves = getClavesEnPlantilla(texto);
    		// Recuperamos los datos requeridos
    		if (claves != null && !claves.isEmpty()) {
    			String displaySet = String.join(",", claves);
    			
    			QueryRequest soliRequest = new QueryRequest();
    			soliRequest.setDisplaySetItems(displaySet);
    			
    			FilterRequest filterByOid = new FilterRequest();
    			filterByOid.setName("_OID");
    			filterByOid.addFilterVariable("oid", pfSolicitud.getOid().toJson());
				soliRequest.addFilterRequest(filterByOid );
				PopulationResponseViewModel solicitudes = solicitudService.getPopulationDynamic(soliRequest);
				if (solicitudes != null && solicitudes.isOk() && !solicitudes.getResults().isEmpty()) {
					Object valorClave = "";
					for(String clave : claves) {
						valorClave = solicitudes.getResults().get(0).get(clave.replaceAll("\\.", "-"));
						if (valorClave != null) {
							texto = texto.replaceAll("%%" + clave + "%%", valorClave.toString());	
						}
					}
				}
    		}
    		
    		resultado = envioSMSUtils.envioSMSDirect(from, to, texto, numSolicitud);
    	} catch (Exception e) {
			org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage() + "\n" + e.getStackTrace());
			resultado = "Error en envio SMS";
		}
    	
        return resultado;
    }

	public static List<String> getClavesEnPlantilla(String textoPlantilla) {
		
		List<String> claves = new ArrayList<String>();
		
		if (textoPlantilla != null && !textoPlantilla.isEmpty()){
			int posIni = textoPlantilla.indexOf("%%", 0);
			int posFin = 0;
			String clave = "";
			// Buscamos los texto contenidos entre el signo $
			while(posIni > 0 && posIni < textoPlantilla.length()){
				posFin = textoPlantilla.indexOf("%%", posIni + 2 );
				if (posFin > 0){
					// El texto entre ambas posiciones no tiene que contener ningÃºn espacio
					clave = textoPlantilla.substring(posIni + 2, posFin);
					
					if (!clave.contains(" ") && !claves.contains(clave)){
						claves.add(clave);
					}
					
					posIni = textoPlantilla.indexOf("%%", posFin + 2 );
					
				} else{
					posIni = -1;
				}
			}
			
		}
		
		return claves;
	}    

    public String fuEnviarSMSFun(FuEnviarSMSRequest request) {
        return fuEnviarSMSFun(request.getPfSolicitudInstance(), request.getPfNumCelulcar(), request.getPfPlantillaInstance());
    }

    /** 
     * Method that solves the fugetFuncionarioPorId user function.
     *
     * @param pfIdFuncionario This parameter represents the pfIdFuncionario inbound argument.
     *
     * @return Return Funcionario value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public Funcionario fugetFuncionarioPorIdFun(java.lang.Long pfIdFuncionario) {
    	Funcionario funcionario = funcionarioService.getById(pfIdFuncionario);
        return funcionario != null && !funcionario.isNull() ? funcionario : null;
    }

    public Funcionario fugetFuncionarioPorIdFun(FugetFuncionarioPorIdRequest request) {
        return fugetFuncionarioPorIdFun(request.getPfIdFuncionario());
    }

    /** 
     * Method that solves the fuCallSPgetusugrabador user function.
     *
     * @param pfIdSolicitud This parameter represents the pfIdSolicitud inbound argument.
     *
     * @return Return java.lang.Long value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public java.lang.Long fuCallSPgetusugrabadorFun(java.lang.Long pfIdSolicitud) {
        // Please implement the body of your user function
        return Long.valueOf(0);
    }

    public java.lang.Long fuCallSPgetusugrabadorFun(FuCallSPgetusugrabadorRequest request) {
        return fuCallSPgetusugrabadorFun(request.getPfIdSolicitud());
    }

    /** 
     * Method that solves the fuCallSPgetusugrabadornov user function.
     *
     * @param pfIdSolcitudNov This parameter represents the pfIdSolcitudNov inbound argument.
     *
     * @return Return java.lang.Long value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public java.lang.Long fuCallSPgetusugrabadornovFun(java.lang.Long pfIdSolcitudNov) {
        // Please implement the body of your user function
        return Long.valueOf(0);
    }

    public java.lang.Long fuCallSPgetusugrabadornovFun(FuCallSPgetusugrabadornovRequest request) {
        return fuCallSPgetusugrabadornovFun(request.getPfIdSolcitudNov());
    }

    /** 
     * Method that solves the fuCallSPgetusuareamed user function.
     *
     * @param pfIdSolicitud This parameter represents the pfIdSolicitud inbound argument.
     *
     * @return Return java.lang.Long value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public java.lang.Long fuCallSPgetusuareamedFun(java.lang.Long pfIdSolicitud) {
        // Please implement the body of your user function
        return Long.valueOf(0);
    }

    public java.lang.Long fuCallSPgetusuareamedFun(FuCallSPgetusuareamedRequest request) {
        return fuCallSPgetusuareamedFun(request.getPfIdSolicitud());
    }

    /** 
     * Method that solves the fugetAreaMedicaPorId user function.
     *
     * @param pfIdAreaMedica This parameter represents the pfIdAreaMedica inbound argument.
     *
     * @return Return AreaMedica value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public AreaMedica fugetAreaMedicaPorIdFun(java.lang.Long pfIdAreaMedica) {
        // Please implement the body of your user function
    	AreaMedica areaMedica = areaMedicaService.getById(pfIdAreaMedica);
        return areaMedica != null && !areaMedica.isNull() ? areaMedica : null;
    }

    public AreaMedica fugetAreaMedicaPorIdFun(FugetAreaMedicaPorIdRequest request) {
        return fugetAreaMedicaPorIdFun(request.getPfIdAreaMedica());
    }

    /** 
     * Method that solves the fugetPrioridad user function.
     *
     * @param pfEstadoSol This parameter represents the pfEstadoSol inbound argument.
     *
     * @param pfEstadoDoc This parameter represents the pfEstadoDoc inbound argument.
     *
     * @return Return java.lang.Long value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public java.lang.Long fugetPrioridadFun(java.lang.Long pfEstadoSol, java.lang.Long pfEstadoDoc) {

        // Devuelve la prioridad para una solicitud en función del estado y del estado de la documentación, recibidos ambos como argumentos en la funcion.
        //         Deb buscar en la tabla 'PriorizacionSolicitud" el par recibido. Si no se encuentra debe devolver 0 (cero) para que el que la invoca proceda en consecuencia
        PriorizacionSolicitudes priorizacionSolicitudes = priorizacionSolicitudesService.getByOID(new PriorizacionSolicitudesOid(pfEstadoSol, pfEstadoDoc));
        return priorizacionSolicitudes != null && !priorizacionSolicitudes.isNull() ? priorizacionSolicitudes.getPriorizacionSolicitudesPrioridad() : 0L;
    }

    public java.lang.Long fugetPrioridadFun(FugetPrioridadRequest request) {
        return fugetPrioridadFun(request.getPfEstadoSol(), request.getPfEstadoDoc());
    }

    /** 
     * Method that solves the fuCallSPgetsemaforograbador user function.
     *
     * @param pfIdSolicitud This parameter represents the pfIdSolicitud inbound argument.
     *
     * @return Return java.lang.Double value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public java.lang.Double fuCallSPgetsemaforograbadorFun(java.lang.Long pfIdSolicitud) {

        // COMMENTS:
        // GdC 26: Llama a la función getsemaforograbador
        // Please implement the body of your user function
        return Double.valueOf(0);
    }

    public java.lang.Double fuCallSPgetsemaforograbadorFun(FuCallSPgetsemaforograbadorRequest request) {
        return fuCallSPgetsemaforograbadorFun(request.getPfIdSolicitud());
    }

    /** 
     * Method that solves the fuCallSPgetsemaforograbadornov user function.
     *
     * @param pfIdSolcitudNov This parameter represents the pfIdSolcitudNov inbound argument.
     *
     * @return Return java.lang.Double value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public java.lang.Double fuCallSPgetsemaforograbadornovFun(java.lang.Long pfIdSolcitudNov) {

        // COMMENTS:
        // GdC 26: Llama a la función getsemaforograbadornov
        // Please implement the body of your user function
        return Double.valueOf(0);
    }

    public java.lang.Double fuCallSPgetsemaforograbadornovFun(FuCallSPgetsemaforograbadornovRequest request) {
        return fuCallSPgetsemaforograbadornovFun(request.getPfIdSolcitudNov());
    }

    /** 
     * Method that solves the fuCallSPgetsemaforoareamed user function.
     *
     * @param pfIdSolicitud This parameter represents the pfIdSolicitud inbound argument.
     *
     * @return Return java.lang.Double value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public java.lang.Double fuCallSPgetsemaforoareamedFun(java.lang.Long pfIdSolicitud) {

        // COMMENTS:
        // GdC 26: Llama a la función getsemaforoareamed
        // Please implement the body of your user function
        return Double.valueOf(0);
    }

    public java.lang.Double fuCallSPgetsemaforoareamedFun(FuCallSPgetsemaforoareamedRequest request) {
        return fuCallSPgetsemaforoareamedFun(request.getPfIdSolicitud());
    }

    /** 
     * Method that solves the fugetSolicitudNovedadByNumRadicado user function.
     *
     * @param pfNumRadicado This parameter represents the pfNumRadicado inbound argument.
     *
     * @return Return SolicitudNovedad value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public SolicitudNovedad fugetSolicitudNovedadByNumRadicadoFun(String pfNumRadicado) {
        // Please implement the body of your user function
        return null;
    }

    public SolicitudNovedad fugetSolicitudNovedadByNumRadicadoFun(FugetSolicitudNovedadByNumRadicadoRequest request) {
        return fugetSolicitudNovedadByNumRadicadoFun(request.getPfNumRadicado());
    }

    /** 
     * Method that solves the fuGetFechaDesdeVarFiltro user function.
     *
     * @return Return java.sql.Date value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public java.sql.Date fuGetFechaDesdeVarFiltroFun() {
        // Please implement the body of your user function
        return Date.valueOf(Constants.DATE_DEFAULTVALUE);
    }

    /** 
     * Method that solves the fuCheckRegimenSubsidiado user function.
     *
     * @param pfTipoId This parameter represents the pfTipoId inbound argument.
     *
     * @param pfNumId This parameter represents the pfNumId inbound argument.
     *
     * @param pfSolicitud This parameter represents the pfSolicitud inbound argument.
     *
     * @param pfEsVoluntario This parameter represents the pfEsVoluntario inbound argument.
     *
     * @return Return java.lang.Long value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public java.lang.Long fuCheckRegimenSubsidiadoFun(String pfTipoId, String pfNumId, String pfSolicitud, java.lang.Boolean pfEsVoluntario) {

        // COMMENTS:
        // Realiza las comprobacione del Requisito 1 de la GdC-39. Devuevle: 0 = Puede añadirse el usuario. 1 = No puede porque no corresponde a regimen subsidiado. 2 = No puede porque no se encuentra activo en un contrato de régimen contributivo
        // Please implement the body of your user function
        return Long.valueOf(0);
    }

    public java.lang.Long fuCheckRegimenSubsidiadoFun(FuCheckRegimenSubsidiadoRequest request) {
        return fuCheckRegimenSubsidiadoFun(request.getPfTipoId(), request.getPfNumId(), request.getPfSolicitud(), request.getPfEsVoluntario());
    }

    /** 
     * Method that solves the fuGetFInicioPlanVol user function.
     *
     * @param pfTipoTramite This parameter represents the pfTipoTramite inbound argument.
     *
     * @param pfTipoContrato This parameter represents the pfTipoContrato inbound argument.
     *
     * @param pfFecha This parameter represents the pfFecha inbound argument.
     *
     * @return Return java.sql.Date value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public java.sql.Date fuGetFInicioPlanVolFun(java.lang.Long pfTipoTramite, java.lang.Long pfTipoContrato, java.sql.Date pfFecha) {

        // COMMENTS:
        // GdC-39 Requisito 2: Localiza la fecha de inicio en la nueva parametrica para el tipo de tramite, tipo de contrato y a la fecha recibida
    	
    	java.sql.Date fechaReturn = null;
    	try {
        	List<FilterVariableRequest> filterVariables = new ArrayList<>();
        	filterVariables.add(new FilterVariableRequest(FechaIniEPSConstants.VAR_NAME_FFECHAINIEPS_VFTRAMITE , pfTipoTramite));
        	filterVariables.add(new FilterVariableRequest(FechaIniEPSConstants.VAR_NAME_FFECHAINIEPS_VFTIPOCONTRATO , pfTipoContrato));
        	filterVariables.add(new FilterVariableRequest(FechaIniEPSConstants.VAR_NAME_FFECHAINIEPS_VFFECHA , pfFecha));
        	FilterRequest filterRequest = new FilterRequest(FechaIniEPSConstants.FILTER_NAME_FFECHAINIEPS, filterVariables);
        	QueryRequest queryRequest = new QueryRequest(filterRequest);

        	List<FechaIniEPS> results = fechaIniEPSService.get(queryRequest);
        	
        	if (results==null || results.isEmpty()) 
        		fechaReturn = null;
        	else{
        		for (FechaIniEPS fecha: results) {
        			fechaReturn = fecha.getFechaIniEPSFechaInicioAplicar();
        			break;
        		}
        	}
		} catch (SystemException e) {
			org.slf4j.LoggerFactory.getLogger(this.getClass()).error("Error en fuGetFInicioPlanVolFun:");
    		org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage() + "\n" + e.getStackTrace());    		
    		fechaReturn = null;
		}
		
    	return fechaReturn;
    }

    public java.sql.Date fuGetFInicioPlanVolFun(FuGetFInicioPlanVolRequest request) {
        return fuGetFInicioPlanVolFun(request.getPfTipoTramite(), request.getPfTipoContrato(), request.getPfFecha());
    }

    /** 
     * Method that solves the fuValidarDominioIncompatibles user function.
     *
     * @param pfTipoId This parameter represents the pfTipoId inbound argument.
     *
     * @param pfNumId This parameter represents the pfNumId inbound argument.
     *
     * @param pfFechaInicioVigencia This parameter represents the pfFechaInicioVigencia inbound argument.
     *
     * @param pfSolicitud This parameter represents the pfSolicitud inbound argument.
     *
     * @return Return java.lang.Boolean value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public java.lang.Boolean fuValidarDominioIncompatiblesFun(String pfTipoId, String pfNumId, java.sql.Date pfFechaInicioVigencia, Solicitud pfSolicitud) {

    	// Buscamos los contratos utilizando el validador de usuarios

    	java.sql.Date fecha = pfFechaInicioVigencia;
    	if (pfFechaInicioVigencia == null) {
    		fecha = STDFunctions.systemDateFun(); 
    	}

    	try {
    		ConsultarContratoDePersonaRequest request = new ConsultarContratoDePersonaRequest();
    		request.setFecha(fecha);
    		request.setTipoIdentificacion(pfTipoId);
    		request.setNumeroIdentificacion(pfNumId);
    		request.setNumSolicitud(pfSolicitud.getSolicitudNumRadicado().toString());
    		ConsultarContratoResponse response = contractUtils.consultarContratoDePersona(request);


    		// Si no hay contrato ...
    		if (response == null || response.getCoverResponse() == null || 
    			response.getCoverResponse().getCoverFamilyResponse() == null) {
    			return true;
    		}

    		// Localizamos a la solicitud
    		QueryRequest soliRequest = new QueryRequest();
    		soliRequest.setDisplaySetItems("ae_solicitudes.productot.codigolegal,ae_solicitudes.productot.producto,ae_solicitudes.plant.codigolegal,ae_solicitudes.plant.plan");
    		soliRequest.setJsonOID(pfSolicitud.getOid().toJson());
    		InstanceResponseViewModel solicitudResponse = solicitudService.getSolicitudDynamic(soliRequest);
    		String codLegalPlanSolicitud = solicitudResponse.getProperties().get("ae_solicitudes.productot.codigolegal").toString();
    		String codLegalProductoSolicitud = solicitudResponse.getProperties().get("ae_solicitudes.plant.codigolegal").toString();


    		// Localizamos al Dominio
    		QueryRequest requestDominio = new QueryRequest();
    		requestDominio.setDisplaySetItems("numero");
    		FilterRequest filterDominio = new FilterRequest();
    		filterDominio.setName("iF_DominioProdPlan");
    		filterDominio.addFilterVariable("vo_Producto", new ProductosOid(
    				Long.parseLong( solicitudResponse.getProperties().get("ae_solicitudes.productot.producto").toString())));
    		filterDominio.addFilterVariable("vo_Plan", new PlanesOid(
    				Long.parseLong( solicitudResponse.getProperties().get("ae_solicitudes.plant.plan").toString())));
    		requestDominio.addFilterRequest(filterDominio);
    		PopulationResponseViewModel responseDominio = dominioService.getPopulationDynamic(requestDominio );
    		// SOlo debe haber uno
    		if (responseDominio.getResults().isEmpty()) {
    			throw new SystemException( "UF0010: Dominio no encontrado" );
    		}
    		String oidDominioJson = responseDominio.getResults().get(0).get("oid").toString();


    		// Comprobamos si alguno de los contratos es de alguno de los dominios incompatibles
    		for(CoverFamilyResponse contrato : response.getCoverResponse().getCoverFamilyResponse() ) {

    			// Comprobamos que no tenga Solicitudes de novedad segÃºn indica el Req 1 de la GdC-40
    			String codLegalPlanContrato = contrato.getIdentifierPorType(contrato.getContract().getIdentifier(), "PLAN");
    			String codLegalProductoContrato = contrato.getIdentifierPorType(contrato.getInsurancePlan().getIdentifier(), "CODIGO_PRODUCTO");


    			QueryRequest requestSolNov = new QueryRequest();
    			FilterRequest filter = new FilterRequest();
    			filter.setName("iF_SolNovValidadorUsuarios");
    			filter.addFilterVariable("vfNumContrato", contrato.getIdentifierPorType(contrato.getContract().getIdentifier(), "CONTRATO"));
    			filter.addFilterVariable("vfPlan", codLegalPlanContrato);
    			filter.addFilterVariable("vfProducto",  codLegalProductoContrato);
    			filter.addFilterVariable("vfTipoIdent", pfTipoId);
    			filter.addFilterVariable("vfNumIdent", pfNumId);
    			requestSolNov.addFilterRequest(filter);
    			PopulationResponseViewModel responseSolNov = solicitudNovedadService.getPopulationDynamic(requestSolNov );

    			if (responseSolNov.getTotalItems() > 0) {
    				continue;
    			}


    			Patient bene = contrato.getContract().getSubject().getPatient().get(0);

    			// Comprobamos con el Dominio de la solicitud
    			if (codLegalPlanSolicitud.equalsIgnoreCase(codLegalPlanContrato) &&
    					codLegalProductoSolicitud.equalsIgnoreCase(codLegalProductoContrato)) {

    				// Si el usuario estÃ¡ en estado â€œRetiradoâ€ en un contrato existente 
    				//  la fecha de fin de vigencia del contrato debe ser anterior a la fecha de inicio de vigencia

    				if ("RETIRADO".equalsIgnoreCase(bene.getStatus())) {
    					if (contrato.getContract().getApplies().getEnd() == null || 
    							!STDFunctions.dateBeforeFun(contrato.getContract().getApplies().getEnd(), fecha)) {
    						return false;
    					}
    				}

    				// Si el usuario esta estado Activo cualquier fecha de inicio
    				//  de vigencia de la solicitud sera no permitida
    				if ("ACTIVO".equalsIgnoreCase(bene.getStatus())) {
    					return false;
    				}
    			}


    			// Comprobamos con los Dominios incompatibles del de la solicitud.
    			QueryRequest dominioRequest = new QueryRequest();
    			dominioRequest.addFilterByRelated(oidDominioJson, "DominiosConIncompatibilidad");
    			dominioRequest.setDisplaySetItems("productot.codigolegal,plant.codigolegal");
    			dominioRequest.setPageSize(999);
    			PopulationResponseViewModel dominioResponse = dominioService.getPopulationDynamic(dominioRequest );
    			for (Map<String, Object> dominioIncompatible : dominioResponse.getResults()) {

    				if (codLegalPlanContrato.equalsIgnoreCase(dominioIncompatible.get("plant-codigolegal").toString()) &&
    						codLegalProductoContrato.equalsIgnoreCase(dominioIncompatible.get("productot-codigolegal").toString())) {

    					// Si el usuario esta en estado Retirado en un contrato existente 
    					//  la fecha de fin de vigencia del contrato debe ser anterior a la fecha de inicio de vigencia
    					if ("RETIRADO".equalsIgnoreCase(bene.getStatus())) {
    						if (contrato.getContract().getApplies().getEnd() == null || 
    								!STDFunctions.dateBeforeFun(contrato.getContract().getApplies().getEnd(), fecha)) {
    							return false;
    						}
    					}
    					// Si el usuario esta estado Activo cualquier fecha de inicio 
    					//  de vigencia de la solicitud serÃ­a no permitida
    					if ("ACTIVO".equalsIgnoreCase(bene.getStatus())) {
    						return false;
    					}
    				}

    			}
    		}
    	} catch (Exception e) {
    		org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage() + "\n" + e.getStackTrace());    		
    	}

    	return true;
    }

    public java.lang.Boolean fuValidarDominioIncompatiblesFun(FuValidarDominioIncompatiblesRequest request) {
    	return Boolean.TRUE;
        // return fuValidarDominioIncompatiblesFun(request.getPfTipoId(), request.getPfNumId(), request.getPfFechaInicioVigencia(), request.getPfSolicitudInstance());
    }

    /** 
     * Method that solves the fuExisteContratoExentoFIngreso user function.
     *
     * @param vfNumContrato This parameter represents the vfNumContrato inbound argument.
     *
     * @return Return java.lang.Boolean value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public java.lang.Boolean fuExisteContratoExentoFIngresoFun(String vfNumContrato) {
        // Please implement the body of your user function
        return false;
    }

    public java.lang.Boolean fuExisteContratoExentoFIngresoFun(FuExisteContratoExentoFIngresoRequest request) {
        return fuExisteContratoExentoFIngresoFun(request.getVfNumContrato());
    }

    /** 
     * Method that solves the fuGetFechaLimiteDescargaDoc user function.
     *
     * @return Return java.sql.Date value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public java.sql.Date fuGetFechaLimiteDescargaDocFun() {

        // COMMENTS:
        // GdC-47 v.1 Req 6. "Parametrización fecha de descarga de documentos"
        // Please implement the body of your user function
        return Date.valueOf(Constants.DATE_DEFAULTVALUE);
    }

    /** 
     * Method that solves the fuGetTkn user function.
     *
     * @return Return String value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public String fuGetTknFun() {

    	try {
    	    return tokenAtomicUtils.generarTokenParaATOMIC();
    	} catch (Exception e) {
    	    LogManagement.error(e);
    	}
    	
        return "";
    }

    /** 
     * Method that solves the fuGetReporteSolicitud user function.
     *
     * @param pfSolicitud This parameter represents the pfSolicitud inbound argument.
     *
     * @param pfRuta This parameter represents the pfRuta inbound argument.
     *
     * @return Return byte[] value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public byte[] fuGetReporteSolicitudFun(Solicitud pfSolicitud, String pfRuta) {

        // COMMENTS:
        // Genera el reporte de la ruta indicada para la solciitud recibida
        // Please implement the body of your user function
        return null;
    }

    public byte[] fuGetReporteSolicitudFun(FuGetReporteSolicitudRequest request) {
        return fuGetReporteSolicitudFun(request.getPfSolicitudInstance(), request.getPfRuta());
    }

    /** 
     * Method that solves the fugetEstadoBeneficiarioCOREPorNombre user function.
     *
     * @param pfNombre This parameter represents the pfNombre inbound argument.
     *
     * @return Return EstadoBeneficiario value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public EstadoBeneficiario fugetEstadoBeneficiarioCOREPorNombreFun(String pfNombre) {

    	if (pfNombre != null) {
    		try {
	        	List<FilterVariableRequest> filterVariables = new ArrayList<>();
	        	filterVariables.add(new FilterVariableRequest(EstadoBeneficiarioConstants.VAR_NAME_ICESTADOBENEFICIARIOPORNOMBRE_VNOMBRE, pfNombre));
	        	FilterRequest filterRequest = new FilterRequest(EstadoBeneficiarioConstants.FILTER_NAME_ICESTADOBENEFICIARIOPORNOMBRE, filterVariables);
	        	QueryRequest queryRequest = new QueryRequest(filterRequest);
	        	List<EstadoBeneficiario> results = estadoBeneficiarioService.get(queryRequest);
	        	if (results != null && !results.isEmpty()) {
	        		return results.get(0);
	        	}
    		} catch (Exception e) {
    			org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage() + "\n" + e.getStackTrace());
    		}
    	}
        
        return null;
    }

    public EstadoBeneficiario fugetEstadoBeneficiarioCOREPorNombreFun(FugetEstadoBeneficiarioCOREPorNombreRequest request) {
        return fugetEstadoBeneficiarioCOREPorNombreFun(request.getPfNombre());
    }

    /** 
     * Method that solves the fugetEstadoContratoPorNombre user function.
     *
     * @param pfNombre This parameter represents the pfNombre inbound argument.
     *
     * @return Return EstadoContrato value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public EstadoContrato fugetEstadoContratoPorNombreFun(String pfNombre) {
    	if (pfNombre != null) {
    		try {
	        	List<FilterVariableRequest> filterVariables = new ArrayList<>();
	        	filterVariables.add(new FilterVariableRequest(EstadoContratoConstants.VAR_NAME_IFESTADOCONTRATOCONTRATOPORNO_VNOMBRE , pfNombre));
	        	FilterRequest filterRequest = new FilterRequest(EstadoContratoConstants.FILTER_NAME_IFESTADOCONTRATOCONTRATOPORNO, filterVariables);
	        	QueryRequest queryRequest = new QueryRequest(filterRequest);
	        	List<EstadoContrato> results = estadoContratoService.get(queryRequest);
	        	if (results != null && !results.isEmpty()) {
	        		return results.get(0);
	        	}
    		} catch (Exception e) {
    			org.slf4j.LoggerFactory.getLogger(this.getClass()).error(e.getMessage() + "\n" + e.getStackTrace());
    		}
    	}
    	return null;
    }

    public EstadoContrato fugetEstadoContratoPorNombreFun(FugetEstadoContratoPorNombreRequest request) {
        return fugetEstadoContratoPorNombreFun(request.getPfNombre());
    }

    /** 
     * Method that solves the fuGetIdDocIdentidadEnGestor user function.
     *
     * @param pfNumIdentificacion This parameter represents the pfNumIdentificacion inbound argument.
     *
     * @param pfNumRadicado This parameter represents the pfNumRadicado inbound argument.
     *
     * @return Return String value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public String fuGetIdDocIdentidadEnGestorFun(String pfNumIdentificacion, String pfNumRadicado) {

        // COMMENTS:
        // Busca en el gestor documental el documento de identidad de la persona con la identificación recibida. Devuelve el Id del documento y la extensión
        return gestorDocumentalUtils.buscarDocumentoIdentificacion(pfNumIdentificacion, pfNumRadicado);
    }

    public String fuGetIdDocIdentidadEnGestorFun(FuGetIdDocIdentidadEnGestorRequest request) {
        return fuGetIdDocIdentidadEnGestorFun(request.getPfNumIdentificacion(), request.getPfNumRadicado());
    }

    /** 
     * Method that solves the fuGetIURLDescargaATOMIC user function.
     *
     * @return Return String value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public String fuGetIURLDescargaATOMICFun() {

        // COMMENTS:
        // Devuelve la URL de descarga del gestor documental ATOMIC
    	return urlDescarga;
    }
}
