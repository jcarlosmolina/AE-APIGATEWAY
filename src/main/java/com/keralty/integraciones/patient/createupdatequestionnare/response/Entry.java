package com.keralty.integraciones.patient.createupdatequestionnare.response;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Entry {
    private ResponseClass response;

    @JsonProperty("response")
    public ResponseClass getResponse() { return response; }
    @JsonProperty("response")
    public void setResponse(ResponseClass value) { this.response = value; }
}
