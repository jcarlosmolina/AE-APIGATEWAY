package com.keralty.ae.viewmodel.admin.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICAdmin {

    @JsonProperty("primernombre")
    private String iCAdminPrimerNombre;

    @JsonProperty("segundonombre")
    private String iCAdminSegundoNombre;

    @JsonProperty("primerapellido")
    private String iCAdminPrimerApellido;

    public ICAdmin() {
    
    }

    @JsonIgnore
    public String getICAdminPrimerNombre() {
        return this.iCAdminPrimerNombre;
    }
    
    public void setICAdminPrimerNombre(String iCAdminPrimerNombre) {
        this.iCAdminPrimerNombre = iCAdminPrimerNombre;
    }

    @JsonIgnore
    public String getICAdminSegundoNombre() {
        return this.iCAdminSegundoNombre;
    }
    
    public void setICAdminSegundoNombre(String iCAdminSegundoNombre) {
        this.iCAdminSegundoNombre = iCAdminSegundoNombre;
    }

    @JsonIgnore
    public String getICAdminPrimerApellido() {
        return this.iCAdminPrimerApellido;
    }
    
    public void setICAdminPrimerApellido(String iCAdminPrimerApellido) {
        this.iCAdminPrimerApellido = iCAdminPrimerApellido;
    }
}
