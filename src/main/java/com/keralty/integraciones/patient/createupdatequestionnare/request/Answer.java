package com.keralty.integraciones.patient.createupdatequestionnare.request;

import com.fasterxml.jackson.annotation.*;

public class Answer {
    private String valueString;

    @JsonProperty("valueString")
    public String getValueString() { return valueString; }
    @JsonProperty("valueString")
    public void setValueString(String value) { this.valueString = value; }
}
