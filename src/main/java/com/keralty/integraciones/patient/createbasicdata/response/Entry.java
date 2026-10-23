package com.keralty.integraciones.patient.createbasicdata.response;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Entry {
    private Response response;

    private Resource resource;

    @JsonProperty("response")
    public Response getResponse() { return response; }
    @JsonProperty("response")
    public void setResponse(Response value) { this.response = value; }
	
    @JsonProperty("resource")
    public Resource getResource() { return resource; }
    @JsonProperty("resource")
	public void setResource(Resource resource) { this.resource = resource; }
    
    
}
