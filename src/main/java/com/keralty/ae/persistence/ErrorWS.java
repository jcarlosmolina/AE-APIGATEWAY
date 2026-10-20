package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.ErrorWSConstants;
import com.keralty.ae.persistence.oid.ErrorWSOid;
import com.keralty.ae.persistence.oid.SolicitudOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>ErrorWS</code> external model class.
 * <p>
 * External Model Class: <code>ErrorWS</code><br>
 */
public class ErrorWS extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="identificador")
    private Long errorWSIdentificador;

    @JsonProperty(value="descripcion")
    private String errorWSDescripcion;

    private Solicitud solicitud;

    /**
     * Gets the value of attribute Identificador
     */
    public Long getErrorWSIdentificador() {
        return errorWSIdentificador;
    }
    
    /**
     * Sets the value of attribute Identificador
     */
    public void setErrorWSIdentificador(Long errorWSIdentificador) {
        this.errorWSIdentificador = errorWSIdentificador;
    }

    /**
     * Gets the value of attribute Descripcion
     */
    public String getErrorWSDescripcion() {
        return errorWSDescripcion;
    }
    
    /**
     * Sets the value of attribute Descripcion
     */
    public void setErrorWSDescripcion(String errorWSDescripcion) {
        this.errorWSDescripcion = errorWSDescripcion;
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
    public ErrorWS() {
        errorWSIdentificador = null;
    }

    /**
     * Constructor used to create instances of <code>ErrorWS</code>.
     * @param oid Object Identifier of the instance of <code>ErrorWS</code> to be created.
     * @throws SystemException
     */
    public ErrorWS(ErrorWSOid oid) {
        if (oid != null && !oid.isNull()) {
            errorWSIdentificador = oid.getErrorWSIdentificador();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return ErrorWS.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        ErrorWS other = (ErrorWS)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getErrorWSIdentificador(), other.getErrorWSIdentificador());
        result &= Utilities.isEqual(this.getErrorWSDescripcion(), other.getErrorWSDescripcion());
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
     * Returns the <code>ErrorWSOid</code> object that identifies this instance of <code>ErrorWS</code>.
     * @return <code>ErrorWSOid</code> object that identifies this instance of <code>ErrorWS</code>
     */
	@Override
    public ErrorWSOid getOid() {
        return new ErrorWSOid(getErrorWSIdentificador());
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
        if (!activeFacets.contains(Constants.ERRORWS)) {
            activeFacets.add(Constants.ERRORWS);
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
            relatedInstance = buildErrorWSRelatedInstance(relatedInstanceJsonOid);
        }
        if (ErrorWSConstants.ROLE_NAME_SOLICITUD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildErrorWSRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildErrorWSRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new ErrorWS(mapper.readValue(relatedInstanceJsonOid, ErrorWSOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ErrorWS.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildErrorWSRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ErrorWS.class).error(e.getMessage());
            return null;
        }
    }
}
