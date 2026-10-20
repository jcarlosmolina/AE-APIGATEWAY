package com.keralty.ae.api.paramreporte;

import com.keralty.ae.persistence.oid.ParamReporteOid;
import com.keralty.ae.persistence.ParamReporte;
import com.keralty.ae.service.ParamReporteService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.InstanceResponseViewModel;
import com.keralty.ae.viewmodel.paramreporte.siu.ModificarRequest;
import com.keralty.ae.viewmodel.paramreporte.siu.TBAJARRequest;
import com.keralty.ae.viewmodel.paramreporte.siu.TDELETERequest;
import com.keralty.ae.viewmodel.paramreporte.siu.TNEWRequest;
import com.keralty.ae.viewmodel.paramreporte.siu.TSUBIRRequest;
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

@Path("/api/ParamReporteApi")
@RequestScoped
public class ParamReporteApi {

    @RestClient
    ParamReporteService service;

    JsonWebToken jwt; 

    public ParamReporteApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{paramReporteidParamReporte}")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public ParamReporte getInstance(Long paramReporteidParamReporte) {
    	return service.getById(paramReporteidParamReporte);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public List<ParamReporte> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public ParamReporte getByOid(ParamReporteOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public ParamReporte getByOIDWithHV(ParamReporteOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetParamReporteDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public InstanceResponseViewModel getParamReporteDynamic(QueryRequest request) {
        return service.getParamReporteDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PopulationResponseViewModel getParamReportePopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/modificar")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse paramReporteModificar(ModificarRequest request) {
        return service.modificar(request);
    }
    

    @POST
    @Path(value = "/TNEW")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse paramReporteTNEW(TNEWRequest request) {
        return service.tNEW(request);
    }
    

    @POST
    @Path(value = "/TDELETE")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse paramReporteTDELETE(TDELETERequest request) {
        return service.tDELETE(request);
    }
    

    @POST
    @Path(value = "/TSUBIR")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse paramReporteTSUBIR(TSUBIRRequest request) {
        return service.tSUBIR(request);
    }
    

    @POST
    @Path(value = "/TBAJAR")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse paramReporteTBAJAR(TBAJARRequest request) {
        return service.tBAJAR(request);
    }
    
}
