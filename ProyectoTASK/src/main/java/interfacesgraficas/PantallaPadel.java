package interfacesgraficas;

import java.awt.Color;

import javax.swing.JPanel;

public class PantallaPadel extends JPanel{
	
private Ventana ventana;
	
	public PantallaPadel(Ventana v) {
		setBackground(new Color(176, 224, 230));
		
		this.ventana=v;
		setLayout(null);
		
	}

}
