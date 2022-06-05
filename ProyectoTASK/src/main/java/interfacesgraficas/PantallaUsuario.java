package interfacesgraficas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import utils.Utils;
import javax.swing.JButton;

public class PantallaUsuario extends JPanel{
	
	private Ventana ventana;
	
	public PantallaUsuario(Ventana v) {
		this.ventana = v;
		setBorder(null);
		setBackground(new Color(230, 230, 250));
		setLayout(null);
				
				JLabel labelCartera = new JLabel(""+Utils.currentUser.getCarteraUsuario());
				labelCartera.setIcon(new ImageIcon(PantallaUsuario.class.getResource("/imagenes/monedero.png")));
				labelCartera.setBounds(662, 439, 84, 80);
				add(labelCartera);
				
				JLabel labelCiudadDinam = new JLabel(""+Utils.currentUser.getCiudad());
				labelCiudadDinam.setFont(new Font("Century Gothic", Font.BOLD, 15));
				labelCiudadDinam.setBounds(142, 429, 216, 28);
				add(labelCiudadDinam);
				
				JLabel iconoUsu = new JLabel("");
				iconoUsu.setIcon(new ImageIcon(PantallaUsuario.class.getResource("/imagenes/user.png")));
				iconoUsu.setHorizontalAlignment(SwingConstants.CENTER);
				iconoUsu.setBounds(726, 68, 62, 61);
				add(iconoUsu);
				
				JButton botonMiServ = new JButton("MI SERVICIO");
				botonMiServ.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						ventana.irAPantalla("miservicio");
						
					}
				});
				botonMiServ.setForeground(Color.WHITE);
				botonMiServ.setFont(new Font("Century Gothic", Font.BOLD, 20));
				botonMiServ.setBackground(new Color(32, 178, 170));
				botonMiServ.setBounds(611, 373, 177, 44);
				add(botonMiServ);
				
				JButton botonMisCitas = new JButton("MIS CITAS");
				botonMisCitas.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						
						ventana.irAPantalla("miscitas");
					}
				});
				botonMisCitas.setForeground(Color.WHITE);
				botonMisCitas.setFont(new Font("Century Gothic", Font.BOLD, 20));
				botonMisCitas.setBackground(new Color(32, 178, 170));
				botonMisCitas.setBounds(611, 319, 177, 44);
				add(botonMisCitas);
				
				JLabel labelCiudad = new JLabel("Ciudad");
				labelCiudad.setHorizontalAlignment(SwingConstants.LEFT);
				labelCiudad.setForeground(new Color(95, 158, 160));
				labelCiudad.setFont(new Font("Century Gothic", Font.BOLD, 20));
				labelCiudad.setBounds(31, 427, 101, 28);
				add(labelCiudad);
				
				JLabel labelDireccionDinamico = new JLabel(""+Utils.currentUser.getDireccion());
				labelDireccionDinamico.setFont(new Font("Century Gothic", Font.BOLD, 15));
				labelDireccionDinamico.setBounds(142, 391, 216, 28);
				add(labelDireccionDinamico);
				
				JLabel labelDireccion = new JLabel("Direccion");
				labelDireccion.setHorizontalAlignment(SwingConstants.LEFT);
				labelDireccion.setForeground(new Color(95, 158, 160));
				labelDireccion.setFont(new Font("Century Gothic", Font.BOLD, 20));
				labelDireccion.setBounds(31, 389, 101, 28);
				add(labelDireccion);
				
				JLabel labelEmailDinamico = new JLabel("" + Utils.currentUser.getEmail());
				labelEmailDinamico.setFont(new Font("Century Gothic", Font.BOLD, 15));
				labelEmailDinamico.setBounds(142, 353, 201, 28);
				add(labelEmailDinamico);
		
				JLabel labelUsuarioDinamic = new JLabel("" + Utils.currentUser.getNombreUsuario());
				labelUsuarioDinamic.setFont(new Font("Century Gothic", Font.BOLD, 15));
				labelUsuarioDinamic.setBounds(142, 317, 201, 28);
				add(labelUsuarioDinamic);
		
		JLabel labelEmail = new JLabel("Email");
		labelEmail.setForeground(new Color(95, 158, 160));
		labelEmail.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelEmail.setBounds(31, 352, 84, 27);
		labelEmail.setBackground(Color.WHITE);
		add(labelEmail);
		
		JLabel labelUsuario = new JLabel("Usuario");
		labelUsuario.setForeground(new Color(95, 158, 160));
		labelUsuario.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelUsuario.setBounds(31, 315, 166, 28);
		add(labelUsuario);
		
		JLabel labelIcono = new JLabel("");
		labelIcono.setIcon(new ImageIcon(PantallaUsuario.class.getResource("/imagenes/iconoPrincipal.png")));
		labelIcono.setHorizontalAlignment(SwingConstants.CENTER);
		labelIcono.setBounds(31, 27, 111, 100);
		add(labelIcono);
		
		JLabel labelFondo = new JLabel("");
		labelFondo.setIcon(new ImageIcon(PantallaUsuario.class.getResource("/imagenes/fondoServicios.jpg")));
		labelFondo.setBounds(0, 0, 850, 640);
		add(labelFondo);
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				

				ventana.irAPantalla("pantallausuario");
			}
		});

}
}
