package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.TipoSucursalCConstants;
import com.keralty.ae.persistence.oid.DirSucursalCOid;
import com.keralty.ae.persistence.oid.TipoSucursalCOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>TipoSucursalC</code> external model class.
 * <p>
 * External Model Class: <code>TipoSucursalC</code><br>
 */
public class TipoSucursalC extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="codigo")
    private Long tipoSucursalCCodigo;

    @JsonProperty(value="descripcion")
    private String tipoSucursalCDescripcion;

    private Collection <DirSucursalC> dirSucursalesC;

    /**
     * Gets the value of attribute Codigo
     */
    public Long getTipoSucursalCCodigo() {
        return tipoSucursalCCodigo;
    }
    
    /**
     * Sets the value of attribute Codigo
     */
    public void setTipoSucursalCCodigo(Long tipoSucursalCCodigo) {
        this.tipoSucursalCCodigo = tipoSucursalCCodigo;
    }

    /**
     * Gets the value of attribute Descripcion
     */
    public String getTipoSucursalCDescripcion() {
        return tipoSucursalCDescripcion;
    }
    
    /**
     * Sets the value of attribute Descripcion
     */
    public void setTipoSucursalCDescripcion(String tipoSucursalCDescripcion) {
        this.tipoSucursalCDescripcion = tipoSucursalCDescripcion;
    }

    /**
     * Gets the value of relation through role DirSucursalesC
     */
    @JsonIgnore
    public Collection <DirSucursalC> getDirSucursalesC() {
        return dirSucursalesC;
    }

    /**
     * Default constructor
     */
    public TipoSucursalC() {
        tipoSucursalCCodigo = null;
    }

    /**
     * Constructor used to create instances of <code>TipoSucursalC</code>.
     * @param oid Object Identifier of the instance of <code>TipoSucursalC</code> to be created.
     * @throws SystemException
     */
    public TipoSucursalC(TipoSucursalCOid oid) {
        if (oid != null && !oid.isNull()) {
            tipoSucursalCCodigo = oid.getTipoSucursalCCodigo();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return TipoSucursalC.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        TipoSucursalC other = (TipoSucursalC)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getTipoSucursalCCodigo(), other.getTipoSucursalCCodigo());
        result &= Utilities.isEqual(this.getTipoSucursalCDescripcion(), other.getTipoSucursalCDescripcion());
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
     * Returns the <code>TipoSucursalCOid</code> object that identifies this instance of <code>TipoSucursalC</code>.
     * @return <code>TipoSucursalCOid</code> object that identifies this instance of <code>TipoSucursalC</code>
     */
	@Override
    public TipoSucursalCOid getOid() {
        return new TipoSucursalCOid(getTipoSucursalCCodigo());
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
        if (!activeFacets.contains(Constants.TIPOSUCURSALC)) {
            activeFacets.add(Constants.TIPOSUCURSALC);
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
            relatedInstance = buildTipoSucursalCRelatedInstance(relatedInstanceJsonOid);
        }
        if (TipoSucursalCConstants.ROLE_NAME_DIRSUCURSALESC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoSucursalCRelatedInstance4DirSucursalC(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildTipoSucursalCRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new TipoSucursalC(mapper.readValue(relatedInstanceJsonOid, TipoSucursalCOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoSucursalC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildTipoSucursalCRelatedInstance4DirSucursalC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new DirSucursalC(mapper.readValue(relatedInstanceJsonOid, DirSucursalCOid.class)): DirSucursalC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoSucursalC.class).error(e.getMessage());
            return null;
        }
    }
}
