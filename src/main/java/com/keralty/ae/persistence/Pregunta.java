package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.PreguntaConstants;
import com.keralty.ae.persistence.oid.PreguntaOid;
import com.keralty.ae.persistence.oid.PreguntaPOid;
import com.keralty.ae.persistence.oid.SeccionOid;
import com.keralty.ae.persistence.oid.ValorOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>Pregunta</code> external model class.
 * <p>
 * External Model Class: <code>Pregunta</code><br>
 */
public class Pregunta extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="numero")
    private Long preguntaNumero;

    @JsonProperty(value="numorden")
    private Long preguntaNumOrden;

    @JsonProperty(value="descripcion")
    private String preguntaDescripcion;

    @JsonProperty(value="valorsnobliga")
    private Boolean preguntaValorSNObliga;

    @JsonProperty(value="obsoblig")
    private Boolean preguntaObsOblig;

    @JsonProperty(value="esnumero")
    private Boolean preguntaEsNumero;

    @JsonProperty(value="valormax")
    private Double preguntaValorMax;

    @JsonProperty(value="valormin")
    private Double preguntaValorMin;

    @JsonProperty(value="solohombres")
    private Boolean preguntaSoloHombres;

    @JsonProperty(value="solomujeres")
    private Boolean preguntaSoloMujeres;

    @JsonProperty(value="respmultiple")
    private Boolean preguntaRespMultiple;

    @JsonProperty(value="drvvaloresposibles")
    private String preguntadrvValoresPosibles;

    @JsonProperty(value="seenviaalcore")
    private Boolean preguntaSeEnviaAlCORE;

    @JsonProperty(value="condicionedad")
    private Long preguntaCondicionEdad;

    @JsonProperty(value="condicionedadanyos")
    private Long preguntaCondicionEdadAnyos;

    private Collection <Valor> valores;

    private Collection <PreguntaP> preguntasPersona;

    private Seccion seccion;

    /**
     * Gets the value of attribute Numero
     */
    public Long getPreguntaNumero() {
        return preguntaNumero;
    }
    
    /**
     * Sets the value of attribute Numero
     */
    public void setPreguntaNumero(Long preguntaNumero) {
        this.preguntaNumero = preguntaNumero;
    }

    /**
     * Gets the value of attribute NumOrden
     */
    public Long getPreguntaNumOrden() {
        return preguntaNumOrden;
    }
    
    /**
     * Sets the value of attribute NumOrden
     */
    public void setPreguntaNumOrden(Long preguntaNumOrden) {
        this.preguntaNumOrden = preguntaNumOrden;
    }

    /**
     * Gets the value of attribute Descripcion
     */
    public String getPreguntaDescripcion() {
        return preguntaDescripcion;
    }
    
    /**
     * Sets the value of attribute Descripcion
     */
    public void setPreguntaDescripcion(String preguntaDescripcion) {
        this.preguntaDescripcion = preguntaDescripcion;
    }

    /**
     * Gets the value of attribute ValorSNObliga
     */
    public Boolean getPreguntaValorSNObliga() {
        return preguntaValorSNObliga;
    }
    
    /**
     * Sets the value of attribute ValorSNObliga
     */
    public void setPreguntaValorSNObliga(Boolean preguntaValorSNObliga) {
        this.preguntaValorSNObliga = preguntaValorSNObliga;
    }

    /**
     * Gets the value of attribute ObsOblig
     */
    public Boolean getPreguntaObsOblig() {
        return preguntaObsOblig;
    }
    
    /**
     * Sets the value of attribute ObsOblig
     */
    public void setPreguntaObsOblig(Boolean preguntaObsOblig) {
        this.preguntaObsOblig = preguntaObsOblig;
    }

    /**
     * Gets the value of attribute EsNumero
     */
    public Boolean getPreguntaEsNumero() {
        return preguntaEsNumero;
    }
    
    /**
     * Sets the value of attribute EsNumero
     */
    public void setPreguntaEsNumero(Boolean preguntaEsNumero) {
        this.preguntaEsNumero = preguntaEsNumero;
    }

    /**
     * Gets the value of attribute ValorMax
     */
    public Double getPreguntaValorMax() {
        return preguntaValorMax;
    }
    
    /**
     * Sets the value of attribute ValorMax
     */
    public void setPreguntaValorMax(Double preguntaValorMax) {
        this.preguntaValorMax = preguntaValorMax;
    }

    /**
     * Gets the value of attribute ValorMin
     */
    public Double getPreguntaValorMin() {
        return preguntaValorMin;
    }
    
    /**
     * Sets the value of attribute ValorMin
     */
    public void setPreguntaValorMin(Double preguntaValorMin) {
        this.preguntaValorMin = preguntaValorMin;
    }

    /**
     * Gets the value of attribute SoloHombres
     */
    public Boolean getPreguntaSoloHombres() {
        return preguntaSoloHombres;
    }
    
    /**
     * Sets the value of attribute SoloHombres
     */
    public void setPreguntaSoloHombres(Boolean preguntaSoloHombres) {
        this.preguntaSoloHombres = preguntaSoloHombres;
    }

    /**
     * Gets the value of attribute SoloMujeres
     */
    public Boolean getPreguntaSoloMujeres() {
        return preguntaSoloMujeres;
    }
    
    /**
     * Sets the value of attribute SoloMujeres
     */
    public void setPreguntaSoloMujeres(Boolean preguntaSoloMujeres) {
        this.preguntaSoloMujeres = preguntaSoloMujeres;
    }

    /**
     * Gets the value of attribute RespMultiple
     */
    public Boolean getPreguntaRespMultiple() {
        return preguntaRespMultiple;
    }
    
    /**
     * Sets the value of attribute RespMultiple
     */
    public void setPreguntaRespMultiple(Boolean preguntaRespMultiple) {
        this.preguntaRespMultiple = preguntaRespMultiple;
    }

    /**
     * Gets the value of attribute drvValoresPosibles
     */
    public String getPreguntadrvValoresPosibles() {
        return preguntadrvValoresPosibles;
    }
    
    /**
     * Sets the value of attribute drvValoresPosibles
     */
    public void setPreguntadrvValoresPosibles(String preguntadrvValoresPosibles) {
        this.preguntadrvValoresPosibles = preguntadrvValoresPosibles;
    }

    /**
     * Gets the value of attribute SeEnviaAlCORE
     */
    public Boolean getPreguntaSeEnviaAlCORE() {
        return preguntaSeEnviaAlCORE;
    }
    
    /**
     * Sets the value of attribute SeEnviaAlCORE
     */
    public void setPreguntaSeEnviaAlCORE(Boolean preguntaSeEnviaAlCORE) {
        this.preguntaSeEnviaAlCORE = preguntaSeEnviaAlCORE;
    }

    /**
     * Gets the value of attribute CondicionEdad
     */
    public Long getPreguntaCondicionEdad() {
        return preguntaCondicionEdad;
    }
    
    /**
     * Sets the value of attribute CondicionEdad
     */
    public void setPreguntaCondicionEdad(Long preguntaCondicionEdad) {
        this.preguntaCondicionEdad = preguntaCondicionEdad;
    }

    /**
     * Gets the value of attribute CondicionEdadAnyos
     */
    public Long getPreguntaCondicionEdadAnyos() {
        return preguntaCondicionEdadAnyos;
    }
    
    /**
     * Sets the value of attribute CondicionEdadAnyos
     */
    public void setPreguntaCondicionEdadAnyos(Long preguntaCondicionEdadAnyos) {
        this.preguntaCondicionEdadAnyos = preguntaCondicionEdadAnyos;
    }

    /**
     * Gets the value of relation through role Valores
     */
    @JsonIgnore
    public Collection <Valor> getValores() {
        return valores;
    }

    /**
     * Gets the value of relation through role PreguntasPersona
     */
    @JsonIgnore
    public Collection <PreguntaP> getPreguntasPersona() {
        return preguntasPersona;
    }

    /**
     * Gets the value of relation through role Seccion
     */
    @JsonIgnore
    public Seccion getSeccion() {
        return seccion;
    }

    /**
     * Default constructor
     */
    public Pregunta() {
        preguntaNumero = null;
    }

    /**
     * Constructor used to create instances of <code>Pregunta</code>.
     * @param oid Object Identifier of the instance of <code>Pregunta</code> to be created.
     * @throws SystemException
     */
    public Pregunta(PreguntaOid oid) {
        if (oid != null && !oid.isNull()) {
            preguntaNumero = oid.getPreguntaNumero();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return Pregunta.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Pregunta other = (Pregunta)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getPreguntaNumero(), other.getPreguntaNumero());
        result &= Utilities.isEqual(this.getPreguntaNumOrden(), other.getPreguntaNumOrden());
        result &= Utilities.isEqual(this.getPreguntaDescripcion(), other.getPreguntaDescripcion());
        result &= Utilities.isEqual(this.getPreguntaValorSNObliga(), other.getPreguntaValorSNObliga());
        result &= Utilities.isEqual(this.getPreguntaObsOblig(), other.getPreguntaObsOblig());
        result &= Utilities.isEqual(this.getPreguntaEsNumero(), other.getPreguntaEsNumero());
        result &= Utilities.isEqual(this.getPreguntaValorMax(), other.getPreguntaValorMax());
        result &= Utilities.isEqual(this.getPreguntaValorMin(), other.getPreguntaValorMin());
        result &= Utilities.isEqual(this.getPreguntaSoloHombres(), other.getPreguntaSoloHombres());
        result &= Utilities.isEqual(this.getPreguntaSoloMujeres(), other.getPreguntaSoloMujeres());
        result &= Utilities.isEqual(this.getPreguntaRespMultiple(), other.getPreguntaRespMultiple());
        result &= Utilities.isEqual(this.getPreguntadrvValoresPosibles(), other.getPreguntadrvValoresPosibles());
        result &= Utilities.isEqual(this.getPreguntaSeEnviaAlCORE(), other.getPreguntaSeEnviaAlCORE());
        result &= Utilities.isEqual(this.getPreguntaCondicionEdad(), other.getPreguntaCondicionEdad());
        result &= Utilities.isEqual(this.getPreguntaCondicionEdadAnyos(), other.getPreguntaCondicionEdadAnyos());
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
     * Returns the <code>PreguntaOid</code> object that identifies this instance of <code>Pregunta</code>.
     * @return <code>PreguntaOid</code> object that identifies this instance of <code>Pregunta</code>
     */
	@Override
    public PreguntaOid getOid() {
        return new PreguntaOid(getPreguntaNumero());
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
        if (!activeFacets.contains(Constants.PREGUNTA)) {
            activeFacets.add(Constants.PREGUNTA);
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
            relatedInstance = buildPreguntaRelatedInstance(relatedInstanceJsonOid);
        }
        if (PreguntaConstants.ROLE_NAME_VALORES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPreguntaRelatedInstance4Valor(relatedInstanceJsonOid, remainingPath);
        }
        if (PreguntaConstants.ROLE_NAME_PREGUNTASPERSONA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPreguntaRelatedInstance4PreguntaP(relatedInstanceJsonOid, remainingPath);
        }
        if (PreguntaConstants.ROLE_NAME_SECCION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPreguntaRelatedInstance4Seccion(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildPreguntaRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Pregunta(mapper.readValue(relatedInstanceJsonOid, PreguntaOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Pregunta.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPreguntaRelatedInstance4Valor(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Valor(mapper.readValue(relatedInstanceJsonOid, ValorOid.class)): Valor.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Pregunta.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPreguntaRelatedInstance4PreguntaP(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PreguntaP(mapper.readValue(relatedInstanceJsonOid, PreguntaPOid.class)): PreguntaP.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Pregunta.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildPreguntaRelatedInstance4Seccion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Seccion(mapper.readValue(relatedInstanceJsonOid, SeccionOid.class)): Seccion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Pregunta.class).error(e.getMessage());
            return null;
        }
    }
}
