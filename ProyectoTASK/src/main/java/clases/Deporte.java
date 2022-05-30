package clases;

import java.awt.image.BufferedImage;

import enumeraciones.Ciudad;
import enumeraciones.SubDeporte;

public class Deporte extends Servicio{
	
	public SubDeporte subDeporte;

	public Deporte(String nombre, float precio, String descripcion, Ciudad ciudad, BufferedImage iconoCategoria,
			SubDeporte subDeporte) {
		super(nombre, precio, descripcion, ciudad, iconoCategoria);
		this.subDeporte = subDeporte;
	}
	
	public Deporte() {
		super();
	}

	/**
	 * Devuelve el valor de subDeporte
	 * @return SubDeporte devuelve el valor de subDeporte
	 */
	public SubDeporte getSubDeporte() {
		return subDeporte;
	}

	/**
	 * Método que da un nuevo valor a la variable subDeporte
	 * @param subDeporte el nuevo valor de subDeporte
	 */
	public void setSubDeporte(SubDeporte subDeporte) {
		this.subDeporte = subDeporte;
	}
	
	

}
