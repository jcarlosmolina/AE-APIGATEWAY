package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.persistence.oid.LogContSinDocSolOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>LogContSinDocSol</code> external model class.
 * <p>
 * External Model Class: <code>LogContSinDocSol</code><br>
 */
public class LogContSinDocSol extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id_logcontsindocsol")
    private Long logContSinDocSolidLogContSinDocSol;

    @JsonProperty(value="numcontrato")
    private String logContSinDocSolNumContrato;

    @JsonProperty(value="fecha")
    private Timestamp logContSinDocSolFecha;

    @JsonProperty(value="usuario")
    private String logContSinDocSolUsuario;

    /**
     * Gets the value of attribute id_LogContSinDocSol
     */
    public Long getLogContSinDocSolidLogContSinDocSol() {
        return logContSinDocSolidLogContSinDocSol;
    }
    
    /**
     * Sets the value of attribute id_LogContSinDocSol
     */
    public void setLogContSinDocSolidLogContSinDocSol(Long logContSinDocSolidLogContSinDocSol) {
        this.logContSinDocSolidLogContSinDocSol = logContSinDocSolidLogContSinDocSol;
    }

    /**
     * Gets the value of attribute NumContrato
     */
    public String getLogContSinDocSolNumContrato() {
        return logContSinDocSolNumContrato;
    }
    
    /**
     * Sets the value of attribute NumContrato
     */
    public void setLogContSinDocSolNumContrato(String logContSinDocSolNumContrato) {
        this.logContSinDocSolNumContrato = logContSinDocSolNumContrato;
    }

    /**
     * Gets the value of attribute Fecha
     */
    public Timestamp getLogContSinDocSolFecha() {
        return logContSinDocSolFecha;
    }
    
    /**
     * Sets the value of attribute Fecha
     */
    public void setLogContSinDocSolFecha(Timestamp logContSinDocSolFecha) {
        this.logContSinDocSolFecha = logContSinDocSolFecha;
    }

    /**
     * Gets the value of attribute Usuario
     */
    public String getLogContSinDocSolUsuario() {
        return logContSinDocSolUsuario;
    }
    
    /**
     * Sets the value of attribute Usuario
     */
    public void setLogContSinDocSolUsuario(String logContSinDocSolUsuario) {
        this.logContSinDocSolUsuario = logContSinDocSolUsuario;
    }

    /**
     * Default constructor
     */
    public LogContSinDocSol() {
        logContSinDocSolidLogContSinDocSol = null;
    }

    /**
     * Constructor used to create instances of <code>LogContSinDocSol</code>.
     * @param oid Object Identifier of the instance of <code>LogContSinDocSol</code> to be created.
     * @throws SystemException
     */
    public LogContSinDocSol(LogContSinDocSolOid oid) {
        if (oid != null && !oid.isNull()) {
            logContSinDocSolidLogContSinDocSol = oid.getLogContSinDocSolidLogContSinDocSol();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return LogContSinDocSol.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        LogContSinDocSol other = (LogContSinDocSol)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getLogContSinDocSolidLogContSinDocSol(), other.getLogContSinDocSolidLogContSinDocSol());
        result &= Utilities.isEqual(this.getLogContSinDocSolNumContrato(), other.getLogContSinDocSolNumContrato());
        result &= Utilities.isEqual(this.getLogContSinDocSolFecha(), other.getLogContSinDocSolFecha());
        result &= Utilities.isEqual(this.getLogContSinDocSolUsuario(), other.getLogContSinDocSolUsuario());
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
     * Returns the <code>LogContSinDocSolOid</code> object that identifies this instance of <code>LogContSinDocSol</code>.
     * @return <code>LogContSinDocSolOid</code> object that identifies this instance of <code>LogContSinDocSol</code>
     */
	@Override
    public LogContSinDocSolOid getOid() {
        return new LogContSinDocSolOid(getLogContSinDocSolidLogContSinDocSol());
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
        if (!activeFacets.contains(Constants.LOGCONTSINDOCSOL)) {
            activeFacets.add(Constants.LOGCONTSINDOCSOL);
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
            relatedInstance = buildLogContSinDocSolRelatedInstance(relatedInstanceJsonOid);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildLogContSinDocSolRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new LogContSinDocSol(mapper.readValue(relatedInstanceJsonOid, LogContSinDocSolOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogContSinDocSol.class).error(e.getMessage());
            return null;
        }
    }
}
