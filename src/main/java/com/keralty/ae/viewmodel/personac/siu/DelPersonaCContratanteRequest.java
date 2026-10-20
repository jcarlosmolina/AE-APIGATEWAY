package com.keralty.ae.viewmodel.personac.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.PersonaCConstants;
import com.keralty.ae.persistence.ContratoC;
import com.keralty.ae.persistence.oid.ContratoCOid;
import com.keralty.ae.persistence.oid.PersonaCOid;
import com.keralty.ae.persistence.PersonaC;

public class DelPersonaCContratanteRequest {

    @JsonProperty("p_thispersonac_oid")
    private PersonaCOid personaCDelPersonaCContratantepthisPersonaC;
    
    @JsonIgnore
    private PersonaC personaCDelPersonaCContratantepthisPersonaCInstance;

    @JsonProperty("p_evccontratoc_oid")
    private ContratoCOid personaCDelPersonaCContratantepevcContratoC;
    
    @JsonIgnore
    private ContratoC personaCDelPersonaCContratantepevcContratoCInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkPersonaCDelPersonaCContratantepthisPersonaC();
        checkPersonaCDelPersonaCContratantepevcContratoC();
    }

    @JsonIgnore
    public PersonaCOid getPersonaCDelPersonaCContratantepthisPersonaC() {
        return this.personaCDelPersonaCContratantepthisPersonaC;
    }
    
    public void setPersonaCDelPersonaCContratantepthisPersonaC(PersonaCOid personaCDelPersonaCContratantepthisPersonaC) {
        this.personaCDelPersonaCContratantepthisPersonaC = personaCDelPersonaCContratantepthisPersonaC;
    }

    @JsonIgnore
    public PersonaC getPersonaCDelPersonaCContratantepthisPersonaCInstance() {
        return this.personaCDelPersonaCContratantepthisPersonaCInstance;
    }
    
    public void setPersonaCDelPersonaCContratantepthisPersonaCInstance(PersonaC personaCDelPersonaCContratantepthisPersonaC) {
        this.personaCDelPersonaCContratantepthisPersonaCInstance = personaCDelPersonaCContratantepthisPersonaC;
        this.personaCDelPersonaCContratantepthisPersonaC = personaCDelPersonaCContratantepthisPersonaC != null ? personaCDelPersonaCContratantepthisPersonaC.getOid() : null;
    }

    private void checkPersonaCDelPersonaCContratantepthisPersonaC() throws NotNullArgumentException {
        if(this.getPersonaCDelPersonaCContratantepthisPersonaCInstance() == null || this.getPersonaCDelPersonaCContratantepthisPersonaCInstance().isNull()) {
            throw new NotNullArgumentException(PersonaCConstants.SERV_ID_DELPERSONACCONTRATANTE, PersonaCConstants.CLASS_ID, PersonaCConstants.ARG_ID_DELPERSONACCONTRATANTE_PERSONACDELPERSONACCONTRATANTEPTHISPERSONAC, PersonaCConstants.SERV_ALIAS_DELPERSONACCONTRATANTE, PersonaCConstants.CLASS_ALIAS, PersonaCConstants.ARG_ALIAS_DELPERSONACCONTRATANTE_PERSONACDELPERSONACCONTRATANTEPTHISPERSONAC);
        }
    }

    @JsonIgnore
    public ContratoCOid getPersonaCDelPersonaCContratantepevcContratoC() {
        return this.personaCDelPersonaCContratantepevcContratoC;
    }
    
    public void setPersonaCDelPersonaCContratantepevcContratoC(ContratoCOid personaCDelPersonaCContratantepevcContratoC) {
        this.personaCDelPersonaCContratantepevcContratoC = personaCDelPersonaCContratantepevcContratoC;
    }

    @JsonIgnore
    public ContratoC getPersonaCDelPersonaCContratantepevcContratoCInstance() {
        return this.personaCDelPersonaCContratantepevcContratoCInstance;
    }
    
    public void setPersonaCDelPersonaCContratantepevcContratoCInstance(ContratoC personaCDelPersonaCContratantepevcContratoC) {
        this.personaCDelPersonaCContratantepevcContratoCInstance = personaCDelPersonaCContratantepevcContratoC;
        this.personaCDelPersonaCContratantepevcContratoC = personaCDelPersonaCContratantepevcContratoC != null ? personaCDelPersonaCContratantepevcContratoC.getOid() : null;
    }

    private void checkPersonaCDelPersonaCContratantepevcContratoC() throws NotNullArgumentException {
        if(this.getPersonaCDelPersonaCContratantepevcContratoCInstance() == null || this.getPersonaCDelPersonaCContratantepevcContratoCInstance().isNull()) {
            throw new NotNullArgumentException(PersonaCConstants.SERV_ID_DELPERSONACCONTRATANTE, PersonaCConstants.CLASS_ID, PersonaCConstants.ARG_ID_DELPERSONACCONTRATANTE_PERSONACDELPERSONACCONTRATANTEPEVCCONTRATOC, PersonaCConstants.SERV_ALIAS_DELPERSONACCONTRATANTE, PersonaCConstants.CLASS_ALIAS, PersonaCConstants.ARG_ALIAS_DELPERSONACCONTRATANTE_PERSONACDELPERSONACCONTRATANTEPEVCCONTRATOC);
        }
    }
}
