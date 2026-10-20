package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.MotivoExcepcionSolNovConstants;
import com.keralty.ae.persistence.oid.MotivoExcepcionSolNovOid;
import com.keralty.ae.persistence.oid.SolicitudNovedadOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>MotivoExcepcionSolNov</code> external model class.
 * <p>
 * External Model Class: <code>MotivoExcepcionSolNov</code><br>
 */
public class MotivoExcepcionSolNov extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id")
    private Long motivoExcepcionSolNovId;

    @JsonProperty(value="descripcion")
    private String motivoExcepcionSolNovDescripcion;

    private Collection <SolicitudNovedad> solicitudes;

    /**
     * Gets the value of attribute Id
     */
    public Long getMotivoExcepcionSolNovId() {
        return motivoExcepcionSolNovId;
    }
    
    /**
     * Sets the value of attribute Id
     */
    public void setMotivoExcepcionSolNovId(Long motivoExcepcionSolNovId) {
        this.motivoExcepcionSolNovId = motivoExcepcionSolNovId;
    }

    /**
     * Gets the value of attribute Descripcion
     */
    public String getMotivoExcepcionSolNovDescripcion() {
        return motivoExcepcionSolNovDescripcion;
    }
    
    /**
     * Sets the value of attribute Descripcion
     */
    public void setMotivoExcepcionSolNovDescripcion(String motivoExcepcionSolNovDescripcion) {
        this.motivoExcepcionSolNovDescripcion = motivoExcepcionSolNovDescripcion;
    }

    /**
     * Gets the value of relation through role Solicitudes
     */
    @JsonIgnore
    public Collection <SolicitudNovedad> getSolicitudes() {
        return solicitudes;
    }

    /**
     * Default constructor
     */
    public MotivoExcepcionSolNov() {
        motivoExcepcionSolNovId = null;
    }

    /**
     * Constructor used to create instances of <code>MotivoExcepcionSolNov</code>.
     * @param oid Object Identifier of the instance of <code>MotivoExcepcionSolNov</code> to be created.
     * @throws SystemException
     */
    public MotivoExcepcionSolNov(MotivoExcepcionSolNovOid oid) {
        if (oid != null && !oid.isNull()) {
            motivoExcepcionSolNovId = oid.getMotivoExcepcionSolNovId();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return MotivoExcepcionSolNov.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        MotivoExcepcionSolNov other = (MotivoExcepcionSolNov)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getMotivoExcepcionSolNovId(), other.getMotivoExcepcionSolNovId());
        result &= Utilities.isEqual(this.getMotivoExcepcionSolNovDescripcion(), other.getMotivoExcepcionSolNovDescripcion());
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
     * Returns the <code>MotivoExcepcionSolNovOid</code> object that identifies this instance of <code>MotivoExcepcionSolNov</code>.
     * @return <code>MotivoExcepcionSolNovOid</code> object that identifies this instance of <code>MotivoExcepcionSolNov</code>
     */
	@Override
    public MotivoExcepcionSolNovOid getOid() {
        return new MotivoExcepcionSolNovOid(getMotivoExcepcionSolNovId());
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
        if (!activeFacets.contains(Constants.MOTIVOEXCEPCIONSOLNOV)) {
            activeFacets.add(Constants.MOTIVOEXCEPCIONSOLNOV);
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
            relatedInstance = buildMotivoExcepcionSolNovRelatedInstance(relatedInstanceJsonOid);
        }
        if (MotivoExcepcionSolNovConstants.ROLE_NAME_SOLICITUDES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildMotivoExcepcionSolNovRelatedInstance4SolicitudNovedad(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildMotivoExcepcionSolNovRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new MotivoExcepcionSolNov(mapper.readValue(relatedInstanceJsonOid, MotivoExcepcionSolNovOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(MotivoExcepcionSolNov.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildMotivoExcepcionSolNovRelatedInstance4SolicitudNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new SolicitudNovedad(mapper.readValue(relatedInstanceJsonOid, SolicitudNovedadOid.class)): SolicitudNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(MotivoExcepcionSolNov.class).error(e.getMessage());
            return null;
        }
    }
}
