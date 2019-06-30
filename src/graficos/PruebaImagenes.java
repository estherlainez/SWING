package graficos;

import java.awt.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;
public class PruebaImagenes{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConImagen mimarco=new MarcoConImagen();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoConImagen extends JFrame{
	
	public MarcoConImagen() {
		
		setTitle("Marco con Imagen");
		
		setSize(400,400);
		
		LaminaConImagen milamina=new LaminaConImagen();
		
		add(milamina);
		
		
	}
}

class LaminaConImagen extends JPanel{
	
	public LaminaConImagen() {
		try {
			//File miimagen=new File("src/graficos/guitarra.jpg");
			imagen=ImageIO.read(new File("src/graficos/bola.jpg"));
			
			}catch(IOException e) {
				
				System.out.println("la imagen no se encuentra");
			}
	}
	
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		
		//para saber la altura y anchura de la imagen que vamos a poner
		int anchuraImagen=imagen.getWidth(this);
		
		int alturaImagen=imagen.getHeight(this);
		
		g.drawImage(imagen, 0, 0, null);
		
		for(int i=0;i<300;i++) {
			for(int j=0;j<200;j++) {
				
				if(i+j>0) {
					
				g.copyArea(0, 0, anchuraImagen, alturaImagen, anchuraImagen*i, alturaImagen*j);
				
				}
			}
		}
		//me quedo en video 65
	
	}
	
	private Image imagen;

}