package com.keralty.ae.api.estadobeneficiario;

import com.keralty.ae.persistence.EstadoBeneficiario;
import com.keralty.ae.persistence.oid.EstadoBeneficiarioOid;
import com.keralty.ae.service.EstadoBeneficiarioService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.estadobeneficiario.siu.CrearRequest;
import com.keralty.ae.viewmodel.estadobeneficiario.siu.EliminarRequest;
import com.keralty.ae.viewmodel.estadobeneficiario.siu.ModificarRequest;
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

@Path("/api/EstadoBeneficiarioApi")
@RequestScoped
public class EstadoBeneficiarioApi {

    @RestClient
    EstadoBeneficiarioService service;

    JsonWebToken jwt; 

    public EstadoBeneficiarioApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{estadoBeneficiarioCodigo}")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public EstadoBeneficiario getInstance(Long estadoBeneficiarioCodigo) {
    	return service.getById(estadoBeneficiarioCodigo);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public List<EstadoBeneficiario> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public EstadoBeneficiario getByOid(EstadoBeneficiarioOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public EstadoBeneficiario getByOIDWithHV(EstadoBeneficiarioOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetEstadoBeneficiarioDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public InstanceResponseViewModel getEstadoBeneficiarioDynamic(QueryRequest request) {
        return service.getEstadoBeneficiarioDynamic(request);
    }

    @POST
    @Path(value = "/GetWithDisplaySetDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PreloadResponseViewModel getEstadoBeneficiarioWithDisplaySetDynamic(QueryRequest request) {
        return (PreloadResponseViewModel) service.getWithDisplaySetDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PopulationResponseViewModel getEstadoBeneficiarioPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/crear")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse estadoBeneficiarioCrear(CrearRequest request) {
        return service.crear(request);
    }
    

    @POST
    @Path(value = "/eliminar")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse estadoBeneficiarioEliminar(EliminarRequest request) {
        return service.eliminar(request);
    }
    

    @POST
    @Path(value = "/eliminarCheckPreconditions")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse estadoBeneficiarioEliminarCheckPreconditions(EliminarRequest request) {

        return service.eliminarCheckPreconditions(request);
    }

    @POST
    @Path(value = "/modificar")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse estadoBeneficiarioModificar(ModificarRequest request) {
        return service.modificar(request);
    }
    
}
