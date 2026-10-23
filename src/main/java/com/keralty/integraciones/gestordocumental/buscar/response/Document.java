package com.keralty.integraciones.gestordocumental.buscar.response;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Document {
    private String className;
    private List<Property> properties;

    @JsonProperty("className")
    public String getClassName() { return className; }
    @JsonProperty("className")
    public void setClassName(String value) { this.className = value; }

    @JsonProperty("properties")
    public List<Property> getProperties() { return properties; }
    @JsonProperty("properties")
    public void setProperties(List<Property> value) { this.properties = value; }
	
    @JsonIgnore
    public String getProperyValueById(String id) {
    	if (getProperties() != null) {
    		for (Property prop : getProperties()) {
    			if (id.equals(prop.getID()) ) {
    				return prop.getValue();
    			}
    		}
    	}
		return "";
	}
}
