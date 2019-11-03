package com.pla5.springannotations;

import java.util.ArrayList;

import org.springframework.stereotype.Component;


public class Bloques implements IProcesar {

	@Override/*
	public String dividir(String cadena) {
		return "Definir función dividir con ArrayList";
	}*/
	
	public ArrayList<String> dividir(String cadena) {
		// TODO Auto-generated method stub
		//ArrayList<String> alistBloques= new ArrayList<String>("Divide la cadena en bloques de 4"); // creamos ArrayList para las palabras
		ArrayList<String> alistBloques=new ArrayList<String>();
		String[] f=cadena.split("\\.");
	    for(String bloque:f) {
	    	alistBloques.add(bloque);
	    }
		return alistBloques;
	}
    
	@Override
	public String unir(ArrayList<String> cadenas) {
		// TODO Auto-generated method stub
		return "Une bloques";
	}

}
