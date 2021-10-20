package com.nttdata.bootcamp;

public class Nombre {
	private String nombre;
	
	private static Nombre instancia;

	private Nombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static Nombre getNombreInstance(String nombre) {
		if (instancia == null)
			instancia = new Nombre(nombre);
		
		return instancia;			
	}
	
	public String getNombre() {
		if (nombre == null)
			return "Nombre no especificado";
		else
			return this.nombre;
	}
}
