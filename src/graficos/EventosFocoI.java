package graficos;
import javax.swing.*;

import java.awt.Graphics;
import java.awt.event.*;
public class EventosFocoI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoFocoI mimarco=new MarcoFocoI();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoFocoI extends JFrame{
	
	public MarcoFocoI() {
		
		setVisible(true);
		
		setBounds(300,300,600,450);
		
		add(new LaminaFocoI());
		
		
	}
	
}

class LaminaFocoI extends JPanel{
	
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
		
		LanzaFocosI elFoco=new LanzaFocosI();
		
		cuadro1.addFocusListener(elFoco);
		
	}
	
	private class LanzaFocosI implements FocusListener{

		@Override
		public void focusGained(FocusEvent e) {
			
		}

		@Override
		public void focusLost(FocusEvent e) {
			
			String email=cuadro1.getText();
			
			boolean comprobacion=false;
			
			for(int i=0;i<email.length();i++) {
				
				if(email.charAt(i)=='@') {
					
					comprobacion=true;
				}
				
			}
			
			if(comprobacion) {
				
				System.out.println("Correcto");
			}else {
				
				System.out.println("Incorrecto");
			}
		}
		
	}
	
	JTextField cuadro1;
	
	JTextField cuadro2;
	
}


