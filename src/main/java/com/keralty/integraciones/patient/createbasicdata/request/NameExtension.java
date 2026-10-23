package com.keralty.integraciones.patient.createbasicdata.request;

import com.fasterxml.jackson.annotation.*;

public class NameExtension {
    private String url = "humanname-mothers-family";
    private String valueString;

    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }

    @JsonProperty("valueString")
    public String getValueString() { return valueString; }
    @JsonProperty("valueString")
    public void setValueString(String value) { this.valueString = value; }
}
