package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.CuestionarioPConstants;
import com.keralty.ae.persistence.oid.CuestionarioPOid;
import com.keralty.ae.persistence.oid.SeccionPOid;
import com.keralty.ae.persistence.oid.UsuarioOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>CuestionarioP</code> external model class.
 * <p>
 * External Model Class: <code>CuestionarioP</code><br>
 */
public class CuestionarioP extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="numero")
    private Long cuestionarioPNumero;

    @JsonProperty(value="nombre")
    private String cuestionarioPNombre;

    @JsonProperty(value="yadiligenciado")
    private Boolean cuestionarioPYaDiligenciado;

    private Collection <SeccionP> secciones;

    private Usuario usuario;

    /**
     * Gets the value of attribute Numero
     */
    public Long getCuestionarioPNumero() {
        return cuestionarioPNumero;
    }
    
    /**
     * Sets the value of attribute Numero
     */
    public void setCuestionarioPNumero(Long cuestionarioPNumero) {
        this.cuestionarioPNumero = cuestionarioPNumero;
    }

    /**
     * Gets the value of attribute Nombre
     */
    public String getCuestionarioPNombre() {
        return cuestionarioPNombre;
    }
    
    /**
     * Sets the value of attribute Nombre
     */
    public void setCuestionarioPNombre(String cuestionarioPNombre) {
        this.cuestionarioPNombre = cuestionarioPNombre;
    }

    /**
     * Gets the value of attribute YaDiligenciado
     */
    public Boolean getCuestionarioPYaDiligenciado() {
        return cuestionarioPYaDiligenciado;
    }
    
    /**
     * Sets the value of attribute YaDiligenciado
     */
    public void setCuestionarioPYaDiligenciado(Boolean cuestionarioPYaDiligenciado) {
        this.cuestionarioPYaDiligenciado = cuestionarioPYaDiligenciado;
    }

    /**
     * Gets the value of relation through role Secciones
     */
    @JsonIgnore
    public Collection <SeccionP> getSecciones() {
        return secciones;
    }

    /**
     * Gets the value of relation through role Usuario
     */
    @JsonIgnore
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Default constructor
     */
    public CuestionarioP() {
        cuestionarioPNumero = null;
    }

    /**
     * Constructor used to create instances of <code>CuestionarioP</code>.
     * @param oid Object Identifier of the instance of <code>CuestionarioP</code> to be created.
     * @throws SystemException
     */
    public CuestionarioP(CuestionarioPOid oid) {
        if (oid != null && !oid.isNull()) {
            cuestionarioPNumero = oid.getCuestionarioPNumero();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return CuestionarioP.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        CuestionarioP other = (CuestionarioP)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getCuestionarioPNumero(), other.getCuestionarioPNumero());
        result &= Utilities.isEqual(this.getCuestionarioPNombre(), other.getCuestionarioPNombre());
        result &= Utilities.isEqual(this.getCuestionarioPYaDiligenciado(), other.getCuestionarioPYaDiligenciado());
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
     * Returns the <code>CuestionarioPOid</code> object that identifies this instance of <code>CuestionarioP</code>.
     * @return <code>CuestionarioPOid</code> object that identifies this instance of <code>CuestionarioP</code>
     */
	@Override
    public CuestionarioPOid getOid() {
        return new CuestionarioPOid(getCuestionarioPNumero());
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
        if (!activeFacets.contains(Constants.CUESTIONARIOP)) {
            activeFacets.add(Constants.CUESTIONARIOP);
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
            relatedInstance = buildCuestionarioPRelatedInstance(relatedInstanceJsonOid);
        }
        if (CuestionarioPConstants.ROLE_NAME_SECCIONES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildCuestionarioPRelatedInstance4SeccionP(relatedInstanceJsonOid, remainingPath);
        }
        if (CuestionarioPConstants.ROLE_NAME_USUARIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildCuestionarioPRelatedInstance4Usuario(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildCuestionarioPRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new CuestionarioP(mapper.readValue(relatedInstanceJsonOid, CuestionarioPOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(CuestionarioP.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildCuestionarioPRelatedInstance4SeccionP(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new SeccionP(mapper.readValue(relatedInstanceJsonOid, SeccionPOid.class)): SeccionP.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(CuestionarioP.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildCuestionarioPRelatedInstance4Usuario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Usuario(mapper.readValue(relatedInstanceJsonOid, UsuarioOid.class)): Usuario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(CuestionarioP.class).error(e.getMessage());
            return null;
        }
    }
}
