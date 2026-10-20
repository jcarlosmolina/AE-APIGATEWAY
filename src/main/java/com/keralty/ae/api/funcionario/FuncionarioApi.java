package com.keralty.ae.api.funcionario;

import com.keralty.ae.persistence.Funcionario;
import com.keralty.ae.persistence.oid.FuncionarioOid;
import com.keralty.ae.service.FuncionarioService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.funcionario.siu.CambRolAgenteRequest;
import com.keralty.ae.viewmodel.funcionario.siu.ChangePasswordRequest;
import com.keralty.ae.viewmodel.funcionario.siu.DelReporteFuncionarioRequest;
import com.keralty.ae.viewmodel.funcionario.siu.InsReporteFuncionarioRequest;
import com.keralty.ae.viewmodel.funcionario.siu.SetPasswordRequest;
import com.keralty.ae.viewmodel.funcionario.siu.TBORRARRequest;
import com.keralty.ae.viewmodel.funcionario.siu.TCAMBIARDISPONIBLERequest;
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

@Path("/api/FuncionarioApi")
@RequestScoped
public class FuncionarioApi {

    @RestClient
    FuncionarioService service;

    JsonWebToken jwt; 

    public FuncionarioApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{funcionarioId}")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public Funcionario getInstance(Long funcionarioId) {
    	return service.getById(funcionarioId);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public List<Funcionario> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public Funcionario getByOid(FuncionarioOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public Funcionario getByOIDWithHV(FuncionarioOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetFuncionarioDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public InstanceResponseViewModel getFuncionarioDynamic(QueryRequest request) {
        return service.getFuncionarioDynamic(request);
    }

    @POST
    @Path(value = "/GetWithDisplaySetDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PreloadResponseViewModel getFuncionarioWithDisplaySetDynamic(QueryRequest request) {
        return (PreloadResponseViewModel) service.getWithDisplaySetDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PopulationResponseViewModel getFuncionarioPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/setPassword")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse funcionarioSetPassword(SetPasswordRequest request) {
        return service.setPassword(request);
    }
    

    @POST
    @Path(value = "/CambRolAgente")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse funcionarioCambRolAgente(CambRolAgenteRequest request) {
        return service.cambRolAgente(request);
    }
    

    @POST
    @Path(value = "/InsReporteFuncionario")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse funcionarioInsReporteFuncionario(InsReporteFuncionarioRequest request) {
        return service.insReporteFuncionario(request);
    }
    

    @POST
    @Path(value = "/DelReporteFuncionario")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse funcionarioDelReporteFuncionario(DelReporteFuncionarioRequest request) {
        return service.delReporteFuncionario(request);
    }
    

    @POST
    @Path(value = "/TCAMBIARDISPONIBLE")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse funcionarioTCAMBIARDISPONIBLE(TCAMBIARDISPONIBLERequest request) {
        return service.tCAMBIARDISPONIBLE(request);
    }
    

    @POST
    @Path(value = "/TBORRAR")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse funcionarioTBORRAR(TBORRARRequest request) {
        return service.tBORRAR(request);
    }
    

    @POST
    @Path(value = "/TBORRARCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse funcionarioTBORRARCheckPreconditions(TBORRARRequest request) {

        return service.tBORRARCheckPreconditions(request);
    }

    @POST
    @Path(value = "/changePassword")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public ServiceResponse funcionarioChangePassword(ChangePasswordRequest request) {
        return service.changePassword(request);
    }
    
}
