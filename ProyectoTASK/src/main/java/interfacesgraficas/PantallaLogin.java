package interfacesgraficas;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import clases.Usuario;
import componentesvisuales.BotonAzul;
import componentesvisuales.BotonVerde;
import utils.ManejoFicheros;
import utils.Utils;

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
					ManejoFicheros.insertarLogin(email, contraseña);
					ventana.irAPantalla("servicios");

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(ventana, e1.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
					e1.printStackTrace();
				}
			}
		});

		botonLogin.setToolTipText("Pincha aqu\u00ED para iniciar sesi\u00F3n");

		botonLogin.setBounds(511, 180, 160, 44);
		this.add(botonLogin);

		JButton botonRegistro = new BotonVerde("Registrarse");
		botonRegistro.setBackground(new Color(95, 158, 160));
		botonRegistro.setForeground(Color.GRAY);
		botonRegistro.setFont(new Font("Century Gothic", Font.BOLD, 20));
		botonRegistro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irAPantalla("registro");

			}
		});
		botonRegistro.setBounds(618, 546, 160, 44);
		add(botonRegistro);

		JLabel etiquetaTitulo = new JLabel("Bienvenido a TASK");
		etiquetaTitulo.setForeground(Color.GRAY);
		etiquetaTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaTitulo.setFont(new Font("Century Gothic", Font.BOLD, 30));
		etiquetaTitulo.setBounds(191, 45, 480, 44);
		add(etiquetaTitulo);

		etiquetaEmail = new JLabel("Email");
		etiquetaEmail.setForeground(Color.GRAY);
		etiquetaEmail.setFont(new Font("Century Gothic", Font.BOLD, 20));
		etiquetaEmail.setBounds(211, 99, 135, 45);
		add(etiquetaEmail);

		JLabel labelContraseña = new JLabel("Contrase\u00F1a");
		labelContraseña.setForeground(Color.GRAY);
		labelContraseña.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelContraseña.setHorizontalAlignment(SwingConstants.CENTER);
		labelContraseña.setBounds(456, 105, 114, 33);
		add(labelContraseña);

		campoUsuario = new JTextField();
		campoUsuario.setBackground(SystemColor.menu);
		campoUsuario.setBounds(211, 137, 215, 33);
		add(campoUsuario);
		campoUsuario.setColumns(10);

		campoContraseña = new JPasswordField();
		campoContraseña.setBackground(SystemColor.menu);
		campoContraseña.setForeground(Color.LIGHT_GRAY);
		campoContraseña.setEchoChar('*');
		campoContraseña.setBounds(456, 137, 215, 33);
		add(campoContraseña);

		JLabel LabelIcono = new JLabel("");
		LabelIcono.setIcon(new ImageIcon(PantallaLogin.class.getResource("/imagenes/iconoPrincipal.png")));
		LabelIcono.setBounds(79, 10, 102, 116);
		add(LabelIcono);

		JLabel LabelRegistro = new JLabel("\u00BFA\u00FAn no tienes cuenta...? Reg\u00EDstrate ya!");
		LabelRegistro.setForeground(new Color(95, 158, 160));
		LabelRegistro.setFont(new Font("Century Gothic", Font.BOLD, 20));
		LabelRegistro.setBounds(37, 552, 492, 33);
		add(LabelRegistro);

		JLabel FondoCiudad = new JLabel("");
		FondoCiudad.setForeground(new Color(95, 158, 160));
		FondoCiudad.setIcon(new ImageIcon(PantallaLogin.class.getResource("/imagenes/staf.jpg")));
		FondoCiudad.setBounds(-23, 10, 929, 670);
		add(FondoCiudad);

	}
}
