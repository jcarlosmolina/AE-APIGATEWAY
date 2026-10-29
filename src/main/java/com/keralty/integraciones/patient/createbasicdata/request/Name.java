package com.keralty.integraciones.patient.createbasicdata.request;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Name {
    private String family;
    private List<NameExtension> extension;
    private List<String> given;

    @JsonProperty("family")
    public String getFamily() { return family; }
    @JsonProperty("family")
    public void setFamily(String value) { this.family = value; }

    @JsonProperty("extension")
    public List<NameExtension> getExtension() { return extension; }
    @JsonProperty("extension")
    public void setExtension(List<NameExtension> value) { this.extension = value; }
    
    public void addExtension(NameExtension extension) {
    	this.extension.add(extension);
    }

    @JsonProperty("given")
    public List<String> getGiven() { return given; }
    @JsonProperty("given")
    public void setGiven(List<String> value) { this.given = value; }
    
    public void addGiven(String given) {
    	this.given.add(given);
    }
}
