package interfacesgraficas;

import java.awt.Cursor;
import java.awt.Image;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import clases.Usuario;
import utils.ManejoFicheros;
import utils.Utils;

public class Ventana extends JFrame {

	/**
	 * Representa la pantalla actual por la que estoy navegando
	 */
	private JPanel pantallaAtual;

	/**
	 * Es el usuario que inicia sesion en la pantalla login Hasta entonces vale null
	 * Lo tenemos aqu� para que est� disponible en todas las pantallas
	 */

	public Ventana(String[] args) {

		this.setSize(850, 650);
		this.setLocationRelativeTo(null);
		this.setTitle("TASK");
		this.setIconImage(new ImageIcon("./iconos/iconoPrincipal.png").getImage());
		this.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		
		/**
		 * Argumentos de programa y Manejo de ficheros que lea y guarde el login
		 */
		if (args.length > 0) {//args
			String email = args[0];
			String contrase�a = args[1];
			login(email, contrase�a);
		} else if (ManejoFicheros.leerLogin() != null) {
			Usuario s = ManejoFicheros.leerLogin();//ficheros- cache
			login(s.getEmail(), s.getContrase�a());

		} else {
			this.pantallaAtual = new PantallaLogin(this);
		}

		this.setContentPane(this.pantallaAtual);
		this.setVisible(true);
	}

	/**
	 * 1� Ponemos visible la pantalla actual
	 * 
	 * @param nombrePantalla
	 */
	
	private void login(String email, String contrase�a) {
		try {
			Utils.currentUser = new Usuario(email, contrase�a);

			JOptionPane.showMessageDialog(this, "Bienvenid@ " + Utils.currentUser.getNombreUsuario(),
					"Inicio de sesion con �xito ", JOptionPane.INFORMATION_MESSAGE);
			this.pantallaAtual = new PantallaServicios(this);

		} catch (Exception e1) {
			JOptionPane.showMessageDialog(this, e1.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			this.pantallaAtual = new PantallaLogin(this);
		}
	}
	
	/**
	 * Metodo que uso para cambiar de pantalla
	 * @param nombrePantalla
	 */

	public void irAPantalla(String nombrePantalla) {
		this.pantallaAtual.setVisible(false);
		this.pantallaAtual = null;

		switch (nombrePantalla) {
		case "login":
			this.pantallaAtual = new PantallaLogin(this);
			break;
		case "registro":
			this.pantallaAtual = new PantallaRegistro(this);
			break;
		case "servicios":
			this.pantallaAtual = new PantallaServicios(this);
			break;
		case "altaservicio":
			this.pantallaAtual = new PantallaAltaServicio(this);
			break;

		case "pantallausuario":
			this.pantallaAtual = new PantallaUsuario(this);
			break;
		case "miservicio":
			this.pantallaAtual = new PantallaListadoServicios(this, null, true);
			break;
		case "miscitas":
			this.pantallaAtual = new PantallaMisCitas(this);
			break;

		}
		this.pantallaAtual.setVisible(true);
		this.setContentPane(pantallaAtual);

	}
	/**
	 * En caso de pasar algo a la pantalla, como no se lo que le voy a pasar le pasamos object por argumentos
	 * En este caso le paso todo el servicio, con sus datos
	 * @param nombrePantalla
	 * @param object
	 */
	public void irAPantalla(String nombrePantalla, Object object) {
		this.pantallaAtual.setVisible(false);
		this.pantallaAtual = null;

		switch (nombrePantalla) {
		case "listadoservicios":
			this.pantallaAtual = new PantallaListadoServicios(this, object, false);
			break;
		case "compraservicio":
			this.pantallaAtual = new PantallaCompraServicio(this, object);
			break;

		}
		this.pantallaAtual.setVisible(true);
		this.setContentPane(pantallaAtual);

	}
}
