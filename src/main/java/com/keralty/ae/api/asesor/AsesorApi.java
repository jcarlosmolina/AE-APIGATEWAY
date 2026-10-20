package com.keralty.ae.api.asesor;

import com.keralty.ae.persistence.Asesor;
import com.keralty.ae.persistence.oid.AsesorOid;
import com.keralty.ae.service.AsesorService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.asesor.siu.ChangePasswordRequest;
import com.keralty.ae.viewmodel.asesor.siu.TCARGARDOMINIOPLANRequest;
import com.keralty.ae.viewmodel.asesor.siu.TDELETERequest;
import com.keralty.ae.viewmodel.asesor.siu.TMODIFICARASESORRequest;
import com.keralty.ae.viewmodel.asesor.siu.TMODVISIBILIDADRequest;
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

@Path("/api/AsesorApi")
@RequestScoped
public class AsesorApi {

    @RestClient
    AsesorService service;

    JsonWebToken jwt; 

    public AsesorApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{funcionarioId}")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public Asesor getInstance(Long funcionarioId) {
    	return service.getById(funcionarioId);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public List<Asesor> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public Asesor getByOid(AsesorOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public Asesor getByOIDWithHV(AsesorOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetAsesorDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public InstanceResponseViewModel getAsesorDynamic(QueryRequest request) {
        return service.getAsesorDynamic(request);
    }

    @POST
    @Path(value = "/GetWithDisplaySetDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PreloadResponseViewModel getAsesorWithDisplaySetDynamic(QueryRequest request) {
        return (PreloadResponseViewModel) service.getWithDisplaySetDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PopulationResponseViewModel getAsesorPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/TMODIFICARASESOR")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse asesorTMODIFICARASESOR(TMODIFICARASESORRequest request) {
        return service.tMODIFICARASESOR(request);
    }
    

    @POST
    @Path(value = "/TDELETE")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse asesorTDELETE(TDELETERequest request) {
        return service.tDELETE(request);
    }
    

    @POST
    @Path(value = "/TDELETECheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse asesorTDELETECheckPreconditions(TDELETERequest request) {

        return service.tDELETECheckPreconditions(request);
    }

    @POST
    @Path(value = "/TMODVISIBILIDAD")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse asesorTMODVISIBILIDAD(TMODVISIBILIDADRequest request) {
        return service.tMODVISIBILIDAD(request);
    }
    

    @POST
    @Path(value = "/TCARGARDOMINIOPLAN")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse asesorTCARGARDOMINIOPLAN(TCARGARDOMINIOPLANRequest request) {
        return service.tCARGARDOMINIOPLAN(request);
    }
    

    @POST
    @Path(value = "/changePassword")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public ServiceResponse asesorChangePassword(ChangePasswordRequest request) {
        return service.changePassword(request);
    }
    
}
