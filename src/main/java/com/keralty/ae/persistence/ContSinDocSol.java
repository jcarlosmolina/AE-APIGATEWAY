package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.persistence.oid.ContSinDocSolOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>ContSinDocSol</code> external model class.
 * <p>
 * External Model Class: <code>ContSinDocSol</code><br>
 */
public class ContSinDocSol extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id_contsindocsol")
    private Long contSinDocSolidContSinDocSol;

    @JsonProperty(value="numcontrato")
    private String contSinDocSolNumContrato;

    /**
     * Gets the value of attribute id_ContSinDocSol
     */
    public Long getContSinDocSolidContSinDocSol() {
        return contSinDocSolidContSinDocSol;
    }
    
    /**
     * Sets the value of attribute id_ContSinDocSol
     */
    public void setContSinDocSolidContSinDocSol(Long contSinDocSolidContSinDocSol) {
        this.contSinDocSolidContSinDocSol = contSinDocSolidContSinDocSol;
    }

    /**
     * Gets the value of attribute NumContrato
     */
    public String getContSinDocSolNumContrato() {
        return contSinDocSolNumContrato;
    }
    
    /**
     * Sets the value of attribute NumContrato
     */
    public void setContSinDocSolNumContrato(String contSinDocSolNumContrato) {
        this.contSinDocSolNumContrato = contSinDocSolNumContrato;
    }

    /**
     * Default constructor
     */
    public ContSinDocSol() {
        contSinDocSolidContSinDocSol = null;
    }

    /**
     * Constructor used to create instances of <code>ContSinDocSol</code>.
     * @param oid Object Identifier of the instance of <code>ContSinDocSol</code> to be created.
     * @throws SystemException
     */
    public ContSinDocSol(ContSinDocSolOid oid) {
        if (oid != null && !oid.isNull()) {
            contSinDocSolidContSinDocSol = oid.getContSinDocSolidContSinDocSol();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return ContSinDocSol.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        ContSinDocSol other = (ContSinDocSol)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getContSinDocSolidContSinDocSol(), other.getContSinDocSolidContSinDocSol());
        result &= Utilities.isEqual(this.getContSinDocSolNumContrato(), other.getContSinDocSolNumContrato());
        return result;
    }

    @Override
    @JsonIgnore
    public int hashCode() {
        return 0;
    }

    @JsonIgnore
    public boolean isNull() {
        return false;
    }

    /**
     * Returns the <code>ContSinDocSolOid</code> object that identifies this instance of <code>ContSinDocSol</code>.
     * @return <code>ContSinDocSolOid</code> object that identifies this instance of <code>ContSinDocSol</code>
     */
	@Override
    public ContSinDocSolOid getOid() {
        return new ContSinDocSolOid(getContSinDocSolidContSinDocSol());
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
        if (!activeFacets.contains(Constants.CONTSINDOCSOL)) {
            activeFacets.add(Constants.CONTSINDOCSOL);
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
            relatedInstance = buildContSinDocSolRelatedInstance(relatedInstanceJsonOid);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildContSinDocSolRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new ContSinDocSol(mapper.readValue(relatedInstanceJsonOid, ContSinDocSolOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ContSinDocSol.class).error(e.getMessage());
            return null;
        }
    }
}
