package graficos;

import java.awt.*;

import javax.swing.*;

public class Layouts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_Layout marco= new Marco_Layout();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco.setVisible(true);

	}

}


class Marco_Layout extends JFrame{
	
	public Marco_Layout() {
		
	setTitle("Prueba de accciones");
	
	setBounds(600,150,600,300);
	
	Panel_Layout lamina= new Panel_Layout();
	
	//creamos un objeto de la clase flowLayout
	//FlowLayout disposicion=new FlowLayout(FlowLayout.LEFT);
	
	//lamina.setLayout(disposicion);
	//ALINEAMOS A LA IZDA
	//lamina.setLayout(new FlowLayout(FlowLayout.LEFT));
	
	
	Panel_LayoutII lamina2= new Panel_LayoutII();
	
	add(lamina,BorderLayout.NORTH);
	
	add(lamina2, BorderLayout.SOUTH);
	
	}
}

class Panel_Layout extends JPanel{
	
	public Panel_Layout() {
		
		//PARA CAMBIAR LA DISTANCIA ENTRE BOTONES Y LA SEPARACION DE ARRIBA
		//CAMBIAMOS LOS ELEMENTOS EN EL CONSTRUCTOR
		//podemos dejar distancia entre los componentes
		//con estos 10,10 indicamos la distancia en pixels entre los botones
		
		setLayout(new FlowLayout( FlowLayout.LEFT));
		
		//utilizamos la clase borderLayout
		add(new JButton("Amarillo"));
		
		add(new JButton("Rojo"));
		
		
	}
}

class Panel_LayoutII extends JPanel{
	
	public Panel_LayoutII() {
		
		setLayout(new BorderLayout());
		
		add(new JButton("Azul"),BorderLayout.WEST);
		
		add(new JButton("Verde"),BorderLayout.EAST);
		
		add(new JButton("Negro"),BorderLayout.CENTER);
		
	}
	
}