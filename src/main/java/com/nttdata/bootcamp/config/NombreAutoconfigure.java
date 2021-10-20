package com.nttdata.bootcamp.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nttdata.bootcamp.Nombre;

@Configuration
@ConditionalOnClass(Nombre.class)
@EnableConfigurationProperties(NombreProperties.class)
public class NombreAutoconfigure {
	
	private final NombreProperties properties;
	
	public NombreAutoconfigure(NombreProperties properties) {
		this.properties = properties;
	}
	
	@Bean
	public Nombre nombre() {
		return Nombre.getNombreInstance(properties.getNombre());
	}
}
