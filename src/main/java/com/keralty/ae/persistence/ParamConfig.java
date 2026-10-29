package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.ParamConfigConstants;
import com.keralty.ae.persistence.oid.LogParamOid;
import com.keralty.ae.persistence.oid.ParamConfigOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>ParamConfig</code> external model class.
 * <p>
 * External Model Class: <code>ParamConfig</code><br>
 */
public class ParamConfig extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="codigo")
    private String paramConfigCodigo;

    @JsonProperty(value="descripcion")
    private String paramConfigDescripcion;

    @JsonProperty(value="valor")
    private String paramConfigValor;

    @JsonProperty(value="esnumerico")
    private Boolean paramConfigEsNumerico;

    private Collection <LogParam> logs;

    /**
     * Gets the value of attribute Codigo
     */
    public String getParamConfigCodigo() {
        return paramConfigCodigo;
    }
    
    /**
     * Sets the value of attribute Codigo
     */
    public void setParamConfigCodigo(String paramConfigCodigo) {
        this.paramConfigCodigo = paramConfigCodigo;
    }

    /**
     * Gets the value of attribute Descripcion
     */
    public String getParamConfigDescripcion() {
        return paramConfigDescripcion;
    }
    
    /**
     * Sets the value of attribute Descripcion
     */
    public void setParamConfigDescripcion(String paramConfigDescripcion) {
        this.paramConfigDescripcion = paramConfigDescripcion;
    }

    /**
     * Gets the value of attribute Valor
     */
    public String getParamConfigValor() {
        return paramConfigValor;
    }
    
    /**
     * Sets the value of attribute Valor
     */
    public void setParamConfigValor(String paramConfigValor) {
        this.paramConfigValor = paramConfigValor;
    }

    /**
     * Gets the value of attribute EsNumerico
     */
    public Boolean getParamConfigEsNumerico() {
        return paramConfigEsNumerico;
    }
    
    /**
     * Sets the value of attribute EsNumerico
     */
    public void setParamConfigEsNumerico(Boolean paramConfigEsNumerico) {
        this.paramConfigEsNumerico = paramConfigEsNumerico;
    }

    /**
     * Gets the value of relation through role Logs
     */
    @JsonIgnore
    public Collection <LogParam> getLogs() {
        return logs;
    }

    /**
     * Default constructor
     */
    public ParamConfig() {
        paramConfigCodigo = null;
    }

    /**
     * Constructor used to create instances of <code>ParamConfig</code>.
     * @param oid Object Identifier of the instance of <code>ParamConfig</code> to be created.
     * @throws SystemException
     */
    public ParamConfig(ParamConfigOid oid) {
        if (oid != null && !oid.isNull()) {
            paramConfigCodigo = oid.getParamConfigCodigo();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return ParamConfig.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        ParamConfig other = (ParamConfig)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getParamConfigCodigo(), other.getParamConfigCodigo());
        result &= Utilities.isEqual(this.getParamConfigDescripcion(), other.getParamConfigDescripcion());
        result &= Utilities.isEqual(this.getParamConfigValor(), other.getParamConfigValor());
        result &= Utilities.isEqual(this.getParamConfigEsNumerico(), other.getParamConfigEsNumerico());
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
     * Returns the <code>ParamConfigOid</code> object that identifies this instance of <code>ParamConfig</code>.
     * @return <code>ParamConfigOid</code> object that identifies this instance of <code>ParamConfig</code>
     */
	@Override
    public ParamConfigOid getOid() {
        return new ParamConfigOid(getParamConfigCodigo());
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
        if (!activeFacets.contains(Constants.PARAMCONFIG)) {
            activeFacets.add(Constants.PARAMCONFIG);
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
            relatedInstance = buildParamConfigRelatedInstance(relatedInstanceJsonOid);
        }
        if (ParamConfigConstants.ROLE_NAME_LOGS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildParamConfigRelatedInstance4LogParam(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildParamConfigRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new ParamConfig(mapper.readValue(relatedInstanceJsonOid, ParamConfigOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ParamConfig.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildParamConfigRelatedInstance4LogParam(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new LogParam(mapper.readValue(relatedInstanceJsonOid, LogParamOid.class)): LogParam.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ParamConfig.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
