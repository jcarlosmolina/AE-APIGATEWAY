package com.keralty.ae.global;

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
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import java.sql.Date;

/**
 * User functions
 */
@ApplicationScoped
public class UserFunctions {

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
        // Please implement the body of your user function
        return "";
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
        // Función que recibe dos parámetros, un prefijo y un string que admite nulos. Si el segundo parámetro es nulo, devuelve cadena vacía, si no lo es, concatena prefijo y string. 
        // Please implement the body of your user function
        return "";
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
        // Devuelve el tipo de dirección que corresponde a residencial
        // Please implement the body of your user function
        return null;
    }

    /** 
     * Method that solves the fugetTipoDirCorrespondencia user function.
     *
     * @return Return TipoDireccion value of the User Function
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public TipoDireccion fugetTipoDirCorrespondenciaFun() {

        // COMMENTS:
        // Devuelve el tipo de dirección que corresponde a correspondencia
        // Please implement the body of your user function
        return null;
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
        // Validar que la información en e-mail contenga un solo arroba y que después del carácter arroba exista por lo menos un punto, que no contenga, tildes, ni comas, ni el carácter ñ.
        //         Si el email recibido es nulo (no lo ha proporcionado) devuelve TRUE, ya que esta función se usará en precondiciones. 
        // Please implement the body of your user function
        return false;
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
        // El nombre debe contener al menos un carácter alfabético.
        //         Si el nombre recibido es nulo (no lo ha proporcionado) devuelve TRUE, ya que esta función se usará en precondiciones. 
        // Please implement the body of your user function
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
        //         Si el argumento recibido es nulo (no lo ha proporcionado) devuelve TRUE, ya que esta función se usará en precondiciones. 
        // Please implement the body of your user function
        return false;
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
        //         Si el argumento recibido es nulo (no lo ha proporcionado) devuelve FALSE ya que esta función se usará en precondiciones. 
        // Please implement the body of your user function
        return false;
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
        // Please implement the body of your user function
        return null;
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
        // Please implement the body of your user function
        return null;
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
        // Please implement the body of your user function
        return null;
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
        // Please implement the body of your user function
        return null;
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
        //         Si el teléfono recibido es nulo (no lo ha proporcionado) devuelve TRUE, ya que esta función se usará en precondiciones. 
        // Please implement the body of your user function
        return false;
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
        // Validar que la información en teléfono fijo contenga al menos 10 dígitos y que alguno de los 10 sea diferente. 
        //         Si el teléfono recibido es nulo (no lo ha proporcionado) devuelve TRUE, ya que esta función se usará en precondiciones. 
        // Please implement the body of your user function
        return false;
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
        // Please implement the body of your user function
        return "";
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
        // Please implement the body of your user function
        return null;
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
        // Please implement the body of your user function
        return null;
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
        // Please implement the body of your user function
        return null;
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

        // COMMENTS:
        // Devuelve el valor del parámetro de configuración cuyo código recibe como argumento. 
        // Please implement the body of your user function
        return "";
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
        // Please implement the body of your user function
        return null;
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

        // COMMENTS:
        // Devuelve el substring del texto recibido. Es como la función estándar pero con text. 
        // Please implement the body of your user function
        return "";
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
        // Please implement the body of your user function
        return Double.valueOf(0);
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
        // Please implement the body of your user function
        return null;
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
        // Please implement the body of your user function
        return null;
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
        return null;
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
        // Please implement the body of your user function
        return null;
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

        // COMMENTS:
        // Recupera una plantilla de email a partir de su código y para la solicitud indicada
        // Please implement the body of your user function
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

        // COMMENTS:
        // Devuelve la URL de pago recibida sustituyendo los parámetros por los valores proporcionados.
        //         Según la solicitud sea de nueva afiliación o inclusión la URL tiene más parámetros o menos.  Pero todos ellos se pueden sacar de la solicitud.
        // Please implement the body of your user function
        return "";
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

        // COMMENTS:
        // Invoca a la capacidad "enviarEmailAutoAprobado" del servicio "NotificacionElectronica"
        // Please implement the body of your user function
        return "";
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

        // COMMENTS:
        // Recibe como parámetro un text, que es el texto de una plantilla de email. Le añade un salto de línea y el argumento recibido, que es la URL de pago.
        //         Se utilizará desde el envío de las URLs de pago a los contratantes
        // Please implement the body of your user function
        return "";
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
        // Please implement the body of your user function
        return null;
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

        // COMMENTS:
        // Devuelve el departamento a partir de su código legal
        // Please implement the body of your user function
        return null;
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
        // Please implement the body of your user function
        return null;
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
        // Please implement the body of your user function
        return null;
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
        // El argumento debe contener sólo letras (sin caracteres especiales ni acentos).
        //         Si el argumento recibido es nulo (no lo ha proporcionado) devuelve TRUE, ya que esta función se usará en precondiciones. 
        // Please implement the body of your user function
        return false;
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
        // Please implement the body of your user function
        return "";
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
        // Please implement the body of your user function
        return null;
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

        // COMMENTS:
        // Devuelve el municipio a partir de su código legal
        // Please implement the body of your user function
        return null;
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
        // Please implement the body of your user function
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
        // Obtiene el texto para mostrar en la primera firma de una solicitud
        // Please implement the body of your user function
        return "";
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

        // COMMENTS:
        // Devuelve el  producto a partir de su número
        // Please implement the body of your user function
        return null;
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

        // COMMENTS:
        // Devuelve el  producto a partir de su número
        // Please implement the body of your user function
        return null;
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
        // Please implement the body of your user function
        return null;
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
        // Please implement the body of your user function
        return Long.valueOf(0);
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

        // COMMENTS:
        // GdC10-12: Para obtener los contratos anteriores, invocaremos a la capacidad consultar beneficiario servicio de contratoMP, pasando como parámetros el tipo de identificación y número de identificación.
        //         Las fechas para la comparación son el tag fechaFinVigencia de la sección InformacionBeneficiarios (de la capacidad consultar beneficiario servicio de contratoMP) y nos quedaremos con la mayor de todos aquellos domicnios donde se indica que se debe rellenar el cuestionario médico. Devolvemos null si no tiene contratos anteriores o si para ninguno de ellos su dominio indica que se debe rellenar el cuestionario medico
        // Please implement the body of your user function
        return Date.valueOf(Constants.DATE_DEFAULTVALUE);
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
        // Please implement the body of your user function
        return "";
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
        // Please implement the body of your user function
        return "";
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
    public String fuEnviarEmailDevDocFun(String pfAsunto, String pfCuerpo, String pfDestinatario, String pfEmailConf, String ptObservaciones, String pfNumSolicitud) {
        // Please implement the body of your user function
        return "";
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
        return "";
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
        return null;
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
        return "";
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
        // Please implement the body of your user function
        return null;
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
        return null;
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

        // COMMENTS:
        // Devuelve la prioridad para una solicitud en función del estado y del estado de la documentación, recibidos ambos como argumentos en la funcion.
        //         Deb buscar en la tabla 'PriorizacionSolicitud" el par recibido. Si no se encuentra debe devolver 0 (cero) para que el que la invoca proceda en consecuencia
        // Please implement the body of your user function
        return Long.valueOf(0);
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
        // GdC-39 Requisito 2: Localiza la fecha de inicio en la nueva paramétrica para el tipo de tramite, tipo de contrato y a la fecha recibida
        // Please implement the body of your user function
        return Date.valueOf(Constants.DATE_DEFAULTVALUE);
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
        // Please implement the body of your user function
        return false;
    }

    public java.lang.Boolean fuValidarDominioIncompatiblesFun(FuValidarDominioIncompatiblesRequest request) {
        return fuValidarDominioIncompatiblesFun(request.getPfTipoId(), request.getPfNumId(), request.getPfFechaInicioVigencia(), request.getPfSolicitudInstance());
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

        // COMMENTS:
        // Devuelve un Token para el gestor documental ATOMIC
        // Please implement the body of your user function
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
        // Please implement the body of your user function
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
        // Please implement the body of your user function
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
        // Please implement the body of your user function
        return "";
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
        // Please implement the body of your user function
        return "";
    }
}
