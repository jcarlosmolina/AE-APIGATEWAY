package com.keralty.ae.api.persona;

import com.keralty.ae.persistence.oid.PersonaOid;
import com.keralty.ae.persistence.Persona;
import com.keralty.ae.service.PersonaService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.InstanceResponseViewModel;
import com.keralty.ae.viewmodel.persona.siu.CambTipoIdentificacionRequest;
import com.keralty.ae.viewmodel.persona.siu.DummyGetNumCodCORERequest;
import com.keralty.ae.viewmodel.persona.siu.DummyGetNumCodCOREResponse;
import com.keralty.ae.viewmodel.persona.siu.TADDUSUARIOASOLRequest;
import com.keralty.ae.viewmodel.persona.siu.TELIMINARRequest;
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

@Path("/api/PersonaApi")
@RequestScoped
public class PersonaApi {

    @RestClient
    PersonaService service;

    JsonWebToken jwt; 

    public PersonaApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{personaIdentificador}")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public Persona getInstance(Long personaIdentificador) {
    	return service.getById(personaIdentificador);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public List<Persona> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public Persona getByOid(PersonaOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public Persona getByOIDWithHV(PersonaOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetPersonaDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public InstanceResponseViewModel getPersonaDynamic(QueryRequest request) {
        return service.getPersonaDynamic(request);
    }

    @POST
    @Path(value = "/GetWithDisplaySetDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PreloadResponseViewModel getPersonaWithDisplaySetDynamic(QueryRequest request) {
        return (PreloadResponseViewModel) service.getWithDisplaySetDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PopulationResponseViewModel getPersonaPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/CambTipoIdentificacion")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse personaCambTipoIdentificacion(CambTipoIdentificacionRequest request) {
        return service.cambTipoIdentificacion(request);
    }
    

    @POST
    @Path(value = "/dummyGetNumCodCORE")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public DummyGetNumCodCOREResponse personaDummyGetNumCodCORE(DummyGetNumCodCORERequest request) {
        return service.dummyGetNumCodCORE(request);
    }
    

    @POST
    @Path(value = "/TADDUSUARIOASOL")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse personaTADDUSUARIOASOL(TADDUSUARIOASOLRequest request) {
        return service.tADDUSUARIOASOL(request);
    }
    

    @POST
    @Path(value = "/TADDUSUARIOASOLCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse personaTADDUSUARIOASOLCheckPreconditions(TADDUSUARIOASOLRequest request) {

        return service.tADDUSUARIOASOLCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TELIMINAR")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse personaTELIMINAR(TELIMINARRequest request) {
        return service.tELIMINAR(request);
    }
    

    @POST
    @Path(value = "/TELIMINARCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","MesaDeApoyo"})
    public ServiceResponse personaTELIMINARCheckPreconditions(TELIMINARRequest request) {

        return service.tELIMINARCheckPreconditions(request);
    }
}
