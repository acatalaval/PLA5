package com.pla5.springannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.pla5.springannotations")
public class Configuracion2 {
	
	@Bean
	public IProcesar palabras() {
		return new Palabras();
	}
	
	@Bean
	public ICodificar cesar() {
		return new Cesar();
	}

	@Bean
	public Codificador codificador() {
		return new Codificador(palabras(), cesar());
	}
}

