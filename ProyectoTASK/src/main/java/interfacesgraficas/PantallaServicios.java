package interfacesgraficas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PantallaServicios extends JPanel {

	private Ventana ventana;

	public PantallaServicios(Ventana v) {
		setBackground(new Color(176, 224, 230));

		this.ventana = v;/* declarar siempre en todas las ventanas */
		setLayout(null);

		JButton botonTASKER = new JButton("ALTA TASKER");
		botonTASKER.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irAPantalla("altaservicio");
			}
		});

		JLabel labelTituloMascota = new JLabel("MASCOTA");
		labelTituloMascota.setForeground(new Color(0, 0, 139));
		labelTituloMascota.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelTituloMascota.setBounds(686, 222, 142, 37);
		add(labelTituloMascota);

		JLabel labelTituloDeporte = new JLabel("DEPORTE");
		labelTituloDeporte.setForeground(new Color(0, 0, 139));
		labelTituloDeporte.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelTituloDeporte.setBounds(554, 227, 91, 27);
		add(labelTituloDeporte);

		JLabel labelTituloBelleza = new JLabel("BELLEZA");
		labelTituloBelleza.setForeground(new Color(0, 0, 139));
		labelTituloBelleza.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelTituloBelleza.setBounds(397, 227, 80, 27);
		add(labelTituloBelleza);

		JLabel labelTituloColegio = new JLabel("COLEGIO");
		labelTituloColegio.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelTituloColegio.setForeground(new Color(0, 0, 139));
		labelTituloColegio.setBounds(227, 228, 100, 24);
		add(labelTituloColegio);

		JLabel labelTituloHogar = new JLabel("HOGAR");
		labelTituloHogar.setForeground(new Color(0, 0, 139));
		labelTituloHogar.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelTituloHogar.setBounds(82, 227, 80, 27);
		add(labelTituloHogar);

		JButton botonPeluquero = new JButton("PELUQUERO");
		botonPeluquero.setForeground(new Color(255, 255, 255));
		botonPeluquero.setFont(new Font("Century Gothic", Font.BOLD, 15));
		botonPeluquero.setBackground(new Color(95, 158, 160));
		botonPeluquero.setBounds(686, 440, 121, 27);
		botonPeluquero.addActionListener(new AcionBoton());

		add(botonPeluquero);

		JButton botonMedico = new JButton("MEDICO");
		botonMedico.setBackground(new Color(95, 158, 160));
		botonMedico.setFont(new Font("Century Gothic", Font.BOLD, 15));
		botonMedico.setForeground(new Color(255, 255, 255));
		botonMedico.setBounds(685, 400, 121, 30);
		botonMedico.addActionListener(new AcionBoton());

		add(botonMedico);

		JButton botonPaseo = new JButton("PASEO");
		botonPaseo.setForeground(new Color(255, 255, 255));
		botonPaseo.setBackground(new Color(95, 158, 160));
		botonPaseo.setFont(new Font("Century Gothic", Font.BOLD, 15));
		botonPaseo.setBounds(685, 361, 121, 27);
		add(botonPaseo);

		JButton botonFutbol = new JButton("FUTBOL");
		botonFutbol.setBackground(new Color(95, 158, 160));
		botonFutbol.setForeground(new Color(255, 255, 255));
		botonFutbol.setFont(new Font("Century Gothic", Font.BOLD, 15));
		botonFutbol.setBounds(527, 440, 129, 28);
		botonFutbol.addActionListener(new AcionBoton());

		add(botonFutbol);

		JButton botonPadel = new JButton("PADEL");
		botonPadel.setForeground(new Color(255, 255, 255));
		botonPadel.setFont(new Font("Century Gothic", Font.BOLD, 15));
		botonPadel.setBackground(new Color(95, 158, 160));
		botonPadel.setBounds(527, 400, 129, 30);
		botonPadel.addActionListener(new AcionBoton());

		add(botonPadel);

		JButton botonCoach = new JButton("COACH");
		botonCoach.setForeground(new Color(255, 255, 255));
		botonCoach.setFont(new Font("Century Gothic", Font.BOLD, 15));
		botonCoach.setBackground(new Color(95, 158, 160));
		botonCoach.setBounds(527, 361, 129, 29);
		botonCoach.addActionListener(new AcionBoton());

		add(botonCoach);

		JButton botonFacial = new JButton("FACIAL");
		botonFacial.setForeground(new Color(255, 255, 255));
		botonFacial.setFont(new Font("Century Gothic", Font.BOLD, 15));
		botonFacial.setBackground(new Color(95, 158, 160));
		botonFacial.setBounds(378, 440, 121, 28);
		botonFacial.addActionListener(new AcionBoton());

		add(botonFacial);

		JButton botonEstilismo = new JButton("ESTILISMO");
		botonEstilismo.setBackground(new Color(95, 158, 160));
		botonEstilismo.setFont(new Font("Century Gothic", Font.BOLD, 15));
		botonEstilismo.setForeground(new Color(255, 255, 255));
		botonEstilismo.setBounds(378, 400, 121, 30);
		botonEstilismo.addActionListener(new AcionBoton());

		add(botonEstilismo);

		JButton botonManicura = new JButton("MANICURA");
		botonManicura.setForeground(new Color(255, 255, 255));
		botonManicura.setBackground(new Color(95, 158, 160));
		botonManicura.setFont(new Font("Century Gothic", Font.BOLD, 15));
		botonManicura.setBounds(378, 361, 121, 29);
		botonManicura.addActionListener(new AcionBoton());

		add(botonManicura);

		JButton botonLengua = new JButton("LENGUA");
		botonLengua.setBackground(new Color(95, 158, 160));
		botonLengua.setForeground(new Color(255, 255, 255));
		botonLengua.setFont(new Font("Century Gothic", Font.BOLD, 15));
		botonLengua.setBounds(216, 440, 121, 30);
		botonLengua.addActionListener(new AcionBoton());
		add(botonLengua);

		JButton botonMatematicas = new JButton("MATES");
		botonMatematicas.setBackground(new Color(95, 158, 160));
		botonMatematicas.setForeground(new Color(255, 255, 255));
		botonMatematicas.setFont(new Font("Century Gothic", Font.BOLD, 15));
		botonMatematicas.setBounds(216, 400, 121, 30);
		botonMatematicas.addActionListener(new AcionBoton());
		add(botonMatematicas);

		JButton botonMusica = new JButton("MUSICA");
		botonMusica.setHorizontalAlignment(SwingConstants.CENTER);
		botonMusica.setForeground(new Color(255, 255, 255));
		botonMusica.setBackground(new Color(95, 158, 160));
		botonMusica.setFont(new Font("Century Gothic", Font.BOLD, 15));
		botonMusica.setBounds(216, 361, 121, 29);
		botonMusica.addActionListener(new AcionBoton());
		add(botonMusica);

		JButton botonChef = new JButton("CHEF");
		botonChef.setBackground(new Color(95, 158, 160));
		botonChef.setForeground(new Color(255, 255, 255));
		botonChef.setFont(new Font("Century Gothic", Font.BOLD, 15));
		botonChef.setBounds(64, 440, 112, 30);
		botonChef.addActionListener(new AcionBoton());
		add(botonChef);

		JButton botonManitas = new JButton("MANITAS");
		botonManitas.setFont(new Font("Century Gothic", Font.BOLD, 15));
		botonManitas.setForeground(new Color(255, 255, 255));
		botonManitas.setBackground(new Color(95, 158, 160));
		botonManitas.setBounds(64, 400, 112, 30);
		botonManitas.addActionListener(new AcionBoton());
		add(botonManitas);

		JButton botonLimpieza = new JButton("LIMPIEZA");
		botonLimpieza.setBackground(new Color(95, 158, 160));
		botonLimpieza.setForeground(new Color(255, 255, 255));
		botonLimpieza.setFont(new Font("Century Gothic", Font.BOLD, 15));
		botonLimpieza.setBounds(64, 360, 112, 30);
		botonLimpieza.addActionListener(new AcionBoton());

		add(botonLimpieza);

		botonTASKER.setForeground(new Color(255, 255, 255));
		botonTASKER.setFont(new Font("Century Gothic", Font.BOLD, 20));
		botonTASKER.setBackground(new Color(32, 178, 170));
		botonTASKER.setBounds(493, 502, 177, 44);

		add(botonTASKER);

		JButton botonAtras = new JButton("Atr\u00E1s");
		botonAtras.setBackground(new Color(95, 158, 160));
		botonAtras.setForeground(new Color(255, 255, 255));
		botonAtras.setFont(new Font("Century Gothic", Font.BOLD, 15));
		botonAtras.setBounds(695, 513, 112, 27);
		botonAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irAPantalla("login");
			}
		});
		add(botonAtras);

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
		labelBelleza.setBounds(397, 266, 80, 84);
		add(labelBelleza);

		JLabel labelDeporte = new JLabel("");
		labelDeporte.setIcon(new ImageIcon(PantallaServicios.class.getResource("/imagenes/iconoDeporte.png")));
		labelDeporte.setBounds(554, 267, 80, 84);
		add(labelDeporte);

		JLabel labelMascota = new JLabel("");
		labelMascota.setIcon(new ImageIcon(PantallaServicios.class.getResource("/imagenes/iconoMascota.png")));
		labelMascota.setBounds(698, 266, 80, 84);
		add(labelMascota);

		JLabel labelTexto1 = new JLabel(
				"\u00BFNecesitas un chef o un manitas? \u00BFUn servicio de manicura a domicilio");
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
		labelAlta.setBounds(24, 501, 459, 47);
		add(labelAlta);

		JLabel labelAlta2 = new JLabel("Hazlo ya y comienza a trabajar...");
		labelAlta2.setForeground(Color.GRAY);
		labelAlta2.setFont(new Font("Century Gothic", Font.BOLD, 15));
		labelAlta2.setBounds(24, 539, 391, 26);
		add(labelAlta2);

		JLabel labelFondoServicio = new JLabel("");
		labelFondoServicio.setBackground(new Color(240, 240, 240));
		labelFondoServicio.setIcon(new ImageIcon(PantallaServicios.class.getResource("/imagenes/fondoServicios.jpg")));
		labelFondoServicio.setBounds(0, 0, 850, 650);
		add(labelFondoServicio);
	}

	class AcionBoton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			JButton boton = (JButton) arg0.getSource();
			ventana.irAPantalla("listadoservicios", boton.getText());

		}

	}
}
