package graficos;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotonesRadioII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoRadioII mimarco= new MarcoRadioII();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoRadioII extends JFrame{
	
	public MarcoRadioII() {
		
		setBounds(550,300,550,350);
		
		setVisible(true);
		
		LaminaRadioII miLamina= new LaminaRadioII();
		
		add(miLamina);
		
		
	}
}

class LaminaRadioII extends JPanel{
	
	public LaminaRadioII() {
		
		setLayout(new BorderLayout());
		
		texto=new JLabel("Rondalla los Amigos de Tarazona");
		
		texto.setFont(new Font("Serif",Font.PLAIN,12));
		
		add(texto, BorderLayout.CENTER);
		
		laminaBotones=new JPanel();
		
		migrupo=new ButtonGroup();
		
		colocarBotones("Pequeño",false,10);
		
		colocarBotones("Mediano",true,14);
		
		colocarBotones("Grande",false,18);
		
		colocarBotones("Muy grande",false,26);
		
		add(laminaBotones,BorderLayout.SOUTH);
	}
	
	public void colocarBotones(String nombre, boolean selecionado, int tamano) {
		
		JRadioButton boton= new JRadioButton(nombre,selecionado);
		
		migrupo.add(boton);
		
		laminaBotones.add(boton);
		
		ActionListener mievento=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				texto.setFont(new Font("Serif", Font.PLAIN, tamano));
			}
			
		};
		
		boton.addActionListener(mievento);
	}
	private JLabel texto;
	
	private JRadioButton boton1,boton2,boton3,boton4;
	
	private ButtonGroup migrupo;
	
	private JPanel laminaBotones;
}	
