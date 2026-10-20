package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.persistence.oid.LogContratoComboOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>LogContratoCombo</code> external model class.
 * <p>
 * External Model Class: <code>LogContratoCombo</code><br>
 */
public class LogContratoCombo extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id")
    private Long logContratoComboId;

    @JsonProperty(value="fecha")
    private Timestamp logContratoComboFecha;

    @JsonProperty(value="loginfuncionario")
    private String logContratoComboLoginFuncionario;

    @JsonProperty(value="contratointegral")
    private String logContratoComboContratoIntegral;

    @JsonProperty(value="contratoodontologico")
    private String logContratoComboContratoOdontologico;

    @JsonProperty(value="accion")
    private String logContratoComboAccion;

    /**
     * Gets the value of attribute Id
     */
    public Long getLogContratoComboId() {
        return logContratoComboId;
    }
    
    /**
     * Sets the value of attribute Id
     */
    public void setLogContratoComboId(Long logContratoComboId) {
        this.logContratoComboId = logContratoComboId;
    }

    /**
     * Gets the value of attribute Fecha
     */
    public Timestamp getLogContratoComboFecha() {
        return logContratoComboFecha;
    }
    
    /**
     * Sets the value of attribute Fecha
     */
    public void setLogContratoComboFecha(Timestamp logContratoComboFecha) {
        this.logContratoComboFecha = logContratoComboFecha;
    }

    /**
     * Gets the value of attribute LoginFuncionario
     */
    public String getLogContratoComboLoginFuncionario() {
        return logContratoComboLoginFuncionario;
    }
    
    /**
     * Sets the value of attribute LoginFuncionario
     */
    public void setLogContratoComboLoginFuncionario(String logContratoComboLoginFuncionario) {
        this.logContratoComboLoginFuncionario = logContratoComboLoginFuncionario;
    }

    /**
     * Gets the value of attribute ContratoIntegral
     */
    public String getLogContratoComboContratoIntegral() {
        return logContratoComboContratoIntegral;
    }
    
    /**
     * Sets the value of attribute ContratoIntegral
     */
    public void setLogContratoComboContratoIntegral(String logContratoComboContratoIntegral) {
        this.logContratoComboContratoIntegral = logContratoComboContratoIntegral;
    }

    /**
     * Gets the value of attribute ContratoOdontologico
     */
    public String getLogContratoComboContratoOdontologico() {
        return logContratoComboContratoOdontologico;
    }
    
    /**
     * Sets the value of attribute ContratoOdontologico
     */
    public void setLogContratoComboContratoOdontologico(String logContratoComboContratoOdontologico) {
        this.logContratoComboContratoOdontologico = logContratoComboContratoOdontologico;
    }

    /**
     * Gets the value of attribute Accion
     */
    public String getLogContratoComboAccion() {
        return logContratoComboAccion;
    }
    
    /**
     * Sets the value of attribute Accion
     */
    public void setLogContratoComboAccion(String logContratoComboAccion) {
        this.logContratoComboAccion = logContratoComboAccion;
    }

    /**
     * Default constructor
     */
    public LogContratoCombo() {
        logContratoComboId = null;
    }

    /**
     * Constructor used to create instances of <code>LogContratoCombo</code>.
     * @param oid Object Identifier of the instance of <code>LogContratoCombo</code> to be created.
     * @throws SystemException
     */
    public LogContratoCombo(LogContratoComboOid oid) {
        if (oid != null && !oid.isNull()) {
            logContratoComboId = oid.getLogContratoComboId();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return LogContratoCombo.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        LogContratoCombo other = (LogContratoCombo)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getLogContratoComboId(), other.getLogContratoComboId());
        result &= Utilities.isEqual(this.getLogContratoComboFecha(), other.getLogContratoComboFecha());
        result &= Utilities.isEqual(this.getLogContratoComboLoginFuncionario(), other.getLogContratoComboLoginFuncionario());
        result &= Utilities.isEqual(this.getLogContratoComboContratoIntegral(), other.getLogContratoComboContratoIntegral());
        result &= Utilities.isEqual(this.getLogContratoComboContratoOdontologico(), other.getLogContratoComboContratoOdontologico());
        result &= Utilities.isEqual(this.getLogContratoComboAccion(), other.getLogContratoComboAccion());
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
     * Returns the <code>LogContratoComboOid</code> object that identifies this instance of <code>LogContratoCombo</code>.
     * @return <code>LogContratoComboOid</code> object that identifies this instance of <code>LogContratoCombo</code>
     */
	@Override
    public LogContratoComboOid getOid() {
        return new LogContratoComboOid(getLogContratoComboId());
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
        if (!activeFacets.contains(Constants.LOGCONTRATOCOMBO)) {
            activeFacets.add(Constants.LOGCONTRATOCOMBO);
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
            relatedInstance = buildLogContratoComboRelatedInstance(relatedInstanceJsonOid);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildLogContratoComboRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new LogContratoCombo(mapper.readValue(relatedInstanceJsonOid, LogContratoComboOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(LogContratoCombo.class).error(e.getMessage());
            return null;
        }
    }
}
