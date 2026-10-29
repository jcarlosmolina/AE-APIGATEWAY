package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.LogInformacionAsesorConstants;
import com.keralty.ae.persistence.oid.AsesorOid;
import com.keralty.ae.persistence.oid.LogInformacionAsesorOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>LogInformacionAsesor</code> external model class.
 * <p>
 * External Model Class: <code>LogInformacionAsesor</code><br>
 */
public class LogInformacionAsesor extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id_loginformacionasesor")
    private Long logInformacionAsesoridLogInformacionAsesor;

    @JsonProperty(value="fechahora")
    private Timestamp logInformacionAsesorFechaHora;

    @JsonProperty(value="loginfuncionario")
    private String logInformacionAsesorLoginFuncionario;

    @JsonProperty(value="verdatospersona")
    private Boolean logInformacionAsesorVerDatosPersona;

    @JsonProperty(value="verdocspersona")
    private Boolean logInformacionAsesorVerDocsPersona;

    @JsonProperty(value="vercontratonovedad")
    private Boolean logInformacionAsesorVerContratoNovedad;

    @JsonProperty(value="accesovalidadorusuarios")
    private Boolean logInformacionAsesorAccesoValidadorUsuarios;

    private Asesor asesor;

    /**
     * Gets the value of attribute id_LogInformacionAsesor
     */
    public Long getLogInformacionAsesoridLogInformacionAsesor() {
        return logInformacionAsesoridLogInformacionAsesor;
    }
    
    /**
     * Sets the value of attribute id_LogInformacionAsesor
     */
    public void setLogInformacionAsesoridLogInformacionAsesor(Long logInformacionAsesoridLogInformacionAsesor) {
        this.logInformacionAsesoridLogInformacionAsesor = logInformacionAsesoridLogInformacionAsesor;
    }

    /**
     * Gets the value of attribute FechaHora
     */
    public Timestamp getLogInformacionAsesorFechaHora() {
        return logInformacionAsesorFechaHora;
    }
    
    /**
     * Sets the value of attribute FechaHora
     */
    public void setLogInformacionAsesorFechaHora(Timestamp logInformacionAsesorFechaHora) {
        this.logInformacionAsesorFechaHora = logInformacionAsesorFechaHora;
    }

    /**
     * Gets the value of attribute LoginFuncionario
     */
    public String getLogInformacionAsesorLoginFuncionario() {
        return logInformacionAsesorLoginFuncionario;
    }
    
    /**
     * Sets the value of attribute LoginFuncionario
     */
    public void setLogInformacionAsesorLoginFuncionario(String logInformacionAsesorLoginFuncionario) {
        this.logInformacionAsesorLoginFuncionario = logInformacionAsesorLoginFuncionario;
    }

    /**
     * Gets the value of attribute VerDatosPersona
     */
    public Boolean getLogInformacionAsesorVerDatosPersona() {
        return logInformacionAsesorVerDatosPersona;
    }
    
    /**
     * Sets the value of attribute VerDatosPersona
     */
    public void setLogInformacionAsesorVerDatosPersona(Boolean logInformacionAsesorVerDatosPersona) {
        this.logInformacionAsesorVerDatosPersona = logInformacionAsesorVerDatosPersona;
    }

    /**
     * Gets the value of attribute VerDocsPersona
     */
    public Boolean getLogInformacionAsesorVerDocsPersona() {
        return logInformacionAsesorVerDocsPersona;
    }
    
    /**
     * Sets the value of attribute VerDocsPersona
     */
    public void setLogInformacionAsesorVerDocsPersona(Boolean logInformacionAsesorVerDocsPersona) {
        this.logInformacionAsesorVerDocsPersona = logInformacionAsesorVerDocsPersona;
    }

    /**
     * Gets the value of attribute VerContratoNovedad
     */
    public Boolean getLogInformacionAsesorVerContratoNovedad() {
        return logInformacionAsesorVerContratoNovedad;
    }
    
    /**
     * Sets the value of attribute VerContratoNovedad
     */
    public void setLogInformacionAsesorVerContratoNovedad(Boolean logInformacionAsesorVerContratoNovedad) {
        this.logInformacionAsesorVerContratoNovedad = logInformacionAsesorVerContratoNovedad;
    }

    /**
     * Gets the value of attribute AccesoValidadorUsuarios
     */
    public Boolean getLogInformacionAsesorAccesoValidadorUsuarios() {
        return logInformacionAsesorAccesoValidadorUsuarios;
    }
    
    /**
     * Sets the value of attribute AccesoValidadorUsuarios
     */
    public void setLogInformacionAsesorAccesoValidadorUsuarios(Boolean logInformacionAsesorAccesoValidadorUsuarios) {
        this.logInformacionAsesorAccesoValidadorUsuarios = logInformacionAsesorAccesoValidadorUsuarios;
    }

    /**
     * Gets the value of relation through role Asesor
     */
    @JsonIgnore
    public Asesor getAsesor() {
        return asesor;
    }

    /**
     * Default constructor
     */
    public LogInformacionAsesor() {
        logInformacionAsesoridLogInformacionAsesor = null;
    }

    /**
     * Constructor used to create instances of <code>LogInformacionAsesor</code>.
     * @param oid Object Identifier of the instance of <code>LogInformacionAsesor</code> to be created.
     * @throws SystemException
     */
    public LogInformacionAsesor(LogInformacionAsesorOid oid) {
        if (oid != null && !oid.isNull()) {
            logInformacionAsesoridLogInformacionAsesor = oid.getLogInformacionAsesoridLogInformacionAsesor();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return LogInformacionAsesor.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        LogInformacionAsesor other = (LogInformacionAsesor)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getLogInformacionAsesoridLogInformacionAsesor(), other.getLogInformacionAsesoridLogInformacionAsesor());
        result &= Utilities.isEqual(this.getLogInformacionAsesorFechaHora(), other.getLogInformacionAsesorFechaHora());
        result &= Utilities.isEqual(this.getLogInformacionAsesorLoginFuncionario(), other.getLogInformacionAsesorLoginFuncionario());
        result &= Utilities.isEqual(this.getLogInformacionAsesorVerDatosPersona(), other.getLogInformacionAsesorVerDatosPersona());
        result &= Utilities.isEqual(this.getLogInformacionAsesorVerDocsPersona(), other.getLogInformacionAsesorVerDocsPersona());
        result &= Utilities.isEqual(this.getLogInformacionAsesorVerContratoNovedad(), other.getLogInformacionAsesorVerContratoNovedad());
        result &= Utilities.isEqual(this.getLogInformacionAsesorAccesoValidadorUsuarios(), other.getLogInformacionAsesorAccesoValidadorUsuarios());
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
     * Returns the <code>LogInformacionAsesorOid</code> object that identifies this instance of <code>LogInformacionAsesor</code>.
     * @return <code>LogInformacionAsesorOid</code> object that identifies this instance of <code>LogInformacionAsesor</code>
     */
	@Override
    public LogInformacionAsesorOid getOid() {
        return new LogInformacionAsesorOid(getLogInformacionAsesoridLogInformacionAsesor());
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
        if (!activeFacets.contains(Constants.LOGINFORMACIONASESOR)) {
            activeFacets.add(Constants.LOGINFORMACIONASESOR);
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
            relatedInstance = buildLogInformacionAsesorRelatedInstance(relatedInstanceJsonOid);
        }
        if (LogInformacionAsesorConstants.ROLE_NAME_ASESOR.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildLogInformacionAsesorRelatedInstance4Asesor(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildLogInformacionAsesorRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new LogInformacionAsesor(mapper.readValue(relatedInstanceJsonOid, LogInformacionAsesorOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogInformacionAsesor.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildLogInformacionAsesorRelatedInstance4Asesor(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Asesor(mapper.readValue(relatedInstanceJsonOid, AsesorOid.class)): Asesor.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogInformacionAsesor.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
