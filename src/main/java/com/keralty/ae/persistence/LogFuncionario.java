package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.LogFuncionarioConstants;
import com.keralty.ae.persistence.oid.FuncionarioOid;
import com.keralty.ae.persistence.oid.LogFuncionarioOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>LogFuncionario</code> external model class.
 * <p>
 * External Model Class: <code>LogFuncionario</code><br>
 */
public class LogFuncionario extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id")
    private Long logFuncionarioId;

    @JsonProperty(value="fecha")
    private Timestamp logFuncionarioFecha;

    @JsonProperty(value="loginfuncionario")
    private String logFuncionarioLoginFuncionario;

    @JsonProperty(value="disponible")
    private Boolean logFuncionarioDisponible;

    private Funcionario funcionario;

    /**
     * Gets the value of attribute Id
     */
    public Long getLogFuncionarioId() {
        return logFuncionarioId;
    }
    
    /**
     * Sets the value of attribute Id
     */
    public void setLogFuncionarioId(Long logFuncionarioId) {
        this.logFuncionarioId = logFuncionarioId;
    }

    /**
     * Gets the value of attribute Fecha
     */
    public Timestamp getLogFuncionarioFecha() {
        return logFuncionarioFecha;
    }
    
    /**
     * Sets the value of attribute Fecha
     */
    public void setLogFuncionarioFecha(Timestamp logFuncionarioFecha) {
        this.logFuncionarioFecha = logFuncionarioFecha;
    }

    /**
     * Gets the value of attribute LoginFuncionario
     */
    public String getLogFuncionarioLoginFuncionario() {
        return logFuncionarioLoginFuncionario;
    }
    
    /**
     * Sets the value of attribute LoginFuncionario
     */
    public void setLogFuncionarioLoginFuncionario(String logFuncionarioLoginFuncionario) {
        this.logFuncionarioLoginFuncionario = logFuncionarioLoginFuncionario;
    }

    /**
     * Gets the value of attribute Disponible
     */
    public Boolean getLogFuncionarioDisponible() {
        return logFuncionarioDisponible;
    }
    
    /**
     * Sets the value of attribute Disponible
     */
    public void setLogFuncionarioDisponible(Boolean logFuncionarioDisponible) {
        this.logFuncionarioDisponible = logFuncionarioDisponible;
    }

    /**
     * Gets the value of relation through role Funcionario
     */
    @JsonIgnore
    public Funcionario getFuncionario() {
        return funcionario;
    }

    /**
     * Default constructor
     */
    public LogFuncionario() {
        logFuncionarioId = null;
    }

    /**
     * Constructor used to create instances of <code>LogFuncionario</code>.
     * @param oid Object Identifier of the instance of <code>LogFuncionario</code> to be created.
     * @throws SystemException
     */
    public LogFuncionario(LogFuncionarioOid oid) {
        if (oid != null && !oid.isNull()) {
            logFuncionarioId = oid.getLogFuncionarioId();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return LogFuncionario.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        LogFuncionario other = (LogFuncionario)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getLogFuncionarioId(), other.getLogFuncionarioId());
        result &= Utilities.isEqual(this.getLogFuncionarioFecha(), other.getLogFuncionarioFecha());
        result &= Utilities.isEqual(this.getLogFuncionarioLoginFuncionario(), other.getLogFuncionarioLoginFuncionario());
        result &= Utilities.isEqual(this.getLogFuncionarioDisponible(), other.getLogFuncionarioDisponible());
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
     * Returns the <code>LogFuncionarioOid</code> object that identifies this instance of <code>LogFuncionario</code>.
     * @return <code>LogFuncionarioOid</code> object that identifies this instance of <code>LogFuncionario</code>
     */
	@Override
    public LogFuncionarioOid getOid() {
        return new LogFuncionarioOid(getLogFuncionarioId());
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
        if (!activeFacets.contains(Constants.LOGFUNCIONARIO)) {
            activeFacets.add(Constants.LOGFUNCIONARIO);
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
            relatedInstance = buildLogFuncionarioRelatedInstance(relatedInstanceJsonOid);
        }
        if (LogFuncionarioConstants.ROLE_NAME_FUNCIONARIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildLogFuncionarioRelatedInstance4Funcionario(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildLogFuncionarioRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new LogFuncionario(mapper.readValue(relatedInstanceJsonOid, LogFuncionarioOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogFuncionario.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildLogFuncionarioRelatedInstance4Funcionario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Funcionario(mapper.readValue(relatedInstanceJsonOid, FuncionarioOid.class)): Funcionario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogFuncionario.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
