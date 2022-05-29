package clases;

import java.awt.image.BufferedImage;

import enumeraciones.Ciudad;
import enumeraciones.SubMascota;

public class Mascota extends Servicio{
	
	public SubMascota subMascota;

	public Mascota(String nombre, float precio, String descripcion, Ciudad ciudad, BufferedImage iconoCategoria,
			SubMascota subMascota) {
		super(nombre, precio, descripcion, ciudad, iconoCategoria);
		this.subMascota = subMascota;
	}
	
	public Mascota() {
		super();
	}

}
