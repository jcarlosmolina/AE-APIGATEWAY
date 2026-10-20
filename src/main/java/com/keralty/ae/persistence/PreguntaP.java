package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.PreguntaPConstants;
import com.keralty.ae.persistence.oid.PreguntaOid;
import com.keralty.ae.persistence.oid.PreguntaPOid;
import com.keralty.ae.persistence.oid.SeccionPOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>PreguntaP</code> external model class.
 * <p>
 * External Model Class: <code>PreguntaP</code><br>
 */
public class PreguntaP extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="identificador")
    private Long preguntaPIdentificador;

    @JsonProperty(value="numero")
    private Long preguntaPNumero;

    @JsonProperty(value="numorden")
    private Long preguntaPNumOrden;

    @JsonProperty(value="descripcion")
    private String preguntaPDescripcion;

    @JsonProperty(value="seenviaacore")
    private Boolean preguntaPSeEnviaACORE;

    @JsonProperty(value="respuestasino")
    private Boolean preguntaPRespuestaSiNo;

    @JsonProperty(value="respuestaobs")
    private String preguntaPRespuestaObs;

    @JsonProperty(value="vienedecore")
    private Boolean preguntaPVieneDeCORE;

    @JsonProperty(value="drvrespuesta")
    private String preguntaPdrvRespuesta;

    @JsonProperty(value="valoresrespuestas")
    private String preguntaPValoresRespuestas;

    @JsonProperty(value="drvrespuestasino")
    private Boolean preguntaPdrvRespuestaSiNo;

    private SeccionP seccion;

    private Pregunta pregunta;

    /**
     * Gets the value of attribute Identificador
     */
    public Long getPreguntaPIdentificador() {
        return preguntaPIdentificador;
    }
    
    /**
     * Sets the value of attribute Identificador
     */
    public void setPreguntaPIdentificador(Long preguntaPIdentificador) {
        this.preguntaPIdentificador = preguntaPIdentificador;
    }

    /**
     * Gets the value of attribute Numero
     */
    public Long getPreguntaPNumero() {
        return preguntaPNumero;
    }
    
    /**
     * Sets the value of attribute Numero
     */
    public void setPreguntaPNumero(Long preguntaPNumero) {
        this.preguntaPNumero = preguntaPNumero;
    }

    /**
     * Gets the value of attribute NumOrden
     */
    public Long getPreguntaPNumOrden() {
        return preguntaPNumOrden;
    }
    
    /**
     * Sets the value of attribute NumOrden
     */
    public void setPreguntaPNumOrden(Long preguntaPNumOrden) {
        this.preguntaPNumOrden = preguntaPNumOrden;
    }

    /**
     * Gets the value of attribute Descripcion
     */
    public String getPreguntaPDescripcion() {
        return preguntaPDescripcion;
    }
    
    /**
     * Sets the value of attribute Descripcion
     */
    public void setPreguntaPDescripcion(String preguntaPDescripcion) {
        this.preguntaPDescripcion = preguntaPDescripcion;
    }

    /**
     * Gets the value of attribute SeEnviaACORE
     */
    public Boolean getPreguntaPSeEnviaACORE() {
        return preguntaPSeEnviaACORE;
    }
    
    /**
     * Sets the value of attribute SeEnviaACORE
     */
    public void setPreguntaPSeEnviaACORE(Boolean preguntaPSeEnviaACORE) {
        this.preguntaPSeEnviaACORE = preguntaPSeEnviaACORE;
    }

    /**
     * Gets the value of attribute RespuestaSiNo
     */
    public Boolean getPreguntaPRespuestaSiNo() {
        return preguntaPRespuestaSiNo;
    }
    
    /**
     * Sets the value of attribute RespuestaSiNo
     */
    public void setPreguntaPRespuestaSiNo(Boolean preguntaPRespuestaSiNo) {
        this.preguntaPRespuestaSiNo = preguntaPRespuestaSiNo;
    }

    /**
     * Gets the value of attribute RespuestaObs
     */
    public String getPreguntaPRespuestaObs() {
        return preguntaPRespuestaObs;
    }
    
    /**
     * Sets the value of attribute RespuestaObs
     */
    public void setPreguntaPRespuestaObs(String preguntaPRespuestaObs) {
        this.preguntaPRespuestaObs = preguntaPRespuestaObs;
    }

    /**
     * Gets the value of attribute VieneDeCORE
     */
    public Boolean getPreguntaPVieneDeCORE() {
        return preguntaPVieneDeCORE;
    }
    
    /**
     * Sets the value of attribute VieneDeCORE
     */
    public void setPreguntaPVieneDeCORE(Boolean preguntaPVieneDeCORE) {
        this.preguntaPVieneDeCORE = preguntaPVieneDeCORE;
    }

    /**
     * Gets the value of attribute drvRespuesta
     */
    public String getPreguntaPdrvRespuesta() {
        return preguntaPdrvRespuesta;
    }
    
    /**
     * Sets the value of attribute drvRespuesta
     */
    public void setPreguntaPdrvRespuesta(String preguntaPdrvRespuesta) {
        this.preguntaPdrvRespuesta = preguntaPdrvRespuesta;
    }

    /**
     * Gets the value of attribute ValoresRespuestas
     */
    public String getPreguntaPValoresRespuestas() {
        return preguntaPValoresRespuestas;
    }
    
    /**
     * Sets the value of attribute ValoresRespuestas
     */
    public void setPreguntaPValoresRespuestas(String preguntaPValoresRespuestas) {
        this.preguntaPValoresRespuestas = preguntaPValoresRespuestas;
    }

    /**
     * Gets the value of attribute drvRespuestaSiNo
     */
    public Boolean getPreguntaPdrvRespuestaSiNo() {
        return preguntaPdrvRespuestaSiNo;
    }
    
    /**
     * Sets the value of attribute drvRespuestaSiNo
     */
    public void setPreguntaPdrvRespuestaSiNo(Boolean preguntaPdrvRespuestaSiNo) {
        this.preguntaPdrvRespuestaSiNo = preguntaPdrvRespuestaSiNo;
    }

    /**
     * Gets the value of relation through role Seccion
     */
    @JsonIgnore
    public SeccionP getSeccion() {
        return seccion;
    }

    /**
     * Gets the value of relation through role Pregunta
     */
    @JsonIgnore
    public Pregunta getPregunta() {
        return pregunta;
    }

    /**
     * Default constructor
     */
    public PreguntaP() {
        preguntaPIdentificador = null;
    }

    /**
     * Constructor used to create instances of <code>PreguntaP</code>.
     * @param oid Object Identifier of the instance of <code>PreguntaP</code> to be created.
     * @throws SystemException
     */
    public PreguntaP(PreguntaPOid oid) {
        if (oid != null && !oid.isNull()) {
            preguntaPIdentificador = oid.getPreguntaPIdentificador();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return PreguntaP.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        PreguntaP other = (PreguntaP)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getPreguntaPIdentificador(), other.getPreguntaPIdentificador());
        result &= Utilities.isEqual(this.getPreguntaPNumero(), other.getPreguntaPNumero());
        result &= Utilities.isEqual(this.getPreguntaPNumOrden(), other.getPreguntaPNumOrden());
        result &= Utilities.isEqual(this.getPreguntaPDescripcion(), other.getPreguntaPDescripcion());
        result &= Utilities.isEqual(this.getPreguntaPSeEnviaACORE(), other.getPreguntaPSeEnviaACORE());
        result &= Utilities.isEqual(this.getPreguntaPRespuestaSiNo(), other.getPreguntaPRespuestaSiNo());
        result &= Utilities.isEqual(this.getPreguntaPRespuestaObs(), other.getPreguntaPRespuestaObs());
        result &= Utilities.isEqual(this.getPreguntaPVieneDeCORE(), other.getPreguntaPVieneDeCORE());
        result &= Utilities.isEqual(this.getPreguntaPdrvRespuesta(), other.getPreguntaPdrvRespuesta());
        result &= Utilities.isEqual(this.getPreguntaPValoresRespuestas(), other.getPreguntaPValoresRespuestas());
        result &= Utilities.isEqual(this.getPreguntaPdrvRespuestaSiNo(), other.getPreguntaPdrvRespuestaSiNo());
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
     * Returns the <code>PreguntaPOid</code> object that identifies this instance of <code>PreguntaP</code>.
     * @return <code>PreguntaPOid</code> object that identifies this instance of <code>PreguntaP</code>
     */
	@Override
    public PreguntaPOid getOid() {
        return new PreguntaPOid(getPreguntaPIdentificador());
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
        if (!activeFacets.contains(Constants.PREGUNTAP)) {
            activeFacets.add(Constants.PREGUNTAP);
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
            relatedInstance = buildPreguntaPRelatedInstance(relatedInstanceJsonOid);
        }
        if (PreguntaPConstants.ROLE_NAME_SECCION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPreguntaPRelatedInstance4SeccionP(relatedInstanceJsonOid, remainingPath);
        }
        if (PreguntaPConstants.ROLE_NAME_PREGUNTA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPreguntaPRelatedInstance4Pregunta(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildPreguntaPRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new PreguntaP(mapper.readValue(relatedInstanceJsonOid, PreguntaPOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PreguntaP.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPreguntaPRelatedInstance4SeccionP(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new SeccionP(mapper.readValue(relatedInstanceJsonOid, SeccionPOid.class)): SeccionP.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PreguntaP.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPreguntaPRelatedInstance4Pregunta(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Pregunta(mapper.readValue(relatedInstanceJsonOid, PreguntaOid.class)): Pregunta.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(PreguntaP.class).error(e.getMessage());
            return null;
        }
    }
}
