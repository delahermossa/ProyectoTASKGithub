package clases;

import java.awt.image.BufferedImage;
import java.sql.SQLException;

import enumeraciones.Ciudad;
import enumeraciones.SubBelleza;

public class Belleza extends Servicio{
	/**
	 * Clase que hereda de servicio
	 */
	public SubBelleza subBelleza;

	
	/**
	 * Constructor de belleza
	 * @param nombreServicio
	 * @param categoria
	 * @param subCategoria
	 * @param precioServicio
	 * @param descripcion
	 * @param ciudad
	 * @param subBelleza
	 * @param email
	 * @throws SQLException
	 */
	public Belleza(String nombreServicio, String categoria, String subCategoria, float precioServicio,
			String descripcion, Ciudad ciudad, SubBelleza subBelleza, String email) throws SQLException {
		super(nombreServicio, categoria, subCategoria, precioServicio, descripcion, ciudad, email);
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
