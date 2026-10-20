package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.NovedadMDConstants;
import com.keralty.ae.persistence.oid.DepartamentoOid;
import com.keralty.ae.persistence.oid.FamiliaNovedadOid;
import com.keralty.ae.persistence.oid.MunicipioOid;
import com.keralty.ae.persistence.oid.NovedadMDOid;
import com.keralty.ae.persistence.oid.PaisOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>NovedadMD</code> external model class.
 * <p>
 * External Model Class: <code>NovedadMD</code><br>
 */
public class NovedadMD extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id_novedadmd")
    private Long novedadMDidNovedadMD;

    @JsonProperty(value="direccioncompleta")
    private String novedadMDDireccionCompleta;

    @JsonProperty(value="rural")
    private Boolean novedadMDRural;

    @JsonProperty(value="telefonofijo")
    private String novedadMDTelefonoFijo;

    @JsonProperty(value="telefonocelular")
    private String novedadMDTelefonoCelular;

    @JsonProperty(value="correoelectronico")
    private String novedadMDCorreoElectronico;

    private FamiliaNovedad familiaNovedad;

    private Pais pais;

    private Departamento departamento;

    private Municipio municipio;

    /**
     * Gets the value of attribute id_NovedadMD
     */
    public Long getNovedadMDidNovedadMD() {
        return novedadMDidNovedadMD;
    }
    
    /**
     * Sets the value of attribute id_NovedadMD
     */
    public void setNovedadMDidNovedadMD(Long novedadMDidNovedadMD) {
        this.novedadMDidNovedadMD = novedadMDidNovedadMD;
    }

    /**
     * Gets the value of attribute DireccionCompleta
     */
    public String getNovedadMDDireccionCompleta() {
        return novedadMDDireccionCompleta;
    }
    
    /**
     * Sets the value of attribute DireccionCompleta
     */
    public void setNovedadMDDireccionCompleta(String novedadMDDireccionCompleta) {
        this.novedadMDDireccionCompleta = novedadMDDireccionCompleta;
    }

    /**
     * Gets the value of attribute Rural
     */
    public Boolean getNovedadMDRural() {
        return novedadMDRural;
    }
    
    /**
     * Sets the value of attribute Rural
     */
    public void setNovedadMDRural(Boolean novedadMDRural) {
        this.novedadMDRural = novedadMDRural;
    }

    /**
     * Gets the value of attribute TelefonoFijo
     */
    public String getNovedadMDTelefonoFijo() {
        return novedadMDTelefonoFijo;
    }
    
    /**
     * Sets the value of attribute TelefonoFijo
     */
    public void setNovedadMDTelefonoFijo(String novedadMDTelefonoFijo) {
        this.novedadMDTelefonoFijo = novedadMDTelefonoFijo;
    }

    /**
     * Gets the value of attribute TelefonoCelular
     */
    public String getNovedadMDTelefonoCelular() {
        return novedadMDTelefonoCelular;
    }
    
    /**
     * Sets the value of attribute TelefonoCelular
     */
    public void setNovedadMDTelefonoCelular(String novedadMDTelefonoCelular) {
        this.novedadMDTelefonoCelular = novedadMDTelefonoCelular;
    }

    /**
     * Gets the value of attribute CorreoElectronico
     */
    public String getNovedadMDCorreoElectronico() {
        return novedadMDCorreoElectronico;
    }
    
    /**
     * Sets the value of attribute CorreoElectronico
     */
    public void setNovedadMDCorreoElectronico(String novedadMDCorreoElectronico) {
        this.novedadMDCorreoElectronico = novedadMDCorreoElectronico;
    }

    /**
     * Gets the value of relation through role FamiliaNovedad
     */
    @JsonIgnore
    public FamiliaNovedad getFamiliaNovedad() {
        return familiaNovedad;
    }

    /**
     * Gets the value of relation through role Pais
     */
    @JsonIgnore
    public Pais getPais() {
        return pais;
    }

    /**
     * Gets the value of relation through role Departamento
     */
    @JsonIgnore
    public Departamento getDepartamento() {
        return departamento;
    }

    /**
     * Gets the value of relation through role Municipio
     */
    @JsonIgnore
    public Municipio getMunicipio() {
        return municipio;
    }

    /**
     * Default constructor
     */
    public NovedadMD() {
        novedadMDidNovedadMD = null;
    }

    /**
     * Constructor used to create instances of <code>NovedadMD</code>.
     * @param oid Object Identifier of the instance of <code>NovedadMD</code> to be created.
     * @throws SystemException
     */
    public NovedadMD(NovedadMDOid oid) {
        if (oid != null && !oid.isNull()) {
            novedadMDidNovedadMD = oid.getNovedadMDidNovedadMD();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return NovedadMD.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        NovedadMD other = (NovedadMD)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getNovedadMDidNovedadMD(), other.getNovedadMDidNovedadMD());
        result &= Utilities.isEqual(this.getNovedadMDDireccionCompleta(), other.getNovedadMDDireccionCompleta());
        result &= Utilities.isEqual(this.getNovedadMDRural(), other.getNovedadMDRural());
        result &= Utilities.isEqual(this.getNovedadMDTelefonoFijo(), other.getNovedadMDTelefonoFijo());
        result &= Utilities.isEqual(this.getNovedadMDTelefonoCelular(), other.getNovedadMDTelefonoCelular());
        result &= Utilities.isEqual(this.getNovedadMDCorreoElectronico(), other.getNovedadMDCorreoElectronico());
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
     * Returns the <code>NovedadMDOid</code> object that identifies this instance of <code>NovedadMD</code>.
     * @return <code>NovedadMDOid</code> object that identifies this instance of <code>NovedadMD</code>
     */
	@Override
    public NovedadMDOid getOid() {
        return new NovedadMDOid(getNovedadMDidNovedadMD());
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
        if (!activeFacets.contains(Constants.NOVEDADMD)) {
            activeFacets.add(Constants.NOVEDADMD);
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
            relatedInstance = buildNovedadMDRelatedInstance(relatedInstanceJsonOid);
        }
        if (NovedadMDConstants.ROLE_NAME_FAMILIANOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildNovedadMDRelatedInstance4FamiliaNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (NovedadMDConstants.ROLE_NAME_PAIS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildNovedadMDRelatedInstance4Pais(relatedInstanceJsonOid, remainingPath);
        }
        if (NovedadMDConstants.ROLE_NAME_DEPARTAMENTO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildNovedadMDRelatedInstance4Departamento(relatedInstanceJsonOid, remainingPath);
        }
        if (NovedadMDConstants.ROLE_NAME_MUNICIPIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildNovedadMDRelatedInstance4Municipio(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildNovedadMDRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new NovedadMD(mapper.readValue(relatedInstanceJsonOid, NovedadMDOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(NovedadMD.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildNovedadMDRelatedInstance4FamiliaNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new FamiliaNovedad(mapper.readValue(relatedInstanceJsonOid, FamiliaNovedadOid.class)): FamiliaNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(NovedadMD.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildNovedadMDRelatedInstance4Pais(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Pais(mapper.readValue(relatedInstanceJsonOid, PaisOid.class)): Pais.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(NovedadMD.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildNovedadMDRelatedInstance4Departamento(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Departamento(mapper.readValue(relatedInstanceJsonOid, DepartamentoOid.class)): Departamento.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(NovedadMD.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildNovedadMDRelatedInstance4Municipio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Municipio(mapper.readValue(relatedInstanceJsonOid, MunicipioOid.class)): Municipio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(NovedadMD.class).error(e.getMessage());
            return null;
        }
    }
}
