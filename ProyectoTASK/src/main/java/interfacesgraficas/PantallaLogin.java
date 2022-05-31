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
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class PantallaLogin extends JPanel {
	private Ventana ventana;
	private JTextField campoUsuario;
	private JPasswordField campoContraseña;
	private JLabel etiquetaEmail;

	public PantallaLogin(Ventana v) {
		setBackground(Color.WHITE);
		this.ventana = v;
		setLayout(null);

		JButton botonLogin = new BotonAzul("Login");
		botonLogin.setBackground(Color.WHITE);
		botonLogin.setForeground(Color.GRAY);
		botonLogin.setFont(new Font("Century Gothic", Font.BOLD, 20));
		botonLogin.setText("Entrar");
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

		botonLogin.setBounds(502, 445, 160, 44);
		this.add(botonLogin);

		JButton botonRegistro = new BotonVerde("Registrarse");
		botonRegistro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irAPantalla("registro");

			}
		});
		botonRegistro.setBounds(610, 572, 143, 46);
		add(botonRegistro);

		JLabel etiquetaTitulo = new JLabel("Bienvenido a TASK");
		etiquetaTitulo.setForeground(Color.GRAY);
		etiquetaTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaTitulo.setFont(new Font("Century Gothic", Font.BOLD, 30));
		etiquetaTitulo.setBounds(332, 136, 480, 44);
		add(etiquetaTitulo);

		etiquetaEmail = new JLabel("Usuario");
		etiquetaEmail.setForeground(Color.GRAY);
		etiquetaEmail.setFont(new Font("Century Gothic", Font.BOLD, 20));
		etiquetaEmail.setBounds(465, 190, 135, 45);
		add(etiquetaEmail);

		JLabel labelContraseña = new JLabel("Contrase\u00F1a");
		labelContraseña.setForeground(Color.GRAY);
		labelContraseña.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelContraseña.setHorizontalAlignment(SwingConstants.CENTER);
		labelContraseña.setBounds(465, 308, 114, 33);
		add(labelContraseña);

		campoUsuario = new JTextField();
		campoUsuario.setBackground(SystemColor.menu);
		campoUsuario.setBounds(465, 237, 215, 33);
		add(campoUsuario);
		campoUsuario.setColumns(10);

		campoContraseña = new JPasswordField();
		campoContraseña.setBackground(SystemColor.menu);
		campoContraseña.setForeground(Color.LIGHT_GRAY);
		campoContraseña.setEchoChar('*');
		campoContraseña.setBounds(465, 351, 215, 33);
		add(campoContraseña);

		JButton BotonSalir = new BotonAzul("Salir");
		BotonSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				ventana.dispose();
			}
		});
		BotonSalir.setBounds(384, 579, 102, 33);
		add(BotonSalir);
		
		JLabel LabelIcono = new JLabel("");
		LabelIcono.setIcon(new ImageIcon(PantallaLogin.class.getResource("/imagenes/iconoPrincipal.png")));
		LabelIcono.setBounds(523, 10, 102, 116);
		add(LabelIcono);
		
		JLabel FondoCiudad = new JLabel("");
		FondoCiudad.setIcon(new ImageIcon(PantallaLogin.class.getResource("/imagenes/ciudadimagen.jpg")));
		FondoCiudad.setBounds(-11, 10, 352, 660);
		add(FondoCiudad);
		
	
		
		
	}
}
