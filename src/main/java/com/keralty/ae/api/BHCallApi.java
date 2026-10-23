package com.keralty.ae.api;

import java.util.List;

import org.eclipse.microprofile.jwt.JsonWebToken;

import com.keralty.ae.utils.TokenUtilities;
import com.keralty.integraciones.beneficiario.BeneficiarioUtils;
import com.keralty.integraciones.contract.ConsultarContratoDePersonaRequest;
import com.keralty.integraciones.contract.ConsultarContratoRequest;
import com.keralty.integraciones.contract.ConsultarContratoResponse;
import com.keralty.integraciones.contract.ContractUtils;
import com.keralty.integraciones.coverage.ConsultarBeneficiarioRequest;
import com.keralty.integraciones.coverage.ConsultarBeneficiarioResponse;
import com.keralty.integraciones.coverage.CoverageUtils;
import com.keralty.integraciones.organization.getorganization.ConsultarPersonaJuridicaRequest;
import com.keralty.integraciones.organization.getorganization.ConsultarPersonaJuridicaResponse;
import com.keralty.integraciones.organization.getorganization.OrganizationUtils;
import com.keralty.integraciones.parametricas.DatoParametrica;
import com.keralty.integraciones.parametricas.ParametricasUtils;
import com.keralty.integraciones.patient.ConsultarCuestionarioMedicoResponse;
import com.keralty.integraciones.patient.ConsultarPersonaRequest;
import com.keralty.integraciones.patient.ConsultarPersonaResponse;
import com.keralty.integraciones.patient.ConsultarPreexistenciasResponse;
import com.keralty.integraciones.patient.CrearActualizarCuestionarioRequest;
import com.keralty.integraciones.patient.CrearActualizarPersonaRequest;
import com.keralty.integraciones.patient.CrearActualizarPersonaResponse;
import com.keralty.integraciones.patient.PatientUtils;
import com.keralty.integraciones.reactivacioncontratos.ReactivacionContratosUtils;
import com.keralty.integraciones.reactivacioncontratos.RequestCrearSolicitudReactivacionContrato;
import com.keralty.integraciones.reactivacioncontratos.RequestEliminarSolicitudReactivacionContrato;
import com.keralty.integraciones.reactivacioncontratos.ResponseReactivacionContrato;
import com.keralty.integraciones.reactivacioncontratos.ResponseConsultaReactivacionContratos;
import com.keralty.integraciones.reactivacioncontratos.consulta.RequestConsultaContrato;
import com.keralty.integraciones.tipossolicitud.TiposSolicitudUtils;
import com.keralty.integraciones.tipossolicitud.response.ResponseTiposSolicitud;

import jakarta.annotation.security.RolesAllowed;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/api/bhcall")
@RequestScoped
@RolesAllowed({"Funcionario","Admin","SuperAdmin","Asesor","AreaMedica","Afiliaciones","RespRegional","Gestor","MesaDeApoyo","UsuarioSistemaExterno"})
public class BHCallApi {

    ContractUtils contractUtils;

    PatientUtils patientUtils;

    CoverageUtils coverageUtils;

    OrganizationUtils organizationUtils;
    
    ParametricasUtils parametricasUtils;

    TiposSolicitudUtils tiposSolicitudUtils;
    
    ReactivacionContratosUtils reactivacionContratosUtils;
    
    BeneficiarioUtils beneficiarioUtils;
    
    JsonWebToken jwt; 

    public BHCallApi(ContractUtils contractUtils,  PatientUtils patientUtils, CoverageUtils coverageUtils, OrganizationUtils organizationUtils, 
    		ParametricasUtils parametricasUtils, TiposSolicitudUtils tiposSolicitudUtils, 
    		ReactivacionContratosUtils reactivacionContratosUtils, JsonWebToken jwt,BeneficiarioUtils beneficiarioUtils) {
        this.contractUtils = contractUtils;
        this.patientUtils = patientUtils;
        this.coverageUtils = coverageUtils;
        this.organizationUtils = organizationUtils;
        this.parametricasUtils = parametricasUtils;
        this.tiposSolicitudUtils = tiposSolicitudUtils;
        this.reactivacionContratosUtils = reactivacionContratosUtils;
        this.jwt = jwt;
        this.beneficiarioUtils = beneficiarioUtils;
        TokenUtilities.getInstance().setJsonWebToken(jwt);
    }

    @POST
    @Path("/consultarContrato")
    public ConsultarContratoResponse consultaContrato(ConsultarContratoRequest request) {
    	return contractUtils.consultarContrato(request);
    }

    
    @POST
    @Path("/consultarContratoNoLastValid")
    public ConsultarContratoResponse consultarContratoNoLastValid(ConsultarContratoRequest request) {
    	return contractUtils.consultarContratoNoLastValid(request);
    }

    @POST
    @Path("/consultarContratoSinLastValid")
    public ConsultarContratoResponse consultarContratoSinLastValid(ConsultarContratoRequest request) {
    	return contractUtils.consultarContratoSinLastValid(request);
    }
    
    @POST
    @Path("/consultarContratoDePersona")
    public ConsultarContratoResponse consultarContratoDePersona(ConsultarContratoDePersonaRequest request) {
    	return contractUtils.consultarContratoDePersona(request);
    }

    @POST
    @Path("/consultarContratosAsociadosDePersona")
    public ConsultarContratoResponse consultarContratosAsociadosDePersona(ConsultarContratoDePersonaRequest request) {
    	return contractUtils.consultarContratosAsociadosDePersona(request);
    }
    
    @POST
    @Path("/consultarPersona")
    public ConsultarPersonaResponse consultarPersona(ConsultarPersonaRequest request) {
    	return patientUtils.consultarPersona(request);
    }
    
    @POST
    @Path("/consultarBeneficiario")
    public ConsultarBeneficiarioResponse consultarBeneficiaro(ConsultarBeneficiarioRequest request) {
    	ConsultarBeneficiarioResponse response = coverageUtils.consultarBeneficiaro(request);
    	if (response.isExito()) {
    		ConsultarContratoDePersonaRequest requestContPersona = new ConsultarContratoDePersonaRequest();
    		requestContPersona.setTipoIdentificacion(request.getTipoIdentificacion());
    		requestContPersona.setNumeroIdentificacion(request.getNumeroIdentificacion());
    		requestContPersona.setNumSolicitud(request.getNumSolicitud());
			ConsultarContratoResponse responseContPersona = contractUtils.consultarContratoDePersona(requestContPersona );
			if (responseContPersona.isExito()) {
				response.setCoverResponse(responseContPersona.getCoverResponse());
			} else {
				response.setExito(false);
				response.setTextoError(responseContPersona.getTextoError());
			}
    	}
    	
    	return response;
    }

    @POST
    @Path("/consultarCausaExclusionBeneficiario")
    public String consultarCausaExclusionBeneficiario(com.keralty.integraciones.beneficiario.ConsultarBeneficiarioRequest request) {
    	return beneficiarioUtils.consultarCausaExclusionBeneficiario(request);
    }

    @POST
    @Path("/consultarPersonaJuridica")
    public ConsultarPersonaJuridicaResponse consultarPersonaJuridica(ConsultarPersonaJuridicaRequest request) {
    	return organizationUtils.consultarPersonaJuridica(request);
    }

    @POST
    @Path("/crearPersona")
    public CrearActualizarPersonaResponse crearPersona(CrearActualizarPersonaRequest request) {
    	return patientUtils.crearPersona(request);
    }

    @POST
    @Path("/actualizarPersona")
    public CrearActualizarPersonaResponse actualizarPersona(CrearActualizarPersonaRequest request) {
    	return patientUtils.actualizarPersona(request);
    }

    @POST
    @Path("/consultarCuestionarioMedico")
    public ConsultarCuestionarioMedicoResponse consultarCuestionarioMedico(ConsultarPersonaRequest request) {
    	return patientUtils.consultarCuestionarioMedico(request);
    }

    @POST
    @Path("/consultarPreexistencias")
    public ConsultarPreexistenciasResponse consultarPreexistencias(ConsultarPersonaRequest request) {
    	return patientUtils.consultarPreexistencias(request);
    }

    @POST
    @Path("/crearActualizarCuestionarioMedico")
    public String crearActualizarCuestionarioMedico(CrearActualizarCuestionarioRequest request) {
    	return patientUtils.crearActualizarCuestionarioMedico(request);
    }
    
    @GET
    @Path("/consultarCompanyasReactivacionContratos")
    public List<DatoParametrica> consultarCompanyasReactivacioContratos() {
    	return parametricasUtils.consultarCompanyasReactivacionContratos();
    }

    @GET
    @Path("/consultarPlanesReactivacionContratos")
    public ResponseTiposSolicitud consultarPlanesReactivacionContratos() {
    	return tiposSolicitudUtils.consultarPlanesReactivacionContratos();
    }

    @POST
    @Path("/consultarContratoParaReactivacion")
    public ResponseConsultaReactivacionContratos consultarContratoParaReactivacion(RequestConsultaContrato request) {
    	return reactivacionContratosUtils.consultarContratos(request);
    }

    @POST
    @Path("/crearSolicitudReactivacionContrato")
    public ResponseReactivacionContrato crearSolicitudReactivacionContrato(RequestCrearSolicitudReactivacionContrato request) {
    	return reactivacionContratosUtils.crearSolicitudReactivacionContrato(request);
    }

    @POST
    @Path("/modificarSolicitudReactivacionContrato")
    public ResponseReactivacionContrato modificarSolicitudReactivacionContrato(RequestCrearSolicitudReactivacionContrato request) {
    	return reactivacionContratosUtils.modificarSolicitudReactivacionContrato(request);
    }

    @POST
    @Path("/eliminarSolicitudReactivacionContrato")
    public ResponseReactivacionContrato eliminarSolicitudReactivacionContrato(RequestEliminarSolicitudReactivacionContrato request) {
    	return reactivacionContratosUtils.eliminarSolicitudReactivacionContrato(request);
    }
    
}
