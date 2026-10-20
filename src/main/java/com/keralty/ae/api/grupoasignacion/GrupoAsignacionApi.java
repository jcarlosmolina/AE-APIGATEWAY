package com.keralty.ae.api.grupoasignacion;

import com.keralty.ae.persistence.GrupoAsignacion;
import com.keralty.ae.persistence.oid.GrupoAsignacionOid;
import com.keralty.ae.service.GrupoAsignacionService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.grupoasignacion.siu.TADDUSUARIORequest;
import com.keralty.ae.viewmodel.grupoasignacion.siu.TCREARRequest;
import com.keralty.ae.viewmodel.grupoasignacion.siu.TDELUSUARIORequest;
import com.keralty.ae.viewmodel.grupoasignacion.siu.TELIMINARRequest;
import com.keralty.ae.viewmodel.grupoasignacion.siu.TMODIFICARRequest;
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

@Path("/api/GrupoAsignacionApi")
@RequestScoped
public class GrupoAsignacionApi {

    @RestClient
    GrupoAsignacionService service;

    JsonWebToken jwt; 

    public GrupoAsignacionApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{grupoAsignacionId}")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor"})
    public GrupoAsignacion getInstance(Long grupoAsignacionId) {
    	return service.getById(grupoAsignacionId);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor"})
    public List<GrupoAsignacion> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor"})
    public GrupoAsignacion getByOid(GrupoAsignacionOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor"})
    public GrupoAsignacion getByOIDWithHV(GrupoAsignacionOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetGrupoAsignacionDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor"})
    public InstanceResponseViewModel getGrupoAsignacionDynamic(QueryRequest request) {
        return service.getGrupoAsignacionDynamic(request);
    }

    @POST
    @Path(value = "/GetWithDisplaySetDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor"})
    public PreloadResponseViewModel getGrupoAsignacionWithDisplaySetDynamic(QueryRequest request) {
        return (PreloadResponseViewModel) service.getWithDisplaySetDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor"})
    public PopulationResponseViewModel getGrupoAsignacionPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/TELIMINAR")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse grupoAsignacionTELIMINAR(TELIMINARRequest request) {
        return service.tELIMINAR(request);
    }
    

    @POST
    @Path(value = "/TELIMINARCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse grupoAsignacionTELIMINARCheckPreconditions(TELIMINARRequest request) {

        return service.tELIMINARCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TCREAR")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse grupoAsignacionTCREAR(TCREARRequest request) {
        return service.tCREAR(request);
    }
    

    @POST
    @Path(value = "/TMODIFICAR")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse grupoAsignacionTMODIFICAR(TMODIFICARRequest request) {
        return service.tMODIFICAR(request);
    }
    

    @POST
    @Path(value = "/TADDUSUARIO")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse grupoAsignacionTADDUSUARIO(TADDUSUARIORequest request) {
        return service.tADDUSUARIO(request);
    }
    

    @POST
    @Path(value = "/TADDUSUARIOCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse grupoAsignacionTADDUSUARIOCheckPreconditions(TADDUSUARIORequest request) {

        return service.tADDUSUARIOCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TDELUSUARIO")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse grupoAsignacionTDELUSUARIO(TDELUSUARIORequest request) {
        return service.tDELUSUARIO(request);
    }
    
}
