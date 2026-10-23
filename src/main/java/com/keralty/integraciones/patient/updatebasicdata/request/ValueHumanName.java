package com.keralty.integraciones.patient.updatebasicdata.request;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class ValueHumanName {
    private List<NameElement> name;

    @JsonProperty("name")
    public List<NameElement> getName() { return name; }
    @JsonProperty("name")
    public void setName(List<NameElement> value) { this.name = value; }
}
