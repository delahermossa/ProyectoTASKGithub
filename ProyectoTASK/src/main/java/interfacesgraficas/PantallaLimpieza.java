package interfacesgraficas;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PantallaLimpieza extends JPanel {
	
	private Ventana ventana;
	
	public PantallaLimpieza(Ventana v) {
		setBackground(new Color(176, 224, 230));
		
		this.ventana=v;/*declarar siempre en todas las ventanas*/
		setLayout(null);
		
	}
}
