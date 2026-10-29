package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.ParamReporteConstants;
import com.keralty.ae.persistence.oid.ParamReporteOid;
import com.keralty.ae.persistence.oid.ReportesProcAlmOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>ParamReporte</code> external model class.
 * <p>
 * External Model Class: <code>ParamReporte</code><br>
 */
public class ParamReporte extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id_paramreporte")
    private Long paramReporteidParamReporte;

    @JsonProperty(value="titulo")
    private String paramReporteTitulo;

    @JsonProperty(value="descripcion")
    private String paramReporteDescripcion;

    @JsonProperty(value="esnumerico")
    private Boolean paramReporteEsNumerico;

    @JsonProperty(value="orden")
    private Long paramReporteOrden;

    private ReportesProcAlm reporte;

    /**
     * Gets the value of attribute id_ParamReporte
     */
    public Long getParamReporteidParamReporte() {
        return paramReporteidParamReporte;
    }
    
    /**
     * Sets the value of attribute id_ParamReporte
     */
    public void setParamReporteidParamReporte(Long paramReporteidParamReporte) {
        this.paramReporteidParamReporte = paramReporteidParamReporte;
    }

    /**
     * Gets the value of attribute Titulo
     */
    public String getParamReporteTitulo() {
        return paramReporteTitulo;
    }
    
    /**
     * Sets the value of attribute Titulo
     */
    public void setParamReporteTitulo(String paramReporteTitulo) {
        this.paramReporteTitulo = paramReporteTitulo;
    }

    /**
     * Gets the value of attribute Descripcion
     */
    public String getParamReporteDescripcion() {
        return paramReporteDescripcion;
    }
    
    /**
     * Sets the value of attribute Descripcion
     */
    public void setParamReporteDescripcion(String paramReporteDescripcion) {
        this.paramReporteDescripcion = paramReporteDescripcion;
    }

    /**
     * Gets the value of attribute EsNumerico
     */
    public Boolean getParamReporteEsNumerico() {
        return paramReporteEsNumerico;
    }
    
    /**
     * Sets the value of attribute EsNumerico
     */
    public void setParamReporteEsNumerico(Boolean paramReporteEsNumerico) {
        this.paramReporteEsNumerico = paramReporteEsNumerico;
    }

    /**
     * Gets the value of attribute Orden
     */
    public Long getParamReporteOrden() {
        return paramReporteOrden;
    }
    
    /**
     * Sets the value of attribute Orden
     */
    public void setParamReporteOrden(Long paramReporteOrden) {
        this.paramReporteOrden = paramReporteOrden;
    }

    /**
     * Gets the value of relation through role Reporte
     */
    @JsonIgnore
    public ReportesProcAlm getReporte() {
        return reporte;
    }

    /**
     * Default constructor
     */
    public ParamReporte() {
        paramReporteidParamReporte = null;
    }

    /**
     * Constructor used to create instances of <code>ParamReporte</code>.
     * @param oid Object Identifier of the instance of <code>ParamReporte</code> to be created.
     * @throws SystemException
     */
    public ParamReporte(ParamReporteOid oid) {
        if (oid != null && !oid.isNull()) {
            paramReporteidParamReporte = oid.getParamReporteidParamReporte();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return ParamReporte.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        ParamReporte other = (ParamReporte)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getParamReporteidParamReporte(), other.getParamReporteidParamReporte());
        result &= Utilities.isEqual(this.getParamReporteTitulo(), other.getParamReporteTitulo());
        result &= Utilities.isEqual(this.getParamReporteDescripcion(), other.getParamReporteDescripcion());
        result &= Utilities.isEqual(this.getParamReporteEsNumerico(), other.getParamReporteEsNumerico());
        result &= Utilities.isEqual(this.getParamReporteOrden(), other.getParamReporteOrden());
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
     * Returns the <code>ParamReporteOid</code> object that identifies this instance of <code>ParamReporte</code>.
     * @return <code>ParamReporteOid</code> object that identifies this instance of <code>ParamReporte</code>
     */
	@Override
    public ParamReporteOid getOid() {
        return new ParamReporteOid(getParamReporteidParamReporte());
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
        if (!activeFacets.contains(Constants.PARAMREPORTE)) {
            activeFacets.add(Constants.PARAMREPORTE);
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
            relatedInstance = buildParamReporteRelatedInstance(relatedInstanceJsonOid);
        }
        if (ParamReporteConstants.ROLE_NAME_REPORTE.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildParamReporteRelatedInstance4ReportesProcAlm(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildParamReporteRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new ParamReporte(mapper.readValue(relatedInstanceJsonOid, ParamReporteOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ParamReporte.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildParamReporteRelatedInstance4ReportesProcAlm(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ReportesProcAlm(mapper.readValue(relatedInstanceJsonOid, ReportesProcAlmOid.class)): ReportesProcAlm.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ParamReporte.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
