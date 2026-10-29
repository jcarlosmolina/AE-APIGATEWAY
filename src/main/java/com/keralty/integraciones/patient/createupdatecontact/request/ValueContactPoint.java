package com.keralty.integraciones.patient.createupdatecontact.request;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class ValueContactPoint {
    private List<Telecom> telecom;
    private List<Address> address;

    @JsonProperty("telecom")
    public List<Telecom> getTelecom() { return telecom; }
    @JsonProperty("telecom")
    public void setTelecom(List<Telecom> value) { this.telecom = value; }
    
    public void addTelecom(Telecom telecom) {
    	this.telecom.add(telecom);
    }

    @JsonProperty("address")
    public List<Address> getAddress() { return address; }
    @JsonProperty("address")
    public void setAddress(List<Address> value) { this.address = value; }
    
    public void addAddress(Address address) {
    	this.address.add(address);
    }
}
