package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.NovedadCTConstants;
import com.keralty.ae.persistence.oid.DepartamentoOid;
import com.keralty.ae.persistence.oid.FamiliaNovedadOid;
import com.keralty.ae.persistence.oid.FirmaOid;
import com.keralty.ae.persistence.oid.MunicipioOid;
import com.keralty.ae.persistence.oid.NovedadCTOid;
import com.keralty.ae.persistence.oid.PaisOid;
import com.keralty.ae.persistence.oid.TipoIdentificacionOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>NovedadCT</code> external model class.
 * <p>
 * External Model Class: <code>NovedadCT</code><br>
 */
public class NovedadCT extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id_novedadct")
    private Long novedadCTidNovedadCT;

    @JsonProperty(value="titnumidentificacion")
    private String novedadCTTitNumidentificacion;

    @JsonProperty(value="titprimernombre")
    private String novedadCTTitPrimerNombre;

    @JsonProperty(value="titsegundonombre")
    private String novedadCTTitSegundoNombre;

    @JsonProperty(value="titprimerapellido")
    private String novedadCTTitPrimerApellido;

    @JsonProperty(value="titsegundoapellido")
    private String novedadCTTitSegundoApellido;

    @JsonProperty(value="titrazonsocial")
    private String novedadCTTitRazonSocial;

    @JsonProperty(value="tittienebeneficios")
    private Boolean novedadCTTitTieneBeneficios;

    @JsonProperty(value="fechanacimiento")
    private Date novedadCTFechaNacimiento;

    @JsonProperty(value="genero")
    private String novedadCTGenero;

    @JsonProperty(value="indicadorextranjero")
    private Boolean novedadCTIndicadorExtranjero;

    @JsonProperty(value="telefonofijo")
    private String novedadCTTelefonoFijo;

    @JsonProperty(value="telefonocelular")
    private String novedadCTTelefonoCelular;

    @JsonProperty(value="correoelectronico")
    private String novedadCTCorreoElectronico;

    @JsonProperty(value="direccioncompleta")
    private String novedadCTDireccionCompleta;

    @JsonProperty(value="rural")
    private Boolean novedadCTRural;

    @JsonProperty(value="codigocore")
    private Long novedadCTCodigoCORE;

    private FamiliaNovedad familiaNovedad;

    private TipoIdentificacion tipoIdentificacion;

    private Firma firma;

    private Municipio municipioNac;

    private Municipio municipioRes;

    private Departamento departamentoNac;

    private Departamento departamentoRes;

    private Pais pais;

    /**
     * Gets the value of attribute id_NovedadCT
     */
    public Long getNovedadCTidNovedadCT() {
        return novedadCTidNovedadCT;
    }
    
    /**
     * Sets the value of attribute id_NovedadCT
     */
    public void setNovedadCTidNovedadCT(Long novedadCTidNovedadCT) {
        this.novedadCTidNovedadCT = novedadCTidNovedadCT;
    }

    /**
     * Gets the value of attribute TitNumidentificacion
     */
    public String getNovedadCTTitNumidentificacion() {
        return novedadCTTitNumidentificacion;
    }
    
    /**
     * Sets the value of attribute TitNumidentificacion
     */
    public void setNovedadCTTitNumidentificacion(String novedadCTTitNumidentificacion) {
        this.novedadCTTitNumidentificacion = novedadCTTitNumidentificacion;
    }

    /**
     * Gets the value of attribute TitPrimerNombre
     */
    public String getNovedadCTTitPrimerNombre() {
        return novedadCTTitPrimerNombre;
    }
    
    /**
     * Sets the value of attribute TitPrimerNombre
     */
    public void setNovedadCTTitPrimerNombre(String novedadCTTitPrimerNombre) {
        this.novedadCTTitPrimerNombre = novedadCTTitPrimerNombre;
    }

    /**
     * Gets the value of attribute TitSegundoNombre
     */
    public String getNovedadCTTitSegundoNombre() {
        return novedadCTTitSegundoNombre;
    }
    
    /**
     * Sets the value of attribute TitSegundoNombre
     */
    public void setNovedadCTTitSegundoNombre(String novedadCTTitSegundoNombre) {
        this.novedadCTTitSegundoNombre = novedadCTTitSegundoNombre;
    }

    /**
     * Gets the value of attribute TitPrimerApellido
     */
    public String getNovedadCTTitPrimerApellido() {
        return novedadCTTitPrimerApellido;
    }
    
    /**
     * Sets the value of attribute TitPrimerApellido
     */
    public void setNovedadCTTitPrimerApellido(String novedadCTTitPrimerApellido) {
        this.novedadCTTitPrimerApellido = novedadCTTitPrimerApellido;
    }

    /**
     * Gets the value of attribute TitSegundoApellido
     */
    public String getNovedadCTTitSegundoApellido() {
        return novedadCTTitSegundoApellido;
    }
    
    /**
     * Sets the value of attribute TitSegundoApellido
     */
    public void setNovedadCTTitSegundoApellido(String novedadCTTitSegundoApellido) {
        this.novedadCTTitSegundoApellido = novedadCTTitSegundoApellido;
    }

    /**
     * Gets the value of attribute TitRazonSocial
     */
    public String getNovedadCTTitRazonSocial() {
        return novedadCTTitRazonSocial;
    }
    
    /**
     * Sets the value of attribute TitRazonSocial
     */
    public void setNovedadCTTitRazonSocial(String novedadCTTitRazonSocial) {
        this.novedadCTTitRazonSocial = novedadCTTitRazonSocial;
    }

    /**
     * Gets the value of attribute TitTieneBeneficios
     */
    public Boolean getNovedadCTTitTieneBeneficios() {
        return novedadCTTitTieneBeneficios;
    }
    
    /**
     * Sets the value of attribute TitTieneBeneficios
     */
    public void setNovedadCTTitTieneBeneficios(Boolean novedadCTTitTieneBeneficios) {
        this.novedadCTTitTieneBeneficios = novedadCTTitTieneBeneficios;
    }

    /**
     * Gets the value of attribute FechaNacimiento
     */
    public Date getNovedadCTFechaNacimiento() {
        return novedadCTFechaNacimiento;
    }
    
    /**
     * Sets the value of attribute FechaNacimiento
     */
    public void setNovedadCTFechaNacimiento(Date novedadCTFechaNacimiento) {
        this.novedadCTFechaNacimiento = novedadCTFechaNacimiento;
    }

    /**
     * Gets the value of attribute Genero
     */
    public String getNovedadCTGenero() {
        return novedadCTGenero;
    }
    
    /**
     * Sets the value of attribute Genero
     */
    public void setNovedadCTGenero(String novedadCTGenero) {
        this.novedadCTGenero = novedadCTGenero;
    }

    /**
     * Gets the value of attribute IndicadorExtranjero
     */
    public Boolean getNovedadCTIndicadorExtranjero() {
        return novedadCTIndicadorExtranjero;
    }
    
    /**
     * Sets the value of attribute IndicadorExtranjero
     */
    public void setNovedadCTIndicadorExtranjero(Boolean novedadCTIndicadorExtranjero) {
        this.novedadCTIndicadorExtranjero = novedadCTIndicadorExtranjero;
    }

    /**
     * Gets the value of attribute TelefonoFijo
     */
    public String getNovedadCTTelefonoFijo() {
        return novedadCTTelefonoFijo;
    }
    
    /**
     * Sets the value of attribute TelefonoFijo
     */
    public void setNovedadCTTelefonoFijo(String novedadCTTelefonoFijo) {
        this.novedadCTTelefonoFijo = novedadCTTelefonoFijo;
    }

    /**
     * Gets the value of attribute TelefonoCelular
     */
    public String getNovedadCTTelefonoCelular() {
        return novedadCTTelefonoCelular;
    }
    
    /**
     * Sets the value of attribute TelefonoCelular
     */
    public void setNovedadCTTelefonoCelular(String novedadCTTelefonoCelular) {
        this.novedadCTTelefonoCelular = novedadCTTelefonoCelular;
    }

    /**
     * Gets the value of attribute CorreoElectronico
     */
    public String getNovedadCTCorreoElectronico() {
        return novedadCTCorreoElectronico;
    }
    
    /**
     * Sets the value of attribute CorreoElectronico
     */
    public void setNovedadCTCorreoElectronico(String novedadCTCorreoElectronico) {
        this.novedadCTCorreoElectronico = novedadCTCorreoElectronico;
    }

    /**
     * Gets the value of attribute DireccionCompleta
     */
    public String getNovedadCTDireccionCompleta() {
        return novedadCTDireccionCompleta;
    }
    
    /**
     * Sets the value of attribute DireccionCompleta
     */
    public void setNovedadCTDireccionCompleta(String novedadCTDireccionCompleta) {
        this.novedadCTDireccionCompleta = novedadCTDireccionCompleta;
    }

    /**
     * Gets the value of attribute Rural
     */
    public Boolean getNovedadCTRural() {
        return novedadCTRural;
    }
    
    /**
     * Sets the value of attribute Rural
     */
    public void setNovedadCTRural(Boolean novedadCTRural) {
        this.novedadCTRural = novedadCTRural;
    }

    /**
     * Gets the value of attribute CodigoCORE
     */
    public Long getNovedadCTCodigoCORE() {
        return novedadCTCodigoCORE;
    }
    
    /**
     * Sets the value of attribute CodigoCORE
     */
    public void setNovedadCTCodigoCORE(Long novedadCTCodigoCORE) {
        this.novedadCTCodigoCORE = novedadCTCodigoCORE;
    }

    /**
     * Gets the value of relation through role FamiliaNovedad
     */
    @JsonIgnore
    public FamiliaNovedad getFamiliaNovedad() {
        return familiaNovedad;
    }

    /**
     * Gets the value of relation through role TipoIdentificacion
     */
    @JsonIgnore
    public TipoIdentificacion getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    /**
     * Gets the value of relation through role Firma
     */
    @JsonIgnore
    public Firma getFirma() {
        return firma;
    }

    /**
     * Gets the value of relation through role MunicipioNac
     */
    @JsonIgnore
    public Municipio getMunicipioNac() {
        return municipioNac;
    }

    /**
     * Gets the value of relation through role MunicipioRes
     */
    @JsonIgnore
    public Municipio getMunicipioRes() {
        return municipioRes;
    }

    /**
     * Gets the value of relation through role DepartamentoNac
     */
    @JsonIgnore
    public Departamento getDepartamentoNac() {
        return departamentoNac;
    }

    /**
     * Gets the value of relation through role DepartamentoRes
     */
    @JsonIgnore
    public Departamento getDepartamentoRes() {
        return departamentoRes;
    }

    /**
     * Gets the value of relation through role Pais
     */
    @JsonIgnore
    public Pais getPais() {
        return pais;
    }

    /**
     * Default constructor
     */
    public NovedadCT() {
        novedadCTidNovedadCT = null;
    }

    /**
     * Constructor used to create instances of <code>NovedadCT</code>.
     * @param oid Object Identifier of the instance of <code>NovedadCT</code> to be created.
     * @throws SystemException
     */
    public NovedadCT(NovedadCTOid oid) {
        if (oid != null && !oid.isNull()) {
            novedadCTidNovedadCT = oid.getNovedadCTidNovedadCT();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return NovedadCT.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        NovedadCT other = (NovedadCT)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getNovedadCTidNovedadCT(), other.getNovedadCTidNovedadCT());
        result &= Utilities.isEqual(this.getNovedadCTTitNumidentificacion(), other.getNovedadCTTitNumidentificacion());
        result &= Utilities.isEqual(this.getNovedadCTTitPrimerNombre(), other.getNovedadCTTitPrimerNombre());
        result &= Utilities.isEqual(this.getNovedadCTTitSegundoNombre(), other.getNovedadCTTitSegundoNombre());
        result &= Utilities.isEqual(this.getNovedadCTTitPrimerApellido(), other.getNovedadCTTitPrimerApellido());
        result &= Utilities.isEqual(this.getNovedadCTTitSegundoApellido(), other.getNovedadCTTitSegundoApellido());
        result &= Utilities.isEqual(this.getNovedadCTTitRazonSocial(), other.getNovedadCTTitRazonSocial());
        result &= Utilities.isEqual(this.getNovedadCTTitTieneBeneficios(), other.getNovedadCTTitTieneBeneficios());
        result &= Utilities.isEqual(this.getNovedadCTFechaNacimiento(), other.getNovedadCTFechaNacimiento());
        result &= Utilities.isEqual(this.getNovedadCTGenero(), other.getNovedadCTGenero());
        result &= Utilities.isEqual(this.getNovedadCTIndicadorExtranjero(), other.getNovedadCTIndicadorExtranjero());
        result &= Utilities.isEqual(this.getNovedadCTTelefonoFijo(), other.getNovedadCTTelefonoFijo());
        result &= Utilities.isEqual(this.getNovedadCTTelefonoCelular(), other.getNovedadCTTelefonoCelular());
        result &= Utilities.isEqual(this.getNovedadCTCorreoElectronico(), other.getNovedadCTCorreoElectronico());
        result &= Utilities.isEqual(this.getNovedadCTDireccionCompleta(), other.getNovedadCTDireccionCompleta());
        result &= Utilities.isEqual(this.getNovedadCTRural(), other.getNovedadCTRural());
        result &= Utilities.isEqual(this.getNovedadCTCodigoCORE(), other.getNovedadCTCodigoCORE());
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
     * Returns the <code>NovedadCTOid</code> object that identifies this instance of <code>NovedadCT</code>.
     * @return <code>NovedadCTOid</code> object that identifies this instance of <code>NovedadCT</code>
     */
	@Override
    public NovedadCTOid getOid() {
        return new NovedadCTOid(getNovedadCTidNovedadCT());
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
        if (!activeFacets.contains(Constants.NOVEDADCT)) {
            activeFacets.add(Constants.NOVEDADCT);
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
            relatedInstance = buildNovedadCTRelatedInstance(relatedInstanceJsonOid);
        }
        if (NovedadCTConstants.ROLE_NAME_FAMILIANOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildNovedadCTRelatedInstance4FamiliaNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (NovedadCTConstants.ROLE_NAME_TIPOIDENTIFICACION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildNovedadCTRelatedInstance4TipoIdentificacion(relatedInstanceJsonOid, remainingPath);
        }
        if (NovedadCTConstants.ROLE_NAME_FIRMA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildNovedadCTRelatedInstance4Firma(relatedInstanceJsonOid, remainingPath);
        }
        if (NovedadCTConstants.ROLE_NAME_MUNICIPIONAC.equalsIgnoreCase(relatedInstancePathFirstItem) || NovedadCTConstants.ROLE_NAME_MUNICIPIORES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildNovedadCTRelatedInstance4Municipio(relatedInstanceJsonOid, remainingPath);
        }
        if (NovedadCTConstants.ROLE_NAME_DEPARTAMENTONAC.equalsIgnoreCase(relatedInstancePathFirstItem) || NovedadCTConstants.ROLE_NAME_DEPARTAMENTORES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildNovedadCTRelatedInstance4Departamento(relatedInstanceJsonOid, remainingPath);
        }
        if (NovedadCTConstants.ROLE_NAME_PAIS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildNovedadCTRelatedInstance4Pais(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildNovedadCTRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new NovedadCT(mapper.readValue(relatedInstanceJsonOid, NovedadCTOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(NovedadCT.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildNovedadCTRelatedInstance4FamiliaNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new FamiliaNovedad(mapper.readValue(relatedInstanceJsonOid, FamiliaNovedadOid.class)): FamiliaNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(NovedadCT.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildNovedadCTRelatedInstance4TipoIdentificacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TipoIdentificacion(mapper.readValue(relatedInstanceJsonOid, TipoIdentificacionOid.class)): TipoIdentificacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(NovedadCT.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildNovedadCTRelatedInstance4Firma(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Firma(mapper.readValue(relatedInstanceJsonOid, FirmaOid.class)): Firma.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(NovedadCT.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildNovedadCTRelatedInstance4Municipio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Municipio(mapper.readValue(relatedInstanceJsonOid, MunicipioOid.class)): Municipio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(NovedadCT.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildNovedadCTRelatedInstance4Departamento(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Departamento(mapper.readValue(relatedInstanceJsonOid, DepartamentoOid.class)): Departamento.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(NovedadCT.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildNovedadCTRelatedInstance4Pais(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Pais(mapper.readValue(relatedInstanceJsonOid, PaisOid.class)): Pais.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(NovedadCT.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
