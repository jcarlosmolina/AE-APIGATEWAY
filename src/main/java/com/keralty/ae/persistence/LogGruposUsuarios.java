package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.LogGruposUsuariosConstants;
import com.keralty.ae.persistence.oid.DominioOid;
import com.keralty.ae.persistence.oid.LogGruposUsuariosOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>LogGruposUsuarios</code> external model class.
 * <p>
 * External Model Class: <code>LogGruposUsuarios</code><br>
 */
public class LogGruposUsuarios extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id")
    private Long logGruposUsuariosId;

    @JsonProperty(value="fecha")
    private Timestamp logGruposUsuariosFecha;

    @JsonProperty(value="loginfuncionario")
    private String logGruposUsuariosLoginFuncionario;

    @JsonProperty(value="tipogrupo")
    private Long logGruposUsuariosTipoGrupo;

    @JsonProperty(value="accion")
    private String logGruposUsuariosAccion;

    @JsonProperty(value="grupo")
    private String logGruposUsuariosGrupo;

    private Dominio dominio;

    /**
     * Gets the value of attribute Id
     */
    public Long getLogGruposUsuariosId() {
        return logGruposUsuariosId;
    }
    
    /**
     * Sets the value of attribute Id
     */
    public void setLogGruposUsuariosId(Long logGruposUsuariosId) {
        this.logGruposUsuariosId = logGruposUsuariosId;
    }

    /**
     * Gets the value of attribute Fecha
     */
    public Timestamp getLogGruposUsuariosFecha() {
        return logGruposUsuariosFecha;
    }
    
    /**
     * Sets the value of attribute Fecha
     */
    public void setLogGruposUsuariosFecha(Timestamp logGruposUsuariosFecha) {
        this.logGruposUsuariosFecha = logGruposUsuariosFecha;
    }

    /**
     * Gets the value of attribute LoginFuncionario
     */
    public String getLogGruposUsuariosLoginFuncionario() {
        return logGruposUsuariosLoginFuncionario;
    }
    
    /**
     * Sets the value of attribute LoginFuncionario
     */
    public void setLogGruposUsuariosLoginFuncionario(String logGruposUsuariosLoginFuncionario) {
        this.logGruposUsuariosLoginFuncionario = logGruposUsuariosLoginFuncionario;
    }

    /**
     * Gets the value of attribute TipoGrupo
     */
    public Long getLogGruposUsuariosTipoGrupo() {
        return logGruposUsuariosTipoGrupo;
    }
    
    /**
     * Sets the value of attribute TipoGrupo
     */
    public void setLogGruposUsuariosTipoGrupo(Long logGruposUsuariosTipoGrupo) {
        this.logGruposUsuariosTipoGrupo = logGruposUsuariosTipoGrupo;
    }

    /**
     * Gets the value of attribute Accion
     */
    public String getLogGruposUsuariosAccion() {
        return logGruposUsuariosAccion;
    }
    
    /**
     * Sets the value of attribute Accion
     */
    public void setLogGruposUsuariosAccion(String logGruposUsuariosAccion) {
        this.logGruposUsuariosAccion = logGruposUsuariosAccion;
    }

    /**
     * Gets the value of attribute Grupo
     */
    public String getLogGruposUsuariosGrupo() {
        return logGruposUsuariosGrupo;
    }
    
    /**
     * Sets the value of attribute Grupo
     */
    public void setLogGruposUsuariosGrupo(String logGruposUsuariosGrupo) {
        this.logGruposUsuariosGrupo = logGruposUsuariosGrupo;
    }

    /**
     * Gets the value of relation through role Dominio
     */
    @JsonIgnore
    public Dominio getDominio() {
        return dominio;
    }

    /**
     * Default constructor
     */
    public LogGruposUsuarios() {
        logGruposUsuariosId = null;
    }

    /**
     * Constructor used to create instances of <code>LogGruposUsuarios</code>.
     * @param oid Object Identifier of the instance of <code>LogGruposUsuarios</code> to be created.
     * @throws SystemException
     */
    public LogGruposUsuarios(LogGruposUsuariosOid oid) {
        if (oid != null && !oid.isNull()) {
            logGruposUsuariosId = oid.getLogGruposUsuariosId();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return LogGruposUsuarios.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        LogGruposUsuarios other = (LogGruposUsuarios)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getLogGruposUsuariosId(), other.getLogGruposUsuariosId());
        result &= Utilities.isEqual(this.getLogGruposUsuariosFecha(), other.getLogGruposUsuariosFecha());
        result &= Utilities.isEqual(this.getLogGruposUsuariosLoginFuncionario(), other.getLogGruposUsuariosLoginFuncionario());
        result &= Utilities.isEqual(this.getLogGruposUsuariosTipoGrupo(), other.getLogGruposUsuariosTipoGrupo());
        result &= Utilities.isEqual(this.getLogGruposUsuariosAccion(), other.getLogGruposUsuariosAccion());
        result &= Utilities.isEqual(this.getLogGruposUsuariosGrupo(), other.getLogGruposUsuariosGrupo());
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
     * Returns the <code>LogGruposUsuariosOid</code> object that identifies this instance of <code>LogGruposUsuarios</code>.
     * @return <code>LogGruposUsuariosOid</code> object that identifies this instance of <code>LogGruposUsuarios</code>
     */
	@Override
    public LogGruposUsuariosOid getOid() {
        return new LogGruposUsuariosOid(getLogGruposUsuariosId());
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
        if (!activeFacets.contains(Constants.LOGGRUPOSUSUARIOS)) {
            activeFacets.add(Constants.LOGGRUPOSUSUARIOS);
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
            relatedInstance = buildLogGruposUsuariosRelatedInstance(relatedInstanceJsonOid);
        }
        if (LogGruposUsuariosConstants.ROLE_NAME_DOMINIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildLogGruposUsuariosRelatedInstance4Dominio(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildLogGruposUsuariosRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new LogGruposUsuarios(mapper.readValue(relatedInstanceJsonOid, LogGruposUsuariosOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogGruposUsuarios.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildLogGruposUsuariosRelatedInstance4Dominio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Dominio(mapper.readValue(relatedInstanceJsonOid, DominioOid.class)): Dominio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogGruposUsuarios.class).error(e.getMessage());
            return null;
        }
    }
}
