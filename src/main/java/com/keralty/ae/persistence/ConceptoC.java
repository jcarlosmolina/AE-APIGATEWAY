package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.ConceptoCConstants;
import com.keralty.ae.global.Constants;
import com.keralty.ae.persistence.oid.BeneficiarioCOid;
import com.keralty.ae.persistence.oid.ConceptoCOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>ConceptoC</code> external model class.
 * <p>
 * External Model Class: <code>ConceptoC</code><br>
 */
public class ConceptoC extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="idconcepto")
    private Long conceptoCIdConcepto;

    @JsonProperty(value="codconceptocontrato")
    private String conceptoCcodConceptoContrato;

    @JsonProperty(value="nombreconcepto")
    private String conceptoCnombreConcepto;

    @JsonProperty(value="porcentajeconcepto")
    private Double conceptoCporcentajeConcepto;

    @JsonProperty(value="valorconcepto")
    private Double conceptoCvalorConcepto;

    private BeneficiarioC beneficiarioC;

    /**
     * Gets the value of attribute IdConcepto
     */
    public Long getConceptoCIdConcepto() {
        return conceptoCIdConcepto;
    }
    
    /**
     * Sets the value of attribute IdConcepto
     */
    public void setConceptoCIdConcepto(Long conceptoCIdConcepto) {
        this.conceptoCIdConcepto = conceptoCIdConcepto;
    }

    /**
     * Gets the value of attribute codConceptoContrato
     */
    public String getConceptoCcodConceptoContrato() {
        return conceptoCcodConceptoContrato;
    }
    
    /**
     * Sets the value of attribute codConceptoContrato
     */
    public void setConceptoCcodConceptoContrato(String conceptoCcodConceptoContrato) {
        this.conceptoCcodConceptoContrato = conceptoCcodConceptoContrato;
    }

    /**
     * Gets the value of attribute nombreConcepto
     */
    public String getConceptoCnombreConcepto() {
        return conceptoCnombreConcepto;
    }
    
    /**
     * Sets the value of attribute nombreConcepto
     */
    public void setConceptoCnombreConcepto(String conceptoCnombreConcepto) {
        this.conceptoCnombreConcepto = conceptoCnombreConcepto;
    }

    /**
     * Gets the value of attribute porcentajeConcepto
     */
    public Double getConceptoCporcentajeConcepto() {
        return conceptoCporcentajeConcepto;
    }
    
    /**
     * Sets the value of attribute porcentajeConcepto
     */
    public void setConceptoCporcentajeConcepto(Double conceptoCporcentajeConcepto) {
        this.conceptoCporcentajeConcepto = conceptoCporcentajeConcepto;
    }

    /**
     * Gets the value of attribute valorConcepto
     */
    public Double getConceptoCvalorConcepto() {
        return conceptoCvalorConcepto;
    }
    
    /**
     * Sets the value of attribute valorConcepto
     */
    public void setConceptoCvalorConcepto(Double conceptoCvalorConcepto) {
        this.conceptoCvalorConcepto = conceptoCvalorConcepto;
    }

    /**
     * Gets the value of relation through role BeneficiarioC
     */
    @JsonIgnore
    public BeneficiarioC getBeneficiarioC() {
        return beneficiarioC;
    }

    /**
     * Default constructor
     */
    public ConceptoC() {
        conceptoCIdConcepto = null;
    }

    /**
     * Constructor used to create instances of <code>ConceptoC</code>.
     * @param oid Object Identifier of the instance of <code>ConceptoC</code> to be created.
     * @throws SystemException
     */
    public ConceptoC(ConceptoCOid oid) {
        if (oid != null && !oid.isNull()) {
            conceptoCIdConcepto = oid.getConceptoCIdConcepto();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return ConceptoC.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        ConceptoC other = (ConceptoC)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getConceptoCIdConcepto(), other.getConceptoCIdConcepto());
        result &= Utilities.isEqual(this.getConceptoCcodConceptoContrato(), other.getConceptoCcodConceptoContrato());
        result &= Utilities.isEqual(this.getConceptoCnombreConcepto(), other.getConceptoCnombreConcepto());
        result &= Utilities.isEqual(this.getConceptoCporcentajeConcepto(), other.getConceptoCporcentajeConcepto());
        result &= Utilities.isEqual(this.getConceptoCvalorConcepto(), other.getConceptoCvalorConcepto());
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
     * Returns the <code>ConceptoCOid</code> object that identifies this instance of <code>ConceptoC</code>.
     * @return <code>ConceptoCOid</code> object that identifies this instance of <code>ConceptoC</code>
     */
	@Override
    public ConceptoCOid getOid() {
        return new ConceptoCOid(getConceptoCIdConcepto());
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
        if (!activeFacets.contains(Constants.CONCEPTOC)) {
            activeFacets.add(Constants.CONCEPTOC);
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
            relatedInstance = buildConceptoCRelatedInstance(relatedInstanceJsonOid);
        }
        if (ConceptoCConstants.ROLE_NAME_BENEFICIARIOC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildConceptoCRelatedInstance4BeneficiarioC(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildConceptoCRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new ConceptoC(mapper.readValue(relatedInstanceJsonOid, ConceptoCOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ConceptoC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildConceptoCRelatedInstance4BeneficiarioC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new BeneficiarioC(mapper.readValue(relatedInstanceJsonOid, BeneficiarioCOid.class)): BeneficiarioC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ConceptoC.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
