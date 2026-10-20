package com.keralty.ae.viewmodel.novedad.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.NovedadConstants;
import com.keralty.ae.persistence.Novedad;
import com.keralty.ae.persistence.oid.NovedadOid;

public class TELIMINARRequest {

    @JsonProperty("p_thisnovedad_oid")
    private NovedadOid novedadTELIMINARpthisNovedad;
    
    @JsonIgnore
    private Novedad novedadTELIMINARpthisNovedadInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkNovedadTELIMINARpthisNovedad();
    }

    @JsonIgnore
    public NovedadOid getNovedadTELIMINARpthisNovedad() {
        return this.novedadTELIMINARpthisNovedad;
    }
    
    public void setNovedadTELIMINARpthisNovedad(NovedadOid novedadTELIMINARpthisNovedad) {
        this.novedadTELIMINARpthisNovedad = novedadTELIMINARpthisNovedad;
    }

    @JsonIgnore
    public Novedad getNovedadTELIMINARpthisNovedadInstance() {
        return this.novedadTELIMINARpthisNovedadInstance;
    }
    
    public void setNovedadTELIMINARpthisNovedadInstance(Novedad novedadTELIMINARpthisNovedad) {
        this.novedadTELIMINARpthisNovedadInstance = novedadTELIMINARpthisNovedad;
        this.novedadTELIMINARpthisNovedad = novedadTELIMINARpthisNovedad != null ? novedadTELIMINARpthisNovedad.getOid() : null;
    }

    private void checkNovedadTELIMINARpthisNovedad() throws NotNullArgumentException {
        if(this.getNovedadTELIMINARpthisNovedadInstance() == null || this.getNovedadTELIMINARpthisNovedadInstance().isNull()) {
            throw new NotNullArgumentException(NovedadConstants.SERV_ID_TELIMINAR, NovedadConstants.CLASS_ID, NovedadConstants.ARG_ID_TELIMINAR_NOVEDADTELIMINARPTHISNOVEDAD, NovedadConstants.SERV_ALIAS_TELIMINAR, NovedadConstants.CLASS_ALIAS, NovedadConstants.ARG_ALIAS_TELIMINAR_NOVEDADTELIMINARPTHISNOVEDAD);
        }
    }
}
