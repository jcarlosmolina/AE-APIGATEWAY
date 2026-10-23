package com.keralty.integraciones.patient.createupdatequestionnare.response;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Link {
    private String relation;
    private String url;

    @JsonProperty("relation")
    public String getRelation() { return relation; }
    @JsonProperty("relation")
    public void setRelation(String value) { this.relation = value; }

    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }
}
