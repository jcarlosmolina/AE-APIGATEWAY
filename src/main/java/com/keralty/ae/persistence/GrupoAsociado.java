package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.GrupoAsociadoConstants;
import com.keralty.ae.persistence.oid.ContratoCOid;
import com.keralty.ae.persistence.oid.GrupoAsociadoOid;
import com.keralty.ae.persistence.oid.PlanesOid;
import com.keralty.ae.persistence.oid.ProductosOid;
import com.keralty.ae.persistence.oid.SolicitudNovedadOid;
import com.keralty.ae.persistence.oid.SolicitudOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>GrupoAsociado</code> external model class.
 * <p>
 * External Model Class: <code>GrupoAsociado</code><br>
 */
public class GrupoAsociado extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="codigo")
    private Long grupoAsociadoCodigo;

    @JsonProperty(value="codigolegal")
    private String grupoAsociadoCodigoLegal;

    @JsonProperty(value="codtarifacore")
    private String grupoAsociadoCodTarifaCORE;

    @JsonProperty(value="descripcion")
    private String grupoAsociadoDescripcion;

    @JsonProperty(value="finivigencia")
    private Date grupoAsociadoFIniVigencia;

    @JsonProperty(value="ffinvigencia")
    private Date grupoAsociadoFFinVigencia;

    @JsonProperty(value="estado")
    private Long grupoAsociadoEstado;

    @JsonProperty(value="disminucioncarencia")
    private Long grupoAsociadoDisminucionCarencia;

    private Collection <Solicitud> solicitudes;

    private Collection <ContratoC> contratosC;

    private Collection <SolicitudNovedad> solicitudesNovedad;

    private Productos productoT;

    private Planes planT;

    /**
     * Gets the value of attribute Codigo
     */
    public Long getGrupoAsociadoCodigo() {
        return grupoAsociadoCodigo;
    }
    
    /**
     * Sets the value of attribute Codigo
     */
    public void setGrupoAsociadoCodigo(Long grupoAsociadoCodigo) {
        this.grupoAsociadoCodigo = grupoAsociadoCodigo;
    }

    /**
     * Gets the value of attribute CodigoLegal
     */
    public String getGrupoAsociadoCodigoLegal() {
        return grupoAsociadoCodigoLegal;
    }
    
    /**
     * Sets the value of attribute CodigoLegal
     */
    public void setGrupoAsociadoCodigoLegal(String grupoAsociadoCodigoLegal) {
        this.grupoAsociadoCodigoLegal = grupoAsociadoCodigoLegal;
    }

    /**
     * Gets the value of attribute CodTarifaCORE
     */
    public String getGrupoAsociadoCodTarifaCORE() {
        return grupoAsociadoCodTarifaCORE;
    }
    
    /**
     * Sets the value of attribute CodTarifaCORE
     */
    public void setGrupoAsociadoCodTarifaCORE(String grupoAsociadoCodTarifaCORE) {
        this.grupoAsociadoCodTarifaCORE = grupoAsociadoCodTarifaCORE;
    }

    /**
     * Gets the value of attribute Descripcion
     */
    public String getGrupoAsociadoDescripcion() {
        return grupoAsociadoDescripcion;
    }
    
    /**
     * Sets the value of attribute Descripcion
     */
    public void setGrupoAsociadoDescripcion(String grupoAsociadoDescripcion) {
        this.grupoAsociadoDescripcion = grupoAsociadoDescripcion;
    }

    /**
     * Gets the value of attribute FIniVigencia
     */
    public Date getGrupoAsociadoFIniVigencia() {
        return grupoAsociadoFIniVigencia;
    }
    
    /**
     * Sets the value of attribute FIniVigencia
     */
    public void setGrupoAsociadoFIniVigencia(Date grupoAsociadoFIniVigencia) {
        this.grupoAsociadoFIniVigencia = grupoAsociadoFIniVigencia;
    }

    /**
     * Gets the value of attribute FFinVigencia
     */
    public Date getGrupoAsociadoFFinVigencia() {
        return grupoAsociadoFFinVigencia;
    }
    
    /**
     * Sets the value of attribute FFinVigencia
     */
    public void setGrupoAsociadoFFinVigencia(Date grupoAsociadoFFinVigencia) {
        this.grupoAsociadoFFinVigencia = grupoAsociadoFFinVigencia;
    }

    /**
     * Gets the value of attribute Estado
     */
    public Long getGrupoAsociadoEstado() {
        return grupoAsociadoEstado;
    }
    
    /**
     * Sets the value of attribute Estado
     */
    public void setGrupoAsociadoEstado(Long grupoAsociadoEstado) {
        this.grupoAsociadoEstado = grupoAsociadoEstado;
    }

    /**
     * Gets the value of attribute DisminucionCarencia
     */
    public Long getGrupoAsociadoDisminucionCarencia() {
        return grupoAsociadoDisminucionCarencia;
    }
    
    /**
     * Sets the value of attribute DisminucionCarencia
     */
    public void setGrupoAsociadoDisminucionCarencia(Long grupoAsociadoDisminucionCarencia) {
        this.grupoAsociadoDisminucionCarencia = grupoAsociadoDisminucionCarencia;
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
     * Gets the value of relation through role SolicitudesNovedad
     */
    @JsonIgnore
    public Collection <SolicitudNovedad> getSolicitudesNovedad() {
        return solicitudesNovedad;
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
     * Default constructor
     */
    public GrupoAsociado() {
        grupoAsociadoCodigo = null;
    }

    /**
     * Constructor used to create instances of <code>GrupoAsociado</code>.
     * @param oid Object Identifier of the instance of <code>GrupoAsociado</code> to be created.
     * @throws SystemException
     */
    public GrupoAsociado(GrupoAsociadoOid oid) {
        if (oid != null && !oid.isNull()) {
            grupoAsociadoCodigo = oid.getGrupoAsociadoCodigo();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return GrupoAsociado.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        GrupoAsociado other = (GrupoAsociado)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getGrupoAsociadoCodigo(), other.getGrupoAsociadoCodigo());
        result &= Utilities.isEqual(this.getGrupoAsociadoCodigoLegal(), other.getGrupoAsociadoCodigoLegal());
        result &= Utilities.isEqual(this.getGrupoAsociadoCodTarifaCORE(), other.getGrupoAsociadoCodTarifaCORE());
        result &= Utilities.isEqual(this.getGrupoAsociadoDescripcion(), other.getGrupoAsociadoDescripcion());
        result &= Utilities.isEqual(this.getGrupoAsociadoFIniVigencia(), other.getGrupoAsociadoFIniVigencia());
        result &= Utilities.isEqual(this.getGrupoAsociadoFFinVigencia(), other.getGrupoAsociadoFFinVigencia());
        result &= Utilities.isEqual(this.getGrupoAsociadoEstado(), other.getGrupoAsociadoEstado());
        result &= Utilities.isEqual(this.getGrupoAsociadoDisminucionCarencia(), other.getGrupoAsociadoDisminucionCarencia());
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
     * Returns the <code>GrupoAsociadoOid</code> object that identifies this instance of <code>GrupoAsociado</code>.
     * @return <code>GrupoAsociadoOid</code> object that identifies this instance of <code>GrupoAsociado</code>
     */
	@Override
    public GrupoAsociadoOid getOid() {
        return new GrupoAsociadoOid(getGrupoAsociadoCodigo());
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
        if (!activeFacets.contains(Constants.GRUPOASOCIADO)) {
            activeFacets.add(Constants.GRUPOASOCIADO);
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
            relatedInstance = buildGrupoAsociadoRelatedInstance(relatedInstanceJsonOid);
        }
        if (GrupoAsociadoConstants.ROLE_NAME_SOLICITUDES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildGrupoAsociadoRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        if (GrupoAsociadoConstants.ROLE_NAME_CONTRATOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildGrupoAsociadoRelatedInstance4ContratoC(relatedInstanceJsonOid, remainingPath);
        }
        if (GrupoAsociadoConstants.ROLE_NAME_SOLICITUDESNOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildGrupoAsociadoRelatedInstance4SolicitudNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (GrupoAsociadoConstants.ROLE_NAME_PRODUCTOT.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildGrupoAsociadoRelatedInstance4Productos(relatedInstanceJsonOid, remainingPath);
        }
        if (GrupoAsociadoConstants.ROLE_NAME_PLANT.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildGrupoAsociadoRelatedInstance4Planes(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildGrupoAsociadoRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new GrupoAsociado(mapper.readValue(relatedInstanceJsonOid, GrupoAsociadoOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(GrupoAsociado.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildGrupoAsociadoRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(GrupoAsociado.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildGrupoAsociadoRelatedInstance4ContratoC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ContratoC(mapper.readValue(relatedInstanceJsonOid, ContratoCOid.class)): ContratoC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(GrupoAsociado.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildGrupoAsociadoRelatedInstance4SolicitudNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new SolicitudNovedad(mapper.readValue(relatedInstanceJsonOid, SolicitudNovedadOid.class)): SolicitudNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(GrupoAsociado.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildGrupoAsociadoRelatedInstance4Productos(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Productos(mapper.readValue(relatedInstanceJsonOid, ProductosOid.class)): Productos.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(GrupoAsociado.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildGrupoAsociadoRelatedInstance4Planes(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Planes(mapper.readValue(relatedInstanceJsonOid, PlanesOid.class)): Planes.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(GrupoAsociado.class).error(e.getMessage());
            return null;
        }
    }
}
