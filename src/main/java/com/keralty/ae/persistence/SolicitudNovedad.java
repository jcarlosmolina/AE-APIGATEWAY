package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.SolicitudNovedadConstants;
import com.keralty.ae.persistence.oid.CausalOid;
import com.keralty.ae.persistence.oid.DocumentoNovedadOid;
import com.keralty.ae.persistence.oid.EstadoContratoOid;
import com.keralty.ae.persistence.oid.FamiliaNovedadOid;
import com.keralty.ae.persistence.oid.FirmaOid;
import com.keralty.ae.persistence.oid.FuncionarioOid;
import com.keralty.ae.persistence.oid.GrupoAsociadoOid;
import com.keralty.ae.persistence.oid.LogEstadoSNOid;
import com.keralty.ae.persistence.oid.LogUsrSolNovOid;
import com.keralty.ae.persistence.oid.MotivoExcepcionSolNovOid;
import com.keralty.ae.persistence.oid.NovedadOid;
import com.keralty.ae.persistence.oid.PeriodicidadOid;
import com.keralty.ae.persistence.oid.PlanesOid;
import com.keralty.ae.persistence.oid.ProteccionDatosOid;
import com.keralty.ae.persistence.oid.SolicitudNovedadOid;
import com.keralty.ae.persistence.oid.TipoIdentificacionOid;
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
 * Representation of the <code>SolicitudNovedad</code> external model class.
 * <p>
 * External Model Class: <code>SolicitudNovedad</code><br>
 */
public class SolicitudNovedad extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id")
    private Long solicitudNovedadId;

    @JsonProperty(value="numradicado")
    private Long solicitudNovedadNumRadicado;

    @JsonProperty(value="fechacreacion")
    private Date solicitudNovedadFechaCreacion;

    @JsonProperty(value="fechavigencia")
    private Date solicitudNovedadFechaVigencia;

    @JsonProperty(value="numcontrato")
    private String solicitudNovedadNumContrato;

    @JsonProperty(value="excepcion")
    private Boolean solicitudNovedadExcepcion;

    @JsonProperty(value="fechainiexcepcion")
    private Date solicitudNovedadFechaIniExcepcion;

    @JsonProperty(value="fechafinexcepcion")
    private Date solicitudNovedadFechaFinExcepcion;

    @JsonProperty(value="ctrcodigotarifa")
    private String solicitudNovedadCtrCodigoTarifa;

    @JsonProperty(value="ctrdesctarifa")
    private String solicitudNovedadCtrDescTarifa;

    @JsonProperty(value="ctrcodigoconvenio")
    private String solicitudNovedadCtrCodigoConvenio;

    @JsonProperty(value="ctrdescconvenio")
    private String solicitudNovedadCtrDescConvenio;

    @JsonProperty(value="ctrescolectivo")
    private Boolean solicitudNovedadCtrEsColectivo;

    @JsonProperty(value="ctrtagcausaexclusion")
    private String solicitudNovedadCtrTagCausaExclusion;

    @JsonProperty(value="contranumiden")
    private String solicitudNovedadContraNumIden;

    @JsonProperty(value="contraprimernombre")
    private String solicitudNovedadContraPrimerNombre;

    @JsonProperty(value="contrasegundonombre")
    private String solicitudNovedadContraSegundoNombre;

    @JsonProperty(value="contraprimerapellido")
    private String solicitudNovedadContraPrimerApellido;

    @JsonProperty(value="contrasegundoapellido")
    private String solicitudNovedadContraSegundoApellido;

    @JsonProperty(value="contrarazonsocial")
    private String solicitudNovedadContraRazonSocial;

    @JsonProperty(value="fechaultimodoc")
    private Timestamp solicitudNovedadFechaUltimoDoc;

    @JsonProperty(value="observacions")
    private String solicitudNovedadObservacions;

    @JsonProperty(value="estado")
    private Long solicitudNovedadEstado;

    @JsonProperty(value="estadodocumentacion")
    private Long solicitudNovedadEstadoDocumentacion;

    @JsonProperty(value="completada")
    private Boolean solicitudNovedadCompletada;

    @JsonProperty(value="fechacompletada")
    private Timestamp solicitudNovedadFechaCompletada;

    @JsonProperty(value="ctractivo")
    private Boolean solicitudNovedadCtrActivo;

    @JsonProperty(value="ctrtipocontrato")
    private Long solicitudNovedadCtrTipoContrato;

    @JsonProperty(value="scnummeses")
    private Long solicitudNovedadSCNumMeses;

    @JsonProperty(value="contranuevarazonsocial")
    private String solicitudNovedadContraNuevaRazonSocial;

    @JsonProperty(value="contratipopersona")
    private String solicitudNovedadContraTipoPersona;

    @JsonProperty(value="ctrfiniciocontrato")
    private Date solicitudNovedadCtrFInicioContrato;

    @JsonProperty(value="drvexigecontratoactivo")
    private Boolean solicitudNovedadDrvExigeContratoActivo;

    @JsonProperty(value="drvexigefamiliaactiva")
    private Boolean solicitudNovedadDrvExigeFamiliaActiva;

    @JsonProperty(value="contradrvnombrecompleto")
    private String solicitudNovedadContraDrvNombreCompleto;

    @JsonProperty(value="drvtarifa")
    private String solicitudNovedadDrvTarifa;

    @JsonProperty(value="drvconvenio")
    private String solicitudNovedadDrvConvenio;

    @JsonProperty(value="contradrvidentificacion")
    private String solicitudNovedadContraDrvIdentificacion;

    @JsonProperty(value="drvgrupoasociado")
    private String solicitudNovedadDrvGrupoAsociado;

    @JsonProperty(value="drvperiodicidad")
    private String solicitudNovedadDrvPeriodicidad;

    @JsonProperty(value="drvpermiteaddfam")
    private Boolean solicitudNovedadDrvPermiteAddFam;

    @JsonProperty(value="drvpermitedelfam")
    private Boolean solicitudNovedadDrvPermiteDelFam;

    @JsonProperty(value="drvexigedocsolicitud")
    private Boolean solicitudNovedadDrvExigeDocSolicitud;

    @JsonProperty(value="drvexigedocpersona")
    private Boolean solicitudNovedadDrvExigeDocPersona;

    @JsonProperty(value="drvreportcoloscuro")
    private String solicitudNovedadDrvReportColOscuro;

    @JsonProperty(value="drvreportcolclaro")
    private String solicitudNovedadDrvReportColClaro;

    @JsonProperty(value="drvreportlogo")
    private String solicitudNovedadDrvReportLogo;

    @JsonProperty(value="drvnuevaperiodicidad")
    private String solicitudNovedadDrvNuevaPeriodicidad;

    @JsonProperty(value="prioridad")
    private Long solicitudNovedadPrioridad;

    @JsonProperty(value="fechaterminada")
    private Date solicitudNovedadFechaTerminada;

    @JsonProperty(value="fechafug")
    private Timestamp solicitudNovedadFechaFUG;

    @JsonProperty(value="fechafa")
    private Timestamp solicitudNovedadFechaFA;

    @JsonProperty(value="semaforograbase")
    private Double solicitudNovedadSemaforoGrabAse;

    @JsonProperty(value="drvsemaforograbase")
    private Double solicitudNovedaddrvSemaforoGrabAse;

    @JsonProperty(value="drvnumradicadostr")
    private String solicitudNovedadDrvNumRadicadoStr;

    @JsonProperty(value="drvvalidarps1")
    private Boolean solicitudNovedadDrvValidarPS1;

    @JsonProperty(value="drvvalidarps2")
    private Boolean solicitudNovedadDrvValidarPS2;

    private Collection <FamiliaNovedad> familias;

    private Collection <DocumentoNovedad> documentos;

    private Collection <LogEstadoSN> logEstados;

    private Collection <LogUsrSolNov> logUsrSolNov;

    private Planes planT;

    private Novedad novedad;

    private Causal causal;

    private ProteccionDatos proteccionDatos;

    private TipoIdentificacion tipoIdentContratante;

    private EstadoContrato estadoContrato;

    private GrupoAsociado grupoAsociado;

    private Periodicidad periodicidad;

    private Funcionario agente;

    private Periodicidad periodicidadNueva;

    private MotivoExcepcionSolNov motivoExcepcion;

    private Funcionario usrAfiliacion;

    private Firma firma;

    /**
     * Gets the value of attribute Id
     */
    public Long getSolicitudNovedadId() {
        return solicitudNovedadId;
    }
    
    /**
     * Sets the value of attribute Id
     */
    public void setSolicitudNovedadId(Long solicitudNovedadId) {
        this.solicitudNovedadId = solicitudNovedadId;
    }

    /**
     * Gets the value of attribute NumRadicado
     */
    public Long getSolicitudNovedadNumRadicado() {
        return solicitudNovedadNumRadicado;
    }
    
    /**
     * Sets the value of attribute NumRadicado
     */
    public void setSolicitudNovedadNumRadicado(Long solicitudNovedadNumRadicado) {
        this.solicitudNovedadNumRadicado = solicitudNovedadNumRadicado;
    }

    /**
     * Gets the value of attribute FechaCreacion
     */
    public Date getSolicitudNovedadFechaCreacion() {
        return solicitudNovedadFechaCreacion;
    }
    
    /**
     * Sets the value of attribute FechaCreacion
     */
    public void setSolicitudNovedadFechaCreacion(Date solicitudNovedadFechaCreacion) {
        this.solicitudNovedadFechaCreacion = solicitudNovedadFechaCreacion;
    }

    /**
     * Gets the value of attribute FechaVigencia
     */
    public Date getSolicitudNovedadFechaVigencia() {
        return solicitudNovedadFechaVigencia;
    }
    
    /**
     * Sets the value of attribute FechaVigencia
     */
    public void setSolicitudNovedadFechaVigencia(Date solicitudNovedadFechaVigencia) {
        this.solicitudNovedadFechaVigencia = solicitudNovedadFechaVigencia;
    }

    /**
     * Gets the value of attribute NumContrato
     */
    public String getSolicitudNovedadNumContrato() {
        return solicitudNovedadNumContrato;
    }
    
    /**
     * Sets the value of attribute NumContrato
     */
    public void setSolicitudNovedadNumContrato(String solicitudNovedadNumContrato) {
        this.solicitudNovedadNumContrato = solicitudNovedadNumContrato;
    }

    /**
     * Gets the value of attribute Excepcion
     */
    public Boolean getSolicitudNovedadExcepcion() {
        return solicitudNovedadExcepcion;
    }
    
    /**
     * Sets the value of attribute Excepcion
     */
    public void setSolicitudNovedadExcepcion(Boolean solicitudNovedadExcepcion) {
        this.solicitudNovedadExcepcion = solicitudNovedadExcepcion;
    }

    /**
     * Gets the value of attribute FechaIniExcepcion
     */
    public Date getSolicitudNovedadFechaIniExcepcion() {
        return solicitudNovedadFechaIniExcepcion;
    }
    
    /**
     * Sets the value of attribute FechaIniExcepcion
     */
    public void setSolicitudNovedadFechaIniExcepcion(Date solicitudNovedadFechaIniExcepcion) {
        this.solicitudNovedadFechaIniExcepcion = solicitudNovedadFechaIniExcepcion;
    }

    /**
     * Gets the value of attribute FechaFinExcepcion
     */
    public Date getSolicitudNovedadFechaFinExcepcion() {
        return solicitudNovedadFechaFinExcepcion;
    }
    
    /**
     * Sets the value of attribute FechaFinExcepcion
     */
    public void setSolicitudNovedadFechaFinExcepcion(Date solicitudNovedadFechaFinExcepcion) {
        this.solicitudNovedadFechaFinExcepcion = solicitudNovedadFechaFinExcepcion;
    }

    /**
     * Gets the value of attribute CtrCodigoTarifa
     */
    public String getSolicitudNovedadCtrCodigoTarifa() {
        return solicitudNovedadCtrCodigoTarifa;
    }
    
    /**
     * Sets the value of attribute CtrCodigoTarifa
     */
    public void setSolicitudNovedadCtrCodigoTarifa(String solicitudNovedadCtrCodigoTarifa) {
        this.solicitudNovedadCtrCodigoTarifa = solicitudNovedadCtrCodigoTarifa;
    }

    /**
     * Gets the value of attribute CtrDescTarifa
     */
    public String getSolicitudNovedadCtrDescTarifa() {
        return solicitudNovedadCtrDescTarifa;
    }
    
    /**
     * Sets the value of attribute CtrDescTarifa
     */
    public void setSolicitudNovedadCtrDescTarifa(String solicitudNovedadCtrDescTarifa) {
        this.solicitudNovedadCtrDescTarifa = solicitudNovedadCtrDescTarifa;
    }

    /**
     * Gets the value of attribute CtrCodigoConvenio
     */
    public String getSolicitudNovedadCtrCodigoConvenio() {
        return solicitudNovedadCtrCodigoConvenio;
    }
    
    /**
     * Sets the value of attribute CtrCodigoConvenio
     */
    public void setSolicitudNovedadCtrCodigoConvenio(String solicitudNovedadCtrCodigoConvenio) {
        this.solicitudNovedadCtrCodigoConvenio = solicitudNovedadCtrCodigoConvenio;
    }

    /**
     * Gets the value of attribute CtrDescConvenio
     */
    public String getSolicitudNovedadCtrDescConvenio() {
        return solicitudNovedadCtrDescConvenio;
    }
    
    /**
     * Sets the value of attribute CtrDescConvenio
     */
    public void setSolicitudNovedadCtrDescConvenio(String solicitudNovedadCtrDescConvenio) {
        this.solicitudNovedadCtrDescConvenio = solicitudNovedadCtrDescConvenio;
    }

    /**
     * Gets the value of attribute CtrEsColectivo
     */
    public Boolean getSolicitudNovedadCtrEsColectivo() {
        return solicitudNovedadCtrEsColectivo;
    }
    
    /**
     * Sets the value of attribute CtrEsColectivo
     */
    public void setSolicitudNovedadCtrEsColectivo(Boolean solicitudNovedadCtrEsColectivo) {
        this.solicitudNovedadCtrEsColectivo = solicitudNovedadCtrEsColectivo;
    }

    /**
     * Gets the value of attribute CtrTagCausaExclusion
     */
    public String getSolicitudNovedadCtrTagCausaExclusion() {
        return solicitudNovedadCtrTagCausaExclusion;
    }
    
    /**
     * Sets the value of attribute CtrTagCausaExclusion
     */
    public void setSolicitudNovedadCtrTagCausaExclusion(String solicitudNovedadCtrTagCausaExclusion) {
        this.solicitudNovedadCtrTagCausaExclusion = solicitudNovedadCtrTagCausaExclusion;
    }

    /**
     * Gets the value of attribute ContraNumIden
     */
    public String getSolicitudNovedadContraNumIden() {
        return solicitudNovedadContraNumIden;
    }
    
    /**
     * Sets the value of attribute ContraNumIden
     */
    public void setSolicitudNovedadContraNumIden(String solicitudNovedadContraNumIden) {
        this.solicitudNovedadContraNumIden = solicitudNovedadContraNumIden;
    }

    /**
     * Gets the value of attribute ContraPrimerNombre
     */
    public String getSolicitudNovedadContraPrimerNombre() {
        return solicitudNovedadContraPrimerNombre;
    }
    
    /**
     * Sets the value of attribute ContraPrimerNombre
     */
    public void setSolicitudNovedadContraPrimerNombre(String solicitudNovedadContraPrimerNombre) {
        this.solicitudNovedadContraPrimerNombre = solicitudNovedadContraPrimerNombre;
    }

    /**
     * Gets the value of attribute ContraSegundoNombre
     */
    public String getSolicitudNovedadContraSegundoNombre() {
        return solicitudNovedadContraSegundoNombre;
    }
    
    /**
     * Sets the value of attribute ContraSegundoNombre
     */
    public void setSolicitudNovedadContraSegundoNombre(String solicitudNovedadContraSegundoNombre) {
        this.solicitudNovedadContraSegundoNombre = solicitudNovedadContraSegundoNombre;
    }

    /**
     * Gets the value of attribute ContraPrimerApellido
     */
    public String getSolicitudNovedadContraPrimerApellido() {
        return solicitudNovedadContraPrimerApellido;
    }
    
    /**
     * Sets the value of attribute ContraPrimerApellido
     */
    public void setSolicitudNovedadContraPrimerApellido(String solicitudNovedadContraPrimerApellido) {
        this.solicitudNovedadContraPrimerApellido = solicitudNovedadContraPrimerApellido;
    }

    /**
     * Gets the value of attribute ContraSegundoApellido
     */
    public String getSolicitudNovedadContraSegundoApellido() {
        return solicitudNovedadContraSegundoApellido;
    }
    
    /**
     * Sets the value of attribute ContraSegundoApellido
     */
    public void setSolicitudNovedadContraSegundoApellido(String solicitudNovedadContraSegundoApellido) {
        this.solicitudNovedadContraSegundoApellido = solicitudNovedadContraSegundoApellido;
    }

    /**
     * Gets the value of attribute ContraRazonSocial
     */
    public String getSolicitudNovedadContraRazonSocial() {
        return solicitudNovedadContraRazonSocial;
    }
    
    /**
     * Sets the value of attribute ContraRazonSocial
     */
    public void setSolicitudNovedadContraRazonSocial(String solicitudNovedadContraRazonSocial) {
        this.solicitudNovedadContraRazonSocial = solicitudNovedadContraRazonSocial;
    }

    /**
     * Gets the value of attribute FechaUltimoDoc
     */
    public Timestamp getSolicitudNovedadFechaUltimoDoc() {
        return solicitudNovedadFechaUltimoDoc;
    }
    
    /**
     * Sets the value of attribute FechaUltimoDoc
     */
    public void setSolicitudNovedadFechaUltimoDoc(Timestamp solicitudNovedadFechaUltimoDoc) {
        this.solicitudNovedadFechaUltimoDoc = solicitudNovedadFechaUltimoDoc;
    }

    /**
     * Gets the value of attribute Observacions
     */
    public String getSolicitudNovedadObservacions() {
        return solicitudNovedadObservacions;
    }
    
    /**
     * Sets the value of attribute Observacions
     */
    public void setSolicitudNovedadObservacions(String solicitudNovedadObservacions) {
        this.solicitudNovedadObservacions = solicitudNovedadObservacions;
    }

    /**
     * Gets the value of attribute Estado
     */
    public Long getSolicitudNovedadEstado() {
        return solicitudNovedadEstado;
    }
    
    /**
     * Sets the value of attribute Estado
     */
    public void setSolicitudNovedadEstado(Long solicitudNovedadEstado) {
        this.solicitudNovedadEstado = solicitudNovedadEstado;
    }

    /**
     * Gets the value of attribute EstadoDocumentacion
     */
    public Long getSolicitudNovedadEstadoDocumentacion() {
        return solicitudNovedadEstadoDocumentacion;
    }
    
    /**
     * Sets the value of attribute EstadoDocumentacion
     */
    public void setSolicitudNovedadEstadoDocumentacion(Long solicitudNovedadEstadoDocumentacion) {
        this.solicitudNovedadEstadoDocumentacion = solicitudNovedadEstadoDocumentacion;
    }

    /**
     * Gets the value of attribute Completada
     */
    public Boolean getSolicitudNovedadCompletada() {
        return solicitudNovedadCompletada;
    }
    
    /**
     * Sets the value of attribute Completada
     */
    public void setSolicitudNovedadCompletada(Boolean solicitudNovedadCompletada) {
        this.solicitudNovedadCompletada = solicitudNovedadCompletada;
    }

    /**
     * Gets the value of attribute FechaCompletada
     */
    public Timestamp getSolicitudNovedadFechaCompletada() {
        return solicitudNovedadFechaCompletada;
    }
    
    /**
     * Sets the value of attribute FechaCompletada
     */
    public void setSolicitudNovedadFechaCompletada(Timestamp solicitudNovedadFechaCompletada) {
        this.solicitudNovedadFechaCompletada = solicitudNovedadFechaCompletada;
    }

    /**
     * Gets the value of attribute CtrActivo
     */
    public Boolean getSolicitudNovedadCtrActivo() {
        return solicitudNovedadCtrActivo;
    }
    
    /**
     * Sets the value of attribute CtrActivo
     */
    public void setSolicitudNovedadCtrActivo(Boolean solicitudNovedadCtrActivo) {
        this.solicitudNovedadCtrActivo = solicitudNovedadCtrActivo;
    }

    /**
     * Gets the value of attribute CtrTipoContrato
     */
    public Long getSolicitudNovedadCtrTipoContrato() {
        return solicitudNovedadCtrTipoContrato;
    }
    
    /**
     * Sets the value of attribute CtrTipoContrato
     */
    public void setSolicitudNovedadCtrTipoContrato(Long solicitudNovedadCtrTipoContrato) {
        this.solicitudNovedadCtrTipoContrato = solicitudNovedadCtrTipoContrato;
    }

    /**
     * Gets the value of attribute SCNumMeses
     */
    public Long getSolicitudNovedadSCNumMeses() {
        return solicitudNovedadSCNumMeses;
    }
    
    /**
     * Sets the value of attribute SCNumMeses
     */
    public void setSolicitudNovedadSCNumMeses(Long solicitudNovedadSCNumMeses) {
        this.solicitudNovedadSCNumMeses = solicitudNovedadSCNumMeses;
    }

    /**
     * Gets the value of attribute ContraNuevaRazonSocial
     */
    public String getSolicitudNovedadContraNuevaRazonSocial() {
        return solicitudNovedadContraNuevaRazonSocial;
    }
    
    /**
     * Sets the value of attribute ContraNuevaRazonSocial
     */
    public void setSolicitudNovedadContraNuevaRazonSocial(String solicitudNovedadContraNuevaRazonSocial) {
        this.solicitudNovedadContraNuevaRazonSocial = solicitudNovedadContraNuevaRazonSocial;
    }

    /**
     * Gets the value of attribute ContraTipoPersona
     */
    public String getSolicitudNovedadContraTipoPersona() {
        return solicitudNovedadContraTipoPersona;
    }
    
    /**
     * Sets the value of attribute ContraTipoPersona
     */
    public void setSolicitudNovedadContraTipoPersona(String solicitudNovedadContraTipoPersona) {
        this.solicitudNovedadContraTipoPersona = solicitudNovedadContraTipoPersona;
    }

    /**
     * Gets the value of attribute CtrFInicioContrato
     */
    public Date getSolicitudNovedadCtrFInicioContrato() {
        return solicitudNovedadCtrFInicioContrato;
    }
    
    /**
     * Sets the value of attribute CtrFInicioContrato
     */
    public void setSolicitudNovedadCtrFInicioContrato(Date solicitudNovedadCtrFInicioContrato) {
        this.solicitudNovedadCtrFInicioContrato = solicitudNovedadCtrFInicioContrato;
    }

    /**
     * Gets the value of attribute DrvExigeContratoActivo
     */
    public Boolean getSolicitudNovedadDrvExigeContratoActivo() {
        return solicitudNovedadDrvExigeContratoActivo;
    }
    
    /**
     * Sets the value of attribute DrvExigeContratoActivo
     */
    public void setSolicitudNovedadDrvExigeContratoActivo(Boolean solicitudNovedadDrvExigeContratoActivo) {
        this.solicitudNovedadDrvExigeContratoActivo = solicitudNovedadDrvExigeContratoActivo;
    }

    /**
     * Gets the value of attribute DrvExigeFamiliaActiva
     */
    public Boolean getSolicitudNovedadDrvExigeFamiliaActiva() {
        return solicitudNovedadDrvExigeFamiliaActiva;
    }
    
    /**
     * Sets the value of attribute DrvExigeFamiliaActiva
     */
    public void setSolicitudNovedadDrvExigeFamiliaActiva(Boolean solicitudNovedadDrvExigeFamiliaActiva) {
        this.solicitudNovedadDrvExigeFamiliaActiva = solicitudNovedadDrvExigeFamiliaActiva;
    }

    /**
     * Gets the value of attribute ContraDrvNombreCompleto
     */
    public String getSolicitudNovedadContraDrvNombreCompleto() {
        return solicitudNovedadContraDrvNombreCompleto;
    }
    
    /**
     * Sets the value of attribute ContraDrvNombreCompleto
     */
    public void setSolicitudNovedadContraDrvNombreCompleto(String solicitudNovedadContraDrvNombreCompleto) {
        this.solicitudNovedadContraDrvNombreCompleto = solicitudNovedadContraDrvNombreCompleto;
    }

    /**
     * Gets the value of attribute DrvTarifa
     */
    public String getSolicitudNovedadDrvTarifa() {
        return solicitudNovedadDrvTarifa;
    }
    
    /**
     * Sets the value of attribute DrvTarifa
     */
    public void setSolicitudNovedadDrvTarifa(String solicitudNovedadDrvTarifa) {
        this.solicitudNovedadDrvTarifa = solicitudNovedadDrvTarifa;
    }

    /**
     * Gets the value of attribute DrvConvenio
     */
    public String getSolicitudNovedadDrvConvenio() {
        return solicitudNovedadDrvConvenio;
    }
    
    /**
     * Sets the value of attribute DrvConvenio
     */
    public void setSolicitudNovedadDrvConvenio(String solicitudNovedadDrvConvenio) {
        this.solicitudNovedadDrvConvenio = solicitudNovedadDrvConvenio;
    }

    /**
     * Gets the value of attribute ContraDrvIdentificacion
     */
    public String getSolicitudNovedadContraDrvIdentificacion() {
        return solicitudNovedadContraDrvIdentificacion;
    }
    
    /**
     * Sets the value of attribute ContraDrvIdentificacion
     */
    public void setSolicitudNovedadContraDrvIdentificacion(String solicitudNovedadContraDrvIdentificacion) {
        this.solicitudNovedadContraDrvIdentificacion = solicitudNovedadContraDrvIdentificacion;
    }

    /**
     * Gets the value of attribute DrvGrupoAsociado
     */
    public String getSolicitudNovedadDrvGrupoAsociado() {
        return solicitudNovedadDrvGrupoAsociado;
    }
    
    /**
     * Sets the value of attribute DrvGrupoAsociado
     */
    public void setSolicitudNovedadDrvGrupoAsociado(String solicitudNovedadDrvGrupoAsociado) {
        this.solicitudNovedadDrvGrupoAsociado = solicitudNovedadDrvGrupoAsociado;
    }

    /**
     * Gets the value of attribute DrvPeriodicidad
     */
    public String getSolicitudNovedadDrvPeriodicidad() {
        return solicitudNovedadDrvPeriodicidad;
    }
    
    /**
     * Sets the value of attribute DrvPeriodicidad
     */
    public void setSolicitudNovedadDrvPeriodicidad(String solicitudNovedadDrvPeriodicidad) {
        this.solicitudNovedadDrvPeriodicidad = solicitudNovedadDrvPeriodicidad;
    }

    /**
     * Gets the value of attribute DrvPermiteAddFam
     */
    public Boolean getSolicitudNovedadDrvPermiteAddFam() {
        return solicitudNovedadDrvPermiteAddFam;
    }
    
    /**
     * Sets the value of attribute DrvPermiteAddFam
     */
    public void setSolicitudNovedadDrvPermiteAddFam(Boolean solicitudNovedadDrvPermiteAddFam) {
        this.solicitudNovedadDrvPermiteAddFam = solicitudNovedadDrvPermiteAddFam;
    }

    /**
     * Gets the value of attribute DrvPermiteDelFam
     */
    public Boolean getSolicitudNovedadDrvPermiteDelFam() {
        return solicitudNovedadDrvPermiteDelFam;
    }
    
    /**
     * Sets the value of attribute DrvPermiteDelFam
     */
    public void setSolicitudNovedadDrvPermiteDelFam(Boolean solicitudNovedadDrvPermiteDelFam) {
        this.solicitudNovedadDrvPermiteDelFam = solicitudNovedadDrvPermiteDelFam;
    }

    /**
     * Gets the value of attribute DrvExigeDocSolicitud
     */
    public Boolean getSolicitudNovedadDrvExigeDocSolicitud() {
        return solicitudNovedadDrvExigeDocSolicitud;
    }
    
    /**
     * Sets the value of attribute DrvExigeDocSolicitud
     */
    public void setSolicitudNovedadDrvExigeDocSolicitud(Boolean solicitudNovedadDrvExigeDocSolicitud) {
        this.solicitudNovedadDrvExigeDocSolicitud = solicitudNovedadDrvExigeDocSolicitud;
    }

    /**
     * Gets the value of attribute DrvExigeDocPersona
     */
    public Boolean getSolicitudNovedadDrvExigeDocPersona() {
        return solicitudNovedadDrvExigeDocPersona;
    }
    
    /**
     * Sets the value of attribute DrvExigeDocPersona
     */
    public void setSolicitudNovedadDrvExigeDocPersona(Boolean solicitudNovedadDrvExigeDocPersona) {
        this.solicitudNovedadDrvExigeDocPersona = solicitudNovedadDrvExigeDocPersona;
    }

    /**
     * Gets the value of attribute DrvReportColOscuro
     */
    public String getSolicitudNovedadDrvReportColOscuro() {
        return solicitudNovedadDrvReportColOscuro;
    }
    
    /**
     * Sets the value of attribute DrvReportColOscuro
     */
    public void setSolicitudNovedadDrvReportColOscuro(String solicitudNovedadDrvReportColOscuro) {
        this.solicitudNovedadDrvReportColOscuro = solicitudNovedadDrvReportColOscuro;
    }

    /**
     * Gets the value of attribute DrvReportColClaro
     */
    public String getSolicitudNovedadDrvReportColClaro() {
        return solicitudNovedadDrvReportColClaro;
    }
    
    /**
     * Sets the value of attribute DrvReportColClaro
     */
    public void setSolicitudNovedadDrvReportColClaro(String solicitudNovedadDrvReportColClaro) {
        this.solicitudNovedadDrvReportColClaro = solicitudNovedadDrvReportColClaro;
    }

    /**
     * Gets the value of attribute DrvReportLogo
     */
    public String getSolicitudNovedadDrvReportLogo() {
        return solicitudNovedadDrvReportLogo;
    }
    
    /**
     * Sets the value of attribute DrvReportLogo
     */
    public void setSolicitudNovedadDrvReportLogo(String solicitudNovedadDrvReportLogo) {
        this.solicitudNovedadDrvReportLogo = solicitudNovedadDrvReportLogo;
    }

    /**
     * Gets the value of attribute DrvNuevaPeriodicidad
     */
    public String getSolicitudNovedadDrvNuevaPeriodicidad() {
        return solicitudNovedadDrvNuevaPeriodicidad;
    }
    
    /**
     * Sets the value of attribute DrvNuevaPeriodicidad
     */
    public void setSolicitudNovedadDrvNuevaPeriodicidad(String solicitudNovedadDrvNuevaPeriodicidad) {
        this.solicitudNovedadDrvNuevaPeriodicidad = solicitudNovedadDrvNuevaPeriodicidad;
    }

    /**
     * Gets the value of attribute Prioridad
     */
    public Long getSolicitudNovedadPrioridad() {
        return solicitudNovedadPrioridad;
    }
    
    /**
     * Sets the value of attribute Prioridad
     */
    public void setSolicitudNovedadPrioridad(Long solicitudNovedadPrioridad) {
        this.solicitudNovedadPrioridad = solicitudNovedadPrioridad;
    }

    /**
     * Gets the value of attribute FechaTerminada
     */
    public Date getSolicitudNovedadFechaTerminada() {
        return solicitudNovedadFechaTerminada;
    }
    
    /**
     * Sets the value of attribute FechaTerminada
     */
    public void setSolicitudNovedadFechaTerminada(Date solicitudNovedadFechaTerminada) {
        this.solicitudNovedadFechaTerminada = solicitudNovedadFechaTerminada;
    }

    /**
     * Gets the value of attribute FechaFUG
     */
    public Timestamp getSolicitudNovedadFechaFUG() {
        return solicitudNovedadFechaFUG;
    }
    
    /**
     * Sets the value of attribute FechaFUG
     */
    public void setSolicitudNovedadFechaFUG(Timestamp solicitudNovedadFechaFUG) {
        this.solicitudNovedadFechaFUG = solicitudNovedadFechaFUG;
    }

    /**
     * Gets the value of attribute FechaFA
     */
    public Timestamp getSolicitudNovedadFechaFA() {
        return solicitudNovedadFechaFA;
    }
    
    /**
     * Sets the value of attribute FechaFA
     */
    public void setSolicitudNovedadFechaFA(Timestamp solicitudNovedadFechaFA) {
        this.solicitudNovedadFechaFA = solicitudNovedadFechaFA;
    }

    /**
     * Gets the value of attribute SemaforoGrabAse
     */
    public Double getSolicitudNovedadSemaforoGrabAse() {
        return solicitudNovedadSemaforoGrabAse;
    }
    
    /**
     * Sets the value of attribute SemaforoGrabAse
     */
    public void setSolicitudNovedadSemaforoGrabAse(Double solicitudNovedadSemaforoGrabAse) {
        this.solicitudNovedadSemaforoGrabAse = solicitudNovedadSemaforoGrabAse;
    }

    /**
     * Gets the value of attribute drvSemaforoGrabAse
     */
    public Double getSolicitudNovedaddrvSemaforoGrabAse() {
        return solicitudNovedaddrvSemaforoGrabAse;
    }
    
    /**
     * Sets the value of attribute drvSemaforoGrabAse
     */
    public void setSolicitudNovedaddrvSemaforoGrabAse(Double solicitudNovedaddrvSemaforoGrabAse) {
        this.solicitudNovedaddrvSemaforoGrabAse = solicitudNovedaddrvSemaforoGrabAse;
    }

    /**
     * Gets the value of attribute DrvNumRadicadoStr
     */
    public String getSolicitudNovedadDrvNumRadicadoStr() {
        return solicitudNovedadDrvNumRadicadoStr;
    }
    
    /**
     * Sets the value of attribute DrvNumRadicadoStr
     */
    public void setSolicitudNovedadDrvNumRadicadoStr(String solicitudNovedadDrvNumRadicadoStr) {
        this.solicitudNovedadDrvNumRadicadoStr = solicitudNovedadDrvNumRadicadoStr;
    }

    /**
     * Gets the value of attribute DrvValidarPS1
     */
    public Boolean getSolicitudNovedadDrvValidarPS1() {
        return solicitudNovedadDrvValidarPS1;
    }
    
    /**
     * Sets the value of attribute DrvValidarPS1
     */
    public void setSolicitudNovedadDrvValidarPS1(Boolean solicitudNovedadDrvValidarPS1) {
        this.solicitudNovedadDrvValidarPS1 = solicitudNovedadDrvValidarPS1;
    }

    /**
     * Gets the value of attribute DrvValidarPS2
     */
    public Boolean getSolicitudNovedadDrvValidarPS2() {
        return solicitudNovedadDrvValidarPS2;
    }
    
    /**
     * Sets the value of attribute DrvValidarPS2
     */
    public void setSolicitudNovedadDrvValidarPS2(Boolean solicitudNovedadDrvValidarPS2) {
        this.solicitudNovedadDrvValidarPS2 = solicitudNovedadDrvValidarPS2;
    }

    /**
     * Gets the value of relation through role Familias
     */
    @JsonIgnore
    public Collection <FamiliaNovedad> getFamilias() {
        return familias;
    }

    /**
     * Gets the value of relation through role Documentos
     */
    @JsonIgnore
    public Collection <DocumentoNovedad> getDocumentos() {
        return documentos;
    }

    /**
     * Gets the value of relation through role LogEstados
     */
    @JsonIgnore
    public Collection <LogEstadoSN> getLogEstados() {
        return logEstados;
    }

    /**
     * Gets the value of relation through role LogUsrSolNov
     */
    @JsonIgnore
    public Collection <LogUsrSolNov> getLogUsrSolNov() {
        return logUsrSolNov;
    }

    /**
     * Gets the value of relation through role PlanT
     */
    @JsonIgnore
    public Planes getPlanT() {
        return planT;
    }

    /**
     * Gets the value of relation through role Novedad
     */
    @JsonIgnore
    public Novedad getNovedad() {
        return novedad;
    }

    /**
     * Gets the value of relation through role Causal
     */
    @JsonIgnore
    public Causal getCausal() {
        return causal;
    }

    /**
     * Gets the value of relation through role ProteccionDatos
     */
    @JsonIgnore
    public ProteccionDatos getProteccionDatos() {
        return proteccionDatos;
    }

    /**
     * Gets the value of relation through role TipoIdentContratante
     */
    @JsonIgnore
    public TipoIdentificacion getTipoIdentContratante() {
        return tipoIdentContratante;
    }

    /**
     * Gets the value of relation through role EstadoContrato
     */
    @JsonIgnore
    public EstadoContrato getEstadoContrato() {
        return estadoContrato;
    }

    /**
     * Gets the value of relation through role GrupoAsociado
     */
    @JsonIgnore
    public GrupoAsociado getGrupoAsociado() {
        return grupoAsociado;
    }

    /**
     * Gets the value of relation through role Periodicidad
     */
    @JsonIgnore
    public Periodicidad getPeriodicidad() {
        return periodicidad;
    }

    /**
     * Gets the value of relation through role Agente
     */
    @JsonIgnore
    public Funcionario getAgente() {
        return agente;
    }

    /**
     * Gets the value of relation through role PeriodicidadNueva
     */
    @JsonIgnore
    public Periodicidad getPeriodicidadNueva() {
        return periodicidadNueva;
    }

    /**
     * Gets the value of relation through role MotivoExcepcion
     */
    @JsonIgnore
    public MotivoExcepcionSolNov getMotivoExcepcion() {
        return motivoExcepcion;
    }

    /**
     * Gets the value of relation through role UsrAfiliacion
     */
    @JsonIgnore
    public Funcionario getUsrAfiliacion() {
        return usrAfiliacion;
    }

    /**
     * Gets the value of relation through role Firma
     */
    @JsonIgnore
    public Firma getFirma() {
        return firma;
    }

    /**
     * Default constructor
     */
    public SolicitudNovedad() {
        solicitudNovedadId = null;
    }

    /**
     * Constructor used to create instances of <code>SolicitudNovedad</code>.
     * @param oid Object Identifier of the instance of <code>SolicitudNovedad</code> to be created.
     * @throws SystemException
     */
    public SolicitudNovedad(SolicitudNovedadOid oid) {
        if (oid != null && !oid.isNull()) {
            solicitudNovedadId = oid.getSolicitudNovedadId();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return SolicitudNovedad.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        SolicitudNovedad other = (SolicitudNovedad)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getSolicitudNovedadId(), other.getSolicitudNovedadId());
        result &= Utilities.isEqual(this.getSolicitudNovedadNumRadicado(), other.getSolicitudNovedadNumRadicado());
        result &= Utilities.isEqual(this.getSolicitudNovedadFechaCreacion(), other.getSolicitudNovedadFechaCreacion());
        result &= Utilities.isEqual(this.getSolicitudNovedadFechaVigencia(), other.getSolicitudNovedadFechaVigencia());
        result &= Utilities.isEqual(this.getSolicitudNovedadNumContrato(), other.getSolicitudNovedadNumContrato());
        result &= Utilities.isEqual(this.getSolicitudNovedadExcepcion(), other.getSolicitudNovedadExcepcion());
        result &= Utilities.isEqual(this.getSolicitudNovedadFechaIniExcepcion(), other.getSolicitudNovedadFechaIniExcepcion());
        result &= Utilities.isEqual(this.getSolicitudNovedadFechaFinExcepcion(), other.getSolicitudNovedadFechaFinExcepcion());
        result &= Utilities.isEqual(this.getSolicitudNovedadCtrCodigoTarifa(), other.getSolicitudNovedadCtrCodigoTarifa());
        result &= Utilities.isEqual(this.getSolicitudNovedadCtrDescTarifa(), other.getSolicitudNovedadCtrDescTarifa());
        result &= Utilities.isEqual(this.getSolicitudNovedadCtrCodigoConvenio(), other.getSolicitudNovedadCtrCodigoConvenio());
        result &= Utilities.isEqual(this.getSolicitudNovedadCtrDescConvenio(), other.getSolicitudNovedadCtrDescConvenio());
        result &= Utilities.isEqual(this.getSolicitudNovedadCtrEsColectivo(), other.getSolicitudNovedadCtrEsColectivo());
        result &= Utilities.isEqual(this.getSolicitudNovedadCtrTagCausaExclusion(), other.getSolicitudNovedadCtrTagCausaExclusion());
        result &= Utilities.isEqual(this.getSolicitudNovedadContraNumIden(), other.getSolicitudNovedadContraNumIden());
        result &= Utilities.isEqual(this.getSolicitudNovedadContraPrimerNombre(), other.getSolicitudNovedadContraPrimerNombre());
        result &= Utilities.isEqual(this.getSolicitudNovedadContraSegundoNombre(), other.getSolicitudNovedadContraSegundoNombre());
        result &= Utilities.isEqual(this.getSolicitudNovedadContraPrimerApellido(), other.getSolicitudNovedadContraPrimerApellido());
        result &= Utilities.isEqual(this.getSolicitudNovedadContraSegundoApellido(), other.getSolicitudNovedadContraSegundoApellido());
        result &= Utilities.isEqual(this.getSolicitudNovedadContraRazonSocial(), other.getSolicitudNovedadContraRazonSocial());
        result &= Utilities.isEqual(this.getSolicitudNovedadFechaUltimoDoc(), other.getSolicitudNovedadFechaUltimoDoc());
        result &= Utilities.isEqual(this.getSolicitudNovedadObservacions(), other.getSolicitudNovedadObservacions());
        result &= Utilities.isEqual(this.getSolicitudNovedadEstado(), other.getSolicitudNovedadEstado());
        result &= Utilities.isEqual(this.getSolicitudNovedadEstadoDocumentacion(), other.getSolicitudNovedadEstadoDocumentacion());
        result &= Utilities.isEqual(this.getSolicitudNovedadCompletada(), other.getSolicitudNovedadCompletada());
        result &= Utilities.isEqual(this.getSolicitudNovedadFechaCompletada(), other.getSolicitudNovedadFechaCompletada());
        result &= Utilities.isEqual(this.getSolicitudNovedadCtrActivo(), other.getSolicitudNovedadCtrActivo());
        result &= Utilities.isEqual(this.getSolicitudNovedadCtrTipoContrato(), other.getSolicitudNovedadCtrTipoContrato());
        result &= Utilities.isEqual(this.getSolicitudNovedadSCNumMeses(), other.getSolicitudNovedadSCNumMeses());
        result &= Utilities.isEqual(this.getSolicitudNovedadContraNuevaRazonSocial(), other.getSolicitudNovedadContraNuevaRazonSocial());
        result &= Utilities.isEqual(this.getSolicitudNovedadContraTipoPersona(), other.getSolicitudNovedadContraTipoPersona());
        result &= Utilities.isEqual(this.getSolicitudNovedadCtrFInicioContrato(), other.getSolicitudNovedadCtrFInicioContrato());
        result &= Utilities.isEqual(this.getSolicitudNovedadDrvExigeContratoActivo(), other.getSolicitudNovedadDrvExigeContratoActivo());
        result &= Utilities.isEqual(this.getSolicitudNovedadDrvExigeFamiliaActiva(), other.getSolicitudNovedadDrvExigeFamiliaActiva());
        result &= Utilities.isEqual(this.getSolicitudNovedadContraDrvNombreCompleto(), other.getSolicitudNovedadContraDrvNombreCompleto());
        result &= Utilities.isEqual(this.getSolicitudNovedadDrvTarifa(), other.getSolicitudNovedadDrvTarifa());
        result &= Utilities.isEqual(this.getSolicitudNovedadDrvConvenio(), other.getSolicitudNovedadDrvConvenio());
        result &= Utilities.isEqual(this.getSolicitudNovedadContraDrvIdentificacion(), other.getSolicitudNovedadContraDrvIdentificacion());
        result &= Utilities.isEqual(this.getSolicitudNovedadDrvGrupoAsociado(), other.getSolicitudNovedadDrvGrupoAsociado());
        result &= Utilities.isEqual(this.getSolicitudNovedadDrvPeriodicidad(), other.getSolicitudNovedadDrvPeriodicidad());
        result &= Utilities.isEqual(this.getSolicitudNovedadDrvPermiteAddFam(), other.getSolicitudNovedadDrvPermiteAddFam());
        result &= Utilities.isEqual(this.getSolicitudNovedadDrvPermiteDelFam(), other.getSolicitudNovedadDrvPermiteDelFam());
        result &= Utilities.isEqual(this.getSolicitudNovedadDrvExigeDocSolicitud(), other.getSolicitudNovedadDrvExigeDocSolicitud());
        result &= Utilities.isEqual(this.getSolicitudNovedadDrvExigeDocPersona(), other.getSolicitudNovedadDrvExigeDocPersona());
        result &= Utilities.isEqual(this.getSolicitudNovedadDrvReportColOscuro(), other.getSolicitudNovedadDrvReportColOscuro());
        result &= Utilities.isEqual(this.getSolicitudNovedadDrvReportColClaro(), other.getSolicitudNovedadDrvReportColClaro());
        result &= Utilities.isEqual(this.getSolicitudNovedadDrvReportLogo(), other.getSolicitudNovedadDrvReportLogo());
        result &= Utilities.isEqual(this.getSolicitudNovedadDrvNuevaPeriodicidad(), other.getSolicitudNovedadDrvNuevaPeriodicidad());
        result &= Utilities.isEqual(this.getSolicitudNovedadPrioridad(), other.getSolicitudNovedadPrioridad());
        result &= Utilities.isEqual(this.getSolicitudNovedadFechaTerminada(), other.getSolicitudNovedadFechaTerminada());
        result &= Utilities.isEqual(this.getSolicitudNovedadFechaFUG(), other.getSolicitudNovedadFechaFUG());
        result &= Utilities.isEqual(this.getSolicitudNovedadFechaFA(), other.getSolicitudNovedadFechaFA());
        result &= Utilities.isEqual(this.getSolicitudNovedadSemaforoGrabAse(), other.getSolicitudNovedadSemaforoGrabAse());
        result &= Utilities.isEqual(this.getSolicitudNovedaddrvSemaforoGrabAse(), other.getSolicitudNovedaddrvSemaforoGrabAse());
        result &= Utilities.isEqual(this.getSolicitudNovedadDrvNumRadicadoStr(), other.getSolicitudNovedadDrvNumRadicadoStr());
        result &= Utilities.isEqual(this.getSolicitudNovedadDrvValidarPS1(), other.getSolicitudNovedadDrvValidarPS1());
        result &= Utilities.isEqual(this.getSolicitudNovedadDrvValidarPS2(), other.getSolicitudNovedadDrvValidarPS2());
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
     * Returns the <code>SolicitudNovedadOid</code> object that identifies this instance of <code>SolicitudNovedad</code>.
     * @return <code>SolicitudNovedadOid</code> object that identifies this instance of <code>SolicitudNovedad</code>
     */
	@Override
    public SolicitudNovedadOid getOid() {
        return new SolicitudNovedadOid(getSolicitudNovedadId());
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
        if (!activeFacets.contains(Constants.SOLICITUDNOVEDAD)) {
            activeFacets.add(Constants.SOLICITUDNOVEDAD);
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
            relatedInstance = buildSolicitudNovedadRelatedInstance(relatedInstanceJsonOid);
        }
        if (SolicitudNovedadConstants.ROLE_NAME_FAMILIAS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudNovedadRelatedInstance4FamiliaNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudNovedadConstants.ROLE_NAME_DOCUMENTOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudNovedadRelatedInstance4DocumentoNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudNovedadConstants.ROLE_NAME_LOGESTADOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudNovedadRelatedInstance4LogEstadoSN(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudNovedadConstants.ROLE_NAME_LOGUSRSOLNOV.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudNovedadRelatedInstance4LogUsrSolNov(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudNovedadConstants.ROLE_NAME_PLANT.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudNovedadRelatedInstance4Planes(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudNovedadConstants.ROLE_NAME_NOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudNovedadRelatedInstance4Novedad(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudNovedadConstants.ROLE_NAME_CAUSAL.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudNovedadRelatedInstance4Causal(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudNovedadConstants.ROLE_NAME_PROTECCIONDATOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudNovedadRelatedInstance4ProteccionDatos(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudNovedadConstants.ROLE_NAME_TIPOIDENTCONTRATANTE.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudNovedadRelatedInstance4TipoIdentificacion(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudNovedadConstants.ROLE_NAME_ESTADOCONTRATO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudNovedadRelatedInstance4EstadoContrato(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudNovedadConstants.ROLE_NAME_GRUPOASOCIADO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudNovedadRelatedInstance4GrupoAsociado(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudNovedadConstants.ROLE_NAME_PERIODICIDAD.equalsIgnoreCase(relatedInstancePathFirstItem) || SolicitudNovedadConstants.ROLE_NAME_PERIODICIDADNUEVA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudNovedadRelatedInstance4Periodicidad(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudNovedadConstants.ROLE_NAME_AGENTE.equalsIgnoreCase(relatedInstancePathFirstItem) || SolicitudNovedadConstants.ROLE_NAME_USRAFILIACION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudNovedadRelatedInstance4Funcionario(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudNovedadConstants.ROLE_NAME_MOTIVOEXCEPCION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudNovedadRelatedInstance4MotivoExcepcionSolNov(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudNovedadConstants.ROLE_NAME_FIRMA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudNovedadRelatedInstance4Firma(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildSolicitudNovedadRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new SolicitudNovedad(mapper.readValue(relatedInstanceJsonOid, SolicitudNovedadOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(SolicitudNovedad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudNovedadRelatedInstance4FamiliaNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new FamiliaNovedad(mapper.readValue(relatedInstanceJsonOid, FamiliaNovedadOid.class)): FamiliaNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(SolicitudNovedad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudNovedadRelatedInstance4DocumentoNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new DocumentoNovedad(mapper.readValue(relatedInstanceJsonOid, DocumentoNovedadOid.class)): DocumentoNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(SolicitudNovedad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudNovedadRelatedInstance4LogEstadoSN(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new LogEstadoSN(mapper.readValue(relatedInstanceJsonOid, LogEstadoSNOid.class)): LogEstadoSN.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(SolicitudNovedad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudNovedadRelatedInstance4LogUsrSolNov(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new LogUsrSolNov(mapper.readValue(relatedInstanceJsonOid, LogUsrSolNovOid.class)): LogUsrSolNov.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(SolicitudNovedad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudNovedadRelatedInstance4Planes(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Planes(mapper.readValue(relatedInstanceJsonOid, PlanesOid.class)): Planes.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(SolicitudNovedad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudNovedadRelatedInstance4Novedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Novedad(mapper.readValue(relatedInstanceJsonOid, NovedadOid.class)): Novedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(SolicitudNovedad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudNovedadRelatedInstance4Causal(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Causal(mapper.readValue(relatedInstanceJsonOid, CausalOid.class)): Causal.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(SolicitudNovedad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudNovedadRelatedInstance4ProteccionDatos(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ProteccionDatos(mapper.readValue(relatedInstanceJsonOid, ProteccionDatosOid.class)): ProteccionDatos.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(SolicitudNovedad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudNovedadRelatedInstance4TipoIdentificacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TipoIdentificacion(mapper.readValue(relatedInstanceJsonOid, TipoIdentificacionOid.class)): TipoIdentificacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(SolicitudNovedad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudNovedadRelatedInstance4EstadoContrato(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new EstadoContrato(mapper.readValue(relatedInstanceJsonOid, EstadoContratoOid.class)): EstadoContrato.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(SolicitudNovedad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudNovedadRelatedInstance4GrupoAsociado(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new GrupoAsociado(mapper.readValue(relatedInstanceJsonOid, GrupoAsociadoOid.class)): GrupoAsociado.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(SolicitudNovedad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudNovedadRelatedInstance4Periodicidad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Periodicidad(mapper.readValue(relatedInstanceJsonOid, PeriodicidadOid.class)): Periodicidad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(SolicitudNovedad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudNovedadRelatedInstance4Funcionario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Funcionario(mapper.readValue(relatedInstanceJsonOid, FuncionarioOid.class)): Funcionario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(SolicitudNovedad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudNovedadRelatedInstance4MotivoExcepcionSolNov(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new MotivoExcepcionSolNov(mapper.readValue(relatedInstanceJsonOid, MotivoExcepcionSolNovOid.class)): MotivoExcepcionSolNov.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(SolicitudNovedad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudNovedadRelatedInstance4Firma(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Firma(mapper.readValue(relatedInstanceJsonOid, FirmaOid.class)): Firma.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(SolicitudNovedad.class).error(e.getMessage());
            return null;
        }
    }
}
