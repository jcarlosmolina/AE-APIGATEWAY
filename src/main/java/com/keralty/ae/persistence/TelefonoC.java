package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.TelefonoCConstants;
import com.keralty.ae.persistence.oid.DireccionCOid;
import com.keralty.ae.persistence.oid.DirSucursalCOid;
import com.keralty.ae.persistence.oid.TelefonoCOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>TelefonoC</code> external model class.
 * <p>
 * External Model Class: <code>TelefonoC</code><br>
 */
public class TelefonoC extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id")
    private Long telefonoCID;

    @JsonProperty(value="codigo")
    private Long telefonoCCodigo;

    @JsonProperty(value="telefono")
    private String telefonoCTelefono;

    @JsonProperty(value="indicativopais")
    private String telefonoCIndicativoPais;

    @JsonProperty(value="codigoarea")
    private String telefonoCCodigoArea;

    @JsonProperty(value="ext")
    private String telefonoCExt;

    private DirSucursalC dirSucursalC;

    private DireccionC direccionC;

    /**
     * Gets the value of attribute ID
     */
    public Long getTelefonoCID() {
        return telefonoCID;
    }
    
    /**
     * Sets the value of attribute ID
     */
    public void setTelefonoCID(Long telefonoCID) {
        this.telefonoCID = telefonoCID;
    }

    /**
     * Gets the value of attribute Codigo
     */
    public Long getTelefonoCCodigo() {
        return telefonoCCodigo;
    }
    
    /**
     * Sets the value of attribute Codigo
     */
    public void setTelefonoCCodigo(Long telefonoCCodigo) {
        this.telefonoCCodigo = telefonoCCodigo;
    }

    /**
     * Gets the value of attribute Telefono
     */
    public String getTelefonoCTelefono() {
        return telefonoCTelefono;
    }
    
    /**
     * Sets the value of attribute Telefono
     */
    public void setTelefonoCTelefono(String telefonoCTelefono) {
        this.telefonoCTelefono = telefonoCTelefono;
    }

    /**
     * Gets the value of attribute IndicativoPais
     */
    public String getTelefonoCIndicativoPais() {
        return telefonoCIndicativoPais;
    }
    
    /**
     * Sets the value of attribute IndicativoPais
     */
    public void setTelefonoCIndicativoPais(String telefonoCIndicativoPais) {
        this.telefonoCIndicativoPais = telefonoCIndicativoPais;
    }

    /**
     * Gets the value of attribute CodigoArea
     */
    public String getTelefonoCCodigoArea() {
        return telefonoCCodigoArea;
    }
    
    /**
     * Sets the value of attribute CodigoArea
     */
    public void setTelefonoCCodigoArea(String telefonoCCodigoArea) {
        this.telefonoCCodigoArea = telefonoCCodigoArea;
    }

    /**
     * Gets the value of attribute Ext
     */
    public String getTelefonoCExt() {
        return telefonoCExt;
    }
    
    /**
     * Sets the value of attribute Ext
     */
    public void setTelefonoCExt(String telefonoCExt) {
        this.telefonoCExt = telefonoCExt;
    }

    /**
     * Gets the value of relation through role DirSucursalC
     */
    @JsonIgnore
    public DirSucursalC getDirSucursalC() {
        return dirSucursalC;
    }

    /**
     * Gets the value of relation through role DireccionC
     */
    @JsonIgnore
    public DireccionC getDireccionC() {
        return direccionC;
    }

    /**
     * Default constructor
     */
    public TelefonoC() {
        telefonoCID = null;
    }

    /**
     * Constructor used to create instances of <code>TelefonoC</code>.
     * @param oid Object Identifier of the instance of <code>TelefonoC</code> to be created.
     * @throws SystemException
     */
    public TelefonoC(TelefonoCOid oid) {
        if (oid != null && !oid.isNull()) {
            telefonoCID = oid.getTelefonoCID();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return TelefonoC.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        TelefonoC other = (TelefonoC)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getTelefonoCID(), other.getTelefonoCID());
        result &= Utilities.isEqual(this.getTelefonoCCodigo(), other.getTelefonoCCodigo());
        result &= Utilities.isEqual(this.getTelefonoCTelefono(), other.getTelefonoCTelefono());
        result &= Utilities.isEqual(this.getTelefonoCIndicativoPais(), other.getTelefonoCIndicativoPais());
        result &= Utilities.isEqual(this.getTelefonoCCodigoArea(), other.getTelefonoCCodigoArea());
        result &= Utilities.isEqual(this.getTelefonoCExt(), other.getTelefonoCExt());
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
     * Returns the <code>TelefonoCOid</code> object that identifies this instance of <code>TelefonoC</code>.
     * @return <code>TelefonoCOid</code> object that identifies this instance of <code>TelefonoC</code>
     */
	@Override
    public TelefonoCOid getOid() {
        return new TelefonoCOid(getTelefonoCID());
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
        if (!activeFacets.contains(Constants.TELEFONOC)) {
            activeFacets.add(Constants.TELEFONOC);
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
            relatedInstance = buildTelefonoCRelatedInstance(relatedInstanceJsonOid);
        }
        if (TelefonoCConstants.ROLE_NAME_DIRSUCURSALC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTelefonoCRelatedInstance4DirSucursalC(relatedInstanceJsonOid, remainingPath);
        }
        if (TelefonoCConstants.ROLE_NAME_DIRECCIONC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTelefonoCRelatedInstance4DireccionC(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildTelefonoCRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new TelefonoC(mapper.readValue(relatedInstanceJsonOid, TelefonoCOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TelefonoC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildTelefonoCRelatedInstance4DirSucursalC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new DirSucursalC(mapper.readValue(relatedInstanceJsonOid, DirSucursalCOid.class)): DirSucursalC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TelefonoC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildTelefonoCRelatedInstance4DireccionC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new DireccionC(mapper.readValue(relatedInstanceJsonOid, DireccionCOid.class)): DireccionC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TelefonoC.class).error(e.getMessage());
            return null;
        }
    }
}
