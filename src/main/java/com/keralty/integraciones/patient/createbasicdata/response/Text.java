package com.keralty.integraciones.patient.createbasicdata.response;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Text {
    private String div;

    @JsonProperty("div")
	public String getDiv() { return div; }
    @JsonProperty("div")
	public void setDiv(String div) { this.div = div; }
    
}
