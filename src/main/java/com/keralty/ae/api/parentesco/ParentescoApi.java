package com.keralty.ae.api.parentesco;

import com.keralty.ae.persistence.oid.ParentescoOid;
import com.keralty.ae.persistence.Parentesco;
import com.keralty.ae.service.ParentescoService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.InstanceResponseViewModel;
import com.keralty.ae.viewmodel.parentesco.siu.CrearRequest;
import com.keralty.ae.viewmodel.parentesco.siu.DelParentescoNuevoUsuNovedadRequest;
import com.keralty.ae.viewmodel.parentesco.siu.DelParentescoUsuNovedadRequest;
import com.keralty.ae.viewmodel.parentesco.siu.EliminarRequest;
import com.keralty.ae.viewmodel.parentesco.siu.InsParentescoNuevoUsuNovedadRequest;
import com.keralty.ae.viewmodel.parentesco.siu.InsParentescoUsuNovedadRequest;
import com.keralty.ae.viewmodel.parentesco.siu.ModificarRequest;
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

@Path("/api/ParentescoApi")
@RequestScoped
public class ParentescoApi {

    @RestClient
    ParentescoService service;

    JsonWebToken jwt; 

    public ParentescoApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{parentescoCodigo}")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public Parentesco getInstance(Long parentescoCodigo) {
    	return service.getById(parentescoCodigo);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public List<Parentesco> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public Parentesco getByOid(ParentescoOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public Parentesco getByOIDWithHV(ParentescoOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetParentescoDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public InstanceResponseViewModel getParentescoDynamic(QueryRequest request) {
        return service.getParentescoDynamic(request);
    }

    @POST
    @Path(value = "/GetWithDisplaySetDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PreloadResponseViewModel getParentescoWithDisplaySetDynamic(QueryRequest request) {
        return (PreloadResponseViewModel) service.getWithDisplaySetDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PopulationResponseViewModel getParentescoPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/crear")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse parentescoCrear(CrearRequest request) {
        return service.crear(request);
    }
    

    @POST
    @Path(value = "/eliminar")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse parentescoEliminar(EliminarRequest request) {
        return service.eliminar(request);
    }
    

    @POST
    @Path(value = "/eliminarCheckPreconditions")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse parentescoEliminarCheckPreconditions(EliminarRequest request) {

        return service.eliminarCheckPreconditions(request);
    }

    @POST
    @Path(value = "/modificar")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse parentescoModificar(ModificarRequest request) {
        return service.modificar(request);
    }
    

    @POST
    @Path(value = "/InsParentescoUsuNovedad")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse parentescoInsParentescoUsuNovedad(InsParentescoUsuNovedadRequest request) {
        return service.insParentescoUsuNovedad(request);
    }
    

    @POST
    @Path(value = "/DelParentescoUsuNovedad")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse parentescoDelParentescoUsuNovedad(DelParentescoUsuNovedadRequest request) {
        return service.delParentescoUsuNovedad(request);
    }
    

    @POST
    @Path(value = "/InsParentescoNuevoUsuNovedad")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse parentescoInsParentescoNuevoUsuNovedad(InsParentescoNuevoUsuNovedadRequest request) {
        return service.insParentescoNuevoUsuNovedad(request);
    }
    

    @POST
    @Path(value = "/DelParentescoNuevoUsuNovedad")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse parentescoDelParentescoNuevoUsuNovedad(DelParentescoNuevoUsuNovedadRequest request) {
        return service.delParentescoNuevoUsuNovedad(request);
    }
    
}
