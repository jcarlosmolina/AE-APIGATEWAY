package com.keralty.ae.api.usuarionovedad;

import com.keralty.ae.persistence.oid.UsuarioNovedadOid;
import com.keralty.ae.persistence.UsuarioNovedad;
import com.keralty.ae.service.UsuarioNovedadService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.InstanceResponseViewModel;
import com.keralty.ae.viewmodel.PopulationResponseViewModel;
import com.keralty.ae.viewmodel.PreloadResponseViewModel;
import com.keralty.ae.viewmodel.PreloadViewModel;
import com.keralty.ae.viewmodel.QueryRequest;
import com.keralty.ae.viewmodel.ServiceResponse;
import com.keralty.ae.viewmodel.usuarionovedad.siu.CambiarASRequest;
import com.keralty.ae.viewmodel.usuarionovedad.siu.CambiarExcluidoRequest;
import com.keralty.ae.viewmodel.usuarionovedad.siu.CambiarPSRequest;
import com.keralty.ae.viewmodel.usuarionovedad.siu.CambiarRORequest;
import com.keralty.ae.viewmodel.usuarionovedad.siu.ModificarSUNumMesesRequest;
import com.keralty.ae.viewmodel.usuarionovedad.siu.TCAMBIARPARENTESCORequest;
import com.keralty.ae.viewmodel.usuarionovedad.siu.TCAMBIARTIPOIDENTRequest;
import com.keralty.ae.viewmodel.usuarionovedad.siu.TDELETERequest;
import com.keralty.ae.viewmodel.usuarionovedad.siu.TMODIFICARMANUALRequest;
import jakarta.annotation.security.RolesAllowed;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.POST;
import java.util.List;
import org.eclipse.microprofile.jwt.JsonWebToken;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/api/UsuarioNovedadApi")
@RequestScoped
public class UsuarioNovedadApi {

    @RestClient
    UsuarioNovedadService service;

    JsonWebToken jwt; 

    public UsuarioNovedadApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{usuarioNovedadidUsuarioNovedad}")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","Gestor","MesaDeApoyo"})
    public UsuarioNovedad getInstance(Long usuarioNovedadidUsuarioNovedad) {
    	return service.getById(usuarioNovedadidUsuarioNovedad);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","Gestor","MesaDeApoyo"})
    public List<UsuarioNovedad> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","Gestor","MesaDeApoyo"})
    public UsuarioNovedad getByOid(UsuarioNovedadOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","Gestor","MesaDeApoyo"})
    public UsuarioNovedad getByOIDWithHV(UsuarioNovedadOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetUsuarioNovedadDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","Gestor","MesaDeApoyo"})
    public InstanceResponseViewModel getUsuarioNovedadDynamic(QueryRequest request) {
        return service.getUsuarioNovedadDynamic(request);
    }

    @POST
    @Path(value = "/GetWithDisplaySetDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","Gestor","MesaDeApoyo"})
    public PreloadResponseViewModel getUsuarioNovedadWithDisplaySetDynamic(QueryRequest request) {
        return (PreloadResponseViewModel) service.getWithDisplaySetDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","Gestor","MesaDeApoyo"})
    public PopulationResponseViewModel getUsuarioNovedadPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/modificarSUNumMeses")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","MesaDeApoyo"})
    public ServiceResponse usuarioNovedadModificarSUNumMeses(ModificarSUNumMesesRequest request) {
        return service.modificarSUNumMeses(request);
    }
    

    @POST
    @Path(value = "/modificarSUNumMesesCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","MesaDeApoyo"})
    public ServiceResponse usuarioNovedadModificarSUNumMesesCheckPreconditions(ModificarSUNumMesesRequest request) {

        return service.modificarSUNumMesesCheckPreconditions(request);
    }

    @POST
    @Path(value = "/cambiarExcluido")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","MesaDeApoyo"})
    public ServiceResponse usuarioNovedadCambiarExcluido(CambiarExcluidoRequest request) {
        return service.cambiarExcluido(request);
    }
    

    @POST
    @Path(value = "/cambiarExcluidoCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","MesaDeApoyo"})
    public ServiceResponse usuarioNovedadCambiarExcluidoCheckPreconditions(CambiarExcluidoRequest request) {

        return service.cambiarExcluidoCheckPreconditions(request);
    }

    @POST
    @Path(value = "/cambiarRO")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","MesaDeApoyo"})
    public ServiceResponse usuarioNovedadCambiarRO(CambiarRORequest request) {
        return service.cambiarRO(request);
    }
    

    @POST
    @Path(value = "/cambiarROCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","MesaDeApoyo"})
    public ServiceResponse usuarioNovedadCambiarROCheckPreconditions(CambiarRORequest request) {

        return service.cambiarROCheckPreconditions(request);
    }

    @POST
    @Path(value = "/cambiarPS")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","MesaDeApoyo"})
    public ServiceResponse usuarioNovedadCambiarPS(CambiarPSRequest request) {
        return service.cambiarPS(request);
    }
    

    @POST
    @Path(value = "/cambiarPSCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","MesaDeApoyo"})
    public ServiceResponse usuarioNovedadCambiarPSCheckPreconditions(CambiarPSRequest request) {

        return service.cambiarPSCheckPreconditions(request);
    }

    @POST
    @Path(value = "/cambiarAS")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","MesaDeApoyo"})
    public ServiceResponse usuarioNovedadCambiarAS(CambiarASRequest request) {
        return service.cambiarAS(request);
    }
    

    @POST
    @Path(value = "/cambiarASCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","MesaDeApoyo"})
    public ServiceResponse usuarioNovedadCambiarASCheckPreconditions(CambiarASRequest request) {

        return service.cambiarASCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TDELETE")
    @RolesAllowed({"SuperAdmin","Asesor"})
    public ServiceResponse usuarioNovedadTDELETE(TDELETERequest request) {
        return service.tDELETE(request);
    }
    

    @POST
    @Path(value = "/TCAMBIARPARENTESCO")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","MesaDeApoyo"})
    public ServiceResponse usuarioNovedadTCAMBIARPARENTESCO(TCAMBIARPARENTESCORequest request) {
        return service.tCAMBIARPARENTESCO(request);
    }
    

    @POST
    @Path(value = "/TCAMBIARPARENTESCOCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","MesaDeApoyo"})
    public ServiceResponse usuarioNovedadTCAMBIARPARENTESCOCheckPreconditions(TCAMBIARPARENTESCORequest request) {

        return service.tCAMBIARPARENTESCOCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TCAMBIARTIPOIDENT")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","MesaDeApoyo"})
    public ServiceResponse usuarioNovedadTCAMBIARTIPOIDENT(TCAMBIARTIPOIDENTRequest request) {
        return service.tCAMBIARTIPOIDENT(request);
    }
    

    @POST
    @Path(value = "/TCAMBIARTIPOIDENTCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","MesaDeApoyo"})
    public ServiceResponse usuarioNovedadTCAMBIARTIPOIDENTCheckPreconditions(TCAMBIARTIPOIDENTRequest request) {

        return service.tCAMBIARTIPOIDENTCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TMODIFICARMANUAL")
    @RolesAllowed({"SuperAdmin","Asesor"})
    public ServiceResponse usuarioNovedadTMODIFICARMANUAL(TMODIFICARMANUALRequest request) {
        return service.tMODIFICARMANUAL(request);
    }
    
}
