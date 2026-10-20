package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.NovedadConstants;
import com.keralty.ae.persistence.oid.CausaExclusionOid;
import com.keralty.ae.persistence.oid.CausalOid;
import com.keralty.ae.persistence.oid.ConfiguracionANSOid;
import com.keralty.ae.persistence.oid.DominioOid;
import com.keralty.ae.persistence.oid.NovedadOid;
import com.keralty.ae.persistence.oid.SolicitudNovedadOid;
import com.keralty.ae.persistence.oid.TipoNovedadOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>Novedad</code> external model class.
 * <p>
 * External Model Class: <code>Novedad</code><br>
 */
public class Novedad extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id_novedad")
    private Long novedadidNovedad;

    @JsonProperty(value="aliasnovedad")
    private String novedadAliasNovedad;

    @JsonProperty(value="nombre")
    private String novedadNombre;

    @JsonProperty(value="descripcion")
    private String novedadDescripcion;

    @JsonProperty(value="codigolegal")
    private String novedadCodigoLegal;

    @JsonProperty(value="reqdocpersona")
    private Boolean novedadReqDocPersona;

    @JsonProperty(value="reqdocsolicitud")
    private Boolean novedadReqDocSolicitud;

    @JsonProperty(value="variasfamilias")
    private Boolean novedadVariasFamilias;

    @JsonProperty(value="drvtienecausales")
    private Boolean novedaddrvTieneCausales;

    @JsonProperty(value="drvtienecausasexcepcion")
    private Boolean novedaddrvTieneCausasExcepcion;

    @JsonProperty(value="minvalormeses")
    private Long novedadMinValorMeses;

    @JsonProperty(value="maxvalormeses")
    private Long novedadMaxValorMeses;

    @JsonProperty(value="drvtextomostrar")
    private String novedadDrvTextoMostrar;

    private Collection <Dominio> dominios;

    private Collection <Causal> causales;

    private Collection <SolicitudNovedad> solicitudes;

    private Collection <CausaExclusion> causasExclusion;

    private Collection <ConfiguracionANS> configuracionesANS;

    private TipoNovedad tipoNovedad;

    /**
     * Gets the value of attribute id_Novedad
     */
    public Long getNovedadidNovedad() {
        return novedadidNovedad;
    }
    
    /**
     * Sets the value of attribute id_Novedad
     */
    public void setNovedadidNovedad(Long novedadidNovedad) {
        this.novedadidNovedad = novedadidNovedad;
    }

    /**
     * Gets the value of attribute AliasNovedad
     */
    public String getNovedadAliasNovedad() {
        return novedadAliasNovedad;
    }
    
    /**
     * Sets the value of attribute AliasNovedad
     */
    public void setNovedadAliasNovedad(String novedadAliasNovedad) {
        this.novedadAliasNovedad = novedadAliasNovedad;
    }

    /**
     * Gets the value of attribute Nombre
     */
    public String getNovedadNombre() {
        return novedadNombre;
    }
    
    /**
     * Sets the value of attribute Nombre
     */
    public void setNovedadNombre(String novedadNombre) {
        this.novedadNombre = novedadNombre;
    }

    /**
     * Gets the value of attribute Descripcion
     */
    public String getNovedadDescripcion() {
        return novedadDescripcion;
    }
    
    /**
     * Sets the value of attribute Descripcion
     */
    public void setNovedadDescripcion(String novedadDescripcion) {
        this.novedadDescripcion = novedadDescripcion;
    }

    /**
     * Gets the value of attribute CodigoLegal
     */
    public String getNovedadCodigoLegal() {
        return novedadCodigoLegal;
    }
    
    /**
     * Sets the value of attribute CodigoLegal
     */
    public void setNovedadCodigoLegal(String novedadCodigoLegal) {
        this.novedadCodigoLegal = novedadCodigoLegal;
    }

    /**
     * Gets the value of attribute ReqDocPersona
     */
    public Boolean getNovedadReqDocPersona() {
        return novedadReqDocPersona;
    }
    
    /**
     * Sets the value of attribute ReqDocPersona
     */
    public void setNovedadReqDocPersona(Boolean novedadReqDocPersona) {
        this.novedadReqDocPersona = novedadReqDocPersona;
    }

    /**
     * Gets the value of attribute ReqDocSolicitud
     */
    public Boolean getNovedadReqDocSolicitud() {
        return novedadReqDocSolicitud;
    }
    
    /**
     * Sets the value of attribute ReqDocSolicitud
     */
    public void setNovedadReqDocSolicitud(Boolean novedadReqDocSolicitud) {
        this.novedadReqDocSolicitud = novedadReqDocSolicitud;
    }

    /**
     * Gets the value of attribute VariasFamilias
     */
    public Boolean getNovedadVariasFamilias() {
        return novedadVariasFamilias;
    }
    
    /**
     * Sets the value of attribute VariasFamilias
     */
    public void setNovedadVariasFamilias(Boolean novedadVariasFamilias) {
        this.novedadVariasFamilias = novedadVariasFamilias;
    }

    /**
     * Gets the value of attribute drvTieneCausales
     */
    public Boolean getNovedaddrvTieneCausales() {
        return novedaddrvTieneCausales;
    }
    
    /**
     * Sets the value of attribute drvTieneCausales
     */
    public void setNovedaddrvTieneCausales(Boolean novedaddrvTieneCausales) {
        this.novedaddrvTieneCausales = novedaddrvTieneCausales;
    }

    /**
     * Gets the value of attribute drvTieneCausasExcepcion
     */
    public Boolean getNovedaddrvTieneCausasExcepcion() {
        return novedaddrvTieneCausasExcepcion;
    }
    
    /**
     * Sets the value of attribute drvTieneCausasExcepcion
     */
    public void setNovedaddrvTieneCausasExcepcion(Boolean novedaddrvTieneCausasExcepcion) {
        this.novedaddrvTieneCausasExcepcion = novedaddrvTieneCausasExcepcion;
    }

    /**
     * Gets the value of attribute MinValorMeses
     */
    public Long getNovedadMinValorMeses() {
        return novedadMinValorMeses;
    }
    
    /**
     * Sets the value of attribute MinValorMeses
     */
    public void setNovedadMinValorMeses(Long novedadMinValorMeses) {
        this.novedadMinValorMeses = novedadMinValorMeses;
    }

    /**
     * Gets the value of attribute MaxValorMeses
     */
    public Long getNovedadMaxValorMeses() {
        return novedadMaxValorMeses;
    }
    
    /**
     * Sets the value of attribute MaxValorMeses
     */
    public void setNovedadMaxValorMeses(Long novedadMaxValorMeses) {
        this.novedadMaxValorMeses = novedadMaxValorMeses;
    }

    /**
     * Gets the value of attribute DrvTextoMostrar
     */
    public String getNovedadDrvTextoMostrar() {
        return novedadDrvTextoMostrar;
    }
    
    /**
     * Sets the value of attribute DrvTextoMostrar
     */
    public void setNovedadDrvTextoMostrar(String novedadDrvTextoMostrar) {
        this.novedadDrvTextoMostrar = novedadDrvTextoMostrar;
    }

    /**
     * Gets the value of relation through role Dominios
     */
    @JsonIgnore
    public Collection <Dominio> getDominios() {
        return dominios;
    }

    /**
     * Gets the value of relation through role Causales
     */
    @JsonIgnore
    public Collection <Causal> getCausales() {
        return causales;
    }

    /**
     * Gets the value of relation through role Solicitudes
     */
    @JsonIgnore
    public Collection <SolicitudNovedad> getSolicitudes() {
        return solicitudes;
    }

    /**
     * Gets the value of relation through role CausasExclusion
     */
    @JsonIgnore
    public Collection <CausaExclusion> getCausasExclusion() {
        return causasExclusion;
    }

    /**
     * Gets the value of relation through role ConfiguracionesANS
     */
    @JsonIgnore
    public Collection <ConfiguracionANS> getConfiguracionesANS() {
        return configuracionesANS;
    }

    /**
     * Gets the value of relation through role TipoNovedad
     */
    @JsonIgnore
    public TipoNovedad getTipoNovedad() {
        return tipoNovedad;
    }

    /**
     * Default constructor
     */
    public Novedad() {
        novedadidNovedad = null;
    }

    /**
     * Constructor used to create instances of <code>Novedad</code>.
     * @param oid Object Identifier of the instance of <code>Novedad</code> to be created.
     * @throws SystemException
     */
    public Novedad(NovedadOid oid) {
        if (oid != null && !oid.isNull()) {
            novedadidNovedad = oid.getNovedadidNovedad();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return Novedad.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Novedad other = (Novedad)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getNovedadidNovedad(), other.getNovedadidNovedad());
        result &= Utilities.isEqual(this.getNovedadAliasNovedad(), other.getNovedadAliasNovedad());
        result &= Utilities.isEqual(this.getNovedadNombre(), other.getNovedadNombre());
        result &= Utilities.isEqual(this.getNovedadDescripcion(), other.getNovedadDescripcion());
        result &= Utilities.isEqual(this.getNovedadCodigoLegal(), other.getNovedadCodigoLegal());
        result &= Utilities.isEqual(this.getNovedadReqDocPersona(), other.getNovedadReqDocPersona());
        result &= Utilities.isEqual(this.getNovedadReqDocSolicitud(), other.getNovedadReqDocSolicitud());
        result &= Utilities.isEqual(this.getNovedadVariasFamilias(), other.getNovedadVariasFamilias());
        result &= Utilities.isEqual(this.getNovedaddrvTieneCausales(), other.getNovedaddrvTieneCausales());
        result &= Utilities.isEqual(this.getNovedaddrvTieneCausasExcepcion(), other.getNovedaddrvTieneCausasExcepcion());
        result &= Utilities.isEqual(this.getNovedadMinValorMeses(), other.getNovedadMinValorMeses());
        result &= Utilities.isEqual(this.getNovedadMaxValorMeses(), other.getNovedadMaxValorMeses());
        result &= Utilities.isEqual(this.getNovedadDrvTextoMostrar(), other.getNovedadDrvTextoMostrar());
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
     * Returns the <code>NovedadOid</code> object that identifies this instance of <code>Novedad</code>.
     * @return <code>NovedadOid</code> object that identifies this instance of <code>Novedad</code>
     */
	@Override
    public NovedadOid getOid() {
        return new NovedadOid(getNovedadidNovedad());
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
        if (!activeFacets.contains(Constants.NOVEDAD)) {
            activeFacets.add(Constants.NOVEDAD);
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
            relatedInstance = buildNovedadRelatedInstance(relatedInstanceJsonOid);
        }
        if (NovedadConstants.ROLE_NAME_DOMINIOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildNovedadRelatedInstance4Dominio(relatedInstanceJsonOid, remainingPath);
        }
        if (NovedadConstants.ROLE_NAME_CAUSALES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildNovedadRelatedInstance4Causal(relatedInstanceJsonOid, remainingPath);
        }
        if (NovedadConstants.ROLE_NAME_SOLICITUDES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildNovedadRelatedInstance4SolicitudNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (NovedadConstants.ROLE_NAME_CAUSASEXCLUSION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildNovedadRelatedInstance4CausaExclusion(relatedInstanceJsonOid, remainingPath);
        }
        if (NovedadConstants.ROLE_NAME_CONFIGURACIONESANS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildNovedadRelatedInstance4ConfiguracionANS(relatedInstanceJsonOid, remainingPath);
        }
        if (NovedadConstants.ROLE_NAME_TIPONOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildNovedadRelatedInstance4TipoNovedad(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildNovedadRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Novedad(mapper.readValue(relatedInstanceJsonOid, NovedadOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Novedad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildNovedadRelatedInstance4Dominio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Dominio(mapper.readValue(relatedInstanceJsonOid, DominioOid.class)): Dominio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Novedad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildNovedadRelatedInstance4Causal(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Causal(mapper.readValue(relatedInstanceJsonOid, CausalOid.class)): Causal.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Novedad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildNovedadRelatedInstance4SolicitudNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new SolicitudNovedad(mapper.readValue(relatedInstanceJsonOid, SolicitudNovedadOid.class)): SolicitudNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Novedad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildNovedadRelatedInstance4CausaExclusion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new CausaExclusion(mapper.readValue(relatedInstanceJsonOid, CausaExclusionOid.class)): CausaExclusion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Novedad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildNovedadRelatedInstance4ConfiguracionANS(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ConfiguracionANS(mapper.readValue(relatedInstanceJsonOid, ConfiguracionANSOid.class)): ConfiguracionANS.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Novedad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildNovedadRelatedInstance4TipoNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TipoNovedad(mapper.readValue(relatedInstanceJsonOid, TipoNovedadOid.class)): TipoNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Novedad.class).error(e.getMessage());
            return null;
        }
    }
}
