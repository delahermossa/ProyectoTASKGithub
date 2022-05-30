package clases;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

import enumeraciones.Ciudad;

public class Usuario extends ElementoConDineroYNombre{
	
	private String email;
	private String apellidos;
	private String contrase�a;
	private String direccion;
	private Ciudad ciudad;/* Preguntar a Miguel si quitar direccion*/
	private boolean esAdmin;
	private  ArrayList<Servicio> serviciosOfrecidos;
	private ArrayList<Cita> citasAgendadas;
	private ArrayList<Valoracion> valoracionUsuarioVendedor;
	private BufferedImage imagenPersona;
	
	
	public Usuario(String nombre, float precio, String email, String apellidos, String contrase�a, String direccion,
			Ciudad ciudad, boolean esAdmin, ArrayList<Servicio> serviciosOfrecidos, ArrayList<Cita> citasAgendadas,
			ArrayList<Valoracion> valoracionUsuarioVendedor, BufferedImage imagenPersona) {
		super(nombre, precio);
		this.email = email;
		this.apellidos = apellidos;
		this.contrase�a = contrase�a;
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
	public Usuario(String nombre, String email, String apellidos, String contrase�a, String direccion,
			Ciudad ciudad, BufferedImage imagenPersona) {
		super(nombre);
		this.email = email;
		this.apellidos = apellidos;
		this.contrase�a = contrase�a;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.imagenPersona = imagenPersona;
	}
	
	/**
	 * Constructor usuario para pantallaLogin
	 */

	public Usuario(String email, String contrase�a) {
		super();
		this.email = email;
		this.contrase�a = contrase�a;
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
	 * Devuelve el valor de contrase�a
	 * @return String devuelve el valor de contrase�a
	 */
	public String getContrase�a() {
		return contrase�a;
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
	 * M�todo que da un nuevo valor a la variable email
	 * @param email el nuevo valor de email
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * M�todo que da un nuevo valor a la variable apellidos
	 * @param apellidos el nuevo valor de apellidos
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	/**
	 * M�todo que da un nuevo valor a la variable contrase�a
	 * @param contrase�a el nuevo valor de contrase�a
	 */
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}


	/**
	 * M�todo que da un nuevo valor a la variable direccion
	 * @param direccion el nuevo valor de direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	/**
	 * M�todo que da un nuevo valor a la variable ciudad
	 * @param ciudad el nuevo valor de ciudad
	 */
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}


	/**
	 * M�todo que da un nuevo valor a la variable esAdmin
	 * @param esAdmin el nuevo valor de esAdmin
	 */
	public void setEsAdmin(boolean esAdmin) {
		this.esAdmin = esAdmin;
	}


	/**
	 * M�todo que da un nuevo valor a la variable serviciosOfrecidos
	 * @param serviciosOfrecidos el nuevo valor de serviciosOfrecidos
	 */
	public void setServiciosOfrecidos(ArrayList<Servicio> serviciosOfrecidos) {
		this.serviciosOfrecidos = serviciosOfrecidos;
	}


	/**
	 * M�todo que da un nuevo valor a la variable citasAgendadas
	 * @param citasAgendadas el nuevo valor de citasAgendadas
	 */
	public void setCitasAgendadas(ArrayList<Cita> citasAgendadas) {
		this.citasAgendadas = citasAgendadas;
	}


	/**
	 * M�todo que da un nuevo valor a la variable valoracionUsuarioVendedor
	 * @param valoracionUsuarioVendedor el nuevo valor de valoracionUsuarioVendedor
	 */
	public void setValoracionUsuarioVendedor(ArrayList<Valoracion> valoracionUsuarioVendedor) {
		this.valoracionUsuarioVendedor = valoracionUsuarioVendedor;
	}


	/**
	 * M�todo que da un nuevo valor a la variable imagenPersona
	 * @param imagenPersona el nuevo valor de imagenPersona
	 */
	public void setImagenPersona(BufferedImage imagenPersona) {
		this.imagenPersona = imagenPersona;
	}
	
	
}
