package com.keralty.integraciones.patient.createbasicdata.response;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Resource {
    private Text text;

    @JsonProperty("text")
	public Text getText() { return text; }
    @JsonProperty("text")
	public void setText(Text text) { this.text = text; }
    
    
}
