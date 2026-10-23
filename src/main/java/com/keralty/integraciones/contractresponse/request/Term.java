package com.keralty.integraciones.contractresponse.request;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Term {
    private Offer offer;

    @JsonProperty("offer")
    public Offer getOffer() { return offer; }
    @JsonProperty("offer")
    public void setOffer(Offer value) { this.offer = value; }
}
