package com.keralty.ae.api.tiposucursalc;

import com.keralty.ae.persistence.oid.TipoSucursalCOid;
import com.keralty.ae.persistence.TipoSucursalC;
import com.keralty.ae.service.TipoSucursalCService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.InstanceResponseViewModel;
import com.keralty.ae.viewmodel.PopulationResponseViewModel;
import com.keralty.ae.viewmodel.QueryRequest;
import com.keralty.ae.viewmodel.ServiceResponse;
import com.keralty.ae.viewmodel.tiposucursalc.siu.CrearRequest;
import com.keralty.ae.viewmodel.tiposucursalc.siu.DelTiposSucursalCRequest;
import com.keralty.ae.viewmodel.tiposucursalc.siu.EliminarRequest;
import com.keralty.ae.viewmodel.tiposucursalc.siu.InsTiposSucursalCRequest;
import com.keralty.ae.viewmodel.tiposucursalc.siu.ModificarRequest;
import jakarta.annotation.security.RolesAllowed;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.POST;
import java.util.List;
import org.eclipse.microprofile.jwt.JsonWebToken;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/api/TipoSucursalCApi")
@RequestScoped
public class TipoSucursalCApi {

    @RestClient
    TipoSucursalCService service;

    JsonWebToken jwt; 

    public TipoSucursalCApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{tipoSucursalCCodigo}")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public TipoSucursalC getInstance(Long tipoSucursalCCodigo) {
    	return service.getById(tipoSucursalCCodigo);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public List<TipoSucursalC> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public TipoSucursalC getByOid(TipoSucursalCOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public TipoSucursalC getByOIDWithHV(TipoSucursalCOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetTipoSucursalCDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public InstanceResponseViewModel getTipoSucursalCDynamic(QueryRequest request) {
        return service.getTipoSucursalCDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","Gestor","MesaDeApoyo"})
    public PopulationResponseViewModel getTipoSucursalCPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/crear")
    @RolesAllowed({"Admin","SuperAdmin","Asesor"})
    public ServiceResponse tipoSucursalCCrear(CrearRequest request) {
        return service.crear(request);
    }
    

    @POST
    @Path(value = "/eliminar")
    @RolesAllowed({"Admin","SuperAdmin","Asesor"})
    public ServiceResponse tipoSucursalCEliminar(EliminarRequest request) {
        return service.eliminar(request);
    }
    

    @POST
    @Path(value = "/eliminarCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor"})
    public ServiceResponse tipoSucursalCEliminarCheckPreconditions(EliminarRequest request) {

        return service.eliminarCheckPreconditions(request);
    }

    @POST
    @Path(value = "/modificar")
    @RolesAllowed({"Admin","SuperAdmin","Asesor"})
    public ServiceResponse tipoSucursalCModificar(ModificarRequest request) {
        return service.modificar(request);
    }
    

    @POST
    @Path(value = "/InsTiposSucursalC")
    @RolesAllowed({"Admin","SuperAdmin","Asesor"})
    public ServiceResponse tipoSucursalCInsTiposSucursalC(InsTiposSucursalCRequest request) {
        return service.insTiposSucursalC(request);
    }
    

    @POST
    @Path(value = "/DelTiposSucursalC")
    @RolesAllowed({"Admin","SuperAdmin","Asesor"})
    public ServiceResponse tipoSucursalCDelTiposSucursalC(DelTiposSucursalCRequest request) {
        return service.delTiposSucursalC(request);
    }
    
}
