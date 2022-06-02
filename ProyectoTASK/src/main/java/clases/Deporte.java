package clases;

import java.awt.image.BufferedImage;
import java.sql.SQLException;

import enumeraciones.Ciudad;
import enumeraciones.SubDeporte;

public class Deporte extends Servicio{
	
	public SubDeporte subDeporte;


	public Deporte(String nombreServicio, String categoria, String subCategoria, float precioServicio,
			String descripcion, Ciudad ciudad, SubDeporte subDeporte) throws SQLException {
		super(nombreServicio, categoria, subCategoria, precioServicio, descripcion, ciudad);
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
