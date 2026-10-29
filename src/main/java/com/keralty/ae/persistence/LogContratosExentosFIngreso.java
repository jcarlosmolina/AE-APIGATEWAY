package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.persistence.oid.LogContratosExentosFIngresoOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>LogContratosExentosFIngreso</code> external model class.
 * <p>
 * External Model Class: <code>LogContratosExentosFIngreso</code><br>
 */
public class LogContratosExentosFIngreso extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id_logcontratosexentosfingreso")
    private Long logContratosExentosFIngresoidLogContratosExentosFIngreso;

    @JsonProperty(value="fecha")
    private Timestamp logContratosExentosFIngresoFecha;

    @JsonProperty(value="loginfuncionario")
    private String logContratosExentosFIngresoLoginFuncionario;

    @JsonProperty(value="accion")
    private String logContratosExentosFIngresoAccion;

    @JsonProperty(value="numcontrato")
    private String logContratosExentosFIngresoNumContrato;

    /**
     * Gets the value of attribute id_LogContratosExentosFIngreso
     */
    public Long getLogContratosExentosFIngresoidLogContratosExentosFIngreso() {
        return logContratosExentosFIngresoidLogContratosExentosFIngreso;
    }
    
    /**
     * Sets the value of attribute id_LogContratosExentosFIngreso
     */
    public void setLogContratosExentosFIngresoidLogContratosExentosFIngreso(Long logContratosExentosFIngresoidLogContratosExentosFIngreso) {
        this.logContratosExentosFIngresoidLogContratosExentosFIngreso = logContratosExentosFIngresoidLogContratosExentosFIngreso;
    }

    /**
     * Gets the value of attribute Fecha
     */
    public Timestamp getLogContratosExentosFIngresoFecha() {
        return logContratosExentosFIngresoFecha;
    }
    
    /**
     * Sets the value of attribute Fecha
     */
    public void setLogContratosExentosFIngresoFecha(Timestamp logContratosExentosFIngresoFecha) {
        this.logContratosExentosFIngresoFecha = logContratosExentosFIngresoFecha;
    }

    /**
     * Gets the value of attribute LoginFuncionario
     */
    public String getLogContratosExentosFIngresoLoginFuncionario() {
        return logContratosExentosFIngresoLoginFuncionario;
    }
    
    /**
     * Sets the value of attribute LoginFuncionario
     */
    public void setLogContratosExentosFIngresoLoginFuncionario(String logContratosExentosFIngresoLoginFuncionario) {
        this.logContratosExentosFIngresoLoginFuncionario = logContratosExentosFIngresoLoginFuncionario;
    }

    /**
     * Gets the value of attribute Accion
     */
    public String getLogContratosExentosFIngresoAccion() {
        return logContratosExentosFIngresoAccion;
    }
    
    /**
     * Sets the value of attribute Accion
     */
    public void setLogContratosExentosFIngresoAccion(String logContratosExentosFIngresoAccion) {
        this.logContratosExentosFIngresoAccion = logContratosExentosFIngresoAccion;
    }

    /**
     * Gets the value of attribute NumContrato
     */
    public String getLogContratosExentosFIngresoNumContrato() {
        return logContratosExentosFIngresoNumContrato;
    }
    
    /**
     * Sets the value of attribute NumContrato
     */
    public void setLogContratosExentosFIngresoNumContrato(String logContratosExentosFIngresoNumContrato) {
        this.logContratosExentosFIngresoNumContrato = logContratosExentosFIngresoNumContrato;
    }

    /**
     * Default constructor
     */
    public LogContratosExentosFIngreso() {
        logContratosExentosFIngresoidLogContratosExentosFIngreso = null;
    }

    /**
     * Constructor used to create instances of <code>LogContratosExentosFIngreso</code>.
     * @param oid Object Identifier of the instance of <code>LogContratosExentosFIngreso</code> to be created.
     * @throws SystemException
     */
    public LogContratosExentosFIngreso(LogContratosExentosFIngresoOid oid) {
        if (oid != null && !oid.isNull()) {
            logContratosExentosFIngresoidLogContratosExentosFIngreso = oid.getLogContratosExentosFIngresoidLogContratosExentosFIngreso();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return LogContratosExentosFIngreso.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        LogContratosExentosFIngreso other = (LogContratosExentosFIngreso)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getLogContratosExentosFIngresoidLogContratosExentosFIngreso(), other.getLogContratosExentosFIngresoidLogContratosExentosFIngreso());
        result &= Utilities.isEqual(this.getLogContratosExentosFIngresoFecha(), other.getLogContratosExentosFIngresoFecha());
        result &= Utilities.isEqual(this.getLogContratosExentosFIngresoLoginFuncionario(), other.getLogContratosExentosFIngresoLoginFuncionario());
        result &= Utilities.isEqual(this.getLogContratosExentosFIngresoAccion(), other.getLogContratosExentosFIngresoAccion());
        result &= Utilities.isEqual(this.getLogContratosExentosFIngresoNumContrato(), other.getLogContratosExentosFIngresoNumContrato());
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
     * Returns the <code>LogContratosExentosFIngresoOid</code> object that identifies this instance of <code>LogContratosExentosFIngreso</code>.
     * @return <code>LogContratosExentosFIngresoOid</code> object that identifies this instance of <code>LogContratosExentosFIngreso</code>
     */
	@Override
    public LogContratosExentosFIngresoOid getOid() {
        return new LogContratosExentosFIngresoOid(getLogContratosExentosFIngresoidLogContratosExentosFIngreso());
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
        if (!activeFacets.contains(Constants.LOGCONTRATOSEXENTOSFINGRESO)) {
            activeFacets.add(Constants.LOGCONTRATOSEXENTOSFINGRESO);
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
            relatedInstance = buildLogContratosExentosFIngresoRelatedInstance(relatedInstanceJsonOid);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildLogContratosExentosFIngresoRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new LogContratosExentosFIngreso(mapper.readValue(relatedInstanceJsonOid, LogContratosExentosFIngresoOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogContratosExentosFIngreso.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
