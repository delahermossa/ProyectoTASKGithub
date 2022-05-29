package interfacesgraficas;

import java.awt.Cursor;
import java.awt.Image;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import clases.Usuario;

public class Ventana extends JFrame{
	
	/**
	 * Representa la pantalla actual por la que estoy navegando
	 */
	private JPanel pantallaAtual;
	/**
	 *Es el usuario que inicia sesion en la pantalla login
	 *Hasta entonces vale null
	 *Lo tenemos aquí para que esté disponible en todas las pantallas
	 */
	protected Usuario usuarioLogado; 
	
	public Ventana() {

		
		this.setSize(500,400);
		this.setLocationRelativeTo(null);
		
		//Pantalla completa las dos lineas siguentes
		//this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//this.setUndecorated(true);
		
		this.setTitle("Ejemplo interfaces Tema 11");
		this.setIconImage(new ImageIcon("./iconos/iconoPrincipal.png").getImage());
		this.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
		//this.setAlway	sOnTop(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pantallaAtual=new PantallaLogin(this);
		this.setContentPane(this.pantallaAtual);
		this.setVisible(true);
	}
	
	/**
	 * 1º Ponemos visible la pantalla actual
	 * @param nombrePantalla
	 */
	public void irAPantalla(String nombrePantalla) {
		this.pantallaAtual.setVisible(false);
		this.pantallaAtual=null;
		
		switch(nombrePantalla) {
		case "login":
			this.pantallaAtual=new PantallaLogin(this);
			break;
		case "registro":
			this.pantallaAtual=new PantallaRegistro(this); 
			break;
		case "listarUsuario":
			this.pantallaAtual=new PantallaListarUsuario(this);
			break;
		}
		this.pantallaAtual.setVisible(true);
		this.setContentPane(pantallaAtual);
		
		
		
	}
}
