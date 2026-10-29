package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.UsuarioNovedadConstants;
import com.keralty.ae.persistence.oid.DocumentoNovedadOid;
import com.keralty.ae.persistence.oid.EstadoBeneficiarioOid;
import com.keralty.ae.persistence.oid.FamiliaNovedadOid;
import com.keralty.ae.persistence.oid.ParentescoOid;
import com.keralty.ae.persistence.oid.TipoIdentificacionOid;
import com.keralty.ae.persistence.oid.UsuarioNovedadOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>UsuarioNovedad</code> external model class.
 * <p>
 * External Model Class: <code>UsuarioNovedad</code><br>
 */
public class UsuarioNovedad extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id_usuarionovedad")
    private Long usuarioNovedadidUsuarioNovedad;

    @JsonProperty(value="numidentificacion")
    private String usuarioNovedadNumIdentificacion;

    @JsonProperty(value="primernombre")
    private String usuarioNovedadPrimerNombre;

    @JsonProperty(value="segundonombre")
    private String usuarioNovedadSegundoNombre;

    @JsonProperty(value="primerapellido")
    private String usuarioNovedadPrimerApellido;

    @JsonProperty(value="segundoapellido")
    private String usuarioNovedadSegundoApellido;

    @JsonProperty(value="motivoestado")
    private String usuarioNovedadMotivoEstado;

    @JsonProperty(value="fechainivigencia")
    private Date usuarioNovedadFechaIniVigencia;

    @JsonProperty(value="fechaantiguedad")
    private Date usuarioNovedadFechaAntiguedad;

    @JsonProperty(value="numusuario")
    private Long usuarioNovedadNumUsuario;

    @JsonProperty(value="genero")
    private String usuarioNovedadGenero;

    @JsonProperty(value="fechanacimiento")
    private Date usuarioNovedadFechaNacimiento;

    @JsonProperty(value="sunummeses")
    private Long usuarioNovedadSUNumMeses;

    @JsonProperty(value="numidentificacioncd")
    private String usuarioNovedadNumIdentificacionCD;

    @JsonProperty(value="drvestaactivo")
    private Boolean usuarioNovedaddrvEstaActivo;

    @JsonProperty(value="drvparentescook")
    private Boolean usuarioNovedaddrvParentescoOK;

    @JsonProperty(value="drvestitular")
    private Boolean usuarioNovedaddrvEsTitular;

    @JsonProperty(value="drvespadre")
    private Boolean usuarioNovedaddrvEsPadre;

    @JsonProperty(value="drvedad")
    private Long usuarioNovedaddrvEdad;

    @JsonProperty(value="drveshijo")
    private Boolean usuarioNovedaddrvEsHijo;

    @JsonProperty(value="drvesconyuge")
    private Boolean usuarioNovedaddrvEsConyuge;

    @JsonProperty(value="drveseltitular")
    private Boolean usuarioNovedaddrvEsElTitular;

    @JsonProperty(value="drvpuedesertitular")
    private Boolean usuarioNovedaddrvPuedeSerTitular;

    @JsonProperty(value="drvestasuspendido")
    private Boolean usuarioNovedaddrvEstaSuspendido;

    @JsonProperty(value="excluido")
    private Boolean usuarioNovedadExcluido;

    @JsonProperty(value="contratacionro")
    private Boolean usuarioNovedadContratacionRO;

    @JsonProperty(value="prorrogasuspension")
    private Boolean usuarioNovedadProrrogaSuspension;

    @JsonProperty(value="activacionsuspension")
    private Boolean usuarioNovedadActivacionSuspension;

    @JsonProperty(value="drvnombrecompleto")
    private String usuarioNovedadDrvNombreCompleto;

    @JsonProperty(value="drvidentificacion")
    private String usuarioNovedadDrvIdentificacion;

    @JsonProperty(value="drvaplicanovedad")
    private Boolean usuarioNovedadDrvAplicaNovedad;

    @JsonProperty(value="drvnuevaidentificacion")
    private String usuarioNovedadDrvNuevaIdentificacion;

    private Collection <DocumentoNovedad> documentos;

    private FamiliaNovedad familiaNovedad;

    private TipoIdentificacion tipoIdentificacion;

    private Parentesco parentesco;

    private EstadoBeneficiario estadoBeneficiario;

    private Parentesco parentescoNuevo;

    private TipoIdentificacion tipoIdentificacionCD;

    /**
     * Gets the value of attribute id_UsuarioNovedad
     */
    public Long getUsuarioNovedadidUsuarioNovedad() {
        return usuarioNovedadidUsuarioNovedad;
    }
    
    /**
     * Sets the value of attribute id_UsuarioNovedad
     */
    public void setUsuarioNovedadidUsuarioNovedad(Long usuarioNovedadidUsuarioNovedad) {
        this.usuarioNovedadidUsuarioNovedad = usuarioNovedadidUsuarioNovedad;
    }

    /**
     * Gets the value of attribute NumIdentificacion
     */
    public String getUsuarioNovedadNumIdentificacion() {
        return usuarioNovedadNumIdentificacion;
    }
    
    /**
     * Sets the value of attribute NumIdentificacion
     */
    public void setUsuarioNovedadNumIdentificacion(String usuarioNovedadNumIdentificacion) {
        this.usuarioNovedadNumIdentificacion = usuarioNovedadNumIdentificacion;
    }

    /**
     * Gets the value of attribute PrimerNombre
     */
    public String getUsuarioNovedadPrimerNombre() {
        return usuarioNovedadPrimerNombre;
    }
    
    /**
     * Sets the value of attribute PrimerNombre
     */
    public void setUsuarioNovedadPrimerNombre(String usuarioNovedadPrimerNombre) {
        this.usuarioNovedadPrimerNombre = usuarioNovedadPrimerNombre;
    }

    /**
     * Gets the value of attribute SegundoNombre
     */
    public String getUsuarioNovedadSegundoNombre() {
        return usuarioNovedadSegundoNombre;
    }
    
    /**
     * Sets the value of attribute SegundoNombre
     */
    public void setUsuarioNovedadSegundoNombre(String usuarioNovedadSegundoNombre) {
        this.usuarioNovedadSegundoNombre = usuarioNovedadSegundoNombre;
    }

    /**
     * Gets the value of attribute PrimerApellido
     */
    public String getUsuarioNovedadPrimerApellido() {
        return usuarioNovedadPrimerApellido;
    }
    
    /**
     * Sets the value of attribute PrimerApellido
     */
    public void setUsuarioNovedadPrimerApellido(String usuarioNovedadPrimerApellido) {
        this.usuarioNovedadPrimerApellido = usuarioNovedadPrimerApellido;
    }

    /**
     * Gets the value of attribute SegundoApellido
     */
    public String getUsuarioNovedadSegundoApellido() {
        return usuarioNovedadSegundoApellido;
    }
    
    /**
     * Sets the value of attribute SegundoApellido
     */
    public void setUsuarioNovedadSegundoApellido(String usuarioNovedadSegundoApellido) {
        this.usuarioNovedadSegundoApellido = usuarioNovedadSegundoApellido;
    }

    /**
     * Gets the value of attribute MotivoEstado
     */
    public String getUsuarioNovedadMotivoEstado() {
        return usuarioNovedadMotivoEstado;
    }
    
    /**
     * Sets the value of attribute MotivoEstado
     */
    public void setUsuarioNovedadMotivoEstado(String usuarioNovedadMotivoEstado) {
        this.usuarioNovedadMotivoEstado = usuarioNovedadMotivoEstado;
    }

    /**
     * Gets the value of attribute FechaIniVigencia
     */
    public Date getUsuarioNovedadFechaIniVigencia() {
        return usuarioNovedadFechaIniVigencia;
    }
    
    /**
     * Sets the value of attribute FechaIniVigencia
     */
    public void setUsuarioNovedadFechaIniVigencia(Date usuarioNovedadFechaIniVigencia) {
        this.usuarioNovedadFechaIniVigencia = usuarioNovedadFechaIniVigencia;
    }

    /**
     * Gets the value of attribute FechaAntiguedad
     */
    public Date getUsuarioNovedadFechaAntiguedad() {
        return usuarioNovedadFechaAntiguedad;
    }
    
    /**
     * Sets the value of attribute FechaAntiguedad
     */
    public void setUsuarioNovedadFechaAntiguedad(Date usuarioNovedadFechaAntiguedad) {
        this.usuarioNovedadFechaAntiguedad = usuarioNovedadFechaAntiguedad;
    }

    /**
     * Gets the value of attribute NumUsuario
     */
    public Long getUsuarioNovedadNumUsuario() {
        return usuarioNovedadNumUsuario;
    }
    
    /**
     * Sets the value of attribute NumUsuario
     */
    public void setUsuarioNovedadNumUsuario(Long usuarioNovedadNumUsuario) {
        this.usuarioNovedadNumUsuario = usuarioNovedadNumUsuario;
    }

    /**
     * Gets the value of attribute Genero
     */
    public String getUsuarioNovedadGenero() {
        return usuarioNovedadGenero;
    }
    
    /**
     * Sets the value of attribute Genero
     */
    public void setUsuarioNovedadGenero(String usuarioNovedadGenero) {
        this.usuarioNovedadGenero = usuarioNovedadGenero;
    }

    /**
     * Gets the value of attribute FechaNacimiento
     */
    public Date getUsuarioNovedadFechaNacimiento() {
        return usuarioNovedadFechaNacimiento;
    }
    
    /**
     * Sets the value of attribute FechaNacimiento
     */
    public void setUsuarioNovedadFechaNacimiento(Date usuarioNovedadFechaNacimiento) {
        this.usuarioNovedadFechaNacimiento = usuarioNovedadFechaNacimiento;
    }

    /**
     * Gets the value of attribute SUNumMeses
     */
    public Long getUsuarioNovedadSUNumMeses() {
        return usuarioNovedadSUNumMeses;
    }
    
    /**
     * Sets the value of attribute SUNumMeses
     */
    public void setUsuarioNovedadSUNumMeses(Long usuarioNovedadSUNumMeses) {
        this.usuarioNovedadSUNumMeses = usuarioNovedadSUNumMeses;
    }

    /**
     * Gets the value of attribute NumIdentificacionCD
     */
    public String getUsuarioNovedadNumIdentificacionCD() {
        return usuarioNovedadNumIdentificacionCD;
    }
    
    /**
     * Sets the value of attribute NumIdentificacionCD
     */
    public void setUsuarioNovedadNumIdentificacionCD(String usuarioNovedadNumIdentificacionCD) {
        this.usuarioNovedadNumIdentificacionCD = usuarioNovedadNumIdentificacionCD;
    }

    /**
     * Gets the value of attribute drvEstaActivo
     */
    public Boolean getUsuarioNovedaddrvEstaActivo() {
        return usuarioNovedaddrvEstaActivo;
    }
    
    /**
     * Sets the value of attribute drvEstaActivo
     */
    public void setUsuarioNovedaddrvEstaActivo(Boolean usuarioNovedaddrvEstaActivo) {
        this.usuarioNovedaddrvEstaActivo = usuarioNovedaddrvEstaActivo;
    }

    /**
     * Gets the value of attribute drvParentescoOK
     */
    public Boolean getUsuarioNovedaddrvParentescoOK() {
        return usuarioNovedaddrvParentescoOK;
    }
    
    /**
     * Sets the value of attribute drvParentescoOK
     */
    public void setUsuarioNovedaddrvParentescoOK(Boolean usuarioNovedaddrvParentescoOK) {
        this.usuarioNovedaddrvParentescoOK = usuarioNovedaddrvParentescoOK;
    }

    /**
     * Gets the value of attribute drvEsTitular
     */
    public Boolean getUsuarioNovedaddrvEsTitular() {
        return usuarioNovedaddrvEsTitular;
    }
    
    /**
     * Sets the value of attribute drvEsTitular
     */
    public void setUsuarioNovedaddrvEsTitular(Boolean usuarioNovedaddrvEsTitular) {
        this.usuarioNovedaddrvEsTitular = usuarioNovedaddrvEsTitular;
    }

    /**
     * Gets the value of attribute drvEsPadre
     */
    public Boolean getUsuarioNovedaddrvEsPadre() {
        return usuarioNovedaddrvEsPadre;
    }
    
    /**
     * Sets the value of attribute drvEsPadre
     */
    public void setUsuarioNovedaddrvEsPadre(Boolean usuarioNovedaddrvEsPadre) {
        this.usuarioNovedaddrvEsPadre = usuarioNovedaddrvEsPadre;
    }

    /**
     * Gets the value of attribute drvEdad
     */
    public Long getUsuarioNovedaddrvEdad() {
        return usuarioNovedaddrvEdad;
    }
    
    /**
     * Sets the value of attribute drvEdad
     */
    public void setUsuarioNovedaddrvEdad(Long usuarioNovedaddrvEdad) {
        this.usuarioNovedaddrvEdad = usuarioNovedaddrvEdad;
    }

    /**
     * Gets the value of attribute drvEsHijo
     */
    public Boolean getUsuarioNovedaddrvEsHijo() {
        return usuarioNovedaddrvEsHijo;
    }
    
    /**
     * Sets the value of attribute drvEsHijo
     */
    public void setUsuarioNovedaddrvEsHijo(Boolean usuarioNovedaddrvEsHijo) {
        this.usuarioNovedaddrvEsHijo = usuarioNovedaddrvEsHijo;
    }

    /**
     * Gets the value of attribute drvEsConyuge
     */
    public Boolean getUsuarioNovedaddrvEsConyuge() {
        return usuarioNovedaddrvEsConyuge;
    }
    
    /**
     * Sets the value of attribute drvEsConyuge
     */
    public void setUsuarioNovedaddrvEsConyuge(Boolean usuarioNovedaddrvEsConyuge) {
        this.usuarioNovedaddrvEsConyuge = usuarioNovedaddrvEsConyuge;
    }

    /**
     * Gets the value of attribute drvEsElTitular
     */
    public Boolean getUsuarioNovedaddrvEsElTitular() {
        return usuarioNovedaddrvEsElTitular;
    }
    
    /**
     * Sets the value of attribute drvEsElTitular
     */
    public void setUsuarioNovedaddrvEsElTitular(Boolean usuarioNovedaddrvEsElTitular) {
        this.usuarioNovedaddrvEsElTitular = usuarioNovedaddrvEsElTitular;
    }

    /**
     * Gets the value of attribute drvPuedeSerTitular
     */
    public Boolean getUsuarioNovedaddrvPuedeSerTitular() {
        return usuarioNovedaddrvPuedeSerTitular;
    }
    
    /**
     * Sets the value of attribute drvPuedeSerTitular
     */
    public void setUsuarioNovedaddrvPuedeSerTitular(Boolean usuarioNovedaddrvPuedeSerTitular) {
        this.usuarioNovedaddrvPuedeSerTitular = usuarioNovedaddrvPuedeSerTitular;
    }

    /**
     * Gets the value of attribute drvEstaSuspendido
     */
    public Boolean getUsuarioNovedaddrvEstaSuspendido() {
        return usuarioNovedaddrvEstaSuspendido;
    }
    
    /**
     * Sets the value of attribute drvEstaSuspendido
     */
    public void setUsuarioNovedaddrvEstaSuspendido(Boolean usuarioNovedaddrvEstaSuspendido) {
        this.usuarioNovedaddrvEstaSuspendido = usuarioNovedaddrvEstaSuspendido;
    }

    /**
     * Gets the value of attribute Excluido
     */
    public Boolean getUsuarioNovedadExcluido() {
        return usuarioNovedadExcluido;
    }
    
    /**
     * Sets the value of attribute Excluido
     */
    public void setUsuarioNovedadExcluido(Boolean usuarioNovedadExcluido) {
        this.usuarioNovedadExcluido = usuarioNovedadExcluido;
    }

    /**
     * Gets the value of attribute ContratacionRO
     */
    public Boolean getUsuarioNovedadContratacionRO() {
        return usuarioNovedadContratacionRO;
    }
    
    /**
     * Sets the value of attribute ContratacionRO
     */
    public void setUsuarioNovedadContratacionRO(Boolean usuarioNovedadContratacionRO) {
        this.usuarioNovedadContratacionRO = usuarioNovedadContratacionRO;
    }

    /**
     * Gets the value of attribute ProrrogaSuspension
     */
    public Boolean getUsuarioNovedadProrrogaSuspension() {
        return usuarioNovedadProrrogaSuspension;
    }
    
    /**
     * Sets the value of attribute ProrrogaSuspension
     */
    public void setUsuarioNovedadProrrogaSuspension(Boolean usuarioNovedadProrrogaSuspension) {
        this.usuarioNovedadProrrogaSuspension = usuarioNovedadProrrogaSuspension;
    }

    /**
     * Gets the value of attribute ActivacionSuspension
     */
    public Boolean getUsuarioNovedadActivacionSuspension() {
        return usuarioNovedadActivacionSuspension;
    }
    
    /**
     * Sets the value of attribute ActivacionSuspension
     */
    public void setUsuarioNovedadActivacionSuspension(Boolean usuarioNovedadActivacionSuspension) {
        this.usuarioNovedadActivacionSuspension = usuarioNovedadActivacionSuspension;
    }

    /**
     * Gets the value of attribute DrvNombreCompleto
     */
    public String getUsuarioNovedadDrvNombreCompleto() {
        return usuarioNovedadDrvNombreCompleto;
    }
    
    /**
     * Sets the value of attribute DrvNombreCompleto
     */
    public void setUsuarioNovedadDrvNombreCompleto(String usuarioNovedadDrvNombreCompleto) {
        this.usuarioNovedadDrvNombreCompleto = usuarioNovedadDrvNombreCompleto;
    }

    /**
     * Gets the value of attribute DrvIdentificacion
     */
    public String getUsuarioNovedadDrvIdentificacion() {
        return usuarioNovedadDrvIdentificacion;
    }
    
    /**
     * Sets the value of attribute DrvIdentificacion
     */
    public void setUsuarioNovedadDrvIdentificacion(String usuarioNovedadDrvIdentificacion) {
        this.usuarioNovedadDrvIdentificacion = usuarioNovedadDrvIdentificacion;
    }

    /**
     * Gets the value of attribute DrvAplicaNovedad
     */
    public Boolean getUsuarioNovedadDrvAplicaNovedad() {
        return usuarioNovedadDrvAplicaNovedad;
    }
    
    /**
     * Sets the value of attribute DrvAplicaNovedad
     */
    public void setUsuarioNovedadDrvAplicaNovedad(Boolean usuarioNovedadDrvAplicaNovedad) {
        this.usuarioNovedadDrvAplicaNovedad = usuarioNovedadDrvAplicaNovedad;
    }

    /**
     * Gets the value of attribute DrvNuevaIdentificacion
     */
    public String getUsuarioNovedadDrvNuevaIdentificacion() {
        return usuarioNovedadDrvNuevaIdentificacion;
    }
    
    /**
     * Sets the value of attribute DrvNuevaIdentificacion
     */
    public void setUsuarioNovedadDrvNuevaIdentificacion(String usuarioNovedadDrvNuevaIdentificacion) {
        this.usuarioNovedadDrvNuevaIdentificacion = usuarioNovedadDrvNuevaIdentificacion;
    }

    /**
     * Gets the value of relation through role Documentos
     */
    @JsonIgnore
    public Collection <DocumentoNovedad> getDocumentos() {
        return documentos;
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
     * Gets the value of relation through role Parentesco
     */
    @JsonIgnore
    public Parentesco getParentesco() {
        return parentesco;
    }

    /**
     * Gets the value of relation through role EstadoBeneficiario
     */
    @JsonIgnore
    public EstadoBeneficiario getEstadoBeneficiario() {
        return estadoBeneficiario;
    }

    /**
     * Gets the value of relation through role ParentescoNuevo
     */
    @JsonIgnore
    public Parentesco getParentescoNuevo() {
        return parentescoNuevo;
    }

    /**
     * Gets the value of relation through role TipoIdentificacionCD
     */
    @JsonIgnore
    public TipoIdentificacion getTipoIdentificacionCD() {
        return tipoIdentificacionCD;
    }

    /**
     * Default constructor
     */
    public UsuarioNovedad() {
        usuarioNovedadidUsuarioNovedad = null;
    }

    /**
     * Constructor used to create instances of <code>UsuarioNovedad</code>.
     * @param oid Object Identifier of the instance of <code>UsuarioNovedad</code> to be created.
     * @throws SystemException
     */
    public UsuarioNovedad(UsuarioNovedadOid oid) {
        if (oid != null && !oid.isNull()) {
            usuarioNovedadidUsuarioNovedad = oid.getUsuarioNovedadidUsuarioNovedad();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return UsuarioNovedad.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        UsuarioNovedad other = (UsuarioNovedad)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getUsuarioNovedadidUsuarioNovedad(), other.getUsuarioNovedadidUsuarioNovedad());
        result &= Utilities.isEqual(this.getUsuarioNovedadNumIdentificacion(), other.getUsuarioNovedadNumIdentificacion());
        result &= Utilities.isEqual(this.getUsuarioNovedadPrimerNombre(), other.getUsuarioNovedadPrimerNombre());
        result &= Utilities.isEqual(this.getUsuarioNovedadSegundoNombre(), other.getUsuarioNovedadSegundoNombre());
        result &= Utilities.isEqual(this.getUsuarioNovedadPrimerApellido(), other.getUsuarioNovedadPrimerApellido());
        result &= Utilities.isEqual(this.getUsuarioNovedadSegundoApellido(), other.getUsuarioNovedadSegundoApellido());
        result &= Utilities.isEqual(this.getUsuarioNovedadMotivoEstado(), other.getUsuarioNovedadMotivoEstado());
        result &= Utilities.isEqual(this.getUsuarioNovedadFechaIniVigencia(), other.getUsuarioNovedadFechaIniVigencia());
        result &= Utilities.isEqual(this.getUsuarioNovedadFechaAntiguedad(), other.getUsuarioNovedadFechaAntiguedad());
        result &= Utilities.isEqual(this.getUsuarioNovedadNumUsuario(), other.getUsuarioNovedadNumUsuario());
        result &= Utilities.isEqual(this.getUsuarioNovedadGenero(), other.getUsuarioNovedadGenero());
        result &= Utilities.isEqual(this.getUsuarioNovedadFechaNacimiento(), other.getUsuarioNovedadFechaNacimiento());
        result &= Utilities.isEqual(this.getUsuarioNovedadSUNumMeses(), other.getUsuarioNovedadSUNumMeses());
        result &= Utilities.isEqual(this.getUsuarioNovedadNumIdentificacionCD(), other.getUsuarioNovedadNumIdentificacionCD());
        result &= Utilities.isEqual(this.getUsuarioNovedaddrvEstaActivo(), other.getUsuarioNovedaddrvEstaActivo());
        result &= Utilities.isEqual(this.getUsuarioNovedaddrvParentescoOK(), other.getUsuarioNovedaddrvParentescoOK());
        result &= Utilities.isEqual(this.getUsuarioNovedaddrvEsTitular(), other.getUsuarioNovedaddrvEsTitular());
        result &= Utilities.isEqual(this.getUsuarioNovedaddrvEsPadre(), other.getUsuarioNovedaddrvEsPadre());
        result &= Utilities.isEqual(this.getUsuarioNovedaddrvEdad(), other.getUsuarioNovedaddrvEdad());
        result &= Utilities.isEqual(this.getUsuarioNovedaddrvEsHijo(), other.getUsuarioNovedaddrvEsHijo());
        result &= Utilities.isEqual(this.getUsuarioNovedaddrvEsConyuge(), other.getUsuarioNovedaddrvEsConyuge());
        result &= Utilities.isEqual(this.getUsuarioNovedaddrvEsElTitular(), other.getUsuarioNovedaddrvEsElTitular());
        result &= Utilities.isEqual(this.getUsuarioNovedaddrvPuedeSerTitular(), other.getUsuarioNovedaddrvPuedeSerTitular());
        result &= Utilities.isEqual(this.getUsuarioNovedaddrvEstaSuspendido(), other.getUsuarioNovedaddrvEstaSuspendido());
        result &= Utilities.isEqual(this.getUsuarioNovedadExcluido(), other.getUsuarioNovedadExcluido());
        result &= Utilities.isEqual(this.getUsuarioNovedadContratacionRO(), other.getUsuarioNovedadContratacionRO());
        result &= Utilities.isEqual(this.getUsuarioNovedadProrrogaSuspension(), other.getUsuarioNovedadProrrogaSuspension());
        result &= Utilities.isEqual(this.getUsuarioNovedadActivacionSuspension(), other.getUsuarioNovedadActivacionSuspension());
        result &= Utilities.isEqual(this.getUsuarioNovedadDrvNombreCompleto(), other.getUsuarioNovedadDrvNombreCompleto());
        result &= Utilities.isEqual(this.getUsuarioNovedadDrvIdentificacion(), other.getUsuarioNovedadDrvIdentificacion());
        result &= Utilities.isEqual(this.getUsuarioNovedadDrvAplicaNovedad(), other.getUsuarioNovedadDrvAplicaNovedad());
        result &= Utilities.isEqual(this.getUsuarioNovedadDrvNuevaIdentificacion(), other.getUsuarioNovedadDrvNuevaIdentificacion());
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
     * Returns the <code>UsuarioNovedadOid</code> object that identifies this instance of <code>UsuarioNovedad</code>.
     * @return <code>UsuarioNovedadOid</code> object that identifies this instance of <code>UsuarioNovedad</code>
     */
	@Override
    public UsuarioNovedadOid getOid() {
        return new UsuarioNovedadOid(getUsuarioNovedadidUsuarioNovedad());
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
        if (!activeFacets.contains(Constants.USUARIONOVEDAD)) {
            activeFacets.add(Constants.USUARIONOVEDAD);
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
            relatedInstance = buildUsuarioNovedadRelatedInstance(relatedInstanceJsonOid);
        }
        if (UsuarioNovedadConstants.ROLE_NAME_DOCUMENTOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildUsuarioNovedadRelatedInstance4DocumentoNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (UsuarioNovedadConstants.ROLE_NAME_FAMILIANOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildUsuarioNovedadRelatedInstance4FamiliaNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (UsuarioNovedadConstants.ROLE_NAME_TIPOIDENTIFICACION.equalsIgnoreCase(relatedInstancePathFirstItem) || UsuarioNovedadConstants.ROLE_NAME_TIPOIDENTIFICACIONCD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildUsuarioNovedadRelatedInstance4TipoIdentificacion(relatedInstanceJsonOid, remainingPath);
        }
        if (UsuarioNovedadConstants.ROLE_NAME_PARENTESCO.equalsIgnoreCase(relatedInstancePathFirstItem) || UsuarioNovedadConstants.ROLE_NAME_PARENTESCONUEVO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildUsuarioNovedadRelatedInstance4Parentesco(relatedInstanceJsonOid, remainingPath);
        }
        if (UsuarioNovedadConstants.ROLE_NAME_ESTADOBENEFICIARIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildUsuarioNovedadRelatedInstance4EstadoBeneficiario(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildUsuarioNovedadRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new UsuarioNovedad(mapper.readValue(relatedInstanceJsonOid, UsuarioNovedadOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(UsuarioNovedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildUsuarioNovedadRelatedInstance4DocumentoNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new DocumentoNovedad(mapper.readValue(relatedInstanceJsonOid, DocumentoNovedadOid.class)): DocumentoNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(UsuarioNovedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildUsuarioNovedadRelatedInstance4FamiliaNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new FamiliaNovedad(mapper.readValue(relatedInstanceJsonOid, FamiliaNovedadOid.class)): FamiliaNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(UsuarioNovedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildUsuarioNovedadRelatedInstance4TipoIdentificacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TipoIdentificacion(mapper.readValue(relatedInstanceJsonOid, TipoIdentificacionOid.class)): TipoIdentificacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(UsuarioNovedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildUsuarioNovedadRelatedInstance4Parentesco(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Parentesco(mapper.readValue(relatedInstanceJsonOid, ParentescoOid.class)): Parentesco.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(UsuarioNovedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildUsuarioNovedadRelatedInstance4EstadoBeneficiario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new EstadoBeneficiario(mapper.readValue(relatedInstanceJsonOid, EstadoBeneficiarioOid.class)): EstadoBeneficiario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(UsuarioNovedad.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
