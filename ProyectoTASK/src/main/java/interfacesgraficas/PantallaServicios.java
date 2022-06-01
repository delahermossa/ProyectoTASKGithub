package interfacesgraficas;

import javax.swing.JPanel;

import enumeraciones.Ciudad;
import enumeraciones.SubBelleza;
import enumeraciones.SubColegio;
import enumeraciones.SubDeporte;
import enumeraciones.SubHogar;
import enumeraciones.SubMascota;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class PantallaServicios extends JPanel {
	
	private Ventana ventana;
	
	
	
	public PantallaServicios(Ventana v) {
		setBackground(new Color(176, 224, 230));
		
		this.ventana=v;/*declarar siempre en todas las ventanas*/
		setLayout(null);
		
		JButton botonTASKER = new JButton("ALTA TASKER");
		botonTASKER.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irAPantalla("altaservicio");
			}
		});
		
		JButton botonMatematicas = new JButton("MATEM\u00C1TICAS");
		botonMatematicas.setBackground(new Color(95, 158, 160));
		botonMatematicas.setForeground(new Color(255, 255, 255));
		botonMatematicas.setFont(new Font("Century Gothic", Font.BOLD, 15));
		botonMatematicas.setBounds(211, 402, 139, 26);
		add(botonMatematicas);
		
		JButton botonMusica = new JButton("M\u00DASICA");
		botonMusica.setHorizontalAlignment(SwingConstants.CENTER);
		botonMusica.setForeground(new Color(255, 255, 255));
		botonMusica.setBackground(new Color(95, 158, 160));
		botonMusica.setFont(new Font("Century Gothic", Font.BOLD, 15));
		botonMusica.setBounds(216, 361, 121, 29);
		add(botonMusica);
		
		JButton botonChef = new JButton("CHEF");
		botonChef.setBackground(new Color(95, 158, 160));
		botonChef.setForeground(new Color(255, 255, 255));
		botonChef.setFont(new Font("Century Gothic", Font.BOLD, 15));
		botonChef.setBounds(64, 440, 112, 30);
		add(botonChef);
		
		JButton botonManitas = new JButton("MANITAS");
		botonManitas.setFont(new Font("Century Gothic", Font.BOLD, 15));
		botonManitas.setForeground(new Color(255, 255, 255));
		botonManitas.setBackground(new Color(95, 158, 160));
		botonManitas.setBounds(64, 400, 112, 30);
		add(botonManitas);
		
		JButton botonLimpieza = new JButton("LIMPIEZA");
		botonLimpieza.setBackground(new Color(95, 158, 160));
		botonLimpieza.setForeground(new Color(255, 255, 255));
		botonLimpieza.setFont(new Font("Century Gothic", Font.BOLD, 15));
		botonLimpieza.setBounds(64, 360, 112, 30);
		add(botonLimpieza);
		botonTASKER.setForeground(new Color(255, 255, 255));
		botonTASKER.setFont(new Font("Century Gothic", Font.BOLD, 15));
		botonTASKER.setBackground(new Color(32, 178, 170));
		botonTASKER.setBounds(629, 528, 136, 30);
	
	
		add(botonTASKER);
		
		
		
		JLabel labelTitulo = new JLabel("\u00A1Encuentra todos los servicios en tu ciudad!");
		labelTitulo.setForeground(new Color(255, 255, 255));
		labelTitulo.setFont(new Font("Century Gothic", Font.BOLD, 30));
		labelTitulo.setBounds(94, 50, 633, 77);
		add(labelTitulo);
		
		JLabel labelHogar = new JLabel("");
		labelHogar.setIcon(new ImageIcon(PantallaServicios.class.getResource("/imagenes/iconoHogar.png")));
		labelHogar.setBounds(82, 266, 80, 84);
		add(labelHogar);
		
		JLabel labelColegio = new JLabel("");
		labelColegio.setIcon(new ImageIcon(PantallaServicios.class.getResource("/imagenes/iconoLibros.png")));
		labelColegio.setBounds(242, 266, 80, 84);
		add(labelColegio);
		
		JLabel labelBelleza = new JLabel("");
		labelBelleza.setIcon(new ImageIcon(PantallaServicios.class.getResource("/imagenes/iconoBelleza.png")));
		labelBelleza.setBounds(396, 266, 80, 84);
		add(labelBelleza);
		
		JLabel labelDeporte = new JLabel("");
		labelDeporte.setIcon(new ImageIcon(PantallaServicios.class.getResource("/imagenes/iconoDeporte.png")));
		labelDeporte.setBounds(544, 266, 80, 84);
		add(labelDeporte);
		
		JLabel labelMascota = new JLabel("");
		labelMascota.setIcon(new ImageIcon(PantallaServicios.class.getResource("/imagenes/iconoMascota.png")));
		labelMascota.setBounds(665, 266, 80, 84);
		add(labelMascota);
		
		JComboBox enumHogar = new JComboBox();
		enumHogar.setBackground(new Color(95, 158, 160));
		enumHogar.setForeground(new Color(255, 255, 255));
		enumHogar.setFont(new Font("Century Gothic", Font.BOLD, 15));
		enumHogar.setBounds(64, 219, 98, 37);
		enumHogar.setModel(new DefaultComboBoxModel(SubHogar.values()));
		add(enumHogar);
		
		
		JComboBox enumColegio = new JComboBox();
		enumColegio.setBackground(new Color(95, 158, 160));
		enumColegio.setForeground(new Color(255, 255, 255));
		enumColegio.setFont(new Font("Century Gothic", Font.BOLD, 15));
		enumColegio.setBounds(242, 211, 88, 33);
		enumColegio.setModel(new DefaultComboBoxModel(SubColegio.values()));

		add(enumColegio);
		
		JComboBox enumBelleza = new JComboBox();
		enumBelleza.setBackground(new Color(95, 158, 160));
		enumBelleza.setForeground(new Color(255, 255, 255));
		enumBelleza.setFont(new Font("Century Gothic", Font.BOLD, 15));
		enumBelleza.setBounds(387, 221, 112, 33);
		enumBelleza.setModel(new DefaultComboBoxModel(SubBelleza.values()));
		add(enumBelleza);
		
		JComboBox enumDeporte = new JComboBox();
		enumDeporte.setBackground(new Color(95, 158, 160));
		enumDeporte.setForeground(new Color(255, 255, 255));
		enumDeporte.setFont(new Font("Century Gothic", Font.BOLD, 15));
		enumDeporte.setBounds(544, 223, 80, 29);
		enumDeporte.setModel(new DefaultComboBoxModel(SubDeporte.values()));
		add(enumDeporte);
		
		JComboBox enumMascota = new JComboBox();
		enumMascota.setBackground(new Color(95, 158, 160));
		enumMascota.setForeground(new Color(255, 255, 255));
		enumMascota.setFont(new Font("Century Gothic", Font.BOLD, 15));
		enumMascota.setBounds(668, 223, 77, 29);
		enumMascota.setModel(new DefaultComboBoxModel(SubMascota.values()));
		add(enumMascota);
		
		JLabel labelTexto1 = new JLabel("\u00BFNecesitas un chef o un manitas? \u00BFUn servicio de manicura a domicilio");
		labelTexto1.setForeground(Color.WHITE);
		labelTexto1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelTexto1.setBounds(94, 118, 704, 37);
		add(labelTexto1);
		
		JLabel labelTexto2 = new JLabel("o un entrenador personal? Contrata el servicio que m\u00E1s se ajuste a");
		labelTexto2.setForeground(Color.WHITE);
		labelTexto2.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelTexto2.setBounds(104, 149, 661, 29);
		add(labelTexto2);
		
		JLabel labelTexto3 = new JLabel("tus necesidades con TASK");
		labelTexto3.setForeground(Color.WHITE);
		labelTexto3.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelTexto3.setBounds(283, 175, 283, 26);
		add(labelTexto3);
		
		JLabel labelAlta = new JLabel("\u00A1Tambi\u00E9n puedes darte de alta como TASKER!");
		labelAlta.setForeground(new Color(95, 158, 160));
		labelAlta.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelAlta.setBounds(71, 511, 459, 47);
		add(labelAlta);
		
		JLabel labelAlta2 = new JLabel("Hazlo ya y comienza a trabajar...");
		labelAlta2.setForeground(Color.GRAY);
		labelAlta2.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelAlta2.setBounds(71, 557, 391, 26);
		add(labelAlta2);
		
		JLabel labelFondoServicio = new JLabel("");
		labelFondoServicio.setIcon(new ImageIcon(PantallaServicios.class.getResource("/imagenes/fondoServicios.jpg")));
		labelFondoServicio.setBounds(0, 0, 850, 650);
		add(labelFondoServicio);
	}
}
