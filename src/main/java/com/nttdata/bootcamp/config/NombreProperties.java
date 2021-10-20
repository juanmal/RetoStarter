package com.nttdata.bootcamp.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("nombre")
public class NombreProperties {
	
	private String nombre = null;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
