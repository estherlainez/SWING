package graficos;
import javax.swing.*;
public class CreandoMarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		miMarco marco1=new miMarco();
		
		marco1.setVisible(true);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}


class miMarco extends JFrame{
	
	public miMarco() {
		
		//setSize(500,300);
		
		//setLocation(500,300);
		
		//los dos metodos en uno es setBounds
		setBounds(500,300,550,350);
		
		//setResizable(false);
		
		//setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		setTitle("Mi Ventana");
		
	}
	
	
}