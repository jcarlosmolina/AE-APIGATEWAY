package com.keralty.integraciones.contract.getcontractparty.request;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.*;

public class GetContractPartyRequest {
    private String resourceType = "Bundle";
    private String type = "transaction";
    private GetContractPartyRequestEntry entry;

    @JsonProperty("resourceType")
    public String getResourceType() { return resourceType; }

    @JsonProperty("type")
    public String getType() { return type; }

    @JsonProperty("entry")
    public GetContractPartyRequestEntry getEntry() { return entry; }
    @JsonProperty("entry")
    public void setEntry(GetContractPartyRequestEntry value) { this.entry = value; }
    
    
    @JsonIgnore
    public void asignarInfoContrato(String codProducto, String codPlan, String numeroContrato) {
    	setEntry(new GetContractPartyRequestEntry());
    	getEntry().setEntry(new ArrayList<EntryElement>());
    	
    	// Plan
    	EntryElement entryEntry = new EntryElement();
		getEntry().getEntry().add(entryEntry );
		entryEntry.setRequest(new Request());
		entryEntry.getRequest().setURL("Contract?identifier=SIE000000063/PLAN|" + codPlan + "?_include=Contract:term.offer.party?_include=Contract:supportingInfo");
    	
    	// Producto
    	entryEntry = new EntryElement();
		getEntry().getEntry().add(entryEntry );
		entryEntry.setRequest(new Request());
		entryEntry.getRequest().setURL("Contract?identifier=SIE000000063/PRODUCTO|" + codProducto + "?_include=Contract:term.offer.party?_include=Contract:supportingInfo");

    	// Num Contrato
    	entryEntry = new EntryElement();
		getEntry().getEntry().add(entryEntry );
		entryEntry.setRequest(new Request());
		entryEntry.getRequest().setURL("Contract?identifier=SIE0000000063/NUMEROCONTRATO|" + numeroContrato + "?_include=Contract:supportingInfo");
    }
}
