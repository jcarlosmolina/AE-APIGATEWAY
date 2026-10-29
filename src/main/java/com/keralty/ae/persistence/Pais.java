package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.PaisConstants;
import com.keralty.ae.persistence.oid.DireccionCOid;
import com.keralty.ae.persistence.oid.DireccionOid;
import com.keralty.ae.persistence.oid.DirSucursalCOid;
import com.keralty.ae.persistence.oid.NovedadCTOid;
import com.keralty.ae.persistence.oid.NovedadMDOid;
import com.keralty.ae.persistence.oid.PaisOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>Pais</code> external model class.
 * <p>
 * External Model Class: <code>Pais</code><br>
 */
public class Pais extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="codigo")
    private String paisCodigo;

    @JsonProperty(value="descripcion")
    private String paisDescripcion;

    private Collection <DireccionC> direccionesC;

    private Collection <Direccion> direcciones;

    private Collection <DirSucursalC> dirSucursalC;

    private Collection <NovedadCT> novedadCT;

    private Collection <NovedadMD> novedadesMD;

    /**
     * Gets the value of attribute Codigo
     */
    public String getPaisCodigo() {
        return paisCodigo;
    }
    
    /**
     * Sets the value of attribute Codigo
     */
    public void setPaisCodigo(String paisCodigo) {
        this.paisCodigo = paisCodigo;
    }

    /**
     * Gets the value of attribute Descripcion
     */
    public String getPaisDescripcion() {
        return paisDescripcion;
    }
    
    /**
     * Sets the value of attribute Descripcion
     */
    public void setPaisDescripcion(String paisDescripcion) {
        this.paisDescripcion = paisDescripcion;
    }

    /**
     * Gets the value of relation through role DireccionesC
     */
    @JsonIgnore
    public Collection <DireccionC> getDireccionesC() {
        return direccionesC;
    }

    /**
     * Gets the value of relation through role Direcciones
     */
    @JsonIgnore
    public Collection <Direccion> getDirecciones() {
        return direcciones;
    }

    /**
     * Gets the value of relation through role DirSucursalC
     */
    @JsonIgnore
    public Collection <DirSucursalC> getDirSucursalC() {
        return dirSucursalC;
    }

    /**
     * Gets the value of relation through role NovedadCT
     */
    @JsonIgnore
    public Collection <NovedadCT> getNovedadCT() {
        return novedadCT;
    }

    /**
     * Gets the value of relation through role NovedadesMD
     */
    @JsonIgnore
    public Collection <NovedadMD> getNovedadesMD() {
        return novedadesMD;
    }

    /**
     * Default constructor
     */
    public Pais() {
        paisCodigo = null;
    }

    /**
     * Constructor used to create instances of <code>Pais</code>.
     * @param oid Object Identifier of the instance of <code>Pais</code> to be created.
     * @throws SystemException
     */
    public Pais(PaisOid oid) {
        if (oid != null && !oid.isNull()) {
            paisCodigo = oid.getPaisCodigo();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return Pais.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Pais other = (Pais)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getPaisCodigo(), other.getPaisCodigo());
        result &= Utilities.isEqual(this.getPaisDescripcion(), other.getPaisDescripcion());
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
     * Returns the <code>PaisOid</code> object that identifies this instance of <code>Pais</code>.
     * @return <code>PaisOid</code> object that identifies this instance of <code>Pais</code>
     */
	@Override
    public PaisOid getOid() {
        return new PaisOid(getPaisCodigo());
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
        if (!activeFacets.contains(Constants.PAIS)) {
            activeFacets.add(Constants.PAIS);
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
            relatedInstance = buildPaisRelatedInstance(relatedInstanceJsonOid);
        }
        if (PaisConstants.ROLE_NAME_DIRECCIONESC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPaisRelatedInstance4DireccionC(relatedInstanceJsonOid, remainingPath);
        }
        if (PaisConstants.ROLE_NAME_DIRECCIONES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPaisRelatedInstance4Direccion(relatedInstanceJsonOid, remainingPath);
        }
        if (PaisConstants.ROLE_NAME_DIRSUCURSALC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPaisRelatedInstance4DirSucursalC(relatedInstanceJsonOid, remainingPath);
        }
        if (PaisConstants.ROLE_NAME_NOVEDADCT.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPaisRelatedInstance4NovedadCT(relatedInstanceJsonOid, remainingPath);
        }
        if (PaisConstants.ROLE_NAME_NOVEDADESMD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildPaisRelatedInstance4NovedadMD(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildPaisRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Pais(mapper.readValue(relatedInstanceJsonOid, PaisOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Pais.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPaisRelatedInstance4DireccionC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new DireccionC(mapper.readValue(relatedInstanceJsonOid, DireccionCOid.class)): DireccionC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Pais.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPaisRelatedInstance4Direccion(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Direccion(mapper.readValue(relatedInstanceJsonOid, DireccionOid.class)): Direccion.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Pais.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPaisRelatedInstance4DirSucursalC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new DirSucursalC(mapper.readValue(relatedInstanceJsonOid, DirSucursalCOid.class)): DirSucursalC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Pais.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPaisRelatedInstance4NovedadCT(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new NovedadCT(mapper.readValue(relatedInstanceJsonOid, NovedadCTOid.class)): NovedadCT.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Pais.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildPaisRelatedInstance4NovedadMD(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new NovedadMD(mapper.readValue(relatedInstanceJsonOid, NovedadMDOid.class)): NovedadMD.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Pais.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
