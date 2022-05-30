package clases;

import java.awt.image.BufferedImage;

import enumeraciones.Ciudad;
import enumeraciones.SubBelleza;

public class Belleza extends Servicio{
	
	public SubBelleza subBelleza;

	public Belleza(String nombre, float precio, String descripcion, Ciudad ciudad, BufferedImage iconoCategoria,
			SubBelleza subBelleza) {
		super(nombre, precio, descripcion, ciudad, iconoCategoria);
		this.subBelleza = subBelleza;
	}

	public Belleza() {
		super();
	}

	/**
	 * Devuelve el valor de subBelleza
	 * @return SubBelleza devuelve el valor de subBelleza
	 */
	public SubBelleza getSubBelleza() {
		return subBelleza;
	}

	/**
	 * Método que da un nuevo valor a la variable subBelleza
	 * @param subBelleza el nuevo valor de subBelleza
	 */
	public void setSubBelleza(SubBelleza subBelleza) {
		this.subBelleza = subBelleza;
	}
	
	

}
