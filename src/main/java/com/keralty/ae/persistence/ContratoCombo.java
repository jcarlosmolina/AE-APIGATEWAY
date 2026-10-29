package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.persistence.oid.ContratoComboOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>ContratoCombo</code> external model class.
 * <p>
 * External Model Class: <code>ContratoCombo</code><br>
 */
public class ContratoCombo extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id")
    private Long contratoComboId;

    @JsonProperty(value="contratointegral")
    private String contratoComboContratoIntegral;

    @JsonProperty(value="contratoodontologico")
    private String contratoComboContratoOdontologico;

    /**
     * Gets the value of attribute Id
     */
    public Long getContratoComboId() {
        return contratoComboId;
    }
    
    /**
     * Sets the value of attribute Id
     */
    public void setContratoComboId(Long contratoComboId) {
        this.contratoComboId = contratoComboId;
    }

    /**
     * Gets the value of attribute ContratoIntegral
     */
    public String getContratoComboContratoIntegral() {
        return contratoComboContratoIntegral;
    }
    
    /**
     * Sets the value of attribute ContratoIntegral
     */
    public void setContratoComboContratoIntegral(String contratoComboContratoIntegral) {
        this.contratoComboContratoIntegral = contratoComboContratoIntegral;
    }

    /**
     * Gets the value of attribute ContratoOdontologico
     */
    public String getContratoComboContratoOdontologico() {
        return contratoComboContratoOdontologico;
    }
    
    /**
     * Sets the value of attribute ContratoOdontologico
     */
    public void setContratoComboContratoOdontologico(String contratoComboContratoOdontologico) {
        this.contratoComboContratoOdontologico = contratoComboContratoOdontologico;
    }

    /**
     * Default constructor
     */
    public ContratoCombo() {
        contratoComboId = null;
    }

    /**
     * Constructor used to create instances of <code>ContratoCombo</code>.
     * @param oid Object Identifier of the instance of <code>ContratoCombo</code> to be created.
     * @throws SystemException
     */
    public ContratoCombo(ContratoComboOid oid) {
        if (oid != null && !oid.isNull()) {
            contratoComboId = oid.getContratoComboId();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return ContratoCombo.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        ContratoCombo other = (ContratoCombo)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getContratoComboId(), other.getContratoComboId());
        result &= Utilities.isEqual(this.getContratoComboContratoIntegral(), other.getContratoComboContratoIntegral());
        result &= Utilities.isEqual(this.getContratoComboContratoOdontologico(), other.getContratoComboContratoOdontologico());
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
     * Returns the <code>ContratoComboOid</code> object that identifies this instance of <code>ContratoCombo</code>.
     * @return <code>ContratoComboOid</code> object that identifies this instance of <code>ContratoCombo</code>
     */
	@Override
    public ContratoComboOid getOid() {
        return new ContratoComboOid(getContratoComboId());
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
        if (!activeFacets.contains(Constants.CONTRATOCOMBO)) {
            activeFacets.add(Constants.CONTRATOCOMBO);
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
            relatedInstance = buildContratoComboRelatedInstance(relatedInstanceJsonOid);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildContratoComboRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new ContratoCombo(mapper.readValue(relatedInstanceJsonOid, ContratoComboOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ContratoCombo.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
