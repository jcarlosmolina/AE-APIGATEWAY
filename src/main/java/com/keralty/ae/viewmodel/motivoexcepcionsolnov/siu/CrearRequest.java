package com.keralty.ae.viewmodel.motivoexcepcionsolnov.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.MotivoExcepcionSolNovConstants;

public class CrearRequest {

    @JsonProperty("p_atrdescripcion")
    private String motivoExcepcionSolNovcrearpatrDescripcion;

    public void checkArguments() throws NotNullArgumentException {
        checkMotivoExcepcionSolNovcrearpatrDescripcion();
    }

    @JsonIgnore
    public String getMotivoExcepcionSolNovcrearpatrDescripcion() {
        return this.motivoExcepcionSolNovcrearpatrDescripcion;
    }
    
    public void setMotivoExcepcionSolNovcrearpatrDescripcion(String motivoExcepcionSolNovcrearpatrDescripcion) {
        this.motivoExcepcionSolNovcrearpatrDescripcion = motivoExcepcionSolNovcrearpatrDescripcion;
    }

    private void checkMotivoExcepcionSolNovcrearpatrDescripcion() throws NotNullArgumentException {
        if(this.getMotivoExcepcionSolNovcrearpatrDescripcion() == null) {
            throw new NotNullArgumentException(MotivoExcepcionSolNovConstants.SERV_ID_CREAR, MotivoExcepcionSolNovConstants.CLASS_ID, MotivoExcepcionSolNovConstants.ARG_ID_CREAR_MOTIVOEXCEPCIONSOLNOVCREARPATRDESCRIPCION, MotivoExcepcionSolNovConstants.SERV_ALIAS_CREAR, MotivoExcepcionSolNovConstants.CLASS_ALIAS, MotivoExcepcionSolNovConstants.ARG_ALIAS_CREAR_MOTIVOEXCEPCIONSOLNOVCREARPATRDESCRIPCION);
        }
    }
}
