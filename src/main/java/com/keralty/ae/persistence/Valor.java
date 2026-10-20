package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.ValorConstants;
import com.keralty.ae.persistence.oid.PreguntaOid;
import com.keralty.ae.persistence.oid.ValorOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>Valor</code> external model class.
 * <p>
 * External Model Class: <code>Valor</code><br>
 */
public class Valor extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="identificador")
    private Long valorIdentificador;

    @JsonProperty(value="valorposible")
    private String valorValorPosible;

    private Collection <Pregunta> preguntas;

    /**
     * Gets the value of attribute Identificador
     */
    public Long getValorIdentificador() {
        return valorIdentificador;
    }
    
    /**
     * Sets the value of attribute Identificador
     */
    public void setValorIdentificador(Long valorIdentificador) {
        this.valorIdentificador = valorIdentificador;
    }

    /**
     * Gets the value of attribute ValorPosible
     */
    public String getValorValorPosible() {
        return valorValorPosible;
    }
    
    /**
     * Sets the value of attribute ValorPosible
     */
    public void setValorValorPosible(String valorValorPosible) {
        this.valorValorPosible = valorValorPosible;
    }

    /**
     * Gets the value of relation through role Preguntas
     */
    @JsonIgnore
    public Collection <Pregunta> getPreguntas() {
        return preguntas;
    }

    /**
     * Default constructor
     */
    public Valor() {
        valorIdentificador = null;
    }

    /**
     * Constructor used to create instances of <code>Valor</code>.
     * @param oid Object Identifier of the instance of <code>Valor</code> to be created.
     * @throws SystemException
     */
    public Valor(ValorOid oid) {
        if (oid != null && !oid.isNull()) {
            valorIdentificador = oid.getValorIdentificador();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return Valor.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Valor other = (Valor)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getValorIdentificador(), other.getValorIdentificador());
        result &= Utilities.isEqual(this.getValorValorPosible(), other.getValorValorPosible());
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
     * Returns the <code>ValorOid</code> object that identifies this instance of <code>Valor</code>.
     * @return <code>ValorOid</code> object that identifies this instance of <code>Valor</code>
     */
	@Override
    public ValorOid getOid() {
        return new ValorOid(getValorIdentificador());
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
        if (!activeFacets.contains(Constants.VALOR)) {
            activeFacets.add(Constants.VALOR);
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
            relatedInstance = buildValorRelatedInstance(relatedInstanceJsonOid);
        }
        if (ValorConstants.ROLE_NAME_PREGUNTAS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildValorRelatedInstance4Pregunta(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildValorRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Valor(mapper.readValue(relatedInstanceJsonOid, ValorOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Valor.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildValorRelatedInstance4Pregunta(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Pregunta(mapper.readValue(relatedInstanceJsonOid, PreguntaOid.class)): Pregunta.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Valor.class).error(e.getMessage());
            return null;
        }
    }
}
