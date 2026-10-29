package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.LogEstadoSNConstants;
import com.keralty.ae.persistence.oid.LogEstadoSNOid;
import com.keralty.ae.persistence.oid.SolicitudNovedadOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>LogEstadoSN</code> external model class.
 * <p>
 * External Model Class: <code>LogEstadoSN</code><br>
 */
public class LogEstadoSN extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id")
    private Long logEstadoSNId;

    @JsonProperty(value="fecha")
    private Timestamp logEstadoSNFecha;

    @JsonProperty(value="loginfuncionario")
    private String logEstadoSNLoginFuncionario;

    @JsonProperty(value="estado")
    private Long logEstadoSNEstado;

    @JsonProperty(value="estadodoc")
    private Long logEstadoSNEstadoDoc;

    private SolicitudNovedad solicitudNovedad;

    /**
     * Gets the value of attribute Id
     */
    public Long getLogEstadoSNId() {
        return logEstadoSNId;
    }
    
    /**
     * Sets the value of attribute Id
     */
    public void setLogEstadoSNId(Long logEstadoSNId) {
        this.logEstadoSNId = logEstadoSNId;
    }

    /**
     * Gets the value of attribute Fecha
     */
    public Timestamp getLogEstadoSNFecha() {
        return logEstadoSNFecha;
    }
    
    /**
     * Sets the value of attribute Fecha
     */
    public void setLogEstadoSNFecha(Timestamp logEstadoSNFecha) {
        this.logEstadoSNFecha = logEstadoSNFecha;
    }

    /**
     * Gets the value of attribute LoginFuncionario
     */
    public String getLogEstadoSNLoginFuncionario() {
        return logEstadoSNLoginFuncionario;
    }
    
    /**
     * Sets the value of attribute LoginFuncionario
     */
    public void setLogEstadoSNLoginFuncionario(String logEstadoSNLoginFuncionario) {
        this.logEstadoSNLoginFuncionario = logEstadoSNLoginFuncionario;
    }

    /**
     * Gets the value of attribute Estado
     */
    public Long getLogEstadoSNEstado() {
        return logEstadoSNEstado;
    }
    
    /**
     * Sets the value of attribute Estado
     */
    public void setLogEstadoSNEstado(Long logEstadoSNEstado) {
        this.logEstadoSNEstado = logEstadoSNEstado;
    }

    /**
     * Gets the value of attribute EstadoDoc
     */
    public Long getLogEstadoSNEstadoDoc() {
        return logEstadoSNEstadoDoc;
    }
    
    /**
     * Sets the value of attribute EstadoDoc
     */
    public void setLogEstadoSNEstadoDoc(Long logEstadoSNEstadoDoc) {
        this.logEstadoSNEstadoDoc = logEstadoSNEstadoDoc;
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
    public LogEstadoSN() {
        logEstadoSNId = null;
    }

    /**
     * Constructor used to create instances of <code>LogEstadoSN</code>.
     * @param oid Object Identifier of the instance of <code>LogEstadoSN</code> to be created.
     * @throws SystemException
     */
    public LogEstadoSN(LogEstadoSNOid oid) {
        if (oid != null && !oid.isNull()) {
            logEstadoSNId = oid.getLogEstadoSNId();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return LogEstadoSN.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        LogEstadoSN other = (LogEstadoSN)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getLogEstadoSNId(), other.getLogEstadoSNId());
        result &= Utilities.isEqual(this.getLogEstadoSNFecha(), other.getLogEstadoSNFecha());
        result &= Utilities.isEqual(this.getLogEstadoSNLoginFuncionario(), other.getLogEstadoSNLoginFuncionario());
        result &= Utilities.isEqual(this.getLogEstadoSNEstado(), other.getLogEstadoSNEstado());
        result &= Utilities.isEqual(this.getLogEstadoSNEstadoDoc(), other.getLogEstadoSNEstadoDoc());
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
     * Returns the <code>LogEstadoSNOid</code> object that identifies this instance of <code>LogEstadoSN</code>.
     * @return <code>LogEstadoSNOid</code> object that identifies this instance of <code>LogEstadoSN</code>
     */
	@Override
    public LogEstadoSNOid getOid() {
        return new LogEstadoSNOid(getLogEstadoSNId());
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
        if (!activeFacets.contains(Constants.LOGESTADOSN)) {
            activeFacets.add(Constants.LOGESTADOSN);
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
            relatedInstance = buildLogEstadoSNRelatedInstance(relatedInstanceJsonOid);
        }
        if (LogEstadoSNConstants.ROLE_NAME_SOLICITUDNOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildLogEstadoSNRelatedInstance4SolicitudNovedad(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildLogEstadoSNRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new LogEstadoSN(mapper.readValue(relatedInstanceJsonOid, LogEstadoSNOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogEstadoSN.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildLogEstadoSNRelatedInstance4SolicitudNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new SolicitudNovedad(mapper.readValue(relatedInstanceJsonOid, SolicitudNovedadOid.class)): SolicitudNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogEstadoSN.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
