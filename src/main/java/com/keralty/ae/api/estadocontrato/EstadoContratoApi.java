package com.keralty.ae.api.estadocontrato;

import com.keralty.ae.persistence.EstadoContrato;
import com.keralty.ae.persistence.oid.EstadoContratoOid;
import com.keralty.ae.service.EstadoContratoService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.estadocontrato.siu.CrearRequest;
import com.keralty.ae.viewmodel.estadocontrato.siu.DelEstadoContratoCRequest;
import com.keralty.ae.viewmodel.estadocontrato.siu.DelEstadoContratoRequest;
import com.keralty.ae.viewmodel.estadocontrato.siu.EliminarRequest;
import com.keralty.ae.viewmodel.estadocontrato.siu.InsEstadoContratoCRequest;
import com.keralty.ae.viewmodel.estadocontrato.siu.InsEstadoContratoRequest;
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

@Path("/api/EstadoContratoApi")
@RequestScoped
public class EstadoContratoApi {

    @RestClient
    EstadoContratoService service;

    JsonWebToken jwt; 

    public EstadoContratoApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{estadoContratoCodigo}")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public EstadoContrato getInstance(Long estadoContratoCodigo) {
    	return service.getById(estadoContratoCodigo);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public List<EstadoContrato> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public EstadoContrato getByOid(EstadoContratoOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public EstadoContrato getByOIDWithHV(EstadoContratoOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetEstadoContratoDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public InstanceResponseViewModel getEstadoContratoDynamic(QueryRequest request) {
        return service.getEstadoContratoDynamic(request);
    }

    @POST
    @Path(value = "/GetWithDisplaySetDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public PreloadResponseViewModel getEstadoContratoWithDisplaySetDynamic(QueryRequest request) {
        return (PreloadResponseViewModel) service.getWithDisplaySetDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public PopulationResponseViewModel getEstadoContratoPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/crear")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse estadoContratoCrear(CrearRequest request) {
        return service.crear(request);
    }
    

    @POST
    @Path(value = "/eliminar")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse estadoContratoEliminar(EliminarRequest request) {
        return service.eliminar(request);
    }
    

    @POST
    @Path(value = "/InsEstadoContratoC")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse estadoContratoInsEstadoContratoC(InsEstadoContratoCRequest request) {
        return service.insEstadoContratoC(request);
    }
    

    @POST
    @Path(value = "/DelEstadoContratoC")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse estadoContratoDelEstadoContratoC(DelEstadoContratoCRequest request) {
        return service.delEstadoContratoC(request);
    }
    

    @POST
    @Path(value = "/InsEstadoContrato")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse estadoContratoInsEstadoContrato(InsEstadoContratoRequest request) {
        return service.insEstadoContrato(request);
    }
    

    @POST
    @Path(value = "/DelEstadoContrato")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse estadoContratoDelEstadoContrato(DelEstadoContratoRequest request) {
        return service.delEstadoContrato(request);
    }
    
}
