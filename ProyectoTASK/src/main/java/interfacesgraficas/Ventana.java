package interfacesgraficas;

import java.awt.Cursor;
import java.awt.Image;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import clases.Usuario;

public class Ventana extends JFrame {

	/**
	 * Representa la pantalla actual por la que estoy navegando
	 */
	private JPanel pantallaAtual;
	/**
	 * Es el usuario que inicia sesion en la pantalla login Hasta entonces vale null
	 * Lo tenemos aquí para que esté disponible en todas las pantallas
	 */


	public Ventana() {

		this.setSize(850, 650);
		this.setLocationRelativeTo(null);

		// Pantalla completa las dos lineas siguentes
		// this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		// this.setUndecorated(true);

		this.setTitle("TASK");
		this.setIconImage(new ImageIcon("./iconos/iconoPrincipal.png").getImage());
		this.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pantallaAtual = new PantallaLogin(this);
		this.setContentPane(this.pantallaAtual);
		this.setVisible(true);
	}

	/**
	 * 1º Ponemos visible la pantalla actual
	 * 
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
		case "contratarservicio":
			this.pantallaAtual=new PantallaContratarServicio(this);
			break;
		case "pantallausuario":
			this.pantallaAtual=new PantallaUsuario(this);
			break;
			
		case"listadoservicios":
			this.pantallaAtual=new PantallaListadoServicios(this);
			break;
		case "manitas":
			this.pantallaAtual=new PantallaManitas(this);
			break;
		case"chef":
			this.pantallaAtual=new PantallaChef(this);
			break;
		case"musica":
			this.pantallaAtual=new PantallaMusica(this);
			break;
		case"mates":
			this.pantallaAtual=new PantallaMates(this);
			break;
		case"lengua":
			this.pantallaAtual=new PantallaLengua(this);
			break;
		case"manicura":
			this.pantallaAtual=new PantallaManicura(this);
			break;
		case"estilismo":
			this.pantallaAtual=new PantallaEstilismo(this);
			break;
		case "facial":
			this.pantallaAtual=new PantallaFacial(this);
			break;
		case "coach":
			this.pantallaAtual=new PantallaCoach(this);
			break;
		case "padel":
			this.pantallaAtual=new PantallaPadel(this);
			break;
		case "futbol":
			this.pantallaAtual=new PantallaFutbol(this);
			break;
		case "paseo":
			this.pantallaAtual= new PantallaPaseo(this);
			break;
		case "medico":
			this.pantallaAtual=new PantallaMedico(this);
			break;
		case "peluquero":
			this.pantallaAtual=new PantallaPeluquero(this);
			break;
			
			

		}
		this.pantallaAtual.setVisible(true);
		this.setContentPane(pantallaAtual);

	}
}
