package com.keralty.ae.api.grupoasociado;

import com.keralty.ae.persistence.GrupoAsociado;
import com.keralty.ae.persistence.oid.GrupoAsociadoOid;
import com.keralty.ae.service.GrupoAsociadoService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.grupoasociado.siu.CrearRequest;
import com.keralty.ae.viewmodel.grupoasociado.siu.DelGrupoAsociadoRequest;
import com.keralty.ae.viewmodel.grupoasociado.siu.EliminarRequest;
import com.keralty.ae.viewmodel.grupoasociado.siu.InsGrupoAsociadoRequest;
import com.keralty.ae.viewmodel.grupoasociado.siu.ModificarRequest;
import com.keralty.ae.viewmodel.InstanceResponseViewModel;
import com.keralty.ae.viewmodel.PopulationResponseViewModel;
import com.keralty.ae.viewmodel.PreloadResponseViewModel;
import com.keralty.ae.viewmodel.PreloadViewModel;
import com.keralty.ae.viewmodel.QueryRequest;
import com.keralty.ae.viewmodel.ServiceResponse;
import jakarta.annotation.security.RolesAllowed;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.POST;
import java.util.List;
import org.eclipse.microprofile.jwt.JsonWebToken;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/api/GrupoAsociadoApi")
@RequestScoped
public class GrupoAsociadoApi {

    @RestClient
    GrupoAsociadoService service;

    JsonWebToken jwt; 

    public GrupoAsociadoApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{grupoAsociadoCodigo}")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public GrupoAsociado getInstance(Long grupoAsociadoCodigo) {
    	return service.getById(grupoAsociadoCodigo);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public List<GrupoAsociado> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public GrupoAsociado getByOid(GrupoAsociadoOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public GrupoAsociado getByOIDWithHV(GrupoAsociadoOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetGrupoAsociadoDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public InstanceResponseViewModel getGrupoAsociadoDynamic(QueryRequest request) {
        return service.getGrupoAsociadoDynamic(request);
    }

    @POST
    @Path(value = "/GetWithDisplaySetDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PreloadResponseViewModel getGrupoAsociadoWithDisplaySetDynamic(QueryRequest request) {
        return (PreloadResponseViewModel) service.getWithDisplaySetDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PopulationResponseViewModel getGrupoAsociadoPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/crear")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse grupoAsociadoCrear(CrearRequest request) {
        return service.crear(request);
    }
    

    @POST
    @Path(value = "/eliminar")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse grupoAsociadoEliminar(EliminarRequest request) {
        return service.eliminar(request);
    }
    

    @POST
    @Path(value = "/modificar")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse grupoAsociadoModificar(ModificarRequest request) {
        return service.modificar(request);
    }
    

    @POST
    @Path(value = "/InsGrupoAsociado")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse grupoAsociadoInsGrupoAsociado(InsGrupoAsociadoRequest request) {
        return service.insGrupoAsociado(request);
    }
    

    @POST
    @Path(value = "/DelGrupoAsociado")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse grupoAsociadoDelGrupoAsociado(DelGrupoAsociadoRequest request) {
        return service.delGrupoAsociado(request);
    }
    
}
