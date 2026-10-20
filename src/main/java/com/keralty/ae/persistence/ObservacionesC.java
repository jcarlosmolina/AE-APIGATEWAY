package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.ObservacionesCConstants;
import com.keralty.ae.persistence.oid.ContratoCOid;
import com.keralty.ae.persistence.oid.ObservacionesCOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>ObservacionesC</code> external model class.
 * <p>
 * External Model Class: <code>ObservacionesC</code><br>
 */
public class ObservacionesC extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="identificador")
    private Long observacionesCIdentificador;

    @JsonProperty(value="codtipoobservacion")
    private String observacionesCCodTipoObservacion;

    @JsonProperty(value="tipoobservacion")
    private String observacionesCTipoObservacion;

    @JsonProperty(value="observacions")
    private String observacionesCObservacions;

    private ContratoC contratoC;

    /**
     * Gets the value of attribute Identificador
     */
    public Long getObservacionesCIdentificador() {
        return observacionesCIdentificador;
    }
    
    /**
     * Sets the value of attribute Identificador
     */
    public void setObservacionesCIdentificador(Long observacionesCIdentificador) {
        this.observacionesCIdentificador = observacionesCIdentificador;
    }

    /**
     * Gets the value of attribute CodTipoObservacion
     */
    public String getObservacionesCCodTipoObservacion() {
        return observacionesCCodTipoObservacion;
    }
    
    /**
     * Sets the value of attribute CodTipoObservacion
     */
    public void setObservacionesCCodTipoObservacion(String observacionesCCodTipoObservacion) {
        this.observacionesCCodTipoObservacion = observacionesCCodTipoObservacion;
    }

    /**
     * Gets the value of attribute TipoObservacion
     */
    public String getObservacionesCTipoObservacion() {
        return observacionesCTipoObservacion;
    }
    
    /**
     * Sets the value of attribute TipoObservacion
     */
    public void setObservacionesCTipoObservacion(String observacionesCTipoObservacion) {
        this.observacionesCTipoObservacion = observacionesCTipoObservacion;
    }

    /**
     * Gets the value of attribute Observacions
     */
    public String getObservacionesCObservacions() {
        return observacionesCObservacions;
    }
    
    /**
     * Sets the value of attribute Observacions
     */
    public void setObservacionesCObservacions(String observacionesCObservacions) {
        this.observacionesCObservacions = observacionesCObservacions;
    }

    /**
     * Gets the value of relation through role ContratoC
     */
    @JsonIgnore
    public ContratoC getContratoC() {
        return contratoC;
    }

    /**
     * Default constructor
     */
    public ObservacionesC() {
        observacionesCIdentificador = null;
    }

    /**
     * Constructor used to create instances of <code>ObservacionesC</code>.
     * @param oid Object Identifier of the instance of <code>ObservacionesC</code> to be created.
     * @throws SystemException
     */
    public ObservacionesC(ObservacionesCOid oid) {
        if (oid != null && !oid.isNull()) {
            observacionesCIdentificador = oid.getObservacionesCIdentificador();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return ObservacionesC.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        ObservacionesC other = (ObservacionesC)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getObservacionesCIdentificador(), other.getObservacionesCIdentificador());
        result &= Utilities.isEqual(this.getObservacionesCCodTipoObservacion(), other.getObservacionesCCodTipoObservacion());
        result &= Utilities.isEqual(this.getObservacionesCTipoObservacion(), other.getObservacionesCTipoObservacion());
        result &= Utilities.isEqual(this.getObservacionesCObservacions(), other.getObservacionesCObservacions());
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
     * Returns the <code>ObservacionesCOid</code> object that identifies this instance of <code>ObservacionesC</code>.
     * @return <code>ObservacionesCOid</code> object that identifies this instance of <code>ObservacionesC</code>
     */
	@Override
    public ObservacionesCOid getOid() {
        return new ObservacionesCOid(getObservacionesCIdentificador());
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
        if (!activeFacets.contains(Constants.OBSERVACIONESC)) {
            activeFacets.add(Constants.OBSERVACIONESC);
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
            relatedInstance = buildObservacionesCRelatedInstance(relatedInstanceJsonOid);
        }
        if (ObservacionesCConstants.ROLE_NAME_CONTRATOC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildObservacionesCRelatedInstance4ContratoC(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildObservacionesCRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new ObservacionesC(mapper.readValue(relatedInstanceJsonOid, ObservacionesCOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ObservacionesC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildObservacionesCRelatedInstance4ContratoC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ContratoC(mapper.readValue(relatedInstanceJsonOid, ContratoCOid.class)): ContratoC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ObservacionesC.class).error(e.getMessage());
            return null;
        }
    }
}
