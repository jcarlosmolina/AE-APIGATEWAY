package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.ReportesDominioConstants;
import com.keralty.ae.persistence.oid.DominioOid;
import com.keralty.ae.persistence.oid.PlantillaReporteOid;
import com.keralty.ae.persistence.oid.ReportesDominioOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>ReportesDominio</code> external model class.
 * <p>
 * External Model Class: <code>ReportesDominio</code><br>
 */
public class ReportesDominio extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="numero")
    private Long dominioNumero;

    @JsonProperty(value="id_plantillareporte")
    private Long plantillaReporteidPlantillaReporte;

    @JsonProperty(value="enviarauto")
    private Boolean reportesDominioEnviarAuto;

    @JsonProperty(value="drvfechahasta")
    private Date reportesDominiodrvFechaHasta;

    @JsonProperty(value="drvruta")
    private String reportesDominiodrvRuta;

    private Dominio dominio;

    private PlantillaReporte plantillaReporte;

    /**
     * Gets the value of attribute Numero
     */
    public Long getDominioNumero() {
        return dominioNumero;
    }
    
    /**
     * Sets the value of attribute Numero
     */
    public void setDominioNumero(Long dominioNumero) {
        this.dominioNumero = dominioNumero;
    }

    /**
     * Gets the value of attribute id_PlantillaReporte
     */
    public Long getPlantillaReporteidPlantillaReporte() {
        return plantillaReporteidPlantillaReporte;
    }
    
    /**
     * Sets the value of attribute id_PlantillaReporte
     */
    public void setPlantillaReporteidPlantillaReporte(Long plantillaReporteidPlantillaReporte) {
        this.plantillaReporteidPlantillaReporte = plantillaReporteidPlantillaReporte;
    }

    /**
     * Gets the value of attribute EnviarAuto
     */
    public Boolean getReportesDominioEnviarAuto() {
        return reportesDominioEnviarAuto;
    }
    
    /**
     * Sets the value of attribute EnviarAuto
     */
    public void setReportesDominioEnviarAuto(Boolean reportesDominioEnviarAuto) {
        this.reportesDominioEnviarAuto = reportesDominioEnviarAuto;
    }

    /**
     * Gets the value of attribute drvFechaHasta
     */
    public Date getReportesDominiodrvFechaHasta() {
        return reportesDominiodrvFechaHasta;
    }
    
    /**
     * Sets the value of attribute drvFechaHasta
     */
    public void setReportesDominiodrvFechaHasta(Date reportesDominiodrvFechaHasta) {
        this.reportesDominiodrvFechaHasta = reportesDominiodrvFechaHasta;
    }

    /**
     * Gets the value of attribute drvRuta
     */
    public String getReportesDominiodrvRuta() {
        return reportesDominiodrvRuta;
    }
    
    /**
     * Sets the value of attribute drvRuta
     */
    public void setReportesDominiodrvRuta(String reportesDominiodrvRuta) {
        this.reportesDominiodrvRuta = reportesDominiodrvRuta;
    }

    /**
     * Gets the value of relation through role Dominio
     */
    @JsonIgnore
    public Dominio getDominio() {
        return dominio;
    }

    /**
     * Gets the value of relation through role PlantillaReporte
     */
    @JsonIgnore
    public PlantillaReporte getPlantillaReporte() {
        return plantillaReporte;
    }

    /**
     * Default constructor
     */
    public ReportesDominio() {
        dominioNumero = null;
        plantillaReporteidPlantillaReporte = null;
    }

    /**
     * Constructor used to create instances of <code>ReportesDominio</code>.
     * @param oid Object Identifier of the instance of <code>ReportesDominio</code> to be created.
     * @throws SystemException
     */
    public ReportesDominio(ReportesDominioOid oid) {
        if (oid != null && !oid.isNull()) {
            dominioNumero = oid.getDominioNumero();
            plantillaReporteidPlantillaReporte = oid.getPlantillaReporteidPlantillaReporte();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return ReportesDominio.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        ReportesDominio other = (ReportesDominio)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getReportesDominioEnviarAuto(), other.getReportesDominioEnviarAuto());
        result &= Utilities.isEqual(this.getReportesDominiodrvFechaHasta(), other.getReportesDominiodrvFechaHasta());
        result &= Utilities.isEqual(this.getReportesDominiodrvRuta(), other.getReportesDominiodrvRuta());
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
     * Returns the <code>ReportesDominioOid</code> object that identifies this instance of <code>ReportesDominio</code>.
     * @return <code>ReportesDominioOid</code> object that identifies this instance of <code>ReportesDominio</code>
     */
	@Override
    public ReportesDominioOid getOid() {
        return new ReportesDominioOid(getDominioNumero(), getPlantillaReporteidPlantillaReporte());
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
        if (!activeFacets.contains(Constants.REPORTESDOMINIO)) {
            activeFacets.add(Constants.REPORTESDOMINIO);
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
            relatedInstance = buildReportesDominioRelatedInstance(relatedInstanceJsonOid);
        }
        if (ReportesDominioConstants.ROLE_NAME_DOMINIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildReportesDominioRelatedInstance4Dominio(relatedInstanceJsonOid, remainingPath);
        }
        if (ReportesDominioConstants.ROLE_NAME_PLANTILLAREPORTE.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildReportesDominioRelatedInstance4PlantillaReporte(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildReportesDominioRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new ReportesDominio(mapper.readValue(relatedInstanceJsonOid, ReportesDominioOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ReportesDominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildReportesDominioRelatedInstance4Dominio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Dominio(mapper.readValue(relatedInstanceJsonOid, DominioOid.class)): Dominio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ReportesDominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildReportesDominioRelatedInstance4PlantillaReporte(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PlantillaReporte(mapper.readValue(relatedInstanceJsonOid, PlantillaReporteOid.class)): PlantillaReporte.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ReportesDominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
