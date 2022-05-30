package clases;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

import enumeraciones.Ciudad;

public class Usuario extends ElementoConDineroYNombre{
	
	private String email;
	private String apellidos;
	private String contraseña;
	private String direccion;
	private Ciudad ciudad;/* Preguntar a Miguel si quitar direccion*/
	private boolean esAdmin;
	private  ArrayList<Servicio> serviciosOfrecidos;
	private ArrayList<Cita> citasAgendadas;
	private ArrayList<Valoracion> valoracionUsuarioVendedor;
	private BufferedImage imagenPersona;
	
	
	public Usuario(String nombre, float precio, String email, String apellidos, String contraseña, String direccion,
			Ciudad ciudad, boolean esAdmin, ArrayList<Servicio> serviciosOfrecidos, ArrayList<Cita> citasAgendadas,
			ArrayList<Valoracion> valoracionUsuarioVendedor, BufferedImage imagenPersona) {
		super(nombre, precio);
		this.email = email;
		this.apellidos = apellidos;
		this.contraseña = contraseña;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.esAdmin = esAdmin;
		this.serviciosOfrecidos = serviciosOfrecidos;
		this.citasAgendadas = citasAgendadas;
		this.valoracionUsuarioVendedor = valoracionUsuarioVendedor;
		this.imagenPersona = imagenPersona;
	}


	public Usuario(String nombre, float precio) {
		super(nombre, precio);
	}
	
	
	
	/**
	 * Constructor de usuario para PantallaRegistro
	 */
	public Usuario(String nombre, String email, String apellidos, String contraseña, String direccion,
			Ciudad ciudad, BufferedImage imagenPersona) {
		super(nombre);
		this.email = email;
		this.apellidos = apellidos;
		this.contraseña = contraseña;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.imagenPersona = imagenPersona;
	}
	
	/**
	 * Constructor usuario para pantallaLogin
	 */

	public Usuario(String email, String contraseña) {
		super();
		this.email = email;
		this.contraseña = contraseña;
	}


	public Usuario() {
		super();
	}


	/**
	 * Devuelve el valor de email
	 * @return String devuelve el valor de email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * Devuelve el valor de apellidos
	 * @return String devuelve el valor de apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}


	/**
	 * Devuelve el valor de contraseña
	 * @return String devuelve el valor de contraseña
	 */
	public String getContraseña() {
		return contraseña;
	}


	/**
	 * Devuelve el valor de direccion
	 * @return String devuelve el valor de direccion
	 */
	public String getDireccion() {
		return direccion;
	}


	/**
	 * Devuelve el valor de ciudad
	 * @return Ciudad devuelve el valor de ciudad
	 */
	public Ciudad getCiudad() {
		return ciudad;
	}


	/**
	 * Devuelve el valor de esAdmin
	 * @return boolean devuelve el valor de esAdmin
	 */
	public boolean isEsAdmin() {
		return esAdmin;
	}


	/**
	 * Devuelve el valor de serviciosOfrecidos
	 * @return ArrayList<Servicio> devuelve el valor de serviciosOfrecidos
	 */
	public ArrayList<Servicio> getServiciosOfrecidos() {
		return serviciosOfrecidos;
	}


	/**
	 * Devuelve el valor de citasAgendadas
	 * @return ArrayList<Cita> devuelve el valor de citasAgendadas
	 */
	public ArrayList<Cita> getCitasAgendadas() {
		return citasAgendadas;
	}


	/**
	 * Devuelve el valor de valoracionUsuarioVendedor
	 * @return ArrayList<Valoracion> devuelve el valor de valoracionUsuarioVendedor
	 */
	public ArrayList<Valoracion> getValoracionUsuarioVendedor() {
		return valoracionUsuarioVendedor;
	}


	/**
	 * Devuelve el valor de imagenPersona
	 * @return BufferedImage devuelve el valor de imagenPersona
	 */
	public BufferedImage getImagenPersona() {
		return imagenPersona;
	}


	/**
	 * Método que da un nuevo valor a la variable email
	 * @param email el nuevo valor de email
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * Método que da un nuevo valor a la variable apellidos
	 * @param apellidos el nuevo valor de apellidos
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	/**
	 * Método que da un nuevo valor a la variable contraseña
	 * @param contraseña el nuevo valor de contraseña
	 */
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}


	/**
	 * Método que da un nuevo valor a la variable direccion
	 * @param direccion el nuevo valor de direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	/**
	 * Método que da un nuevo valor a la variable ciudad
	 * @param ciudad el nuevo valor de ciudad
	 */
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}


	/**
	 * Método que da un nuevo valor a la variable esAdmin
	 * @param esAdmin el nuevo valor de esAdmin
	 */
	public void setEsAdmin(boolean esAdmin) {
		this.esAdmin = esAdmin;
	}


	/**
	 * Método que da un nuevo valor a la variable serviciosOfrecidos
	 * @param serviciosOfrecidos el nuevo valor de serviciosOfrecidos
	 */
	public void setServiciosOfrecidos(ArrayList<Servicio> serviciosOfrecidos) {
		this.serviciosOfrecidos = serviciosOfrecidos;
	}


	/**
	 * Método que da un nuevo valor a la variable citasAgendadas
	 * @param citasAgendadas el nuevo valor de citasAgendadas
	 */
	public void setCitasAgendadas(ArrayList<Cita> citasAgendadas) {
		this.citasAgendadas = citasAgendadas;
	}


	/**
	 * Método que da un nuevo valor a la variable valoracionUsuarioVendedor
	 * @param valoracionUsuarioVendedor el nuevo valor de valoracionUsuarioVendedor
	 */
	public void setValoracionUsuarioVendedor(ArrayList<Valoracion> valoracionUsuarioVendedor) {
		this.valoracionUsuarioVendedor = valoracionUsuarioVendedor;
	}


	/**
	 * Método que da un nuevo valor a la variable imagenPersona
	 * @param imagenPersona el nuevo valor de imagenPersona
	 */
	public void setImagenPersona(BufferedImage imagenPersona) {
		this.imagenPersona = imagenPersona;
	}
	
	
}
