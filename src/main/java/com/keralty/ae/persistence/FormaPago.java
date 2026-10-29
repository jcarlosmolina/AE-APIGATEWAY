package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.FormaPagoConstants;
import com.keralty.ae.persistence.oid.ContratoCOid;
import com.keralty.ae.persistence.oid.DominioOid;
import com.keralty.ae.persistence.oid.FormaPagoOid;
import com.keralty.ae.persistence.oid.SolicitudOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>FormaPago</code> external model class.
 * <p>
 * External Model Class: <code>FormaPago</code><br>
 */
public class FormaPago extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="codigo")
    private Long formaPagoCodigo;

    @JsonProperty(value="descripcion")
    private String formaPagoDescripcion;

    @JsonProperty(value="abrirurl")
    private Boolean formaPagoAbrirURL;

    @JsonProperty(value="esvisible")
    private Boolean formaPagoEsVisible;

    private Collection <Dominio> dominios;

    private Collection <Solicitud> solicitudes;

    private Collection <ContratoC> contratosC;

    /**
     * Gets the value of attribute Codigo
     */
    public Long getFormaPagoCodigo() {
        return formaPagoCodigo;
    }
    
    /**
     * Sets the value of attribute Codigo
     */
    public void setFormaPagoCodigo(Long formaPagoCodigo) {
        this.formaPagoCodigo = formaPagoCodigo;
    }

    /**
     * Gets the value of attribute Descripcion
     */
    public String getFormaPagoDescripcion() {
        return formaPagoDescripcion;
    }
    
    /**
     * Sets the value of attribute Descripcion
     */
    public void setFormaPagoDescripcion(String formaPagoDescripcion) {
        this.formaPagoDescripcion = formaPagoDescripcion;
    }

    /**
     * Gets the value of attribute AbrirURL
     */
    public Boolean getFormaPagoAbrirURL() {
        return formaPagoAbrirURL;
    }
    
    /**
     * Sets the value of attribute AbrirURL
     */
    public void setFormaPagoAbrirURL(Boolean formaPagoAbrirURL) {
        this.formaPagoAbrirURL = formaPagoAbrirURL;
    }

    /**
     * Gets the value of attribute EsVisible
     */
    public Boolean getFormaPagoEsVisible() {
        return formaPagoEsVisible;
    }
    
    /**
     * Sets the value of attribute EsVisible
     */
    public void setFormaPagoEsVisible(Boolean formaPagoEsVisible) {
        this.formaPagoEsVisible = formaPagoEsVisible;
    }

    /**
     * Gets the value of relation through role Dominios
     */
    @JsonIgnore
    public Collection <Dominio> getDominios() {
        return dominios;
    }

    /**
     * Gets the value of relation through role Solicitudes
     */
    @JsonIgnore
    public Collection <Solicitud> getSolicitudes() {
        return solicitudes;
    }

    /**
     * Gets the value of relation through role ContratosC
     */
    @JsonIgnore
    public Collection <ContratoC> getContratosC() {
        return contratosC;
    }

    /**
     * Default constructor
     */
    public FormaPago() {
        formaPagoCodigo = null;
    }

    /**
     * Constructor used to create instances of <code>FormaPago</code>.
     * @param oid Object Identifier of the instance of <code>FormaPago</code> to be created.
     * @throws SystemException
     */
    public FormaPago(FormaPagoOid oid) {
        if (oid != null && !oid.isNull()) {
            formaPagoCodigo = oid.getFormaPagoCodigo();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return FormaPago.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        FormaPago other = (FormaPago)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getFormaPagoCodigo(), other.getFormaPagoCodigo());
        result &= Utilities.isEqual(this.getFormaPagoDescripcion(), other.getFormaPagoDescripcion());
        result &= Utilities.isEqual(this.getFormaPagoAbrirURL(), other.getFormaPagoAbrirURL());
        result &= Utilities.isEqual(this.getFormaPagoEsVisible(), other.getFormaPagoEsVisible());
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
     * Returns the <code>FormaPagoOid</code> object that identifies this instance of <code>FormaPago</code>.
     * @return <code>FormaPagoOid</code> object that identifies this instance of <code>FormaPago</code>
     */
	@Override
    public FormaPagoOid getOid() {
        return new FormaPagoOid(getFormaPagoCodigo());
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
        if (!activeFacets.contains(Constants.FORMAPAGO)) {
            activeFacets.add(Constants.FORMAPAGO);
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
            relatedInstance = buildFormaPagoRelatedInstance(relatedInstanceJsonOid);
        }
        if (FormaPagoConstants.ROLE_NAME_DOMINIOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFormaPagoRelatedInstance4Dominio(relatedInstanceJsonOid, remainingPath);
        }
        if (FormaPagoConstants.ROLE_NAME_SOLICITUDES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFormaPagoRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        if (FormaPagoConstants.ROLE_NAME_CONTRATOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFormaPagoRelatedInstance4ContratoC(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildFormaPagoRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new FormaPago(mapper.readValue(relatedInstanceJsonOid, FormaPagoOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(FormaPago.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildFormaPagoRelatedInstance4Dominio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Dominio(mapper.readValue(relatedInstanceJsonOid, DominioOid.class)): Dominio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(FormaPago.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildFormaPagoRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(FormaPago.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildFormaPagoRelatedInstance4ContratoC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ContratoC(mapper.readValue(relatedInstanceJsonOid, ContratoCOid.class)): ContratoC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(FormaPago.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
