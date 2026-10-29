package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.EstadoBeneficiarioAEConstants;
import com.keralty.ae.persistence.oid.EstadoBeneficiarioAEOid;
import com.keralty.ae.persistence.oid.EstadoBeneficiarioOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>EstadoBeneficiarioAE</code> external model class.
 * <p>
 * External Model Class: <code>EstadoBeneficiarioAE</code><br>
 */
public class EstadoBeneficiarioAE extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="codigo")
    private Long estadoBeneficiarioAECodigo;

    @JsonProperty(value="descripcion")
    private String estadoBeneficiarioAEDescripcion;

    private EstadoBeneficiario estadoBeneficiarioCORE;

    /**
     * Gets the value of attribute Codigo
     */
    public Long getEstadoBeneficiarioAECodigo() {
        return estadoBeneficiarioAECodigo;
    }
    
    /**
     * Sets the value of attribute Codigo
     */
    public void setEstadoBeneficiarioAECodigo(Long estadoBeneficiarioAECodigo) {
        this.estadoBeneficiarioAECodigo = estadoBeneficiarioAECodigo;
    }

    /**
     * Gets the value of attribute Descripcion
     */
    public String getEstadoBeneficiarioAEDescripcion() {
        return estadoBeneficiarioAEDescripcion;
    }
    
    /**
     * Sets the value of attribute Descripcion
     */
    public void setEstadoBeneficiarioAEDescripcion(String estadoBeneficiarioAEDescripcion) {
        this.estadoBeneficiarioAEDescripcion = estadoBeneficiarioAEDescripcion;
    }

    /**
     * Gets the value of relation through role EstadoBeneficiarioCORE
     */
    @JsonIgnore
    public EstadoBeneficiario getEstadoBeneficiarioCORE() {
        return estadoBeneficiarioCORE;
    }

    /**
     * Default constructor
     */
    public EstadoBeneficiarioAE() {
        estadoBeneficiarioAECodigo = null;
    }

    /**
     * Constructor used to create instances of <code>EstadoBeneficiarioAE</code>.
     * @param oid Object Identifier of the instance of <code>EstadoBeneficiarioAE</code> to be created.
     * @throws SystemException
     */
    public EstadoBeneficiarioAE(EstadoBeneficiarioAEOid oid) {
        if (oid != null && !oid.isNull()) {
            estadoBeneficiarioAECodigo = oid.getEstadoBeneficiarioAECodigo();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return EstadoBeneficiarioAE.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        EstadoBeneficiarioAE other = (EstadoBeneficiarioAE)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getEstadoBeneficiarioAECodigo(), other.getEstadoBeneficiarioAECodigo());
        result &= Utilities.isEqual(this.getEstadoBeneficiarioAEDescripcion(), other.getEstadoBeneficiarioAEDescripcion());
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
     * Returns the <code>EstadoBeneficiarioAEOid</code> object that identifies this instance of <code>EstadoBeneficiarioAE</code>.
     * @return <code>EstadoBeneficiarioAEOid</code> object that identifies this instance of <code>EstadoBeneficiarioAE</code>
     */
	@Override
    public EstadoBeneficiarioAEOid getOid() {
        return new EstadoBeneficiarioAEOid(getEstadoBeneficiarioAECodigo());
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
        if (!activeFacets.contains(Constants.ESTADOBENEFICIARIOAE)) {
            activeFacets.add(Constants.ESTADOBENEFICIARIOAE);
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
            relatedInstance = buildEstadoBeneficiarioAERelatedInstance(relatedInstanceJsonOid);
        }
        if (EstadoBeneficiarioAEConstants.ROLE_NAME_ESTADOBENEFICIARIOCORE.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildEstadoBeneficiarioAERelatedInstance4EstadoBeneficiario(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildEstadoBeneficiarioAERelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new EstadoBeneficiarioAE(mapper.readValue(relatedInstanceJsonOid, EstadoBeneficiarioAEOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(EstadoBeneficiarioAE.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildEstadoBeneficiarioAERelatedInstance4EstadoBeneficiario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new EstadoBeneficiario(mapper.readValue(relatedInstanceJsonOid, EstadoBeneficiarioOid.class)): EstadoBeneficiario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(EstadoBeneficiarioAE.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
