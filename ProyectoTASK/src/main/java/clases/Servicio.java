package clases;

import java.awt.image.BufferedImage;

import enumeraciones.Ciudad;

public class Servicio extends ElementoConDineroYNombre {
	
	private String descripcion;
	private Ciudad ciudad;
	private BufferedImage iconoCategoria;
	
	
	public Servicio(String nombre, float precio, String descripcion, Ciudad ciudad, BufferedImage iconoCategoria) {
		super(nombre, precio);
		this.descripcion = descripcion;
		this.ciudad = ciudad;
		this.iconoCategoria = iconoCategoria;
	}


	public Servicio(String nombre, float precio) {
		super(nombre, precio);
	}


	public Servicio() {
		super();
	}
	
	
	
	
	
}
