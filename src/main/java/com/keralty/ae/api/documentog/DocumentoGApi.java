package com.keralty.ae.api.documentog;

import com.keralty.ae.persistence.DocumentoG;
import com.keralty.ae.persistence.oid.DocumentoGOid;
import com.keralty.ae.service.DocumentoGService;
import com.keralty.ae.utils.TokenUtilities;
import com.keralty.ae.viewmodel.documentog.siu.PrevisualizarATORequest;
import com.keralty.ae.viewmodel.documentog.siu.PrevisualizarATOResponse;
import com.keralty.ae.viewmodel.documentog.siu.TAPROBARRequest;
import com.keralty.ae.viewmodel.documentog.siu.TDEVOLVERRequest;
import com.keralty.ae.viewmodel.documentog.siu.TDEVOLVERResponse;
import com.keralty.ae.viewmodel.documentog.siu.VerDetallesRequest;
import com.keralty.ae.viewmodel.InstanceResponseViewModel;
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

@Path("/api/DocumentoGApi")
@RequestScoped
public class DocumentoGApi {

    @RestClient
    DocumentoGService service;

    JsonWebToken jwt; 

    public DocumentoGApi(JsonWebToken jwt) {
        this.jwt = jwt;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @GET
    @Path(value="/{documentoGIdentificador}")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public DocumentoG getInstance(Long documentoGIdentificador) {
    	return service.getById(documentoGIdentificador);
    }

    @GET
    @Path(value="/")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public List<DocumentoG> getPopulation(QueryRequest queryRequest){
    	return service.get(queryRequest);
    }

    @GET
    @Path(value="/getByOid")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public DocumentoG getByOid(DocumentoGOid oid) {
    	return service.getByOID(oid);
    }

    @GET
    @Path(value="/getByOIDWithHV")
    @Operation(hidden = true)
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public DocumentoG getByOIDWithHV(DocumentoGOid oid) {
    	return service.getByOIDWithHV(oid);
    }
    
    @POST
    @Path(value = "/GetDocumentoGDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public InstanceResponseViewModel getDocumentoGDynamic(QueryRequest request) {
        return service.getDocumentoGDynamic(request);
    }
    
    @POST
    @Path(value = "/GetPopulationDynamic")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PopulationResponseViewModel getDocumentoGPopulationDynamic(QueryRequest request) {
        return (PopulationResponseViewModel) service.getPopulationDynamic(request);
    }

    @POST
    @Path(value = "/verDetalles")
    @RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public ServiceResponse documentoGVerDetalles(VerDetallesRequest request) {
        return service.verDetalles(request);
    }
    

    @POST
    @Path(value = "/previsualizarATO")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PrevisualizarATOResponse documentoGPrevisualizarATO(PrevisualizarATORequest request) {
        return service.previsualizarATO(request);
    }
    

    @POST
    @Path(value = "/previsualizarATOCheckPreconditions")
    @RolesAllowed({"Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo"})
    public PrevisualizarATOResponse documentoGPrevisualizarATOCheckPreconditions(PrevisualizarATORequest request) {

        return service.previsualizarATOCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TAPROBAR")
    @RolesAllowed({"SuperAdmin","AreaMedica","Afiliaciones","MesaDeApoyo"})
    public ServiceResponse documentoGTAPROBAR(TAPROBARRequest request) {
        return service.tAPROBAR(request);
    }
    

    @POST
    @Path(value = "/TAPROBARCheckPreconditions")
    @RolesAllowed({"SuperAdmin","AreaMedica","Afiliaciones","MesaDeApoyo"})
    public ServiceResponse documentoGTAPROBARCheckPreconditions(TAPROBARRequest request) {

        return service.tAPROBARCheckPreconditions(request);
    }

    @POST
    @Path(value = "/TDEVOLVER")
    @RolesAllowed({"SuperAdmin","AreaMedica","Afiliaciones","MesaDeApoyo"})
    public TDEVOLVERResponse documentoGTDEVOLVER(TDEVOLVERRequest request) {
        return service.tDEVOLVER(request);
    }
    

    @POST
    @Path(value = "/TDEVOLVERCheckPreconditions")
    @RolesAllowed({"SuperAdmin","AreaMedica","Afiliaciones","MesaDeApoyo"})
    public TDEVOLVERResponse documentoGTDEVOLVERCheckPreconditions(TDEVOLVERRequest request) {

        return service.tDEVOLVERCheckPreconditions(request);
    }
}
