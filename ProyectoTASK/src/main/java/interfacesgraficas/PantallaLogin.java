package interfacesgraficas;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;

import clases.Usuario;
import componentesvisuales.BotonAzul;
import componentesvisuales.BotonRojo;
import componentesvisuales.BotonVerde;
import excepciones.ContrasegnaIncorrectaException;
import excepciones.ContrasegnaInvalidaException;
import excepciones.UsuarioNoExisteException;
import utils.Utils;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.awt.SystemColor;

public class PantallaLogin extends JPanel {
	private Ventana ventana;
	private JTextField campoUsuario;
	private JPasswordField campoContraseña;
	private JLabel etiquetaEmail;

	public PantallaLogin(Ventana v) {
		setBackground(SystemColor.activeCaption);
		this.ventana = v;
		setLayout(null);

		JButton botonLogin = new BotonAzul("Login");
		botonLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String email = campoUsuario.getText();
				String contraseña = new String(campoContraseña.getPassword());
				try {
					Utils.currentUser = new Usuario(email, contraseña);
					JOptionPane.showMessageDialog(ventana, "Bienvenid@ " + Utils.currentUser.getNombreUsuario(),
							"Inicio de sesion con éxito ", JOptionPane.INFORMATION_MESSAGE);
					ventana.irAPantalla("registroservicio");

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(ventana, e1.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
					e1.printStackTrace();
				}
			}
		});

		botonLogin.setToolTipText("Pincha aqu\u00ED para iniciar sesi\u00F3n");

		botonLogin.setBounds(95, 179, 160, 44);
		this.add(botonLogin);

		JButton botonRegistro = new BotonVerde("Registrarse");
		botonRegistro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irAPantalla("registro");

			}
		});
		botonRegistro.setBounds(283, 179, 143, 46);
		add(botonRegistro);

		JLabel etiquetaTitulo = new JLabel("Iniciar Sesi\u00F3n");
		etiquetaTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaTitulo.setFont(new Font("Miriam Libre", Font.ITALIC, 27));
		etiquetaTitulo.setBounds(10, 11, 480, 44);
		add(etiquetaTitulo);

		etiquetaEmail = new JLabel("Usuario");
		etiquetaEmail.setBounds(127, 87, 46, 14);
		add(etiquetaEmail);

		JLabel labelContraseña = new JLabel("Contrase\u00F1a");
		labelContraseña.setHorizontalAlignment(SwingConstants.CENTER);
		labelContraseña.setBounds(95, 129, 78, 14);
		add(labelContraseña);

		campoUsuario = new JTextField();
		campoUsuario.setBounds(184, 85, 242, 20);
		add(campoUsuario);
		campoUsuario.setColumns(10);

		campoContraseña = new JPasswordField();
		campoContraseña.setEchoChar('*');
		campoContraseña.setBounds(183, 126, 243, 20);
		add(campoContraseña);

		JButton BotonSalir = new BotonAzul("Salir");
		BotonSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				ventana.dispose();
			}
		});
		BotonSalir.setBounds(200, 251, 102, 33);
		add(BotonSalir);
	}
}
