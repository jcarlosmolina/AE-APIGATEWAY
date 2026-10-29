package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.TarifaConstants;
import com.keralty.ae.persistence.oid.ContratoCOid;
import com.keralty.ae.persistence.oid.DetalleTarifaOid;
import com.keralty.ae.persistence.oid.InstitucionMatNeoOid;
import com.keralty.ae.persistence.oid.PlanesOid;
import com.keralty.ae.persistence.oid.ProductosOid;
import com.keralty.ae.persistence.oid.TarifaOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>Tarifa</code> external model class.
 * <p>
 * External Model Class: <code>Tarifa</code><br>
 */
public class Tarifa extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id")
    private Long tarifaId;

    @JsonProperty(value="codigo")
    private String tarifaCodigo;

    @JsonProperty(value="tipocontrato")
    private Long tarifaTipoContrato;

    private Collection <ContratoC> contratosC;

    private Collection <DetalleTarifa> detallesTarifa;

    private Collection <InstitucionMatNeo> institucionMatNeo;

    private Productos productoT;

    private Planes planT;

    /**
     * Gets the value of attribute Id
     */
    public Long getTarifaId() {
        return tarifaId;
    }
    
    /**
     * Sets the value of attribute Id
     */
    public void setTarifaId(Long tarifaId) {
        this.tarifaId = tarifaId;
    }

    /**
     * Gets the value of attribute Codigo
     */
    public String getTarifaCodigo() {
        return tarifaCodigo;
    }
    
    /**
     * Sets the value of attribute Codigo
     */
    public void setTarifaCodigo(String tarifaCodigo) {
        this.tarifaCodigo = tarifaCodigo;
    }

    /**
     * Gets the value of attribute TipoContrato
     */
    public Long getTarifaTipoContrato() {
        return tarifaTipoContrato;
    }
    
    /**
     * Sets the value of attribute TipoContrato
     */
    public void setTarifaTipoContrato(Long tarifaTipoContrato) {
        this.tarifaTipoContrato = tarifaTipoContrato;
    }

    /**
     * Gets the value of relation through role ContratosC
     */
    @JsonIgnore
    public Collection <ContratoC> getContratosC() {
        return contratosC;
    }

    /**
     * Gets the value of relation through role DetallesTarifa
     */
    @JsonIgnore
    public Collection <DetalleTarifa> getDetallesTarifa() {
        return detallesTarifa;
    }

    /**
     * Gets the value of relation through role InstitucionMatNeo
     */
    @JsonIgnore
    public Collection <InstitucionMatNeo> getInstitucionMatNeo() {
        return institucionMatNeo;
    }

    /**
     * Gets the value of relation through role ProductoT
     */
    @JsonIgnore
    public Productos getProductoT() {
        return productoT;
    }

    /**
     * Gets the value of relation through role PlanT
     */
    @JsonIgnore
    public Planes getPlanT() {
        return planT;
    }

    /**
     * Default constructor
     */
    public Tarifa() {
        tarifaId = null;
    }

    /**
     * Constructor used to create instances of <code>Tarifa</code>.
     * @param oid Object Identifier of the instance of <code>Tarifa</code> to be created.
     * @throws SystemException
     */
    public Tarifa(TarifaOid oid) {
        if (oid != null && !oid.isNull()) {
            tarifaId = oid.getTarifaId();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return Tarifa.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Tarifa other = (Tarifa)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getTarifaId(), other.getTarifaId());
        result &= Utilities.isEqual(this.getTarifaCodigo(), other.getTarifaCodigo());
        result &= Utilities.isEqual(this.getTarifaTipoContrato(), other.getTarifaTipoContrato());
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
     * Returns the <code>TarifaOid</code> object that identifies this instance of <code>Tarifa</code>.
     * @return <code>TarifaOid</code> object that identifies this instance of <code>Tarifa</code>
     */
	@Override
    public TarifaOid getOid() {
        return new TarifaOid(getTarifaId());
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
        if (!activeFacets.contains(Constants.TARIFA)) {
            activeFacets.add(Constants.TARIFA);
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
            relatedInstance = buildTarifaRelatedInstance(relatedInstanceJsonOid);
        }
        if (TarifaConstants.ROLE_NAME_CONTRATOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTarifaRelatedInstance4ContratoC(relatedInstanceJsonOid, remainingPath);
        }
        if (TarifaConstants.ROLE_NAME_DETALLESTARIFA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTarifaRelatedInstance4DetalleTarifa(relatedInstanceJsonOid, remainingPath);
        }
        if (TarifaConstants.ROLE_NAME_INSTITUCIONMATNEO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTarifaRelatedInstance4InstitucionMatNeo(relatedInstanceJsonOid, remainingPath);
        }
        if (TarifaConstants.ROLE_NAME_PRODUCTOT.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTarifaRelatedInstance4Productos(relatedInstanceJsonOid, remainingPath);
        }
        if (TarifaConstants.ROLE_NAME_PLANT.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTarifaRelatedInstance4Planes(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildTarifaRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Tarifa(mapper.readValue(relatedInstanceJsonOid, TarifaOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Tarifa.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildTarifaRelatedInstance4ContratoC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ContratoC(mapper.readValue(relatedInstanceJsonOid, ContratoCOid.class)): ContratoC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Tarifa.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildTarifaRelatedInstance4DetalleTarifa(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new DetalleTarifa(mapper.readValue(relatedInstanceJsonOid, DetalleTarifaOid.class)): DetalleTarifa.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Tarifa.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildTarifaRelatedInstance4InstitucionMatNeo(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new InstitucionMatNeo(mapper.readValue(relatedInstanceJsonOid, InstitucionMatNeoOid.class)): InstitucionMatNeo.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Tarifa.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildTarifaRelatedInstance4Productos(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Productos(mapper.readValue(relatedInstanceJsonOid, ProductosOid.class)): Productos.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Tarifa.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildTarifaRelatedInstance4Planes(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Planes(mapper.readValue(relatedInstanceJsonOid, PlanesOid.class)): Planes.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Tarifa.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
