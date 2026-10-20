package com.keralty.ae.api.usuariosistemaexterno;

import com.keralty.ae.persistence.oid.UsuarioSistemaExternoOid;
import com.keralty.ae.persistence.UsuarioSistemaExterno;
import com.keralty.ae.service.UsuarioSistemaExternoService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.InstanceResponseViewModel;
import com.keralty.ae.viewmodel.PopulationResponseViewModel;
import com.keralty.ae.viewmodel.QueryRequest;
import com.keralty.ae.viewmodel.ServiceResponse;
import com.keralty.ae.viewmodel.usuariosistemaexterno.siu.ChangePasswordRequest;
import com.keralty.ae.viewmodel.usuariosistemaexterno.siu.CrearRequest;
import com.keralty.ae.viewmodel.usuariosistemaexterno.siu.EliminarRequest;
import com.keralty.ae.viewmodel.usuariosistemaexterno.siu.ModificarRequest;
import com.keralty.ae.viewmodel.usuariosistemaexterno.siu.SetPasswordRequest;
import jakarta.annotation.security.RolesAllowed;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.POST;
import java.util.List;
import org.eclipse.microprofile.jwt.JsonWebToken;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/api/UsuarioSistemaExternoApi")
@RequestScoped
public class UsuarioSistemaExternoApi {

    @RestClient
    UsuarioSistemaExternoService service;

    JsonWebToken jwt; 

    public UsuarioSistemaExternoApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{usuarioSistemaExternoLogin}")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","UsuarioSistemaExterno"})
    public UsuarioSistemaExterno getInstance(String usuarioSistemaExternoLogin) {
    	return service.getById(usuarioSistemaExternoLogin);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","UsuarioSistemaExterno"})
    public List<UsuarioSistemaExterno> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","UsuarioSistemaExterno"})
    public UsuarioSistemaExterno getByOid(UsuarioSistemaExternoOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","UsuarioSistemaExterno"})
    public UsuarioSistemaExterno getByOIDWithHV(UsuarioSistemaExternoOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetUsuarioSistemaExternoDynamic")
    @RolesAllowed({"Admin","SuperAdmin","UsuarioSistemaExterno"})
    public InstanceResponseViewModel getUsuarioSistemaExternoDynamic(QueryRequest request) {
        return service.getUsuarioSistemaExternoDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Admin","SuperAdmin","UsuarioSistemaExterno"})
    public PopulationResponseViewModel getUsuarioSistemaExternoPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/crear")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse usuarioSistemaExternoCrear(CrearRequest request) {
        return service.crear(request);
    }
    

    @POST
    @Path(value = "/eliminar")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse usuarioSistemaExternoEliminar(EliminarRequest request) {
        return service.eliminar(request);
    }
    

    @POST
    @Path(value = "/modificar")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse usuarioSistemaExternoModificar(ModificarRequest request) {
        return service.modificar(request);
    }
    

    @POST
    @Path(value = "/setPassword")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse usuarioSistemaExternoSetPassword(SetPasswordRequest request) {
        return service.setPassword(request);
    }
    

    @POST
    @Path(value = "/changePassword")
    @RolesAllowed({"UsuarioSistemaExterno"})
    public ServiceResponse usuarioSistemaExternoChangePassword(ChangePasswordRequest request) {
        return service.changePassword(request);
    }
    
}
