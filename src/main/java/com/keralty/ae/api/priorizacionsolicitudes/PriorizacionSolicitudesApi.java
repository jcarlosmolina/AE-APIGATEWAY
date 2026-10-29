package com.keralty.ae.api.priorizacionsolicitudes;

import com.keralty.ae.persistence.oid.PriorizacionSolicitudesOid;
import com.keralty.ae.persistence.PriorizacionSolicitudes;
import com.keralty.ae.service.PriorizacionSolicitudesService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.InstanceResponseViewModel;
import com.keralty.ae.viewmodel.PopulationResponseViewModel;
import com.keralty.ae.viewmodel.priorizacionsolicitudes.siu.TCREARRequest;
import com.keralty.ae.viewmodel.priorizacionsolicitudes.siu.TELIMINARRequest;
import com.keralty.ae.viewmodel.priorizacionsolicitudes.siu.TMODIFICARRequest;
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

@Path("/api/PriorizacionSolicitudesApi")
@RequestScoped
public class PriorizacionSolicitudesApi {

    @RestClient
    PriorizacionSolicitudesService service;

    JsonWebToken jwt; 

    public PriorizacionSolicitudesApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{priorizacionSolicitudesEstadoSolicitud}/{priorizacionSolicitudesEstadoDoc}")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo","UsuarioSistemaExterno"})
    public PriorizacionSolicitudes getInstance(Long priorizacionSolicitudesEstadoSolicitud, Long priorizacionSolicitudesEstadoDoc) {
    	return service.getById(priorizacionSolicitudesEstadoSolicitud, priorizacionSolicitudesEstadoDoc);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo","UsuarioSistemaExterno"})
    public List<PriorizacionSolicitudes> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo","UsuarioSistemaExterno"})
    public PriorizacionSolicitudes getByOid(PriorizacionSolicitudesOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo","UsuarioSistemaExterno"})
    public PriorizacionSolicitudes getByOIDWithHV(PriorizacionSolicitudesOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetPriorizacionSolicitudesDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo","UsuarioSistemaExterno"})
    public InstanceResponseViewModel getPriorizacionSolicitudesDynamic(QueryRequest request) {
        return service.getPriorizacionSolicitudesDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo","UsuarioSistemaExterno"})
    public PopulationResponseViewModel getPriorizacionSolicitudesPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/TCREAR")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse priorizacionSolicitudesTCREAR(TCREARRequest request) {
        return service.tCREAR(request);
    }
    

    @POST
    @Path(value = "/TELIMINAR")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse priorizacionSolicitudesTELIMINAR(TELIMINARRequest request) {
        return service.tELIMINAR(request);
    }
    

    @POST
    @Path(value = "/TMODIFICAR")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse priorizacionSolicitudesTMODIFICAR(TMODIFICARRequest request) {
        return service.tMODIFICAR(request);
    }
    
}
