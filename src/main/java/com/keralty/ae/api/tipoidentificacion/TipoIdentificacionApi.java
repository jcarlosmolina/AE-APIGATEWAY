package com.keralty.ae.api.tipoidentificacion;

import com.keralty.ae.persistence.oid.TipoIdentificacionOid;
import com.keralty.ae.persistence.TipoIdentificacion;
import com.keralty.ae.service.TipoIdentificacionService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.InstanceResponseViewModel;
import com.keralty.ae.viewmodel.PopulationResponseViewModel;
import com.keralty.ae.viewmodel.PreloadResponseViewModel;
import com.keralty.ae.viewmodel.PreloadViewModel;
import com.keralty.ae.viewmodel.QueryRequest;
import com.keralty.ae.viewmodel.ServiceResponse;
import com.keralty.ae.viewmodel.tipoidentificacion.siu.CrearRequest;
import com.keralty.ae.viewmodel.tipoidentificacion.siu.DelTipoIdCDUsuNovedadRequest;
import com.keralty.ae.viewmodel.tipoidentificacion.siu.DelTipoIdentContratanteRequest;
import com.keralty.ae.viewmodel.tipoidentificacion.siu.DelTipoIdentificacionRequest;
import com.keralty.ae.viewmodel.tipoidentificacion.siu.DelTipoIdentUsuNovedadRequest;
import com.keralty.ae.viewmodel.tipoidentificacion.siu.EliminarRequest;
import com.keralty.ae.viewmodel.tipoidentificacion.siu.InsTipoIdCDUsuNovedadRequest;
import com.keralty.ae.viewmodel.tipoidentificacion.siu.InsTipoIdentContratanteRequest;
import com.keralty.ae.viewmodel.tipoidentificacion.siu.InsTipoIdentificacionRequest;
import com.keralty.ae.viewmodel.tipoidentificacion.siu.InsTipoIdentUsuNovedadRequest;
import com.keralty.ae.viewmodel.tipoidentificacion.siu.ModificarRequest;
import jakarta.annotation.security.RolesAllowed;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.POST;
import java.util.List;
import org.eclipse.microprofile.jwt.JsonWebToken;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/api/TipoIdentificacionApi")
@RequestScoped
public class TipoIdentificacionApi {

    @RestClient
    TipoIdentificacionService service;

    JsonWebToken jwt; 

    public TipoIdentificacionApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{tipoIdentificacionCodigo}")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public TipoIdentificacion getInstance(Long tipoIdentificacionCodigo) {
    	return service.getById(tipoIdentificacionCodigo);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public List<TipoIdentificacion> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public TipoIdentificacion getByOid(TipoIdentificacionOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public TipoIdentificacion getByOIDWithHV(TipoIdentificacionOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetTipoIdentificacionDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public InstanceResponseViewModel getTipoIdentificacionDynamic(QueryRequest request) {
        return service.getTipoIdentificacionDynamic(request);
    }

    @POST
    @Path(value = "/GetWithDisplaySetDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PreloadResponseViewModel getTipoIdentificacionWithDisplaySetDynamic(QueryRequest request) {
        return (PreloadResponseViewModel) service.getWithDisplaySetDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PopulationResponseViewModel getTipoIdentificacionPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/crear")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse tipoIdentificacionCrear(CrearRequest request) {
        return service.crear(request);
    }
    

    @POST
    @Path(value = "/eliminar")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse tipoIdentificacionEliminar(EliminarRequest request) {
        return service.eliminar(request);
    }
    

    @POST
    @Path(value = "/modificar")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tipoIdentificacionModificar(ModificarRequest request) {
        return service.modificar(request);
    }
    

    @POST
    @Path(value = "/InsTipoIdentContratante")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse tipoIdentificacionInsTipoIdentContratante(InsTipoIdentContratanteRequest request) {
        return service.insTipoIdentContratante(request);
    }
    

    @POST
    @Path(value = "/DelTipoIdentContratante")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse tipoIdentificacionDelTipoIdentContratante(DelTipoIdentContratanteRequest request) {
        return service.delTipoIdentContratante(request);
    }
    

    @POST
    @Path(value = "/InsTipoIdentificacion")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse tipoIdentificacionInsTipoIdentificacion(InsTipoIdentificacionRequest request) {
        return service.insTipoIdentificacion(request);
    }
    

    @POST
    @Path(value = "/DelTipoIdentificacion")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse tipoIdentificacionDelTipoIdentificacion(DelTipoIdentificacionRequest request) {
        return service.delTipoIdentificacion(request);
    }
    

    @POST
    @Path(value = "/InsTipoIdentUsuNovedad")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse tipoIdentificacionInsTipoIdentUsuNovedad(InsTipoIdentUsuNovedadRequest request) {
        return service.insTipoIdentUsuNovedad(request);
    }
    

    @POST
    @Path(value = "/DelTipoIdentUsuNovedad")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse tipoIdentificacionDelTipoIdentUsuNovedad(DelTipoIdentUsuNovedadRequest request) {
        return service.delTipoIdentUsuNovedad(request);
    }
    

    @POST
    @Path(value = "/InsTipoIdCDUsuNovedad")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse tipoIdentificacionInsTipoIdCDUsuNovedad(InsTipoIdCDUsuNovedadRequest request) {
        return service.insTipoIdCDUsuNovedad(request);
    }
    

    @POST
    @Path(value = "/DelTipoIdCDUsuNovedad")
    @RolesAllowed({"SuperAdmin"})
    public ServiceResponse tipoIdentificacionDelTipoIdCDUsuNovedad(DelTipoIdCDUsuNovedadRequest request) {
        return service.delTipoIdCDUsuNovedad(request);
    }
    
}
