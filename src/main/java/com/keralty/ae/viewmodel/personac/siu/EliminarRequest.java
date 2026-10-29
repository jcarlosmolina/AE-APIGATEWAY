package com.keralty.ae.viewmodel.personac.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.PersonaCConstants;
import com.keralty.ae.persistence.oid.PersonaCOid;
import com.keralty.ae.persistence.PersonaC;

public class EliminarRequest {

    @JsonProperty("p_thispersonac_oid")
    private PersonaCOid personaCeliminarpthisPersonaC;
    
    @JsonIgnore
    private PersonaC personaCeliminarpthisPersonaCInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkPersonaCeliminarpthisPersonaC();
    }

    @JsonIgnore
    public PersonaCOid getPersonaCeliminarpthisPersonaC() {
        return this.personaCeliminarpthisPersonaC;
    }
    
    public void setPersonaCeliminarpthisPersonaC(PersonaCOid personaCeliminarpthisPersonaC) {
        this.personaCeliminarpthisPersonaC = personaCeliminarpthisPersonaC;
    }

    @JsonIgnore
    public PersonaC getPersonaCeliminarpthisPersonaCInstance() {
        return this.personaCeliminarpthisPersonaCInstance;
    }
    
    public void setPersonaCeliminarpthisPersonaCInstance(PersonaC personaCeliminarpthisPersonaC) {
        this.personaCeliminarpthisPersonaCInstance = personaCeliminarpthisPersonaC;
        this.personaCeliminarpthisPersonaC = personaCeliminarpthisPersonaC != null ? personaCeliminarpthisPersonaC.getOid() : null;
    }

    private void checkPersonaCeliminarpthisPersonaC() throws NotNullArgumentException {
        if(this.getPersonaCeliminarpthisPersonaCInstance() == null || this.getPersonaCeliminarpthisPersonaCInstance().isNull()) {
            throw new NotNullArgumentException(PersonaCConstants.SERV_ID_ELIMINAR, PersonaCConstants.CLASS_ID, PersonaCConstants.ARG_ID_ELIMINAR_PERSONACELIMINARPTHISPERSONAC, PersonaCConstants.SERV_ALIAS_ELIMINAR, PersonaCConstants.CLASS_ALIAS, PersonaCConstants.ARG_ALIAS_ELIMINAR_PERSONACELIMINARPTHISPERSONAC);
        }
    }
}
