package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.ContratanteConstants;
import com.keralty.ae.persistence.oid.ContratanteOid;
import com.keralty.ae.persistence.oid.DepartamentoOid;
import com.keralty.ae.persistence.oid.MunicipioOid;
import com.keralty.ae.persistence.oid.SolicitudOid;
import com.keralty.ae.persistence.oid.TipoIdentificacionOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>Contratante</code> external model class.
 * <p>
 * External Model Class: <code>Contratante</code><br>
 */
public class Contratante extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id_solicitud")
    private Long aesolicitudesidsolicitud;

    @JsonProperty(value="codigo")
    private Long contratanteCodigo;

    @JsonProperty(value="numidentificacion")
    private String contratanteNumIdentificacion;

    @JsonProperty(value="tipopersona")
    private String contratanteTipoPersona;

    @JsonProperty(value="primernombre")
    private String contratantePrimerNombre;

    @JsonProperty(value="segundonombre")
    private String contratanteSegundoNombre;

    @JsonProperty(value="primerapellido")
    private String contratantePrimerApellido;

    @JsonProperty(value="segundoapellido")
    private String contratanteSegundoApellido;

    @JsonProperty(value="razonsocial")
    private String contratanteRazonSocial;

    @JsonProperty(value="fechanacimiento")
    private Date contratanteFechaNacimiento;

    @JsonProperty(value="genero")
    private String contratanteGenero;

    @JsonProperty(value="indicadorextranjero")
    private Boolean contratanteIndicadorExtranjero;

    @JsonProperty(value="telefonofijo")
    private String contratanteTelefonoFijo;

    @JsonProperty(value="telefonocelular")
    private String contratanteTelefonoCelular;

    @JsonProperty(value="correoelectronico")
    private String contratanteCorreoElectronico;

    @JsonProperty(value="titularconbeneficios")
    private Boolean contratanteTitularConBeneficios;

    @JsonProperty(value="diplomatico")
    private Boolean contratanteDiplomatico;

    @JsonProperty(value="drvidentificacion")
    private String contratantedrvIdentificacion;

    @JsonProperty(value="drvnombrecompleto")
    private String contratantedrvNombreCompleto;

    @JsonProperty(value="direccionres")
    private String contratanteDireccionRes;

    @JsonProperty(value="telefonofijores")
    private String contratanteTelefonoFijoRes;

    @JsonProperty(value="telefonocelularres")
    private String contratanteTelefonoCelularRes;

    @JsonProperty(value="ruraldirres")
    private Boolean contratanteRuralDirRes;

    @JsonProperty(value="titularconbeneficioscore")
    private Boolean contratanteTitularConBeneficiosCORE;

    @JsonProperty(value="drvbeneficiosactivo")
    private Boolean contratantedrvBeneficiosActivo;

    @JsonProperty(value="direccionesmodificadas")
    private Boolean contratanteDireccionesModificadas;

    private Solicitud solicitud;

    private TipoIdentificacion tipoIdentificacion;

    private Departamento departamentoNac;

    private Municipio municipioNac;

    private Departamento departamentoRes;

    private Municipio municipioRes;

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
    public Long getContratanteCodigo() {
        return contratanteCodigo;
    }
    
    /**
     * Sets the value of attribute Codigo
     */
    public void setContratanteCodigo(Long contratanteCodigo) {
        this.contratanteCodigo = contratanteCodigo;
    }

    /**
     * Gets the value of attribute NumIdentificacion
     */
    public String getContratanteNumIdentificacion() {
        return contratanteNumIdentificacion;
    }
    
    /**
     * Sets the value of attribute NumIdentificacion
     */
    public void setContratanteNumIdentificacion(String contratanteNumIdentificacion) {
        this.contratanteNumIdentificacion = contratanteNumIdentificacion;
    }

    /**
     * Gets the value of attribute TipoPersona
     */
    public String getContratanteTipoPersona() {
        return contratanteTipoPersona;
    }
    
    /**
     * Sets the value of attribute TipoPersona
     */
    public void setContratanteTipoPersona(String contratanteTipoPersona) {
        this.contratanteTipoPersona = contratanteTipoPersona;
    }

    /**
     * Gets the value of attribute PrimerNombre
     */
    public String getContratantePrimerNombre() {
        return contratantePrimerNombre;
    }
    
    /**
     * Sets the value of attribute PrimerNombre
     */
    public void setContratantePrimerNombre(String contratantePrimerNombre) {
        this.contratantePrimerNombre = contratantePrimerNombre;
    }

    /**
     * Gets the value of attribute SegundoNombre
     */
    public String getContratanteSegundoNombre() {
        return contratanteSegundoNombre;
    }
    
    /**
     * Sets the value of attribute SegundoNombre
     */
    public void setContratanteSegundoNombre(String contratanteSegundoNombre) {
        this.contratanteSegundoNombre = contratanteSegundoNombre;
    }

    /**
     * Gets the value of attribute PrimerApellido
     */
    public String getContratantePrimerApellido() {
        return contratantePrimerApellido;
    }
    
    /**
     * Sets the value of attribute PrimerApellido
     */
    public void setContratantePrimerApellido(String contratantePrimerApellido) {
        this.contratantePrimerApellido = contratantePrimerApellido;
    }

    /**
     * Gets the value of attribute SegundoApellido
     */
    public String getContratanteSegundoApellido() {
        return contratanteSegundoApellido;
    }
    
    /**
     * Sets the value of attribute SegundoApellido
     */
    public void setContratanteSegundoApellido(String contratanteSegundoApellido) {
        this.contratanteSegundoApellido = contratanteSegundoApellido;
    }

    /**
     * Gets the value of attribute RazonSocial
     */
    public String getContratanteRazonSocial() {
        return contratanteRazonSocial;
    }
    
    /**
     * Sets the value of attribute RazonSocial
     */
    public void setContratanteRazonSocial(String contratanteRazonSocial) {
        this.contratanteRazonSocial = contratanteRazonSocial;
    }

    /**
     * Gets the value of attribute FechaNacimiento
     */
    public Date getContratanteFechaNacimiento() {
        return contratanteFechaNacimiento;
    }
    
    /**
     * Sets the value of attribute FechaNacimiento
     */
    public void setContratanteFechaNacimiento(Date contratanteFechaNacimiento) {
        this.contratanteFechaNacimiento = contratanteFechaNacimiento;
    }

    /**
     * Gets the value of attribute Genero
     */
    public String getContratanteGenero() {
        return contratanteGenero;
    }
    
    /**
     * Sets the value of attribute Genero
     */
    public void setContratanteGenero(String contratanteGenero) {
        this.contratanteGenero = contratanteGenero;
    }

    /**
     * Gets the value of attribute IndicadorExtranjero
     */
    public Boolean getContratanteIndicadorExtranjero() {
        return contratanteIndicadorExtranjero;
    }
    
    /**
     * Sets the value of attribute IndicadorExtranjero
     */
    public void setContratanteIndicadorExtranjero(Boolean contratanteIndicadorExtranjero) {
        this.contratanteIndicadorExtranjero = contratanteIndicadorExtranjero;
    }

    /**
     * Gets the value of attribute TelefonoFijo
     */
    public String getContratanteTelefonoFijo() {
        return contratanteTelefonoFijo;
    }
    
    /**
     * Sets the value of attribute TelefonoFijo
     */
    public void setContratanteTelefonoFijo(String contratanteTelefonoFijo) {
        this.contratanteTelefonoFijo = contratanteTelefonoFijo;
    }

    /**
     * Gets the value of attribute TelefonoCelular
     */
    public String getContratanteTelefonoCelular() {
        return contratanteTelefonoCelular;
    }
    
    /**
     * Sets the value of attribute TelefonoCelular
     */
    public void setContratanteTelefonoCelular(String contratanteTelefonoCelular) {
        this.contratanteTelefonoCelular = contratanteTelefonoCelular;
    }

    /**
     * Gets the value of attribute CorreoElectronico
     */
    public String getContratanteCorreoElectronico() {
        return contratanteCorreoElectronico;
    }
    
    /**
     * Sets the value of attribute CorreoElectronico
     */
    public void setContratanteCorreoElectronico(String contratanteCorreoElectronico) {
        this.contratanteCorreoElectronico = contratanteCorreoElectronico;
    }

    /**
     * Gets the value of attribute TitularConBeneficios
     */
    public Boolean getContratanteTitularConBeneficios() {
        return contratanteTitularConBeneficios;
    }
    
    /**
     * Sets the value of attribute TitularConBeneficios
     */
    public void setContratanteTitularConBeneficios(Boolean contratanteTitularConBeneficios) {
        this.contratanteTitularConBeneficios = contratanteTitularConBeneficios;
    }

    /**
     * Gets the value of attribute Diplomatico
     */
    public Boolean getContratanteDiplomatico() {
        return contratanteDiplomatico;
    }
    
    /**
     * Sets the value of attribute Diplomatico
     */
    public void setContratanteDiplomatico(Boolean contratanteDiplomatico) {
        this.contratanteDiplomatico = contratanteDiplomatico;
    }

    /**
     * Gets the value of attribute drvIdentificacion
     */
    public String getContratantedrvIdentificacion() {
        return contratantedrvIdentificacion;
    }
    
    /**
     * Sets the value of attribute drvIdentificacion
     */
    public void setContratantedrvIdentificacion(String contratantedrvIdentificacion) {
        this.contratantedrvIdentificacion = contratantedrvIdentificacion;
    }

    /**
     * Gets the value of attribute drvNombreCompleto
     */
    public String getContratantedrvNombreCompleto() {
        return contratantedrvNombreCompleto;
    }
    
    /**
     * Sets the value of attribute drvNombreCompleto
     */
    public void setContratantedrvNombreCompleto(String contratantedrvNombreCompleto) {
        this.contratantedrvNombreCompleto = contratantedrvNombreCompleto;
    }

    /**
     * Gets the value of attribute DireccionRes
     */
    public String getContratanteDireccionRes() {
        return contratanteDireccionRes;
    }
    
    /**
     * Sets the value of attribute DireccionRes
     */
    public void setContratanteDireccionRes(String contratanteDireccionRes) {
        this.contratanteDireccionRes = contratanteDireccionRes;
    }

    /**
     * Gets the value of attribute TelefonoFijoRes
     */
    public String getContratanteTelefonoFijoRes() {
        return contratanteTelefonoFijoRes;
    }
    
    /**
     * Sets the value of attribute TelefonoFijoRes
     */
    public void setContratanteTelefonoFijoRes(String contratanteTelefonoFijoRes) {
        this.contratanteTelefonoFijoRes = contratanteTelefonoFijoRes;
    }

    /**
     * Gets the value of attribute TelefonoCelularRes
     */
    public String getContratanteTelefonoCelularRes() {
        return contratanteTelefonoCelularRes;
    }
    
    /**
     * Sets the value of attribute TelefonoCelularRes
     */
    public void setContratanteTelefonoCelularRes(String contratanteTelefonoCelularRes) {
        this.contratanteTelefonoCelularRes = contratanteTelefonoCelularRes;
    }

    /**
     * Gets the value of attribute RuralDirRes
     */
    public Boolean getContratanteRuralDirRes() {
        return contratanteRuralDirRes;
    }
    
    /**
     * Sets the value of attribute RuralDirRes
     */
    public void setContratanteRuralDirRes(Boolean contratanteRuralDirRes) {
        this.contratanteRuralDirRes = contratanteRuralDirRes;
    }

    /**
     * Gets the value of attribute TitularConBeneficiosCORE
     */
    public Boolean getContratanteTitularConBeneficiosCORE() {
        return contratanteTitularConBeneficiosCORE;
    }
    
    /**
     * Sets the value of attribute TitularConBeneficiosCORE
     */
    public void setContratanteTitularConBeneficiosCORE(Boolean contratanteTitularConBeneficiosCORE) {
        this.contratanteTitularConBeneficiosCORE = contratanteTitularConBeneficiosCORE;
    }

    /**
     * Gets the value of attribute drvBeneficiosActivo
     */
    public Boolean getContratantedrvBeneficiosActivo() {
        return contratantedrvBeneficiosActivo;
    }
    
    /**
     * Sets the value of attribute drvBeneficiosActivo
     */
    public void setContratantedrvBeneficiosActivo(Boolean contratantedrvBeneficiosActivo) {
        this.contratantedrvBeneficiosActivo = contratantedrvBeneficiosActivo;
    }

    /**
     * Gets the value of attribute DireccionesModificadas
     */
    public Boolean getContratanteDireccionesModificadas() {
        return contratanteDireccionesModificadas;
    }
    
    /**
     * Sets the value of attribute DireccionesModificadas
     */
    public void setContratanteDireccionesModificadas(Boolean contratanteDireccionesModificadas) {
        this.contratanteDireccionesModificadas = contratanteDireccionesModificadas;
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
     * Gets the value of relation through role DepartamentoRes
     */
    @JsonIgnore
    public Departamento getDepartamentoRes() {
        return departamentoRes;
    }

    /**
     * Gets the value of relation through role MunicipioRes
     */
    @JsonIgnore
    public Municipio getMunicipioRes() {
        return municipioRes;
    }

    /**
     * Default constructor
     */
    public Contratante() {
        aesolicitudesidsolicitud = null;
    }

    /**
     * Constructor used to create instances of <code>Contratante</code>.
     * @param oid Object Identifier of the instance of <code>Contratante</code> to be created.
     * @throws SystemException
     */
    public Contratante(ContratanteOid oid) {
        if (oid != null && !oid.isNull()) {
            aesolicitudesidsolicitud = oid.getAesolicitudesidsolicitud();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return Contratante.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Contratante other = (Contratante)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getContratanteCodigo(), other.getContratanteCodigo());
        result &= Utilities.isEqual(this.getContratanteNumIdentificacion(), other.getContratanteNumIdentificacion());
        result &= Utilities.isEqual(this.getContratanteTipoPersona(), other.getContratanteTipoPersona());
        result &= Utilities.isEqual(this.getContratantePrimerNombre(), other.getContratantePrimerNombre());
        result &= Utilities.isEqual(this.getContratanteSegundoNombre(), other.getContratanteSegundoNombre());
        result &= Utilities.isEqual(this.getContratantePrimerApellido(), other.getContratantePrimerApellido());
        result &= Utilities.isEqual(this.getContratanteSegundoApellido(), other.getContratanteSegundoApellido());
        result &= Utilities.isEqual(this.getContratanteRazonSocial(), other.getContratanteRazonSocial());
        result &= Utilities.isEqual(this.getContratanteFechaNacimiento(), other.getContratanteFechaNacimiento());
        result &= Utilities.isEqual(this.getContratanteGenero(), other.getContratanteGenero());
        result &= Utilities.isEqual(this.getContratanteIndicadorExtranjero(), other.getContratanteIndicadorExtranjero());
        result &= Utilities.isEqual(this.getContratanteTelefonoFijo(), other.getContratanteTelefonoFijo());
        result &= Utilities.isEqual(this.getContratanteTelefonoCelular(), other.getContratanteTelefonoCelular());
        result &= Utilities.isEqual(this.getContratanteCorreoElectronico(), other.getContratanteCorreoElectronico());
        result &= Utilities.isEqual(this.getContratanteTitularConBeneficios(), other.getContratanteTitularConBeneficios());
        result &= Utilities.isEqual(this.getContratanteDiplomatico(), other.getContratanteDiplomatico());
        result &= Utilities.isEqual(this.getContratantedrvIdentificacion(), other.getContratantedrvIdentificacion());
        result &= Utilities.isEqual(this.getContratantedrvNombreCompleto(), other.getContratantedrvNombreCompleto());
        result &= Utilities.isEqual(this.getContratanteDireccionRes(), other.getContratanteDireccionRes());
        result &= Utilities.isEqual(this.getContratanteTelefonoFijoRes(), other.getContratanteTelefonoFijoRes());
        result &= Utilities.isEqual(this.getContratanteTelefonoCelularRes(), other.getContratanteTelefonoCelularRes());
        result &= Utilities.isEqual(this.getContratanteRuralDirRes(), other.getContratanteRuralDirRes());
        result &= Utilities.isEqual(this.getContratanteTitularConBeneficiosCORE(), other.getContratanteTitularConBeneficiosCORE());
        result &= Utilities.isEqual(this.getContratantedrvBeneficiosActivo(), other.getContratantedrvBeneficiosActivo());
        result &= Utilities.isEqual(this.getContratanteDireccionesModificadas(), other.getContratanteDireccionesModificadas());
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
     * Returns the <code>ContratanteOid</code> object that identifies this instance of <code>Contratante</code>.
     * @return <code>ContratanteOid</code> object that identifies this instance of <code>Contratante</code>
     */
	@Override
    public ContratanteOid getOid() {
        return new ContratanteOid(getAesolicitudesidsolicitud());
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
        if (!activeFacets.contains(Constants.CONTRATANTE)) {
            activeFacets.add(Constants.CONTRATANTE);
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
            relatedInstance = buildContratanteRelatedInstance(relatedInstanceJsonOid);
        }
        if (ContratanteConstants.ROLE_NAME_SOLICITUD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildContratanteRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        if (ContratanteConstants.ROLE_NAME_TIPOIDENTIFICACION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildContratanteRelatedInstance4TipoIdentificacion(relatedInstanceJsonOid, remainingPath);
        }
        if (ContratanteConstants.ROLE_NAME_DEPARTAMENTONAC.equalsIgnoreCase(relatedInstancePathFirstItem) || ContratanteConstants.ROLE_NAME_DEPARTAMENTORES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildContratanteRelatedInstance4Departamento(relatedInstanceJsonOid, remainingPath);
        }
        if (ContratanteConstants.ROLE_NAME_MUNICIPIONAC.equalsIgnoreCase(relatedInstancePathFirstItem) || ContratanteConstants.ROLE_NAME_MUNICIPIORES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildContratanteRelatedInstance4Municipio(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildContratanteRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Contratante(mapper.readValue(relatedInstanceJsonOid, ContratanteOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Contratante.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildContratanteRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Contratante.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildContratanteRelatedInstance4TipoIdentificacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TipoIdentificacion(mapper.readValue(relatedInstanceJsonOid, TipoIdentificacionOid.class)): TipoIdentificacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Contratante.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildContratanteRelatedInstance4Departamento(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Departamento(mapper.readValue(relatedInstanceJsonOid, DepartamentoOid.class)): Departamento.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Contratante.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildContratanteRelatedInstance4Municipio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Municipio(mapper.readValue(relatedInstanceJsonOid, MunicipioOid.class)): Municipio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Contratante.class).error(e.getMessage());
            return null;
        }
    }
}
