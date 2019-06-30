package graficos;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PruebaMenusConImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MenusFrameImagenes marco1=new MenusFrameImagenes();
		
		marco1.setVisible(true);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}


class MenusFrameImagenes extends JFrame{
	
	public MenusFrameImagenes() {
		
		setBounds(500,300,550,350);
		
		setVisible(true);
		
		MenuLaminaImagenes miLamina=new MenuLaminaImagenes();
		
		add(miLamina);
		
	}
	
	
}

class MenuLaminaImagenes extends JPanel{
	
	public MenuLaminaImagenes() {
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
		
		JMenuItem cortar= new JMenuItem("Cortar",new ImageIcon("src/graficos/cortar.gif"));
		
		JMenuItem pegar= new JMenuItem("Pegar",new ImageIcon("src/graficos/pegar.gif"));
		
		JMenuItem copiar= new JMenuItem("Copiar",new ImageIcon("src/graficos/copiar.gif"));
		
		//para ponerlo en vez de a la izquierda a la derecha
		//copiar.setHorizontalTextPosition(SwingConstants.LEFT);
		
		JMenuItem seleccionar= new JMenuItem("Seleccionar");
		
		JMenuItem generales= new JMenuItem("Generales");
		//--------------NUEVO-----------------
		final JMenuItem opcion1= new JMenuItem("Opcion1");
		//-----------------------------------------
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