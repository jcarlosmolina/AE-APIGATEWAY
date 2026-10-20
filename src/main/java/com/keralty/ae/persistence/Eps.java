package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.EpsConstants;
import com.keralty.ae.persistence.oid.BeneficiarioCOid;
import com.keralty.ae.persistence.oid.EpsOid;
import com.keralty.ae.persistence.oid.UsuarioOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>Eps</code> external model class.
 * <p>
 * External Model Class: <code>Eps</code><br>
 */
public class Eps extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="codigo")
    private Long epsCodigo;

    @JsonProperty(value="descripcion")
    private String epsDescripcion;

    @JsonProperty(value="epssanitas")
    private Boolean epsEpsSanitas;

    private Collection <Usuario> atributosUsuario;

    private Collection <BeneficiarioC> beneficiariosC;

    /**
     * Gets the value of attribute Codigo
     */
    public Long getEpsCodigo() {
        return epsCodigo;
    }
    
    /**
     * Sets the value of attribute Codigo
     */
    public void setEpsCodigo(Long epsCodigo) {
        this.epsCodigo = epsCodigo;
    }

    /**
     * Gets the value of attribute Descripcion
     */
    public String getEpsDescripcion() {
        return epsDescripcion;
    }
    
    /**
     * Sets the value of attribute Descripcion
     */
    public void setEpsDescripcion(String epsDescripcion) {
        this.epsDescripcion = epsDescripcion;
    }

    /**
     * Gets the value of attribute EpsSanitas
     */
    public Boolean getEpsEpsSanitas() {
        return epsEpsSanitas;
    }
    
    /**
     * Sets the value of attribute EpsSanitas
     */
    public void setEpsEpsSanitas(Boolean epsEpsSanitas) {
        this.epsEpsSanitas = epsEpsSanitas;
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
    public Eps() {
        epsCodigo = null;
    }

    /**
     * Constructor used to create instances of <code>Eps</code>.
     * @param oid Object Identifier of the instance of <code>Eps</code> to be created.
     * @throws SystemException
     */
    public Eps(EpsOid oid) {
        if (oid != null && !oid.isNull()) {
            epsCodigo = oid.getEpsCodigo();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return Eps.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Eps other = (Eps)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getEpsCodigo(), other.getEpsCodigo());
        result &= Utilities.isEqual(this.getEpsDescripcion(), other.getEpsDescripcion());
        result &= Utilities.isEqual(this.getEpsEpsSanitas(), other.getEpsEpsSanitas());
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
     * Returns the <code>EpsOid</code> object that identifies this instance of <code>Eps</code>.
     * @return <code>EpsOid</code> object that identifies this instance of <code>Eps</code>
     */
	@Override
    public EpsOid getOid() {
        return new EpsOid(getEpsCodigo());
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
        if (!activeFacets.contains(Constants.EPS)) {
            activeFacets.add(Constants.EPS);
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
            relatedInstance = buildEpsRelatedInstance(relatedInstanceJsonOid);
        }
        if (EpsConstants.ROLE_NAME_ATRIBUTOSUSUARIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildEpsRelatedInstance4Usuario(relatedInstanceJsonOid, remainingPath);
        }
        if (EpsConstants.ROLE_NAME_BENEFICIARIOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildEpsRelatedInstance4BeneficiarioC(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildEpsRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Eps(mapper.readValue(relatedInstanceJsonOid, EpsOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Eps.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildEpsRelatedInstance4Usuario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Usuario(mapper.readValue(relatedInstanceJsonOid, UsuarioOid.class)): Usuario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Eps.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildEpsRelatedInstance4BeneficiarioC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new BeneficiarioC(mapper.readValue(relatedInstanceJsonOid, BeneficiarioCOid.class)): BeneficiarioC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Eps.class).error(e.getMessage());
            return null;
        }
    }
}
