package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.UsuarioRegConstants;
import com.keralty.ae.persistence.oid.EstadoBeneficiarioOid;
import com.keralty.ae.persistence.oid.ParentescoOid;
import com.keralty.ae.persistence.oid.SolicitudOid;
import com.keralty.ae.persistence.oid.UsuarioRegOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>UsuarioReg</code> external model class.
 * <p>
 * External Model Class: <code>UsuarioReg</code><br>
 */
public class UsuarioReg extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id_solicitud")
    private Long aesolicitudesidsolicitud;

    @JsonProperty(value="identificador")
    private Long usuarioRegIdentificador;

    @JsonProperty(value="tipoidentificacion")
    private String usuarioRegTipoIdentificacion;

    @JsonProperty(value="numidentificacion")
    private String usuarioRegNumIdentificacion;

    @JsonProperty(value="tipoynumdoc")
    private String usuarioRegTipoYNumDoc;

    @JsonProperty(value="primernombre")
    private String usuarioRegPrimerNombre;

    @JsonProperty(value="segundonombre")
    private String usuarioRegSegundoNombre;

    @JsonProperty(value="primerapellido")
    private String usuarioRegPrimerApellido;

    @JsonProperty(value="segundoapellido")
    private String usuarioRegSegundoApellido;

    @JsonProperty(value="numusuario")
    private Long usuarioRegNumUsuario;

    @JsonProperty(value="fechainiciovigencia")
    private Date usuarioRegFechaInicioVigencia;

    @JsonProperty(value="fechafinvigencia")
    private Date usuarioRegFechaFinVigencia;

    @JsonProperty(value="genero")
    private String usuarioRegGenero;

    @JsonProperty(value="fechanacimiento")
    private Date usuarioRegFechaNacimiento;

    @JsonProperty(value="drvedad")
    private Long usuarioRegdrvEdad;

    private Solicitud solicitud;

    private EstadoBeneficiario estadoBeneficiario;

    private Parentesco parentesco;

    /**
     * Gets the value of attribute id_solicitud
     */
    public Long getAesolicitudesidsolicitud() {
        return aesolicitudesidsolicitud;
    }
    
    /**
     * Sets the value of attribute id_solicitud
     */
    public void setAesolicitudesidsolicitud(Long aesolicitudesidsolicitud) {
        this.aesolicitudesidsolicitud = aesolicitudesidsolicitud;
    }

    /**
     * Gets the value of attribute Identificador
     */
    public Long getUsuarioRegIdentificador() {
        return usuarioRegIdentificador;
    }
    
    /**
     * Sets the value of attribute Identificador
     */
    public void setUsuarioRegIdentificador(Long usuarioRegIdentificador) {
        this.usuarioRegIdentificador = usuarioRegIdentificador;
    }

    /**
     * Gets the value of attribute TipoIdentificacion
     */
    public String getUsuarioRegTipoIdentificacion() {
        return usuarioRegTipoIdentificacion;
    }
    
    /**
     * Sets the value of attribute TipoIdentificacion
     */
    public void setUsuarioRegTipoIdentificacion(String usuarioRegTipoIdentificacion) {
        this.usuarioRegTipoIdentificacion = usuarioRegTipoIdentificacion;
    }

    /**
     * Gets the value of attribute NumIdentificacion
     */
    public String getUsuarioRegNumIdentificacion() {
        return usuarioRegNumIdentificacion;
    }
    
    /**
     * Sets the value of attribute NumIdentificacion
     */
    public void setUsuarioRegNumIdentificacion(String usuarioRegNumIdentificacion) {
        this.usuarioRegNumIdentificacion = usuarioRegNumIdentificacion;
    }

    /**
     * Gets the value of attribute TipoYNumDoc
     */
    public String getUsuarioRegTipoYNumDoc() {
        return usuarioRegTipoYNumDoc;
    }
    
    /**
     * Sets the value of attribute TipoYNumDoc
     */
    public void setUsuarioRegTipoYNumDoc(String usuarioRegTipoYNumDoc) {
        this.usuarioRegTipoYNumDoc = usuarioRegTipoYNumDoc;
    }

    /**
     * Gets the value of attribute PrimerNombre
     */
    public String getUsuarioRegPrimerNombre() {
        return usuarioRegPrimerNombre;
    }
    
    /**
     * Sets the value of attribute PrimerNombre
     */
    public void setUsuarioRegPrimerNombre(String usuarioRegPrimerNombre) {
        this.usuarioRegPrimerNombre = usuarioRegPrimerNombre;
    }

    /**
     * Gets the value of attribute SegundoNombre
     */
    public String getUsuarioRegSegundoNombre() {
        return usuarioRegSegundoNombre;
    }
    
    /**
     * Sets the value of attribute SegundoNombre
     */
    public void setUsuarioRegSegundoNombre(String usuarioRegSegundoNombre) {
        this.usuarioRegSegundoNombre = usuarioRegSegundoNombre;
    }

    /**
     * Gets the value of attribute PrimerApellido
     */
    public String getUsuarioRegPrimerApellido() {
        return usuarioRegPrimerApellido;
    }
    
    /**
     * Sets the value of attribute PrimerApellido
     */
    public void setUsuarioRegPrimerApellido(String usuarioRegPrimerApellido) {
        this.usuarioRegPrimerApellido = usuarioRegPrimerApellido;
    }

    /**
     * Gets the value of attribute SegundoApellido
     */
    public String getUsuarioRegSegundoApellido() {
        return usuarioRegSegundoApellido;
    }
    
    /**
     * Sets the value of attribute SegundoApellido
     */
    public void setUsuarioRegSegundoApellido(String usuarioRegSegundoApellido) {
        this.usuarioRegSegundoApellido = usuarioRegSegundoApellido;
    }

    /**
     * Gets the value of attribute NumUsuario
     */
    public Long getUsuarioRegNumUsuario() {
        return usuarioRegNumUsuario;
    }
    
    /**
     * Sets the value of attribute NumUsuario
     */
    public void setUsuarioRegNumUsuario(Long usuarioRegNumUsuario) {
        this.usuarioRegNumUsuario = usuarioRegNumUsuario;
    }

    /**
     * Gets the value of attribute FechaInicioVigencia
     */
    public Date getUsuarioRegFechaInicioVigencia() {
        return usuarioRegFechaInicioVigencia;
    }
    
    /**
     * Sets the value of attribute FechaInicioVigencia
     */
    public void setUsuarioRegFechaInicioVigencia(Date usuarioRegFechaInicioVigencia) {
        this.usuarioRegFechaInicioVigencia = usuarioRegFechaInicioVigencia;
    }

    /**
     * Gets the value of attribute FechaFinVigencia
     */
    public Date getUsuarioRegFechaFinVigencia() {
        return usuarioRegFechaFinVigencia;
    }
    
    /**
     * Sets the value of attribute FechaFinVigencia
     */
    public void setUsuarioRegFechaFinVigencia(Date usuarioRegFechaFinVigencia) {
        this.usuarioRegFechaFinVigencia = usuarioRegFechaFinVigencia;
    }

    /**
     * Gets the value of attribute Genero
     */
    public String getUsuarioRegGenero() {
        return usuarioRegGenero;
    }
    
    /**
     * Sets the value of attribute Genero
     */
    public void setUsuarioRegGenero(String usuarioRegGenero) {
        this.usuarioRegGenero = usuarioRegGenero;
    }

    /**
     * Gets the value of attribute FechaNacimiento
     */
    public Date getUsuarioRegFechaNacimiento() {
        return usuarioRegFechaNacimiento;
    }
    
    /**
     * Sets the value of attribute FechaNacimiento
     */
    public void setUsuarioRegFechaNacimiento(Date usuarioRegFechaNacimiento) {
        this.usuarioRegFechaNacimiento = usuarioRegFechaNacimiento;
    }

    /**
     * Gets the value of attribute drvEdad
     */
    public Long getUsuarioRegdrvEdad() {
        return usuarioRegdrvEdad;
    }
    
    /**
     * Sets the value of attribute drvEdad
     */
    public void setUsuarioRegdrvEdad(Long usuarioRegdrvEdad) {
        this.usuarioRegdrvEdad = usuarioRegdrvEdad;
    }

    /**
     * Gets the value of relation through role Solicitud
     */
    @JsonIgnore
    public Solicitud getSolicitud() {
        return solicitud;
    }

    /**
     * Gets the value of relation through role EstadoBeneficiario
     */
    @JsonIgnore
    public EstadoBeneficiario getEstadoBeneficiario() {
        return estadoBeneficiario;
    }

    /**
     * Gets the value of relation through role Parentesco
     */
    @JsonIgnore
    public Parentesco getParentesco() {
        return parentesco;
    }

    /**
     * Default constructor
     */
    public UsuarioReg() {
        aesolicitudesidsolicitud = null;
        usuarioRegIdentificador = null;
    }

    /**
     * Constructor used to create instances of <code>UsuarioReg</code>.
     * @param oid Object Identifier of the instance of <code>UsuarioReg</code> to be created.
     * @throws SystemException
     */
    public UsuarioReg(UsuarioRegOid oid) {
        if (oid != null && !oid.isNull()) {
            aesolicitudesidsolicitud = oid.getAesolicitudesidsolicitud();
            usuarioRegIdentificador = oid.getUsuarioRegIdentificador();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return UsuarioReg.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        UsuarioReg other = (UsuarioReg)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getUsuarioRegIdentificador(), other.getUsuarioRegIdentificador());
        result &= Utilities.isEqual(this.getUsuarioRegTipoIdentificacion(), other.getUsuarioRegTipoIdentificacion());
        result &= Utilities.isEqual(this.getUsuarioRegNumIdentificacion(), other.getUsuarioRegNumIdentificacion());
        result &= Utilities.isEqual(this.getUsuarioRegTipoYNumDoc(), other.getUsuarioRegTipoYNumDoc());
        result &= Utilities.isEqual(this.getUsuarioRegPrimerNombre(), other.getUsuarioRegPrimerNombre());
        result &= Utilities.isEqual(this.getUsuarioRegSegundoNombre(), other.getUsuarioRegSegundoNombre());
        result &= Utilities.isEqual(this.getUsuarioRegPrimerApellido(), other.getUsuarioRegPrimerApellido());
        result &= Utilities.isEqual(this.getUsuarioRegSegundoApellido(), other.getUsuarioRegSegundoApellido());
        result &= Utilities.isEqual(this.getUsuarioRegNumUsuario(), other.getUsuarioRegNumUsuario());
        result &= Utilities.isEqual(this.getUsuarioRegFechaInicioVigencia(), other.getUsuarioRegFechaInicioVigencia());
        result &= Utilities.isEqual(this.getUsuarioRegFechaFinVigencia(), other.getUsuarioRegFechaFinVigencia());
        result &= Utilities.isEqual(this.getUsuarioRegGenero(), other.getUsuarioRegGenero());
        result &= Utilities.isEqual(this.getUsuarioRegFechaNacimiento(), other.getUsuarioRegFechaNacimiento());
        result &= Utilities.isEqual(this.getUsuarioRegdrvEdad(), other.getUsuarioRegdrvEdad());
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
     * Returns the <code>UsuarioRegOid</code> object that identifies this instance of <code>UsuarioReg</code>.
     * @return <code>UsuarioRegOid</code> object that identifies this instance of <code>UsuarioReg</code>
     */
	@Override
    public UsuarioRegOid getOid() {
        return new UsuarioRegOid(getAesolicitudesidsolicitud(), getUsuarioRegIdentificador());
    }

    @Override
    public boolean checkHorizontalVisibility(IEntity agent) {
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
        if (!activeFacets.contains(Constants.USUARIOREG)) {
            activeFacets.add(Constants.USUARIOREG);
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
            relatedInstance = buildUsuarioRegRelatedInstance(relatedInstanceJsonOid);
        }
        if (UsuarioRegConstants.ROLE_NAME_SOLICITUD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildUsuarioRegRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        if (UsuarioRegConstants.ROLE_NAME_ESTADOBENEFICIARIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildUsuarioRegRelatedInstance4EstadoBeneficiario(relatedInstanceJsonOid, remainingPath);
        }
        if (UsuarioRegConstants.ROLE_NAME_PARENTESCO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildUsuarioRegRelatedInstance4Parentesco(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildUsuarioRegRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new UsuarioReg(mapper.readValue(relatedInstanceJsonOid, UsuarioRegOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(UsuarioReg.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildUsuarioRegRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(UsuarioReg.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildUsuarioRegRelatedInstance4EstadoBeneficiario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new EstadoBeneficiario(mapper.readValue(relatedInstanceJsonOid, EstadoBeneficiarioOid.class)): EstadoBeneficiario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(UsuarioReg.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildUsuarioRegRelatedInstance4Parentesco(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Parentesco(mapper.readValue(relatedInstanceJsonOid, ParentescoOid.class)): Parentesco.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(UsuarioReg.class).error(e.getMessage());
            return null;
        }
    }
}
