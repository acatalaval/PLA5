package com.pla5.springannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class Codificador {
	
	//@Autowired
	//@Qualifier("palabras")
	private IProcesar _procesar;
	
	
	//@Autowired
	//@Qualifier("invertir")
	private ICodificar _codificar; 
	
	public Codificador(IProcesar procesar, ICodificar codificar) {
		_procesar=procesar;
		_codificar=codificar;
	}
	/*public Codificador(IProcesar procesar) {
		_procesar=procesar;
	}*/
	
	public String codificar(String cadena) { //función no correcta del todo, pero válida para entender funcionamiento Spring annotations
		
		System.out.println("Fc. codificar muestra primero cadena. "+ cadena);
		System.out.println("Fc. codificar divide cadena: " + (_procesar.dividir(cadena)));
		System.out.println("Fc. codificar llamar a Invertir/codificar: "+ _codificar.codificar(cadena));
		
		return _procesar.unir(_procesar.dividir(cadena));
		
		
		
		//return _procesar.dividir(cadena);
	}

	/*
	public String decodificar(String cadena) {
		return _procesar.dividir(cadena);
	}*/
}
