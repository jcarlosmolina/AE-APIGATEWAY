package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.MunicipioConstants;
import com.keralty.ae.persistence.oid.ContratanteOid;
import com.keralty.ae.persistence.oid.ContratoCOid;
import com.keralty.ae.persistence.oid.DepartamentoOid;
import com.keralty.ae.persistence.oid.DireccionCOid;
import com.keralty.ae.persistence.oid.DireccionOid;
import com.keralty.ae.persistence.oid.DirSucursalCOid;
import com.keralty.ae.persistence.oid.FamiliaCOid;
import com.keralty.ae.persistence.oid.InstitucionMatNeoOid;
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
 * Representation of the <code>Municipio</code> external model class.
 * <p>
 * External Model Class: <code>Municipio</code><br>
 */
public class Municipio extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="codigo")
    private Long municipioCodigo;

    @JsonProperty(value="descripcion")
    private String municipioDescripcion;

    @JsonProperty(value="codigolegal")
    private String municipioCodigoLegal;

    @JsonProperty(value="esvalidoeps")
    private Boolean municipioEsValidoEPS;

    @JsonProperty(value="aplicaiva")
    private Boolean municipioAplicaIVA;

    private Collection <Persona> personas;

    private Collection <PersonaC> personasC;

    private Collection <DireccionC> direccionesC;

    private Collection <Direccion> direcciones;

    private Collection <Contratante> contratantes;

    private Collection <Contratante> contratanteRes;

    private Collection <ContratoC> contratosC;

    private Collection <DirSucursalC> dirSucursalC;

    private Collection <FamiliaC> familiaC;

    private Collection <Titular> titulares;

    private Collection <InstitucionMatNeo> institucionMatNeo;

    private Collection <NovedadCT> novedadCTNac;

    private Collection <NovedadCT> novedadCTRes;

    private Collection <NovedadMD> novedadesMD;

    private Departamento departamento;

    /**
     * Gets the value of attribute Codigo
     */
    public Long getMunicipioCodigo() {
        return municipioCodigo;
    }
    
    /**
     * Sets the value of attribute Codigo
     */
    public void setMunicipioCodigo(Long municipioCodigo) {
        this.municipioCodigo = municipioCodigo;
    }

    /**
     * Gets the value of attribute Descripcion
     */
    public String getMunicipioDescripcion() {
        return municipioDescripcion;
    }
    
    /**
     * Sets the value of attribute Descripcion
     */
    public void setMunicipioDescripcion(String municipioDescripcion) {
        this.municipioDescripcion = municipioDescripcion;
    }

    /**
     * Gets the value of attribute CodigoLegal
     */
    public String getMunicipioCodigoLegal() {
        return municipioCodigoLegal;
    }
    
    /**
     * Sets the value of attribute CodigoLegal
     */
    public void setMunicipioCodigoLegal(String municipioCodigoLegal) {
        this.municipioCodigoLegal = municipioCodigoLegal;
    }

    /**
     * Gets the value of attribute EsValidoEPS
     */
    public Boolean getMunicipioEsValidoEPS() {
        return municipioEsValidoEPS;
    }
    
    /**
     * Sets the value of attribute EsValidoEPS
     */
    public void setMunicipioEsValidoEPS(Boolean municipioEsValidoEPS) {
        this.municipioEsValidoEPS = municipioEsValidoEPS;
    }

    /**
     * Gets the value of attribute AplicaIVA
     */
    public Boolean getMunicipioAplicaIVA() {
        return municipioAplicaIVA;
    }
    
    /**
     * Sets the value of attribute AplicaIVA
     */
    public void setMunicipioAplicaIVA(Boolean municipioAplicaIVA) {
        this.municipioAplicaIVA = municipioAplicaIVA;
    }

    /**
     * Gets the value of relation through role Personas
     */
    @JsonIgnore
    public Collection <Persona> getPersonas() {
        return personas;
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
     * Gets the value of relation through role ContratanteRes
     */
    @JsonIgnore
    public Collection <Contratante> getContratanteRes() {
        return contratanteRes;
    }

    /**
     * Gets the value of relation through role ContratosC
     */
    @JsonIgnore
    public Collection <ContratoC> getContratosC() {
        return contratosC;
    }

    /**
     * Gets the value of relation through role DirSucursalC
     */
    @JsonIgnore
    public Collection <DirSucursalC> getDirSucursalC() {
        return dirSucursalC;
    }

    /**
     * Gets the value of relation through role FamiliaC
     */
    @JsonIgnore
    public Collection <FamiliaC> getFamiliaC() {
        return familiaC;
    }

    /**
     * Gets the value of relation through role Titulares
     */
    @JsonIgnore
    public Collection <Titular> getTitulares() {
        return titulares;
    }

    /**
     * Gets the value of relation through role InstitucionMatNeo
     */
    @JsonIgnore
    public Collection <InstitucionMatNeo> getInstitucionMatNeo() {
        return institucionMatNeo;
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
     * Gets the value of relation through role Departamento
     */
    @JsonIgnore
    public Departamento getDepartamento() {
        return departamento;
    }

    /**
     * Default constructor
     */
    public Municipio() {
        municipioCodigo = null;
    }

    /**
     * Constructor used to create instances of <code>Municipio</code>.
     * @param oid Object Identifier of the instance of <code>Municipio</code> to be created.
     * @throws SystemException
     */
    public Municipio(MunicipioOid oid) {
        if (oid != null && !oid.isNull()) {
            municipioCodigo = oid.getMunicipioCodigo();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return Municipio.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Municipio other = (Municipio)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getMunicipioCodigo(), other.getMunicipioCodigo());
        result &= Utilities.isEqual(this.getMunicipioDescripcion(), other.getMunicipioDescripcion());
        result &= Utilities.isEqual(this.getMunicipioCodigoLegal(), other.getMunicipioCodigoLegal());
        result &= Utilities.isEqual(this.getMunicipioEsValidoEPS(), other.getMunicipioEsValidoEPS());
        result &= Utilities.isEqual(this.getMunicipioAplicaIVA(), other.getMunicipioAplicaIVA());
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
     * Returns the <code>MunicipioOid</code> object that identifies this instance of <code>Municipio</code>.
     * @return <code>MunicipioOid</code> object that identifies this instance of <code>Municipio</code>
     */
	@Override
    public MunicipioOid getOid() {
        return new MunicipioOid(getMunicipioCodigo());
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
        if (!activeFacets.contains(Constants.MUNICIPIO)) {
            activeFacets.add(Constants.MUNICIPIO);
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
            relatedInstance = buildMunicipioRelatedInstance(relatedInstanceJsonOid);
        }
        if (MunicipioConstants.ROLE_NAME_PERSONAS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildMunicipioRelatedInstance4Persona(relatedInstanceJsonOid, remainingPath);
        }
        if (MunicipioConstants.ROLE_NAME_PERSONASC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildMunicipioRelatedInstance4PersonaC(relatedInstanceJsonOid, remainingPath);
        }
        if (MunicipioConstants.ROLE_NAME_DIRECCIONESC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildMunicipioRelatedInstance4DireccionC(relatedInstanceJsonOid, remainingPath);
        }
        if (MunicipioConstants.ROLE_NAME_DIRECCIONES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildMunicipioRelatedInstance4Direccion(relatedInstanceJsonOid, remainingPath);
        }
        if (MunicipioConstants.ROLE_NAME_CONTRATANTES.equalsIgnoreCase(relatedInstancePathFirstItem) || MunicipioConstants.ROLE_NAME_CONTRATANTERES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildMunicipioRelatedInstance4Contratante(relatedInstanceJsonOid, remainingPath);
        }
        if (MunicipioConstants.ROLE_NAME_CONTRATOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildMunicipioRelatedInstance4ContratoC(relatedInstanceJsonOid, remainingPath);
        }
        if (MunicipioConstants.ROLE_NAME_DIRSUCURSALC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildMunicipioRelatedInstance4DirSucursalC(relatedInstanceJsonOid, remainingPath);
        }
        if (MunicipioConstants.ROLE_NAME_FAMILIAC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildMunicipioRelatedInstance4FamiliaC(relatedInstanceJsonOid, remainingPath);
        }
        if (MunicipioConstants.ROLE_NAME_TITULARES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildMunicipioRelatedInstance4Titular(relatedInstanceJsonOid, remainingPath);
        }
        if (MunicipioConstants.ROLE_NAME_INSTITUCIONMATNEO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildMunicipioRelatedInstance4InstitucionMatNeo(relatedInstanceJsonOid, remainingPath);
        }
        if (MunicipioConstants.ROLE_NAME_NOVEDADCTNAC.equalsIgnoreCase(relatedInstancePathFirstItem) || MunicipioConstants.ROLE_NAME_NOVEDADCTRES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildMunicipioRelatedInstance4NovedadCT(relatedInstanceJsonOid, remainingPath);
        }
        if (MunicipioConstants.ROLE_NAME_NOVEDADESMD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildMunicipioRelatedInstance4NovedadMD(relatedInstanceJsonOid, remainingPath);
        }
        if (MunicipioConstants.ROLE_NAME_DEPARTAMENTO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildMunicipioRelatedInstance4Departamento(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildMunicipioRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Municipio(mapper.readValue(relatedInstanceJsonOid, MunicipioOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Municipio.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildMunicipioRelatedInstance4Persona(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Persona(mapper.readValue(relatedInstanceJsonOid, PersonaOid.class)): Persona.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Municipio.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildMunicipioRelatedInstance4PersonaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PersonaC(mapper.readValue(relatedInstanceJsonOid, PersonaCOid.class)): PersonaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Municipio.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildMunicipioRelatedInstance4DireccionC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new DireccionC(mapper.readValue(relatedInstanceJsonOid, DireccionCOid.class)): DireccionC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Municipio.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildMunicipioRelatedInstance4Direccion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Direccion(mapper.readValue(relatedInstanceJsonOid, DireccionOid.class)): Direccion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Municipio.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildMunicipioRelatedInstance4Contratante(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Contratante(mapper.readValue(relatedInstanceJsonOid, ContratanteOid.class)): Contratante.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Municipio.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildMunicipioRelatedInstance4ContratoC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ContratoC(mapper.readValue(relatedInstanceJsonOid, ContratoCOid.class)): ContratoC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Municipio.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildMunicipioRelatedInstance4DirSucursalC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new DirSucursalC(mapper.readValue(relatedInstanceJsonOid, DirSucursalCOid.class)): DirSucursalC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Municipio.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildMunicipioRelatedInstance4FamiliaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new FamiliaC(mapper.readValue(relatedInstanceJsonOid, FamiliaCOid.class)): FamiliaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Municipio.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildMunicipioRelatedInstance4Titular(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Titular(mapper.readValue(relatedInstanceJsonOid, TitularOid.class)): Titular.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Municipio.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildMunicipioRelatedInstance4InstitucionMatNeo(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new InstitucionMatNeo(mapper.readValue(relatedInstanceJsonOid, InstitucionMatNeoOid.class)): InstitucionMatNeo.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Municipio.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildMunicipioRelatedInstance4NovedadCT(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new NovedadCT(mapper.readValue(relatedInstanceJsonOid, NovedadCTOid.class)): NovedadCT.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Municipio.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildMunicipioRelatedInstance4NovedadMD(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new NovedadMD(mapper.readValue(relatedInstanceJsonOid, NovedadMDOid.class)): NovedadMD.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Municipio.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildMunicipioRelatedInstance4Departamento(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Departamento(mapper.readValue(relatedInstanceJsonOid, DepartamentoOid.class)): Departamento.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Municipio.class).error(e.getMessage());
            return null;
        }
    }
}
