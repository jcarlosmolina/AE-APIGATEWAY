package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.UsuarioConstants;
import com.keralty.ae.persistence.oid.AnexoMatOid;
import com.keralty.ae.persistence.oid.AnexoNeoOid;
import com.keralty.ae.persistence.oid.CompanyiaOid;
import com.keralty.ae.persistence.oid.CuestionarioPOid;
import com.keralty.ae.persistence.oid.EpsOid;
import com.keralty.ae.persistence.oid.EstadoBeneficiarioOid;
import com.keralty.ae.persistence.oid.ParentescoOid;
import com.keralty.ae.persistence.oid.PersonaOid;
import com.keralty.ae.persistence.oid.PreexistenciaOid;
import com.keralty.ae.persistence.oid.SolicitudOid;
import com.keralty.ae.persistence.oid.TipoIdentificacionOid;
import com.keralty.ae.persistence.oid.UsuarioOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>Usuario</code> external model class.
 * <p>
 * External Model Class: <code>Usuario</code><br>
 */
public class Usuario extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id_solicitud")
    private Long aesolicitudesidsolicitud;

    @JsonProperty(value="identificador")
    private Long usuarioIdentificador;

    @JsonProperty(value="bebegestante")
    private Boolean usuarioBebeGestante;

    @JsonProperty(value="numusuario")
    private Long usuarioNumUsuario;

    @JsonProperty(value="numidentificacion")
    private String usuarioNumIdentificacion;

    @JsonProperty(value="codigotipousuario")
    private Long usuarioCodigoTipoUsuario;

    @JsonProperty(value="primernombre")
    private String usuarioPrimerNombre;

    @JsonProperty(value="segundonombre")
    private String usuarioSegundoNombre;

    @JsonProperty(value="primerapellido")
    private String usuarioPrimerApellido;

    @JsonProperty(value="segundoapellido")
    private String usuarioSegundoApellido;

    @JsonProperty(value="drvidentificacion")
    private String usuariodrvIdentificacion;

    @JsonProperty(value="drveseltitular")
    private Boolean usuariodrvEsElTitular;

    @JsonProperty(value="drvaccesocuesmed")
    private Boolean usuariodrvAccesoCuesMed;

    @JsonProperty(value="drvaceptaanexomat")
    private Boolean usuariodrvAceptaAnexoMat;

    @JsonProperty(value="drvaceptaanexoneo")
    private Boolean usuariodrvAceptaAnexoNeo;

    @JsonProperty(value="drvtieneanexomat")
    private Boolean usuariodrvTieneAnexoMat;

    @JsonProperty(value="attrusuariodiligenciados")
    private Boolean usuarioattrUsuarioDiligenciados;

    @JsonProperty(value="drvedadparacuotains")
    private Long usuariodrvEdadParaCuotaIns;

    @JsonProperty(value="drvvalorcuotainscrip")
    private Double usuariodrvValorCuotaInscrip;

    @JsonProperty(value="drvcuesmedok")
    private Boolean usuariodrvCuesMedOK;

    @JsonProperty(value="codigobancorep")
    private String usuariocodigoBancoRep;

    @JsonProperty(value="usuarioreplicado")
    private Boolean usuarioUsuarioReplicado;

    @JsonProperty(value="fechaantiguedadbeneficiario")
    private Date usuarioFechaAntiguedadBeneficiario;

    @JsonProperty(value="requierexamenmedico")
    private Boolean usuarioRequierExamenMedico;

    @JsonProperty(value="estadomedico")
    private Long usuarioEstadoMedico;

    @JsonProperty(value="valorcuotainscripcion")
    private Double usuarioValorCuotaInscripcion;

    @JsonProperty(value="tienepreexistencias")
    private Boolean usuarioTienePreexistencias;

    @JsonProperty(value="drvnombrecompleto")
    private String usuariodrvNombreCompleto;

    @JsonProperty(value="fechainiciovigencia")
    private Date usuarioFechaInicioVigencia;

    @JsonProperty(value="fechafinvigencia")
    private Date usuarioFechaFinVigencia;

    @JsonProperty(value="drvconfirmado")
    private Boolean usuariodrvConfirmado;

    @JsonProperty(value="drvtiempoembarazo")
    private Long usuariodrvTiempoEmbarazo;

    @JsonProperty(value="drvestaactivo")
    private Boolean usuariodrvEstaActivo;

    @JsonProperty(value="drvedad")
    private Long usuariodrvEdad;

    @JsonProperty(value="drvedadmaxingreso")
    private Long usuariodrvEdadMaxIngreso;

    @JsonProperty(value="drvedadmaxperm")
    private Long usuariodrvEdadMaxPerm;

    @JsonProperty(value="drvtotalanexos")
    private Double usuariodrvTotalAnexos;

    @JsonProperty(value="drvtieneepssanitas")
    private Boolean usuariodrvTieneEPSSanitas;

    @JsonProperty(value="drvtienedocumentos")
    private Boolean usuariodrvTieneDocumentos;

    @JsonProperty(value="tienedocidentificacion")
    private Boolean usuariotieneDocIdentificacion;

    @JsonProperty(value="tienedocssolicitud")
    private Boolean usuariotieneDocsSolicitud;

    @JsonProperty(value="drvtieneparentesco")
    private Boolean usuariodrvTieneParentesco;

    @JsonProperty(value="drvpuedesertitular")
    private Boolean usuariodrvPuedeSerTitular;

    @JsonProperty(value="drvtienecuesmed")
    private Boolean usuariodrvTieneCuesMed;

    @JsonProperty(value="drvimptarifaplanvol")
    private Double usuariodrvImpTarifaPlanVol;

    @JsonProperty(value="polizainternacional")
    private Boolean usuarioPolizaInternacional;

    @JsonProperty(value="drvdirresvalidoeps")
    private Boolean usuariodrvDirResValidoEPS;

    @JsonProperty(value="imc")
    private Double usuarioIMC;

    private CuestionarioP cuestionarioP;

    private AnexoMat anexoMat;

    private AnexoNeo anexoNeo;

    private Collection <Preexistencia> preexistencias;

    private Solicitud solicitud;

    private Persona usuarioPersona;

    private Eps eps;

    private Parentesco parentesco;

    private Companyia companyia;

    private TipoIdentificacion tipoIdentificacion;

    private EstadoBeneficiario estadoBeneficiario;

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
     * Gets the value of attribute Identificador
     */
    public Long getUsuarioIdentificador() {
        return usuarioIdentificador;
    }
    
    /**
     * Sets the value of attribute Identificador
     */
    public void setUsuarioIdentificador(Long usuarioIdentificador) {
        this.usuarioIdentificador = usuarioIdentificador;
    }

    /**
     * Gets the value of attribute BebeGestante
     */
    public Boolean getUsuarioBebeGestante() {
        return usuarioBebeGestante;
    }
    
    /**
     * Sets the value of attribute BebeGestante
     */
    public void setUsuarioBebeGestante(Boolean usuarioBebeGestante) {
        this.usuarioBebeGestante = usuarioBebeGestante;
    }

    /**
     * Gets the value of attribute NumUsuario
     */
    public Long getUsuarioNumUsuario() {
        return usuarioNumUsuario;
    }
    
    /**
     * Sets the value of attribute NumUsuario
     */
    public void setUsuarioNumUsuario(Long usuarioNumUsuario) {
        this.usuarioNumUsuario = usuarioNumUsuario;
    }

    /**
     * Gets the value of attribute NumIdentificacion
     */
    public String getUsuarioNumIdentificacion() {
        return usuarioNumIdentificacion;
    }
    
    /**
     * Sets the value of attribute NumIdentificacion
     */
    public void setUsuarioNumIdentificacion(String usuarioNumIdentificacion) {
        this.usuarioNumIdentificacion = usuarioNumIdentificacion;
    }

    /**
     * Gets the value of attribute CodigoTipoUsuario
     */
    public Long getUsuarioCodigoTipoUsuario() {
        return usuarioCodigoTipoUsuario;
    }
    
    /**
     * Sets the value of attribute CodigoTipoUsuario
     */
    public void setUsuarioCodigoTipoUsuario(Long usuarioCodigoTipoUsuario) {
        this.usuarioCodigoTipoUsuario = usuarioCodigoTipoUsuario;
    }

    /**
     * Gets the value of attribute PrimerNombre
     */
    public String getUsuarioPrimerNombre() {
        return usuarioPrimerNombre;
    }
    
    /**
     * Sets the value of attribute PrimerNombre
     */
    public void setUsuarioPrimerNombre(String usuarioPrimerNombre) {
        this.usuarioPrimerNombre = usuarioPrimerNombre;
    }

    /**
     * Gets the value of attribute SegundoNombre
     */
    public String getUsuarioSegundoNombre() {
        return usuarioSegundoNombre;
    }
    
    /**
     * Sets the value of attribute SegundoNombre
     */
    public void setUsuarioSegundoNombre(String usuarioSegundoNombre) {
        this.usuarioSegundoNombre = usuarioSegundoNombre;
    }

    /**
     * Gets the value of attribute PrimerApellido
     */
    public String getUsuarioPrimerApellido() {
        return usuarioPrimerApellido;
    }
    
    /**
     * Sets the value of attribute PrimerApellido
     */
    public void setUsuarioPrimerApellido(String usuarioPrimerApellido) {
        this.usuarioPrimerApellido = usuarioPrimerApellido;
    }

    /**
     * Gets the value of attribute SegundoApellido
     */
    public String getUsuarioSegundoApellido() {
        return usuarioSegundoApellido;
    }
    
    /**
     * Sets the value of attribute SegundoApellido
     */
    public void setUsuarioSegundoApellido(String usuarioSegundoApellido) {
        this.usuarioSegundoApellido = usuarioSegundoApellido;
    }

    /**
     * Gets the value of attribute drvIdentificacion
     */
    public String getUsuariodrvIdentificacion() {
        return usuariodrvIdentificacion;
    }
    
    /**
     * Sets the value of attribute drvIdentificacion
     */
    public void setUsuariodrvIdentificacion(String usuariodrvIdentificacion) {
        this.usuariodrvIdentificacion = usuariodrvIdentificacion;
    }

    /**
     * Gets the value of attribute drvEsElTitular
     */
    public Boolean getUsuariodrvEsElTitular() {
        return usuariodrvEsElTitular;
    }
    
    /**
     * Sets the value of attribute drvEsElTitular
     */
    public void setUsuariodrvEsElTitular(Boolean usuariodrvEsElTitular) {
        this.usuariodrvEsElTitular = usuariodrvEsElTitular;
    }

    /**
     * Gets the value of attribute drvAccesoCuesMed
     */
    public Boolean getUsuariodrvAccesoCuesMed() {
        return usuariodrvAccesoCuesMed;
    }
    
    /**
     * Sets the value of attribute drvAccesoCuesMed
     */
    public void setUsuariodrvAccesoCuesMed(Boolean usuariodrvAccesoCuesMed) {
        this.usuariodrvAccesoCuesMed = usuariodrvAccesoCuesMed;
    }

    /**
     * Gets the value of attribute drvAceptaAnexoMat
     */
    public Boolean getUsuariodrvAceptaAnexoMat() {
        return usuariodrvAceptaAnexoMat;
    }
    
    /**
     * Sets the value of attribute drvAceptaAnexoMat
     */
    public void setUsuariodrvAceptaAnexoMat(Boolean usuariodrvAceptaAnexoMat) {
        this.usuariodrvAceptaAnexoMat = usuariodrvAceptaAnexoMat;
    }

    /**
     * Gets the value of attribute drvAceptaAnexoNeo
     */
    public Boolean getUsuariodrvAceptaAnexoNeo() {
        return usuariodrvAceptaAnexoNeo;
    }
    
    /**
     * Sets the value of attribute drvAceptaAnexoNeo
     */
    public void setUsuariodrvAceptaAnexoNeo(Boolean usuariodrvAceptaAnexoNeo) {
        this.usuariodrvAceptaAnexoNeo = usuariodrvAceptaAnexoNeo;
    }

    /**
     * Gets the value of attribute drvTieneAnexoMat
     */
    public Boolean getUsuariodrvTieneAnexoMat() {
        return usuariodrvTieneAnexoMat;
    }
    
    /**
     * Sets the value of attribute drvTieneAnexoMat
     */
    public void setUsuariodrvTieneAnexoMat(Boolean usuariodrvTieneAnexoMat) {
        this.usuariodrvTieneAnexoMat = usuariodrvTieneAnexoMat;
    }

    /**
     * Gets the value of attribute attrUsuarioDiligenciados
     */
    public Boolean getUsuarioattrUsuarioDiligenciados() {
        return usuarioattrUsuarioDiligenciados;
    }
    
    /**
     * Sets the value of attribute attrUsuarioDiligenciados
     */
    public void setUsuarioattrUsuarioDiligenciados(Boolean usuarioattrUsuarioDiligenciados) {
        this.usuarioattrUsuarioDiligenciados = usuarioattrUsuarioDiligenciados;
    }

    /**
     * Gets the value of attribute drvEdadParaCuotaIns
     */
    public Long getUsuariodrvEdadParaCuotaIns() {
        return usuariodrvEdadParaCuotaIns;
    }
    
    /**
     * Sets the value of attribute drvEdadParaCuotaIns
     */
    public void setUsuariodrvEdadParaCuotaIns(Long usuariodrvEdadParaCuotaIns) {
        this.usuariodrvEdadParaCuotaIns = usuariodrvEdadParaCuotaIns;
    }

    /**
     * Gets the value of attribute drvValorCuotaInscrip
     */
    public Double getUsuariodrvValorCuotaInscrip() {
        return usuariodrvValorCuotaInscrip;
    }
    
    /**
     * Sets the value of attribute drvValorCuotaInscrip
     */
    public void setUsuariodrvValorCuotaInscrip(Double usuariodrvValorCuotaInscrip) {
        this.usuariodrvValorCuotaInscrip = usuariodrvValorCuotaInscrip;
    }

    /**
     * Gets the value of attribute drvCuesMedOK
     */
    public Boolean getUsuariodrvCuesMedOK() {
        return usuariodrvCuesMedOK;
    }
    
    /**
     * Sets the value of attribute drvCuesMedOK
     */
    public void setUsuariodrvCuesMedOK(Boolean usuariodrvCuesMedOK) {
        this.usuariodrvCuesMedOK = usuariodrvCuesMedOK;
    }

    /**
     * Gets the value of attribute codigoBancoRep
     */
    public String getUsuariocodigoBancoRep() {
        return usuariocodigoBancoRep;
    }
    
    /**
     * Sets the value of attribute codigoBancoRep
     */
    public void setUsuariocodigoBancoRep(String usuariocodigoBancoRep) {
        this.usuariocodigoBancoRep = usuariocodigoBancoRep;
    }

    /**
     * Gets the value of attribute UsuarioReplicado
     */
    public Boolean getUsuarioUsuarioReplicado() {
        return usuarioUsuarioReplicado;
    }
    
    /**
     * Sets the value of attribute UsuarioReplicado
     */
    public void setUsuarioUsuarioReplicado(Boolean usuarioUsuarioReplicado) {
        this.usuarioUsuarioReplicado = usuarioUsuarioReplicado;
    }

    /**
     * Gets the value of attribute FechaAntiguedadBeneficiario
     */
    public Date getUsuarioFechaAntiguedadBeneficiario() {
        return usuarioFechaAntiguedadBeneficiario;
    }
    
    /**
     * Sets the value of attribute FechaAntiguedadBeneficiario
     */
    public void setUsuarioFechaAntiguedadBeneficiario(Date usuarioFechaAntiguedadBeneficiario) {
        this.usuarioFechaAntiguedadBeneficiario = usuarioFechaAntiguedadBeneficiario;
    }

    /**
     * Gets the value of attribute RequierExamenMedico
     */
    public Boolean getUsuarioRequierExamenMedico() {
        return usuarioRequierExamenMedico;
    }
    
    /**
     * Sets the value of attribute RequierExamenMedico
     */
    public void setUsuarioRequierExamenMedico(Boolean usuarioRequierExamenMedico) {
        this.usuarioRequierExamenMedico = usuarioRequierExamenMedico;
    }

    /**
     * Gets the value of attribute EstadoMedico
     */
    public Long getUsuarioEstadoMedico() {
        return usuarioEstadoMedico;
    }
    
    /**
     * Sets the value of attribute EstadoMedico
     */
    public void setUsuarioEstadoMedico(Long usuarioEstadoMedico) {
        this.usuarioEstadoMedico = usuarioEstadoMedico;
    }

    /**
     * Gets the value of attribute ValorCuotaInscripcion
     */
    public Double getUsuarioValorCuotaInscripcion() {
        return usuarioValorCuotaInscripcion;
    }
    
    /**
     * Sets the value of attribute ValorCuotaInscripcion
     */
    public void setUsuarioValorCuotaInscripcion(Double usuarioValorCuotaInscripcion) {
        this.usuarioValorCuotaInscripcion = usuarioValorCuotaInscripcion;
    }

    /**
     * Gets the value of attribute TienePreexistencias
     */
    public Boolean getUsuarioTienePreexistencias() {
        return usuarioTienePreexistencias;
    }
    
    /**
     * Sets the value of attribute TienePreexistencias
     */
    public void setUsuarioTienePreexistencias(Boolean usuarioTienePreexistencias) {
        this.usuarioTienePreexistencias = usuarioTienePreexistencias;
    }

    /**
     * Gets the value of attribute drvNombreCompleto
     */
    public String getUsuariodrvNombreCompleto() {
        return usuariodrvNombreCompleto;
    }
    
    /**
     * Sets the value of attribute drvNombreCompleto
     */
    public void setUsuariodrvNombreCompleto(String usuariodrvNombreCompleto) {
        this.usuariodrvNombreCompleto = usuariodrvNombreCompleto;
    }

    /**
     * Gets the value of attribute FechaInicioVigencia
     */
    public Date getUsuarioFechaInicioVigencia() {
        return usuarioFechaInicioVigencia;
    }
    
    /**
     * Sets the value of attribute FechaInicioVigencia
     */
    public void setUsuarioFechaInicioVigencia(Date usuarioFechaInicioVigencia) {
        this.usuarioFechaInicioVigencia = usuarioFechaInicioVigencia;
    }

    /**
     * Gets the value of attribute FechaFinVigencia
     */
    public Date getUsuarioFechaFinVigencia() {
        return usuarioFechaFinVigencia;
    }
    
    /**
     * Sets the value of attribute FechaFinVigencia
     */
    public void setUsuarioFechaFinVigencia(Date usuarioFechaFinVigencia) {
        this.usuarioFechaFinVigencia = usuarioFechaFinVigencia;
    }

    /**
     * Gets the value of attribute drvConfirmado
     */
    public Boolean getUsuariodrvConfirmado() {
        return usuariodrvConfirmado;
    }
    
    /**
     * Sets the value of attribute drvConfirmado
     */
    public void setUsuariodrvConfirmado(Boolean usuariodrvConfirmado) {
        this.usuariodrvConfirmado = usuariodrvConfirmado;
    }

    /**
     * Gets the value of attribute drvTiempoEmbarazo
     */
    public Long getUsuariodrvTiempoEmbarazo() {
        return usuariodrvTiempoEmbarazo;
    }
    
    /**
     * Sets the value of attribute drvTiempoEmbarazo
     */
    public void setUsuariodrvTiempoEmbarazo(Long usuariodrvTiempoEmbarazo) {
        this.usuariodrvTiempoEmbarazo = usuariodrvTiempoEmbarazo;
    }

    /**
     * Gets the value of attribute drvEstaActivo
     */
    public Boolean getUsuariodrvEstaActivo() {
        return usuariodrvEstaActivo;
    }
    
    /**
     * Sets the value of attribute drvEstaActivo
     */
    public void setUsuariodrvEstaActivo(Boolean usuariodrvEstaActivo) {
        this.usuariodrvEstaActivo = usuariodrvEstaActivo;
    }

    /**
     * Gets the value of attribute drvEdad
     */
    public Long getUsuariodrvEdad() {
        return usuariodrvEdad;
    }
    
    /**
     * Sets the value of attribute drvEdad
     */
    public void setUsuariodrvEdad(Long usuariodrvEdad) {
        this.usuariodrvEdad = usuariodrvEdad;
    }

    /**
     * Gets the value of attribute drvEdadMaxIngreso
     */
    public Long getUsuariodrvEdadMaxIngreso() {
        return usuariodrvEdadMaxIngreso;
    }
    
    /**
     * Sets the value of attribute drvEdadMaxIngreso
     */
    public void setUsuariodrvEdadMaxIngreso(Long usuariodrvEdadMaxIngreso) {
        this.usuariodrvEdadMaxIngreso = usuariodrvEdadMaxIngreso;
    }

    /**
     * Gets the value of attribute drvEdadMaxPerm
     */
    public Long getUsuariodrvEdadMaxPerm() {
        return usuariodrvEdadMaxPerm;
    }
    
    /**
     * Sets the value of attribute drvEdadMaxPerm
     */
    public void setUsuariodrvEdadMaxPerm(Long usuariodrvEdadMaxPerm) {
        this.usuariodrvEdadMaxPerm = usuariodrvEdadMaxPerm;
    }

    /**
     * Gets the value of attribute drvTotalAnexos
     */
    public Double getUsuariodrvTotalAnexos() {
        return usuariodrvTotalAnexos;
    }
    
    /**
     * Sets the value of attribute drvTotalAnexos
     */
    public void setUsuariodrvTotalAnexos(Double usuariodrvTotalAnexos) {
        this.usuariodrvTotalAnexos = usuariodrvTotalAnexos;
    }

    /**
     * Gets the value of attribute drvTieneEPSSanitas
     */
    public Boolean getUsuariodrvTieneEPSSanitas() {
        return usuariodrvTieneEPSSanitas;
    }
    
    /**
     * Sets the value of attribute drvTieneEPSSanitas
     */
    public void setUsuariodrvTieneEPSSanitas(Boolean usuariodrvTieneEPSSanitas) {
        this.usuariodrvTieneEPSSanitas = usuariodrvTieneEPSSanitas;
    }

    /**
     * Gets the value of attribute drvTieneDocumentos
     */
    public Boolean getUsuariodrvTieneDocumentos() {
        return usuariodrvTieneDocumentos;
    }
    
    /**
     * Sets the value of attribute drvTieneDocumentos
     */
    public void setUsuariodrvTieneDocumentos(Boolean usuariodrvTieneDocumentos) {
        this.usuariodrvTieneDocumentos = usuariodrvTieneDocumentos;
    }

    /**
     * Gets the value of attribute tieneDocIdentificacion
     */
    public Boolean getUsuariotieneDocIdentificacion() {
        return usuariotieneDocIdentificacion;
    }
    
    /**
     * Sets the value of attribute tieneDocIdentificacion
     */
    public void setUsuariotieneDocIdentificacion(Boolean usuariotieneDocIdentificacion) {
        this.usuariotieneDocIdentificacion = usuariotieneDocIdentificacion;
    }

    /**
     * Gets the value of attribute tieneDocsSolicitud
     */
    public Boolean getUsuariotieneDocsSolicitud() {
        return usuariotieneDocsSolicitud;
    }
    
    /**
     * Sets the value of attribute tieneDocsSolicitud
     */
    public void setUsuariotieneDocsSolicitud(Boolean usuariotieneDocsSolicitud) {
        this.usuariotieneDocsSolicitud = usuariotieneDocsSolicitud;
    }

    /**
     * Gets the value of attribute drvTieneParentesco
     */
    public Boolean getUsuariodrvTieneParentesco() {
        return usuariodrvTieneParentesco;
    }
    
    /**
     * Sets the value of attribute drvTieneParentesco
     */
    public void setUsuariodrvTieneParentesco(Boolean usuariodrvTieneParentesco) {
        this.usuariodrvTieneParentesco = usuariodrvTieneParentesco;
    }

    /**
     * Gets the value of attribute drvPuedeSerTitular
     */
    public Boolean getUsuariodrvPuedeSerTitular() {
        return usuariodrvPuedeSerTitular;
    }
    
    /**
     * Sets the value of attribute drvPuedeSerTitular
     */
    public void setUsuariodrvPuedeSerTitular(Boolean usuariodrvPuedeSerTitular) {
        this.usuariodrvPuedeSerTitular = usuariodrvPuedeSerTitular;
    }

    /**
     * Gets the value of attribute drvTieneCuesMed
     */
    public Boolean getUsuariodrvTieneCuesMed() {
        return usuariodrvTieneCuesMed;
    }
    
    /**
     * Sets the value of attribute drvTieneCuesMed
     */
    public void setUsuariodrvTieneCuesMed(Boolean usuariodrvTieneCuesMed) {
        this.usuariodrvTieneCuesMed = usuariodrvTieneCuesMed;
    }

    /**
     * Gets the value of attribute drvImpTarifaPlanVol
     */
    public Double getUsuariodrvImpTarifaPlanVol() {
        return usuariodrvImpTarifaPlanVol;
    }
    
    /**
     * Sets the value of attribute drvImpTarifaPlanVol
     */
    public void setUsuariodrvImpTarifaPlanVol(Double usuariodrvImpTarifaPlanVol) {
        this.usuariodrvImpTarifaPlanVol = usuariodrvImpTarifaPlanVol;
    }

    /**
     * Gets the value of attribute PolizaInternacional
     */
    public Boolean getUsuarioPolizaInternacional() {
        return usuarioPolizaInternacional;
    }
    
    /**
     * Sets the value of attribute PolizaInternacional
     */
    public void setUsuarioPolizaInternacional(Boolean usuarioPolizaInternacional) {
        this.usuarioPolizaInternacional = usuarioPolizaInternacional;
    }

    /**
     * Gets the value of attribute drvDirResValidoEPS
     */
    public Boolean getUsuariodrvDirResValidoEPS() {
        return usuariodrvDirResValidoEPS;
    }
    
    /**
     * Sets the value of attribute drvDirResValidoEPS
     */
    public void setUsuariodrvDirResValidoEPS(Boolean usuariodrvDirResValidoEPS) {
        this.usuariodrvDirResValidoEPS = usuariodrvDirResValidoEPS;
    }

    /**
     * Gets the value of attribute IMC
     */
    public Double getUsuarioIMC() {
        return usuarioIMC;
    }
    
    /**
     * Sets the value of attribute IMC
     */
    public void setUsuarioIMC(Double usuarioIMC) {
        this.usuarioIMC = usuarioIMC;
    }

    /**
     * Gets the value of relation through role CuestionarioP
     */
    @JsonIgnore
    public CuestionarioP getCuestionarioP() {
        return cuestionarioP;
    }

    /**
     * Gets the value of relation through role AnexoMat
     */
    @JsonIgnore
    public AnexoMat getAnexoMat() {
        return anexoMat;
    }

    /**
     * Gets the value of relation through role AnexoNeo
     */
    @JsonIgnore
    public AnexoNeo getAnexoNeo() {
        return anexoNeo;
    }

    /**
     * Gets the value of relation through role Preexistencias
     */
    @JsonIgnore
    public Collection <Preexistencia> getPreexistencias() {
        return preexistencias;
    }

    /**
     * Gets the value of relation through role Solicitud
     */
    @JsonIgnore
    public Solicitud getSolicitud() {
        return solicitud;
    }

    /**
     * Gets the value of relation through role UsuarioPersona
     */
    @JsonIgnore
    public Persona getUsuarioPersona() {
        return usuarioPersona;
    }

    /**
     * Gets the value of relation through role Eps
     */
    @JsonIgnore
    public Eps getEps() {
        return eps;
    }

    /**
     * Gets the value of relation through role Parentesco
     */
    @JsonIgnore
    public Parentesco getParentesco() {
        return parentesco;
    }

    /**
     * Gets the value of relation through role Companyia
     */
    @JsonIgnore
    public Companyia getCompanyia() {
        return companyia;
    }

    /**
     * Gets the value of relation through role TipoIdentificacion
     */
    @JsonIgnore
    public TipoIdentificacion getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    /**
     * Gets the value of relation through role EstadoBeneficiario
     */
    @JsonIgnore
    public EstadoBeneficiario getEstadoBeneficiario() {
        return estadoBeneficiario;
    }

    /**
     * Default constructor
     */
    public Usuario() {
        aesolicitudesidsolicitud = null;
        usuarioIdentificador = null;
    }

    /**
     * Constructor used to create instances of <code>Usuario</code>.
     * @param oid Object Identifier of the instance of <code>Usuario</code> to be created.
     * @throws SystemException
     */
    public Usuario(UsuarioOid oid) {
        if (oid != null && !oid.isNull()) {
            aesolicitudesidsolicitud = oid.getAesolicitudesidsolicitud();
            usuarioIdentificador = oid.getUsuarioIdentificador();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return Usuario.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Usuario other = (Usuario)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getUsuarioIdentificador(), other.getUsuarioIdentificador());
        result &= Utilities.isEqual(this.getUsuarioBebeGestante(), other.getUsuarioBebeGestante());
        result &= Utilities.isEqual(this.getUsuarioNumUsuario(), other.getUsuarioNumUsuario());
        result &= Utilities.isEqual(this.getUsuarioNumIdentificacion(), other.getUsuarioNumIdentificacion());
        result &= Utilities.isEqual(this.getUsuarioCodigoTipoUsuario(), other.getUsuarioCodigoTipoUsuario());
        result &= Utilities.isEqual(this.getUsuarioPrimerNombre(), other.getUsuarioPrimerNombre());
        result &= Utilities.isEqual(this.getUsuarioSegundoNombre(), other.getUsuarioSegundoNombre());
        result &= Utilities.isEqual(this.getUsuarioPrimerApellido(), other.getUsuarioPrimerApellido());
        result &= Utilities.isEqual(this.getUsuarioSegundoApellido(), other.getUsuarioSegundoApellido());
        result &= Utilities.isEqual(this.getUsuariodrvIdentificacion(), other.getUsuariodrvIdentificacion());
        result &= Utilities.isEqual(this.getUsuariodrvEsElTitular(), other.getUsuariodrvEsElTitular());
        result &= Utilities.isEqual(this.getUsuariodrvAccesoCuesMed(), other.getUsuariodrvAccesoCuesMed());
        result &= Utilities.isEqual(this.getUsuariodrvAceptaAnexoMat(), other.getUsuariodrvAceptaAnexoMat());
        result &= Utilities.isEqual(this.getUsuariodrvAceptaAnexoNeo(), other.getUsuariodrvAceptaAnexoNeo());
        result &= Utilities.isEqual(this.getUsuariodrvTieneAnexoMat(), other.getUsuariodrvTieneAnexoMat());
        result &= Utilities.isEqual(this.getUsuarioattrUsuarioDiligenciados(), other.getUsuarioattrUsuarioDiligenciados());
        result &= Utilities.isEqual(this.getUsuariodrvEdadParaCuotaIns(), other.getUsuariodrvEdadParaCuotaIns());
        result &= Utilities.isEqual(this.getUsuariodrvValorCuotaInscrip(), other.getUsuariodrvValorCuotaInscrip());
        result &= Utilities.isEqual(this.getUsuariodrvCuesMedOK(), other.getUsuariodrvCuesMedOK());
        result &= Utilities.isEqual(this.getUsuariocodigoBancoRep(), other.getUsuariocodigoBancoRep());
        result &= Utilities.isEqual(this.getUsuarioUsuarioReplicado(), other.getUsuarioUsuarioReplicado());
        result &= Utilities.isEqual(this.getUsuarioFechaAntiguedadBeneficiario(), other.getUsuarioFechaAntiguedadBeneficiario());
        result &= Utilities.isEqual(this.getUsuarioRequierExamenMedico(), other.getUsuarioRequierExamenMedico());
        result &= Utilities.isEqual(this.getUsuarioEstadoMedico(), other.getUsuarioEstadoMedico());
        result &= Utilities.isEqual(this.getUsuarioValorCuotaInscripcion(), other.getUsuarioValorCuotaInscripcion());
        result &= Utilities.isEqual(this.getUsuarioTienePreexistencias(), other.getUsuarioTienePreexistencias());
        result &= Utilities.isEqual(this.getUsuariodrvNombreCompleto(), other.getUsuariodrvNombreCompleto());
        result &= Utilities.isEqual(this.getUsuarioFechaInicioVigencia(), other.getUsuarioFechaInicioVigencia());
        result &= Utilities.isEqual(this.getUsuarioFechaFinVigencia(), other.getUsuarioFechaFinVigencia());
        result &= Utilities.isEqual(this.getUsuariodrvConfirmado(), other.getUsuariodrvConfirmado());
        result &= Utilities.isEqual(this.getUsuariodrvTiempoEmbarazo(), other.getUsuariodrvTiempoEmbarazo());
        result &= Utilities.isEqual(this.getUsuariodrvEstaActivo(), other.getUsuariodrvEstaActivo());
        result &= Utilities.isEqual(this.getUsuariodrvEdad(), other.getUsuariodrvEdad());
        result &= Utilities.isEqual(this.getUsuariodrvEdadMaxIngreso(), other.getUsuariodrvEdadMaxIngreso());
        result &= Utilities.isEqual(this.getUsuariodrvEdadMaxPerm(), other.getUsuariodrvEdadMaxPerm());
        result &= Utilities.isEqual(this.getUsuariodrvTotalAnexos(), other.getUsuariodrvTotalAnexos());
        result &= Utilities.isEqual(this.getUsuariodrvTieneEPSSanitas(), other.getUsuariodrvTieneEPSSanitas());
        result &= Utilities.isEqual(this.getUsuariodrvTieneDocumentos(), other.getUsuariodrvTieneDocumentos());
        result &= Utilities.isEqual(this.getUsuariotieneDocIdentificacion(), other.getUsuariotieneDocIdentificacion());
        result &= Utilities.isEqual(this.getUsuariotieneDocsSolicitud(), other.getUsuariotieneDocsSolicitud());
        result &= Utilities.isEqual(this.getUsuariodrvTieneParentesco(), other.getUsuariodrvTieneParentesco());
        result &= Utilities.isEqual(this.getUsuariodrvPuedeSerTitular(), other.getUsuariodrvPuedeSerTitular());
        result &= Utilities.isEqual(this.getUsuariodrvTieneCuesMed(), other.getUsuariodrvTieneCuesMed());
        result &= Utilities.isEqual(this.getUsuariodrvImpTarifaPlanVol(), other.getUsuariodrvImpTarifaPlanVol());
        result &= Utilities.isEqual(this.getUsuarioPolizaInternacional(), other.getUsuarioPolizaInternacional());
        result &= Utilities.isEqual(this.getUsuariodrvDirResValidoEPS(), other.getUsuariodrvDirResValidoEPS());
        result &= Utilities.isEqual(this.getUsuarioIMC(), other.getUsuarioIMC());
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
     * Returns the <code>UsuarioOid</code> object that identifies this instance of <code>Usuario</code>.
     * @return <code>UsuarioOid</code> object that identifies this instance of <code>Usuario</code>
     */
	@Override
    public UsuarioOid getOid() {
        return new UsuarioOid(getAesolicitudesidsolicitud(), getUsuarioIdentificador());
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
        if (!activeFacets.contains(Constants.USUARIO)) {
            activeFacets.add(Constants.USUARIO);
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
            relatedInstance = buildUsuarioRelatedInstance(relatedInstanceJsonOid);
        }
        if (UsuarioConstants.ROLE_NAME_CUESTIONARIOP.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildUsuarioRelatedInstance4CuestionarioP(relatedInstanceJsonOid, remainingPath);
        }
        if (UsuarioConstants.ROLE_NAME_ANEXOMAT.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildUsuarioRelatedInstance4AnexoMat(relatedInstanceJsonOid, remainingPath);
        }
        if (UsuarioConstants.ROLE_NAME_ANEXONEO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildUsuarioRelatedInstance4AnexoNeo(relatedInstanceJsonOid, remainingPath);
        }
        if (UsuarioConstants.ROLE_NAME_PREEXISTENCIAS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildUsuarioRelatedInstance4Preexistencia(relatedInstanceJsonOid, remainingPath);
        }
        if (UsuarioConstants.ROLE_NAME_SOLICITUD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildUsuarioRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        if (UsuarioConstants.ROLE_NAME_USUARIOPERSONA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildUsuarioRelatedInstance4Persona(relatedInstanceJsonOid, remainingPath);
        }
        if (UsuarioConstants.ROLE_NAME_EPS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildUsuarioRelatedInstance4Eps(relatedInstanceJsonOid, remainingPath);
        }
        if (UsuarioConstants.ROLE_NAME_PARENTESCO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildUsuarioRelatedInstance4Parentesco(relatedInstanceJsonOid, remainingPath);
        }
        if (UsuarioConstants.ROLE_NAME_COMPANYIA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildUsuarioRelatedInstance4Companyia(relatedInstanceJsonOid, remainingPath);
        }
        if (UsuarioConstants.ROLE_NAME_TIPOIDENTIFICACION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildUsuarioRelatedInstance4TipoIdentificacion(relatedInstanceJsonOid, remainingPath);
        }
        if (UsuarioConstants.ROLE_NAME_ESTADOBENEFICIARIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildUsuarioRelatedInstance4EstadoBeneficiario(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildUsuarioRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Usuario(mapper.readValue(relatedInstanceJsonOid, UsuarioOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Usuario.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildUsuarioRelatedInstance4CuestionarioP(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new CuestionarioP(mapper.readValue(relatedInstanceJsonOid, CuestionarioPOid.class)): CuestionarioP.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Usuario.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildUsuarioRelatedInstance4AnexoMat(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new AnexoMat(mapper.readValue(relatedInstanceJsonOid, AnexoMatOid.class)): AnexoMat.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Usuario.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildUsuarioRelatedInstance4AnexoNeo(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new AnexoNeo(mapper.readValue(relatedInstanceJsonOid, AnexoNeoOid.class)): AnexoNeo.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Usuario.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildUsuarioRelatedInstance4Preexistencia(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Preexistencia(mapper.readValue(relatedInstanceJsonOid, PreexistenciaOid.class)): Preexistencia.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Usuario.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildUsuarioRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Usuario.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildUsuarioRelatedInstance4Persona(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Persona(mapper.readValue(relatedInstanceJsonOid, PersonaOid.class)): Persona.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Usuario.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildUsuarioRelatedInstance4Eps(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Eps(mapper.readValue(relatedInstanceJsonOid, EpsOid.class)): Eps.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Usuario.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildUsuarioRelatedInstance4Parentesco(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Parentesco(mapper.readValue(relatedInstanceJsonOid, ParentescoOid.class)): Parentesco.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Usuario.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildUsuarioRelatedInstance4Companyia(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Companyia(mapper.readValue(relatedInstanceJsonOid, CompanyiaOid.class)): Companyia.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Usuario.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildUsuarioRelatedInstance4TipoIdentificacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TipoIdentificacion(mapper.readValue(relatedInstanceJsonOid, TipoIdentificacionOid.class)): TipoIdentificacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Usuario.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildUsuarioRelatedInstance4EstadoBeneficiario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new EstadoBeneficiario(mapper.readValue(relatedInstanceJsonOid, EstadoBeneficiarioOid.class)): EstadoBeneficiario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Usuario.class).error(e.getMessage());
            return null;
        }
    }
}
