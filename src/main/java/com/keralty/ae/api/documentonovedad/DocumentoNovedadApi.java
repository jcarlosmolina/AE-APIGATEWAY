package com.keralty.ae.api.documentonovedad;

import com.keralty.ae.persistence.DocumentoNovedad;
import com.keralty.ae.persistence.oid.DocumentoNovedadOid;
import com.keralty.ae.service.DocumentoNovedadService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.documentonovedad.siu.DescargarDocumentoATORequest;
import com.keralty.ae.viewmodel.documentonovedad.siu.DescargarDocumentoATOResponse;
import com.keralty.ae.viewmodel.documentonovedad.siu.TAPROBARRequest;
import com.keralty.ae.viewmodel.documentonovedad.siu.TCREARATORequest;
import com.keralty.ae.viewmodel.documentonovedad.siu.TDEVOLVERRequest;
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

@Path("/api/DocumentoNovedadApi")
@RequestScoped
public class DocumentoNovedadApi {

    @RestClient
    DocumentoNovedadService service;

    JsonWebToken jwt; 

    public DocumentoNovedadApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{documentoNovedadIdDocumento}")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","Gestor","MesaDeApoyo"})
    public DocumentoNovedad getInstance(Long documentoNovedadIdDocumento) {
    	return service.getById(documentoNovedadIdDocumento);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","Gestor","MesaDeApoyo"})
    public List<DocumentoNovedad> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","Gestor","MesaDeApoyo"})
    public DocumentoNovedad getByOid(DocumentoNovedadOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","Gestor","MesaDeApoyo"})
    public DocumentoNovedad getByOIDWithHV(DocumentoNovedadOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetDocumentoNovedadDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","Gestor","MesaDeApoyo"})
    public InstanceResponseViewModel getDocumentoNovedadDynamic(QueryRequest request) {
        return service.getDocumentoNovedadDynamic(request);
    }

    @POST
    @Path(value = "/GetWithDisplaySetDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","Gestor","MesaDeApoyo"})
    public PreloadResponseViewModel getDocumentoNovedadWithDisplaySetDynamic(QueryRequest request) {
        return (PreloadResponseViewModel) service.getWithDisplaySetDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","Gestor","MesaDeApoyo"})
    public PopulationResponseViewModel getDocumentoNovedadPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/descargarDocumentoATO")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","Gestor","MesaDeApoyo"})
    public DescargarDocumentoATOResponse documentoNovedadDescargarDocumentoATO(DescargarDocumentoATORequest request) {
        return service.descargarDocumentoATO(request);
    }
    

    @POST
    @Path(value = "/descargarDocumentoATOCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","Gestor","MesaDeApoyo"})
    public DescargarDocumentoATOResponse documentoNovedadDescargarDocumentoATOCheckPreconditions(DescargarDocumentoATORequest request) {

        return service.descargarDocumentoATOCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TAPROBAR")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","MesaDeApoyo"})
    public ServiceResponse documentoNovedadTAPROBAR(TAPROBARRequest request) {
        return service.tAPROBAR(request);
    }
    

    @POST
    @Path(value = "/TDEVOLVER")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","MesaDeApoyo"})
    public ServiceResponse documentoNovedadTDEVOLVER(TDEVOLVERRequest request) {
        return service.tDEVOLVER(request);
    }
    

    @POST
    @Path(value = "/TCREARATO")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","Afiliaciones","Gestor","MesaDeApoyo"})
    public ServiceResponse documentoNovedadTCREARATO(TCREARATORequest request) {
        return service.tCREARATO(request);
    }
    
}
