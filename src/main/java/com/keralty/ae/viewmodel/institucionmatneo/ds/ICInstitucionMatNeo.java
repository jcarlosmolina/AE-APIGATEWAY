package com.keralty.ae.viewmodel.institucionmatneo.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICInstitucionMatNeo {

    @JsonProperty("nombre")
    private String iCInstitucionMatNeoNombre;

    public ICInstitucionMatNeo() {
    
    }

    @JsonIgnore
    public String getICInstitucionMatNeoNombre() {
        return this.iCInstitucionMatNeoNombre;
    }
    
    public void setICInstitucionMatNeoNombre(String iCInstitucionMatNeoNombre) {
        this.iCInstitucionMatNeoNombre = iCInstitucionMatNeoNombre;
    }
}
