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
	
	

}
