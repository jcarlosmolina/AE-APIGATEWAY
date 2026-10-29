package com.keralty.ae.api.grupoasignacionnovedad;

import com.keralty.ae.persistence.GrupoAsignacionNovedad;
import com.keralty.ae.persistence.oid.GrupoAsignacionNovedadOid;
import com.keralty.ae.service.GrupoAsignacionNovedadService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.grupoasignacionnovedad.siu.EliminarRequest;
import com.keralty.ae.viewmodel.grupoasignacionnovedad.siu.TASGGRUPORequest;
import com.keralty.ae.viewmodel.grupoasignacionnovedad.siu.TCREARRequest;
import com.keralty.ae.viewmodel.InstanceResponseViewModel;
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

@Path("/api/GrupoAsignacionNovedadApi")
@RequestScoped
public class GrupoAsignacionNovedadApi {

    @RestClient
    GrupoAsignacionNovedadService service;

    JsonWebToken jwt; 

    public GrupoAsignacionNovedadApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{grupoAsignacionNovedadId}")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor"})
    public GrupoAsignacionNovedad getInstance(Long grupoAsignacionNovedadId) {
    	return service.getById(grupoAsignacionNovedadId);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor"})
    public List<GrupoAsignacionNovedad> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor"})
    public GrupoAsignacionNovedad getByOid(GrupoAsignacionNovedadOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor"})
    public GrupoAsignacionNovedad getByOIDWithHV(GrupoAsignacionNovedadOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetGrupoAsignacionNovedadDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor"})
    public InstanceResponseViewModel getGrupoAsignacionNovedadDynamic(QueryRequest request) {
        return service.getGrupoAsignacionNovedadDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor"})
    public PopulationResponseViewModel getGrupoAsignacionNovedadPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/eliminar")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse grupoAsignacionNovedadEliminar(EliminarRequest request) {
        return service.eliminar(request);
    }
    

    @POST
    @Path(value = "/TCREAR")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse grupoAsignacionNovedadTCREAR(TCREARRequest request) {
        return service.tCREAR(request);
    }
    

    @POST
    @Path(value = "/TCREARCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse grupoAsignacionNovedadTCREARCheckPreconditions(TCREARRequest request) {

        return service.tCREARCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TASGGRUPO")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse grupoAsignacionNovedadTASGGRUPO(TASGGRUPORequest request) {
        return service.tASGGRUPO(request);
    }
    

    @POST
    @Path(value = "/TASGGRUPOCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse grupoAsignacionNovedadTASGGRUPOCheckPreconditions(TASGGRUPORequest request) {

        return service.tASGGRUPOCheckPreconditions(request);
    }
}
