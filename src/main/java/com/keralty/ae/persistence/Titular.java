package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.TitularConstants;
import com.keralty.ae.persistence.oid.DepartamentoOid;
import com.keralty.ae.persistence.oid.DireccionOid;
import com.keralty.ae.persistence.oid.MunicipioOid;
import com.keralty.ae.persistence.oid.SolicitudOid;
import com.keralty.ae.persistence.oid.TipoIdentificacionOid;
import com.keralty.ae.persistence.oid.TitularOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>Titular</code> external model class.
 * <p>
 * External Model Class: <code>Titular</code><br>
 */
public class Titular extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id_solicitud")
    private Long aesolicitudesidsolicitud;

    @JsonProperty(value="codigo")
    private Long titularCodigo;

    @JsonProperty(value="numidentificacion")
    private String titularNumIdentificacion;

    @JsonProperty(value="tipopersona")
    private String titularTipoPersona;

    @JsonProperty(value="primernombre")
    private String titularPrimerNombre;

    @JsonProperty(value="segundonombre")
    private String titularSegundoNombre;

    @JsonProperty(value="primerapellido")
    private String titularPrimerApellido;

    @JsonProperty(value="segundoapellido")
    private String titularSegundoApellido;

    @JsonProperty(value="fechanacimiento")
    private Date titularFechaNacimiento;

    @JsonProperty(value="genero")
    private String titularGenero;

    @JsonProperty(value="indicadorextranjero")
    private Boolean titularIndicadorExtranjero;

    @JsonProperty(value="telefonofijo")
    private String titularTelefonoFijo;

    @JsonProperty(value="telefonocelular")
    private String titularTelefonoCelular;

    @JsonProperty(value="correoelectronico")
    private String titularCorreoElectronico;

    @JsonProperty(value="titularconbeneficios")
    private Boolean titularTitularConBeneficios;

    @JsonProperty(value="drvidentificacion")
    private String titulardrvIdentificacion;

    @JsonProperty(value="titularrecuperadoinc")
    private Boolean titularTitularRecuperadoInc;

    @JsonProperty(value="drvnombrecompleto")
    private String titulardrvNombreCompleto;

    @JsonProperty(value="telefonofijodc")
    private String titularTelefonoFijoDC;

    @JsonProperty(value="telefonocelulardc")
    private String titularTelefonoCelularDC;

    @JsonProperty(value="titularconbeneficioscore")
    private Boolean titularTitularConBeneficiosCORE;

    @JsonProperty(value="razonsocial")
    private String titularRazonSocial;

    @JsonProperty(value="drvbeneficiosactivo")
    private Boolean titulardrvBeneficiosActivo;

    @JsonProperty(value="direccionesmodificadas")
    private Boolean titularDireccionesModificadas;

    private Direccion direccion;

    private Solicitud solicitud;

    private TipoIdentificacion tipoIdentificacion;

    private Departamento departamentoNac;

    private Municipio municipioNac;

    /**
     * Gets the value of attribute id_solicitud
     */
    public Long getAesolicitudesidsolicitud() {
        return aesolicitudesidsolicitud;
    }
    
    /**
     * Sets the value of attribute id_solicitud
     */
    public void setAesolicitudesidsolicitud(Long aesolicitudesidsolicitud) {
        this.aesolicitudesidsolicitud = aesolicitudesidsolicitud;
    }

    /**
     * Gets the value of attribute Codigo
     */
    public Long getTitularCodigo() {
        return titularCodigo;
    }
    
    /**
     * Sets the value of attribute Codigo
     */
    public void setTitularCodigo(Long titularCodigo) {
        this.titularCodigo = titularCodigo;
    }

    /**
     * Gets the value of attribute NumIdentificacion
     */
    public String getTitularNumIdentificacion() {
        return titularNumIdentificacion;
    }
    
    /**
     * Sets the value of attribute NumIdentificacion
     */
    public void setTitularNumIdentificacion(String titularNumIdentificacion) {
        this.titularNumIdentificacion = titularNumIdentificacion;
    }

    /**
     * Gets the value of attribute TipoPersona
     */
    public String getTitularTipoPersona() {
        return titularTipoPersona;
    }
    
    /**
     * Sets the value of attribute TipoPersona
     */
    public void setTitularTipoPersona(String titularTipoPersona) {
        this.titularTipoPersona = titularTipoPersona;
    }

    /**
     * Gets the value of attribute PrimerNombre
     */
    public String getTitularPrimerNombre() {
        return titularPrimerNombre;
    }
    
    /**
     * Sets the value of attribute PrimerNombre
     */
    public void setTitularPrimerNombre(String titularPrimerNombre) {
        this.titularPrimerNombre = titularPrimerNombre;
    }

    /**
     * Gets the value of attribute SegundoNombre
     */
    public String getTitularSegundoNombre() {
        return titularSegundoNombre;
    }
    
    /**
     * Sets the value of attribute SegundoNombre
     */
    public void setTitularSegundoNombre(String titularSegundoNombre) {
        this.titularSegundoNombre = titularSegundoNombre;
    }

    /**
     * Gets the value of attribute PrimerApellido
     */
    public String getTitularPrimerApellido() {
        return titularPrimerApellido;
    }
    
    /**
     * Sets the value of attribute PrimerApellido
     */
    public void setTitularPrimerApellido(String titularPrimerApellido) {
        this.titularPrimerApellido = titularPrimerApellido;
    }

    /**
     * Gets the value of attribute SegundoApellido
     */
    public String getTitularSegundoApellido() {
        return titularSegundoApellido;
    }
    
    /**
     * Sets the value of attribute SegundoApellido
     */
    public void setTitularSegundoApellido(String titularSegundoApellido) {
        this.titularSegundoApellido = titularSegundoApellido;
    }

    /**
     * Gets the value of attribute FechaNacimiento
     */
    public Date getTitularFechaNacimiento() {
        return titularFechaNacimiento;
    }
    
    /**
     * Sets the value of attribute FechaNacimiento
     */
    public void setTitularFechaNacimiento(Date titularFechaNacimiento) {
        this.titularFechaNacimiento = titularFechaNacimiento;
    }

    /**
     * Gets the value of attribute Genero
     */
    public String getTitularGenero() {
        return titularGenero;
    }
    
    /**
     * Sets the value of attribute Genero
     */
    public void setTitularGenero(String titularGenero) {
        this.titularGenero = titularGenero;
    }

    /**
     * Gets the value of attribute IndicadorExtranjero
     */
    public Boolean getTitularIndicadorExtranjero() {
        return titularIndicadorExtranjero;
    }
    
    /**
     * Sets the value of attribute IndicadorExtranjero
     */
    public void setTitularIndicadorExtranjero(Boolean titularIndicadorExtranjero) {
        this.titularIndicadorExtranjero = titularIndicadorExtranjero;
    }

    /**
     * Gets the value of attribute TelefonoFijo
     */
    public String getTitularTelefonoFijo() {
        return titularTelefonoFijo;
    }
    
    /**
     * Sets the value of attribute TelefonoFijo
     */
    public void setTitularTelefonoFijo(String titularTelefonoFijo) {
        this.titularTelefonoFijo = titularTelefonoFijo;
    }

    /**
     * Gets the value of attribute TelefonoCelular
     */
    public String getTitularTelefonoCelular() {
        return titularTelefonoCelular;
    }
    
    /**
     * Sets the value of attribute TelefonoCelular
     */
    public void setTitularTelefonoCelular(String titularTelefonoCelular) {
        this.titularTelefonoCelular = titularTelefonoCelular;
    }

    /**
     * Gets the value of attribute CorreoElectronico
     */
    public String getTitularCorreoElectronico() {
        return titularCorreoElectronico;
    }
    
    /**
     * Sets the value of attribute CorreoElectronico
     */
    public void setTitularCorreoElectronico(String titularCorreoElectronico) {
        this.titularCorreoElectronico = titularCorreoElectronico;
    }

    /**
     * Gets the value of attribute TitularConBeneficios
     */
    public Boolean getTitularTitularConBeneficios() {
        return titularTitularConBeneficios;
    }
    
    /**
     * Sets the value of attribute TitularConBeneficios
     */
    public void setTitularTitularConBeneficios(Boolean titularTitularConBeneficios) {
        this.titularTitularConBeneficios = titularTitularConBeneficios;
    }

    /**
     * Gets the value of attribute drvIdentificacion
     */
    public String getTitulardrvIdentificacion() {
        return titulardrvIdentificacion;
    }
    
    /**
     * Sets the value of attribute drvIdentificacion
     */
    public void setTitulardrvIdentificacion(String titulardrvIdentificacion) {
        this.titulardrvIdentificacion = titulardrvIdentificacion;
    }

    /**
     * Gets the value of attribute TitularRecuperadoInc
     */
    public Boolean getTitularTitularRecuperadoInc() {
        return titularTitularRecuperadoInc;
    }
    
    /**
     * Sets the value of attribute TitularRecuperadoInc
     */
    public void setTitularTitularRecuperadoInc(Boolean titularTitularRecuperadoInc) {
        this.titularTitularRecuperadoInc = titularTitularRecuperadoInc;
    }

    /**
     * Gets the value of attribute drvNombreCompleto
     */
    public String getTitulardrvNombreCompleto() {
        return titulardrvNombreCompleto;
    }
    
    /**
     * Sets the value of attribute drvNombreCompleto
     */
    public void setTitulardrvNombreCompleto(String titulardrvNombreCompleto) {
        this.titulardrvNombreCompleto = titulardrvNombreCompleto;
    }

    /**
     * Gets the value of attribute TelefonoFijoDC
     */
    public String getTitularTelefonoFijoDC() {
        return titularTelefonoFijoDC;
    }
    
    /**
     * Sets the value of attribute TelefonoFijoDC
     */
    public void setTitularTelefonoFijoDC(String titularTelefonoFijoDC) {
        this.titularTelefonoFijoDC = titularTelefonoFijoDC;
    }

    /**
     * Gets the value of attribute TelefonoCelularDC
     */
    public String getTitularTelefonoCelularDC() {
        return titularTelefonoCelularDC;
    }
    
    /**
     * Sets the value of attribute TelefonoCelularDC
     */
    public void setTitularTelefonoCelularDC(String titularTelefonoCelularDC) {
        this.titularTelefonoCelularDC = titularTelefonoCelularDC;
    }

    /**
     * Gets the value of attribute TitularConBeneficiosCORE
     */
    public Boolean getTitularTitularConBeneficiosCORE() {
        return titularTitularConBeneficiosCORE;
    }
    
    /**
     * Sets the value of attribute TitularConBeneficiosCORE
     */
    public void setTitularTitularConBeneficiosCORE(Boolean titularTitularConBeneficiosCORE) {
        this.titularTitularConBeneficiosCORE = titularTitularConBeneficiosCORE;
    }

    /**
     * Gets the value of attribute RazonSocial
     */
    public String getTitularRazonSocial() {
        return titularRazonSocial;
    }
    
    /**
     * Sets the value of attribute RazonSocial
     */
    public void setTitularRazonSocial(String titularRazonSocial) {
        this.titularRazonSocial = titularRazonSocial;
    }

    /**
     * Gets the value of attribute drvBeneficiosActivo
     */
    public Boolean getTitulardrvBeneficiosActivo() {
        return titulardrvBeneficiosActivo;
    }
    
    /**
     * Sets the value of attribute drvBeneficiosActivo
     */
    public void setTitulardrvBeneficiosActivo(Boolean titulardrvBeneficiosActivo) {
        this.titulardrvBeneficiosActivo = titulardrvBeneficiosActivo;
    }

    /**
     * Gets the value of attribute DireccionesModificadas
     */
    public Boolean getTitularDireccionesModificadas() {
        return titularDireccionesModificadas;
    }
    
    /**
     * Sets the value of attribute DireccionesModificadas
     */
    public void setTitularDireccionesModificadas(Boolean titularDireccionesModificadas) {
        this.titularDireccionesModificadas = titularDireccionesModificadas;
    }

    /**
     * Gets the value of relation through role Direccion
     */
    @JsonIgnore
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * Gets the value of relation through role Solicitud
     */
    @JsonIgnore
    public Solicitud getSolicitud() {
        return solicitud;
    }

    /**
     * Gets the value of relation through role TipoIdentificacion
     */
    @JsonIgnore
    public TipoIdentificacion getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    /**
     * Gets the value of relation through role DepartamentoNac
     */
    @JsonIgnore
    public Departamento getDepartamentoNac() {
        return departamentoNac;
    }

    /**
     * Gets the value of relation through role MunicipioNac
     */
    @JsonIgnore
    public Municipio getMunicipioNac() {
        return municipioNac;
    }

    /**
     * Default constructor
     */
    public Titular() {
        aesolicitudesidsolicitud = null;
    }

    /**
     * Constructor used to create instances of <code>Titular</code>.
     * @param oid Object Identifier of the instance of <code>Titular</code> to be created.
     * @throws SystemException
     */
    public Titular(TitularOid oid) {
        if (oid != null && !oid.isNull()) {
            aesolicitudesidsolicitud = oid.getAesolicitudesidsolicitud();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return Titular.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Titular other = (Titular)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getTitularCodigo(), other.getTitularCodigo());
        result &= Utilities.isEqual(this.getTitularNumIdentificacion(), other.getTitularNumIdentificacion());
        result &= Utilities.isEqual(this.getTitularTipoPersona(), other.getTitularTipoPersona());
        result &= Utilities.isEqual(this.getTitularPrimerNombre(), other.getTitularPrimerNombre());
        result &= Utilities.isEqual(this.getTitularSegundoNombre(), other.getTitularSegundoNombre());
        result &= Utilities.isEqual(this.getTitularPrimerApellido(), other.getTitularPrimerApellido());
        result &= Utilities.isEqual(this.getTitularSegundoApellido(), other.getTitularSegundoApellido());
        result &= Utilities.isEqual(this.getTitularFechaNacimiento(), other.getTitularFechaNacimiento());
        result &= Utilities.isEqual(this.getTitularGenero(), other.getTitularGenero());
        result &= Utilities.isEqual(this.getTitularIndicadorExtranjero(), other.getTitularIndicadorExtranjero());
        result &= Utilities.isEqual(this.getTitularTelefonoFijo(), other.getTitularTelefonoFijo());
        result &= Utilities.isEqual(this.getTitularTelefonoCelular(), other.getTitularTelefonoCelular());
        result &= Utilities.isEqual(this.getTitularCorreoElectronico(), other.getTitularCorreoElectronico());
        result &= Utilities.isEqual(this.getTitularTitularConBeneficios(), other.getTitularTitularConBeneficios());
        result &= Utilities.isEqual(this.getTitulardrvIdentificacion(), other.getTitulardrvIdentificacion());
        result &= Utilities.isEqual(this.getTitularTitularRecuperadoInc(), other.getTitularTitularRecuperadoInc());
        result &= Utilities.isEqual(this.getTitulardrvNombreCompleto(), other.getTitulardrvNombreCompleto());
        result &= Utilities.isEqual(this.getTitularTelefonoFijoDC(), other.getTitularTelefonoFijoDC());
        result &= Utilities.isEqual(this.getTitularTelefonoCelularDC(), other.getTitularTelefonoCelularDC());
        result &= Utilities.isEqual(this.getTitularTitularConBeneficiosCORE(), other.getTitularTitularConBeneficiosCORE());
        result &= Utilities.isEqual(this.getTitularRazonSocial(), other.getTitularRazonSocial());
        result &= Utilities.isEqual(this.getTitulardrvBeneficiosActivo(), other.getTitulardrvBeneficiosActivo());
        result &= Utilities.isEqual(this.getTitularDireccionesModificadas(), other.getTitularDireccionesModificadas());
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
     * Returns the <code>TitularOid</code> object that identifies this instance of <code>Titular</code>.
     * @return <code>TitularOid</code> object that identifies this instance of <code>Titular</code>
     */
	@Override
    public TitularOid getOid() {
        return new TitularOid(getAesolicitudesidsolicitud());
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
        if (!activeFacets.contains(Constants.TITULAR)) {
            activeFacets.add(Constants.TITULAR);
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
            relatedInstance = buildTitularRelatedInstance(relatedInstanceJsonOid);
        }
        if (TitularConstants.ROLE_NAME_DIRECCION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTitularRelatedInstance4Direccion(relatedInstanceJsonOid, remainingPath);
        }
        if (TitularConstants.ROLE_NAME_SOLICITUD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTitularRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        if (TitularConstants.ROLE_NAME_TIPOIDENTIFICACION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTitularRelatedInstance4TipoIdentificacion(relatedInstanceJsonOid, remainingPath);
        }
        if (TitularConstants.ROLE_NAME_DEPARTAMENTONAC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTitularRelatedInstance4Departamento(relatedInstanceJsonOid, remainingPath);
        }
        if (TitularConstants.ROLE_NAME_MUNICIPIONAC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTitularRelatedInstance4Municipio(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildTitularRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Titular(mapper.readValue(relatedInstanceJsonOid, TitularOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Titular.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildTitularRelatedInstance4Direccion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Direccion(mapper.readValue(relatedInstanceJsonOid, DireccionOid.class)): Direccion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Titular.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildTitularRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Titular.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildTitularRelatedInstance4TipoIdentificacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TipoIdentificacion(mapper.readValue(relatedInstanceJsonOid, TipoIdentificacionOid.class)): TipoIdentificacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Titular.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildTitularRelatedInstance4Departamento(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Departamento(mapper.readValue(relatedInstanceJsonOid, DepartamentoOid.class)): Departamento.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Titular.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildTitularRelatedInstance4Municipio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Municipio(mapper.readValue(relatedInstanceJsonOid, MunicipioOid.class)): Municipio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Titular.class).error(e.getMessage());
            return null;
        }
    }
}
