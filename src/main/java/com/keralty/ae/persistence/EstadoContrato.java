package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.EstadoContratoConstants;
import com.keralty.ae.persistence.oid.AesolicitudesOid;
import com.keralty.ae.persistence.oid.ContratoCOid;
import com.keralty.ae.persistence.oid.EstadoContratoOid;
import com.keralty.ae.persistence.oid.SolicitudNovedadOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>EstadoContrato</code> external model class.
 * <p>
 * External Model Class: <code>EstadoContrato</code><br>
 */
public class EstadoContrato extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="codigo")
    private Long estadoContratoCodigo;

    @JsonProperty(value="descripcion")
    private String estadoContratoDescripcion;

    private Collection <Aesolicitudes> aESOLICITUDES;

    private Collection <ContratoC> contratosC;

    private Collection <SolicitudNovedad> solicitudesNovedad;

    /**
     * Gets the value of attribute Codigo
     */
    public Long getEstadoContratoCodigo() {
        return estadoContratoCodigo;
    }
    
    /**
     * Sets the value of attribute Codigo
     */
    public void setEstadoContratoCodigo(Long estadoContratoCodigo) {
        this.estadoContratoCodigo = estadoContratoCodigo;
    }

    /**
     * Gets the value of attribute Descripcion
     */
    public String getEstadoContratoDescripcion() {
        return estadoContratoDescripcion;
    }
    
    /**
     * Sets the value of attribute Descripcion
     */
    public void setEstadoContratoDescripcion(String estadoContratoDescripcion) {
        this.estadoContratoDescripcion = estadoContratoDescripcion;
    }

    /**
     * Gets the value of relation through role AESOLICITUDES
     */
    @JsonIgnore
    public Collection <Aesolicitudes> getAESOLICITUDES() {
        return aESOLICITUDES;
    }

    /**
     * Gets the value of relation through role ContratosC
     */
    @JsonIgnore
    public Collection <ContratoC> getContratosC() {
        return contratosC;
    }

    /**
     * Gets the value of relation through role SolicitudesNovedad
     */
    @JsonIgnore
    public Collection <SolicitudNovedad> getSolicitudesNovedad() {
        return solicitudesNovedad;
    }

    /**
     * Default constructor
     */
    public EstadoContrato() {
        estadoContratoCodigo = null;
    }

    /**
     * Constructor used to create instances of <code>EstadoContrato</code>.
     * @param oid Object Identifier of the instance of <code>EstadoContrato</code> to be created.
     * @throws SystemException
     */
    public EstadoContrato(EstadoContratoOid oid) {
        if (oid != null && !oid.isNull()) {
            estadoContratoCodigo = oid.getEstadoContratoCodigo();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return EstadoContrato.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        EstadoContrato other = (EstadoContrato)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getEstadoContratoCodigo(), other.getEstadoContratoCodigo());
        result &= Utilities.isEqual(this.getEstadoContratoDescripcion(), other.getEstadoContratoDescripcion());
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
     * Returns the <code>EstadoContratoOid</code> object that identifies this instance of <code>EstadoContrato</code>.
     * @return <code>EstadoContratoOid</code> object that identifies this instance of <code>EstadoContrato</code>
     */
	@Override
    public EstadoContratoOid getOid() {
        return new EstadoContratoOid(getEstadoContratoCodigo());
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
        if (!activeFacets.contains(Constants.ESTADOCONTRATO)) {
            activeFacets.add(Constants.ESTADOCONTRATO);
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
            relatedInstance = buildEstadoContratoRelatedInstance(relatedInstanceJsonOid);
        }
        if (EstadoContratoConstants.ROLE_NAME_AESOLICITUDES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildEstadoContratoRelatedInstance4Aesolicitudes(relatedInstanceJsonOid, remainingPath);
        }
        if (EstadoContratoConstants.ROLE_NAME_CONTRATOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildEstadoContratoRelatedInstance4ContratoC(relatedInstanceJsonOid, remainingPath);
        }
        if (EstadoContratoConstants.ROLE_NAME_SOLICITUDESNOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildEstadoContratoRelatedInstance4SolicitudNovedad(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildEstadoContratoRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new EstadoContrato(mapper.readValue(relatedInstanceJsonOid, EstadoContratoOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(EstadoContrato.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildEstadoContratoRelatedInstance4Aesolicitudes(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Aesolicitudes(mapper.readValue(relatedInstanceJsonOid, AesolicitudesOid.class)): Aesolicitudes.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(EstadoContrato.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildEstadoContratoRelatedInstance4ContratoC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ContratoC(mapper.readValue(relatedInstanceJsonOid, ContratoCOid.class)): ContratoC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(EstadoContrato.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildEstadoContratoRelatedInstance4SolicitudNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new SolicitudNovedad(mapper.readValue(relatedInstanceJsonOid, SolicitudNovedadOid.class)): SolicitudNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(EstadoContrato.class).error(e.getMessage());
            return null;
        }
    }
}
