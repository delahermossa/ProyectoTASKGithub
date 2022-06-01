package interfacesgraficas;

import java.awt.Color;

import javax.swing.JPanel;

public class PantallaEstilismo extends JPanel{
	
private Ventana ventana;
	
	public PantallaEstilismo(Ventana v) {
		setBackground(new Color(176, 224, 230));
		
		this.ventana=v;
		setLayout(null);
		
	}

}
