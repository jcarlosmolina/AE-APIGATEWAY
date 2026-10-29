package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.DetalleTarifaConstants;
import com.keralty.ae.persistence.oid.DetalleTarifaOid;
import com.keralty.ae.persistence.oid.TarifaOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>DetalleTarifa</code> external model class.
 * <p>
 * External Model Class: <code>DetalleTarifa</code><br>
 */
public class DetalleTarifa extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id_detalletarifa")
    private Long detalleTarifaidDetalleTarifa;

    @JsonProperty(value="anyo")
    private Long detalleTarifaAnyo;

    @JsonProperty(value="liminferioredad")
    private Long detalleTarifaLimInferiorEdad;

    @JsonProperty(value="limsuperioredad")
    private Long detalleTarifaLimSuperiorEdad;

    @JsonProperty(value="valor")
    private Double detalleTarifaValor;

    private Tarifa tarifa;

    /**
     * Gets the value of attribute id_DetalleTarifa
     */
    public Long getDetalleTarifaidDetalleTarifa() {
        return detalleTarifaidDetalleTarifa;
    }
    
    /**
     * Sets the value of attribute id_DetalleTarifa
     */
    public void setDetalleTarifaidDetalleTarifa(Long detalleTarifaidDetalleTarifa) {
        this.detalleTarifaidDetalleTarifa = detalleTarifaidDetalleTarifa;
    }

    /**
     * Gets the value of attribute Anyo
     */
    public Long getDetalleTarifaAnyo() {
        return detalleTarifaAnyo;
    }
    
    /**
     * Sets the value of attribute Anyo
     */
    public void setDetalleTarifaAnyo(Long detalleTarifaAnyo) {
        this.detalleTarifaAnyo = detalleTarifaAnyo;
    }

    /**
     * Gets the value of attribute LimInferiorEdad
     */
    public Long getDetalleTarifaLimInferiorEdad() {
        return detalleTarifaLimInferiorEdad;
    }
    
    /**
     * Sets the value of attribute LimInferiorEdad
     */
    public void setDetalleTarifaLimInferiorEdad(Long detalleTarifaLimInferiorEdad) {
        this.detalleTarifaLimInferiorEdad = detalleTarifaLimInferiorEdad;
    }

    /**
     * Gets the value of attribute LimSuperiorEdad
     */
    public Long getDetalleTarifaLimSuperiorEdad() {
        return detalleTarifaLimSuperiorEdad;
    }
    
    /**
     * Sets the value of attribute LimSuperiorEdad
     */
    public void setDetalleTarifaLimSuperiorEdad(Long detalleTarifaLimSuperiorEdad) {
        this.detalleTarifaLimSuperiorEdad = detalleTarifaLimSuperiorEdad;
    }

    /**
     * Gets the value of attribute Valor
     */
    public Double getDetalleTarifaValor() {
        return detalleTarifaValor;
    }
    
    /**
     * Sets the value of attribute Valor
     */
    public void setDetalleTarifaValor(Double detalleTarifaValor) {
        this.detalleTarifaValor = detalleTarifaValor;
    }

    /**
     * Gets the value of relation through role Tarifa
     */
    @JsonIgnore
    public Tarifa getTarifa() {
        return tarifa;
    }

    /**
     * Default constructor
     */
    public DetalleTarifa() {
        detalleTarifaidDetalleTarifa = null;
    }

    /**
     * Constructor used to create instances of <code>DetalleTarifa</code>.
     * @param oid Object Identifier of the instance of <code>DetalleTarifa</code> to be created.
     * @throws SystemException
     */
    public DetalleTarifa(DetalleTarifaOid oid) {
        if (oid != null && !oid.isNull()) {
            detalleTarifaidDetalleTarifa = oid.getDetalleTarifaidDetalleTarifa();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return DetalleTarifa.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        DetalleTarifa other = (DetalleTarifa)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getDetalleTarifaidDetalleTarifa(), other.getDetalleTarifaidDetalleTarifa());
        result &= Utilities.isEqual(this.getDetalleTarifaAnyo(), other.getDetalleTarifaAnyo());
        result &= Utilities.isEqual(this.getDetalleTarifaLimInferiorEdad(), other.getDetalleTarifaLimInferiorEdad());
        result &= Utilities.isEqual(this.getDetalleTarifaLimSuperiorEdad(), other.getDetalleTarifaLimSuperiorEdad());
        result &= Utilities.isEqual(this.getDetalleTarifaValor(), other.getDetalleTarifaValor());
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
     * Returns the <code>DetalleTarifaOid</code> object that identifies this instance of <code>DetalleTarifa</code>.
     * @return <code>DetalleTarifaOid</code> object that identifies this instance of <code>DetalleTarifa</code>
     */
	@Override
    public DetalleTarifaOid getOid() {
        return new DetalleTarifaOid(getDetalleTarifaidDetalleTarifa());
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
        if (!activeFacets.contains(Constants.DETALLETARIFA)) {
            activeFacets.add(Constants.DETALLETARIFA);
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
            relatedInstance = buildDetalleTarifaRelatedInstance(relatedInstanceJsonOid);
        }
        if (DetalleTarifaConstants.ROLE_NAME_TARIFA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDetalleTarifaRelatedInstance4Tarifa(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildDetalleTarifaRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new DetalleTarifa(mapper.readValue(relatedInstanceJsonOid, DetalleTarifaOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DetalleTarifa.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDetalleTarifaRelatedInstance4Tarifa(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Tarifa(mapper.readValue(relatedInstanceJsonOid, TarifaOid.class)): Tarifa.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DetalleTarifa.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
