package com.keralty.integraciones.patient.updatebasicdata.request;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(content = Include.NON_NULL)
public class UpdateBasicDataRequest {
    private String resourceType = "Bundle";
    private String type = "transaction";
    private List<Entry> entry;

    @JsonProperty("resourceType")
    public String getResourceType() { return resourceType; }
    @JsonProperty("resourceType")
    public void setResourceType(String value) { this.resourceType = value; }

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("entry")
    public List<Entry> getEntry() { return entry; }
    @JsonProperty("entry")
    public void setEntry(List<Entry> value) { this.entry = value; }
    
    public void asignarIdentificacion(String codigo, String tipoIdentificacion, String numIdentificacion) {
    	
    	if (entry == null) {
    		entry = new ArrayList<Entry>();
    	}
    	
    	Entry ent = new Entry();
    	ent.asignarIdentificacion(codigo, tipoIdentificacion, numIdentificacion);
    	entry.add(ent);
    }    
}
