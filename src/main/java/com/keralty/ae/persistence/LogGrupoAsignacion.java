package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.LogGrupoAsignacionConstants;
import com.keralty.ae.persistence.oid.GrupoAsignacionOid;
import com.keralty.ae.persistence.oid.LogGrupoAsignacionOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>LogGrupoAsignacion</code> external model class.
 * <p>
 * External Model Class: <code>LogGrupoAsignacion</code><br>
 */
public class LogGrupoAsignacion extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id")
    private Long logGrupoAsignacionId;

    @JsonProperty(value="fecha")
    private Timestamp logGrupoAsignacionFecha;

    @JsonProperty(value="loginfuncionario")
    private String logGrupoAsignacionLoginFuncionario;

    @JsonProperty(value="accion")
    private String logGrupoAsignacionAccion;

    @JsonProperty(value="valor")
    private String logGrupoAsignacionValor;

    private GrupoAsignacion grupoAsignacion;

    /**
     * Gets the value of attribute Id
     */
    public Long getLogGrupoAsignacionId() {
        return logGrupoAsignacionId;
    }
    
    /**
     * Sets the value of attribute Id
     */
    public void setLogGrupoAsignacionId(Long logGrupoAsignacionId) {
        this.logGrupoAsignacionId = logGrupoAsignacionId;
    }

    /**
     * Gets the value of attribute Fecha
     */
    public Timestamp getLogGrupoAsignacionFecha() {
        return logGrupoAsignacionFecha;
    }
    
    /**
     * Sets the value of attribute Fecha
     */
    public void setLogGrupoAsignacionFecha(Timestamp logGrupoAsignacionFecha) {
        this.logGrupoAsignacionFecha = logGrupoAsignacionFecha;
    }

    /**
     * Gets the value of attribute LoginFuncionario
     */
    public String getLogGrupoAsignacionLoginFuncionario() {
        return logGrupoAsignacionLoginFuncionario;
    }
    
    /**
     * Sets the value of attribute LoginFuncionario
     */
    public void setLogGrupoAsignacionLoginFuncionario(String logGrupoAsignacionLoginFuncionario) {
        this.logGrupoAsignacionLoginFuncionario = logGrupoAsignacionLoginFuncionario;
    }

    /**
     * Gets the value of attribute Accion
     */
    public String getLogGrupoAsignacionAccion() {
        return logGrupoAsignacionAccion;
    }
    
    /**
     * Sets the value of attribute Accion
     */
    public void setLogGrupoAsignacionAccion(String logGrupoAsignacionAccion) {
        this.logGrupoAsignacionAccion = logGrupoAsignacionAccion;
    }

    /**
     * Gets the value of attribute Valor
     */
    public String getLogGrupoAsignacionValor() {
        return logGrupoAsignacionValor;
    }
    
    /**
     * Sets the value of attribute Valor
     */
    public void setLogGrupoAsignacionValor(String logGrupoAsignacionValor) {
        this.logGrupoAsignacionValor = logGrupoAsignacionValor;
    }

    /**
     * Gets the value of relation through role GrupoAsignacion
     */
    @JsonIgnore
    public GrupoAsignacion getGrupoAsignacion() {
        return grupoAsignacion;
    }

    /**
     * Default constructor
     */
    public LogGrupoAsignacion() {
        logGrupoAsignacionId = null;
    }

    /**
     * Constructor used to create instances of <code>LogGrupoAsignacion</code>.
     * @param oid Object Identifier of the instance of <code>LogGrupoAsignacion</code> to be created.
     * @throws SystemException
     */
    public LogGrupoAsignacion(LogGrupoAsignacionOid oid) {
        if (oid != null && !oid.isNull()) {
            logGrupoAsignacionId = oid.getLogGrupoAsignacionId();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return LogGrupoAsignacion.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        LogGrupoAsignacion other = (LogGrupoAsignacion)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getLogGrupoAsignacionId(), other.getLogGrupoAsignacionId());
        result &= Utilities.isEqual(this.getLogGrupoAsignacionFecha(), other.getLogGrupoAsignacionFecha());
        result &= Utilities.isEqual(this.getLogGrupoAsignacionLoginFuncionario(), other.getLogGrupoAsignacionLoginFuncionario());
        result &= Utilities.isEqual(this.getLogGrupoAsignacionAccion(), other.getLogGrupoAsignacionAccion());
        result &= Utilities.isEqual(this.getLogGrupoAsignacionValor(), other.getLogGrupoAsignacionValor());
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
     * Returns the <code>LogGrupoAsignacionOid</code> object that identifies this instance of <code>LogGrupoAsignacion</code>.
     * @return <code>LogGrupoAsignacionOid</code> object that identifies this instance of <code>LogGrupoAsignacion</code>
     */
	@Override
    public LogGrupoAsignacionOid getOid() {
        return new LogGrupoAsignacionOid(getLogGrupoAsignacionId());
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
        if (!activeFacets.contains(Constants.LOGGRUPOASIGNACION)) {
            activeFacets.add(Constants.LOGGRUPOASIGNACION);
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
            relatedInstance = buildLogGrupoAsignacionRelatedInstance(relatedInstanceJsonOid);
        }
        if (LogGrupoAsignacionConstants.ROLE_NAME_GRUPOASIGNACION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildLogGrupoAsignacionRelatedInstance4GrupoAsignacion(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildLogGrupoAsignacionRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new LogGrupoAsignacion(mapper.readValue(relatedInstanceJsonOid, LogGrupoAsignacionOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogGrupoAsignacion.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildLogGrupoAsignacionRelatedInstance4GrupoAsignacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new GrupoAsignacion(mapper.readValue(relatedInstanceJsonOid, GrupoAsignacionOid.class)): GrupoAsignacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogGrupoAsignacion.class).error(e.getMessage());
            return null;
        }
    }
}
