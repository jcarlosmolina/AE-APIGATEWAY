package com.keralty.integraciones.patient.createupdatecontact.request;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Parameter {
    private String name;
    private List<Part> part;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("part")
    public List<Part> getPart() { return part; }
    @JsonProperty("part")
    public void setPart(List<Part> value) { this.part = value; }
}
