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

public class PantallaUsuario extends JPanel{
	
	private Ventana ventana;
	
	public PantallaUsuario(Ventana v) {
		this.ventana = v;
		setBorder(null);
		setBackground(new Color(230, 230, 250));
		setLayout(null);
				
				JLabel labelEmailDinamico_1 = new JLabel("<dynamic>");
				labelEmailDinamico_1.setFont(new Font("Century Gothic", Font.BOLD, 15));
				labelEmailDinamico_1.setBounds(25, 511, 216, 28);
				add(labelEmailDinamico_1);
				
				JLabel labelDireccion = new JLabel("Direccion");
				labelDireccion.setHorizontalAlignment(SwingConstants.LEFT);
				labelDireccion.setForeground(new Color(95, 158, 160));
				labelDireccion.setFont(new Font("Century Gothic", Font.BOLD, 20));
				labelDireccion.setBounds(25, 473, 101, 28);
				add(labelDireccion);
				
				JLabel labelEmailDinamico = new JLabel("" + Utils.currentUser.getEmail());
				labelEmailDinamico.setFont(new Font("Century Gothic", Font.BOLD, 15));
				labelEmailDinamico.setBounds(25, 435, 201, 28);
				add(labelEmailDinamico);
		
				JLabel labelUsuarioDinamic = new JLabel("" + Utils.currentUser.getNombreUsuario());
				labelUsuarioDinamic.setFont(new Font("Century Gothic", Font.BOLD, 15));
				labelUsuarioDinamic.setBounds(25, 360, 201, 28);
				add(labelUsuarioDinamic);
		
		JLabel labelEmail = new JLabel("Email");
		labelEmail.setForeground(new Color(95, 158, 160));
		labelEmail.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelEmail.setBounds(25, 398, 84, 27);
		labelEmail.setBackground(Color.WHITE);
		add(labelEmail);
		
		JLabel labelUsuario = new JLabel("Usuario");
		labelUsuario.setForeground(new Color(95, 158, 160));
		labelUsuario.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelUsuario.setBounds(25, 322, 166, 28);
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
		
		JLabel labelDireccion_1 = new JLabel("Direccion");
		labelDireccion_1.setHorizontalAlignment(SwingConstants.LEFT);
		labelDireccion_1.setForeground(new Color(95, 158, 160));
		labelDireccion_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		labelDireccion_1.setBounds(25, 549, 101, 28);
		add(labelDireccion_1);
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				ventana.irAPantalla("pantallausuario");
			}
		});

}
}
