package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.FamiliaNovedadConstants;
import com.keralty.ae.persistence.oid.FamiliaNovedadOid;
import com.keralty.ae.persistence.oid.FirmaOid;
import com.keralty.ae.persistence.oid.NovedadCTOid;
import com.keralty.ae.persistence.oid.NovedadMDOid;
import com.keralty.ae.persistence.oid.SolicitudNovedadOid;
import com.keralty.ae.persistence.oid.TipoIdentificacionOid;
import com.keralty.ae.persistence.oid.UsuarioNovedadOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>FamiliaNovedad</code> external model class.
 * <p>
 * External Model Class: <code>FamiliaNovedad</code><br>
 */
public class FamiliaNovedad extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="id_familianovedad")
    private Long familiaNovedadidFamiliaNovedad;

    @JsonProperty(value="numfamilia")
    private Long familiaNovedadNumFamilia;

    @JsonProperty(value="titnumidentificacion")
    private String familiaNovedadTitNumidentificacion;

    @JsonProperty(value="titprimernombre")
    private String familiaNovedadTitPrimerNombre;

    @JsonProperty(value="titsegundonombre")
    private String familiaNovedadTitSegundoNombre;

    @JsonProperty(value="titprimerapellido")
    private String familiaNovedadTitPrimerApellido;

    @JsonProperty(value="titsegundoapellido")
    private String familiaNovedadTitSegundoApellido;

    @JsonProperty(value="titrazonsocial")
    private String familiaNovedadTitRazonSocial;

    @JsonProperty(value="tittienebeneficios")
    private Boolean familiaNovedadTitTieneBeneficios;

    @JsonProperty(value="famactiva")
    private Boolean familiaNovedadFamActiva;

    @JsonProperty(value="drvtieneusuarioactivo")
    private Boolean familiaNovedaddrvTieneUsuarioActivo;

    @JsonProperty(value="drvnumtitulares")
    private Long familiaNovedaddrvNumTitulares;

    @JsonProperty(value="drvtienenuevotitular")
    private Boolean familiaNovedaddrvTieneNuevoTitular;

    @JsonProperty(value="titdrvnombrecompleto")
    private String familiaNovedadTitDrvNombreCompleto;

    @JsonProperty(value="titdrvidentificacion")
    private String familiaNovedadTitDrvIdentificacion;

    @JsonProperty(value="titdrvnombreanterior")
    private String familiaNovedadTitDrvNombreAnterior;

    @JsonProperty(value="drvtienenuevadir")
    private Boolean familiaNovedadDrvTieneNuevaDir;

    @JsonProperty(value="drvtienefirmatit")
    private Boolean familiaNovedadDrvTieneFirmaTit;

    @JsonProperty(value="drvtienefirmanuevotit")
    private Boolean familiaNovedadDrvTieneFirmaNuevoTit;

    @JsonProperty(value="drvvalidarcp1")
    private Boolean familiaNovedadDrvValidarCP1;

    @JsonProperty(value="drvvalidarct1")
    private Boolean familiaNovedadDrvValidarCT1;

    @JsonProperty(value="drvedadusutitular")
    private Long familiaNovedaddrvEdadUsuTitular;

    private Collection <UsuarioNovedad> usuarioNovedad;

    private NovedadCT novedadCT;

    private NovedadMD novedadMD;

    private SolicitudNovedad solicitud;

    private TipoIdentificacion tipoIdentificacion;

    private Firma firma;

    /**
     * Gets the value of attribute id_FamiliaNovedad
     */
    public Long getFamiliaNovedadidFamiliaNovedad() {
        return familiaNovedadidFamiliaNovedad;
    }
    
    /**
     * Sets the value of attribute id_FamiliaNovedad
     */
    public void setFamiliaNovedadidFamiliaNovedad(Long familiaNovedadidFamiliaNovedad) {
        this.familiaNovedadidFamiliaNovedad = familiaNovedadidFamiliaNovedad;
    }

    /**
     * Gets the value of attribute NumFamilia
     */
    public Long getFamiliaNovedadNumFamilia() {
        return familiaNovedadNumFamilia;
    }
    
    /**
     * Sets the value of attribute NumFamilia
     */
    public void setFamiliaNovedadNumFamilia(Long familiaNovedadNumFamilia) {
        this.familiaNovedadNumFamilia = familiaNovedadNumFamilia;
    }

    /**
     * Gets the value of attribute TitNumidentificacion
     */
    public String getFamiliaNovedadTitNumidentificacion() {
        return familiaNovedadTitNumidentificacion;
    }
    
    /**
     * Sets the value of attribute TitNumidentificacion
     */
    public void setFamiliaNovedadTitNumidentificacion(String familiaNovedadTitNumidentificacion) {
        this.familiaNovedadTitNumidentificacion = familiaNovedadTitNumidentificacion;
    }

    /**
     * Gets the value of attribute TitPrimerNombre
     */
    public String getFamiliaNovedadTitPrimerNombre() {
        return familiaNovedadTitPrimerNombre;
    }
    
    /**
     * Sets the value of attribute TitPrimerNombre
     */
    public void setFamiliaNovedadTitPrimerNombre(String familiaNovedadTitPrimerNombre) {
        this.familiaNovedadTitPrimerNombre = familiaNovedadTitPrimerNombre;
    }

    /**
     * Gets the value of attribute TitSegundoNombre
     */
    public String getFamiliaNovedadTitSegundoNombre() {
        return familiaNovedadTitSegundoNombre;
    }
    
    /**
     * Sets the value of attribute TitSegundoNombre
     */
    public void setFamiliaNovedadTitSegundoNombre(String familiaNovedadTitSegundoNombre) {
        this.familiaNovedadTitSegundoNombre = familiaNovedadTitSegundoNombre;
    }

    /**
     * Gets the value of attribute TitPrimerApellido
     */
    public String getFamiliaNovedadTitPrimerApellido() {
        return familiaNovedadTitPrimerApellido;
    }
    
    /**
     * Sets the value of attribute TitPrimerApellido
     */
    public void setFamiliaNovedadTitPrimerApellido(String familiaNovedadTitPrimerApellido) {
        this.familiaNovedadTitPrimerApellido = familiaNovedadTitPrimerApellido;
    }

    /**
     * Gets the value of attribute TitSegundoApellido
     */
    public String getFamiliaNovedadTitSegundoApellido() {
        return familiaNovedadTitSegundoApellido;
    }
    
    /**
     * Sets the value of attribute TitSegundoApellido
     */
    public void setFamiliaNovedadTitSegundoApellido(String familiaNovedadTitSegundoApellido) {
        this.familiaNovedadTitSegundoApellido = familiaNovedadTitSegundoApellido;
    }

    /**
     * Gets the value of attribute TitRazonSocial
     */
    public String getFamiliaNovedadTitRazonSocial() {
        return familiaNovedadTitRazonSocial;
    }
    
    /**
     * Sets the value of attribute TitRazonSocial
     */
    public void setFamiliaNovedadTitRazonSocial(String familiaNovedadTitRazonSocial) {
        this.familiaNovedadTitRazonSocial = familiaNovedadTitRazonSocial;
    }

    /**
     * Gets the value of attribute TitTieneBeneficios
     */
    public Boolean getFamiliaNovedadTitTieneBeneficios() {
        return familiaNovedadTitTieneBeneficios;
    }
    
    /**
     * Sets the value of attribute TitTieneBeneficios
     */
    public void setFamiliaNovedadTitTieneBeneficios(Boolean familiaNovedadTitTieneBeneficios) {
        this.familiaNovedadTitTieneBeneficios = familiaNovedadTitTieneBeneficios;
    }

    /**
     * Gets the value of attribute FamActiva
     */
    public Boolean getFamiliaNovedadFamActiva() {
        return familiaNovedadFamActiva;
    }
    
    /**
     * Sets the value of attribute FamActiva
     */
    public void setFamiliaNovedadFamActiva(Boolean familiaNovedadFamActiva) {
        this.familiaNovedadFamActiva = familiaNovedadFamActiva;
    }

    /**
     * Gets the value of attribute drvTieneUsuarioActivo
     */
    public Boolean getFamiliaNovedaddrvTieneUsuarioActivo() {
        return familiaNovedaddrvTieneUsuarioActivo;
    }
    
    /**
     * Sets the value of attribute drvTieneUsuarioActivo
     */
    public void setFamiliaNovedaddrvTieneUsuarioActivo(Boolean familiaNovedaddrvTieneUsuarioActivo) {
        this.familiaNovedaddrvTieneUsuarioActivo = familiaNovedaddrvTieneUsuarioActivo;
    }

    /**
     * Gets the value of attribute drvNumTitulares
     */
    public Long getFamiliaNovedaddrvNumTitulares() {
        return familiaNovedaddrvNumTitulares;
    }
    
    /**
     * Sets the value of attribute drvNumTitulares
     */
    public void setFamiliaNovedaddrvNumTitulares(Long familiaNovedaddrvNumTitulares) {
        this.familiaNovedaddrvNumTitulares = familiaNovedaddrvNumTitulares;
    }

    /**
     * Gets the value of attribute drvTieneNuevoTitular
     */
    public Boolean getFamiliaNovedaddrvTieneNuevoTitular() {
        return familiaNovedaddrvTieneNuevoTitular;
    }
    
    /**
     * Sets the value of attribute drvTieneNuevoTitular
     */
    public void setFamiliaNovedaddrvTieneNuevoTitular(Boolean familiaNovedaddrvTieneNuevoTitular) {
        this.familiaNovedaddrvTieneNuevoTitular = familiaNovedaddrvTieneNuevoTitular;
    }

    /**
     * Gets the value of attribute TitDrvNombreCompleto
     */
    public String getFamiliaNovedadTitDrvNombreCompleto() {
        return familiaNovedadTitDrvNombreCompleto;
    }
    
    /**
     * Sets the value of attribute TitDrvNombreCompleto
     */
    public void setFamiliaNovedadTitDrvNombreCompleto(String familiaNovedadTitDrvNombreCompleto) {
        this.familiaNovedadTitDrvNombreCompleto = familiaNovedadTitDrvNombreCompleto;
    }

    /**
     * Gets the value of attribute TitDrvIdentificacion
     */
    public String getFamiliaNovedadTitDrvIdentificacion() {
        return familiaNovedadTitDrvIdentificacion;
    }
    
    /**
     * Sets the value of attribute TitDrvIdentificacion
     */
    public void setFamiliaNovedadTitDrvIdentificacion(String familiaNovedadTitDrvIdentificacion) {
        this.familiaNovedadTitDrvIdentificacion = familiaNovedadTitDrvIdentificacion;
    }

    /**
     * Gets the value of attribute TitDrvNombreAnterior
     */
    public String getFamiliaNovedadTitDrvNombreAnterior() {
        return familiaNovedadTitDrvNombreAnterior;
    }
    
    /**
     * Sets the value of attribute TitDrvNombreAnterior
     */
    public void setFamiliaNovedadTitDrvNombreAnterior(String familiaNovedadTitDrvNombreAnterior) {
        this.familiaNovedadTitDrvNombreAnterior = familiaNovedadTitDrvNombreAnterior;
    }

    /**
     * Gets the value of attribute DrvTieneNuevaDir
     */
    public Boolean getFamiliaNovedadDrvTieneNuevaDir() {
        return familiaNovedadDrvTieneNuevaDir;
    }
    
    /**
     * Sets the value of attribute DrvTieneNuevaDir
     */
    public void setFamiliaNovedadDrvTieneNuevaDir(Boolean familiaNovedadDrvTieneNuevaDir) {
        this.familiaNovedadDrvTieneNuevaDir = familiaNovedadDrvTieneNuevaDir;
    }

    /**
     * Gets the value of attribute DrvTieneFirmaTit
     */
    public Boolean getFamiliaNovedadDrvTieneFirmaTit() {
        return familiaNovedadDrvTieneFirmaTit;
    }
    
    /**
     * Sets the value of attribute DrvTieneFirmaTit
     */
    public void setFamiliaNovedadDrvTieneFirmaTit(Boolean familiaNovedadDrvTieneFirmaTit) {
        this.familiaNovedadDrvTieneFirmaTit = familiaNovedadDrvTieneFirmaTit;
    }

    /**
     * Gets the value of attribute DrvTieneFirmaNuevoTit
     */
    public Boolean getFamiliaNovedadDrvTieneFirmaNuevoTit() {
        return familiaNovedadDrvTieneFirmaNuevoTit;
    }
    
    /**
     * Sets the value of attribute DrvTieneFirmaNuevoTit
     */
    public void setFamiliaNovedadDrvTieneFirmaNuevoTit(Boolean familiaNovedadDrvTieneFirmaNuevoTit) {
        this.familiaNovedadDrvTieneFirmaNuevoTit = familiaNovedadDrvTieneFirmaNuevoTit;
    }

    /**
     * Gets the value of attribute DrvValidarCP1
     */
    public Boolean getFamiliaNovedadDrvValidarCP1() {
        return familiaNovedadDrvValidarCP1;
    }
    
    /**
     * Sets the value of attribute DrvValidarCP1
     */
    public void setFamiliaNovedadDrvValidarCP1(Boolean familiaNovedadDrvValidarCP1) {
        this.familiaNovedadDrvValidarCP1 = familiaNovedadDrvValidarCP1;
    }

    /**
     * Gets the value of attribute DrvValidarCT1
     */
    public Boolean getFamiliaNovedadDrvValidarCT1() {
        return familiaNovedadDrvValidarCT1;
    }
    
    /**
     * Sets the value of attribute DrvValidarCT1
     */
    public void setFamiliaNovedadDrvValidarCT1(Boolean familiaNovedadDrvValidarCT1) {
        this.familiaNovedadDrvValidarCT1 = familiaNovedadDrvValidarCT1;
    }

    /**
     * Gets the value of attribute drvEdadUsuTitular
     */
    public Long getFamiliaNovedaddrvEdadUsuTitular() {
        return familiaNovedaddrvEdadUsuTitular;
    }
    
    /**
     * Sets the value of attribute drvEdadUsuTitular
     */
    public void setFamiliaNovedaddrvEdadUsuTitular(Long familiaNovedaddrvEdadUsuTitular) {
        this.familiaNovedaddrvEdadUsuTitular = familiaNovedaddrvEdadUsuTitular;
    }

    /**
     * Gets the value of relation through role UsuarioNovedad
     */
    @JsonIgnore
    public Collection <UsuarioNovedad> getUsuarioNovedad() {
        return usuarioNovedad;
    }

    /**
     * Gets the value of relation through role NovedadCT
     */
    @JsonIgnore
    public NovedadCT getNovedadCT() {
        return novedadCT;
    }

    /**
     * Gets the value of relation through role NovedadMD
     */
    @JsonIgnore
    public NovedadMD getNovedadMD() {
        return novedadMD;
    }

    /**
     * Gets the value of relation through role Solicitud
     */
    @JsonIgnore
    public SolicitudNovedad getSolicitud() {
        return solicitud;
    }

    /**
     * Gets the value of relation through role TipoIdentificacion
     */
    @JsonIgnore
    public TipoIdentificacion getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    /**
     * Gets the value of relation through role Firma
     */
    @JsonIgnore
    public Firma getFirma() {
        return firma;
    }

    /**
     * Default constructor
     */
    public FamiliaNovedad() {
        familiaNovedadidFamiliaNovedad = null;
    }

    /**
     * Constructor used to create instances of <code>FamiliaNovedad</code>.
     * @param oid Object Identifier of the instance of <code>FamiliaNovedad</code> to be created.
     * @throws SystemException
     */
    public FamiliaNovedad(FamiliaNovedadOid oid) {
        if (oid != null && !oid.isNull()) {
            familiaNovedadidFamiliaNovedad = oid.getFamiliaNovedadidFamiliaNovedad();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return FamiliaNovedad.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        FamiliaNovedad other = (FamiliaNovedad)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getFamiliaNovedadidFamiliaNovedad(), other.getFamiliaNovedadidFamiliaNovedad());
        result &= Utilities.isEqual(this.getFamiliaNovedadNumFamilia(), other.getFamiliaNovedadNumFamilia());
        result &= Utilities.isEqual(this.getFamiliaNovedadTitNumidentificacion(), other.getFamiliaNovedadTitNumidentificacion());
        result &= Utilities.isEqual(this.getFamiliaNovedadTitPrimerNombre(), other.getFamiliaNovedadTitPrimerNombre());
        result &= Utilities.isEqual(this.getFamiliaNovedadTitSegundoNombre(), other.getFamiliaNovedadTitSegundoNombre());
        result &= Utilities.isEqual(this.getFamiliaNovedadTitPrimerApellido(), other.getFamiliaNovedadTitPrimerApellido());
        result &= Utilities.isEqual(this.getFamiliaNovedadTitSegundoApellido(), other.getFamiliaNovedadTitSegundoApellido());
        result &= Utilities.isEqual(this.getFamiliaNovedadTitRazonSocial(), other.getFamiliaNovedadTitRazonSocial());
        result &= Utilities.isEqual(this.getFamiliaNovedadTitTieneBeneficios(), other.getFamiliaNovedadTitTieneBeneficios());
        result &= Utilities.isEqual(this.getFamiliaNovedadFamActiva(), other.getFamiliaNovedadFamActiva());
        result &= Utilities.isEqual(this.getFamiliaNovedaddrvTieneUsuarioActivo(), other.getFamiliaNovedaddrvTieneUsuarioActivo());
        result &= Utilities.isEqual(this.getFamiliaNovedaddrvNumTitulares(), other.getFamiliaNovedaddrvNumTitulares());
        result &= Utilities.isEqual(this.getFamiliaNovedaddrvTieneNuevoTitular(), other.getFamiliaNovedaddrvTieneNuevoTitular());
        result &= Utilities.isEqual(this.getFamiliaNovedadTitDrvNombreCompleto(), other.getFamiliaNovedadTitDrvNombreCompleto());
        result &= Utilities.isEqual(this.getFamiliaNovedadTitDrvIdentificacion(), other.getFamiliaNovedadTitDrvIdentificacion());
        result &= Utilities.isEqual(this.getFamiliaNovedadTitDrvNombreAnterior(), other.getFamiliaNovedadTitDrvNombreAnterior());
        result &= Utilities.isEqual(this.getFamiliaNovedadDrvTieneNuevaDir(), other.getFamiliaNovedadDrvTieneNuevaDir());
        result &= Utilities.isEqual(this.getFamiliaNovedadDrvTieneFirmaTit(), other.getFamiliaNovedadDrvTieneFirmaTit());
        result &= Utilities.isEqual(this.getFamiliaNovedadDrvTieneFirmaNuevoTit(), other.getFamiliaNovedadDrvTieneFirmaNuevoTit());
        result &= Utilities.isEqual(this.getFamiliaNovedadDrvValidarCP1(), other.getFamiliaNovedadDrvValidarCP1());
        result &= Utilities.isEqual(this.getFamiliaNovedadDrvValidarCT1(), other.getFamiliaNovedadDrvValidarCT1());
        result &= Utilities.isEqual(this.getFamiliaNovedaddrvEdadUsuTitular(), other.getFamiliaNovedaddrvEdadUsuTitular());
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
     * Returns the <code>FamiliaNovedadOid</code> object that identifies this instance of <code>FamiliaNovedad</code>.
     * @return <code>FamiliaNovedadOid</code> object that identifies this instance of <code>FamiliaNovedad</code>
     */
	@Override
    public FamiliaNovedadOid getOid() {
        return new FamiliaNovedadOid(getFamiliaNovedadidFamiliaNovedad());
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
        if (!activeFacets.contains(Constants.FAMILIANOVEDAD)) {
            activeFacets.add(Constants.FAMILIANOVEDAD);
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
            relatedInstance = buildFamiliaNovedadRelatedInstance(relatedInstanceJsonOid);
        }
        if (FamiliaNovedadConstants.ROLE_NAME_USUARIONOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFamiliaNovedadRelatedInstance4UsuarioNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (FamiliaNovedadConstants.ROLE_NAME_NOVEDADCT.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFamiliaNovedadRelatedInstance4NovedadCT(relatedInstanceJsonOid, remainingPath);
        }
        if (FamiliaNovedadConstants.ROLE_NAME_NOVEDADMD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFamiliaNovedadRelatedInstance4NovedadMD(relatedInstanceJsonOid, remainingPath);
        }
        if (FamiliaNovedadConstants.ROLE_NAME_SOLICITUD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFamiliaNovedadRelatedInstance4SolicitudNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (FamiliaNovedadConstants.ROLE_NAME_TIPOIDENTIFICACION.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFamiliaNovedadRelatedInstance4TipoIdentificacion(relatedInstanceJsonOid, remainingPath);
        }
        if (FamiliaNovedadConstants.ROLE_NAME_FIRMA.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildFamiliaNovedadRelatedInstance4Firma(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildFamiliaNovedadRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new FamiliaNovedad(mapper.readValue(relatedInstanceJsonOid, FamiliaNovedadOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(FamiliaNovedad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildFamiliaNovedadRelatedInstance4UsuarioNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new UsuarioNovedad(mapper.readValue(relatedInstanceJsonOid, UsuarioNovedadOid.class)): UsuarioNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(FamiliaNovedad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildFamiliaNovedadRelatedInstance4NovedadCT(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new NovedadCT(mapper.readValue(relatedInstanceJsonOid, NovedadCTOid.class)): NovedadCT.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(FamiliaNovedad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildFamiliaNovedadRelatedInstance4NovedadMD(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new NovedadMD(mapper.readValue(relatedInstanceJsonOid, NovedadMDOid.class)): NovedadMD.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(FamiliaNovedad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildFamiliaNovedadRelatedInstance4SolicitudNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new SolicitudNovedad(mapper.readValue(relatedInstanceJsonOid, SolicitudNovedadOid.class)): SolicitudNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(FamiliaNovedad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildFamiliaNovedadRelatedInstance4TipoIdentificacion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new TipoIdentificacion(mapper.readValue(relatedInstanceJsonOid, TipoIdentificacionOid.class)): TipoIdentificacion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(FamiliaNovedad.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildFamiliaNovedadRelatedInstance4Firma(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Firma(mapper.readValue(relatedInstanceJsonOid, FirmaOid.class)): Firma.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(FamiliaNovedad.class).error(e.getMessage());
            return null;
        }
    }
}
