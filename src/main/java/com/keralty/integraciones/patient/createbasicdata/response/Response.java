package com.keralty.integraciones.patient.createbasicdata.response;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {
    private String status;
    private String location;
    private String etag;
    private Outcome outcome;

    @JsonProperty("status")
    public String getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(String value) { this.status = value; }

    @JsonProperty("location")
    public String getLocation() { return location; }
    @JsonProperty("location")
    public void setLocation(String value) { this.location = value; }

    @JsonProperty("etag")
    public String getEtag() { return etag; }
    @JsonProperty("etag")
    public void setEtag(String value) { this.etag = value; }

    @JsonProperty("outcome")
    public Outcome getOutcome() { return outcome; }
    @JsonProperty("outcome")
    public void setOutcome(Outcome value) { this.outcome = value; }
}
