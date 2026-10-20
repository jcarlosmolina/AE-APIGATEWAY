package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.PreexistenciaCConstants;
import com.keralty.ae.persistence.oid.PersonaCOid;
import com.keralty.ae.persistence.oid.PreexistenciaCOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>PreexistenciaC</code> external model class.
 * <p>
 * External Model Class: <code>PreexistenciaC</code><br>
 */
public class PreexistenciaC extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id")
    private Long personaCID;

    @JsonProperty(value="identificador")
    private Long preexistenciaCIdentificador;

    @JsonProperty(value="descripcion")
    private String preexistenciaCDescripcion;

    @JsonProperty(value="fecinicio")
    private Date preexistenciaCFecInicio;

    @JsonProperty(value="fecfin")
    private Date preexistenciaCFecFin;

    @JsonProperty(value="observacion")
    private String preexistenciaCObservacion;

    private PersonaC personaC;

    /**
     * Gets the value of attribute ID
     */
    public Long getPersonaCID() {
        return personaCID;
    }
    
    /**
     * Sets the value of attribute ID
     */
    public void setPersonaCID(Long personaCID) {
        this.personaCID = personaCID;
    }

    /**
     * Gets the value of attribute Identificador
     */
    public Long getPreexistenciaCIdentificador() {
        return preexistenciaCIdentificador;
    }
    
    /**
     * Sets the value of attribute Identificador
     */
    public void setPreexistenciaCIdentificador(Long preexistenciaCIdentificador) {
        this.preexistenciaCIdentificador = preexistenciaCIdentificador;
    }

    /**
     * Gets the value of attribute Descripcion
     */
    public String getPreexistenciaCDescripcion() {
        return preexistenciaCDescripcion;
    }
    
    /**
     * Sets the value of attribute Descripcion
     */
    public void setPreexistenciaCDescripcion(String preexistenciaCDescripcion) {
        this.preexistenciaCDescripcion = preexistenciaCDescripcion;
    }

    /**
     * Gets the value of attribute FecInicio
     */
    public Date getPreexistenciaCFecInicio() {
        return preexistenciaCFecInicio;
    }
    
    /**
     * Sets the value of attribute FecInicio
     */
    public void setPreexistenciaCFecInicio(Date preexistenciaCFecInicio) {
        this.preexistenciaCFecInicio = preexistenciaCFecInicio;
    }

    /**
     * Gets the value of attribute FecFin
     */
    public Date getPreexistenciaCFecFin() {
        return preexistenciaCFecFin;
    }
    
    /**
     * Sets the value of attribute FecFin
     */
    public void setPreexistenciaCFecFin(Date preexistenciaCFecFin) {
        this.preexistenciaCFecFin = preexistenciaCFecFin;
    }

    /**
     * Gets the value of attribute Observacion
     */
    public String getPreexistenciaCObservacion() {
        return preexistenciaCObservacion;
    }
    
    /**
     * Sets the value of attribute Observacion
     */
    public void setPreexistenciaCObservacion(String preexistenciaCObservacion) {
        this.preexistenciaCObservacion = preexistenciaCObservacion;
    }

    /**
     * Gets the value of relation through role PersonaC
     */
    @JsonIgnore
    public PersonaC getPersonaC() {
        return personaC;
    }

    /**
     * Default constructor
     */
    public PreexistenciaC() {
        personaCID = null;
        preexistenciaCIdentificador = null;
    }

    /**
     * Constructor used to create instances of <code>PreexistenciaC</code>.
     * @param oid Object Identifier of the instance of <code>PreexistenciaC</code> to be created.
     * @throws SystemException
     */
    public PreexistenciaC(PreexistenciaCOid oid) {
        if (oid != null && !oid.isNull()) {
            personaCID = oid.getPersonaCID();
            preexistenciaCIdentificador = oid.getPreexistenciaCIdentificador();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return PreexistenciaC.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        PreexistenciaC other = (PreexistenciaC)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getPreexistenciaCIdentificador(), other.getPreexistenciaCIdentificador());
        result &= Utilities.isEqual(this.getPreexistenciaCDescripcion(), other.getPreexistenciaCDescripcion());
        result &= Utilities.isEqual(this.getPreexistenciaCFecInicio(), other.getPreexistenciaCFecInicio());
        result &= Utilities.isEqual(this.getPreexistenciaCFecFin(), other.getPreexistenciaCFecFin());
        result &= Utilities.isEqual(this.getPreexistenciaCObservacion(), other.getPreexistenciaCObservacion());
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
     * Returns the <code>PreexistenciaCOid</code> object that identifies this instance of <code>PreexistenciaC</code>.
     * @return <code>PreexistenciaCOid</code> object that identifies this instance of <code>PreexistenciaC</code>
     */
	@Override
    public PreexistenciaCOid getOid() {
        return new PreexistenciaCOid(getPersonaCID(), getPreexistenciaCIdentificador());
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
        if (!activeFacets.contains(Constants.PREEXISTENCIAC)) {
            activeFacets.add(Constants.PREEXISTENCIAC);
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
            relatedInstance = buildPreexistenciaCRelatedInstance(relatedInstanceJsonOid);
        }
        if (PreexistenciaCConstants.ROLE_NAME_PERSONAC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPreexistenciaCRelatedInstance4PersonaC(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildPreexistenciaCRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new PreexistenciaC(mapper.readValue(relatedInstanceJsonOid, PreexistenciaCOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PreexistenciaC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPreexistenciaCRelatedInstance4PersonaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PersonaC(mapper.readValue(relatedInstanceJsonOid, PersonaCOid.class)): PersonaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PreexistenciaC.class).error(e.getMessage());
            return null;
        }
    }
}
