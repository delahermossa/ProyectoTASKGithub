package interfacesgraficas;

import java.awt.Color;

import javax.swing.JPanel;

public class PantallaContratarServicio extends JPanel {
	
private Ventana ventana;
	
	public PantallaContratarServicio(Ventana v) {
		setBackground(new Color(176, 224, 230));
		
		this.ventana=v;
		setLayout(null);
		
	}

}
