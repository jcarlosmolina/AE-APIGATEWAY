package com.keralty.integraciones.patient.createupdatequestionnare.request;

import com.fasterxml.jackson.annotation.*;

import java.util.ArrayList;
import java.util.List;

public class CreateUpdateRequest {
	
    private String resourceType = "Bundle";
    private String type = "transaction";
    private List<QuestionnaireEntry> entry;

    @JsonProperty("resourceType")
    public String getResourceType() { return resourceType; }
    @JsonProperty("resourceType")
    public void setResourceType(String value) { this.resourceType = value; }

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("entry")
    public List<QuestionnaireEntry> getEntry() { return entry; }
    @JsonProperty("entry")
    public void setEntry(List<QuestionnaireEntry> value) { this.entry = value; }
    
    @JsonIgnore
	public void asignarIdentificacion(String tipoIdentificacion, String numeroIdentificacion) {
    	setEntry(new ArrayList<QuestionnaireEntry>());
    	QuestionnaireEntry entry = new QuestionnaireEntry();
    	entry.asignarIdentificacion(tipoIdentificacion, numeroIdentificacion);
    	getEntry().add(entry);
	}
    
    @JsonIgnore
    public void anyadirRespuesta(String numPregunta, Boolean valorBool, String valorString) {
    	getEntry().get(0).anyadirRespuesta(numPregunta, valorBool, valorString);
    }

}
