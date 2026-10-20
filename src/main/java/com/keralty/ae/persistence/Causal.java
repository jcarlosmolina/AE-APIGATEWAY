package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.CausalConstants;
import com.keralty.ae.global.Constants;
import com.keralty.ae.persistence.oid.CausalOid;
import com.keralty.ae.persistence.oid.ConfiguracionANSOid;
import com.keralty.ae.persistence.oid.GrupoAsignacionNovedadOid;
import com.keralty.ae.persistence.oid.NovedadOid;
import com.keralty.ae.persistence.oid.SolicitudNovedadOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>Causal</code> external model class.
 * <p>
 * External Model Class: <code>Causal</code><br>
 */
public class Causal extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id_causal")
    private Long causalidCausal;

    @JsonProperty(value="aliascausal")
    private String causalAliasCausal;

    @JsonProperty(value="nombre")
    private String causalNombre;

    @JsonProperty(value="descripcion")
    private String causalDescripcion;

    @JsonProperty(value="codigolegal")
    private String causalCodigoLegal;

    @JsonProperty(value="reqdocpersona")
    private Boolean causalReqDocPersona;

    @JsonProperty(value="reqdocsolicitud")
    private Boolean causalReqDocSolicitud;

    @JsonProperty(value="drvtextomostrar")
    private String causalDrvTextoMostrar;

    private Collection <SolicitudNovedad> solicitudes;

    private Collection <GrupoAsignacionNovedad> grupoAsignacionNovedad;

    private Collection <ConfiguracionANS> configuracionesANS;

    private Novedad novedad;

    /**
     * Gets the value of attribute id_Causal
     */
    public Long getCausalidCausal() {
        return causalidCausal;
    }
    
    /**
     * Sets the value of attribute id_Causal
     */
    public void setCausalidCausal(Long causalidCausal) {
        this.causalidCausal = causalidCausal;
    }

    /**
     * Gets the value of attribute AliasCausal
     */
    public String getCausalAliasCausal() {
        return causalAliasCausal;
    }
    
    /**
     * Sets the value of attribute AliasCausal
     */
    public void setCausalAliasCausal(String causalAliasCausal) {
        this.causalAliasCausal = causalAliasCausal;
    }

    /**
     * Gets the value of attribute Nombre
     */
    public String getCausalNombre() {
        return causalNombre;
    }
    
    /**
     * Sets the value of attribute Nombre
     */
    public void setCausalNombre(String causalNombre) {
        this.causalNombre = causalNombre;
    }

    /**
     * Gets the value of attribute Descripcion
     */
    public String getCausalDescripcion() {
        return causalDescripcion;
    }
    
    /**
     * Sets the value of attribute Descripcion
     */
    public void setCausalDescripcion(String causalDescripcion) {
        this.causalDescripcion = causalDescripcion;
    }

    /**
     * Gets the value of attribute CodigoLegal
     */
    public String getCausalCodigoLegal() {
        return causalCodigoLegal;
    }
    
    /**
     * Sets the value of attribute CodigoLegal
     */
    public void setCausalCodigoLegal(String causalCodigoLegal) {
        this.causalCodigoLegal = causalCodigoLegal;
    }

    /**
     * Gets the value of attribute ReqDocPersona
     */
    public Boolean getCausalReqDocPersona() {
        return causalReqDocPersona;
    }
    
    /**
     * Sets the value of attribute ReqDocPersona
     */
    public void setCausalReqDocPersona(Boolean causalReqDocPersona) {
        this.causalReqDocPersona = causalReqDocPersona;
    }

    /**
     * Gets the value of attribute ReqDocSolicitud
     */
    public Boolean getCausalReqDocSolicitud() {
        return causalReqDocSolicitud;
    }
    
    /**
     * Sets the value of attribute ReqDocSolicitud
     */
    public void setCausalReqDocSolicitud(Boolean causalReqDocSolicitud) {
        this.causalReqDocSolicitud = causalReqDocSolicitud;
    }

    /**
     * Gets the value of attribute DrvTextoMostrar
     */
    public String getCausalDrvTextoMostrar() {
        return causalDrvTextoMostrar;
    }
    
    /**
     * Sets the value of attribute DrvTextoMostrar
     */
    public void setCausalDrvTextoMostrar(String causalDrvTextoMostrar) {
        this.causalDrvTextoMostrar = causalDrvTextoMostrar;
    }

    /**
     * Gets the value of relation through role Solicitudes
     */
    @JsonIgnore
    public Collection <SolicitudNovedad> getSolicitudes() {
        return solicitudes;
    }

    /**
     * Gets the value of relation through role GrupoAsignacionNovedad
     */
    @JsonIgnore
    public Collection <GrupoAsignacionNovedad> getGrupoAsignacionNovedad() {
        return grupoAsignacionNovedad;
    }

    /**
     * Gets the value of relation through role ConfiguracionesANS
     */
    @JsonIgnore
    public Collection <ConfiguracionANS> getConfiguracionesANS() {
        return configuracionesANS;
    }

    /**
     * Gets the value of relation through role Novedad
     */
    @JsonIgnore
    public Novedad getNovedad() {
        return novedad;
    }

    /**
     * Default constructor
     */
    public Causal() {
        causalidCausal = null;
    }

    /**
     * Constructor used to create instances of <code>Causal</code>.
     * @param oid Object Identifier of the instance of <code>Causal</code> to be created.
     * @throws SystemException
     */
    public Causal(CausalOid oid) {
        if (oid != null && !oid.isNull()) {
            causalidCausal = oid.getCausalidCausal();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return Causal.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Causal other = (Causal)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getCausalidCausal(), other.getCausalidCausal());
        result &= Utilities.isEqual(this.getCausalAliasCausal(), other.getCausalAliasCausal());
        result &= Utilities.isEqual(this.getCausalNombre(), other.getCausalNombre());
        result &= Utilities.isEqual(this.getCausalDescripcion(), other.getCausalDescripcion());
        result &= Utilities.isEqual(this.getCausalCodigoLegal(), other.getCausalCodigoLegal());
        result &= Utilities.isEqual(this.getCausalReqDocPersona(), other.getCausalReqDocPersona());
        result &= Utilities.isEqual(this.getCausalReqDocSolicitud(), other.getCausalReqDocSolicitud());
        result &= Utilities.isEqual(this.getCausalDrvTextoMostrar(), other.getCausalDrvTextoMostrar());
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
     * Returns the <code>CausalOid</code> object that identifies this instance of <code>Causal</code>.
     * @return <code>CausalOid</code> object that identifies this instance of <code>Causal</code>
     */
	@Override
    public CausalOid getOid() {
        return new CausalOid(getCausalidCausal());
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
        if (!activeFacets.contains(Constants.CAUSAL)) {
            activeFacets.add(Constants.CAUSAL);
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
            relatedInstance = buildCausalRelatedInstance(relatedInstanceJsonOid);
        }
        if (CausalConstants.ROLE_NAME_SOLICITUDES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildCausalRelatedInstance4SolicitudNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (CausalConstants.ROLE_NAME_GRUPOASIGNACIONNOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildCausalRelatedInstance4GrupoAsignacionNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (CausalConstants.ROLE_NAME_CONFIGURACIONESANS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildCausalRelatedInstance4ConfiguracionANS(relatedInstanceJsonOid, remainingPath);
        }
        if (CausalConstants.ROLE_NAME_NOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildCausalRelatedInstance4Novedad(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildCausalRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Causal(mapper.readValue(relatedInstanceJsonOid, CausalOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Causal.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildCausalRelatedInstance4SolicitudNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new SolicitudNovedad(mapper.readValue(relatedInstanceJsonOid, SolicitudNovedadOid.class)): SolicitudNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Causal.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildCausalRelatedInstance4GrupoAsignacionNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new GrupoAsignacionNovedad(mapper.readValue(relatedInstanceJsonOid, GrupoAsignacionNovedadOid.class)): GrupoAsignacionNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Causal.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildCausalRelatedInstance4ConfiguracionANS(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ConfiguracionANS(mapper.readValue(relatedInstanceJsonOid, ConfiguracionANSOid.class)): ConfiguracionANS.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Causal.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildCausalRelatedInstance4Novedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Novedad(mapper.readValue(relatedInstanceJsonOid, NovedadOid.class)): Novedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Causal.class).error(e.getMessage());
            return null;
        }
    }
}
