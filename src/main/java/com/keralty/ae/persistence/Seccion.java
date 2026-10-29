package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.SeccionConstants;
import com.keralty.ae.persistence.oid.CuestionarioMedOid;
import com.keralty.ae.persistence.oid.PreguntaOid;
import com.keralty.ae.persistence.oid.SeccionOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>Seccion</code> external model class.
 * <p>
 * External Model Class: <code>Seccion</code><br>
 */
public class Seccion extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="identificador")
    private Long seccionIdentificador;

    @JsonProperty(value="nombre")
    private String seccionNombre;

    @JsonProperty(value="numorden")
    private Long seccionNumOrden;

    private Collection <Pregunta> preguntas;

    private CuestionarioMed cuestionario;

    /**
     * Gets the value of attribute Identificador
     */
    public Long getSeccionIdentificador() {
        return seccionIdentificador;
    }
    
    /**
     * Sets the value of attribute Identificador
     */
    public void setSeccionIdentificador(Long seccionIdentificador) {
        this.seccionIdentificador = seccionIdentificador;
    }

    /**
     * Gets the value of attribute Nombre
     */
    public String getSeccionNombre() {
        return seccionNombre;
    }
    
    /**
     * Sets the value of attribute Nombre
     */
    public void setSeccionNombre(String seccionNombre) {
        this.seccionNombre = seccionNombre;
    }

    /**
     * Gets the value of attribute NumOrden
     */
    public Long getSeccionNumOrden() {
        return seccionNumOrden;
    }
    
    /**
     * Sets the value of attribute NumOrden
     */
    public void setSeccionNumOrden(Long seccionNumOrden) {
        this.seccionNumOrden = seccionNumOrden;
    }

    /**
     * Gets the value of relation through role Preguntas
     */
    @JsonIgnore
    public Collection <Pregunta> getPreguntas() {
        return preguntas;
    }

    /**
     * Gets the value of relation through role Cuestionario
     */
    @JsonIgnore
    public CuestionarioMed getCuestionario() {
        return cuestionario;
    }

    /**
     * Default constructor
     */
    public Seccion() {
        seccionIdentificador = null;
    }

    /**
     * Constructor used to create instances of <code>Seccion</code>.
     * @param oid Object Identifier of the instance of <code>Seccion</code> to be created.
     * @throws SystemException
     */
    public Seccion(SeccionOid oid) {
        if (oid != null && !oid.isNull()) {
            seccionIdentificador = oid.getSeccionIdentificador();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return Seccion.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Seccion other = (Seccion)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getSeccionIdentificador(), other.getSeccionIdentificador());
        result &= Utilities.isEqual(this.getSeccionNombre(), other.getSeccionNombre());
        result &= Utilities.isEqual(this.getSeccionNumOrden(), other.getSeccionNumOrden());
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
     * Returns the <code>SeccionOid</code> object that identifies this instance of <code>Seccion</code>.
     * @return <code>SeccionOid</code> object that identifies this instance of <code>Seccion</code>
     */
	@Override
    public SeccionOid getOid() {
        return new SeccionOid(getSeccionIdentificador());
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
        if (!activeFacets.contains(Constants.SECCION)) {
            activeFacets.add(Constants.SECCION);
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
            relatedInstance = buildSeccionRelatedInstance(relatedInstanceJsonOid);
        }
        if (SeccionConstants.ROLE_NAME_PREGUNTAS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSeccionRelatedInstance4Pregunta(relatedInstanceJsonOid, remainingPath);
        }
        if (SeccionConstants.ROLE_NAME_CUESTIONARIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSeccionRelatedInstance4CuestionarioMed(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildSeccionRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Seccion(mapper.readValue(relatedInstanceJsonOid, SeccionOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Seccion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildSeccionRelatedInstance4Pregunta(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Pregunta(mapper.readValue(relatedInstanceJsonOid, PreguntaOid.class)): Pregunta.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Seccion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildSeccionRelatedInstance4CuestionarioMed(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new CuestionarioMed(mapper.readValue(relatedInstanceJsonOid, CuestionarioMedOid.class)): CuestionarioMed.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Seccion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
