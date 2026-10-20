package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.DepartamentoConstants;
import com.keralty.ae.persistence.oid.ContratanteOid;
import com.keralty.ae.persistence.oid.DepartamentoOid;
import com.keralty.ae.persistence.oid.DireccionCOid;
import com.keralty.ae.persistence.oid.DireccionOid;
import com.keralty.ae.persistence.oid.DirSucursalCOid;
import com.keralty.ae.persistence.oid.MunicipioOid;
import com.keralty.ae.persistence.oid.NovedadCTOid;
import com.keralty.ae.persistence.oid.NovedadMDOid;
import com.keralty.ae.persistence.oid.PersonaCOid;
import com.keralty.ae.persistence.oid.PersonaOid;
import com.keralty.ae.persistence.oid.TitularOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>Departamento</code> external model class.
 * <p>
 * External Model Class: <code>Departamento</code><br>
 */
public class Departamento extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="codigo")
    private Long departamentoCodigo;

    @JsonProperty(value="descripcion")
    private String departamentoDescripcion;

    @JsonProperty(value="codigolegal")
    private String departamentoCodigoLegal;

    private Collection <Persona> personas;

    private Collection <Municipio> municipios;

    private Collection <PersonaC> personasC;

    private Collection <DireccionC> direccionesC;

    private Collection <Direccion> direcciones;

    private Collection <Contratante> contratantes;

    private Collection <Contratante> contratantesRes;

    private Collection <DirSucursalC> dirSucursalC;

    private Collection <Titular> titulares;

    private Collection <NovedadCT> novedadCTNac;

    private Collection <NovedadCT> novedadCTRes;

    private Collection <NovedadMD> novedadesMD;

    /**
     * Gets the value of attribute Codigo
     */
    public Long getDepartamentoCodigo() {
        return departamentoCodigo;
    }
    
    /**
     * Sets the value of attribute Codigo
     */
    public void setDepartamentoCodigo(Long departamentoCodigo) {
        this.departamentoCodigo = departamentoCodigo;
    }

    /**
     * Gets the value of attribute Descripcion
     */
    public String getDepartamentoDescripcion() {
        return departamentoDescripcion;
    }
    
    /**
     * Sets the value of attribute Descripcion
     */
    public void setDepartamentoDescripcion(String departamentoDescripcion) {
        this.departamentoDescripcion = departamentoDescripcion;
    }

    /**
     * Gets the value of attribute CodigoLegal
     */
    public String getDepartamentoCodigoLegal() {
        return departamentoCodigoLegal;
    }
    
    /**
     * Sets the value of attribute CodigoLegal
     */
    public void setDepartamentoCodigoLegal(String departamentoCodigoLegal) {
        this.departamentoCodigoLegal = departamentoCodigoLegal;
    }

    /**
     * Gets the value of relation through role Personas
     */
    @JsonIgnore
    public Collection <Persona> getPersonas() {
        return personas;
    }

    /**
     * Gets the value of relation through role Municipios
     */
    @JsonIgnore
    public Collection <Municipio> getMunicipios() {
        return municipios;
    }

    /**
     * Gets the value of relation through role PersonasC
     */
    @JsonIgnore
    public Collection <PersonaC> getPersonasC() {
        return personasC;
    }

    /**
     * Gets the value of relation through role DireccionesC
     */
    @JsonIgnore
    public Collection <DireccionC> getDireccionesC() {
        return direccionesC;
    }

    /**
     * Gets the value of relation through role Direcciones
     */
    @JsonIgnore
    public Collection <Direccion> getDirecciones() {
        return direcciones;
    }

    /**
     * Gets the value of relation through role Contratantes
     */
    @JsonIgnore
    public Collection <Contratante> getContratantes() {
        return contratantes;
    }

    /**
     * Gets the value of relation through role ContratantesRes
     */
    @JsonIgnore
    public Collection <Contratante> getContratantesRes() {
        return contratantesRes;
    }

    /**
     * Gets the value of relation through role DirSucursalC
     */
    @JsonIgnore
    public Collection <DirSucursalC> getDirSucursalC() {
        return dirSucursalC;
    }

    /**
     * Gets the value of relation through role Titulares
     */
    @JsonIgnore
    public Collection <Titular> getTitulares() {
        return titulares;
    }

    /**
     * Gets the value of relation through role NovedadCTNac
     */
    @JsonIgnore
    public Collection <NovedadCT> getNovedadCTNac() {
        return novedadCTNac;
    }

    /**
     * Gets the value of relation through role NovedadCTRes
     */
    @JsonIgnore
    public Collection <NovedadCT> getNovedadCTRes() {
        return novedadCTRes;
    }

    /**
     * Gets the value of relation through role NovedadesMD
     */
    @JsonIgnore
    public Collection <NovedadMD> getNovedadesMD() {
        return novedadesMD;
    }

    /**
     * Default constructor
     */
    public Departamento() {
        departamentoCodigo = null;
    }

    /**
     * Constructor used to create instances of <code>Departamento</code>.
     * @param oid Object Identifier of the instance of <code>Departamento</code> to be created.
     * @throws SystemException
     */
    public Departamento(DepartamentoOid oid) {
        if (oid != null && !oid.isNull()) {
            departamentoCodigo = oid.getDepartamentoCodigo();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return Departamento.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Departamento other = (Departamento)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getDepartamentoCodigo(), other.getDepartamentoCodigo());
        result &= Utilities.isEqual(this.getDepartamentoDescripcion(), other.getDepartamentoDescripcion());
        result &= Utilities.isEqual(this.getDepartamentoCodigoLegal(), other.getDepartamentoCodigoLegal());
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
     * Returns the <code>DepartamentoOid</code> object that identifies this instance of <code>Departamento</code>.
     * @return <code>DepartamentoOid</code> object that identifies this instance of <code>Departamento</code>
     */
	@Override
    public DepartamentoOid getOid() {
        return new DepartamentoOid(getDepartamentoCodigo());
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
        if (!activeFacets.contains(Constants.DEPARTAMENTO)) {
            activeFacets.add(Constants.DEPARTAMENTO);
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
            relatedInstance = buildDepartamentoRelatedInstance(relatedInstanceJsonOid);
        }
        if (DepartamentoConstants.ROLE_NAME_PERSONAS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDepartamentoRelatedInstance4Persona(relatedInstanceJsonOid, remainingPath);
        }
        if (DepartamentoConstants.ROLE_NAME_MUNICIPIOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDepartamentoRelatedInstance4Municipio(relatedInstanceJsonOid, remainingPath);
        }
        if (DepartamentoConstants.ROLE_NAME_PERSONASC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDepartamentoRelatedInstance4PersonaC(relatedInstanceJsonOid, remainingPath);
        }
        if (DepartamentoConstants.ROLE_NAME_DIRECCIONESC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDepartamentoRelatedInstance4DireccionC(relatedInstanceJsonOid, remainingPath);
        }
        if (DepartamentoConstants.ROLE_NAME_DIRECCIONES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDepartamentoRelatedInstance4Direccion(relatedInstanceJsonOid, remainingPath);
        }
        if (DepartamentoConstants.ROLE_NAME_CONTRATANTES.equalsIgnoreCase(relatedInstancePathFirstItem) || DepartamentoConstants.ROLE_NAME_CONTRATANTESRES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDepartamentoRelatedInstance4Contratante(relatedInstanceJsonOid, remainingPath);
        }
        if (DepartamentoConstants.ROLE_NAME_DIRSUCURSALC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDepartamentoRelatedInstance4DirSucursalC(relatedInstanceJsonOid, remainingPath);
        }
        if (DepartamentoConstants.ROLE_NAME_TITULARES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDepartamentoRelatedInstance4Titular(relatedInstanceJsonOid, remainingPath);
        }
        if (DepartamentoConstants.ROLE_NAME_NOVEDADCTNAC.equalsIgnoreCase(relatedInstancePathFirstItem) || DepartamentoConstants.ROLE_NAME_NOVEDADCTRES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDepartamentoRelatedInstance4NovedadCT(relatedInstanceJsonOid, remainingPath);
        }
        if (DepartamentoConstants.ROLE_NAME_NOVEDADESMD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDepartamentoRelatedInstance4NovedadMD(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildDepartamentoRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Departamento(mapper.readValue(relatedInstanceJsonOid, DepartamentoOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Departamento.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDepartamentoRelatedInstance4Persona(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Persona(mapper.readValue(relatedInstanceJsonOid, PersonaOid.class)): Persona.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Departamento.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDepartamentoRelatedInstance4Municipio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Municipio(mapper.readValue(relatedInstanceJsonOid, MunicipioOid.class)): Municipio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Departamento.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDepartamentoRelatedInstance4PersonaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PersonaC(mapper.readValue(relatedInstanceJsonOid, PersonaCOid.class)): PersonaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Departamento.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDepartamentoRelatedInstance4DireccionC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new DireccionC(mapper.readValue(relatedInstanceJsonOid, DireccionCOid.class)): DireccionC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Departamento.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDepartamentoRelatedInstance4Direccion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Direccion(mapper.readValue(relatedInstanceJsonOid, DireccionOid.class)): Direccion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Departamento.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDepartamentoRelatedInstance4Contratante(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Contratante(mapper.readValue(relatedInstanceJsonOid, ContratanteOid.class)): Contratante.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Departamento.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDepartamentoRelatedInstance4DirSucursalC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new DirSucursalC(mapper.readValue(relatedInstanceJsonOid, DirSucursalCOid.class)): DirSucursalC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Departamento.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDepartamentoRelatedInstance4Titular(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Titular(mapper.readValue(relatedInstanceJsonOid, TitularOid.class)): Titular.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Departamento.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDepartamentoRelatedInstance4NovedadCT(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new NovedadCT(mapper.readValue(relatedInstanceJsonOid, NovedadCTOid.class)): NovedadCT.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Departamento.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDepartamentoRelatedInstance4NovedadMD(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new NovedadMD(mapper.readValue(relatedInstanceJsonOid, NovedadMDOid.class)): NovedadMD.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Departamento.class).error(e.getMessage());
            return null;
        }
    }
}
