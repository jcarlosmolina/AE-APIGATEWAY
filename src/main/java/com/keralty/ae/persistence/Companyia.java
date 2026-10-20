package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.CompanyiaConstants;
import com.keralty.ae.global.Constants;
import com.keralty.ae.persistence.oid.BeneficiarioCOid;
import com.keralty.ae.persistence.oid.CompanyiaOid;
import com.keralty.ae.persistence.oid.UsuarioOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>Companyia</code> external model class.
 * <p>
 * External Model Class: <code>Companyia</code><br>
 */
public class Companyia extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="codigo")
    private Long companyiaCodigo;

    @JsonProperty(value="nombre")
    private String companyiaNombre;

    @JsonProperty(value="esdemp")
    private Boolean companyiaEsDeMP;

    private Collection <Usuario> atributosUsuario;

    private Collection <BeneficiarioC> beneficiariosC;

    /**
     * Gets the value of attribute Codigo
     */
    public Long getCompanyiaCodigo() {
        return companyiaCodigo;
    }
    
    /**
     * Sets the value of attribute Codigo
     */
    public void setCompanyiaCodigo(Long companyiaCodigo) {
        this.companyiaCodigo = companyiaCodigo;
    }

    /**
     * Gets the value of attribute Nombre
     */
    public String getCompanyiaNombre() {
        return companyiaNombre;
    }
    
    /**
     * Sets the value of attribute Nombre
     */
    public void setCompanyiaNombre(String companyiaNombre) {
        this.companyiaNombre = companyiaNombre;
    }

    /**
     * Gets the value of attribute EsDeMP
     */
    public Boolean getCompanyiaEsDeMP() {
        return companyiaEsDeMP;
    }
    
    /**
     * Sets the value of attribute EsDeMP
     */
    public void setCompanyiaEsDeMP(Boolean companyiaEsDeMP) {
        this.companyiaEsDeMP = companyiaEsDeMP;
    }

    /**
     * Gets the value of relation through role AtributosUsuario
     */
    @JsonIgnore
    public Collection <Usuario> getAtributosUsuario() {
        return atributosUsuario;
    }

    /**
     * Gets the value of relation through role BeneficiariosC
     */
    @JsonIgnore
    public Collection <BeneficiarioC> getBeneficiariosC() {
        return beneficiariosC;
    }

    /**
     * Default constructor
     */
    public Companyia() {
        companyiaCodigo = null;
    }

    /**
     * Constructor used to create instances of <code>Companyia</code>.
     * @param oid Object Identifier of the instance of <code>Companyia</code> to be created.
     * @throws SystemException
     */
    public Companyia(CompanyiaOid oid) {
        if (oid != null && !oid.isNull()) {
            companyiaCodigo = oid.getCompanyiaCodigo();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return Companyia.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Companyia other = (Companyia)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getCompanyiaCodigo(), other.getCompanyiaCodigo());
        result &= Utilities.isEqual(this.getCompanyiaNombre(), other.getCompanyiaNombre());
        result &= Utilities.isEqual(this.getCompanyiaEsDeMP(), other.getCompanyiaEsDeMP());
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
     * Returns the <code>CompanyiaOid</code> object that identifies this instance of <code>Companyia</code>.
     * @return <code>CompanyiaOid</code> object that identifies this instance of <code>Companyia</code>
     */
	@Override
    public CompanyiaOid getOid() {
        return new CompanyiaOid(getCompanyiaCodigo());
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
        if (!activeFacets.contains(Constants.COMPANYIA)) {
            activeFacets.add(Constants.COMPANYIA);
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
            relatedInstance = buildCompanyiaRelatedInstance(relatedInstanceJsonOid);
        }
        if (CompanyiaConstants.ROLE_NAME_ATRIBUTOSUSUARIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildCompanyiaRelatedInstance4Usuario(relatedInstanceJsonOid, remainingPath);
        }
        if (CompanyiaConstants.ROLE_NAME_BENEFICIARIOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildCompanyiaRelatedInstance4BeneficiarioC(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildCompanyiaRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Companyia(mapper.readValue(relatedInstanceJsonOid, CompanyiaOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Companyia.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildCompanyiaRelatedInstance4Usuario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Usuario(mapper.readValue(relatedInstanceJsonOid, UsuarioOid.class)): Usuario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Companyia.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildCompanyiaRelatedInstance4BeneficiarioC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new BeneficiarioC(mapper.readValue(relatedInstanceJsonOid, BeneficiarioCOid.class)): BeneficiarioC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Companyia.class).error(e.getMessage());
            return null;
        }
    }
}
