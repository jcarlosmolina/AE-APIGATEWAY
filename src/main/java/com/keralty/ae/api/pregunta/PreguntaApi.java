package com.keralty.ae.api.pregunta;

import com.keralty.ae.persistence.oid.PreguntaOid;
import com.keralty.ae.persistence.Pregunta;
import com.keralty.ae.service.PreguntaService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.InstanceResponseViewModel;
import com.keralty.ae.viewmodel.PopulationResponseViewModel;
import com.keralty.ae.viewmodel.pregunta.siu.DelValorPreguntaRequest;
import com.keralty.ae.viewmodel.pregunta.siu.InsValorPreguntaRequest;
import com.keralty.ae.viewmodel.pregunta.siu.TCREARRequest;
import com.keralty.ae.viewmodel.pregunta.siu.TELIMINARRequest;
import com.keralty.ae.viewmodel.pregunta.siu.TMODIFICARRequest;
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

@Path("/api/PreguntaApi")
@RequestScoped
public class PreguntaApi {

    @RestClient
    PreguntaService service;

    JsonWebToken jwt; 

    public PreguntaApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{preguntaNumero}")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public Pregunta getInstance(Long preguntaNumero) {
    	return service.getById(preguntaNumero);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public List<Pregunta> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public Pregunta getByOid(PreguntaOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public Pregunta getByOIDWithHV(PreguntaOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetPreguntaDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public InstanceResponseViewModel getPreguntaDynamic(QueryRequest request) {
        return service.getPreguntaDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public PopulationResponseViewModel getPreguntaPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/InsValorPregunta")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse preguntaInsValorPregunta(InsValorPreguntaRequest request) {
        return service.insValorPregunta(request);
    }
    

    @POST
    @Path(value = "/DelValorPregunta")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse preguntaDelValorPregunta(DelValorPreguntaRequest request) {
        return service.delValorPregunta(request);
    }
    

    @POST
    @Path(value = "/TCREAR")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse preguntaTCREAR(TCREARRequest request) {
        return service.tCREAR(request);
    }
    

    @POST
    @Path(value = "/TCREARCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse preguntaTCREARCheckPreconditions(TCREARRequest request) {

        return service.tCREARCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TMODIFICAR")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse preguntaTMODIFICAR(TMODIFICARRequest request) {
        return service.tMODIFICAR(request);
    }
    

    @POST
    @Path(value = "/TMODIFICARCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse preguntaTMODIFICARCheckPreconditions(TMODIFICARRequest request) {

        return service.tMODIFICARCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TELIMINAR")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse preguntaTELIMINAR(TELIMINARRequest request) {
        return service.tELIMINAR(request);
    }
    
}
