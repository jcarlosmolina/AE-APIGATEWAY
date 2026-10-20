package com.keralty.ae.viewmodel.personac.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.PersonaCConstants;
import com.keralty.ae.persistence.Municipio;
import com.keralty.ae.persistence.oid.MunicipioOid;
import com.keralty.ae.persistence.oid.PersonaCOid;
import com.keralty.ae.persistence.PersonaC;

public class DelMunicipioCNacRequest {

    @JsonProperty("p_thispersonac_oid")
    private PersonaCOid personaCDelMunicipioCNacpthisPersonaC;
    
    @JsonIgnore
    private PersonaC personaCDelMunicipioCNacpthisPersonaCInstance;

    @JsonProperty("p_evcmunicipio_oid")
    private MunicipioOid personaCDelMunicipioCNacpevcMunicipio;
    
    @JsonIgnore
    private Municipio personaCDelMunicipioCNacpevcMunicipioInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkPersonaCDelMunicipioCNacpthisPersonaC();
        checkPersonaCDelMunicipioCNacpevcMunicipio();
    }

    @JsonIgnore
    public PersonaCOid getPersonaCDelMunicipioCNacpthisPersonaC() {
        return this.personaCDelMunicipioCNacpthisPersonaC;
    }
    
    public void setPersonaCDelMunicipioCNacpthisPersonaC(PersonaCOid personaCDelMunicipioCNacpthisPersonaC) {
        this.personaCDelMunicipioCNacpthisPersonaC = personaCDelMunicipioCNacpthisPersonaC;
    }

    @JsonIgnore
    public PersonaC getPersonaCDelMunicipioCNacpthisPersonaCInstance() {
        return this.personaCDelMunicipioCNacpthisPersonaCInstance;
    }
    
    public void setPersonaCDelMunicipioCNacpthisPersonaCInstance(PersonaC personaCDelMunicipioCNacpthisPersonaC) {
        this.personaCDelMunicipioCNacpthisPersonaCInstance = personaCDelMunicipioCNacpthisPersonaC;
        this.personaCDelMunicipioCNacpthisPersonaC = personaCDelMunicipioCNacpthisPersonaC != null ? personaCDelMunicipioCNacpthisPersonaC.getOid() : null;
    }

    private void checkPersonaCDelMunicipioCNacpthisPersonaC() throws NotNullArgumentException {
        if(this.getPersonaCDelMunicipioCNacpthisPersonaCInstance() == null || this.getPersonaCDelMunicipioCNacpthisPersonaCInstance().isNull()) {
            throw new NotNullArgumentException(PersonaCConstants.SERV_ID_DELMUNICIPIOCNAC, PersonaCConstants.CLASS_ID, PersonaCConstants.ARG_ID_DELMUNICIPIOCNAC_PERSONACDELMUNICIPIOCNACPTHISPERSONAC, PersonaCConstants.SERV_ALIAS_DELMUNICIPIOCNAC, PersonaCConstants.CLASS_ALIAS, PersonaCConstants.ARG_ALIAS_DELMUNICIPIOCNAC_PERSONACDELMUNICIPIOCNACPTHISPERSONAC);
        }
    }

    @JsonIgnore
    public MunicipioOid getPersonaCDelMunicipioCNacpevcMunicipio() {
        return this.personaCDelMunicipioCNacpevcMunicipio;
    }
    
    public void setPersonaCDelMunicipioCNacpevcMunicipio(MunicipioOid personaCDelMunicipioCNacpevcMunicipio) {
        this.personaCDelMunicipioCNacpevcMunicipio = personaCDelMunicipioCNacpevcMunicipio;
    }

    @JsonIgnore
    public Municipio getPersonaCDelMunicipioCNacpevcMunicipioInstance() {
        return this.personaCDelMunicipioCNacpevcMunicipioInstance;
    }
    
    public void setPersonaCDelMunicipioCNacpevcMunicipioInstance(Municipio personaCDelMunicipioCNacpevcMunicipio) {
        this.personaCDelMunicipioCNacpevcMunicipioInstance = personaCDelMunicipioCNacpevcMunicipio;
        this.personaCDelMunicipioCNacpevcMunicipio = personaCDelMunicipioCNacpevcMunicipio != null ? personaCDelMunicipioCNacpevcMunicipio.getOid() : null;
    }

    private void checkPersonaCDelMunicipioCNacpevcMunicipio() throws NotNullArgumentException {
        if(this.getPersonaCDelMunicipioCNacpevcMunicipioInstance() == null || this.getPersonaCDelMunicipioCNacpevcMunicipioInstance().isNull()) {
            throw new NotNullArgumentException(PersonaCConstants.SERV_ID_DELMUNICIPIOCNAC, PersonaCConstants.CLASS_ID, PersonaCConstants.ARG_ID_DELMUNICIPIOCNAC_PERSONACDELMUNICIPIOCNACPEVCMUNICIPIO, PersonaCConstants.SERV_ALIAS_DELMUNICIPIOCNAC, PersonaCConstants.CLASS_ALIAS, PersonaCConstants.ARG_ALIAS_DELMUNICIPIOCNAC_PERSONACDELMUNICIPIOCNACPEVCMUNICIPIO);
        }
    }
}
