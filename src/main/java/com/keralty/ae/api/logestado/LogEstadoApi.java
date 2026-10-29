package com.keralty.ae.api.logestado;

import com.keralty.ae.persistence.LogEstado;
import com.keralty.ae.persistence.oid.LogEstadoOid;
import com.keralty.ae.service.LogEstadoService;
import com.keralty.ae.service.MsEstatusProxy;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.InstanceResponseViewModel;
import com.keralty.ae.viewmodel.PopulationResponseViewModel;
import com.keralty.ae.viewmodel.QueryRequest;
import jakarta.annotation.security.RolesAllowed;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.POST;
import java.util.List;
import org.eclipse.microprofile.jwt.JsonWebToken;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/api/LogEstadoApi")
@RequestScoped
public class LogEstadoApi {

    @RestClient
    LogEstadoService service;

    @RestClient
    MsEstatusProxy serviceMsEstatus;

    JsonWebToken jwt; 

    public LogEstadoApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{logEstadoId}")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public LogEstado getInstance(Long logEstadoId) {
    	return service.getById(logEstadoId);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public List<LogEstado> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public LogEstado getByOid(LogEstadoOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public LogEstado getByOIDWithHV(LogEstadoOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetLogEstadoDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public InstanceResponseViewModel getLogEstadoDynamic(QueryRequest request) {
        return service.getLogEstadoDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public PopulationResponseViewModel getLogEstadoPopulationDynamic(QueryRequest request) {
    	if ("msestatus".equalsIgnoreCase(request.getPiuName()) ||
        		"piu_logestado".equalsIgnoreCase(request.getPiuName()) ) {
        		return serviceMsEstatus.getLogEstadoPopulationDynamic(request);
        	}
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

}
