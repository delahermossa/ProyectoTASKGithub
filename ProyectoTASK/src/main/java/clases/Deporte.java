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

}
