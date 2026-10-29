package com.keralty.ae.api.logllamadasae;

import com.keralty.ae.persistence.LogLlamadasAE;
import com.keralty.ae.persistence.oid.LogLlamadasAEOid;
import com.keralty.ae.service.LogLlamadasAEService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.InstanceResponseViewModel;
import com.keralty.ae.viewmodel.logllamadasae.siu.CreateinstanceRequest;
import com.keralty.ae.viewmodel.logllamadasae.siu.DeleteinstanceRequest;
import com.keralty.ae.viewmodel.PopulationResponseViewModel;
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

@Path("/api/LogLlamadasAEApi")
@RequestScoped
public class LogLlamadasAEApi {

    @RestClient
    LogLlamadasAEService service;

    JsonWebToken jwt; 

    public LogLlamadasAEApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{logLlamadasAEID}")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo","UsuarioSistemaExterno"})
    public LogLlamadasAE getInstance(Long logLlamadasAEID) {
    	return service.getById(logLlamadasAEID);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo","UsuarioSistemaExterno"})
    public List<LogLlamadasAE> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo","UsuarioSistemaExterno"})
    public LogLlamadasAE getByOid(LogLlamadasAEOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo","UsuarioSistemaExterno"})
    public LogLlamadasAE getByOIDWithHV(LogLlamadasAEOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetLogLlamadasAEDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo","UsuarioSistemaExterno"})
    public InstanceResponseViewModel getLogLlamadasAEDynamic(QueryRequest request) {
        return service.getLogLlamadasAEDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo","UsuarioSistemaExterno"})
    public PopulationResponseViewModel getLogLlamadasAEPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/create_instance")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo","UsuarioSistemaExterno"})
    public ServiceResponse logLlamadasAECreateinstance(CreateinstanceRequest request) {
        return service.createinstance(request);
    }
    

    @POST
    @Path(value = "/delete_instance")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse logLlamadasAEDeleteinstance(DeleteinstanceRequest request) {
        return service.deleteinstance(request);
    }
    
}
