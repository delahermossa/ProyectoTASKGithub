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
	
	

}
