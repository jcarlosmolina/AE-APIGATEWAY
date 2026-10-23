package com.keralty.integraciones.patient.createbasicdata.response;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Issue {
    private String severity;
    private String code;
    private Details details;

    @JsonProperty("severity")
    public String getSeverity() { return severity; }
    @JsonProperty("severity")
    public void setSeverity(String value) { this.severity = value; }

    @JsonProperty("code")
    public String getCode() { return code; }
    @JsonProperty("code")
    public void setCode(String value) { this.code = value; }

    @JsonProperty("details")
    public Details getDetails() { return details; }
    @JsonProperty("details")
    public void setDetails(Details value) { this.details = value; }
}
