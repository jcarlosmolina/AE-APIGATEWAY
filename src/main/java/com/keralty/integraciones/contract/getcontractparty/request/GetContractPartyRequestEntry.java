package com.keralty.integraciones.contract.getcontractparty.request;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class GetContractPartyRequestEntry {
    private String resourceType = "Bundle";
    private String type = "transaction";
    private List<EntryElement> entry;

    @JsonProperty("resourceType")
    public String getResourceType() { return resourceType; }

    @JsonProperty("type")
    public String getType() { return type; }

    @JsonProperty("entry")
    public List<EntryElement> getEntry() { return entry; }
    @JsonProperty("entry")
    public void setEntry(List<EntryElement> value) { this.entry = value; }
    
    public void addEntry(EntryElement entry) {
    	this.entry.add(entry);
    }
}
