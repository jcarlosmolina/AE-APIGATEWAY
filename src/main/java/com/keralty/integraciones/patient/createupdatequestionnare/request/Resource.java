package com.keralty.integraciones.patient.createupdatequestionnare.request;

import com.fasterxml.jackson.annotation.*;

import java.util.ArrayList;
import java.util.List;

public class Resource {
    private String resourceType = "QuestionnaireResponse";
    private String status = "completed";
    private Subject subject;
    private List<ResourceItem> item;

    @JsonProperty("resourceType")
    public String getResourceType() { return resourceType; }
    @JsonProperty("resourceType")
    public void setResourceType(String value) { this.resourceType = value; }

    @JsonProperty("status")
    public String getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(String value) { this.status = value; }

    @JsonProperty("subject")
    public Subject getSubject() { return subject; }
    @JsonProperty("subject")
    public void setSubject(Subject value) { this.subject = value; }

    @JsonProperty("item")
    public List<ResourceItem> getItem() { return item; }
    @JsonProperty("item")
    public void setItem(List<ResourceItem> value) { this.item = value; }
    
    @JsonIgnore
	public void asignarIdentificacion(String tipoIdentificacion, String numeroIdentificacion) {
    	setSubject(new Subject());
    	getSubject().asignarIdentificacion(tipoIdentificacion, numeroIdentificacion);
	}
    
    @JsonIgnore
    public void anyadirRespuesta(String numPregunta, Boolean valorBool, String valorString) {
    	if (getItem() == null) {
    		setItem(new ArrayList<ResourceItem>());
    	}
    	if (getItem().isEmpty()) {
    		getItem().add(new ResourceItem());
    	}
    	ResourceItem item = getItem().get(0);
    	item.anyadirRespuesta(numPregunta, valorBool, valorString);
    	//getItem().add(item);
    }

}
