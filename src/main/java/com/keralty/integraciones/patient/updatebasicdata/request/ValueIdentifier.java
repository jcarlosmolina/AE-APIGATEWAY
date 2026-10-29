package com.keralty.integraciones.patient.updatebasicdata.request;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class ValueIdentifier {
    private List<Identifier> identifier;

    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() { return identifier; }
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> value) { this.identifier = value; }
    
    public void addIdentifier(Identifier identifier) {
    	this.identifier.add(identifier);
    }
}
