package interfacesgraficas;

import java.awt.Color;

import javax.swing.JPanel;

public class PantallaMates extends JPanel{
	
private Ventana ventana;
	
	public PantallaMates(Ventana v) {
		setBackground(new Color(176, 224, 230));
		
		this.ventana=v;
		setLayout(null);
		
	}

}
