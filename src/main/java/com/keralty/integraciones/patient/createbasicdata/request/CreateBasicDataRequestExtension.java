package com.keralty.integraciones.patient.createbasicdata.request;

import com.fasterxml.jackson.annotation.*;

public class CreateBasicDataRequestExtension {
    private String url;
    private ValueAddress valueAddress;

    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }

    @JsonProperty("valueAddress")
    public ValueAddress getValueAddress() { return valueAddress; }
    @JsonProperty("valueAddress")
    public void setValueAddress(ValueAddress value) { this.valueAddress = value; }
}
