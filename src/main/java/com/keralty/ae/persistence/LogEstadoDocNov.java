package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.LogEstadoDocNovConstants;
import com.keralty.ae.persistence.oid.DocumentoNovedadOid;
import com.keralty.ae.persistence.oid.LogEstadoDocNovOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>LogEstadoDocNov</code> external model class.
 * <p>
 * External Model Class: <code>LogEstadoDocNov</code><br>
 */
public class LogEstadoDocNov extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id")
    private Long logEstadoDocNovId;

    @JsonProperty(value="fecha")
    private Timestamp logEstadoDocNovFecha;

    @JsonProperty(value="nombrefuncionario")
    private String logEstadoDocNovNombreFuncionario;

    @JsonProperty(value="estadoanterior")
    private Long logEstadoDocNovEstadoAnterior;

    @JsonProperty(value="estadonuevo")
    private Long logEstadoDocNovEstadoNuevo;

    @JsonProperty(value="observacions")
    private String logEstadoDocNovObservacions;

    private DocumentoNovedad documentoNovedad;

    /**
     * Gets the value of attribute Id
     */
    public Long getLogEstadoDocNovId() {
        return logEstadoDocNovId;
    }
    
    /**
     * Sets the value of attribute Id
     */
    public void setLogEstadoDocNovId(Long logEstadoDocNovId) {
        this.logEstadoDocNovId = logEstadoDocNovId;
    }

    /**
     * Gets the value of attribute Fecha
     */
    public Timestamp getLogEstadoDocNovFecha() {
        return logEstadoDocNovFecha;
    }
    
    /**
     * Sets the value of attribute Fecha
     */
    public void setLogEstadoDocNovFecha(Timestamp logEstadoDocNovFecha) {
        this.logEstadoDocNovFecha = logEstadoDocNovFecha;
    }

    /**
     * Gets the value of attribute NombreFuncionario
     */
    public String getLogEstadoDocNovNombreFuncionario() {
        return logEstadoDocNovNombreFuncionario;
    }
    
    /**
     * Sets the value of attribute NombreFuncionario
     */
    public void setLogEstadoDocNovNombreFuncionario(String logEstadoDocNovNombreFuncionario) {
        this.logEstadoDocNovNombreFuncionario = logEstadoDocNovNombreFuncionario;
    }

    /**
     * Gets the value of attribute EstadoAnterior
     */
    public Long getLogEstadoDocNovEstadoAnterior() {
        return logEstadoDocNovEstadoAnterior;
    }
    
    /**
     * Sets the value of attribute EstadoAnterior
     */
    public void setLogEstadoDocNovEstadoAnterior(Long logEstadoDocNovEstadoAnterior) {
        this.logEstadoDocNovEstadoAnterior = logEstadoDocNovEstadoAnterior;
    }

    /**
     * Gets the value of attribute EstadoNuevo
     */
    public Long getLogEstadoDocNovEstadoNuevo() {
        return logEstadoDocNovEstadoNuevo;
    }
    
    /**
     * Sets the value of attribute EstadoNuevo
     */
    public void setLogEstadoDocNovEstadoNuevo(Long logEstadoDocNovEstadoNuevo) {
        this.logEstadoDocNovEstadoNuevo = logEstadoDocNovEstadoNuevo;
    }

    /**
     * Gets the value of attribute Observacions
     */
    public String getLogEstadoDocNovObservacions() {
        return logEstadoDocNovObservacions;
    }
    
    /**
     * Sets the value of attribute Observacions
     */
    public void setLogEstadoDocNovObservacions(String logEstadoDocNovObservacions) {
        this.logEstadoDocNovObservacions = logEstadoDocNovObservacions;
    }

    /**
     * Gets the value of relation through role DocumentoNovedad
     */
    @JsonIgnore
    public DocumentoNovedad getDocumentoNovedad() {
        return documentoNovedad;
    }

    /**
     * Default constructor
     */
    public LogEstadoDocNov() {
        logEstadoDocNovId = null;
    }

    /**
     * Constructor used to create instances of <code>LogEstadoDocNov</code>.
     * @param oid Object Identifier of the instance of <code>LogEstadoDocNov</code> to be created.
     * @throws SystemException
     */
    public LogEstadoDocNov(LogEstadoDocNovOid oid) {
        if (oid != null && !oid.isNull()) {
            logEstadoDocNovId = oid.getLogEstadoDocNovId();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return LogEstadoDocNov.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        LogEstadoDocNov other = (LogEstadoDocNov)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getLogEstadoDocNovId(), other.getLogEstadoDocNovId());
        result &= Utilities.isEqual(this.getLogEstadoDocNovFecha(), other.getLogEstadoDocNovFecha());
        result &= Utilities.isEqual(this.getLogEstadoDocNovNombreFuncionario(), other.getLogEstadoDocNovNombreFuncionario());
        result &= Utilities.isEqual(this.getLogEstadoDocNovEstadoAnterior(), other.getLogEstadoDocNovEstadoAnterior());
        result &= Utilities.isEqual(this.getLogEstadoDocNovEstadoNuevo(), other.getLogEstadoDocNovEstadoNuevo());
        result &= Utilities.isEqual(this.getLogEstadoDocNovObservacions(), other.getLogEstadoDocNovObservacions());
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
     * Returns the <code>LogEstadoDocNovOid</code> object that identifies this instance of <code>LogEstadoDocNov</code>.
     * @return <code>LogEstadoDocNovOid</code> object that identifies this instance of <code>LogEstadoDocNov</code>
     */
	@Override
    public LogEstadoDocNovOid getOid() {
        return new LogEstadoDocNovOid(getLogEstadoDocNovId());
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
        if (!activeFacets.contains(Constants.LOGESTADODOCNOV)) {
            activeFacets.add(Constants.LOGESTADODOCNOV);
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
            relatedInstance = buildLogEstadoDocNovRelatedInstance(relatedInstanceJsonOid);
        }
        if (LogEstadoDocNovConstants.ROLE_NAME_DOCUMENTONOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildLogEstadoDocNovRelatedInstance4DocumentoNovedad(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildLogEstadoDocNovRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new LogEstadoDocNov(mapper.readValue(relatedInstanceJsonOid, LogEstadoDocNovOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogEstadoDocNov.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildLogEstadoDocNovRelatedInstance4DocumentoNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new DocumentoNovedad(mapper.readValue(relatedInstanceJsonOid, DocumentoNovedadOid.class)): DocumentoNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogEstadoDocNov.class).error(e.getMessage());
            return null;
        }
    }
}
