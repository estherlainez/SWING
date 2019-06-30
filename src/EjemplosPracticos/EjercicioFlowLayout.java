package EjemplosPracticos;

import java.awt.*;

import javax.swing.*;

public class EjercicioFlowLayout {

	

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		MarcofLayout m= new MarcofLayout ();
		m.setVisible(true);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//puede usar el setLayout pq setLayout pertenece a container y JPanel hereda de container por lo que tiene heredado ese metodo
		
	}

}

class MarcofLayout extends JFrame{
	JButton b1, b2, b3;
	
	public MarcofLayout () {
		setTitle ("prueba");
		setBounds (600,350,600,300);
		FlowLayout disposicion =new FlowLayout (FlowLayout.LEFT);
		//puede usar el setLayout pq setLayout pertenece a container y JPanel hereda de container por lo que tiene heredado ese metodo
		setLayout(disposicion);
	b1=new JButton ();
	b2=new JButton ();
	b3=new JButton ();
	add(b1);
	add(b2);
	add(b3);
	
	}
}