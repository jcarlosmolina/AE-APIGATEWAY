package com.keralty.integraciones.patient.alerts.response;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ConsultAlertsResponse {
    private PersonAlerts personAlerts;

    @JsonProperty("personAlerts")
    public PersonAlerts getPersonAlerts() { return personAlerts; }
    @JsonProperty("personAlerts")
    public void setPersonAlerts(PersonAlerts value) { this.personAlerts = value; }
}
