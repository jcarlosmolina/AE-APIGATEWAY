package com.keralty.ae.api.cuestionariomed;

import com.keralty.ae.persistence.CuestionarioMed;
import com.keralty.ae.persistence.oid.CuestionarioMedOid;
import com.keralty.ae.service.CuestionarioMedService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.cuestionariomed.siu.CrearRequest;
import com.keralty.ae.viewmodel.cuestionariomed.siu.EliminarRequest;
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

@Path("/api/CuestionarioMedApi")
@RequestScoped
public class CuestionarioMedApi {

    @RestClient
    CuestionarioMedService service;

    JsonWebToken jwt; 

    public CuestionarioMedApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{cuestionarioMedNumero}")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public CuestionarioMed getInstance(Long cuestionarioMedNumero) {
    	return service.getById(cuestionarioMedNumero);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public List<CuestionarioMed> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public CuestionarioMed getByOid(CuestionarioMedOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public CuestionarioMed getByOIDWithHV(CuestionarioMedOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetCuestionarioMedDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public InstanceResponseViewModel getCuestionarioMedDynamic(QueryRequest request) {
        return service.getCuestionarioMedDynamic(request);
    }

    @POST
    @Path(value = "/GetWithDisplaySetDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PreloadResponseViewModel getCuestionarioMedWithDisplaySetDynamic(QueryRequest request) {
        return (PreloadResponseViewModel) service.getWithDisplaySetDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PopulationResponseViewModel getCuestionarioMedPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/crear")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse cuestionarioMedCrear(CrearRequest request) {
        return service.crear(request);
    }
    

    @POST
    @Path(value = "/eliminar")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse cuestionarioMedEliminar(EliminarRequest request) {
        return service.eliminar(request);
    }
    
}
