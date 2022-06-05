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
	private BufferedImage fotoUsuario;

	public Servicio() {
		super();
	}

	public Servicio(String nombreServicio, String categoria, String subCategoria, float precioServicio,
			String descripcion, Ciudad ciudad, String email) throws SQLException {
		super();

		Statement smt = ConexionBD.conectar();
		if (smt.executeUpdate(
				"insert into servicios (nombreCategoria,precio,descripcion,subcategoria,nombreServicio)values('"
						+ categoria + "','" + precioServicio + "','" + descripcion + "','" + subCategoria + "','"
						+ nombreServicio + "')") > 0
				&& smt.executeUpdate("insert into servicios_usuarios (nombreServicio,email_usuario, compra)values('"
						+ nombreServicio + "', '" + email + "', '0')") > 0) {

			this.nombreServicio = nombreServicio;
			this.categoria = categoria;
			this.subCategoria = subCategoria;
			this.precioServicio = precioServicio;
			this.descripcion = descripcion;
			this.ciudad = ciudad;

		} else {
			// Si no se ha podido insertar, lanzo un error: Algo ha ido mal.
			ConexionBD.desconectar();
			throw new SQLException("No se ha podido insertar");
		}
		ConexionBD.desconectar();
	}

	public void comprarServicio(String mailUsuario) throws SQLException {
		Statement smt = ConexionBD.conectar();
		if (smt.executeUpdate("insert into servicios_usuarios (nombreServicio,email_usuario, compra)values('"
				+ nombreServicio + "', '" + mailUsuario + "', '0')") > 0) {

		} else {
			// Si no se ha podido insertar, lanzo un error: Algo ha ido mal.
			ConexionBD.desconectar();
			throw new SQLException("No se ha podido insertar tu compra");
		}
		ConexionBD.desconectar();

	}

	public void borrarServicio() throws SQLException {
		Statement smt = ConexionBD.conectar();
		if (smt.executeUpdate("DELETE FROM servicios WHERE nombreServicio='" + nombreServicio + "'") > 0) {

		} else {
			// Si no se ha podido insertar, lanzo un error: Algo ha ido mal.
			ConexionBD.desconectar();
			throw new SQLException("No se ha podido insertar tu compra");
		}
		ConexionBD.desconectar();
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
	 * Devuelve el valor de fotoUsuario
	 * 
	 * @return BufferedImage devuelve el valor de fotoUsuario
	 */
	public BufferedImage getfotoUsuario() {
		return fotoUsuario;
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
	 * Método que da un nuevo valor a la variable fotoUsuario
	 * 
	 * @param fotoUsuario el nuevo valor de fotoUsuario
	 */
	public void setfotoUsuario(BufferedImage fotoUsuario) {
		this.fotoUsuario = fotoUsuario;
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
	 * Función que recorre la tabla usuario y servicio y realiza un select de los
	 * servicios para mostrar en la PantallaListadoServicios los servicios recogidos
	 * por cada categoria
	 * 
	 * @param servicio
	 * @return
	 * @throws SQLException
	 */
	public static ArrayList<UsuarioServicio> consultarServicios(String servicio) throws SQLException {
		ArrayList<UsuarioServicio> listadoServicios = new ArrayList<>();
		Statement smt = ConexionBD.conectar();
		ResultSet cursor = smt.executeQuery(
				"SELECT * FROM servicios_usuarios su JOIN servicios  s ON su.nombreServicio = s.nombreServicio JOIN usuarios u ON su.email_usuario = u.email where su.compra='0' and s.subcategoria='"
						+ servicio + "'");
		// Aquï¿½ podemos usar if en vez de while porque si el email estï¿½, solo va a
		// estar
		// una vez, porque es la PK
		while (cursor.next()) {
			System.out.println("Servicio");
			UsuarioServicio s = new UsuarioServicio();
			Usuario usu = new Usuario();
			usu.setNombreUsuario(cursor.getString("nombre"));
			Servicio servicios = new Servicio();
			servicios.setNombreServicio(cursor.getString("nombreServicio"));
			servicios.setPrecioServicio(cursor.getFloat("precio"));
			servicios.setDescripcion(cursor.getString("descripcion"));
			servicios.setCategoria(cursor.getString("nombreCategoria"));
			servicios.setSubCategoria(cursor.getString("subcategoria"));
			usu.setCarteraUsuario(cursor.getFloat("cartera"));
			usu.setNombreUsuario(cursor.getString("nombre"));
			usu.setEmail(cursor.getString("email"));
			usu.setDireccion(cursor.getString("direccion"));
			usu.setCiudad(Ciudad.valueOf(cursor.getString("ciudad")));
			s.setServicio(servicios);
			s.setUsuario(usu);
			listadoServicios.add(s);

		}
		ConexionBD.desconectar();
		return listadoServicios;

	}

	public static ArrayList<UsuarioServicio> consultarMisServicios(String nombre) throws SQLException {
		ArrayList<UsuarioServicio> listadoServicios = new ArrayList<>();
		Statement smt = ConexionBD.conectar();
		ResultSet cursor = smt.executeQuery(
				"SELECT * FROM servicios_usuarios su JOIN servicios  s ON su.nombreServicio = s.nombreServicio JOIN usuarios u ON su.email_usuario = u.email where u.email='"
						+ nombre + "'");
		// Aquï¿½ podemos usar if en vez de while porque si el email estï¿½, solo va a
		// estar
		// una vez, porque es la PK
		while (cursor.next()) {
			System.out.println("Servicio");
			UsuarioServicio s = new UsuarioServicio();
			Usuario usu = new Usuario();
			usu.setNombreUsuario(cursor.getString("nombre"));
			Servicio servicios = new Servicio();
			servicios.setNombreServicio(cursor.getString("nombreServicio"));
			servicios.setPrecioServicio(cursor.getFloat("precio"));
			servicios.setDescripcion(cursor.getString("descripcion"));
			servicios.setCategoria(cursor.getString("nombreCategoria"));
			servicios.setSubCategoria(cursor.getString("subcategoria"));
			usu.setCarteraUsuario(cursor.getFloat("cartera"));
			usu.setNombreUsuario(cursor.getString("nombre"));
			usu.setEmail(cursor.getString("email"));
			usu.setDireccion(cursor.getString("direccion"));
			usu.setCiudad(Ciudad.valueOf(cursor.getString("ciudad")));
			s.setServicio(servicios);
			s.setUsuario(usu);
			listadoServicios.add(s);

		}
		ConexionBD.desconectar();
		return listadoServicios;

	}

	@Override
	public String toString() {
		return "Servicio [nombreServicio=" + nombreServicio + ", categoria=" + categoria + ", subCategoria="
				+ subCategoria + ", precioServicio=" + precioServicio + ", descripcion=" + descripcion + ", usuario="
				+ usuario + ", ciudad=" + ciudad + ", fotoUsuario=" + fotoUsuario + "]";
	}

}
