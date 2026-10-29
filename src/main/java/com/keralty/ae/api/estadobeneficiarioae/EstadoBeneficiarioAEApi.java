package com.keralty.ae.api.estadobeneficiarioae;

import com.keralty.ae.persistence.EstadoBeneficiarioAE;
import com.keralty.ae.persistence.oid.EstadoBeneficiarioAEOid;
import com.keralty.ae.service.EstadoBeneficiarioAEService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.estadobeneficiarioae.siu.CrearRequest;
import com.keralty.ae.viewmodel.estadobeneficiarioae.siu.EliminarRequest;
import com.keralty.ae.viewmodel.estadobeneficiarioae.siu.TMODIFICARRequest;
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

@Path("/api/EstadoBeneficiarioAEApi")
@RequestScoped
public class EstadoBeneficiarioAEApi {

    @RestClient
    EstadoBeneficiarioAEService service;

    JsonWebToken jwt; 

    public EstadoBeneficiarioAEApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{estadoBeneficiarioAECodigo}")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public EstadoBeneficiarioAE getInstance(Long estadoBeneficiarioAECodigo) {
    	return service.getById(estadoBeneficiarioAECodigo);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public List<EstadoBeneficiarioAE> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public EstadoBeneficiarioAE getByOid(EstadoBeneficiarioAEOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public EstadoBeneficiarioAE getByOIDWithHV(EstadoBeneficiarioAEOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetEstadoBeneficiarioAEDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public InstanceResponseViewModel getEstadoBeneficiarioAEDynamic(QueryRequest request) {
        return service.getEstadoBeneficiarioAEDynamic(request);
    }

    @POST
    @Path(value = "/GetWithDisplaySetDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public PreloadResponseViewModel getEstadoBeneficiarioAEWithDisplaySetDynamic(QueryRequest request) {
        return (PreloadResponseViewModel) service.getWithDisplaySetDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public PopulationResponseViewModel getEstadoBeneficiarioAEPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/crear")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse estadoBeneficiarioAECrear(CrearRequest request) {
        return service.crear(request);
    }
    

    @POST
    @Path(value = "/eliminar")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse estadoBeneficiarioAEEliminar(EliminarRequest request) {
        return service.eliminar(request);
    }
    

    @POST
    @Path(value = "/TMODIFICAR")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse estadoBeneficiarioAETMODIFICAR(TMODIFICARRequest request) {
        return service.tMODIFICAR(request);
    }
    
}
