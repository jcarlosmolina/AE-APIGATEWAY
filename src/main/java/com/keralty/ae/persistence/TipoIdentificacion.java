package com.keralty.ae.persistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keralty.ae.exception.ModelException;
import com.keralty.ae.exception.SystemException;
import com.keralty.ae.global.Constants;
import com.keralty.ae.global.TipoIdentificacionConstants;
import com.keralty.ae.persistence.oid.AnexoCOid;
import com.keralty.ae.persistence.oid.AsesorOid;
import com.keralty.ae.persistence.oid.ContratanteOid;
import com.keralty.ae.persistence.oid.FamiliaNovedadOid;
import com.keralty.ae.persistence.oid.InstitucionMatNeoOid;
import com.keralty.ae.persistence.oid.NovedadCTOid;
import com.keralty.ae.persistence.oid.PersonaCOid;
import com.keralty.ae.persistence.oid.PersonaOid;
import com.keralty.ae.persistence.oid.SolicitudNovedadOid;
import com.keralty.ae.persistence.oid.TipoIdentificacionOid;
import com.keralty.ae.persistence.oid.TitularOid;
import com.keralty.ae.persistence.oid.UsuarioNovedadOid;
import com.keralty.ae.persistence.oid.UsuarioOid;
import com.keralty.ae.utils.Utilities;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Representation of the <code>TipoIdentificacion</code> external model class.
 * <p>
 * External Model Class: <code>TipoIdentificacion</code><br>
 */
public class TipoIdentificacion extends AbstractAppEntity {
    
    private static final long serialVersionUID = 1L;

    @JsonProperty(value="codigo")
    private Long tipoIdentificacionCodigo;

    @JsonProperty(value="descripcion")
    private String tipoIdentificacionDescripcion;

    @JsonProperty(value="nombrecorto")
    private String tipoIdentificacionNombreCorto;

    @JsonProperty(value="validocontratante")
    private Boolean tipoIdentificacionValidoContratante;

    @JsonProperty(value="validotitular")
    private Boolean tipoIdentificacionValidoTitular;

    @JsonProperty(value="diplomatico")
    private Boolean tipoIdentificacionDiplomatico;

    @JsonProperty(value="nit")
    private Boolean tipoIdentificacionNIT;

    @JsonProperty(value="hijode")
    private Boolean tipoIdentificacionHijoDe;

    @JsonProperty(value="requiereeps")
    private Boolean tipoIdentificacionRequiereEPS;

    @JsonProperty(value="menorsinidentificar")
    private Boolean tipoIdentificacionMenorSinIdentificar;

    @JsonProperty(value="espasaporte")
    private Boolean tipoIdentificacionEsPasaporte;

    @JsonProperty(value="visiblevalidadorusu")
    private Boolean tipoIdentificacionVisibleValidadorUsu;

    private Collection <Asesor> asesores;

    private Collection <Persona> personas;

    private Collection <PersonaC> personasC;

    private Collection <Usuario> usuarioS;

    private Collection <Contratante> contratantes;

    private Collection <AnexoC> anexosC;

    private Collection <Titular> titulares;

    private Collection <InstitucionMatNeo> institucionMatNeo;

    private Collection <SolicitudNovedad> solicitudesNovedad;

    private Collection <FamiliaNovedad> familiasNovedad;

    private Collection <UsuarioNovedad> usuariosNovedad;

    private Collection <UsuarioNovedad> usuarioNovedad;

    private Collection <NovedadCT> novedadesCT;

    /**
     * Gets the value of attribute Codigo
     */
    public Long getTipoIdentificacionCodigo() {
        return tipoIdentificacionCodigo;
    }
    
    /**
     * Sets the value of attribute Codigo
     */
    public void setTipoIdentificacionCodigo(Long tipoIdentificacionCodigo) {
        this.tipoIdentificacionCodigo = tipoIdentificacionCodigo;
    }

    /**
     * Gets the value of attribute Descripcion
     */
    public String getTipoIdentificacionDescripcion() {
        return tipoIdentificacionDescripcion;
    }
    
    /**
     * Sets the value of attribute Descripcion
     */
    public void setTipoIdentificacionDescripcion(String tipoIdentificacionDescripcion) {
        this.tipoIdentificacionDescripcion = tipoIdentificacionDescripcion;
    }

    /**
     * Gets the value of attribute NombreCorto
     */
    public String getTipoIdentificacionNombreCorto() {
        return tipoIdentificacionNombreCorto;
    }
    
    /**
     * Sets the value of attribute NombreCorto
     */
    public void setTipoIdentificacionNombreCorto(String tipoIdentificacionNombreCorto) {
        this.tipoIdentificacionNombreCorto = tipoIdentificacionNombreCorto;
    }

    /**
     * Gets the value of attribute ValidoContratante
     */
    public Boolean getTipoIdentificacionValidoContratante() {
        return tipoIdentificacionValidoContratante;
    }
    
    /**
     * Sets the value of attribute ValidoContratante
     */
    public void setTipoIdentificacionValidoContratante(Boolean tipoIdentificacionValidoContratante) {
        this.tipoIdentificacionValidoContratante = tipoIdentificacionValidoContratante;
    }

    /**
     * Gets the value of attribute ValidoTitular
     */
    public Boolean getTipoIdentificacionValidoTitular() {
        return tipoIdentificacionValidoTitular;
    }
    
    /**
     * Sets the value of attribute ValidoTitular
     */
    public void setTipoIdentificacionValidoTitular(Boolean tipoIdentificacionValidoTitular) {
        this.tipoIdentificacionValidoTitular = tipoIdentificacionValidoTitular;
    }

    /**
     * Gets the value of attribute Diplomatico
     */
    public Boolean getTipoIdentificacionDiplomatico() {
        return tipoIdentificacionDiplomatico;
    }
    
    /**
     * Sets the value of attribute Diplomatico
     */
    public void setTipoIdentificacionDiplomatico(Boolean tipoIdentificacionDiplomatico) {
        this.tipoIdentificacionDiplomatico = tipoIdentificacionDiplomatico;
    }

    /**
     * Gets the value of attribute NIT
     */
    public Boolean getTipoIdentificacionNIT() {
        return tipoIdentificacionNIT;
    }
    
    /**
     * Sets the value of attribute NIT
     */
    public void setTipoIdentificacionNIT(Boolean tipoIdentificacionNIT) {
        this.tipoIdentificacionNIT = tipoIdentificacionNIT;
    }

    /**
     * Gets the value of attribute HijoDe
     */
    public Boolean getTipoIdentificacionHijoDe() {
        return tipoIdentificacionHijoDe;
    }
    
    /**
     * Sets the value of attribute HijoDe
     */
    public void setTipoIdentificacionHijoDe(Boolean tipoIdentificacionHijoDe) {
        this.tipoIdentificacionHijoDe = tipoIdentificacionHijoDe;
    }

    /**
     * Gets the value of attribute RequiereEPS
     */
    public Boolean getTipoIdentificacionRequiereEPS() {
        return tipoIdentificacionRequiereEPS;
    }
    
    /**
     * Sets the value of attribute RequiereEPS
     */
    public void setTipoIdentificacionRequiereEPS(Boolean tipoIdentificacionRequiereEPS) {
        this.tipoIdentificacionRequiereEPS = tipoIdentificacionRequiereEPS;
    }

    /**
     * Gets the value of attribute MenorSinIdentificar
     */
    public Boolean getTipoIdentificacionMenorSinIdentificar() {
        return tipoIdentificacionMenorSinIdentificar;
    }
    
    /**
     * Sets the value of attribute MenorSinIdentificar
     */
    public void setTipoIdentificacionMenorSinIdentificar(Boolean tipoIdentificacionMenorSinIdentificar) {
        this.tipoIdentificacionMenorSinIdentificar = tipoIdentificacionMenorSinIdentificar;
    }

    /**
     * Gets the value of attribute EsPasaporte
     */
    public Boolean getTipoIdentificacionEsPasaporte() {
        return tipoIdentificacionEsPasaporte;
    }
    
    /**
     * Sets the value of attribute EsPasaporte
     */
    public void setTipoIdentificacionEsPasaporte(Boolean tipoIdentificacionEsPasaporte) {
        this.tipoIdentificacionEsPasaporte = tipoIdentificacionEsPasaporte;
    }

    /**
     * Gets the value of attribute VisibleValidadorUsu
     */
    public Boolean getTipoIdentificacionVisibleValidadorUsu() {
        return tipoIdentificacionVisibleValidadorUsu;
    }
    
    /**
     * Sets the value of attribute VisibleValidadorUsu
     */
    public void setTipoIdentificacionVisibleValidadorUsu(Boolean tipoIdentificacionVisibleValidadorUsu) {
        this.tipoIdentificacionVisibleValidadorUsu = tipoIdentificacionVisibleValidadorUsu;
    }

    /**
     * Gets the value of relation through role Asesores
     */
    @JsonIgnore
    public Collection <Asesor> getAsesores() {
        return asesores;
    }

    /**
     * Gets the value of relation through role Personas
     */
    @JsonIgnore
    public Collection <Persona> getPersonas() {
        return personas;
    }

    /**
     * Gets the value of relation through role PersonasC
     */
    @JsonIgnore
    public Collection <PersonaC> getPersonasC() {
        return personasC;
    }

    /**
     * Gets the value of relation through role UsuarioS
     */
    @JsonIgnore
    public Collection <Usuario> getUsuarioS() {
        return usuarioS;
    }

    /**
     * Gets the value of relation through role Contratantes
     */
    @JsonIgnore
    public Collection <Contratante> getContratantes() {
        return contratantes;
    }

    /**
     * Gets the value of relation through role AnexosC
     */
    @JsonIgnore
    public Collection <AnexoC> getAnexosC() {
        return anexosC;
    }

    /**
     * Gets the value of relation through role Titulares
     */
    @JsonIgnore
    public Collection <Titular> getTitulares() {
        return titulares;
    }

    /**
     * Gets the value of relation through role InstitucionMatNeo
     */
    @JsonIgnore
    public Collection <InstitucionMatNeo> getInstitucionMatNeo() {
        return institucionMatNeo;
    }

    /**
     * Gets the value of relation through role SolicitudesNovedad
     */
    @JsonIgnore
    public Collection <SolicitudNovedad> getSolicitudesNovedad() {
        return solicitudesNovedad;
    }

    /**
     * Gets the value of relation through role FamiliasNovedad
     */
    @JsonIgnore
    public Collection <FamiliaNovedad> getFamiliasNovedad() {
        return familiasNovedad;
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
     * Gets the value of relation through role NovedadesCT
     */
    @JsonIgnore
    public Collection <NovedadCT> getNovedadesCT() {
        return novedadesCT;
    }

    /**
     * Default constructor
     */
    public TipoIdentificacion() {
        tipoIdentificacionCodigo = null;
    }

    /**
     * Constructor used to create instances of <code>TipoIdentificacion</code>.
     * @param oid Object Identifier of the instance of <code>TipoIdentificacion</code> to be created.
     * @throws SystemException
     */
    public TipoIdentificacion(TipoIdentificacionOid oid) {
        if (oid != null && !oid.isNull()) {
            tipoIdentificacionCodigo = oid.getTipoIdentificacionCodigo();
        }
    }

    @Override
    protected Method[] getMethods() {
    	return TipoIdentificacion.class.getMethods();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        TipoIdentificacion other = (TipoIdentificacion)obj;
        boolean result = true;
        result &= Utilities.isEqual(this.getTipoIdentificacionCodigo(), other.getTipoIdentificacionCodigo());
        result &= Utilities.isEqual(this.getTipoIdentificacionDescripcion(), other.getTipoIdentificacionDescripcion());
        result &= Utilities.isEqual(this.getTipoIdentificacionNombreCorto(), other.getTipoIdentificacionNombreCorto());
        result &= Utilities.isEqual(this.getTipoIdentificacionValidoContratante(), other.getTipoIdentificacionValidoContratante());
        result &= Utilities.isEqual(this.getTipoIdentificacionValidoTitular(), other.getTipoIdentificacionValidoTitular());
        result &= Utilities.isEqual(this.getTipoIdentificacionDiplomatico(), other.getTipoIdentificacionDiplomatico());
        result &= Utilities.isEqual(this.getTipoIdentificacionNIT(), other.getTipoIdentificacionNIT());
        result &= Utilities.isEqual(this.getTipoIdentificacionHijoDe(), other.getTipoIdentificacionHijoDe());
        result &= Utilities.isEqual(this.getTipoIdentificacionRequiereEPS(), other.getTipoIdentificacionRequiereEPS());
        result &= Utilities.isEqual(this.getTipoIdentificacionMenorSinIdentificar(), other.getTipoIdentificacionMenorSinIdentificar());
        result &= Utilities.isEqual(this.getTipoIdentificacionEsPasaporte(), other.getTipoIdentificacionEsPasaporte());
        result &= Utilities.isEqual(this.getTipoIdentificacionVisibleValidadorUsu(), other.getTipoIdentificacionVisibleValidadorUsu());
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
     * Returns the <code>TipoIdentificacionOid</code> object that identifies this instance of <code>TipoIdentificacion</code>.
     * @return <code>TipoIdentificacionOid</code> object that identifies this instance of <code>TipoIdentificacion</code>
     */
	@Override
    public TipoIdentificacionOid getOid() {
        return new TipoIdentificacionOid(getTipoIdentificacionCodigo());
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
        if (!activeFacets.contains(Constants.TIPOIDENTIFICACION)) {
            activeFacets.add(Constants.TIPOIDENTIFICACION);
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
            relatedInstance = buildTipoIdentificacionRelatedInstance(relatedInstanceJsonOid);
        }
        if (TipoIdentificacionConstants.ROLE_NAME_ASESORES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoIdentificacionRelatedInstance4Asesor(relatedInstanceJsonOid, remainingPath);
        }
        if (TipoIdentificacionConstants.ROLE_NAME_PERSONAS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoIdentificacionRelatedInstance4Persona(relatedInstanceJsonOid, remainingPath);
        }
        if (TipoIdentificacionConstants.ROLE_NAME_PERSONASC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoIdentificacionRelatedInstance4PersonaC(relatedInstanceJsonOid, remainingPath);
        }
        if (TipoIdentificacionConstants.ROLE_NAME_USUARIOS.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoIdentificacionRelatedInstance4Usuario(relatedInstanceJsonOid, remainingPath);
        }
        if (TipoIdentificacionConstants.ROLE_NAME_CONTRATANTES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoIdentificacionRelatedInstance4Contratante(relatedInstanceJsonOid, remainingPath);
        }
        if (TipoIdentificacionConstants.ROLE_NAME_ANEXOSC.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoIdentificacionRelatedInstance4AnexoC(relatedInstanceJsonOid, remainingPath);
        }
        if (TipoIdentificacionConstants.ROLE_NAME_TITULARES.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoIdentificacionRelatedInstance4Titular(relatedInstanceJsonOid, remainingPath);
        }
        if (TipoIdentificacionConstants.ROLE_NAME_INSTITUCIONMATNEO.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoIdentificacionRelatedInstance4InstitucionMatNeo(relatedInstanceJsonOid, remainingPath);
        }
        if (TipoIdentificacionConstants.ROLE_NAME_SOLICITUDESNOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoIdentificacionRelatedInstance4SolicitudNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (TipoIdentificacionConstants.ROLE_NAME_FAMILIASNOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoIdentificacionRelatedInstance4FamiliaNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (TipoIdentificacionConstants.ROLE_NAME_USUARIOSNOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem) || TipoIdentificacionConstants.ROLE_NAME_USUARIONOVEDAD.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoIdentificacionRelatedInstance4UsuarioNovedad(relatedInstanceJsonOid, remainingPath);
        }
        if (TipoIdentificacionConstants.ROLE_NAME_NOVEDADESCT.equalsIgnoreCase(relatedInstancePathFirstItem)) {
            relatedInstance = buildTipoIdentificacionRelatedInstance4NovedadCT(relatedInstanceJsonOid, remainingPath);
        }
        return relatedInstance;
    }
    
    private static AbstractAppEntity buildTipoIdentificacionRelatedInstance(String relatedInstanceJsonOid) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return new TipoIdentificacion(mapper.readValue(relatedInstanceJsonOid, TipoIdentificacionOid.class));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoIdentificacion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildTipoIdentificacionRelatedInstance4Asesor(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Asesor(mapper.readValue(relatedInstanceJsonOid, AsesorOid.class)): Asesor.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoIdentificacion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildTipoIdentificacionRelatedInstance4Persona(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Persona(mapper.readValue(relatedInstanceJsonOid, PersonaOid.class)): Persona.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoIdentificacion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildTipoIdentificacionRelatedInstance4PersonaC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new PersonaC(mapper.readValue(relatedInstanceJsonOid, PersonaCOid.class)): PersonaC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoIdentificacion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildTipoIdentificacionRelatedInstance4Usuario(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Usuario(mapper.readValue(relatedInstanceJsonOid, UsuarioOid.class)): Usuario.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoIdentificacion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildTipoIdentificacionRelatedInstance4Contratante(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Contratante(mapper.readValue(relatedInstanceJsonOid, ContratanteOid.class)): Contratante.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoIdentificacion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildTipoIdentificacionRelatedInstance4AnexoC(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new AnexoC(mapper.readValue(relatedInstanceJsonOid, AnexoCOid.class)): AnexoC.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoIdentificacion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildTipoIdentificacionRelatedInstance4Titular(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new Titular(mapper.readValue(relatedInstanceJsonOid, TitularOid.class)): Titular.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoIdentificacion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildTipoIdentificacionRelatedInstance4InstitucionMatNeo(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new InstitucionMatNeo(mapper.readValue(relatedInstanceJsonOid, InstitucionMatNeoOid.class)): InstitucionMatNeo.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoIdentificacion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildTipoIdentificacionRelatedInstance4SolicitudNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new SolicitudNovedad(mapper.readValue(relatedInstanceJsonOid, SolicitudNovedadOid.class)): SolicitudNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoIdentificacion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildTipoIdentificacionRelatedInstance4FamiliaNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new FamiliaNovedad(mapper.readValue(relatedInstanceJsonOid, FamiliaNovedadOid.class)): FamiliaNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoIdentificacion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildTipoIdentificacionRelatedInstance4UsuarioNovedad(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new UsuarioNovedad(mapper.readValue(relatedInstanceJsonOid, UsuarioNovedadOid.class)): UsuarioNovedad.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoIdentificacion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }

    private static AbstractAppEntity buildTipoIdentificacionRelatedInstance4NovedadCT(String relatedInstanceJsonOid, String remainingPath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return (remainingPath.isEmpty() ? new NovedadCT(mapper.readValue(relatedInstanceJsonOid, NovedadCTOid.class)): NovedadCT.buildRelatedInstance(relatedInstanceJsonOid, remainingPath));
        } catch (Exception e) {
            org.slf4j.LoggerFactory.getLogger(TipoIdentificacion.class).error(e.getMessage());
            throw new SystemException(e.getMessage());
        }
    }
}
