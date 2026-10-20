package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.LogEstadoConstants;
import com.keralty.ae.persistence.oid.LogEstadoOid;
import com.keralty.ae.persistence.oid.SolicitudOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>LogEstado</code> external model class.
 * <p>
 * External Model Class: <code>LogEstado</code><br>
 */
public class LogEstado extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id")
    private Long logEstadoId;

    @JsonProperty(value="fecha")
    private Timestamp logEstadoFecha;

    @JsonProperty(value="loginfuncionario")
    private String logEstadoLoginFuncionario;

    @JsonProperty(value="observacion")
    private String logEstadoObservacion;

    @JsonProperty(value="motdevolucion")
    private String logEstadoMotDevolucion;

    @JsonProperty(value="estado")
    private Long logEstadoEstado;

    @JsonProperty(value="estadodoc")
    private Long logEstadoEstadoDoc;

    private Solicitud solicitud;

    /**
     * Gets the value of attribute Id
     */
    public Long getLogEstadoId() {
        return logEstadoId;
    }
    
    /**
     * Sets the value of attribute Id
     */
    public void setLogEstadoId(Long logEstadoId) {
        this.logEstadoId = logEstadoId;
    }

    /**
     * Gets the value of attribute Fecha
     */
    public Timestamp getLogEstadoFecha() {
        return logEstadoFecha;
    }
    
    /**
     * Sets the value of attribute Fecha
     */
    public void setLogEstadoFecha(Timestamp logEstadoFecha) {
        this.logEstadoFecha = logEstadoFecha;
    }

    /**
     * Gets the value of attribute LoginFuncionario
     */
    public String getLogEstadoLoginFuncionario() {
        return logEstadoLoginFuncionario;
    }
    
    /**
     * Sets the value of attribute LoginFuncionario
     */
    public void setLogEstadoLoginFuncionario(String logEstadoLoginFuncionario) {
        this.logEstadoLoginFuncionario = logEstadoLoginFuncionario;
    }

    /**
     * Gets the value of attribute Observacion
     */
    public String getLogEstadoObservacion() {
        return logEstadoObservacion;
    }
    
    /**
     * Sets the value of attribute Observacion
     */
    public void setLogEstadoObservacion(String logEstadoObservacion) {
        this.logEstadoObservacion = logEstadoObservacion;
    }

    /**
     * Gets the value of attribute MotDevolucion
     */
    public String getLogEstadoMotDevolucion() {
        return logEstadoMotDevolucion;
    }
    
    /**
     * Sets the value of attribute MotDevolucion
     */
    public void setLogEstadoMotDevolucion(String logEstadoMotDevolucion) {
        this.logEstadoMotDevolucion = logEstadoMotDevolucion;
    }

    /**
     * Gets the value of attribute Estado
     */
    public Long getLogEstadoEstado() {
        return logEstadoEstado;
    }
    
    /**
     * Sets the value of attribute Estado
     */
    public void setLogEstadoEstado(Long logEstadoEstado) {
        this.logEstadoEstado = logEstadoEstado;
    }

    /**
     * Gets the value of attribute EstadoDoc
     */
    public Long getLogEstadoEstadoDoc() {
        return logEstadoEstadoDoc;
    }
    
    /**
     * Sets the value of attribute EstadoDoc
     */
    public void setLogEstadoEstadoDoc(Long logEstadoEstadoDoc) {
        this.logEstadoEstadoDoc = logEstadoEstadoDoc;
    }

    /**
     * Gets the value of relation through role Solicitud
     */
    @JsonIgnore
    public Solicitud getSolicitud() {
        return solicitud;
    }

    /**
     * Default constructor
     */
    public LogEstado() {
        logEstadoId = null;
    }

    /**
     * Constructor used to create instances of <code>LogEstado</code>.
     * @param oid Object Identifier of the instance of <code>LogEstado</code> to be created.
     * @throws SystemException
     */
    public LogEstado(LogEstadoOid oid) {
        if (oid != null && !oid.isNull()) {
            logEstadoId = oid.getLogEstadoId();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return LogEstado.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        LogEstado other = (LogEstado)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getLogEstadoId(), other.getLogEstadoId());
        result &= Utilities.isEqual(this.getLogEstadoFecha(), other.getLogEstadoFecha());
        result &= Utilities.isEqual(this.getLogEstadoLoginFuncionario(), other.getLogEstadoLoginFuncionario());
        result &= Utilities.isEqual(this.getLogEstadoObservacion(), other.getLogEstadoObservacion());
        result &= Utilities.isEqual(this.getLogEstadoMotDevolucion(), other.getLogEstadoMotDevolucion());
        result &= Utilities.isEqual(this.getLogEstadoEstado(), other.getLogEstadoEstado());
        result &= Utilities.isEqual(this.getLogEstadoEstadoDoc(), other.getLogEstadoEstadoDoc());
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
     * Returns the <code>LogEstadoOid</code> object that identifies this instance of <code>LogEstado</code>.
     * @return <code>LogEstadoOid</code> object that identifies this instance of <code>LogEstado</code>
     */
	@Override
    public LogEstadoOid getOid() {
        return new LogEstadoOid(getLogEstadoId());
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
        if (!activeFacets.contains(Constants.LOGESTADO)) {
            activeFacets.add(Constants.LOGESTADO);
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
            relatedInstance = buildLogEstadoRelatedInstance(relatedInstanceJsonOid);
        }
        if (LogEstadoConstants.ROLE_NAME_SOLICITUD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildLogEstadoRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildLogEstadoRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new LogEstado(mapper.readValue(relatedInstanceJsonOid, LogEstadoOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogEstado.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildLogEstadoRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogEstado.class).error(e.getMessage());
            return null;
        }
    }
}
