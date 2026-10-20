package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.LogDatosDominioConstants;
import com.keralty.ae.persistence.oid.DominioOid;
import com.keralty.ae.persistence.oid.LogDatosDominioOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>LogDatosDominio</code> external model class.
 * <p>
 * External Model Class: <code>LogDatosDominio</code><br>
 */
public class LogDatosDominio extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id_logdatosdominio")
    private Long logDatosDominioidLogDatosDominio;

    @JsonProperty(value="loginfuncionario")
    private String logDatosDominioLoginFuncionario;

    @JsonProperty(value="fecha")
    private Timestamp logDatosDominioFecha;

    @JsonProperty(value="tramiteenlinea")
    private Boolean logDatosDominioTramiteEnLinea;

    @JsonProperty(value="vigenciaradicacion")
    private Boolean logDatosDominioVigenciaRadicacion;

    private Dominio dominio;

    /**
     * Gets the value of attribute id_LogDatosDominio
     */
    public Long getLogDatosDominioidLogDatosDominio() {
        return logDatosDominioidLogDatosDominio;
    }
    
    /**
     * Sets the value of attribute id_LogDatosDominio
     */
    public void setLogDatosDominioidLogDatosDominio(Long logDatosDominioidLogDatosDominio) {
        this.logDatosDominioidLogDatosDominio = logDatosDominioidLogDatosDominio;
    }

    /**
     * Gets the value of attribute LoginFuncionario
     */
    public String getLogDatosDominioLoginFuncionario() {
        return logDatosDominioLoginFuncionario;
    }
    
    /**
     * Sets the value of attribute LoginFuncionario
     */
    public void setLogDatosDominioLoginFuncionario(String logDatosDominioLoginFuncionario) {
        this.logDatosDominioLoginFuncionario = logDatosDominioLoginFuncionario;
    }

    /**
     * Gets the value of attribute Fecha
     */
    public Timestamp getLogDatosDominioFecha() {
        return logDatosDominioFecha;
    }
    
    /**
     * Sets the value of attribute Fecha
     */
    public void setLogDatosDominioFecha(Timestamp logDatosDominioFecha) {
        this.logDatosDominioFecha = logDatosDominioFecha;
    }

    /**
     * Gets the value of attribute TramiteEnLinea
     */
    public Boolean getLogDatosDominioTramiteEnLinea() {
        return logDatosDominioTramiteEnLinea;
    }
    
    /**
     * Sets the value of attribute TramiteEnLinea
     */
    public void setLogDatosDominioTramiteEnLinea(Boolean logDatosDominioTramiteEnLinea) {
        this.logDatosDominioTramiteEnLinea = logDatosDominioTramiteEnLinea;
    }

    /**
     * Gets the value of attribute VigenciaRadicacion
     */
    public Boolean getLogDatosDominioVigenciaRadicacion() {
        return logDatosDominioVigenciaRadicacion;
    }
    
    /**
     * Sets the value of attribute VigenciaRadicacion
     */
    public void setLogDatosDominioVigenciaRadicacion(Boolean logDatosDominioVigenciaRadicacion) {
        this.logDatosDominioVigenciaRadicacion = logDatosDominioVigenciaRadicacion;
    }

    /**
     * Gets the value of relation through role Dominio
     */
    @JsonIgnore
    public Dominio getDominio() {
        return dominio;
    }

    /**
     * Default constructor
     */
    public LogDatosDominio() {
        logDatosDominioidLogDatosDominio = null;
    }

    /**
     * Constructor used to create instances of <code>LogDatosDominio</code>.
     * @param oid Object Identifier of the instance of <code>LogDatosDominio</code> to be created.
     * @throws SystemException
     */
    public LogDatosDominio(LogDatosDominioOid oid) {
        if (oid != null && !oid.isNull()) {
            logDatosDominioidLogDatosDominio = oid.getLogDatosDominioidLogDatosDominio();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return LogDatosDominio.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        LogDatosDominio other = (LogDatosDominio)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getLogDatosDominioidLogDatosDominio(), other.getLogDatosDominioidLogDatosDominio());
        result &= Utilities.isEqual(this.getLogDatosDominioLoginFuncionario(), other.getLogDatosDominioLoginFuncionario());
        result &= Utilities.isEqual(this.getLogDatosDominioFecha(), other.getLogDatosDominioFecha());
        result &= Utilities.isEqual(this.getLogDatosDominioTramiteEnLinea(), other.getLogDatosDominioTramiteEnLinea());
        result &= Utilities.isEqual(this.getLogDatosDominioVigenciaRadicacion(), other.getLogDatosDominioVigenciaRadicacion());
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
     * Returns the <code>LogDatosDominioOid</code> object that identifies this instance of <code>LogDatosDominio</code>.
     * @return <code>LogDatosDominioOid</code> object that identifies this instance of <code>LogDatosDominio</code>
     */
	@Override
    public LogDatosDominioOid getOid() {
        return new LogDatosDominioOid(getLogDatosDominioidLogDatosDominio());
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
        if (!activeFacets.contains(Constants.LOGDATOSDOMINIO)) {
            activeFacets.add(Constants.LOGDATOSDOMINIO);
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
            relatedInstance = buildLogDatosDominioRelatedInstance(relatedInstanceJsonOid);
        }
        if (LogDatosDominioConstants.ROLE_NAME_DOMINIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildLogDatosDominioRelatedInstance4Dominio(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildLogDatosDominioRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new LogDatosDominio(mapper.readValue(relatedInstanceJsonOid, LogDatosDominioOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogDatosDominio.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildLogDatosDominioRelatedInstance4Dominio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Dominio(mapper.readValue(relatedInstanceJsonOid, DominioOid.class)): Dominio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogDatosDominio.class).error(e.getMessage());
            return null;
        }
    }
}
