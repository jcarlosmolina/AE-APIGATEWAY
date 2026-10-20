package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.PriorizacionSolicitudesConstants;
import com.keralty.ae.persistence.oid.LogPriorizacionSolOid;
import com.keralty.ae.persistence.oid.PriorizacionSolicitudesOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>PriorizacionSolicitudes</code> external model class.
 * <p>
 * External Model Class: <code>PriorizacionSolicitudes</code><br>
 */
public class PriorizacionSolicitudes extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="estadosolicitud")
    private Long priorizacionSolicitudesEstadoSolicitud;

    @JsonProperty(value="estadodoc")
    private Long priorizacionSolicitudesEstadoDoc;

    @JsonProperty(value="prioridad")
    private Long priorizacionSolicitudesPrioridad;

    private Collection <LogPriorizacionSol> logPriorizacionSol;

    /**
     * Gets the value of attribute EstadoSolicitud
     */
    public Long getPriorizacionSolicitudesEstadoSolicitud() {
        return priorizacionSolicitudesEstadoSolicitud;
    }
    
    /**
     * Sets the value of attribute EstadoSolicitud
     */
    public void setPriorizacionSolicitudesEstadoSolicitud(Long priorizacionSolicitudesEstadoSolicitud) {
        this.priorizacionSolicitudesEstadoSolicitud = priorizacionSolicitudesEstadoSolicitud;
    }

    /**
     * Gets the value of attribute EstadoDoc
     */
    public Long getPriorizacionSolicitudesEstadoDoc() {
        return priorizacionSolicitudesEstadoDoc;
    }
    
    /**
     * Sets the value of attribute EstadoDoc
     */
    public void setPriorizacionSolicitudesEstadoDoc(Long priorizacionSolicitudesEstadoDoc) {
        this.priorizacionSolicitudesEstadoDoc = priorizacionSolicitudesEstadoDoc;
    }

    /**
     * Gets the value of attribute Prioridad
     */
    public Long getPriorizacionSolicitudesPrioridad() {
        return priorizacionSolicitudesPrioridad;
    }
    
    /**
     * Sets the value of attribute Prioridad
     */
    public void setPriorizacionSolicitudesPrioridad(Long priorizacionSolicitudesPrioridad) {
        this.priorizacionSolicitudesPrioridad = priorizacionSolicitudesPrioridad;
    }

    /**
     * Gets the value of relation through role LogPriorizacionSol
     */
    @JsonIgnore
    public Collection <LogPriorizacionSol> getLogPriorizacionSol() {
        return logPriorizacionSol;
    }

    /**
     * Default constructor
     */
    public PriorizacionSolicitudes() {
        priorizacionSolicitudesEstadoSolicitud = null;
        priorizacionSolicitudesEstadoDoc = null;
    }

    /**
     * Constructor used to create instances of <code>PriorizacionSolicitudes</code>.
     * @param oid Object Identifier of the instance of <code>PriorizacionSolicitudes</code> to be created.
     * @throws SystemException
     */
    public PriorizacionSolicitudes(PriorizacionSolicitudesOid oid) {
        if (oid != null && !oid.isNull()) {
            priorizacionSolicitudesEstadoSolicitud = oid.getPriorizacionSolicitudesEstadoSolicitud();
            priorizacionSolicitudesEstadoDoc = oid.getPriorizacionSolicitudesEstadoDoc();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return PriorizacionSolicitudes.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        PriorizacionSolicitudes other = (PriorizacionSolicitudes)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getPriorizacionSolicitudesEstadoSolicitud(), other.getPriorizacionSolicitudesEstadoSolicitud());
        result &= Utilities.isEqual(this.getPriorizacionSolicitudesEstadoDoc(), other.getPriorizacionSolicitudesEstadoDoc());
        result &= Utilities.isEqual(this.getPriorizacionSolicitudesPrioridad(), other.getPriorizacionSolicitudesPrioridad());
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
     * Returns the <code>PriorizacionSolicitudesOid</code> object that identifies this instance of <code>PriorizacionSolicitudes</code>.
     * @return <code>PriorizacionSolicitudesOid</code> object that identifies this instance of <code>PriorizacionSolicitudes</code>
     */
	@Override
    public PriorizacionSolicitudesOid getOid() {
        return new PriorizacionSolicitudesOid(getPriorizacionSolicitudesEstadoSolicitud(), getPriorizacionSolicitudesEstadoDoc());
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
        if (!activeFacets.contains(Constants.PRIORIZACIONSOLICITUDES)) {
            activeFacets.add(Constants.PRIORIZACIONSOLICITUDES);
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
            relatedInstance = buildPriorizacionSolicitudesRelatedInstance(relatedInstanceJsonOid);
        }
        if (PriorizacionSolicitudesConstants.ROLE_NAME_LOGPRIORIZACIONSOL.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPriorizacionSolicitudesRelatedInstance4LogPriorizacionSol(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildPriorizacionSolicitudesRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new PriorizacionSolicitudes(mapper.readValue(relatedInstanceJsonOid, PriorizacionSolicitudesOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PriorizacionSolicitudes.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPriorizacionSolicitudesRelatedInstance4LogPriorizacionSol(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new LogPriorizacionSol(mapper.readValue(relatedInstanceJsonOid, LogPriorizacionSolOid.class)): LogPriorizacionSol.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PriorizacionSolicitudes.class).error(e.getMessage());
            return null;
        }
    }
}
