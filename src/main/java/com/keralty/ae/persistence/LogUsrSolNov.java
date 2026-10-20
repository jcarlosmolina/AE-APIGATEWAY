package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.LogUsrSolNovConstants;
import com.keralty.ae.persistence.oid.LogUsrSolNovOid;
import com.keralty.ae.persistence.oid.SolicitudNovedadOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>LogUsrSolNov</code> external model class.
 * <p>
 * External Model Class: <code>LogUsrSolNov</code><br>
 */
public class LogUsrSolNov extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id")
    private Long logUsrSolNovId;

    @JsonProperty(value="fecha")
    private Timestamp logUsrSolNovFecha;

    @JsonProperty(value="loginfuncionario")
    private String logUsrSolNovLoginFuncionario;

    @JsonProperty(value="usuario")
    private String logUsrSolNovUsuario;

    private SolicitudNovedad solicitudNovedad;

    /**
     * Gets the value of attribute Id
     */
    public Long getLogUsrSolNovId() {
        return logUsrSolNovId;
    }
    
    /**
     * Sets the value of attribute Id
     */
    public void setLogUsrSolNovId(Long logUsrSolNovId) {
        this.logUsrSolNovId = logUsrSolNovId;
    }

    /**
     * Gets the value of attribute Fecha
     */
    public Timestamp getLogUsrSolNovFecha() {
        return logUsrSolNovFecha;
    }
    
    /**
     * Sets the value of attribute Fecha
     */
    public void setLogUsrSolNovFecha(Timestamp logUsrSolNovFecha) {
        this.logUsrSolNovFecha = logUsrSolNovFecha;
    }

    /**
     * Gets the value of attribute LoginFuncionario
     */
    public String getLogUsrSolNovLoginFuncionario() {
        return logUsrSolNovLoginFuncionario;
    }
    
    /**
     * Sets the value of attribute LoginFuncionario
     */
    public void setLogUsrSolNovLoginFuncionario(String logUsrSolNovLoginFuncionario) {
        this.logUsrSolNovLoginFuncionario = logUsrSolNovLoginFuncionario;
    }

    /**
     * Gets the value of attribute Usuario
     */
    public String getLogUsrSolNovUsuario() {
        return logUsrSolNovUsuario;
    }
    
    /**
     * Sets the value of attribute Usuario
     */
    public void setLogUsrSolNovUsuario(String logUsrSolNovUsuario) {
        this.logUsrSolNovUsuario = logUsrSolNovUsuario;
    }

    /**
     * Gets the value of relation through role SolicitudNovedad
     */
    @JsonIgnore
    public SolicitudNovedad getSolicitudNovedad() {
        return solicitudNovedad;
    }

    /**
     * Default constructor
     */
    public LogUsrSolNov() {
        logUsrSolNovId = null;
    }

    /**
     * Constructor used to create instances of <code>LogUsrSolNov</code>.
     * @param oid Object Identifier of the instance of <code>LogUsrSolNov</code> to be created.
     * @throws SystemException
     */
    public LogUsrSolNov(LogUsrSolNovOid oid) {
        if (oid != null && !oid.isNull()) {
            logUsrSolNovId = oid.getLogUsrSolNovId();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return LogUsrSolNov.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        LogUsrSolNov other = (LogUsrSolNov)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getLogUsrSolNovId(), other.getLogUsrSolNovId());
        result &= Utilities.isEqual(this.getLogUsrSolNovFecha(), other.getLogUsrSolNovFecha());
        result &= Utilities.isEqual(this.getLogUsrSolNovLoginFuncionario(), other.getLogUsrSolNovLoginFuncionario());
        result &= Utilities.isEqual(this.getLogUsrSolNovUsuario(), other.getLogUsrSolNovUsuario());
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
     * Returns the <code>LogUsrSolNovOid</code> object that identifies this instance of <code>LogUsrSolNov</code>.
     * @return <code>LogUsrSolNovOid</code> object that identifies this instance of <code>LogUsrSolNov</code>
     */
	@Override
    public LogUsrSolNovOid getOid() {
        return new LogUsrSolNovOid(getLogUsrSolNovId());
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
        if (!activeFacets.contains(Constants.LOGUSRSOLNOV)) {
            activeFacets.add(Constants.LOGUSRSOLNOV);
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
            relatedInstance = buildLogUsrSolNovRelatedInstance(relatedInstanceJsonOid);
        }
        if (LogUsrSolNovConstants.ROLE_NAME_SOLICITUDNOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildLogUsrSolNovRelatedInstance4SolicitudNovedad(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildLogUsrSolNovRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new LogUsrSolNov(mapper.readValue(relatedInstanceJsonOid, LogUsrSolNovOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogUsrSolNov.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildLogUsrSolNovRelatedInstance4SolicitudNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new SolicitudNovedad(mapper.readValue(relatedInstanceJsonOid, SolicitudNovedadOid.class)): SolicitudNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogUsrSolNov.class).error(e.getMessage());
            return null;
        }
    }
}
