package com.keralty.integraciones.contract.getcontractparty.request;

import com.fasterxml.jackson.annotation.*;

public class EntryElement {
    private Request request;

    @JsonProperty("request")
    public Request getRequest() { return request; }
    @JsonProperty("request")
    public void setRequest(Request value) { this.request = value; }
}
