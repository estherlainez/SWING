package graficos;
import javax.swing.*;

import java.awt.Graphics;
import java.awt.event.*;
public class EventosFoco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoFoco mimarco=new MarcoFoco();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoFoco extends JFrame{
	
	public MarcoFoco() {
		
		setVisible(true);
		
		setBounds(300,300,600,450);
		
		add(new LaminaFoco());
		
		
	}
	
}

class LaminaFoco extends JPanel{
	
	public void  paintComponent(Graphics g) {
		
		super.paintComponent(g);
		//para colocar los elementos donde quiera yo
		setLayout(null);
		
		cuadro1=new JTextField();
		
		cuadro2=new JTextField();
		
		cuadro1.setBounds(120,10,150,20);
		
		cuadro2.setBounds(120,50,150,20);
		
		add(cuadro1);
		
		add(cuadro2);
		
		LanzaFocos elFoco=new LanzaFocos();
		
		cuadro1.addFocusListener(elFoco);
		
	}
	
	private class LanzaFocos implements FocusListener{

		@Override
		public void focusGained(FocusEvent e) {
			
		}

		@Override
		public void focusLost(FocusEvent e) {
			
			System.out.println("He perdido el foco");
		}
		
	}
	
	JTextField cuadro1;
	
	JTextField cuadro2;
	
}


