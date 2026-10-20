package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.ProrrateoConstants;
import com.keralty.ae.persistence.oid.DominioOid;
import com.keralty.ae.persistence.oid.ProrrateoOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>Prorrateo</code> external model class.
 * <p>
 * External Model Class: <code>Prorrateo</code><br>
 */
public class Prorrateo extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="numero")
    private Long dominioNumero;

    @JsonProperty(value="id_prorrateo")
    private Long prorrateoidProrrateo;

    @JsonProperty(value="dia")
    private Long prorrateoDia;

    @JsonProperty(value="porcentaje")
    private Double prorrateoPorcentaje;

    private Dominio dominio;

    /**
     * Gets the value of attribute Numero
     */
    public Long getDominioNumero() {
        return dominioNumero;
    }
    
    /**
     * Sets the value of attribute Numero
     */
    public void setDominioNumero(Long dominioNumero) {
        this.dominioNumero = dominioNumero;
    }

    /**
     * Gets the value of attribute id_Prorrateo
     */
    public Long getProrrateoidProrrateo() {
        return prorrateoidProrrateo;
    }
    
    /**
     * Sets the value of attribute id_Prorrateo
     */
    public void setProrrateoidProrrateo(Long prorrateoidProrrateo) {
        this.prorrateoidProrrateo = prorrateoidProrrateo;
    }

    /**
     * Gets the value of attribute Dia
     */
    public Long getProrrateoDia() {
        return prorrateoDia;
    }
    
    /**
     * Sets the value of attribute Dia
     */
    public void setProrrateoDia(Long prorrateoDia) {
        this.prorrateoDia = prorrateoDia;
    }

    /**
     * Gets the value of attribute Porcentaje
     */
    public Double getProrrateoPorcentaje() {
        return prorrateoPorcentaje;
    }
    
    /**
     * Sets the value of attribute Porcentaje
     */
    public void setProrrateoPorcentaje(Double prorrateoPorcentaje) {
        this.prorrateoPorcentaje = prorrateoPorcentaje;
    }

    /**
     * Gets the value of relation through role Dominio
     */
    @JsonIgnore
    public Dominio getDominio() {
        return dominio;
    }

    /**
     * Default constructor
     */
    public Prorrateo() {
        dominioNumero = null;
        prorrateoidProrrateo = null;
    }

    /**
     * Constructor used to create instances of <code>Prorrateo</code>.
     * @param oid Object Identifier of the instance of <code>Prorrateo</code> to be created.
     * @throws SystemException
     */
    public Prorrateo(ProrrateoOid oid) {
        if (oid != null && !oid.isNull()) {
            dominioNumero = oid.getDominioNumero();
            prorrateoidProrrateo = oid.getProrrateoidProrrateo();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return Prorrateo.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Prorrateo other = (Prorrateo)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getProrrateoidProrrateo(), other.getProrrateoidProrrateo());
        result &= Utilities.isEqual(this.getProrrateoDia(), other.getProrrateoDia());
        result &= Utilities.isEqual(this.getProrrateoPorcentaje(), other.getProrrateoPorcentaje());
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
     * Returns the <code>ProrrateoOid</code> object that identifies this instance of <code>Prorrateo</code>.
     * @return <code>ProrrateoOid</code> object that identifies this instance of <code>Prorrateo</code>
     */
	@Override
    public ProrrateoOid getOid() {
        return new ProrrateoOid(getDominioNumero(), getProrrateoidProrrateo());
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
        if (!activeFacets.contains(Constants.PRORRATEO)) {
            activeFacets.add(Constants.PRORRATEO);
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
            relatedInstance = buildProrrateoRelatedInstance(relatedInstanceJsonOid);
        }
        if (ProrrateoConstants.ROLE_NAME_DOMINIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildProrrateoRelatedInstance4Dominio(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildProrrateoRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Prorrateo(mapper.readValue(relatedInstanceJsonOid, ProrrateoOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Prorrateo.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildProrrateoRelatedInstance4Dominio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Dominio(mapper.readValue(relatedInstanceJsonOid, DominioOid.class)): Dominio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Prorrateo.class).error(e.getMessage());
            return null;
        }
    }
}
