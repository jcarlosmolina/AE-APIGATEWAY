package com.keralty.integraciones.patient.updatebasicdata.request;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.fasterxml.jackson.annotation.*;
import com.keralty.integraciones.CallBHUtils;

public class Entry {
    private String fullURL;
    private Resource resource;
    private Request request;

    @JsonProperty("fullURL")
    public String getFullURL() { return fullURL; }
    @JsonProperty("fullURL")
    public void setFullURL(String value) { this.fullURL = value; }

    @JsonProperty("resource")
    public Resource getResource() { return resource; }
    @JsonProperty("resource")
    public void setResource(Resource value) { this.resource = value; }

    @JsonProperty("request")
    public Request getRequest() { return request; }
    @JsonProperty("request")
    public void setRequest(Request value) { this.request = value; }

    public void asignarIdentificacion(String codigo, String tipoIdentificacion, String numIdentificacion) {

    	// Asignamos el id y numero de identificacion
    	setFullURL("Patient?identifier=BH|" + tipoIdentificacion + "-" + numIdentificacion);
    	
    	// Asignamos el codigo
    	setRequest(new Request());
    	getRequest().setMethod("PATCH");
    	getRequest().setURL("Patient/" + codigo);
    	
    	// GdC65 Incluir el tipo de identificacion para formar validaciones en BH
    	this.asignarTipoIdentificacion(tipoIdentificacion);
    }
    
    
    public void asignarNombres(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido) {

    	if (getResource() == null) {
    		setResource(new Resource());
    	}
    	if (getResource().getParameter() == null) {
    		getResource().setParameter(new ArrayList<Parameter>());
    	}
    	
    	Parameter param = new Parameter();
    	param.addOperationName("name");
    	
    	// Añadimos el elemento del nombre
    	Part part = new Part();
    	part.setName(NameEnum.VALUE);

    	// Creamos el elemento 
    	part.setValueHumanName(new ArrayList<ValueHumanName>());
    	ValueHumanName valueHumanName = new ValueHumanName();
    	valueHumanName.setName(new ArrayList<NameElement>());
    	
    	NameElement name = new NameElement();
    	if (primerNombre != null && !primerNombre.isEmpty()) {
    		name.setGiven(primerNombre);	
    	}
    	if (primerApellido != null && !primerApellido.isEmpty()) {
    		name.setFamily(primerApellido);	
    	}
    	
    	name.setExtension(new ArrayList<Extension>());
    	if (segundoNombre != null && !segundoNombre.isEmpty()) {
    		Extension extension = new Extension();
    		extension.setURL("col-second-name");
    		extension.setValueString(segundoNombre);
			name.getExtension().add(extension );
    	}
    	if (segundoApellido != null && !segundoApellido.isEmpty()) {
    		Extension extension = new Extension();
    		extension.setURL("humanname-mothers-family");
    		extension.setValueString(segundoApellido);
			name.getExtension().add(extension );
    	}
    	
    	valueHumanName.getName().add(name);

    	part.getValueHumanName().add(valueHumanName);
    	
    	param.getPart().add(part);
    	
    	getResource().getParameter().add(param);
    }


    public void asignarTipoIdentificacion(String nombreCortoTipoIdentificacion) {
    	if (nombreCortoTipoIdentificacion == null || nombreCortoTipoIdentificacion.isEmpty()) {
    		return;
    	}

    	if (getResource() == null) {
    		setResource(new Resource());
    	}
    	if (getResource().getParameter() == null) {
    		getResource().setParameter(new ArrayList<Parameter>());
    	}
    	
    	Parameter param = new Parameter();
    	param.addOperationName("identifier");
    	
    	// Añadimos el elemento del nombre
    	Part part = new Part();
    	part.setName(NameEnum.VALUE);
    	part.setValueIdentifier( new ArrayList<ValueIdentifier>() );
    	part.getValueIdentifier().add(new ValueIdentifier());
    	
    	part.getValueIdentifier().get(0).setIdentifier(new ArrayList<Identifier>());
    	Identifier identifier = new Identifier();
    	identifier.setType("TIPO_IDENTIFICACION");
    	identifier.setValue(nombreCortoTipoIdentificacion);
    	
    	part.getValueIdentifier().get(0).getIdentifier().add(identifier);
		

    	param.getPart().add(part);
    	getResource().getParameter().add(param);
    }
    
    public void asignarGenero(String genero) {
    	if (genero == null || genero.isEmpty()) {
    		return;
    	}

    	if (getResource() == null) {
    		setResource(new Resource());
    	}
    	if (getResource().getParameter() == null) {
    		getResource().setParameter(new ArrayList<Parameter>());
    	}
    	
    	Parameter param = new Parameter();
    	param.addOperationName("gender");
    	
    	// Añadimos el elemento del nombre
    	Part part = new Part();
    	part.setName(NameEnum.VALUE);
    	part.setValueCode(genero);
    	param.getPart().add(part);
    	
    	getResource().getParameter().add(param);
    }

    public void asignarEstadoCivil(String estado) {
    	if (estado == null || estado.isEmpty()) {
    		return;
    	}

    	if (getResource() == null) {
    		setResource(new Resource());
    	}
    	if (getResource().getParameter() == null) {
    		getResource().setParameter(new ArrayList<Parameter>());
    	}
    	
    	Parameter param = new Parameter();
    	param.addOperationName("maritalStatus");
    	
    	// Añadimos el elemento del nombre
    	Part part = new Part();
    	part.setName(NameEnum.VALUE);
    	
    	part.setValueCodeableConcept(new ArrayList<ValueCodeableConcept>());
    	
    	ValueCodeableConcept valueConcept = new ValueCodeableConcept();
    	valueConcept.setSystem("BH");
    	valueConcept.setDisplay("");
    	valueConcept.setCode(estado);
		part.getValueCodeableConcept().add(valueConcept);
    	
    	param.getPart().add(part);
    	
    	getResource().getParameter().add(param);
    	
    }
    
    public void asignarFechaNacimiento(Date fecha) {
    	if (fecha == null) {
    		return;
    	}

    	if (getResource() == null) {
    		setResource(new Resource());
    	}
    	if (getResource().getParameter() == null) {
    		getResource().setParameter(new ArrayList<Parameter>());
    	}
    	
    	Parameter param = new Parameter();
    	param.addOperationName("birthDate");
    	
    	// Añadimos el elemento del nombre
    	Part part = new Part();
    	part.setName(NameEnum.VALUE);
    	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    	part.setValueDate(dateFormat.format(fecha));
    	param.getPart().add(part);
    	
    	getResource().getParameter().add(param);
    }

    public void asignarCodigoCiudadNacimiento(String codMunicipio) {
    	if (codMunicipio == null || codMunicipio.isEmpty()) {
    		return;
    	}
    	
    	if (getResource() == null) {
    		setResource(new Resource());
    	}
    	if (getResource().getParameter() == null) {
    		getResource().setParameter(new ArrayList<Parameter>());
    	}
    	
    	Parameter param = new Parameter();
    	
		if (param.getPart() == null) {
			param.setPart(new ArrayList<Part>());
		}
		
		// Añadimos los elementos comunes a todos los campos
		// type
		Part part = new Part();
		part.setName(NameEnum.TYPE);
		part.setValueCode("replace");
		param.getPart().add(part);
		// path
		part = new Part();
		part.setName(NameEnum.PATH);
		part.setValueString("Patient.extension.where(url='patient-birthPlace').value");
		param.getPart().add(part);
		
    	
    	// Añadimos el elemento de la direccion
    	part = new Part();
    	part.setName(NameEnum.VALUE);
    	part.setValueAddress(new ArrayList<ValueAddress>());
    	ValueAddress address = new ValueAddress();
    	address.setCity(codMunicipio);
    	part.getValueAddress().add(address);
    	param.getPart().add(part);
    	
    	getResource().getParameter().add(param);
    }

    public void asignarExtranjero(boolean extranjero) {
    	
    	if (getResource() == null) {
    		setResource(new Resource());
    	}
    	if (getResource().getParameter() == null) {
    		getResource().setParameter(new ArrayList<Parameter>());
    	}
    	
    	Parameter param = new Parameter();
    	
		if (param.getPart() == null) {
			param.setPart(new ArrayList<Part>());
		}
		
		// Añadimos los elementos comunes a todos los campos
		// type
		Part part = new Part();
		part.setName(NameEnum.TYPE);
		part.setValueCode("replace");
		param.getPart().add(part);
		// path
		part = new Part();
		part.setName(NameEnum.PATH);
		part.setValueString("Patient.extension.where(url='co-patient-afiliado-foreing').value");
		param.getPart().add(part);
		
    	part = new Part();
    	part.setName(NameEnum.VALUE);
    	part.setValueBool(extranjero);
    	param.getPart().add(part);
    	
    	getResource().getParameter().add(param);
    }
    
}
