package interfacesgraficas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

import clases.Cita;

/**
 * Pantalla creada para listar citas solo saldran las citas agendadas si has dado de alta tu servicio y si algun usuario lo ha comprado

 * @author delah
 *
 */

public class PantallaMisCitas extends JPanel {

	private Ventana ventana;

	public PantallaMisCitas(final Ventana ventana) {
		setBackground(new Color(95, 158, 160));

		this.ventana = ventana;
		setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		// Este scrollPane es el listado de servicios

		JPanel panel = new JPanel();
		add(scrollPane, BorderLayout.CENTER);

		/**
		 * Bucle for que recorre todos los servicios añadidos en cada una de las
		 * categorias y los muestra en la PantallaListadoServicios
		 */
		try {
			ArrayList<Cita> misCitas = Cita.consultarCitas();
			for (Cita cita : misCitas) {
				/* cambiar imagen para que se cargue */
				JPanel usuarioServicio = new JPanel();
				usuarioServicio.setPreferredSize(new Dimension(770, 120));
				panel.add(usuarioServicio);
				usuarioServicio.setLayout(null);

				JLabel labelDiayHora = new JLabel(cita.getFechaCita());
				labelDiayHora.setFont(new Font("Century Gothic", Font.BOLD, 15));
				labelDiayHora.setBounds(350, 44, 263, 13);
				usuarioServicio.add(labelDiayHora);

				JLabel precio = new JLabel(cita.getServicio().getPrecioServicio() + "€");
				precio.setHorizontalAlignment(SwingConstants.CENTER);
				precio.setFont(new Font("Century Gothic", Font.BOLD, 15));
				precio.setBounds(623, 44, 62, 46);
				usuarioServicio.add(precio);

				JLabel descripcionUsuario = new JLabel(cita.getServicio().getDescripcion());
				descripcionUsuario.setFont(new Font("Tahoma", Font.BOLD, 15));
				descripcionUsuario.setBounds(176, 65, 423, 36);
				usuarioServicio.add(descripcionUsuario);

				JLabel nombre = new JLabel(cita.getUsuario().getNombreUsuario());// cambiar
				nombre.setFont(new Font("Century Gothic", Font.BOLD, 15));
				nombre.setHorizontalAlignment(SwingConstants.CENTER);
				nombre.setBounds(176, 42, 45, 13);
				usuarioServicio.add(nombre);

				JLabel nombreServ = new JLabel(cita.getServicio().getNombreServicio());// cambiar
				nombreServ.setFont(new Font("Century Gothic", Font.BOLD, 15));
				nombreServ.setHorizontalAlignment(SwingConstants.LEFT);
				nombreServ.setBounds(365, 75, 100, 13);
				usuarioServicio.add(nombreServ);

				JLabel fotoUsuario = new JLabel("");
				fotoUsuario.setIcon(
						new ImageIcon(PantallaListadoServicios.class.getResource("/imagenes/iconoBelleza.png")));
				fotoUsuario.setFont(new Font("Century Gothic", Font.BOLD, 15));
				fotoUsuario.setBounds(55, 29, 87, 87);
				usuarioServicio.add(fotoUsuario);

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
		
		/**
		 * uso scrollPane por si tengo mas de 5 o 6 citas pueda verlas todas, al igual que en listar servicios
		 */

		scrollPane.setViewportView(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ventana.irAPantalla("pantallausuario");
			}
		});
		btnAtras.setBackground(new Color(95, 158, 160));
		btnAtras.setForeground(new Color(255, 255, 255));
		btnAtras.setFont(new Font("Century Gothic", Font.BOLD, 15));
		add(btnAtras, BorderLayout.SOUTH);

	}
}
