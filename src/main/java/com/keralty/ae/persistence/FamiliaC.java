package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.FamiliaCConstants;
import com.keralty.ae.persistence.oid.BeneficiarioCOid;
import com.keralty.ae.persistence.oid.ContratoCOid;
import com.keralty.ae.persistence.oid.FamiliaCOid;
import com.keralty.ae.persistence.oid.MunicipioOid;
import com.keralty.ae.persistence.oid.PersonaCOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>FamiliaC</code> external model class.
 * <p>
 * External Model Class: <code>FamiliaC</code><br>
 */
public class FamiliaC extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="contratoc_id")
    private Long contratoCContratoCID;

    @JsonProperty(value="id")
    private Long familiaCID;

    @JsonProperty(value="numfamilia")
    private String familiaCNumFamilia;

    @JsonProperty(value="titularconbeneficios")
    private Boolean familiaCTitularConBeneficios;

    @JsonProperty(value="estadotitularfamilia")
    private String familiaCEstadoTitularFamilia;

    @JsonProperty(value="fechafinvigencia")
    private Date familiaCFechaFinVigencia;

    @JsonProperty(value="direccioncorrespondencia")
    private String familiaCdireccionCorrespondencia;

    private PersonaC personaCTitular;

    private Collection <BeneficiarioC> beneficiariosC;

    private ContratoC contratoC;

    private Municipio municipioC;

    /**
     * Gets the value of attribute ID
     */
    public Long getContratoCContratoCID() {
        return contratoCContratoCID;
    }
    
    /**
     * Sets the value of attribute ID
     */
    public void setContratoCContratoCID(Long contratoCContratoCID) {
        this.contratoCContratoCID = contratoCContratoCID;
    }

    /**
     * Gets the value of attribute ID
     */
    public Long getFamiliaCID() {
        return familiaCID;
    }
    
    /**
     * Sets the value of attribute ID
     */
    public void setFamiliaCID(Long familiaCID) {
        this.familiaCID = familiaCID;
    }

    /**
     * Gets the value of attribute NumFamilia
     */
    public String getFamiliaCNumFamilia() {
        return familiaCNumFamilia;
    }
    
    /**
     * Sets the value of attribute NumFamilia
     */
    public void setFamiliaCNumFamilia(String familiaCNumFamilia) {
        this.familiaCNumFamilia = familiaCNumFamilia;
    }

    /**
     * Gets the value of attribute TitularConBeneficios
     */
    public Boolean getFamiliaCTitularConBeneficios() {
        return familiaCTitularConBeneficios;
    }
    
    /**
     * Sets the value of attribute TitularConBeneficios
     */
    public void setFamiliaCTitularConBeneficios(Boolean familiaCTitularConBeneficios) {
        this.familiaCTitularConBeneficios = familiaCTitularConBeneficios;
    }

    /**
     * Gets the value of attribute EstadoTitularFamilia
     */
    public String getFamiliaCEstadoTitularFamilia() {
        return familiaCEstadoTitularFamilia;
    }
    
    /**
     * Sets the value of attribute EstadoTitularFamilia
     */
    public void setFamiliaCEstadoTitularFamilia(String familiaCEstadoTitularFamilia) {
        this.familiaCEstadoTitularFamilia = familiaCEstadoTitularFamilia;
    }

    /**
     * Gets the value of attribute FechaFinVigencia
     */
    public Date getFamiliaCFechaFinVigencia() {
        return familiaCFechaFinVigencia;
    }
    
    /**
     * Sets the value of attribute FechaFinVigencia
     */
    public void setFamiliaCFechaFinVigencia(Date familiaCFechaFinVigencia) {
        this.familiaCFechaFinVigencia = familiaCFechaFinVigencia;
    }

    /**
     * Gets the value of attribute direccionCorrespondencia
     */
    public String getFamiliaCdireccionCorrespondencia() {
        return familiaCdireccionCorrespondencia;
    }
    
    /**
     * Sets the value of attribute direccionCorrespondencia
     */
    public void setFamiliaCdireccionCorrespondencia(String familiaCdireccionCorrespondencia) {
        this.familiaCdireccionCorrespondencia = familiaCdireccionCorrespondencia;
    }

    /**
     * Gets the value of relation through role PersonaCTitular
     */
    @JsonIgnore
    public PersonaC getPersonaCTitular() {
        return personaCTitular;
    }

    /**
     * Gets the value of relation through role BeneficiariosC
     */
    @JsonIgnore
    public Collection <BeneficiarioC> getBeneficiariosC() {
        return beneficiariosC;
    }

    /**
     * Gets the value of relation through role ContratoC
     */
    @JsonIgnore
    public ContratoC getContratoC() {
        return contratoC;
    }

    /**
     * Gets the value of relation through role MunicipioC
     */
    @JsonIgnore
    public Municipio getMunicipioC() {
        return municipioC;
    }

    /**
     * Default constructor
     */
    public FamiliaC() {
        contratoCContratoCID = null;
        familiaCID = null;
    }

    /**
     * Constructor used to create instances of <code>FamiliaC</code>.
     * @param oid Object Identifier of the instance of <code>FamiliaC</code> to be created.
     * @throws SystemException
     */
    public FamiliaC(FamiliaCOid oid) {
        if (oid != null && !oid.isNull()) {
            contratoCContratoCID = oid.getContratoCContratoCID();
            familiaCID = oid.getFamiliaCID();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return FamiliaC.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        FamiliaC other = (FamiliaC)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getFamiliaCID(), other.getFamiliaCID());
        result &= Utilities.isEqual(this.getFamiliaCNumFamilia(), other.getFamiliaCNumFamilia());
        result &= Utilities.isEqual(this.getFamiliaCTitularConBeneficios(), other.getFamiliaCTitularConBeneficios());
        result &= Utilities.isEqual(this.getFamiliaCEstadoTitularFamilia(), other.getFamiliaCEstadoTitularFamilia());
        result &= Utilities.isEqual(this.getFamiliaCFechaFinVigencia(), other.getFamiliaCFechaFinVigencia());
        result &= Utilities.isEqual(this.getFamiliaCdireccionCorrespondencia(), other.getFamiliaCdireccionCorrespondencia());
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
     * Returns the <code>FamiliaCOid</code> object that identifies this instance of <code>FamiliaC</code>.
     * @return <code>FamiliaCOid</code> object that identifies this instance of <code>FamiliaC</code>
     */
	@Override
    public FamiliaCOid getOid() {
        return new FamiliaCOid(getContratoCContratoCID(), getFamiliaCID());
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
        if (!activeFacets.contains(Constants.FAMILIAC)) {
            activeFacets.add(Constants.FAMILIAC);
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
            relatedInstance = buildFamiliaCRelatedInstance(relatedInstanceJsonOid);
        }
        if (FamiliaCConstants.ROLE_NAME_PERSONACTITULAR.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFamiliaCRelatedInstance4PersonaC(relatedInstanceJsonOid, remainingPath);
        }
        if (FamiliaCConstants.ROLE_NAME_BENEFICIARIOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFamiliaCRelatedInstance4BeneficiarioC(relatedInstanceJsonOid, remainingPath);
        }
        if (FamiliaCConstants.ROLE_NAME_CONTRATOC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFamiliaCRelatedInstance4ContratoC(relatedInstanceJsonOid, remainingPath);
        }
        if (FamiliaCConstants.ROLE_NAME_MUNICIPIOC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFamiliaCRelatedInstance4Municipio(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildFamiliaCRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new FamiliaC(mapper.readValue(relatedInstanceJsonOid, FamiliaCOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(FamiliaC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildFamiliaCRelatedInstance4PersonaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PersonaC(mapper.readValue(relatedInstanceJsonOid, PersonaCOid.class)): PersonaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(FamiliaC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildFamiliaCRelatedInstance4BeneficiarioC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new BeneficiarioC(mapper.readValue(relatedInstanceJsonOid, BeneficiarioCOid.class)): BeneficiarioC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(FamiliaC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildFamiliaCRelatedInstance4ContratoC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ContratoC(mapper.readValue(relatedInstanceJsonOid, ContratoCOid.class)): ContratoC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(FamiliaC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildFamiliaCRelatedInstance4Municipio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Municipio(mapper.readValue(relatedInstanceJsonOid, MunicipioOid.class)): Municipio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(FamiliaC.class).error(e.getMessage());
            return null;
        }
    }
}
