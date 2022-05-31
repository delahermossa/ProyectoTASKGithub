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
import utils.Utils;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;

public class PantallaRegistro extends JPanel {
	private Ventana ventana;
	private JTextField campoUsuario;
	private JPasswordField campoContraseña;
	private JTextField campoEmail;
	private JButton botonRegistrarse;
	private JTextField campoDireccion;

	public PantallaRegistro(Ventana v) {
		setBorder(null);
		setBackground(Color.WHITE);
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				ventana.irAPantalla("registro");
			}
		});
		setLayout(null);
		
		JLabel LabelIconoRegistro = new JLabel("");
		LabelIconoRegistro.setIcon(new ImageIcon(PantallaRegistro.class.getResource("/imagenes/iconoPrincipal.png")));
		LabelIconoRegistro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irAPantalla("citas");/*cambiar*/
			}
		});
		LabelIconoRegistro.setBounds(25, 546, 0, 0);
		add(LabelIconoRegistro);
		
		
		JLabel labelCiudad = new JLabel("Ciudad");
		labelCiudad.setForeground(Color.GRAY);
		labelCiudad.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelCiudad.setBounds(25, 468, 106, 28);
		add(labelCiudad);

		JLabel tituloRegistro = new JLabel("Registro");
		tituloRegistro.setBounds(345, 35, 170, 53);
		tituloRegistro.setForeground(Color.WHITE);
		tituloRegistro.setFont(new Font("Arial Black", Font.PLAIN, 37));
		add(tituloRegistro);

		JLabel labelUsuario = new JLabel("Usuario");
		labelUsuario.setForeground(Color.GRAY);
		labelUsuario.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelUsuario.setBounds(25, 152, 84, 42);
		add(labelUsuario);

		campoUsuario = new JTextField();
		campoUsuario.setBounds(25, 190, 332, 19);
		add(campoUsuario);
		campoUsuario.setColumns(10);

		JLabel labelContraseña = new JLabel("Contraseña");
		labelContraseña.setForeground(Color.GRAY);
		labelContraseña.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelContraseña.setBounds(22, 219, 153, 42);
		add(labelContraseña);

		campoContraseña = new JPasswordField();
		campoContraseña.setBounds(25, 261, 332, 19);
		add(campoContraseña);

		JLabel labelEmail = new JLabel("Email");
		labelEmail.setForeground(Color.GRAY);
		labelEmail.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelEmail.setBounds(25, 303, 84, 27);
		labelEmail.setBackground(Color.WHITE);
		add(labelEmail);

		campoEmail = new JTextField();
		campoEmail.setBounds(25, 340, 332, 19);
		add(campoEmail);
		campoEmail.setColumns(10);

		JLabel labelDireccion = new JLabel("Direcci\u00F3n");
		labelDireccion.setForeground(Color.GRAY);
		labelDireccion.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelDireccion.setBounds(25, 385, 117, 36);
		add(labelDireccion);

		campoDireccion = new JTextField();
		campoDireccion.setBounds(25, 420, 332, 19);
		add(campoDireccion);
		campoDireccion.setColumns(10);

		/**
		 * Con buttonGroup conseguimos que se seleccione una de als opciones y no las 3
		 */
		ButtonGroup grupoGenero = new ButtonGroup();

		botonRegistrarse = new JButton("Registrarse");
		botonRegistrarse.setForeground(new Color(95, 158, 160));
		botonRegistrarse.setBounds(25, 546, 117, 21);

		final JComboBox seleccionCiudad = new JComboBox();
		seleccionCiudad.setBackground(new Color(95, 158, 160));
		seleccionCiudad.setForeground(Color.WHITE);
		seleccionCiudad.setFont(new Font("Century Gothic", Font.BOLD, 20));
		seleccionCiudad.setBounds(25, 506, 282, 36);
		seleccionCiudad.setModel(new DefaultComboBoxModel(Ciudad.values()));
		add(seleccionCiudad);
		add(botonRegistrarse);

		JButton botonAtras = new JButton("Atr\u00E1s");
		botonAtras.setBounds(740, 595, 57, 21);
		botonAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irAPantalla("login");
			}
		});
		add(botonAtras);
		
		
		JLabel LabelCampoRegistro = new JLabel("");
		LabelCampoRegistro.setIcon(new ImageIcon(PantallaRegistro.class.getResource("/imagenes/fondo.jpg")));
		LabelCampoRegistro.setForeground(Color.GRAY);
		LabelCampoRegistro.setBounds(0, -21, 430, 713);
		add(LabelCampoRegistro);
		ventana = v;
		
		JLabel LabelFondoRegistro = new JLabel("");
		LabelFondoRegistro.setIcon(new ImageIcon(PantallaRegistro.class.getResource("/imagenes/imagenRegistro.jpg")));
		LabelFondoRegistro.setBounds(453, 190, 443, 334);
		add(LabelFondoRegistro);

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
					Utils.currentUser = new Usuario();
					/**
					 * JOptionPane. showMessage Dialog ventana emergente cuando no se realiza bien
					 * el resgistro 4 argumentos 1ª ventana padre 2º contenido mensaje 3º titulo 4º
					 * Icono que te sale en el mensaje
					 */

					JOptionPane.showMessageDialog(ventana, "Registrado con éxito", "Registro completado",
							+JOptionPane.PLAIN_MESSAGE);
					ventana.irAPantalla("login");// Una vez registrado entra en la ventana de login */

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(ventana, e1.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

	}
}
