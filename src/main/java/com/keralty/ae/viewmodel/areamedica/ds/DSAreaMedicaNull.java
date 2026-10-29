package com.keralty.ae.viewmodel.areamedica.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class DSAreaMedicaNull {

    @JsonProperty("id")
    private Long dSAreaMedicaNullId;

    public DSAreaMedicaNull() {
    
    }

    @JsonIgnore
    public Long getDSAreaMedicaNullId() {
        return this.dSAreaMedicaNullId;
    }
    
    public void setDSAreaMedicaNullId(Long dSAreaMedicaNullId) {
        this.dSAreaMedicaNullId = dSAreaMedicaNullId;
    }
}
