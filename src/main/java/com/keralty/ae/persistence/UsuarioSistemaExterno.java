package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.persistence.oid.UsuarioSistemaExternoOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>UsuarioSistemaExterno</code> external model class.
 * <p>
 * External Model Class: <code>UsuarioSistemaExterno</code><br>
 */
public class UsuarioSistemaExterno extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="login")
    private String usuarioSistemaExternoLogin;

    @JsonProperty(value="descripcion")
    private String usuarioSistemaExternoDescripcion;

    @JsonProperty(value="password")
    private String passWord;

    /**
     * Gets the value of attribute Login
     */
    public String getUsuarioSistemaExternoLogin() {
        return usuarioSistemaExternoLogin;
    }
    
    /**
     * Sets the value of attribute Login
     */
    public void setUsuarioSistemaExternoLogin(String usuarioSistemaExternoLogin) {
        this.usuarioSistemaExternoLogin = usuarioSistemaExternoLogin;
    }

    /**
     * Gets the value of attribute Descripcion
     */
    public String getUsuarioSistemaExternoDescripcion() {
        return usuarioSistemaExternoDescripcion;
    }
    
    /**
     * Sets the value of attribute Descripcion
     */
    public void setUsuarioSistemaExternoDescripcion(String usuarioSistemaExternoDescripcion) {
        this.usuarioSistemaExternoDescripcion = usuarioSistemaExternoDescripcion;
    }

    /**
     * Gets the value of attribute Password
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * Sets the value of attribute Password
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * Default constructor
     */
    public UsuarioSistemaExterno() {
        usuarioSistemaExternoLogin = null;
    }

    /**
     * Constructor used to create instances of <code>UsuarioSistemaExterno</code>.
     * @param oid Object Identifier of the instance of <code>UsuarioSistemaExterno</code> to be created.
     * @throws SystemException
     */
    public UsuarioSistemaExterno(UsuarioSistemaExternoOid oid) {
        if (oid != null && !oid.isNull()) {
            usuarioSistemaExternoLogin = oid.getUsuarioSistemaExternoLogin();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return UsuarioSistemaExterno.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        UsuarioSistemaExterno other = (UsuarioSistemaExterno)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getUsuarioSistemaExternoLogin(), other.getUsuarioSistemaExternoLogin());
        result &= Utilities.isEqual(this.getUsuarioSistemaExternoDescripcion(), other.getUsuarioSistemaExternoDescripcion());
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
     * Returns the <code>UsuarioSistemaExternoOid</code> object that identifies this instance of <code>UsuarioSistemaExterno</code>.
     * @return <code>UsuarioSistemaExternoOid</code> object that identifies this instance of <code>UsuarioSistemaExterno</code>
     */
	@Override
    public UsuarioSistemaExternoOid getOid() {
        return new UsuarioSistemaExternoOid(getUsuarioSistemaExternoLogin());
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
        if (!activeFacets.contains(Constants.USUARIOSISTEMAEXTERNO)) {
            activeFacets.add(Constants.USUARIOSISTEMAEXTERNO);
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
            relatedInstance = buildUsuarioSistemaExternoRelatedInstance(relatedInstanceJsonOid);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildUsuarioSistemaExternoRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new UsuarioSistemaExterno(mapper.readValue(relatedInstanceJsonOid, UsuarioSistemaExternoOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(UsuarioSistemaExterno.class).error(e.getMessage());
            return null;
        }
    }
}
