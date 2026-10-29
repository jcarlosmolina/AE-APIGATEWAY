package com.keralty.ae.api.plantillaemail;

import com.keralty.ae.persistence.oid.PlantillaEmailOid;
import com.keralty.ae.persistence.PlantillaEmail;
import com.keralty.ae.service.PlantillaEmailService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.InstanceResponseViewModel;
import com.keralty.ae.viewmodel.plantillaemail.siu.DummyModificarRequest;
import com.keralty.ae.viewmodel.plantillaemail.siu.EliminarRequest;
import com.keralty.ae.viewmodel.plantillaemail.siu.ModificarRequest;
import com.keralty.ae.viewmodel.plantillaemail.siu.ModificarTextoMensajeRequest;
import com.keralty.ae.viewmodel.plantillaemail.siu.TNEWRequest;
import com.keralty.ae.viewmodel.plantillaemail.siu.TNEWResponse;
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

@Path("/api/PlantillaEmailApi")
@RequestScoped
public class PlantillaEmailApi {

    @RestClient
    PlantillaEmailService service;

    JsonWebToken jwt; 

    public PlantillaEmailApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{plantillaEmailIdPlantilla}")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PlantillaEmail getInstance(Long plantillaEmailIdPlantilla) {
    	return service.getById(plantillaEmailIdPlantilla);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public List<PlantillaEmail> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PlantillaEmail getByOid(PlantillaEmailOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PlantillaEmail getByOIDWithHV(PlantillaEmailOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetPlantillaEmailDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public InstanceResponseViewModel getPlantillaEmailDynamic(QueryRequest request) {
        return service.getPlantillaEmailDynamic(request);
    }

    @POST
    @Path(value = "/GetWithDisplaySetDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PreloadResponseViewModel getPlantillaEmailWithDisplaySetDynamic(QueryRequest request) {
        return (PreloadResponseViewModel) service.getWithDisplaySetDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PopulationResponseViewModel getPlantillaEmailPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/eliminar")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse plantillaEmailEliminar(EliminarRequest request) {
        return service.eliminar(request);
    }
    

    @POST
    @Path(value = "/eliminarCheckPreconditions")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse plantillaEmailEliminarCheckPreconditions(EliminarRequest request) {

        return service.eliminarCheckPreconditions(request);
    }

    @POST
    @Path(value = "/modificar")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse plantillaEmailModificar(ModificarRequest request) {
        return service.modificar(request);
    }
    

    @POST
    @Path(value = "/modificarTextoMensaje")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse plantillaEmailModificarTextoMensaje(ModificarTextoMensajeRequest request) {
        return service.modificarTextoMensaje(request);
    }
    

    @POST
    @Path(value = "/dummyModificar")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse plantillaEmailDummyModificar(DummyModificarRequest request) {
        return service.dummyModificar(request);
    }
    

    @POST
    @Path(value = "/TNEW")
    @RolesAllowed({"SuperAdmin"})
    public TNEWResponse plantillaEmailTNEW(TNEWRequest request) {
        return service.tNEW(request);
    }
    
}
