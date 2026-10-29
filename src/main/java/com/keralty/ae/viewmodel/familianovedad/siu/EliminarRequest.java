package com.keralty.ae.viewmodel.familianovedad.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.FamiliaNovedadConstants;
import com.keralty.ae.persistence.FamiliaNovedad;
import com.keralty.ae.persistence.oid.FamiliaNovedadOid;

public class EliminarRequest {

    @JsonProperty("p_thisfamilianovedad_oid")
    private FamiliaNovedadOid familiaNovedadeliminarpthisFamiliaNovedad;
    
    @JsonIgnore
    private FamiliaNovedad familiaNovedadeliminarpthisFamiliaNovedadInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkFamiliaNovedadeliminarpthisFamiliaNovedad();
    }

    @JsonIgnore
    public FamiliaNovedadOid getFamiliaNovedadeliminarpthisFamiliaNovedad() {
        return this.familiaNovedadeliminarpthisFamiliaNovedad;
    }
    
    public void setFamiliaNovedadeliminarpthisFamiliaNovedad(FamiliaNovedadOid familiaNovedadeliminarpthisFamiliaNovedad) {
        this.familiaNovedadeliminarpthisFamiliaNovedad = familiaNovedadeliminarpthisFamiliaNovedad;
    }

    @JsonIgnore
    public FamiliaNovedad getFamiliaNovedadeliminarpthisFamiliaNovedadInstance() {
        return this.familiaNovedadeliminarpthisFamiliaNovedadInstance;
    }
    
    public void setFamiliaNovedadeliminarpthisFamiliaNovedadInstance(FamiliaNovedad familiaNovedadeliminarpthisFamiliaNovedad) {
        this.familiaNovedadeliminarpthisFamiliaNovedadInstance = familiaNovedadeliminarpthisFamiliaNovedad;
        this.familiaNovedadeliminarpthisFamiliaNovedad = familiaNovedadeliminarpthisFamiliaNovedad != null ? familiaNovedadeliminarpthisFamiliaNovedad.getOid() : null;
    }

    private void checkFamiliaNovedadeliminarpthisFamiliaNovedad() throws NotNullArgumentException {
        if(this.getFamiliaNovedadeliminarpthisFamiliaNovedadInstance() == null || this.getFamiliaNovedadeliminarpthisFamiliaNovedadInstance().isNull()) {
            throw new NotNullArgumentException(FamiliaNovedadConstants.SERV_ID_ELIMINAR, FamiliaNovedadConstants.CLASS_ID, FamiliaNovedadConstants.ARG_ID_ELIMINAR_FAMILIANOVEDADELIMINARPTHISFAMILIANOVEDAD, FamiliaNovedadConstants.SERV_ALIAS_ELIMINAR, FamiliaNovedadConstants.CLASS_ALIAS, FamiliaNovedadConstants.ARG_ALIAS_ELIMINAR_FAMILIANOVEDADELIMINARPTHISFAMILIANOVEDAD);
        }
    }
}
