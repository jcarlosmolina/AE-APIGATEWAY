package com.keralty.integraciones.patient.createupdatecontact.request;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Resource {
    private String resourceType;
    private List<Parameter> parameter;

    @JsonProperty("resourceType")
    public String getResourceType() { return resourceType; }
    @JsonProperty("resourceType")
    public void setResourceType(String value) { this.resourceType = value; }

    @JsonProperty("parameter")
    public List<Parameter> getParameter() { return parameter; }
    @JsonProperty("parameter")
    public void setParameter(List<Parameter> value) { this.parameter = value; }
    
    public void addParameter(Parameter parameter) {
    	this.parameter.add(parameter);
    }
}
