package com.keralty.integraciones.patient.createbasicdata.response;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateBasicDataResponse {
    private String resourceType;
    private String id;
    private String type;
    private List<Link> link;
    private List<Entry> entry;

    @JsonProperty("resourceType")
    public String getResourceType() { return resourceType; }
    @JsonProperty("resourceType")
    public void setResourceType(String value) { this.resourceType = value; }

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("link")
    public List<Link> getLink() { return link; }
    @JsonProperty("link")
    public void setLink(List<Link> value) { this.link = value; }

    @JsonProperty("entry")
    public List<Entry> getEntry() { return entry; }
    @JsonProperty("entry")
    public void setEntry(List<Entry> value) { this.entry = value; }
    
    @JsonIgnore
	public boolean isError() {
    	
    	boolean resultado = false;
    	if (getEntry() != null && !getEntry().isEmpty() ) {
    		Entry entry = getEntry().get(0);
    		if (entry.getResponse() != null && entry.getResponse().getStatus() != null && entry.getResponse().getStatus().equalsIgnoreCase("200 OK")) {
    			resultado = false;
    		}
    		if (entry.getResource() != null && entry.getResource().getText() != null && 
    				entry.getResource().getText().getDiv() != null) {
    			resultado = true;
    		}
    	} 
		
		return resultado;
	}
    
    @JsonIgnore
	public String getTextoError() {
    	String textoError = "";
    	if (getEntry() != null && !getEntry().isEmpty() ) {
    		Entry entry = getEntry().get(0);
    		if (entry.getResource() != null && entry.getResource().getText() != null && 
    				entry.getResource().getText().getDiv() != null && 
    				!entry.getResource().getText().getDiv().isEmpty() ) {
    			textoError = entry.getResource().getText().getDiv();
    		}
    	} 
		
		return textoError;
	}
}
