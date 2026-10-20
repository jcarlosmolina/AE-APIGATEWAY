package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.MarcaMedicaCConstants;
import com.keralty.ae.persistence.oid.MarcaMedicaCOid;
import com.keralty.ae.persistence.oid.PersonaCOid;
import com.keralty.ae.persistence.oid.ProductosOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>MarcaMedicaC</code> external model class.
 * <p>
 * External Model Class: <code>MarcaMedicaC</code><br>
 */
public class MarcaMedicaC extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id")
    private Long personaCID;

    @JsonProperty(value="producto")
    private Long productosProducto;

    @JsonProperty(value="codigo")
    private String marcaMedicaCCodigo;

    @JsonProperty(value="descripcion")
    private String marcaMedicaCDescripcion;

    @JsonProperty(value="tipomarcacion")
    private String marcaMedicaCTipoMarcacion;

    @JsonProperty(value="eximepagoprestacion")
    private Boolean marcaMedicaCEximePagoPrestacion;

    @JsonProperty(value="estadomarcacionmedica")
    private String marcaMedicaCEstadoMarcacionMedica;

    @JsonProperty(value="fechainicio")
    private Date marcaMedicaCFechaInicio;

    @JsonProperty(value="fechafin")
    private Date marcaMedicaCFechaFin;

    private PersonaC personaC;

    private Productos productoC;

    /**
     * Gets the value of attribute ID
     */
    public Long getPersonaCID() {
        return personaCID;
    }
    
    /**
     * Sets the value of attribute ID
     */
    public void setPersonaCID(Long personaCID) {
        this.personaCID = personaCID;
    }

    /**
     * Gets the value of attribute Producto
     */
    public Long getProductosProducto() {
        return productosProducto;
    }
    
    /**
     * Sets the value of attribute Producto
     */
    public void setProductosProducto(Long productosProducto) {
        this.productosProducto = productosProducto;
    }

    /**
     * Gets the value of attribute Codigo
     */
    public String getMarcaMedicaCCodigo() {
        return marcaMedicaCCodigo;
    }
    
    /**
     * Sets the value of attribute Codigo
     */
    public void setMarcaMedicaCCodigo(String marcaMedicaCCodigo) {
        this.marcaMedicaCCodigo = marcaMedicaCCodigo;
    }

    /**
     * Gets the value of attribute Descripcion
     */
    public String getMarcaMedicaCDescripcion() {
        return marcaMedicaCDescripcion;
    }
    
    /**
     * Sets the value of attribute Descripcion
     */
    public void setMarcaMedicaCDescripcion(String marcaMedicaCDescripcion) {
        this.marcaMedicaCDescripcion = marcaMedicaCDescripcion;
    }

    /**
     * Gets the value of attribute TipoMarcacion
     */
    public String getMarcaMedicaCTipoMarcacion() {
        return marcaMedicaCTipoMarcacion;
    }
    
    /**
     * Sets the value of attribute TipoMarcacion
     */
    public void setMarcaMedicaCTipoMarcacion(String marcaMedicaCTipoMarcacion) {
        this.marcaMedicaCTipoMarcacion = marcaMedicaCTipoMarcacion;
    }

    /**
     * Gets the value of attribute EximePagoPrestacion
     */
    public Boolean getMarcaMedicaCEximePagoPrestacion() {
        return marcaMedicaCEximePagoPrestacion;
    }
    
    /**
     * Sets the value of attribute EximePagoPrestacion
     */
    public void setMarcaMedicaCEximePagoPrestacion(Boolean marcaMedicaCEximePagoPrestacion) {
        this.marcaMedicaCEximePagoPrestacion = marcaMedicaCEximePagoPrestacion;
    }

    /**
     * Gets the value of attribute EstadoMarcacionMedica
     */
    public String getMarcaMedicaCEstadoMarcacionMedica() {
        return marcaMedicaCEstadoMarcacionMedica;
    }
    
    /**
     * Sets the value of attribute EstadoMarcacionMedica
     */
    public void setMarcaMedicaCEstadoMarcacionMedica(String marcaMedicaCEstadoMarcacionMedica) {
        this.marcaMedicaCEstadoMarcacionMedica = marcaMedicaCEstadoMarcacionMedica;
    }

    /**
     * Gets the value of attribute FechaInicio
     */
    public Date getMarcaMedicaCFechaInicio() {
        return marcaMedicaCFechaInicio;
    }
    
    /**
     * Sets the value of attribute FechaInicio
     */
    public void setMarcaMedicaCFechaInicio(Date marcaMedicaCFechaInicio) {
        this.marcaMedicaCFechaInicio = marcaMedicaCFechaInicio;
    }

    /**
     * Gets the value of attribute FechaFin
     */
    public Date getMarcaMedicaCFechaFin() {
        return marcaMedicaCFechaFin;
    }
    
    /**
     * Sets the value of attribute FechaFin
     */
    public void setMarcaMedicaCFechaFin(Date marcaMedicaCFechaFin) {
        this.marcaMedicaCFechaFin = marcaMedicaCFechaFin;
    }

    /**
     * Gets the value of relation through role PersonaC
     */
    @JsonIgnore
    public PersonaC getPersonaC() {
        return personaC;
    }

    /**
     * Gets the value of relation through role ProductoC
     */
    @JsonIgnore
    public Productos getProductoC() {
        return productoC;
    }

    /**
     * Default constructor
     */
    public MarcaMedicaC() {
        personaCID = null;
        productosProducto = null;
        marcaMedicaCCodigo = null;
    }

    /**
     * Constructor used to create instances of <code>MarcaMedicaC</code>.
     * @param oid Object Identifier of the instance of <code>MarcaMedicaC</code> to be created.
     * @throws SystemException
     */
    public MarcaMedicaC(MarcaMedicaCOid oid) {
        if (oid != null && !oid.isNull()) {
            personaCID = oid.getPersonaCID();
            productosProducto = oid.getProductosProducto();
            marcaMedicaCCodigo = oid.getMarcaMedicaCCodigo();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return MarcaMedicaC.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        MarcaMedicaC other = (MarcaMedicaC)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getMarcaMedicaCCodigo(), other.getMarcaMedicaCCodigo());
        result &= Utilities.isEqual(this.getMarcaMedicaCDescripcion(), other.getMarcaMedicaCDescripcion());
        result &= Utilities.isEqual(this.getMarcaMedicaCTipoMarcacion(), other.getMarcaMedicaCTipoMarcacion());
        result &= Utilities.isEqual(this.getMarcaMedicaCEximePagoPrestacion(), other.getMarcaMedicaCEximePagoPrestacion());
        result &= Utilities.isEqual(this.getMarcaMedicaCEstadoMarcacionMedica(), other.getMarcaMedicaCEstadoMarcacionMedica());
        result &= Utilities.isEqual(this.getMarcaMedicaCFechaInicio(), other.getMarcaMedicaCFechaInicio());
        result &= Utilities.isEqual(this.getMarcaMedicaCFechaFin(), other.getMarcaMedicaCFechaFin());
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
     * Returns the <code>MarcaMedicaCOid</code> object that identifies this instance of <code>MarcaMedicaC</code>.
     * @return <code>MarcaMedicaCOid</code> object that identifies this instance of <code>MarcaMedicaC</code>
     */
	@Override
    public MarcaMedicaCOid getOid() {
        return new MarcaMedicaCOid(getPersonaCID(), getProductosProducto(), getMarcaMedicaCCodigo());
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
        if (!activeFacets.contains(Constants.MARCAMEDICAC)) {
            activeFacets.add(Constants.MARCAMEDICAC);
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
            relatedInstance = buildMarcaMedicaCRelatedInstance(relatedInstanceJsonOid);
        }
        if (MarcaMedicaCConstants.ROLE_NAME_PERSONAC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildMarcaMedicaCRelatedInstance4PersonaC(relatedInstanceJsonOid, remainingPath);
        }
        if (MarcaMedicaCConstants.ROLE_NAME_PRODUCTOC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildMarcaMedicaCRelatedInstance4Productos(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildMarcaMedicaCRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new MarcaMedicaC(mapper.readValue(relatedInstanceJsonOid, MarcaMedicaCOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(MarcaMedicaC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildMarcaMedicaCRelatedInstance4PersonaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PersonaC(mapper.readValue(relatedInstanceJsonOid, PersonaCOid.class)): PersonaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(MarcaMedicaC.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildMarcaMedicaCRelatedInstance4Productos(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Productos(mapper.readValue(relatedInstanceJsonOid, ProductosOid.class)): Productos.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(MarcaMedicaC.class).error(e.getMessage());
            return null;
        }
    }
}
