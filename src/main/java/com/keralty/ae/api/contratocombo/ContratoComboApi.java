package com.keralty.ae.api.contratocombo;

import com.keralty.ae.persistence.ContratoCombo;
import com.keralty.ae.persistence.oid.ContratoComboOid;
import com.keralty.ae.service.ContratoComboService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.InstanceResponseViewModel;
import com.keralty.ae.viewmodel.PopulationResponseViewModel;
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

@Path("/api/ContratoComboApi")
@RequestScoped
public class ContratoComboApi {

    @RestClient
    ContratoComboService service;

    JsonWebToken jwt; 

    public ContratoComboApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{contratoComboId}")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Gestor","MesaDeApoyo"})
    public ContratoCombo getInstance(Long contratoComboId) {
    	return service.getById(contratoComboId);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Gestor","MesaDeApoyo"})
    public List<ContratoCombo> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Gestor","MesaDeApoyo"})
    public ContratoCombo getByOid(ContratoComboOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Gestor","MesaDeApoyo"})
    public ContratoCombo getByOIDWithHV(ContratoComboOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetContratoComboDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Gestor","MesaDeApoyo"})
    public InstanceResponseViewModel getContratoComboDynamic(QueryRequest request) {
        return service.getContratoComboDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Gestor","MesaDeApoyo"})
    public PopulationResponseViewModel getContratoComboPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

}
