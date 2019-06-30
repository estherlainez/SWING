package EjemplosPracticos;

import java.awt.*;

import javax.swing.*;

public class EjercicioBorderLayout {

	

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		MarcobLayout m= new MarcobLayout ();
		m.setVisible(true);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//puede usar el setLayout pq setLayout pertenece a container y JPanel hereda de container por lo que tiene heredado ese metodo
		
	}

}

class MarcobLayout extends JFrame{
	JButton b1, b2, b3;
	
	public MarcobLayout () {
		setTitle ("prueba");
		setBounds (600,350,600,300);
		
		setLayout (new BorderLayout());
	b1=new JButton ();
	b2=new JButton ();
	b3=new JButton ();
	add(b1,BorderLayout.NORTH);
	add(b2,BorderLayout.SOUTH);
	add(b3,BorderLayout.EAST);
	
	}
}