package com.keralty.ae.viewmodel.globalservices.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.keralty.ae.exception.NotNullArgumentException;
import com.keralty.ae.global.GlobalServiceConstants;
import com.keralty.ae.viewmodel.SqlDateWithoutTimezoneDeserializer;
import com.keralty.ae.viewmodel.SqlDateWithoutTimezoneSerializer;
import java.sql.Date;

public class TGENFILELEGALIZACOMRequest {

    @JsonProperty("p_finicio")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date tGENFILELEGALIZACOMpFInicio;

    @JsonProperty("p_ffin")
    @JsonSerialize(using = SqlDateWithoutTimezoneSerializer.class)
    private Date tGENFILELEGALIZACOMpFFin;

    public void checkArguments() throws NotNullArgumentException {
        checkTGENFILELEGALIZACOMpFInicio();
        checkTGENFILELEGALIZACOMpFFin();
    }

    @JsonIgnore
    public Date getTGENFILELEGALIZACOMpFInicio() {
        return this.tGENFILELEGALIZACOMpFInicio;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setTGENFILELEGALIZACOMpFInicio(Date tGENFILELEGALIZACOMpFInicio) {
        this.tGENFILELEGALIZACOMpFInicio = tGENFILELEGALIZACOMpFInicio;
    }

    private void checkTGENFILELEGALIZACOMpFInicio() throws NotNullArgumentException {
        if(this.getTGENFILELEGALIZACOMpFInicio() == null) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TGENFILELEGALIZACOM, GlobalServiceConstants.GS_ARG_ID_TGENFILELEGALIZACOM_TGENFILELEGALIZACOMPFINICIO, GlobalServiceConstants.G_SERV_ALIAS_TGENFILELEGALIZACOM, GlobalServiceConstants.GS_ARG_ALIAS_TGENFILELEGALIZACOM_TGENFILELEGALIZACOMPFINICIO);
        }
    }

    @JsonIgnore
    public Date getTGENFILELEGALIZACOMpFFin() {
        return this.tGENFILELEGALIZACOMpFFin;
    }
    
    @JsonDeserialize(using = SqlDateWithoutTimezoneDeserializer.class)
    public void setTGENFILELEGALIZACOMpFFin(Date tGENFILELEGALIZACOMpFFin) {
        this.tGENFILELEGALIZACOMpFFin = tGENFILELEGALIZACOMpFFin;
    }

    private void checkTGENFILELEGALIZACOMpFFin() throws NotNullArgumentException {
        if(this.getTGENFILELEGALIZACOMpFFin() == null) {
            throw new NotNullArgumentException(GlobalServiceConstants.G_SERV_ID_TGENFILELEGALIZACOM, GlobalServiceConstants.GS_ARG_ID_TGENFILELEGALIZACOM_TGENFILELEGALIZACOMPFFIN, GlobalServiceConstants.G_SERV_ALIAS_TGENFILELEGALIZACOM, GlobalServiceConstants.GS_ARG_ALIAS_TGENFILELEGALIZACOM_TGENFILELEGALIZACOMPFFIN);
        }
    }
}
