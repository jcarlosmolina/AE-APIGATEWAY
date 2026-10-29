package com.keralty.integraciones.enviosms.direct.request;

import com.fasterxml.jackson.annotation.*;

public class EnvioSMSRequest {
    private String from;
    private String to;
    private String text;

    @JsonProperty("from")
    public String getFrom() { return from; }
    @JsonProperty("from")
    public void setFrom(String value) { this.from = value; }

    @JsonProperty("to")
    public String getTo() { return to; }
    @JsonProperty("to")
    public void setTo(String value) { this.to = value; }

    @JsonProperty("text")
    public String getText() { return text; }
    @JsonProperty("text")
    public void setText(String value) { this.text = value; }
}
