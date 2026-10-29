package com.keralty.integraciones.patient.createupdatequestionnare.request;

import com.fasterxml.jackson.annotation.*;

import java.util.ArrayList;
import java.util.List;

public class QuestionanaireResource {
    private String resourceType = "Bundle";
    private List<ResourceEntry> entry;

    @JsonProperty("resourceType")
    public String getResourceType() { return resourceType; }
    @JsonProperty("resourceType")
    public void setResourceType(String value) { this.resourceType = value; }

    @JsonProperty("entry")
    public List<ResourceEntry> getEntry() { return entry; }
    @JsonProperty("entry")
    public void setEntry(List<ResourceEntry> value) { this.entry = value; }
    
    @JsonIgnore
	public void asignarIdentificacion(String tipoIdentificacion, String numeroIdentificacion) {
    	ResourceEntry entry = new ResourceEntry();
    	entry.asignarIdentificacion(tipoIdentificacion, numeroIdentificacion);
    	setEntry(new ArrayList<ResourceEntry>());
    	getEntry().add(entry);
	}
    
    @JsonIgnore
    public void anyadirRespuesta(String numPregunta, Boolean valorBool, String valorString) {
    	getEntry().get(0).anyadirRespuesta(numPregunta, valorBool, valorString);
    }
}
