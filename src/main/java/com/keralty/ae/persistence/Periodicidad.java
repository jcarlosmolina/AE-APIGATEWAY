package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.PeriodicidadConstants;
import com.keralty.ae.persistence.oid.AnexoCOid;
import com.keralty.ae.persistence.oid.AnexoMatOid;
import com.keralty.ae.persistence.oid.AnexoNeoOid;
import com.keralty.ae.persistence.oid.ContratoCOid;
import com.keralty.ae.persistence.oid.DominioOid;
import com.keralty.ae.persistence.oid.PeriodicidadOid;
import com.keralty.ae.persistence.oid.SolicitudNovedadOid;
import com.keralty.ae.persistence.oid.SolicitudOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>Periodicidad</code> external model class.
 * <p>
 * External Model Class: <code>Periodicidad</code><br>
 */
public class Periodicidad extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="codigo")
    private Long periodicidadCodigo;

    @JsonProperty(value="descripcion")
    private String periodicidadDescripcion;

    @JsonProperty(value="esmensual")
    private Boolean periodicidadEsMensual;

    @JsonProperty(value="drvnumpagos")
    private Long periodicidaddrvNumPagos;

    private Collection <Dominio> dominios;

    private Collection <Solicitud> solicitudes;

    private Collection <AnexoMat> anexosMat;

    private Collection <AnexoNeo> anexosNeo;

    private Collection <ContratoC> contratosC;

    private Collection <AnexoC> anexosC;

    private Collection <SolicitudNovedad> solicitudesNovedad;

    private Collection <SolicitudNovedad> solicitudesNovedadNueva;

    /**
     * Gets the value of attribute Codigo
     */
    public Long getPeriodicidadCodigo() {
        return periodicidadCodigo;
    }
    
    /**
     * Sets the value of attribute Codigo
     */
    public void setPeriodicidadCodigo(Long periodicidadCodigo) {
        this.periodicidadCodigo = periodicidadCodigo;
    }

    /**
     * Gets the value of attribute Descripcion
     */
    public String getPeriodicidadDescripcion() {
        return periodicidadDescripcion;
    }
    
    /**
     * Sets the value of attribute Descripcion
     */
    public void setPeriodicidadDescripcion(String periodicidadDescripcion) {
        this.periodicidadDescripcion = periodicidadDescripcion;
    }

    /**
     * Gets the value of attribute EsMensual
     */
    public Boolean getPeriodicidadEsMensual() {
        return periodicidadEsMensual;
    }
    
    /**
     * Sets the value of attribute EsMensual
     */
    public void setPeriodicidadEsMensual(Boolean periodicidadEsMensual) {
        this.periodicidadEsMensual = periodicidadEsMensual;
    }

    /**
     * Gets the value of attribute drvNumPagos
     */
    public Long getPeriodicidaddrvNumPagos() {
        return periodicidaddrvNumPagos;
    }
    
    /**
     * Sets the value of attribute drvNumPagos
     */
    public void setPeriodicidaddrvNumPagos(Long periodicidaddrvNumPagos) {
        this.periodicidaddrvNumPagos = periodicidaddrvNumPagos;
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
     * Gets the value of relation through role AnexosMat
     */
    @JsonIgnore
    public Collection <AnexoMat> getAnexosMat() {
        return anexosMat;
    }

    /**
     * Gets the value of relation through role AnexosNeo
     */
    @JsonIgnore
    public Collection <AnexoNeo> getAnexosNeo() {
        return anexosNeo;
    }

    /**
     * Gets the value of relation through role ContratosC
     */
    @JsonIgnore
    public Collection <ContratoC> getContratosC() {
        return contratosC;
    }

    /**
     * Gets the value of relation through role AnexosC
     */
    @JsonIgnore
    public Collection <AnexoC> getAnexosC() {
        return anexosC;
    }

    /**
     * Gets the value of relation through role SolicitudesNovedad
     */
    @JsonIgnore
    public Collection <SolicitudNovedad> getSolicitudesNovedad() {
        return solicitudesNovedad;
    }

    /**
     * Gets the value of relation through role SolicitudesNovedadNueva
     */
    @JsonIgnore
    public Collection <SolicitudNovedad> getSolicitudesNovedadNueva() {
        return solicitudesNovedadNueva;
    }

    /**
     * Default constructor
     */
    public Periodicidad() {
        periodicidadCodigo = null;
    }

    /**
     * Constructor used to create instances of <code>Periodicidad</code>.
     * @param oid Object Identifier of the instance of <code>Periodicidad</code> to be created.
     * @throws SystemException
     */
    public Periodicidad(PeriodicidadOid oid) {
        if (oid != null && !oid.isNull()) {
            periodicidadCodigo = oid.getPeriodicidadCodigo();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return Periodicidad.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Periodicidad other = (Periodicidad)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getPeriodicidadCodigo(), other.getPeriodicidadCodigo());
        result &= Utilities.isEqual(this.getPeriodicidadDescripcion(), other.getPeriodicidadDescripcion());
        result &= Utilities.isEqual(this.getPeriodicidadEsMensual(), other.getPeriodicidadEsMensual());
        result &= Utilities.isEqual(this.getPeriodicidaddrvNumPagos(), other.getPeriodicidaddrvNumPagos());
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
     * Returns the <code>PeriodicidadOid</code> object that identifies this instance of <code>Periodicidad</code>.
     * @return <code>PeriodicidadOid</code> object that identifies this instance of <code>Periodicidad</code>
     */
	@Override
    public PeriodicidadOid getOid() {
        return new PeriodicidadOid(getPeriodicidadCodigo());
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
        if (!activeFacets.contains(Constants.PERIODICIDAD)) {
            activeFacets.add(Constants.PERIODICIDAD);
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
            relatedInstance = buildPeriodicidadRelatedInstance(relatedInstanceJsonOid);
        }
        if (PeriodicidadConstants.ROLE_NAME_DOMINIOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPeriodicidadRelatedInstance4Dominio(relatedInstanceJsonOid, remainingPath);
        }
        if (PeriodicidadConstants.ROLE_NAME_SOLICITUDES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPeriodicidadRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        if (PeriodicidadConstants.ROLE_NAME_ANEXOSMAT.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPeriodicidadRelatedInstance4AnexoMat(relatedInstanceJsonOid, remainingPath);
        }
        if (PeriodicidadConstants.ROLE_NAME_ANEXOSNEO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPeriodicidadRelatedInstance4AnexoNeo(relatedInstanceJsonOid, remainingPath);
        }
        if (PeriodicidadConstants.ROLE_NAME_CONTRATOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPeriodicidadRelatedInstance4ContratoC(relatedInstanceJsonOid, remainingPath);
        }
        if (PeriodicidadConstants.ROLE_NAME_ANEXOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPeriodicidadRelatedInstance4AnexoC(relatedInstanceJsonOid, remainingPath);
        }
        if (PeriodicidadConstants.ROLE_NAME_SOLICITUDESNOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem) || PeriodicidadConstants.ROLE_NAME_SOLICITUDESNOVEDADNUEVA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPeriodicidadRelatedInstance4SolicitudNovedad(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildPeriodicidadRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Periodicidad(mapper.readValue(relatedInstanceJsonOid, PeriodicidadOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Periodicidad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPeriodicidadRelatedInstance4Dominio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Dominio(mapper.readValue(relatedInstanceJsonOid, DominioOid.class)): Dominio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Periodicidad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPeriodicidadRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Periodicidad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPeriodicidadRelatedInstance4AnexoMat(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new AnexoMat(mapper.readValue(relatedInstanceJsonOid, AnexoMatOid.class)): AnexoMat.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Periodicidad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPeriodicidadRelatedInstance4AnexoNeo(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new AnexoNeo(mapper.readValue(relatedInstanceJsonOid, AnexoNeoOid.class)): AnexoNeo.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Periodicidad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPeriodicidadRelatedInstance4ContratoC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ContratoC(mapper.readValue(relatedInstanceJsonOid, ContratoCOid.class)): ContratoC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Periodicidad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPeriodicidadRelatedInstance4AnexoC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new AnexoC(mapper.readValue(relatedInstanceJsonOid, AnexoCOid.class)): AnexoC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Periodicidad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPeriodicidadRelatedInstance4SolicitudNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new SolicitudNovedad(mapper.readValue(relatedInstanceJsonOid, SolicitudNovedadOid.class)): SolicitudNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Periodicidad.class).error(e.getMessage());
            return null;
        }
    }
}
