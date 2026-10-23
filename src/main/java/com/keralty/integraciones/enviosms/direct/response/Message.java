package com.keralty.integraciones.enviosms.direct.response;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Message {
    private String messageID;
    private String to;
    private Status status;

    @JsonProperty("messageId")
    public String getMessageID() { return messageID; }
    @JsonProperty("messageId")
    public void setMessageID(String value) { this.messageID = value; }

    @JsonProperty("to")
    public String getTo() { return to; }
    @JsonProperty("to")
    public void setTo(String value) { this.to = value; }

    @JsonProperty("status")
    public Status getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(Status value) { this.status = value; }
}
