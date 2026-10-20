package com.keralty.ae.api.departamento;

import com.keralty.ae.persistence.Departamento;
import com.keralty.ae.persistence.oid.DepartamentoOid;
import com.keralty.ae.service.DepartamentoService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.departamento.siu.CrearRequest;
import com.keralty.ae.viewmodel.departamento.siu.DelDepartamentoCNacRequest;
import com.keralty.ae.viewmodel.departamento.siu.DelDepartamentoCRequest;
import com.keralty.ae.viewmodel.departamento.siu.DelDepartamentoDirSucursalCRequest;
import com.keralty.ae.viewmodel.departamento.siu.EliminarRequest;
import com.keralty.ae.viewmodel.departamento.siu.InsDepartamentoCNacRequest;
import com.keralty.ae.viewmodel.departamento.siu.InsDepartamentoCRequest;
import com.keralty.ae.viewmodel.departamento.siu.InsDepartamentoDirSucursalCRequest;
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

@Path("/api/DepartamentoApi")
@RequestScoped
public class DepartamentoApi {

    @RestClient
    DepartamentoService service;

    JsonWebToken jwt; 

    public DepartamentoApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{departamentoCodigo}")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public Departamento getInstance(Long departamentoCodigo) {
    	return service.getById(departamentoCodigo);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public List<Departamento> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public Departamento getByOid(DepartamentoOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public Departamento getByOIDWithHV(DepartamentoOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetDepartamentoDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public InstanceResponseViewModel getDepartamentoDynamic(QueryRequest request) {
        return service.getDepartamentoDynamic(request);
    }

    @POST
    @Path(value = "/GetWithDisplaySetDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PreloadResponseViewModel getDepartamentoWithDisplaySetDynamic(QueryRequest request) {
        return (PreloadResponseViewModel) service.getWithDisplaySetDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PopulationResponseViewModel getDepartamentoPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/crear")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse departamentoCrear(CrearRequest request) {
        return service.crear(request);
    }
    

    @POST
    @Path(value = "/eliminar")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse departamentoEliminar(EliminarRequest request) {
        return service.eliminar(request);
    }
    

    @POST
    @Path(value = "/eliminarCheckPreconditions")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse departamentoEliminarCheckPreconditions(EliminarRequest request) {

        return service.eliminarCheckPreconditions(request);
    }

    @POST
    @Path(value = "/InsDepartamentoC")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse departamentoInsDepartamentoC(InsDepartamentoCRequest request) {
        return service.insDepartamentoC(request);
    }
    

    @POST
    @Path(value = "/DelDepartamentoC")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse departamentoDelDepartamentoC(DelDepartamentoCRequest request) {
        return service.delDepartamentoC(request);
    }
    

    @POST
    @Path(value = "/InsDepartamentoCNac")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse departamentoInsDepartamentoCNac(InsDepartamentoCNacRequest request) {
        return service.insDepartamentoCNac(request);
    }
    

    @POST
    @Path(value = "/DelDepartamentoCNac")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse departamentoDelDepartamentoCNac(DelDepartamentoCNacRequest request) {
        return service.delDepartamentoCNac(request);
    }
    

    @POST
    @Path(value = "/InsDepartamentoDirSucursalC")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse departamentoInsDepartamentoDirSucursalC(InsDepartamentoDirSucursalCRequest request) {
        return service.insDepartamentoDirSucursalC(request);
    }
    

    @POST
    @Path(value = "/DelDepartamentoDirSucursalC")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse departamentoDelDepartamentoDirSucursalC(DelDepartamentoDirSucursalCRequest request) {
        return service.delDepartamentoDirSucursalC(request);
    }
    
}
