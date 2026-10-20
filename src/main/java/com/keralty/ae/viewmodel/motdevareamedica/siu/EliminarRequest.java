package com.keralty.ae.viewmodel.motdevareamedica.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.MotDevAreaMedicaConstants;
import com.keralty.ae.persistence.MotDevAreaMedica;
import com.keralty.ae.persistence.oid.MotDevAreaMedicaOid;

public class EliminarRequest {

    @JsonProperty("p_thismotdevareamedica_oid")
    private MotDevAreaMedicaOid motDevAreaMedicaeliminarpthisMotDevAreaMedica;
    
    @JsonIgnore
    private MotDevAreaMedica motDevAreaMedicaeliminarpthisMotDevAreaMedicaInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkMotDevAreaMedicaeliminarpthisMotDevAreaMedica();
    }

    @JsonIgnore
    public MotDevAreaMedicaOid getMotDevAreaMedicaeliminarpthisMotDevAreaMedica() {
        return this.motDevAreaMedicaeliminarpthisMotDevAreaMedica;
    }
    
    public void setMotDevAreaMedicaeliminarpthisMotDevAreaMedica(MotDevAreaMedicaOid motDevAreaMedicaeliminarpthisMotDevAreaMedica) {
        this.motDevAreaMedicaeliminarpthisMotDevAreaMedica = motDevAreaMedicaeliminarpthisMotDevAreaMedica;
    }

    @JsonIgnore
    public MotDevAreaMedica getMotDevAreaMedicaeliminarpthisMotDevAreaMedicaInstance() {
        return this.motDevAreaMedicaeliminarpthisMotDevAreaMedicaInstance;
    }
    
    public void setMotDevAreaMedicaeliminarpthisMotDevAreaMedicaInstance(MotDevAreaMedica motDevAreaMedicaeliminarpthisMotDevAreaMedica) {
        this.motDevAreaMedicaeliminarpthisMotDevAreaMedicaInstance = motDevAreaMedicaeliminarpthisMotDevAreaMedica;
        this.motDevAreaMedicaeliminarpthisMotDevAreaMedica = motDevAreaMedicaeliminarpthisMotDevAreaMedica != null ? motDevAreaMedicaeliminarpthisMotDevAreaMedica.getOid() : null;
    }

    private void checkMotDevAreaMedicaeliminarpthisMotDevAreaMedica() throws NotNullArgumentException {
        if(this.getMotDevAreaMedicaeliminarpthisMotDevAreaMedicaInstance() == null || this.getMotDevAreaMedicaeliminarpthisMotDevAreaMedicaInstance().isNull()) {
            throw new NotNullArgumentException(MotDevAreaMedicaConstants.SERV_ID_ELIMINAR, MotDevAreaMedicaConstants.CLASS_ID, MotDevAreaMedicaConstants.ARG_ID_ELIMINAR_MOTDEVAREAMEDICAELIMINARPTHISMOTDEVAREAMEDICA, MotDevAreaMedicaConstants.SERV_ALIAS_ELIMINAR, MotDevAreaMedicaConstants.CLASS_ALIAS, MotDevAreaMedicaConstants.ARG_ALIAS_ELIMINAR_MOTDEVAREAMEDICAELIMINARPTHISMOTDEVAREAMEDICA);
        }
    }
}
