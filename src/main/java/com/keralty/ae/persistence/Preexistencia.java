package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.PreexistenciaConstants;
import com.keralty.ae.persistence.oid.PreexistenciaOid;
import com.keralty.ae.persistence.oid.UsuarioOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>Preexistencia</code> external model class.
 * <p>
 * External Model Class: <code>Preexistencia</code><br>
 */
public class Preexistencia extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id_solicitud")
    private Long aesolicitudesidsolicitud;

    @JsonProperty(value="usuario_identificador")
    private Long usuarioUsuarioIdentificador;

    @JsonProperty(value="identificador")
    private Long preexistenciaIdentificador;

    @JsonProperty(value="descripcion")
    private String preexistenciaDescripcion;

    @JsonProperty(value="fecinicio")
    private Date preexistenciaFecInicio;

    @JsonProperty(value="fecfin")
    private Date preexistenciaFecFin;

    @JsonProperty(value="observacion")
    private String preexistenciaObservacion;

    private Usuario usuario;

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
    public Long getUsuarioUsuarioIdentificador() {
        return usuarioUsuarioIdentificador;
    }
    
    /**
     * Sets the value of attribute Identificador
     */
    public void setUsuarioUsuarioIdentificador(Long usuarioUsuarioIdentificador) {
        this.usuarioUsuarioIdentificador = usuarioUsuarioIdentificador;
    }

    /**
     * Gets the value of attribute Identificador
     */
    public Long getPreexistenciaIdentificador() {
        return preexistenciaIdentificador;
    }
    
    /**
     * Sets the value of attribute Identificador
     */
    public void setPreexistenciaIdentificador(Long preexistenciaIdentificador) {
        this.preexistenciaIdentificador = preexistenciaIdentificador;
    }

    /**
     * Gets the value of attribute Descripcion
     */
    public String getPreexistenciaDescripcion() {
        return preexistenciaDescripcion;
    }
    
    /**
     * Sets the value of attribute Descripcion
     */
    public void setPreexistenciaDescripcion(String preexistenciaDescripcion) {
        this.preexistenciaDescripcion = preexistenciaDescripcion;
    }

    /**
     * Gets the value of attribute FecInicio
     */
    public Date getPreexistenciaFecInicio() {
        return preexistenciaFecInicio;
    }
    
    /**
     * Sets the value of attribute FecInicio
     */
    public void setPreexistenciaFecInicio(Date preexistenciaFecInicio) {
        this.preexistenciaFecInicio = preexistenciaFecInicio;
    }

    /**
     * Gets the value of attribute FecFin
     */
    public Date getPreexistenciaFecFin() {
        return preexistenciaFecFin;
    }
    
    /**
     * Sets the value of attribute FecFin
     */
    public void setPreexistenciaFecFin(Date preexistenciaFecFin) {
        this.preexistenciaFecFin = preexistenciaFecFin;
    }

    /**
     * Gets the value of attribute Observacion
     */
    public String getPreexistenciaObservacion() {
        return preexistenciaObservacion;
    }
    
    /**
     * Sets the value of attribute Observacion
     */
    public void setPreexistenciaObservacion(String preexistenciaObservacion) {
        this.preexistenciaObservacion = preexistenciaObservacion;
    }

    /**
     * Gets the value of relation through role Usuario
     */
    @JsonIgnore
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Default constructor
     */
    public Preexistencia() {
        aesolicitudesidsolicitud = null;
        usuarioUsuarioIdentificador = null;
        preexistenciaIdentificador = null;
    }

    /**
     * Constructor used to create instances of <code>Preexistencia</code>.
     * @param oid Object Identifier of the instance of <code>Preexistencia</code> to be created.
     * @throws SystemException
     */
    public Preexistencia(PreexistenciaOid oid) {
        if (oid != null && !oid.isNull()) {
            aesolicitudesidsolicitud = oid.getAesolicitudesidsolicitud();
            usuarioUsuarioIdentificador = oid.getUsuarioUsuarioIdentificador();
            preexistenciaIdentificador = oid.getPreexistenciaIdentificador();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return Preexistencia.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Preexistencia other = (Preexistencia)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getPreexistenciaIdentificador(), other.getPreexistenciaIdentificador());
        result &= Utilities.isEqual(this.getPreexistenciaDescripcion(), other.getPreexistenciaDescripcion());
        result &= Utilities.isEqual(this.getPreexistenciaFecInicio(), other.getPreexistenciaFecInicio());
        result &= Utilities.isEqual(this.getPreexistenciaFecFin(), other.getPreexistenciaFecFin());
        result &= Utilities.isEqual(this.getPreexistenciaObservacion(), other.getPreexistenciaObservacion());
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
     * Returns the <code>PreexistenciaOid</code> object that identifies this instance of <code>Preexistencia</code>.
     * @return <code>PreexistenciaOid</code> object that identifies this instance of <code>Preexistencia</code>
     */
	@Override
    public PreexistenciaOid getOid() {
        return new PreexistenciaOid(getAesolicitudesidsolicitud(), getUsuarioUsuarioIdentificador(), getPreexistenciaIdentificador());
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
        if (!activeFacets.contains(Constants.PREEXISTENCIA)) {
            activeFacets.add(Constants.PREEXISTENCIA);
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
            relatedInstance = buildPreexistenciaRelatedInstance(relatedInstanceJsonOid);
        }
        if (PreexistenciaConstants.ROLE_NAME_USUARIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPreexistenciaRelatedInstance4Usuario(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildPreexistenciaRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Preexistencia(mapper.readValue(relatedInstanceJsonOid, PreexistenciaOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Preexistencia.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPreexistenciaRelatedInstance4Usuario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Usuario(mapper.readValue(relatedInstanceJsonOid, UsuarioOid.class)): Usuario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Preexistencia.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
