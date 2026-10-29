package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.ConfiguracionANSConstants;
import com.keralty.ae.global.Constants;
import com.keralty.ae.persistence.oid.CausalOid;
import com.keralty.ae.persistence.oid.ConfiguracionANSOid;
import com.keralty.ae.persistence.oid.DominioOid;
import com.keralty.ae.persistence.oid.LogConfiguracionANSOid;
import com.keralty.ae.persistence.oid.NovedadOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>ConfiguracionANS</code> external model class.
 * <p>
 * External Model Class: <code>ConfiguracionANS</code><br>
 */
public class ConfiguracionANS extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id")
    private Long configuracionANSId;

    @JsonProperty(value="tramite")
    private Long configuracionANSTramite;

    @JsonProperty(value="ansafiliaciones")
    private Long configuracionANSANSAfiliaciones;

    @JsonProperty(value="ansareamedica")
    private Long configuracionANSANSAreaMedica;

    @JsonProperty(value="habillunes")
    private Boolean configuracionANSHabilLunes;

    @JsonProperty(value="habilmartes")
    private Boolean configuracionANSHabilMartes;

    @JsonProperty(value="habilmiercoles")
    private Boolean configuracionANSHabilMiercoles;

    @JsonProperty(value="habiljueves")
    private Boolean configuracionANSHabilJueves;

    @JsonProperty(value="habilviernes")
    private Boolean configuracionANSHabilViernes;

    @JsonProperty(value="habilsabado")
    private Boolean configuracionANSHabilSabado;

    @JsonProperty(value="habildomingo")
    private Boolean configuracionANSHabilDomingo;

    @JsonProperty(value="drvtienecausal")
    private Boolean configuracionANSdrvTieneCausal;

    private Collection <LogConfiguracionANS> logConfiguracionANS;

    private Dominio dominio;

    private Novedad novedad;

    private Causal causal;

    /**
     * Gets the value of attribute Id
     */
    public Long getConfiguracionANSId() {
        return configuracionANSId;
    }
    
    /**
     * Sets the value of attribute Id
     */
    public void setConfiguracionANSId(Long configuracionANSId) {
        this.configuracionANSId = configuracionANSId;
    }

    /**
     * Gets the value of attribute Tramite
     */
    public Long getConfiguracionANSTramite() {
        return configuracionANSTramite;
    }
    
    /**
     * Sets the value of attribute Tramite
     */
    public void setConfiguracionANSTramite(Long configuracionANSTramite) {
        this.configuracionANSTramite = configuracionANSTramite;
    }

    /**
     * Gets the value of attribute ANSAfiliaciones
     */
    public Long getConfiguracionANSANSAfiliaciones() {
        return configuracionANSANSAfiliaciones;
    }
    
    /**
     * Sets the value of attribute ANSAfiliaciones
     */
    public void setConfiguracionANSANSAfiliaciones(Long configuracionANSANSAfiliaciones) {
        this.configuracionANSANSAfiliaciones = configuracionANSANSAfiliaciones;
    }

    /**
     * Gets the value of attribute ANSAreaMedica
     */
    public Long getConfiguracionANSANSAreaMedica() {
        return configuracionANSANSAreaMedica;
    }
    
    /**
     * Sets the value of attribute ANSAreaMedica
     */
    public void setConfiguracionANSANSAreaMedica(Long configuracionANSANSAreaMedica) {
        this.configuracionANSANSAreaMedica = configuracionANSANSAreaMedica;
    }

    /**
     * Gets the value of attribute HabilLunes
     */
    public Boolean getConfiguracionANSHabilLunes() {
        return configuracionANSHabilLunes;
    }
    
    /**
     * Sets the value of attribute HabilLunes
     */
    public void setConfiguracionANSHabilLunes(Boolean configuracionANSHabilLunes) {
        this.configuracionANSHabilLunes = configuracionANSHabilLunes;
    }

    /**
     * Gets the value of attribute HabilMartes
     */
    public Boolean getConfiguracionANSHabilMartes() {
        return configuracionANSHabilMartes;
    }
    
    /**
     * Sets the value of attribute HabilMartes
     */
    public void setConfiguracionANSHabilMartes(Boolean configuracionANSHabilMartes) {
        this.configuracionANSHabilMartes = configuracionANSHabilMartes;
    }

    /**
     * Gets the value of attribute HabilMiercoles
     */
    public Boolean getConfiguracionANSHabilMiercoles() {
        return configuracionANSHabilMiercoles;
    }
    
    /**
     * Sets the value of attribute HabilMiercoles
     */
    public void setConfiguracionANSHabilMiercoles(Boolean configuracionANSHabilMiercoles) {
        this.configuracionANSHabilMiercoles = configuracionANSHabilMiercoles;
    }

    /**
     * Gets the value of attribute HabilJueves
     */
    public Boolean getConfiguracionANSHabilJueves() {
        return configuracionANSHabilJueves;
    }
    
    /**
     * Sets the value of attribute HabilJueves
     */
    public void setConfiguracionANSHabilJueves(Boolean configuracionANSHabilJueves) {
        this.configuracionANSHabilJueves = configuracionANSHabilJueves;
    }

    /**
     * Gets the value of attribute HabilViernes
     */
    public Boolean getConfiguracionANSHabilViernes() {
        return configuracionANSHabilViernes;
    }
    
    /**
     * Sets the value of attribute HabilViernes
     */
    public void setConfiguracionANSHabilViernes(Boolean configuracionANSHabilViernes) {
        this.configuracionANSHabilViernes = configuracionANSHabilViernes;
    }

    /**
     * Gets the value of attribute HabilSabado
     */
    public Boolean getConfiguracionANSHabilSabado() {
        return configuracionANSHabilSabado;
    }
    
    /**
     * Sets the value of attribute HabilSabado
     */
    public void setConfiguracionANSHabilSabado(Boolean configuracionANSHabilSabado) {
        this.configuracionANSHabilSabado = configuracionANSHabilSabado;
    }

    /**
     * Gets the value of attribute HabilDomingo
     */
    public Boolean getConfiguracionANSHabilDomingo() {
        return configuracionANSHabilDomingo;
    }
    
    /**
     * Sets the value of attribute HabilDomingo
     */
    public void setConfiguracionANSHabilDomingo(Boolean configuracionANSHabilDomingo) {
        this.configuracionANSHabilDomingo = configuracionANSHabilDomingo;
    }

    /**
     * Gets the value of attribute drvTieneCausal
     */
    public Boolean getConfiguracionANSdrvTieneCausal() {
        return configuracionANSdrvTieneCausal;
    }
    
    /**
     * Sets the value of attribute drvTieneCausal
     */
    public void setConfiguracionANSdrvTieneCausal(Boolean configuracionANSdrvTieneCausal) {
        this.configuracionANSdrvTieneCausal = configuracionANSdrvTieneCausal;
    }

    /**
     * Gets the value of relation through role LogConfiguracionANS
     */
    @JsonIgnore
    public Collection <LogConfiguracionANS> getLogConfiguracionANS() {
        return logConfiguracionANS;
    }

    /**
     * Gets the value of relation through role Dominio
     */
    @JsonIgnore
    public Dominio getDominio() {
        return dominio;
    }

    /**
     * Gets the value of relation through role Novedad
     */
    @JsonIgnore
    public Novedad getNovedad() {
        return novedad;
    }

    /**
     * Gets the value of relation through role Causal
     */
    @JsonIgnore
    public Causal getCausal() {
        return causal;
    }

    /**
     * Default constructor
     */
    public ConfiguracionANS() {
        configuracionANSId = null;
    }

    /**
     * Constructor used to create instances of <code>ConfiguracionANS</code>.
     * @param oid Object Identifier of the instance of <code>ConfiguracionANS</code> to be created.
     * @throws SystemException
     */
    public ConfiguracionANS(ConfiguracionANSOid oid) {
        if (oid != null && !oid.isNull()) {
            configuracionANSId = oid.getConfiguracionANSId();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return ConfiguracionANS.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        ConfiguracionANS other = (ConfiguracionANS)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getConfiguracionANSId(), other.getConfiguracionANSId());
        result &= Utilities.isEqual(this.getConfiguracionANSTramite(), other.getConfiguracionANSTramite());
        result &= Utilities.isEqual(this.getConfiguracionANSANSAfiliaciones(), other.getConfiguracionANSANSAfiliaciones());
        result &= Utilities.isEqual(this.getConfiguracionANSANSAreaMedica(), other.getConfiguracionANSANSAreaMedica());
        result &= Utilities.isEqual(this.getConfiguracionANSHabilLunes(), other.getConfiguracionANSHabilLunes());
        result &= Utilities.isEqual(this.getConfiguracionANSHabilMartes(), other.getConfiguracionANSHabilMartes());
        result &= Utilities.isEqual(this.getConfiguracionANSHabilMiercoles(), other.getConfiguracionANSHabilMiercoles());
        result &= Utilities.isEqual(this.getConfiguracionANSHabilJueves(), other.getConfiguracionANSHabilJueves());
        result &= Utilities.isEqual(this.getConfiguracionANSHabilViernes(), other.getConfiguracionANSHabilViernes());
        result &= Utilities.isEqual(this.getConfiguracionANSHabilSabado(), other.getConfiguracionANSHabilSabado());
        result &= Utilities.isEqual(this.getConfiguracionANSHabilDomingo(), other.getConfiguracionANSHabilDomingo());
        result &= Utilities.isEqual(this.getConfiguracionANSdrvTieneCausal(), other.getConfiguracionANSdrvTieneCausal());
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
     * Returns the <code>ConfiguracionANSOid</code> object that identifies this instance of <code>ConfiguracionANS</code>.
     * @return <code>ConfiguracionANSOid</code> object that identifies this instance of <code>ConfiguracionANS</code>
     */
	@Override
    public ConfiguracionANSOid getOid() {
        return new ConfiguracionANSOid(getConfiguracionANSId());
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
        if (!activeFacets.contains(Constants.CONFIGURACIONANS)) {
            activeFacets.add(Constants.CONFIGURACIONANS);
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
            relatedInstance = buildConfiguracionANSRelatedInstance(relatedInstanceJsonOid);
        }
        if (ConfiguracionANSConstants.ROLE_NAME_LOGCONFIGURACIONANS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildConfiguracionANSRelatedInstance4LogConfiguracionANS(relatedInstanceJsonOid, remainingPath);
        }
        if (ConfiguracionANSConstants.ROLE_NAME_DOMINIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildConfiguracionANSRelatedInstance4Dominio(relatedInstanceJsonOid, remainingPath);
        }
        if (ConfiguracionANSConstants.ROLE_NAME_NOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildConfiguracionANSRelatedInstance4Novedad(relatedInstanceJsonOid, remainingPath);
        }
        if (ConfiguracionANSConstants.ROLE_NAME_CAUSAL.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildConfiguracionANSRelatedInstance4Causal(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildConfiguracionANSRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new ConfiguracionANS(mapper.readValue(relatedInstanceJsonOid, ConfiguracionANSOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ConfiguracionANS.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildConfiguracionANSRelatedInstance4LogConfiguracionANS(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new LogConfiguracionANS(mapper.readValue(relatedInstanceJsonOid, LogConfiguracionANSOid.class)): LogConfiguracionANS.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ConfiguracionANS.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildConfiguracionANSRelatedInstance4Dominio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Dominio(mapper.readValue(relatedInstanceJsonOid, DominioOid.class)): Dominio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ConfiguracionANS.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildConfiguracionANSRelatedInstance4Novedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Novedad(mapper.readValue(relatedInstanceJsonOid, NovedadOid.class)): Novedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ConfiguracionANS.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildConfiguracionANSRelatedInstance4Causal(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Causal(mapper.readValue(relatedInstanceJsonOid, CausalOid.class)): Causal.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ConfiguracionANS.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
