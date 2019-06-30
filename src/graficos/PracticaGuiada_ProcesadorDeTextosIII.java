package graficos;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PracticaGuiada_ProcesadorDeTextosIII {

	public static void main(String[] args) {
		// En este ejemplo lo que hicimos en el anterior lo haremos con metodos
		//para ahorra codigo y nos lo haga para todos

		MenuProcesadorIII mimarco= new MenuProcesadorIII();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class MenuProcesadorIII extends JFrame{
	
	public MenuProcesadorIII() {
		
		setBounds(500,300,550,350);
		
		setVisible(true);
		
		LaminaProcesadorIII miLamina=new LaminaProcesadorIII();
		
		add(miLamina);
		
	}
	
	
}

class LaminaProcesadorIII extends JPanel{
	
	public LaminaProcesadorIII() {
		
		setLayout(new BorderLayout());
		
		JPanel laminamenu= new JPanel();
		
		JMenuBar mibarra= new JMenuBar();
		//---------------------------------
		fuente= new JMenu("fuente");
		
		estilo= new JMenu("estilo");
		
		tamano= new JMenu("tamaño");
		
		configuraMenu("Arial","fuente","Arial",9,10,"");
		
		configuraMenu("Courier","fuente","Courier",9,10,"");
		
		configuraMenu("Verdana","fuente","Verdana",9,10,"");
		//------------------------------------
		
		configuraMenu("Negrita","estilo","",Font.BOLD,1,"src/graficos/imagen.jpg");
		
		configuraMenu("Cursiva","estilo","",Font.ITALIC,1,"src/graficos/imagen.jpg");
		
		//-----------------------------------
		
		configuraMenu("12","tamano","",9,12,"");
		
		configuraMenu("16","tamano","",9,16,"");
		
		configuraMenu("20","tamano","",9,20,"");
		
		configuraMenu("24","tamano","",9,24,"");
		//-----------------------------------
		mibarra.add(fuente);
		
		mibarra.add(estilo);
		
		mibarra.add(tamano);
		
		laminamenu.add(mibarra);
		
		add(laminamenu,BorderLayout.NORTH);
		
		 miarea= new JTextPane();
		
		add(miarea,BorderLayout.CENTER);
		
	}
	//continuara en el video 108
	public void configuraMenu(String rotulo, String menu, String tipoLetra,int estilos, int tam, String ruta_icono) {
		
		JMenuItem elem_menu= new JMenuItem(rotulo,new ImageIcon(ruta_icono));
		
		if(menu=="fuente") {
			
			fuente.add(elem_menu);
			
			if(tipoLetra=="Arial") {
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambiaLetra","Arial"));
				
			}else if(tipoLetra=="Courier") {
				
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambiaLetra","Courier"));
			}else if(tipoLetra=="Verdana") {
				
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambiaLetra","Verdana"));
			}
			
		}else if(menu=="estilo") {
			
			estilo.add(elem_menu);
			
			if(estilos==Font.BOLD) {
				
				elem_menu.addActionListener(new StyledEditorKit.BoldAction());
			}else if(estilos==Font.ITALIC) {
				
				elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
			}
			
			
		}else if(menu=="tamano") {
			
			tamano.add(elem_menu);
			
			elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño",tam));
		}
		
		
	}
	
	
	
	JTextPane miarea;
	
	JMenu fuente,estilo,tamano;
	
	Font letras;
}