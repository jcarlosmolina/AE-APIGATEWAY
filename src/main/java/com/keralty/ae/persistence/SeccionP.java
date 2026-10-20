package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.SeccionPConstants;
import com.keralty.ae.persistence.oid.CuestionarioPOid;
import com.keralty.ae.persistence.oid.PreguntaPOid;
import com.keralty.ae.persistence.oid.SeccionPOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>SeccionP</code> external model class.
 * <p>
 * External Model Class: <code>SeccionP</code><br>
 */
public class SeccionP extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="identificador")
    private Long seccionPIdentificador;

    @JsonProperty(value="nombre")
    private String seccionPNombre;

    @JsonProperty(value="numorden")
    private Long seccionPNumOrden;

    @JsonProperty(value="drvusuariof")
    private Boolean seccionPdrvUsuarioF;

    @JsonProperty(value="drvusuariom")
    private Boolean seccionPdrvUsuarioM;

    @JsonProperty(value="drvusuariomas40")
    private Boolean seccionPdrvUsuarioMas40;

    private Collection <PreguntaP> preguntas;

    private CuestionarioP cuestionario;

    /**
     * Gets the value of attribute Identificador
     */
    public Long getSeccionPIdentificador() {
        return seccionPIdentificador;
    }
    
    /**
     * Sets the value of attribute Identificador
     */
    public void setSeccionPIdentificador(Long seccionPIdentificador) {
        this.seccionPIdentificador = seccionPIdentificador;
    }

    /**
     * Gets the value of attribute Nombre
     */
    public String getSeccionPNombre() {
        return seccionPNombre;
    }
    
    /**
     * Sets the value of attribute Nombre
     */
    public void setSeccionPNombre(String seccionPNombre) {
        this.seccionPNombre = seccionPNombre;
    }

    /**
     * Gets the value of attribute NumOrden
     */
    public Long getSeccionPNumOrden() {
        return seccionPNumOrden;
    }
    
    /**
     * Sets the value of attribute NumOrden
     */
    public void setSeccionPNumOrden(Long seccionPNumOrden) {
        this.seccionPNumOrden = seccionPNumOrden;
    }

    /**
     * Gets the value of attribute drvUsuarioF
     */
    public Boolean getSeccionPdrvUsuarioF() {
        return seccionPdrvUsuarioF;
    }
    
    /**
     * Sets the value of attribute drvUsuarioF
     */
    public void setSeccionPdrvUsuarioF(Boolean seccionPdrvUsuarioF) {
        this.seccionPdrvUsuarioF = seccionPdrvUsuarioF;
    }

    /**
     * Gets the value of attribute drvUsuarioM
     */
    public Boolean getSeccionPdrvUsuarioM() {
        return seccionPdrvUsuarioM;
    }
    
    /**
     * Sets the value of attribute drvUsuarioM
     */
    public void setSeccionPdrvUsuarioM(Boolean seccionPdrvUsuarioM) {
        this.seccionPdrvUsuarioM = seccionPdrvUsuarioM;
    }

    /**
     * Gets the value of attribute drvUsuarioMas40
     */
    public Boolean getSeccionPdrvUsuarioMas40() {
        return seccionPdrvUsuarioMas40;
    }
    
    /**
     * Sets the value of attribute drvUsuarioMas40
     */
    public void setSeccionPdrvUsuarioMas40(Boolean seccionPdrvUsuarioMas40) {
        this.seccionPdrvUsuarioMas40 = seccionPdrvUsuarioMas40;
    }

    /**
     * Gets the value of relation through role Preguntas
     */
    @JsonIgnore
    public Collection <PreguntaP> getPreguntas() {
        return preguntas;
    }

    /**
     * Gets the value of relation through role Cuestionario
     */
    @JsonIgnore
    public CuestionarioP getCuestionario() {
        return cuestionario;
    }

    /**
     * Default constructor
     */
    public SeccionP() {
        seccionPIdentificador = null;
    }

    /**
     * Constructor used to create instances of <code>SeccionP</code>.
     * @param oid Object Identifier of the instance of <code>SeccionP</code> to be created.
     * @throws SystemException
     */
    public SeccionP(SeccionPOid oid) {
        if (oid != null && !oid.isNull()) {
            seccionPIdentificador = oid.getSeccionPIdentificador();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return SeccionP.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        SeccionP other = (SeccionP)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getSeccionPIdentificador(), other.getSeccionPIdentificador());
        result &= Utilities.isEqual(this.getSeccionPNombre(), other.getSeccionPNombre());
        result &= Utilities.isEqual(this.getSeccionPNumOrden(), other.getSeccionPNumOrden());
        result &= Utilities.isEqual(this.getSeccionPdrvUsuarioF(), other.getSeccionPdrvUsuarioF());
        result &= Utilities.isEqual(this.getSeccionPdrvUsuarioM(), other.getSeccionPdrvUsuarioM());
        result &= Utilities.isEqual(this.getSeccionPdrvUsuarioMas40(), other.getSeccionPdrvUsuarioMas40());
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
     * Returns the <code>SeccionPOid</code> object that identifies this instance of <code>SeccionP</code>.
     * @return <code>SeccionPOid</code> object that identifies this instance of <code>SeccionP</code>
     */
	@Override
    public SeccionPOid getOid() {
        return new SeccionPOid(getSeccionPIdentificador());
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
        if (!activeFacets.contains(Constants.SECCIONP)) {
            activeFacets.add(Constants.SECCIONP);
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
            relatedInstance = buildSeccionPRelatedInstance(relatedInstanceJsonOid);
        }
        if (SeccionPConstants.ROLE_NAME_PREGUNTAS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSeccionPRelatedInstance4PreguntaP(relatedInstanceJsonOid, remainingPath);
        }
        if (SeccionPConstants.ROLE_NAME_CUESTIONARIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSeccionPRelatedInstance4CuestionarioP(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildSeccionPRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new SeccionP(mapper.readValue(relatedInstanceJsonOid, SeccionPOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(SeccionP.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSeccionPRelatedInstance4PreguntaP(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PreguntaP(mapper.readValue(relatedInstanceJsonOid, PreguntaPOid.class)): PreguntaP.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(SeccionP.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSeccionPRelatedInstance4CuestionarioP(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new CuestionarioP(mapper.readValue(relatedInstanceJsonOid, CuestionarioPOid.class)): CuestionarioP.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(SeccionP.class).error(e.getMessage());
            return null;
        }
    }
}
