package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.persistence.oid.FechaIniEPSOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>FechaIniEPS</code> external model class.
 * <p>
 * External Model Class: <code>FechaIniEPS</code><br>
 */
public class FechaIniEPS extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id")
    private Long fechaIniEPSId;

    @JsonProperty(value="tramite")
    private Long fechaIniEPSTramite;

    @JsonProperty(value="tipocontrato")
    private Long fechaIniEPSTipoContrato;

    @JsonProperty(value="desde")
    private Date fechaIniEPSDesde;

    @JsonProperty(value="hasta")
    private Date fechaIniEPSHasta;

    @JsonProperty(value="fechainicioaplicar")
    private Date fechaIniEPSFechaInicioAplicar;

    /**
     * Gets the value of attribute Id
     */
    public Long getFechaIniEPSId() {
        return fechaIniEPSId;
    }
    
    /**
     * Sets the value of attribute Id
     */
    public void setFechaIniEPSId(Long fechaIniEPSId) {
        this.fechaIniEPSId = fechaIniEPSId;
    }

    /**
     * Gets the value of attribute Tramite
     */
    public Long getFechaIniEPSTramite() {
        return fechaIniEPSTramite;
    }
    
    /**
     * Sets the value of attribute Tramite
     */
    public void setFechaIniEPSTramite(Long fechaIniEPSTramite) {
        this.fechaIniEPSTramite = fechaIniEPSTramite;
    }

    /**
     * Gets the value of attribute TipoContrato
     */
    public Long getFechaIniEPSTipoContrato() {
        return fechaIniEPSTipoContrato;
    }
    
    /**
     * Sets the value of attribute TipoContrato
     */
    public void setFechaIniEPSTipoContrato(Long fechaIniEPSTipoContrato) {
        this.fechaIniEPSTipoContrato = fechaIniEPSTipoContrato;
    }

    /**
     * Gets the value of attribute Desde
     */
    public Date getFechaIniEPSDesde() {
        return fechaIniEPSDesde;
    }
    
    /**
     * Sets the value of attribute Desde
     */
    public void setFechaIniEPSDesde(Date fechaIniEPSDesde) {
        this.fechaIniEPSDesde = fechaIniEPSDesde;
    }

    /**
     * Gets the value of attribute Hasta
     */
    public Date getFechaIniEPSHasta() {
        return fechaIniEPSHasta;
    }
    
    /**
     * Sets the value of attribute Hasta
     */
    public void setFechaIniEPSHasta(Date fechaIniEPSHasta) {
        this.fechaIniEPSHasta = fechaIniEPSHasta;
    }

    /**
     * Gets the value of attribute FechaInicioAplicar
     */
    public Date getFechaIniEPSFechaInicioAplicar() {
        return fechaIniEPSFechaInicioAplicar;
    }
    
    /**
     * Sets the value of attribute FechaInicioAplicar
     */
    public void setFechaIniEPSFechaInicioAplicar(Date fechaIniEPSFechaInicioAplicar) {
        this.fechaIniEPSFechaInicioAplicar = fechaIniEPSFechaInicioAplicar;
    }

    /**
     * Default constructor
     */
    public FechaIniEPS() {
        fechaIniEPSId = null;
    }

    /**
     * Constructor used to create instances of <code>FechaIniEPS</code>.
     * @param oid Object Identifier of the instance of <code>FechaIniEPS</code> to be created.
     * @throws SystemException
     */
    public FechaIniEPS(FechaIniEPSOid oid) {
        if (oid != null && !oid.isNull()) {
            fechaIniEPSId = oid.getFechaIniEPSId();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return FechaIniEPS.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        FechaIniEPS other = (FechaIniEPS)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getFechaIniEPSId(), other.getFechaIniEPSId());
        result &= Utilities.isEqual(this.getFechaIniEPSTramite(), other.getFechaIniEPSTramite());
        result &= Utilities.isEqual(this.getFechaIniEPSTipoContrato(), other.getFechaIniEPSTipoContrato());
        result &= Utilities.isEqual(this.getFechaIniEPSDesde(), other.getFechaIniEPSDesde());
        result &= Utilities.isEqual(this.getFechaIniEPSHasta(), other.getFechaIniEPSHasta());
        result &= Utilities.isEqual(this.getFechaIniEPSFechaInicioAplicar(), other.getFechaIniEPSFechaInicioAplicar());
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
     * Returns the <code>FechaIniEPSOid</code> object that identifies this instance of <code>FechaIniEPS</code>.
     * @return <code>FechaIniEPSOid</code> object that identifies this instance of <code>FechaIniEPS</code>
     */
	@Override
    public FechaIniEPSOid getOid() {
        return new FechaIniEPSOid(getFechaIniEPSId());
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
        if (!activeFacets.contains(Constants.FECHAINIEPS)) {
            activeFacets.add(Constants.FECHAINIEPS);
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
            relatedInstance = buildFechaIniEPSRelatedInstance(relatedInstanceJsonOid);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildFechaIniEPSRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new FechaIniEPS(mapper.readValue(relatedInstanceJsonOid, FechaIniEPSOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(FechaIniEPS.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
