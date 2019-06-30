package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PracticaGuiada_ProcesadorDeTextosII {

	public static void main(String[] args) {
		// En este ejemplo lo que hicimos en el anterior lo haremos con metodos
		//para ahorra codigo y nos lo haga para todos

		MenuProcesadorII mimarco= new MenuProcesadorII();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class MenuProcesadorII extends JFrame{
	
	public MenuProcesadorII() {
		
		setBounds(500,300,550,350);
		
		setVisible(true);
		
		LaminaProcesadorII miLamina=new LaminaProcesadorII();
		
		add(miLamina);
		
	}
	
	
}

class LaminaProcesadorII extends JPanel{
	
	public LaminaProcesadorII() {
		
		setLayout(new BorderLayout());
		
		JPanel laminamenu= new JPanel();
		
		JMenuBar mibarra= new JMenuBar();
		//---------------------------------
		fuente= new JMenu("fuente");
		
		estilo= new JMenu("estilo");
		
		tamano= new JMenu("tamaño");
		
		configuraMenu("Arial","fuente","Arial",9,10);
		
		configuraMenu("Courier","fuente","Courier",9,10);
		
		configuraMenu("Verdana","fuente","Verdana",9,10);
		//------------------------------------
		
		configuraMenu("Negrita","estilo","",Font.BOLD,1);
		
		configuraMenu("Cursiva","estilo","",Font.ITALIC,1);
		
		//-----------------------------------
		
		configuraMenu("12","tamano","",9,12);
		
		configuraMenu("16","tamano","",9,16);
		
		configuraMenu("20","tamano","",9,20);
		
		configuraMenu("24","tamano","",9,24);
		//-----------------------------------
		mibarra.add(fuente);
		
		mibarra.add(estilo);
		
		mibarra.add(tamano);
		
		laminamenu.add(mibarra);
		
		add(laminamenu,BorderLayout.NORTH);
		
		 miarea= new JTextPane();
		
		add(miarea,BorderLayout.CENTER);
		
	}
	
	public void configuraMenu(String rotulo, String menu, String tipoLetra,int estilos, int tam) {
		
		JMenuItem elem_menu= new JMenuItem(rotulo);
		
		if(menu=="fuente") {
			
			fuente.add(elem_menu);
			
		}else if(menu=="estilo") {
			
			estilo.add(elem_menu);
			
		}else if(menu=="tamano") {
			
			tamano.add(elem_menu);
		}
		
		elem_menu.addActionListener(new GestionaEventos(rotulo,tipoLetra,estilos,tam));
	}
	
	
	private class GestionaEventos implements ActionListener{

		String tipo_texto,menu;
		
		int estiloLetra,tamanoLetra;
		//constructor
		GestionaEventos(String elemento, String texto2,int estilo2, int tam_letra){
			
			tipo_texto=texto2;
			
			estiloLetra=estilo2;
			
			tamanoLetra=tam_letra;
			
			menu=elemento;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//almaceno en esta variable el tipo de letra del area
			letras=miarea.getFont();
			
			//System.out.println("");
			
			if(menu=="Arial"||menu=="Courier"|| menu=="Verdana") {
				
				estiloLetra=letras.getStyle();
				
				tamanoLetra=letras.getSize();
				
			}else if(menu=="Cursiva"||menu=="Negrita"){
				
				if(letras.getStyle()==1||letras.getStyle()==2) {
					
					estiloLetra=3;	
				}
				tipo_texto=letras.getFontName();
				
				tamanoLetra=letras.getSize();
				
			}else if(menu=="12"||menu=="16"||menu=="20"||menu=="24"){
				
				estiloLetra=letras.getStyle();
				
				tipo_texto=letras.getFontName();
				
			}
			miarea.setFont(new Font("tipo_texto",estiloLetra,tamanoLetra));
			
			System.out.println("Tipo= "+ tipo_texto+" Estilo: "+estiloLetra+" Tamaño: "+tamanoLetra);
		}
		
	}
	JTextPane miarea;
	
	JMenu fuente,estilo,tamano;
	
	Font letras;
}