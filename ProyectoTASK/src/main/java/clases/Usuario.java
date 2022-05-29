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
	

}
