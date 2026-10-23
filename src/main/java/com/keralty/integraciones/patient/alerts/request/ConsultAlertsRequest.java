package com.keralty.integraciones.patient.alerts.request;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class ConsultAlertsRequest {
    private List<Identifier> identifier;
    private String alerType;

    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() { return identifier; }
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> value) { this.identifier = value; }

    @JsonProperty("alerType")
    public String getAlerType() { return alerType; }
    @JsonProperty("alerType")
    public void setAlerType(String value) { this.alerType = value; }
}
