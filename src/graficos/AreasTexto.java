package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class AreasTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoArea mimarco=new MarcoArea();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}


class MarcoArea extends JFrame{
	
	public MarcoArea() {
		
		setBounds(500,300,500,350);
		
		LaminaArea miLamina= new LaminaArea();
		
		add(miLamina);
		
		setVisible(true);
		
	}
		
}

class LaminaArea extends JPanel{
	
	public LaminaArea() {
		
		miarea=new JTextArea(8,20);
		
		JScrollPane laminabarras= new JScrollPane(miarea);
		
		//este metodo me salta a la siguiente linea cuando llega al final
		//del area
		//miarea.setLineWrap(true);
		add(laminabarras);
		
		JButton miboton= new JButton("Dale");
		
		miboton.addActionListener(new GestionArea());
		
		add(miboton);
		
	}
	private class GestionArea implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			System.out.println(miarea.getText());
			
		}
	
	}
	
	private JTextArea miarea;
}