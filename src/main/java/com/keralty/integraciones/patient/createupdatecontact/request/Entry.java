package com.keralty.integraciones.patient.createupdatecontact.request;

import com.fasterxml.jackson.annotation.*;

public class Entry {
    private String fullURL;
    private Resource resource;
    private Request request;

    @JsonProperty("fullURL")
    public String getFullURL() { return fullURL; }
    @JsonProperty("fullURL")
    public void setFullURL(String value) { this.fullURL = value; }

    @JsonProperty("resource")
    public Resource getResource() { return resource; }
    @JsonProperty("resource")
    public void setResource(Resource value) { this.resource = value; }

    @JsonProperty("request")
    public Request getRequest() { return request; }
    @JsonProperty("request")
    public void setRequest(Request value) { this.request = value; }
}
