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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaUsuario extends JPanel{
	
	private Ventana ventana;
	
	public PantallaUsuario(Ventana v) {
		this.ventana = v;
		setBorder(null);
		setBackground(new Color(230, 230, 250));
		setLayout(null);
				
				JButton botonAtras = new JButton("Atras");
				botonAtras.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						ventana.irAPantalla("servicios");
					}
				});
				
				JButton botonCerrarsesion = new JButton("Cerrar sesi\u00F3n");
				botonCerrarsesion.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						ventana.irAPantalla("login");
					}
				});
				botonCerrarsesion.setForeground(Color.WHITE);
				botonCerrarsesion.setFont(new Font("Century Gothic", Font.BOLD, 15));
				botonCerrarsesion.setBackground(new Color(95, 158, 160));
				botonCerrarsesion.setBounds(545, 551, 157, 33);
				add(botonCerrarsesion);
				
				JLabel labelPerfil = new JLabel("Mi perfil");
				labelPerfil.setForeground(new Color(218, 165, 32));
				labelPerfil.setFont(new Font("Century Gothic", Font.BOLD, 15));
				labelPerfil.setBounds(762, 0, 66, 36);
				add(labelPerfil);
				
				JLabel labelPersona = new JLabel("");
				labelPersona.setIcon(new ImageIcon(PantallaUsuario.class.getResource("/imagenes/usuario.png")));
				labelPersona.setBounds(416, 27, 412, 425);
				add(labelPersona);
				botonAtras.setBackground(new Color(95, 158, 160));
				botonAtras.setForeground(new Color(255, 255, 255));
				botonAtras.setFont(new Font("Century Gothic", Font.BOLD, 15));
				botonAtras.setBounds(25, 551, 157, 33);
				add(botonAtras);
				
				JLabel labelCiudadDinam = new JLabel(""+Utils.currentUser.getCiudad());
				labelCiudadDinam.setFont(new Font("Century Gothic", Font.BOLD, 15));
				labelCiudadDinam.setBounds(152, 429, 216, 28);
				add(labelCiudadDinam);
				
				JLabel iconoUsu = new JLabel("");
				iconoUsu.setIcon(new ImageIcon(PantallaUsuario.class.getResource("/imagenes/user.png")));
				iconoUsu.setHorizontalAlignment(SwingConstants.CENTER);
				iconoUsu.setBounds(761, 27, 62, 61);
				add(iconoUsu);
				
				JButton botonMiServ = new JButton("MI SERVICIO");
				botonMiServ.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				botonMiServ.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						ventana.irAPantalla("miservicio");
						
					}
				});
				botonMiServ.setForeground(Color.WHITE);
				botonMiServ.setFont(new Font("Century Gothic", Font.BOLD, 20));
				botonMiServ.setBackground(new Color(32, 178, 170));
				botonMiServ.setBounds(624, 419, 177, 44);
				add(botonMiServ);
				
				JButton botonMisCitas = new JButton("MIS CITAS");
				botonMisCitas.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				botonMisCitas.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						
						ventana.irAPantalla("miscitas");
					}
				});
				botonMisCitas.setForeground(Color.WHITE);
				botonMisCitas.setFont(new Font("Century Gothic", Font.BOLD, 20));
				botonMisCitas.setBackground(new Color(32, 178, 170));
				botonMisCitas.setBounds(431, 419, 177, 44);
				add(botonMisCitas);
				
				JLabel labelCiudad = new JLabel("Ciudad");
				labelCiudad.setHorizontalAlignment(SwingConstants.LEFT);
				labelCiudad.setForeground(new Color(255, 255, 255));
				labelCiudad.setFont(new Font("Century Gothic", Font.BOLD, 20));
				labelCiudad.setBounds(31, 427, 101, 28);
				add(labelCiudad);
				
				JLabel labelDireccionDinamico = new JLabel(""+Utils.currentUser.getDireccion());
				labelDireccionDinamico.setFont(new Font("Century Gothic", Font.BOLD, 15));
				labelDireccionDinamico.setBounds(142, 391, 216, 28);
				add(labelDireccionDinamico);
				
				JLabel labelDireccion = new JLabel("Direccion");
				labelDireccion.setHorizontalAlignment(SwingConstants.LEFT);
				labelDireccion.setForeground(new Color(255, 255, 255));
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
		labelEmail.setForeground(new Color(255, 255, 255));
		labelEmail.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelEmail.setBounds(31, 352, 84, 27);
		labelEmail.setBackground(Color.WHITE);
		add(labelEmail);
		
		JLabel labelUsuario = new JLabel("Usuario");
		labelUsuario.setForeground(new Color(255, 255, 255));
		labelUsuario.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelUsuario.setBounds(31, 315, 166, 28);
		add(labelUsuario);
		
		JLabel labelIcono = new JLabel("");
		labelIcono.setIcon(new ImageIcon(PantallaUsuario.class.getResource("/imagenes/iconoPrincipal.png")));
		labelIcono.setHorizontalAlignment(SwingConstants.CENTER);
		labelIcono.setBounds(31, 27, 111, 100);
		add(labelIcono);
		
		JLabel labelderecha = new JLabel("");
		labelderecha.setIcon(new ImageIcon(PantallaUsuario.class.getResource("/imagenes/fondoblanco.jpg")));
		labelderecha.setBounds(418, 0, 432, 650);
		add(labelderecha);
		
		JLabel labelFondo = new JLabel("");
		labelFondo.setIcon(new ImageIcon(PantallaUsuario.class.getResource("/imagenes/lateral.png")));
		labelFondo.setBounds(0, 0, 850, 650);
		add(labelFondo);
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				

				ventana.irAPantalla("pantallausuario");
			}
		});

}
}
