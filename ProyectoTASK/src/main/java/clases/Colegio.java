package clases;

import java.awt.image.BufferedImage;

import enumeraciones.Ciudad;
import enumeraciones.SubColegio;

public class Colegio extends Servicio {
	
	public SubColegio subColegio;

	public Colegio(String nombre, float precio, String descripcion, Ciudad ciudad, BufferedImage iconoCategoria,
			SubColegio subColegio) {
		super(nombre, precio, descripcion, ciudad, iconoCategoria);
		this.subColegio = subColegio;
	}
	
	public Colegio() {
		super();
	}

	/**
	 * Devuelve el valor de subColegio
	 * @return SubColegio devuelve el valor de subColegio
	 */
	public SubColegio getSubColegio() {
		return subColegio;
	}

	/**
	 * Método que da un nuevo valor a la variable subColegio
	 * @param subColegio el nuevo valor de subColegio
	 */
	public void setSubColegio(SubColegio subColegio) {
		this.subColegio = subColegio;
	}
	
	

}
