package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.TipoNovedadConstants;
import com.keralty.ae.persistence.oid.NovedadOid;
import com.keralty.ae.persistence.oid.TipoNovedadOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>TipoNovedad</code> external model class.
 * <p>
 * External Model Class: <code>TipoNovedad</code><br>
 */
public class TipoNovedad extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="tipo")
    private Long tipoNovedadTipo;

    @JsonProperty(value="aliastipo")
    private String tipoNovedadAliasTipo;

    @JsonProperty(value="nombre")
    private String tipoNovedadNombre;

    @JsonProperty(value="descripcion")
    private String tipoNovedadDescripcion;

    @JsonProperty(value="codigolegal")
    private String tipoNovedadCodigoLegal;

    private Collection <Novedad> novedades;

    /**
     * Gets the value of attribute Tipo
     */
    public Long getTipoNovedadTipo() {
        return tipoNovedadTipo;
    }
    
    /**
     * Sets the value of attribute Tipo
     */
    public void setTipoNovedadTipo(Long tipoNovedadTipo) {
        this.tipoNovedadTipo = tipoNovedadTipo;
    }

    /**
     * Gets the value of attribute AliasTipo
     */
    public String getTipoNovedadAliasTipo() {
        return tipoNovedadAliasTipo;
    }
    
    /**
     * Sets the value of attribute AliasTipo
     */
    public void setTipoNovedadAliasTipo(String tipoNovedadAliasTipo) {
        this.tipoNovedadAliasTipo = tipoNovedadAliasTipo;
    }

    /**
     * Gets the value of attribute Nombre
     */
    public String getTipoNovedadNombre() {
        return tipoNovedadNombre;
    }
    
    /**
     * Sets the value of attribute Nombre
     */
    public void setTipoNovedadNombre(String tipoNovedadNombre) {
        this.tipoNovedadNombre = tipoNovedadNombre;
    }

    /**
     * Gets the value of attribute Descripcion
     */
    public String getTipoNovedadDescripcion() {
        return tipoNovedadDescripcion;
    }
    
    /**
     * Sets the value of attribute Descripcion
     */
    public void setTipoNovedadDescripcion(String tipoNovedadDescripcion) {
        this.tipoNovedadDescripcion = tipoNovedadDescripcion;
    }

    /**
     * Gets the value of attribute CodigoLegal
     */
    public String getTipoNovedadCodigoLegal() {
        return tipoNovedadCodigoLegal;
    }
    
    /**
     * Sets the value of attribute CodigoLegal
     */
    public void setTipoNovedadCodigoLegal(String tipoNovedadCodigoLegal) {
        this.tipoNovedadCodigoLegal = tipoNovedadCodigoLegal;
    }

    /**
     * Gets the value of relation through role Novedades
     */
    @JsonIgnore
    public Collection <Novedad> getNovedades() {
        return novedades;
    }

    /**
     * Default constructor
     */
    public TipoNovedad() {
        tipoNovedadTipo = null;
    }

    /**
     * Constructor used to create instances of <code>TipoNovedad</code>.
     * @param oid Object Identifier of the instance of <code>TipoNovedad</code> to be created.
     * @throws SystemException
     */
    public TipoNovedad(TipoNovedadOid oid) {
        if (oid != null && !oid.isNull()) {
            tipoNovedadTipo = oid.getTipoNovedadTipo();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return TipoNovedad.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        TipoNovedad other = (TipoNovedad)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getTipoNovedadTipo(), other.getTipoNovedadTipo());
        result &= Utilities.isEqual(this.getTipoNovedadAliasTipo(), other.getTipoNovedadAliasTipo());
        result &= Utilities.isEqual(this.getTipoNovedadNombre(), other.getTipoNovedadNombre());
        result &= Utilities.isEqual(this.getTipoNovedadDescripcion(), other.getTipoNovedadDescripcion());
        result &= Utilities.isEqual(this.getTipoNovedadCodigoLegal(), other.getTipoNovedadCodigoLegal());
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
     * Returns the <code>TipoNovedadOid</code> object that identifies this instance of <code>TipoNovedad</code>.
     * @return <code>TipoNovedadOid</code> object that identifies this instance of <code>TipoNovedad</code>
     */
	@Override
    public TipoNovedadOid getOid() {
        return new TipoNovedadOid(getTipoNovedadTipo());
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
        if (!activeFacets.contains(Constants.TIPONOVEDAD)) {
            activeFacets.add(Constants.TIPONOVEDAD);
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
            relatedInstance = buildTipoNovedadRelatedInstance(relatedInstanceJsonOid);
        }
        if (TipoNovedadConstants.ROLE_NAME_NOVEDADES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoNovedadRelatedInstance4Novedad(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildTipoNovedadRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new TipoNovedad(mapper.readValue(relatedInstanceJsonOid, TipoNovedadOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoNovedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildTipoNovedadRelatedInstance4Novedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Novedad(mapper.readValue(relatedInstanceJsonOid, NovedadOid.class)): Novedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoNovedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
