package clases;

import java.awt.image.BufferedImage;
import java.sql.SQLException;

import enumeraciones.Ciudad;
import enumeraciones.SubHogar;

public class Hogar extends Servicio {
	
	public SubHogar subHogar;

	
	
	public Hogar(String nombreServicio, String categoria, String subCategoria, float precioServicio, String descripcion,
			Ciudad ciudad, SubHogar subHogar) throws SQLException {
		super(nombreServicio, categoria, subCategoria, precioServicio, descripcion, ciudad);
		this.subHogar = subHogar;
	}

	public Hogar() {
		super();
	}

	/**
	 * Devuelve el valor de subHogar
	 * @return SubHogar devuelve el valor de subHogar
	 */
	public SubHogar getSubHogar() {
		return subHogar;
	}

	/**
	 * Método que da un nuevo valor a la variable subHogar
	 * @param subHogar el nuevo valor de subHogar
	 */
	public void setSubHogar(SubHogar subHogar) {
		this.subHogar = subHogar;
	}
	
	

}
