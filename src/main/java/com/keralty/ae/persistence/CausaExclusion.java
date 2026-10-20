package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.CausaExclusionConstants;
import com.keralty.ae.global.Constants;
import com.keralty.ae.persistence.oid.CausaExclusionOid;
import com.keralty.ae.persistence.oid.NovedadOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>CausaExclusion</code> external model class.
 * <p>
 * External Model Class: <code>CausaExclusion</code><br>
 */
public class CausaExclusion extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id_causaexclusion")
    private Long causaExclusionidCausaExclusion;

    @JsonProperty(value="aliascausa")
    private String causaExclusionAliasCausa;

    @JsonProperty(value="descripcion")
    private String causaExclusionDescripcion;

    @JsonProperty(value="drvtextomostrar")
    private String causaExclusionDrvTextoMostrar;

    private Novedad novedad;

    /**
     * Gets the value of attribute id_CausaExclusion
     */
    public Long getCausaExclusionidCausaExclusion() {
        return causaExclusionidCausaExclusion;
    }
    
    /**
     * Sets the value of attribute id_CausaExclusion
     */
    public void setCausaExclusionidCausaExclusion(Long causaExclusionidCausaExclusion) {
        this.causaExclusionidCausaExclusion = causaExclusionidCausaExclusion;
    }

    /**
     * Gets the value of attribute AliasCausa
     */
    public String getCausaExclusionAliasCausa() {
        return causaExclusionAliasCausa;
    }
    
    /**
     * Sets the value of attribute AliasCausa
     */
    public void setCausaExclusionAliasCausa(String causaExclusionAliasCausa) {
        this.causaExclusionAliasCausa = causaExclusionAliasCausa;
    }

    /**
     * Gets the value of attribute Descripcion
     */
    public String getCausaExclusionDescripcion() {
        return causaExclusionDescripcion;
    }
    
    /**
     * Sets the value of attribute Descripcion
     */
    public void setCausaExclusionDescripcion(String causaExclusionDescripcion) {
        this.causaExclusionDescripcion = causaExclusionDescripcion;
    }

    /**
     * Gets the value of attribute DrvTextoMostrar
     */
    public String getCausaExclusionDrvTextoMostrar() {
        return causaExclusionDrvTextoMostrar;
    }
    
    /**
     * Sets the value of attribute DrvTextoMostrar
     */
    public void setCausaExclusionDrvTextoMostrar(String causaExclusionDrvTextoMostrar) {
        this.causaExclusionDrvTextoMostrar = causaExclusionDrvTextoMostrar;
    }

    /**
     * Gets the value of relation through role Novedad
     */
    @JsonIgnore
    public Novedad getNovedad() {
        return novedad;
    }

    /**
     * Default constructor
     */
    public CausaExclusion() {
        causaExclusionidCausaExclusion = null;
    }

    /**
     * Constructor used to create instances of <code>CausaExclusion</code>.
     * @param oid Object Identifier of the instance of <code>CausaExclusion</code> to be created.
     * @throws SystemException
     */
    public CausaExclusion(CausaExclusionOid oid) {
        if (oid != null && !oid.isNull()) {
            causaExclusionidCausaExclusion = oid.getCausaExclusionidCausaExclusion();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return CausaExclusion.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        CausaExclusion other = (CausaExclusion)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getCausaExclusionidCausaExclusion(), other.getCausaExclusionidCausaExclusion());
        result &= Utilities.isEqual(this.getCausaExclusionAliasCausa(), other.getCausaExclusionAliasCausa());
        result &= Utilities.isEqual(this.getCausaExclusionDescripcion(), other.getCausaExclusionDescripcion());
        result &= Utilities.isEqual(this.getCausaExclusionDrvTextoMostrar(), other.getCausaExclusionDrvTextoMostrar());
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
     * Returns the <code>CausaExclusionOid</code> object that identifies this instance of <code>CausaExclusion</code>.
     * @return <code>CausaExclusionOid</code> object that identifies this instance of <code>CausaExclusion</code>
     */
	@Override
    public CausaExclusionOid getOid() {
        return new CausaExclusionOid(getCausaExclusionidCausaExclusion());
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
        if (!activeFacets.contains(Constants.CAUSAEXCLUSION)) {
            activeFacets.add(Constants.CAUSAEXCLUSION);
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
            relatedInstance = buildCausaExclusionRelatedInstance(relatedInstanceJsonOid);
        }
        if (CausaExclusionConstants.ROLE_NAME_NOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildCausaExclusionRelatedInstance4Novedad(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildCausaExclusionRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new CausaExclusion(mapper.readValue(relatedInstanceJsonOid, CausaExclusionOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(CausaExclusion.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildCausaExclusionRelatedInstance4Novedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Novedad(mapper.readValue(relatedInstanceJsonOid, NovedadOid.class)): Novedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(CausaExclusion.class).error(e.getMessage());
            return null;
        }
    }
}
