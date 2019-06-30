package graficos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;


public class MarcoConBotonesII{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoBotonesII mimarco=new MarcoBotonesII();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoBotonesII extends JFrame{
	
	public MarcoBotonesII() {
		
		setTitle("Botones y Eventos");
		
		setBounds(700,300,500,300);
		
		LaminaBotonesII milamina=new LaminaBotonesII();
		
		add(milamina);
		
		
	}
}

class LaminaBotonesII extends JPanel {
	
	JButton botonAzul=new JButton("Azul");
	
	JButton botonAmarillo=new JButton("Amarillo");
	
	JButton botonRojo=new JButton("Rojo");
	
	public LaminaBotonesII() {
		
		add(botonAzul);
		
		add(botonAmarillo);
		
		add(botonRojo);
		
		ColorFondo Amarillo=new ColorFondo(Color.yellow);
		
		ColorFondo Azul=new ColorFondo(Color.blue);
		
		ColorFondo Rojo=new ColorFondo(Color.red);
		
		botonAzul.addActionListener(Azul);
		
		botonRojo.addActionListener(Rojo);
		
		botonAmarillo.addActionListener(Amarillo);
		
	}
	
	private class ColorFondo implements ActionListener{

		private Color colorDeFondo;
		
		public ColorFondo(Color c) {
			
			colorDeFondo=c;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
		
			setBackground(colorDeFondo);
			
		}
		
	}

}


