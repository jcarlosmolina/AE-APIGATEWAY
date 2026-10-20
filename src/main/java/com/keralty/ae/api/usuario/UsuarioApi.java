package com.keralty.ae.api.usuario;

import com.keralty.ae.persistence.oid.UsuarioOid;
import com.keralty.ae.persistence.Usuario;
import com.keralty.ae.service.UsuarioService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.InstanceResponseViewModel;
import com.keralty.ae.viewmodel.PopulationResponseViewModel;
import com.keralty.ae.viewmodel.PreloadResponseViewModel;
import com.keralty.ae.viewmodel.PreloadViewModel;
import com.keralty.ae.viewmodel.QueryRequest;
import com.keralty.ae.viewmodel.ServiceResponse;
import com.keralty.ae.viewmodel.usuario.siu.ShowCuesMedicoRequest;
import com.keralty.ae.viewmodel.usuario.siu.ShowCuesMedicoResponse;
import com.keralty.ae.viewmodel.usuario.siu.TCREAROMODANEXOMATRequest;
import com.keralty.ae.viewmodel.usuario.siu.TCREAROMODANEXONEORequest;
import com.keralty.ae.viewmodel.usuario.siu.TELIMINARRequest;
import com.keralty.ae.viewmodel.usuario.siu.TMODIFICARATTRRequest;
import com.keralty.ae.viewmodel.usuario.siu.TMODUSUARIORequest;
import jakarta.annotation.security.RolesAllowed;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.POST;
import java.util.List;
import org.eclipse.microprofile.jwt.JsonWebToken;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/api/UsuarioApi")
@RequestScoped
public class UsuarioApi {

    @RestClient
    UsuarioService service;

    JsonWebToken jwt; 

    public UsuarioApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{aesolicitudesidsolicitud}/{usuarioIdentificador}")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public Usuario getInstance(Long aesolicitudesidsolicitud, Long usuarioIdentificador) {
    	return service.getById(aesolicitudesidsolicitud, usuarioIdentificador);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public List<Usuario> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public Usuario getByOid(UsuarioOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public Usuario getByOIDWithHV(UsuarioOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetUsuarioDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public InstanceResponseViewModel getUsuarioDynamic(QueryRequest request) {
        return service.getUsuarioDynamic(request);
    }

    @POST
    @Path(value = "/GetWithDisplaySetDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PreloadResponseViewModel getUsuarioWithDisplaySetDynamic(QueryRequest request) {
        return (PreloadResponseViewModel) service.getWithDisplaySetDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PopulationResponseViewModel getUsuarioPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/showCuesMedico")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","MesaDeApoyo"})
    public ShowCuesMedicoResponse usuarioShowCuesMedico(ShowCuesMedicoRequest request) {
        return service.showCuesMedico(request);
    }
    

    @POST
    @Path(value = "/showCuesMedicoCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","MesaDeApoyo"})
    public ShowCuesMedicoResponse usuarioShowCuesMedicoCheckPreconditions(ShowCuesMedicoRequest request) {

        return service.showCuesMedicoCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TMODIFICARATTR")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse usuarioTMODIFICARATTR(TMODIFICARATTRRequest request) {
        return service.tMODIFICARATTR(request);
    }
    

    @POST
    @Path(value = "/TMODIFICARATTRCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse usuarioTMODIFICARATTRCheckPreconditions(TMODIFICARATTRRequest request) {

        return service.tMODIFICARATTRCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TMODUSUARIO")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse usuarioTMODUSUARIO(TMODUSUARIORequest request) {
        return service.tMODUSUARIO(request);
    }
    

    @POST
    @Path(value = "/TMODUSUARIOCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse usuarioTMODUSUARIOCheckPreconditions(TMODUSUARIORequest request) {

        return service.tMODUSUARIOCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TELIMINAR")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse usuarioTELIMINAR(TELIMINARRequest request) {
        return service.tELIMINAR(request);
    }
    

    @POST
    @Path(value = "/TCREAROMODANEXOMAT")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse usuarioTCREAROMODANEXOMAT(TCREAROMODANEXOMATRequest request) {
        return service.tCREAROMODANEXOMAT(request);
    }
    

    @POST
    @Path(value = "/TCREAROMODANEXOMATCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse usuarioTCREAROMODANEXOMATCheckPreconditions(TCREAROMODANEXOMATRequest request) {

        return service.tCREAROMODANEXOMATCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TCREAROMODANEXONEO")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse usuarioTCREAROMODANEXONEO(TCREAROMODANEXONEORequest request) {
        return service.tCREAROMODANEXONEO(request);
    }
    

    @POST
    @Path(value = "/TCREAROMODANEXONEOCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse usuarioTCREAROMODANEXONEOCheckPreconditions(TCREAROMODANEXONEORequest request) {

        return service.tCREAROMODANEXONEOCheckPreconditions(request);
    }
}
