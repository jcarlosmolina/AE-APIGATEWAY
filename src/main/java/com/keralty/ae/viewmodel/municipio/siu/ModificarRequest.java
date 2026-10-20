package com.keralty.ae.viewmodel.municipio.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.MunicipioConstants;
import com.keralty.ae.persistence.Municipio;
import com.keralty.ae.persistence.oid.MunicipioOid;

public class ModificarRequest {

    @JsonProperty("p_thismunicipio_oid")
    private MunicipioOid municipiomodificarpthisMunicipio;
    
    @JsonIgnore
    private Municipio municipiomodificarpthisMunicipioInstance;

    @JsonProperty("p_aplicaiva")
    private Boolean municipiomodificarpAplicaIVA;

    public void checkArguments() throws NotNullArgumentException {
        checkMunicipiomodificarpthisMunicipio();
        checkMunicipiomodificarpAplicaIVA();
    }

    @JsonIgnore
    public MunicipioOid getMunicipiomodificarpthisMunicipio() {
        return this.municipiomodificarpthisMunicipio;
    }
    
    public void setMunicipiomodificarpthisMunicipio(MunicipioOid municipiomodificarpthisMunicipio) {
        this.municipiomodificarpthisMunicipio = municipiomodificarpthisMunicipio;
    }

    @JsonIgnore
    public Municipio getMunicipiomodificarpthisMunicipioInstance() {
        return this.municipiomodificarpthisMunicipioInstance;
    }
    
    public void setMunicipiomodificarpthisMunicipioInstance(Municipio municipiomodificarpthisMunicipio) {
        this.municipiomodificarpthisMunicipioInstance = municipiomodificarpthisMunicipio;
        this.municipiomodificarpthisMunicipio = municipiomodificarpthisMunicipio != null ? municipiomodificarpthisMunicipio.getOid() : null;
    }

    private void checkMunicipiomodificarpthisMunicipio() throws NotNullArgumentException {
        if(this.getMunicipiomodificarpthisMunicipioInstance() == null || this.getMunicipiomodificarpthisMunicipioInstance().isNull()) {
            throw new NotNullArgumentException(MunicipioConstants.SERV_ID_MODIFICAR, MunicipioConstants.CLASS_ID, MunicipioConstants.ARG_ID_MODIFICAR_MUNICIPIOMODIFICARPTHISMUNICIPIO, MunicipioConstants.SERV_ALIAS_MODIFICAR, MunicipioConstants.CLASS_ALIAS, MunicipioConstants.ARG_ALIAS_MODIFICAR_MUNICIPIOMODIFICARPTHISMUNICIPIO);
        }
    }

    @JsonIgnore
    public Boolean getMunicipiomodificarpAplicaIVA() {
        return this.municipiomodificarpAplicaIVA;
    }
    
    public void setMunicipiomodificarpAplicaIVA(Boolean municipiomodificarpAplicaIVA) {
        this.municipiomodificarpAplicaIVA = municipiomodificarpAplicaIVA;
    }

    private void checkMunicipiomodificarpAplicaIVA() throws NotNullArgumentException {
        if(this.getMunicipiomodificarpAplicaIVA() == null) {
            throw new NotNullArgumentException(MunicipioConstants.SERV_ID_MODIFICAR, MunicipioConstants.CLASS_ID, MunicipioConstants.ARG_ID_MODIFICAR_MUNICIPIOMODIFICARPAPLICAIVA, MunicipioConstants.SERV_ALIAS_MODIFICAR, MunicipioConstants.CLASS_ALIAS, MunicipioConstants.ARG_ALIAS_MODIFICAR_MUNICIPIOMODIFICARPAPLICAIVA);
        }
    }
}
