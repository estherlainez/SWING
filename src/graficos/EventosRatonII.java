package graficos;
import javax.swing.*;
import java.awt.event.*;
public class EventosRatonII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConRatonII mimarco=new MarcoConRatonII();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConRatonII extends JFrame{
	
	public MarcoConRatonII() {
		
		setVisible(true);
		
		setBounds(700,300,600,450);
		
		EventosDeRatonII EventoRaton= new EventosDeRatonII();
		
		//addMouseListener(EventoRaton);
		addMouseMotionListener(EventoRaton);
		
		
	}
	
}

/*class EventosDeRatonII extends MouseAdapter{
	
	public void mouseClicked(MouseEvent e) {
		//para saber donde se pincha exactamente
		//System.out.println("Coordenada X: "+e.getX()+" Coordenada Y: "+e.getY());
		//para saber los click del usuario
		System.out.println(e.getClickCount());
	}
	
	public void mousePressed(MouseEvent e) {
		
		//para saber lo que pulsa el usuario
		
		if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK) {
			
			System.out.println("Has pulsado el boton izquierdo");
			
		}else if(e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK) {
			
			System.out.println("Has pulsado la rueda del raton");
		}else if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK) {
			
			System.out.println("Has pulsado el boton derecho");
		}
	}
	
}*/

class EventosDeRatonII implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent arg0) {
		System.out.println("Estas arrastrando");
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		System.out.println("Estas moviendo el raton");
		
	}
	
}
