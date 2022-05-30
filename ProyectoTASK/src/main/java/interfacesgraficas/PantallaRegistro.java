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

public class PantallaRegistro extends JPanel {
	private Ventana ventana;
	private JTextField campoUsuario;
	private JPasswordField campoContraseña;
	private JTextField campoEmail;
	private JButton botonRegistrarse;

	public PantallaRegistro(Ventana v) {
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				ventana.irAPantalla("registro");
			}
		});
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0,
				Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel tituloRegistro = new JLabel("Registro");
		tituloRegistro.setFont(new Font("Arial Black", Font.PLAIN, 37));
		GridBagConstraints gbc_tituloRegistro = new GridBagConstraints();
		gbc_tituloRegistro.gridwidth = 3;
		gbc_tituloRegistro.insets = new Insets(0, 0, 5, 5);
		gbc_tituloRegistro.gridx = 1;
		gbc_tituloRegistro.gridy = 1;
		add(tituloRegistro, gbc_tituloRegistro);

		JLabel labelUsuario = new JLabel("Usuario");
		GridBagConstraints gbc_labelUsuario = new GridBagConstraints();
		gbc_labelUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_labelUsuario.anchor = GridBagConstraints.EAST;
		gbc_labelUsuario.gridx = 1;
		gbc_labelUsuario.gridy = 3;
		add(labelUsuario, gbc_labelUsuario);

		campoUsuario = new JTextField();
		GridBagConstraints gbc_campoUsuario = new GridBagConstraints();
		gbc_campoUsuario.gridwidth = 2;
		gbc_campoUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_campoUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoUsuario.gridx = 2;
		gbc_campoUsuario.gridy = 3;
		add(campoUsuario, gbc_campoUsuario);
		campoUsuario.setColumns(10);

		JLabel labelContraseña = new JLabel("Contrase\u00F1a");
		GridBagConstraints gbc_labelContraseña = new GridBagConstraints();
		gbc_labelContraseña.anchor = GridBagConstraints.EAST;
		gbc_labelContraseña.insets = new Insets(0, 0, 5, 5);
		gbc_labelContraseña.gridx = 1;
		gbc_labelContraseña.gridy = 4;
		add(labelContraseña, gbc_labelContraseña);

		campoContraseña = new JPasswordField();
		GridBagConstraints gbc_campoContraseña = new GridBagConstraints();
		gbc_campoContraseña.gridwidth = 2;
		gbc_campoContraseña.insets = new Insets(0, 0, 5, 5);
		gbc_campoContraseña.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoContraseña.gridx = 2;
		gbc_campoContraseña.gridy = 4;
		add(campoContraseña, gbc_campoContraseña);

		JLabel labelEmail = new JLabel("Email");
		labelEmail.setBackground(Color.WHITE);
		GridBagConstraints gbc_labelEmail = new GridBagConstraints();
		gbc_labelEmail.anchor = GridBagConstraints.EAST;
		gbc_labelEmail.insets = new Insets(0, 0, 5, 5);
		gbc_labelEmail.gridx = 1;
		gbc_labelEmail.gridy = 5;
		add(labelEmail, gbc_labelEmail);

		campoEmail = new JTextField();
		GridBagConstraints gbc_campoEmail = new GridBagConstraints();
		gbc_campoEmail.gridwidth = 2;
		gbc_campoEmail.insets = new Insets(0, 0, 5, 5);
		gbc_campoEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoEmail.gridx = 2;
		gbc_campoEmail.gridy = 5;
		add(campoEmail, gbc_campoEmail);
		campoEmail.setColumns(10);

		JRadioButton generoHombre = new JRadioButton("Hombre");
		GridBagConstraints gbc_generoHombre = new GridBagConstraints();
		gbc_generoHombre.insets = new Insets(0, 0, 5, 5);
		gbc_generoHombre.gridx = 1;
		gbc_generoHombre.gridy = 7;
		add(generoHombre, gbc_generoHombre);

		JRadioButton generoMujer = new JRadioButton("Mujer");
		GridBagConstraints gbc_generoMujer = new GridBagConstraints();
		gbc_generoMujer.insets = new Insets(0, 0, 5, 5);
		gbc_generoMujer.gridx = 2;
		gbc_generoMujer.gridy = 7;
		add(generoMujer, gbc_generoMujer);

		JRadioButton generoNoBinario = new JRadioButton("No binario");
		GridBagConstraints gbc_generoNoBinario = new GridBagConstraints();
		gbc_generoNoBinario.insets = new Insets(0, 0, 5, 5);
		gbc_generoNoBinario.gridx = 3;
		gbc_generoNoBinario.gridy = 7;
		add(generoNoBinario, gbc_generoNoBinario);
		
		/**
		 * Con buttonGroup conseguimos que se seleccione una de als opciones
		 * y no las 3
		 */
		ButtonGroup grupoGenero=new ButtonGroup();
		grupoGenero.add(generoNoBinario);
		grupoGenero.add(generoHombre);
		grupoGenero.add(generoMujer);

		botonRegistrarse = new JButton("Registrarse");

		JComboBox seleccionCiudad = new JComboBox();
		seleccionCiudad.setModel(new DefaultComboBoxModel(Ciudad.values()));
		GridBagConstraints gbc_seleccionCiudad = new GridBagConstraints();
		gbc_seleccionCiudad.gridwidth = 3;
		gbc_seleccionCiudad.insets = new Insets(0, 0, 5, 5);
		gbc_seleccionCiudad.fill = GridBagConstraints.HORIZONTAL;
		gbc_seleccionCiudad.gridx = 1;
		gbc_seleccionCiudad.gridy = 9;
		add(seleccionCiudad, gbc_seleccionCiudad);
		GridBagConstraints gbc_botonRegistrarse = new GridBagConstraints();
		gbc_botonRegistrarse.fill = GridBagConstraints.BOTH;
		gbc_botonRegistrarse.gridwidth = 3;
		gbc_botonRegistrarse.insets = new Insets(0, 0, 5, 5);
		gbc_botonRegistrarse.gridx = 1;
		gbc_botonRegistrarse.gridy = 10;
		add(botonRegistrarse, gbc_botonRegistrarse);

		JButton botonAtras = new JButton("Atr\u00E1s");
		botonAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irAPantalla("login");
			}
		});
		GridBagConstraints gbc_botonAtras = new GridBagConstraints();
		gbc_botonAtras.insets = new Insets(0, 0, 5, 5);
		gbc_botonAtras.gridx = 3;
		gbc_botonAtras.gridy = 12;
		add(botonAtras, gbc_botonAtras);
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
				char genero = 0;
				if (generoHombre.isSelected()) {
					genero = 'h';

				} else if (generoMujer.isSelected()) {
					genero = 'm';
				} else if (generoNoBinario.isSelected()) {
					genero = 'n';
				}
				/**
				 * Creamos un nuevo usuario
				 */
				
				try {
					new Usuario(nombreUsuario,email,contraseña,true);
					/**
					 * JOptionPane. showMessage Dialog
					 * ventana emergente cuando no se realiza bien el resgistro
					 * 4 argumentos
					 * 1ª ventana padre
					 * 2º contenido mensaje
					 * 3º  titulo
					 * 4º Icono que te sale en el mensaje
					 */
					JOptionPane.showMessageDialog(ventana,"Registrado con éxito","Registro completado",
							+ JOptionPane.PLAIN_MESSAGE);
					ventana.irAPantalla("login");/* Una vez registrado entra en la ventana de login*/
					
				} catch (SQLException | ContrasegnaInvalidaException e1) {
					JOptionPane.showMessageDialog(ventana, e1.getMessage(),"Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

	}
}
