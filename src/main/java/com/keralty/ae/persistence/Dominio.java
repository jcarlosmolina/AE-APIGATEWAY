package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.DominioConstants;
import com.keralty.ae.persistence.oid.AgentexProductoOid;
import com.keralty.ae.persistence.oid.ConfiguracionANSOid;
import com.keralty.ae.persistence.oid.DominioOid;
import com.keralty.ae.persistence.oid.FormaPagoOid;
import com.keralty.ae.persistence.oid.GrupoAsignacionNovedadOid;
import com.keralty.ae.persistence.oid.GrupoAsignacionOid;
import com.keralty.ae.persistence.oid.LogDatosDominioOid;
import com.keralty.ae.persistence.oid.LogGruposUsuariosOid;
import com.keralty.ae.persistence.oid.LogIncompatibilidadesOid;
import com.keralty.ae.persistence.oid.NovedadOid;
import com.keralty.ae.persistence.oid.ParentescoDomOid;
import com.keralty.ae.persistence.oid.PeriodicidadOid;
import com.keralty.ae.persistence.oid.PlanesOid;
import com.keralty.ae.persistence.oid.PlantillaEmailOid;
import com.keralty.ae.persistence.oid.ProductosOid;
import com.keralty.ae.persistence.oid.ProrrateoOid;
import com.keralty.ae.persistence.oid.ReportesDominioOid;
import com.keralty.ae.persistence.oid.RolOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>Dominio</code> external model class.
 * <p>
 * External Model Class: <code>Dominio</code><br>
 */
public class Dominio extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="numero")
    private Long dominioNumero;

    @JsonProperty(value="reqcuesmed")
    private Boolean dominioReqCuesMed;

    @JsonProperty(value="nocuesmedtras")
    private Boolean dominioNoCuesMedTras;

    @JsonProperty(value="nuevaafiliacion")
    private Boolean dominioNuevaAfiliacion;

    @JsonProperty(value="inclusion")
    private Boolean dominioInclusion;

    @JsonProperty(value="acepcuesmat")
    private Boolean dominioAcepCuesMat;

    @JsonProperty(value="acepcuesneo")
    private Boolean dominioAcepCuesNeo;

    @JsonProperty(value="acepbbgestante")
    private Boolean dominioAcepBBGestante;

    @JsonProperty(value="mostrarpreexanexos")
    private Boolean dominioMostrarPreexAnexos;

    @JsonProperty(value="mostrarpreexcontrato")
    private Boolean dominioMostrarPreexContrato;

    @JsonProperty(value="ignorarpreexistencias")
    private Boolean dominioIgnorarPreexistencias;

    @JsonProperty(value="respclaunombre")
    private String dominioRespClauNombre;

    @JsonProperty(value="respclaucelula")
    private String dominioRespClauCelula;

    @JsonProperty(value="respclauexpcelula")
    private String dominioRespClauExpCelula;

    @JsonProperty(value="respclaucargo")
    private String dominioRespClauCargo;

    @JsonProperty(value="respclaufirma")
    private byte[] dominioRespClauFirma;

    @JsonProperty(value="diainivigencia")
    private Long dominioDiaIniVigencia;

    @JsonProperty(value="diafinvigencia")
    private Long dominioDiaFinVigencia;

    @JsonProperty(value="diascaducidad")
    private Long dominioDiasCaducidad;

    @JsonProperty(value="prorrateousuexistente")
    private Boolean dominioProrrateoUsuExistente;

    @JsonProperty(value="inclusionmodgrupoasoc")
    private Boolean dominioInclusionModGrupoAsoc;

    @JsonProperty(value="permiterechazadosafi")
    private Boolean dominioPermiteRechazadosAfi;

    @JsonProperty(value="aceppolizainter")
    private Boolean dominioAcepPolizaInter;

    @JsonProperty(value="novexcepcionreqdoc")
    private Boolean dominioNovExcepcionReqDoc;

    @JsonProperty(value="solnovcoloroscuro")
    private String dominioSolNovColorOscuro;

    @JsonProperty(value="solnovcolorclaro")
    private String dominioSolNovColorClaro;

    @JsonProperty(value="solnovlogo")
    private String dominioSolNovLogo;

    @JsonProperty(value="tramiteenlinea")
    private Boolean dominioTramiteEnLinea;

    @JsonProperty(value="vigenciaradicacion")
    private Boolean dominioVigenciaRadicacion;

    private Collection <Dominio> dominiosConIncompatibilidad;

    private Collection <ParentescoDom> parentescosDom;

    private Collection <AgentexProducto> agentexProducto;

    private Collection <Prorrateo> prorrateos;

    private Collection <LogGruposUsuarios> logGruposUsuarios;

    private Collection <GrupoAsignacionNovedad> grupoAsignacionNovedad;

    private Collection <ConfiguracionANS> configuracionesANS;

    private Collection <ReportesDominio> reportesDominio;

    private Collection <LogIncompatibilidades> logIncompatibilidades;

    private Collection <LogDatosDominio> logDatosDominio;

    private Planes planT;

    private Productos productoT;

    private Collection <Periodicidad> periodicidades;

    private Collection <Rol> roles;

    private Collection <FormaPago> formasPago;

    private Collection <PlantillaEmail> plantillas;

    private Collection <Novedad> novedades;

    private GrupoAsignacion grupoAsesores;

    private GrupoAsignacion grupoAreaMedica;

    private Collection <Dominio> dominiosIncompatibles;

    /**
     * Gets the value of attribute Numero
     */
    public Long getDominioNumero() {
        return dominioNumero;
    }
    
    /**
     * Sets the value of attribute Numero
     */
    public void setDominioNumero(Long dominioNumero) {
        this.dominioNumero = dominioNumero;
    }

    /**
     * Gets the value of attribute ReqCuesMed
     */
    public Boolean getDominioReqCuesMed() {
        return dominioReqCuesMed;
    }
    
    /**
     * Sets the value of attribute ReqCuesMed
     */
    public void setDominioReqCuesMed(Boolean dominioReqCuesMed) {
        this.dominioReqCuesMed = dominioReqCuesMed;
    }

    /**
     * Gets the value of attribute NoCuesMedTras
     */
    public Boolean getDominioNoCuesMedTras() {
        return dominioNoCuesMedTras;
    }
    
    /**
     * Sets the value of attribute NoCuesMedTras
     */
    public void setDominioNoCuesMedTras(Boolean dominioNoCuesMedTras) {
        this.dominioNoCuesMedTras = dominioNoCuesMedTras;
    }

    /**
     * Gets the value of attribute NuevaAfiliacion
     */
    public Boolean getDominioNuevaAfiliacion() {
        return dominioNuevaAfiliacion;
    }
    
    /**
     * Sets the value of attribute NuevaAfiliacion
     */
    public void setDominioNuevaAfiliacion(Boolean dominioNuevaAfiliacion) {
        this.dominioNuevaAfiliacion = dominioNuevaAfiliacion;
    }

    /**
     * Gets the value of attribute Inclusion
     */
    public Boolean getDominioInclusion() {
        return dominioInclusion;
    }
    
    /**
     * Sets the value of attribute Inclusion
     */
    public void setDominioInclusion(Boolean dominioInclusion) {
        this.dominioInclusion = dominioInclusion;
    }

    /**
     * Gets the value of attribute AcepCuesMat
     */
    public Boolean getDominioAcepCuesMat() {
        return dominioAcepCuesMat;
    }
    
    /**
     * Sets the value of attribute AcepCuesMat
     */
    public void setDominioAcepCuesMat(Boolean dominioAcepCuesMat) {
        this.dominioAcepCuesMat = dominioAcepCuesMat;
    }

    /**
     * Gets the value of attribute AcepCuesNeo
     */
    public Boolean getDominioAcepCuesNeo() {
        return dominioAcepCuesNeo;
    }
    
    /**
     * Sets the value of attribute AcepCuesNeo
     */
    public void setDominioAcepCuesNeo(Boolean dominioAcepCuesNeo) {
        this.dominioAcepCuesNeo = dominioAcepCuesNeo;
    }

    /**
     * Gets the value of attribute AcepBBGestante
     */
    public Boolean getDominioAcepBBGestante() {
        return dominioAcepBBGestante;
    }
    
    /**
     * Sets the value of attribute AcepBBGestante
     */
    public void setDominioAcepBBGestante(Boolean dominioAcepBBGestante) {
        this.dominioAcepBBGestante = dominioAcepBBGestante;
    }

    /**
     * Gets the value of attribute MostrarPreexAnexos
     */
    public Boolean getDominioMostrarPreexAnexos() {
        return dominioMostrarPreexAnexos;
    }
    
    /**
     * Sets the value of attribute MostrarPreexAnexos
     */
    public void setDominioMostrarPreexAnexos(Boolean dominioMostrarPreexAnexos) {
        this.dominioMostrarPreexAnexos = dominioMostrarPreexAnexos;
    }

    /**
     * Gets the value of attribute MostrarPreexContrato
     */
    public Boolean getDominioMostrarPreexContrato() {
        return dominioMostrarPreexContrato;
    }
    
    /**
     * Sets the value of attribute MostrarPreexContrato
     */
    public void setDominioMostrarPreexContrato(Boolean dominioMostrarPreexContrato) {
        this.dominioMostrarPreexContrato = dominioMostrarPreexContrato;
    }

    /**
     * Gets the value of attribute IgnorarPreexistencias
     */
    public Boolean getDominioIgnorarPreexistencias() {
        return dominioIgnorarPreexistencias;
    }
    
    /**
     * Sets the value of attribute IgnorarPreexistencias
     */
    public void setDominioIgnorarPreexistencias(Boolean dominioIgnorarPreexistencias) {
        this.dominioIgnorarPreexistencias = dominioIgnorarPreexistencias;
    }

    /**
     * Gets the value of attribute RespClauNombre
     */
    public String getDominioRespClauNombre() {
        return dominioRespClauNombre;
    }
    
    /**
     * Sets the value of attribute RespClauNombre
     */
    public void setDominioRespClauNombre(String dominioRespClauNombre) {
        this.dominioRespClauNombre = dominioRespClauNombre;
    }

    /**
     * Gets the value of attribute RespClauCelula
     */
    public String getDominioRespClauCelula() {
        return dominioRespClauCelula;
    }
    
    /**
     * Sets the value of attribute RespClauCelula
     */
    public void setDominioRespClauCelula(String dominioRespClauCelula) {
        this.dominioRespClauCelula = dominioRespClauCelula;
    }

    /**
     * Gets the value of attribute RespClauExpCelula
     */
    public String getDominioRespClauExpCelula() {
        return dominioRespClauExpCelula;
    }
    
    /**
     * Sets the value of attribute RespClauExpCelula
     */
    public void setDominioRespClauExpCelula(String dominioRespClauExpCelula) {
        this.dominioRespClauExpCelula = dominioRespClauExpCelula;
    }

    /**
     * Gets the value of attribute RespClauCargo
     */
    public String getDominioRespClauCargo() {
        return dominioRespClauCargo;
    }
    
    /**
     * Sets the value of attribute RespClauCargo
     */
    public void setDominioRespClauCargo(String dominioRespClauCargo) {
        this.dominioRespClauCargo = dominioRespClauCargo;
    }

    /**
     * Gets the value of attribute RespClauFirma
     */
    public byte[] getDominioRespClauFirma() {
        return dominioRespClauFirma;
    }
    
    /**
     * Sets the value of attribute RespClauFirma
     */
    public void setDominioRespClauFirma(byte[] dominioRespClauFirma) {
        this.dominioRespClauFirma = dominioRespClauFirma;
    }

    /**
     * Gets the value of attribute DiaIniVigencia
     */
    public Long getDominioDiaIniVigencia() {
        return dominioDiaIniVigencia;
    }
    
    /**
     * Sets the value of attribute DiaIniVigencia
     */
    public void setDominioDiaIniVigencia(Long dominioDiaIniVigencia) {
        this.dominioDiaIniVigencia = dominioDiaIniVigencia;
    }

    /**
     * Gets the value of attribute DiaFinVigencia
     */
    public Long getDominioDiaFinVigencia() {
        return dominioDiaFinVigencia;
    }
    
    /**
     * Sets the value of attribute DiaFinVigencia
     */
    public void setDominioDiaFinVigencia(Long dominioDiaFinVigencia) {
        this.dominioDiaFinVigencia = dominioDiaFinVigencia;
    }

    /**
     * Gets the value of attribute DiasCaducidad
     */
    public Long getDominioDiasCaducidad() {
        return dominioDiasCaducidad;
    }
    
    /**
     * Sets the value of attribute DiasCaducidad
     */
    public void setDominioDiasCaducidad(Long dominioDiasCaducidad) {
        this.dominioDiasCaducidad = dominioDiasCaducidad;
    }

    /**
     * Gets the value of attribute ProrrateoUsuExistente
     */
    public Boolean getDominioProrrateoUsuExistente() {
        return dominioProrrateoUsuExistente;
    }
    
    /**
     * Sets the value of attribute ProrrateoUsuExistente
     */
    public void setDominioProrrateoUsuExistente(Boolean dominioProrrateoUsuExistente) {
        this.dominioProrrateoUsuExistente = dominioProrrateoUsuExistente;
    }

    /**
     * Gets the value of attribute InclusionModGrupoAsoc
     */
    public Boolean getDominioInclusionModGrupoAsoc() {
        return dominioInclusionModGrupoAsoc;
    }
    
    /**
     * Sets the value of attribute InclusionModGrupoAsoc
     */
    public void setDominioInclusionModGrupoAsoc(Boolean dominioInclusionModGrupoAsoc) {
        this.dominioInclusionModGrupoAsoc = dominioInclusionModGrupoAsoc;
    }

    /**
     * Gets the value of attribute PermiteRechazadosAfi
     */
    public Boolean getDominioPermiteRechazadosAfi() {
        return dominioPermiteRechazadosAfi;
    }
    
    /**
     * Sets the value of attribute PermiteRechazadosAfi
     */
    public void setDominioPermiteRechazadosAfi(Boolean dominioPermiteRechazadosAfi) {
        this.dominioPermiteRechazadosAfi = dominioPermiteRechazadosAfi;
    }

    /**
     * Gets the value of attribute AcepPolizaInter
     */
    public Boolean getDominioAcepPolizaInter() {
        return dominioAcepPolizaInter;
    }
    
    /**
     * Sets the value of attribute AcepPolizaInter
     */
    public void setDominioAcepPolizaInter(Boolean dominioAcepPolizaInter) {
        this.dominioAcepPolizaInter = dominioAcepPolizaInter;
    }

    /**
     * Gets the value of attribute NovExcepcionReqDoc
     */
    public Boolean getDominioNovExcepcionReqDoc() {
        return dominioNovExcepcionReqDoc;
    }
    
    /**
     * Sets the value of attribute NovExcepcionReqDoc
     */
    public void setDominioNovExcepcionReqDoc(Boolean dominioNovExcepcionReqDoc) {
        this.dominioNovExcepcionReqDoc = dominioNovExcepcionReqDoc;
    }

    /**
     * Gets the value of attribute SolNovColorOscuro
     */
    public String getDominioSolNovColorOscuro() {
        return dominioSolNovColorOscuro;
    }
    
    /**
     * Sets the value of attribute SolNovColorOscuro
     */
    public void setDominioSolNovColorOscuro(String dominioSolNovColorOscuro) {
        this.dominioSolNovColorOscuro = dominioSolNovColorOscuro;
    }

    /**
     * Gets the value of attribute SolNovColorClaro
     */
    public String getDominioSolNovColorClaro() {
        return dominioSolNovColorClaro;
    }
    
    /**
     * Sets the value of attribute SolNovColorClaro
     */
    public void setDominioSolNovColorClaro(String dominioSolNovColorClaro) {
        this.dominioSolNovColorClaro = dominioSolNovColorClaro;
    }

    /**
     * Gets the value of attribute SolNovLogo
     */
    public String getDominioSolNovLogo() {
        return dominioSolNovLogo;
    }
    
    /**
     * Sets the value of attribute SolNovLogo
     */
    public void setDominioSolNovLogo(String dominioSolNovLogo) {
        this.dominioSolNovLogo = dominioSolNovLogo;
    }

    /**
     * Gets the value of attribute TramiteEnLinea
     */
    public Boolean getDominioTramiteEnLinea() {
        return dominioTramiteEnLinea;
    }
    
    /**
     * Sets the value of attribute TramiteEnLinea
     */
    public void setDominioTramiteEnLinea(Boolean dominioTramiteEnLinea) {
        this.dominioTramiteEnLinea = dominioTramiteEnLinea;
    }

    /**
     * Gets the value of attribute VigenciaRadicacion
     */
    public Boolean getDominioVigenciaRadicacion() {
        return dominioVigenciaRadicacion;
    }
    
    /**
     * Sets the value of attribute VigenciaRadicacion
     */
    public void setDominioVigenciaRadicacion(Boolean dominioVigenciaRadicacion) {
        this.dominioVigenciaRadicacion = dominioVigenciaRadicacion;
    }

    /**
     * Gets the value of relation through role DominiosConIncompatibilidad
     */
    @JsonIgnore
    public Collection <Dominio> getDominiosConIncompatibilidad() {
        return dominiosConIncompatibilidad;
    }

    /**
     * Gets the value of relation through role ParentescosDom
     */
    @JsonIgnore
    public Collection <ParentescoDom> getParentescosDom() {
        return parentescosDom;
    }

    /**
     * Gets the value of relation through role AgentexProducto
     */
    @JsonIgnore
    public Collection <AgentexProducto> getAgentexProducto() {
        return agentexProducto;
    }

    /**
     * Gets the value of relation through role Prorrateos
     */
    @JsonIgnore
    public Collection <Prorrateo> getProrrateos() {
        return prorrateos;
    }

    /**
     * Gets the value of relation through role LogGruposUsuarios
     */
    @JsonIgnore
    public Collection <LogGruposUsuarios> getLogGruposUsuarios() {
        return logGruposUsuarios;
    }

    /**
     * Gets the value of relation through role GrupoAsignacionNovedad
     */
    @JsonIgnore
    public Collection <GrupoAsignacionNovedad> getGrupoAsignacionNovedad() {
        return grupoAsignacionNovedad;
    }

    /**
     * Gets the value of relation through role ConfiguracionesANS
     */
    @JsonIgnore
    public Collection <ConfiguracionANS> getConfiguracionesANS() {
        return configuracionesANS;
    }

    /**
     * Gets the value of relation through role ReportesDominio
     */
    @JsonIgnore
    public Collection <ReportesDominio> getReportesDominio() {
        return reportesDominio;
    }

    /**
     * Gets the value of relation through role LogIncompatibilidades
     */
    @JsonIgnore
    public Collection <LogIncompatibilidades> getLogIncompatibilidades() {
        return logIncompatibilidades;
    }

    /**
     * Gets the value of relation through role LogDatosDominio
     */
    @JsonIgnore
    public Collection <LogDatosDominio> getLogDatosDominio() {
        return logDatosDominio;
    }

    /**
     * Gets the value of relation through role PlanT
     */
    @JsonIgnore
    public Planes getPlanT() {
        return planT;
    }

    /**
     * Gets the value of relation through role ProductoT
     */
    @JsonIgnore
    public Productos getProductoT() {
        return productoT;
    }

    /**
     * Gets the value of relation through role Periodicidades
     */
    @JsonIgnore
    public Collection <Periodicidad> getPeriodicidades() {
        return periodicidades;
    }

    /**
     * Gets the value of relation through role Roles
     */
    @JsonIgnore
    public Collection <Rol> getRoles() {
        return roles;
    }

    /**
     * Gets the value of relation through role FormasPago
     */
    @JsonIgnore
    public Collection <FormaPago> getFormasPago() {
        return formasPago;
    }

    /**
     * Gets the value of relation through role Plantillas
     */
    @JsonIgnore
    public Collection <PlantillaEmail> getPlantillas() {
        return plantillas;
    }

    /**
     * Gets the value of relation through role Novedades
     */
    @JsonIgnore
    public Collection <Novedad> getNovedades() {
        return novedades;
    }

    /**
     * Gets the value of relation through role GrupoAsesores
     */
    @JsonIgnore
    public GrupoAsignacion getGrupoAsesores() {
        return grupoAsesores;
    }

    /**
     * Gets the value of relation through role GrupoAreaMedica
     */
    @JsonIgnore
    public GrupoAsignacion getGrupoAreaMedica() {
        return grupoAreaMedica;
    }

    /**
     * Gets the value of relation through role DominiosIncompatibles
     */
    @JsonIgnore
    public Collection <Dominio> getDominiosIncompatibles() {
        return dominiosIncompatibles;
    }

    /**
     * Default constructor
     */
    public Dominio() {
        dominioNumero = null;
    }

    /**
     * Constructor used to create instances of <code>Dominio</code>.
     * @param oid Object Identifier of the instance of <code>Dominio</code> to be created.
     * @throws SystemException
     */
    public Dominio(DominioOid oid) {
        if (oid != null && !oid.isNull()) {
            dominioNumero = oid.getDominioNumero();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return Dominio.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Dominio other = (Dominio)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getDominioNumero(), other.getDominioNumero());
        result &= Utilities.isEqual(this.getDominioReqCuesMed(), other.getDominioReqCuesMed());
        result &= Utilities.isEqual(this.getDominioNoCuesMedTras(), other.getDominioNoCuesMedTras());
        result &= Utilities.isEqual(this.getDominioNuevaAfiliacion(), other.getDominioNuevaAfiliacion());
        result &= Utilities.isEqual(this.getDominioInclusion(), other.getDominioInclusion());
        result &= Utilities.isEqual(this.getDominioAcepCuesMat(), other.getDominioAcepCuesMat());
        result &= Utilities.isEqual(this.getDominioAcepCuesNeo(), other.getDominioAcepCuesNeo());
        result &= Utilities.isEqual(this.getDominioAcepBBGestante(), other.getDominioAcepBBGestante());
        result &= Utilities.isEqual(this.getDominioMostrarPreexAnexos(), other.getDominioMostrarPreexAnexos());
        result &= Utilities.isEqual(this.getDominioMostrarPreexContrato(), other.getDominioMostrarPreexContrato());
        result &= Utilities.isEqual(this.getDominioIgnorarPreexistencias(), other.getDominioIgnorarPreexistencias());
        result &= Utilities.isEqual(this.getDominioRespClauNombre(), other.getDominioRespClauNombre());
        result &= Utilities.isEqual(this.getDominioRespClauCelula(), other.getDominioRespClauCelula());
        result &= Utilities.isEqual(this.getDominioRespClauExpCelula(), other.getDominioRespClauExpCelula());
        result &= Utilities.isEqual(this.getDominioRespClauCargo(), other.getDominioRespClauCargo());
        result &= Utilities.isEqual(this.getDominioRespClauFirma(), other.getDominioRespClauFirma());
        result &= Utilities.isEqual(this.getDominioDiaIniVigencia(), other.getDominioDiaIniVigencia());
        result &= Utilities.isEqual(this.getDominioDiaFinVigencia(), other.getDominioDiaFinVigencia());
        result &= Utilities.isEqual(this.getDominioDiasCaducidad(), other.getDominioDiasCaducidad());
        result &= Utilities.isEqual(this.getDominioProrrateoUsuExistente(), other.getDominioProrrateoUsuExistente());
        result &= Utilities.isEqual(this.getDominioInclusionModGrupoAsoc(), other.getDominioInclusionModGrupoAsoc());
        result &= Utilities.isEqual(this.getDominioPermiteRechazadosAfi(), other.getDominioPermiteRechazadosAfi());
        result &= Utilities.isEqual(this.getDominioAcepPolizaInter(), other.getDominioAcepPolizaInter());
        result &= Utilities.isEqual(this.getDominioNovExcepcionReqDoc(), other.getDominioNovExcepcionReqDoc());
        result &= Utilities.isEqual(this.getDominioSolNovColorOscuro(), other.getDominioSolNovColorOscuro());
        result &= Utilities.isEqual(this.getDominioSolNovColorClaro(), other.getDominioSolNovColorClaro());
        result &= Utilities.isEqual(this.getDominioSolNovLogo(), other.getDominioSolNovLogo());
        result &= Utilities.isEqual(this.getDominioTramiteEnLinea(), other.getDominioTramiteEnLinea());
        result &= Utilities.isEqual(this.getDominioVigenciaRadicacion(), other.getDominioVigenciaRadicacion());
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
     * Returns the <code>DominioOid</code> object that identifies this instance of <code>Dominio</code>.
     * @return <code>DominioOid</code> object that identifies this instance of <code>Dominio</code>
     */
	@Override
    public DominioOid getOid() {
        return new DominioOid(getDominioNumero());
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
        if (!activeFacets.contains(Constants.DOMINIO)) {
            activeFacets.add(Constants.DOMINIO);
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
            relatedInstance = buildDominioRelatedInstance(relatedInstanceJsonOid);
        }
        if (DominioConstants.ROLE_NAME_DOMINIOSCONINCOMPATIBILIDAD.equalsIgnoreCase(relatedInstancePathFirstItem) || DominioConstants.ROLE_NAME_DOMINIOSINCOMPATIBLES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDominioRelatedInstance4Dominio(relatedInstanceJsonOid, remainingPath);
        }
        if (DominioConstants.ROLE_NAME_PARENTESCOSDOM.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDominioRelatedInstance4ParentescoDom(relatedInstanceJsonOid, remainingPath);
        }
        if (DominioConstants.ROLE_NAME_AGENTEXPRODUCTO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDominioRelatedInstance4AgentexProducto(relatedInstanceJsonOid, remainingPath);
        }
        if (DominioConstants.ROLE_NAME_PRORRATEOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDominioRelatedInstance4Prorrateo(relatedInstanceJsonOid, remainingPath);
        }
        if (DominioConstants.ROLE_NAME_LOGGRUPOSUSUARIOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDominioRelatedInstance4LogGruposUsuarios(relatedInstanceJsonOid, remainingPath);
        }
        if (DominioConstants.ROLE_NAME_GRUPOASIGNACIONNOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDominioRelatedInstance4GrupoAsignacionNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (DominioConstants.ROLE_NAME_CONFIGURACIONESANS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDominioRelatedInstance4ConfiguracionANS(relatedInstanceJsonOid, remainingPath);
        }
        if (DominioConstants.ROLE_NAME_REPORTESDOMINIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDominioRelatedInstance4ReportesDominio(relatedInstanceJsonOid, remainingPath);
        }
        if (DominioConstants.ROLE_NAME_LOGINCOMPATIBILIDADES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDominioRelatedInstance4LogIncompatibilidades(relatedInstanceJsonOid, remainingPath);
        }
        if (DominioConstants.ROLE_NAME_LOGDATOSDOMINIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDominioRelatedInstance4LogDatosDominio(relatedInstanceJsonOid, remainingPath);
        }
        if (DominioConstants.ROLE_NAME_PLANT.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDominioRelatedInstance4Planes(relatedInstanceJsonOid, remainingPath);
        }
        if (DominioConstants.ROLE_NAME_PRODUCTOT.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDominioRelatedInstance4Productos(relatedInstanceJsonOid, remainingPath);
        }
        if (DominioConstants.ROLE_NAME_PERIODICIDADES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDominioRelatedInstance4Periodicidad(relatedInstanceJsonOid, remainingPath);
        }
        if (DominioConstants.ROLE_NAME_ROLES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDominioRelatedInstance4Rol(relatedInstanceJsonOid, remainingPath);
        }
        if (DominioConstants.ROLE_NAME_FORMASPAGO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDominioRelatedInstance4FormaPago(relatedInstanceJsonOid, remainingPath);
        }
        if (DominioConstants.ROLE_NAME_PLANTILLAS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDominioRelatedInstance4PlantillaEmail(relatedInstanceJsonOid, remainingPath);
        }
        if (DominioConstants.ROLE_NAME_NOVEDADES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDominioRelatedInstance4Novedad(relatedInstanceJsonOid, remainingPath);
        }
        if (DominioConstants.ROLE_NAME_GRUPOASESORES.equalsIgnoreCase(relatedInstancePathFirstItem) || DominioConstants.ROLE_NAME_GRUPOAREAMEDICA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildDominioRelatedInstance4GrupoAsignacion(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildDominioRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Dominio(mapper.readValue(relatedInstanceJsonOid, DominioOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Dominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDominioRelatedInstance4Dominio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Dominio(mapper.readValue(relatedInstanceJsonOid, DominioOid.class)): Dominio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Dominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDominioRelatedInstance4ParentescoDom(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ParentescoDom(mapper.readValue(relatedInstanceJsonOid, ParentescoDomOid.class)): ParentescoDom.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Dominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDominioRelatedInstance4AgentexProducto(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new AgentexProducto(mapper.readValue(relatedInstanceJsonOid, AgentexProductoOid.class)): AgentexProducto.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Dominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDominioRelatedInstance4Prorrateo(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Prorrateo(mapper.readValue(relatedInstanceJsonOid, ProrrateoOid.class)): Prorrateo.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Dominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDominioRelatedInstance4LogGruposUsuarios(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new LogGruposUsuarios(mapper.readValue(relatedInstanceJsonOid, LogGruposUsuariosOid.class)): LogGruposUsuarios.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Dominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDominioRelatedInstance4GrupoAsignacionNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new GrupoAsignacionNovedad(mapper.readValue(relatedInstanceJsonOid, GrupoAsignacionNovedadOid.class)): GrupoAsignacionNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Dominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDominioRelatedInstance4ConfiguracionANS(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ConfiguracionANS(mapper.readValue(relatedInstanceJsonOid, ConfiguracionANSOid.class)): ConfiguracionANS.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Dominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDominioRelatedInstance4ReportesDominio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ReportesDominio(mapper.readValue(relatedInstanceJsonOid, ReportesDominioOid.class)): ReportesDominio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Dominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDominioRelatedInstance4LogIncompatibilidades(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new LogIncompatibilidades(mapper.readValue(relatedInstanceJsonOid, LogIncompatibilidadesOid.class)): LogIncompatibilidades.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Dominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDominioRelatedInstance4LogDatosDominio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new LogDatosDominio(mapper.readValue(relatedInstanceJsonOid, LogDatosDominioOid.class)): LogDatosDominio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Dominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDominioRelatedInstance4Planes(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Planes(mapper.readValue(relatedInstanceJsonOid, PlanesOid.class)): Planes.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Dominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDominioRelatedInstance4Productos(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Productos(mapper.readValue(relatedInstanceJsonOid, ProductosOid.class)): Productos.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Dominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDominioRelatedInstance4Periodicidad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Periodicidad(mapper.readValue(relatedInstanceJsonOid, PeriodicidadOid.class)): Periodicidad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Dominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDominioRelatedInstance4Rol(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Rol(mapper.readValue(relatedInstanceJsonOid, RolOid.class)): Rol.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Dominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDominioRelatedInstance4FormaPago(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new FormaPago(mapper.readValue(relatedInstanceJsonOid, FormaPagoOid.class)): FormaPago.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Dominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDominioRelatedInstance4PlantillaEmail(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PlantillaEmail(mapper.readValue(relatedInstanceJsonOid, PlantillaEmailOid.class)): PlantillaEmail.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Dominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDominioRelatedInstance4Novedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Novedad(mapper.readValue(relatedInstanceJsonOid, NovedadOid.class)): Novedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Dominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildDominioRelatedInstance4GrupoAsignacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new GrupoAsignacion(mapper.readValue(relatedInstanceJsonOid, GrupoAsignacionOid.class)): GrupoAsignacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Dominio.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
