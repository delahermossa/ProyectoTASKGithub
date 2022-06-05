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

		final JComboBox comboHora = new JComboBox();
		comboHora.setModel(new DefaultComboBoxModel(new String[] { "10:00", "11:00", "12:00", "13:00", "14:00", "15:00",
				"16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00" }));
		comboHora.setForeground(Color.WHITE);
		comboHora.setFont(new Font("Century Gothic", Font.BOLD, 15));
		comboHora.setBackground(new Color(95, 158, 160));
		comboHora.setBounds(510, 500, 183, 39);
		add(comboHora);

		JLabel labelCita = new JLabel("Agenda tu cita!");
		labelCita.setHorizontalAlignment(SwingConstants.LEFT);
		labelCita.setForeground(new Color(95, 158, 160));
		labelCita.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelCita.setBounds(513, 410, 188, 28);
		add(labelCita);

		final JComboBox comboDia = new JComboBox();
		comboDia.setForeground(new Color(255, 255, 255));
		comboDia.setBackground(new Color(95, 158, 160));
		comboDia.setModel(new DefaultComboBoxModel(
				new String[] { "LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO" }));
		comboDia.setFont(new Font("Century Gothic", Font.BOLD, 15));
		comboDia.setBounds(510, 448, 183, 39);
		add(comboDia);

		JLabel labelPrecioDinam = new JLabel("" + usuarioServicio.getServicio().getPrecioServicio());
		labelPrecioDinam.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelPrecioDinam.setBounds(649, 384, 201, 28);
		add(labelPrecioDinam);

		JLabel labelPrecio = new JLabel("Precio");
		labelPrecio.setHorizontalAlignment(SwingConstants.LEFT);
		labelPrecio.setForeground(new Color(95, 158, 160));
		labelPrecio.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelPrecio.setBounds(510, 382, 126, 28);
		add(labelPrecio);

		JLabel labelSubDinam = new JLabel(usuarioServicio.getServicio().getSubCategoria());
		labelSubDinam.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelSubDinam.setBounds(649, 346, 201, 28);
		add(labelSubDinam);

		JLabel labelSubcat = new JLabel("SubCategoria");
		labelSubcat.setForeground(new Color(95, 158, 160));
		labelSubcat.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelSubcat.setBounds(510, 346, 138, 28);
		add(labelSubcat);

		JLabel labelCategoriaDinamic = new JLabel(usuarioServicio.getServicio().getCategoria());
		labelCategoriaDinamic.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelCategoriaDinamic.setBounds(649, 310, 201, 28);
		add(labelCategoriaDinamic);

		JLabel labelCateg = new JLabel("Categoria");
		labelCateg.setForeground(new Color(95, 158, 160));
		labelCateg.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelCateg.setBounds(510, 308, 138, 28);
		add(labelCateg);

		JLabel labelUsuarioDinamic_1 = new JLabel(usuarioServicio.getServicio().getNombreServicio());
		labelUsuarioDinamic_1.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelUsuarioDinamic_1.setBounds(296, 310, 201, 28);
		add(labelUsuarioDinamic_1);

		JLabel labelNomServ = new JLabel("Nombre del servicio");
		labelNomServ.setForeground(new Color(95, 158, 160));
		labelNomServ.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelNomServ.setBounds(80, 308, 216, 28);
		add(labelNomServ);

		JLabel labelDescpDinam = new JLabel(usuarioServicio.getServicio().getDescripcion());
		labelDescpDinam.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelDescpDinam.setBounds(216, 500, 216, 28);
		add(labelDescpDinam);

		JLabel labelDescrip = new JLabel("Descripcion");
		labelDescrip.setHorizontalAlignment(SwingConstants.LEFT);
		labelDescrip.setForeground(new Color(95, 158, 160));
		labelDescrip.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelDescrip.setBounds(80, 498, 126, 28);
		add(labelDescrip);

		JLabel labelCiudadDinam = new JLabel(usuarioServicio.getUsuario().getCiudad().toString());
		labelCiudadDinam.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelCiudadDinam.setBounds(216, 462, 216, 28);
		add(labelCiudadDinam);

		JLabel labelDireccionDinamico = new JLabel(usuarioServicio.getUsuario().getDireccion());
		labelDireccionDinamico.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelDireccionDinamico.setBounds(199, 424, 216, 28);
		add(labelDireccionDinamico);

		JLabel labelEmailDinamico = new JLabel(usuarioServicio.getUsuario().getEmail());
		labelEmailDinamico.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelEmailDinamico.setBounds(195, 386, 201, 28);
		add(labelEmailDinamico);

		JLabel labelUsuarioDinamic = new JLabel(usuarioServicio.getUsuario().getNombreUsuario());
		labelUsuarioDinamic.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelUsuarioDinamic.setBounds(195, 348, 201, 28);
		add(labelUsuarioDinamic);

		JLabel labelCiudad = new JLabel("Ciudad");
		labelCiudad.setHorizontalAlignment(SwingConstants.LEFT);
		labelCiudad.setForeground(new Color(95, 158, 160));
		labelCiudad.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelCiudad.setBounds(81, 460, 101, 28);
		add(labelCiudad);

		JLabel labelDireccion = new JLabel("Direccion");
		labelDireccion.setHorizontalAlignment(SwingConstants.LEFT);
		labelDireccion.setForeground(new Color(95, 158, 160));
		labelDireccion.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelDireccion.setBounds(81, 422, 101, 28);
		add(labelDireccion);

		JLabel labelEmail = new JLabel("Email");
		labelEmail.setForeground(new Color(95, 158, 160));
		labelEmail.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelEmail.setBackground(Color.WHITE);
		labelEmail.setBounds(81, 385, 84, 27);
		add(labelEmail);

		JLabel labelUsuario = new JLabel("Usuario");
		labelUsuario.setForeground(new Color(95, 158, 160));
		labelUsuario.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelUsuario.setBounds(79, 346, 138, 28);
		add(labelUsuario);

		JLabel labelIcono = new JLabel("");
		labelIcono.setIcon(new ImageIcon(PantallaCompraServicio.class.getResource("/imagenes/iconoPrincipal.png")));
		labelIcono.setBounds(39, 46, 100, 109);
		add(labelIcono);

		JLabel labelFondo = new JLabel("");
		labelFondo.setIcon(new ImageIcon(PantallaCompraServicio.class.getResource("/imagenes/fondoServicios.jpg")));
		labelFondo.setBounds(0, 0, 850, 649);
		add(labelFondo);
		JButton btnCompra = new JButton("Comprar");
		btnCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Cita.crearCita(usuarioServicio,
							comboDia.getSelectedItem().toString() + " " + comboHora.getSelectedItem().toString());

					ventana.irAPantalla("miscitas");
				} catch (SQLException e) {
					JOptionPane.showMessageDialog(ventana, e.getMessage());
				}

			}
		});
		btnCompra.setBackground(new Color(95, 158, 160));
		btnCompra.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btnCompra.setForeground(new Color(255, 255, 255));
		btnCompra.setBounds(539, 545, 149, 49);
		add(btnCompra);

	}
}
