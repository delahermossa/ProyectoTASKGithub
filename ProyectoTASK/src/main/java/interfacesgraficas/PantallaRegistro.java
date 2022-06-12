package interfacesgraficas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import clases.Usuario;
import enumeraciones.Ciudad;
import utils.ManejoFicheros;
/**
 * Pantalla creada para registrar el usuario
 * @author delah
 *
 */

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

		JLabel labelIconoRegistro = new JLabel("");
		labelIconoRegistro.setIcon(new ImageIcon(PantallaRegistro.class.getResource("/imagenes/iconoPrincipal.png")));
		labelIconoRegistro.setBounds(57, 35, 106, 100);
		add(labelIconoRegistro);

		JLabel labelCiudad = new JLabel("Ciudad");
		labelCiudad.setForeground(Color.GRAY);
		labelCiudad.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelCiudad.setBounds(25, 468, 106, 28);
		add(labelCiudad);

		JLabel tituloRegistro = new JLabel("Registro");
		tituloRegistro.setBounds(567, 35, 170, 53);
		tituloRegistro.setForeground(new Color(95, 158, 160));
		tituloRegistro.setFont(new Font("Century Gothic", Font.BOLD, 35));
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
		campoContraseña.setBounds(25, 261, 332, 32);
		add(campoContraseña);

		JLabel labelEmail = new JLabel("Email");
		labelEmail.setForeground(Color.GRAY);
		labelEmail.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelEmail.setBounds(25, 303, 84, 27);
		labelEmail.setBackground(Color.WHITE);
		add(labelEmail);

		campoEmail = new JTextField();
		campoEmail.setBounds(25, 340, 332, 28);
		add(campoEmail);
		campoEmail.setColumns(10);

		JLabel labelDireccion = new JLabel("Direcci\u00F3n");
		labelDireccion.setForeground(Color.GRAY);
		labelDireccion.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelDireccion.setBounds(25, 385, 117, 36);
		add(labelDireccion);

		campoDireccion = new JTextField();
		campoDireccion.setBounds(25, 420, 332, 28);
		add(campoDireccion);
		campoDireccion.setColumns(10);

	

		botonRegistrarse = new JButton("Registrarse");
		botonRegistrarse.setBackground(new Color(95, 158, 160));
		botonRegistrarse.setFont(new Font("Century Gothic", Font.BOLD, 20));
		botonRegistrarse.setForeground(new Color(255, 255, 255));
		botonRegistrarse.setBounds(25, 552, 152, 36);

		final JComboBox seleccionCiudad = new JComboBox();
		seleccionCiudad.setBackground(new Color(95, 158, 160));
		seleccionCiudad.setForeground(Color.WHITE);
		seleccionCiudad.setFont(new Font("Century Gothic", Font.BOLD, 20));
		seleccionCiudad.setBounds(25, 506, 282, 36);
		seleccionCiudad.setModel(new DefaultComboBoxModel(Ciudad.values()));
		add(seleccionCiudad);
		add(botonRegistrarse);

		JButton botonAtras = new JButton("Atr\u00E1s");
		botonAtras.setBackground(new Color(95, 158, 160));
		botonAtras.setForeground(new Color(255, 255, 255));
		botonAtras.setFont(new Font("Century Gothic", Font.BOLD, 20));
		botonAtras.setBounds(664, 552, 145, 36);
		botonAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irAPantalla("login");
			}
		});
		add(botonAtras);

		JLabel LabelCampoRegistro = new JLabel("");
		LabelCampoRegistro.setIcon(new ImageIcon(PantallaRegistro.class.getResource("/imagenes/lateral.png")));
		LabelCampoRegistro.setForeground(Color.GRAY);
		LabelCampoRegistro.setBounds(0, -29, 419, 713);
		add(LabelCampoRegistro);

		JLabel labelImagenRegistro = new JLabel("");
		labelImagenRegistro.setIcon(new ImageIcon(PantallaRegistro.class.getResource("/imagenes/imagenRegistro.png")));
		labelImagenRegistro.setBounds(433, 132, 396, 443);
		add(labelImagenRegistro);

		JLabel lblNewLabel = new JLabel("!Reg\u00EDstrate y descubre todos nuestros servicios!");
		lblNewLabel.setForeground(new Color(95, 158, 160));
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel.setBounds(464, 98, 349, 23);
		add(lblNewLabel);
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
				String direccion = campoDireccion.getText();

				/**
				 * Creamos un nuevo usuario
				 */

				try {
					new Usuario(nombreUsuario, email, contraseña, direccion, ciudad);
					/**
					 * JOptionPane. showMessage Dialog ventana emergente cuando no se realiza bien
					 * el resgistro 4 argumentos 1ª ventana padre 2º contenido mensaje 3º titulo 4º
					 * Icono que te sale en el mensaje
					 */
					ManejoFicheros.insertarLogin(email, contraseña);
					JOptionPane.showMessageDialog(ventana, "Registrado con éxito", "Registro completado",
							+JOptionPane.PLAIN_MESSAGE);
					ventana.irAPantalla("servicios");// Una vez registrado entra en la ventana de login */

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(ventana, e1.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

	}
}
