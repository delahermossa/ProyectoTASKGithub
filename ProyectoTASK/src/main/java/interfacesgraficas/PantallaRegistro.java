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

public class PantallaRegistro extends JPanel {
	private Ventana ventana;
	private JTextField campoUsuario;
	private JPasswordField campoContraseña;
	private JTextField campoEmail;
	private JButton botonRegistrarse;
	private JTextField campoDireccion;

	public PantallaRegistro(Ventana v) {
		setBorder(null);
		setBackground(new Color(102, 204, 204));
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				ventana.irAPantalla("registro");
			}
		});
		setLayout(null);

		JLabel tituloRegistro = new JLabel("Registro");
		tituloRegistro.setBounds(329, 63, 170, 53);
		tituloRegistro.setForeground(Color.WHITE);
		tituloRegistro.setFont(new Font("Arial Black", Font.PLAIN, 37));
		add(tituloRegistro);

		JLabel labelUsuario = new JLabel("Usuario");
		labelUsuario.setBounds(238, 154, 34, 13);
		add(labelUsuario);

		campoUsuario = new JTextField();
		campoUsuario.setBounds(277, 151, 332, 19);
		add(campoUsuario);
		campoUsuario.setColumns(10);

		JLabel labelContraseña = new JLabel("Contraseña");
		labelContraseña.setBounds(220, 178, 52, 13);
		add(labelContraseña);

		campoContraseña = new JPasswordField();
		campoContraseña.setBounds(277, 175, 332, 19);
		add(campoContraseña);

		JLabel labelEmail = new JLabel("Email");
		labelEmail.setBounds(247, 202, 25, 13);
		labelEmail.setBackground(Color.WHITE);
		add(labelEmail);

		campoEmail = new JTextField();
		campoEmail.setBounds(277, 199, 332, 19);
		add(campoEmail);
		campoEmail.setColumns(10);

		JLabel labelDireccion = new JLabel("Direcci\u00F3n");
		labelDireccion.setBounds(230, 226, 42, 13);
		add(labelDireccion);

		campoDireccion = new JTextField();
		campoDireccion.setBounds(277, 223, 332, 19);
		add(campoDireccion);
		campoDireccion.setColumns(10);

		/**
		 * Con buttonGroup conseguimos que se seleccione una de als opciones y no las 3
		 */
		ButtonGroup grupoGenero = new ButtonGroup();

		botonRegistrarse = new JButton("Registrarse");
		botonRegistrarse.setBounds(220, 331, 389, 21);

		final JComboBox seleccionCiudad = new JComboBox();
		seleccionCiudad.setBounds(220, 307, 389, 19);
		seleccionCiudad.setModel(new DefaultComboBoxModel(Ciudad.values()));
		add(seleccionCiudad);
		add(botonRegistrarse);

		JButton botonAtras = new JButton("Atr\u00E1s");
		botonAtras.setBounds(552, 420, 57, 21);
		botonAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irAPantalla("login");
			}
		});
		add(botonAtras);
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
