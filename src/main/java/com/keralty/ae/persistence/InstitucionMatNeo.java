package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.InstitucionMatNeoConstants;
import com.keralty.ae.persistence.oid.AnexoMatOid;
import com.keralty.ae.persistence.oid.AnexoNeoOid;
import com.keralty.ae.persistence.oid.InstitucionMatNeoOid;
import com.keralty.ae.persistence.oid.MunicipioOid;
import com.keralty.ae.persistence.oid.TarifaOid;
import com.keralty.ae.persistence.oid.TipoIdentificacionOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>InstitucionMatNeo</code> external model class.
 * <p>
 * External Model Class: <code>InstitucionMatNeo</code><br>
 */
public class InstitucionMatNeo extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="codigo")
    private String institucionMatNeoCodigo;

    @JsonProperty(value="numidentificacion")
    private String institucionMatNeoNumIdentificacion;

    @JsonProperty(value="nombre")
    private String institucionMatNeoNombre;

    @JsonProperty(value="paramaternidad")
    private Boolean institucionMatNeoParaMaternidad;

    @JsonProperty(value="paraneonatal")
    private Boolean institucionMatNeoParaNeonatal;

    @JsonProperty(value="fechainicial")
    private Date institucionMatNeoFechaInicial;

    @JsonProperty(value="fechafinal")
    private Date institucionMatNeoFechaFinal;

    private Collection <AnexoMat> anexoMat;

    private Collection <AnexoNeo> anexoNeo;

    private TipoIdentificacion tipoIdentificacion;

    private Tarifa tarifa;

    private Municipio municipio;

    /**
     * Gets the value of attribute Codigo
     */
    public String getInstitucionMatNeoCodigo() {
        return institucionMatNeoCodigo;
    }
    
    /**
     * Sets the value of attribute Codigo
     */
    public void setInstitucionMatNeoCodigo(String institucionMatNeoCodigo) {
        this.institucionMatNeoCodigo = institucionMatNeoCodigo;
    }

    /**
     * Gets the value of attribute NumIdentificacion
     */
    public String getInstitucionMatNeoNumIdentificacion() {
        return institucionMatNeoNumIdentificacion;
    }
    
    /**
     * Sets the value of attribute NumIdentificacion
     */
    public void setInstitucionMatNeoNumIdentificacion(String institucionMatNeoNumIdentificacion) {
        this.institucionMatNeoNumIdentificacion = institucionMatNeoNumIdentificacion;
    }

    /**
     * Gets the value of attribute Nombre
     */
    public String getInstitucionMatNeoNombre() {
        return institucionMatNeoNombre;
    }
    
    /**
     * Sets the value of attribute Nombre
     */
    public void setInstitucionMatNeoNombre(String institucionMatNeoNombre) {
        this.institucionMatNeoNombre = institucionMatNeoNombre;
    }

    /**
     * Gets the value of attribute ParaMaternidad
     */
    public Boolean getInstitucionMatNeoParaMaternidad() {
        return institucionMatNeoParaMaternidad;
    }
    
    /**
     * Sets the value of attribute ParaMaternidad
     */
    public void setInstitucionMatNeoParaMaternidad(Boolean institucionMatNeoParaMaternidad) {
        this.institucionMatNeoParaMaternidad = institucionMatNeoParaMaternidad;
    }

    /**
     * Gets the value of attribute ParaNeonatal
     */
    public Boolean getInstitucionMatNeoParaNeonatal() {
        return institucionMatNeoParaNeonatal;
    }
    
    /**
     * Sets the value of attribute ParaNeonatal
     */
    public void setInstitucionMatNeoParaNeonatal(Boolean institucionMatNeoParaNeonatal) {
        this.institucionMatNeoParaNeonatal = institucionMatNeoParaNeonatal;
    }

    /**
     * Gets the value of attribute FechaInicial
     */
    public Date getInstitucionMatNeoFechaInicial() {
        return institucionMatNeoFechaInicial;
    }
    
    /**
     * Sets the value of attribute FechaInicial
     */
    public void setInstitucionMatNeoFechaInicial(Date institucionMatNeoFechaInicial) {
        this.institucionMatNeoFechaInicial = institucionMatNeoFechaInicial;
    }

    /**
     * Gets the value of attribute FechaFinal
     */
    public Date getInstitucionMatNeoFechaFinal() {
        return institucionMatNeoFechaFinal;
    }
    
    /**
     * Sets the value of attribute FechaFinal
     */
    public void setInstitucionMatNeoFechaFinal(Date institucionMatNeoFechaFinal) {
        this.institucionMatNeoFechaFinal = institucionMatNeoFechaFinal;
    }

    /**
     * Gets the value of relation through role AnexoMat
     */
    @JsonIgnore
    public Collection <AnexoMat> getAnexoMat() {
        return anexoMat;
    }

    /**
     * Gets the value of relation through role AnexoNeo
     */
    @JsonIgnore
    public Collection <AnexoNeo> getAnexoNeo() {
        return anexoNeo;
    }

    /**
     * Gets the value of relation through role TipoIdentificacion
     */
    @JsonIgnore
    public TipoIdentificacion getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    /**
     * Gets the value of relation through role Tarifa
     */
    @JsonIgnore
    public Tarifa getTarifa() {
        return tarifa;
    }

    /**
     * Gets the value of relation through role Municipio
     */
    @JsonIgnore
    public Municipio getMunicipio() {
        return municipio;
    }

    /**
     * Default constructor
     */
    public InstitucionMatNeo() {
        institucionMatNeoCodigo = null;
    }

    /**
     * Constructor used to create instances of <code>InstitucionMatNeo</code>.
     * @param oid Object Identifier of the instance of <code>InstitucionMatNeo</code> to be created.
     * @throws SystemException
     */
    public InstitucionMatNeo(InstitucionMatNeoOid oid) {
        if (oid != null && !oid.isNull()) {
            institucionMatNeoCodigo = oid.getInstitucionMatNeoCodigo();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return InstitucionMatNeo.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        InstitucionMatNeo other = (InstitucionMatNeo)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getInstitucionMatNeoCodigo(), other.getInstitucionMatNeoCodigo());
        result &= Utilities.isEqual(this.getInstitucionMatNeoNumIdentificacion(), other.getInstitucionMatNeoNumIdentificacion());
        result &= Utilities.isEqual(this.getInstitucionMatNeoNombre(), other.getInstitucionMatNeoNombre());
        result &= Utilities.isEqual(this.getInstitucionMatNeoParaMaternidad(), other.getInstitucionMatNeoParaMaternidad());
        result &= Utilities.isEqual(this.getInstitucionMatNeoParaNeonatal(), other.getInstitucionMatNeoParaNeonatal());
        result &= Utilities.isEqual(this.getInstitucionMatNeoFechaInicial(), other.getInstitucionMatNeoFechaInicial());
        result &= Utilities.isEqual(this.getInstitucionMatNeoFechaFinal(), other.getInstitucionMatNeoFechaFinal());
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
     * Returns the <code>InstitucionMatNeoOid</code> object that identifies this instance of <code>InstitucionMatNeo</code>.
     * @return <code>InstitucionMatNeoOid</code> object that identifies this instance of <code>InstitucionMatNeo</code>
     */
	@Override
    public InstitucionMatNeoOid getOid() {
        return new InstitucionMatNeoOid(getInstitucionMatNeoCodigo());
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
        if (!activeFacets.contains(Constants.INSTITUCIONMATNEO)) {
            activeFacets.add(Constants.INSTITUCIONMATNEO);
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
            relatedInstance = buildInstitucionMatNeoRelatedInstance(relatedInstanceJsonOid);
        }
        if (InstitucionMatNeoConstants.ROLE_NAME_ANEXOMAT.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildInstitucionMatNeoRelatedInstance4AnexoMat(relatedInstanceJsonOid, remainingPath);
        }
        if (InstitucionMatNeoConstants.ROLE_NAME_ANEXONEO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildInstitucionMatNeoRelatedInstance4AnexoNeo(relatedInstanceJsonOid, remainingPath);
        }
        if (InstitucionMatNeoConstants.ROLE_NAME_TIPOIDENTIFICACION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildInstitucionMatNeoRelatedInstance4TipoIdentificacion(relatedInstanceJsonOid, remainingPath);
        }
        if (InstitucionMatNeoConstants.ROLE_NAME_TARIFA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildInstitucionMatNeoRelatedInstance4Tarifa(relatedInstanceJsonOid, remainingPath);
        }
        if (InstitucionMatNeoConstants.ROLE_NAME_MUNICIPIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildInstitucionMatNeoRelatedInstance4Municipio(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildInstitucionMatNeoRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new InstitucionMatNeo(mapper.readValue(relatedInstanceJsonOid, InstitucionMatNeoOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(InstitucionMatNeo.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildInstitucionMatNeoRelatedInstance4AnexoMat(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new AnexoMat(mapper.readValue(relatedInstanceJsonOid, AnexoMatOid.class)): AnexoMat.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(InstitucionMatNeo.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildInstitucionMatNeoRelatedInstance4AnexoNeo(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new AnexoNeo(mapper.readValue(relatedInstanceJsonOid, AnexoNeoOid.class)): AnexoNeo.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(InstitucionMatNeo.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildInstitucionMatNeoRelatedInstance4TipoIdentificacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TipoIdentificacion(mapper.readValue(relatedInstanceJsonOid, TipoIdentificacionOid.class)): TipoIdentificacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(InstitucionMatNeo.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildInstitucionMatNeoRelatedInstance4Tarifa(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Tarifa(mapper.readValue(relatedInstanceJsonOid, TarifaOid.class)): Tarifa.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(InstitucionMatNeo.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildInstitucionMatNeoRelatedInstance4Municipio(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Municipio(mapper.readValue(relatedInstanceJsonOid, MunicipioOid.class)): Municipio.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(InstitucionMatNeo.class).error(e.getMessage());
            return null;
        }
    }
}
