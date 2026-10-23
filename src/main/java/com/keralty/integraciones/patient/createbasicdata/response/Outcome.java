package com.keralty.integraciones.patient.createbasicdata.response;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Outcome {
    private String resourceType;
    private List<Issue> issue;

    @JsonProperty("resourceType")
    public String getResourceType() { return resourceType; }
    @JsonProperty("resourceType")
    public void setResourceType(String value) { this.resourceType = value; }

    @JsonProperty("issue")
    public List<Issue> getIssue() { return issue; }
    @JsonProperty("issue")
    public void setIssue(List<Issue> value) { this.issue = value; }
}
