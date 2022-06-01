package interfacesgraficas;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JTextField;

import clases.Usuario;

import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import enumeraciones.Ciudad;
import excepciones.ContrasegnaInvalidaException;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;

public class PantallaAltaServicio extends JPanel {
	private Ventana ventana;
	private JTextField campoUsuario;
	private JPasswordField campoContraseña;
	private JTextField campoEmail;
	private JButton botonRegistrarse;
	private JTextField campoDireccion;

	public PantallaAltaServicio(Ventana v) {
		setBorder(null);
		setBackground(Color.WHITE);
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				ventana.irAPantalla("altaservicio");
			}
		});
		setLayout(null);
		
		JLabel labelTexto2 = new JLabel(" y comenzar a trabajar desde ya!");
		labelTexto2.setForeground(Color.WHITE);
		labelTexto2.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelTexto2.setBounds(249, 151, 340, 37);
		add(labelTexto2);
		
		JLabel labelTexto = new JLabel("\u00A1Ahora puedes darte de alta como Tasker");
		labelTexto.setForeground(Color.WHITE);
		labelTexto.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelTexto.setBounds(214, 124, 417, 37);
		add(labelTexto);
		
		JLabel labelIcono = new JLabel("");
		labelIcono.setIcon(new ImageIcon(PantallaAltaServicio.class.getResource("/imagenes/iconoPrincipal.png")));
		labelIcono.setBounds(68, 48, 106, 108);
		add(labelIcono);

		JLabel tituloRegistro = new JLabel("ALTA TASKER");
		tituloRegistro.setBounds(214, 82, 259, 43);
		tituloRegistro.setForeground(Color.WHITE);
		tituloRegistro.setFont(new Font("Century Gothic", Font.BOLD, 30));
		add(tituloRegistro);

		JLabel labelUsuario = new JLabel("Usuario");
		labelUsuario.setBounds(42, 323, 34, 13);
		add(labelUsuario);

		campoUsuario = new JTextField();
		campoUsuario.setBounds(181, 299, 321, 19);
		add(campoUsuario);
		campoUsuario.setColumns(10);

		JLabel labelContraseña = new JLabel("Contraseña");
		labelContraseña.setBounds(42, 352, 52, 13);
		add(labelContraseña);

		campoContraseña = new JPasswordField();
		campoContraseña.setBounds(141, 349, 321, 19);
		add(campoContraseña);

		JLabel labelEmail = new JLabel("Email");
		labelEmail.setBounds(44, 381, 25, 13);
		labelEmail.setBackground(Color.WHITE);
		add(labelEmail);

		campoEmail = new JTextField();
		campoEmail.setBounds(141, 378, 321, 19);
		add(campoEmail);
		campoEmail.setColumns(10);

		JLabel labelDireccion = new JLabel("Direcci\u00F3n");
		labelDireccion.setBounds(42, 405, 42, 13);
		add(labelDireccion);

		campoDireccion = new JTextField();
		campoDireccion.setBounds(116, 402, 321, 19);
		add(campoDireccion);
		campoDireccion.setColumns(10);

		/**
		 * Con buttonGroup conseguimos que se seleccione una de als opciones y no las 3
		 */
	
		botonRegistrarse = new JButton("Registrar Servicio");
		botonRegistrarse.setBounds(30, 535, 378, 21);

		final JComboBox seleccionCiudad = new JComboBox();
		seleccionCiudad.setBounds(30, 506, 378, 19);
		seleccionCiudad.setModel(new DefaultComboBoxModel(Ciudad.values()));
		add(seleccionCiudad);
		add(botonRegistrarse);

		JButton botonAtras = new JButton("Atr\u00E1s");
		botonAtras.setBounds(323, 578, 57, 21);
		botonAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irAPantalla("login");
			}
		});
		add(botonAtras);
		
		JLabel labelFondo = new JLabel("");
		labelFondo.setIcon(new ImageIcon(PantallaAltaServicio.class.getResource("/imagenes/fondoServicios.jpg")));
		labelFondo.setBounds(0, 0, 853, 657);
		add(labelFondo);
		ventana = v;

		/**
		 * Lo creamos abajo para asegurarnos de que pueda coger todas las variables
		 */
		botonRegistrarse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String nombreUsuario = campoUsuario.getText();/* Captura el nombre insertado */
				String contraseña = new String(campoContraseña.getPassword());
				String email = campoEmail.getText();
				Ciudad ciudad = (Ciudad) seleccionCiudad.getSelectedItem();

				/**
				 * Creamos un nuevo usuario
				 */

				try {
					// new Usuario(nombreUsuario,email,contraseña,true);
					/**
					 * JOptionPane. showMessage Dialog ventana emergente cuando no se realiza bien
					 * el resgistro 4 argumentos 1ª ventana padre 2º contenido mensaje 3º titulo 4º
					 * Icono que te sale en el mensaje
					 */
					JOptionPane.showMessageDialog(ventana, "Registrado con éxito", "Registro completado",
							+JOptionPane.PLAIN_MESSAGE);
					ventana.irAPantalla("login");/* Una vez registrado entra en la ventana de login */

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(ventana, e1.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

	}
}
