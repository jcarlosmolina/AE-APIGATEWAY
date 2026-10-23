package com.keralty.integraciones.contractresponse.request;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestContract {
    private List<Identifier> identifier;
    private String familyStatus;
    private String answer;
    private String closeRequest;
    private List<Incident> incidents;
    private String status;

    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() { return identifier; }
    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> value) { this.identifier = value; }

    @JsonProperty("familyStatus")
    public String getFamilyStatus() { return familyStatus; }
    @JsonProperty("familyStatus")
    public void setFamilyStatus(String value) { this.familyStatus = value; }

    @JsonProperty("answer")
    public String getAnswer() { return answer; }
    @JsonProperty("answer")
    public void setAnswer(String value) { this.answer = value; }


    @JsonProperty("closeRequest")
    public String getCloseRequest() { return closeRequest; }
    @JsonProperty("closeRequest")
    public void setCloseRequest(String value) { this.closeRequest = value; }

    @JsonProperty("incidents")
    public List<Incident> getIncidents() { return incidents; }
    @JsonProperty("incidents")
    public void setIncidents(List<Incident> value) { this.incidents = value; }

    @JsonProperty("status")
    public String getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(String value) { this.status = value; }
}
