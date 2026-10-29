package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.PersonaConstants;
import com.keralty.ae.persistence.oid.DepartamentoOid;
import com.keralty.ae.persistence.oid.DireccionOid;
import com.keralty.ae.persistence.oid.DocumentoGOid;
import com.keralty.ae.persistence.oid.EstadoCivilOid;
import com.keralty.ae.persistence.oid.EstadoPersonaOid;
import com.keralty.ae.persistence.oid.MunicipioOid;
import com.keralty.ae.persistence.oid.PersonaOid;
import com.keralty.ae.persistence.oid.SolicitudOid;
import com.keralty.ae.persistence.oid.TipoIdentificacionOid;
import com.keralty.ae.persistence.oid.UsuarioOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>Persona</code> external model class.
 * <p>
 * External Model Class: <code>Persona</code><br>
 */
public class Persona extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="identificador")
    private Long personaIdentificador;

    @JsonProperty(value="codigo")
    private Long personaCodigo;

    @JsonProperty(value="numidentificacion")
    private String personaNumIdentificacion;

    @JsonProperty(value="tipopersona")
    private String personaTipoPersona;

    @JsonProperty(value="primernombre")
    private String personaPrimerNombre;

    @JsonProperty(value="segundonombre")
    private String personaSegundoNombre;

    @JsonProperty(value="primerapellido")
    private String personaPrimerApellido;

    @JsonProperty(value="segundoapellido")
    private String personaSegundoApellido;

    @JsonProperty(value="razonsocial")
    private String personaRazonSocial;

    @JsonProperty(value="drvnombrecompleto")
    private String personadrvNombreCompleto;

    @JsonProperty(value="fechanacimiento")
    private Date personaFechaNacimiento;

    @JsonProperty(value="genero")
    private String personaGenero;

    @JsonProperty(value="indicadorextranjero")
    private Boolean personaIndicadorExtranjero;

    @JsonProperty(value="telefonofijo")
    private String personaTelefonoFijo;

    @JsonProperty(value="telefonocelular")
    private String personaTelefonoCelular;

    @JsonProperty(value="correoelectronico")
    private String personaCorreoElectronico;

    @JsonProperty(value="tieneepssanitas")
    private Boolean personaTieneEPSSanitas;

    @JsonProperty(value="rechazadoafiliacion")
    private String personaRechazadoAfiliacion;

    @JsonProperty(value="datosbasicosmod")
    private Boolean personaDatosBasicosMod;

    @JsonProperty(value="drvrechazada")
    private Boolean personadrvRechazada;

    @JsonProperty(value="drvtienedirecciones")
    private Boolean personadrvTieneDirecciones;

    @JsonProperty(value="drvtiponumdoc")
    private String personadrvTipoNumDoc;

    @JsonProperty(value="drvvienedecore")
    private Boolean personadrvVieneDeCORE;

    @JsonProperty(value="drvadddoccomocont")
    private Boolean personadrvAddDocComoCont;

    @JsonProperty(value="drvadddoccomotitu")
    private Boolean personadrvAddDocComoTitu;

    private Collection <Solicitud> solicitudesContratante;

    private Collection <Solicitud> solicitudesTitular;

    private Collection <Direccion> direcciones;

    private Usuario usuarios;

    private Collection <DocumentoG> documentosG;

    private TipoIdentificacion tipoIdentificacion;

    private Departamento departamentoNacimiento;

    private Municipio municipioNacimiento;

    private EstadoCivil estadoCivil;

    private EstadoPersona estadoPersona;

    /**
     * Gets the value of attribute Identificador
     */
    public Long getPersonaIdentificador() {
        return personaIdentificador;
    }
    
    /**
     * Sets the value of attribute Identificador
     */
    public void setPersonaIdentificador(Long personaIdentificador) {
        this.personaIdentificador = personaIdentificador;
    }

    /**
     * Gets the value of attribute Codigo
     */
    public Long getPersonaCodigo() {
        return personaCodigo;
    }
    
    /**
     * Sets the value of attribute Codigo
     */
    public void setPersonaCodigo(Long personaCodigo) {
        this.personaCodigo = personaCodigo;
    }

    /**
     * Gets the value of attribute NumIdentificacion
     */
    public String getPersonaNumIdentificacion() {
        return personaNumIdentificacion;
    }
    
    /**
     * Sets the value of attribute NumIdentificacion
     */
    public void setPersonaNumIdentificacion(String personaNumIdentificacion) {
        this.personaNumIdentificacion = personaNumIdentificacion;
    }

    /**
     * Gets the value of attribute TipoPersona
     */
    public String getPersonaTipoPersona() {
        return personaTipoPersona;
    }
    
    /**
     * Sets the value of attribute TipoPersona
     */
    public void setPersonaTipoPersona(String personaTipoPersona) {
        this.personaTipoPersona = personaTipoPersona;
    }

    /**
     * Gets the value of attribute PrimerNombre
     */
    public String getPersonaPrimerNombre() {
        return personaPrimerNombre;
    }
    
    /**
     * Sets the value of attribute PrimerNombre
     */
    public void setPersonaPrimerNombre(String personaPrimerNombre) {
        this.personaPrimerNombre = personaPrimerNombre;
    }

    /**
     * Gets the value of attribute SegundoNombre
     */
    public String getPersonaSegundoNombre() {
        return personaSegundoNombre;
    }
    
    /**
     * Sets the value of attribute SegundoNombre
     */
    public void setPersonaSegundoNombre(String personaSegundoNombre) {
        this.personaSegundoNombre = personaSegundoNombre;
    }

    /**
     * Gets the value of attribute PrimerApellido
     */
    public String getPersonaPrimerApellido() {
        return personaPrimerApellido;
    }
    
    /**
     * Sets the value of attribute PrimerApellido
     */
    public void setPersonaPrimerApellido(String personaPrimerApellido) {
        this.personaPrimerApellido = personaPrimerApellido;
    }

    /**
     * Gets the value of attribute SegundoApellido
     */
    public String getPersonaSegundoApellido() {
        return personaSegundoApellido;
    }
    
    /**
     * Sets the value of attribute SegundoApellido
     */
    public void setPersonaSegundoApellido(String personaSegundoApellido) {
        this.personaSegundoApellido = personaSegundoApellido;
    }

    /**
     * Gets the value of attribute RazonSocial
     */
    public String getPersonaRazonSocial() {
        return personaRazonSocial;
    }
    
    /**
     * Sets the value of attribute RazonSocial
     */
    public void setPersonaRazonSocial(String personaRazonSocial) {
        this.personaRazonSocial = personaRazonSocial;
    }

    /**
     * Gets the value of attribute drvNombreCompleto
     */
    public String getPersonadrvNombreCompleto() {
        return personadrvNombreCompleto;
    }
    
    /**
     * Sets the value of attribute drvNombreCompleto
     */
    public void setPersonadrvNombreCompleto(String personadrvNombreCompleto) {
        this.personadrvNombreCompleto = personadrvNombreCompleto;
    }

    /**
     * Gets the value of attribute FechaNacimiento
     */
    public Date getPersonaFechaNacimiento() {
        return personaFechaNacimiento;
    }
    
    /**
     * Sets the value of attribute FechaNacimiento
     */
    public void setPersonaFechaNacimiento(Date personaFechaNacimiento) {
        this.personaFechaNacimiento = personaFechaNacimiento;
    }

    /**
     * Gets the value of attribute Genero
     */
    public String getPersonaGenero() {
        return personaGenero;
    }
    
    /**
     * Sets the value of attribute Genero
     */
    public void setPersonaGenero(String personaGenero) {
        this.personaGenero = personaGenero;
    }

    /**
     * Gets the value of attribute IndicadorExtranjero
     */
    public Boolean getPersonaIndicadorExtranjero() {
        return personaIndicadorExtranjero;
    }
    
    /**
     * Sets the value of attribute IndicadorExtranjero
     */
    public void setPersonaIndicadorExtranjero(Boolean personaIndicadorExtranjero) {
        this.personaIndicadorExtranjero = personaIndicadorExtranjero;
    }

    /**
     * Gets the value of attribute TelefonoFijo
     */
    public String getPersonaTelefonoFijo() {
        return personaTelefonoFijo;
    }
    
    /**
     * Sets the value of attribute TelefonoFijo
     */
    public void setPersonaTelefonoFijo(String personaTelefonoFijo) {
        this.personaTelefonoFijo = personaTelefonoFijo;
    }

    /**
     * Gets the value of attribute TelefonoCelular
     */
    public String getPersonaTelefonoCelular() {
        return personaTelefonoCelular;
    }
    
    /**
     * Sets the value of attribute TelefonoCelular
     */
    public void setPersonaTelefonoCelular(String personaTelefonoCelular) {
        this.personaTelefonoCelular = personaTelefonoCelular;
    }

    /**
     * Gets the value of attribute CorreoElectronico
     */
    public String getPersonaCorreoElectronico() {
        return personaCorreoElectronico;
    }
    
    /**
     * Sets the value of attribute CorreoElectronico
     */
    public void setPersonaCorreoElectronico(String personaCorreoElectronico) {
        this.personaCorreoElectronico = personaCorreoElectronico;
    }

    /**
     * Gets the value of attribute TieneEPSSanitas
     */
    public Boolean getPersonaTieneEPSSanitas() {
        return personaTieneEPSSanitas;
    }
    
    /**
     * Sets the value of attribute TieneEPSSanitas
     */
    public void setPersonaTieneEPSSanitas(Boolean personaTieneEPSSanitas) {
        this.personaTieneEPSSanitas = personaTieneEPSSanitas;
    }

    /**
     * Gets the value of attribute RechazadoAfiliacion
     */
    public String getPersonaRechazadoAfiliacion() {
        return personaRechazadoAfiliacion;
    }
    
    /**
     * Sets the value of attribute RechazadoAfiliacion
     */
    public void setPersonaRechazadoAfiliacion(String personaRechazadoAfiliacion) {
        this.personaRechazadoAfiliacion = personaRechazadoAfiliacion;
    }

    /**
     * Gets the value of attribute DatosBasicosMod
     */
    public Boolean getPersonaDatosBasicosMod() {
        return personaDatosBasicosMod;
    }
    
    /**
     * Sets the value of attribute DatosBasicosMod
     */
    public void setPersonaDatosBasicosMod(Boolean personaDatosBasicosMod) {
        this.personaDatosBasicosMod = personaDatosBasicosMod;
    }

    /**
     * Gets the value of attribute drvRechazada
     */
    public Boolean getPersonadrvRechazada() {
        return personadrvRechazada;
    }
    
    /**
     * Sets the value of attribute drvRechazada
     */
    public void setPersonadrvRechazada(Boolean personadrvRechazada) {
        this.personadrvRechazada = personadrvRechazada;
    }

    /**
     * Gets the value of attribute drvTieneDirecciones
     */
    public Boolean getPersonadrvTieneDirecciones() {
        return personadrvTieneDirecciones;
    }
    
    /**
     * Sets the value of attribute drvTieneDirecciones
     */
    public void setPersonadrvTieneDirecciones(Boolean personadrvTieneDirecciones) {
        this.personadrvTieneDirecciones = personadrvTieneDirecciones;
    }

    /**
     * Gets the value of attribute drvTipoNumDoc
     */
    public String getPersonadrvTipoNumDoc() {
        return personadrvTipoNumDoc;
    }
    
    /**
     * Sets the value of attribute drvTipoNumDoc
     */
    public void setPersonadrvTipoNumDoc(String personadrvTipoNumDoc) {
        this.personadrvTipoNumDoc = personadrvTipoNumDoc;
    }

    /**
     * Gets the value of attribute drvVieneDeCORE
     */
    public Boolean getPersonadrvVieneDeCORE() {
        return personadrvVieneDeCORE;
    }
    
    /**
     * Sets the value of attribute drvVieneDeCORE
     */
    public void setPersonadrvVieneDeCORE(Boolean personadrvVieneDeCORE) {
        this.personadrvVieneDeCORE = personadrvVieneDeCORE;
    }

    /**
     * Gets the value of attribute drvAddDocComoCont
     */
    public Boolean getPersonadrvAddDocComoCont() {
        return personadrvAddDocComoCont;
    }
    
    /**
     * Sets the value of attribute drvAddDocComoCont
     */
    public void setPersonadrvAddDocComoCont(Boolean personadrvAddDocComoCont) {
        this.personadrvAddDocComoCont = personadrvAddDocComoCont;
    }

    /**
     * Gets the value of attribute drvAddDocComoTitu
     */
    public Boolean getPersonadrvAddDocComoTitu() {
        return personadrvAddDocComoTitu;
    }
    
    /**
     * Sets the value of attribute drvAddDocComoTitu
     */
    public void setPersonadrvAddDocComoTitu(Boolean personadrvAddDocComoTitu) {
        this.personadrvAddDocComoTitu = personadrvAddDocComoTitu;
    }

    /**
     * Gets the value of relation through role SolicitudesContratante
     */
    @JsonIgnore
    public Collection <Solicitud> getSolicitudesContratante() {
        return solicitudesContratante;
    }

    /**
     * Gets the value of relation through role SolicitudesTitular
     */
    @JsonIgnore
    public Collection <Solicitud> getSolicitudesTitular() {
        return solicitudesTitular;
    }

    /**
     * Gets the value of relation through role Direcciones
     */
    @JsonIgnore
    public Collection <Direccion> getDirecciones() {
        return direcciones;
    }

    /**
     * Gets the value of relation through role Usuarios
     */
    @JsonIgnore
    public Usuario getUsuarios() {
        return usuarios;
    }

    /**
     * Gets the value of relation through role DocumentosG
     */
    @JsonIgnore
    public Collection <DocumentoG> getDocumentosG() {
        return documentosG;
    }

    /**
     * Gets the value of relation through role TipoIdentificacion
     */
    @JsonIgnore
    public TipoIdentificacion getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    /**
     * Gets the value of relation through role DepartamentoNacimiento
     */
    @JsonIgnore
    public Departamento getDepartamentoNacimiento() {
        return departamentoNacimiento;
    }

    /**
     * Gets the value of relation through role MunicipioNacimiento
     */
    @JsonIgnore
    public Municipio getMunicipioNacimiento() {
        return municipioNacimiento;
    }

    /**
     * Gets the value of relation through role EstadoCivil
     */
    @JsonIgnore
    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * Gets the value of relation through role EstadoPersona
     */
    @JsonIgnore
    public EstadoPersona getEstadoPersona() {
        return estadoPersona;
    }

    /**
     * Default constructor
     */
    public Persona() {
        personaIdentificador = null;
    }

    /**
     * Constructor used to create instances of <code>Persona</code>.
     * @param oid Object Identifier of the instance of <code>Persona</code> to be created.
     * @throws SystemException
     */
    public Persona(PersonaOid oid) {
        if (oid != null && !oid.isNull()) {
            personaIdentificador = oid.getPersonaIdentificador();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return Persona.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Persona other = (Persona)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getPersonaIdentificador(), other.getPersonaIdentificador());
        result &= Utilities.isEqual(this.getPersonaCodigo(), other.getPersonaCodigo());
        result &= Utilities.isEqual(this.getPersonaNumIdentificacion(), other.getPersonaNumIdentificacion());
        result &= Utilities.isEqual(this.getPersonaTipoPersona(), other.getPersonaTipoPersona());
        result &= Utilities.isEqual(this.getPersonaPrimerNombre(), other.getPersonaPrimerNombre());
        result &= Utilities.isEqual(this.getPersonaSegundoNombre(), other.getPersonaSegundoNombre());
        result &= Utilities.isEqual(this.getPersonaPrimerApellido(), other.getPersonaPrimerApellido());
        result &= Utilities.isEqual(this.getPersonaSegundoApellido(), other.getPersonaSegundoApellido());
        result &= Utilities.isEqual(this.getPersonaRazonSocial(), other.getPersonaRazonSocial());
        result &= Utilities.isEqual(this.getPersonadrvNombreCompleto(), other.getPersonadrvNombreCompleto());
        result &= Utilities.isEqual(this.getPersonaFechaNacimiento(), other.getPersonaFechaNacimiento());
        result &= Utilities.isEqual(this.getPersonaGenero(), other.getPersonaGenero());
        result &= Utilities.isEqual(this.getPersonaIndicadorExtranjero(), other.getPersonaIndicadorExtranjero());
        result &= Utilities.isEqual(this.getPersonaTelefonoFijo(), other.getPersonaTelefonoFijo());
        result &= Utilities.isEqual(this.getPersonaTelefonoCelular(), other.getPersonaTelefonoCelular());
        result &= Utilities.isEqual(this.getPersonaCorreoElectronico(), other.getPersonaCorreoElectronico());
        result &= Utilities.isEqual(this.getPersonaTieneEPSSanitas(), other.getPersonaTieneEPSSanitas());
        result &= Utilities.isEqual(this.getPersonaRechazadoAfiliacion(), other.getPersonaRechazadoAfiliacion());
        result &= Utilities.isEqual(this.getPersonaDatosBasicosMod(), other.getPersonaDatosBasicosMod());
        result &= Utilities.isEqual(this.getPersonadrvRechazada(), other.getPersonadrvRechazada());
        result &= Utilities.isEqual(this.getPersonadrvTieneDirecciones(), other.getPersonadrvTieneDirecciones());
        result &= Utilities.isEqual(this.getPersonadrvTipoNumDoc(), other.getPersonadrvTipoNumDoc());
        result &= Utilities.isEqual(this.getPersonadrvVieneDeCORE(), other.getPersonadrvVieneDeCORE());
        result &= Utilities.isEqual(this.getPersonadrvAddDocComoCont(), other.getPersonadrvAddDocComoCont());
        result &= Utilities.isEqual(this.getPersonadrvAddDocComoTitu(), other.getPersonadrvAddDocComoTitu());
        return result;
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
     * Returns the <code>PersonaOid</code> object that identifies this instance of <code>Persona</code>.
     * @return <code>PersonaOid</code> object that identifies this instance of <code>Persona</code>
     */
	@Override
    public PersonaOid getOid() {
        return new PersonaOid(getPersonaIdentificador());
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
        if (!activeFacets.contains(Constants.PERSONA)) {
            activeFacets.add(Constants.PERSONA);
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
            relatedInstance = buildPersonaRelatedInstance(relatedInstanceJsonOid);
        }
        if (PersonaConstants.ROLE_NAME_SOLICITUDESCONTRATANTE.equalsIgnoreCase(relatedInstancePathFirstItem) || PersonaConstants.ROLE_NAME_SOLICITUDESTITULAR.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaConstants.ROLE_NAME_DIRECCIONES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaRelatedInstance4Direccion(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaConstants.ROLE_NAME_USUARIOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaRelatedInstance4Usuario(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaConstants.ROLE_NAME_DOCUMENTOSG.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaRelatedInstance4DocumentoG(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaConstants.ROLE_NAME_TIPOIDENTIFICACION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaRelatedInstance4TipoIdentificacion(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaConstants.ROLE_NAME_DEPARTAMENTONACIMIENTO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaRelatedInstance4Departamento(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaConstants.ROLE_NAME_MUNICIPIONACIMIENTO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaRelatedInstance4Municipio(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaConstants.ROLE_NAME_ESTADOCIVIL.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaRelatedInstance4EstadoCivil(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaConstants.ROLE_NAME_ESTADOPERSONA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaRelatedInstance4EstadoPersona(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildPersonaRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Persona(mapper.readValue(relatedInstanceJsonOid, PersonaOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Persona.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPersonaRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Persona.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPersonaRelatedInstance4Direccion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Direccion(mapper.readValue(relatedInstanceJsonOid, DireccionOid.class)): Direccion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Persona.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPersonaRelatedInstance4Usuario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Usuario(mapper.readValue(relatedInstanceJsonOid, UsuarioOid.class)): Usuario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Persona.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPersonaRelatedInstance4DocumentoG(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new DocumentoG(mapper.readValue(relatedInstanceJsonOid, DocumentoGOid.class)): DocumentoG.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Persona.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPersonaRelatedInstance4TipoIdentificacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TipoIdentificacion(mapper.readValue(relatedInstanceJsonOid, TipoIdentificacionOid.class)): TipoIdentificacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Persona.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPersonaRelatedInstance4Departamento(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Departamento(mapper.readValue(relatedInstanceJsonOid, DepartamentoOid.class)): Departamento.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Persona.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPersonaRelatedInstance4Municipio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Municipio(mapper.readValue(relatedInstanceJsonOid, MunicipioOid.class)): Municipio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Persona.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPersonaRelatedInstance4EstadoCivil(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new EstadoCivil(mapper.readValue(relatedInstanceJsonOid, EstadoCivilOid.class)): EstadoCivil.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Persona.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPersonaRelatedInstance4EstadoPersona(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new EstadoPersona(mapper.readValue(relatedInstanceJsonOid, EstadoPersonaOid.class)): EstadoPersona.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Persona.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
