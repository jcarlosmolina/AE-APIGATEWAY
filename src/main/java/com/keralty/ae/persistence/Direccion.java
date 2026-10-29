package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.DireccionConstants;
import com.keralty.ae.persistence.oid.DepartamentoOid;
import com.keralty.ae.persistence.oid.DireccionOid;
import com.keralty.ae.persistence.oid.MunicipioOid;
import com.keralty.ae.persistence.oid.PaisOid;
import com.keralty.ae.persistence.oid.PersonaOid;
import com.keralty.ae.persistence.oid.SolicitudOid;
import com.keralty.ae.persistence.oid.TipoDireccionOid;
import com.keralty.ae.persistence.oid.TitularOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>Direccion</code> external model class.
 * <p>
 * External Model Class: <code>Direccion</code><br>
 */
public class Direccion extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="identificador")
    private Long direccionIdentificador;

    @JsonProperty(value="codigo")
    private Long direccionCodigo;

    @JsonProperty(value="direccioncompleta")
    private String direccionDireccionCompleta;

    @JsonProperty(value="rural")
    private Boolean direccionRural;

    private Persona persona;

    private TipoDireccion tipoDireccion;

    private Municipio municipio;

    private Departamento departamento;

    private Pais pais;

    private Solicitud contrato;

    private Titular titular;

    /**
     * Gets the value of attribute Identificador
     */
    public Long getDireccionIdentificador() {
        return direccionIdentificador;
    }
    
    /**
     * Sets the value of attribute Identificador
     */
    public void setDireccionIdentificador(Long direccionIdentificador) {
        this.direccionIdentificador = direccionIdentificador;
    }

    /**
     * Gets the value of attribute Codigo
     */
    public Long getDireccionCodigo() {
        return direccionCodigo;
    }
    
    /**
     * Sets the value of attribute Codigo
     */
    public void setDireccionCodigo(Long direccionCodigo) {
        this.direccionCodigo = direccionCodigo;
    }

    /**
     * Gets the value of attribute DireccionCompleta
     */
    public String getDireccionDireccionCompleta() {
        return direccionDireccionCompleta;
    }
    
    /**
     * Sets the value of attribute DireccionCompleta
     */
    public void setDireccionDireccionCompleta(String direccionDireccionCompleta) {
        this.direccionDireccionCompleta = direccionDireccionCompleta;
    }

    /**
     * Gets the value of attribute Rural
     */
    public Boolean getDireccionRural() {
        return direccionRural;
    }
    
    /**
     * Sets the value of attribute Rural
     */
    public void setDireccionRural(Boolean direccionRural) {
        this.direccionRural = direccionRural;
    }

    /**
     * Gets the value of relation through role Persona
     */
    @JsonIgnore
    public Persona getPersona() {
        return persona;
    }

    /**
     * Gets the value of relation through role TipoDireccion
     */
    @JsonIgnore
    public TipoDireccion getTipoDireccion() {
        return tipoDireccion;
    }

    /**
     * Gets the value of relation through role Municipio
     */
    @JsonIgnore
    public Municipio getMunicipio() {
        return municipio;
    }

    /**
     * Gets the value of relation through role Departamento
     */
    @JsonIgnore
    public Departamento getDepartamento() {
        return departamento;
    }

    /**
     * Gets the value of relation through role Pais
     */
    @JsonIgnore
    public Pais getPais() {
        return pais;
    }

    /**
     * Gets the value of relation through role Contrato
     */
    @JsonIgnore
    public Solicitud getContrato() {
        return contrato;
    }

    /**
     * Gets the value of relation through role Titular
     */
    @JsonIgnore
    public Titular getTitular() {
        return titular;
    }

    /**
     * Default constructor
     */
    public Direccion() {
        direccionIdentificador = null;
    }

    /**
     * Constructor used to create instances of <code>Direccion</code>.
     * @param oid Object Identifier of the instance of <code>Direccion</code> to be created.
     * @throws SystemException
     */
    public Direccion(DireccionOid oid) {
        if (oid != null && !oid.isNull()) {
            direccionIdentificador = oid.getDireccionIdentificador();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return Direccion.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Direccion other = (Direccion)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getDireccionIdentificador(), other.getDireccionIdentificador());
        result &= Utilities.isEqual(this.getDireccionCodigo(), other.getDireccionCodigo());
        result &= Utilities.isEqual(this.getDireccionDireccionCompleta(), other.getDireccionDireccionCompleta());
        result &= Utilities.isEqual(this.getDireccionRural(), other.getDireccionRural());
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
     * Returns the <code>DireccionOid</code> object that identifies this instance of <code>Direccion</code>.
     * @return <code>DireccionOid</code> object that identifies this instance of <code>Direccion</code>
     */
	@Override
    public DireccionOid getOid() {
        return new DireccionOid(getDireccionIdentificador());
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
        if (!activeFacets.contains(Constants.DIRECCION)) {
            activeFacets.add(Constants.DIRECCION);
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
            relatedInstance = buildDireccionRelatedInstance(relatedInstanceJsonOid);
        }
        if (DireccionConstants.ROLE_NAME_PERSONA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDireccionRelatedInstance4Persona(relatedInstanceJsonOid, remainingPath);
        }
        if (DireccionConstants.ROLE_NAME_TIPODIRECCION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDireccionRelatedInstance4TipoDireccion(relatedInstanceJsonOid, remainingPath);
        }
        if (DireccionConstants.ROLE_NAME_MUNICIPIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDireccionRelatedInstance4Municipio(relatedInstanceJsonOid, remainingPath);
        }
        if (DireccionConstants.ROLE_NAME_DEPARTAMENTO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDireccionRelatedInstance4Departamento(relatedInstanceJsonOid, remainingPath);
        }
        if (DireccionConstants.ROLE_NAME_PAIS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDireccionRelatedInstance4Pais(relatedInstanceJsonOid, remainingPath);
        }
        if (DireccionConstants.ROLE_NAME_CONTRATO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDireccionRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        if (DireccionConstants.ROLE_NAME_TITULAR.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDireccionRelatedInstance4Titular(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildDireccionRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Direccion(mapper.readValue(relatedInstanceJsonOid, DireccionOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Direccion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDireccionRelatedInstance4Persona(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Persona(mapper.readValue(relatedInstanceJsonOid, PersonaOid.class)): Persona.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Direccion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDireccionRelatedInstance4TipoDireccion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TipoDireccion(mapper.readValue(relatedInstanceJsonOid, TipoDireccionOid.class)): TipoDireccion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Direccion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDireccionRelatedInstance4Municipio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Municipio(mapper.readValue(relatedInstanceJsonOid, MunicipioOid.class)): Municipio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Direccion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDireccionRelatedInstance4Departamento(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Departamento(mapper.readValue(relatedInstanceJsonOid, DepartamentoOid.class)): Departamento.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Direccion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDireccionRelatedInstance4Pais(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Pais(mapper.readValue(relatedInstanceJsonOid, PaisOid.class)): Pais.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Direccion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDireccionRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Direccion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDireccionRelatedInstance4Titular(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Titular(mapper.readValue(relatedInstanceJsonOid, TitularOid.class)): Titular.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Direccion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
