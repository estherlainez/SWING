package graficos;


import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProcesadorDeTextosConRadioBooton {

	public static void main(String[] args) {
		
		MenuProcesadorIV mimarco= new MenuProcesadorIV();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class MenuProcesadorIV extends JFrame{
	
	public MenuProcesadorIV() {
		
		setBounds(500,300,550,350);
		
		setVisible(true);
		
		LaminaProcesadorIV miLamina=new LaminaProcesadorIV();
		
		add(miLamina);
		
	}
	
	
}

class LaminaProcesadorIV extends JPanel{
	
	public LaminaProcesadorIV() {
		
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
		
		//configuraMenu("Negrita","estilo","",Font.BOLD,1,"src/graficos/imagen.jpg");
		
		//configuraMenu("Cursiva","estilo","",Font.ITALIC,1,"src/graficos/imagen.jpg");
		JCheckBoxMenuItem negrita=new JCheckBoxMenuItem("Negrita",new ImageIcon("src/graficos/imagen.jpg"));
		
		JCheckBoxMenuItem cursiva=new JCheckBoxMenuItem("Cursiva",new ImageIcon("src/graficos/imagen.jpg"));
		
		negrita.addActionListener(new StyledEditorKit.BoldAction());
		
		cursiva.addActionListener(new StyledEditorKit.ItalicAction());
		estilo.add(negrita);
		
		estilo.add(cursiva);
		//-----------------------------------
		
		//configuraMenu("12","tamano","",9,12,"");
		
		//configuraMenu("16","tamano","",9,16,"");
		
		//configuraMenu("20","tamano","",9,20,"");
		
		//configuraMenu("24","tamano","",9,24,"");
		
		ButtonGroup tamanoLetra=new ButtonGroup();
		
		JRadioButtonMenuItem doce= new JRadioButtonMenuItem("12");
		
		JRadioButtonMenuItem dieciseis= new JRadioButtonMenuItem("16");
		
		JRadioButtonMenuItem veinte= new JRadioButtonMenuItem("20");
		
		JRadioButtonMenuItem veinticuatro= new JRadioButtonMenuItem("24");
		
		tamanoLetra.add(doce);
		
		tamanoLetra.add(dieciseis);
		
		tamanoLetra.add(veinte);
		
		tamanoLetra.add(veinticuatro);
		
		doce.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño",12));
		
		dieciseis.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño",16));
		
		veinte.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño",20));
		
		veinticuatro.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño",24));
		
		tamano.add(doce);
		
		tamano.add(dieciseis);
		
		tamano.add(veinte);
		
		tamano.add(veinticuatro);
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
			
		}else if(menu=="tamano") {
			
			tamano.add(elem_menu);
			
			elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño",tam));
		}
		
		
	}
	
	
	
	JTextPane miarea;
	
	JMenu fuente,estilo,tamano;
	
	Font letras;
}
