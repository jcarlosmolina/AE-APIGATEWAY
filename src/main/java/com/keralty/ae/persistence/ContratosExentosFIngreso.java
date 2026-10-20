package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.persistence.oid.ContratosExentosFIngresoOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>ContratosExentosFIngreso</code> external model class.
 * <p>
 * External Model Class: <code>ContratosExentosFIngreso</code><br>
 */
public class ContratosExentosFIngreso extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id_contratosexentosfingreso")
    private Long contratosExentosFIngresoidContratosExentosFIngreso;

    @JsonProperty(value="numcontrato")
    private String contratosExentosFIngresoNumContrato;

    /**
     * Gets the value of attribute id_ContratosExentosFIngreso
     */
    public Long getContratosExentosFIngresoidContratosExentosFIngreso() {
        return contratosExentosFIngresoidContratosExentosFIngreso;
    }
    
    /**
     * Sets the value of attribute id_ContratosExentosFIngreso
     */
    public void setContratosExentosFIngresoidContratosExentosFIngreso(Long contratosExentosFIngresoidContratosExentosFIngreso) {
        this.contratosExentosFIngresoidContratosExentosFIngreso = contratosExentosFIngresoidContratosExentosFIngreso;
    }

    /**
     * Gets the value of attribute NumContrato
     */
    public String getContratosExentosFIngresoNumContrato() {
        return contratosExentosFIngresoNumContrato;
    }
    
    /**
     * Sets the value of attribute NumContrato
     */
    public void setContratosExentosFIngresoNumContrato(String contratosExentosFIngresoNumContrato) {
        this.contratosExentosFIngresoNumContrato = contratosExentosFIngresoNumContrato;
    }

    /**
     * Default constructor
     */
    public ContratosExentosFIngreso() {
        contratosExentosFIngresoidContratosExentosFIngreso = null;
    }

    /**
     * Constructor used to create instances of <code>ContratosExentosFIngreso</code>.
     * @param oid Object Identifier of the instance of <code>ContratosExentosFIngreso</code> to be created.
     * @throws SystemException
     */
    public ContratosExentosFIngreso(ContratosExentosFIngresoOid oid) {
        if (oid != null && !oid.isNull()) {
            contratosExentosFIngresoidContratosExentosFIngreso = oid.getContratosExentosFIngresoidContratosExentosFIngreso();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return ContratosExentosFIngreso.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        ContratosExentosFIngreso other = (ContratosExentosFIngreso)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getContratosExentosFIngresoidContratosExentosFIngreso(), other.getContratosExentosFIngresoidContratosExentosFIngreso());
        result &= Utilities.isEqual(this.getContratosExentosFIngresoNumContrato(), other.getContratosExentosFIngresoNumContrato());
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
     * Returns the <code>ContratosExentosFIngresoOid</code> object that identifies this instance of <code>ContratosExentosFIngreso</code>.
     * @return <code>ContratosExentosFIngresoOid</code> object that identifies this instance of <code>ContratosExentosFIngreso</code>
     */
	@Override
    public ContratosExentosFIngresoOid getOid() {
        return new ContratosExentosFIngresoOid(getContratosExentosFIngresoidContratosExentosFIngreso());
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
        if (!activeFacets.contains(Constants.CONTRATOSEXENTOSFINGRESO)) {
            activeFacets.add(Constants.CONTRATOSEXENTOSFINGRESO);
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
            relatedInstance = buildContratosExentosFIngresoRelatedInstance(relatedInstanceJsonOid);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildContratosExentosFIngresoRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new ContratosExentosFIngreso(mapper.readValue(relatedInstanceJsonOid, ContratosExentosFIngresoOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ContratosExentosFIngreso.class).error(e.getMessage());
            return null;
        }
    }
}
