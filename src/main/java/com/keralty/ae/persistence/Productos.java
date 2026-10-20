package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.ProductosConstants;
import com.keralty.ae.persistence.oid.AesolicitudesOid;
import com.keralty.ae.persistence.oid.AgentexProductoOid;
import com.keralty.ae.persistence.oid.ContratoCOid;
import com.keralty.ae.persistence.oid.DominioOid;
import com.keralty.ae.persistence.oid.GrupoAsociadoOid;
import com.keralty.ae.persistence.oid.MarcaMedicaCOid;
import com.keralty.ae.persistence.oid.PlanesOid;
import com.keralty.ae.persistence.oid.ProductosOid;
import com.keralty.ae.persistence.oid.ProteccionDatosCOid;
import com.keralty.ae.persistence.oid.ProteccionDatosOid;
import com.keralty.ae.persistence.oid.TarifaOid;
import com.keralty.ae.persistence.oid.TipoIVAOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>Productos</code> external model class.
 * <p>
 * External Model Class: <code>Productos</code><br>
 */
public class Productos extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="producto")
    private Long productosProducto;

    @JsonProperty(value="descripcion")
    private String productosDescripcion;

    @JsonProperty(value="codanexomat")
    private Long productosCodAnexoMat;

    @JsonProperty(value="codanexoneo")
    private Long productosCodAnexoNeo;

    @JsonProperty(value="nit")
    private String productosNIT;

    @JsonProperty(value="codigolegal")
    private String productosCodigoLegal;

    @JsonProperty(value="fechadocsolicitud")
    private Date productosFechaDocSolicitud;

    private Collection <Planes> planes;

    private Collection <Dominio> dominios;

    private Collection <Tarifa> tarifas;

    private Collection <GrupoAsociado> gruposAsociados;

    private Collection <TipoIVA> tiposIVA;

    private Collection <Aesolicitudes> aESOLICITUDES;

    private Collection <ProteccionDatosC> proteccionDatosC;

    private Collection <ProteccionDatos> proteccionesDatos;

    private Collection <ContratoC> contratosC;

    private Collection <MarcaMedicaC> marcaMedicaC;

    private Collection <AgentexProducto> agentexProducto;

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
     * Gets the value of attribute Descripcion
     */
    public String getProductosDescripcion() {
        return productosDescripcion;
    }
    
    /**
     * Sets the value of attribute Descripcion
     */
    public void setProductosDescripcion(String productosDescripcion) {
        this.productosDescripcion = productosDescripcion;
    }

    /**
     * Gets the value of attribute CodAnexoMat
     */
    public Long getProductosCodAnexoMat() {
        return productosCodAnexoMat;
    }
    
    /**
     * Sets the value of attribute CodAnexoMat
     */
    public void setProductosCodAnexoMat(Long productosCodAnexoMat) {
        this.productosCodAnexoMat = productosCodAnexoMat;
    }

    /**
     * Gets the value of attribute CodAnexoNeo
     */
    public Long getProductosCodAnexoNeo() {
        return productosCodAnexoNeo;
    }
    
    /**
     * Sets the value of attribute CodAnexoNeo
     */
    public void setProductosCodAnexoNeo(Long productosCodAnexoNeo) {
        this.productosCodAnexoNeo = productosCodAnexoNeo;
    }

    /**
     * Gets the value of attribute NIT
     */
    public String getProductosNIT() {
        return productosNIT;
    }
    
    /**
     * Sets the value of attribute NIT
     */
    public void setProductosNIT(String productosNIT) {
        this.productosNIT = productosNIT;
    }

    /**
     * Gets the value of attribute CodigoLegal
     */
    public String getProductosCodigoLegal() {
        return productosCodigoLegal;
    }
    
    /**
     * Sets the value of attribute CodigoLegal
     */
    public void setProductosCodigoLegal(String productosCodigoLegal) {
        this.productosCodigoLegal = productosCodigoLegal;
    }

    /**
     * Gets the value of attribute FechaDocSolicitud
     */
    public Date getProductosFechaDocSolicitud() {
        return productosFechaDocSolicitud;
    }
    
    /**
     * Sets the value of attribute FechaDocSolicitud
     */
    public void setProductosFechaDocSolicitud(Date productosFechaDocSolicitud) {
        this.productosFechaDocSolicitud = productosFechaDocSolicitud;
    }

    /**
     * Gets the value of relation through role Planes
     */
    @JsonIgnore
    public Collection <Planes> getPlanes() {
        return planes;
    }

    /**
     * Gets the value of relation through role Dominios
     */
    @JsonIgnore
    public Collection <Dominio> getDominios() {
        return dominios;
    }

    /**
     * Gets the value of relation through role Tarifas
     */
    @JsonIgnore
    public Collection <Tarifa> getTarifas() {
        return tarifas;
    }

    /**
     * Gets the value of relation through role GruposAsociados
     */
    @JsonIgnore
    public Collection <GrupoAsociado> getGruposAsociados() {
        return gruposAsociados;
    }

    /**
     * Gets the value of relation through role TiposIVA
     */
    @JsonIgnore
    public Collection <TipoIVA> getTiposIVA() {
        return tiposIVA;
    }

    /**
     * Gets the value of relation through role AESOLICITUDES
     */
    @JsonIgnore
    public Collection <Aesolicitudes> getAESOLICITUDES() {
        return aESOLICITUDES;
    }

    /**
     * Gets the value of relation through role ProteccionDatosC
     */
    @JsonIgnore
    public Collection <ProteccionDatosC> getProteccionDatosC() {
        return proteccionDatosC;
    }

    /**
     * Gets the value of relation through role ProteccionesDatos
     */
    @JsonIgnore
    public Collection <ProteccionDatos> getProteccionesDatos() {
        return proteccionesDatos;
    }

    /**
     * Gets the value of relation through role ContratosC
     */
    @JsonIgnore
    public Collection <ContratoC> getContratosC() {
        return contratosC;
    }

    /**
     * Gets the value of relation through role MarcaMedicaC
     */
    @JsonIgnore
    public Collection <MarcaMedicaC> getMarcaMedicaC() {
        return marcaMedicaC;
    }

    /**
     * Gets the value of relation through role AgentexProducto
     */
    @JsonIgnore
    public Collection <AgentexProducto> getAgentexProducto() {
        return agentexProducto;
    }

    /**
     * Default constructor
     */
    public Productos() {
        productosProducto = null;
    }

    /**
     * Constructor used to create instances of <code>Productos</code>.
     * @param oid Object Identifier of the instance of <code>Productos</code> to be created.
     * @throws SystemException
     */
    public Productos(ProductosOid oid) {
        if (oid != null && !oid.isNull()) {
            productosProducto = oid.getProductosProducto();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return Productos.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Productos other = (Productos)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getProductosProducto(), other.getProductosProducto());
        result &= Utilities.isEqual(this.getProductosDescripcion(), other.getProductosDescripcion());
        result &= Utilities.isEqual(this.getProductosCodAnexoMat(), other.getProductosCodAnexoMat());
        result &= Utilities.isEqual(this.getProductosCodAnexoNeo(), other.getProductosCodAnexoNeo());
        result &= Utilities.isEqual(this.getProductosNIT(), other.getProductosNIT());
        result &= Utilities.isEqual(this.getProductosCodigoLegal(), other.getProductosCodigoLegal());
        result &= Utilities.isEqual(this.getProductosFechaDocSolicitud(), other.getProductosFechaDocSolicitud());
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
     * Returns the <code>ProductosOid</code> object that identifies this instance of <code>Productos</code>.
     * @return <code>ProductosOid</code> object that identifies this instance of <code>Productos</code>
     */
	@Override
    public ProductosOid getOid() {
        return new ProductosOid(getProductosProducto());
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
        if (!activeFacets.contains(Constants.PRODUCTOS)) {
            activeFacets.add(Constants.PRODUCTOS);
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
            relatedInstance = buildProductosRelatedInstance(relatedInstanceJsonOid);
        }
        if (ProductosConstants.ROLE_NAME_PLANES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildProductosRelatedInstance4Planes(relatedInstanceJsonOid, remainingPath);
        }
        if (ProductosConstants.ROLE_NAME_DOMINIOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildProductosRelatedInstance4Dominio(relatedInstanceJsonOid, remainingPath);
        }
        if (ProductosConstants.ROLE_NAME_TARIFAS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildProductosRelatedInstance4Tarifa(relatedInstanceJsonOid, remainingPath);
        }
        if (ProductosConstants.ROLE_NAME_GRUPOSASOCIADOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildProductosRelatedInstance4GrupoAsociado(relatedInstanceJsonOid, remainingPath);
        }
        if (ProductosConstants.ROLE_NAME_TIPOSIVA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildProductosRelatedInstance4TipoIVA(relatedInstanceJsonOid, remainingPath);
        }
        if (ProductosConstants.ROLE_NAME_AESOLICITUDES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildProductosRelatedInstance4Aesolicitudes(relatedInstanceJsonOid, remainingPath);
        }
        if (ProductosConstants.ROLE_NAME_PROTECCIONDATOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildProductosRelatedInstance4ProteccionDatosC(relatedInstanceJsonOid, remainingPath);
        }
        if (ProductosConstants.ROLE_NAME_PROTECCIONESDATOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildProductosRelatedInstance4ProteccionDatos(relatedInstanceJsonOid, remainingPath);
        }
        if (ProductosConstants.ROLE_NAME_CONTRATOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildProductosRelatedInstance4ContratoC(relatedInstanceJsonOid, remainingPath);
        }
        if (ProductosConstants.ROLE_NAME_MARCAMEDICAC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildProductosRelatedInstance4MarcaMedicaC(relatedInstanceJsonOid, remainingPath);
        }
        if (ProductosConstants.ROLE_NAME_AGENTEXPRODUCTO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildProductosRelatedInstance4AgentexProducto(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildProductosRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Productos(mapper.readValue(relatedInstanceJsonOid, ProductosOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Productos.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildProductosRelatedInstance4Planes(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Planes(mapper.readValue(relatedInstanceJsonOid, PlanesOid.class)): Planes.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Productos.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildProductosRelatedInstance4Dominio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Dominio(mapper.readValue(relatedInstanceJsonOid, DominioOid.class)): Dominio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Productos.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildProductosRelatedInstance4Tarifa(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Tarifa(mapper.readValue(relatedInstanceJsonOid, TarifaOid.class)): Tarifa.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Productos.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildProductosRelatedInstance4GrupoAsociado(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new GrupoAsociado(mapper.readValue(relatedInstanceJsonOid, GrupoAsociadoOid.class)): GrupoAsociado.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Productos.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildProductosRelatedInstance4TipoIVA(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TipoIVA(mapper.readValue(relatedInstanceJsonOid, TipoIVAOid.class)): TipoIVA.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Productos.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildProductosRelatedInstance4Aesolicitudes(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Aesolicitudes(mapper.readValue(relatedInstanceJsonOid, AesolicitudesOid.class)): Aesolicitudes.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Productos.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildProductosRelatedInstance4ProteccionDatosC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ProteccionDatosC(mapper.readValue(relatedInstanceJsonOid, ProteccionDatosCOid.class)): ProteccionDatosC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Productos.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildProductosRelatedInstance4ProteccionDatos(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ProteccionDatos(mapper.readValue(relatedInstanceJsonOid, ProteccionDatosOid.class)): ProteccionDatos.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Productos.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildProductosRelatedInstance4ContratoC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ContratoC(mapper.readValue(relatedInstanceJsonOid, ContratoCOid.class)): ContratoC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Productos.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildProductosRelatedInstance4MarcaMedicaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new MarcaMedicaC(mapper.readValue(relatedInstanceJsonOid, MarcaMedicaCOid.class)): MarcaMedicaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Productos.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildProductosRelatedInstance4AgentexProducto(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new AgentexProducto(mapper.readValue(relatedInstanceJsonOid, AgentexProductoOid.class)): AgentexProducto.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Productos.class).error(e.getMessage());
            return null;
        }
    }
}
