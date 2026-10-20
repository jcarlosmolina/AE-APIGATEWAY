package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.SucursalConstants;
import com.keralty.ae.persistence.oid.ContratoCOid;
import com.keralty.ae.persistence.oid.FuncionarioOid;
import com.keralty.ae.persistence.oid.RegionalOid;
import com.keralty.ae.persistence.oid.SucursalOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>Sucursal</code> external model class.
 * <p>
 * External Model Class: <code>Sucursal</code><br>
 */
public class Sucursal extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="codigo")
    private Long sucursalCodigo;

    @JsonProperty(value="descripcion")
    private String sucursalDescripcion;

    private Collection <Funcionario> agentes;

    private Collection <ContratoC> contratosC;

    private Regional regional;

    /**
     * Gets the value of attribute Codigo
     */
    public Long getSucursalCodigo() {
        return sucursalCodigo;
    }
    
    /**
     * Sets the value of attribute Codigo
     */
    public void setSucursalCodigo(Long sucursalCodigo) {
        this.sucursalCodigo = sucursalCodigo;
    }

    /**
     * Gets the value of attribute Descripcion
     */
    public String getSucursalDescripcion() {
        return sucursalDescripcion;
    }
    
    /**
     * Sets the value of attribute Descripcion
     */
    public void setSucursalDescripcion(String sucursalDescripcion) {
        this.sucursalDescripcion = sucursalDescripcion;
    }

    /**
     * Gets the value of relation through role Agentes
     */
    @JsonIgnore
    public Collection <Funcionario> getAgentes() {
        return agentes;
    }

    /**
     * Gets the value of relation through role ContratosC
     */
    @JsonIgnore
    public Collection <ContratoC> getContratosC() {
        return contratosC;
    }

    /**
     * Gets the value of relation through role Regional
     */
    @JsonIgnore
    public Regional getRegional() {
        return regional;
    }

    /**
     * Default constructor
     */
    public Sucursal() {
        sucursalCodigo = null;
    }

    /**
     * Constructor used to create instances of <code>Sucursal</code>.
     * @param oid Object Identifier of the instance of <code>Sucursal</code> to be created.
     * @throws SystemException
     */
    public Sucursal(SucursalOid oid) {
        if (oid != null && !oid.isNull()) {
            sucursalCodigo = oid.getSucursalCodigo();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return Sucursal.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Sucursal other = (Sucursal)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getSucursalCodigo(), other.getSucursalCodigo());
        result &= Utilities.isEqual(this.getSucursalDescripcion(), other.getSucursalDescripcion());
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
     * Returns the <code>SucursalOid</code> object that identifies this instance of <code>Sucursal</code>.
     * @return <code>SucursalOid</code> object that identifies this instance of <code>Sucursal</code>
     */
	@Override
    public SucursalOid getOid() {
        return new SucursalOid(getSucursalCodigo());
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
        if (!activeFacets.contains(Constants.SUCURSAL)) {
            activeFacets.add(Constants.SUCURSAL);
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
            relatedInstance = buildSucursalRelatedInstance(relatedInstanceJsonOid);
        }
        if (SucursalConstants.ROLE_NAME_AGENTES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSucursalRelatedInstance4Funcionario(relatedInstanceJsonOid, remainingPath);
        }
        if (SucursalConstants.ROLE_NAME_CONTRATOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSucursalRelatedInstance4ContratoC(relatedInstanceJsonOid, remainingPath);
        }
        if (SucursalConstants.ROLE_NAME_REGIONAL.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSucursalRelatedInstance4Regional(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildSucursalRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Sucursal(mapper.readValue(relatedInstanceJsonOid, SucursalOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Sucursal.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSucursalRelatedInstance4Funcionario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Funcionario(mapper.readValue(relatedInstanceJsonOid, FuncionarioOid.class)): Funcionario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Sucursal.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSucursalRelatedInstance4ContratoC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ContratoC(mapper.readValue(relatedInstanceJsonOid, ContratoCOid.class)): ContratoC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Sucursal.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSucursalRelatedInstance4Regional(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Regional(mapper.readValue(relatedInstanceJsonOid, RegionalOid.class)): Regional.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Sucursal.class).error(e.getMessage());
            return null;
        }
    }
}
