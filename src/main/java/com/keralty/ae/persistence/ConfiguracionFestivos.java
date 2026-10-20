package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.persistence.oid.ConfiguracionFestivosOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>ConfiguracionFestivos</code> external model class.
 * <p>
 * External Model Class: <code>ConfiguracionFestivos</code><br>
 */
public class ConfiguracionFestivos extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id")
    private Long configuracionFestivosId;

    @JsonProperty(value="diafestivo")
    private Date configuracionFestivosDiaFestivo;

    /**
     * Gets the value of attribute Id
     */
    public Long getConfiguracionFestivosId() {
        return configuracionFestivosId;
    }
    
    /**
     * Sets the value of attribute Id
     */
    public void setConfiguracionFestivosId(Long configuracionFestivosId) {
        this.configuracionFestivosId = configuracionFestivosId;
    }

    /**
     * Gets the value of attribute DiaFestivo
     */
    public Date getConfiguracionFestivosDiaFestivo() {
        return configuracionFestivosDiaFestivo;
    }
    
    /**
     * Sets the value of attribute DiaFestivo
     */
    public void setConfiguracionFestivosDiaFestivo(Date configuracionFestivosDiaFestivo) {
        this.configuracionFestivosDiaFestivo = configuracionFestivosDiaFestivo;
    }

    /**
     * Default constructor
     */
    public ConfiguracionFestivos() {
        configuracionFestivosId = null;
    }

    /**
     * Constructor used to create instances of <code>ConfiguracionFestivos</code>.
     * @param oid Object Identifier of the instance of <code>ConfiguracionFestivos</code> to be created.
     * @throws SystemException
     */
    public ConfiguracionFestivos(ConfiguracionFestivosOid oid) {
        if (oid != null && !oid.isNull()) {
            configuracionFestivosId = oid.getConfiguracionFestivosId();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return ConfiguracionFestivos.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        ConfiguracionFestivos other = (ConfiguracionFestivos)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getConfiguracionFestivosId(), other.getConfiguracionFestivosId());
        result &= Utilities.isEqual(this.getConfiguracionFestivosDiaFestivo(), other.getConfiguracionFestivosDiaFestivo());
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
     * Returns the <code>ConfiguracionFestivosOid</code> object that identifies this instance of <code>ConfiguracionFestivos</code>.
     * @return <code>ConfiguracionFestivosOid</code> object that identifies this instance of <code>ConfiguracionFestivos</code>
     */
	@Override
    public ConfiguracionFestivosOid getOid() {
        return new ConfiguracionFestivosOid(getConfiguracionFestivosId());
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
        if (!activeFacets.contains(Constants.CONFIGURACIONFESTIVOS)) {
            activeFacets.add(Constants.CONFIGURACIONFESTIVOS);
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
            relatedInstance = buildConfiguracionFestivosRelatedInstance(relatedInstanceJsonOid);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildConfiguracionFestivosRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new ConfiguracionFestivos(mapper.readValue(relatedInstanceJsonOid, ConfiguracionFestivosOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ConfiguracionFestivos.class).error(e.getMessage());
            return null;
        }
    }
}
