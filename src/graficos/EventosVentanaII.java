package graficos;


import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.*;

public class EventosVentanaII{

	public static void main(String[] args) {
		// utilizando las clases adaptadoras
		
		MarcoVentanaII mimarco=new MarcoVentanaII();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MarcoVentana mimarco2=new MarcoVentana();
		
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		mimarco.setTitle("Ventana 1");
		
		mimarco2.setTitle("Ventana 2");
		
		mimarco.setBounds(300, 300,500, 350);
		
		mimarco2.setBounds(900, 300,500, 350);
	}

}


class MarcoVentanaII extends JFrame{
	
	public MarcoVentanaII() {
		
		setVisible(true);
		
		addWindowListener(new M_VentanaII());
		
		
	}
}

class M_VentanaII extends WindowAdapter{



	@Override
	public void windowIconified(WindowEvent e) {
		
		System.out.println("Ventana minimizada");
	}

	
}


