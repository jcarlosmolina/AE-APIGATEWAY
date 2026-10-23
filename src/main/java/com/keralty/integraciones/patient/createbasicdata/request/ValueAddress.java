package com.keralty.integraciones.patient.createbasicdata.request;

import com.fasterxml.jackson.annotation.*;

public class ValueAddress {
    private City city;
    private City state;

    @JsonProperty("city")
    public City getCity() { return city; }
    @JsonProperty("city")
    public void setCity(City value) { this.city = value; }

    @JsonProperty("state")
    public City getState() { return state; }
    @JsonProperty("state")
    public void setState(City value) { this.state = value; }
}
