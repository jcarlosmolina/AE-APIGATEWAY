package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.AfiliacionesConstants;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.FuncionarioConstants;
import com.keralty.ae.persistence.oid.AfiliacionesOid;
import com.keralty.ae.persistence.oid.GrupoAsignacionOid;
import com.keralty.ae.persistence.oid.LogFuncionarioOid;
import com.keralty.ae.persistence.oid.ObsEstadoOid;
import com.keralty.ae.persistence.oid.PlanesOid;
import com.keralty.ae.persistence.oid.ReportesProcAlmOid;
import com.keralty.ae.persistence.oid.RolOid;
import com.keralty.ae.persistence.oid.SolicitudNovedadOid;
import com.keralty.ae.persistence.oid.SolicitudOid;
import com.keralty.ae.persistence.oid.SucursalOid;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>Afiliaciones</code> external model class.
 * <p>
 * External Model Class: <code>Afiliaciones</code><br>
 */
public class Afiliaciones extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id")
    private Long funcionarioId;

    @JsonProperty(value="manual")
    private Boolean funcionarioManual;

    @JsonProperty(value="usuario")
    private String funcionarioUsuario;

    @JsonProperty(value="primernombre")
    private String funcionarioPrimerNombre;

    @JsonProperty(value="segundonombre")
    private String funcionarioSegundoNombre;

    @JsonProperty(value="primerapellido")
    private String funcionarioPrimerApellido;

    @JsonProperty(value="segundoapellido")
    private String funcionarioSegundoApellido;

    @JsonProperty(value="drvnombrecompleto")
    private String funcionariodrvNombreCompleto;

    @JsonProperty(value="usuarioldap")
    private String funcionarioUsuarioLDAP;

    @JsonProperty(value="email")
    private String funcionarioEmail;

    @JsonProperty(value="codjefe")
    private String funcionarioCodJefe;

    @JsonProperty(value="drvnomjefe")
    private String funcionariodrvNomJefe;

    @JsonProperty(value="drvnomagencia")
    private String funcionariodrvNomAgencia;

    @JsonProperty(value="disponible")
    private Boolean funcionarioDisponible;

    @JsonProperty(value="numsolnoterminadas")
    private Long funcionarioNumSolNoTerminadas;

    @JsonProperty(value="drvesasesorintegral")
    private Boolean funcionariodrvEsAsesorIntegral;

    @JsonProperty(value="drvesafiliacion")
    private Boolean funcionariodrvEsAfiliacion;

    @JsonProperty(value="idsesion")
    private String funcionarioIdSesion;

    @JsonProperty(value="moddbasicospersona")
    private Boolean asesorModDBasicosPersona;

    @JsonProperty(value="modificadirector")
    private Boolean asesormodificaDirector;

    @JsonProperty(value="esdirector")
    private Boolean asesoresDirector;

    @JsonProperty(value="numidentificacion")
    private String asesorNumIdentificacion;

    @JsonProperty(value="esintegral")
    private Boolean asesorEsIntegral;

    @JsonProperty(value="verdbasicospersona")
    private Boolean asesorVerDBasicosPersona;

    @JsonProperty(value="verdocidentificacionpersona")
    private Boolean asesorVerDocIdentificacionPersona;

    @JsonProperty(value="vercontratonovedad")
    private Boolean asesorVerContratoNovedad;

    @JsonProperty(value="canalcomercial")
    private String asesorCanalComercial;

    @JsonProperty(value="cargo")
    private String asesorCargo;

    @JsonProperty(value="estado")
    private String asesorEstado;

    @JsonProperty(value="accesovalidadorusuarios")
    private Boolean asesorAccesoValidadorUsuarios;

    @JsonProperty(value="password")
    private String passWord;

    private Collection <Solicitud> solicitudes;

    private Collection <Solicitud> solicitudesAfiliacion;

    private Collection <ObsEstado> obsEstado;

    private Collection <ReportesProcAlm> reportes;

    private Collection <SolicitudNovedad> solicitudesNovedad;

    private Collection <SolicitudNovedad> solNovAifliaciones;

    private Collection <GrupoAsignacion> grupoAsignacion;

    private Collection <LogFuncionario> logFuncionario;

    private Collection <ContratoC> contratosC;

    private Collection <AgentexProducto> agentexProducto;

    private Collection <LogInformacionAsesor> logInformacionAsesor;

    private Collection <LogHistoricoPlanes> logHistoricoPlanes;

    private Collection <Solicitud> solicitudesArMe;

    private Firma firma;

    private Collection <Planes> planes;

    private Rol rol;

    private Sucursal sucursal;

    private TipoIdentificacion tipoIdentificacion;

    private Regional regional;

    /**
     * Gets the value of attribute Id
     */
    public Long getFuncionarioId() {
        return funcionarioId;
    }
    
    /**
     * Sets the value of attribute Id
     */
    public void setFuncionarioId(Long funcionarioId) {
        this.funcionarioId = funcionarioId;
    }

    /**
     * Gets the value of attribute Manual
     */
    public Boolean getFuncionarioManual() {
        return funcionarioManual;
    }
    
    /**
     * Sets the value of attribute Manual
     */
    public void setFuncionarioManual(Boolean funcionarioManual) {
        this.funcionarioManual = funcionarioManual;
    }

    /**
     * Gets the value of attribute Usuario
     */
    public String getFuncionarioUsuario() {
        return funcionarioUsuario;
    }
    
    /**
     * Sets the value of attribute Usuario
     */
    public void setFuncionarioUsuario(String funcionarioUsuario) {
        this.funcionarioUsuario = funcionarioUsuario;
    }

    /**
     * Gets the value of attribute PrimerNombre
     */
    public String getFuncionarioPrimerNombre() {
        return funcionarioPrimerNombre;
    }
    
    /**
     * Sets the value of attribute PrimerNombre
     */
    public void setFuncionarioPrimerNombre(String funcionarioPrimerNombre) {
        this.funcionarioPrimerNombre = funcionarioPrimerNombre;
    }

    /**
     * Gets the value of attribute SegundoNombre
     */
    public String getFuncionarioSegundoNombre() {
        return funcionarioSegundoNombre;
    }
    
    /**
     * Sets the value of attribute SegundoNombre
     */
    public void setFuncionarioSegundoNombre(String funcionarioSegundoNombre) {
        this.funcionarioSegundoNombre = funcionarioSegundoNombre;
    }

    /**
     * Gets the value of attribute PrimerApellido
     */
    public String getFuncionarioPrimerApellido() {
        return funcionarioPrimerApellido;
    }
    
    /**
     * Sets the value of attribute PrimerApellido
     */
    public void setFuncionarioPrimerApellido(String funcionarioPrimerApellido) {
        this.funcionarioPrimerApellido = funcionarioPrimerApellido;
    }

    /**
     * Gets the value of attribute SegundoApellido
     */
    public String getFuncionarioSegundoApellido() {
        return funcionarioSegundoApellido;
    }
    
    /**
     * Sets the value of attribute SegundoApellido
     */
    public void setFuncionarioSegundoApellido(String funcionarioSegundoApellido) {
        this.funcionarioSegundoApellido = funcionarioSegundoApellido;
    }

    /**
     * Gets the value of attribute drvNombreCompleto
     */
    public String getFuncionariodrvNombreCompleto() {
        return funcionariodrvNombreCompleto;
    }
    
    /**
     * Sets the value of attribute drvNombreCompleto
     */
    public void setFuncionariodrvNombreCompleto(String funcionariodrvNombreCompleto) {
        this.funcionariodrvNombreCompleto = funcionariodrvNombreCompleto;
    }

    /**
     * Gets the value of attribute UsuarioLDAP
     */
    public String getFuncionarioUsuarioLDAP() {
        return funcionarioUsuarioLDAP;
    }
    
    /**
     * Sets the value of attribute UsuarioLDAP
     */
    public void setFuncionarioUsuarioLDAP(String funcionarioUsuarioLDAP) {
        this.funcionarioUsuarioLDAP = funcionarioUsuarioLDAP;
    }

    /**
     * Gets the value of attribute Email
     */
    public String getFuncionarioEmail() {
        return funcionarioEmail;
    }
    
    /**
     * Sets the value of attribute Email
     */
    public void setFuncionarioEmail(String funcionarioEmail) {
        this.funcionarioEmail = funcionarioEmail;
    }

    /**
     * Gets the value of attribute CodJefe
     */
    public String getFuncionarioCodJefe() {
        return funcionarioCodJefe;
    }
    
    /**
     * Sets the value of attribute CodJefe
     */
    public void setFuncionarioCodJefe(String funcionarioCodJefe) {
        this.funcionarioCodJefe = funcionarioCodJefe;
    }

    /**
     * Gets the value of attribute drvNomJefe
     */
    public String getFuncionariodrvNomJefe() {
        return funcionariodrvNomJefe;
    }
    
    /**
     * Sets the value of attribute drvNomJefe
     */
    public void setFuncionariodrvNomJefe(String funcionariodrvNomJefe) {
        this.funcionariodrvNomJefe = funcionariodrvNomJefe;
    }

    /**
     * Gets the value of attribute drvNomAgencia
     */
    public String getFuncionariodrvNomAgencia() {
        return funcionariodrvNomAgencia;
    }
    
    /**
     * Sets the value of attribute drvNomAgencia
     */
    public void setFuncionariodrvNomAgencia(String funcionariodrvNomAgencia) {
        this.funcionariodrvNomAgencia = funcionariodrvNomAgencia;
    }

    /**
     * Gets the value of attribute Disponible
     */
    public Boolean getFuncionarioDisponible() {
        return funcionarioDisponible;
    }
    
    /**
     * Sets the value of attribute Disponible
     */
    public void setFuncionarioDisponible(Boolean funcionarioDisponible) {
        this.funcionarioDisponible = funcionarioDisponible;
    }

    /**
     * Gets the value of attribute NumSolNoTerminadas
     */
    public Long getFuncionarioNumSolNoTerminadas() {
        return funcionarioNumSolNoTerminadas;
    }
    
    /**
     * Sets the value of attribute NumSolNoTerminadas
     */
    public void setFuncionarioNumSolNoTerminadas(Long funcionarioNumSolNoTerminadas) {
        this.funcionarioNumSolNoTerminadas = funcionarioNumSolNoTerminadas;
    }

    /**
     * Gets the value of attribute drvEsAsesorIntegral
     */
    public Boolean getFuncionariodrvEsAsesorIntegral() {
        return funcionariodrvEsAsesorIntegral;
    }
    
    /**
     * Sets the value of attribute drvEsAsesorIntegral
     */
    public void setFuncionariodrvEsAsesorIntegral(Boolean funcionariodrvEsAsesorIntegral) {
        this.funcionariodrvEsAsesorIntegral = funcionariodrvEsAsesorIntegral;
    }

    /**
     * Gets the value of attribute drvEsAfiliacion
     */
    public Boolean getFuncionariodrvEsAfiliacion() {
        return funcionariodrvEsAfiliacion;
    }
    
    /**
     * Sets the value of attribute drvEsAfiliacion
     */
    public void setFuncionariodrvEsAfiliacion(Boolean funcionariodrvEsAfiliacion) {
        this.funcionariodrvEsAfiliacion = funcionariodrvEsAfiliacion;
    }

    /**
     * Gets the value of attribute IdSesion
     */
    public String getFuncionarioIdSesion() {
        return funcionarioIdSesion;
    }
    
    /**
     * Sets the value of attribute IdSesion
     */
    public void setFuncionarioIdSesion(String funcionarioIdSesion) {
        this.funcionarioIdSesion = funcionarioIdSesion;
    }

    /**
     * Gets the value of attribute ModDBasicosPersona
     */
    public Boolean getAsesorModDBasicosPersona() {
        return asesorModDBasicosPersona;
    }
    
    /**
     * Sets the value of attribute ModDBasicosPersona
     */
    public void setAsesorModDBasicosPersona(Boolean asesorModDBasicosPersona) {
        this.asesorModDBasicosPersona = asesorModDBasicosPersona;
    }

    /**
     * Gets the value of attribute modificaDirector
     */
    public Boolean getAsesormodificaDirector() {
        return asesormodificaDirector;
    }
    
    /**
     * Sets the value of attribute modificaDirector
     */
    public void setAsesormodificaDirector(Boolean asesormodificaDirector) {
        this.asesormodificaDirector = asesormodificaDirector;
    }

    /**
     * Gets the value of attribute esDirector
     */
    public Boolean getAsesoresDirector() {
        return asesoresDirector;
    }
    
    /**
     * Sets the value of attribute esDirector
     */
    public void setAsesoresDirector(Boolean asesoresDirector) {
        this.asesoresDirector = asesoresDirector;
    }

    /**
     * Gets the value of attribute NumIdentificacion
     */
    public String getAsesorNumIdentificacion() {
        return asesorNumIdentificacion;
    }
    
    /**
     * Sets the value of attribute NumIdentificacion
     */
    public void setAsesorNumIdentificacion(String asesorNumIdentificacion) {
        this.asesorNumIdentificacion = asesorNumIdentificacion;
    }

    /**
     * Gets the value of attribute EsIntegral
     */
    public Boolean getAsesorEsIntegral() {
        return asesorEsIntegral;
    }
    
    /**
     * Sets the value of attribute EsIntegral
     */
    public void setAsesorEsIntegral(Boolean asesorEsIntegral) {
        this.asesorEsIntegral = asesorEsIntegral;
    }

    /**
     * Gets the value of attribute VerDBasicosPersona
     */
    public Boolean getAsesorVerDBasicosPersona() {
        return asesorVerDBasicosPersona;
    }
    
    /**
     * Sets the value of attribute VerDBasicosPersona
     */
    public void setAsesorVerDBasicosPersona(Boolean asesorVerDBasicosPersona) {
        this.asesorVerDBasicosPersona = asesorVerDBasicosPersona;
    }

    /**
     * Gets the value of attribute VerDocIdentificacionPersona
     */
    public Boolean getAsesorVerDocIdentificacionPersona() {
        return asesorVerDocIdentificacionPersona;
    }
    
    /**
     * Sets the value of attribute VerDocIdentificacionPersona
     */
    public void setAsesorVerDocIdentificacionPersona(Boolean asesorVerDocIdentificacionPersona) {
        this.asesorVerDocIdentificacionPersona = asesorVerDocIdentificacionPersona;
    }

    /**
     * Gets the value of attribute VerContratoNovedad
     */
    public Boolean getAsesorVerContratoNovedad() {
        return asesorVerContratoNovedad;
    }
    
    /**
     * Sets the value of attribute VerContratoNovedad
     */
    public void setAsesorVerContratoNovedad(Boolean asesorVerContratoNovedad) {
        this.asesorVerContratoNovedad = asesorVerContratoNovedad;
    }

    /**
     * Gets the value of attribute CanalComercial
     */
    public String getAsesorCanalComercial() {
        return asesorCanalComercial;
    }
    
    /**
     * Sets the value of attribute CanalComercial
     */
    public void setAsesorCanalComercial(String asesorCanalComercial) {
        this.asesorCanalComercial = asesorCanalComercial;
    }

    /**
     * Gets the value of attribute Cargo
     */
    public String getAsesorCargo() {
        return asesorCargo;
    }
    
    /**
     * Sets the value of attribute Cargo
     */
    public void setAsesorCargo(String asesorCargo) {
        this.asesorCargo = asesorCargo;
    }

    /**
     * Gets the value of attribute Estado
     */
    public String getAsesorEstado() {
        return asesorEstado;
    }
    
    /**
     * Sets the value of attribute Estado
     */
    public void setAsesorEstado(String asesorEstado) {
        this.asesorEstado = asesorEstado;
    }

    /**
     * Gets the value of attribute AccesoValidadorUsuarios
     */
    public Boolean getAsesorAccesoValidadorUsuarios() {
        return asesorAccesoValidadorUsuarios;
    }
    
    /**
     * Sets the value of attribute AccesoValidadorUsuarios
     */
    public void setAsesorAccesoValidadorUsuarios(Boolean asesorAccesoValidadorUsuarios) {
        this.asesorAccesoValidadorUsuarios = asesorAccesoValidadorUsuarios;
    }

    /**
     * Gets the value of attribute Password
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * Sets the value of attribute Password
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * Gets the value of relation through role Solicitudes
     */
    @JsonIgnore
    public Collection <Solicitud> getSolicitudes() {
        return solicitudes;
    }

    /**
     * Gets the value of relation through role SolicitudesAfiliacion
     */
    @JsonIgnore
    public Collection <Solicitud> getSolicitudesAfiliacion() {
        return solicitudesAfiliacion;
    }

    /**
     * Gets the value of relation through role ObsEstado
     */
    @JsonIgnore
    public Collection <ObsEstado> getObsEstado() {
        return obsEstado;
    }

    /**
     * Gets the value of relation through role Reportes
     */
    @JsonIgnore
    public Collection <ReportesProcAlm> getReportes() {
        return reportes;
    }

    /**
     * Gets the value of relation through role SolicitudesNovedad
     */
    @JsonIgnore
    public Collection <SolicitudNovedad> getSolicitudesNovedad() {
        return solicitudesNovedad;
    }

    /**
     * Gets the value of relation through role SolNovAifliaciones
     */
    @JsonIgnore
    public Collection <SolicitudNovedad> getSolNovAifliaciones() {
        return solNovAifliaciones;
    }

    /**
     * Gets the value of relation through role GrupoAsignacion
     */
    @JsonIgnore
    public Collection <GrupoAsignacion> getGrupoAsignacion() {
        return grupoAsignacion;
    }

    /**
     * Gets the value of relation through role LogFuncionario
     */
    @JsonIgnore
    public Collection <LogFuncionario> getLogFuncionario() {
        return logFuncionario;
    }

    /**
     * Gets the value of relation through role ContratosC
     */
    @JsonIgnore
    public Collection <ContratoC> getContratosC() {
        return contratosC;
    }

    /**
     * Gets the value of relation through role AgentexProducto
     */
    @JsonIgnore
    public Collection <AgentexProducto> getAgentexProducto() {
        return agentexProducto;
    }

    /**
     * Gets the value of relation through role LogInformacionAsesor
     */
    @JsonIgnore
    public Collection <LogInformacionAsesor> getLogInformacionAsesor() {
        return logInformacionAsesor;
    }

    /**
     * Gets the value of relation through role LogHistoricoPlanes
     */
    @JsonIgnore
    public Collection <LogHistoricoPlanes> getLogHistoricoPlanes() {
        return logHistoricoPlanes;
    }

    /**
     * Gets the value of relation through role SolicitudesArMe
     */
    @JsonIgnore
    public Collection <Solicitud> getSolicitudesArMe() {
        return solicitudesArMe;
    }

    /**
     * Gets the value of relation through role Firma
     */
    @JsonIgnore
    public Firma getFirma() {
        return firma;
    }

    /**
     * Gets the value of relation through role Planes
     */
    @JsonIgnore
    public Collection <Planes> getPlanes() {
        return planes;
    }

    /**
     * Gets the value of relation through role Rol
     */
    @JsonIgnore
    public Rol getRol() {
        return rol;
    }

    /**
     * Gets the value of relation through role Sucursal
     */
    @JsonIgnore
    public Sucursal getSucursal() {
        return sucursal;
    }

    /**
     * Gets the value of relation through role TipoIdentificacion
     */
    @JsonIgnore
    public TipoIdentificacion getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    /**
     * Gets the value of relation through role Regional
     */
    @JsonIgnore
    public Regional getRegional() {
        return regional;
    }

    /**
     * Default constructor
     */
    public Afiliaciones() {
        funcionarioId = null;
    }

    /**
     * Constructor used to create instances of <code>Afiliaciones</code>.
     * @param oid Object Identifier of the instance of <code>Afiliaciones</code> to be created.
     * @throws SystemException
     */
    public Afiliaciones(AfiliacionesOid oid) {
        if (oid != null && !oid.isNull()) {
            funcionarioId = oid.getFuncionarioId();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return Afiliaciones.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        return true;
    }

    @Override
    @JsonIgnore
    public int hashCode() {
        return 0;
    }

    @Override
    @JsonIgnore
    public boolean isNull() {
        return false;
    }

    /**
     * Returns the <code>AfiliacionesOid</code> object that identifies this instance of <code>Afiliaciones</code>.
     * @return <code>AfiliacionesOid</code> object that identifies this instance of <code>Afiliaciones</code>
     */
	@Override
    public AfiliacionesOid getOid() {
        return new AfiliacionesOid(getFuncionarioId());
    }

    @Override
    public boolean checkHorizontalVisibility(IEntity agent) {
        if (agent == null) {
            throw new IllegalArgumentException("agent cannot be null");
        }
        return true;
    }

    @Override
    public void checkIntegrityConstraints() throws ModelException, SystemException {
    }

    @JsonIgnore
    @Override
    public Map<String, Object> getValues() {
        return null;
    }

    @Override
    public void cleanDerivations() throws SystemException {

    }

    /**
     * Gets the list of active facets.
     * @return the list of active facets.
     */
    @JsonIgnore
	@Override
    public List<String> getActiveFacets() {
        return this.getFacets();
    }

    /**
     * Gets the list of active facets recursively from the root of the inheritance net.
     * @return the list of active facets.
     */
    @JsonIgnore
    public List<String> getFacets() {
        List<String> activeFacets = new ArrayList<>();

        // Add this class
        if (!activeFacets.contains(Constants.AFILIACIONES)) {
            activeFacets.add(Constants.AFILIACIONES);
        }

        return activeFacets;
    }

    @Override
    public void clearModifiedFlags() throws SystemException {

    }

    public static AbstractAppEntity buildRelatedInstance(String relatedInstanceJsonOid, String relatedInstancePath) {
        AbstractAppEntity relatedInstance = null;
        if (relatedInstanceJsonOid != null && relatedInstancePath != null) {
            List<String> relatedInstancePathItems = new ArrayList<>(Arrays.asList(relatedInstancePath.split("\\.")));
            String pathItem = relatedInstancePathItems.remove(0);
            String remainingPath = String.join(".", relatedInstancePathItems);
            relatedInstance = buildRelatedInstance(relatedInstanceJsonOid, pathItem, remainingPath);
        }
        return relatedInstance;
    }

    private static AbstractAppEntity buildRelatedInstance(String relatedInstanceJsonOid, String relatedInstancePathFirstItem, String remainingPath) {
        AbstractAppEntity relatedInstance = null;
        if (relatedInstancePathFirstItem.isEmpty() && remainingPath.isEmpty()) {
            relatedInstance = buildAfiliacionesRelatedInstance(relatedInstanceJsonOid);
        }
        if (FuncionarioConstants.ROLE_NAME_SOLICITUDES.equalsIgnoreCase(relatedInstancePathFirstItem) || FuncionarioConstants.ROLE_NAME_SOLICITUDESAFILIACION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAfiliacionesRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        if (FuncionarioConstants.ROLE_NAME_OBSESTADO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAfiliacionesRelatedInstance4ObsEstado(relatedInstanceJsonOid, remainingPath);
        }
        if (FuncionarioConstants.ROLE_NAME_REPORTES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAfiliacionesRelatedInstance4ReportesProcAlm(relatedInstanceJsonOid, remainingPath);
        }
        if (FuncionarioConstants.ROLE_NAME_SOLICITUDESNOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem) || FuncionarioConstants.ROLE_NAME_SOLNOVAIFLIACIONES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAfiliacionesRelatedInstance4SolicitudNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (FuncionarioConstants.ROLE_NAME_GRUPOASIGNACION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAfiliacionesRelatedInstance4GrupoAsignacion(relatedInstanceJsonOid, remainingPath);
        }
        if (FuncionarioConstants.ROLE_NAME_LOGFUNCIONARIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAfiliacionesRelatedInstance4LogFuncionario(relatedInstanceJsonOid, remainingPath);
        }
        if (AfiliacionesConstants.ROLE_NAME_PLANES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAfiliacionesRelatedInstance4Planes(relatedInstanceJsonOid, remainingPath);
        }
        if (FuncionarioConstants.ROLE_NAME_ROL.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAfiliacionesRelatedInstance4Rol(relatedInstanceJsonOid, remainingPath);
        }
        if (FuncionarioConstants.ROLE_NAME_SUCURSAL.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAfiliacionesRelatedInstance4Sucursal(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildAfiliacionesRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Afiliaciones(mapper.readValue(relatedInstanceJsonOid, AfiliacionesOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Afiliaciones.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildAfiliacionesRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Afiliaciones.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildAfiliacionesRelatedInstance4ObsEstado(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ObsEstado(mapper.readValue(relatedInstanceJsonOid, ObsEstadoOid.class)): ObsEstado.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Afiliaciones.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildAfiliacionesRelatedInstance4ReportesProcAlm(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ReportesProcAlm(mapper.readValue(relatedInstanceJsonOid, ReportesProcAlmOid.class)): ReportesProcAlm.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Afiliaciones.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildAfiliacionesRelatedInstance4SolicitudNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new SolicitudNovedad(mapper.readValue(relatedInstanceJsonOid, SolicitudNovedadOid.class)): SolicitudNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Afiliaciones.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildAfiliacionesRelatedInstance4GrupoAsignacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new GrupoAsignacion(mapper.readValue(relatedInstanceJsonOid, GrupoAsignacionOid.class)): GrupoAsignacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Afiliaciones.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildAfiliacionesRelatedInstance4LogFuncionario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new LogFuncionario(mapper.readValue(relatedInstanceJsonOid, LogFuncionarioOid.class)): LogFuncionario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Afiliaciones.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildAfiliacionesRelatedInstance4Planes(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Planes(mapper.readValue(relatedInstanceJsonOid, PlanesOid.class)): Planes.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Afiliaciones.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildAfiliacionesRelatedInstance4Rol(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Rol(mapper.readValue(relatedInstanceJsonOid, RolOid.class)): Rol.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Afiliaciones.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildAfiliacionesRelatedInstance4Sucursal(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Sucursal(mapper.readValue(relatedInstanceJsonOid, SucursalOid.class)): Sucursal.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Afiliaciones.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
