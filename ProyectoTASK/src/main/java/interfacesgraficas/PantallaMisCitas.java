package interfacesgraficas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class PantallaMisCitas extends JPanel {
	
	private Ventana ventana;

	public PantallaMisCitas(Ventana ventana) {
		super();
		this.ventana = ventana;
		setLayout(null);
		
		JLabel labelFondo = new JLabel("");
		labelFondo.setIcon(new ImageIcon(PantallaMisCitas.class.getResource("/imagenes/fondoServicios.jpg")));
		labelFondo.setBounds(0, 0, 851, 650);
		add(labelFondo);
	}
}
