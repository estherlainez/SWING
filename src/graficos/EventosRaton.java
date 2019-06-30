package graficos;
import javax.swing.*;
import java.awt.event.*;
public class EventosRaton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConRaton mimarco=new MarcoConRaton();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConRaton extends JFrame{
	
	public MarcoConRaton() {
		
		setVisible(true);
		
		setBounds(700,300,600,450);
		
		EventosDeRaton EventoRaton= new EventosDeRaton();
		
		addMouseListener(EventoRaton);
		
		
	}
	
}


class EventosDeRaton implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Has hecho click");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Acabas de entrar");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Acabas de salir");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Acabas de presionar");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Acabas de levantar");
		
	}
	
}
