package com.keralty.integraciones.patient.createupdatequestionnare.request;

import com.fasterxml.jackson.annotation.*;

import java.util.ArrayList;
import java.util.List;

public class ResourceItem {
    private List<ItemItem> item;

    @JsonProperty("item")
    public List<ItemItem> getItem() { return item; }
    @JsonProperty("item")
    public void setItem(List<ItemItem> value) { this.item = value; }
    
    @JsonIgnore
    public void anyadirRespuesta(String numPregunta, Boolean valorBool, String valorString) {
    	if (getItem() == null) {
    		setItem(new ArrayList<ItemItem>());
    	}
    	
    	ItemItem item = new ItemItem();
    	item.anyadirRespuesta(numPregunta, valorBool, valorString);
    	getItem().add(item);
    }
}
