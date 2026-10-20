package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.AesolicitudesConstants;
import com.keralty.ae.global.Constants;
import com.keralty.ae.persistence.oid.AesolicitudesOid;
import com.keralty.ae.persistence.oid.EstadoContratoOid;
import com.keralty.ae.persistence.oid.PlanesOid;
import com.keralty.ae.persistence.oid.ProductosOid;
import com.keralty.ae.persistence.oid.SolicitudOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>Aesolicitudes</code> external model class.
 * <p>
 * External Model Class: <code>Aesolicitudes</code><br>
 */
public class Aesolicitudes extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id_solicitud")
    private Long aesolicitudesidsolicitud;

    @JsonProperty(value="numero_solicitud")
    private String aesolicitudesNumerosolicitud;

    @JsonProperty(value="sw_estado")
    private String aesolicitudesSwestado;

    @JsonProperty(value="fecha_asignacion")
    private Date aesolicitudesFechaasignacion;

    @JsonProperty(value="cdmotanu")
    private String aesolicitudesCdmotanu;

    @JsonProperty(value="cdmotdev")
    private String aesolicitudesCdmotdev;

    @JsonProperty(value="fesolici")
    private Date aesolicitudesFesolici;

    @JsonProperty(value="login")
    private String aesolicitudesLogin;

    @JsonProperty(value="observacion")
    private String aesolicitudesObservacion;

    @JsonProperty(value="tipo_solicitud")
    private String aesolicitudesTiposolicitud;

    private Solicitud solicitud;

    private Productos productoT;

    private Planes planT;

    private EstadoContrato eSTADOSOLICITUD;

    /**
     * Gets the value of attribute id_solicitud
     */
    public Long getAesolicitudesidsolicitud() {
        return aesolicitudesidsolicitud;
    }
    
    /**
     * Sets the value of attribute id_solicitud
     */
    public void setAesolicitudesidsolicitud(Long aesolicitudesidsolicitud) {
        this.aesolicitudesidsolicitud = aesolicitudesidsolicitud;
    }

    /**
     * Gets the value of attribute Numero_solicitud
     */
    public String getAesolicitudesNumerosolicitud() {
        return aesolicitudesNumerosolicitud;
    }
    
    /**
     * Sets the value of attribute Numero_solicitud
     */
    public void setAesolicitudesNumerosolicitud(String aesolicitudesNumerosolicitud) {
        this.aesolicitudesNumerosolicitud = aesolicitudesNumerosolicitud;
    }

    /**
     * Gets the value of attribute Sw_estado
     */
    public String getAesolicitudesSwestado() {
        return aesolicitudesSwestado;
    }
    
    /**
     * Sets the value of attribute Sw_estado
     */
    public void setAesolicitudesSwestado(String aesolicitudesSwestado) {
        this.aesolicitudesSwestado = aesolicitudesSwestado;
    }

    /**
     * Gets the value of attribute Fecha_asignacion
     */
    public Date getAesolicitudesFechaasignacion() {
        return aesolicitudesFechaasignacion;
    }
    
    /**
     * Sets the value of attribute Fecha_asignacion
     */
    public void setAesolicitudesFechaasignacion(Date aesolicitudesFechaasignacion) {
        this.aesolicitudesFechaasignacion = aesolicitudesFechaasignacion;
    }

    /**
     * Gets the value of attribute Cdmotanu
     */
    public String getAesolicitudesCdmotanu() {
        return aesolicitudesCdmotanu;
    }
    
    /**
     * Sets the value of attribute Cdmotanu
     */
    public void setAesolicitudesCdmotanu(String aesolicitudesCdmotanu) {
        this.aesolicitudesCdmotanu = aesolicitudesCdmotanu;
    }

    /**
     * Gets the value of attribute Cdmotdev
     */
    public String getAesolicitudesCdmotdev() {
        return aesolicitudesCdmotdev;
    }
    
    /**
     * Sets the value of attribute Cdmotdev
     */
    public void setAesolicitudesCdmotdev(String aesolicitudesCdmotdev) {
        this.aesolicitudesCdmotdev = aesolicitudesCdmotdev;
    }

    /**
     * Gets the value of attribute Fesolici
     */
    public Date getAesolicitudesFesolici() {
        return aesolicitudesFesolici;
    }
    
    /**
     * Sets the value of attribute Fesolici
     */
    public void setAesolicitudesFesolici(Date aesolicitudesFesolici) {
        this.aesolicitudesFesolici = aesolicitudesFesolici;
    }

    /**
     * Gets the value of attribute Login
     */
    public String getAesolicitudesLogin() {
        return aesolicitudesLogin;
    }
    
    /**
     * Sets the value of attribute Login
     */
    public void setAesolicitudesLogin(String aesolicitudesLogin) {
        this.aesolicitudesLogin = aesolicitudesLogin;
    }

    /**
     * Gets the value of attribute Observacion
     */
    public String getAesolicitudesObservacion() {
        return aesolicitudesObservacion;
    }
    
    /**
     * Sets the value of attribute Observacion
     */
    public void setAesolicitudesObservacion(String aesolicitudesObservacion) {
        this.aesolicitudesObservacion = aesolicitudesObservacion;
    }

    /**
     * Gets the value of attribute Tipo_solicitud
     */
    public String getAesolicitudesTiposolicitud() {
        return aesolicitudesTiposolicitud;
    }
    
    /**
     * Sets the value of attribute Tipo_solicitud
     */
    public void setAesolicitudesTiposolicitud(String aesolicitudesTiposolicitud) {
        this.aesolicitudesTiposolicitud = aesolicitudesTiposolicitud;
    }

    /**
     * Gets the value of relation through role Solicitud
     */
    @JsonIgnore
    public Solicitud getSolicitud() {
        return solicitud;
    }

    /**
     * Gets the value of relation through role ProductoT
     */
    @JsonIgnore
    public Productos getProductoT() {
        return productoT;
    }

    /**
     * Gets the value of relation through role PlanT
     */
    @JsonIgnore
    public Planes getPlanT() {
        return planT;
    }

    /**
     * Gets the value of relation through role ESTADOSOLICITUD
     */
    @JsonIgnore
    public EstadoContrato getESTADOSOLICITUD() {
        return eSTADOSOLICITUD;
    }

    /**
     * Default constructor
     */
    public Aesolicitudes() {
        aesolicitudesidsolicitud = null;
    }

    /**
     * Constructor used to create instances of <code>Aesolicitudes</code>.
     * @param oid Object Identifier of the instance of <code>Aesolicitudes</code> to be created.
     * @throws SystemException
     */
    public Aesolicitudes(AesolicitudesOid oid) {
        if (oid != null && !oid.isNull()) {
            aesolicitudesidsolicitud = oid.getAesolicitudesidsolicitud();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return Aesolicitudes.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Aesolicitudes other = (Aesolicitudes)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getAesolicitudesidsolicitud(), other.getAesolicitudesidsolicitud());
        result &= Utilities.isEqual(this.getAesolicitudesNumerosolicitud(), other.getAesolicitudesNumerosolicitud());
        result &= Utilities.isEqual(this.getAesolicitudesSwestado(), other.getAesolicitudesSwestado());
        result &= Utilities.isEqual(this.getAesolicitudesFechaasignacion(), other.getAesolicitudesFechaasignacion());
        result &= Utilities.isEqual(this.getAesolicitudesCdmotanu(), other.getAesolicitudesCdmotanu());
        result &= Utilities.isEqual(this.getAesolicitudesCdmotdev(), other.getAesolicitudesCdmotdev());
        result &= Utilities.isEqual(this.getAesolicitudesFesolici(), other.getAesolicitudesFesolici());
        result &= Utilities.isEqual(this.getAesolicitudesLogin(), other.getAesolicitudesLogin());
        result &= Utilities.isEqual(this.getAesolicitudesObservacion(), other.getAesolicitudesObservacion());
        result &= Utilities.isEqual(this.getAesolicitudesTiposolicitud(), other.getAesolicitudesTiposolicitud());
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
     * Returns the <code>AesolicitudesOid</code> object that identifies this instance of <code>Aesolicitudes</code>.
     * @return <code>AesolicitudesOid</code> object that identifies this instance of <code>Aesolicitudes</code>
     */
	@Override
    public AesolicitudesOid getOid() {
        return new AesolicitudesOid(getAesolicitudesidsolicitud());
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
        if (!activeFacets.contains(Constants.AESOLICITUDES)) {
            activeFacets.add(Constants.AESOLICITUDES);
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
            relatedInstance = buildAesolicitudesRelatedInstance(relatedInstanceJsonOid);
        }
        if (AesolicitudesConstants.ROLE_NAME_SOLICITUD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAesolicitudesRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        if (AesolicitudesConstants.ROLE_NAME_PRODUCTOT.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAesolicitudesRelatedInstance4Productos(relatedInstanceJsonOid, remainingPath);
        }
        if (AesolicitudesConstants.ROLE_NAME_PLANT.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAesolicitudesRelatedInstance4Planes(relatedInstanceJsonOid, remainingPath);
        }
        if (AesolicitudesConstants.ROLE_NAME_ESTADOSOLICITUD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAesolicitudesRelatedInstance4EstadoContrato(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildAesolicitudesRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Aesolicitudes(mapper.readValue(relatedInstanceJsonOid, AesolicitudesOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Aesolicitudes.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildAesolicitudesRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Aesolicitudes.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildAesolicitudesRelatedInstance4Productos(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Productos(mapper.readValue(relatedInstanceJsonOid, ProductosOid.class)): Productos.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Aesolicitudes.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildAesolicitudesRelatedInstance4Planes(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Planes(mapper.readValue(relatedInstanceJsonOid, PlanesOid.class)): Planes.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Aesolicitudes.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildAesolicitudesRelatedInstance4EstadoContrato(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new EstadoContrato(mapper.readValue(relatedInstanceJsonOid, EstadoContratoOid.class)): EstadoContrato.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Aesolicitudes.class).error(e.getMessage());
            return null;
        }
    }
}
