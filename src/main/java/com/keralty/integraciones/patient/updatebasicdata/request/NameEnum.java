package com.keralty.integraciones.patient.updatebasicdata.request;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum NameEnum {
    NAME, PATH, TYPE, VALUE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case NAME: return "name";
            case PATH: return "path";
            case TYPE: return "type";
            case VALUE: return "value";
        }
        return null;
    }

    @JsonCreator
    public static NameEnum forValue(String value) throws IOException {
        if (value.equals("name")) return NAME;
        if (value.equals("path")) return PATH;
        if (value.equals("type")) return TYPE;
        if (value.equals("value")) return VALUE;
        throw new IOException("Cannot deserialize NameEnum");
    }
}
