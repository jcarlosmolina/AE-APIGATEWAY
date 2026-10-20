package com.keralty.ae.api.familianovedad;

import com.keralty.ae.persistence.FamiliaNovedad;
import com.keralty.ae.persistence.oid.FamiliaNovedadOid;
import com.keralty.ae.service.FamiliaNovedadService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.familianovedad.siu.TADDTITULARRequest;
import com.keralty.ae.viewmodel.familianovedad.siu.TCREARMANUALRequest;
import com.keralty.ae.viewmodel.familianovedad.siu.TCREARUSUMANUALRequest;
import com.keralty.ae.viewmodel.familianovedad.siu.TDELETERequest;
import com.keralty.ae.viewmodel.familianovedad.siu.TFIRMARNUEVOTITULARRequest;
import com.keralty.ae.viewmodel.familianovedad.siu.TFIRMARTITULARRequest;
import com.keralty.ae.viewmodel.familianovedad.siu.TMODIFICARMANUALRequest;
import com.keralty.ae.viewmodel.familianovedad.siu.TSETDIRCORRRequest;
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

@Path("/api/FamiliaNovedadApi")
@RequestScoped
public class FamiliaNovedadApi {

    @RestClient
    FamiliaNovedadService service;

    JsonWebToken jwt; 

    public FamiliaNovedadApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{familiaNovedadidFamiliaNovedad}")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","Gestor","MesaDeApoyo"})
    public FamiliaNovedad getInstance(Long familiaNovedadidFamiliaNovedad) {
    	return service.getById(familiaNovedadidFamiliaNovedad);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","Gestor","MesaDeApoyo"})
    public List<FamiliaNovedad> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","Gestor","MesaDeApoyo"})
    public FamiliaNovedad getByOid(FamiliaNovedadOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","Gestor","MesaDeApoyo"})
    public FamiliaNovedad getByOIDWithHV(FamiliaNovedadOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetFamiliaNovedadDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","Gestor","MesaDeApoyo"})
    public InstanceResponseViewModel getFamiliaNovedadDynamic(QueryRequest request) {
        return service.getFamiliaNovedadDynamic(request);
    }

    @POST
    @Path(value = "/GetWithDisplaySetDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","Gestor","MesaDeApoyo"})
    public PreloadResponseViewModel getFamiliaNovedadWithDisplaySetDynamic(QueryRequest request) {
        return (PreloadResponseViewModel) service.getWithDisplaySetDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","Gestor","MesaDeApoyo"})
    public PopulationResponseViewModel getFamiliaNovedadPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/TFIRMARTITULAR")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","MesaDeApoyo"})
    public ServiceResponse familiaNovedadTFIRMARTITULAR(TFIRMARTITULARRequest request) {
        return service.tFIRMARTITULAR(request);
    }
    

    @POST
    @Path(value = "/TSETDIRCORR")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","MesaDeApoyo"})
    public ServiceResponse familiaNovedadTSETDIRCORR(TSETDIRCORRRequest request) {
        return service.tSETDIRCORR(request);
    }
    

    @POST
    @Path(value = "/TSETDIRCORRCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","MesaDeApoyo"})
    public ServiceResponse familiaNovedadTSETDIRCORRCheckPreconditions(TSETDIRCORRRequest request) {

        return service.tSETDIRCORRCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TADDTITULAR")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","MesaDeApoyo"})
    public ServiceResponse familiaNovedadTADDTITULAR(TADDTITULARRequest request) {
        return service.tADDTITULAR(request);
    }
    

    @POST
    @Path(value = "/TADDTITULARCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","MesaDeApoyo"})
    public ServiceResponse familiaNovedadTADDTITULARCheckPreconditions(TADDTITULARRequest request) {

        return service.tADDTITULARCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TFIRMARNUEVOTITULAR")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","MesaDeApoyo"})
    public ServiceResponse familiaNovedadTFIRMARNUEVOTITULAR(TFIRMARNUEVOTITULARRequest request) {
        return service.tFIRMARNUEVOTITULAR(request);
    }
    

    @POST
    @Path(value = "/TFIRMARNUEVOTITULARCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","MesaDeApoyo"})
    public ServiceResponse familiaNovedadTFIRMARNUEVOTITULARCheckPreconditions(TFIRMARNUEVOTITULARRequest request) {

        return service.tFIRMARNUEVOTITULARCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TDELETE")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","MesaDeApoyo"})
    public ServiceResponse familiaNovedadTDELETE(TDELETERequest request) {
        return service.tDELETE(request);
    }
    

    @POST
    @Path(value = "/TDELETECheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","MesaDeApoyo"})
    public ServiceResponse familiaNovedadTDELETECheckPreconditions(TDELETERequest request) {

        return service.tDELETECheckPreconditions(request);
    }

    @POST
    @Path(value = "/TCREARMANUAL")
    @RolesAllowed({"SuperAdmin","Asesor"})
    public ServiceResponse familiaNovedadTCREARMANUAL(TCREARMANUALRequest request) {
        return service.tCREARMANUAL(request);
    }
    

    @POST
    @Path(value = "/TMODIFICARMANUAL")
    @RolesAllowed({"SuperAdmin","Asesor"})
    public ServiceResponse familiaNovedadTMODIFICARMANUAL(TMODIFICARMANUALRequest request) {
        return service.tMODIFICARMANUAL(request);
    }
    

    @POST
    @Path(value = "/TCREARUSUMANUAL")
    @RolesAllowed({"SuperAdmin","Asesor"})
    public ServiceResponse familiaNovedadTCREARUSUMANUAL(TCREARUSUMANUALRequest request) {
        return service.tCREARUSUMANUAL(request);
    }
    
}
