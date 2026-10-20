package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.TipoIVAConstants;
import com.keralty.ae.persistence.oid.PlanesOid;
import com.keralty.ae.persistence.oid.ProductosOid;
import com.keralty.ae.persistence.oid.TipoIVAOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>TipoIVA</code> external model class.
 * <p>
 * External Model Class: <code>TipoIVA</code><br>
 */
public class TipoIVA extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="codigo")
    private Long tipoIVACodigo;

    @JsonProperty(value="descripcion")
    private String tipoIVADescripcion;

    @JsonProperty(value="porcentaje")
    private Double tipoIVAPorcentaje;

    @JsonProperty(value="fechainicio")
    private Date tipoIVAFechaInicio;

    @JsonProperty(value="fechafin")
    private Date tipoIVAFechaFin;

    private Productos productoT;

    private Planes planT;

    /**
     * Gets the value of attribute Codigo
     */
    public Long getTipoIVACodigo() {
        return tipoIVACodigo;
    }
    
    /**
     * Sets the value of attribute Codigo
     */
    public void setTipoIVACodigo(Long tipoIVACodigo) {
        this.tipoIVACodigo = tipoIVACodigo;
    }

    /**
     * Gets the value of attribute Descripcion
     */
    public String getTipoIVADescripcion() {
        return tipoIVADescripcion;
    }
    
    /**
     * Sets the value of attribute Descripcion
     */
    public void setTipoIVADescripcion(String tipoIVADescripcion) {
        this.tipoIVADescripcion = tipoIVADescripcion;
    }

    /**
     * Gets the value of attribute Porcentaje
     */
    public Double getTipoIVAPorcentaje() {
        return tipoIVAPorcentaje;
    }
    
    /**
     * Sets the value of attribute Porcentaje
     */
    public void setTipoIVAPorcentaje(Double tipoIVAPorcentaje) {
        this.tipoIVAPorcentaje = tipoIVAPorcentaje;
    }

    /**
     * Gets the value of attribute FechaInicio
     */
    public Date getTipoIVAFechaInicio() {
        return tipoIVAFechaInicio;
    }
    
    /**
     * Sets the value of attribute FechaInicio
     */
    public void setTipoIVAFechaInicio(Date tipoIVAFechaInicio) {
        this.tipoIVAFechaInicio = tipoIVAFechaInicio;
    }

    /**
     * Gets the value of attribute FechaFin
     */
    public Date getTipoIVAFechaFin() {
        return tipoIVAFechaFin;
    }
    
    /**
     * Sets the value of attribute FechaFin
     */
    public void setTipoIVAFechaFin(Date tipoIVAFechaFin) {
        this.tipoIVAFechaFin = tipoIVAFechaFin;
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
    public TipoIVA() {
        tipoIVACodigo = null;
    }

    /**
     * Constructor used to create instances of <code>TipoIVA</code>.
     * @param oid Object Identifier of the instance of <code>TipoIVA</code> to be created.
     * @throws SystemException
     */
    public TipoIVA(TipoIVAOid oid) {
        if (oid != null && !oid.isNull()) {
            tipoIVACodigo = oid.getTipoIVACodigo();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return TipoIVA.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        TipoIVA other = (TipoIVA)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getTipoIVACodigo(), other.getTipoIVACodigo());
        result &= Utilities.isEqual(this.getTipoIVADescripcion(), other.getTipoIVADescripcion());
        result &= Utilities.isEqual(this.getTipoIVAPorcentaje(), other.getTipoIVAPorcentaje());
        result &= Utilities.isEqual(this.getTipoIVAFechaInicio(), other.getTipoIVAFechaInicio());
        result &= Utilities.isEqual(this.getTipoIVAFechaFin(), other.getTipoIVAFechaFin());
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
     * Returns the <code>TipoIVAOid</code> object that identifies this instance of <code>TipoIVA</code>.
     * @return <code>TipoIVAOid</code> object that identifies this instance of <code>TipoIVA</code>
     */
	@Override
    public TipoIVAOid getOid() {
        return new TipoIVAOid(getTipoIVACodigo());
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
        if (!activeFacets.contains(Constants.TIPOIVA)) {
            activeFacets.add(Constants.TIPOIVA);
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
            relatedInstance = buildTipoIVARelatedInstance(relatedInstanceJsonOid);
        }
        if (TipoIVAConstants.ROLE_NAME_PRODUCTOT.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoIVARelatedInstance4Productos(relatedInstanceJsonOid, remainingPath);
        }
        if (TipoIVAConstants.ROLE_NAME_PLANT.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoIVARelatedInstance4Planes(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildTipoIVARelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new TipoIVA(mapper.readValue(relatedInstanceJsonOid, TipoIVAOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoIVA.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildTipoIVARelatedInstance4Productos(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Productos(mapper.readValue(relatedInstanceJsonOid, ProductosOid.class)): Productos.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoIVA.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildTipoIVARelatedInstance4Planes(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Planes(mapper.readValue(relatedInstanceJsonOid, PlanesOid.class)): Planes.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoIVA.class).error(e.getMessage());
            return null;
        }
    }
}
