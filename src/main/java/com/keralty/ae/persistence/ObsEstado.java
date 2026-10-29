package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.ObsEstadoConstants;
import com.keralty.ae.persistence.oid.DocumentoGOid;
import com.keralty.ae.persistence.oid.FuncionarioOid;
import com.keralty.ae.persistence.oid.ObsEstadoOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>ObsEstado</code> external model class.
 * <p>
 * External Model Class: <code>ObsEstado</code><br>
 */
public class ObsEstado extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="identificador")
    private Long documentoGIdentificador;

    @JsonProperty(value="id")
    private Long obsEstadoId;

    @JsonProperty(value="observacions")
    private String obsEstadoObservacions;

    @JsonProperty(value="estadoanterior")
    private Long obsEstadoEstadoAnterior;

    @JsonProperty(value="estadonuevo")
    private Long obsEstadoEstadoNuevo;

    @JsonProperty(value="fecha")
    private Timestamp obsEstadoFecha;

    private DocumentoG documentoG;

    private Funcionario agente;

    /**
     * Gets the value of attribute Identificador
     */
    public Long getDocumentoGIdentificador() {
        return documentoGIdentificador;
    }
    
    /**
     * Sets the value of attribute Identificador
     */
    public void setDocumentoGIdentificador(Long documentoGIdentificador) {
        this.documentoGIdentificador = documentoGIdentificador;
    }

    /**
     * Gets the value of attribute Id
     */
    public Long getObsEstadoId() {
        return obsEstadoId;
    }
    
    /**
     * Sets the value of attribute Id
     */
    public void setObsEstadoId(Long obsEstadoId) {
        this.obsEstadoId = obsEstadoId;
    }

    /**
     * Gets the value of attribute Observacions
     */
    public String getObsEstadoObservacions() {
        return obsEstadoObservacions;
    }
    
    /**
     * Sets the value of attribute Observacions
     */
    public void setObsEstadoObservacions(String obsEstadoObservacions) {
        this.obsEstadoObservacions = obsEstadoObservacions;
    }

    /**
     * Gets the value of attribute EstadoAnterior
     */
    public Long getObsEstadoEstadoAnterior() {
        return obsEstadoEstadoAnterior;
    }
    
    /**
     * Sets the value of attribute EstadoAnterior
     */
    public void setObsEstadoEstadoAnterior(Long obsEstadoEstadoAnterior) {
        this.obsEstadoEstadoAnterior = obsEstadoEstadoAnterior;
    }

    /**
     * Gets the value of attribute EstadoNuevo
     */
    public Long getObsEstadoEstadoNuevo() {
        return obsEstadoEstadoNuevo;
    }
    
    /**
     * Sets the value of attribute EstadoNuevo
     */
    public void setObsEstadoEstadoNuevo(Long obsEstadoEstadoNuevo) {
        this.obsEstadoEstadoNuevo = obsEstadoEstadoNuevo;
    }

    /**
     * Gets the value of attribute Fecha
     */
    public Timestamp getObsEstadoFecha() {
        return obsEstadoFecha;
    }
    
    /**
     * Sets the value of attribute Fecha
     */
    public void setObsEstadoFecha(Timestamp obsEstadoFecha) {
        this.obsEstadoFecha = obsEstadoFecha;
    }

    /**
     * Gets the value of relation through role DocumentoG
     */
    @JsonIgnore
    public DocumentoG getDocumentoG() {
        return documentoG;
    }

    /**
     * Gets the value of relation through role Agente
     */
    @JsonIgnore
    public Funcionario getAgente() {
        return agente;
    }

    /**
     * Default constructor
     */
    public ObsEstado() {
        documentoGIdentificador = null;
        obsEstadoId = null;
    }

    /**
     * Constructor used to create instances of <code>ObsEstado</code>.
     * @param oid Object Identifier of the instance of <code>ObsEstado</code> to be created.
     * @throws SystemException
     */
    public ObsEstado(ObsEstadoOid oid) {
        if (oid != null && !oid.isNull()) {
            documentoGIdentificador = oid.getDocumentoGIdentificador();
            obsEstadoId = oid.getObsEstadoId();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return ObsEstado.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        ObsEstado other = (ObsEstado)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getObsEstadoId(), other.getObsEstadoId());
        result &= Utilities.isEqual(this.getObsEstadoObservacions(), other.getObsEstadoObservacions());
        result &= Utilities.isEqual(this.getObsEstadoEstadoAnterior(), other.getObsEstadoEstadoAnterior());
        result &= Utilities.isEqual(this.getObsEstadoEstadoNuevo(), other.getObsEstadoEstadoNuevo());
        result &= Utilities.isEqual(this.getObsEstadoFecha(), other.getObsEstadoFecha());
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
     * Returns the <code>ObsEstadoOid</code> object that identifies this instance of <code>ObsEstado</code>.
     * @return <code>ObsEstadoOid</code> object that identifies this instance of <code>ObsEstado</code>
     */
	@Override
    public ObsEstadoOid getOid() {
        return new ObsEstadoOid(getDocumentoGIdentificador(), getObsEstadoId());
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
        if (!activeFacets.contains(Constants.OBSESTADO)) {
            activeFacets.add(Constants.OBSESTADO);
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
            relatedInstance = buildObsEstadoRelatedInstance(relatedInstanceJsonOid);
        }
        if (ObsEstadoConstants.ROLE_NAME_DOCUMENTOG.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildObsEstadoRelatedInstance4DocumentoG(relatedInstanceJsonOid, remainingPath);
        }
        if (ObsEstadoConstants.ROLE_NAME_AGENTE.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildObsEstadoRelatedInstance4Funcionario(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildObsEstadoRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new ObsEstado(mapper.readValue(relatedInstanceJsonOid, ObsEstadoOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ObsEstado.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildObsEstadoRelatedInstance4DocumentoG(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new DocumentoG(mapper.readValue(relatedInstanceJsonOid, DocumentoGOid.class)): DocumentoG.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ObsEstado.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildObsEstadoRelatedInstance4Funcionario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Funcionario(mapper.readValue(relatedInstanceJsonOid, FuncionarioOid.class)): Funcionario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(ObsEstado.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
