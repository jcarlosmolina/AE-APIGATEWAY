package com.keralty.ae.api.logllamadasbh;

import com.keralty.ae.persistence.LogLlamadasBH;
import com.keralty.ae.persistence.oid.LogLlamadasBHOid;
import com.keralty.ae.service.LogLlamadasBHService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.InstanceResponseViewModel;
import com.keralty.ae.viewmodel.logllamadasbh.siu.CreateinstanceRequest;
import com.keralty.ae.viewmodel.logllamadasbh.siu.DeleteinstanceRequest;
import com.keralty.ae.viewmodel.PopulationResponseViewModel;
import com.keralty.ae.viewmodel.QueryRequest;
import com.keralty.ae.viewmodel.ServiceResponse;
import jakarta.annotation.security.RolesAllowed;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.POST;
import java.util.List;
import java.util.concurrent.CompletionStage;
import org.eclipse.microprofile.jwt.JsonWebToken;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/api/LogLlamadasBHApi")
@RequestScoped
public class LogLlamadasBHApi {

    @RestClient
    LogLlamadasBHService service;

    JsonWebToken jwt; 

    public LogLlamadasBHApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{logLlamadasBHID}")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo","UsuarioSistemaExterno"})
    public LogLlamadasBH getInstance(Long logLlamadasBHID) {
    	return service.getById(logLlamadasBHID);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo","UsuarioSistemaExterno"})
    public List<LogLlamadasBH> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo","UsuarioSistemaExterno"})
    public LogLlamadasBH getByOid(LogLlamadasBHOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo","UsuarioSistemaExterno"})
    public LogLlamadasBH getByOIDWithHV(LogLlamadasBHOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetLogLlamadasBHDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo","UsuarioSistemaExterno"})
    public InstanceResponseViewModel getLogLlamadasBHDynamic(QueryRequest request) {
        return service.getLogLlamadasBHDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo","UsuarioSistemaExterno"})
    public PopulationResponseViewModel getLogLlamadasBHPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/create_instance")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo","UsuarioSistemaExterno"})
    public ServiceResponse logLlamadasBHCreateinstance(CreateinstanceRequest request) {
        return service.createinstance(request);
    }
    

    @POST
    @Path(value = "/create_instanceAsync")
    public CompletionStage<ServiceResponse> logLlamadasBHCreateinstanceAsync(CreateinstanceRequest request) {
        return service.createinstanceAsync(request);
    }

    @POST
    @Path(value = "/delete_instance")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse logLlamadasBHDeleteinstance(DeleteinstanceRequest request) {
        return service.deleteinstance(request);
    }
    
}
