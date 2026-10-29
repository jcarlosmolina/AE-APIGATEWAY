package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.AnexoNeoConstants;
import com.keralty.ae.global.Constants;
import com.keralty.ae.persistence.oid.AnexoNeoOid;
import com.keralty.ae.persistence.oid.InstitucionMatNeoOid;
import com.keralty.ae.persistence.oid.PeriodicidadOid;
import com.keralty.ae.persistence.oid.UsuarioOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>AnexoNeo</code> external model class.
 * <p>
 * External Model Class: <code>AnexoNeo</code><br>
 */
public class AnexoNeo extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="identificador")
    private Long anexoNeoIdentificador;

    @JsonProperty(value="fechaultregla")
    private Date anexoNeoFechaUltRegla;

    @JsonProperty(value="numhijos")
    private Long anexoNeoNumHijos;

    @JsonProperty(value="numcuotas")
    private Long anexoNeoNumCuotas;

    @JsonProperty(value="drvvalor")
    private Double anexoNeodrvValor;

    private Usuario usuario;

    private Periodicidad periodicidad;

    private InstitucionMatNeo institucionNeonatal;

    /**
     * Gets the value of attribute Identificador
     */
    public Long getAnexoNeoIdentificador() {
        return anexoNeoIdentificador;
    }
    
    /**
     * Sets the value of attribute Identificador
     */
    public void setAnexoNeoIdentificador(Long anexoNeoIdentificador) {
        this.anexoNeoIdentificador = anexoNeoIdentificador;
    }

    /**
     * Gets the value of attribute FechaUltRegla
     */
    public Date getAnexoNeoFechaUltRegla() {
        return anexoNeoFechaUltRegla;
    }
    
    /**
     * Sets the value of attribute FechaUltRegla
     */
    public void setAnexoNeoFechaUltRegla(Date anexoNeoFechaUltRegla) {
        this.anexoNeoFechaUltRegla = anexoNeoFechaUltRegla;
    }

    /**
     * Gets the value of attribute NumHijos
     */
    public Long getAnexoNeoNumHijos() {
        return anexoNeoNumHijos;
    }
    
    /**
     * Sets the value of attribute NumHijos
     */
    public void setAnexoNeoNumHijos(Long anexoNeoNumHijos) {
        this.anexoNeoNumHijos = anexoNeoNumHijos;
    }

    /**
     * Gets the value of attribute NumCuotas
     */
    public Long getAnexoNeoNumCuotas() {
        return anexoNeoNumCuotas;
    }
    
    /**
     * Sets the value of attribute NumCuotas
     */
    public void setAnexoNeoNumCuotas(Long anexoNeoNumCuotas) {
        this.anexoNeoNumCuotas = anexoNeoNumCuotas;
    }

    /**
     * Gets the value of attribute drvValor
     */
    public Double getAnexoNeodrvValor() {
        return anexoNeodrvValor;
    }
    
    /**
     * Sets the value of attribute drvValor
     */
    public void setAnexoNeodrvValor(Double anexoNeodrvValor) {
        this.anexoNeodrvValor = anexoNeodrvValor;
    }

    /**
     * Gets the value of relation through role Usuario
     */
    @JsonIgnore
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Gets the value of relation through role Periodicidad
     */
    @JsonIgnore
    public Periodicidad getPeriodicidad() {
        return periodicidad;
    }

    /**
     * Gets the value of relation through role InstitucionNeonatal
     */
    @JsonIgnore
    public InstitucionMatNeo getInstitucionNeonatal() {
        return institucionNeonatal;
    }

    /**
     * Default constructor
     */
    public AnexoNeo() {
        anexoNeoIdentificador = null;
    }

    /**
     * Constructor used to create instances of <code>AnexoNeo</code>.
     * @param oid Object Identifier of the instance of <code>AnexoNeo</code> to be created.
     * @throws SystemException
     */
    public AnexoNeo(AnexoNeoOid oid) {
        if (oid != null && !oid.isNull()) {
            anexoNeoIdentificador = oid.getAnexoNeoIdentificador();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return AnexoNeo.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        AnexoNeo other = (AnexoNeo)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getAnexoNeoIdentificador(), other.getAnexoNeoIdentificador());
        result &= Utilities.isEqual(this.getAnexoNeoFechaUltRegla(), other.getAnexoNeoFechaUltRegla());
        result &= Utilities.isEqual(this.getAnexoNeoNumHijos(), other.getAnexoNeoNumHijos());
        result &= Utilities.isEqual(this.getAnexoNeoNumCuotas(), other.getAnexoNeoNumCuotas());
        result &= Utilities.isEqual(this.getAnexoNeodrvValor(), other.getAnexoNeodrvValor());
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
     * Returns the <code>AnexoNeoOid</code> object that identifies this instance of <code>AnexoNeo</code>.
     * @return <code>AnexoNeoOid</code> object that identifies this instance of <code>AnexoNeo</code>
     */
	@Override
    public AnexoNeoOid getOid() {
        return new AnexoNeoOid(getAnexoNeoIdentificador());
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
        if (!activeFacets.contains(Constants.ANEXONEO)) {
            activeFacets.add(Constants.ANEXONEO);
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
            relatedInstance = buildAnexoNeoRelatedInstance(relatedInstanceJsonOid);
        }
        if (AnexoNeoConstants.ROLE_NAME_USUARIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAnexoNeoRelatedInstance4Usuario(relatedInstanceJsonOid, remainingPath);
        }
        if (AnexoNeoConstants.ROLE_NAME_PERIODICIDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAnexoNeoRelatedInstance4Periodicidad(relatedInstanceJsonOid, remainingPath);
        }
        if (AnexoNeoConstants.ROLE_NAME_INSTITUCIONNEONATAL.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAnexoNeoRelatedInstance4InstitucionMatNeo(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildAnexoNeoRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new AnexoNeo(mapper.readValue(relatedInstanceJsonOid, AnexoNeoOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(AnexoNeo.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildAnexoNeoRelatedInstance4Usuario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Usuario(mapper.readValue(relatedInstanceJsonOid, UsuarioOid.class)): Usuario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(AnexoNeo.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildAnexoNeoRelatedInstance4Periodicidad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Periodicidad(mapper.readValue(relatedInstanceJsonOid, PeriodicidadOid.class)): Periodicidad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(AnexoNeo.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildAnexoNeoRelatedInstance4InstitucionMatNeo(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new InstitucionMatNeo(mapper.readValue(relatedInstanceJsonOid, InstitucionMatNeoOid.class)): InstitucionMatNeo.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(AnexoNeo.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
