package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.persistence.oid.MotDevAreaMedicaOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>MotDevAreaMedica</code> external model class.
 * <p>
 * External Model Class: <code>MotDevAreaMedica</code><br>
 */
public class MotDevAreaMedica extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id")
    private Long motDevAreaMedicaId;

    @JsonProperty(value="descripcion")
    private String motDevAreaMedicaDescripcion;

    /**
     * Gets the value of attribute Id
     */
    public Long getMotDevAreaMedicaId() {
        return motDevAreaMedicaId;
    }
    
    /**
     * Sets the value of attribute Id
     */
    public void setMotDevAreaMedicaId(Long motDevAreaMedicaId) {
        this.motDevAreaMedicaId = motDevAreaMedicaId;
    }

    /**
     * Gets the value of attribute Descripcion
     */
    public String getMotDevAreaMedicaDescripcion() {
        return motDevAreaMedicaDescripcion;
    }
    
    /**
     * Sets the value of attribute Descripcion
     */
    public void setMotDevAreaMedicaDescripcion(String motDevAreaMedicaDescripcion) {
        this.motDevAreaMedicaDescripcion = motDevAreaMedicaDescripcion;
    }

    /**
     * Default constructor
     */
    public MotDevAreaMedica() {
        motDevAreaMedicaId = null;
    }

    /**
     * Constructor used to create instances of <code>MotDevAreaMedica</code>.
     * @param oid Object Identifier of the instance of <code>MotDevAreaMedica</code> to be created.
     * @throws SystemException
     */
    public MotDevAreaMedica(MotDevAreaMedicaOid oid) {
        if (oid != null && !oid.isNull()) {
            motDevAreaMedicaId = oid.getMotDevAreaMedicaId();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return MotDevAreaMedica.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        MotDevAreaMedica other = (MotDevAreaMedica)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getMotDevAreaMedicaId(), other.getMotDevAreaMedicaId());
        result &= Utilities.isEqual(this.getMotDevAreaMedicaDescripcion(), other.getMotDevAreaMedicaDescripcion());
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
     * Returns the <code>MotDevAreaMedicaOid</code> object that identifies this instance of <code>MotDevAreaMedica</code>.
     * @return <code>MotDevAreaMedicaOid</code> object that identifies this instance of <code>MotDevAreaMedica</code>
     */
	@Override
    public MotDevAreaMedicaOid getOid() {
        return new MotDevAreaMedicaOid(getMotDevAreaMedicaId());
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
        if (!activeFacets.contains(Constants.MOTDEVAREAMEDICA)) {
            activeFacets.add(Constants.MOTDEVAREAMEDICA);
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
            relatedInstance = buildMotDevAreaMedicaRelatedInstance(relatedInstanceJsonOid);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildMotDevAreaMedicaRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new MotDevAreaMedica(mapper.readValue(relatedInstanceJsonOid, MotDevAreaMedicaOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(MotDevAreaMedica.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
