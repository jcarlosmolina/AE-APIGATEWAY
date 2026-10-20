package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.SolicitudConstants;
import com.keralty.ae.persistence.oid.AesolicitudesOid;
import com.keralty.ae.persistence.oid.AreaMedicaOid;
import com.keralty.ae.persistence.oid.ContratanteOid;
import com.keralty.ae.persistence.oid.ContratoCOid;
import com.keralty.ae.persistence.oid.DireccionOid;
import com.keralty.ae.persistence.oid.DocumentoGOid;
import com.keralty.ae.persistence.oid.ErrorWSOid;
import com.keralty.ae.persistence.oid.FirmaOid;
import com.keralty.ae.persistence.oid.FormaPagoOid;
import com.keralty.ae.persistence.oid.FuncionarioOid;
import com.keralty.ae.persistence.oid.GrupoAsociadoOid;
import com.keralty.ae.persistence.oid.LogAsignacionesOid;
import com.keralty.ae.persistence.oid.LogEstadoOid;
import com.keralty.ae.persistence.oid.PeriodicidadOid;
import com.keralty.ae.persistence.oid.PersonaOid;
import com.keralty.ae.persistence.oid.ProteccionDatosOid;
import com.keralty.ae.persistence.oid.SolicitudOid;
import com.keralty.ae.persistence.oid.TipoFacturaOid;
import com.keralty.ae.persistence.oid.TitularOid;
import com.keralty.ae.persistence.oid.UsuarioOid;
import com.keralty.ae.persistence.oid.UsuarioRegOid;
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
 * Representation of the <code>Solicitud</code> external model class.
 * <p>
 * External Model Class: <code>Solicitud</code><br>
 */
public class Solicitud extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id_solicitud")
    private Long aesolicitudesidsolicitud;

    @JsonProperty(value="numradicado")
    private Long solicitudNumRadicado;

    @JsonProperty(value="tramite")
    private Long solicitudTramite;

    @JsonProperty(value="numcontrato")
    private String solicitudNumContrato;

    @JsonProperty(value="finiciocontrato")
    private Date solicitudFInicioContrato;

    @JsonProperty(value="estraslado")
    private Boolean solicitudEsTraslado;

    @JsonProperty(value="drvreqcuesmed")
    private Boolean solicituddrvReqCuesMed;

    @JsonProperty(value="tipocontrato")
    private Long solicitudtipoContrato;

    @JsonProperty(value="codigosucursalrad")
    private String solicitudcodigoSucursalRad;

    @JsonProperty(value="contratoconfirma")
    private Boolean solicitudcontratoConFirma;

    @JsonProperty(value="observacions")
    private String solicitudobservacions;

    @JsonProperty(value="exentoiva")
    private String solicitudexentoIVA;

    @JsonProperty(value="drvyatienecontratante")
    private Boolean solicituddrvYaTieneContratante;

    @JsonProperty(value="drvtitularconbeneficios")
    private Boolean solicituddrvTitularConBeneficios;

    @JsonProperty(value="valorcuota")
    private Double solicitudvalorCuota;

    @JsonProperty(value="valordtocomercialsim")
    private Double solicitudvalorDtoComercialSim;

    @JsonProperty(value="valorcuotainscrip")
    private Double solicitudValorCuotaInscrip;

    @JsonProperty(value="drvsubtotal")
    private Double solicituddrvSubtotal;

    @JsonProperty(value="valordtofinanciero")
    private Double solicitudValorDtoFinanciero;

    @JsonProperty(value="valordtocomercial")
    private Double solicitudValorDtoComercial;

    @JsonProperty(value="drvbasegrabable")
    private Double solicituddrvBaseGrabable;

    @JsonProperty(value="drvporceniva")
    private Double solicituddrvPorcenIVA;

    @JsonProperty(value="drviva")
    private Double solicituddrvIVA;

    @JsonProperty(value="drvtotal")
    private Double solicituddrvTotal;

    @JsonProperty(value="datospagook")
    private Boolean solicituddatosPagoOK;

    @JsonProperty(value="valorcuotaperiodoc")
    private Double solicitudvalorCuotaPeriodoC;

    @JsonProperty(value="descuentocomercialc")
    private Double solicituddescuentoComercialC;

    @JsonProperty(value="ivac")
    private Double solicitudIVAC;

    @JsonProperty(value="descuentofinancieroc")
    private Double solicituddescuentoFinancieroC;

    @JsonProperty(value="tienedifliquidacion")
    private Boolean solicitudTieneDifLiquidacion;

    @JsonProperty(value="usuariosvalidados")
    private Boolean solicitudUsuariosValidados;

    @JsonProperty(value="drvcuesmedok")
    private Boolean solicituddrvCuesMedOK;

    @JsonProperty(value="numcontratoinclusion")
    private String solicitudNumContratoInclusion;

    @JsonProperty(value="numfamilia")
    private String solicitudNumFamilia;

    @JsonProperty(value="drvyatienetitular")
    private Boolean solicituddrvYaTieneTitular;

    @JsonProperty(value="drvdifvalorcuota")
    private Double solicituddrvDifValorCuota;

    @JsonProperty(value="drvdifvalordtofinanciero")
    private Double solicituddrvDifValorDtoFinanciero;

    @JsonProperty(value="drvdifvaloriva")
    private Double solicituddrvDifValorIVA;

    @JsonProperty(value="drvhaypreexistencias")
    private Boolean solicituddrvHayPreexistencias;

    @JsonProperty(value="drvcontratolegalizado")
    private Boolean solicituddrvContratoLegalizado;

    @JsonProperty(value="drvtienesegundafirma")
    private Boolean solicituddrvTieneSegundaFirma;

    @JsonProperty(value="drvgrupoasociado")
    private String solicituddrvGrupoAsociado;

    @JsonProperty(value="drvaplicadoccontrato")
    private Boolean solicituddrvAplicaDocContrato;

    @JsonProperty(value="drvaplicadoccartapree")
    private Boolean solicituddrvAplicaDocCartaPree;

    @JsonProperty(value="drvaplicadocbbgestante")
    private Boolean solicituddrvAplicaDocBBGestante;

    @JsonProperty(value="drvaplicadocmaternidad")
    private Boolean solicituddrvAplicaDocMaternidad;

    @JsonProperty(value="drvaplicacuestionario")
    private Boolean solicituddrvAplicaCuestionario;

    @JsonProperty(value="drvaplicacartaent")
    private Boolean solicituddrvAplicaCartaEnt;

    @JsonProperty(value="emailurlpagoenviado")
    private String solicitudEmailURLPagoEnviado;

    @JsonProperty(value="emaildocuenviado")
    private String solicitudEmailDocuEnviado;

    @JsonProperty(value="docsenviados")
    private Boolean solicitudDocsEnviados;

    @JsonProperty(value="drvtotalconanexos")
    private Double solicituddrvTotalConAnexos;

    @JsonProperty(value="drvcontratanteestitular")
    private Boolean solicituddrvContratanteEsTitular;

    @JsonProperty(value="drvalgunbeneficiarioepssanitas")
    private Boolean solicituddrvAlgunBeneficiarioEPSSanitas;

    @JsonProperty(value="coddirector")
    private String solicitudcodDirector;

    @JsonProperty(value="drvlistaerrores")
    private String solicituddrvListaErrores;

    @JsonProperty(value="valorcuotabrutac")
    private Double solicitudvalorCuotaBrutaC;

    @JsonProperty(value="drvdifvalorcuotabruta")
    private Double solicituddrvDifValorCuotaBruta;

    @JsonProperty(value="drvnumtitulares")
    private Long solicituddrvNumTitulares;

    @JsonProperty(value="drvenviaremaildoc")
    private Boolean solicituddrvEnviarEmailDoc;

    @JsonProperty(value="drvaplicadocneonatal")
    private Boolean solicituddrvAplicaDocNeonatal;

    @JsonProperty(value="codtarifa")
    private String solicitudCodTarifa;

    @JsonProperty(value="drvaplicacarnets")
    private Boolean solicituddrvAplicaCarnets;

    @JsonProperty(value="drvaplicadocsolicitud")
    private Boolean solicituddrvAplicaDocSolicitud;

    @JsonProperty(value="drvpuedereplicar")
    private Boolean solicituddrvPuedeReplicar;

    @JsonProperty(value="completada")
    private Boolean solicitudCompletada;

    @JsonProperty(value="drvcambiarbenefcont")
    private Boolean solicituddrvCambiarBenefCont;

    @JsonProperty(value="estado")
    private Long solicitudEstado;

    @JsonProperty(value="drvedadtitular")
    private Long solicituddrvEdadTitular;

    @JsonProperty(value="drvgenerotitular")
    private String solicituddrvGeneroTitular;

    @JsonProperty(value="drvtienetitular")
    private Boolean solicituddrvTieneTitular;

    @JsonProperty(value="drvobservacionesreport")
    private String solicituddrvObservacionesReport;

    @JsonProperty(value="drvignorarpreexistencias")
    private Boolean solicituddrvIgnorarPreexistencias;

    @JsonProperty(value="drvtieneprimerafirma")
    private Boolean solicituddrvTienePrimeraFirma;

    @JsonProperty(value="drvnumcontrato")
    private String solicituddrvNumContrato;

    @JsonProperty(value="finivigcontinc")
    private Date solicitudFIniVigContInc;

    @JsonProperty(value="drvimptarifaplanvol")
    private Double solicituddrvImpTarifaPlanVol;

    @JsonProperty(value="drvaplicadocprotdatos")
    private Boolean solicituddrvAplicaDocProtDatos;

    @JsonProperty(value="porcentajeprorrateo")
    private Double solicitudPorcentajeProrrateo;

    @JsonProperty(value="drvpuedemodificargrupo")
    private Boolean solicituddrvPuedeModificarGrupo;

    @JsonProperty(value="grupodelcore")
    private Long solicitudGrupoDelCORE;

    @JsonProperty(value="tipofacturacore")
    private String solicitudTipoFacturaCORE;

    @JsonProperty(value="drvaplicapolizainternacional")
    private Boolean solicituddrvAplicaPolizaInternacional;

    @JsonProperty(value="drvpolizainternacional")
    private Boolean solicituddrvPolizaInternacional;

    @JsonProperty(value="drvpermiterechazados")
    private Boolean solicituddrvPermiteRechazados;

    @JsonProperty(value="drvalgunusuarioimc")
    private Boolean solicituddrvAlgunUsuarioIMC;

    @JsonProperty(value="drvfechaporceniva")
    private Date solicituddrvFechaPorcenIVA;

    @JsonProperty(value="resultsmsinfopago")
    private String solicitudResultSMSInfoPago;

    @JsonProperty(value="fechacompletada")
    private Timestamp solicitudFechaCompletada;

    @JsonProperty(value="fechaultimodoc")
    private Timestamp solicitudFechaUltimoDoc;

    @JsonProperty(value="prioridad")
    private Long solicitudPrioridad;

    @JsonProperty(value="fechaterminada")
    private Date solicitudFechaTerminada;

    @JsonProperty(value="fechafug")
    private Timestamp solicitudFechaFUG;

    @JsonProperty(value="fechafa")
    private Timestamp solicitudFechaFA;

    @JsonProperty(value="fechafaam")
    private Timestamp solicitudFechaFAAM;

    @JsonProperty(value="semaforograbase")
    private Double solicitudSemaforoGrabAse;

    @JsonProperty(value="semaforoareamed")
    private Double solicitudSemaforoAreaMed;

    @JsonProperty(value="estadodoc")
    private Long solicitudEstadoDoc;

    @JsonProperty(value="drvsemaforograbase")
    private Double solicituddrvSemaforoGrabAse;

    @JsonProperty(value="drvsemaforoareamed")
    private Double solicituddrvSemaforoAreaMed;

    @JsonProperty(value="drvestadohomologado")
    private Long solicitudDrvEstadoHomologado;

    @JsonProperty(value="drvvalidardatoscontratante")
    private Boolean solicituddrvValidarDatosContratante;

    @JsonProperty(value="enviocarnetfisico")
    private Boolean solicitudEnvioCarnetFisico;

    @JsonProperty(value="drvtramitarenlinea")
    private Boolean solicituddrvTramitarEnLinea;

    private Direccion direccion;

    private ProteccionDatos proteccionDatos;

    private Collection <Usuario> usuarios;

    private Contratante contratante;

    private Firma firma;

    private Firma segundaFirma;

    private Firma firmaContratanteIncl;

    private Collection <UsuarioReg> usuariosRegistrados;

    private Titular titular;

    private Collection <DocumentoG> documentosGestor;

    private Collection <ErrorWS> erroresWS;

    private Collection <LogEstado> logEstado;

    private Collection <LogAsignaciones> logAsignaciones;

    private Aesolicitudes aesolicitudes;

    private Persona contratantePersona;

    private Persona titularPersona;

    private GrupoAsociado grupoAsociado;

    private Funcionario agente;

    private FormaPago formaPago;

    private Periodicidad periodicidad;

    private ContratoC contratoC;

    private AreaMedica usrAreaMedica;

    private TipoFactura tipoFactura;

    private Funcionario usrAfiliacion;

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
     * Gets the value of attribute NumRadicado
     */
    public Long getSolicitudNumRadicado() {
        return solicitudNumRadicado;
    }
    
    /**
     * Sets the value of attribute NumRadicado
     */
    public void setSolicitudNumRadicado(Long solicitudNumRadicado) {
        this.solicitudNumRadicado = solicitudNumRadicado;
    }

    /**
     * Gets the value of attribute Tramite
     */
    public Long getSolicitudTramite() {
        return solicitudTramite;
    }
    
    /**
     * Sets the value of attribute Tramite
     */
    public void setSolicitudTramite(Long solicitudTramite) {
        this.solicitudTramite = solicitudTramite;
    }

    /**
     * Gets the value of attribute NumContrato
     */
    public String getSolicitudNumContrato() {
        return solicitudNumContrato;
    }
    
    /**
     * Sets the value of attribute NumContrato
     */
    public void setSolicitudNumContrato(String solicitudNumContrato) {
        this.solicitudNumContrato = solicitudNumContrato;
    }

    /**
     * Gets the value of attribute FInicioContrato
     */
    public Date getSolicitudFInicioContrato() {
        return solicitudFInicioContrato;
    }
    
    /**
     * Sets the value of attribute FInicioContrato
     */
    public void setSolicitudFInicioContrato(Date solicitudFInicioContrato) {
        this.solicitudFInicioContrato = solicitudFInicioContrato;
    }

    /**
     * Gets the value of attribute EsTraslado
     */
    public Boolean getSolicitudEsTraslado() {
        return solicitudEsTraslado;
    }
    
    /**
     * Sets the value of attribute EsTraslado
     */
    public void setSolicitudEsTraslado(Boolean solicitudEsTraslado) {
        this.solicitudEsTraslado = solicitudEsTraslado;
    }

    /**
     * Gets the value of attribute drvReqCuesMed
     */
    public Boolean getSolicituddrvReqCuesMed() {
        return solicituddrvReqCuesMed;
    }
    
    /**
     * Sets the value of attribute drvReqCuesMed
     */
    public void setSolicituddrvReqCuesMed(Boolean solicituddrvReqCuesMed) {
        this.solicituddrvReqCuesMed = solicituddrvReqCuesMed;
    }

    /**
     * Gets the value of attribute tipoContrato
     */
    public Long getSolicitudtipoContrato() {
        return solicitudtipoContrato;
    }
    
    /**
     * Sets the value of attribute tipoContrato
     */
    public void setSolicitudtipoContrato(Long solicitudtipoContrato) {
        this.solicitudtipoContrato = solicitudtipoContrato;
    }

    /**
     * Gets the value of attribute codigoSucursalRad
     */
    public String getSolicitudcodigoSucursalRad() {
        return solicitudcodigoSucursalRad;
    }
    
    /**
     * Sets the value of attribute codigoSucursalRad
     */
    public void setSolicitudcodigoSucursalRad(String solicitudcodigoSucursalRad) {
        this.solicitudcodigoSucursalRad = solicitudcodigoSucursalRad;
    }

    /**
     * Gets the value of attribute contratoConFirma
     */
    public Boolean getSolicitudcontratoConFirma() {
        return solicitudcontratoConFirma;
    }
    
    /**
     * Sets the value of attribute contratoConFirma
     */
    public void setSolicitudcontratoConFirma(Boolean solicitudcontratoConFirma) {
        this.solicitudcontratoConFirma = solicitudcontratoConFirma;
    }

    /**
     * Gets the value of attribute observacions
     */
    public String getSolicitudobservacions() {
        return solicitudobservacions;
    }
    
    /**
     * Sets the value of attribute observacions
     */
    public void setSolicitudobservacions(String solicitudobservacions) {
        this.solicitudobservacions = solicitudobservacions;
    }

    /**
     * Gets the value of attribute exentoIVA
     */
    public String getSolicitudexentoIVA() {
        return solicitudexentoIVA;
    }
    
    /**
     * Sets the value of attribute exentoIVA
     */
    public void setSolicitudexentoIVA(String solicitudexentoIVA) {
        this.solicitudexentoIVA = solicitudexentoIVA;
    }

    /**
     * Gets the value of attribute drvYaTieneContratante
     */
    public Boolean getSolicituddrvYaTieneContratante() {
        return solicituddrvYaTieneContratante;
    }
    
    /**
     * Sets the value of attribute drvYaTieneContratante
     */
    public void setSolicituddrvYaTieneContratante(Boolean solicituddrvYaTieneContratante) {
        this.solicituddrvYaTieneContratante = solicituddrvYaTieneContratante;
    }

    /**
     * Gets the value of attribute drvTitularConBeneficios
     */
    public Boolean getSolicituddrvTitularConBeneficios() {
        return solicituddrvTitularConBeneficios;
    }
    
    /**
     * Sets the value of attribute drvTitularConBeneficios
     */
    public void setSolicituddrvTitularConBeneficios(Boolean solicituddrvTitularConBeneficios) {
        this.solicituddrvTitularConBeneficios = solicituddrvTitularConBeneficios;
    }

    /**
     * Gets the value of attribute valorCuota
     */
    public Double getSolicitudvalorCuota() {
        return solicitudvalorCuota;
    }
    
    /**
     * Sets the value of attribute valorCuota
     */
    public void setSolicitudvalorCuota(Double solicitudvalorCuota) {
        this.solicitudvalorCuota = solicitudvalorCuota;
    }

    /**
     * Gets the value of attribute valorDtoComercialSim
     */
    public Double getSolicitudvalorDtoComercialSim() {
        return solicitudvalorDtoComercialSim;
    }
    
    /**
     * Sets the value of attribute valorDtoComercialSim
     */
    public void setSolicitudvalorDtoComercialSim(Double solicitudvalorDtoComercialSim) {
        this.solicitudvalorDtoComercialSim = solicitudvalorDtoComercialSim;
    }

    /**
     * Gets the value of attribute ValorCuotaInscrip
     */
    public Double getSolicitudValorCuotaInscrip() {
        return solicitudValorCuotaInscrip;
    }
    
    /**
     * Sets the value of attribute ValorCuotaInscrip
     */
    public void setSolicitudValorCuotaInscrip(Double solicitudValorCuotaInscrip) {
        this.solicitudValorCuotaInscrip = solicitudValorCuotaInscrip;
    }

    /**
     * Gets the value of attribute drvSubtotal
     */
    public Double getSolicituddrvSubtotal() {
        return solicituddrvSubtotal;
    }
    
    /**
     * Sets the value of attribute drvSubtotal
     */
    public void setSolicituddrvSubtotal(Double solicituddrvSubtotal) {
        this.solicituddrvSubtotal = solicituddrvSubtotal;
    }

    /**
     * Gets the value of attribute ValorDtoFinanciero
     */
    public Double getSolicitudValorDtoFinanciero() {
        return solicitudValorDtoFinanciero;
    }
    
    /**
     * Sets the value of attribute ValorDtoFinanciero
     */
    public void setSolicitudValorDtoFinanciero(Double solicitudValorDtoFinanciero) {
        this.solicitudValorDtoFinanciero = solicitudValorDtoFinanciero;
    }

    /**
     * Gets the value of attribute ValorDtoComercial
     */
    public Double getSolicitudValorDtoComercial() {
        return solicitudValorDtoComercial;
    }
    
    /**
     * Sets the value of attribute ValorDtoComercial
     */
    public void setSolicitudValorDtoComercial(Double solicitudValorDtoComercial) {
        this.solicitudValorDtoComercial = solicitudValorDtoComercial;
    }

    /**
     * Gets the value of attribute drvBaseGrabable
     */
    public Double getSolicituddrvBaseGrabable() {
        return solicituddrvBaseGrabable;
    }
    
    /**
     * Sets the value of attribute drvBaseGrabable
     */
    public void setSolicituddrvBaseGrabable(Double solicituddrvBaseGrabable) {
        this.solicituddrvBaseGrabable = solicituddrvBaseGrabable;
    }

    /**
     * Gets the value of attribute drvPorcenIVA
     */
    public Double getSolicituddrvPorcenIVA() {
        return solicituddrvPorcenIVA;
    }
    
    /**
     * Sets the value of attribute drvPorcenIVA
     */
    public void setSolicituddrvPorcenIVA(Double solicituddrvPorcenIVA) {
        this.solicituddrvPorcenIVA = solicituddrvPorcenIVA;
    }

    /**
     * Gets the value of attribute drvIVA
     */
    public Double getSolicituddrvIVA() {
        return solicituddrvIVA;
    }
    
    /**
     * Sets the value of attribute drvIVA
     */
    public void setSolicituddrvIVA(Double solicituddrvIVA) {
        this.solicituddrvIVA = solicituddrvIVA;
    }

    /**
     * Gets the value of attribute drvTotal
     */
    public Double getSolicituddrvTotal() {
        return solicituddrvTotal;
    }
    
    /**
     * Sets the value of attribute drvTotal
     */
    public void setSolicituddrvTotal(Double solicituddrvTotal) {
        this.solicituddrvTotal = solicituddrvTotal;
    }

    /**
     * Gets the value of attribute datosPagoOK
     */
    public Boolean getSolicituddatosPagoOK() {
        return solicituddatosPagoOK;
    }
    
    /**
     * Sets the value of attribute datosPagoOK
     */
    public void setSolicituddatosPagoOK(Boolean solicituddatosPagoOK) {
        this.solicituddatosPagoOK = solicituddatosPagoOK;
    }

    /**
     * Gets the value of attribute valorCuotaPeriodoC
     */
    public Double getSolicitudvalorCuotaPeriodoC() {
        return solicitudvalorCuotaPeriodoC;
    }
    
    /**
     * Sets the value of attribute valorCuotaPeriodoC
     */
    public void setSolicitudvalorCuotaPeriodoC(Double solicitudvalorCuotaPeriodoC) {
        this.solicitudvalorCuotaPeriodoC = solicitudvalorCuotaPeriodoC;
    }

    /**
     * Gets the value of attribute descuentoComercialC
     */
    public Double getSolicituddescuentoComercialC() {
        return solicituddescuentoComercialC;
    }
    
    /**
     * Sets the value of attribute descuentoComercialC
     */
    public void setSolicituddescuentoComercialC(Double solicituddescuentoComercialC) {
        this.solicituddescuentoComercialC = solicituddescuentoComercialC;
    }

    /**
     * Gets the value of attribute IVAC
     */
    public Double getSolicitudIVAC() {
        return solicitudIVAC;
    }
    
    /**
     * Sets the value of attribute IVAC
     */
    public void setSolicitudIVAC(Double solicitudIVAC) {
        this.solicitudIVAC = solicitudIVAC;
    }

    /**
     * Gets the value of attribute descuentoFinancieroC
     */
    public Double getSolicituddescuentoFinancieroC() {
        return solicituddescuentoFinancieroC;
    }
    
    /**
     * Sets the value of attribute descuentoFinancieroC
     */
    public void setSolicituddescuentoFinancieroC(Double solicituddescuentoFinancieroC) {
        this.solicituddescuentoFinancieroC = solicituddescuentoFinancieroC;
    }

    /**
     * Gets the value of attribute TieneDifLiquidacion
     */
    public Boolean getSolicitudTieneDifLiquidacion() {
        return solicitudTieneDifLiquidacion;
    }
    
    /**
     * Sets the value of attribute TieneDifLiquidacion
     */
    public void setSolicitudTieneDifLiquidacion(Boolean solicitudTieneDifLiquidacion) {
        this.solicitudTieneDifLiquidacion = solicitudTieneDifLiquidacion;
    }

    /**
     * Gets the value of attribute UsuariosValidados
     */
    public Boolean getSolicitudUsuariosValidados() {
        return solicitudUsuariosValidados;
    }
    
    /**
     * Sets the value of attribute UsuariosValidados
     */
    public void setSolicitudUsuariosValidados(Boolean solicitudUsuariosValidados) {
        this.solicitudUsuariosValidados = solicitudUsuariosValidados;
    }

    /**
     * Gets the value of attribute drvCuesMedOK
     */
    public Boolean getSolicituddrvCuesMedOK() {
        return solicituddrvCuesMedOK;
    }
    
    /**
     * Sets the value of attribute drvCuesMedOK
     */
    public void setSolicituddrvCuesMedOK(Boolean solicituddrvCuesMedOK) {
        this.solicituddrvCuesMedOK = solicituddrvCuesMedOK;
    }

    /**
     * Gets the value of attribute NumContratoInclusion
     */
    public String getSolicitudNumContratoInclusion() {
        return solicitudNumContratoInclusion;
    }
    
    /**
     * Sets the value of attribute NumContratoInclusion
     */
    public void setSolicitudNumContratoInclusion(String solicitudNumContratoInclusion) {
        this.solicitudNumContratoInclusion = solicitudNumContratoInclusion;
    }

    /**
     * Gets the value of attribute NumFamilia
     */
    public String getSolicitudNumFamilia() {
        return solicitudNumFamilia;
    }
    
    /**
     * Sets the value of attribute NumFamilia
     */
    public void setSolicitudNumFamilia(String solicitudNumFamilia) {
        this.solicitudNumFamilia = solicitudNumFamilia;
    }

    /**
     * Gets the value of attribute drvYaTieneTitular
     */
    public Boolean getSolicituddrvYaTieneTitular() {
        return solicituddrvYaTieneTitular;
    }
    
    /**
     * Sets the value of attribute drvYaTieneTitular
     */
    public void setSolicituddrvYaTieneTitular(Boolean solicituddrvYaTieneTitular) {
        this.solicituddrvYaTieneTitular = solicituddrvYaTieneTitular;
    }

    /**
     * Gets the value of attribute drvDifValorCuota
     */
    public Double getSolicituddrvDifValorCuota() {
        return solicituddrvDifValorCuota;
    }
    
    /**
     * Sets the value of attribute drvDifValorCuota
     */
    public void setSolicituddrvDifValorCuota(Double solicituddrvDifValorCuota) {
        this.solicituddrvDifValorCuota = solicituddrvDifValorCuota;
    }

    /**
     * Gets the value of attribute drvDifValorDtoFinanciero
     */
    public Double getSolicituddrvDifValorDtoFinanciero() {
        return solicituddrvDifValorDtoFinanciero;
    }
    
    /**
     * Sets the value of attribute drvDifValorDtoFinanciero
     */
    public void setSolicituddrvDifValorDtoFinanciero(Double solicituddrvDifValorDtoFinanciero) {
        this.solicituddrvDifValorDtoFinanciero = solicituddrvDifValorDtoFinanciero;
    }

    /**
     * Gets the value of attribute drvDifValorIVA
     */
    public Double getSolicituddrvDifValorIVA() {
        return solicituddrvDifValorIVA;
    }
    
    /**
     * Sets the value of attribute drvDifValorIVA
     */
    public void setSolicituddrvDifValorIVA(Double solicituddrvDifValorIVA) {
        this.solicituddrvDifValorIVA = solicituddrvDifValorIVA;
    }

    /**
     * Gets the value of attribute drvHayPreexistencias
     */
    public Boolean getSolicituddrvHayPreexistencias() {
        return solicituddrvHayPreexistencias;
    }
    
    /**
     * Sets the value of attribute drvHayPreexistencias
     */
    public void setSolicituddrvHayPreexistencias(Boolean solicituddrvHayPreexistencias) {
        this.solicituddrvHayPreexistencias = solicituddrvHayPreexistencias;
    }

    /**
     * Gets the value of attribute drvContratoLegalizado
     */
    public Boolean getSolicituddrvContratoLegalizado() {
        return solicituddrvContratoLegalizado;
    }
    
    /**
     * Sets the value of attribute drvContratoLegalizado
     */
    public void setSolicituddrvContratoLegalizado(Boolean solicituddrvContratoLegalizado) {
        this.solicituddrvContratoLegalizado = solicituddrvContratoLegalizado;
    }

    /**
     * Gets the value of attribute drvTieneSegundaFirma
     */
    public Boolean getSolicituddrvTieneSegundaFirma() {
        return solicituddrvTieneSegundaFirma;
    }
    
    /**
     * Sets the value of attribute drvTieneSegundaFirma
     */
    public void setSolicituddrvTieneSegundaFirma(Boolean solicituddrvTieneSegundaFirma) {
        this.solicituddrvTieneSegundaFirma = solicituddrvTieneSegundaFirma;
    }

    /**
     * Gets the value of attribute drvGrupoAsociado
     */
    public String getSolicituddrvGrupoAsociado() {
        return solicituddrvGrupoAsociado;
    }
    
    /**
     * Sets the value of attribute drvGrupoAsociado
     */
    public void setSolicituddrvGrupoAsociado(String solicituddrvGrupoAsociado) {
        this.solicituddrvGrupoAsociado = solicituddrvGrupoAsociado;
    }

    /**
     * Gets the value of attribute drvAplicaDocContrato
     */
    public Boolean getSolicituddrvAplicaDocContrato() {
        return solicituddrvAplicaDocContrato;
    }
    
    /**
     * Sets the value of attribute drvAplicaDocContrato
     */
    public void setSolicituddrvAplicaDocContrato(Boolean solicituddrvAplicaDocContrato) {
        this.solicituddrvAplicaDocContrato = solicituddrvAplicaDocContrato;
    }

    /**
     * Gets the value of attribute drvAplicaDocCartaPree
     */
    public Boolean getSolicituddrvAplicaDocCartaPree() {
        return solicituddrvAplicaDocCartaPree;
    }
    
    /**
     * Sets the value of attribute drvAplicaDocCartaPree
     */
    public void setSolicituddrvAplicaDocCartaPree(Boolean solicituddrvAplicaDocCartaPree) {
        this.solicituddrvAplicaDocCartaPree = solicituddrvAplicaDocCartaPree;
    }

    /**
     * Gets the value of attribute drvAplicaDocBBGestante
     */
    public Boolean getSolicituddrvAplicaDocBBGestante() {
        return solicituddrvAplicaDocBBGestante;
    }
    
    /**
     * Sets the value of attribute drvAplicaDocBBGestante
     */
    public void setSolicituddrvAplicaDocBBGestante(Boolean solicituddrvAplicaDocBBGestante) {
        this.solicituddrvAplicaDocBBGestante = solicituddrvAplicaDocBBGestante;
    }

    /**
     * Gets the value of attribute drvAplicaDocMaternidad
     */
    public Boolean getSolicituddrvAplicaDocMaternidad() {
        return solicituddrvAplicaDocMaternidad;
    }
    
    /**
     * Sets the value of attribute drvAplicaDocMaternidad
     */
    public void setSolicituddrvAplicaDocMaternidad(Boolean solicituddrvAplicaDocMaternidad) {
        this.solicituddrvAplicaDocMaternidad = solicituddrvAplicaDocMaternidad;
    }

    /**
     * Gets the value of attribute drvAplicaCuestionario
     */
    public Boolean getSolicituddrvAplicaCuestionario() {
        return solicituddrvAplicaCuestionario;
    }
    
    /**
     * Sets the value of attribute drvAplicaCuestionario
     */
    public void setSolicituddrvAplicaCuestionario(Boolean solicituddrvAplicaCuestionario) {
        this.solicituddrvAplicaCuestionario = solicituddrvAplicaCuestionario;
    }

    /**
     * Gets the value of attribute drvAplicaCartaEnt
     */
    public Boolean getSolicituddrvAplicaCartaEnt() {
        return solicituddrvAplicaCartaEnt;
    }
    
    /**
     * Sets the value of attribute drvAplicaCartaEnt
     */
    public void setSolicituddrvAplicaCartaEnt(Boolean solicituddrvAplicaCartaEnt) {
        this.solicituddrvAplicaCartaEnt = solicituddrvAplicaCartaEnt;
    }

    /**
     * Gets the value of attribute EmailURLPagoEnviado
     */
    public String getSolicitudEmailURLPagoEnviado() {
        return solicitudEmailURLPagoEnviado;
    }
    
    /**
     * Sets the value of attribute EmailURLPagoEnviado
     */
    public void setSolicitudEmailURLPagoEnviado(String solicitudEmailURLPagoEnviado) {
        this.solicitudEmailURLPagoEnviado = solicitudEmailURLPagoEnviado;
    }

    /**
     * Gets the value of attribute EmailDocuEnviado
     */
    public String getSolicitudEmailDocuEnviado() {
        return solicitudEmailDocuEnviado;
    }
    
    /**
     * Sets the value of attribute EmailDocuEnviado
     */
    public void setSolicitudEmailDocuEnviado(String solicitudEmailDocuEnviado) {
        this.solicitudEmailDocuEnviado = solicitudEmailDocuEnviado;
    }

    /**
     * Gets the value of attribute DocsEnviados
     */
    public Boolean getSolicitudDocsEnviados() {
        return solicitudDocsEnviados;
    }
    
    /**
     * Sets the value of attribute DocsEnviados
     */
    public void setSolicitudDocsEnviados(Boolean solicitudDocsEnviados) {
        this.solicitudDocsEnviados = solicitudDocsEnviados;
    }

    /**
     * Gets the value of attribute drvTotalConAnexos
     */
    public Double getSolicituddrvTotalConAnexos() {
        return solicituddrvTotalConAnexos;
    }
    
    /**
     * Sets the value of attribute drvTotalConAnexos
     */
    public void setSolicituddrvTotalConAnexos(Double solicituddrvTotalConAnexos) {
        this.solicituddrvTotalConAnexos = solicituddrvTotalConAnexos;
    }

    /**
     * Gets the value of attribute drvContratanteEsTitular
     */
    public Boolean getSolicituddrvContratanteEsTitular() {
        return solicituddrvContratanteEsTitular;
    }
    
    /**
     * Sets the value of attribute drvContratanteEsTitular
     */
    public void setSolicituddrvContratanteEsTitular(Boolean solicituddrvContratanteEsTitular) {
        this.solicituddrvContratanteEsTitular = solicituddrvContratanteEsTitular;
    }

    /**
     * Gets the value of attribute drvAlgunBeneficiarioEPSSanitas
     */
    public Boolean getSolicituddrvAlgunBeneficiarioEPSSanitas() {
        return solicituddrvAlgunBeneficiarioEPSSanitas;
    }
    
    /**
     * Sets the value of attribute drvAlgunBeneficiarioEPSSanitas
     */
    public void setSolicituddrvAlgunBeneficiarioEPSSanitas(Boolean solicituddrvAlgunBeneficiarioEPSSanitas) {
        this.solicituddrvAlgunBeneficiarioEPSSanitas = solicituddrvAlgunBeneficiarioEPSSanitas;
    }

    /**
     * Gets the value of attribute codDirector
     */
    public String getSolicitudcodDirector() {
        return solicitudcodDirector;
    }
    
    /**
     * Sets the value of attribute codDirector
     */
    public void setSolicitudcodDirector(String solicitudcodDirector) {
        this.solicitudcodDirector = solicitudcodDirector;
    }

    /**
     * Gets the value of attribute drvListaErrores
     */
    public String getSolicituddrvListaErrores() {
        return solicituddrvListaErrores;
    }
    
    /**
     * Sets the value of attribute drvListaErrores
     */
    public void setSolicituddrvListaErrores(String solicituddrvListaErrores) {
        this.solicituddrvListaErrores = solicituddrvListaErrores;
    }

    /**
     * Gets the value of attribute valorCuotaBrutaC
     */
    public Double getSolicitudvalorCuotaBrutaC() {
        return solicitudvalorCuotaBrutaC;
    }
    
    /**
     * Sets the value of attribute valorCuotaBrutaC
     */
    public void setSolicitudvalorCuotaBrutaC(Double solicitudvalorCuotaBrutaC) {
        this.solicitudvalorCuotaBrutaC = solicitudvalorCuotaBrutaC;
    }

    /**
     * Gets the value of attribute drvDifValorCuotaBruta
     */
    public Double getSolicituddrvDifValorCuotaBruta() {
        return solicituddrvDifValorCuotaBruta;
    }
    
    /**
     * Sets the value of attribute drvDifValorCuotaBruta
     */
    public void setSolicituddrvDifValorCuotaBruta(Double solicituddrvDifValorCuotaBruta) {
        this.solicituddrvDifValorCuotaBruta = solicituddrvDifValorCuotaBruta;
    }

    /**
     * Gets the value of attribute drvNumTitulares
     */
    public Long getSolicituddrvNumTitulares() {
        return solicituddrvNumTitulares;
    }
    
    /**
     * Sets the value of attribute drvNumTitulares
     */
    public void setSolicituddrvNumTitulares(Long solicituddrvNumTitulares) {
        this.solicituddrvNumTitulares = solicituddrvNumTitulares;
    }

    /**
     * Gets the value of attribute drvEnviarEmailDoc
     */
    public Boolean getSolicituddrvEnviarEmailDoc() {
        return solicituddrvEnviarEmailDoc;
    }
    
    /**
     * Sets the value of attribute drvEnviarEmailDoc
     */
    public void setSolicituddrvEnviarEmailDoc(Boolean solicituddrvEnviarEmailDoc) {
        this.solicituddrvEnviarEmailDoc = solicituddrvEnviarEmailDoc;
    }

    /**
     * Gets the value of attribute drvAplicaDocNeonatal
     */
    public Boolean getSolicituddrvAplicaDocNeonatal() {
        return solicituddrvAplicaDocNeonatal;
    }
    
    /**
     * Sets the value of attribute drvAplicaDocNeonatal
     */
    public void setSolicituddrvAplicaDocNeonatal(Boolean solicituddrvAplicaDocNeonatal) {
        this.solicituddrvAplicaDocNeonatal = solicituddrvAplicaDocNeonatal;
    }

    /**
     * Gets the value of attribute CodTarifa
     */
    public String getSolicitudCodTarifa() {
        return solicitudCodTarifa;
    }
    
    /**
     * Sets the value of attribute CodTarifa
     */
    public void setSolicitudCodTarifa(String solicitudCodTarifa) {
        this.solicitudCodTarifa = solicitudCodTarifa;
    }

    /**
     * Gets the value of attribute drvAplicaCarnets
     */
    public Boolean getSolicituddrvAplicaCarnets() {
        return solicituddrvAplicaCarnets;
    }
    
    /**
     * Sets the value of attribute drvAplicaCarnets
     */
    public void setSolicituddrvAplicaCarnets(Boolean solicituddrvAplicaCarnets) {
        this.solicituddrvAplicaCarnets = solicituddrvAplicaCarnets;
    }

    /**
     * Gets the value of attribute drvAplicaDocSolicitud
     */
    public Boolean getSolicituddrvAplicaDocSolicitud() {
        return solicituddrvAplicaDocSolicitud;
    }
    
    /**
     * Sets the value of attribute drvAplicaDocSolicitud
     */
    public void setSolicituddrvAplicaDocSolicitud(Boolean solicituddrvAplicaDocSolicitud) {
        this.solicituddrvAplicaDocSolicitud = solicituddrvAplicaDocSolicitud;
    }

    /**
     * Gets the value of attribute drvPuedeReplicar
     */
    public Boolean getSolicituddrvPuedeReplicar() {
        return solicituddrvPuedeReplicar;
    }
    
    /**
     * Sets the value of attribute drvPuedeReplicar
     */
    public void setSolicituddrvPuedeReplicar(Boolean solicituddrvPuedeReplicar) {
        this.solicituddrvPuedeReplicar = solicituddrvPuedeReplicar;
    }

    /**
     * Gets the value of attribute Completada
     */
    public Boolean getSolicitudCompletada() {
        return solicitudCompletada;
    }
    
    /**
     * Sets the value of attribute Completada
     */
    public void setSolicitudCompletada(Boolean solicitudCompletada) {
        this.solicitudCompletada = solicitudCompletada;
    }

    /**
     * Gets the value of attribute drvCambiarBenefCont
     */
    public Boolean getSolicituddrvCambiarBenefCont() {
        return solicituddrvCambiarBenefCont;
    }
    
    /**
     * Sets the value of attribute drvCambiarBenefCont
     */
    public void setSolicituddrvCambiarBenefCont(Boolean solicituddrvCambiarBenefCont) {
        this.solicituddrvCambiarBenefCont = solicituddrvCambiarBenefCont;
    }

    /**
     * Gets the value of attribute Estado
     */
    public Long getSolicitudEstado() {
        return solicitudEstado;
    }
    
    /**
     * Sets the value of attribute Estado
     */
    public void setSolicitudEstado(Long solicitudEstado) {
        this.solicitudEstado = solicitudEstado;
    }

    /**
     * Gets the value of attribute drvEdadTitular
     */
    public Long getSolicituddrvEdadTitular() {
        return solicituddrvEdadTitular;
    }
    
    /**
     * Sets the value of attribute drvEdadTitular
     */
    public void setSolicituddrvEdadTitular(Long solicituddrvEdadTitular) {
        this.solicituddrvEdadTitular = solicituddrvEdadTitular;
    }

    /**
     * Gets the value of attribute drvGeneroTitular
     */
    public String getSolicituddrvGeneroTitular() {
        return solicituddrvGeneroTitular;
    }
    
    /**
     * Sets the value of attribute drvGeneroTitular
     */
    public void setSolicituddrvGeneroTitular(String solicituddrvGeneroTitular) {
        this.solicituddrvGeneroTitular = solicituddrvGeneroTitular;
    }

    /**
     * Gets the value of attribute drvTieneTitular
     */
    public Boolean getSolicituddrvTieneTitular() {
        return solicituddrvTieneTitular;
    }
    
    /**
     * Sets the value of attribute drvTieneTitular
     */
    public void setSolicituddrvTieneTitular(Boolean solicituddrvTieneTitular) {
        this.solicituddrvTieneTitular = solicituddrvTieneTitular;
    }

    /**
     * Gets the value of attribute drvObservacionesReport
     */
    public String getSolicituddrvObservacionesReport() {
        return solicituddrvObservacionesReport;
    }
    
    /**
     * Sets the value of attribute drvObservacionesReport
     */
    public void setSolicituddrvObservacionesReport(String solicituddrvObservacionesReport) {
        this.solicituddrvObservacionesReport = solicituddrvObservacionesReport;
    }

    /**
     * Gets the value of attribute drvIgnorarPreexistencias
     */
    public Boolean getSolicituddrvIgnorarPreexistencias() {
        return solicituddrvIgnorarPreexistencias;
    }
    
    /**
     * Sets the value of attribute drvIgnorarPreexistencias
     */
    public void setSolicituddrvIgnorarPreexistencias(Boolean solicituddrvIgnorarPreexistencias) {
        this.solicituddrvIgnorarPreexistencias = solicituddrvIgnorarPreexistencias;
    }

    /**
     * Gets the value of attribute drvTienePrimeraFirma
     */
    public Boolean getSolicituddrvTienePrimeraFirma() {
        return solicituddrvTienePrimeraFirma;
    }
    
    /**
     * Sets the value of attribute drvTienePrimeraFirma
     */
    public void setSolicituddrvTienePrimeraFirma(Boolean solicituddrvTienePrimeraFirma) {
        this.solicituddrvTienePrimeraFirma = solicituddrvTienePrimeraFirma;
    }

    /**
     * Gets the value of attribute drvNumContrato
     */
    public String getSolicituddrvNumContrato() {
        return solicituddrvNumContrato;
    }
    
    /**
     * Sets the value of attribute drvNumContrato
     */
    public void setSolicituddrvNumContrato(String solicituddrvNumContrato) {
        this.solicituddrvNumContrato = solicituddrvNumContrato;
    }

    /**
     * Gets the value of attribute FIniVigContInc
     */
    public Date getSolicitudFIniVigContInc() {
        return solicitudFIniVigContInc;
    }
    
    /**
     * Sets the value of attribute FIniVigContInc
     */
    public void setSolicitudFIniVigContInc(Date solicitudFIniVigContInc) {
        this.solicitudFIniVigContInc = solicitudFIniVigContInc;
    }

    /**
     * Gets the value of attribute drvImpTarifaPlanVol
     */
    public Double getSolicituddrvImpTarifaPlanVol() {
        return solicituddrvImpTarifaPlanVol;
    }
    
    /**
     * Sets the value of attribute drvImpTarifaPlanVol
     */
    public void setSolicituddrvImpTarifaPlanVol(Double solicituddrvImpTarifaPlanVol) {
        this.solicituddrvImpTarifaPlanVol = solicituddrvImpTarifaPlanVol;
    }

    /**
     * Gets the value of attribute drvAplicaDocProtDatos
     */
    public Boolean getSolicituddrvAplicaDocProtDatos() {
        return solicituddrvAplicaDocProtDatos;
    }
    
    /**
     * Sets the value of attribute drvAplicaDocProtDatos
     */
    public void setSolicituddrvAplicaDocProtDatos(Boolean solicituddrvAplicaDocProtDatos) {
        this.solicituddrvAplicaDocProtDatos = solicituddrvAplicaDocProtDatos;
    }

    /**
     * Gets the value of attribute PorcentajeProrrateo
     */
    public Double getSolicitudPorcentajeProrrateo() {
        return solicitudPorcentajeProrrateo;
    }
    
    /**
     * Sets the value of attribute PorcentajeProrrateo
     */
    public void setSolicitudPorcentajeProrrateo(Double solicitudPorcentajeProrrateo) {
        this.solicitudPorcentajeProrrateo = solicitudPorcentajeProrrateo;
    }

    /**
     * Gets the value of attribute drvPuedeModificarGrupo
     */
    public Boolean getSolicituddrvPuedeModificarGrupo() {
        return solicituddrvPuedeModificarGrupo;
    }
    
    /**
     * Sets the value of attribute drvPuedeModificarGrupo
     */
    public void setSolicituddrvPuedeModificarGrupo(Boolean solicituddrvPuedeModificarGrupo) {
        this.solicituddrvPuedeModificarGrupo = solicituddrvPuedeModificarGrupo;
    }

    /**
     * Gets the value of attribute GrupoDelCORE
     */
    public Long getSolicitudGrupoDelCORE() {
        return solicitudGrupoDelCORE;
    }
    
    /**
     * Sets the value of attribute GrupoDelCORE
     */
    public void setSolicitudGrupoDelCORE(Long solicitudGrupoDelCORE) {
        this.solicitudGrupoDelCORE = solicitudGrupoDelCORE;
    }

    /**
     * Gets the value of attribute TipoFacturaCORE
     */
    public String getSolicitudTipoFacturaCORE() {
        return solicitudTipoFacturaCORE;
    }
    
    /**
     * Sets the value of attribute TipoFacturaCORE
     */
    public void setSolicitudTipoFacturaCORE(String solicitudTipoFacturaCORE) {
        this.solicitudTipoFacturaCORE = solicitudTipoFacturaCORE;
    }

    /**
     * Gets the value of attribute drvAplicaPolizaInternacional
     */
    public Boolean getSolicituddrvAplicaPolizaInternacional() {
        return solicituddrvAplicaPolizaInternacional;
    }
    
    /**
     * Sets the value of attribute drvAplicaPolizaInternacional
     */
    public void setSolicituddrvAplicaPolizaInternacional(Boolean solicituddrvAplicaPolizaInternacional) {
        this.solicituddrvAplicaPolizaInternacional = solicituddrvAplicaPolizaInternacional;
    }

    /**
     * Gets the value of attribute drvPolizaInternacional
     */
    public Boolean getSolicituddrvPolizaInternacional() {
        return solicituddrvPolizaInternacional;
    }
    
    /**
     * Sets the value of attribute drvPolizaInternacional
     */
    public void setSolicituddrvPolizaInternacional(Boolean solicituddrvPolizaInternacional) {
        this.solicituddrvPolizaInternacional = solicituddrvPolizaInternacional;
    }

    /**
     * Gets the value of attribute drvPermiteRechazados
     */
    public Boolean getSolicituddrvPermiteRechazados() {
        return solicituddrvPermiteRechazados;
    }
    
    /**
     * Sets the value of attribute drvPermiteRechazados
     */
    public void setSolicituddrvPermiteRechazados(Boolean solicituddrvPermiteRechazados) {
        this.solicituddrvPermiteRechazados = solicituddrvPermiteRechazados;
    }

    /**
     * Gets the value of attribute drvAlgunUsuarioIMC
     */
    public Boolean getSolicituddrvAlgunUsuarioIMC() {
        return solicituddrvAlgunUsuarioIMC;
    }
    
    /**
     * Sets the value of attribute drvAlgunUsuarioIMC
     */
    public void setSolicituddrvAlgunUsuarioIMC(Boolean solicituddrvAlgunUsuarioIMC) {
        this.solicituddrvAlgunUsuarioIMC = solicituddrvAlgunUsuarioIMC;
    }

    /**
     * Gets the value of attribute drvFechaPorcenIVA
     */
    public Date getSolicituddrvFechaPorcenIVA() {
        return solicituddrvFechaPorcenIVA;
    }
    
    /**
     * Sets the value of attribute drvFechaPorcenIVA
     */
    public void setSolicituddrvFechaPorcenIVA(Date solicituddrvFechaPorcenIVA) {
        this.solicituddrvFechaPorcenIVA = solicituddrvFechaPorcenIVA;
    }

    /**
     * Gets the value of attribute ResultSMSInfoPago
     */
    public String getSolicitudResultSMSInfoPago() {
        return solicitudResultSMSInfoPago;
    }
    
    /**
     * Sets the value of attribute ResultSMSInfoPago
     */
    public void setSolicitudResultSMSInfoPago(String solicitudResultSMSInfoPago) {
        this.solicitudResultSMSInfoPago = solicitudResultSMSInfoPago;
    }

    /**
     * Gets the value of attribute FechaCompletada
     */
    public Timestamp getSolicitudFechaCompletada() {
        return solicitudFechaCompletada;
    }
    
    /**
     * Sets the value of attribute FechaCompletada
     */
    public void setSolicitudFechaCompletada(Timestamp solicitudFechaCompletada) {
        this.solicitudFechaCompletada = solicitudFechaCompletada;
    }

    /**
     * Gets the value of attribute FechaUltimoDoc
     */
    public Timestamp getSolicitudFechaUltimoDoc() {
        return solicitudFechaUltimoDoc;
    }
    
    /**
     * Sets the value of attribute FechaUltimoDoc
     */
    public void setSolicitudFechaUltimoDoc(Timestamp solicitudFechaUltimoDoc) {
        this.solicitudFechaUltimoDoc = solicitudFechaUltimoDoc;
    }

    /**
     * Gets the value of attribute Prioridad
     */
    public Long getSolicitudPrioridad() {
        return solicitudPrioridad;
    }
    
    /**
     * Sets the value of attribute Prioridad
     */
    public void setSolicitudPrioridad(Long solicitudPrioridad) {
        this.solicitudPrioridad = solicitudPrioridad;
    }

    /**
     * Gets the value of attribute FechaTerminada
     */
    public Date getSolicitudFechaTerminada() {
        return solicitudFechaTerminada;
    }
    
    /**
     * Sets the value of attribute FechaTerminada
     */
    public void setSolicitudFechaTerminada(Date solicitudFechaTerminada) {
        this.solicitudFechaTerminada = solicitudFechaTerminada;
    }

    /**
     * Gets the value of attribute FechaFUG
     */
    public Timestamp getSolicitudFechaFUG() {
        return solicitudFechaFUG;
    }
    
    /**
     * Sets the value of attribute FechaFUG
     */
    public void setSolicitudFechaFUG(Timestamp solicitudFechaFUG) {
        this.solicitudFechaFUG = solicitudFechaFUG;
    }

    /**
     * Gets the value of attribute FechaFA
     */
    public Timestamp getSolicitudFechaFA() {
        return solicitudFechaFA;
    }
    
    /**
     * Sets the value of attribute FechaFA
     */
    public void setSolicitudFechaFA(Timestamp solicitudFechaFA) {
        this.solicitudFechaFA = solicitudFechaFA;
    }

    /**
     * Gets the value of attribute FechaFAAM
     */
    public Timestamp getSolicitudFechaFAAM() {
        return solicitudFechaFAAM;
    }
    
    /**
     * Sets the value of attribute FechaFAAM
     */
    public void setSolicitudFechaFAAM(Timestamp solicitudFechaFAAM) {
        this.solicitudFechaFAAM = solicitudFechaFAAM;
    }

    /**
     * Gets the value of attribute SemaforoGrabAse
     */
    public Double getSolicitudSemaforoGrabAse() {
        return solicitudSemaforoGrabAse;
    }
    
    /**
     * Sets the value of attribute SemaforoGrabAse
     */
    public void setSolicitudSemaforoGrabAse(Double solicitudSemaforoGrabAse) {
        this.solicitudSemaforoGrabAse = solicitudSemaforoGrabAse;
    }

    /**
     * Gets the value of attribute SemaforoAreaMed
     */
    public Double getSolicitudSemaforoAreaMed() {
        return solicitudSemaforoAreaMed;
    }
    
    /**
     * Sets the value of attribute SemaforoAreaMed
     */
    public void setSolicitudSemaforoAreaMed(Double solicitudSemaforoAreaMed) {
        this.solicitudSemaforoAreaMed = solicitudSemaforoAreaMed;
    }

    /**
     * Gets the value of attribute EstadoDoc
     */
    public Long getSolicitudEstadoDoc() {
        return solicitudEstadoDoc;
    }
    
    /**
     * Sets the value of attribute EstadoDoc
     */
    public void setSolicitudEstadoDoc(Long solicitudEstadoDoc) {
        this.solicitudEstadoDoc = solicitudEstadoDoc;
    }

    /**
     * Gets the value of attribute drvSemaforoGrabAse
     */
    public Double getSolicituddrvSemaforoGrabAse() {
        return solicituddrvSemaforoGrabAse;
    }
    
    /**
     * Sets the value of attribute drvSemaforoGrabAse
     */
    public void setSolicituddrvSemaforoGrabAse(Double solicituddrvSemaforoGrabAse) {
        this.solicituddrvSemaforoGrabAse = solicituddrvSemaforoGrabAse;
    }

    /**
     * Gets the value of attribute drvSemaforoAreaMed
     */
    public Double getSolicituddrvSemaforoAreaMed() {
        return solicituddrvSemaforoAreaMed;
    }
    
    /**
     * Sets the value of attribute drvSemaforoAreaMed
     */
    public void setSolicituddrvSemaforoAreaMed(Double solicituddrvSemaforoAreaMed) {
        this.solicituddrvSemaforoAreaMed = solicituddrvSemaforoAreaMed;
    }

    /**
     * Gets the value of attribute DrvEstadoHomologado
     */
    public Long getSolicitudDrvEstadoHomologado() {
        return solicitudDrvEstadoHomologado;
    }
    
    /**
     * Sets the value of attribute DrvEstadoHomologado
     */
    public void setSolicitudDrvEstadoHomologado(Long solicitudDrvEstadoHomologado) {
        this.solicitudDrvEstadoHomologado = solicitudDrvEstadoHomologado;
    }

    /**
     * Gets the value of attribute drvValidarDatosContratante
     */
    public Boolean getSolicituddrvValidarDatosContratante() {
        return solicituddrvValidarDatosContratante;
    }
    
    /**
     * Sets the value of attribute drvValidarDatosContratante
     */
    public void setSolicituddrvValidarDatosContratante(Boolean solicituddrvValidarDatosContratante) {
        this.solicituddrvValidarDatosContratante = solicituddrvValidarDatosContratante;
    }

    /**
     * Gets the value of attribute EnvioCarnetFisico
     */
    public Boolean getSolicitudEnvioCarnetFisico() {
        return solicitudEnvioCarnetFisico;
    }
    
    /**
     * Sets the value of attribute EnvioCarnetFisico
     */
    public void setSolicitudEnvioCarnetFisico(Boolean solicitudEnvioCarnetFisico) {
        this.solicitudEnvioCarnetFisico = solicitudEnvioCarnetFisico;
    }

    /**
     * Gets the value of attribute drvTramitarEnLinea
     */
    public Boolean getSolicituddrvTramitarEnLinea() {
        return solicituddrvTramitarEnLinea;
    }
    
    /**
     * Sets the value of attribute drvTramitarEnLinea
     */
    public void setSolicituddrvTramitarEnLinea(Boolean solicituddrvTramitarEnLinea) {
        this.solicituddrvTramitarEnLinea = solicituddrvTramitarEnLinea;
    }

    /**
     * Gets the value of relation through role Direccion
     */
    @JsonIgnore
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * Gets the value of relation through role ProteccionDatos
     */
    @JsonIgnore
    public ProteccionDatos getProteccionDatos() {
        return proteccionDatos;
    }

    /**
     * Gets the value of relation through role Usuarios
     */
    @JsonIgnore
    public Collection <Usuario> getUsuarios() {
        return usuarios;
    }

    /**
     * Gets the value of relation through role Contratante
     */
    @JsonIgnore
    public Contratante getContratante() {
        return contratante;
    }

    /**
     * Gets the value of relation through role Firma
     */
    @JsonIgnore
    public Firma getFirma() {
        return firma;
    }

    /**
     * Gets the value of relation through role SegundaFirma
     */
    @JsonIgnore
    public Firma getSegundaFirma() {
        return segundaFirma;
    }

    /**
     * Gets the value of relation through role FirmaContratanteIncl
     */
    @JsonIgnore
    public Firma getFirmaContratanteIncl() {
        return firmaContratanteIncl;
    }

    /**
     * Gets the value of relation through role UsuariosRegistrados
     */
    @JsonIgnore
    public Collection <UsuarioReg> getUsuariosRegistrados() {
        return usuariosRegistrados;
    }

    /**
     * Gets the value of relation through role Titular
     */
    @JsonIgnore
    public Titular getTitular() {
        return titular;
    }

    /**
     * Gets the value of relation through role DocumentosGestor
     */
    @JsonIgnore
    public Collection <DocumentoG> getDocumentosGestor() {
        return documentosGestor;
    }

    /**
     * Gets the value of relation through role ErroresWS
     */
    @JsonIgnore
    public Collection <ErrorWS> getErroresWS() {
        return erroresWS;
    }

    /**
     * Gets the value of relation through role LogEstado
     */
    @JsonIgnore
    public Collection <LogEstado> getLogEstado() {
        return logEstado;
    }

    /**
     * Gets the value of relation through role LogAsignaciones
     */
    @JsonIgnore
    public Collection <LogAsignaciones> getLogAsignaciones() {
        return logAsignaciones;
    }

    /**
     * Gets the value of relation through role Aesolicitudes
     */
    @JsonIgnore
    public Aesolicitudes getAesolicitudes() {
        return aesolicitudes;
    }

    /**
     * Gets the value of relation through role ContratantePersona
     */
    @JsonIgnore
    public Persona getContratantePersona() {
        return contratantePersona;
    }

    /**
     * Gets the value of relation through role TitularPersona
     */
    @JsonIgnore
    public Persona getTitularPersona() {
        return titularPersona;
    }

    /**
     * Gets the value of relation through role GrupoAsociado
     */
    @JsonIgnore
    public GrupoAsociado getGrupoAsociado() {
        return grupoAsociado;
    }

    /**
     * Gets the value of relation through role Agente
     */
    @JsonIgnore
    public Funcionario getAgente() {
        return agente;
    }

    /**
     * Gets the value of relation through role FormaPago
     */
    @JsonIgnore
    public FormaPago getFormaPago() {
        return formaPago;
    }

    /**
     * Gets the value of relation through role Periodicidad
     */
    @JsonIgnore
    public Periodicidad getPeriodicidad() {
        return periodicidad;
    }

    /**
     * Gets the value of relation through role ContratoC
     */
    @JsonIgnore
    public ContratoC getContratoC() {
        return contratoC;
    }

    /**
     * Gets the value of relation through role UsrAreaMedica
     */
    @JsonIgnore
    public AreaMedica getUsrAreaMedica() {
        return usrAreaMedica;
    }

    /**
     * Gets the value of relation through role TipoFactura
     */
    @JsonIgnore
    public TipoFactura getTipoFactura() {
        return tipoFactura;
    }

    /**
     * Gets the value of relation through role UsrAfiliacion
     */
    @JsonIgnore
    public Funcionario getUsrAfiliacion() {
        return usrAfiliacion;
    }

    /**
     * Default constructor
     */
    public Solicitud() {
        aesolicitudesidsolicitud = null;
    }

    /**
     * Constructor used to create instances of <code>Solicitud</code>.
     * @param oid Object Identifier of the instance of <code>Solicitud</code> to be created.
     * @throws SystemException
     */
    public Solicitud(SolicitudOid oid) {
        if (oid != null && !oid.isNull()) {
            aesolicitudesidsolicitud = oid.getAesolicitudesidsolicitud();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return Solicitud.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Solicitud other = (Solicitud)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getSolicitudNumRadicado(), other.getSolicitudNumRadicado());
        result &= Utilities.isEqual(this.getSolicitudTramite(), other.getSolicitudTramite());
        result &= Utilities.isEqual(this.getSolicitudNumContrato(), other.getSolicitudNumContrato());
        result &= Utilities.isEqual(this.getSolicitudFInicioContrato(), other.getSolicitudFInicioContrato());
        result &= Utilities.isEqual(this.getSolicitudEsTraslado(), other.getSolicitudEsTraslado());
        result &= Utilities.isEqual(this.getSolicituddrvReqCuesMed(), other.getSolicituddrvReqCuesMed());
        result &= Utilities.isEqual(this.getSolicitudtipoContrato(), other.getSolicitudtipoContrato());
        result &= Utilities.isEqual(this.getSolicitudcodigoSucursalRad(), other.getSolicitudcodigoSucursalRad());
        result &= Utilities.isEqual(this.getSolicitudcontratoConFirma(), other.getSolicitudcontratoConFirma());
        result &= Utilities.isEqual(this.getSolicitudobservacions(), other.getSolicitudobservacions());
        result &= Utilities.isEqual(this.getSolicitudexentoIVA(), other.getSolicitudexentoIVA());
        result &= Utilities.isEqual(this.getSolicituddrvYaTieneContratante(), other.getSolicituddrvYaTieneContratante());
        result &= Utilities.isEqual(this.getSolicituddrvTitularConBeneficios(), other.getSolicituddrvTitularConBeneficios());
        result &= Utilities.isEqual(this.getSolicitudvalorCuota(), other.getSolicitudvalorCuota());
        result &= Utilities.isEqual(this.getSolicitudvalorDtoComercialSim(), other.getSolicitudvalorDtoComercialSim());
        result &= Utilities.isEqual(this.getSolicitudValorCuotaInscrip(), other.getSolicitudValorCuotaInscrip());
        result &= Utilities.isEqual(this.getSolicituddrvSubtotal(), other.getSolicituddrvSubtotal());
        result &= Utilities.isEqual(this.getSolicitudValorDtoFinanciero(), other.getSolicitudValorDtoFinanciero());
        result &= Utilities.isEqual(this.getSolicitudValorDtoComercial(), other.getSolicitudValorDtoComercial());
        result &= Utilities.isEqual(this.getSolicituddrvBaseGrabable(), other.getSolicituddrvBaseGrabable());
        result &= Utilities.isEqual(this.getSolicituddrvPorcenIVA(), other.getSolicituddrvPorcenIVA());
        result &= Utilities.isEqual(this.getSolicituddrvIVA(), other.getSolicituddrvIVA());
        result &= Utilities.isEqual(this.getSolicituddrvTotal(), other.getSolicituddrvTotal());
        result &= Utilities.isEqual(this.getSolicituddatosPagoOK(), other.getSolicituddatosPagoOK());
        result &= Utilities.isEqual(this.getSolicitudvalorCuotaPeriodoC(), other.getSolicitudvalorCuotaPeriodoC());
        result &= Utilities.isEqual(this.getSolicituddescuentoComercialC(), other.getSolicituddescuentoComercialC());
        result &= Utilities.isEqual(this.getSolicitudIVAC(), other.getSolicitudIVAC());
        result &= Utilities.isEqual(this.getSolicituddescuentoFinancieroC(), other.getSolicituddescuentoFinancieroC());
        result &= Utilities.isEqual(this.getSolicitudTieneDifLiquidacion(), other.getSolicitudTieneDifLiquidacion());
        result &= Utilities.isEqual(this.getSolicitudUsuariosValidados(), other.getSolicitudUsuariosValidados());
        result &= Utilities.isEqual(this.getSolicituddrvCuesMedOK(), other.getSolicituddrvCuesMedOK());
        result &= Utilities.isEqual(this.getSolicitudNumContratoInclusion(), other.getSolicitudNumContratoInclusion());
        result &= Utilities.isEqual(this.getSolicitudNumFamilia(), other.getSolicitudNumFamilia());
        result &= Utilities.isEqual(this.getSolicituddrvYaTieneTitular(), other.getSolicituddrvYaTieneTitular());
        result &= Utilities.isEqual(this.getSolicituddrvDifValorCuota(), other.getSolicituddrvDifValorCuota());
        result &= Utilities.isEqual(this.getSolicituddrvDifValorDtoFinanciero(), other.getSolicituddrvDifValorDtoFinanciero());
        result &= Utilities.isEqual(this.getSolicituddrvDifValorIVA(), other.getSolicituddrvDifValorIVA());
        result &= Utilities.isEqual(this.getSolicituddrvHayPreexistencias(), other.getSolicituddrvHayPreexistencias());
        result &= Utilities.isEqual(this.getSolicituddrvContratoLegalizado(), other.getSolicituddrvContratoLegalizado());
        result &= Utilities.isEqual(this.getSolicituddrvTieneSegundaFirma(), other.getSolicituddrvTieneSegundaFirma());
        result &= Utilities.isEqual(this.getSolicituddrvGrupoAsociado(), other.getSolicituddrvGrupoAsociado());
        result &= Utilities.isEqual(this.getSolicituddrvAplicaDocContrato(), other.getSolicituddrvAplicaDocContrato());
        result &= Utilities.isEqual(this.getSolicituddrvAplicaDocCartaPree(), other.getSolicituddrvAplicaDocCartaPree());
        result &= Utilities.isEqual(this.getSolicituddrvAplicaDocBBGestante(), other.getSolicituddrvAplicaDocBBGestante());
        result &= Utilities.isEqual(this.getSolicituddrvAplicaDocMaternidad(), other.getSolicituddrvAplicaDocMaternidad());
        result &= Utilities.isEqual(this.getSolicituddrvAplicaCuestionario(), other.getSolicituddrvAplicaCuestionario());
        result &= Utilities.isEqual(this.getSolicituddrvAplicaCartaEnt(), other.getSolicituddrvAplicaCartaEnt());
        result &= Utilities.isEqual(this.getSolicitudEmailURLPagoEnviado(), other.getSolicitudEmailURLPagoEnviado());
        result &= Utilities.isEqual(this.getSolicitudEmailDocuEnviado(), other.getSolicitudEmailDocuEnviado());
        result &= Utilities.isEqual(this.getSolicitudDocsEnviados(), other.getSolicitudDocsEnviados());
        result &= Utilities.isEqual(this.getSolicituddrvTotalConAnexos(), other.getSolicituddrvTotalConAnexos());
        result &= Utilities.isEqual(this.getSolicituddrvContratanteEsTitular(), other.getSolicituddrvContratanteEsTitular());
        result &= Utilities.isEqual(this.getSolicituddrvAlgunBeneficiarioEPSSanitas(), other.getSolicituddrvAlgunBeneficiarioEPSSanitas());
        result &= Utilities.isEqual(this.getSolicitudcodDirector(), other.getSolicitudcodDirector());
        result &= Utilities.isEqual(this.getSolicituddrvListaErrores(), other.getSolicituddrvListaErrores());
        result &= Utilities.isEqual(this.getSolicitudvalorCuotaBrutaC(), other.getSolicitudvalorCuotaBrutaC());
        result &= Utilities.isEqual(this.getSolicituddrvDifValorCuotaBruta(), other.getSolicituddrvDifValorCuotaBruta());
        result &= Utilities.isEqual(this.getSolicituddrvNumTitulares(), other.getSolicituddrvNumTitulares());
        result &= Utilities.isEqual(this.getSolicituddrvEnviarEmailDoc(), other.getSolicituddrvEnviarEmailDoc());
        result &= Utilities.isEqual(this.getSolicituddrvAplicaDocNeonatal(), other.getSolicituddrvAplicaDocNeonatal());
        result &= Utilities.isEqual(this.getSolicitudCodTarifa(), other.getSolicitudCodTarifa());
        result &= Utilities.isEqual(this.getSolicituddrvAplicaCarnets(), other.getSolicituddrvAplicaCarnets());
        result &= Utilities.isEqual(this.getSolicituddrvAplicaDocSolicitud(), other.getSolicituddrvAplicaDocSolicitud());
        result &= Utilities.isEqual(this.getSolicituddrvPuedeReplicar(), other.getSolicituddrvPuedeReplicar());
        result &= Utilities.isEqual(this.getSolicitudCompletada(), other.getSolicitudCompletada());
        result &= Utilities.isEqual(this.getSolicituddrvCambiarBenefCont(), other.getSolicituddrvCambiarBenefCont());
        result &= Utilities.isEqual(this.getSolicitudEstado(), other.getSolicitudEstado());
        result &= Utilities.isEqual(this.getSolicituddrvEdadTitular(), other.getSolicituddrvEdadTitular());
        result &= Utilities.isEqual(this.getSolicituddrvGeneroTitular(), other.getSolicituddrvGeneroTitular());
        result &= Utilities.isEqual(this.getSolicituddrvTieneTitular(), other.getSolicituddrvTieneTitular());
        result &= Utilities.isEqual(this.getSolicituddrvObservacionesReport(), other.getSolicituddrvObservacionesReport());
        result &= Utilities.isEqual(this.getSolicituddrvIgnorarPreexistencias(), other.getSolicituddrvIgnorarPreexistencias());
        result &= Utilities.isEqual(this.getSolicituddrvTienePrimeraFirma(), other.getSolicituddrvTienePrimeraFirma());
        result &= Utilities.isEqual(this.getSolicituddrvNumContrato(), other.getSolicituddrvNumContrato());
        result &= Utilities.isEqual(this.getSolicitudFIniVigContInc(), other.getSolicitudFIniVigContInc());
        result &= Utilities.isEqual(this.getSolicituddrvImpTarifaPlanVol(), other.getSolicituddrvImpTarifaPlanVol());
        result &= Utilities.isEqual(this.getSolicituddrvAplicaDocProtDatos(), other.getSolicituddrvAplicaDocProtDatos());
        result &= Utilities.isEqual(this.getSolicitudPorcentajeProrrateo(), other.getSolicitudPorcentajeProrrateo());
        result &= Utilities.isEqual(this.getSolicituddrvPuedeModificarGrupo(), other.getSolicituddrvPuedeModificarGrupo());
        result &= Utilities.isEqual(this.getSolicitudGrupoDelCORE(), other.getSolicitudGrupoDelCORE());
        result &= Utilities.isEqual(this.getSolicitudTipoFacturaCORE(), other.getSolicitudTipoFacturaCORE());
        result &= Utilities.isEqual(this.getSolicituddrvAplicaPolizaInternacional(), other.getSolicituddrvAplicaPolizaInternacional());
        result &= Utilities.isEqual(this.getSolicituddrvPolizaInternacional(), other.getSolicituddrvPolizaInternacional());
        result &= Utilities.isEqual(this.getSolicituddrvPermiteRechazados(), other.getSolicituddrvPermiteRechazados());
        result &= Utilities.isEqual(this.getSolicituddrvAlgunUsuarioIMC(), other.getSolicituddrvAlgunUsuarioIMC());
        result &= Utilities.isEqual(this.getSolicituddrvFechaPorcenIVA(), other.getSolicituddrvFechaPorcenIVA());
        result &= Utilities.isEqual(this.getSolicitudResultSMSInfoPago(), other.getSolicitudResultSMSInfoPago());
        result &= Utilities.isEqual(this.getSolicitudFechaCompletada(), other.getSolicitudFechaCompletada());
        result &= Utilities.isEqual(this.getSolicitudFechaUltimoDoc(), other.getSolicitudFechaUltimoDoc());
        result &= Utilities.isEqual(this.getSolicitudPrioridad(), other.getSolicitudPrioridad());
        result &= Utilities.isEqual(this.getSolicitudFechaTerminada(), other.getSolicitudFechaTerminada());
        result &= Utilities.isEqual(this.getSolicitudFechaFUG(), other.getSolicitudFechaFUG());
        result &= Utilities.isEqual(this.getSolicitudFechaFA(), other.getSolicitudFechaFA());
        result &= Utilities.isEqual(this.getSolicitudFechaFAAM(), other.getSolicitudFechaFAAM());
        result &= Utilities.isEqual(this.getSolicitudSemaforoGrabAse(), other.getSolicitudSemaforoGrabAse());
        result &= Utilities.isEqual(this.getSolicitudSemaforoAreaMed(), other.getSolicitudSemaforoAreaMed());
        result &= Utilities.isEqual(this.getSolicitudEstadoDoc(), other.getSolicitudEstadoDoc());
        result &= Utilities.isEqual(this.getSolicituddrvSemaforoGrabAse(), other.getSolicituddrvSemaforoGrabAse());
        result &= Utilities.isEqual(this.getSolicituddrvSemaforoAreaMed(), other.getSolicituddrvSemaforoAreaMed());
        result &= Utilities.isEqual(this.getSolicitudDrvEstadoHomologado(), other.getSolicitudDrvEstadoHomologado());
        result &= Utilities.isEqual(this.getSolicituddrvValidarDatosContratante(), other.getSolicituddrvValidarDatosContratante());
        result &= Utilities.isEqual(this.getSolicitudEnvioCarnetFisico(), other.getSolicitudEnvioCarnetFisico());
        result &= Utilities.isEqual(this.getSolicituddrvTramitarEnLinea(), other.getSolicituddrvTramitarEnLinea());
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
     * Returns the <code>SolicitudOid</code> object that identifies this instance of <code>Solicitud</code>.
     * @return <code>SolicitudOid</code> object that identifies this instance of <code>Solicitud</code>
     */
	@Override
    public SolicitudOid getOid() {
        return new SolicitudOid(getAesolicitudesidsolicitud());
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
        if (!activeFacets.contains(Constants.SOLICITUD)) {
            activeFacets.add(Constants.SOLICITUD);
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
            relatedInstance = buildSolicitudRelatedInstance(relatedInstanceJsonOid);
        }
        if (SolicitudConstants.ROLE_NAME_DIRECCION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4Direccion(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_PROTECCIONDATOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4ProteccionDatos(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_USUARIOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4Usuario(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_CONTRATANTE.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4Contratante(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_FIRMA.equalsIgnoreCase(relatedInstancePathFirstItem) || SolicitudConstants.ROLE_NAME_SEGUNDAFIRMA.equalsIgnoreCase(relatedInstancePathFirstItem) || SolicitudConstants.ROLE_NAME_FIRMACONTRATANTEINCL.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4Firma(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_USUARIOSREGISTRADOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4UsuarioReg(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_TITULAR.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4Titular(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_DOCUMENTOSGESTOR.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4DocumentoG(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_ERRORESWS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4ErrorWS(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_LOGESTADO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4LogEstado(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_LOGASIGNACIONES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4LogAsignaciones(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_AESOLICITUDES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4Aesolicitudes(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_CONTRATANTEPERSONA.equalsIgnoreCase(relatedInstancePathFirstItem) || SolicitudConstants.ROLE_NAME_TITULARPERSONA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4Persona(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_GRUPOASOCIADO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4GrupoAsociado(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_AGENTE.equalsIgnoreCase(relatedInstancePathFirstItem) || SolicitudConstants.ROLE_NAME_USRAFILIACION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4Funcionario(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_FORMAPAGO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4FormaPago(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_PERIODICIDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4Periodicidad(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_CONTRATOC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4ContratoC(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_USRAREAMEDICA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4AreaMedica(relatedInstanceJsonOid, remainingPath);
        }
        if (SolicitudConstants.ROLE_NAME_TIPOFACTURA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildSolicitudRelatedInstance4TipoFactura(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildSolicitudRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudRelatedInstance4Direccion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Direccion(mapper.readValue(relatedInstanceJsonOid, DireccionOid.class)): Direccion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudRelatedInstance4ProteccionDatos(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ProteccionDatos(mapper.readValue(relatedInstanceJsonOid, ProteccionDatosOid.class)): ProteccionDatos.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudRelatedInstance4Usuario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Usuario(mapper.readValue(relatedInstanceJsonOid, UsuarioOid.class)): Usuario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudRelatedInstance4Contratante(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Contratante(mapper.readValue(relatedInstanceJsonOid, ContratanteOid.class)): Contratante.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudRelatedInstance4Firma(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Firma(mapper.readValue(relatedInstanceJsonOid, FirmaOid.class)): Firma.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudRelatedInstance4UsuarioReg(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new UsuarioReg(mapper.readValue(relatedInstanceJsonOid, UsuarioRegOid.class)): UsuarioReg.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudRelatedInstance4Titular(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Titular(mapper.readValue(relatedInstanceJsonOid, TitularOid.class)): Titular.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudRelatedInstance4DocumentoG(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new DocumentoG(mapper.readValue(relatedInstanceJsonOid, DocumentoGOid.class)): DocumentoG.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudRelatedInstance4ErrorWS(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ErrorWS(mapper.readValue(relatedInstanceJsonOid, ErrorWSOid.class)): ErrorWS.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudRelatedInstance4LogEstado(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new LogEstado(mapper.readValue(relatedInstanceJsonOid, LogEstadoOid.class)): LogEstado.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudRelatedInstance4LogAsignaciones(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new LogAsignaciones(mapper.readValue(relatedInstanceJsonOid, LogAsignacionesOid.class)): LogAsignaciones.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudRelatedInstance4Aesolicitudes(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Aesolicitudes(mapper.readValue(relatedInstanceJsonOid, AesolicitudesOid.class)): Aesolicitudes.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudRelatedInstance4Persona(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Persona(mapper.readValue(relatedInstanceJsonOid, PersonaOid.class)): Persona.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudRelatedInstance4GrupoAsociado(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new GrupoAsociado(mapper.readValue(relatedInstanceJsonOid, GrupoAsociadoOid.class)): GrupoAsociado.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudRelatedInstance4Funcionario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Funcionario(mapper.readValue(relatedInstanceJsonOid, FuncionarioOid.class)): Funcionario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudRelatedInstance4FormaPago(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new FormaPago(mapper.readValue(relatedInstanceJsonOid, FormaPagoOid.class)): FormaPago.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudRelatedInstance4Periodicidad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Periodicidad(mapper.readValue(relatedInstanceJsonOid, PeriodicidadOid.class)): Periodicidad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudRelatedInstance4ContratoC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ContratoC(mapper.readValue(relatedInstanceJsonOid, ContratoCOid.class)): ContratoC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudRelatedInstance4AreaMedica(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new AreaMedica(mapper.readValue(relatedInstanceJsonOid, AreaMedicaOid.class)): AreaMedica.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildSolicitudRelatedInstance4TipoFactura(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TipoFactura(mapper.readValue(relatedInstanceJsonOid, TipoFacturaOid.class)): TipoFactura.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Solicitud.class).error(e.getMessage());
            return null;
        }
    }
}
