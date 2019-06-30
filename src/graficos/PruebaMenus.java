package graficos;
import javax.swing.*;

public class PruebaMenus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MenusFrame marco1=new MenusFrame();
		
		marco1.setVisible(true);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}


class MenusFrame extends JFrame{
	
	public MenusFrame() {
		
		setBounds(500,300,550,350);
		
		setVisible(true);
		
		MenuLamina miLamina=new MenuLamina();
		
		add(miLamina);
		
	}
	
	
}

class MenuLamina extends JPanel{
	
	public MenuLamina() {
		//con esta clase creo la barra de menu
		JMenuBar mibarra= new JMenuBar();
		//creo los elementos del enu
		JMenu archivo= new JMenu("Archivo");

		JMenu edicion= new JMenu("Edicion");
		
		JMenu herramientas= new JMenu("Herramientas");
		
		JMenuItem guardar= new JMenuItem("Guardar");
		
		JMenu opciones= new JMenu("opciones");
		
		JMenuItem guardarComo= new JMenuItem("Guardar Como");
		//añado los elementos a la barra
		mibarra.add(archivo);
		
		mibarra.add(edicion);
		
		mibarra.add(herramientas);
		
		JMenuItem cortar= new JMenuItem("Cortar");
		
		JMenuItem pegar= new JMenuItem("Pegar");
		
		JMenuItem copiar= new JMenuItem("Copiar");
		
		JMenuItem seleccionar= new JMenuItem("Seleccionar");
		
		JMenuItem generales= new JMenuItem("Generales");
		
		JMenuItem opcion1= new JMenuItem("Opcion1");
		
		JMenuItem opcion2= new JMenuItem("Opcion2");
		
		opciones.add(opcion1);
		
		opciones.add(opcion2);
		
		archivo.add(guardar);
		
		archivo.add(guardarComo);
		
		edicion.add(cortar);
		
		edicion.add(pegar);
		
		edicion.add(copiar);
		//añado un separador para poner por grupos
		edicion.addSeparator();
		//esto va a ser un submenu de opciones
		edicion.add(opciones);
		
		herramientas.add(generales);
		
		herramientas.add(seleccionar);
		
		//añado la barra a la lamina
		add(mibarra);
		
		
		
		
		
	}
}