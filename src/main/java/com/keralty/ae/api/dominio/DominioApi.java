package com.keralty.ae.api.dominio;

import com.keralty.ae.persistence.Dominio;
import com.keralty.ae.persistence.oid.DominioOid;
import com.keralty.ae.service.DominioService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.dominio.siu.CambiarDiasVigenciaRequest;
import com.keralty.ae.viewmodel.dominio.siu.CrearRequest;
import com.keralty.ae.viewmodel.dominio.siu.CrearResponse;
import com.keralty.ae.viewmodel.dominio.siu.DelFormaPagoRequest;
import com.keralty.ae.viewmodel.dominio.siu.DelPeriodicidadDominioRequest;
import com.keralty.ae.viewmodel.dominio.siu.DelRollDominioRequest;
import com.keralty.ae.viewmodel.dominio.siu.InsFormaPagoRequest;
import com.keralty.ae.viewmodel.dominio.siu.InsPeriodicidadDominioRequest;
import com.keralty.ae.viewmodel.dominio.siu.InsRolDominioRequest;
import com.keralty.ae.viewmodel.dominio.siu.ModDatosRespFirmaRequest;
import com.keralty.ae.viewmodel.dominio.siu.ModificarConfSolNovedadRequest;
import com.keralty.ae.viewmodel.dominio.siu.ModImagenFirmaRequest;
import com.keralty.ae.viewmodel.dominio.siu.TADDGRPASESORESRequest;
import com.keralty.ae.viewmodel.dominio.siu.TADDGRPMEDICORequest;
import com.keralty.ae.viewmodel.dominio.siu.TADDREPORTERequest;
import com.keralty.ae.viewmodel.dominio.siu.TDELGRPASESORESRequest;
import com.keralty.ae.viewmodel.dominio.siu.TDELGRPMEDICORequest;
import com.keralty.ae.viewmodel.dominio.siu.TDELINCOMPATIBLERequest;
import com.keralty.ae.viewmodel.dominio.siu.TELIMINARRequest;
import com.keralty.ae.viewmodel.dominio.siu.TINSINCOMPATIBLERequest;
import com.keralty.ae.viewmodel.dominio.siu.TINSNOVEDADRequest;
import com.keralty.ae.viewmodel.dominio.siu.TINSPLANTILLARequest;
import com.keralty.ae.viewmodel.dominio.siu.TMODIFICARRequest;
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

@Path("/api/DominioApi")
@RequestScoped
public class DominioApi {

    @RestClient
    DominioService service;

    JsonWebToken jwt; 

    public DominioApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{dominioNumero}")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public Dominio getInstance(Long dominioNumero) {
    	return service.getById(dominioNumero);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public List<Dominio> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public Dominio getByOid(DominioOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public Dominio getByOIDWithHV(DominioOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetDominioDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public InstanceResponseViewModel getDominioDynamic(QueryRequest request) {
        return service.getDominioDynamic(request);
    }

    @POST
    @Path(value = "/GetWithDisplaySetDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PreloadResponseViewModel getDominioWithDisplaySetDynamic(QueryRequest request) {
        return (PreloadResponseViewModel) service.getWithDisplaySetDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PopulationResponseViewModel getDominioPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/crear")
    @RolesAllowed({"Admin","SuperAdmin"})
    public CrearResponse dominioCrear(CrearRequest request) {
        return service.crear(request);
    }
    

    @POST
    @Path(value = "/crearCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin"})
    public CrearResponse dominioCrearCheckPreconditions(CrearRequest request) {

        return service.crearCheckPreconditions(request);
    }

    @POST
    @Path(value = "/InsPeriodicidadDominio")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse dominioInsPeriodicidadDominio(InsPeriodicidadDominioRequest request) {
        return service.insPeriodicidadDominio(request);
    }
    

    @POST
    @Path(value = "/DelPeriodicidadDominio")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse dominioDelPeriodicidadDominio(DelPeriodicidadDominioRequest request) {
        return service.delPeriodicidadDominio(request);
    }
    

    @POST
    @Path(value = "/InsRolDominio")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse dominioInsRolDominio(InsRolDominioRequest request) {
        return service.insRolDominio(request);
    }
    

    @POST
    @Path(value = "/DelRollDominio")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse dominioDelRollDominio(DelRollDominioRequest request) {
        return service.delRollDominio(request);
    }
    

    @POST
    @Path(value = "/modDatosRespFirma")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse dominioModDatosRespFirma(ModDatosRespFirmaRequest request) {
        return service.modDatosRespFirma(request);
    }
    

    @POST
    @Path(value = "/modDatosRespFirmaCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse dominioModDatosRespFirmaCheckPreconditions(ModDatosRespFirmaRequest request) {

        return service.modDatosRespFirmaCheckPreconditions(request);
    }

    @POST
    @Path(value = "/modImagenFirma")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse dominioModImagenFirma(ModImagenFirmaRequest request) {
        return service.modImagenFirma(request);
    }
    

    @POST
    @Path(value = "/modImagenFirmaCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse dominioModImagenFirmaCheckPreconditions(ModImagenFirmaRequest request) {

        return service.modImagenFirmaCheckPreconditions(request);
    }

    @POST
    @Path(value = "/InsFormaPago")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse dominioInsFormaPago(InsFormaPagoRequest request) {
        return service.insFormaPago(request);
    }
    

    @POST
    @Path(value = "/DelFormaPago")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse dominioDelFormaPago(DelFormaPagoRequest request) {
        return service.delFormaPago(request);
    }
    

    @POST
    @Path(value = "/cambiarDiasVigencia")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse dominioCambiarDiasVigencia(CambiarDiasVigenciaRequest request) {
        return service.cambiarDiasVigencia(request);
    }
    

    @POST
    @Path(value = "/cambiarDiasVigenciaCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse dominioCambiarDiasVigenciaCheckPreconditions(CambiarDiasVigenciaRequest request) {

        return service.cambiarDiasVigenciaCheckPreconditions(request);
    }

    @POST
    @Path(value = "/modificarConfSolNovedad")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse dominioModificarConfSolNovedad(ModificarConfSolNovedadRequest request) {
        return service.modificarConfSolNovedad(request);
    }
    

    @POST
    @Path(value = "/TELIMINAR")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse dominioTELIMINAR(TELIMINARRequest request) {
        return service.tELIMINAR(request);
    }
    

    @POST
    @Path(value = "/TINSPLANTILLA")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse dominioTINSPLANTILLA(TINSPLANTILLARequest request) {
        return service.tINSPLANTILLA(request);
    }
    

    @POST
    @Path(value = "/TINSNOVEDAD")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse dominioTINSNOVEDAD(TINSNOVEDADRequest request) {
        return service.tINSNOVEDAD(request);
    }
    

    @POST
    @Path(value = "/TADDGRPASESORES")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse dominioTADDGRPASESORES(TADDGRPASESORESRequest request) {
        return service.tADDGRPASESORES(request);
    }
    

    @POST
    @Path(value = "/TDELGRPASESORES")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse dominioTDELGRPASESORES(TDELGRPASESORESRequest request) {
        return service.tDELGRPASESORES(request);
    }
    

    @POST
    @Path(value = "/TADDGRPMEDICO")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse dominioTADDGRPMEDICO(TADDGRPMEDICORequest request) {
        return service.tADDGRPMEDICO(request);
    }
    

    @POST
    @Path(value = "/TDELGRPMEDICO")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse dominioTDELGRPMEDICO(TDELGRPMEDICORequest request) {
        return service.tDELGRPMEDICO(request);
    }
    

    @POST
    @Path(value = "/TADDREPORTE")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse dominioTADDREPORTE(TADDREPORTERequest request) {
        return service.tADDREPORTE(request);
    }
    

    @POST
    @Path(value = "/TADDREPORTECheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse dominioTADDREPORTECheckPreconditions(TADDREPORTERequest request) {

        return service.tADDREPORTECheckPreconditions(request);
    }

    @POST
    @Path(value = "/TINSINCOMPATIBLE")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse dominioTINSINCOMPATIBLE(TINSINCOMPATIBLERequest request) {
        return service.tINSINCOMPATIBLE(request);
    }
    

    @POST
    @Path(value = "/TDELINCOMPATIBLE")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse dominioTDELINCOMPATIBLE(TDELINCOMPATIBLERequest request) {
        return service.tDELINCOMPATIBLE(request);
    }
    

    @POST
    @Path(value = "/TMODIFICAR")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse dominioTMODIFICAR(TMODIFICARRequest request) {
        return service.tMODIFICAR(request);
    }
    
}
