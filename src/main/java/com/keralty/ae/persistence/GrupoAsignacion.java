package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.GrupoAsignacionConstants;
import com.keralty.ae.persistence.oid.DominioOid;
import com.keralty.ae.persistence.oid.FuncionarioOid;
import com.keralty.ae.persistence.oid.GrupoAsignacionNovedadOid;
import com.keralty.ae.persistence.oid.GrupoAsignacionOid;
import com.keralty.ae.persistence.oid.LogGrupoAsignacionOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>GrupoAsignacion</code> external model class.
 * <p>
 * External Model Class: <code>GrupoAsignacion</code><br>
 */
public class GrupoAsignacion extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id")
    private Long grupoAsignacionId;

    @JsonProperty(value="tipo")
    private Long grupoAsignacionTipo;

    @JsonProperty(value="nombre")
    private String grupoAsignacionNombre;

    @JsonProperty(value="descripcion")
    private String grupoAsignacionDescripcion;

    private Collection <Dominio> dominioAsesores;

    private Collection <Dominio> dominioAreaMedica;

    private Collection <LogGrupoAsignacion> logGrupoAsignacion;

    private Collection <GrupoAsignacionNovedad> dominioCausalUsuario;

    private Collection <Funcionario> funcionario;

    /**
     * Gets the value of attribute Id
     */
    public Long getGrupoAsignacionId() {
        return grupoAsignacionId;
    }
    
    /**
     * Sets the value of attribute Id
     */
    public void setGrupoAsignacionId(Long grupoAsignacionId) {
        this.grupoAsignacionId = grupoAsignacionId;
    }

    /**
     * Gets the value of attribute Tipo
     */
    public Long getGrupoAsignacionTipo() {
        return grupoAsignacionTipo;
    }
    
    /**
     * Sets the value of attribute Tipo
     */
    public void setGrupoAsignacionTipo(Long grupoAsignacionTipo) {
        this.grupoAsignacionTipo = grupoAsignacionTipo;
    }

    /**
     * Gets the value of attribute Nombre
     */
    public String getGrupoAsignacionNombre() {
        return grupoAsignacionNombre;
    }
    
    /**
     * Sets the value of attribute Nombre
     */
    public void setGrupoAsignacionNombre(String grupoAsignacionNombre) {
        this.grupoAsignacionNombre = grupoAsignacionNombre;
    }

    /**
     * Gets the value of attribute Descripcion
     */
    public String getGrupoAsignacionDescripcion() {
        return grupoAsignacionDescripcion;
    }
    
    /**
     * Sets the value of attribute Descripcion
     */
    public void setGrupoAsignacionDescripcion(String grupoAsignacionDescripcion) {
        this.grupoAsignacionDescripcion = grupoAsignacionDescripcion;
    }

    /**
     * Gets the value of relation through role DominioAsesores
     */
    @JsonIgnore
    public Collection <Dominio> getDominioAsesores() {
        return dominioAsesores;
    }

    /**
     * Gets the value of relation through role DominioAreaMedica
     */
    @JsonIgnore
    public Collection <Dominio> getDominioAreaMedica() {
        return dominioAreaMedica;
    }

    /**
     * Gets the value of relation through role LogGrupoAsignacion
     */
    @JsonIgnore
    public Collection <LogGrupoAsignacion> getLogGrupoAsignacion() {
        return logGrupoAsignacion;
    }

    /**
     * Gets the value of relation through role DominioCausalUsuario
     */
    @JsonIgnore
    public Collection <GrupoAsignacionNovedad> getDominioCausalUsuario() {
        return dominioCausalUsuario;
    }

    /**
     * Gets the value of relation through role Funcionario
     */
    @JsonIgnore
    public Collection <Funcionario> getFuncionario() {
        return funcionario;
    }

    /**
     * Default constructor
     */
    public GrupoAsignacion() {
        grupoAsignacionId = null;
    }

    /**
     * Constructor used to create instances of <code>GrupoAsignacion</code>.
     * @param oid Object Identifier of the instance of <code>GrupoAsignacion</code> to be created.
     * @throws SystemException
     */
    public GrupoAsignacion(GrupoAsignacionOid oid) {
        if (oid != null && !oid.isNull()) {
            grupoAsignacionId = oid.getGrupoAsignacionId();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return GrupoAsignacion.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        GrupoAsignacion other = (GrupoAsignacion)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getGrupoAsignacionId(), other.getGrupoAsignacionId());
        result &= Utilities.isEqual(this.getGrupoAsignacionTipo(), other.getGrupoAsignacionTipo());
        result &= Utilities.isEqual(this.getGrupoAsignacionNombre(), other.getGrupoAsignacionNombre());
        result &= Utilities.isEqual(this.getGrupoAsignacionDescripcion(), other.getGrupoAsignacionDescripcion());
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
     * Returns the <code>GrupoAsignacionOid</code> object that identifies this instance of <code>GrupoAsignacion</code>.
     * @return <code>GrupoAsignacionOid</code> object that identifies this instance of <code>GrupoAsignacion</code>
     */
	@Override
    public GrupoAsignacionOid getOid() {
        return new GrupoAsignacionOid(getGrupoAsignacionId());
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
        if (!activeFacets.contains(Constants.GRUPOASIGNACION)) {
            activeFacets.add(Constants.GRUPOASIGNACION);
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
            relatedInstance = buildGrupoAsignacionRelatedInstance(relatedInstanceJsonOid);
        }
        if (GrupoAsignacionConstants.ROLE_NAME_DOMINIOASESORES.equalsIgnoreCase(relatedInstancePathFirstItem) || GrupoAsignacionConstants.ROLE_NAME_DOMINIOAREAMEDICA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildGrupoAsignacionRelatedInstance4Dominio(relatedInstanceJsonOid, remainingPath);
        }
        if (GrupoAsignacionConstants.ROLE_NAME_LOGGRUPOASIGNACION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildGrupoAsignacionRelatedInstance4LogGrupoAsignacion(relatedInstanceJsonOid, remainingPath);
        }
        if (GrupoAsignacionConstants.ROLE_NAME_DOMINIOCAUSALUSUARIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildGrupoAsignacionRelatedInstance4GrupoAsignacionNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (GrupoAsignacionConstants.ROLE_NAME_FUNCIONARIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildGrupoAsignacionRelatedInstance4Funcionario(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildGrupoAsignacionRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new GrupoAsignacion(mapper.readValue(relatedInstanceJsonOid, GrupoAsignacionOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(GrupoAsignacion.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildGrupoAsignacionRelatedInstance4Dominio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Dominio(mapper.readValue(relatedInstanceJsonOid, DominioOid.class)): Dominio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(GrupoAsignacion.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildGrupoAsignacionRelatedInstance4LogGrupoAsignacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new LogGrupoAsignacion(mapper.readValue(relatedInstanceJsonOid, LogGrupoAsignacionOid.class)): LogGrupoAsignacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(GrupoAsignacion.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildGrupoAsignacionRelatedInstance4GrupoAsignacionNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new GrupoAsignacionNovedad(mapper.readValue(relatedInstanceJsonOid, GrupoAsignacionNovedadOid.class)): GrupoAsignacionNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(GrupoAsignacion.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildGrupoAsignacionRelatedInstance4Funcionario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Funcionario(mapper.readValue(relatedInstanceJsonOid, FuncionarioOid.class)): Funcionario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(GrupoAsignacion.class).error(e.getMessage());
            return null;
        }
    }
}
