package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.LogPriorizacionSolConstants;
import com.keralty.ae.persistence.oid.LogPriorizacionSolOid;
import com.keralty.ae.persistence.oid.PriorizacionSolicitudesOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>LogPriorizacionSol</code> external model class.
 * <p>
 * External Model Class: <code>LogPriorizacionSol</code><br>
 */
public class LogPriorizacionSol extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id")
    private Long logPriorizacionSolId;

    @JsonProperty(value="fecha")
    private Timestamp logPriorizacionSolFecha;

    @JsonProperty(value="loginfuncionario")
    private String logPriorizacionSolLoginFuncionario;

    @JsonProperty(value="estadosolicitud")
    private Long logPriorizacionSolEstadoSolicitud;

    @JsonProperty(value="estadodoc")
    private Long logPriorizacionSolEstadoDoc;

    @JsonProperty(value="prioridad")
    private Long logPriorizacionSolPrioridad;

    private PriorizacionSolicitudes priSolicitud;

    /**
     * Gets the value of attribute Id
     */
    public Long getLogPriorizacionSolId() {
        return logPriorizacionSolId;
    }
    
    /**
     * Sets the value of attribute Id
     */
    public void setLogPriorizacionSolId(Long logPriorizacionSolId) {
        this.logPriorizacionSolId = logPriorizacionSolId;
    }

    /**
     * Gets the value of attribute Fecha
     */
    public Timestamp getLogPriorizacionSolFecha() {
        return logPriorizacionSolFecha;
    }
    
    /**
     * Sets the value of attribute Fecha
     */
    public void setLogPriorizacionSolFecha(Timestamp logPriorizacionSolFecha) {
        this.logPriorizacionSolFecha = logPriorizacionSolFecha;
    }

    /**
     * Gets the value of attribute LoginFuncionario
     */
    public String getLogPriorizacionSolLoginFuncionario() {
        return logPriorizacionSolLoginFuncionario;
    }
    
    /**
     * Sets the value of attribute LoginFuncionario
     */
    public void setLogPriorizacionSolLoginFuncionario(String logPriorizacionSolLoginFuncionario) {
        this.logPriorizacionSolLoginFuncionario = logPriorizacionSolLoginFuncionario;
    }

    /**
     * Gets the value of attribute EstadoSolicitud
     */
    public Long getLogPriorizacionSolEstadoSolicitud() {
        return logPriorizacionSolEstadoSolicitud;
    }
    
    /**
     * Sets the value of attribute EstadoSolicitud
     */
    public void setLogPriorizacionSolEstadoSolicitud(Long logPriorizacionSolEstadoSolicitud) {
        this.logPriorizacionSolEstadoSolicitud = logPriorizacionSolEstadoSolicitud;
    }

    /**
     * Gets the value of attribute EstadoDoc
     */
    public Long getLogPriorizacionSolEstadoDoc() {
        return logPriorizacionSolEstadoDoc;
    }
    
    /**
     * Sets the value of attribute EstadoDoc
     */
    public void setLogPriorizacionSolEstadoDoc(Long logPriorizacionSolEstadoDoc) {
        this.logPriorizacionSolEstadoDoc = logPriorizacionSolEstadoDoc;
    }

    /**
     * Gets the value of attribute Prioridad
     */
    public Long getLogPriorizacionSolPrioridad() {
        return logPriorizacionSolPrioridad;
    }
    
    /**
     * Sets the value of attribute Prioridad
     */
    public void setLogPriorizacionSolPrioridad(Long logPriorizacionSolPrioridad) {
        this.logPriorizacionSolPrioridad = logPriorizacionSolPrioridad;
    }

    /**
     * Gets the value of relation through role PriSolicitud
     */
    @JsonIgnore
    public PriorizacionSolicitudes getPriSolicitud() {
        return priSolicitud;
    }

    /**
     * Default constructor
     */
    public LogPriorizacionSol() {
        logPriorizacionSolId = null;
    }

    /**
     * Constructor used to create instances of <code>LogPriorizacionSol</code>.
     * @param oid Object Identifier of the instance of <code>LogPriorizacionSol</code> to be created.
     * @throws SystemException
     */
    public LogPriorizacionSol(LogPriorizacionSolOid oid) {
        if (oid != null && !oid.isNull()) {
            logPriorizacionSolId = oid.getLogPriorizacionSolId();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return LogPriorizacionSol.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        LogPriorizacionSol other = (LogPriorizacionSol)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getLogPriorizacionSolId(), other.getLogPriorizacionSolId());
        result &= Utilities.isEqual(this.getLogPriorizacionSolFecha(), other.getLogPriorizacionSolFecha());
        result &= Utilities.isEqual(this.getLogPriorizacionSolLoginFuncionario(), other.getLogPriorizacionSolLoginFuncionario());
        result &= Utilities.isEqual(this.getLogPriorizacionSolEstadoSolicitud(), other.getLogPriorizacionSolEstadoSolicitud());
        result &= Utilities.isEqual(this.getLogPriorizacionSolEstadoDoc(), other.getLogPriorizacionSolEstadoDoc());
        result &= Utilities.isEqual(this.getLogPriorizacionSolPrioridad(), other.getLogPriorizacionSolPrioridad());
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
     * Returns the <code>LogPriorizacionSolOid</code> object that identifies this instance of <code>LogPriorizacionSol</code>.
     * @return <code>LogPriorizacionSolOid</code> object that identifies this instance of <code>LogPriorizacionSol</code>
     */
	@Override
    public LogPriorizacionSolOid getOid() {
        return new LogPriorizacionSolOid(getLogPriorizacionSolId());
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
        if (!activeFacets.contains(Constants.LOGPRIORIZACIONSOL)) {
            activeFacets.add(Constants.LOGPRIORIZACIONSOL);
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
            relatedInstance = buildLogPriorizacionSolRelatedInstance(relatedInstanceJsonOid);
        }
        if (LogPriorizacionSolConstants.ROLE_NAME_PRISOLICITUD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildLogPriorizacionSolRelatedInstance4PriorizacionSolicitudes(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildLogPriorizacionSolRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new LogPriorizacionSol(mapper.readValue(relatedInstanceJsonOid, LogPriorizacionSolOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogPriorizacionSol.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildLogPriorizacionSolRelatedInstance4PriorizacionSolicitudes(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PriorizacionSolicitudes(mapper.readValue(relatedInstanceJsonOid, PriorizacionSolicitudesOid.class)): PriorizacionSolicitudes.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogPriorizacionSol.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
