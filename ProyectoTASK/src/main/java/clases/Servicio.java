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


	/**
	 * Devuelve el valor de descripcion
	 * @return String devuelve el valor de descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}


	/**
	 * Devuelve el valor de ciudad
	 * @return Ciudad devuelve el valor de ciudad
	 */
	public Ciudad getCiudad() {
		return ciudad;
	}


	/**
	 * Devuelve el valor de iconoCategoria
	 * @return BufferedImage devuelve el valor de iconoCategoria
	 */
	public BufferedImage getIconoCategoria() {
		return iconoCategoria;
	}


	/**
	 * Método que da un nuevo valor a la variable descripcion
	 * @param descripcion el nuevo valor de descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	/**
	 * Método que da un nuevo valor a la variable ciudad
	 * @param ciudad el nuevo valor de ciudad
	 */
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}


	/**
	 * Método que da un nuevo valor a la variable iconoCategoria
	 * @param iconoCategoria el nuevo valor de iconoCategoria
	 */
	public void setIconoCategoria(BufferedImage iconoCategoria) {
		this.iconoCategoria = iconoCategoria;
	}
	
	
	
	
	
}
