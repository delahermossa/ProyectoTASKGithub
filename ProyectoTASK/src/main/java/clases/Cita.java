package clases;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;

import enumeraciones.Ciudad;
import utils.ConexionBD;
import utils.Utils;
/**
 * Clase cita creada para crear y consultar citas de los servicios ofrecidos
 * @author delah
 *
 */
public class Cita {

	private String fechaCita;
	private Usuario usuario;
	private Servicio servicio;

	public Cita(String fechaCita, Usuario usuario, Servicio servicio) {
		super();
		this.fechaCita = fechaCita;
		this.usuario = usuario;
		this.servicio = servicio;
	}

	/**
	 * Metodo encargado de crear una cita en BBDD
	 * 
	 * @param usuServicio
	 * @param fechaCita
	 * @throws SQLException
	 */
	public static void crearCita(UsuarioServicio usuServicio, String fechaCita) throws SQLException {

		Statement smt = ConexionBD.conectar();
		if (smt.executeUpdate("insert into citas (fechacita, email_usuario, nombreServicio)values('" + fechaCita
				+ "', '" + usuServicio.getUsuario().getEmail() + "', '" + usuServicio.getServicio().getNombreServicio()
				+ "')") > 0) {

		} else {
			// Si no se ha podido insertar, lanzo un error: Algo ha ido mal.
			ConexionBD.desconectar();
			throw new SQLException("No se ha podido insertar tu compra");
		}
		ConexionBD.desconectar();

	}

	/**
	 * Metodo encargado de consultar las citas del usuario logeado
	 * 
	 * @return la lista de citas del usuario logeado
	 * @throws SQLException
	 */

	public static ArrayList<Cita> consultarCitas() throws SQLException {
		ArrayList<Cita> listadoServicios = new ArrayList<>();
		Statement smt = ConexionBD.conectar();
		ResultSet cursor = smt.executeQuery(
				"SELECT * FROM citas su JOIN servicios  s ON su.nombreServicio = s.nombreServicio JOIN usuarios u ON su.email_usuario = u.email where su.email_usuario='"
						+ Utils.currentUser.getEmail() + "'");
		// Aquï¿½ podemos usar if en vez de while porque si el email estï¿½, solo va a
		// estar
		// una vez, porque es la PK
		while (cursor.next()) {
			System.out.println("Servicio");
			Cita s = new Cita();
			s.setFechaCita(cursor.getString("fechaCita"));
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

	public Cita() {
		super();
	}

	/**
	 * Devuelve el valor de fechaCita
	 * 
	 * @return LocalDateTime devuelve el valor de fechaCita
	 */
	public String getFechaCita() {
		return fechaCita;
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
	 * Devuelve el valor de servicio
	 * 
	 * @return Servicio devuelve el valor de servicio
	 */
	public Servicio getServicio() {
		return servicio;
	}

	/**
	 * Método que da un nuevo valor a la variable fechaCita
	 * 
	 * @param fechaCita el nuevo valor de fechaCita
	 */
	public void setFechaCita(String fechaCita) {
		this.fechaCita = fechaCita;
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
	 * Método que da un nuevo valor a la variable servicio
	 * 
	 * @param servicio el nuevo valor de servicio
	 */
	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

}
