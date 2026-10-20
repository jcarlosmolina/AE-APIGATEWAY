package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.PregCuesMedCConstants;
import com.keralty.ae.persistence.oid.PersonaCOid;
import com.keralty.ae.persistence.oid.PregCuesMedCOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>PregCuesMedC</code> external model class.
 * <p>
 * External Model Class: <code>PregCuesMedC</code><br>
 */
public class PregCuesMedC extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id")
    private Long personaCID;

    @JsonProperty(value="codpregunta")
    private Long pregCuesMedCCodPregunta;

    @JsonProperty(value="rptapregunta")
    private Boolean pregCuesMedCRptaPregunta;

    @JsonProperty(value="observacions")
    private String pregCuesMedCObservacions;

    private PersonaC personaC;

    /**
     * Gets the value of attribute ID
     */
    public Long getPersonaCID() {
        return personaCID;
    }
    
    /**
     * Sets the value of attribute ID
     */
    public void setPersonaCID(Long personaCID) {
        this.personaCID = personaCID;
    }

    /**
     * Gets the value of attribute CodPregunta
     */
    public Long getPregCuesMedCCodPregunta() {
        return pregCuesMedCCodPregunta;
    }
    
    /**
     * Sets the value of attribute CodPregunta
     */
    public void setPregCuesMedCCodPregunta(Long pregCuesMedCCodPregunta) {
        this.pregCuesMedCCodPregunta = pregCuesMedCCodPregunta;
    }

    /**
     * Gets the value of attribute RptaPregunta
     */
    public Boolean getPregCuesMedCRptaPregunta() {
        return pregCuesMedCRptaPregunta;
    }
    
    /**
     * Sets the value of attribute RptaPregunta
     */
    public void setPregCuesMedCRptaPregunta(Boolean pregCuesMedCRptaPregunta) {
        this.pregCuesMedCRptaPregunta = pregCuesMedCRptaPregunta;
    }

    /**
     * Gets the value of attribute Observacions
     */
    public String getPregCuesMedCObservacions() {
        return pregCuesMedCObservacions;
    }
    
    /**
     * Sets the value of attribute Observacions
     */
    public void setPregCuesMedCObservacions(String pregCuesMedCObservacions) {
        this.pregCuesMedCObservacions = pregCuesMedCObservacions;
    }

    /**
     * Gets the value of relation through role PersonaC
     */
    @JsonIgnore
    public PersonaC getPersonaC() {
        return personaC;
    }

    /**
     * Default constructor
     */
    public PregCuesMedC() {
        personaCID = null;
        pregCuesMedCCodPregunta = null;
    }

    /**
     * Constructor used to create instances of <code>PregCuesMedC</code>.
     * @param oid Object Identifier of the instance of <code>PregCuesMedC</code> to be created.
     * @throws SystemException
     */
    public PregCuesMedC(PregCuesMedCOid oid) {
        if (oid != null && !oid.isNull()) {
            personaCID = oid.getPersonaCID();
            pregCuesMedCCodPregunta = oid.getPregCuesMedCCodPregunta();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return PregCuesMedC.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        PregCuesMedC other = (PregCuesMedC)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getPregCuesMedCCodPregunta(), other.getPregCuesMedCCodPregunta());
        result &= Utilities.isEqual(this.getPregCuesMedCRptaPregunta(), other.getPregCuesMedCRptaPregunta());
        result &= Utilities.isEqual(this.getPregCuesMedCObservacions(), other.getPregCuesMedCObservacions());
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
     * Returns the <code>PregCuesMedCOid</code> object that identifies this instance of <code>PregCuesMedC</code>.
     * @return <code>PregCuesMedCOid</code> object that identifies this instance of <code>PregCuesMedC</code>
     */
	@Override
    public PregCuesMedCOid getOid() {
        return new PregCuesMedCOid(getPersonaCID(), getPregCuesMedCCodPregunta());
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
        if (!activeFacets.contains(Constants.PREGCUESMEDC)) {
            activeFacets.add(Constants.PREGCUESMEDC);
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
            relatedInstance = buildPregCuesMedCRelatedInstance(relatedInstanceJsonOid);
        }
        if (PregCuesMedCConstants.ROLE_NAME_PERSONAC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPregCuesMedCRelatedInstance4PersonaC(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildPregCuesMedCRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new PregCuesMedC(mapper.readValue(relatedInstanceJsonOid, PregCuesMedCOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PregCuesMedC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPregCuesMedCRelatedInstance4PersonaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PersonaC(mapper.readValue(relatedInstanceJsonOid, PersonaCOid.class)): PersonaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PregCuesMedC.class).error(e.getMessage());
            return null;
        }
    }
}
