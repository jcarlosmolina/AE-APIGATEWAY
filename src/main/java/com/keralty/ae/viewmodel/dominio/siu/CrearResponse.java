package com.keralty.ae.viewmodel.dominio.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.persistence.Dominio;
import com.keralty.ae.persistence.oid.DominioOid;
import com.keralty.ae.viewmodel.ServiceResponse;
import java.util.HashMap;
import java.util.Map;

public class CrearResponse extends ServiceResponse {


    @JsonProperty("ps_dominio")
    private DominioOid dominiocrearpsDominio;
    
    @JsonIgnore
    private Dominio dominiocrearpsDominioInstance;

    public CrearResponse() {
        super();
    }

    @JsonIgnore
    public DominioOid getDominiocrearpsDominio() {
        return this.dominiocrearpsDominio;
    }
    
    public void setDominiocrearpsDominio(DominioOid dominiocrearpsDominio) {
        this.dominiocrearpsDominio = dominiocrearpsDominio;
    }
    @JsonIgnore
    public Dominio getDominiocrearpsDominioInstance() {
        return this.dominiocrearpsDominioInstance;
    }
    
    public void setDominiocrearpsDominioInstance(Dominio dominiocrearpsDominio) {
        if (dominiocrearpsDominio != null && !dominiocrearpsDominio.isNull()) {
            this.dominiocrearpsDominio = dominiocrearpsDominio.getOid();
            this.dominiocrearpsDominioInstance = dominiocrearpsDominio;
        } else {
            this.dominiocrearpsDominio = null;
            this.dominiocrearpsDominioInstance = null;
        }
    }

    @Override
    public Map<String, Object> buildOutArgs() {
        Map<String, Object> outArgs = new HashMap<>();
        outArgs.put("dominiocrearpsDominio", dominiocrearpsDominio);
        return outArgs;
    }
}
