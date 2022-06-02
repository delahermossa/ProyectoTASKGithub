package clases;

import java.awt.image.BufferedImage;
import java.sql.SQLException;

import enumeraciones.Ciudad;
import enumeraciones.SubMascota;

public class Mascota extends Servicio {

	public SubMascota subMascota;

	public Mascota(String nombreServicio, String categoria, String subCategoria, float precioServicio,
			String descripcion, Ciudad ciudad, SubMascota subMascota) throws SQLException {
		super(nombreServicio, categoria, subCategoria, precioServicio, descripcion, ciudad);
		this.subMascota = subMascota;
	}
	
	
	
	public Mascota() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Devuelve el valor de subMascota
	 * 
	 * @return SubMascota devuelve el valor de subMascota
	 */
	public SubMascota getSubMascota() {
		return subMascota;
	}

	/**
	 * Método que da un nuevo valor a la variable subMascota
	 * 
	 * @param subMascota el nuevo valor de subMascota
	 */
	public void setSubMascota(SubMascota subMascota) {
		this.subMascota = subMascota;
	}

}
