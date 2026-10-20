package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.ProteccionDatosConstants;
import com.keralty.ae.persistence.oid.ProductosOid;
import com.keralty.ae.persistence.oid.ProteccionDatosOid;
import com.keralty.ae.persistence.oid.SolicitudNovedadOid;
import com.keralty.ae.persistence.oid.SolicitudOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>ProteccionDatos</code> external model class.
 * <p>
 * External Model Class: <code>ProteccionDatos</code><br>
 */
public class ProteccionDatos extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="identificador")
    private Long proteccionDatosIdentificador;

    @JsonProperty(value="rol")
    private String proteccionDatosRol;

    @JsonProperty(value="saludsms")
    private Boolean proteccionDatosSaludSMS;

    @JsonProperty(value="saludemail")
    private Boolean proteccionDatosSaludEmail;

    @JsonProperty(value="saludcorreo")
    private Boolean proteccionDatosSaludCorreo;

    @JsonProperty(value="publicidadsms")
    private Boolean proteccionDatosPublicidadSMS;

    @JsonProperty(value="publicidademail")
    private Boolean proteccionDatosPublicidadEmail;

    @JsonProperty(value="publicidadcorreo")
    private Boolean proteccionDatosPublicidadCorreo;

    @JsonProperty(value="infoterceros")
    private Boolean proteccionDatosInfoTerceros;

    private SolicitudNovedad solicitudNovedad;

    private Productos productoT;

    private Solicitud solicitud;

    /**
     * Gets the value of attribute Identificador
     */
    public Long getProteccionDatosIdentificador() {
        return proteccionDatosIdentificador;
    }
    
    /**
     * Sets the value of attribute Identificador
     */
    public void setProteccionDatosIdentificador(Long proteccionDatosIdentificador) {
        this.proteccionDatosIdentificador = proteccionDatosIdentificador;
    }

    /**
     * Gets the value of attribute Rol
     */
    public String getProteccionDatosRol() {
        return proteccionDatosRol;
    }
    
    /**
     * Sets the value of attribute Rol
     */
    public void setProteccionDatosRol(String proteccionDatosRol) {
        this.proteccionDatosRol = proteccionDatosRol;
    }

    /**
     * Gets the value of attribute SaludSMS
     */
    public Boolean getProteccionDatosSaludSMS() {
        return proteccionDatosSaludSMS;
    }
    
    /**
     * Sets the value of attribute SaludSMS
     */
    public void setProteccionDatosSaludSMS(Boolean proteccionDatosSaludSMS) {
        this.proteccionDatosSaludSMS = proteccionDatosSaludSMS;
    }

    /**
     * Gets the value of attribute SaludEmail
     */
    public Boolean getProteccionDatosSaludEmail() {
        return proteccionDatosSaludEmail;
    }
    
    /**
     * Sets the value of attribute SaludEmail
     */
    public void setProteccionDatosSaludEmail(Boolean proteccionDatosSaludEmail) {
        this.proteccionDatosSaludEmail = proteccionDatosSaludEmail;
    }

    /**
     * Gets the value of attribute SaludCorreo
     */
    public Boolean getProteccionDatosSaludCorreo() {
        return proteccionDatosSaludCorreo;
    }
    
    /**
     * Sets the value of attribute SaludCorreo
     */
    public void setProteccionDatosSaludCorreo(Boolean proteccionDatosSaludCorreo) {
        this.proteccionDatosSaludCorreo = proteccionDatosSaludCorreo;
    }

    /**
     * Gets the value of attribute PublicidadSMS
     */
    public Boolean getProteccionDatosPublicidadSMS() {
        return proteccionDatosPublicidadSMS;
    }
    
    /**
     * Sets the value of attribute PublicidadSMS
     */
    public void setProteccionDatosPublicidadSMS(Boolean proteccionDatosPublicidadSMS) {
        this.proteccionDatosPublicidadSMS = proteccionDatosPublicidadSMS;
    }

    /**
     * Gets the value of attribute PublicidadEmail
     */
    public Boolean getProteccionDatosPublicidadEmail() {
        return proteccionDatosPublicidadEmail;
    }
    
    /**
     * Sets the value of attribute PublicidadEmail
     */
    public void setProteccionDatosPublicidadEmail(Boolean proteccionDatosPublicidadEmail) {
        this.proteccionDatosPublicidadEmail = proteccionDatosPublicidadEmail;
    }

    /**
     * Gets the value of attribute PublicidadCorreo
     */
    public Boolean getProteccionDatosPublicidadCorreo() {
        return proteccionDatosPublicidadCorreo;
    }
    
    /**
     * Sets the value of attribute PublicidadCorreo
     */
    public void setProteccionDatosPublicidadCorreo(Boolean proteccionDatosPublicidadCorreo) {
        this.proteccionDatosPublicidadCorreo = proteccionDatosPublicidadCorreo;
    }

    /**
     * Gets the value of attribute InfoTerceros
     */
    public Boolean getProteccionDatosInfoTerceros() {
        return proteccionDatosInfoTerceros;
    }
    
    /**
     * Sets the value of attribute InfoTerceros
     */
    public void setProteccionDatosInfoTerceros(Boolean proteccionDatosInfoTerceros) {
        this.proteccionDatosInfoTerceros = proteccionDatosInfoTerceros;
    }

    /**
     * Gets the value of relation through role SolicitudNovedad
     */
    @JsonIgnore
    public SolicitudNovedad getSolicitudNovedad() {
        return solicitudNovedad;
    }

    /**
     * Gets the value of relation through role ProductoT
     */
    @JsonIgnore
    public Productos getProductoT() {
        return productoT;
    }

    /**
     * Gets the value of relation through role Solicitud
     */
    @JsonIgnore
    public Solicitud getSolicitud() {
        return solicitud;
    }

    /**
     * Default constructor
     */
    public ProteccionDatos() {
        proteccionDatosIdentificador = null;
    }

    /**
     * Constructor used to create instances of <code>ProteccionDatos</code>.
     * @param oid Object Identifier of the instance of <code>ProteccionDatos</code> to be created.
     * @throws SystemException
     */
    public ProteccionDatos(ProteccionDatosOid oid) {
        if (oid != null && !oid.isNull()) {
            proteccionDatosIdentificador = oid.getProteccionDatosIdentificador();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return ProteccionDatos.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        ProteccionDatos other = (ProteccionDatos)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getProteccionDatosIdentificador(), other.getProteccionDatosIdentificador());
        result &= Utilities.isEqual(this.getProteccionDatosRol(), other.getProteccionDatosRol());
        result &= Utilities.isEqual(this.getProteccionDatosSaludSMS(), other.getProteccionDatosSaludSMS());
        result &= Utilities.isEqual(this.getProteccionDatosSaludEmail(), other.getProteccionDatosSaludEmail());
        result &= Utilities.isEqual(this.getProteccionDatosSaludCorreo(), other.getProteccionDatosSaludCorreo());
        result &= Utilities.isEqual(this.getProteccionDatosPublicidadSMS(), other.getProteccionDatosPublicidadSMS());
        result &= Utilities.isEqual(this.getProteccionDatosPublicidadEmail(), other.getProteccionDatosPublicidadEmail());
        result &= Utilities.isEqual(this.getProteccionDatosPublicidadCorreo(), other.getProteccionDatosPublicidadCorreo());
        result &= Utilities.isEqual(this.getProteccionDatosInfoTerceros(), other.getProteccionDatosInfoTerceros());
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
     * Returns the <code>ProteccionDatosOid</code> object that identifies this instance of <code>ProteccionDatos</code>.
     * @return <code>ProteccionDatosOid</code> object that identifies this instance of <code>ProteccionDatos</code>
     */
	@Override
    public ProteccionDatosOid getOid() {
        return new ProteccionDatosOid(getProteccionDatosIdentificador());
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
        if (!activeFacets.contains(Constants.PROTECCIONDATOS)) {
            activeFacets.add(Constants.PROTECCIONDATOS);
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
            relatedInstance = buildProteccionDatosRelatedInstance(relatedInstanceJsonOid);
        }
        if (ProteccionDatosConstants.ROLE_NAME_SOLICITUDNOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildProteccionDatosRelatedInstance4SolicitudNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (ProteccionDatosConstants.ROLE_NAME_PRODUCTOT.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildProteccionDatosRelatedInstance4Productos(relatedInstanceJsonOid, remainingPath);
        }
        if (ProteccionDatosConstants.ROLE_NAME_SOLICITUD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildProteccionDatosRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildProteccionDatosRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new ProteccionDatos(mapper.readValue(relatedInstanceJsonOid, ProteccionDatosOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ProteccionDatos.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildProteccionDatosRelatedInstance4SolicitudNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new SolicitudNovedad(mapper.readValue(relatedInstanceJsonOid, SolicitudNovedadOid.class)): SolicitudNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ProteccionDatos.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildProteccionDatosRelatedInstance4Productos(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Productos(mapper.readValue(relatedInstanceJsonOid, ProductosOid.class)): Productos.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ProteccionDatos.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildProteccionDatosRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ProteccionDatos.class).error(e.getMessage());
            return null;
        }
    }
}
