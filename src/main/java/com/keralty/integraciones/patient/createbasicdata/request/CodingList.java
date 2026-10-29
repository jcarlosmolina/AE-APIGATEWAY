package com.keralty.integraciones.patient.createbasicdata.request;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class CodingList {
    private List<Coding> coding;

    @JsonProperty("coding")
    public List<Coding> getCoding() { return coding; }
    @JsonProperty("coding")
    public void setCoding(List<Coding> value) { this.coding = value; }
    
    public void addCoding(Coding coding) {
    	this.coding.add(coding);
    }
}
