package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.LogParamConstants;
import com.keralty.ae.persistence.oid.LogParamOid;
import com.keralty.ae.persistence.oid.ParamConfigOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>LogParam</code> external model class.
 * <p>
 * External Model Class: <code>LogParam</code><br>
 */
public class LogParam extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="codigo")
    private Long logParamCodigo;

    @JsonProperty(value="fecha")
    private Date logParamFecha;

    @JsonProperty(value="usuario")
    private String logParamUsuario;

    @JsonProperty(value="nombreusuario")
    private String logParamNombreUsuario;

    @JsonProperty(value="valoranterior")
    private String logParamValorAnterior;

    @JsonProperty(value="nuevovalor")
    private String logParamNuevoValor;

    private ParamConfig paramConfig;

    /**
     * Gets the value of attribute Codigo
     */
    public Long getLogParamCodigo() {
        return logParamCodigo;
    }
    
    /**
     * Sets the value of attribute Codigo
     */
    public void setLogParamCodigo(Long logParamCodigo) {
        this.logParamCodigo = logParamCodigo;
    }

    /**
     * Gets the value of attribute Fecha
     */
    public Date getLogParamFecha() {
        return logParamFecha;
    }
    
    /**
     * Sets the value of attribute Fecha
     */
    public void setLogParamFecha(Date logParamFecha) {
        this.logParamFecha = logParamFecha;
    }

    /**
     * Gets the value of attribute Usuario
     */
    public String getLogParamUsuario() {
        return logParamUsuario;
    }
    
    /**
     * Sets the value of attribute Usuario
     */
    public void setLogParamUsuario(String logParamUsuario) {
        this.logParamUsuario = logParamUsuario;
    }

    /**
     * Gets the value of attribute NombreUsuario
     */
    public String getLogParamNombreUsuario() {
        return logParamNombreUsuario;
    }
    
    /**
     * Sets the value of attribute NombreUsuario
     */
    public void setLogParamNombreUsuario(String logParamNombreUsuario) {
        this.logParamNombreUsuario = logParamNombreUsuario;
    }

    /**
     * Gets the value of attribute ValorAnterior
     */
    public String getLogParamValorAnterior() {
        return logParamValorAnterior;
    }
    
    /**
     * Sets the value of attribute ValorAnterior
     */
    public void setLogParamValorAnterior(String logParamValorAnterior) {
        this.logParamValorAnterior = logParamValorAnterior;
    }

    /**
     * Gets the value of attribute NuevoValor
     */
    public String getLogParamNuevoValor() {
        return logParamNuevoValor;
    }
    
    /**
     * Sets the value of attribute NuevoValor
     */
    public void setLogParamNuevoValor(String logParamNuevoValor) {
        this.logParamNuevoValor = logParamNuevoValor;
    }

    /**
     * Gets the value of relation through role ParamConfig
     */
    @JsonIgnore
    public ParamConfig getParamConfig() {
        return paramConfig;
    }

    /**
     * Default constructor
     */
    public LogParam() {
        logParamCodigo = null;
    }

    /**
     * Constructor used to create instances of <code>LogParam</code>.
     * @param oid Object Identifier of the instance of <code>LogParam</code> to be created.
     * @throws SystemException
     */
    public LogParam(LogParamOid oid) {
        if (oid != null && !oid.isNull()) {
            logParamCodigo = oid.getLogParamCodigo();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return LogParam.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        LogParam other = (LogParam)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getLogParamCodigo(), other.getLogParamCodigo());
        result &= Utilities.isEqual(this.getLogParamFecha(), other.getLogParamFecha());
        result &= Utilities.isEqual(this.getLogParamUsuario(), other.getLogParamUsuario());
        result &= Utilities.isEqual(this.getLogParamNombreUsuario(), other.getLogParamNombreUsuario());
        result &= Utilities.isEqual(this.getLogParamValorAnterior(), other.getLogParamValorAnterior());
        result &= Utilities.isEqual(this.getLogParamNuevoValor(), other.getLogParamNuevoValor());
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
     * Returns the <code>LogParamOid</code> object that identifies this instance of <code>LogParam</code>.
     * @return <code>LogParamOid</code> object that identifies this instance of <code>LogParam</code>
     */
	@Override
    public LogParamOid getOid() {
        return new LogParamOid(getLogParamCodigo());
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
        if (!activeFacets.contains(Constants.LOGPARAM)) {
            activeFacets.add(Constants.LOGPARAM);
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
            relatedInstance = buildLogParamRelatedInstance(relatedInstanceJsonOid);
        }
        if (LogParamConstants.ROLE_NAME_PARAMCONFIG.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildLogParamRelatedInstance4ParamConfig(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildLogParamRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new LogParam(mapper.readValue(relatedInstanceJsonOid, LogParamOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogParam.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildLogParamRelatedInstance4ParamConfig(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ParamConfig(mapper.readValue(relatedInstanceJsonOid, ParamConfigOid.class)): ParamConfig.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogParam.class).error(e.getMessage());
            return null;
        }
    }
}
