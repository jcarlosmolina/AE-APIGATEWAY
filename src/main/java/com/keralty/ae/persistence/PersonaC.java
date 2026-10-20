package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.PersonaCConstants;
import com.keralty.ae.persistence.oid.BeneficiarioCOid;
import com.keralty.ae.persistence.oid.ContratoCOid;
import com.keralty.ae.persistence.oid.DepartamentoOid;
import com.keralty.ae.persistence.oid.DireccionCOid;
import com.keralty.ae.persistence.oid.DirSucursalCOid;
import com.keralty.ae.persistence.oid.EstadoCivilOid;
import com.keralty.ae.persistence.oid.EstadoPersonaOid;
import com.keralty.ae.persistence.oid.FamiliaCOid;
import com.keralty.ae.persistence.oid.MarcaMedicaCOid;
import com.keralty.ae.persistence.oid.MunicipioOid;
import com.keralty.ae.persistence.oid.PersonaCOid;
import com.keralty.ae.persistence.oid.PreexistenciaCOid;
import com.keralty.ae.persistence.oid.PregCuesMedCOid;
import com.keralty.ae.persistence.oid.ProteccionDatosCOid;
import com.keralty.ae.persistence.oid.TipoEntidadCOid;
import com.keralty.ae.persistence.oid.TipoIdentificacionOid;
import com.keralty.ae.persistence.oid.TipoInstitucionCOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>PersonaC</code> external model class.
 * <p>
 * External Model Class: <code>PersonaC</code><br>
 */
public class PersonaC extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id")
    private Long personaCID;

    @JsonProperty(value="codigo")
    private Long personaCCodigo;

    @JsonProperty(value="numidentificacion")
    private String personaCNumIdentificacion;

    @JsonProperty(value="mail")
    private String personaCMail;

    @JsonProperty(value="primernombre")
    private String personaCPrimerNombre;

    @JsonProperty(value="segundonombre")
    private String personaCSegundoNombre;

    @JsonProperty(value="primerapellido")
    private String personaCPrimerApellido;

    @JsonProperty(value="segundoapellido")
    private String personaCSegundoApellido;

    @JsonProperty(value="fechanacimiento")
    private Date personaCFechaNacimiento;

    @JsonProperty(value="genero")
    private String personaCGenero;

    @JsonProperty(value="indicadorextranjero")
    private Boolean personaCIndicadorExtranjero;

    @JsonProperty(value="razonsocial")
    private String personaCRazonSocial;

    @JsonProperty(value="drvtipopersona")
    private String personaCdrvTipoPersona;

    @JsonProperty(value="tieneepssanitas")
    private Boolean personaCTieneEPSSanitas;

    @JsonProperty(value="rechazadoafiliacion")
    private String personaCRechazadoAfiliacion;

    @JsonProperty(value="drvrechazada")
    private Boolean personaCdrvRechazada;

    @JsonProperty(value="nombrecompleto")
    private String personaCNombreCompleto;

    @JsonProperty(value="ultimaactualizacion")
    private Timestamp personaCUltimaActualizacion;

    @JsonProperty(value="drvnombrecompleto")
    private String personaCdrvNombreCompleto;

    @JsonProperty(value="drvdircorrespondencia")
    private String personaCdrvDirCorrespondencia;

    @JsonProperty(value="drvciudadcorrespondencia")
    private String personaCdrvCiudadCorrespondencia;

    @JsonProperty(value="drvtiponumdoc")
    private String personaCdrvTipoNumDoc;

    @JsonProperty(value="drvedad")
    private Long personaCdrvEdad;

    @JsonProperty(value="drvobscontrato")
    private String personaCdrvObsContrato;

    @JsonProperty(value="drvimc")
    private Double personaCdrvIMC;

    private Collection <DireccionC> direccionesC;

    private Collection <ProteccionDatosC> proteccionesDatosC;

    private Collection <PregCuesMedC> pregsCuesMedC;

    private Collection <DirSucursalC> dirSucursalesC;

    private Collection <PreexistenciaC> preexistenciasC;

    private Collection <MarcaMedicaC> marcasMedicasC;

    private TipoInstitucionC tipoInstitucionC;

    private TipoEntidadC tipoEntidadC;

    private EstadoCivil estadoCivilC;

    private EstadoPersona estadoPersonaC;

    private TipoIdentificacion tipoIdentificacionC;

    private Municipio municipioCNac;

    private Departamento departamentoCNac;

    private ContratoC contratosC;

    private FamiliaC familiasC;

    private BeneficiarioC beneficiariosC;

    /**
     * Gets the value of attribute ID
     */
    public Long getPersonaCID() {
        return personaCID;
    }
    
    /**
     * Sets the value of attribute ID
     */
    public void setPersonaCID(Long personaCID) {
        this.personaCID = personaCID;
    }

    /**
     * Gets the value of attribute Codigo
     */
    public Long getPersonaCCodigo() {
        return personaCCodigo;
    }
    
    /**
     * Sets the value of attribute Codigo
     */
    public void setPersonaCCodigo(Long personaCCodigo) {
        this.personaCCodigo = personaCCodigo;
    }

    /**
     * Gets the value of attribute NumIdentificacion
     */
    public String getPersonaCNumIdentificacion() {
        return personaCNumIdentificacion;
    }
    
    /**
     * Sets the value of attribute NumIdentificacion
     */
    public void setPersonaCNumIdentificacion(String personaCNumIdentificacion) {
        this.personaCNumIdentificacion = personaCNumIdentificacion;
    }

    /**
     * Gets the value of attribute Mail
     */
    public String getPersonaCMail() {
        return personaCMail;
    }
    
    /**
     * Sets the value of attribute Mail
     */
    public void setPersonaCMail(String personaCMail) {
        this.personaCMail = personaCMail;
    }

    /**
     * Gets the value of attribute PrimerNombre
     */
    public String getPersonaCPrimerNombre() {
        return personaCPrimerNombre;
    }
    
    /**
     * Sets the value of attribute PrimerNombre
     */
    public void setPersonaCPrimerNombre(String personaCPrimerNombre) {
        this.personaCPrimerNombre = personaCPrimerNombre;
    }

    /**
     * Gets the value of attribute SegundoNombre
     */
    public String getPersonaCSegundoNombre() {
        return personaCSegundoNombre;
    }
    
    /**
     * Sets the value of attribute SegundoNombre
     */
    public void setPersonaCSegundoNombre(String personaCSegundoNombre) {
        this.personaCSegundoNombre = personaCSegundoNombre;
    }

    /**
     * Gets the value of attribute PrimerApellido
     */
    public String getPersonaCPrimerApellido() {
        return personaCPrimerApellido;
    }
    
    /**
     * Sets the value of attribute PrimerApellido
     */
    public void setPersonaCPrimerApellido(String personaCPrimerApellido) {
        this.personaCPrimerApellido = personaCPrimerApellido;
    }

    /**
     * Gets the value of attribute SegundoApellido
     */
    public String getPersonaCSegundoApellido() {
        return personaCSegundoApellido;
    }
    
    /**
     * Sets the value of attribute SegundoApellido
     */
    public void setPersonaCSegundoApellido(String personaCSegundoApellido) {
        this.personaCSegundoApellido = personaCSegundoApellido;
    }

    /**
     * Gets the value of attribute FechaNacimiento
     */
    public Date getPersonaCFechaNacimiento() {
        return personaCFechaNacimiento;
    }
    
    /**
     * Sets the value of attribute FechaNacimiento
     */
    public void setPersonaCFechaNacimiento(Date personaCFechaNacimiento) {
        this.personaCFechaNacimiento = personaCFechaNacimiento;
    }

    /**
     * Gets the value of attribute Genero
     */
    public String getPersonaCGenero() {
        return personaCGenero;
    }
    
    /**
     * Sets the value of attribute Genero
     */
    public void setPersonaCGenero(String personaCGenero) {
        this.personaCGenero = personaCGenero;
    }

    /**
     * Gets the value of attribute IndicadorExtranjero
     */
    public Boolean getPersonaCIndicadorExtranjero() {
        return personaCIndicadorExtranjero;
    }
    
    /**
     * Sets the value of attribute IndicadorExtranjero
     */
    public void setPersonaCIndicadorExtranjero(Boolean personaCIndicadorExtranjero) {
        this.personaCIndicadorExtranjero = personaCIndicadorExtranjero;
    }

    /**
     * Gets the value of attribute RazonSocial
     */
    public String getPersonaCRazonSocial() {
        return personaCRazonSocial;
    }
    
    /**
     * Sets the value of attribute RazonSocial
     */
    public void setPersonaCRazonSocial(String personaCRazonSocial) {
        this.personaCRazonSocial = personaCRazonSocial;
    }

    /**
     * Gets the value of attribute drvTipoPersona
     */
    public String getPersonaCdrvTipoPersona() {
        return personaCdrvTipoPersona;
    }
    
    /**
     * Sets the value of attribute drvTipoPersona
     */
    public void setPersonaCdrvTipoPersona(String personaCdrvTipoPersona) {
        this.personaCdrvTipoPersona = personaCdrvTipoPersona;
    }

    /**
     * Gets the value of attribute TieneEPSSanitas
     */
    public Boolean getPersonaCTieneEPSSanitas() {
        return personaCTieneEPSSanitas;
    }
    
    /**
     * Sets the value of attribute TieneEPSSanitas
     */
    public void setPersonaCTieneEPSSanitas(Boolean personaCTieneEPSSanitas) {
        this.personaCTieneEPSSanitas = personaCTieneEPSSanitas;
    }

    /**
     * Gets the value of attribute RechazadoAfiliacion
     */
    public String getPersonaCRechazadoAfiliacion() {
        return personaCRechazadoAfiliacion;
    }
    
    /**
     * Sets the value of attribute RechazadoAfiliacion
     */
    public void setPersonaCRechazadoAfiliacion(String personaCRechazadoAfiliacion) {
        this.personaCRechazadoAfiliacion = personaCRechazadoAfiliacion;
    }

    /**
     * Gets the value of attribute drvRechazada
     */
    public Boolean getPersonaCdrvRechazada() {
        return personaCdrvRechazada;
    }
    
    /**
     * Sets the value of attribute drvRechazada
     */
    public void setPersonaCdrvRechazada(Boolean personaCdrvRechazada) {
        this.personaCdrvRechazada = personaCdrvRechazada;
    }

    /**
     * Gets the value of attribute NombreCompleto
     */
    public String getPersonaCNombreCompleto() {
        return personaCNombreCompleto;
    }
    
    /**
     * Sets the value of attribute NombreCompleto
     */
    public void setPersonaCNombreCompleto(String personaCNombreCompleto) {
        this.personaCNombreCompleto = personaCNombreCompleto;
    }

    /**
     * Gets the value of attribute UltimaActualizacion
     */
    public Timestamp getPersonaCUltimaActualizacion() {
        return personaCUltimaActualizacion;
    }
    
    /**
     * Sets the value of attribute UltimaActualizacion
     */
    public void setPersonaCUltimaActualizacion(Timestamp personaCUltimaActualizacion) {
        this.personaCUltimaActualizacion = personaCUltimaActualizacion;
    }

    /**
     * Gets the value of attribute drvNombreCompleto
     */
    public String getPersonaCdrvNombreCompleto() {
        return personaCdrvNombreCompleto;
    }
    
    /**
     * Sets the value of attribute drvNombreCompleto
     */
    public void setPersonaCdrvNombreCompleto(String personaCdrvNombreCompleto) {
        this.personaCdrvNombreCompleto = personaCdrvNombreCompleto;
    }

    /**
     * Gets the value of attribute drvDirCorrespondencia
     */
    public String getPersonaCdrvDirCorrespondencia() {
        return personaCdrvDirCorrespondencia;
    }
    
    /**
     * Sets the value of attribute drvDirCorrespondencia
     */
    public void setPersonaCdrvDirCorrespondencia(String personaCdrvDirCorrespondencia) {
        this.personaCdrvDirCorrespondencia = personaCdrvDirCorrespondencia;
    }

    /**
     * Gets the value of attribute drvCiudadCorrespondencia
     */
    public String getPersonaCdrvCiudadCorrespondencia() {
        return personaCdrvCiudadCorrespondencia;
    }
    
    /**
     * Sets the value of attribute drvCiudadCorrespondencia
     */
    public void setPersonaCdrvCiudadCorrespondencia(String personaCdrvCiudadCorrespondencia) {
        this.personaCdrvCiudadCorrespondencia = personaCdrvCiudadCorrespondencia;
    }

    /**
     * Gets the value of attribute drvTipoNumDoc
     */
    public String getPersonaCdrvTipoNumDoc() {
        return personaCdrvTipoNumDoc;
    }
    
    /**
     * Sets the value of attribute drvTipoNumDoc
     */
    public void setPersonaCdrvTipoNumDoc(String personaCdrvTipoNumDoc) {
        this.personaCdrvTipoNumDoc = personaCdrvTipoNumDoc;
    }

    /**
     * Gets the value of attribute drvEdad
     */
    public Long getPersonaCdrvEdad() {
        return personaCdrvEdad;
    }
    
    /**
     * Sets the value of attribute drvEdad
     */
    public void setPersonaCdrvEdad(Long personaCdrvEdad) {
        this.personaCdrvEdad = personaCdrvEdad;
    }

    /**
     * Gets the value of attribute drvObsContrato
     */
    public String getPersonaCdrvObsContrato() {
        return personaCdrvObsContrato;
    }
    
    /**
     * Sets the value of attribute drvObsContrato
     */
    public void setPersonaCdrvObsContrato(String personaCdrvObsContrato) {
        this.personaCdrvObsContrato = personaCdrvObsContrato;
    }

    /**
     * Gets the value of attribute drvIMC
     */
    public Double getPersonaCdrvIMC() {
        return personaCdrvIMC;
    }
    
    /**
     * Sets the value of attribute drvIMC
     */
    public void setPersonaCdrvIMC(Double personaCdrvIMC) {
        this.personaCdrvIMC = personaCdrvIMC;
    }

    /**
     * Gets the value of relation through role DireccionesC
     */
    @JsonIgnore
    public Collection <DireccionC> getDireccionesC() {
        return direccionesC;
    }

    /**
     * Gets the value of relation through role ProteccionesDatosC
     */
    @JsonIgnore
    public Collection <ProteccionDatosC> getProteccionesDatosC() {
        return proteccionesDatosC;
    }

    /**
     * Gets the value of relation through role PregsCuesMedC
     */
    @JsonIgnore
    public Collection <PregCuesMedC> getPregsCuesMedC() {
        return pregsCuesMedC;
    }

    /**
     * Gets the value of relation through role DirSucursalesC
     */
    @JsonIgnore
    public Collection <DirSucursalC> getDirSucursalesC() {
        return dirSucursalesC;
    }

    /**
     * Gets the value of relation through role PreexistenciasC
     */
    @JsonIgnore
    public Collection <PreexistenciaC> getPreexistenciasC() {
        return preexistenciasC;
    }

    /**
     * Gets the value of relation through role MarcasMedicasC
     */
    @JsonIgnore
    public Collection <MarcaMedicaC> getMarcasMedicasC() {
        return marcasMedicasC;
    }

    /**
     * Gets the value of relation through role TipoInstitucionC
     */
    @JsonIgnore
    public TipoInstitucionC getTipoInstitucionC() {
        return tipoInstitucionC;
    }

    /**
     * Gets the value of relation through role TipoEntidadC
     */
    @JsonIgnore
    public TipoEntidadC getTipoEntidadC() {
        return tipoEntidadC;
    }

    /**
     * Gets the value of relation through role EstadoCivilC
     */
    @JsonIgnore
    public EstadoCivil getEstadoCivilC() {
        return estadoCivilC;
    }

    /**
     * Gets the value of relation through role EstadoPersonaC
     */
    @JsonIgnore
    public EstadoPersona getEstadoPersonaC() {
        return estadoPersonaC;
    }

    /**
     * Gets the value of relation through role TipoIdentificacionC
     */
    @JsonIgnore
    public TipoIdentificacion getTipoIdentificacionC() {
        return tipoIdentificacionC;
    }

    /**
     * Gets the value of relation through role MunicipioCNac
     */
    @JsonIgnore
    public Municipio getMunicipioCNac() {
        return municipioCNac;
    }

    /**
     * Gets the value of relation through role DepartamentoCNac
     */
    @JsonIgnore
    public Departamento getDepartamentoCNac() {
        return departamentoCNac;
    }

    /**
     * Gets the value of relation through role ContratosC
     */
    @JsonIgnore
    public ContratoC getContratosC() {
        return contratosC;
    }

    /**
     * Gets the value of relation through role FamiliasC
     */
    @JsonIgnore
    public FamiliaC getFamiliasC() {
        return familiasC;
    }

    /**
     * Gets the value of relation through role BeneficiariosC
     */
    @JsonIgnore
    public BeneficiarioC getBeneficiariosC() {
        return beneficiariosC;
    }

    /**
     * Default constructor
     */
    public PersonaC() {
        personaCID = null;
    }

    /**
     * Constructor used to create instances of <code>PersonaC</code>.
     * @param oid Object Identifier of the instance of <code>PersonaC</code> to be created.
     * @throws SystemException
     */
    public PersonaC(PersonaCOid oid) {
        if (oid != null && !oid.isNull()) {
            personaCID = oid.getPersonaCID();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return PersonaC.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        PersonaC other = (PersonaC)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getPersonaCID(), other.getPersonaCID());
        result &= Utilities.isEqual(this.getPersonaCCodigo(), other.getPersonaCCodigo());
        result &= Utilities.isEqual(this.getPersonaCNumIdentificacion(), other.getPersonaCNumIdentificacion());
        result &= Utilities.isEqual(this.getPersonaCMail(), other.getPersonaCMail());
        result &= Utilities.isEqual(this.getPersonaCPrimerNombre(), other.getPersonaCPrimerNombre());
        result &= Utilities.isEqual(this.getPersonaCSegundoNombre(), other.getPersonaCSegundoNombre());
        result &= Utilities.isEqual(this.getPersonaCPrimerApellido(), other.getPersonaCPrimerApellido());
        result &= Utilities.isEqual(this.getPersonaCSegundoApellido(), other.getPersonaCSegundoApellido());
        result &= Utilities.isEqual(this.getPersonaCFechaNacimiento(), other.getPersonaCFechaNacimiento());
        result &= Utilities.isEqual(this.getPersonaCGenero(), other.getPersonaCGenero());
        result &= Utilities.isEqual(this.getPersonaCIndicadorExtranjero(), other.getPersonaCIndicadorExtranjero());
        result &= Utilities.isEqual(this.getPersonaCRazonSocial(), other.getPersonaCRazonSocial());
        result &= Utilities.isEqual(this.getPersonaCdrvTipoPersona(), other.getPersonaCdrvTipoPersona());
        result &= Utilities.isEqual(this.getPersonaCTieneEPSSanitas(), other.getPersonaCTieneEPSSanitas());
        result &= Utilities.isEqual(this.getPersonaCRechazadoAfiliacion(), other.getPersonaCRechazadoAfiliacion());
        result &= Utilities.isEqual(this.getPersonaCdrvRechazada(), other.getPersonaCdrvRechazada());
        result &= Utilities.isEqual(this.getPersonaCNombreCompleto(), other.getPersonaCNombreCompleto());
        result &= Utilities.isEqual(this.getPersonaCUltimaActualizacion(), other.getPersonaCUltimaActualizacion());
        result &= Utilities.isEqual(this.getPersonaCdrvNombreCompleto(), other.getPersonaCdrvNombreCompleto());
        result &= Utilities.isEqual(this.getPersonaCdrvDirCorrespondencia(), other.getPersonaCdrvDirCorrespondencia());
        result &= Utilities.isEqual(this.getPersonaCdrvCiudadCorrespondencia(), other.getPersonaCdrvCiudadCorrespondencia());
        result &= Utilities.isEqual(this.getPersonaCdrvTipoNumDoc(), other.getPersonaCdrvTipoNumDoc());
        result &= Utilities.isEqual(this.getPersonaCdrvEdad(), other.getPersonaCdrvEdad());
        result &= Utilities.isEqual(this.getPersonaCdrvObsContrato(), other.getPersonaCdrvObsContrato());
        result &= Utilities.isEqual(this.getPersonaCdrvIMC(), other.getPersonaCdrvIMC());
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
     * Returns the <code>PersonaCOid</code> object that identifies this instance of <code>PersonaC</code>.
     * @return <code>PersonaCOid</code> object that identifies this instance of <code>PersonaC</code>
     */
	@Override
    public PersonaCOid getOid() {
        return new PersonaCOid(getPersonaCID());
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
        if (!activeFacets.contains(Constants.PERSONAC)) {
            activeFacets.add(Constants.PERSONAC);
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
            relatedInstance = buildPersonaCRelatedInstance(relatedInstanceJsonOid);
        }
        if (PersonaCConstants.ROLE_NAME_DIRECCIONESC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaCRelatedInstance4DireccionC(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaCConstants.ROLE_NAME_PROTECCIONESDATOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaCRelatedInstance4ProteccionDatosC(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaCConstants.ROLE_NAME_PREGSCUESMEDC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaCRelatedInstance4PregCuesMedC(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaCConstants.ROLE_NAME_DIRSUCURSALESC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaCRelatedInstance4DirSucursalC(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaCConstants.ROLE_NAME_PREEXISTENCIASC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaCRelatedInstance4PreexistenciaC(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaCConstants.ROLE_NAME_MARCASMEDICASC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaCRelatedInstance4MarcaMedicaC(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaCConstants.ROLE_NAME_TIPOINSTITUCIONC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaCRelatedInstance4TipoInstitucionC(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaCConstants.ROLE_NAME_TIPOENTIDADC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaCRelatedInstance4TipoEntidadC(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaCConstants.ROLE_NAME_ESTADOCIVILC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaCRelatedInstance4EstadoCivil(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaCConstants.ROLE_NAME_ESTADOPERSONAC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaCRelatedInstance4EstadoPersona(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaCConstants.ROLE_NAME_TIPOIDENTIFICACIONC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaCRelatedInstance4TipoIdentificacion(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaCConstants.ROLE_NAME_MUNICIPIOCNAC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaCRelatedInstance4Municipio(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaCConstants.ROLE_NAME_DEPARTAMENTOCNAC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaCRelatedInstance4Departamento(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaCConstants.ROLE_NAME_CONTRATOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaCRelatedInstance4ContratoC(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaCConstants.ROLE_NAME_FAMILIASC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaCRelatedInstance4FamiliaC(relatedInstanceJsonOid, remainingPath);
        }
        if (PersonaCConstants.ROLE_NAME_BENEFICIARIOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPersonaCRelatedInstance4BeneficiarioC(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildPersonaCRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new PersonaC(mapper.readValue(relatedInstanceJsonOid, PersonaCOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PersonaC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPersonaCRelatedInstance4DireccionC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new DireccionC(mapper.readValue(relatedInstanceJsonOid, DireccionCOid.class)): DireccionC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PersonaC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPersonaCRelatedInstance4ProteccionDatosC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ProteccionDatosC(mapper.readValue(relatedInstanceJsonOid, ProteccionDatosCOid.class)): ProteccionDatosC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PersonaC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPersonaCRelatedInstance4PregCuesMedC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PregCuesMedC(mapper.readValue(relatedInstanceJsonOid, PregCuesMedCOid.class)): PregCuesMedC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PersonaC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPersonaCRelatedInstance4DirSucursalC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new DirSucursalC(mapper.readValue(relatedInstanceJsonOid, DirSucursalCOid.class)): DirSucursalC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PersonaC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPersonaCRelatedInstance4PreexistenciaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PreexistenciaC(mapper.readValue(relatedInstanceJsonOid, PreexistenciaCOid.class)): PreexistenciaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PersonaC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPersonaCRelatedInstance4MarcaMedicaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new MarcaMedicaC(mapper.readValue(relatedInstanceJsonOid, MarcaMedicaCOid.class)): MarcaMedicaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PersonaC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPersonaCRelatedInstance4TipoInstitucionC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TipoInstitucionC(mapper.readValue(relatedInstanceJsonOid, TipoInstitucionCOid.class)): TipoInstitucionC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PersonaC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPersonaCRelatedInstance4TipoEntidadC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TipoEntidadC(mapper.readValue(relatedInstanceJsonOid, TipoEntidadCOid.class)): TipoEntidadC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PersonaC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPersonaCRelatedInstance4EstadoCivil(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new EstadoCivil(mapper.readValue(relatedInstanceJsonOid, EstadoCivilOid.class)): EstadoCivil.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PersonaC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPersonaCRelatedInstance4EstadoPersona(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new EstadoPersona(mapper.readValue(relatedInstanceJsonOid, EstadoPersonaOid.class)): EstadoPersona.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PersonaC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPersonaCRelatedInstance4TipoIdentificacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TipoIdentificacion(mapper.readValue(relatedInstanceJsonOid, TipoIdentificacionOid.class)): TipoIdentificacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PersonaC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPersonaCRelatedInstance4Municipio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Municipio(mapper.readValue(relatedInstanceJsonOid, MunicipioOid.class)): Municipio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PersonaC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPersonaCRelatedInstance4Departamento(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Departamento(mapper.readValue(relatedInstanceJsonOid, DepartamentoOid.class)): Departamento.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PersonaC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPersonaCRelatedInstance4ContratoC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ContratoC(mapper.readValue(relatedInstanceJsonOid, ContratoCOid.class)): ContratoC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PersonaC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPersonaCRelatedInstance4FamiliaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new FamiliaC(mapper.readValue(relatedInstanceJsonOid, FamiliaCOid.class)): FamiliaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PersonaC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPersonaCRelatedInstance4BeneficiarioC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new BeneficiarioC(mapper.readValue(relatedInstanceJsonOid, BeneficiarioCOid.class)): BeneficiarioC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PersonaC.class).error(e.getMessage());
            return null;
        }
    }
}
