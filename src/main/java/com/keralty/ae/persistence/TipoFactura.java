package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.TipoFacturaConstants;
import com.keralty.ae.persistence.oid.SolicitudOid;
import com.keralty.ae.persistence.oid.TipoFacturaOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>TipoFactura</code> external model class.
 * <p>
 * External Model Class: <code>TipoFactura</code><br>
 */
public class TipoFactura extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="codigo")
    private String tipoFacturaCodigo;

    @JsonProperty(value="descripcion")
    private String tipoFacturaDescripcion;

    @JsonProperty(value="esemail")
    private Boolean tipoFacturaEsEmail;

    @JsonProperty(value="escelular")
    private Boolean tipoFacturaEsCelular;

    @JsonProperty(value="activo")
    private Boolean tipoFacturaActivo;

    private Collection <Solicitud> solicitudes;

    /**
     * Gets the value of attribute Codigo
     */
    public String getTipoFacturaCodigo() {
        return tipoFacturaCodigo;
    }
    
    /**
     * Sets the value of attribute Codigo
     */
    public void setTipoFacturaCodigo(String tipoFacturaCodigo) {
        this.tipoFacturaCodigo = tipoFacturaCodigo;
    }

    /**
     * Gets the value of attribute Descripcion
     */
    public String getTipoFacturaDescripcion() {
        return tipoFacturaDescripcion;
    }
    
    /**
     * Sets the value of attribute Descripcion
     */
    public void setTipoFacturaDescripcion(String tipoFacturaDescripcion) {
        this.tipoFacturaDescripcion = tipoFacturaDescripcion;
    }

    /**
     * Gets the value of attribute EsEmail
     */
    public Boolean getTipoFacturaEsEmail() {
        return tipoFacturaEsEmail;
    }
    
    /**
     * Sets the value of attribute EsEmail
     */
    public void setTipoFacturaEsEmail(Boolean tipoFacturaEsEmail) {
        this.tipoFacturaEsEmail = tipoFacturaEsEmail;
    }

    /**
     * Gets the value of attribute EsCelular
     */
    public Boolean getTipoFacturaEsCelular() {
        return tipoFacturaEsCelular;
    }
    
    /**
     * Sets the value of attribute EsCelular
     */
    public void setTipoFacturaEsCelular(Boolean tipoFacturaEsCelular) {
        this.tipoFacturaEsCelular = tipoFacturaEsCelular;
    }

    /**
     * Gets the value of attribute Activo
     */
    public Boolean getTipoFacturaActivo() {
        return tipoFacturaActivo;
    }
    
    /**
     * Sets the value of attribute Activo
     */
    public void setTipoFacturaActivo(Boolean tipoFacturaActivo) {
        this.tipoFacturaActivo = tipoFacturaActivo;
    }

    /**
     * Gets the value of relation through role Solicitudes
     */
    @JsonIgnore
    public Collection <Solicitud> getSolicitudes() {
        return solicitudes;
    }

    /**
     * Default constructor
     */
    public TipoFactura() {
        tipoFacturaCodigo = null;
    }

    /**
     * Constructor used to create instances of <code>TipoFactura</code>.
     * @param oid Object Identifier of the instance of <code>TipoFactura</code> to be created.
     * @throws SystemException
     */
    public TipoFactura(TipoFacturaOid oid) {
        if (oid != null && !oid.isNull()) {
            tipoFacturaCodigo = oid.getTipoFacturaCodigo();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return TipoFactura.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        TipoFactura other = (TipoFactura)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getTipoFacturaCodigo(), other.getTipoFacturaCodigo());
        result &= Utilities.isEqual(this.getTipoFacturaDescripcion(), other.getTipoFacturaDescripcion());
        result &= Utilities.isEqual(this.getTipoFacturaEsEmail(), other.getTipoFacturaEsEmail());
        result &= Utilities.isEqual(this.getTipoFacturaEsCelular(), other.getTipoFacturaEsCelular());
        result &= Utilities.isEqual(this.getTipoFacturaActivo(), other.getTipoFacturaActivo());
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
     * Returns the <code>TipoFacturaOid</code> object that identifies this instance of <code>TipoFactura</code>.
     * @return <code>TipoFacturaOid</code> object that identifies this instance of <code>TipoFactura</code>
     */
	@Override
    public TipoFacturaOid getOid() {
        return new TipoFacturaOid(getTipoFacturaCodigo());
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
        if (!activeFacets.contains(Constants.TIPOFACTURA)) {
            activeFacets.add(Constants.TIPOFACTURA);
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
            relatedInstance = buildTipoFacturaRelatedInstance(relatedInstanceJsonOid);
        }
        if (TipoFacturaConstants.ROLE_NAME_SOLICITUDES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoFacturaRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildTipoFacturaRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new TipoFactura(mapper.readValue(relatedInstanceJsonOid, TipoFacturaOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoFactura.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildTipoFacturaRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoFactura.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
