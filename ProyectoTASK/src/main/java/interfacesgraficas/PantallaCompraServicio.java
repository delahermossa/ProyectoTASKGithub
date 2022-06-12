package interfacesgraficas;

import java.awt.Color;

import javax.swing.JPanel;

import clases.Cita;
import clases.UsuarioServicio;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class PantallaCompraServicio extends JPanel {

	private Ventana ventana;

	public PantallaCompraServicio(Ventana v, Object object) {

		System.out.println(object);

		final UsuarioServicio usuarioServicio = (UsuarioServicio) object;

		setBackground(new Color(176, 224, 230));

		this.ventana = v;
		setLayout(null);

		JButton botonAtras = new JButton("Atr\u00E1s");
		botonAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ventana.irAPantalla("servicios");
			}
		});

		JLabel labelFlecha_1 = new JLabel("");
		labelFlecha_1.setIcon(new ImageIcon(PantallaCompraServicio.class.getResource("/imagenes/flecha.png")));
		labelFlecha_1.setBounds(464, 471, 45, 39);
		add(labelFlecha_1);

		JLabel labelFlecha = new JLabel("");
		labelFlecha.setIcon(new ImageIcon(PantallaCompraServicio.class.getResource("/imagenes/flecha.png")));
		labelFlecha.setBounds(464, 413, 45, 39);
		add(labelFlecha);

		JLabel labelPrecioDinam = new JLabel("" + usuarioServicio.getServicio().getPrecioServicio() + "€");
		labelPrecioDinam.setForeground(new Color(218, 165, 32));
		labelPrecioDinam.setHorizontalAlignment(SwingConstants.CENTER);
		labelPrecioDinam.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelPrecioDinam.setBounds(166, 479, 85, 28);
		add(labelPrecioDinam);

		JLabel labelSubDinam = new JLabel(usuarioServicio.getServicio().getSubCategoria());
		labelSubDinam.setForeground(new Color(169, 169, 169));
		labelSubDinam.setHorizontalAlignment(SwingConstants.CENTER);
		labelSubDinam.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelSubDinam.setBounds(145, 461, 149, 28);
		add(labelSubDinam);

		JLabel labelSubcat = new JLabel("Tipo de servicio");
		labelSubcat.setForeground(new Color(95, 158, 160));
		labelSubcat.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelSubcat.setBounds(25, 461, 161, 28);
		add(labelSubcat);

		JLabel labelPrecio = new JLabel("Precio");
		labelPrecio.setHorizontalAlignment(SwingConstants.LEFT);
		labelPrecio.setForeground(new Color(95, 158, 160));
		labelPrecio.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelPrecio.setBounds(25, 479, 101, 28);
		add(labelPrecio);

		JLabel labelFondoprecio = new JLabel("");
		labelFondoprecio
				.setIcon(new ImageIcon(PantallaCompraServicio.class.getResource("/imagenes/fondoServicios.jpg")));
		labelFondoprecio.setBackground(new Color(255, 255, 255));
		labelFondoprecio.setBounds(-77, 450, 389, 65);
		add(labelFondoprecio);

		JLabel labelImagen = new JLabel("");
		labelImagen.setIcon(new ImageIcon(PantallaCompraServicio.class.getResource("/imagenes/trato.png")));
		labelImagen.setBounds(467, 74, 317, 296);
		add(labelImagen);
		botonAtras.setBackground(new Color(95, 158, 160));
		botonAtras.setForeground(new Color(255, 255, 255));
		botonAtras.setFont(new Font("Century Gothic", Font.BOLD, 15));
		botonAtras.setBounds(39, 561, 85, 21);
		add(botonAtras);

		final JComboBox comboHora = new JComboBox();
		comboHora.setModel(new DefaultComboBoxModel(new String[] { "10:00", "11:00", "12:00", "13:00", "14:00", "15:00",
				"16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00" }));
		comboHora.setForeground(Color.WHITE);
		comboHora.setFont(new Font("Century Gothic", Font.BOLD, 15));
		comboHora.setBackground(new Color(0, 128, 128));
		comboHora.setBounds(519, 474, 183, 39);
		add(comboHora);

		JLabel labelCita = new JLabel("Agenda tu cita!");
		labelCita.setHorizontalAlignment(SwingConstants.CENTER);
		labelCita.setForeground(new Color(255, 255, 255));
		labelCita.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelCita.setBounds(519, 374, 183, 28);
		add(labelCita);

		final JComboBox comboDia = new JComboBox();
		comboDia.setForeground(new Color(255, 255, 255));
		comboDia.setBackground(new Color(0, 128, 128));
		comboDia.setModel(new DefaultComboBoxModel(
				new String[] { "LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO" }));
		comboDia.setFont(new Font("Century Gothic", Font.BOLD, 15));
		comboDia.setBounds(519, 413, 183, 39);
		add(comboDia);

		JLabel labelUsuarioDinamic_1 = new JLabel(usuarioServicio.getServicio().getNombreServicio());
		labelUsuarioDinamic_1.setForeground(new Color(0, 0, 0));
		labelUsuarioDinamic_1.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelUsuarioDinamic_1.setBounds(181, 232, 201, 28);
		add(labelUsuarioDinamic_1);

		JLabel labelNomServ = new JLabel("Nombre del servicio");
		labelNomServ.setForeground(new Color(255, 255, 255));
		labelNomServ.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelNomServ.setBounds(25, 232, 161, 28);
		add(labelNomServ);

		JLabel labelDescpDinam = new JLabel(usuarioServicio.getServicio().getDescripcion());
		labelDescpDinam.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelDescpDinam.setBounds(181, 362, 216, 28);
		add(labelDescpDinam);

		JLabel labelDescrip = new JLabel("Descripcion");
		labelDescrip.setHorizontalAlignment(SwingConstants.LEFT);
		labelDescrip.setForeground(Color.WHITE);
		labelDescrip.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelDescrip.setBounds(25, 362, 126, 28);
		add(labelDescrip);

		JLabel labelCiudadDinam = new JLabel(usuarioServicio.getUsuario().getCiudad().toString());
		labelCiudadDinam.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelCiudadDinam.setBounds(181, 335, 216, 28);
		add(labelCiudadDinam);

		JLabel labelDireccionDinamico = new JLabel(usuarioServicio.getUsuario().getDireccion());
		labelDireccionDinamico.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelDireccionDinamico.setBounds(181, 311, 216, 28);
		add(labelDireccionDinamico);

		JLabel labelEmailDinamico = new JLabel(usuarioServicio.getUsuario().getEmail());
		labelEmailDinamico.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelEmailDinamico.setBounds(181, 284, 201, 28);
		add(labelEmailDinamico);

		JLabel labelUsuarioDinamic = new JLabel(usuarioServicio.getUsuario().getNombreUsuario());
		labelUsuarioDinamic.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelUsuarioDinamic.setBounds(181, 259, 201, 28);
		add(labelUsuarioDinamic);

		JButton btnCompra = new JButton("Comprar");
		btnCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Cita.crearCita(usuarioServicio,
							comboDia.getSelectedItem().toString() + " " + comboHora.getSelectedItem().toString());

					ventana.irAPantalla("servicios");
				} catch (SQLException e) {
					JOptionPane.showMessageDialog(ventana, e.getMessage());
				}

			}
		});

		JLabel labelCiudad = new JLabel("Ciudad");
		labelCiudad.setHorizontalAlignment(SwingConstants.LEFT);
		labelCiudad.setForeground(Color.WHITE);
		labelCiudad.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelCiudad.setBounds(23, 335, 101, 28);
		add(labelCiudad);

		JLabel labelDireccion = new JLabel("Direccion");
		labelDireccion.setHorizontalAlignment(SwingConstants.LEFT);
		labelDireccion.setForeground(new Color(255, 255, 255));
		labelDireccion.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelDireccion.setBounds(23, 311, 101, 28);
		add(labelDireccion);

		JLabel labelEmail = new JLabel("Email");
		labelEmail.setForeground(new Color(255, 255, 255));
		labelEmail.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelEmail.setBackground(Color.WHITE);
		labelEmail.setBounds(25, 285, 84, 27);
		add(labelEmail);

		JLabel labelUsuario = new JLabel("Usuario");
		labelUsuario.setForeground(new Color(255, 255, 255));
		labelUsuario.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelUsuario.setBounds(25, 259, 138, 28);
		add(labelUsuario);

		JLabel labelIcono = new JLabel("");
		labelIcono.setIcon(new ImageIcon(PantallaCompraServicio.class.getResource("/imagenes/iconoPrincipal.png")));
		labelIcono.setBounds(39, 46, 100, 109);
		add(labelIcono);

		JLabel labelFondo = new JLabel("");
		labelFondo.setBackground(new Color(169, 169, 169));
		labelFondo.setIcon(new ImageIcon(PantallaCompraServicio.class.getResource("/imagenes/lateral.png")));
		labelFondo.setBounds(0, 0, 850, 649);
		add(labelFondo);

		btnCompra.setBackground(new Color(64, 224, 208));
		btnCompra.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btnCompra.setForeground(new Color(255, 255, 255));
		btnCompra.setBounds(539, 545, 149, 49);
		add(btnCompra);

		JLabel labelLateraldcha = new JLabel("");
		labelLateraldcha
				.setIcon(new ImageIcon(PantallaCompraServicio.class.getResource("/imagenes/lateralderecha.png")));
		labelLateraldcha.setBounds(419, 0, 431, 649);
		add(labelLateraldcha);

	}
}
