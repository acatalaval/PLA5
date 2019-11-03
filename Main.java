package com.pla5.springannotations;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// Cargar el contexto
				AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configuracion1.class);

			/*
				// Pedir el bean
				
				IProcesar misPalabras = context.getBean("palabras", IProcesar.class);

				// Ejecutar algún método
				
				System.out.println("Escribe una frase: ");
				
				Scanner s = new Scanner(System.in);  // Create a Scanner object

				String cadena = s.nextLine();
				
				System.out.println(misPalabras.dividir(cadena));
				
				System.out.println(misPalabras.unir(misPalabras.dividir(cadena))); */
				
				// Pedir el bean
				
				Codificador miCodificador = context.getBean("codificador", Codificador.class);
				
				// Ejecutar algún método
				
				System.out.println("Escribe una frase: ");
				
				Scanner s = new Scanner(System.in);  // Create a Scanner object

				String cadena = s.nextLine();
				
				System.out.println(miCodificador.codificar(cadena));

				// Cerrar el contexto
				context.close();

	}

}
