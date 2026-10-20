package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.AnexoMatConstants;
import com.keralty.ae.global.Constants;
import com.keralty.ae.persistence.oid.AnexoMatOid;
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
 * Representation of the <code>AnexoMat</code> external model class.
 * <p>
 * External Model Class: <code>AnexoMat</code><br>
 */
public class AnexoMat extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="identificador")
    private Long anexoMatIdentificador;

    @JsonProperty(value="fechaultregla")
    private Date anexoMatFechaUltRegla;

    @JsonProperty(value="numcuotas")
    private Long anexoMatNumCuotas;

    @JsonProperty(value="drvvalor")
    private Double anexoMatdrvValor;

    private Usuario usuario;

    private Periodicidad periodicidad;

    private InstitucionMatNeo institucionMaternal;

    /**
     * Gets the value of attribute Identificador
     */
    public Long getAnexoMatIdentificador() {
        return anexoMatIdentificador;
    }
    
    /**
     * Sets the value of attribute Identificador
     */
    public void setAnexoMatIdentificador(Long anexoMatIdentificador) {
        this.anexoMatIdentificador = anexoMatIdentificador;
    }

    /**
     * Gets the value of attribute FechaUltRegla
     */
    public Date getAnexoMatFechaUltRegla() {
        return anexoMatFechaUltRegla;
    }
    
    /**
     * Sets the value of attribute FechaUltRegla
     */
    public void setAnexoMatFechaUltRegla(Date anexoMatFechaUltRegla) {
        this.anexoMatFechaUltRegla = anexoMatFechaUltRegla;
    }

    /**
     * Gets the value of attribute NumCuotas
     */
    public Long getAnexoMatNumCuotas() {
        return anexoMatNumCuotas;
    }
    
    /**
     * Sets the value of attribute NumCuotas
     */
    public void setAnexoMatNumCuotas(Long anexoMatNumCuotas) {
        this.anexoMatNumCuotas = anexoMatNumCuotas;
    }

    /**
     * Gets the value of attribute drvValor
     */
    public Double getAnexoMatdrvValor() {
        return anexoMatdrvValor;
    }
    
    /**
     * Sets the value of attribute drvValor
     */
    public void setAnexoMatdrvValor(Double anexoMatdrvValor) {
        this.anexoMatdrvValor = anexoMatdrvValor;
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
     * Gets the value of relation through role InstitucionMaternal
     */
    @JsonIgnore
    public InstitucionMatNeo getInstitucionMaternal() {
        return institucionMaternal;
    }

    /**
     * Default constructor
     */
    public AnexoMat() {
        anexoMatIdentificador = null;
    }

    /**
     * Constructor used to create instances of <code>AnexoMat</code>.
     * @param oid Object Identifier of the instance of <code>AnexoMat</code> to be created.
     * @throws SystemException
     */
    public AnexoMat(AnexoMatOid oid) {
        if (oid != null && !oid.isNull()) {
            anexoMatIdentificador = oid.getAnexoMatIdentificador();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return AnexoMat.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        AnexoMat other = (AnexoMat)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getAnexoMatIdentificador(), other.getAnexoMatIdentificador());
        result &= Utilities.isEqual(this.getAnexoMatFechaUltRegla(), other.getAnexoMatFechaUltRegla());
        result &= Utilities.isEqual(this.getAnexoMatNumCuotas(), other.getAnexoMatNumCuotas());
        result &= Utilities.isEqual(this.getAnexoMatdrvValor(), other.getAnexoMatdrvValor());
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
     * Returns the <code>AnexoMatOid</code> object that identifies this instance of <code>AnexoMat</code>.
     * @return <code>AnexoMatOid</code> object that identifies this instance of <code>AnexoMat</code>
     */
	@Override
    public AnexoMatOid getOid() {
        return new AnexoMatOid(getAnexoMatIdentificador());
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
        if (!activeFacets.contains(Constants.ANEXOMAT)) {
            activeFacets.add(Constants.ANEXOMAT);
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
            relatedInstance = buildAnexoMatRelatedInstance(relatedInstanceJsonOid);
        }
        if (AnexoMatConstants.ROLE_NAME_USUARIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAnexoMatRelatedInstance4Usuario(relatedInstanceJsonOid, remainingPath);
        }
        if (AnexoMatConstants.ROLE_NAME_PERIODICIDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAnexoMatRelatedInstance4Periodicidad(relatedInstanceJsonOid, remainingPath);
        }
        if (AnexoMatConstants.ROLE_NAME_INSTITUCIONMATERNAL.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildAnexoMatRelatedInstance4InstitucionMatNeo(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildAnexoMatRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new AnexoMat(mapper.readValue(relatedInstanceJsonOid, AnexoMatOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(AnexoMat.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildAnexoMatRelatedInstance4Usuario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Usuario(mapper.readValue(relatedInstanceJsonOid, UsuarioOid.class)): Usuario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(AnexoMat.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildAnexoMatRelatedInstance4Periodicidad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Periodicidad(mapper.readValue(relatedInstanceJsonOid, PeriodicidadOid.class)): Periodicidad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(AnexoMat.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildAnexoMatRelatedInstance4InstitucionMatNeo(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new InstitucionMatNeo(mapper.readValue(relatedInstanceJsonOid, InstitucionMatNeoOid.class)): InstitucionMatNeo.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(AnexoMat.class).error(e.getMessage());
            return null;
        }
    }
}
