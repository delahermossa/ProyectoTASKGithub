package clases;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Usuario extends ElementoConDineroYNombre{
	
	private String email;
	private String apellidos;
	private String contrase�a;
	private String direccion;
	private boolean esAdmin;
	private  ArrayList<Servicio> serviciosOfrecidos;
	private ArrayList<Cita> citasAgendadas;
	private ArrayList<Valoracion> valoracionUsuarioVendedor;
	private BufferedImage imagenPersona;
	

}
