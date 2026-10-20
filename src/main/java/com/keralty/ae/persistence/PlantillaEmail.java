package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.PlantillaEmailConstants;
import com.keralty.ae.persistence.oid.DominioOid;
import com.keralty.ae.persistence.oid.PlantillaEmailOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>PlantillaEmail</code> external model class.
 * <p>
 * External Model Class: <code>PlantillaEmail</code><br>
 */
public class PlantillaEmail extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="idplantilla")
    private Long plantillaEmailIdPlantilla;

    @JsonProperty(value="codigo")
    private Long plantillaEmailCodigo;

    @JsonProperty(value="descripcion")
    private String plantillaEmailDescripcion;

    @JsonProperty(value="asunto")
    private String plantillaEmailAsunto;

    @JsonProperty(value="textomensaje")
    private String plantillaEmailTextoMensaje;

    @JsonProperty(value="emailconf")
    private String plantillaEmailEmailConf;

    private Collection <Dominio> dominios;

    /**
     * Gets the value of attribute IdPlantilla
     */
    public Long getPlantillaEmailIdPlantilla() {
        return plantillaEmailIdPlantilla;
    }
    
    /**
     * Sets the value of attribute IdPlantilla
     */
    public void setPlantillaEmailIdPlantilla(Long plantillaEmailIdPlantilla) {
        this.plantillaEmailIdPlantilla = plantillaEmailIdPlantilla;
    }

    /**
     * Gets the value of attribute Codigo
     */
    public Long getPlantillaEmailCodigo() {
        return plantillaEmailCodigo;
    }
    
    /**
     * Sets the value of attribute Codigo
     */
    public void setPlantillaEmailCodigo(Long plantillaEmailCodigo) {
        this.plantillaEmailCodigo = plantillaEmailCodigo;
    }

    /**
     * Gets the value of attribute Descripcion
     */
    public String getPlantillaEmailDescripcion() {
        return plantillaEmailDescripcion;
    }
    
    /**
     * Sets the value of attribute Descripcion
     */
    public void setPlantillaEmailDescripcion(String plantillaEmailDescripcion) {
        this.plantillaEmailDescripcion = plantillaEmailDescripcion;
    }

    /**
     * Gets the value of attribute Asunto
     */
    public String getPlantillaEmailAsunto() {
        return plantillaEmailAsunto;
    }
    
    /**
     * Sets the value of attribute Asunto
     */
    public void setPlantillaEmailAsunto(String plantillaEmailAsunto) {
        this.plantillaEmailAsunto = plantillaEmailAsunto;
    }

    /**
     * Gets the value of attribute TextoMensaje
     */
    public String getPlantillaEmailTextoMensaje() {
        return plantillaEmailTextoMensaje;
    }
    
    /**
     * Sets the value of attribute TextoMensaje
     */
    public void setPlantillaEmailTextoMensaje(String plantillaEmailTextoMensaje) {
        this.plantillaEmailTextoMensaje = plantillaEmailTextoMensaje;
    }

    /**
     * Gets the value of attribute EmailConf
     */
    public String getPlantillaEmailEmailConf() {
        return plantillaEmailEmailConf;
    }
    
    /**
     * Sets the value of attribute EmailConf
     */
    public void setPlantillaEmailEmailConf(String plantillaEmailEmailConf) {
        this.plantillaEmailEmailConf = plantillaEmailEmailConf;
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
    public PlantillaEmail() {
        plantillaEmailIdPlantilla = null;
    }

    /**
     * Constructor used to create instances of <code>PlantillaEmail</code>.
     * @param oid Object Identifier of the instance of <code>PlantillaEmail</code> to be created.
     * @throws SystemException
     */
    public PlantillaEmail(PlantillaEmailOid oid) {
        if (oid != null && !oid.isNull()) {
            plantillaEmailIdPlantilla = oid.getPlantillaEmailIdPlantilla();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return PlantillaEmail.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        PlantillaEmail other = (PlantillaEmail)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getPlantillaEmailIdPlantilla(), other.getPlantillaEmailIdPlantilla());
        result &= Utilities.isEqual(this.getPlantillaEmailCodigo(), other.getPlantillaEmailCodigo());
        result &= Utilities.isEqual(this.getPlantillaEmailDescripcion(), other.getPlantillaEmailDescripcion());
        result &= Utilities.isEqual(this.getPlantillaEmailAsunto(), other.getPlantillaEmailAsunto());
        result &= Utilities.isEqual(this.getPlantillaEmailTextoMensaje(), other.getPlantillaEmailTextoMensaje());
        result &= Utilities.isEqual(this.getPlantillaEmailEmailConf(), other.getPlantillaEmailEmailConf());
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
     * Returns the <code>PlantillaEmailOid</code> object that identifies this instance of <code>PlantillaEmail</code>.
     * @return <code>PlantillaEmailOid</code> object that identifies this instance of <code>PlantillaEmail</code>
     */
	@Override
    public PlantillaEmailOid getOid() {
        return new PlantillaEmailOid(getPlantillaEmailIdPlantilla());
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
        if (!activeFacets.contains(Constants.PLANTILLAEMAIL)) {
            activeFacets.add(Constants.PLANTILLAEMAIL);
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
            relatedInstance = buildPlantillaEmailRelatedInstance(relatedInstanceJsonOid);
        }
        if (PlantillaEmailConstants.ROLE_NAME_DOMINIOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPlantillaEmailRelatedInstance4Dominio(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildPlantillaEmailRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new PlantillaEmail(mapper.readValue(relatedInstanceJsonOid, PlantillaEmailOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PlantillaEmail.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPlantillaEmailRelatedInstance4Dominio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Dominio(mapper.readValue(relatedInstanceJsonOid, DominioOid.class)): Dominio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PlantillaEmail.class).error(e.getMessage());
            return null;
        }
    }
}
