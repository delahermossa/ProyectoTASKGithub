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
	
	
	public Usuario() {
		super();
	}
	
	
}
