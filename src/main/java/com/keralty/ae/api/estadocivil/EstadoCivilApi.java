package com.keralty.ae.api.estadocivil;

import com.keralty.ae.persistence.EstadoCivil;
import com.keralty.ae.persistence.oid.EstadoCivilOid;
import com.keralty.ae.service.EstadoCivilService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.estadocivil.siu.CrearRequest;
import com.keralty.ae.viewmodel.estadocivil.siu.DelEstadoCivilCRequest;
import com.keralty.ae.viewmodel.estadocivil.siu.EliminarRequest;
import com.keralty.ae.viewmodel.estadocivil.siu.InsEstadoCivilCRequest;
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

@Path("/api/EstadoCivilApi")
@RequestScoped
public class EstadoCivilApi {

    @RestClient
    EstadoCivilService service;

    JsonWebToken jwt; 

    public EstadoCivilApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{estadoCivilCodigo}")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public EstadoCivil getInstance(Long estadoCivilCodigo) {
    	return service.getById(estadoCivilCodigo);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public List<EstadoCivil> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public EstadoCivil getByOid(EstadoCivilOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public EstadoCivil getByOIDWithHV(EstadoCivilOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetEstadoCivilDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public InstanceResponseViewModel getEstadoCivilDynamic(QueryRequest request) {
        return service.getEstadoCivilDynamic(request);
    }

    @POST
    @Path(value = "/GetWithDisplaySetDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public PreloadResponseViewModel getEstadoCivilWithDisplaySetDynamic(QueryRequest request) {
        return (PreloadResponseViewModel) service.getWithDisplaySetDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public PopulationResponseViewModel getEstadoCivilPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/crear")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse estadoCivilCrear(CrearRequest request) {
        return service.crear(request);
    }
    

    @POST
    @Path(value = "/eliminar")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse estadoCivilEliminar(EliminarRequest request) {
        return service.eliminar(request);
    }
    

    @POST
    @Path(value = "/InsEstadoCivilC")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse estadoCivilInsEstadoCivilC(InsEstadoCivilCRequest request) {
        return service.insEstadoCivilC(request);
    }
    

    @POST
    @Path(value = "/DelEstadoCivilC")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse estadoCivilDelEstadoCivilC(DelEstadoCivilCRequest request) {
        return service.delEstadoCivilC(request);
    }
    
}
