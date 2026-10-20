package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.AgentexProductoConstants;
import com.keralty.ae.global.Constants;
import com.keralty.ae.persistence.oid.AgentexProductoOid;
import com.keralty.ae.persistence.oid.AsesorOid;
import com.keralty.ae.persistence.oid.DominioOid;
import com.keralty.ae.persistence.oid.ProductosOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>AgentexProducto</code> external model class.
 * <p>
 * External Model Class: <code>AgentexProducto</code><br>
 */
public class AgentexProducto extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="asesor_id")
    private Long funcionarioAsesorId;

    @JsonProperty(value="id")
    private Long agentexProductoId;

    @JsonProperty(value="codigo")
    private Long agentexProductoCodigo;

    @JsonProperty(value="fechainicio")
    private Timestamp agentexProductoFechaInicio;

    @JsonProperty(value="fechafin")
    private Timestamp agentexProductoFechaFin;

    @JsonProperty(value="drvvigente")
    private Boolean agentexProductodrvVigente;

    @JsonProperty(value="todosdominios")
    private Boolean agentexProductoTodosDominios;

    private Productos productoT;

    private Asesor asesor;

    private Collection <Dominio> dominios;

    /**
     * Gets the value of attribute Id
     */
    public Long getFuncionarioAsesorId() {
        return funcionarioAsesorId;
    }
    
    /**
     * Sets the value of attribute Id
     */
    public void setFuncionarioAsesorId(Long funcionarioAsesorId) {
        this.funcionarioAsesorId = funcionarioAsesorId;
    }

    /**
     * Gets the value of attribute Id
     */
    public Long getAgentexProductoId() {
        return agentexProductoId;
    }
    
    /**
     * Sets the value of attribute Id
     */
    public void setAgentexProductoId(Long agentexProductoId) {
        this.agentexProductoId = agentexProductoId;
    }

    /**
     * Gets the value of attribute Codigo
     */
    public Long getAgentexProductoCodigo() {
        return agentexProductoCodigo;
    }
    
    /**
     * Sets the value of attribute Codigo
     */
    public void setAgentexProductoCodigo(Long agentexProductoCodigo) {
        this.agentexProductoCodigo = agentexProductoCodigo;
    }

    /**
     * Gets the value of attribute FechaInicio
     */
    public Timestamp getAgentexProductoFechaInicio() {
        return agentexProductoFechaInicio;
    }
    
    /**
     * Sets the value of attribute FechaInicio
     */
    public void setAgentexProductoFechaInicio(Timestamp agentexProductoFechaInicio) {
        this.agentexProductoFechaInicio = agentexProductoFechaInicio;
    }

    /**
     * Gets the value of attribute FechaFin
     */
    public Timestamp getAgentexProductoFechaFin() {
        return agentexProductoFechaFin;
    }
    
    /**
     * Sets the value of attribute FechaFin
     */
    public void setAgentexProductoFechaFin(Timestamp agentexProductoFechaFin) {
        this.agentexProductoFechaFin = agentexProductoFechaFin;
    }

    /**
     * Gets the value of attribute drvVigente
     */
    public Boolean getAgentexProductodrvVigente() {
        return agentexProductodrvVigente;
    }
    
    /**
     * Sets the value of attribute drvVigente
     */
    public void setAgentexProductodrvVigente(Boolean agentexProductodrvVigente) {
        this.agentexProductodrvVigente = agentexProductodrvVigente;
    }

    /**
     * Gets the value of attribute TodosDominios
     */
    public Boolean getAgentexProductoTodosDominios() {
        return agentexProductoTodosDominios;
    }
    
    /**
     * Sets the value of attribute TodosDominios
     */
    public void setAgentexProductoTodosDominios(Boolean agentexProductoTodosDominios) {
        this.agentexProductoTodosDominios = agentexProductoTodosDominios;
    }

    /**
     * Gets the value of relation through role ProductoT
     */
    @JsonIgnore
    public Productos getProductoT() {
        return productoT;
    }

    /**
     * Gets the value of relation through role Asesor
     */
    @JsonIgnore
    public Asesor getAsesor() {
        return asesor;
    }

    /**
     * Gets the value of relation through role Dominios
     */
    @JsonIgnore
    public Collection <Dominio> getDominios() {
        return dominios;
    }

    /**
     * Default constructor
     */
    public AgentexProducto() {
        funcionarioAsesorId = null;
        agentexProductoId = null;
    }

    /**
     * Constructor used to create instances of <code>AgentexProducto</code>.
     * @param oid Object Identifier of the instance of <code>AgentexProducto</code> to be created.
     * @throws SystemException
     */
    public AgentexProducto(AgentexProductoOid oid) {
        if (oid != null && !oid.isNull()) {
            funcionarioAsesorId = oid.getFuncionarioAsesorId();
            agentexProductoId = oid.getAgentexProductoId();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return AgentexProducto.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        AgentexProducto other = (AgentexProducto)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getAgentexProductoId(), other.getAgentexProductoId());
        result &= Utilities.isEqual(this.getAgentexProductoCodigo(), other.getAgentexProductoCodigo());
        result &= Utilities.isEqual(this.getAgentexProductoFechaInicio(), other.getAgentexProductoFechaInicio());
        result &= Utilities.isEqual(this.getAgentexProductoFechaFin(), other.getAgentexProductoFechaFin());
        result &= Utilities.isEqual(this.getAgentexProductodrvVigente(), other.getAgentexProductodrvVigente());
        result &= Utilities.isEqual(this.getAgentexProductoTodosDominios(), other.getAgentexProductoTodosDominios());
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
     * Returns the <code>AgentexProductoOid</code> object that identifies this instance of <code>AgentexProducto</code>.
     * @return <code>AgentexProductoOid</code> object that identifies this instance of <code>AgentexProducto</code>
     */
	@Override
    public AgentexProductoOid getOid() {
        return new AgentexProductoOid(getFuncionarioAsesorId(), getAgentexProductoId());
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
        if (!activeFacets.contains(Constants.AGENTEXPRODUCTO)) {
            activeFacets.add(Constants.AGENTEXPRODUCTO);
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
            relatedInstance = buildAgentexProductoRelatedInstance(relatedInstanceJsonOid);
        }
        if (AgentexProductoConstants.ROLE_NAME_PRODUCTOT.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAgentexProductoRelatedInstance4Productos(relatedInstanceJsonOid, remainingPath);
        }
        if (AgentexProductoConstants.ROLE_NAME_ASESOR.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAgentexProductoRelatedInstance4Asesor(relatedInstanceJsonOid, remainingPath);
        }
        if (AgentexProductoConstants.ROLE_NAME_DOMINIOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAgentexProductoRelatedInstance4Dominio(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildAgentexProductoRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new AgentexProducto(mapper.readValue(relatedInstanceJsonOid, AgentexProductoOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(AgentexProducto.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildAgentexProductoRelatedInstance4Productos(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Productos(mapper.readValue(relatedInstanceJsonOid, ProductosOid.class)): Productos.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(AgentexProducto.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildAgentexProductoRelatedInstance4Asesor(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Asesor(mapper.readValue(relatedInstanceJsonOid, AsesorOid.class)): Asesor.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(AgentexProducto.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildAgentexProductoRelatedInstance4Dominio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Dominio(mapper.readValue(relatedInstanceJsonOid, DominioOid.class)): Dominio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(AgentexProducto.class).error(e.getMessage());
            return null;
        }
    }
}
