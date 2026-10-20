package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.PlantillaReporteConstants;
import com.keralty.ae.persistence.oid.PlantillaReporteOid;
import com.keralty.ae.persistence.oid.ReportesDominioOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>PlantillaReporte</code> external model class.
 * <p>
 * External Model Class: <code>PlantillaReporte</code><br>
 */
public class PlantillaReporte extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id_plantillareporte")
    private Long plantillaReporteidPlantillaReporte;

    @JsonProperty(value="tipo")
    private Long plantillaReporteTipo;

    @JsonProperty(value="titulo")
    private String plantillaReporteTitulo;

    @JsonProperty(value="fechavigencia")
    private Date plantillaReporteFechaVigencia;

    @JsonProperty(value="rutaarchivos")
    private String plantillaReporteRutaArchivos;

    @JsonProperty(value="nombrearchivopdf")
    private String plantillaReporteNombreArchivoPDF;

    private Collection <ReportesDominio> reportesDominio;

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
     * Gets the value of attribute Tipo
     */
    public Long getPlantillaReporteTipo() {
        return plantillaReporteTipo;
    }
    
    /**
     * Sets the value of attribute Tipo
     */
    public void setPlantillaReporteTipo(Long plantillaReporteTipo) {
        this.plantillaReporteTipo = plantillaReporteTipo;
    }

    /**
     * Gets the value of attribute Titulo
     */
    public String getPlantillaReporteTitulo() {
        return plantillaReporteTitulo;
    }
    
    /**
     * Sets the value of attribute Titulo
     */
    public void setPlantillaReporteTitulo(String plantillaReporteTitulo) {
        this.plantillaReporteTitulo = plantillaReporteTitulo;
    }

    /**
     * Gets the value of attribute FechaVigencia
     */
    public Date getPlantillaReporteFechaVigencia() {
        return plantillaReporteFechaVigencia;
    }
    
    /**
     * Sets the value of attribute FechaVigencia
     */
    public void setPlantillaReporteFechaVigencia(Date plantillaReporteFechaVigencia) {
        this.plantillaReporteFechaVigencia = plantillaReporteFechaVigencia;
    }

    /**
     * Gets the value of attribute RutaArchivos
     */
    public String getPlantillaReporteRutaArchivos() {
        return plantillaReporteRutaArchivos;
    }
    
    /**
     * Sets the value of attribute RutaArchivos
     */
    public void setPlantillaReporteRutaArchivos(String plantillaReporteRutaArchivos) {
        this.plantillaReporteRutaArchivos = plantillaReporteRutaArchivos;
    }

    /**
     * Gets the value of attribute NombreArchivoPDF
     */
    public String getPlantillaReporteNombreArchivoPDF() {
        return plantillaReporteNombreArchivoPDF;
    }
    
    /**
     * Sets the value of attribute NombreArchivoPDF
     */
    public void setPlantillaReporteNombreArchivoPDF(String plantillaReporteNombreArchivoPDF) {
        this.plantillaReporteNombreArchivoPDF = plantillaReporteNombreArchivoPDF;
    }

    /**
     * Gets the value of relation through role ReportesDominio
     */
    @JsonIgnore
    public Collection <ReportesDominio> getReportesDominio() {
        return reportesDominio;
    }

    /**
     * Default constructor
     */
    public PlantillaReporte() {
        plantillaReporteidPlantillaReporte = null;
    }

    /**
     * Constructor used to create instances of <code>PlantillaReporte</code>.
     * @param oid Object Identifier of the instance of <code>PlantillaReporte</code> to be created.
     * @throws SystemException
     */
    public PlantillaReporte(PlantillaReporteOid oid) {
        if (oid != null && !oid.isNull()) {
            plantillaReporteidPlantillaReporte = oid.getPlantillaReporteidPlantillaReporte();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return PlantillaReporte.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        PlantillaReporte other = (PlantillaReporte)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getPlantillaReporteidPlantillaReporte(), other.getPlantillaReporteidPlantillaReporte());
        result &= Utilities.isEqual(this.getPlantillaReporteTipo(), other.getPlantillaReporteTipo());
        result &= Utilities.isEqual(this.getPlantillaReporteTitulo(), other.getPlantillaReporteTitulo());
        result &= Utilities.isEqual(this.getPlantillaReporteFechaVigencia(), other.getPlantillaReporteFechaVigencia());
        result &= Utilities.isEqual(this.getPlantillaReporteRutaArchivos(), other.getPlantillaReporteRutaArchivos());
        result &= Utilities.isEqual(this.getPlantillaReporteNombreArchivoPDF(), other.getPlantillaReporteNombreArchivoPDF());
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
     * Returns the <code>PlantillaReporteOid</code> object that identifies this instance of <code>PlantillaReporte</code>.
     * @return <code>PlantillaReporteOid</code> object that identifies this instance of <code>PlantillaReporte</code>
     */
	@Override
    public PlantillaReporteOid getOid() {
        return new PlantillaReporteOid(getPlantillaReporteidPlantillaReporte());
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
        if (!activeFacets.contains(Constants.PLANTILLAREPORTE)) {
            activeFacets.add(Constants.PLANTILLAREPORTE);
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
            relatedInstance = buildPlantillaReporteRelatedInstance(relatedInstanceJsonOid);
        }
        if (PlantillaReporteConstants.ROLE_NAME_REPORTESDOMINIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPlantillaReporteRelatedInstance4ReportesDominio(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildPlantillaReporteRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new PlantillaReporte(mapper.readValue(relatedInstanceJsonOid, PlantillaReporteOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PlantillaReporte.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPlantillaReporteRelatedInstance4ReportesDominio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ReportesDominio(mapper.readValue(relatedInstanceJsonOid, ReportesDominioOid.class)): ReportesDominio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PlantillaReporte.class).error(e.getMessage());
            return null;
        }
    }
}
