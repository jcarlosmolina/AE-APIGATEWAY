package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.LogIncompatibilidadesConstants;
import com.keralty.ae.persistence.oid.DominioOid;
import com.keralty.ae.persistence.oid.LogIncompatibilidadesOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>LogIncompatibilidades</code> external model class.
 * <p>
 * External Model Class: <code>LogIncompatibilidades</code><br>
 */
public class LogIncompatibilidades extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id_logincompatibilidades")
    private Long logIncompatibilidadesidLogIncompatibilidades;

    @JsonProperty(value="loginfuncionario")
    private String logIncompatibilidadesLoginFuncionario;

    @JsonProperty(value="fecha")
    private Timestamp logIncompatibilidadesFecha;

    @JsonProperty(value="accion")
    private String logIncompatibilidadesAccion;

    @JsonProperty(value="nomdominio")
    private String logIncompatibilidadesNomDominio;

    private Dominio dominio;

    /**
     * Gets the value of attribute id_LogIncompatibilidades
     */
    public Long getLogIncompatibilidadesidLogIncompatibilidades() {
        return logIncompatibilidadesidLogIncompatibilidades;
    }
    
    /**
     * Sets the value of attribute id_LogIncompatibilidades
     */
    public void setLogIncompatibilidadesidLogIncompatibilidades(Long logIncompatibilidadesidLogIncompatibilidades) {
        this.logIncompatibilidadesidLogIncompatibilidades = logIncompatibilidadesidLogIncompatibilidades;
    }

    /**
     * Gets the value of attribute LoginFuncionario
     */
    public String getLogIncompatibilidadesLoginFuncionario() {
        return logIncompatibilidadesLoginFuncionario;
    }
    
    /**
     * Sets the value of attribute LoginFuncionario
     */
    public void setLogIncompatibilidadesLoginFuncionario(String logIncompatibilidadesLoginFuncionario) {
        this.logIncompatibilidadesLoginFuncionario = logIncompatibilidadesLoginFuncionario;
    }

    /**
     * Gets the value of attribute Fecha
     */
    public Timestamp getLogIncompatibilidadesFecha() {
        return logIncompatibilidadesFecha;
    }
    
    /**
     * Sets the value of attribute Fecha
     */
    public void setLogIncompatibilidadesFecha(Timestamp logIncompatibilidadesFecha) {
        this.logIncompatibilidadesFecha = logIncompatibilidadesFecha;
    }

    /**
     * Gets the value of attribute Accion
     */
    public String getLogIncompatibilidadesAccion() {
        return logIncompatibilidadesAccion;
    }
    
    /**
     * Sets the value of attribute Accion
     */
    public void setLogIncompatibilidadesAccion(String logIncompatibilidadesAccion) {
        this.logIncompatibilidadesAccion = logIncompatibilidadesAccion;
    }

    /**
     * Gets the value of attribute NomDominio
     */
    public String getLogIncompatibilidadesNomDominio() {
        return logIncompatibilidadesNomDominio;
    }
    
    /**
     * Sets the value of attribute NomDominio
     */
    public void setLogIncompatibilidadesNomDominio(String logIncompatibilidadesNomDominio) {
        this.logIncompatibilidadesNomDominio = logIncompatibilidadesNomDominio;
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
    public LogIncompatibilidades() {
        logIncompatibilidadesidLogIncompatibilidades = null;
    }

    /**
     * Constructor used to create instances of <code>LogIncompatibilidades</code>.
     * @param oid Object Identifier of the instance of <code>LogIncompatibilidades</code> to be created.
     * @throws SystemException
     */
    public LogIncompatibilidades(LogIncompatibilidadesOid oid) {
        if (oid != null && !oid.isNull()) {
            logIncompatibilidadesidLogIncompatibilidades = oid.getLogIncompatibilidadesidLogIncompatibilidades();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return LogIncompatibilidades.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        LogIncompatibilidades other = (LogIncompatibilidades)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getLogIncompatibilidadesidLogIncompatibilidades(), other.getLogIncompatibilidadesidLogIncompatibilidades());
        result &= Utilities.isEqual(this.getLogIncompatibilidadesLoginFuncionario(), other.getLogIncompatibilidadesLoginFuncionario());
        result &= Utilities.isEqual(this.getLogIncompatibilidadesFecha(), other.getLogIncompatibilidadesFecha());
        result &= Utilities.isEqual(this.getLogIncompatibilidadesAccion(), other.getLogIncompatibilidadesAccion());
        result &= Utilities.isEqual(this.getLogIncompatibilidadesNomDominio(), other.getLogIncompatibilidadesNomDominio());
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
     * Returns the <code>LogIncompatibilidadesOid</code> object that identifies this instance of <code>LogIncompatibilidades</code>.
     * @return <code>LogIncompatibilidadesOid</code> object that identifies this instance of <code>LogIncompatibilidades</code>
     */
	@Override
    public LogIncompatibilidadesOid getOid() {
        return new LogIncompatibilidadesOid(getLogIncompatibilidadesidLogIncompatibilidades());
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
        if (!activeFacets.contains(Constants.LOGINCOMPATIBILIDADES)) {
            activeFacets.add(Constants.LOGINCOMPATIBILIDADES);
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
            relatedInstance = buildLogIncompatibilidadesRelatedInstance(relatedInstanceJsonOid);
        }
        if (LogIncompatibilidadesConstants.ROLE_NAME_DOMINIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildLogIncompatibilidadesRelatedInstance4Dominio(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildLogIncompatibilidadesRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new LogIncompatibilidades(mapper.readValue(relatedInstanceJsonOid, LogIncompatibilidadesOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogIncompatibilidades.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildLogIncompatibilidadesRelatedInstance4Dominio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Dominio(mapper.readValue(relatedInstanceJsonOid, DominioOid.class)): Dominio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogIncompatibilidades.class).error(e.getMessage());
            return null;
        }
    }
}
