package com.pla5.springannotations;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

//@Component - Usamos @Bean en lugar de esto y funciona igual
public class Palabras implements IProcesar {

	public ArrayList<String> dividir(String cadena) {
		
		String[] arrayPalabras = cadena.split(" "); //usamos el método split de las arrays para separar el texto en palabras
		ArrayList<String> alistPalabras= new ArrayList<String>(); // creamos ArrayList para las palabras
		for (String palabra : arrayPalabras) {
			alistPalabras.add(palabra);
		}
		return alistPalabras;
		
	}
    
	
	public String unir(ArrayList<String> cadenas) {
		
		String cadena=" ";
		for (String s : cadenas) {
			cadena += s + " ";
		}
		return cadena;
	}

}


