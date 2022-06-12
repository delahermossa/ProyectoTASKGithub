package interfacesgraficas;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import clases.Servicio;
import clases.UsuarioServicio;
import utils.Utils;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ImageIcon;

/**
 * Pantalla creada para listar servicios y listar citas de los usuarios que han contratado mis servicios
 * solo saldran las citas agendadas si has dado de alta tu servicio y si algun usuario lo ha comprado
 * @author delah
 *
 */

public class PantallaListadoServicios extends JPanel {
	private Ventana ventana;

	public PantallaListadoServicios(Ventana v, Object servicio, final boolean mio) {
		setBackground(new Color(95, 158, 160));
		JPanel yo = this;
		this.ventana = v;
		setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		// Este scrollPane es el listado de servicios

		final JPanel panel = new JPanel();
		add(scrollPane, BorderLayout.CENTER);
		/**
		 * cargamos listado
		 */
		cargarListado(mio, servicio, panel);
		scrollPane.setViewportView(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		JButton botonAtras = new JButton("Atras");
		botonAtras.setBackground(new Color(95, 158, 160));
		botonAtras.setForeground(new Color(255, 255, 255));
		botonAtras.setFont(new Font("Century Gothic", Font.BOLD, 15));
		botonAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ventana.irAPantalla("servicios");
			}
		});
		add(botonAtras, BorderLayout.SOUTH);

	}

	/**
	 * Metodo encargado de cargar el listado de servicios en la el panel pasado por
	 * parametros En el caso de que la variable mio sea true mostrara el listado
	 * para comprar y en el caso de que sea false mostrara el listado para borrar
	 * 
	 * @param mio
	 * @param servicio
	 * @param panel
	 */
	private void cargarListado(final boolean mio, Object servicio, final JPanel panel) {
		try {
			ArrayList<UsuarioServicio> usuServicio = null;
			if (mio) {
				usuServicio = Servicio.consultarMisServicios(Utils.currentUser.getEmail());
			} else {
				usuServicio = Servicio.consultarServicios(servicio.toString());
			}
			for (final UsuarioServicio usuarioServicios : usuServicio) {

				JPanel usuarioServicio = new JPanel();
				usuarioServicio.setPreferredSize(new Dimension(770, 120));
				panel.add(usuarioServicio);
				usuarioServicio.setLayout(null);

				JLabel precio = new JLabel("" + usuarioServicios.getServicio().getPrecioServicio() + "€");
				precio.setHorizontalAlignment(SwingConstants.CENTER);
				precio.setFont(new Font("Century Gothic", Font.BOLD, 15));
				precio.setBounds(623, 44, 62, 46);
				usuarioServicio.add(precio);

				JButton botonComprar = new JButton("Comprar");
				if (mio)
					botonComprar.setText("Borrar");
				/**
				 * Genero una copia exacta de usuServicio de tipo final para poder usarla en el onclick
				 */
				
				final ArrayList<UsuarioServicio> listadoArrayList = new ArrayList<>();
				listadoArrayList.addAll(usuServicio);
				botonComprar.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						if (!mio) {
							ventana.irAPantalla("compraservicio", usuarioServicios);
						} else {
							try {
								usuarioServicios.getServicio().borrarServicio();
								panel.removeAll();
								cargarListado(mio, listadoArrayList, panel);
								
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}

					}
				});
				botonComprar.setForeground(new Color(255, 255, 255));
				botonComprar.setFont(new Font("Century Gothic", Font.BOLD, 15));
				botonComprar.setBackground(new Color(95, 158, 160));
				botonComprar.setBounds(631, 86, 115, 21);
				usuarioServicio.add(botonComprar);

				JLabel descripcionUsuario = new JLabel(usuarioServicios.getServicio().getDescripcion());
				descripcionUsuario.setFont(new Font("Tahoma", Font.BOLD, 15));
				descripcionUsuario.setBounds(176, 65, 423, 36);
				usuarioServicio.add(descripcionUsuario);

				JLabel nombre = new JLabel(usuarioServicios.getUsuario().getNombreUsuario());// cambiar
				nombre.setFont(new Font("Century Gothic", Font.BOLD, 15));
				nombre.setHorizontalAlignment(SwingConstants.CENTER);
				nombre.setBounds(176, 42, 45, 13);
				usuarioServicio.add(nombre);
				
				/**
				 * label para foto predeterminada de usuario del servicio
				 */

				JLabel fotoUsuario = new JLabel("");
				fotoUsuario.setIcon(
						new ImageIcon(PantallaListadoServicios.class.getResource("/imagenes/teamwork.png")));
				fotoUsuario.setFont(new Font("Century Gothic", Font.BOLD, 15));
				fotoUsuario.setBounds(55, 29, 87, 87);
				usuarioServicio.add(fotoUsuario);
				/**
				 * Fondo de cada servicio
				 */
				JLabel fondoUsuario = new JLabel("");
				fondoUsuario.setIcon(
						new ImageIcon(PantallaListadoServicios.class.getResource("/imagenes/fondoServicios.jpg")));
				fondoUsuario.setBounds(21, 29, 770, 87);
				usuarioServicio.add(fondoUsuario);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
