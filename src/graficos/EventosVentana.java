package graficos;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.*;

public class EventosVentana{

	public static void main(String[] args) {
		// Trabajando con dos ventanas activas
		
		MarcoVentana mimarco=new MarcoVentana();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MarcoVentana mimarco2=new MarcoVentana();
		
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		mimarco.setTitle("Ventana 1");
		
		mimarco2.setTitle("Ventana 2");
		
		mimarco.setBounds(300, 300,500, 350);
		
		mimarco2.setBounds(900, 300,500, 350);
	}

}


class MarcoVentana extends JFrame{
	
	public MarcoVentana() {
		
		//setTitle("Respondiendo");
		
		//setBounds(700,300,500,300);
		
		setVisible(true);
		
		M_Ventana oyente_ventana=new M_Ventana();
		
		addWindowListener(oyente_ventana);
		
		
	}
}

class M_Ventana implements WindowListener{

	@Override
	public void windowActivated(WindowEvent e) {

		System.out.println("Ventana activada");	
	}

	@Override
	public void windowClosed(WindowEvent e) {
		
		System.out.println("La Ventana ha sido cerrada");		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		
		System.out.println("Cerrrando Ventana");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		
		System.out.println("Ventana desactivada");	
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		
		System.out.println("Ventana restaurada");	
	}

	@Override
	public void windowIconified(WindowEvent e) {
		
		System.out.println("Ventana minimizada");
	}

	@Override
	public void windowOpened(WindowEvent e) {
		
		System.out.println("Ventana abierta");	
	}
	
}


