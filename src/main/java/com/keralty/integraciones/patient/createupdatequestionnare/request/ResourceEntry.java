package com.keralty.integraciones.patient.createupdatequestionnare.request;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.*;

public class ResourceEntry {
    private Resource resource;
    private CreateUpdateQuestionnaireRequest request;

    @JsonProperty("resource")
    public Resource getResource() { return resource; }
    @JsonProperty("resource")
    public void setResource(Resource value) { this.resource = value; }

    @JsonProperty("request")
    public CreateUpdateQuestionnaireRequest getRequest() { return request; }
    @JsonProperty("request")
    public void setRequest(CreateUpdateQuestionnaireRequest value) { this.request = value; }
    
    @JsonIgnore
	public void asignarIdentificacion(String tipoIdentificacion, String numeroIdentificacion) {
    	setRequest(new CreateUpdateQuestionnaireRequest());
    	setResource(new Resource());
    	getRequest().asignarIdentificacion(tipoIdentificacion, numeroIdentificacion);
    	getResource().asignarIdentificacion(tipoIdentificacion, numeroIdentificacion);
	}
    
    @JsonIgnore
    public void anyadirRespuesta(String numPregunta, Boolean valorBool, String valorString) {
    	getResource().anyadirRespuesta(numPregunta, valorBool, valorString);
    }
}
