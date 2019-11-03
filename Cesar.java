package com.pla5.springannotations;

import org.springframework.stereotype.Component;


public class Cesar implements ICodificar {

	
	public String codificar(String cadena) {
		// TODO Auto-generated method stub
		return "Codifica tipo Cesar";
	}

	
	public String decodificar(String cadena) {
		// TODO Auto-generated method stub
		return "Decodifica tipo Cesar";
	}

}
