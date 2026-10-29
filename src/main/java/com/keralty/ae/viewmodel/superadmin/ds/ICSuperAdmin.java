package com.keralty.ae.viewmodel.superadmin.ds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
public class ICSuperAdmin {

    @JsonProperty("primernombre")
    private String iCSuperAdminPrimerNombre;

    @JsonProperty("segundonombre")
    private String iCSuperAdminSegundoNombre;

    @JsonProperty("primerapellido")
    private String iCSuperAdminPrimerApellido;

    public ICSuperAdmin() {
    
    }

    @JsonIgnore
    public String getICSuperAdminPrimerNombre() {
        return this.iCSuperAdminPrimerNombre;
    }
    
    public void setICSuperAdminPrimerNombre(String iCSuperAdminPrimerNombre) {
        this.iCSuperAdminPrimerNombre = iCSuperAdminPrimerNombre;
    }

    @JsonIgnore
    public String getICSuperAdminSegundoNombre() {
        return this.iCSuperAdminSegundoNombre;
    }
    
    public void setICSuperAdminSegundoNombre(String iCSuperAdminSegundoNombre) {
        this.iCSuperAdminSegundoNombre = iCSuperAdminSegundoNombre;
    }

    @JsonIgnore
    public String getICSuperAdminPrimerApellido() {
        return this.iCSuperAdminPrimerApellido;
    }
    
    public void setICSuperAdminPrimerApellido(String iCSuperAdminPrimerApellido) {
        this.iCSuperAdminPrimerApellido = iCSuperAdminPrimerApellido;
    }
}
