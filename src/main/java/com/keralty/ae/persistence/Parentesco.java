package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.ParentescoConstants;
import com.keralty.ae.persistence.oid.BeneficiarioCOid;
import com.keralty.ae.persistence.oid.ParentescoDomOid;
import com.keralty.ae.persistence.oid.ParentescoOid;
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
 * Representation of the <code>Parentesco</code> external model class.
 * <p>
 * External Model Class: <code>Parentesco</code><br>
 */
public class Parentesco extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="codigo")
    private Long parentescoCodigo;

    @JsonProperty(value="descripcion")
    private String parentescoDescripcion;

    @JsonProperty(value="estitular")
    private Boolean parentescoEsTitular;

    @JsonProperty(value="esconyuge")
    private Boolean parentescoEsConyuge;

    @JsonProperty(value="espadre")
    private Boolean parentescoEsPadre;

    @JsonProperty(value="eshijo")
    private Boolean parentescoEsHijo;

    @JsonProperty(value="nombrecorto")
    private String parentescoNombreCorto;

    private Collection <Usuario> atributosUsuario;

    private Collection <BeneficiarioC> beneficiariosC;

    private Collection <UsuarioReg> usuariosReg;

    private Collection <ParentescoDom> parentescosDom;

    private Collection <UsuarioNovedad> usuariosNovedad;

    private Collection <UsuarioNovedad> usuarioNovedad;

    /**
     * Gets the value of attribute Codigo
     */
    public Long getParentescoCodigo() {
        return parentescoCodigo;
    }
    
    /**
     * Sets the value of attribute Codigo
     */
    public void setParentescoCodigo(Long parentescoCodigo) {
        this.parentescoCodigo = parentescoCodigo;
    }

    /**
     * Gets the value of attribute Descripcion
     */
    public String getParentescoDescripcion() {
        return parentescoDescripcion;
    }
    
    /**
     * Sets the value of attribute Descripcion
     */
    public void setParentescoDescripcion(String parentescoDescripcion) {
        this.parentescoDescripcion = parentescoDescripcion;
    }

    /**
     * Gets the value of attribute EsTitular
     */
    public Boolean getParentescoEsTitular() {
        return parentescoEsTitular;
    }
    
    /**
     * Sets the value of attribute EsTitular
     */
    public void setParentescoEsTitular(Boolean parentescoEsTitular) {
        this.parentescoEsTitular = parentescoEsTitular;
    }

    /**
     * Gets the value of attribute EsConyuge
     */
    public Boolean getParentescoEsConyuge() {
        return parentescoEsConyuge;
    }
    
    /**
     * Sets the value of attribute EsConyuge
     */
    public void setParentescoEsConyuge(Boolean parentescoEsConyuge) {
        this.parentescoEsConyuge = parentescoEsConyuge;
    }

    /**
     * Gets the value of attribute EsPadre
     */
    public Boolean getParentescoEsPadre() {
        return parentescoEsPadre;
    }
    
    /**
     * Sets the value of attribute EsPadre
     */
    public void setParentescoEsPadre(Boolean parentescoEsPadre) {
        this.parentescoEsPadre = parentescoEsPadre;
    }

    /**
     * Gets the value of attribute EsHijo
     */
    public Boolean getParentescoEsHijo() {
        return parentescoEsHijo;
    }
    
    /**
     * Sets the value of attribute EsHijo
     */
    public void setParentescoEsHijo(Boolean parentescoEsHijo) {
        this.parentescoEsHijo = parentescoEsHijo;
    }

    /**
     * Gets the value of attribute NombreCorto
     */
    public String getParentescoNombreCorto() {
        return parentescoNombreCorto;
    }
    
    /**
     * Sets the value of attribute NombreCorto
     */
    public void setParentescoNombreCorto(String parentescoNombreCorto) {
        this.parentescoNombreCorto = parentescoNombreCorto;
    }

    /**
     * Gets the value of relation through role AtributosUsuario
     */
    @JsonIgnore
    public Collection <Usuario> getAtributosUsuario() {
        return atributosUsuario;
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
     * Gets the value of relation through role ParentescosDom
     */
    @JsonIgnore
    public Collection <ParentescoDom> getParentescosDom() {
        return parentescosDom;
    }

    /**
     * Gets the value of relation through role UsuariosNovedad
     */
    @JsonIgnore
    public Collection <UsuarioNovedad> getUsuariosNovedad() {
        return usuariosNovedad;
    }

    /**
     * Gets the value of relation through role UsuarioNovedad
     */
    @JsonIgnore
    public Collection <UsuarioNovedad> getUsuarioNovedad() {
        return usuarioNovedad;
    }

    /**
     * Default constructor
     */
    public Parentesco() {
        parentescoCodigo = null;
    }

    /**
     * Constructor used to create instances of <code>Parentesco</code>.
     * @param oid Object Identifier of the instance of <code>Parentesco</code> to be created.
     * @throws SystemException
     */
    public Parentesco(ParentescoOid oid) {
        if (oid != null && !oid.isNull()) {
            parentescoCodigo = oid.getParentescoCodigo();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return Parentesco.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Parentesco other = (Parentesco)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getParentescoCodigo(), other.getParentescoCodigo());
        result &= Utilities.isEqual(this.getParentescoDescripcion(), other.getParentescoDescripcion());
        result &= Utilities.isEqual(this.getParentescoEsTitular(), other.getParentescoEsTitular());
        result &= Utilities.isEqual(this.getParentescoEsConyuge(), other.getParentescoEsConyuge());
        result &= Utilities.isEqual(this.getParentescoEsPadre(), other.getParentescoEsPadre());
        result &= Utilities.isEqual(this.getParentescoEsHijo(), other.getParentescoEsHijo());
        result &= Utilities.isEqual(this.getParentescoNombreCorto(), other.getParentescoNombreCorto());
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
     * Returns the <code>ParentescoOid</code> object that identifies this instance of <code>Parentesco</code>.
     * @return <code>ParentescoOid</code> object that identifies this instance of <code>Parentesco</code>
     */
	@Override
    public ParentescoOid getOid() {
        return new ParentescoOid(getParentescoCodigo());
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
        if (!activeFacets.contains(Constants.PARENTESCO)) {
            activeFacets.add(Constants.PARENTESCO);
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
            relatedInstance = buildParentescoRelatedInstance(relatedInstanceJsonOid);
        }
        if (ParentescoConstants.ROLE_NAME_ATRIBUTOSUSUARIO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildParentescoRelatedInstance4Usuario(relatedInstanceJsonOid, remainingPath);
        }
        if (ParentescoConstants.ROLE_NAME_BENEFICIARIOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildParentescoRelatedInstance4BeneficiarioC(relatedInstanceJsonOid, remainingPath);
        }
        if (ParentescoConstants.ROLE_NAME_USUARIOSREG.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildParentescoRelatedInstance4UsuarioReg(relatedInstanceJsonOid, remainingPath);
        }
        if (ParentescoConstants.ROLE_NAME_PARENTESCOSDOM.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildParentescoRelatedInstance4ParentescoDom(relatedInstanceJsonOid, remainingPath);
        }
        if (ParentescoConstants.ROLE_NAME_USUARIOSNOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem) || ParentescoConstants.ROLE_NAME_USUARIONOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildParentescoRelatedInstance4UsuarioNovedad(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildParentescoRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new Parentesco(mapper.readValue(relatedInstanceJsonOid, ParentescoOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Parentesco.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildParentescoRelatedInstance4Usuario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Usuario(mapper.readValue(relatedInstanceJsonOid, UsuarioOid.class)): Usuario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Parentesco.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildParentescoRelatedInstance4BeneficiarioC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new BeneficiarioC(mapper.readValue(relatedInstanceJsonOid, BeneficiarioCOid.class)): BeneficiarioC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Parentesco.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildParentescoRelatedInstance4UsuarioReg(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new UsuarioReg(mapper.readValue(relatedInstanceJsonOid, UsuarioRegOid.class)): UsuarioReg.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Parentesco.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildParentescoRelatedInstance4ParentescoDom(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new ParentescoDom(mapper.readValue(relatedInstanceJsonOid, ParentescoDomOid.class)): ParentescoDom.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Parentesco.class).error(e.getMessage());
            return null;
        }
    }

    private static AbstractAppEntity buildParentescoRelatedInstance4UsuarioNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new UsuarioNovedad(mapper.readValue(relatedInstanceJsonOid, UsuarioNovedadOid.class)): UsuarioNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(Parentesco.class).error(e.getMessage());
            return null;
        }
    }
}
