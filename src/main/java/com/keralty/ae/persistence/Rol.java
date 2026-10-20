package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.RolConstants;
import com.keralty.ae.persistence.oid.DominioOid;
import com.keralty.ae.persistence.oid.FuncionarioOid;
import com.keralty.ae.persistence.oid.RolOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>Rol</code> external model class.
 * <p>
 * External Model Class: <code>Rol</code><br>
 */
public class Rol extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="identificador")
    private Long rolIdentificador;

    @JsonProperty(value="nombre")
    private String rolNombre;

    private Collection <Funcionario> agentes;

    private Collection <Dominio> dominios;

    /**
     * Gets the value of attribute Identificador
     */
    public Long getRolIdentificador() {
        return rolIdentificador;
    }
    
    /**
     * Sets the value of attribute Identificador
     */
    public void setRolIdentificador(Long rolIdentificador) {
        this.rolIdentificador = rolIdentificador;
    }

    /**
     * Gets the value of attribute Nombre
     */
    public String getRolNombre() {
        return rolNombre;
    }
    
    /**
     * Sets the value of attribute Nombre
     */
    public void setRolNombre(String rolNombre) {
        this.rolNombre = rolNombre;
    }

    /**
     * Gets the value of relation through role Agentes
     */
    @JsonIgnore
    public Collection <Funcionario> getAgentes() {
        return agentes;
    }

    /**
     * Gets the value of relation through role Dominios
     */
    @JsonIgnore
    public Collection <Dominio> getDominios() {
        return dominios;
    }

    /**
     * Default constructor
     */
    public Rol() {
        rolIdentificador = null;
    }

    /**
     * Constructor used to create instances of <code>Rol</code>.
     * @param oid Object Identifier of the instance of <code>Rol</code> to be created.
     * @throws SystemException
     */
    public Rol(RolOid oid) {
        if (oid != null && !oid.isNull()) {
            rolIdentificador = oid.getRolIdentificador();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return Rol.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Rol other = (Rol)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getRolIdentificador(), other.getRolIdentificador());
        result &= Utilities.isEqual(this.getRolNombre(), other.getRolNombre());
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
     * Returns the <code>RolOid</code> object that identifies this instance of <code>Rol</code>.
     * @return <code>RolOid</code> object that identifies this instance of <code>Rol</code>
     */
	@Override
    public RolOid getOid() {
        return new RolOid(getRolIdentificador());
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
        if (!activeFacets.contains(Constants.ROL)) {
            activeFacets.add(Constants.ROL);
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
            relatedInstance = buildRolRelatedInstance(relatedInstanceJsonOid);
        }
        if (RolConstants.ROLE_NAME_AGENTES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildRolRelatedInstance4Funcionario(relatedInstanceJsonOid, remainingPath);
        }
        if (RolConstants.ROLE_NAME_DOMINIOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildRolRelatedInstance4Dominio(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildRolRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Rol(mapper.readValue(relatedInstanceJsonOid, RolOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Rol.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildRolRelatedInstance4Funcionario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Funcionario(mapper.readValue(relatedInstanceJsonOid, FuncionarioOid.class)): Funcionario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Rol.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildRolRelatedInstance4Dominio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Dominio(mapper.readValue(relatedInstanceJsonOid, DominioOid.class)): Dominio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Rol.class).error(e.getMessage());
            return null;
        }
    }
}
