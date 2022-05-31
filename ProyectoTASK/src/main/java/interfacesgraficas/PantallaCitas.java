package interfacesgraficas;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class PantallaCitas extends JPanel{
	
	private Ventana ventana;
	
	public PantallaCitas(Ventana v) {
		setBorder(null);
		setBackground(new Color(230, 230, 250));
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				ventana.irAPantalla("registro");
			}
		});

}
}
