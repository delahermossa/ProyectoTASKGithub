package interfacesgraficas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import clases.Servicio;
import enumeraciones.Ciudad;
import enumeraciones.SubBelleza;
import enumeraciones.SubColegio;
import enumeraciones.SubDeporte;
import enumeraciones.SubHogar;
import enumeraciones.SubMascota;
import utils.Utils;

public class PantallaAltaServicio extends JPanel {
	private Ventana ventana;
	private JButton botonRegistrarse;
	private JTextField campoDescripcion;
	private JTextField textoPrecio;
	private JTextField campoNombreServicio;

	public PantallaAltaServicio(Ventana v) {
		setBorder(null);
		setBackground(Color.WHITE);
		this.ventana = v;
		setLayout(null);

		JLabel labelEmailDinamico = new JLabel("" + Utils.currentUser.getEmail());
		labelEmailDinamico.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelEmailDinamico.setBounds(25, 232, 153, 28);
		add(labelEmailDinamico);

		JLabel labelNombreUsuario = new JLabel("" + Utils.currentUser.getNombreUsuario());
		labelNombreUsuario.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelNombreUsuario.setBounds(25, 177, 153, 28);
		add(labelNombreUsuario);

		JLabel labelEuros = new JLabel("\u20AC");
		labelEuros.setForeground(new Color(0, 0, 0));
		labelEuros.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelEuros.setBounds(740, 462, 48, 50);
		add(labelEuros);

		campoNombreServicio = new JTextField();
		campoNombreServicio.setHorizontalAlignment(SwingConstants.LEFT);
		campoNombreServicio.setColumns(10);
		campoNombreServicio.setBounds(25, 354, 332, 28);
		add(campoNombreServicio);

		JLabel labelNombreServicio = new JLabel("Nombre de tu servicio");
		labelNombreServicio.setForeground(new Color(32, 178, 170));
		labelNombreServicio.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelNombreServicio.setBounds(25, 329, 231, 28);
		add(labelNombreServicio);

		textoPrecio = new JTextField();
		textoPrecio.setHorizontalAlignment(SwingConstants.CENTER);
		textoPrecio.setFont(new Font("Century Gothic", Font.BOLD, 20));
		textoPrecio.setForeground(new Color(255, 255, 255));
		textoPrecio.setBackground(new Color(32, 178, 170));
		textoPrecio.setColumns(10);
		textoPrecio.setBounds(654, 462, 76, 50);
		add(textoPrecio);

		JLabel labelPrecio = new JLabel("Ponle precio!");
		labelPrecio.setForeground(new Color(32, 178, 170));
		labelPrecio.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelPrecio.setBounds(650, 424, 145, 28);
		add(labelPrecio);

		JLabel subeFoto = new JLabel("");
		subeFoto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFileChooser elige= new JFileChooser();
		        elige.showOpenDialog(elige);
		        File file=elige.getSelectedFile();
		        try {
					System.out.println(file.getCanonicalPath());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		subeFoto.setIcon(new ImageIcon(PantallaAltaServicio.class.getResource("/imagenes/iconoSubirFoto.png")));
		subeFoto.setBounds(523, 445, 95, 86);
		add(subeFoto);

		JLabel labelFoto = new JLabel("Sube tu foto");
		labelFoto.setForeground(new Color(32, 178, 170));
		labelFoto.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelFoto.setBounds(523, 424, 145, 28);
		add(labelFoto);

		final JComboBox seleccionTipoServicio = new JComboBox();
		seleccionTipoServicio.setModel(new DefaultComboBoxModel(SubHogar.values()));
		seleccionTipoServicio.setForeground(Color.WHITE);
		seleccionTipoServicio.setFont(new Font("Century Gothic", Font.BOLD, 15));
		seleccionTipoServicio.setBackground(new Color(95, 158, 160));
		seleccionTipoServicio.setBounds(513, 270, 282, 36);
		add(seleccionTipoServicio);

		JLabel labelSubcattegoria = new JLabel("Elige Servicio");
		labelSubcattegoria.setForeground(new Color(255, 255, 255));
		labelSubcattegoria.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelSubcattegoria.setBounds(513, 232, 145, 28);
		add(labelSubcattegoria);

		final JComboBox seleccionCategoria = new JComboBox();
		seleccionCategoria.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				switch ((String) seleccionCategoria.getSelectedItem()) {
				case "COLEGIO":
					seleccionTipoServicio.setModel(new DefaultComboBoxModel(SubColegio.values()));
					break;
				case "HOGAR":
					seleccionTipoServicio.setModel(new DefaultComboBoxModel(SubHogar.values()));
					break;
				case "BELLEZA":
					seleccionTipoServicio.setModel(new DefaultComboBoxModel(SubBelleza.values()));
					break;
				case "MASCOTA":
					seleccionTipoServicio.setModel(new DefaultComboBoxModel(SubMascota.values()));
					break;
				case "DEPORTE":
					seleccionTipoServicio.setModel(new DefaultComboBoxModel(SubDeporte.values()));
					break;

				}
			}
		});
		seleccionCategoria.setBackground(new Color(95, 158, 160));
		seleccionCategoria.setForeground(Color.WHITE);
		seleccionCategoria.setFont(new Font("Century Gothic", Font.BOLD, 15));
		seleccionCategoria.setBounds(513, 186, 282, 36);
		seleccionCategoria.setModel(
				new DefaultComboBoxModel(new String[] { "HOGAR", "COLEGIO", "BELLEZA", "DEPORTE", "MASCOTA" }));
		add(seleccionCategoria);

		JLabel labelCategoria = new JLabel("Elige categoria");
		labelCategoria.setForeground(new Color(255, 255, 255));
		labelCategoria.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelCategoria.setBounds(513, 148, 223, 28);
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

		JLabel labelNombre = new JLabel("Nombre usuario");
		labelNombre.setForeground(Color.WHITE);
		labelNombre.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelNombre.setBounds(25, 150, 153, 28);
		add(labelNombre);
		JLabel labelEmail = new JLabel("Email");
		labelEmail.setForeground(Color.WHITE);
		labelEmail.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelEmail.setBounds(25, 200, 84, 27);
		labelEmail.setBackground(Color.WHITE);
		add(labelEmail);

		JLabel labelDireccion = new JLabel("Descripcion");
		labelDireccion.setForeground(new Color(32, 178, 170));
		labelDireccion.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelDireccion.setBounds(31, 392, 117, 36);
		add(labelDireccion);

		campoDescripcion = new JTextField();
		campoDescripcion.setHorizontalAlignment(SwingConstants.LEFT);
		campoDescripcion.setBounds(25, 424, 332, 100);
		add(campoDescripcion);
		campoDescripcion.setColumns(10);

		JLabel labelCiudad = new JLabel("Elige ciudad");
		labelCiudad.setForeground(new Color(32, 178, 170));
		labelCiudad.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelCiudad.setBounds(513, 316, 145, 28);
		add(labelCiudad);

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
		labelFondo.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelFondo.setForeground(new Color(255, 255, 255));
		labelFondo.setIcon(new ImageIcon(PantallaAltaServicio.class.getResource("/imagenes/fondoServicios.jpg")));
		labelFondo.setBounds(0, 10, 853, 657);
		add(labelFondo);
		ventana = v;

		/**
		 * 
		 */
		botonRegistrarse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			

				String campoDescrip = campoDescripcion.getText();
				String textoPrec = textoPrecio.getText();
				String campoNombreServ = campoNombreServicio.getText();

				String categoria = seleccionCategoria.getSelectedItem().toString();
				String subCategoria = seleccionTipoServicio.getSelectedItem().toString();

				Ciudad ciudad = (Ciudad) seleccionCiudad.getSelectedItem();
				

				try {
					System.out.println(campoNombreServ+categoria+subCategoria+ campoDescrip);///
					new Servicio(campoNombreServ, categoria, subCategoria, Float.valueOf(textoPrec), campoDescrip,
							ciudad, Utils.currentUser.getEmail());
					
				} catch (NumberFormatException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}

			
				try {
					
					/**
					 * JOptionPane. showMessage Dialog ventana emergente cuando no se realiza bien
					 * el resgistro 4 argumentos 1ª ventana padre 2º contenido mensaje 3º titulo 4º
					 * Icono que te sale en el mensaje
					 */
					JOptionPane.showMessageDialog(ventana, "Registrado con éxito", "Registro completado",
							+JOptionPane.PLAIN_MESSAGE);
					ventana.irAPantalla("servicios");

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(ventana, e1.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

	}
}
