package clases;

import java.awt.image.BufferedImage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map;

import enumeraciones.Ciudad;
import excepciones.ContrasegnaIncorrectaException;
import excepciones.UsuarioNoExisteException;
import utils.ConexionBD;

public class Servicio {

	private String nombreServicio;
	private String categoria;
	private String subCategoria;
	private float precioServicio;
	private String descripcion;
	private Usuario usuario;
	private Ciudad ciudad;
	private BufferedImage iconoCategoria;

	public Servicio() {
		super();
	}

	public Servicio(String nombreServicio, float precioServicio, String descripcion, Ciudad ciudad,
			BufferedImage iconoCategoria) {
		super();
		this.nombreServicio = nombreServicio;
		this.precioServicio = precioServicio;
		this.descripcion = descripcion;
		this.ciudad = ciudad;
		this.iconoCategoria = iconoCategoria;
	}

	/**
	 * Devuelve el valor de nombreServicio
	 * 
	 * @return String devuelve el valor de nombreServicio
	 */
	public String getNombreServicio() {
		return nombreServicio;
	}

	/**
	 * Devuelve el valor de precioServicio
	 * 
	 * @return float devuelve el valor de precioServicio
	 */
	public float getPrecioServicio() {
		return precioServicio;
	}

	/**
	 * Devuelve el valor de descripcion
	 * 
	 * @return String devuelve el valor de descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Devuelve el valor de ciudad
	 * 
	 * @return Ciudad devuelve el valor de ciudad
	 */
	public Ciudad getCiudad() {
		return ciudad;
	}

	/**
	 * Devuelve el valor de iconoCategoria
	 * 
	 * @return BufferedImage devuelve el valor de iconoCategoria
	 */
	public BufferedImage getIconoCategoria() {
		return iconoCategoria;
	}

	/**
	 * Método que da un nuevo valor a la variable nombreServicio
	 * 
	 * @param nombreServicio el nuevo valor de nombreServicio
	 */
	public void setNombreServicio(String nombreServicio) {
		this.nombreServicio = nombreServicio;
	}

	/**
	 * Método que da un nuevo valor a la variable precioServicio
	 * 
	 * @param precioServicio el nuevo valor de precioServicio
	 */
	public void setPrecioServicio(float precioServicio) {
		this.precioServicio = precioServicio;
	}

	/**
	 * Método que da un nuevo valor a la variable descripcion
	 * 
	 * @param descripcion el nuevo valor de descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Método que da un nuevo valor a la variable ciudad
	 * 
	 * @param ciudad el nuevo valor de ciudad
	 */
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * Método que da un nuevo valor a la variable iconoCategoria
	 * 
	 * @param iconoCategoria el nuevo valor de iconoCategoria
	 */
	public void setIconoCategoria(BufferedImage iconoCategoria) {
		this.iconoCategoria = iconoCategoria;
	}

	/**
	 * Devuelve el valor de categoria
	 * 
	 * @return String devuelve el valor de categoria
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * Devuelve el valor de subCategoria
	 * 
	 * @return String devuelve el valor de subCategoria
	 */
	public String getSubCategoria() {
		return subCategoria;
	}

	/**
	 * Devuelve el valor de usuario
	 * 
	 * @return Usuario devuelve el valor de usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * Método que da un nuevo valor a la variable categoria
	 * 
	 * @param categoria el nuevo valor de categoria
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	/**
	 * Método que da un nuevo valor a la variable subCategoria
	 * 
	 * @param subCategoria el nuevo valor de subCategoria
	 */
	public void setSubCategoria(String subCategoria) {
		this.subCategoria = subCategoria;
	}

	/**
	 * Método que da un nuevo valor a la variable usuario
	 * 
	 * @param usuario el nuevo valor de usuario
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	/**
	 * Función que recorre la tabla usuario y servicio y realiza un select de los servicios para mostrar
	 * en la PantallaListadoServicios los servicios recogidos por cada categoria 
	 * @param servicio
	 * @return
	 * @throws SQLException
	 */
	public static ArrayList<UsuarioServicio> consultarServicios(String servicio) throws SQLException {
		ArrayList<UsuarioServicio> listadoServicios = new ArrayList<>();
		Statement smt = ConexionBD.conectar();
		ResultSet cursor = smt.executeQuery("select * from servicios where nombreCategoria='" + servicio + "'");
		// Aquï¿½ podemos usar if en vez de while porque si el email estï¿½, solo va a
		// estar
		// una vez, porque es la PK
		while (cursor.next()) {
			System.out.println("Servicio");
			UsuarioServicio s = new UsuarioServicio();
			Usuario usu = new Usuario();
			Servicio servicios = new Servicio();
			servicios.setNombreServicio(cursor.getString("nombreServicio"));
			servicios.setPrecioServicio(cursor.getFloat("precio"));
			servicios.setDescripcion(cursor.getString("descripcion"));
			servicios.setCategoria(cursor.getString("nombreCategoria"));
			servicios.setSubCategoria(cursor.getString("subcategoria"));
			s.setServicio(servicios);
			s.setUsuario(usu);
			listadoServicios.add(s);

		}
		ConexionBD.desconectar();
		return listadoServicios;

	}

}
