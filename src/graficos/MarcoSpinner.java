package graficos;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MarcoSpinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FrameSpinner mimarco=new FrameSpinner();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class FrameSpinner extends JFrame{
	
	public FrameSpinner() {
		setBounds(550,350,550,350);
		
		setVisible(true);
		
		add(new LaminaSpinner());
	}

}



class LaminaSpinner extends JPanel{
	
	public LaminaSpinner() {
		/*
		String lista[]= {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		//para recorrer con un spinner todas las letras 
		//que tenemos en nuestro equipo
		String lista1[]=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		//para crear un Spinner de fecha
		//JSpinner control=new JSpinner(new SpinnerDateModel());
		//para recorrer la lista de meses
		//JSpinner control=new JSpinner(new SpinnerListModel(lista));
		//para configurar valores numericos
		JSpinner control=new JSpinner(new SpinnerNumberModel(5,0,10,1));
		*/
		
		//lo hago el cambio del comportamiento con una clase anonima
		//basada en la clase que habiamos creado antes para verlo
		
		JSpinner control=new JSpinner(new SpinnerNumberModel() {
			
			public Object getNextValue() {
				
				return super.getPreviousValue();
			}
			
			public Object getPreviousValue() {
				
				return super.getNextValue();
			}
			
			
		});
		
		Dimension d=new Dimension(200,20);
		
		control.setPreferredSize(d);
		add(control);
		
	}
	
	/*
	private class MiModeloSpinner extends SpinnerNumberModel{
		
		public MiModeloSpinner() {
			
			super(5,0,10,1);
		}
		//sobreescribimos los metodos heredados de la clase padre
		//lo que le decimos es que se comporten al reves
		public Object getNextValue() {
			
			return super.getPreviousValue();
		}
		
		public Object getPreviousValue() {
			
			return super.getNextValue();
		}
	}
	
	*/
}
	



