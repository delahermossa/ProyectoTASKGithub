package clases;

import java.awt.image.BufferedImage;
import java.sql.SQLException;

import enumeraciones.Ciudad;
import enumeraciones.SubColegio;

public class Colegio extends Servicio {
	
	public SubColegio subColegio;

	
	
	public Colegio(String nombreServicio, String categoria, String subCategoria, float precioServicio,
			String descripcion, Ciudad ciudad, SubColegio subColegio) throws SQLException {
		super(nombreServicio, categoria, subCategoria, precioServicio, descripcion, ciudad);
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
