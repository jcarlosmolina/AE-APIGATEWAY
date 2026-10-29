package com.keralty.integraciones.patient.createupdatequestionnare.request;

import com.fasterxml.jackson.annotation.*;

public class QuestionnaireEntry {
    private QuestionanaireResource resource;

    @JsonProperty("resource")
    public QuestionanaireResource getResource() { return resource; }
    @JsonProperty("resource")
    public void setResource(QuestionanaireResource value) { this.resource = value; }
    
    @JsonIgnore
	public void asignarIdentificacion(String tipoIdentificacion, String numeroIdentificacion) {
    	setResource(new QuestionanaireResource());
    	getResource().asignarIdentificacion(tipoIdentificacion, numeroIdentificacion);
	}
    
    @JsonIgnore
    public void anyadirRespuesta(String numPregunta, Boolean valorBool, String valorString) {
    	getResource().anyadirRespuesta(numPregunta, valorBool, valorString);
    }

}
