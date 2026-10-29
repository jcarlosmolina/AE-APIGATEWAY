package com.keralty.integraciones.contractresponse.request;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ContractElement {
    private List<Object> legallyBinding;
    private String status;
    private List<Term> term;
    private List<Incident> beneficiaryRemarks;

    @JsonProperty("legallyBinding")
    public List<Object> getLegallyBinding() { return legallyBinding; }
    @JsonProperty("legallyBinding")
    public void setLegallyBinding(List<Object> value) { this.legallyBinding = value; }

    @JsonProperty("status")
    public String getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(String value) { this.status = value; }

    @JsonProperty("term")
    public List<Term> getTerm() { return term; }
    @JsonProperty("term")
    public void setTerm(List<Term> value) { this.term = value; }

    @JsonProperty("beneficiaryRemarks")
    public List<Incident> getBeneficiaryRemarks() { return beneficiaryRemarks; }
    @JsonProperty("beneficiaryRemarks")
    public void setBeneficiaryRemarks(List<Incident> value) { this.beneficiaryRemarks = value; }
}
