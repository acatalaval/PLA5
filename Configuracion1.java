package com.pla5.springannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.pla5.springannotations")
public class Configuracion1 {
	
	@Bean
	public IProcesar palabras() {
		return new Palabras();
	}
	
	@Bean
	public ICodificar invertir() {
		return new Invertir();
	}
	
	@Bean
	public Codificador codificador() {
		return new Codificador(palabras(), invertir());
	}
    
}
