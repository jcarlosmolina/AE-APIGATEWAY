package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.DirSucursalCConstants;
import com.keralty.ae.persistence.oid.DepartamentoOid;
import com.keralty.ae.persistence.oid.DirSucursalCOid;
import com.keralty.ae.persistence.oid.MunicipioOid;
import com.keralty.ae.persistence.oid.PaisOid;
import com.keralty.ae.persistence.oid.PersonaCOid;
import com.keralty.ae.persistence.oid.RegionalOid;
import com.keralty.ae.persistence.oid.TelefonoCOid;
import com.keralty.ae.persistence.oid.TipoSucursalCOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>DirSucursalC</code> external model class.
 * <p>
 * External Model Class: <code>DirSucursalC</code><br>
 */
public class DirSucursalC extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="codigo")
    private Long dirSucursalCCodigo;

    @JsonProperty(value="codlegalsucursal")
    private String dirSucursalCCodLegalSucursal;

    @JsonProperty(value="nombre")
    private String dirSucursalCNombre;

    @JsonProperty(value="esprincipal")
    private Boolean dirSucursalCEsPrincipal;

    @JsonProperty(value="activa")
    private Boolean dirSucursalCActiva;

    @JsonProperty(value="direccion")
    private String dirSucursalCDireccion;

    @JsonProperty(value="mail")
    private String dirSucursalCMail;

    @JsonProperty(value="drvciudad")
    private String dirSucursalCdrvCiudad;

    private Collection <TelefonoC> telefonosC;

    private PersonaC personaC;

    private Collection <TipoSucursalC> tiposSucursalC;

    private Municipio municipioC;

    private Departamento departamentoC;

    private Pais paisC;

    private Regional regionalC;

    /**
     * Gets the value of attribute Codigo
     */
    public Long getDirSucursalCCodigo() {
        return dirSucursalCCodigo;
    }
    
    /**
     * Sets the value of attribute Codigo
     */
    public void setDirSucursalCCodigo(Long dirSucursalCCodigo) {
        this.dirSucursalCCodigo = dirSucursalCCodigo;
    }

    /**
     * Gets the value of attribute CodLegalSucursal
     */
    public String getDirSucursalCCodLegalSucursal() {
        return dirSucursalCCodLegalSucursal;
    }
    
    /**
     * Sets the value of attribute CodLegalSucursal
     */
    public void setDirSucursalCCodLegalSucursal(String dirSucursalCCodLegalSucursal) {
        this.dirSucursalCCodLegalSucursal = dirSucursalCCodLegalSucursal;
    }

    /**
     * Gets the value of attribute Nombre
     */
    public String getDirSucursalCNombre() {
        return dirSucursalCNombre;
    }
    
    /**
     * Sets the value of attribute Nombre
     */
    public void setDirSucursalCNombre(String dirSucursalCNombre) {
        this.dirSucursalCNombre = dirSucursalCNombre;
    }

    /**
     * Gets the value of attribute EsPrincipal
     */
    public Boolean getDirSucursalCEsPrincipal() {
        return dirSucursalCEsPrincipal;
    }
    
    /**
     * Sets the value of attribute EsPrincipal
     */
    public void setDirSucursalCEsPrincipal(Boolean dirSucursalCEsPrincipal) {
        this.dirSucursalCEsPrincipal = dirSucursalCEsPrincipal;
    }

    /**
     * Gets the value of attribute Activa
     */
    public Boolean getDirSucursalCActiva() {
        return dirSucursalCActiva;
    }
    
    /**
     * Sets the value of attribute Activa
     */
    public void setDirSucursalCActiva(Boolean dirSucursalCActiva) {
        this.dirSucursalCActiva = dirSucursalCActiva;
    }

    /**
     * Gets the value of attribute Direccion
     */
    public String getDirSucursalCDireccion() {
        return dirSucursalCDireccion;
    }
    
    /**
     * Sets the value of attribute Direccion
     */
    public void setDirSucursalCDireccion(String dirSucursalCDireccion) {
        this.dirSucursalCDireccion = dirSucursalCDireccion;
    }

    /**
     * Gets the value of attribute Mail
     */
    public String getDirSucursalCMail() {
        return dirSucursalCMail;
    }
    
    /**
     * Sets the value of attribute Mail
     */
    public void setDirSucursalCMail(String dirSucursalCMail) {
        this.dirSucursalCMail = dirSucursalCMail;
    }

    /**
     * Gets the value of attribute drvCiudad
     */
    public String getDirSucursalCdrvCiudad() {
        return dirSucursalCdrvCiudad;
    }
    
    /**
     * Sets the value of attribute drvCiudad
     */
    public void setDirSucursalCdrvCiudad(String dirSucursalCdrvCiudad) {
        this.dirSucursalCdrvCiudad = dirSucursalCdrvCiudad;
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
     * Gets the value of relation through role TiposSucursalC
     */
    @JsonIgnore
    public Collection <TipoSucursalC> getTiposSucursalC() {
        return tiposSucursalC;
    }

    /**
     * Gets the value of relation through role MunicipioC
     */
    @JsonIgnore
    public Municipio getMunicipioC() {
        return municipioC;
    }

    /**
     * Gets the value of relation through role DepartamentoC
     */
    @JsonIgnore
    public Departamento getDepartamentoC() {
        return departamentoC;
    }

    /**
     * Gets the value of relation through role PaisC
     */
    @JsonIgnore
    public Pais getPaisC() {
        return paisC;
    }

    /**
     * Gets the value of relation through role RegionalC
     */
    @JsonIgnore
    public Regional getRegionalC() {
        return regionalC;
    }

    /**
     * Default constructor
     */
    public DirSucursalC() {
        dirSucursalCCodigo = null;
    }

    /**
     * Constructor used to create instances of <code>DirSucursalC</code>.
     * @param oid Object Identifier of the instance of <code>DirSucursalC</code> to be created.
     * @throws SystemException
     */
    public DirSucursalC(DirSucursalCOid oid) {
        if (oid != null && !oid.isNull()) {
            dirSucursalCCodigo = oid.getDirSucursalCCodigo();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return DirSucursalC.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        DirSucursalC other = (DirSucursalC)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getDirSucursalCCodigo(), other.getDirSucursalCCodigo());
        result &= Utilities.isEqual(this.getDirSucursalCCodLegalSucursal(), other.getDirSucursalCCodLegalSucursal());
        result &= Utilities.isEqual(this.getDirSucursalCNombre(), other.getDirSucursalCNombre());
        result &= Utilities.isEqual(this.getDirSucursalCEsPrincipal(), other.getDirSucursalCEsPrincipal());
        result &= Utilities.isEqual(this.getDirSucursalCActiva(), other.getDirSucursalCActiva());
        result &= Utilities.isEqual(this.getDirSucursalCDireccion(), other.getDirSucursalCDireccion());
        result &= Utilities.isEqual(this.getDirSucursalCMail(), other.getDirSucursalCMail());
        result &= Utilities.isEqual(this.getDirSucursalCdrvCiudad(), other.getDirSucursalCdrvCiudad());
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
     * Returns the <code>DirSucursalCOid</code> object that identifies this instance of <code>DirSucursalC</code>.
     * @return <code>DirSucursalCOid</code> object that identifies this instance of <code>DirSucursalC</code>
     */
	@Override
    public DirSucursalCOid getOid() {
        return new DirSucursalCOid(getDirSucursalCCodigo());
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
        if (!activeFacets.contains(Constants.DIRSUCURSALC)) {
            activeFacets.add(Constants.DIRSUCURSALC);
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
            relatedInstance = buildDirSucursalCRelatedInstance(relatedInstanceJsonOid);
        }
        if (DirSucursalCConstants.ROLE_NAME_TELEFONOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDirSucursalCRelatedInstance4TelefonoC(relatedInstanceJsonOid, remainingPath);
        }
        if (DirSucursalCConstants.ROLE_NAME_PERSONAC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDirSucursalCRelatedInstance4PersonaC(relatedInstanceJsonOid, remainingPath);
        }
        if (DirSucursalCConstants.ROLE_NAME_TIPOSSUCURSALC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDirSucursalCRelatedInstance4TipoSucursalC(relatedInstanceJsonOid, remainingPath);
        }
        if (DirSucursalCConstants.ROLE_NAME_MUNICIPIOC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDirSucursalCRelatedInstance4Municipio(relatedInstanceJsonOid, remainingPath);
        }
        if (DirSucursalCConstants.ROLE_NAME_DEPARTAMENTOC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDirSucursalCRelatedInstance4Departamento(relatedInstanceJsonOid, remainingPath);
        }
        if (DirSucursalCConstants.ROLE_NAME_PAISC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDirSucursalCRelatedInstance4Pais(relatedInstanceJsonOid, remainingPath);
        }
        if (DirSucursalCConstants.ROLE_NAME_REGIONALC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDirSucursalCRelatedInstance4Regional(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildDirSucursalCRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new DirSucursalC(mapper.readValue(relatedInstanceJsonOid, DirSucursalCOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DirSucursalC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDirSucursalCRelatedInstance4TelefonoC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TelefonoC(mapper.readValue(relatedInstanceJsonOid, TelefonoCOid.class)): TelefonoC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DirSucursalC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDirSucursalCRelatedInstance4PersonaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PersonaC(mapper.readValue(relatedInstanceJsonOid, PersonaCOid.class)): PersonaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DirSucursalC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDirSucursalCRelatedInstance4TipoSucursalC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TipoSucursalC(mapper.readValue(relatedInstanceJsonOid, TipoSucursalCOid.class)): TipoSucursalC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DirSucursalC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDirSucursalCRelatedInstance4Municipio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Municipio(mapper.readValue(relatedInstanceJsonOid, MunicipioOid.class)): Municipio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DirSucursalC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDirSucursalCRelatedInstance4Departamento(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Departamento(mapper.readValue(relatedInstanceJsonOid, DepartamentoOid.class)): Departamento.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DirSucursalC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDirSucursalCRelatedInstance4Pais(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Pais(mapper.readValue(relatedInstanceJsonOid, PaisOid.class)): Pais.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DirSucursalC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildDirSucursalCRelatedInstance4Regional(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Regional(mapper.readValue(relatedInstanceJsonOid, RegionalOid.class)): Regional.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(DirSucursalC.class).error(e.getMessage());
            return null;
        }
    }
}
