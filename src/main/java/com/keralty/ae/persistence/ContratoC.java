package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.ContratoCConstants;
import com.keralty.ae.persistence.oid.AsesorOid;
import com.keralty.ae.persistence.oid.BeneficiarioCOid;
import com.keralty.ae.persistence.oid.ContratoCOid;
import com.keralty.ae.persistence.oid.DireccionCOid;
import com.keralty.ae.persistence.oid.EstadoContratoOid;
import com.keralty.ae.persistence.oid.FamiliaCOid;
import com.keralty.ae.persistence.oid.FormaPagoOid;
import com.keralty.ae.persistence.oid.GrupoAsociadoOid;
import com.keralty.ae.persistence.oid.MunicipioOid;
import com.keralty.ae.persistence.oid.ObservacionesCOid;
import com.keralty.ae.persistence.oid.PeriodicidadOid;
import com.keralty.ae.persistence.oid.PersonaCOid;
import com.keralty.ae.persistence.oid.PlanesOid;
import com.keralty.ae.persistence.oid.ProductosOid;
import com.keralty.ae.persistence.oid.SolicitudOid;
import com.keralty.ae.persistence.oid.SucursalOid;
import com.keralty.ae.persistence.oid.TarifaOid;
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
 * Representation of the <code>ContratoC</code> external model class.
 * <p>
 * External Model Class: <code>ContratoC</code><br>
 */
public class ContratoC extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id")
    private Long contratoCID;

    @JsonProperty(value="numcontrato")
    private String contratoCNumContrato;

    @JsonProperty(value="numsolicitud")
    private String contratoCNumSolicitud;

    @JsonProperty(value="fechasolicitud")
    private Date contratoCFechaSolicitud;

    @JsonProperty(value="tipocontrato")
    private Long contratoCTipoContrato;

    @JsonProperty(value="fechainivigencia")
    private Date contratoCFechaIniVigencia;

    @JsonProperty(value="fechafinvigencia")
    private Date contratoCFechaFinVigencia;

    @JsonProperty(value="direccion")
    private String contratoCDireccion;

    @JsonProperty(value="correocontratante")
    private String contratoCcorreoContratante;

    @JsonProperty(value="numtelcontratante")
    private String contratoCnumTelContratante;

    @JsonProperty(value="numcelcontratante")
    private String contratoCnumCelContratante;

    @JsonProperty(value="exentoiva")
    private String contratoCexentoIVA;

    @JsonProperty(value="contratoconfirma")
    private Boolean contratoCContratoConFirma;

    @JsonProperty(value="valorcuotaperiodo")
    private Double contratoCvalorCuotaPeriodo;

    @JsonProperty(value="descuentocomercial")
    private Double contratoCdescuentoComercial;

    @JsonProperty(value="iva")
    private Double contratoCIVA;

    @JsonProperty(value="descuentofinanciero")
    private Double contratoCdescuentoFinanciero;

    @JsonProperty(value="drvtipocontrato")
    private String contratoCdrvTipoContrato;

    @JsonProperty(value="drvnumpagos")
    private Long contratoCdrvNumPagos;

    @JsonProperty(value="drvvalorinicialcontrato")
    private Double contratoCdrvValorInicialContrato;

    @JsonProperty(value="drvvalorcuotaafiliacion")
    private Double contratoCdrvValorCuotaAfiliacion;

    @JsonProperty(value="drvvalorinicialcontratobbges")
    private Double contratoCdrvValorInicialContratoBBGes;

    @JsonProperty(value="contratonotificado")
    private Boolean contratoCcontratoNotificado;

    @JsonProperty(value="ultimaactualizacion")
    private Timestamp contratoCUltimaActualizacion;

    @JsonProperty(value="drvvalorcuotabruta")
    private Double contratoCdrvValorCuotaBruta;

    @JsonProperty(value="codtarifa")
    private String contratoCCodTarifa;

    @JsonProperty(value="drvmostrarpreenrepanexo")
    private Boolean contratoCdrvMostrarPreEnRepAnexo;

    @JsonProperty(value="drvmostrarpreenrepcon")
    private Boolean contratoCdrvMostrarPreEnRepCon;

    @JsonProperty(value="drvnumfamilia")
    private String contratoCdrvNumFamilia;

    private Collection <Solicitud> solicitud;

    private PersonaC personaCContratante;

    private Collection <DireccionC> direccionesC;

    private Collection <ObservacionesC> observacionesC;

    private Collection <BeneficiarioC> beneficiariosC;

    private Collection <FamiliaC> familiasC;

    private Periodicidad periodicidadC;

    private FormaPago formaPagoC;

    private EstadoContrato estadoContratoC;

    private Productos productoC;

    private Planes planC;

    private Tarifa tarifaC;

    private GrupoAsociado grupoAsociadoC;

    private Municipio municipioC;

    private Sucursal sucursalC;

    private Asesor asesorC;

    /**
     * Gets the value of attribute ID
     */
    public Long getContratoCID() {
        return contratoCID;
    }
    
    /**
     * Sets the value of attribute ID
     */
    public void setContratoCID(Long contratoCID) {
        this.contratoCID = contratoCID;
    }

    /**
     * Gets the value of attribute NumContrato
     */
    public String getContratoCNumContrato() {
        return contratoCNumContrato;
    }
    
    /**
     * Sets the value of attribute NumContrato
     */
    public void setContratoCNumContrato(String contratoCNumContrato) {
        this.contratoCNumContrato = contratoCNumContrato;
    }

    /**
     * Gets the value of attribute NumSolicitud
     */
    public String getContratoCNumSolicitud() {
        return contratoCNumSolicitud;
    }
    
    /**
     * Sets the value of attribute NumSolicitud
     */
    public void setContratoCNumSolicitud(String contratoCNumSolicitud) {
        this.contratoCNumSolicitud = contratoCNumSolicitud;
    }

    /**
     * Gets the value of attribute FechaSolicitud
     */
    public Date getContratoCFechaSolicitud() {
        return contratoCFechaSolicitud;
    }
    
    /**
     * Sets the value of attribute FechaSolicitud
     */
    public void setContratoCFechaSolicitud(Date contratoCFechaSolicitud) {
        this.contratoCFechaSolicitud = contratoCFechaSolicitud;
    }

    /**
     * Gets the value of attribute TipoContrato
     */
    public Long getContratoCTipoContrato() {
        return contratoCTipoContrato;
    }
    
    /**
     * Sets the value of attribute TipoContrato
     */
    public void setContratoCTipoContrato(Long contratoCTipoContrato) {
        this.contratoCTipoContrato = contratoCTipoContrato;
    }

    /**
     * Gets the value of attribute FechaIniVigencia
     */
    public Date getContratoCFechaIniVigencia() {
        return contratoCFechaIniVigencia;
    }
    
    /**
     * Sets the value of attribute FechaIniVigencia
     */
    public void setContratoCFechaIniVigencia(Date contratoCFechaIniVigencia) {
        this.contratoCFechaIniVigencia = contratoCFechaIniVigencia;
    }

    /**
     * Gets the value of attribute FechaFinVigencia
     */
    public Date getContratoCFechaFinVigencia() {
        return contratoCFechaFinVigencia;
    }
    
    /**
     * Sets the value of attribute FechaFinVigencia
     */
    public void setContratoCFechaFinVigencia(Date contratoCFechaFinVigencia) {
        this.contratoCFechaFinVigencia = contratoCFechaFinVigencia;
    }

    /**
     * Gets the value of attribute Direccion
     */
    public String getContratoCDireccion() {
        return contratoCDireccion;
    }
    
    /**
     * Sets the value of attribute Direccion
     */
    public void setContratoCDireccion(String contratoCDireccion) {
        this.contratoCDireccion = contratoCDireccion;
    }

    /**
     * Gets the value of attribute correoContratante
     */
    public String getContratoCcorreoContratante() {
        return contratoCcorreoContratante;
    }
    
    /**
     * Sets the value of attribute correoContratante
     */
    public void setContratoCcorreoContratante(String contratoCcorreoContratante) {
        this.contratoCcorreoContratante = contratoCcorreoContratante;
    }

    /**
     * Gets the value of attribute numTelContratante
     */
    public String getContratoCnumTelContratante() {
        return contratoCnumTelContratante;
    }
    
    /**
     * Sets the value of attribute numTelContratante
     */
    public void setContratoCnumTelContratante(String contratoCnumTelContratante) {
        this.contratoCnumTelContratante = contratoCnumTelContratante;
    }

    /**
     * Gets the value of attribute numCelContratante
     */
    public String getContratoCnumCelContratante() {
        return contratoCnumCelContratante;
    }
    
    /**
     * Sets the value of attribute numCelContratante
     */
    public void setContratoCnumCelContratante(String contratoCnumCelContratante) {
        this.contratoCnumCelContratante = contratoCnumCelContratante;
    }

    /**
     * Gets the value of attribute exentoIVA
     */
    public String getContratoCexentoIVA() {
        return contratoCexentoIVA;
    }
    
    /**
     * Sets the value of attribute exentoIVA
     */
    public void setContratoCexentoIVA(String contratoCexentoIVA) {
        this.contratoCexentoIVA = contratoCexentoIVA;
    }

    /**
     * Gets the value of attribute ContratoConFirma
     */
    public Boolean getContratoCContratoConFirma() {
        return contratoCContratoConFirma;
    }
    
    /**
     * Sets the value of attribute ContratoConFirma
     */
    public void setContratoCContratoConFirma(Boolean contratoCContratoConFirma) {
        this.contratoCContratoConFirma = contratoCContratoConFirma;
    }

    /**
     * Gets the value of attribute valorCuotaPeriodo
     */
    public Double getContratoCvalorCuotaPeriodo() {
        return contratoCvalorCuotaPeriodo;
    }
    
    /**
     * Sets the value of attribute valorCuotaPeriodo
     */
    public void setContratoCvalorCuotaPeriodo(Double contratoCvalorCuotaPeriodo) {
        this.contratoCvalorCuotaPeriodo = contratoCvalorCuotaPeriodo;
    }

    /**
     * Gets the value of attribute descuentoComercial
     */
    public Double getContratoCdescuentoComercial() {
        return contratoCdescuentoComercial;
    }
    
    /**
     * Sets the value of attribute descuentoComercial
     */
    public void setContratoCdescuentoComercial(Double contratoCdescuentoComercial) {
        this.contratoCdescuentoComercial = contratoCdescuentoComercial;
    }

    /**
     * Gets the value of attribute IVA
     */
    public Double getContratoCIVA() {
        return contratoCIVA;
    }
    
    /**
     * Sets the value of attribute IVA
     */
    public void setContratoCIVA(Double contratoCIVA) {
        this.contratoCIVA = contratoCIVA;
    }

    /**
     * Gets the value of attribute descuentoFinanciero
     */
    public Double getContratoCdescuentoFinanciero() {
        return contratoCdescuentoFinanciero;
    }
    
    /**
     * Sets the value of attribute descuentoFinanciero
     */
    public void setContratoCdescuentoFinanciero(Double contratoCdescuentoFinanciero) {
        this.contratoCdescuentoFinanciero = contratoCdescuentoFinanciero;
    }

    /**
     * Gets the value of attribute drvTipoContrato
     */
    public String getContratoCdrvTipoContrato() {
        return contratoCdrvTipoContrato;
    }
    
    /**
     * Sets the value of attribute drvTipoContrato
     */
    public void setContratoCdrvTipoContrato(String contratoCdrvTipoContrato) {
        this.contratoCdrvTipoContrato = contratoCdrvTipoContrato;
    }

    /**
     * Gets the value of attribute drvNumPagos
     */
    public Long getContratoCdrvNumPagos() {
        return contratoCdrvNumPagos;
    }
    
    /**
     * Sets the value of attribute drvNumPagos
     */
    public void setContratoCdrvNumPagos(Long contratoCdrvNumPagos) {
        this.contratoCdrvNumPagos = contratoCdrvNumPagos;
    }

    /**
     * Gets the value of attribute drvValorInicialContrato
     */
    public Double getContratoCdrvValorInicialContrato() {
        return contratoCdrvValorInicialContrato;
    }
    
    /**
     * Sets the value of attribute drvValorInicialContrato
     */
    public void setContratoCdrvValorInicialContrato(Double contratoCdrvValorInicialContrato) {
        this.contratoCdrvValorInicialContrato = contratoCdrvValorInicialContrato;
    }

    /**
     * Gets the value of attribute drvValorCuotaAfiliacion
     */
    public Double getContratoCdrvValorCuotaAfiliacion() {
        return contratoCdrvValorCuotaAfiliacion;
    }
    
    /**
     * Sets the value of attribute drvValorCuotaAfiliacion
     */
    public void setContratoCdrvValorCuotaAfiliacion(Double contratoCdrvValorCuotaAfiliacion) {
        this.contratoCdrvValorCuotaAfiliacion = contratoCdrvValorCuotaAfiliacion;
    }

    /**
     * Gets the value of attribute drvValorInicialContratoBBGes
     */
    public Double getContratoCdrvValorInicialContratoBBGes() {
        return contratoCdrvValorInicialContratoBBGes;
    }
    
    /**
     * Sets the value of attribute drvValorInicialContratoBBGes
     */
    public void setContratoCdrvValorInicialContratoBBGes(Double contratoCdrvValorInicialContratoBBGes) {
        this.contratoCdrvValorInicialContratoBBGes = contratoCdrvValorInicialContratoBBGes;
    }

    /**
     * Gets the value of attribute contratoNotificado
     */
    public Boolean getContratoCcontratoNotificado() {
        return contratoCcontratoNotificado;
    }
    
    /**
     * Sets the value of attribute contratoNotificado
     */
    public void setContratoCcontratoNotificado(Boolean contratoCcontratoNotificado) {
        this.contratoCcontratoNotificado = contratoCcontratoNotificado;
    }

    /**
     * Gets the value of attribute UltimaActualizacion
     */
    public Timestamp getContratoCUltimaActualizacion() {
        return contratoCUltimaActualizacion;
    }
    
    /**
     * Sets the value of attribute UltimaActualizacion
     */
    public void setContratoCUltimaActualizacion(Timestamp contratoCUltimaActualizacion) {
        this.contratoCUltimaActualizacion = contratoCUltimaActualizacion;
    }

    /**
     * Gets the value of attribute drvValorCuotaBruta
     */
    public Double getContratoCdrvValorCuotaBruta() {
        return contratoCdrvValorCuotaBruta;
    }
    
    /**
     * Sets the value of attribute drvValorCuotaBruta
     */
    public void setContratoCdrvValorCuotaBruta(Double contratoCdrvValorCuotaBruta) {
        this.contratoCdrvValorCuotaBruta = contratoCdrvValorCuotaBruta;
    }

    /**
     * Gets the value of attribute CodTarifa
     */
    public String getContratoCCodTarifa() {
        return contratoCCodTarifa;
    }
    
    /**
     * Sets the value of attribute CodTarifa
     */
    public void setContratoCCodTarifa(String contratoCCodTarifa) {
        this.contratoCCodTarifa = contratoCCodTarifa;
    }

    /**
     * Gets the value of attribute drvMostrarPreEnRepAnexo
     */
    public Boolean getContratoCdrvMostrarPreEnRepAnexo() {
        return contratoCdrvMostrarPreEnRepAnexo;
    }
    
    /**
     * Sets the value of attribute drvMostrarPreEnRepAnexo
     */
    public void setContratoCdrvMostrarPreEnRepAnexo(Boolean contratoCdrvMostrarPreEnRepAnexo) {
        this.contratoCdrvMostrarPreEnRepAnexo = contratoCdrvMostrarPreEnRepAnexo;
    }

    /**
     * Gets the value of attribute drvMostrarPreEnRepCon
     */
    public Boolean getContratoCdrvMostrarPreEnRepCon() {
        return contratoCdrvMostrarPreEnRepCon;
    }
    
    /**
     * Sets the value of attribute drvMostrarPreEnRepCon
     */
    public void setContratoCdrvMostrarPreEnRepCon(Boolean contratoCdrvMostrarPreEnRepCon) {
        this.contratoCdrvMostrarPreEnRepCon = contratoCdrvMostrarPreEnRepCon;
    }

    /**
     * Gets the value of attribute drvNumFamilia
     */
    public String getContratoCdrvNumFamilia() {
        return contratoCdrvNumFamilia;
    }
    
    /**
     * Sets the value of attribute drvNumFamilia
     */
    public void setContratoCdrvNumFamilia(String contratoCdrvNumFamilia) {
        this.contratoCdrvNumFamilia = contratoCdrvNumFamilia;
    }

    /**
     * Gets the value of relation through role Solicitud
     */
    @JsonIgnore
    public Collection <Solicitud> getSolicitud() {
        return solicitud;
    }

    /**
     * Gets the value of relation through role PersonaCContratante
     */
    @JsonIgnore
    public PersonaC getPersonaCContratante() {
        return personaCContratante;
    }

    /**
     * Gets the value of relation through role DireccionesC
     */
    @JsonIgnore
    public Collection <DireccionC> getDireccionesC() {
        return direccionesC;
    }

    /**
     * Gets the value of relation through role ObservacionesC
     */
    @JsonIgnore
    public Collection <ObservacionesC> getObservacionesC() {
        return observacionesC;
    }

    /**
     * Gets the value of relation through role BeneficiariosC
     */
    @JsonIgnore
    public Collection <BeneficiarioC> getBeneficiariosC() {
        return beneficiariosC;
    }

    /**
     * Gets the value of relation through role FamiliasC
     */
    @JsonIgnore
    public Collection <FamiliaC> getFamiliasC() {
        return familiasC;
    }

    /**
     * Gets the value of relation through role PeriodicidadC
     */
    @JsonIgnore
    public Periodicidad getPeriodicidadC() {
        return periodicidadC;
    }

    /**
     * Gets the value of relation through role FormaPagoC
     */
    @JsonIgnore
    public FormaPago getFormaPagoC() {
        return formaPagoC;
    }

    /**
     * Gets the value of relation through role EstadoContratoC
     */
    @JsonIgnore
    public EstadoContrato getEstadoContratoC() {
        return estadoContratoC;
    }

    /**
     * Gets the value of relation through role ProductoC
     */
    @JsonIgnore
    public Productos getProductoC() {
        return productoC;
    }

    /**
     * Gets the value of relation through role PlanC
     */
    @JsonIgnore
    public Planes getPlanC() {
        return planC;
    }

    /**
     * Gets the value of relation through role TarifaC
     */
    @JsonIgnore
    public Tarifa getTarifaC() {
        return tarifaC;
    }

    /**
     * Gets the value of relation through role GrupoAsociadoC
     */
    @JsonIgnore
    public GrupoAsociado getGrupoAsociadoC() {
        return grupoAsociadoC;
    }

    /**
     * Gets the value of relation through role MunicipioC
     */
    @JsonIgnore
    public Municipio getMunicipioC() {
        return municipioC;
    }

    /**
     * Gets the value of relation through role SucursalC
     */
    @JsonIgnore
    public Sucursal getSucursalC() {
        return sucursalC;
    }

    /**
     * Gets the value of relation through role AsesorC
     */
    @JsonIgnore
    public Asesor getAsesorC() {
        return asesorC;
    }

    /**
     * Default constructor
     */
    public ContratoC() {
        contratoCID = null;
    }

    /**
     * Constructor used to create instances of <code>ContratoC</code>.
     * @param oid Object Identifier of the instance of <code>ContratoC</code> to be created.
     * @throws SystemException
     */
    public ContratoC(ContratoCOid oid) {
        if (oid != null && !oid.isNull()) {
            contratoCID = oid.getContratoCID();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return ContratoC.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        ContratoC other = (ContratoC)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getContratoCID(), other.getContratoCID());
        result &= Utilities.isEqual(this.getContratoCNumContrato(), other.getContratoCNumContrato());
        result &= Utilities.isEqual(this.getContratoCNumSolicitud(), other.getContratoCNumSolicitud());
        result &= Utilities.isEqual(this.getContratoCFechaSolicitud(), other.getContratoCFechaSolicitud());
        result &= Utilities.isEqual(this.getContratoCTipoContrato(), other.getContratoCTipoContrato());
        result &= Utilities.isEqual(this.getContratoCFechaIniVigencia(), other.getContratoCFechaIniVigencia());
        result &= Utilities.isEqual(this.getContratoCFechaFinVigencia(), other.getContratoCFechaFinVigencia());
        result &= Utilities.isEqual(this.getContratoCDireccion(), other.getContratoCDireccion());
        result &= Utilities.isEqual(this.getContratoCcorreoContratante(), other.getContratoCcorreoContratante());
        result &= Utilities.isEqual(this.getContratoCnumTelContratante(), other.getContratoCnumTelContratante());
        result &= Utilities.isEqual(this.getContratoCnumCelContratante(), other.getContratoCnumCelContratante());
        result &= Utilities.isEqual(this.getContratoCexentoIVA(), other.getContratoCexentoIVA());
        result &= Utilities.isEqual(this.getContratoCContratoConFirma(), other.getContratoCContratoConFirma());
        result &= Utilities.isEqual(this.getContratoCvalorCuotaPeriodo(), other.getContratoCvalorCuotaPeriodo());
        result &= Utilities.isEqual(this.getContratoCdescuentoComercial(), other.getContratoCdescuentoComercial());
        result &= Utilities.isEqual(this.getContratoCIVA(), other.getContratoCIVA());
        result &= Utilities.isEqual(this.getContratoCdescuentoFinanciero(), other.getContratoCdescuentoFinanciero());
        result &= Utilities.isEqual(this.getContratoCdrvTipoContrato(), other.getContratoCdrvTipoContrato());
        result &= Utilities.isEqual(this.getContratoCdrvNumPagos(), other.getContratoCdrvNumPagos());
        result &= Utilities.isEqual(this.getContratoCdrvValorInicialContrato(), other.getContratoCdrvValorInicialContrato());
        result &= Utilities.isEqual(this.getContratoCdrvValorCuotaAfiliacion(), other.getContratoCdrvValorCuotaAfiliacion());
        result &= Utilities.isEqual(this.getContratoCdrvValorInicialContratoBBGes(), other.getContratoCdrvValorInicialContratoBBGes());
        result &= Utilities.isEqual(this.getContratoCcontratoNotificado(), other.getContratoCcontratoNotificado());
        result &= Utilities.isEqual(this.getContratoCUltimaActualizacion(), other.getContratoCUltimaActualizacion());
        result &= Utilities.isEqual(this.getContratoCdrvValorCuotaBruta(), other.getContratoCdrvValorCuotaBruta());
        result &= Utilities.isEqual(this.getContratoCCodTarifa(), other.getContratoCCodTarifa());
        result &= Utilities.isEqual(this.getContratoCdrvMostrarPreEnRepAnexo(), other.getContratoCdrvMostrarPreEnRepAnexo());
        result &= Utilities.isEqual(this.getContratoCdrvMostrarPreEnRepCon(), other.getContratoCdrvMostrarPreEnRepCon());
        result &= Utilities.isEqual(this.getContratoCdrvNumFamilia(), other.getContratoCdrvNumFamilia());
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
     * Returns the <code>ContratoCOid</code> object that identifies this instance of <code>ContratoC</code>.
     * @return <code>ContratoCOid</code> object that identifies this instance of <code>ContratoC</code>
     */
	@Override
    public ContratoCOid getOid() {
        return new ContratoCOid(getContratoCID());
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
        if (!activeFacets.contains(Constants.CONTRATOC)) {
            activeFacets.add(Constants.CONTRATOC);
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
            relatedInstance = buildContratoCRelatedInstance(relatedInstanceJsonOid);
        }
        if (ContratoCConstants.ROLE_NAME_SOLICITUD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildContratoCRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        if (ContratoCConstants.ROLE_NAME_PERSONACCONTRATANTE.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildContratoCRelatedInstance4PersonaC(relatedInstanceJsonOid, remainingPath);
        }
        if (ContratoCConstants.ROLE_NAME_DIRECCIONESC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildContratoCRelatedInstance4DireccionC(relatedInstanceJsonOid, remainingPath);
        }
        if (ContratoCConstants.ROLE_NAME_OBSERVACIONESC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildContratoCRelatedInstance4ObservacionesC(relatedInstanceJsonOid, remainingPath);
        }
        if (ContratoCConstants.ROLE_NAME_BENEFICIARIOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildContratoCRelatedInstance4BeneficiarioC(relatedInstanceJsonOid, remainingPath);
        }
        if (ContratoCConstants.ROLE_NAME_FAMILIASC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildContratoCRelatedInstance4FamiliaC(relatedInstanceJsonOid, remainingPath);
        }
        if (ContratoCConstants.ROLE_NAME_PERIODICIDADC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildContratoCRelatedInstance4Periodicidad(relatedInstanceJsonOid, remainingPath);
        }
        if (ContratoCConstants.ROLE_NAME_FORMAPAGOC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildContratoCRelatedInstance4FormaPago(relatedInstanceJsonOid, remainingPath);
        }
        if (ContratoCConstants.ROLE_NAME_ESTADOCONTRATOC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildContratoCRelatedInstance4EstadoContrato(relatedInstanceJsonOid, remainingPath);
        }
        if (ContratoCConstants.ROLE_NAME_PRODUCTOC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildContratoCRelatedInstance4Productos(relatedInstanceJsonOid, remainingPath);
        }
        if (ContratoCConstants.ROLE_NAME_PLANC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildContratoCRelatedInstance4Planes(relatedInstanceJsonOid, remainingPath);
        }
        if (ContratoCConstants.ROLE_NAME_TARIFAC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildContratoCRelatedInstance4Tarifa(relatedInstanceJsonOid, remainingPath);
        }
        if (ContratoCConstants.ROLE_NAME_GRUPOASOCIADOC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildContratoCRelatedInstance4GrupoAsociado(relatedInstanceJsonOid, remainingPath);
        }
        if (ContratoCConstants.ROLE_NAME_MUNICIPIOC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildContratoCRelatedInstance4Municipio(relatedInstanceJsonOid, remainingPath);
        }
        if (ContratoCConstants.ROLE_NAME_SUCURSALC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildContratoCRelatedInstance4Sucursal(relatedInstanceJsonOid, remainingPath);
        }
        if (ContratoCConstants.ROLE_NAME_ASESORC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildContratoCRelatedInstance4Asesor(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildContratoCRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new ContratoC(mapper.readValue(relatedInstanceJsonOid, ContratoCOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ContratoC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildContratoCRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ContratoC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildContratoCRelatedInstance4PersonaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PersonaC(mapper.readValue(relatedInstanceJsonOid, PersonaCOid.class)): PersonaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ContratoC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildContratoCRelatedInstance4DireccionC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new DireccionC(mapper.readValue(relatedInstanceJsonOid, DireccionCOid.class)): DireccionC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ContratoC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildContratoCRelatedInstance4ObservacionesC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ObservacionesC(mapper.readValue(relatedInstanceJsonOid, ObservacionesCOid.class)): ObservacionesC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ContratoC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildContratoCRelatedInstance4BeneficiarioC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new BeneficiarioC(mapper.readValue(relatedInstanceJsonOid, BeneficiarioCOid.class)): BeneficiarioC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ContratoC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildContratoCRelatedInstance4FamiliaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new FamiliaC(mapper.readValue(relatedInstanceJsonOid, FamiliaCOid.class)): FamiliaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ContratoC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildContratoCRelatedInstance4Periodicidad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Periodicidad(mapper.readValue(relatedInstanceJsonOid, PeriodicidadOid.class)): Periodicidad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ContratoC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildContratoCRelatedInstance4FormaPago(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new FormaPago(mapper.readValue(relatedInstanceJsonOid, FormaPagoOid.class)): FormaPago.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ContratoC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildContratoCRelatedInstance4EstadoContrato(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new EstadoContrato(mapper.readValue(relatedInstanceJsonOid, EstadoContratoOid.class)): EstadoContrato.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ContratoC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildContratoCRelatedInstance4Productos(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Productos(mapper.readValue(relatedInstanceJsonOid, ProductosOid.class)): Productos.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ContratoC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildContratoCRelatedInstance4Planes(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Planes(mapper.readValue(relatedInstanceJsonOid, PlanesOid.class)): Planes.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ContratoC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildContratoCRelatedInstance4Tarifa(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Tarifa(mapper.readValue(relatedInstanceJsonOid, TarifaOid.class)): Tarifa.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ContratoC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildContratoCRelatedInstance4GrupoAsociado(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new GrupoAsociado(mapper.readValue(relatedInstanceJsonOid, GrupoAsociadoOid.class)): GrupoAsociado.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ContratoC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildContratoCRelatedInstance4Municipio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Municipio(mapper.readValue(relatedInstanceJsonOid, MunicipioOid.class)): Municipio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ContratoC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildContratoCRelatedInstance4Sucursal(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Sucursal(mapper.readValue(relatedInstanceJsonOid, SucursalOid.class)): Sucursal.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ContratoC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildContratoCRelatedInstance4Asesor(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Asesor(mapper.readValue(relatedInstanceJsonOid, AsesorOid.class)): Asesor.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ContratoC.class).error(e.getMessage());
            return null;
        }
    }
}
