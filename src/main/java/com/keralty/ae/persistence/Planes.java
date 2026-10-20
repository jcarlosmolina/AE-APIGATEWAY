package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.PlanesConstants;
import com.keralty.ae.persistence.oid.AesolicitudesOid;
import com.keralty.ae.persistence.oid.AfiliacionesOid;
import com.keralty.ae.persistence.oid.ContratoCOid;
import com.keralty.ae.persistence.oid.DominioOid;
import com.keralty.ae.persistence.oid.GrupoAsociadoOid;
import com.keralty.ae.persistence.oid.PlanesOid;
import com.keralty.ae.persistence.oid.ProductosOid;
import com.keralty.ae.persistence.oid.SolicitudNovedadOid;
import com.keralty.ae.persistence.oid.TarifaOid;
import com.keralty.ae.persistence.oid.TipoIVAOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>Planes</code> external model class.
 * <p>
 * External Model Class: <code>Planes</code><br>
 */
public class Planes extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="plan")
    private Long planesPlan;

    @JsonProperty(value="nombre")
    private String planesNombre;

    @JsonProperty(value="esbancorep")
    private Boolean planesEsBancoRep;

    @JsonProperty(value="codigolegal")
    private String planesCodigoLegal;

    @JsonProperty(value="aceptapreexistencias")
    private Boolean planesAceptaPreexistencias;

    @JsonProperty(value="esvoluntario")
    private Boolean planesEsVoluntario;

    @JsonProperty(value="iniciocontdiauno")
    private Boolean planesInicioContDiaUno;

    private Collection <Dominio> dominios;

    private Collection <Tarifa> tarifas;

    private Collection <GrupoAsociado> gruposAsociados;

    private Collection <TipoIVA> tiposIVA;

    private Collection <Aesolicitudes> aESOLICITUDES;

    private Collection <ContratoC> contratosC;

    private Collection <Afiliaciones> afiliaciones;

    private Collection <SolicitudNovedad> solicitudesNovedad;

    private Productos productoT;

    /**
     * Gets the value of attribute Plan
     */
    public Long getPlanesPlan() {
        return planesPlan;
    }
    
    /**
     * Sets the value of attribute Plan
     */
    public void setPlanesPlan(Long planesPlan) {
        this.planesPlan = planesPlan;
    }

    /**
     * Gets the value of attribute Nombre
     */
    public String getPlanesNombre() {
        return planesNombre;
    }
    
    /**
     * Sets the value of attribute Nombre
     */
    public void setPlanesNombre(String planesNombre) {
        this.planesNombre = planesNombre;
    }

    /**
     * Gets the value of attribute EsBancoRep
     */
    public Boolean getPlanesEsBancoRep() {
        return planesEsBancoRep;
    }
    
    /**
     * Sets the value of attribute EsBancoRep
     */
    public void setPlanesEsBancoRep(Boolean planesEsBancoRep) {
        this.planesEsBancoRep = planesEsBancoRep;
    }

    /**
     * Gets the value of attribute CodigoLegal
     */
    public String getPlanesCodigoLegal() {
        return planesCodigoLegal;
    }
    
    /**
     * Sets the value of attribute CodigoLegal
     */
    public void setPlanesCodigoLegal(String planesCodigoLegal) {
        this.planesCodigoLegal = planesCodigoLegal;
    }

    /**
     * Gets the value of attribute AceptaPreexistencias
     */
    public Boolean getPlanesAceptaPreexistencias() {
        return planesAceptaPreexistencias;
    }
    
    /**
     * Sets the value of attribute AceptaPreexistencias
     */
    public void setPlanesAceptaPreexistencias(Boolean planesAceptaPreexistencias) {
        this.planesAceptaPreexistencias = planesAceptaPreexistencias;
    }

    /**
     * Gets the value of attribute EsVoluntario
     */
    public Boolean getPlanesEsVoluntario() {
        return planesEsVoluntario;
    }
    
    /**
     * Sets the value of attribute EsVoluntario
     */
    public void setPlanesEsVoluntario(Boolean planesEsVoluntario) {
        this.planesEsVoluntario = planesEsVoluntario;
    }

    /**
     * Gets the value of attribute InicioContDiaUno
     */
    public Boolean getPlanesInicioContDiaUno() {
        return planesInicioContDiaUno;
    }
    
    /**
     * Sets the value of attribute InicioContDiaUno
     */
    public void setPlanesInicioContDiaUno(Boolean planesInicioContDiaUno) {
        this.planesInicioContDiaUno = planesInicioContDiaUno;
    }

    /**
     * Gets the value of relation through role Dominios
     */
    @JsonIgnore
    public Collection <Dominio> getDominios() {
        return dominios;
    }

    /**
     * Gets the value of relation through role Tarifas
     */
    @JsonIgnore
    public Collection <Tarifa> getTarifas() {
        return tarifas;
    }

    /**
     * Gets the value of relation through role GruposAsociados
     */
    @JsonIgnore
    public Collection <GrupoAsociado> getGruposAsociados() {
        return gruposAsociados;
    }

    /**
     * Gets the value of relation through role TiposIVA
     */
    @JsonIgnore
    public Collection <TipoIVA> getTiposIVA() {
        return tiposIVA;
    }

    /**
     * Gets the value of relation through role AESOLICITUDES
     */
    @JsonIgnore
    public Collection <Aesolicitudes> getAESOLICITUDES() {
        return aESOLICITUDES;
    }

    /**
     * Gets the value of relation through role ContratosC
     */
    @JsonIgnore
    public Collection <ContratoC> getContratosC() {
        return contratosC;
    }

    /**
     * Gets the value of relation through role Afiliaciones
     */
    @JsonIgnore
    public Collection <Afiliaciones> getAfiliaciones() {
        return afiliaciones;
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
     * Default constructor
     */
    public Planes() {
        planesPlan = null;
    }

    /**
     * Constructor used to create instances of <code>Planes</code>.
     * @param oid Object Identifier of the instance of <code>Planes</code> to be created.
     * @throws SystemException
     */
    public Planes(PlanesOid oid) {
        if (oid != null && !oid.isNull()) {
            planesPlan = oid.getPlanesPlan();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return Planes.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Planes other = (Planes)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getPlanesPlan(), other.getPlanesPlan());
        result &= Utilities.isEqual(this.getPlanesNombre(), other.getPlanesNombre());
        result &= Utilities.isEqual(this.getPlanesEsBancoRep(), other.getPlanesEsBancoRep());
        result &= Utilities.isEqual(this.getPlanesCodigoLegal(), other.getPlanesCodigoLegal());
        result &= Utilities.isEqual(this.getPlanesAceptaPreexistencias(), other.getPlanesAceptaPreexistencias());
        result &= Utilities.isEqual(this.getPlanesEsVoluntario(), other.getPlanesEsVoluntario());
        result &= Utilities.isEqual(this.getPlanesInicioContDiaUno(), other.getPlanesInicioContDiaUno());
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
     * Returns the <code>PlanesOid</code> object that identifies this instance of <code>Planes</code>.
     * @return <code>PlanesOid</code> object that identifies this instance of <code>Planes</code>
     */
	@Override
    public PlanesOid getOid() {
        return new PlanesOid(getPlanesPlan());
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
        if (!activeFacets.contains(Constants.PLANES)) {
            activeFacets.add(Constants.PLANES);
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
            relatedInstance = buildPlanesRelatedInstance(relatedInstanceJsonOid);
        }
        if (PlanesConstants.ROLE_NAME_DOMINIOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPlanesRelatedInstance4Dominio(relatedInstanceJsonOid, remainingPath);
        }
        if (PlanesConstants.ROLE_NAME_TARIFAS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPlanesRelatedInstance4Tarifa(relatedInstanceJsonOid, remainingPath);
        }
        if (PlanesConstants.ROLE_NAME_GRUPOSASOCIADOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPlanesRelatedInstance4GrupoAsociado(relatedInstanceJsonOid, remainingPath);
        }
        if (PlanesConstants.ROLE_NAME_TIPOSIVA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPlanesRelatedInstance4TipoIVA(relatedInstanceJsonOid, remainingPath);
        }
        if (PlanesConstants.ROLE_NAME_AESOLICITUDES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPlanesRelatedInstance4Aesolicitudes(relatedInstanceJsonOid, remainingPath);
        }
        if (PlanesConstants.ROLE_NAME_CONTRATOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPlanesRelatedInstance4ContratoC(relatedInstanceJsonOid, remainingPath);
        }
        if (PlanesConstants.ROLE_NAME_AFILIACIONES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPlanesRelatedInstance4Afiliaciones(relatedInstanceJsonOid, remainingPath);
        }
        if (PlanesConstants.ROLE_NAME_SOLICITUDESNOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPlanesRelatedInstance4SolicitudNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (PlanesConstants.ROLE_NAME_PRODUCTOT.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPlanesRelatedInstance4Productos(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildPlanesRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Planes(mapper.readValue(relatedInstanceJsonOid, PlanesOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Planes.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPlanesRelatedInstance4Dominio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Dominio(mapper.readValue(relatedInstanceJsonOid, DominioOid.class)): Dominio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Planes.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPlanesRelatedInstance4Tarifa(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Tarifa(mapper.readValue(relatedInstanceJsonOid, TarifaOid.class)): Tarifa.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Planes.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPlanesRelatedInstance4GrupoAsociado(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new GrupoAsociado(mapper.readValue(relatedInstanceJsonOid, GrupoAsociadoOid.class)): GrupoAsociado.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Planes.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPlanesRelatedInstance4TipoIVA(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TipoIVA(mapper.readValue(relatedInstanceJsonOid, TipoIVAOid.class)): TipoIVA.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Planes.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPlanesRelatedInstance4Aesolicitudes(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Aesolicitudes(mapper.readValue(relatedInstanceJsonOid, AesolicitudesOid.class)): Aesolicitudes.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Planes.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPlanesRelatedInstance4ContratoC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ContratoC(mapper.readValue(relatedInstanceJsonOid, ContratoCOid.class)): ContratoC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Planes.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPlanesRelatedInstance4Afiliaciones(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Afiliaciones(mapper.readValue(relatedInstanceJsonOid, AfiliacionesOid.class)): Afiliaciones.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Planes.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPlanesRelatedInstance4SolicitudNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new SolicitudNovedad(mapper.readValue(relatedInstanceJsonOid, SolicitudNovedadOid.class)): SolicitudNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Planes.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPlanesRelatedInstance4Productos(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Productos(mapper.readValue(relatedInstanceJsonOid, ProductosOid.class)): Productos.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Planes.class).error(e.getMessage());
            return null;
        }
    }
}
