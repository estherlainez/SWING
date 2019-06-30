package graficos;

import javax.swing.*;
import java.awt.Graphics;
import java.awt.event.*;
public class Varios_Oyentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_Principal mimarco=new Marco_Principal();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class Marco_Principal extends JFrame{
	
	public Marco_Principal() {
		
		setTitle("Prueba Varios");
		
		setBounds(1300,100,300,200);
		
		LaminaPrincipal lamina=new LaminaPrincipal();
		
		add(lamina);
		
		
	}
	
}

class LaminaPrincipal extends JPanel{
	//lo creo fuera porque lo voy a tener que utilizar fuera del constructor
	//en otros metodos, inicio dentro del constructor
	JButton boton_cerrar;
	public LaminaPrincipal() {
		
		JButton boton_nuevo=new JButton("Nuevo");
		
		add(boton_nuevo);
		
		boton_cerrar=new JButton("Cerrar todo");
		
		add(boton_cerrar);
		
		OyenteNuevo mioyente= new OyenteNuevo();
		
		boton_nuevo.addActionListener(mioyente);
		
	}
	
	
	private class OyenteNuevo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			Marco_Emergente marco= new Marco_Emergente(boton_cerrar);
			
			marco.setVisible(true);

		}
		
	}

}

class Marco_Emergente extends JFrame{
	
	private static int contador=0;
	//tengo que pasar un parametro al constructor que sera el boton de cerrar
	public Marco_Emergente(JButton boton_de_principal) {
		
		contador++;
		
		setTitle("Ventana "+contador);
		
		setBounds(40*contador,40*contador,300,150);
		
		CierraTodos oyenteCerrar= new CierraTodos();
		
		boton_de_principal.addActionListener(oyenteCerrar);
	}
	
	private class CierraTodos implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			dispose();
			
		}
		
	}
}


