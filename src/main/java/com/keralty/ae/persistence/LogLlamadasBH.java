package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.persistence.oid.LogLlamadasBHOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>LogLlamadasBH</code> external model class.
 * <p>
 * External Model Class: <code>LogLlamadasBH</code><br>
 */
public class LogLlamadasBH extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id")
    private Long logLlamadasBHID;

    @JsonProperty(value="tiposervicio")
    private String logLlamadasBHTipoServicio;

    @JsonProperty(value="solicitud")
    private String logLlamadasBHSolicitud;

    @JsonProperty(value="servicio")
    private String logLlamadasBHServicio;

    @JsonProperty(value="capacidad")
    private String logLlamadasBHCapacidad;

    @JsonProperty(value="fechahora")
    private Timestamp logLlamadasBHFechaHora;

    @JsonProperty(value="textoerror")
    private String logLlamadasBHTextoError;

    @JsonProperty(value="tiempoejecucion")
    private Double logLlamadasBHTiempoEjecucion;

    @JsonProperty(value="peticion")
    private String logLlamadasBHPeticion;

    @JsonProperty(value="respuesta")
    private String logLlamadasBHRespuesta;

    @JsonProperty(value="usuario")
    private String logLlamadasBHUsuario;

    /**
     * Gets the value of attribute ID
     */
    public Long getLogLlamadasBHID() {
        return logLlamadasBHID;
    }
    
    /**
     * Sets the value of attribute ID
     */
    public void setLogLlamadasBHID(Long logLlamadasBHID) {
        this.logLlamadasBHID = logLlamadasBHID;
    }

    /**
     * Gets the value of attribute TipoServicio
     */
    public String getLogLlamadasBHTipoServicio() {
        return logLlamadasBHTipoServicio;
    }
    
    /**
     * Sets the value of attribute TipoServicio
     */
    public void setLogLlamadasBHTipoServicio(String logLlamadasBHTipoServicio) {
        this.logLlamadasBHTipoServicio = logLlamadasBHTipoServicio;
    }

    /**
     * Gets the value of attribute Solicitud
     */
    public String getLogLlamadasBHSolicitud() {
        return logLlamadasBHSolicitud;
    }
    
    /**
     * Sets the value of attribute Solicitud
     */
    public void setLogLlamadasBHSolicitud(String logLlamadasBHSolicitud) {
        this.logLlamadasBHSolicitud = logLlamadasBHSolicitud;
    }

    /**
     * Gets the value of attribute Servicio
     */
    public String getLogLlamadasBHServicio() {
        return logLlamadasBHServicio;
    }
    
    /**
     * Sets the value of attribute Servicio
     */
    public void setLogLlamadasBHServicio(String logLlamadasBHServicio) {
        this.logLlamadasBHServicio = logLlamadasBHServicio;
    }

    /**
     * Gets the value of attribute Capacidad
     */
    public String getLogLlamadasBHCapacidad() {
        return logLlamadasBHCapacidad;
    }
    
    /**
     * Sets the value of attribute Capacidad
     */
    public void setLogLlamadasBHCapacidad(String logLlamadasBHCapacidad) {
        this.logLlamadasBHCapacidad = logLlamadasBHCapacidad;
    }

    /**
     * Gets the value of attribute FechaHora
     */
    public Timestamp getLogLlamadasBHFechaHora() {
        return logLlamadasBHFechaHora;
    }
    
    /**
     * Sets the value of attribute FechaHora
     */
    public void setLogLlamadasBHFechaHora(Timestamp logLlamadasBHFechaHora) {
        this.logLlamadasBHFechaHora = logLlamadasBHFechaHora;
    }

    /**
     * Gets the value of attribute TextoError
     */
    public String getLogLlamadasBHTextoError() {
        return logLlamadasBHTextoError;
    }
    
    /**
     * Sets the value of attribute TextoError
     */
    public void setLogLlamadasBHTextoError(String logLlamadasBHTextoError) {
        this.logLlamadasBHTextoError = logLlamadasBHTextoError;
    }

    /**
     * Gets the value of attribute TiempoEjecucion
     */
    public Double getLogLlamadasBHTiempoEjecucion() {
        return logLlamadasBHTiempoEjecucion;
    }
    
    /**
     * Sets the value of attribute TiempoEjecucion
     */
    public void setLogLlamadasBHTiempoEjecucion(Double logLlamadasBHTiempoEjecucion) {
        this.logLlamadasBHTiempoEjecucion = logLlamadasBHTiempoEjecucion;
    }

    /**
     * Gets the value of attribute Peticion
     */
    public String getLogLlamadasBHPeticion() {
        return logLlamadasBHPeticion;
    }
    
    /**
     * Sets the value of attribute Peticion
     */
    public void setLogLlamadasBHPeticion(String logLlamadasBHPeticion) {
        this.logLlamadasBHPeticion = logLlamadasBHPeticion;
    }

    /**
     * Gets the value of attribute Respuesta
     */
    public String getLogLlamadasBHRespuesta() {
        return logLlamadasBHRespuesta;
    }
    
    /**
     * Sets the value of attribute Respuesta
     */
    public void setLogLlamadasBHRespuesta(String logLlamadasBHRespuesta) {
        this.logLlamadasBHRespuesta = logLlamadasBHRespuesta;
    }

    /**
     * Gets the value of attribute Usuario
     */
    public String getLogLlamadasBHUsuario() {
        return logLlamadasBHUsuario;
    }
    
    /**
     * Sets the value of attribute Usuario
     */
    public void setLogLlamadasBHUsuario(String logLlamadasBHUsuario) {
        this.logLlamadasBHUsuario = logLlamadasBHUsuario;
    }

    /**
     * Default constructor
     */
    public LogLlamadasBH() {
        logLlamadasBHID = null;
    }

    /**
     * Constructor used to create instances of <code>LogLlamadasBH</code>.
     * @param oid Object Identifier of the instance of <code>LogLlamadasBH</code> to be created.
     * @throws SystemException
     */
    public LogLlamadasBH(LogLlamadasBHOid oid) {
        if (oid != null && !oid.isNull()) {
            logLlamadasBHID = oid.getLogLlamadasBHID();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return LogLlamadasBH.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        LogLlamadasBH other = (LogLlamadasBH)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getLogLlamadasBHID(), other.getLogLlamadasBHID());
        result &= Utilities.isEqual(this.getLogLlamadasBHTipoServicio(), other.getLogLlamadasBHTipoServicio());
        result &= Utilities.isEqual(this.getLogLlamadasBHSolicitud(), other.getLogLlamadasBHSolicitud());
        result &= Utilities.isEqual(this.getLogLlamadasBHServicio(), other.getLogLlamadasBHServicio());
        result &= Utilities.isEqual(this.getLogLlamadasBHCapacidad(), other.getLogLlamadasBHCapacidad());
        result &= Utilities.isEqual(this.getLogLlamadasBHFechaHora(), other.getLogLlamadasBHFechaHora());
        result &= Utilities.isEqual(this.getLogLlamadasBHTextoError(), other.getLogLlamadasBHTextoError());
        result &= Utilities.isEqual(this.getLogLlamadasBHTiempoEjecucion(), other.getLogLlamadasBHTiempoEjecucion());
        result &= Utilities.isEqual(this.getLogLlamadasBHPeticion(), other.getLogLlamadasBHPeticion());
        result &= Utilities.isEqual(this.getLogLlamadasBHRespuesta(), other.getLogLlamadasBHRespuesta());
        result &= Utilities.isEqual(this.getLogLlamadasBHUsuario(), other.getLogLlamadasBHUsuario());
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
     * Returns the <code>LogLlamadasBHOid</code> object that identifies this instance of <code>LogLlamadasBH</code>.
     * @return <code>LogLlamadasBHOid</code> object that identifies this instance of <code>LogLlamadasBH</code>
     */
	@Override
    public LogLlamadasBHOid getOid() {
        return new LogLlamadasBHOid(getLogLlamadasBHID());
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
        if (!activeFacets.contains(Constants.LOGLLAMADASBH)) {
            activeFacets.add(Constants.LOGLLAMADASBH);
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
            relatedInstance = buildLogLlamadasBHRelatedInstance(relatedInstanceJsonOid);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildLogLlamadasBHRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new LogLlamadasBH(mapper.readValue(relatedInstanceJsonOid, LogLlamadasBHOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogLlamadasBH.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
