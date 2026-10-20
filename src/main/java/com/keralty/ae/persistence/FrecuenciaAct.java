package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.persistence.oid.FrecuenciaActOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>FrecuenciaAct</code> external model class.
 * <p>
 * External Model Class: <code>FrecuenciaAct</code><br>
 */
public class FrecuenciaAct extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="codigo")
    private Long frecuenciaActCodigo;

    @JsonProperty(value="parametrica")
    private Long frecuenciaActParametrica;

    @JsonProperty(value="frecuencia")
    private Long frecuenciaActFrecuencia;

    @JsonProperty(value="fechaultimasinc")
    private Date frecuenciaActFechaUltimaSinc;

    @JsonProperty(value="resultadosinc")
    private String frecuenciaActResultadoSinc;

    @JsonProperty(value="usuario")
    private String frecuenciaActUsuario;

    @JsonProperty(value="nombreusuario")
    private String frecuenciaActNombreUsuario;

    @JsonProperty(value="drvnombreparametrica")
    private String frecuenciaActdrvNombreParametrica;

    /**
     * Gets the value of attribute Codigo
     */
    public Long getFrecuenciaActCodigo() {
        return frecuenciaActCodigo;
    }
    
    /**
     * Sets the value of attribute Codigo
     */
    public void setFrecuenciaActCodigo(Long frecuenciaActCodigo) {
        this.frecuenciaActCodigo = frecuenciaActCodigo;
    }

    /**
     * Gets the value of attribute Parametrica
     */
    public Long getFrecuenciaActParametrica() {
        return frecuenciaActParametrica;
    }
    
    /**
     * Sets the value of attribute Parametrica
     */
    public void setFrecuenciaActParametrica(Long frecuenciaActParametrica) {
        this.frecuenciaActParametrica = frecuenciaActParametrica;
    }

    /**
     * Gets the value of attribute Frecuencia
     */
    public Long getFrecuenciaActFrecuencia() {
        return frecuenciaActFrecuencia;
    }
    
    /**
     * Sets the value of attribute Frecuencia
     */
    public void setFrecuenciaActFrecuencia(Long frecuenciaActFrecuencia) {
        this.frecuenciaActFrecuencia = frecuenciaActFrecuencia;
    }

    /**
     * Gets the value of attribute FechaUltimaSinc
     */
    public Date getFrecuenciaActFechaUltimaSinc() {
        return frecuenciaActFechaUltimaSinc;
    }
    
    /**
     * Sets the value of attribute FechaUltimaSinc
     */
    public void setFrecuenciaActFechaUltimaSinc(Date frecuenciaActFechaUltimaSinc) {
        this.frecuenciaActFechaUltimaSinc = frecuenciaActFechaUltimaSinc;
    }

    /**
     * Gets the value of attribute ResultadoSinc
     */
    public String getFrecuenciaActResultadoSinc() {
        return frecuenciaActResultadoSinc;
    }
    
    /**
     * Sets the value of attribute ResultadoSinc
     */
    public void setFrecuenciaActResultadoSinc(String frecuenciaActResultadoSinc) {
        this.frecuenciaActResultadoSinc = frecuenciaActResultadoSinc;
    }

    /**
     * Gets the value of attribute Usuario
     */
    public String getFrecuenciaActUsuario() {
        return frecuenciaActUsuario;
    }
    
    /**
     * Sets the value of attribute Usuario
     */
    public void setFrecuenciaActUsuario(String frecuenciaActUsuario) {
        this.frecuenciaActUsuario = frecuenciaActUsuario;
    }

    /**
     * Gets the value of attribute NombreUsuario
     */
    public String getFrecuenciaActNombreUsuario() {
        return frecuenciaActNombreUsuario;
    }
    
    /**
     * Sets the value of attribute NombreUsuario
     */
    public void setFrecuenciaActNombreUsuario(String frecuenciaActNombreUsuario) {
        this.frecuenciaActNombreUsuario = frecuenciaActNombreUsuario;
    }

    /**
     * Gets the value of attribute drvNombreParametrica
     */
    public String getFrecuenciaActdrvNombreParametrica() {
        return frecuenciaActdrvNombreParametrica;
    }
    
    /**
     * Sets the value of attribute drvNombreParametrica
     */
    public void setFrecuenciaActdrvNombreParametrica(String frecuenciaActdrvNombreParametrica) {
        this.frecuenciaActdrvNombreParametrica = frecuenciaActdrvNombreParametrica;
    }

    /**
     * Default constructor
     */
    public FrecuenciaAct() {
        frecuenciaActCodigo = null;
    }

    /**
     * Constructor used to create instances of <code>FrecuenciaAct</code>.
     * @param oid Object Identifier of the instance of <code>FrecuenciaAct</code> to be created.
     * @throws SystemException
     */
    public FrecuenciaAct(FrecuenciaActOid oid) {
        if (oid != null && !oid.isNull()) {
            frecuenciaActCodigo = oid.getFrecuenciaActCodigo();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return FrecuenciaAct.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        FrecuenciaAct other = (FrecuenciaAct)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getFrecuenciaActCodigo(), other.getFrecuenciaActCodigo());
        result &= Utilities.isEqual(this.getFrecuenciaActParametrica(), other.getFrecuenciaActParametrica());
        result &= Utilities.isEqual(this.getFrecuenciaActFrecuencia(), other.getFrecuenciaActFrecuencia());
        result &= Utilities.isEqual(this.getFrecuenciaActFechaUltimaSinc(), other.getFrecuenciaActFechaUltimaSinc());
        result &= Utilities.isEqual(this.getFrecuenciaActResultadoSinc(), other.getFrecuenciaActResultadoSinc());
        result &= Utilities.isEqual(this.getFrecuenciaActUsuario(), other.getFrecuenciaActUsuario());
        result &= Utilities.isEqual(this.getFrecuenciaActNombreUsuario(), other.getFrecuenciaActNombreUsuario());
        result &= Utilities.isEqual(this.getFrecuenciaActdrvNombreParametrica(), other.getFrecuenciaActdrvNombreParametrica());
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
     * Returns the <code>FrecuenciaActOid</code> object that identifies this instance of <code>FrecuenciaAct</code>.
     * @return <code>FrecuenciaActOid</code> object that identifies this instance of <code>FrecuenciaAct</code>
     */
	@Override
    public FrecuenciaActOid getOid() {
        return new FrecuenciaActOid(getFrecuenciaActCodigo());
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
        if (!activeFacets.contains(Constants.FRECUENCIAACT)) {
            activeFacets.add(Constants.FRECUENCIAACT);
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
            relatedInstance = buildFrecuenciaActRelatedInstance(relatedInstanceJsonOid);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildFrecuenciaActRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new FrecuenciaAct(mapper.readValue(relatedInstanceJsonOid, FrecuenciaActOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(FrecuenciaAct.class).error(e.getMessage());
            return null;
        }
    }
}
