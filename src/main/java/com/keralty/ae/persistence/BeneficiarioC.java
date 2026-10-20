package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.BeneficiarioCConstants;
import com.keralty.ae.global.Constants;
import com.keralty.ae.persistence.oid.AnexoCOid;
import com.keralty.ae.persistence.oid.BeneficiarioCOid;
import com.keralty.ae.persistence.oid.CompanyiaOid;
import com.keralty.ae.persistence.oid.ConceptoCOid;
import com.keralty.ae.persistence.oid.ContratoCOid;
import com.keralty.ae.persistence.oid.EpsOid;
import com.keralty.ae.persistence.oid.EstadoBeneficiarioOid;
import com.keralty.ae.persistence.oid.FamiliaCOid;
import com.keralty.ae.persistence.oid.ParentescoOid;
import com.keralty.ae.persistence.oid.PersonaCOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>BeneficiarioC</code> external model class.
 * <p>
 * External Model Class: <code>BeneficiarioC</code><br>
 */
public class BeneficiarioC extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="contratoc_id")
    private Long contratoCContratoCID;

    @JsonProperty(value="id")
    private Long beneficiarioCID;

    @JsonProperty(value="numusuario")
    private Long beneficiarioCNumUsuario;

    @JsonProperty(value="codigotipousuario")
    private String beneficiarioCCodigoTipoUsuario;

    @JsonProperty(value="indicadorbbgestacion")
    private Boolean beneficiarioCIndicadorBBGestacion;

    @JsonProperty(value="codusuariobancorep")
    private String beneficiarioCCodUsuarioBancoRep;

    @JsonProperty(value="fechaantiguedad")
    private Date beneficiarioCFechaAntiguedad;

    @JsonProperty(value="requiereexamenmedico")
    private Boolean beneficiarioCRequiereExamenMedico;

    @JsonProperty(value="estadomedico")
    private Long beneficiarioCEstadoMedico;

    @JsonProperty(value="fechaantiguedadrealosi")
    private Date beneficiarioCFechaAntiguedadRealOSI;

    @JsonProperty(value="valorcuotainscripcion")
    private Double beneficiarioCValorCuotaInscripcion;

    @JsonProperty(value="tienepreexistencias")
    private Boolean beneficiarioCTienePreexistencias;

    @JsonProperty(value="fechainiciovigencia")
    private Date beneficiarioCFechaInicioVigencia;

    @JsonProperty(value="fechafinvigencia")
    private Date beneficiarioCFechaFinVigencia;

    @JsonProperty(value="drvvalorinicialcontrato")
    private Double beneficiarioCdrvValorInicialContrato;

    @JsonProperty(value="drvvalorcuotaafiliacion")
    private Double beneficiarioCdrvValorCuotaAfiliacion;

    @JsonProperty(value="drvvalorcuotaperiodo")
    private Double beneficiarioCdrvValorCuotaPeriodo;

    @JsonProperty(value="drvdescuentocomercial")
    private Double beneficiarioCdrvDescuentoComercial;

    @JsonProperty(value="drvdescuentofinanciero")
    private Double beneficiarioCdrvDescuentoFinanciero;

    @JsonProperty(value="drvvalorcuotabruta")
    private Double beneficiarioCdrvValorCuotaBruta;

    @JsonProperty(value="drvtienepreexistencias")
    private Boolean beneficiarioCdrvTienePreexistencias;

    private PersonaC personaC;

    private Collection <AnexoC> anexosC;

    private Collection <ConceptoC> conceptosC;

    private ContratoC contratoC;

    private FamiliaC familiasC;

    private Eps ePSC;

    private Companyia companyiaMPC;

    private Parentesco parentescoC;

    private EstadoBeneficiario estadoBeneficiarioC;

    /**
     * Gets the value of attribute ID
     */
    public Long getContratoCContratoCID() {
        return contratoCContratoCID;
    }
    
    /**
     * Sets the value of attribute ID
     */
    public void setContratoCContratoCID(Long contratoCContratoCID) {
        this.contratoCContratoCID = contratoCContratoCID;
    }

    /**
     * Gets the value of attribute ID
     */
    public Long getBeneficiarioCID() {
        return beneficiarioCID;
    }
    
    /**
     * Sets the value of attribute ID
     */
    public void setBeneficiarioCID(Long beneficiarioCID) {
        this.beneficiarioCID = beneficiarioCID;
    }

    /**
     * Gets the value of attribute NumUsuario
     */
    public Long getBeneficiarioCNumUsuario() {
        return beneficiarioCNumUsuario;
    }
    
    /**
     * Sets the value of attribute NumUsuario
     */
    public void setBeneficiarioCNumUsuario(Long beneficiarioCNumUsuario) {
        this.beneficiarioCNumUsuario = beneficiarioCNumUsuario;
    }

    /**
     * Gets the value of attribute CodigoTipoUsuario
     */
    public String getBeneficiarioCCodigoTipoUsuario() {
        return beneficiarioCCodigoTipoUsuario;
    }
    
    /**
     * Sets the value of attribute CodigoTipoUsuario
     */
    public void setBeneficiarioCCodigoTipoUsuario(String beneficiarioCCodigoTipoUsuario) {
        this.beneficiarioCCodigoTipoUsuario = beneficiarioCCodigoTipoUsuario;
    }

    /**
     * Gets the value of attribute IndicadorBBGestacion
     */
    public Boolean getBeneficiarioCIndicadorBBGestacion() {
        return beneficiarioCIndicadorBBGestacion;
    }
    
    /**
     * Sets the value of attribute IndicadorBBGestacion
     */
    public void setBeneficiarioCIndicadorBBGestacion(Boolean beneficiarioCIndicadorBBGestacion) {
        this.beneficiarioCIndicadorBBGestacion = beneficiarioCIndicadorBBGestacion;
    }

    /**
     * Gets the value of attribute CodUsuarioBancoRep
     */
    public String getBeneficiarioCCodUsuarioBancoRep() {
        return beneficiarioCCodUsuarioBancoRep;
    }
    
    /**
     * Sets the value of attribute CodUsuarioBancoRep
     */
    public void setBeneficiarioCCodUsuarioBancoRep(String beneficiarioCCodUsuarioBancoRep) {
        this.beneficiarioCCodUsuarioBancoRep = beneficiarioCCodUsuarioBancoRep;
    }

    /**
     * Gets the value of attribute FechaAntiguedad
     */
    public Date getBeneficiarioCFechaAntiguedad() {
        return beneficiarioCFechaAntiguedad;
    }
    
    /**
     * Sets the value of attribute FechaAntiguedad
     */
    public void setBeneficiarioCFechaAntiguedad(Date beneficiarioCFechaAntiguedad) {
        this.beneficiarioCFechaAntiguedad = beneficiarioCFechaAntiguedad;
    }

    /**
     * Gets the value of attribute RequiereExamenMedico
     */
    public Boolean getBeneficiarioCRequiereExamenMedico() {
        return beneficiarioCRequiereExamenMedico;
    }
    
    /**
     * Sets the value of attribute RequiereExamenMedico
     */
    public void setBeneficiarioCRequiereExamenMedico(Boolean beneficiarioCRequiereExamenMedico) {
        this.beneficiarioCRequiereExamenMedico = beneficiarioCRequiereExamenMedico;
    }

    /**
     * Gets the value of attribute EstadoMedico
     */
    public Long getBeneficiarioCEstadoMedico() {
        return beneficiarioCEstadoMedico;
    }
    
    /**
     * Sets the value of attribute EstadoMedico
     */
    public void setBeneficiarioCEstadoMedico(Long beneficiarioCEstadoMedico) {
        this.beneficiarioCEstadoMedico = beneficiarioCEstadoMedico;
    }

    /**
     * Gets the value of attribute FechaAntiguedadRealOSI
     */
    public Date getBeneficiarioCFechaAntiguedadRealOSI() {
        return beneficiarioCFechaAntiguedadRealOSI;
    }
    
    /**
     * Sets the value of attribute FechaAntiguedadRealOSI
     */
    public void setBeneficiarioCFechaAntiguedadRealOSI(Date beneficiarioCFechaAntiguedadRealOSI) {
        this.beneficiarioCFechaAntiguedadRealOSI = beneficiarioCFechaAntiguedadRealOSI;
    }

    /**
     * Gets the value of attribute ValorCuotaInscripcion
     */
    public Double getBeneficiarioCValorCuotaInscripcion() {
        return beneficiarioCValorCuotaInscripcion;
    }
    
    /**
     * Sets the value of attribute ValorCuotaInscripcion
     */
    public void setBeneficiarioCValorCuotaInscripcion(Double beneficiarioCValorCuotaInscripcion) {
        this.beneficiarioCValorCuotaInscripcion = beneficiarioCValorCuotaInscripcion;
    }

    /**
     * Gets the value of attribute TienePreexistencias
     */
    public Boolean getBeneficiarioCTienePreexistencias() {
        return beneficiarioCTienePreexistencias;
    }
    
    /**
     * Sets the value of attribute TienePreexistencias
     */
    public void setBeneficiarioCTienePreexistencias(Boolean beneficiarioCTienePreexistencias) {
        this.beneficiarioCTienePreexistencias = beneficiarioCTienePreexistencias;
    }

    /**
     * Gets the value of attribute FechaInicioVigencia
     */
    public Date getBeneficiarioCFechaInicioVigencia() {
        return beneficiarioCFechaInicioVigencia;
    }
    
    /**
     * Sets the value of attribute FechaInicioVigencia
     */
    public void setBeneficiarioCFechaInicioVigencia(Date beneficiarioCFechaInicioVigencia) {
        this.beneficiarioCFechaInicioVigencia = beneficiarioCFechaInicioVigencia;
    }

    /**
     * Gets the value of attribute FechaFinVigencia
     */
    public Date getBeneficiarioCFechaFinVigencia() {
        return beneficiarioCFechaFinVigencia;
    }
    
    /**
     * Sets the value of attribute FechaFinVigencia
     */
    public void setBeneficiarioCFechaFinVigencia(Date beneficiarioCFechaFinVigencia) {
        this.beneficiarioCFechaFinVigencia = beneficiarioCFechaFinVigencia;
    }

    /**
     * Gets the value of attribute drvValorInicialContrato
     */
    public Double getBeneficiarioCdrvValorInicialContrato() {
        return beneficiarioCdrvValorInicialContrato;
    }
    
    /**
     * Sets the value of attribute drvValorInicialContrato
     */
    public void setBeneficiarioCdrvValorInicialContrato(Double beneficiarioCdrvValorInicialContrato) {
        this.beneficiarioCdrvValorInicialContrato = beneficiarioCdrvValorInicialContrato;
    }

    /**
     * Gets the value of attribute drvValorCuotaAfiliacion
     */
    public Double getBeneficiarioCdrvValorCuotaAfiliacion() {
        return beneficiarioCdrvValorCuotaAfiliacion;
    }
    
    /**
     * Sets the value of attribute drvValorCuotaAfiliacion
     */
    public void setBeneficiarioCdrvValorCuotaAfiliacion(Double beneficiarioCdrvValorCuotaAfiliacion) {
        this.beneficiarioCdrvValorCuotaAfiliacion = beneficiarioCdrvValorCuotaAfiliacion;
    }

    /**
     * Gets the value of attribute drvValorCuotaPeriodo
     */
    public Double getBeneficiarioCdrvValorCuotaPeriodo() {
        return beneficiarioCdrvValorCuotaPeriodo;
    }
    
    /**
     * Sets the value of attribute drvValorCuotaPeriodo
     */
    public void setBeneficiarioCdrvValorCuotaPeriodo(Double beneficiarioCdrvValorCuotaPeriodo) {
        this.beneficiarioCdrvValorCuotaPeriodo = beneficiarioCdrvValorCuotaPeriodo;
    }

    /**
     * Gets the value of attribute drvDescuentoComercial
     */
    public Double getBeneficiarioCdrvDescuentoComercial() {
        return beneficiarioCdrvDescuentoComercial;
    }
    
    /**
     * Sets the value of attribute drvDescuentoComercial
     */
    public void setBeneficiarioCdrvDescuentoComercial(Double beneficiarioCdrvDescuentoComercial) {
        this.beneficiarioCdrvDescuentoComercial = beneficiarioCdrvDescuentoComercial;
    }

    /**
     * Gets the value of attribute drvDescuentoFinanciero
     */
    public Double getBeneficiarioCdrvDescuentoFinanciero() {
        return beneficiarioCdrvDescuentoFinanciero;
    }
    
    /**
     * Sets the value of attribute drvDescuentoFinanciero
     */
    public void setBeneficiarioCdrvDescuentoFinanciero(Double beneficiarioCdrvDescuentoFinanciero) {
        this.beneficiarioCdrvDescuentoFinanciero = beneficiarioCdrvDescuentoFinanciero;
    }

    /**
     * Gets the value of attribute drvValorCuotaBruta
     */
    public Double getBeneficiarioCdrvValorCuotaBruta() {
        return beneficiarioCdrvValorCuotaBruta;
    }
    
    /**
     * Sets the value of attribute drvValorCuotaBruta
     */
    public void setBeneficiarioCdrvValorCuotaBruta(Double beneficiarioCdrvValorCuotaBruta) {
        this.beneficiarioCdrvValorCuotaBruta = beneficiarioCdrvValorCuotaBruta;
    }

    /**
     * Gets the value of attribute drvTienePreexistencias
     */
    public Boolean getBeneficiarioCdrvTienePreexistencias() {
        return beneficiarioCdrvTienePreexistencias;
    }
    
    /**
     * Sets the value of attribute drvTienePreexistencias
     */
    public void setBeneficiarioCdrvTienePreexistencias(Boolean beneficiarioCdrvTienePreexistencias) {
        this.beneficiarioCdrvTienePreexistencias = beneficiarioCdrvTienePreexistencias;
    }

    /**
     * Gets the value of relation through role PersonaC
     */
    @JsonIgnore
    public PersonaC getPersonaC() {
        return personaC;
    }

    /**
     * Gets the value of relation through role AnexosC
     */
    @JsonIgnore
    public Collection <AnexoC> getAnexosC() {
        return anexosC;
    }

    /**
     * Gets the value of relation through role ConceptosC
     */
    @JsonIgnore
    public Collection <ConceptoC> getConceptosC() {
        return conceptosC;
    }

    /**
     * Gets the value of relation through role ContratoC
     */
    @JsonIgnore
    public ContratoC getContratoC() {
        return contratoC;
    }

    /**
     * Gets the value of relation through role FamiliasC
     */
    @JsonIgnore
    public FamiliaC getFamiliasC() {
        return familiasC;
    }

    /**
     * Gets the value of relation through role EPSC
     */
    @JsonIgnore
    public Eps getEPSC() {
        return ePSC;
    }

    /**
     * Gets the value of relation through role CompanyiaMPC
     */
    @JsonIgnore
    public Companyia getCompanyiaMPC() {
        return companyiaMPC;
    }

    /**
     * Gets the value of relation through role ParentescoC
     */
    @JsonIgnore
    public Parentesco getParentescoC() {
        return parentescoC;
    }

    /**
     * Gets the value of relation through role EstadoBeneficiarioC
     */
    @JsonIgnore
    public EstadoBeneficiario getEstadoBeneficiarioC() {
        return estadoBeneficiarioC;
    }

    /**
     * Default constructor
     */
    public BeneficiarioC() {
        contratoCContratoCID = null;
        beneficiarioCID = null;
    }

    /**
     * Constructor used to create instances of <code>BeneficiarioC</code>.
     * @param oid Object Identifier of the instance of <code>BeneficiarioC</code> to be created.
     * @throws SystemException
     */
    public BeneficiarioC(BeneficiarioCOid oid) {
        if (oid != null && !oid.isNull()) {
            contratoCContratoCID = oid.getContratoCContratoCID();
            beneficiarioCID = oid.getBeneficiarioCID();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return BeneficiarioC.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        BeneficiarioC other = (BeneficiarioC)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getBeneficiarioCID(), other.getBeneficiarioCID());
        result &= Utilities.isEqual(this.getBeneficiarioCNumUsuario(), other.getBeneficiarioCNumUsuario());
        result &= Utilities.isEqual(this.getBeneficiarioCCodigoTipoUsuario(), other.getBeneficiarioCCodigoTipoUsuario());
        result &= Utilities.isEqual(this.getBeneficiarioCIndicadorBBGestacion(), other.getBeneficiarioCIndicadorBBGestacion());
        result &= Utilities.isEqual(this.getBeneficiarioCCodUsuarioBancoRep(), other.getBeneficiarioCCodUsuarioBancoRep());
        result &= Utilities.isEqual(this.getBeneficiarioCFechaAntiguedad(), other.getBeneficiarioCFechaAntiguedad());
        result &= Utilities.isEqual(this.getBeneficiarioCRequiereExamenMedico(), other.getBeneficiarioCRequiereExamenMedico());
        result &= Utilities.isEqual(this.getBeneficiarioCEstadoMedico(), other.getBeneficiarioCEstadoMedico());
        result &= Utilities.isEqual(this.getBeneficiarioCFechaAntiguedadRealOSI(), other.getBeneficiarioCFechaAntiguedadRealOSI());
        result &= Utilities.isEqual(this.getBeneficiarioCValorCuotaInscripcion(), other.getBeneficiarioCValorCuotaInscripcion());
        result &= Utilities.isEqual(this.getBeneficiarioCTienePreexistencias(), other.getBeneficiarioCTienePreexistencias());
        result &= Utilities.isEqual(this.getBeneficiarioCFechaInicioVigencia(), other.getBeneficiarioCFechaInicioVigencia());
        result &= Utilities.isEqual(this.getBeneficiarioCFechaFinVigencia(), other.getBeneficiarioCFechaFinVigencia());
        result &= Utilities.isEqual(this.getBeneficiarioCdrvValorInicialContrato(), other.getBeneficiarioCdrvValorInicialContrato());
        result &= Utilities.isEqual(this.getBeneficiarioCdrvValorCuotaAfiliacion(), other.getBeneficiarioCdrvValorCuotaAfiliacion());
        result &= Utilities.isEqual(this.getBeneficiarioCdrvValorCuotaPeriodo(), other.getBeneficiarioCdrvValorCuotaPeriodo());
        result &= Utilities.isEqual(this.getBeneficiarioCdrvDescuentoComercial(), other.getBeneficiarioCdrvDescuentoComercial());
        result &= Utilities.isEqual(this.getBeneficiarioCdrvDescuentoFinanciero(), other.getBeneficiarioCdrvDescuentoFinanciero());
        result &= Utilities.isEqual(this.getBeneficiarioCdrvValorCuotaBruta(), other.getBeneficiarioCdrvValorCuotaBruta());
        result &= Utilities.isEqual(this.getBeneficiarioCdrvTienePreexistencias(), other.getBeneficiarioCdrvTienePreexistencias());
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
     * Returns the <code>BeneficiarioCOid</code> object that identifies this instance of <code>BeneficiarioC</code>.
     * @return <code>BeneficiarioCOid</code> object that identifies this instance of <code>BeneficiarioC</code>
     */
	@Override
    public BeneficiarioCOid getOid() {
        return new BeneficiarioCOid(getContratoCContratoCID(), getBeneficiarioCID());
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
        if (!activeFacets.contains(Constants.BENEFICIARIOC)) {
            activeFacets.add(Constants.BENEFICIARIOC);
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
            relatedInstance = buildBeneficiarioCRelatedInstance(relatedInstanceJsonOid);
        }
        if (BeneficiarioCConstants.ROLE_NAME_PERSONAC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildBeneficiarioCRelatedInstance4PersonaC(relatedInstanceJsonOid, remainingPath);
        }
        if (BeneficiarioCConstants.ROLE_NAME_ANEXOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildBeneficiarioCRelatedInstance4AnexoC(relatedInstanceJsonOid, remainingPath);
        }
        if (BeneficiarioCConstants.ROLE_NAME_CONCEPTOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildBeneficiarioCRelatedInstance4ConceptoC(relatedInstanceJsonOid, remainingPath);
        }
        if (BeneficiarioCConstants.ROLE_NAME_CONTRATOC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildBeneficiarioCRelatedInstance4ContratoC(relatedInstanceJsonOid, remainingPath);
        }
        if (BeneficiarioCConstants.ROLE_NAME_FAMILIASC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildBeneficiarioCRelatedInstance4FamiliaC(relatedInstanceJsonOid, remainingPath);
        }
        if (BeneficiarioCConstants.ROLE_NAME_EPSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildBeneficiarioCRelatedInstance4Eps(relatedInstanceJsonOid, remainingPath);
        }
        if (BeneficiarioCConstants.ROLE_NAME_COMPANYIAMPC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildBeneficiarioCRelatedInstance4Companyia(relatedInstanceJsonOid, remainingPath);
        }
        if (BeneficiarioCConstants.ROLE_NAME_PARENTESCOC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildBeneficiarioCRelatedInstance4Parentesco(relatedInstanceJsonOid, remainingPath);
        }
        if (BeneficiarioCConstants.ROLE_NAME_ESTADOBENEFICIARIOC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildBeneficiarioCRelatedInstance4EstadoBeneficiario(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildBeneficiarioCRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new BeneficiarioC(mapper.readValue(relatedInstanceJsonOid, BeneficiarioCOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(BeneficiarioC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildBeneficiarioCRelatedInstance4PersonaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PersonaC(mapper.readValue(relatedInstanceJsonOid, PersonaCOid.class)): PersonaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(BeneficiarioC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildBeneficiarioCRelatedInstance4AnexoC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new AnexoC(mapper.readValue(relatedInstanceJsonOid, AnexoCOid.class)): AnexoC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(BeneficiarioC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildBeneficiarioCRelatedInstance4ConceptoC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ConceptoC(mapper.readValue(relatedInstanceJsonOid, ConceptoCOid.class)): ConceptoC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(BeneficiarioC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildBeneficiarioCRelatedInstance4ContratoC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ContratoC(mapper.readValue(relatedInstanceJsonOid, ContratoCOid.class)): ContratoC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(BeneficiarioC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildBeneficiarioCRelatedInstance4FamiliaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new FamiliaC(mapper.readValue(relatedInstanceJsonOid, FamiliaCOid.class)): FamiliaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(BeneficiarioC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildBeneficiarioCRelatedInstance4Eps(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Eps(mapper.readValue(relatedInstanceJsonOid, EpsOid.class)): Eps.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(BeneficiarioC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildBeneficiarioCRelatedInstance4Companyia(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Companyia(mapper.readValue(relatedInstanceJsonOid, CompanyiaOid.class)): Companyia.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(BeneficiarioC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildBeneficiarioCRelatedInstance4Parentesco(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Parentesco(mapper.readValue(relatedInstanceJsonOid, ParentescoOid.class)): Parentesco.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(BeneficiarioC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildBeneficiarioCRelatedInstance4EstadoBeneficiario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new EstadoBeneficiario(mapper.readValue(relatedInstanceJsonOid, EstadoBeneficiarioOid.class)): EstadoBeneficiario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(BeneficiarioC.class).error(e.getMessage());
            return null;
        }
    }
}
