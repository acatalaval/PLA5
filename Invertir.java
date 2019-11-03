package com.pla5.springannotations;

import org.springframework.stereotype.Component;


public class Invertir implements ICodificar {

	
	public String codificar(String cadena) {
		// TODO Auto-generated method stub
		return "Invierte la cadena";
	}

	
	public String decodificar(String cadena) {
		// TODO Auto-generated method stub
		return "También invierte la cadena";
	}

}
