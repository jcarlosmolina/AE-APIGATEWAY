package com.keralty.ae.api.aesolicitudes;

import com.keralty.ae.persistence.Aesolicitudes;
import com.keralty.ae.persistence.oid.AesolicitudesOid;
import com.keralty.ae.service.AesolicitudesService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.aesolicitudes.siu.ModificarFechaElabRequest;
import com.keralty.ae.viewmodel.aesolicitudes.siu.TINCLUSIONSCRequest;
import com.keralty.ae.viewmodel.aesolicitudes.siu.TINCLUSIONSCResponse;
import com.keralty.ae.viewmodel.aesolicitudes.siu.TNUEVAAFILIACIONRequest;
import com.keralty.ae.viewmodel.aesolicitudes.siu.TNUEVAAFILIACIONResponse;
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

@Path("/api/Ae_solicitudesApi")
@RequestScoped
public class AesolicitudesApi {

    @RestClient
    AesolicitudesService service;

    JsonWebToken jwt; 

    public AesolicitudesApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{aesolicitudesidsolicitud}")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public Aesolicitudes getInstance(Long aesolicitudesidsolicitud) {
    	return service.getById(aesolicitudesidsolicitud);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public List<Aesolicitudes> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public Aesolicitudes getByOid(AesolicitudesOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public Aesolicitudes getByOIDWithHV(AesolicitudesOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetAe_solicitudesDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public InstanceResponseViewModel getAesolicitudesDynamic(QueryRequest request) {
        return service.getAesolicitudesDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PopulationResponseViewModel getAesolicitudesPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/modificarFechaElab")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public ServiceResponse aesolicitudesModificarFechaElab(ModificarFechaElabRequest request) {
        return service.modificarFechaElab(request);
    }
    

    @POST
    @Path(value = "/TNUEVAAFILIACION")
    @RolesAllowed({"Admin","SuperAdmin","Asesor"})
    public TNUEVAAFILIACIONResponse aesolicitudesTNUEVAAFILIACION(TNUEVAAFILIACIONRequest request) {
        return service.tNUEVAAFILIACION(request);
    }
    

    @POST
    @Path(value = "/TNUEVAAFILIACIONCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor"})
    public TNUEVAAFILIACIONResponse aesolicitudesTNUEVAAFILIACIONCheckPreconditions(TNUEVAAFILIACIONRequest request) {

        return service.tNUEVAAFILIACIONCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TINCLUSIONSC")
    @RolesAllowed({"Admin","SuperAdmin","Asesor"})
    public TINCLUSIONSCResponse aesolicitudesTINCLUSIONSC(TINCLUSIONSCRequest request) {
        return service.tINCLUSIONSC(request);
    }
    

    @POST
    @Path(value = "/TINCLUSIONSCCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor"})
    public TINCLUSIONSCResponse aesolicitudesTINCLUSIONSCCheckPreconditions(TINCLUSIONSCRequest request) {

        return service.tINCLUSIONSCCheckPreconditions(request);
    }
}
