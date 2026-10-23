package com.keralty.integraciones.contractresponse.request;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Coverage {
    private Suscriber suscriber;
    private List<ContractElement> contract;

    @JsonProperty("suscriber")
    public Suscriber getSuscriber() { return suscriber; }
    @JsonProperty("suscriber")
    public void setSuscriber(Suscriber value) { this.suscriber = value; }

    @JsonProperty("contract")
    public List<ContractElement> getContract() { return contract; }
    @JsonProperty("contract")
    public void setContract(List<ContractElement> value) { this.contract = value; }
}
