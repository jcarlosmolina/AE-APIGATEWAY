package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.AnexoCConstants;
import com.keralty.ae.global.Constants;
import com.keralty.ae.persistence.oid.AnexoCOid;
import com.keralty.ae.persistence.oid.BeneficiarioCOid;
import com.keralty.ae.persistence.oid.PeriodicidadOid;
import com.keralty.ae.persistence.oid.TipoIdentificacionOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>AnexoC</code> external model class.
 * <p>
 * External Model Class: <code>AnexoC</code><br>
 */
public class AnexoC extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="identificador")
    private Long anexoCIdentificador;

    @JsonProperty(value="codigoplananexo")
    private String anexoCCodigoPlanAnexo;

    @JsonProperty(value="codigotarifa")
    private String anexoCCodigoTarifa;

    @JsonProperty(value="fechainiciovigencia")
    private Date anexoCFechaInicioVigencia;

    @JsonProperty(value="fechaultimaregla")
    private Date anexoCFechaUltimaRegla;

    @JsonProperty(value="numcuotaspago")
    private Long anexoCNumCuotasPago;

    @JsonProperty(value="numidentificacion")
    private String anexoCNumIdentificacion;

    @JsonProperty(value="codsucursal")
    private String anexoCCodSucursal;

    private BeneficiarioC beneficiarioC;

    private Periodicidad periodicidadC;

    private TipoIdentificacion tipoIdentificacionC;

    /**
     * Gets the value of attribute Identificador
     */
    public Long getAnexoCIdentificador() {
        return anexoCIdentificador;
    }
    
    /**
     * Sets the value of attribute Identificador
     */
    public void setAnexoCIdentificador(Long anexoCIdentificador) {
        this.anexoCIdentificador = anexoCIdentificador;
    }

    /**
     * Gets the value of attribute CodigoPlanAnexo
     */
    public String getAnexoCCodigoPlanAnexo() {
        return anexoCCodigoPlanAnexo;
    }
    
    /**
     * Sets the value of attribute CodigoPlanAnexo
     */
    public void setAnexoCCodigoPlanAnexo(String anexoCCodigoPlanAnexo) {
        this.anexoCCodigoPlanAnexo = anexoCCodigoPlanAnexo;
    }

    /**
     * Gets the value of attribute CodigoTarifa
     */
    public String getAnexoCCodigoTarifa() {
        return anexoCCodigoTarifa;
    }
    
    /**
     * Sets the value of attribute CodigoTarifa
     */
    public void setAnexoCCodigoTarifa(String anexoCCodigoTarifa) {
        this.anexoCCodigoTarifa = anexoCCodigoTarifa;
    }

    /**
     * Gets the value of attribute FechaInicioVigencia
     */
    public Date getAnexoCFechaInicioVigencia() {
        return anexoCFechaInicioVigencia;
    }
    
    /**
     * Sets the value of attribute FechaInicioVigencia
     */
    public void setAnexoCFechaInicioVigencia(Date anexoCFechaInicioVigencia) {
        this.anexoCFechaInicioVigencia = anexoCFechaInicioVigencia;
    }

    /**
     * Gets the value of attribute FechaUltimaRegla
     */
    public Date getAnexoCFechaUltimaRegla() {
        return anexoCFechaUltimaRegla;
    }
    
    /**
     * Sets the value of attribute FechaUltimaRegla
     */
    public void setAnexoCFechaUltimaRegla(Date anexoCFechaUltimaRegla) {
        this.anexoCFechaUltimaRegla = anexoCFechaUltimaRegla;
    }

    /**
     * Gets the value of attribute NumCuotasPago
     */
    public Long getAnexoCNumCuotasPago() {
        return anexoCNumCuotasPago;
    }
    
    /**
     * Sets the value of attribute NumCuotasPago
     */
    public void setAnexoCNumCuotasPago(Long anexoCNumCuotasPago) {
        this.anexoCNumCuotasPago = anexoCNumCuotasPago;
    }

    /**
     * Gets the value of attribute NumIdentificacion
     */
    public String getAnexoCNumIdentificacion() {
        return anexoCNumIdentificacion;
    }
    
    /**
     * Sets the value of attribute NumIdentificacion
     */
    public void setAnexoCNumIdentificacion(String anexoCNumIdentificacion) {
        this.anexoCNumIdentificacion = anexoCNumIdentificacion;
    }

    /**
     * Gets the value of attribute CodSucursal
     */
    public String getAnexoCCodSucursal() {
        return anexoCCodSucursal;
    }
    
    /**
     * Sets the value of attribute CodSucursal
     */
    public void setAnexoCCodSucursal(String anexoCCodSucursal) {
        this.anexoCCodSucursal = anexoCCodSucursal;
    }

    /**
     * Gets the value of relation through role BeneficiarioC
     */
    @JsonIgnore
    public BeneficiarioC getBeneficiarioC() {
        return beneficiarioC;
    }

    /**
     * Gets the value of relation through role PeriodicidadC
     */
    @JsonIgnore
    public Periodicidad getPeriodicidadC() {
        return periodicidadC;
    }

    /**
     * Gets the value of relation through role TipoIdentificacionC
     */
    @JsonIgnore
    public TipoIdentificacion getTipoIdentificacionC() {
        return tipoIdentificacionC;
    }

    /**
     * Default constructor
     */
    public AnexoC() {
        anexoCIdentificador = null;
    }

    /**
     * Constructor used to create instances of <code>AnexoC</code>.
     * @param oid Object Identifier of the instance of <code>AnexoC</code> to be created.
     * @throws SystemException
     */
    public AnexoC(AnexoCOid oid) {
        if (oid != null && !oid.isNull()) {
            anexoCIdentificador = oid.getAnexoCIdentificador();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return AnexoC.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        AnexoC other = (AnexoC)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getAnexoCIdentificador(), other.getAnexoCIdentificador());
        result &= Utilities.isEqual(this.getAnexoCCodigoPlanAnexo(), other.getAnexoCCodigoPlanAnexo());
        result &= Utilities.isEqual(this.getAnexoCCodigoTarifa(), other.getAnexoCCodigoTarifa());
        result &= Utilities.isEqual(this.getAnexoCFechaInicioVigencia(), other.getAnexoCFechaInicioVigencia());
        result &= Utilities.isEqual(this.getAnexoCFechaUltimaRegla(), other.getAnexoCFechaUltimaRegla());
        result &= Utilities.isEqual(this.getAnexoCNumCuotasPago(), other.getAnexoCNumCuotasPago());
        result &= Utilities.isEqual(this.getAnexoCNumIdentificacion(), other.getAnexoCNumIdentificacion());
        result &= Utilities.isEqual(this.getAnexoCCodSucursal(), other.getAnexoCCodSucursal());
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
     * Returns the <code>AnexoCOid</code> object that identifies this instance of <code>AnexoC</code>.
     * @return <code>AnexoCOid</code> object that identifies this instance of <code>AnexoC</code>
     */
	@Override
    public AnexoCOid getOid() {
        return new AnexoCOid(getAnexoCIdentificador());
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
        if (!activeFacets.contains(Constants.ANEXOC)) {
            activeFacets.add(Constants.ANEXOC);
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
            relatedInstance = buildAnexoCRelatedInstance(relatedInstanceJsonOid);
        }
        if (AnexoCConstants.ROLE_NAME_BENEFICIARIOC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAnexoCRelatedInstance4BeneficiarioC(relatedInstanceJsonOid, remainingPath);
        }
        if (AnexoCConstants.ROLE_NAME_PERIODICIDADC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAnexoCRelatedInstance4Periodicidad(relatedInstanceJsonOid, remainingPath);
        }
        if (AnexoCConstants.ROLE_NAME_TIPOIDENTIFICACIONC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAnexoCRelatedInstance4TipoIdentificacion(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildAnexoCRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new AnexoC(mapper.readValue(relatedInstanceJsonOid, AnexoCOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(AnexoC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildAnexoCRelatedInstance4BeneficiarioC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new BeneficiarioC(mapper.readValue(relatedInstanceJsonOid, BeneficiarioCOid.class)): BeneficiarioC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(AnexoC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildAnexoCRelatedInstance4Periodicidad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Periodicidad(mapper.readValue(relatedInstanceJsonOid, PeriodicidadOid.class)): Periodicidad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(AnexoC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildAnexoCRelatedInstance4TipoIdentificacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TipoIdentificacion(mapper.readValue(relatedInstanceJsonOid, TipoIdentificacionOid.class)): TipoIdentificacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(AnexoC.class).error(e.getMessage());
            return null;
        }
    }
}
