package com.keralty.ae.viewmodel.conceptoc.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.ConceptoCConstants;
import com.keralty.ae.persistence.ConceptoC;
import com.keralty.ae.persistence.oid.ConceptoCOid;

public class EliminarRequest {

    @JsonProperty("p_thisconceptoc_oid")
    private ConceptoCOid conceptoCeliminarpthisConceptoC;
    
    @JsonIgnore
    private ConceptoC conceptoCeliminarpthisConceptoCInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkConceptoCeliminarpthisConceptoC();
    }

    @JsonIgnore
    public ConceptoCOid getConceptoCeliminarpthisConceptoC() {
        return this.conceptoCeliminarpthisConceptoC;
    }
    
    public void setConceptoCeliminarpthisConceptoC(ConceptoCOid conceptoCeliminarpthisConceptoC) {
        this.conceptoCeliminarpthisConceptoC = conceptoCeliminarpthisConceptoC;
    }

    @JsonIgnore
    public ConceptoC getConceptoCeliminarpthisConceptoCInstance() {
        return this.conceptoCeliminarpthisConceptoCInstance;
    }
    
    public void setConceptoCeliminarpthisConceptoCInstance(ConceptoC conceptoCeliminarpthisConceptoC) {
        this.conceptoCeliminarpthisConceptoCInstance = conceptoCeliminarpthisConceptoC;
        this.conceptoCeliminarpthisConceptoC = conceptoCeliminarpthisConceptoC != null ? conceptoCeliminarpthisConceptoC.getOid() : null;
    }

    private void checkConceptoCeliminarpthisConceptoC() throws NotNullArgumentException {
        if(this.getConceptoCeliminarpthisConceptoCInstance() == null || this.getConceptoCeliminarpthisConceptoCInstance().isNull()) {
            throw new NotNullArgumentException(ConceptoCConstants.SERV_ID_ELIMINAR, ConceptoCConstants.CLASS_ID, ConceptoCConstants.ARG_ID_ELIMINAR_CONCEPTOCELIMINARPTHISCONCEPTOC, ConceptoCConstants.SERV_ALIAS_ELIMINAR, ConceptoCConstants.CLASS_ALIAS, ConceptoCConstants.ARG_ALIAS_ELIMINAR_CONCEPTOCELIMINARPTHISCONCEPTOC);
        }
    }
}
