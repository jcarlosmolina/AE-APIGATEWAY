package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.LogHistoricoPlanesConstants;
import com.keralty.ae.persistence.oid.AsesorOid;
import com.keralty.ae.persistence.oid.LogHistoricoPlanesOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>LogHistoricoPlanes</code> external model class.
 * <p>
 * External Model Class: <code>LogHistoricoPlanes</code><br>
 */
public class LogHistoricoPlanes extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id_loghistoricoplanes")
    private Long logHistoricoPlanesidLogHistoricoPlanes;

    @JsonProperty(value="fechahora")
    private Timestamp logHistoricoPlanesFechaHora;

    @JsonProperty(value="loginfuncionario")
    private String logHistoricoPlanesLoginFuncionario;

    @JsonProperty(value="producto")
    private String logHistoricoPlanesProducto;

    @JsonProperty(value="plan")
    private String logHistoricoPlanesPlan;

    @JsonProperty(value="accion")
    private String logHistoricoPlanesAccion;

    private Asesor asesor;

    /**
     * Gets the value of attribute id_LogHistoricoPlanes
     */
    public Long getLogHistoricoPlanesidLogHistoricoPlanes() {
        return logHistoricoPlanesidLogHistoricoPlanes;
    }
    
    /**
     * Sets the value of attribute id_LogHistoricoPlanes
     */
    public void setLogHistoricoPlanesidLogHistoricoPlanes(Long logHistoricoPlanesidLogHistoricoPlanes) {
        this.logHistoricoPlanesidLogHistoricoPlanes = logHistoricoPlanesidLogHistoricoPlanes;
    }

    /**
     * Gets the value of attribute FechaHora
     */
    public Timestamp getLogHistoricoPlanesFechaHora() {
        return logHistoricoPlanesFechaHora;
    }
    
    /**
     * Sets the value of attribute FechaHora
     */
    public void setLogHistoricoPlanesFechaHora(Timestamp logHistoricoPlanesFechaHora) {
        this.logHistoricoPlanesFechaHora = logHistoricoPlanesFechaHora;
    }

    /**
     * Gets the value of attribute LoginFuncionario
     */
    public String getLogHistoricoPlanesLoginFuncionario() {
        return logHistoricoPlanesLoginFuncionario;
    }
    
    /**
     * Sets the value of attribute LoginFuncionario
     */
    public void setLogHistoricoPlanesLoginFuncionario(String logHistoricoPlanesLoginFuncionario) {
        this.logHistoricoPlanesLoginFuncionario = logHistoricoPlanesLoginFuncionario;
    }

    /**
     * Gets the value of attribute Producto
     */
    public String getLogHistoricoPlanesProducto() {
        return logHistoricoPlanesProducto;
    }
    
    /**
     * Sets the value of attribute Producto
     */
    public void setLogHistoricoPlanesProducto(String logHistoricoPlanesProducto) {
        this.logHistoricoPlanesProducto = logHistoricoPlanesProducto;
    }

    /**
     * Gets the value of attribute Plan
     */
    public String getLogHistoricoPlanesPlan() {
        return logHistoricoPlanesPlan;
    }
    
    /**
     * Sets the value of attribute Plan
     */
    public void setLogHistoricoPlanesPlan(String logHistoricoPlanesPlan) {
        this.logHistoricoPlanesPlan = logHistoricoPlanesPlan;
    }

    /**
     * Gets the value of attribute Accion
     */
    public String getLogHistoricoPlanesAccion() {
        return logHistoricoPlanesAccion;
    }
    
    /**
     * Sets the value of attribute Accion
     */
    public void setLogHistoricoPlanesAccion(String logHistoricoPlanesAccion) {
        this.logHistoricoPlanesAccion = logHistoricoPlanesAccion;
    }

    /**
     * Gets the value of relation through role Asesor
     */
    @JsonIgnore
    public Asesor getAsesor() {
        return asesor;
    }

    /**
     * Default constructor
     */
    public LogHistoricoPlanes() {
        logHistoricoPlanesidLogHistoricoPlanes = null;
    }

    /**
     * Constructor used to create instances of <code>LogHistoricoPlanes</code>.
     * @param oid Object Identifier of the instance of <code>LogHistoricoPlanes</code> to be created.
     * @throws SystemException
     */
    public LogHistoricoPlanes(LogHistoricoPlanesOid oid) {
        if (oid != null && !oid.isNull()) {
            logHistoricoPlanesidLogHistoricoPlanes = oid.getLogHistoricoPlanesidLogHistoricoPlanes();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return LogHistoricoPlanes.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        LogHistoricoPlanes other = (LogHistoricoPlanes)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getLogHistoricoPlanesidLogHistoricoPlanes(), other.getLogHistoricoPlanesidLogHistoricoPlanes());
        result &= Utilities.isEqual(this.getLogHistoricoPlanesFechaHora(), other.getLogHistoricoPlanesFechaHora());
        result &= Utilities.isEqual(this.getLogHistoricoPlanesLoginFuncionario(), other.getLogHistoricoPlanesLoginFuncionario());
        result &= Utilities.isEqual(this.getLogHistoricoPlanesProducto(), other.getLogHistoricoPlanesProducto());
        result &= Utilities.isEqual(this.getLogHistoricoPlanesPlan(), other.getLogHistoricoPlanesPlan());
        result &= Utilities.isEqual(this.getLogHistoricoPlanesAccion(), other.getLogHistoricoPlanesAccion());
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
     * Returns the <code>LogHistoricoPlanesOid</code> object that identifies this instance of <code>LogHistoricoPlanes</code>.
     * @return <code>LogHistoricoPlanesOid</code> object that identifies this instance of <code>LogHistoricoPlanes</code>
     */
	@Override
    public LogHistoricoPlanesOid getOid() {
        return new LogHistoricoPlanesOid(getLogHistoricoPlanesidLogHistoricoPlanes());
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
        if (!activeFacets.contains(Constants.LOGHISTORICOPLANES)) {
            activeFacets.add(Constants.LOGHISTORICOPLANES);
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
            relatedInstance = buildLogHistoricoPlanesRelatedInstance(relatedInstanceJsonOid);
        }
        if (LogHistoricoPlanesConstants.ROLE_NAME_ASESOR.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildLogHistoricoPlanesRelatedInstance4Asesor(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildLogHistoricoPlanesRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new LogHistoricoPlanes(mapper.readValue(relatedInstanceJsonOid, LogHistoricoPlanesOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogHistoricoPlanes.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildLogHistoricoPlanesRelatedInstance4Asesor(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Asesor(mapper.readValue(relatedInstanceJsonOid, AsesorOid.class)): Asesor.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogHistoricoPlanes.class).error(e.getMessage());
            return null;
        }
    }
}
