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
import enumeraciones.SubServicios;
import excepciones.ContrasegnaInvalidaException;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;

public class PantallaAltaServicio extends JPanel {
	private Ventana ventana;
	private JTextField campoUsuario;
	private JPasswordField campoContraseña;
	private JTextField campoEmail;
	private JButton botonRegistrarse;
	private JTextField campoDescripcion;
	private JTextField textoPrecio;

	public PantallaAltaServicio(Ventana v) {
		setBorder(null);
		setBackground(Color.WHITE);
		this.ventana=v;
		setLayout(null);
		
		textoPrecio = new JTextField();
		textoPrecio.setColumns(10);
		textoPrecio.setBounds(679, 438, 76, 50);
		add(textoPrecio);
		
		JLabel labelPrecio = new JLabel("Ponle precio!");
		labelPrecio.setForeground(new Color(32, 178, 170));
		labelPrecio.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelPrecio.setBounds(640, 400, 145, 28);
		add(labelPrecio);
		
		JLabel subeFoto = new JLabel("");
		subeFoto.setIcon(new ImageIcon(PantallaAltaServicio.class.getResource("/imagenes/iconoSubirFoto.png")));
		subeFoto.setBounds(535, 425, 95, 86);
		add(subeFoto);
		
		JLabel labelFoto = new JLabel("Sube tu foto");
		labelFoto.setForeground(new Color(32, 178, 170));
		labelFoto.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelFoto.setBounds(513, 400, 145, 28);
		add(labelFoto);
		
		JComboBox seleccionTipoServicio = new JComboBox();
		seleccionTipoServicio.setForeground(Color.WHITE);
		seleccionTipoServicio.setFont(new Font("Century Gothic", Font.BOLD, 15));
		seleccionTipoServicio.setBackground(new Color(95, 158, 160));
		seleccionTipoServicio.setBounds(513, 270, 282, 36);
		seleccionTipoServicio.setModel(new DefaultComboBoxModel(SubServicios.values()));
		add(seleccionTipoServicio);
		
		JLabel tipoServicio = new JLabel("Elige Servicio");
		tipoServicio.setForeground(new Color(255, 255, 255));
		tipoServicio.setFont(new Font("Century Gothic", Font.BOLD, 20));
		tipoServicio.setBounds(513, 232, 145, 28);
		add(tipoServicio);
		
		final JComboBox seleccionCategoria = new JComboBox();
		seleccionCategoria.setBackground(new Color(95, 158, 160));
		seleccionCategoria.setForeground(Color.WHITE);
		seleccionCategoria.setFont(new Font("Century Gothic", Font.BOLD, 15));
		seleccionCategoria.setBounds(513, 186, 282, 36);
		seleccionCategoria.setModel(new DefaultComboBoxModel(new String[] {"HOGAR", "COLEGIO", "BELLEZA", "DEPORTE", "MASCOTA"}));
		add(seleccionCategoria);
		
		JLabel labelCategoria = new JLabel("Elige categoria");
		labelCategoria.setForeground(new Color(255, 255, 255));
		labelCategoria.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelCategoria.setBounds(513, 156, 223, 28);
		add(labelCategoria);
		
		JLabel labelTexto2 = new JLabel(" y comenzar a trabajar desde ya!");
		labelTexto2.setForeground(new Color(211, 211, 211));
		labelTexto2.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelTexto2.setBounds(252, 85, 340, 37);
		add(labelTexto2);
		
		JLabel labelTexto = new JLabel("\u00A1Ahora puedes darte de alta como Tasker");
		labelTexto.setForeground(new Color(211, 211, 211));
		labelTexto.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelTexto.setBounds(213, 63, 417, 37);
		add(labelTexto);
		
		JLabel labelIcono = new JLabel("");
		labelIcono.setIcon(new ImageIcon(PantallaAltaServicio.class.getResource("/imagenes/iconoPrincipal.png")));
		labelIcono.setBounds(42, 32, 106, 108);
		add(labelIcono);

		JLabel tituloRegistro = new JLabel("ALTA TASKER");
		tituloRegistro.setBounds(302, 32, 259, 43);
		tituloRegistro.setForeground(Color.WHITE);
		tituloRegistro.setFont(new Font("Century Gothic", Font.BOLD, 30));
		add(tituloRegistro);

		JLabel labelUsuario = new JLabel("Usuario");
		labelUsuario.setForeground(Color.GRAY);
		labelUsuario.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelUsuario.setBounds(25, 156, 84, 38);
		add(labelUsuario);

		campoUsuario = new JTextField();
		campoUsuario.setBounds(25, 193, 332, 28);
		add(campoUsuario);
		campoUsuario.setColumns(10);

		JLabel labelContraseña = new JLabel("Contraseña");
		labelContraseña.setForeground(Color.GRAY);
		labelContraseña.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelContraseña.setBounds(22, 219, 153, 42);
		add(labelContraseña);

		campoContraseña = new JPasswordField();
		campoContraseña.setBounds(25, 258, 332, 32);
		add(campoContraseña);
		JLabel labelEmail = new JLabel("Email");
		labelEmail.setForeground(Color.GRAY);
		labelEmail.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelEmail.setBounds(25, 300, 84, 27);
		labelEmail.setBackground(Color.WHITE);
		add(labelEmail);

		campoEmail = new JTextField();
		campoEmail.setBounds(25, 329, 332, 28);
		add(campoEmail);
		campoEmail.setColumns(10);

		JLabel labelDireccion = new JLabel("Descripcion");
		labelDireccion.setForeground(Color.GRAY);
		labelDireccion.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelDireccion.setBounds(25, 367, 117, 36);
		add(labelDireccion);

		campoDescripcion = new JTextField();
		campoDescripcion.setHorizontalAlignment(SwingConstants.LEFT);
		campoDescripcion.setBounds(25, 400, 332, 124);
		add(campoDescripcion);
		campoDescripcion.setColumns(10);
		
		JLabel labelCiudad = new JLabel("Elige ciudad");
		labelCiudad.setForeground(new Color(32, 178, 170));
		labelCiudad.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelCiudad.setBounds(513, 316, 145, 28);
		add(labelCiudad);

		/**
		 * Con buttonGroup conseguimos que se seleccione una de als opciones y no las 3
		 */
	

		botonRegistrarse = new JButton("Registrar Servicio");
		botonRegistrarse.setBackground(new Color(32, 178, 170));
		botonRegistrarse.setFont(new Font("Century Gothic", Font.BOLD, 20));
		botonRegistrarse.setForeground(new Color(255, 255, 255));
		botonRegistrarse.setBounds(517, 541, 282, 36);

		final JComboBox seleccionCiudad = new JComboBox();
		seleccionCiudad.setBackground(new Color(95, 158, 160));
		seleccionCiudad.setForeground(Color.WHITE);
		seleccionCiudad.setFont(new Font("Century Gothic", Font.BOLD, 15));
		seleccionCiudad.setBounds(513, 354, 282, 36);
		seleccionCiudad.setModel(new DefaultComboBoxModel(Ciudad.values()));
		add(seleccionCiudad);
		add(botonRegistrarse);
		

		JButton botonAtras = new JButton("Atr\u00E1s");
		botonAtras.setBackground(new Color(95, 158, 160));
		botonAtras.setForeground(new Color(255, 255, 255));
		botonAtras.setFont(new Font("Century Gothic", Font.BOLD, 15));
		botonAtras.setBounds(25, 553, 145, 36);
		botonAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irAPantalla("servicios");
			}
		});
		add(botonAtras);
		
		
		JLabel labelFondo = new JLabel("");
		labelFondo.setIcon(new ImageIcon(PantallaAltaServicio.class.getResource("/imagenes/fondoServicios.jpg")));
		labelFondo.setBounds(0, 10, 853, 657);
		add(labelFondo);
		
		JButton button = new JButton("New button");
		button.setBounds(157, 119, 85, 21);
		add(button);
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
