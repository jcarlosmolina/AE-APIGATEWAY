package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.LogAsignacionesConstants;
import com.keralty.ae.persistence.oid.LogAsignacionesOid;
import com.keralty.ae.persistence.oid.SolicitudOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>LogAsignaciones</code> external model class.
 * <p>
 * External Model Class: <code>LogAsignaciones</code><br>
 */
public class LogAsignaciones extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id_logasignaciones")
    private Long logAsignacionesidLogAsignaciones;

    @JsonProperty(value="tipo")
    private String logAsignacionesTipo;

    @JsonProperty(value="fechahora")
    private Timestamp logAsignacionesFechaHora;

    @JsonProperty(value="quien")
    private String logAsignacionesQuien;

    @JsonProperty(value="usuario")
    private String logAsignacionesUsuario;

    private Solicitud solicitud;

    /**
     * Gets the value of attribute id_LogAsignaciones
     */
    public Long getLogAsignacionesidLogAsignaciones() {
        return logAsignacionesidLogAsignaciones;
    }
    
    /**
     * Sets the value of attribute id_LogAsignaciones
     */
    public void setLogAsignacionesidLogAsignaciones(Long logAsignacionesidLogAsignaciones) {
        this.logAsignacionesidLogAsignaciones = logAsignacionesidLogAsignaciones;
    }

    /**
     * Gets the value of attribute Tipo
     */
    public String getLogAsignacionesTipo() {
        return logAsignacionesTipo;
    }
    
    /**
     * Sets the value of attribute Tipo
     */
    public void setLogAsignacionesTipo(String logAsignacionesTipo) {
        this.logAsignacionesTipo = logAsignacionesTipo;
    }

    /**
     * Gets the value of attribute FechaHora
     */
    public Timestamp getLogAsignacionesFechaHora() {
        return logAsignacionesFechaHora;
    }
    
    /**
     * Sets the value of attribute FechaHora
     */
    public void setLogAsignacionesFechaHora(Timestamp logAsignacionesFechaHora) {
        this.logAsignacionesFechaHora = logAsignacionesFechaHora;
    }

    /**
     * Gets the value of attribute Quien
     */
    public String getLogAsignacionesQuien() {
        return logAsignacionesQuien;
    }
    
    /**
     * Sets the value of attribute Quien
     */
    public void setLogAsignacionesQuien(String logAsignacionesQuien) {
        this.logAsignacionesQuien = logAsignacionesQuien;
    }

    /**
     * Gets the value of attribute Usuario
     */
    public String getLogAsignacionesUsuario() {
        return logAsignacionesUsuario;
    }
    
    /**
     * Sets the value of attribute Usuario
     */
    public void setLogAsignacionesUsuario(String logAsignacionesUsuario) {
        this.logAsignacionesUsuario = logAsignacionesUsuario;
    }

    /**
     * Gets the value of relation through role Solicitud
     */
    @JsonIgnore
    public Solicitud getSolicitud() {
        return solicitud;
    }

    /**
     * Default constructor
     */
    public LogAsignaciones() {
        logAsignacionesidLogAsignaciones = null;
    }

    /**
     * Constructor used to create instances of <code>LogAsignaciones</code>.
     * @param oid Object Identifier of the instance of <code>LogAsignaciones</code> to be created.
     * @throws SystemException
     */
    public LogAsignaciones(LogAsignacionesOid oid) {
        if (oid != null && !oid.isNull()) {
            logAsignacionesidLogAsignaciones = oid.getLogAsignacionesidLogAsignaciones();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return LogAsignaciones.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        LogAsignaciones other = (LogAsignaciones)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getLogAsignacionesidLogAsignaciones(), other.getLogAsignacionesidLogAsignaciones());
        result &= Utilities.isEqual(this.getLogAsignacionesTipo(), other.getLogAsignacionesTipo());
        result &= Utilities.isEqual(this.getLogAsignacionesFechaHora(), other.getLogAsignacionesFechaHora());
        result &= Utilities.isEqual(this.getLogAsignacionesQuien(), other.getLogAsignacionesQuien());
        result &= Utilities.isEqual(this.getLogAsignacionesUsuario(), other.getLogAsignacionesUsuario());
        return result;
    }

    @Override
    @JsonIgnore
    public int hashCode() {
        return 0;
    }

    @JsonIgnore
    public boolean isNull() {
        return false;
    }

    /**
     * Returns the <code>LogAsignacionesOid</code> object that identifies this instance of <code>LogAsignaciones</code>.
     * @return <code>LogAsignacionesOid</code> object that identifies this instance of <code>LogAsignaciones</code>
     */
	@Override
    public LogAsignacionesOid getOid() {
        return new LogAsignacionesOid(getLogAsignacionesidLogAsignaciones());
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
        if (!activeFacets.contains(Constants.LOGASIGNACIONES)) {
            activeFacets.add(Constants.LOGASIGNACIONES);
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
            relatedInstance = buildLogAsignacionesRelatedInstance(relatedInstanceJsonOid);
        }
        if (LogAsignacionesConstants.ROLE_NAME_SOLICITUD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildLogAsignacionesRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildLogAsignacionesRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new LogAsignaciones(mapper.readValue(relatedInstanceJsonOid, LogAsignacionesOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogAsignaciones.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildLogAsignacionesRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogAsignaciones.class).error(e.getMessage());
            return null;
        }
    }
}
