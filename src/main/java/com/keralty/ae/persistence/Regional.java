package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.RegionalConstants;
import com.keralty.ae.persistence.oid.DirSucursalCOid;
import com.keralty.ae.persistence.oid.RegionalOid;
import com.keralty.ae.persistence.oid.RespRegionalOid;
import com.keralty.ae.persistence.oid.SucursalOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>Regional</code> external model class.
 * <p>
 * External Model Class: <code>Regional</code><br>
 */
public class Regional extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="codigo")
    private Long regionalCodigo;

    @JsonProperty(value="descripcion")
    private String regionalDescripcion;

    private RespRegional respRegional;

    private Collection <Sucursal> sucursales;

    private Collection <DirSucursalC> dirSucursalC;

    /**
     * Gets the value of attribute Codigo
     */
    public Long getRegionalCodigo() {
        return regionalCodigo;
    }
    
    /**
     * Sets the value of attribute Codigo
     */
    public void setRegionalCodigo(Long regionalCodigo) {
        this.regionalCodigo = regionalCodigo;
    }

    /**
     * Gets the value of attribute Descripcion
     */
    public String getRegionalDescripcion() {
        return regionalDescripcion;
    }
    
    /**
     * Sets the value of attribute Descripcion
     */
    public void setRegionalDescripcion(String regionalDescripcion) {
        this.regionalDescripcion = regionalDescripcion;
    }

    /**
     * Gets the value of relation through role RespRegional
     */
    @JsonIgnore
    public RespRegional getRespRegional() {
        return respRegional;
    }

    /**
     * Gets the value of relation through role Sucursales
     */
    @JsonIgnore
    public Collection <Sucursal> getSucursales() {
        return sucursales;
    }

    /**
     * Gets the value of relation through role DirSucursalC
     */
    @JsonIgnore
    public Collection <DirSucursalC> getDirSucursalC() {
        return dirSucursalC;
    }

    /**
     * Default constructor
     */
    public Regional() {
        regionalCodigo = null;
    }

    /**
     * Constructor used to create instances of <code>Regional</code>.
     * @param oid Object Identifier of the instance of <code>Regional</code> to be created.
     * @throws SystemException
     */
    public Regional(RegionalOid oid) {
        if (oid != null && !oid.isNull()) {
            regionalCodigo = oid.getRegionalCodigo();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return Regional.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Regional other = (Regional)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getRegionalCodigo(), other.getRegionalCodigo());
        result &= Utilities.isEqual(this.getRegionalDescripcion(), other.getRegionalDescripcion());
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
     * Returns the <code>RegionalOid</code> object that identifies this instance of <code>Regional</code>.
     * @return <code>RegionalOid</code> object that identifies this instance of <code>Regional</code>
     */
	@Override
    public RegionalOid getOid() {
        return new RegionalOid(getRegionalCodigo());
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
        if (!activeFacets.contains(Constants.REGIONAL)) {
            activeFacets.add(Constants.REGIONAL);
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
            relatedInstance = buildRegionalRelatedInstance(relatedInstanceJsonOid);
        }
        if (RegionalConstants.ROLE_NAME_RESPREGIONAL.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildRegionalRelatedInstance4RespRegional(relatedInstanceJsonOid, remainingPath);
        }
        if (RegionalConstants.ROLE_NAME_SUCURSALES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildRegionalRelatedInstance4Sucursal(relatedInstanceJsonOid, remainingPath);
        }
        if (RegionalConstants.ROLE_NAME_DIRSUCURSALC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildRegionalRelatedInstance4DirSucursalC(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildRegionalRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Regional(mapper.readValue(relatedInstanceJsonOid, RegionalOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Regional.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildRegionalRelatedInstance4RespRegional(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new RespRegional(mapper.readValue(relatedInstanceJsonOid, RespRegionalOid.class)): RespRegional.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Regional.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildRegionalRelatedInstance4Sucursal(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Sucursal(mapper.readValue(relatedInstanceJsonOid, SucursalOid.class)): Sucursal.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Regional.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildRegionalRelatedInstance4DirSucursalC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new DirSucursalC(mapper.readValue(relatedInstanceJsonOid, DirSucursalCOid.class)): DirSucursalC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Regional.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
