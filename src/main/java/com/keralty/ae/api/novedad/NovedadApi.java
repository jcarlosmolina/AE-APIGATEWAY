package com.keralty.ae.api.novedad;

import com.keralty.ae.persistence.Novedad;
import com.keralty.ae.persistence.oid.NovedadOid;
import com.keralty.ae.service.NovedadService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.InstanceResponseViewModel;
import com.keralty.ae.viewmodel.novedad.siu.DelNovedadRequest;
import com.keralty.ae.viewmodel.novedad.siu.ModificarRequest;
import com.keralty.ae.viewmodel.novedad.siu.TCREARRequest;
import com.keralty.ae.viewmodel.novedad.siu.TELIMINARRequest;
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

@Path("/api/NovedadApi")
@RequestScoped
public class NovedadApi {

    @RestClient
    NovedadService service;

    JsonWebToken jwt; 

    public NovedadApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{novedadidNovedad}")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","Gestor","MesaDeApoyo"})
    public Novedad getInstance(Long novedadidNovedad) {
    	return service.getById(novedadidNovedad);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","Gestor","MesaDeApoyo"})
    public List<Novedad> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","Gestor","MesaDeApoyo"})
    public Novedad getByOid(NovedadOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","Gestor","MesaDeApoyo"})
    public Novedad getByOIDWithHV(NovedadOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetNovedadDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","Gestor","MesaDeApoyo"})
    public InstanceResponseViewModel getNovedadDynamic(QueryRequest request) {
        return service.getNovedadDynamic(request);
    }

    @POST
    @Path(value = "/GetWithDisplaySetDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","Gestor","MesaDeApoyo"})
    public PreloadResponseViewModel getNovedadWithDisplaySetDynamic(QueryRequest request) {
        return (PreloadResponseViewModel) service.getWithDisplaySetDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","Gestor","MesaDeApoyo"})
    public PopulationResponseViewModel getNovedadPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/modificar")
    @RolesAllowed({"Admin","SuperAdmin","Asesor"})
    public ServiceResponse novedadModificar(ModificarRequest request) {
        return service.modificar(request);
    }
    

    @POST
    @Path(value = "/modificarCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor"})
    public ServiceResponse novedadModificarCheckPreconditions(ModificarRequest request) {

        return service.modificarCheckPreconditions(request);
    }

    @POST
    @Path(value = "/DelNovedad")
    @RolesAllowed({"Admin","SuperAdmin","Asesor"})
    public ServiceResponse novedadDelNovedad(DelNovedadRequest request) {
        return service.delNovedad(request);
    }
    

    @POST
    @Path(value = "/TELIMINAR")
    @RolesAllowed({"Admin","SuperAdmin","Asesor"})
    public ServiceResponse novedadTELIMINAR(TELIMINARRequest request) {
        return service.tELIMINAR(request);
    }
    

    @POST
    @Path(value = "/TCREAR")
    @RolesAllowed({"Admin","SuperAdmin","Asesor"})
    public ServiceResponse novedadTCREAR(TCREARRequest request) {
        return service.tCREAR(request);
    }
    

    @POST
    @Path(value = "/TCREARCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor"})
    public ServiceResponse novedadTCREARCheckPreconditions(TCREARRequest request) {

        return service.tCREARCheckPreconditions(request);
    }
}
