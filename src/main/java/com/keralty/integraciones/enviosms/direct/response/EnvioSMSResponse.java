package com.keralty.integraciones.enviosms.direct.response;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EnvioSMSResponse {
    private List<Message> messages;

    @JsonProperty("messages")
    public List<Message> getMessages() { return messages; }
    @JsonProperty("messages")
    public void setMessages(List<Message> value) { this.messages = value; }
}
