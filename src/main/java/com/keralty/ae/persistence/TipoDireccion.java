package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.TipoDireccionConstants;
import com.keralty.ae.persistence.oid.DireccionCOid;
import com.keralty.ae.persistence.oid.DireccionOid;
import com.keralty.ae.persistence.oid.TipoDireccionOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>TipoDireccion</code> external model class.
 * <p>
 * External Model Class: <code>TipoDireccion</code><br>
 */
public class TipoDireccion extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="codigo")
    private Long tipoDireccionCodigo;

    @JsonProperty(value="descripcion")
    private String tipoDireccionDescripcion;

    @JsonProperty(value="esresidencia")
    private Boolean tipoDireccionEsResidencia;

    @JsonProperty(value="escorrespondencia")
    private Boolean tipoDireccionEsCorrespondencia;

    private Collection <DireccionC> direccionesC;

    private Collection <Direccion> direcciones;

    /**
     * Gets the value of attribute Codigo
     */
    public Long getTipoDireccionCodigo() {
        return tipoDireccionCodigo;
    }
    
    /**
     * Sets the value of attribute Codigo
     */
    public void setTipoDireccionCodigo(Long tipoDireccionCodigo) {
        this.tipoDireccionCodigo = tipoDireccionCodigo;
    }

    /**
     * Gets the value of attribute Descripcion
     */
    public String getTipoDireccionDescripcion() {
        return tipoDireccionDescripcion;
    }
    
    /**
     * Sets the value of attribute Descripcion
     */
    public void setTipoDireccionDescripcion(String tipoDireccionDescripcion) {
        this.tipoDireccionDescripcion = tipoDireccionDescripcion;
    }

    /**
     * Gets the value of attribute EsResidencia
     */
    public Boolean getTipoDireccionEsResidencia() {
        return tipoDireccionEsResidencia;
    }
    
    /**
     * Sets the value of attribute EsResidencia
     */
    public void setTipoDireccionEsResidencia(Boolean tipoDireccionEsResidencia) {
        this.tipoDireccionEsResidencia = tipoDireccionEsResidencia;
    }

    /**
     * Gets the value of attribute EsCorrespondencia
     */
    public Boolean getTipoDireccionEsCorrespondencia() {
        return tipoDireccionEsCorrespondencia;
    }
    
    /**
     * Sets the value of attribute EsCorrespondencia
     */
    public void setTipoDireccionEsCorrespondencia(Boolean tipoDireccionEsCorrespondencia) {
        this.tipoDireccionEsCorrespondencia = tipoDireccionEsCorrespondencia;
    }

    /**
     * Gets the value of relation through role DireccionesC
     */
    @JsonIgnore
    public Collection <DireccionC> getDireccionesC() {
        return direccionesC;
    }

    /**
     * Gets the value of relation through role Direcciones
     */
    @JsonIgnore
    public Collection <Direccion> getDirecciones() {
        return direcciones;
    }

    /**
     * Default constructor
     */
    public TipoDireccion() {
        tipoDireccionCodigo = null;
    }

    /**
     * Constructor used to create instances of <code>TipoDireccion</code>.
     * @param oid Object Identifier of the instance of <code>TipoDireccion</code> to be created.
     * @throws SystemException
     */
    public TipoDireccion(TipoDireccionOid oid) {
        if (oid != null && !oid.isNull()) {
            tipoDireccionCodigo = oid.getTipoDireccionCodigo();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return TipoDireccion.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        TipoDireccion other = (TipoDireccion)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getTipoDireccionCodigo(), other.getTipoDireccionCodigo());
        result &= Utilities.isEqual(this.getTipoDireccionDescripcion(), other.getTipoDireccionDescripcion());
        result &= Utilities.isEqual(this.getTipoDireccionEsResidencia(), other.getTipoDireccionEsResidencia());
        result &= Utilities.isEqual(this.getTipoDireccionEsCorrespondencia(), other.getTipoDireccionEsCorrespondencia());
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
     * Returns the <code>TipoDireccionOid</code> object that identifies this instance of <code>TipoDireccion</code>.
     * @return <code>TipoDireccionOid</code> object that identifies this instance of <code>TipoDireccion</code>
     */
	@Override
    public TipoDireccionOid getOid() {
        return new TipoDireccionOid(getTipoDireccionCodigo());
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
        if (!activeFacets.contains(Constants.TIPODIRECCION)) {
            activeFacets.add(Constants.TIPODIRECCION);
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
            relatedInstance = buildTipoDireccionRelatedInstance(relatedInstanceJsonOid);
        }
        if (TipoDireccionConstants.ROLE_NAME_DIRECCIONESC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoDireccionRelatedInstance4DireccionC(relatedInstanceJsonOid, remainingPath);
        }
        if (TipoDireccionConstants.ROLE_NAME_DIRECCIONES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoDireccionRelatedInstance4Direccion(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildTipoDireccionRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new TipoDireccion(mapper.readValue(relatedInstanceJsonOid, TipoDireccionOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoDireccion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildTipoDireccionRelatedInstance4DireccionC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new DireccionC(mapper.readValue(relatedInstanceJsonOid, DireccionCOid.class)): DireccionC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoDireccion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildTipoDireccionRelatedInstance4Direccion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Direccion(mapper.readValue(relatedInstanceJsonOid, DireccionOid.class)): Direccion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoDireccion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
