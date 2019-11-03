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


/*
 ========
  // Manera compactass
	    ArrayList<String> frases=new ArrayList<String>(Arrays.asList(texto.split("\\.")));
	  
	    //Otra manera
	    
	    String[] f=texto.split("\\.");
	    frases.clear();
	    for(String frase:f) {
	    	frases.add(frase);
	    }
	    
	    System.out.println("Frases:");
	    System.out.println(Arrays.toString(frases.toArray()));
 ========
public static String[] separarFrase(String s) {
int cp = 0; // Cantidad de palabras
 
// Recorremos en busca de espacios
for (int i = 0; i < s.length(); i++) {
    if (s.charAt(i) == ' ') { // Si es un espacio
        cp++; // Aumentamos en uno la cantidad de palabras
    }
}
 
// "Este blog es genial" tiene 3 espacios y 3 + 1 palabras
String[] partes = new String[cp + 1];
for (int i = 0; i < partes.length; i++) {
    partes[i] = ""; // Se inicializa en "" en lugar de null (defecto)
}
 
int ind = 0; // Creamos un índice para las palabras
for (int i = 0; i < s.length(); i++) {
    if (s.charAt(i) == ' ') { // Si hay un espacio
        ind++; // Pasamos a la siguiente palabra
        continue; // Próximo i
    }
    partes[ind] += s.charAt(i); // Sino, agregamos el carácter a la palabra actual
}
return partes; // Devolvemos las partes
}

====
String cadena=JTextField.getText();

String[ ]split=cadena.split("\\s");

ArrayList<String> pal = new ArrayList<>();

for(int i = 0; i < split.length; i++){ // no recuerdo si es length o length()
    pal.add(split[i]);
}

=====
String[] datos = "hola mundo como estas".split(" ");

for(String item : datos)
{
  System.out.println(item);
}
*/