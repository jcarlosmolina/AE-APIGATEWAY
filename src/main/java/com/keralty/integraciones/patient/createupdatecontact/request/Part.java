package com.keralty.integraciones.patient.createupdatecontact.request;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Part {
    private String name;
    private String valueCode;
    private String valueString;
    private List<ValueContactPoint> valueContactPoint;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("valueCode")
    public String getValueCode() { return valueCode; }
    @JsonProperty("valueCode")
    public void setValueCode(String value) { this.valueCode = value; }

    @JsonProperty("valueString")
    public String getValueString() { return valueString; }
    @JsonProperty("valueString")
    public void setValueString(String value) { this.valueString = value; }

    @JsonProperty("valueContactPoint")
    public List<ValueContactPoint> getValueContactPoint() { return valueContactPoint; }
    @JsonProperty("valueContactPoint")
    public void setValueContactPoint(List<ValueContactPoint> value) { this.valueContactPoint = value; }
}
