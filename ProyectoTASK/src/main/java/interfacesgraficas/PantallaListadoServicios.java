package interfacesgraficas;

import java.awt.Color;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import clases.Servicio;
import clases.UsuarioServicio;

import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class PantallaListadoServicios extends JPanel {
	private Ventana ventana;

	public PantallaListadoServicios(Ventana v) {
		setBackground(new Color(176, 224, 230));

		this.ventana = v;
		setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);

		JPanel panel = new JPanel();
		
		/**
		 * Bucle for que recorre todos los servicios añadidos en cada una de las categorias 
		 * y los muestra en la PantallaListadoServicios
		 */
		/*cambiar imagen para que se cargue*/

		try {
			ArrayList<UsuarioServicio> usuServicio = Servicio.consultarServicios("Hogar");
			for (UsuarioServicio usuarioServicios : usuServicio) {

				JPanel usuarioServicio = new JPanel();
				panel.add(usuarioServicio);
				usuarioServicio.setLayout(null);

				JLabel precio = new JLabel("" + usuarioServicios.getServicio().getPrecioServicio() + "€");
				precio.setHorizontalAlignment(SwingConstants.CENTER);
				precio.setFont(new Font("Century Gothic", Font.BOLD, 15));
				precio.setBounds(623, 44, 62, 46);
				usuarioServicio.add(precio);

				JLabel descripcionUsuario = new JLabel(usuarioServicios.getServicio().getDescripcion());
				descripcionUsuario.setFont(new Font("Tahoma", Font.BOLD, 15));
				descripcionUsuario.setBounds(176, 65, 423, 36);
				usuarioServicio.add(descripcionUsuario);

				JLabel nombre = new JLabel("Paco");//cambiar
				nombre.setFont(new Font("Century Gothic", Font.BOLD, 15));
				nombre.setHorizontalAlignment(SwingConstants.CENTER);
				nombre.setBounds(176, 42, 45, 13);
				usuarioServicio.add(nombre);

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

		scrollPane.setViewportView(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

	}
}
