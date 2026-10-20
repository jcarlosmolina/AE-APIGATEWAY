package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.ProteccionDatosCConstants;
import com.keralty.ae.persistence.oid.PersonaCOid;
import com.keralty.ae.persistence.oid.ProductosOid;
import com.keralty.ae.persistence.oid.ProteccionDatosCOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>ProteccionDatosC</code> external model class.
 * <p>
 * External Model Class: <code>ProteccionDatosC</code><br>
 */
public class ProteccionDatosC extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id")
    private Long personaCID;

    @JsonProperty(value="producto")
    private Long productosProducto;

    @JsonProperty(value="codigo")
    private Long proteccionDatosCCodigo;

    @JsonProperty(value="codrol")
    private String proteccionDatosCCodRol;

    @JsonProperty(value="informacionsaludsms")
    private Boolean proteccionDatosCInformacionSaludSMS;

    @JsonProperty(value="informacionsaludemail")
    private Boolean proteccionDatosCInformacionSaludEmail;

    @JsonProperty(value="iinformacionsaludcorreo")
    private Boolean proteccionDatosCIinformacionSaludCorreo;

    @JsonProperty(value="informacionpublicidadsms")
    private Boolean proteccionDatosCInformacionPublicidadSMS;

    @JsonProperty(value="informacionpublicidademail")
    private Boolean proteccionDatosCInformacionPublicidadEmail;

    @JsonProperty(value="informacionpublicidadcorreo")
    private Boolean proteccionDatosCInformacionPublicidadCorreo;

    @JsonProperty(value="informacionterceros")
    private Boolean proteccionDatosCInformacionTerceros;

    @JsonProperty(value="rol")
    private String proteccionDatosCRol;

    private PersonaC personaC;

    private Productos productoC;

    /**
     * Gets the value of attribute ID
     */
    public Long getPersonaCID() {
        return personaCID;
    }
    
    /**
     * Sets the value of attribute ID
     */
    public void setPersonaCID(Long personaCID) {
        this.personaCID = personaCID;
    }

    /**
     * Gets the value of attribute Producto
     */
    public Long getProductosProducto() {
        return productosProducto;
    }
    
    /**
     * Sets the value of attribute Producto
     */
    public void setProductosProducto(Long productosProducto) {
        this.productosProducto = productosProducto;
    }

    /**
     * Gets the value of attribute Codigo
     */
    public Long getProteccionDatosCCodigo() {
        return proteccionDatosCCodigo;
    }
    
    /**
     * Sets the value of attribute Codigo
     */
    public void setProteccionDatosCCodigo(Long proteccionDatosCCodigo) {
        this.proteccionDatosCCodigo = proteccionDatosCCodigo;
    }

    /**
     * Gets the value of attribute CodRol
     */
    public String getProteccionDatosCCodRol() {
        return proteccionDatosCCodRol;
    }
    
    /**
     * Sets the value of attribute CodRol
     */
    public void setProteccionDatosCCodRol(String proteccionDatosCCodRol) {
        this.proteccionDatosCCodRol = proteccionDatosCCodRol;
    }

    /**
     * Gets the value of attribute InformacionSaludSMS
     */
    public Boolean getProteccionDatosCInformacionSaludSMS() {
        return proteccionDatosCInformacionSaludSMS;
    }
    
    /**
     * Sets the value of attribute InformacionSaludSMS
     */
    public void setProteccionDatosCInformacionSaludSMS(Boolean proteccionDatosCInformacionSaludSMS) {
        this.proteccionDatosCInformacionSaludSMS = proteccionDatosCInformacionSaludSMS;
    }

    /**
     * Gets the value of attribute InformacionSaludEmail
     */
    public Boolean getProteccionDatosCInformacionSaludEmail() {
        return proteccionDatosCInformacionSaludEmail;
    }
    
    /**
     * Sets the value of attribute InformacionSaludEmail
     */
    public void setProteccionDatosCInformacionSaludEmail(Boolean proteccionDatosCInformacionSaludEmail) {
        this.proteccionDatosCInformacionSaludEmail = proteccionDatosCInformacionSaludEmail;
    }

    /**
     * Gets the value of attribute IinformacionSaludCorreo
     */
    public Boolean getProteccionDatosCIinformacionSaludCorreo() {
        return proteccionDatosCIinformacionSaludCorreo;
    }
    
    /**
     * Sets the value of attribute IinformacionSaludCorreo
     */
    public void setProteccionDatosCIinformacionSaludCorreo(Boolean proteccionDatosCIinformacionSaludCorreo) {
        this.proteccionDatosCIinformacionSaludCorreo = proteccionDatosCIinformacionSaludCorreo;
    }

    /**
     * Gets the value of attribute InformacionPublicidadSMS
     */
    public Boolean getProteccionDatosCInformacionPublicidadSMS() {
        return proteccionDatosCInformacionPublicidadSMS;
    }
    
    /**
     * Sets the value of attribute InformacionPublicidadSMS
     */
    public void setProteccionDatosCInformacionPublicidadSMS(Boolean proteccionDatosCInformacionPublicidadSMS) {
        this.proteccionDatosCInformacionPublicidadSMS = proteccionDatosCInformacionPublicidadSMS;
    }

    /**
     * Gets the value of attribute InformacionPublicidadEmail
     */
    public Boolean getProteccionDatosCInformacionPublicidadEmail() {
        return proteccionDatosCInformacionPublicidadEmail;
    }
    
    /**
     * Sets the value of attribute InformacionPublicidadEmail
     */
    public void setProteccionDatosCInformacionPublicidadEmail(Boolean proteccionDatosCInformacionPublicidadEmail) {
        this.proteccionDatosCInformacionPublicidadEmail = proteccionDatosCInformacionPublicidadEmail;
    }

    /**
     * Gets the value of attribute InformacionPublicidadCorreo
     */
    public Boolean getProteccionDatosCInformacionPublicidadCorreo() {
        return proteccionDatosCInformacionPublicidadCorreo;
    }
    
    /**
     * Sets the value of attribute InformacionPublicidadCorreo
     */
    public void setProteccionDatosCInformacionPublicidadCorreo(Boolean proteccionDatosCInformacionPublicidadCorreo) {
        this.proteccionDatosCInformacionPublicidadCorreo = proteccionDatosCInformacionPublicidadCorreo;
    }

    /**
     * Gets the value of attribute InformacionTerceros
     */
    public Boolean getProteccionDatosCInformacionTerceros() {
        return proteccionDatosCInformacionTerceros;
    }
    
    /**
     * Sets the value of attribute InformacionTerceros
     */
    public void setProteccionDatosCInformacionTerceros(Boolean proteccionDatosCInformacionTerceros) {
        this.proteccionDatosCInformacionTerceros = proteccionDatosCInformacionTerceros;
    }

    /**
     * Gets the value of attribute Rol
     */
    public String getProteccionDatosCRol() {
        return proteccionDatosCRol;
    }
    
    /**
     * Sets the value of attribute Rol
     */
    public void setProteccionDatosCRol(String proteccionDatosCRol) {
        this.proteccionDatosCRol = proteccionDatosCRol;
    }

    /**
     * Gets the value of relation through role PersonaC
     */
    @JsonIgnore
    public PersonaC getPersonaC() {
        return personaC;
    }

    /**
     * Gets the value of relation through role ProductoC
     */
    @JsonIgnore
    public Productos getProductoC() {
        return productoC;
    }

    /**
     * Default constructor
     */
    public ProteccionDatosC() {
        personaCID = null;
        productosProducto = null;
        proteccionDatosCCodigo = null;
    }

    /**
     * Constructor used to create instances of <code>ProteccionDatosC</code>.
     * @param oid Object Identifier of the instance of <code>ProteccionDatosC</code> to be created.
     * @throws SystemException
     */
    public ProteccionDatosC(ProteccionDatosCOid oid) {
        if (oid != null && !oid.isNull()) {
            personaCID = oid.getPersonaCID();
            productosProducto = oid.getProductosProducto();
            proteccionDatosCCodigo = oid.getProteccionDatosCCodigo();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return ProteccionDatosC.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        ProteccionDatosC other = (ProteccionDatosC)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getProteccionDatosCCodRol(), other.getProteccionDatosCCodRol());
        result &= Utilities.isEqual(this.getProteccionDatosCInformacionSaludSMS(), other.getProteccionDatosCInformacionSaludSMS());
        result &= Utilities.isEqual(this.getProteccionDatosCInformacionSaludEmail(), other.getProteccionDatosCInformacionSaludEmail());
        result &= Utilities.isEqual(this.getProteccionDatosCIinformacionSaludCorreo(), other.getProteccionDatosCIinformacionSaludCorreo());
        result &= Utilities.isEqual(this.getProteccionDatosCInformacionPublicidadSMS(), other.getProteccionDatosCInformacionPublicidadSMS());
        result &= Utilities.isEqual(this.getProteccionDatosCInformacionPublicidadEmail(), other.getProteccionDatosCInformacionPublicidadEmail());
        result &= Utilities.isEqual(this.getProteccionDatosCInformacionPublicidadCorreo(), other.getProteccionDatosCInformacionPublicidadCorreo());
        result &= Utilities.isEqual(this.getProteccionDatosCInformacionTerceros(), other.getProteccionDatosCInformacionTerceros());
        result &= Utilities.isEqual(this.getProteccionDatosCRol(), other.getProteccionDatosCRol());
        result &= Utilities.isEqual(this.getProteccionDatosCCodigo(), other.getProteccionDatosCCodigo());
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
     * Returns the <code>ProteccionDatosCOid</code> object that identifies this instance of <code>ProteccionDatosC</code>.
     * @return <code>ProteccionDatosCOid</code> object that identifies this instance of <code>ProteccionDatosC</code>
     */
	@Override
    public ProteccionDatosCOid getOid() {
        return new ProteccionDatosCOid(getPersonaCID(), getProductosProducto(), getProteccionDatosCCodigo());
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
        if (!activeFacets.contains(Constants.PROTECCIONDATOSC)) {
            activeFacets.add(Constants.PROTECCIONDATOSC);
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
            relatedInstance = buildProteccionDatosCRelatedInstance(relatedInstanceJsonOid);
        }
        if (ProteccionDatosCConstants.ROLE_NAME_PERSONAC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildProteccionDatosCRelatedInstance4PersonaC(relatedInstanceJsonOid, remainingPath);
        }
        if (ProteccionDatosCConstants.ROLE_NAME_PRODUCTOC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildProteccionDatosCRelatedInstance4Productos(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildProteccionDatosCRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new ProteccionDatosC(mapper.readValue(relatedInstanceJsonOid, ProteccionDatosCOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ProteccionDatosC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildProteccionDatosCRelatedInstance4PersonaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PersonaC(mapper.readValue(relatedInstanceJsonOid, PersonaCOid.class)): PersonaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ProteccionDatosC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildProteccionDatosCRelatedInstance4Productos(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Productos(mapper.readValue(relatedInstanceJsonOid, ProductosOid.class)): Productos.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ProteccionDatosC.class).error(e.getMessage());
            return null;
        }
    }
}
