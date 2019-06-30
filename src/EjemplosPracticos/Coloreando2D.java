package EjemplosPracticos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Coloreando2D {

	public static void main(String[] args) {
		
		MarcoPintado m=new MarcoPintado();
	}

}

class MarcoPintado extends JFrame{
	
	public MarcoPintado () {
		
		setTitle("pintando");
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		setBounds (50,50,700,400);
		setVisible(true);
		LaminaDibujo2D milamina=new LaminaDibujo2D();
		add(milamina);
		
	}
	
}

class LaminaDibujo2D extends JPanel {
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		
//creamos el objeto graphics 2d
		Graphics2D g2=(Graphics2D) g;
		
		Rectangle2D frontal = new Rectangle2D.Double (100,100,200,150);
		
		Color c=new Color(23,45,78);
		
		
		g2.setColor(c);
		g2.draw(frontal);
		g2.fill(frontal);
		
		Rectangle2D puerta = new Rectangle2D.Double (190,190,35,60);
		
		
		g2.setColor(c.brighter().brighter());
		
		frontal.setFrame(puerta);
		g2.draw(puerta);
		g2.fill(puerta);
		
		
		
		
			
		
	
		
	
		
		
		
		
		
		
	}

	private Color Color(int i, int j, int k) {
		// TODO Apéndice de método generado automáticamente
		return null;
	}
}
