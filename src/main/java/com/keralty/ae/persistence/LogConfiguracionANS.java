package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.LogConfiguracionANSConstants;
import com.keralty.ae.persistence.oid.ConfiguracionANSOid;
import com.keralty.ae.persistence.oid.LogConfiguracionANSOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>LogConfiguracionANS</code> external model class.
 * <p>
 * External Model Class: <code>LogConfiguracionANS</code><br>
 */
public class LogConfiguracionANS extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id")
    private Long logConfiguracionANSId;

    @JsonProperty(value="fecha")
    private Timestamp logConfiguracionANSFecha;

    @JsonProperty(value="loginfuncionario")
    private String logConfiguracionANSLoginFuncionario;

    @JsonProperty(value="ansafiliaciones")
    private Long logConfiguracionANSANSAfiliaciones;

    @JsonProperty(value="ansareamedica")
    private Long logConfiguracionANSANSAreaMedica;

    @JsonProperty(value="habillunes")
    private Boolean logConfiguracionANSHabilLunes;

    @JsonProperty(value="habilmartes")
    private Boolean logConfiguracionANSHabilMartes;

    @JsonProperty(value="habilmiercoles")
    private Boolean logConfiguracionANSHabilMiercoles;

    @JsonProperty(value="habiljueves")
    private Boolean logConfiguracionANSHabilJueves;

    @JsonProperty(value="habilviernes")
    private Boolean logConfiguracionANSHabilViernes;

    @JsonProperty(value="habilsabado")
    private Boolean logConfiguracionANSHabilSabado;

    @JsonProperty(value="habildomingo")
    private Boolean logConfiguracionANSHabilDomingo;

    private ConfiguracionANS configuracionANS;

    /**
     * Gets the value of attribute Id
     */
    public Long getLogConfiguracionANSId() {
        return logConfiguracionANSId;
    }
    
    /**
     * Sets the value of attribute Id
     */
    public void setLogConfiguracionANSId(Long logConfiguracionANSId) {
        this.logConfiguracionANSId = logConfiguracionANSId;
    }

    /**
     * Gets the value of attribute Fecha
     */
    public Timestamp getLogConfiguracionANSFecha() {
        return logConfiguracionANSFecha;
    }
    
    /**
     * Sets the value of attribute Fecha
     */
    public void setLogConfiguracionANSFecha(Timestamp logConfiguracionANSFecha) {
        this.logConfiguracionANSFecha = logConfiguracionANSFecha;
    }

    /**
     * Gets the value of attribute LoginFuncionario
     */
    public String getLogConfiguracionANSLoginFuncionario() {
        return logConfiguracionANSLoginFuncionario;
    }
    
    /**
     * Sets the value of attribute LoginFuncionario
     */
    public void setLogConfiguracionANSLoginFuncionario(String logConfiguracionANSLoginFuncionario) {
        this.logConfiguracionANSLoginFuncionario = logConfiguracionANSLoginFuncionario;
    }

    /**
     * Gets the value of attribute ANSAfiliaciones
     */
    public Long getLogConfiguracionANSANSAfiliaciones() {
        return logConfiguracionANSANSAfiliaciones;
    }
    
    /**
     * Sets the value of attribute ANSAfiliaciones
     */
    public void setLogConfiguracionANSANSAfiliaciones(Long logConfiguracionANSANSAfiliaciones) {
        this.logConfiguracionANSANSAfiliaciones = logConfiguracionANSANSAfiliaciones;
    }

    /**
     * Gets the value of attribute ANSAreaMedica
     */
    public Long getLogConfiguracionANSANSAreaMedica() {
        return logConfiguracionANSANSAreaMedica;
    }
    
    /**
     * Sets the value of attribute ANSAreaMedica
     */
    public void setLogConfiguracionANSANSAreaMedica(Long logConfiguracionANSANSAreaMedica) {
        this.logConfiguracionANSANSAreaMedica = logConfiguracionANSANSAreaMedica;
    }

    /**
     * Gets the value of attribute HabilLunes
     */
    public Boolean getLogConfiguracionANSHabilLunes() {
        return logConfiguracionANSHabilLunes;
    }
    
    /**
     * Sets the value of attribute HabilLunes
     */
    public void setLogConfiguracionANSHabilLunes(Boolean logConfiguracionANSHabilLunes) {
        this.logConfiguracionANSHabilLunes = logConfiguracionANSHabilLunes;
    }

    /**
     * Gets the value of attribute HabilMartes
     */
    public Boolean getLogConfiguracionANSHabilMartes() {
        return logConfiguracionANSHabilMartes;
    }
    
    /**
     * Sets the value of attribute HabilMartes
     */
    public void setLogConfiguracionANSHabilMartes(Boolean logConfiguracionANSHabilMartes) {
        this.logConfiguracionANSHabilMartes = logConfiguracionANSHabilMartes;
    }

    /**
     * Gets the value of attribute HabilMiercoles
     */
    public Boolean getLogConfiguracionANSHabilMiercoles() {
        return logConfiguracionANSHabilMiercoles;
    }
    
    /**
     * Sets the value of attribute HabilMiercoles
     */
    public void setLogConfiguracionANSHabilMiercoles(Boolean logConfiguracionANSHabilMiercoles) {
        this.logConfiguracionANSHabilMiercoles = logConfiguracionANSHabilMiercoles;
    }

    /**
     * Gets the value of attribute HabilJueves
     */
    public Boolean getLogConfiguracionANSHabilJueves() {
        return logConfiguracionANSHabilJueves;
    }
    
    /**
     * Sets the value of attribute HabilJueves
     */
    public void setLogConfiguracionANSHabilJueves(Boolean logConfiguracionANSHabilJueves) {
        this.logConfiguracionANSHabilJueves = logConfiguracionANSHabilJueves;
    }

    /**
     * Gets the value of attribute HabilViernes
     */
    public Boolean getLogConfiguracionANSHabilViernes() {
        return logConfiguracionANSHabilViernes;
    }
    
    /**
     * Sets the value of attribute HabilViernes
     */
    public void setLogConfiguracionANSHabilViernes(Boolean logConfiguracionANSHabilViernes) {
        this.logConfiguracionANSHabilViernes = logConfiguracionANSHabilViernes;
    }

    /**
     * Gets the value of attribute HabilSabado
     */
    public Boolean getLogConfiguracionANSHabilSabado() {
        return logConfiguracionANSHabilSabado;
    }
    
    /**
     * Sets the value of attribute HabilSabado
     */
    public void setLogConfiguracionANSHabilSabado(Boolean logConfiguracionANSHabilSabado) {
        this.logConfiguracionANSHabilSabado = logConfiguracionANSHabilSabado;
    }

    /**
     * Gets the value of attribute HabilDomingo
     */
    public Boolean getLogConfiguracionANSHabilDomingo() {
        return logConfiguracionANSHabilDomingo;
    }
    
    /**
     * Sets the value of attribute HabilDomingo
     */
    public void setLogConfiguracionANSHabilDomingo(Boolean logConfiguracionANSHabilDomingo) {
        this.logConfiguracionANSHabilDomingo = logConfiguracionANSHabilDomingo;
    }

    /**
     * Gets the value of relation through role ConfiguracionANS
     */
    @JsonIgnore
    public ConfiguracionANS getConfiguracionANS() {
        return configuracionANS;
    }

    /**
     * Default constructor
     */
    public LogConfiguracionANS() {
        logConfiguracionANSId = null;
    }

    /**
     * Constructor used to create instances of <code>LogConfiguracionANS</code>.
     * @param oid Object Identifier of the instance of <code>LogConfiguracionANS</code> to be created.
     * @throws SystemException
     */
    public LogConfiguracionANS(LogConfiguracionANSOid oid) {
        if (oid != null && !oid.isNull()) {
            logConfiguracionANSId = oid.getLogConfiguracionANSId();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return LogConfiguracionANS.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        LogConfiguracionANS other = (LogConfiguracionANS)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getLogConfiguracionANSId(), other.getLogConfiguracionANSId());
        result &= Utilities.isEqual(this.getLogConfiguracionANSFecha(), other.getLogConfiguracionANSFecha());
        result &= Utilities.isEqual(this.getLogConfiguracionANSLoginFuncionario(), other.getLogConfiguracionANSLoginFuncionario());
        result &= Utilities.isEqual(this.getLogConfiguracionANSANSAfiliaciones(), other.getLogConfiguracionANSANSAfiliaciones());
        result &= Utilities.isEqual(this.getLogConfiguracionANSANSAreaMedica(), other.getLogConfiguracionANSANSAreaMedica());
        result &= Utilities.isEqual(this.getLogConfiguracionANSHabilLunes(), other.getLogConfiguracionANSHabilLunes());
        result &= Utilities.isEqual(this.getLogConfiguracionANSHabilMartes(), other.getLogConfiguracionANSHabilMartes());
        result &= Utilities.isEqual(this.getLogConfiguracionANSHabilMiercoles(), other.getLogConfiguracionANSHabilMiercoles());
        result &= Utilities.isEqual(this.getLogConfiguracionANSHabilJueves(), other.getLogConfiguracionANSHabilJueves());
        result &= Utilities.isEqual(this.getLogConfiguracionANSHabilViernes(), other.getLogConfiguracionANSHabilViernes());
        result &= Utilities.isEqual(this.getLogConfiguracionANSHabilSabado(), other.getLogConfiguracionANSHabilSabado());
        result &= Utilities.isEqual(this.getLogConfiguracionANSHabilDomingo(), other.getLogConfiguracionANSHabilDomingo());
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
     * Returns the <code>LogConfiguracionANSOid</code> object that identifies this instance of <code>LogConfiguracionANS</code>.
     * @return <code>LogConfiguracionANSOid</code> object that identifies this instance of <code>LogConfiguracionANS</code>
     */
	@Override
    public LogConfiguracionANSOid getOid() {
        return new LogConfiguracionANSOid(getLogConfiguracionANSId());
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
        if (!activeFacets.contains(Constants.LOGCONFIGURACIONANS)) {
            activeFacets.add(Constants.LOGCONFIGURACIONANS);
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
            relatedInstance = buildLogConfiguracionANSRelatedInstance(relatedInstanceJsonOid);
        }
        if (LogConfiguracionANSConstants.ROLE_NAME_CONFIGURACIONANS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildLogConfiguracionANSRelatedInstance4ConfiguracionANS(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildLogConfiguracionANSRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new LogConfiguracionANS(mapper.readValue(relatedInstanceJsonOid, LogConfiguracionANSOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogConfiguracionANS.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildLogConfiguracionANSRelatedInstance4ConfiguracionANS(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ConfiguracionANS(mapper.readValue(relatedInstanceJsonOid, ConfiguracionANSOid.class)): ConfiguracionANS.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogConfiguracionANS.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
