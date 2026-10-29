package com.keralty.integraciones.patient.updatebasicdata.request;

import com.fasterxml.jackson.annotation.*;

public class ValueAddress {
    private String city;

    @JsonProperty("city")
    public String getCity() { return city; }
    @JsonProperty("city")
    public void setCity(String value) { this.city = value; }
}
