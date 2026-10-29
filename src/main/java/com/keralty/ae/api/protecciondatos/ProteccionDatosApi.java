package com.keralty.ae.api.protecciondatos;

import com.keralty.ae.persistence.oid.ProteccionDatosOid;
import com.keralty.ae.persistence.ProteccionDatos;
import com.keralty.ae.service.ProteccionDatosService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.InstanceResponseViewModel;
import com.keralty.ae.viewmodel.PopulationResponseViewModel;
import com.keralty.ae.viewmodel.protecciondatos.siu.TCREARPROTECCIONDATOSINCRequest;
import com.keralty.ae.viewmodel.protecciondatos.siu.TCREARPROTECCIONDATOSINCResponse;
import com.keralty.ae.viewmodel.protecciondatos.siu.TCREARPROTECCIONDATOSNARequest;
import com.keralty.ae.viewmodel.protecciondatos.siu.TCREARPROTECCIONDATOSNAResponse;
import com.keralty.ae.viewmodel.protecciondatos.siu.TCREARSOLNOVEDADEXCEPCIONRequest;
import com.keralty.ae.viewmodel.protecciondatos.siu.TCREARSOLNOVEDADEXCEPCIONResponse;
import com.keralty.ae.viewmodel.protecciondatos.siu.TCREARSOLNOVEDADRequest;
import com.keralty.ae.viewmodel.protecciondatos.siu.TCREARSOLNOVEDADResponse;
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

@Path("/api/ProteccionDatosApi")
@RequestScoped
public class ProteccionDatosApi {

    @RestClient
    ProteccionDatosService service;

    JsonWebToken jwt; 

    public ProteccionDatosApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{proteccionDatosIdentificador}")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public ProteccionDatos getInstance(Long proteccionDatosIdentificador) {
    	return service.getById(proteccionDatosIdentificador);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public List<ProteccionDatos> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public ProteccionDatos getByOid(ProteccionDatosOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public ProteccionDatos getByOIDWithHV(ProteccionDatosOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetProteccionDatosDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public InstanceResponseViewModel getProteccionDatosDynamic(QueryRequest request) {
        return service.getProteccionDatosDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public PopulationResponseViewModel getProteccionDatosPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/TCREARPROTECCIONDATOSNA")
    @RolesAllowed({"Admin","SuperAdmin","Asesor"})
    public TCREARPROTECCIONDATOSNAResponse proteccionDatosTCREARPROTECCIONDATOSNA(TCREARPROTECCIONDATOSNARequest request) {
        return service.tCREARPROTECCIONDATOSNA(request);
    }
    

    @POST
    @Path(value = "/TCREARPROTECCIONDATOSINC")
    @RolesAllowed({"Admin","SuperAdmin","Asesor"})
    public TCREARPROTECCIONDATOSINCResponse proteccionDatosTCREARPROTECCIONDATOSINC(TCREARPROTECCIONDATOSINCRequest request) {
        return service.tCREARPROTECCIONDATOSINC(request);
    }
    

    @POST
    @Path(value = "/TCREARSOLNOVEDAD")
    @RolesAllowed({"Admin","SuperAdmin","Asesor"})
    public TCREARSOLNOVEDADResponse proteccionDatosTCREARSOLNOVEDAD(TCREARSOLNOVEDADRequest request) {
        return service.tCREARSOLNOVEDAD(request);
    }
    

    @POST
    @Path(value = "/TCREARSOLNOVEDADEXCEPCION")
    @RolesAllowed({"Admin","SuperAdmin"})
    public TCREARSOLNOVEDADEXCEPCIONResponse proteccionDatosTCREARSOLNOVEDADEXCEPCION(TCREARSOLNOVEDADEXCEPCIONRequest request) {
        return service.tCREARSOLNOVEDADEXCEPCION(request);
    }
    
}
