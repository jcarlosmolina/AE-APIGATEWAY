package com.keralty.ae.viewmodel.solicitudnovedad.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.ae.viewmodel.ServiceResponse;
import java.util.HashMap;
import java.util.Map;

public class TCREARPERSONACOREResponse extends ServiceResponse {

    @JsonProperty("oanumerrores")
    private Long solicitudNovedadTCREARPERSONACOREoaNumErrores;

    public TCREARPERSONACOREResponse() {
        super();
    }

    @JsonIgnore
    public Long getSolicitudNovedadTCREARPERSONACOREoaNumErrores() {
        return this.solicitudNovedadTCREARPERSONACOREoaNumErrores;
    }
    
    public void setSolicitudNovedadTCREARPERSONACOREoaNumErrores(Long solicitudNovedadTCREARPERSONACOREoaNumErrores) {
        this.solicitudNovedadTCREARPERSONACOREoaNumErrores = solicitudNovedadTCREARPERSONACOREoaNumErrores;
    }

    @Override
    public Map<String, Object> buildOutArgs() {
        Map<String, Object> outArgs = new HashMap<>();
        outArgs.put("solicitudNovedadTCREARPERSONACOREoaNumErrores", solicitudNovedadTCREARPERSONACOREoaNumErrores);
        return outArgs;
    }
}
