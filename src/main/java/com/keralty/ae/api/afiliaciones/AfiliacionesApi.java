package com.keralty.ae.api.afiliaciones;

import com.keralty.ae.persistence.Afiliaciones;
import com.keralty.ae.persistence.oid.AfiliacionesOid;
import com.keralty.ae.service.AfiliacionesService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.afiliaciones.siu.ChangePasswordRequest;
import com.keralty.ae.viewmodel.afiliaciones.siu.DelPlanRequest;
import com.keralty.ae.viewmodel.afiliaciones.siu.InsPlanRequest;
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

@Path("/api/AfiliacionesApi")
@RequestScoped
public class AfiliacionesApi {

    @RestClient
    AfiliacionesService service;

    JsonWebToken jwt; 

    public AfiliacionesApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{funcionarioId}")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public Afiliaciones getInstance(Long funcionarioId) {
    	return service.getById(funcionarioId);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public List<Afiliaciones> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public Afiliaciones getByOid(AfiliacionesOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public Afiliaciones getByOIDWithHV(AfiliacionesOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetAfiliacionesDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public InstanceResponseViewModel getAfiliacionesDynamic(QueryRequest request) {
        return service.getAfiliacionesDynamic(request);
    }

    @POST
    @Path(value = "/GetWithDisplaySetDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PreloadResponseViewModel getAfiliacionesWithDisplaySetDynamic(QueryRequest request) {
        return (PreloadResponseViewModel) service.getWithDisplaySetDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PopulationResponseViewModel getAfiliacionesPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/InsPlan")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse afiliacionesInsPlan(InsPlanRequest request) {
        return service.insPlan(request);
    }
    

    @POST
    @Path(value = "/DelPlan")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse afiliacionesDelPlan(DelPlanRequest request) {
        return service.delPlan(request);
    }
    

    @POST
    @Path(value = "/changePassword")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public ServiceResponse afiliacionesChangePassword(ChangePasswordRequest request) {
        return service.changePassword(request);
    }
    
}
