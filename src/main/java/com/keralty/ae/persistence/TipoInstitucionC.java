package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.TipoInstitucionCConstants;
import com.keralty.ae.persistence.oid.PersonaCOid;
import com.keralty.ae.persistence.oid.TipoInstitucionCOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>TipoInstitucionC</code> external model class.
 * <p>
 * External Model Class: <code>TipoInstitucionC</code><br>
 */
public class TipoInstitucionC extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="codigo")
    private Long tipoInstitucionCCodigo;

    @JsonProperty(value="nombre")
    private String tipoInstitucionCNombre;

    private Collection <PersonaC> personasC;

    /**
     * Gets the value of attribute Codigo
     */
    public Long getTipoInstitucionCCodigo() {
        return tipoInstitucionCCodigo;
    }
    
    /**
     * Sets the value of attribute Codigo
     */
    public void setTipoInstitucionCCodigo(Long tipoInstitucionCCodigo) {
        this.tipoInstitucionCCodigo = tipoInstitucionCCodigo;
    }

    /**
     * Gets the value of attribute Nombre
     */
    public String getTipoInstitucionCNombre() {
        return tipoInstitucionCNombre;
    }
    
    /**
     * Sets the value of attribute Nombre
     */
    public void setTipoInstitucionCNombre(String tipoInstitucionCNombre) {
        this.tipoInstitucionCNombre = tipoInstitucionCNombre;
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
    public TipoInstitucionC() {
        tipoInstitucionCCodigo = null;
    }

    /**
     * Constructor used to create instances of <code>TipoInstitucionC</code>.
     * @param oid Object Identifier of the instance of <code>TipoInstitucionC</code> to be created.
     * @throws SystemException
     */
    public TipoInstitucionC(TipoInstitucionCOid oid) {
        if (oid != null && !oid.isNull()) {
            tipoInstitucionCCodigo = oid.getTipoInstitucionCCodigo();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return TipoInstitucionC.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        TipoInstitucionC other = (TipoInstitucionC)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getTipoInstitucionCCodigo(), other.getTipoInstitucionCCodigo());
        result &= Utilities.isEqual(this.getTipoInstitucionCNombre(), other.getTipoInstitucionCNombre());
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
     * Returns the <code>TipoInstitucionCOid</code> object that identifies this instance of <code>TipoInstitucionC</code>.
     * @return <code>TipoInstitucionCOid</code> object that identifies this instance of <code>TipoInstitucionC</code>
     */
	@Override
    public TipoInstitucionCOid getOid() {
        return new TipoInstitucionCOid(getTipoInstitucionCCodigo());
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
        if (!activeFacets.contains(Constants.TIPOINSTITUCIONC)) {
            activeFacets.add(Constants.TIPOINSTITUCIONC);
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
            relatedInstance = buildTipoInstitucionCRelatedInstance(relatedInstanceJsonOid);
        }
        if (TipoInstitucionCConstants.ROLE_NAME_PERSONASC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoInstitucionCRelatedInstance4PersonaC(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildTipoInstitucionCRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new TipoInstitucionC(mapper.readValue(relatedInstanceJsonOid, TipoInstitucionCOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoInstitucionC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildTipoInstitucionCRelatedInstance4PersonaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PersonaC(mapper.readValue(relatedInstanceJsonOid, PersonaCOid.class)): PersonaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoInstitucionC.class).error(e.getMessage());
            return null;
        }
    }
}
