package com.keralty.ae.viewmodel.telefonoc.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.TelefonoCConstants;
import com.keralty.ae.persistence.oid.TelefonoCOid;
import com.keralty.ae.persistence.TelefonoC;

public class ModificarRequest {

    @JsonProperty("p_thistelefonoc_oid")
    private TelefonoCOid telefonoCmodificarpthisTelefonoC;
    
    @JsonIgnore
    private TelefonoC telefonoCmodificarpthisTelefonoCInstance;

    @JsonProperty("p_telefono")
    private String telefonoCmodificarpTelefono;

    @JsonProperty("p_indicativopais")
    private String telefonoCmodificarpIndicativoPais;

    @JsonProperty("p_codigoarea")
    private String telefonoCmodificarpCodigoArea;

    @JsonProperty("p_ext")
    private String telefonoCmodificarpExt;

    public void checkArguments() throws NotNullArgumentException {
        checkTelefonoCmodificarpthisTelefonoC();
    }

    @JsonIgnore
    public TelefonoCOid getTelefonoCmodificarpthisTelefonoC() {
        return this.telefonoCmodificarpthisTelefonoC;
    }
    
    public void setTelefonoCmodificarpthisTelefonoC(TelefonoCOid telefonoCmodificarpthisTelefonoC) {
        this.telefonoCmodificarpthisTelefonoC = telefonoCmodificarpthisTelefonoC;
    }

    @JsonIgnore
    public TelefonoC getTelefonoCmodificarpthisTelefonoCInstance() {
        return this.telefonoCmodificarpthisTelefonoCInstance;
    }
    
    public void setTelefonoCmodificarpthisTelefonoCInstance(TelefonoC telefonoCmodificarpthisTelefonoC) {
        this.telefonoCmodificarpthisTelefonoCInstance = telefonoCmodificarpthisTelefonoC;
        this.telefonoCmodificarpthisTelefonoC = telefonoCmodificarpthisTelefonoC != null ? telefonoCmodificarpthisTelefonoC.getOid() : null;
    }

    private void checkTelefonoCmodificarpthisTelefonoC() throws NotNullArgumentException {
        if(this.getTelefonoCmodificarpthisTelefonoCInstance() == null || this.getTelefonoCmodificarpthisTelefonoCInstance().isNull()) {
            throw new NotNullArgumentException(TelefonoCConstants.SERV_ID_MODIFICAR, TelefonoCConstants.CLASS_ID, TelefonoCConstants.ARG_ID_MODIFICAR_TELEFONOCMODIFICARPTHISTELEFONOC, TelefonoCConstants.SERV_ALIAS_MODIFICAR, TelefonoCConstants.CLASS_ALIAS, TelefonoCConstants.ARG_ALIAS_MODIFICAR_TELEFONOCMODIFICARPTHISTELEFONOC);
        }
    }

    @JsonIgnore
    public String getTelefonoCmodificarpTelefono() {
        return this.telefonoCmodificarpTelefono;
    }
    
    public void setTelefonoCmodificarpTelefono(String telefonoCmodificarpTelefono) {
        this.telefonoCmodificarpTelefono = telefonoCmodificarpTelefono;
    }

    @JsonIgnore
    public String getTelefonoCmodificarpIndicativoPais() {
        return this.telefonoCmodificarpIndicativoPais;
    }
    
    public void setTelefonoCmodificarpIndicativoPais(String telefonoCmodificarpIndicativoPais) {
        this.telefonoCmodificarpIndicativoPais = telefonoCmodificarpIndicativoPais;
    }

    @JsonIgnore
    public String getTelefonoCmodificarpCodigoArea() {
        return this.telefonoCmodificarpCodigoArea;
    }
    
    public void setTelefonoCmodificarpCodigoArea(String telefonoCmodificarpCodigoArea) {
        this.telefonoCmodificarpCodigoArea = telefonoCmodificarpCodigoArea;
    }

    @JsonIgnore
    public String getTelefonoCmodificarpExt() {
        return this.telefonoCmodificarpExt;
    }
    
    public void setTelefonoCmodificarpExt(String telefonoCmodificarpExt) {
        this.telefonoCmodificarpExt = telefonoCmodificarpExt;
    }
}
