package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.persistence.oid.LogLlamadasAEOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>LogLlamadasAE</code> external model class.
 * <p>
 * External Model Class: <code>LogLlamadasAE</code><br>
 */
public class LogLlamadasAE extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id")
    private Long logLlamadasAEID;

    @JsonProperty(value="tiposervicio")
    private String logLlamadasAETipoServicio;

    @JsonProperty(value="solicitud")
    private String logLlamadasAESolicitud;

    @JsonProperty(value="servicio")
    private String logLlamadasAEServicio;

    @JsonProperty(value="capacidad")
    private String logLlamadasAECapacidad;

    @JsonProperty(value="fechahora")
    private Timestamp logLlamadasAEFechaHora;

    @JsonProperty(value="textoerror")
    private String logLlamadasAETextoError;

    @JsonProperty(value="tiempoejecucion")
    private Double logLlamadasAETiempoEjecucion;

    @JsonProperty(value="datosrecibidos")
    private String logLlamadasAEDatosRecibidos;

    @JsonProperty(value="datosenviados")
    private String logLlamadasAEDatosEnviados;

    /**
     * Gets the value of attribute ID
     */
    public Long getLogLlamadasAEID() {
        return logLlamadasAEID;
    }
    
    /**
     * Sets the value of attribute ID
     */
    public void setLogLlamadasAEID(Long logLlamadasAEID) {
        this.logLlamadasAEID = logLlamadasAEID;
    }

    /**
     * Gets the value of attribute TipoServicio
     */
    public String getLogLlamadasAETipoServicio() {
        return logLlamadasAETipoServicio;
    }
    
    /**
     * Sets the value of attribute TipoServicio
     */
    public void setLogLlamadasAETipoServicio(String logLlamadasAETipoServicio) {
        this.logLlamadasAETipoServicio = logLlamadasAETipoServicio;
    }

    /**
     * Gets the value of attribute Solicitud
     */
    public String getLogLlamadasAESolicitud() {
        return logLlamadasAESolicitud;
    }
    
    /**
     * Sets the value of attribute Solicitud
     */
    public void setLogLlamadasAESolicitud(String logLlamadasAESolicitud) {
        this.logLlamadasAESolicitud = logLlamadasAESolicitud;
    }

    /**
     * Gets the value of attribute Servicio
     */
    public String getLogLlamadasAEServicio() {
        return logLlamadasAEServicio;
    }
    
    /**
     * Sets the value of attribute Servicio
     */
    public void setLogLlamadasAEServicio(String logLlamadasAEServicio) {
        this.logLlamadasAEServicio = logLlamadasAEServicio;
    }

    /**
     * Gets the value of attribute Capacidad
     */
    public String getLogLlamadasAECapacidad() {
        return logLlamadasAECapacidad;
    }
    
    /**
     * Sets the value of attribute Capacidad
     */
    public void setLogLlamadasAECapacidad(String logLlamadasAECapacidad) {
        this.logLlamadasAECapacidad = logLlamadasAECapacidad;
    }

    /**
     * Gets the value of attribute FechaHora
     */
    public Timestamp getLogLlamadasAEFechaHora() {
        return logLlamadasAEFechaHora;
    }
    
    /**
     * Sets the value of attribute FechaHora
     */
    public void setLogLlamadasAEFechaHora(Timestamp logLlamadasAEFechaHora) {
        this.logLlamadasAEFechaHora = logLlamadasAEFechaHora;
    }

    /**
     * Gets the value of attribute TextoError
     */
    public String getLogLlamadasAETextoError() {
        return logLlamadasAETextoError;
    }
    
    /**
     * Sets the value of attribute TextoError
     */
    public void setLogLlamadasAETextoError(String logLlamadasAETextoError) {
        this.logLlamadasAETextoError = logLlamadasAETextoError;
    }

    /**
     * Gets the value of attribute TiempoEjecucion
     */
    public Double getLogLlamadasAETiempoEjecucion() {
        return logLlamadasAETiempoEjecucion;
    }
    
    /**
     * Sets the value of attribute TiempoEjecucion
     */
    public void setLogLlamadasAETiempoEjecucion(Double logLlamadasAETiempoEjecucion) {
        this.logLlamadasAETiempoEjecucion = logLlamadasAETiempoEjecucion;
    }

    /**
     * Gets the value of attribute DatosRecibidos
     */
    public String getLogLlamadasAEDatosRecibidos() {
        return logLlamadasAEDatosRecibidos;
    }
    
    /**
     * Sets the value of attribute DatosRecibidos
     */
    public void setLogLlamadasAEDatosRecibidos(String logLlamadasAEDatosRecibidos) {
        this.logLlamadasAEDatosRecibidos = logLlamadasAEDatosRecibidos;
    }

    /**
     * Gets the value of attribute DatosEnviados
     */
    public String getLogLlamadasAEDatosEnviados() {
        return logLlamadasAEDatosEnviados;
    }
    
    /**
     * Sets the value of attribute DatosEnviados
     */
    public void setLogLlamadasAEDatosEnviados(String logLlamadasAEDatosEnviados) {
        this.logLlamadasAEDatosEnviados = logLlamadasAEDatosEnviados;
    }

    /**
     * Default constructor
     */
    public LogLlamadasAE() {
        logLlamadasAEID = null;
    }

    /**
     * Constructor used to create instances of <code>LogLlamadasAE</code>.
     * @param oid Object Identifier of the instance of <code>LogLlamadasAE</code> to be created.
     * @throws SystemException
     */
    public LogLlamadasAE(LogLlamadasAEOid oid) {
        if (oid != null && !oid.isNull()) {
            logLlamadasAEID = oid.getLogLlamadasAEID();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return LogLlamadasAE.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        LogLlamadasAE other = (LogLlamadasAE)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getLogLlamadasAEID(), other.getLogLlamadasAEID());
        result &= Utilities.isEqual(this.getLogLlamadasAETipoServicio(), other.getLogLlamadasAETipoServicio());
        result &= Utilities.isEqual(this.getLogLlamadasAESolicitud(), other.getLogLlamadasAESolicitud());
        result &= Utilities.isEqual(this.getLogLlamadasAEServicio(), other.getLogLlamadasAEServicio());
        result &= Utilities.isEqual(this.getLogLlamadasAECapacidad(), other.getLogLlamadasAECapacidad());
        result &= Utilities.isEqual(this.getLogLlamadasAEFechaHora(), other.getLogLlamadasAEFechaHora());
        result &= Utilities.isEqual(this.getLogLlamadasAETextoError(), other.getLogLlamadasAETextoError());
        result &= Utilities.isEqual(this.getLogLlamadasAETiempoEjecucion(), other.getLogLlamadasAETiempoEjecucion());
        result &= Utilities.isEqual(this.getLogLlamadasAEDatosRecibidos(), other.getLogLlamadasAEDatosRecibidos());
        result &= Utilities.isEqual(this.getLogLlamadasAEDatosEnviados(), other.getLogLlamadasAEDatosEnviados());
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
     * Returns the <code>LogLlamadasAEOid</code> object that identifies this instance of <code>LogLlamadasAE</code>.
     * @return <code>LogLlamadasAEOid</code> object that identifies this instance of <code>LogLlamadasAE</code>
     */
	@Override
    public LogLlamadasAEOid getOid() {
        return new LogLlamadasAEOid(getLogLlamadasAEID());
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
        if (!activeFacets.contains(Constants.LOGLLAMADASAE)) {
            activeFacets.add(Constants.LOGLLAMADASAE);
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
            relatedInstance = buildLogLlamadasAERelatedInstance(relatedInstanceJsonOid);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildLogLlamadasAERelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new LogLlamadasAE(mapper.readValue(relatedInstanceJsonOid, LogLlamadasAEOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogLlamadasAE.class).error(e.getMessage());
            return null;
        }
    }
}
