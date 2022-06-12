package clases;

import java.awt.image.BufferedImage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import enumeraciones.Ciudad;
import excepciones.ContrasegnaIncorrectaException;
import excepciones.ContrasegnaInvalidaException;
import excepciones.UsuarioNoExisteException;
import utils.ConexionBD;

public class Usuario {

	private String nombreUsuario;
	private float carteraUsuario;
	private String email;
	private String contrase�a;
	private String direccion;
	private Ciudad ciudad;
	private boolean esAdmin;
	private ArrayList<Servicio> serviciosOfrecidos;
	private ArrayList<Cita> citasAgendadas;
	private ArrayList<Valoracion> valoracionUsuarioVendedor;
	private BufferedImage imagenPersona;

	public Usuario(String nombreUsuario, float carteraUsuario, String email, String contrase�a, String direccion,
			Ciudad ciudad, boolean esAdmin, ArrayList<Servicio> serviciosOfrecidos, ArrayList<Cita> citasAgendadas,
			ArrayList<Valoracion> valoracionUsuarioVendedor, BufferedImage imagenPersona) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.carteraUsuario = carteraUsuario;
		this.email = email;
		this.contrase�a = contrase�a;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.esAdmin = esAdmin;
		this.serviciosOfrecidos = serviciosOfrecidos;
		this.citasAgendadas = citasAgendadas;
		this.valoracionUsuarioVendedor = valoracionUsuarioVendedor;
		this.imagenPersona = imagenPersona;
	}

	/**
	 * Constructor que da de alta en BBDD el usuario
	 * 
	 * @throws SQLException
	 */
	public Usuario(String nombreUsuario, String email, String contrase�a, String direccion, Ciudad ciudad)
			throws SQLException {
		super();

		Statement smt = ConexionBD.conectar();
		if (smt.executeUpdate("insert into usuarios (email,contrase�a,nombre,direccion,ciudad)values('" + email + "','"
				+ contrase�a + "','" + nombreUsuario + "','" + direccion + "','" + ciudad + "')") > 0) {
			// Solo si todo ha ido bien insertando, se modifican las variables internas
			this.nombreUsuario = nombreUsuario;
			this.email = email;
			this.contrase�a = contrase�a;
			this.direccion = direccion;
			this.ciudad = ciudad;
		} else {
			// Si no se ha podido insertar, lanzo un error: Algo ha ido mal.
			ConexionBD.desconectar();
			throw new SQLException("No se ha podido insertar");
		}
		ConexionBD.desconectar();
	}

	// Constructor PantallaUsuario
	public Usuario(String nombreUsuario, String email, String direccion, float cartera, Ciudad ciudad)
			throws SQLException {

		Statement smt = ConexionBD.conectar();
		ResultSet cursor = smt.executeQuery(
				"select (email, nombre, direccion, cartera, ciudad) from usuarios where email = '" + email + "'");
		this.nombreUsuario = nombreUsuario;
		this.email = email;

		this.direccion = direccion;
		this.ciudad = ciudad;
		ConexionBD.desconectar();

	}



	/**
	 * Metodo encargado de verificar usuario y contrase�a en BBDD
	 * 
	 * @param email
	 * @param contrase�a
	 * @throws SQLException
	 * @throws ContrasegnaIncorrectaException
	 * @throws UsuarioNoExisteException
	 * @throws ContrasegnaInvalidaException
	 */
	public Usuario(String email, String contrase�a) throws SQLException, ContrasegnaIncorrectaException,
			UsuarioNoExisteException, ContrasegnaInvalidaException {

		if (!isPassValid(contrase�a)) {
			throw new ContrasegnaInvalidaException("La contrase�a debe tener al menos 3 caracteres.");
		}

		Statement smt = ConexionBD.conectar();
		ResultSet cursor = smt.executeQuery("select *from usuarios where email = '" + email + "'");

		if (cursor.next()) {
			this.contrase�a = cursor.getString("contrase�a");
			if (!this.contrase�a.equals(contrase�a)) {
				ConexionBD.desconectar();
				throw new ContrasegnaIncorrectaException("La contrase�a no es correcta");
			}
			this.email = cursor.getString("email");
			this.nombreUsuario = cursor.getString("nombre");
			this.carteraUsuario = cursor.getFloat("cartera");
			this.direccion = cursor.getString("direccion");
			this.ciudad = Ciudad.valueOf(cursor.getString("ciudad"));

		} else {
			ConexionBD.desconectar();
			throw new UsuarioNoExisteException("No existe ese email en la BD");
		}
		ConexionBD.desconectar();
	}

	/**/

	public Usuario() {
		super();
	}

	/**
	 * Devuelve el valor de email
	 * 
	 * @return String devuelve el valor de email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Devuelve el valor de contrase�a
	 * 
	 * @return String devuelve el valor de contrase�a
	 */
	public String getContrase�a() {
		return contrase�a;
	}

	/**
	 * Devuelve el valor de direccion
	 * 
	 * @return String devuelve el valor de direccion
	 */
	public String getDireccion() {
		return direccion;
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
	 * Devuelve el valor de esAdmin
	 * 
	 * @return boolean devuelve el valor de esAdmin
	 */
	public boolean isEsAdmin() {
		return esAdmin;
	}

	/**
	 * Devuelve el valor de serviciosOfrecidos
	 * 
	 * @return ArrayList<Servicio> devuelve el valor de serviciosOfrecidos
	 */
	public ArrayList<Servicio> getServiciosOfrecidos() {
		return serviciosOfrecidos;
	}

	/**
	 * Devuelve el valor de citasAgendadas
	 * 
	 * @return ArrayList<Cita> devuelve el valor de citasAgendadas
	 */
	public ArrayList<Cita> getCitasAgendadas() {
		return citasAgendadas;
	}

	/**
	 * Devuelve el valor de valoracionUsuarioVendedor
	 * 
	 * @return ArrayList<Valoracion> devuelve el valor de valoracionUsuarioVendedor
	 */
	public ArrayList<Valoracion> getValoracionUsuarioVendedor() {
		return valoracionUsuarioVendedor;
	}

	/**
	 * Devuelve el valor de imagenPersona
	 * 
	 * @return BufferedImage devuelve el valor de imagenPersona
	 */
	public BufferedImage getImagenPersona() {
		return imagenPersona;
	}

	/**
	 * M�todo que da un nuevo valor a la variable email
	 * 
	 * @param email el nuevo valor de email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * M�todo que da un nuevo valor a la variable contrase�a
	 * 
	 * @param contrase�a el nuevo valor de contrase�a
	 */
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	/**
	 * M�todo que da un nuevo valor a la variable direccion
	 * 
	 * @param direccion el nuevo valor de direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * M�todo que da un nuevo valor a la variable ciudad
	 * 
	 * @param ciudad el nuevo valor de ciudad
	 */
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * M�todo que da un nuevo valor a la variable esAdmin
	 * 
	 * @param esAdmin el nuevo valor de esAdmin
	 */
	public void setEsAdmin(boolean esAdmin) {
		this.esAdmin = esAdmin;
	}

	/**
	 * M�todo que da un nuevo valor a la variable serviciosOfrecidos
	 * 
	 * @param serviciosOfrecidos el nuevo valor de serviciosOfrecidos
	 */
	public void setServiciosOfrecidos(ArrayList<Servicio> serviciosOfrecidos) {
		this.serviciosOfrecidos = serviciosOfrecidos;
	}

	/**
	 * M�todo que da un nuevo valor a la variable citasAgendadas
	 * 
	 * @param citasAgendadas el nuevo valor de citasAgendadas
	 */
	public void setCitasAgendadas(ArrayList<Cita> citasAgendadas) {
		this.citasAgendadas = citasAgendadas;
	}

	/**
	 * M�todo que da un nuevo valor a la variable valoracionUsuarioVendedor
	 * 
	 * @param valoracionUsuarioVendedor el nuevo valor de valoracionUsuarioVendedor
	 */
	public void setValoracionUsuarioVendedor(ArrayList<Valoracion> valoracionUsuarioVendedor) {
		this.valoracionUsuarioVendedor = valoracionUsuarioVendedor;
	}

	/**
	 * M�todo que da un nuevo valor a la variable imagenPersona
	 * 
	 * @param imagenPersona el nuevo valor de imagenPersona
	 */
	public void setImagenPersona(BufferedImage imagenPersona) {
		this.imagenPersona = imagenPersona;
	}

	/**
	 * Devuelve el valor de nombreUsuario
	 * 
	 * @return String devuelve el valor de nombreUsuario
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	/**
	 * Devuelve el valor de carteraUsuario
	 * 
	 * @return float devuelve el valor de carteraUsuario
	 */
	public float getCarteraUsuario() {
		return carteraUsuario;
	}

	/**
	 * M�todo que da un nuevo valor a la variable nombreUsuario
	 * 
	 * @param nombreUsuario el nuevo valor de nombreUsuario
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	/**
	 * M�todo que da un nuevo valor a la variable carteraUsuario
	 * 
	 * @param carteraUsuario el nuevo valor de carteraUsuario
	 */
	public void setCarteraUsuario(float carteraUsuario) {
		this.carteraUsuario = carteraUsuario;
	}

	/**
	 * metodo que te comprueba si una contrase�a tiene el formato valido
	 * 
	 * @param contrase�a
	 * @return
	 */
	public static boolean isPassValid(String contrase�a) {
		try {
			if (contrase�a.length() < 3) {
				return false;
			} else {
				return true;
			}
		} catch (NullPointerException e) {
			return false;
		}

	}

	@Override
	public String toString() {
		return "Usuario [nombreUsuario=" + nombreUsuario + ", carteraUsuario=" + carteraUsuario + ", email=" + email
				+ ", contrase�a=" + contrase�a + ", direccion=" + direccion + ", ciudad=" + ciudad + ", esAdmin="
				+ esAdmin + ", serviciosOfrecidos=" + serviciosOfrecidos + ", citasAgendadas=" + citasAgendadas
				+ ", valoracionUsuarioVendedor=" + valoracionUsuarioVendedor + ", imagenPersona=" + imagenPersona + "]";
	}

}
