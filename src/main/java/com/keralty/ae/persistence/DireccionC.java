package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.DireccionCConstants;
import com.keralty.ae.persistence.oid.ContratoCOid;
import com.keralty.ae.persistence.oid.DepartamentoOid;
import com.keralty.ae.persistence.oid.DireccionCOid;
import com.keralty.ae.persistence.oid.MunicipioOid;
import com.keralty.ae.persistence.oid.PaisOid;
import com.keralty.ae.persistence.oid.PersonaCOid;
import com.keralty.ae.persistence.oid.TelefonoCOid;
import com.keralty.ae.persistence.oid.TipoDireccionOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>DireccionC</code> external model class.
 * <p>
 * External Model Class: <code>DireccionC</code><br>
 */
public class DireccionC extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="codigo")
    private Long direccionCCodigo;

    @JsonProperty(value="direccioncompleta")
    private String direccionCDireccionCompleta;

    @JsonProperty(value="localidad")
    private String direccionCLocalidad;

    @JsonProperty(value="drvciudad")
    private String direccionCdrvCiudad;

    @JsonProperty(value="drvtienedepartamento")
    private Boolean direccionCdrvTieneDepartamento;

    @JsonProperty(value="drvtienemunicipio")
    private Boolean direccionCdrvTieneMunicipio;

    private Collection <TelefonoC> telefonosC;

    private PersonaC personaC;

    private ContratoC contratoC;

    private TipoDireccion tipoDireccionC;

    private Departamento departamentoC;

    private Municipio municipioC;

    private Pais paisC;

    /**
     * Gets the value of attribute Codigo
     */
    public Long getDireccionCCodigo() {
        return direccionCCodigo;
    }
    
    /**
     * Sets the value of attribute Codigo
     */
    public void setDireccionCCodigo(Long direccionCCodigo) {
        this.direccionCCodigo = direccionCCodigo;
    }

    /**
     * Gets the value of attribute DireccionCompleta
     */
    public String getDireccionCDireccionCompleta() {
        return direccionCDireccionCompleta;
    }
    
    /**
     * Sets the value of attribute DireccionCompleta
     */
    public void setDireccionCDireccionCompleta(String direccionCDireccionCompleta) {
        this.direccionCDireccionCompleta = direccionCDireccionCompleta;
    }

    /**
     * Gets the value of attribute Localidad
     */
    public String getDireccionCLocalidad() {
        return direccionCLocalidad;
    }
    
    /**
     * Sets the value of attribute Localidad
     */
    public void setDireccionCLocalidad(String direccionCLocalidad) {
        this.direccionCLocalidad = direccionCLocalidad;
    }

    /**
     * Gets the value of attribute drvCiudad
     */
    public String getDireccionCdrvCiudad() {
        return direccionCdrvCiudad;
    }
    
    /**
     * Sets the value of attribute drvCiudad
     */
    public void setDireccionCdrvCiudad(String direccionCdrvCiudad) {
        this.direccionCdrvCiudad = direccionCdrvCiudad;
    }

    /**
     * Gets the value of attribute drvTieneDepartamento
     */
    public Boolean getDireccionCdrvTieneDepartamento() {
        return direccionCdrvTieneDepartamento;
    }
    
    /**
     * Sets the value of attribute drvTieneDepartamento
     */
    public void setDireccionCdrvTieneDepartamento(Boolean direccionCdrvTieneDepartamento) {
        this.direccionCdrvTieneDepartamento = direccionCdrvTieneDepartamento;
    }

    /**
     * Gets the value of attribute drvTieneMunicipio
     */
    public Boolean getDireccionCdrvTieneMunicipio() {
        return direccionCdrvTieneMunicipio;
    }
    
    /**
     * Sets the value of attribute drvTieneMunicipio
     */
    public void setDireccionCdrvTieneMunicipio(Boolean direccionCdrvTieneMunicipio) {
        this.direccionCdrvTieneMunicipio = direccionCdrvTieneMunicipio;
    }

    /**
     * Gets the value of relation through role TelefonosC
     */
    @JsonIgnore
    public Collection <TelefonoC> getTelefonosC() {
        return telefonosC;
    }

    /**
     * Gets the value of relation through role PersonaC
     */
    @JsonIgnore
    public PersonaC getPersonaC() {
        return personaC;
    }

    /**
     * Gets the value of relation through role ContratoC
     */
    @JsonIgnore
    public ContratoC getContratoC() {
        return contratoC;
    }

    /**
     * Gets the value of relation through role TipoDireccionC
     */
    @JsonIgnore
    public TipoDireccion getTipoDireccionC() {
        return tipoDireccionC;
    }

    /**
     * Gets the value of relation through role DepartamentoC
     */
    @JsonIgnore
    public Departamento getDepartamentoC() {
        return departamentoC;
    }

    /**
     * Gets the value of relation through role MunicipioC
     */
    @JsonIgnore
    public Municipio getMunicipioC() {
        return municipioC;
    }

    /**
     * Gets the value of relation through role PaisC
     */
    @JsonIgnore
    public Pais getPaisC() {
        return paisC;
    }

    /**
     * Default constructor
     */
    public DireccionC() {
        direccionCCodigo = null;
    }

    /**
     * Constructor used to create instances of <code>DireccionC</code>.
     * @param oid Object Identifier of the instance of <code>DireccionC</code> to be created.
     * @throws SystemException
     */
    public DireccionC(DireccionCOid oid) {
        if (oid != null && !oid.isNull()) {
            direccionCCodigo = oid.getDireccionCCodigo();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return DireccionC.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        DireccionC other = (DireccionC)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getDireccionCCodigo(), other.getDireccionCCodigo());
        result &= Utilities.isEqual(this.getDireccionCDireccionCompleta(), other.getDireccionCDireccionCompleta());
        result &= Utilities.isEqual(this.getDireccionCLocalidad(), other.getDireccionCLocalidad());
        result &= Utilities.isEqual(this.getDireccionCdrvCiudad(), other.getDireccionCdrvCiudad());
        result &= Utilities.isEqual(this.getDireccionCdrvTieneDepartamento(), other.getDireccionCdrvTieneDepartamento());
        result &= Utilities.isEqual(this.getDireccionCdrvTieneMunicipio(), other.getDireccionCdrvTieneMunicipio());
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
     * Returns the <code>DireccionCOid</code> object that identifies this instance of <code>DireccionC</code>.
     * @return <code>DireccionCOid</code> object that identifies this instance of <code>DireccionC</code>
     */
	@Override
    public DireccionCOid getOid() {
        return new DireccionCOid(getDireccionCCodigo());
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
        if (!activeFacets.contains(Constants.DIRECCIONC)) {
            activeFacets.add(Constants.DIRECCIONC);
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
            relatedInstance = buildDireccionCRelatedInstance(relatedInstanceJsonOid);
        }
        if (DireccionCConstants.ROLE_NAME_TELEFONOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDireccionCRelatedInstance4TelefonoC(relatedInstanceJsonOid, remainingPath);
        }
        if (DireccionCConstants.ROLE_NAME_PERSONAC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDireccionCRelatedInstance4PersonaC(relatedInstanceJsonOid, remainingPath);
        }
        if (DireccionCConstants.ROLE_NAME_CONTRATOC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDireccionCRelatedInstance4ContratoC(relatedInstanceJsonOid, remainingPath);
        }
        if (DireccionCConstants.ROLE_NAME_TIPODIRECCIONC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDireccionCRelatedInstance4TipoDireccion(relatedInstanceJsonOid, remainingPath);
        }
        if (DireccionCConstants.ROLE_NAME_DEPARTAMENTOC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDireccionCRelatedInstance4Departamento(relatedInstanceJsonOid, remainingPath);
        }
        if (DireccionCConstants.ROLE_NAME_MUNICIPIOC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDireccionCRelatedInstance4Municipio(relatedInstanceJsonOid, remainingPath);
        }
        if (DireccionCConstants.ROLE_NAME_PAISC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDireccionCRelatedInstance4Pais(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildDireccionCRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new DireccionC(mapper.readValue(relatedInstanceJsonOid, DireccionCOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DireccionC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDireccionCRelatedInstance4TelefonoC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TelefonoC(mapper.readValue(relatedInstanceJsonOid, TelefonoCOid.class)): TelefonoC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DireccionC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDireccionCRelatedInstance4PersonaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PersonaC(mapper.readValue(relatedInstanceJsonOid, PersonaCOid.class)): PersonaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DireccionC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDireccionCRelatedInstance4ContratoC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ContratoC(mapper.readValue(relatedInstanceJsonOid, ContratoCOid.class)): ContratoC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DireccionC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDireccionCRelatedInstance4TipoDireccion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TipoDireccion(mapper.readValue(relatedInstanceJsonOid, TipoDireccionOid.class)): TipoDireccion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DireccionC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDireccionCRelatedInstance4Departamento(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Departamento(mapper.readValue(relatedInstanceJsonOid, DepartamentoOid.class)): Departamento.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DireccionC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDireccionCRelatedInstance4Municipio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Municipio(mapper.readValue(relatedInstanceJsonOid, MunicipioOid.class)): Municipio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DireccionC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDireccionCRelatedInstance4Pais(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Pais(mapper.readValue(relatedInstanceJsonOid, PaisOid.class)): Pais.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DireccionC.class).error(e.getMessage());
            return null;
        }
    }
}
