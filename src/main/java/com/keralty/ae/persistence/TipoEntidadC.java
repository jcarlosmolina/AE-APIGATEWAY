package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.TipoEntidadCConstants;
import com.keralty.ae.persistence.oid.PersonaCOid;
import com.keralty.ae.persistence.oid.TipoEntidadCOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>TipoEntidadC</code> external model class.
 * <p>
 * External Model Class: <code>TipoEntidadC</code><br>
 */
public class TipoEntidadC extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="codigo")
    private Long tipoEntidadCCodigo;

    @JsonProperty(value="descripcion")
    private String tipoEntidadCDescripcion;

    private Collection <PersonaC> personasC;

    /**
     * Gets the value of attribute Codigo
     */
    public Long getTipoEntidadCCodigo() {
        return tipoEntidadCCodigo;
    }
    
    /**
     * Sets the value of attribute Codigo
     */
    public void setTipoEntidadCCodigo(Long tipoEntidadCCodigo) {
        this.tipoEntidadCCodigo = tipoEntidadCCodigo;
    }

    /**
     * Gets the value of attribute Descripcion
     */
    public String getTipoEntidadCDescripcion() {
        return tipoEntidadCDescripcion;
    }
    
    /**
     * Sets the value of attribute Descripcion
     */
    public void setTipoEntidadCDescripcion(String tipoEntidadCDescripcion) {
        this.tipoEntidadCDescripcion = tipoEntidadCDescripcion;
    }

    /**
     * Gets the value of relation through role PersonasC
     */
    @JsonIgnore
    public Collection <PersonaC> getPersonasC() {
        return personasC;
    }

    /**
     * Default constructor
     */
    public TipoEntidadC() {
        tipoEntidadCCodigo = null;
    }

    /**
     * Constructor used to create instances of <code>TipoEntidadC</code>.
     * @param oid Object Identifier of the instance of <code>TipoEntidadC</code> to be created.
     * @throws SystemException
     */
    public TipoEntidadC(TipoEntidadCOid oid) {
        if (oid != null && !oid.isNull()) {
            tipoEntidadCCodigo = oid.getTipoEntidadCCodigo();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return TipoEntidadC.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        TipoEntidadC other = (TipoEntidadC)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getTipoEntidadCCodigo(), other.getTipoEntidadCCodigo());
        result &= Utilities.isEqual(this.getTipoEntidadCDescripcion(), other.getTipoEntidadCDescripcion());
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
     * Returns the <code>TipoEntidadCOid</code> object that identifies this instance of <code>TipoEntidadC</code>.
     * @return <code>TipoEntidadCOid</code> object that identifies this instance of <code>TipoEntidadC</code>
     */
	@Override
    public TipoEntidadCOid getOid() {
        return new TipoEntidadCOid(getTipoEntidadCCodigo());
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
        if (!activeFacets.contains(Constants.TIPOENTIDADC)) {
            activeFacets.add(Constants.TIPOENTIDADC);
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
            relatedInstance = buildTipoEntidadCRelatedInstance(relatedInstanceJsonOid);
        }
        if (TipoEntidadCConstants.ROLE_NAME_PERSONASC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoEntidadCRelatedInstance4PersonaC(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildTipoEntidadCRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new TipoEntidadC(mapper.readValue(relatedInstanceJsonOid, TipoEntidadCOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoEntidadC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildTipoEntidadCRelatedInstance4PersonaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PersonaC(mapper.readValue(relatedInstanceJsonOid, PersonaCOid.class)): PersonaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoEntidadC.class).error(e.getMessage());
            return null;
        }
    }
}
