package com.keralty.integraciones.patient.updatebasicdata.request;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class NameElement {
    private String family;
    private List<Extension> extension;
    private String given;

    @JsonProperty("family")
    public String getFamily() { return family; }
    @JsonProperty("family")
    public void setFamily(String value) { this.family = value; }

    @JsonProperty("extension")
    public List<Extension> getExtension() { return extension; }
    @JsonProperty("extension")
    public void setExtension(List<Extension> value) { this.extension = value; }

    @JsonProperty("given")
    public String getGiven() { return given; }
    @JsonProperty("given")
    public void setGiven(String value) { this.given = value; }
}
