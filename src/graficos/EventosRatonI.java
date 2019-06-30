package graficos;
import javax.swing.*;
import java.awt.event.*;
public class EventosRatonI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConRatonI mimarco=new MarcoConRatonI();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConRatonI extends JFrame{
	
	public MarcoConRatonI() {
		
		setVisible(true);
		
		setBounds(700,300,600,450);
		
		EventosDeRatonI EventoRaton= new EventosDeRatonI();
		
		addMouseListener(EventoRaton);
		
		
	}
	
}


class EventosDeRatonI extends MouseAdapter{

	public void mouseClicked(MouseEvent e) {
		System.out.println("Has hecho click");
	}
	
}
