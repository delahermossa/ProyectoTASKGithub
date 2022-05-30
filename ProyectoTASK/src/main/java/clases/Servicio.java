package clases;

import java.awt.image.BufferedImage;

import enumeraciones.Ciudad;

public class Servicio {

	private String nombreServicio;
	private float precioServicio;
	private String descripcion;
	private Ciudad ciudad;
	private BufferedImage iconoCategoria;

	public Servicio() {
		super();
	}

	public Servicio(String nombreServicio, float precioServicio, String descripcion, Ciudad ciudad,
			BufferedImage iconoCategoria) {
		super();
		this.nombreServicio = nombreServicio;
		this.precioServicio = precioServicio;
		this.descripcion = descripcion;
		this.ciudad = ciudad;
		this.iconoCategoria = iconoCategoria;
	}

	/**
	 * Devuelve el valor de nombreServicio
	 * 
	 * @return String devuelve el valor de nombreServicio
	 */
	public String getNombreServicio() {
		return nombreServicio;
	}

	/**
	 * Devuelve el valor de precioServicio
	 * 
	 * @return float devuelve el valor de precioServicio
	 */
	public float getPrecioServicio() {
		return precioServicio;
	}

	/**
	 * Devuelve el valor de descripcion
	 * 
	 * @return String devuelve el valor de descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Devuelve el valor de ciudad
	 * 
	 * @return Ciudad devuelve el valor de ciudad
	 */
	public Ciudad getCiudad() {
		return ciudad;
	}

	/**
	 * Devuelve el valor de iconoCategoria
	 * 
	 * @return BufferedImage devuelve el valor de iconoCategoria
	 */
	public BufferedImage getIconoCategoria() {
		return iconoCategoria;
	}

	/**
	 * Método que da un nuevo valor a la variable nombreServicio
	 * 
	 * @param nombreServicio el nuevo valor de nombreServicio
	 */
	public void setNombreServicio(String nombreServicio) {
		this.nombreServicio = nombreServicio;
	}

	/**
	 * Método que da un nuevo valor a la variable precioServicio
	 * 
	 * @param precioServicio el nuevo valor de precioServicio
	 */
	public void setPrecioServicio(float precioServicio) {
		this.precioServicio = precioServicio;
	}

	/**
	 * Método que da un nuevo valor a la variable descripcion
	 * 
	 * @param descripcion el nuevo valor de descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Método que da un nuevo valor a la variable ciudad
	 * 
	 * @param ciudad el nuevo valor de ciudad
	 */
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * Método que da un nuevo valor a la variable iconoCategoria
	 * 
	 * @param iconoCategoria el nuevo valor de iconoCategoria
	 */
	public void setIconoCategoria(BufferedImage iconoCategoria) {
		this.iconoCategoria = iconoCategoria;
	}

}
