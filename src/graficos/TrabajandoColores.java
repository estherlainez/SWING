package graficos;

import java.awt.*;
import java.awt.geom.*;

import javax.swing.*;

public class TrabajandoColores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConColor mimarco=new MarcoConColor();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoConColor extends JFrame{
	
	public MarcoConColor() {
		
		setTitle("prueba de Dibujo");
		
		setSize(400,400);
		
		LaminaConColor milamina=new LaminaConColor();
		
		add(milamina);
		
		milamina.setBackground(SystemColor.window);
	}
}

class LaminaConColor extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		//g.drawRect(50, 50, 200, 200);	
		//g.drawLine(100,100,300,200);		
		//g.drawArc(50, 100, 100, 100, 120, 150);
		
		//grafics 2D
		//importante esta refundicion para la clase 2D
		Graphics2D g2=(Graphics2D) g;
		
		Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150);
		g2.setPaint(Color.blue);
		g2.draw(rectangulo);
		g2.setPaint(Color.red);
		
		g2.fill(rectangulo);
		
		//dibujo Elipse
		
		Ellipse2D elipse= new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo);
		
		Color micolor=new Color(125,189,220);
		g2.setPaint(micolor);
		//brigther para ponerle mas claro
		//g2.setPaint(new Color(109,172,59).brighter());
		//g2.setPaint(new Color(109,172,59));
		
		g2.fill(elipse);
		
		
		
	}

}
