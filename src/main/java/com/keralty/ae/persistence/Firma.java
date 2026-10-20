package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.FirmaConstants;
import com.keralty.ae.persistence.oid.FamiliaNovedadOid;
import com.keralty.ae.persistence.oid.FirmaOid;
import com.keralty.ae.persistence.oid.NovedadCTOid;
import com.keralty.ae.persistence.oid.RespRegionalOid;
import com.keralty.ae.persistence.oid.SolicitudNovedadOid;
import com.keralty.ae.persistence.oid.SolicitudOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>Firma</code> external model class.
 * <p>
 * External Model Class: <code>Firma</code><br>
 */
public class Firma extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="identificador")
    private Long firmaIdentificador;

    @JsonProperty(value="imagenfirma")
    private byte[] firmaImagenFirma;

    @JsonProperty(value="latitud")
    private String firmaLatitud;

    @JsonProperty(value="longitud")
    private String firmaLongitud;

    private SolicitudNovedad solicitudNovedad;

    private FamiliaNovedad familiaNovedad;

    private NovedadCT novedadesCT;

    private Solicitud solicitud;

    private Solicitud solicitudSegunda;

    private RespRegional respRegional;

    private Solicitud solicitudContratante;

    /**
     * Gets the value of attribute Identificador
     */
    public Long getFirmaIdentificador() {
        return firmaIdentificador;
    }
    
    /**
     * Sets the value of attribute Identificador
     */
    public void setFirmaIdentificador(Long firmaIdentificador) {
        this.firmaIdentificador = firmaIdentificador;
    }

    /**
     * Gets the value of attribute ImagenFirma
     */
    public byte[] getFirmaImagenFirma() {
        return firmaImagenFirma;
    }
    
    /**
     * Sets the value of attribute ImagenFirma
     */
    public void setFirmaImagenFirma(byte[] firmaImagenFirma) {
        this.firmaImagenFirma = firmaImagenFirma;
    }

    /**
     * Gets the value of attribute Latitud
     */
    public String getFirmaLatitud() {
        return firmaLatitud;
    }
    
    /**
     * Sets the value of attribute Latitud
     */
    public void setFirmaLatitud(String firmaLatitud) {
        this.firmaLatitud = firmaLatitud;
    }

    /**
     * Gets the value of attribute Longitud
     */
    public String getFirmaLongitud() {
        return firmaLongitud;
    }
    
    /**
     * Sets the value of attribute Longitud
     */
    public void setFirmaLongitud(String firmaLongitud) {
        this.firmaLongitud = firmaLongitud;
    }

    /**
     * Gets the value of relation through role SolicitudNovedad
     */
    @JsonIgnore
    public SolicitudNovedad getSolicitudNovedad() {
        return solicitudNovedad;
    }

    /**
     * Gets the value of relation through role FamiliaNovedad
     */
    @JsonIgnore
    public FamiliaNovedad getFamiliaNovedad() {
        return familiaNovedad;
    }

    /**
     * Gets the value of relation through role NovedadesCT
     */
    @JsonIgnore
    public NovedadCT getNovedadesCT() {
        return novedadesCT;
    }

    /**
     * Gets the value of relation through role Solicitud
     */
    @JsonIgnore
    public Solicitud getSolicitud() {
        return solicitud;
    }

    /**
     * Gets the value of relation through role SolicitudSegunda
     */
    @JsonIgnore
    public Solicitud getSolicitudSegunda() {
        return solicitudSegunda;
    }

    /**
     * Gets the value of relation through role RespRegional
     */
    @JsonIgnore
    public RespRegional getRespRegional() {
        return respRegional;
    }

    /**
     * Gets the value of relation through role SolicitudContratante
     */
    @JsonIgnore
    public Solicitud getSolicitudContratante() {
        return solicitudContratante;
    }

    /**
     * Default constructor
     */
    public Firma() {
        firmaIdentificador = null;
    }

    /**
     * Constructor used to create instances of <code>Firma</code>.
     * @param oid Object Identifier of the instance of <code>Firma</code> to be created.
     * @throws SystemException
     */
    public Firma(FirmaOid oid) {
        if (oid != null && !oid.isNull()) {
            firmaIdentificador = oid.getFirmaIdentificador();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return Firma.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Firma other = (Firma)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getFirmaIdentificador(), other.getFirmaIdentificador());
        result &= Utilities.isEqual(this.getFirmaImagenFirma(), other.getFirmaImagenFirma());
        result &= Utilities.isEqual(this.getFirmaLatitud(), other.getFirmaLatitud());
        result &= Utilities.isEqual(this.getFirmaLongitud(), other.getFirmaLongitud());
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
     * Returns the <code>FirmaOid</code> object that identifies this instance of <code>Firma</code>.
     * @return <code>FirmaOid</code> object that identifies this instance of <code>Firma</code>
     */
	@Override
    public FirmaOid getOid() {
        return new FirmaOid(getFirmaIdentificador());
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
        if (!activeFacets.contains(Constants.FIRMA)) {
            activeFacets.add(Constants.FIRMA);
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
            relatedInstance = buildFirmaRelatedInstance(relatedInstanceJsonOid);
        }
        if (FirmaConstants.ROLE_NAME_SOLICITUDNOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFirmaRelatedInstance4SolicitudNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (FirmaConstants.ROLE_NAME_FAMILIANOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFirmaRelatedInstance4FamiliaNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (FirmaConstants.ROLE_NAME_NOVEDADESCT.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFirmaRelatedInstance4NovedadCT(relatedInstanceJsonOid, remainingPath);
        }
        if (FirmaConstants.ROLE_NAME_SOLICITUD.equalsIgnoreCase(relatedInstancePathFirstItem) || FirmaConstants.ROLE_NAME_SOLICITUDSEGUNDA.equalsIgnoreCase(relatedInstancePathFirstItem) || FirmaConstants.ROLE_NAME_SOLICITUDCONTRATANTE.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFirmaRelatedInstance4Solicitud(relatedInstanceJsonOid, remainingPath);
        }
        if (FirmaConstants.ROLE_NAME_RESPREGIONAL.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFirmaRelatedInstance4RespRegional(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildFirmaRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Firma(mapper.readValue(relatedInstanceJsonOid, FirmaOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Firma.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildFirmaRelatedInstance4SolicitudNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new SolicitudNovedad(mapper.readValue(relatedInstanceJsonOid, SolicitudNovedadOid.class)): SolicitudNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Firma.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildFirmaRelatedInstance4FamiliaNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new FamiliaNovedad(mapper.readValue(relatedInstanceJsonOid, FamiliaNovedadOid.class)): FamiliaNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Firma.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildFirmaRelatedInstance4NovedadCT(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new NovedadCT(mapper.readValue(relatedInstanceJsonOid, NovedadCTOid.class)): NovedadCT.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Firma.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildFirmaRelatedInstance4Solicitud(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Solicitud(mapper.readValue(relatedInstanceJsonOid, SolicitudOid.class)): Solicitud.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Firma.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildFirmaRelatedInstance4RespRegional(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new RespRegional(mapper.readValue(relatedInstanceJsonOid, RespRegionalOid.class)): RespRegional.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Firma.class).error(e.getMessage());
            return null;
        }
    }
}
