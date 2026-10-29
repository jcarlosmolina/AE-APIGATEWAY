package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.EstadoBeneficiarioConstants;
import com.keralty.ae.persistence.oid.BeneficiarioCOid;
import com.keralty.ae.persistence.oid.EstadoBeneficiarioAEOid;
import com.keralty.ae.persistence.oid.EstadoBeneficiarioOid;
import com.keralty.ae.persistence.oid.UsuarioNovedadOid;
import com.keralty.ae.persistence.oid.UsuarioOid;
import com.keralty.ae.persistence.oid.UsuarioRegOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>EstadoBeneficiario</code> external model class.
 * <p>
 * External Model Class: <code>EstadoBeneficiario</code><br>
 */
public class EstadoBeneficiario extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="codigo")
    private Long estadoBeneficiarioCodigo;

    @JsonProperty(value="descripcion")
    private String estadoBeneficiarioDescripcion;

    @JsonProperty(value="esactivo")
    private Boolean estadoBeneficiarioEsActivo;

    @JsonProperty(value="confirmado")
    private Boolean estadoBeneficiarioConfirmado;

    @JsonProperty(value="eserror")
    private Boolean estadoBeneficiarioEsError;

    private Collection <EstadoBeneficiarioAE> estadoBeneficiarioAE;

    private Collection <Usuario> usuarioS;

    private Collection <BeneficiarioC> beneficiariosC;

    private Collection <UsuarioReg> usuariosReg;

    private Collection <UsuarioNovedad> usuariosNovedad;

    /**
     * Gets the value of attribute Codigo
     */
    public Long getEstadoBeneficiarioCodigo() {
        return estadoBeneficiarioCodigo;
    }
    
    /**
     * Sets the value of attribute Codigo
     */
    public void setEstadoBeneficiarioCodigo(Long estadoBeneficiarioCodigo) {
        this.estadoBeneficiarioCodigo = estadoBeneficiarioCodigo;
    }

    /**
     * Gets the value of attribute Descripcion
     */
    public String getEstadoBeneficiarioDescripcion() {
        return estadoBeneficiarioDescripcion;
    }
    
    /**
     * Sets the value of attribute Descripcion
     */
    public void setEstadoBeneficiarioDescripcion(String estadoBeneficiarioDescripcion) {
        this.estadoBeneficiarioDescripcion = estadoBeneficiarioDescripcion;
    }

    /**
     * Gets the value of attribute EsActivo
     */
    public Boolean getEstadoBeneficiarioEsActivo() {
        return estadoBeneficiarioEsActivo;
    }
    
    /**
     * Sets the value of attribute EsActivo
     */
    public void setEstadoBeneficiarioEsActivo(Boolean estadoBeneficiarioEsActivo) {
        this.estadoBeneficiarioEsActivo = estadoBeneficiarioEsActivo;
    }

    /**
     * Gets the value of attribute Confirmado
     */
    public Boolean getEstadoBeneficiarioConfirmado() {
        return estadoBeneficiarioConfirmado;
    }
    
    /**
     * Sets the value of attribute Confirmado
     */
    public void setEstadoBeneficiarioConfirmado(Boolean estadoBeneficiarioConfirmado) {
        this.estadoBeneficiarioConfirmado = estadoBeneficiarioConfirmado;
    }

    /**
     * Gets the value of attribute EsError
     */
    public Boolean getEstadoBeneficiarioEsError() {
        return estadoBeneficiarioEsError;
    }
    
    /**
     * Sets the value of attribute EsError
     */
    public void setEstadoBeneficiarioEsError(Boolean estadoBeneficiarioEsError) {
        this.estadoBeneficiarioEsError = estadoBeneficiarioEsError;
    }

    /**
     * Gets the value of relation through role EstadoBeneficiarioAE
     */
    @JsonIgnore
    public Collection <EstadoBeneficiarioAE> getEstadoBeneficiarioAE() {
        return estadoBeneficiarioAE;
    }

    /**
     * Gets the value of relation through role UsuarioS
     */
    @JsonIgnore
    public Collection <Usuario> getUsuarioS() {
        return usuarioS;
    }

    /**
     * Gets the value of relation through role BeneficiariosC
     */
    @JsonIgnore
    public Collection <BeneficiarioC> getBeneficiariosC() {
        return beneficiariosC;
    }

    /**
     * Gets the value of relation through role UsuariosReg
     */
    @JsonIgnore
    public Collection <UsuarioReg> getUsuariosReg() {
        return usuariosReg;
    }

    /**
     * Gets the value of relation through role UsuariosNovedad
     */
    @JsonIgnore
    public Collection <UsuarioNovedad> getUsuariosNovedad() {
        return usuariosNovedad;
    }

    /**
     * Default constructor
     */
    public EstadoBeneficiario() {
        estadoBeneficiarioCodigo = null;
    }

    /**
     * Constructor used to create instances of <code>EstadoBeneficiario</code>.
     * @param oid Object Identifier of the instance of <code>EstadoBeneficiario</code> to be created.
     * @throws SystemException
     */
    public EstadoBeneficiario(EstadoBeneficiarioOid oid) {
        if (oid != null && !oid.isNull()) {
            estadoBeneficiarioCodigo = oid.getEstadoBeneficiarioCodigo();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return EstadoBeneficiario.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        EstadoBeneficiario other = (EstadoBeneficiario)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getEstadoBeneficiarioCodigo(), other.getEstadoBeneficiarioCodigo());
        result &= Utilities.isEqual(this.getEstadoBeneficiarioDescripcion(), other.getEstadoBeneficiarioDescripcion());
        result &= Utilities.isEqual(this.getEstadoBeneficiarioEsActivo(), other.getEstadoBeneficiarioEsActivo());
        result &= Utilities.isEqual(this.getEstadoBeneficiarioConfirmado(), other.getEstadoBeneficiarioConfirmado());
        result &= Utilities.isEqual(this.getEstadoBeneficiarioEsError(), other.getEstadoBeneficiarioEsError());
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
     * Returns the <code>EstadoBeneficiarioOid</code> object that identifies this instance of <code>EstadoBeneficiario</code>.
     * @return <code>EstadoBeneficiarioOid</code> object that identifies this instance of <code>EstadoBeneficiario</code>
     */
	@Override
    public EstadoBeneficiarioOid getOid() {
        return new EstadoBeneficiarioOid(getEstadoBeneficiarioCodigo());
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
        if (!activeFacets.contains(Constants.ESTADOBENEFICIARIO)) {
            activeFacets.add(Constants.ESTADOBENEFICIARIO);
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
            relatedInstance = buildEstadoBeneficiarioRelatedInstance(relatedInstanceJsonOid);
        }
        if (EstadoBeneficiarioConstants.ROLE_NAME_ESTADOBENEFICIARIOAE.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildEstadoBeneficiarioRelatedInstance4EstadoBeneficiarioAE(relatedInstanceJsonOid, remainingPath);
        }
        if (EstadoBeneficiarioConstants.ROLE_NAME_USUARIOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildEstadoBeneficiarioRelatedInstance4Usuario(relatedInstanceJsonOid, remainingPath);
        }
        if (EstadoBeneficiarioConstants.ROLE_NAME_BENEFICIARIOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildEstadoBeneficiarioRelatedInstance4BeneficiarioC(relatedInstanceJsonOid, remainingPath);
        }
        if (EstadoBeneficiarioConstants.ROLE_NAME_USUARIOSREG.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildEstadoBeneficiarioRelatedInstance4UsuarioReg(relatedInstanceJsonOid, remainingPath);
        }
        if (EstadoBeneficiarioConstants.ROLE_NAME_USUARIOSNOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildEstadoBeneficiarioRelatedInstance4UsuarioNovedad(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildEstadoBeneficiarioRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new EstadoBeneficiario(mapper.readValue(relatedInstanceJsonOid, EstadoBeneficiarioOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(EstadoBeneficiario.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildEstadoBeneficiarioRelatedInstance4EstadoBeneficiarioAE(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new EstadoBeneficiarioAE(mapper.readValue(relatedInstanceJsonOid, EstadoBeneficiarioAEOid.class)): EstadoBeneficiarioAE.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(EstadoBeneficiario.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildEstadoBeneficiarioRelatedInstance4Usuario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Usuario(mapper.readValue(relatedInstanceJsonOid, UsuarioOid.class)): Usuario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(EstadoBeneficiario.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildEstadoBeneficiarioRelatedInstance4BeneficiarioC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new BeneficiarioC(mapper.readValue(relatedInstanceJsonOid, BeneficiarioCOid.class)): BeneficiarioC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(EstadoBeneficiario.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildEstadoBeneficiarioRelatedInstance4UsuarioReg(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new UsuarioReg(mapper.readValue(relatedInstanceJsonOid, UsuarioRegOid.class)): UsuarioReg.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(EstadoBeneficiario.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildEstadoBeneficiarioRelatedInstance4UsuarioNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new UsuarioNovedad(mapper.readValue(relatedInstanceJsonOid, UsuarioNovedadOid.class)): UsuarioNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(EstadoBeneficiario.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
