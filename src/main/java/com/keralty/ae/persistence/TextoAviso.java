package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.persistence.oid.TextoAvisoOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>TextoAviso</code> external model class.
 * <p>
 * External Model Class: <code>TextoAviso</code><br>
 */
public class TextoAviso extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="identificador")
    private String textoAvisoIdentificador;

    @JsonProperty(value="descripcion")
    private String textoAvisoDescripcion;

    @JsonProperty(value="valor")
    private String textoAvisoValor;

    /**
     * Gets the value of attribute Identificador
     */
    public String getTextoAvisoIdentificador() {
        return textoAvisoIdentificador;
    }
    
    /**
     * Sets the value of attribute Identificador
     */
    public void setTextoAvisoIdentificador(String textoAvisoIdentificador) {
        this.textoAvisoIdentificador = textoAvisoIdentificador;
    }

    /**
     * Gets the value of attribute Descripcion
     */
    public String getTextoAvisoDescripcion() {
        return textoAvisoDescripcion;
    }
    
    /**
     * Sets the value of attribute Descripcion
     */
    public void setTextoAvisoDescripcion(String textoAvisoDescripcion) {
        this.textoAvisoDescripcion = textoAvisoDescripcion;
    }

    /**
     * Gets the value of attribute Valor
     */
    public String getTextoAvisoValor() {
        return textoAvisoValor;
    }
    
    /**
     * Sets the value of attribute Valor
     */
    public void setTextoAvisoValor(String textoAvisoValor) {
        this.textoAvisoValor = textoAvisoValor;
    }

    /**
     * Default constructor
     */
    public TextoAviso() {
        textoAvisoIdentificador = null;
    }

    /**
     * Constructor used to create instances of <code>TextoAviso</code>.
     * @param oid Object Identifier of the instance of <code>TextoAviso</code> to be created.
     * @throws SystemException
     */
    public TextoAviso(TextoAvisoOid oid) {
        if (oid != null && !oid.isNull()) {
            textoAvisoIdentificador = oid.getTextoAvisoIdentificador();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return TextoAviso.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        TextoAviso other = (TextoAviso)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getTextoAvisoIdentificador(), other.getTextoAvisoIdentificador());
        result &= Utilities.isEqual(this.getTextoAvisoDescripcion(), other.getTextoAvisoDescripcion());
        result &= Utilities.isEqual(this.getTextoAvisoValor(), other.getTextoAvisoValor());
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
     * Returns the <code>TextoAvisoOid</code> object that identifies this instance of <code>TextoAviso</code>.
     * @return <code>TextoAvisoOid</code> object that identifies this instance of <code>TextoAviso</code>
     */
	@Override
    public TextoAvisoOid getOid() {
        return new TextoAvisoOid(getTextoAvisoIdentificador());
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
        if (!activeFacets.contains(Constants.TEXTOAVISO)) {
            activeFacets.add(Constants.TEXTOAVISO);
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
            relatedInstance = buildTextoAvisoRelatedInstance(relatedInstanceJsonOid);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildTextoAvisoRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new TextoAviso(mapper.readValue(relatedInstanceJsonOid, TextoAvisoOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TextoAviso.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
