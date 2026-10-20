package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.ReportesProcAlmConstants;
import com.keralty.ae.persistence.oid.FuncionarioOid;
import com.keralty.ae.persistence.oid.ParamReporteOid;
import com.keralty.ae.persistence.oid.ReportesProcAlmOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>ReportesProcAlm</code> external model class.
 * <p>
 * External Model Class: <code>ReportesProcAlm</code><br>
 */
public class ReportesProcAlm extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id_reporte")
    private Long reportesProcAlmidReporte;

    @JsonProperty(value="descripcion")
    private String reportesProcAlmDescripcion;

    @JsonProperty(value="nombreproc")
    private String reportesProcAlmNombreProc;

    @JsonProperty(value="nombrefichero")
    private String reportesProcAlmNombreFichero;

    private Collection <ParamReporte> parametros;

    private Collection <Funcionario> funcionarios;

    /**
     * Gets the value of attribute id_Reporte
     */
    public Long getReportesProcAlmidReporte() {
        return reportesProcAlmidReporte;
    }
    
    /**
     * Sets the value of attribute id_Reporte
     */
    public void setReportesProcAlmidReporte(Long reportesProcAlmidReporte) {
        this.reportesProcAlmidReporte = reportesProcAlmidReporte;
    }

    /**
     * Gets the value of attribute Descripcion
     */
    public String getReportesProcAlmDescripcion() {
        return reportesProcAlmDescripcion;
    }
    
    /**
     * Sets the value of attribute Descripcion
     */
    public void setReportesProcAlmDescripcion(String reportesProcAlmDescripcion) {
        this.reportesProcAlmDescripcion = reportesProcAlmDescripcion;
    }

    /**
     * Gets the value of attribute NombreProc
     */
    public String getReportesProcAlmNombreProc() {
        return reportesProcAlmNombreProc;
    }
    
    /**
     * Sets the value of attribute NombreProc
     */
    public void setReportesProcAlmNombreProc(String reportesProcAlmNombreProc) {
        this.reportesProcAlmNombreProc = reportesProcAlmNombreProc;
    }

    /**
     * Gets the value of attribute NombreFichero
     */
    public String getReportesProcAlmNombreFichero() {
        return reportesProcAlmNombreFichero;
    }
    
    /**
     * Sets the value of attribute NombreFichero
     */
    public void setReportesProcAlmNombreFichero(String reportesProcAlmNombreFichero) {
        this.reportesProcAlmNombreFichero = reportesProcAlmNombreFichero;
    }

    /**
     * Gets the value of relation through role Parametros
     */
    @JsonIgnore
    public Collection <ParamReporte> getParametros() {
        return parametros;
    }

    /**
     * Gets the value of relation through role Funcionarios
     */
    @JsonIgnore
    public Collection <Funcionario> getFuncionarios() {
        return funcionarios;
    }

    /**
     * Default constructor
     */
    public ReportesProcAlm() {
        reportesProcAlmidReporte = null;
    }

    /**
     * Constructor used to create instances of <code>ReportesProcAlm</code>.
     * @param oid Object Identifier of the instance of <code>ReportesProcAlm</code> to be created.
     * @throws SystemException
     */
    public ReportesProcAlm(ReportesProcAlmOid oid) {
        if (oid != null && !oid.isNull()) {
            reportesProcAlmidReporte = oid.getReportesProcAlmidReporte();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return ReportesProcAlm.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        ReportesProcAlm other = (ReportesProcAlm)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getReportesProcAlmidReporte(), other.getReportesProcAlmidReporte());
        result &= Utilities.isEqual(this.getReportesProcAlmDescripcion(), other.getReportesProcAlmDescripcion());
        result &= Utilities.isEqual(this.getReportesProcAlmNombreProc(), other.getReportesProcAlmNombreProc());
        result &= Utilities.isEqual(this.getReportesProcAlmNombreFichero(), other.getReportesProcAlmNombreFichero());
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
     * Returns the <code>ReportesProcAlmOid</code> object that identifies this instance of <code>ReportesProcAlm</code>.
     * @return <code>ReportesProcAlmOid</code> object that identifies this instance of <code>ReportesProcAlm</code>
     */
	@Override
    public ReportesProcAlmOid getOid() {
        return new ReportesProcAlmOid(getReportesProcAlmidReporte());
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
        if (!activeFacets.contains(Constants.REPORTESPROCALM)) {
            activeFacets.add(Constants.REPORTESPROCALM);
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
            relatedInstance = buildReportesProcAlmRelatedInstance(relatedInstanceJsonOid);
        }
        if (ReportesProcAlmConstants.ROLE_NAME_PARAMETROS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildReportesProcAlmRelatedInstance4ParamReporte(relatedInstanceJsonOid, remainingPath);
        }
        if (ReportesProcAlmConstants.ROLE_NAME_FUNCIONARIOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildReportesProcAlmRelatedInstance4Funcionario(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildReportesProcAlmRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new ReportesProcAlm(mapper.readValue(relatedInstanceJsonOid, ReportesProcAlmOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ReportesProcAlm.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildReportesProcAlmRelatedInstance4ParamReporte(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ParamReporte(mapper.readValue(relatedInstanceJsonOid, ParamReporteOid.class)): ParamReporte.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ReportesProcAlm.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildReportesProcAlmRelatedInstance4Funcionario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Funcionario(mapper.readValue(relatedInstanceJsonOid, FuncionarioOid.class)): Funcionario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ReportesProcAlm.class).error(e.getMessage());
            return null;
        }
    }
}
