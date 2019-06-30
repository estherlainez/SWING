package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PracticaGuiada_ProcesadorDeTextos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MenuProcesador mimarco= new MenuProcesador();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class MenuProcesador extends JFrame{
	
	public MenuProcesador() {
		
		setBounds(500,300,550,350);
		
		setVisible(true);
		
		LaminaProcesador miLamina=new LaminaProcesador();
		
		add(miLamina);
		
	}
	
	
}

class LaminaProcesador extends JPanel{
	
	public LaminaProcesador() {
		
		setLayout(new BorderLayout());
		
		JPanel laminamenu= new JPanel();
		
		JMenuBar mibarra= new JMenuBar();
		//---------------------------------
		JMenu fuente= new JMenu("Fuente");
		
		JMenu estilo= new JMenu("Estilo");
		
		JMenu tamano= new JMenu("Tama�o");
		//---------------------------------
		JMenuItem arial=new JMenuItem("Arial");
		
		arial.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				miarea.setFont(new Font("Arial",Font.PLAIN,12));
				
			}
		});
		JMenuItem courier=new JMenuItem("Courier");
		
		//GestionaMenus tipoLetra=new GestionaMenus();
		
		//courier.addActionListener(tipoLetra);
		//las dos lineas en una
		//courier.addActionListener(new GestionaMenus());
		
		//utilizando una clase anonima, corto la clase que he hecho abajo
		//y la utilizo en esta clase anonima
		courier.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				miarea.setFont(new Font("Courier",Font.PLAIN,12));
				
			}
		});
		
		
		JMenuItem verdana=new JMenuItem("Verdana");
		verdana.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				miarea.setFont(new Font("Verdana",Font.PLAIN,12));
				
			}
		});
		
		fuente.add(arial);
		
		fuente.add(courier);
		
		fuente.add(verdana);
		
		//-------------------------------------
		JMenuItem negrita=new JMenuItem("Negrita");
		
		JMenuItem cursiva=new JMenuItem("Cursiva");
		
		
		
		
		estilo.add(negrita);
		
		estilo.add(cursiva);
		
		//------------------------
		
		JMenuItem tama�o12=new JMenuItem("12");
		
		JMenuItem tama�o16=new JMenuItem("16");
		
		JMenuItem tama�o22=new JMenuItem("22");
		
		JMenuItem tama�o28=new JMenuItem("28");
		
		
		
		tamano.add(tama�o12);
		
		tamano.add(tama�o16);
		
		tamano.add(tama�o22);
		
		tamano.add(tama�o28);
		
		fuente.add(verdana);
		mibarra.add(fuente);
		
		mibarra.add(estilo);
		
		mibarra.add(tamano);
		
		laminamenu.add(mibarra);
		
		add(laminamenu,BorderLayout.NORTH);
		
		 miarea= new JTextPane();
		
		add(miarea,BorderLayout.CENTER);
		
	}
	
	
	JTextPane miarea;
}