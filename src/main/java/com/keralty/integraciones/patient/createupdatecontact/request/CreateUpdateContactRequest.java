package com.keralty.integraciones.patient.createupdatecontact.request;

import com.fasterxml.jackson.annotation.*;

import java.util.ArrayList;
import java.util.List;


public class CreateUpdateContactRequest {
    private String resourceType = "Bundle";
    private String type = "transaction";
    private List<Entry> entry;

    @JsonProperty("resourceType")
    public String getResourceType() { return resourceType; }
    @JsonProperty("resourceType")
    public void setResourceType(String value) { this.resourceType = value; }

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("entry")
    public List<Entry> getEntry() { return entry; }
    @JsonProperty("entry")
    public void setEntry(List<Entry> value) { this.entry = value; }
    
    @JsonIgnore
    public void asignarPersona(String tipoIdentificacion, String numIdentificacion) {
    	
    	setEntry(new ArrayList<Entry>());
    	
    	Entry entry = new Entry();
    	
    	entry.setFullURL("Patient?identifier=BH|" + tipoIdentificacion + "-" + numIdentificacion);

    	entry.setResource(new Resource());
    	entry.getResource().setResourceType("parameters");
    	entry.getResource().setParameter(new ArrayList<Parameter>());
    	
    	entry.setRequest(new Request());
    	entry.getRequest().setMethod("PATCH");
    	entry.getRequest().setURL(entry.getFullURL());
    	
    	getEntry().add(entry);
    }
    
    public void anyadirCorreoElectronico(String codeExistente, String email) {
    	// Añade el telefono
    	
    	// Utilizamos el parameter existente
    	String tipoOperacion = "add";
    	if (codeExistente != null && !codeExistente.isEmpty()) {
    		tipoOperacion = "replace";
    	}
    	
    	Parameter param = buscaParameter(tipoOperacion);
    	Part part = getPartPorName(param, "value");
    	if (part != null) {
    		
    		if (part.getValueContactPoint() == null) {
    			part.setValueContactPoint(new ArrayList<ValueContactPoint>());
        		part.addValueContactPoint(new ValueContactPoint());
    		}

    		ValueContactPoint value = part.getValueContactPoint().get(0);

    		if (value.getTelecom() == null) {
        		value.setTelecom(new ArrayList<Telecom>());
    		}

	    	Telecom telecom = new Telecom();
	    	telecom.setCode(codeExistente);
	    	
			telecom.setSystem("CORREO_ELECTRONICO");
        	telecom.setValue(email);
    		value.addTelecom(telecom);
    	}    	

    }
    
    public void anyadirTelefono(String codeExistente, String tipoUsoTelefono, boolean esFijo, String numero) {
    	// Añade el telefono
    	
    	// Utilizamos el parameter existente
    	String tipoOperacion = "add";
    	if (codeExistente != null && !codeExistente.isEmpty()) {
    		tipoOperacion = "replace";
    	}
    	
    	Parameter param = buscaParameter(tipoOperacion);
    	//Parameter param = crearParameter(tipoOperacion);
    	Part part = getPartPorName(param, "value");
    	if (part != null) {
    		
    		if (part.getValueContactPoint() == null) {
    			part.setValueContactPoint(new ArrayList<ValueContactPoint>());
        		part.addValueContactPoint(new ValueContactPoint());
    		}

    		ValueContactPoint value = part.getValueContactPoint().get(0);

    		if (value.getTelecom() == null) {
        		value.setTelecom(new ArrayList<Telecom>());
    		}

	    	Telecom telecom = new Telecom();
	    	telecom.setCode(codeExistente);

	    	telecom.setUse(tipoUsoTelefono);
	    	
	    	// Todos el mismo system, excepto el celular de residencia
	    	telecom.setSystem("TELEFONO_CONTACTO_PRINCIPAL");
	    	if ("1".equalsIgnoreCase(tipoUsoTelefono) && !esFijo) {
	    		telecom.setSystem("CELULAR_CONTACTO_PRINCIPAL");
	    	}
	    	telecom.setValue(numero);
    		value.addTelecom(telecom);
    	}    	

    }
    
    public void anyadirDireccion(String codeExistente, String tipoDireccion, String direccion, String municipio, String departamento, String pais) {
    	// Añade la direccion de residencia
    	
    	// Es de tipo parameter con esta estructura
		//{
		//    "name": "operation",
		//    "part": [
		//        {
		//            "name": "type",
		//            "valueCode": "add" o "replace"
		//        },
		//        {
		//            "name": "path",
		//            "valueString": "patient"
		//        },
		//        {
		//            "name": "value",
		//            "valueContactPoint": [
		//                {
		//                    "address": [
		//                        {
		//                            "code": "55496466",
		//                            "use": "1",
		//                            "text": "Cll 100 # 11b-67",
		//                            "city": {
		//                                "code": "11001",
		//                                "name": "Bogota"
		//                            },
		//                            "state": {
		//                                "code": "11",
		//                                "name": "DISTRITO CAPITAL"
		//                            },
		//                            "country": {
		//                                "code": "1",
		//                                "name": "COLOMBIA"
		//                            }
		//                        }
		//                    ]
        //                }
		//            ]
		//        }
		//    ]
		//}
    	
    	// Utilizamos el parameter existente
    	String tipoOperacion = "add";
    	if (codeExistente != null && !codeExistente.isEmpty()) {
    		tipoOperacion = "replace";
    	}
    	
    	Parameter param = buscaParameter(tipoOperacion);
    	//Parameter param = crearParameter(tipoOperacion);
    	Part part = getPartPorName(param, "value");
    	if (part != null) {
    		
    		if (part.getValueContactPoint() == null) {
    			part.setValueContactPoint(new ArrayList<ValueContactPoint>());
        		part.addValueContactPoint(new ValueContactPoint());
    		}

    		ValueContactPoint value = part.getValueContactPoint().get(0);
    	
    		if (value.getAddress() == null) {
        		value.setAddress(new ArrayList<Address>());
    		}
	    	Address address = new Address();
	    	
	    	address.setCode(codeExistente);
	    	address.setUse(tipoDireccion);
	    	address.setText(direccion);
	    	address.setCity(new CodeName());
	    	address.getCity().setCode(municipio);
	    	
	    	address.setState(new CodeName());
	    	address.getState().setCode(departamento);
	    	
	    	address.setCountry(new CodeName());
	    	address.getCountry().setCode(pais);
	    	
			value.addAddress(address);
    	}    	
    }
    
    /**
     * Busca o crea el parameter para el tipo de operacion indicado
     * @param tipoOperacion
     * @return
     */
    private Parameter buscaParameter(String tipoOperacion) {
    	Parameter param = null;
    	// Buscamos el parameter con el tipo de operacion buscado
    	if (getEntry().get(0).getResource().getParameter() != null && getEntry().get(0).getResource().getParameter().size() == 1) {
    		param = getEntry().get(0).getResource().getParameter().get(0);
    		Part part = getPartPorName(param, "type");
    		if (part == null || !tipoOperacion.equals(part.getValueCode())) {
        		param = null;
    		}
    	}
    	
    	// Si no existe, lo creamos
    	if (param == null) {
    		param = new Parameter();
    		getEntry().get(0).getResource().addParameter(param);
        	param.setName("operation");
        	param.setPart(new ArrayList<Part>());
        	
        	// Tipo de operacio
        	Part part = new Part();
        	part.setName("type");
        	part.setValueCode(tipoOperacion);
        	param.addPart(part);
        	
        	// Path
        	part = new Part();
        	part.setName("path");
        	part.setValueString("patient");
        	param.addPart(part);
        	
        	// value
        	part = new Part();
        	part.setName("value");
        	part.setValueContactPoint(new ArrayList<ValueContactPoint>());
        	part.addValueContactPoint(new ValueContactPoint());
        	param.addPart(part);
    	}
    	
    	return param;
    }
    
    private Parameter crearParameter(String tipoOperacion) {
    	Parameter param = null;
		param = new Parameter();
		getEntry().get(0).getResource().addParameter(param);
    	param.setName("operation");
    	param.setPart(new ArrayList<Part>());
    	
    	// Tipo de operacio
    	Part part = new Part();
    	part.setName("type");
    	part.setValueCode(tipoOperacion);
    	param.addPart(part);
    	
    	// Path
    	part = new Part();
    	part.setName("path");
    	part.setValueString("patient");
    	param.addPart(part);
    	
    	// value
    	part = new Part();
    	part.setName("value");
    	part.setValueContactPoint(new ArrayList<ValueContactPoint>());
    	part.addValueContactPoint(new ValueContactPoint());
    	param.addPart(part);
    	
    	return param;
    }

	private Part getPartPorName(Parameter param, String name) {
    	if (param == null || param.getPart() == null || param.getPart().isEmpty()) {
    		return null;
    	}
    	
    	for (Part part : param.getPart()) {
    		if (name.equals(part.getName())) {
    			return part;
    		}
    	}
    	
    	return null;
    }
    
}
