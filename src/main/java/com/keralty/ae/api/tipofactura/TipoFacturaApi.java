package com.keralty.ae.api.tipofactura;

import com.keralty.ae.persistence.oid.TipoFacturaOid;
import com.keralty.ae.persistence.TipoFactura;
import com.keralty.ae.service.TipoFacturaService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.InstanceResponseViewModel;
import com.keralty.ae.viewmodel.PopulationResponseViewModel;
import com.keralty.ae.viewmodel.PreloadResponseViewModel;
import com.keralty.ae.viewmodel.PreloadViewModel;
import com.keralty.ae.viewmodel.QueryRequest;
import com.keralty.ae.viewmodel.ServiceResponse;
import com.keralty.ae.viewmodel.tipofactura.siu.CrearRequest;
import com.keralty.ae.viewmodel.tipofactura.siu.EliminarRequest;
import com.keralty.ae.viewmodel.tipofactura.siu.ModificarRequest;
import jakarta.annotation.security.RolesAllowed;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.POST;
import java.util.List;
import org.eclipse.microprofile.jwt.JsonWebToken;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/api/TipoFacturaApi")
@RequestScoped
public class TipoFacturaApi {

    @RestClient
    TipoFacturaService service;

    JsonWebToken jwt; 

    public TipoFacturaApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{tipoFacturaCodigo}")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Gestor","MesaDeApoyo"})
    public TipoFactura getInstance(String tipoFacturaCodigo) {
    	return service.getById(tipoFacturaCodigo);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Gestor","MesaDeApoyo"})
    public List<TipoFactura> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Gestor","MesaDeApoyo"})
    public TipoFactura getByOid(TipoFacturaOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Gestor","MesaDeApoyo"})
    public TipoFactura getByOIDWithHV(TipoFacturaOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetTipoFacturaDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Gestor","MesaDeApoyo"})
    public InstanceResponseViewModel getTipoFacturaDynamic(QueryRequest request) {
        return service.getTipoFacturaDynamic(request);
    }

    @POST
    @Path(value = "/GetWithDisplaySetDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Gestor","MesaDeApoyo"})
    public PreloadResponseViewModel getTipoFacturaWithDisplaySetDynamic(QueryRequest request) {
        return (PreloadResponseViewModel) service.getWithDisplaySetDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Gestor","MesaDeApoyo"})
    public PopulationResponseViewModel getTipoFacturaPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/crear")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tipoFacturaCrear(CrearRequest request) {
        return service.crear(request);
    }
    

    @POST
    @Path(value = "/eliminar")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tipoFacturaEliminar(EliminarRequest request) {
        return service.eliminar(request);
    }
    

    @POST
    @Path(value = "/modificar")
    @RolesAllowed({"Admin","SuperAdmin"})
    public ServiceResponse tipoFacturaModificar(ModificarRequest request) {
        return service.modificar(request);
    }
    
}
