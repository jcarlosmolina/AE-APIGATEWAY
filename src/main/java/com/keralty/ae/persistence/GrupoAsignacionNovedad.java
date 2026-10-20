package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.GrupoAsignacionNovedadConstants;
import com.keralty.ae.persistence.oid.CausalOid;
import com.keralty.ae.persistence.oid.DominioOid;
import com.keralty.ae.persistence.oid.GrupoAsignacionNovedadOid;
import com.keralty.ae.persistence.oid.GrupoAsignacionOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>GrupoAsignacionNovedad</code> external model class.
 * <p>
 * External Model Class: <code>GrupoAsignacionNovedad</code><br>
 */
public class GrupoAsignacionNovedad extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id")
    private Long grupoAsignacionNovedadId;

    private Dominio dominio;

    private Causal causal;

    private GrupoAsignacion grupoUsuarios;

    /**
     * Gets the value of attribute Id
     */
    public Long getGrupoAsignacionNovedadId() {
        return grupoAsignacionNovedadId;
    }
    
    /**
     * Sets the value of attribute Id
     */
    public void setGrupoAsignacionNovedadId(Long grupoAsignacionNovedadId) {
        this.grupoAsignacionNovedadId = grupoAsignacionNovedadId;
    }

    /**
     * Gets the value of relation through role Dominio
     */
    @JsonIgnore
    public Dominio getDominio() {
        return dominio;
    }

    /**
     * Gets the value of relation through role Causal
     */
    @JsonIgnore
    public Causal getCausal() {
        return causal;
    }

    /**
     * Gets the value of relation through role GrupoUsuarios
     */
    @JsonIgnore
    public GrupoAsignacion getGrupoUsuarios() {
        return grupoUsuarios;
    }

    /**
     * Default constructor
     */
    public GrupoAsignacionNovedad() {
        grupoAsignacionNovedadId = null;
    }

    /**
     * Constructor used to create instances of <code>GrupoAsignacionNovedad</code>.
     * @param oid Object Identifier of the instance of <code>GrupoAsignacionNovedad</code> to be created.
     * @throws SystemException
     */
    public GrupoAsignacionNovedad(GrupoAsignacionNovedadOid oid) {
        if (oid != null && !oid.isNull()) {
            grupoAsignacionNovedadId = oid.getGrupoAsignacionNovedadId();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return GrupoAsignacionNovedad.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        GrupoAsignacionNovedad other = (GrupoAsignacionNovedad)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getGrupoAsignacionNovedadId(), other.getGrupoAsignacionNovedadId());
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
     * Returns the <code>GrupoAsignacionNovedadOid</code> object that identifies this instance of <code>GrupoAsignacionNovedad</code>.
     * @return <code>GrupoAsignacionNovedadOid</code> object that identifies this instance of <code>GrupoAsignacionNovedad</code>
     */
	@Override
    public GrupoAsignacionNovedadOid getOid() {
        return new GrupoAsignacionNovedadOid(getGrupoAsignacionNovedadId());
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
        if (!activeFacets.contains(Constants.GRUPOASIGNACIONNOVEDAD)) {
            activeFacets.add(Constants.GRUPOASIGNACIONNOVEDAD);
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
            relatedInstance = buildGrupoAsignacionNovedadRelatedInstance(relatedInstanceJsonOid);
        }
        if (GrupoAsignacionNovedadConstants.ROLE_NAME_DOMINIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildGrupoAsignacionNovedadRelatedInstance4Dominio(relatedInstanceJsonOid, remainingPath);
        }
        if (GrupoAsignacionNovedadConstants.ROLE_NAME_CAUSAL.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildGrupoAsignacionNovedadRelatedInstance4Causal(relatedInstanceJsonOid, remainingPath);
        }
        if (GrupoAsignacionNovedadConstants.ROLE_NAME_GRUPOUSUARIOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildGrupoAsignacionNovedadRelatedInstance4GrupoAsignacion(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildGrupoAsignacionNovedadRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new GrupoAsignacionNovedad(mapper.readValue(relatedInstanceJsonOid, GrupoAsignacionNovedadOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(GrupoAsignacionNovedad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildGrupoAsignacionNovedadRelatedInstance4Dominio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Dominio(mapper.readValue(relatedInstanceJsonOid, DominioOid.class)): Dominio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(GrupoAsignacionNovedad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildGrupoAsignacionNovedadRelatedInstance4Causal(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Causal(mapper.readValue(relatedInstanceJsonOid, CausalOid.class)): Causal.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(GrupoAsignacionNovedad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildGrupoAsignacionNovedadRelatedInstance4GrupoAsignacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new GrupoAsignacion(mapper.readValue(relatedInstanceJsonOid, GrupoAsignacionOid.class)): GrupoAsignacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(GrupoAsignacionNovedad.class).error(e.getMessage());
            return null;
        }
    }
}
