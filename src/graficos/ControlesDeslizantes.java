package graficos;

import java.awt.*;


import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;



public class ControlesDeslizantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FrameSliders mimarco= new FrameSliders();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class FrameSliders extends JFrame{
	
	public FrameSliders() {
		
		setBounds(550,400,550,350);
		
		setVisible(true);
		
		LaminaSliders miLamina= new LaminaSliders();
		
		add(miLamina);
		
		
	}
}

class LaminaSliders extends JPanel{
	
	public LaminaSliders() {
		/*-----crear el slider y metodos-------
		//JSlider control=new JSlider(25);
		//para que aparezcan las marcas
		//las mayores van de 25 en 25
		//control.setMajorTickSpacing(25);
		//las menores van de 5 en 5
		//control.setMinorTickSpacing(5);
		
		//control.setPaintTicks(true);
		//para que nos imprima los numeros de las marcas
		//control.setPaintLabels(true);
		
		//control.setFont(new Font("Serif",Font.ITALIC,12));
		
		//control.setSnapToTicks(true);
		
		
		//add(control);	
		//setLayout(new BorderLayout());
	*/
	//----para dar funcionalidad a Slider
		setLayout(new BorderLayout());
		
		rotulo=new JLabel("Rondalla los Amigos de Tarazona");
		
		add(rotulo, BorderLayout.CENTER);
		
		control=new JSlider(8,50,14);
		
		control.setMajorTickSpacing(20);
		
		control.setMinorTickSpacing(5);
		
		control.setPaintTicks(true);
		
		control.setPaintLabels(true);
		
		control.setFont(new Font("Serif",Font.ITALIC,10));
		
		control.addChangeListener(new EventoSlider());
		
		JPanel laminaSliders=new JPanel();
		
		laminaSliders.add(control);
		
		add(laminaSliders,BorderLayout.NORTH);
		
	}
	
	private class EventoSlider implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent arg0) {
			// TODO Auto-generated method stub
			
			contador++;
			System.out.println("Estas manipulando el deslizante: "+control.getValue());
			
			rotulo.setFont(new Font("Serif", Font.PLAIN,control.getValue()));
		}
		
	}
	private JLabel rotulo;
	
	private JSlider control;
	
	private static int contador;
	
	
	
	
}