package EjemplosPracticos;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calcula_Dni {

	public static void main(String[] args) {
		
		Doc_Nacional dn = new Doc_Nacional();
		dn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//metemos esto aqui para que no de problemas de visibilidad
		dn.setVisible (true);

	}

}

class Doc_Nacional extends JFrame implements ActionListener{
	//atributos
	JLabel etiqueta;
	JTextField texto;
	JButton boton;
	
	//constructor
	public Doc_Nacional () {
		setTitle("Calcula letra DNI");
		setBounds (600,300,600,300);
		setLayout (new BorderLayout ());
		
		JPanel PCentro = new JPanel();
		PCentro = PanelCentro();
		add(PCentro,BorderLayout.CENTER);
		
		boton.addActionListener(this);
		
	}
	
	private JPanel PanelCentro () {
		
		JPanel p= new JPanel();
		etiqueta = new JLabel();
		etiqueta.setText("Introduce tu numero de DNI sin letra");
		p.add(etiqueta);
		
		texto = new JTextField ();
		texto.setText("");
		texto.setPreferredSize(new Dimension(200,24));
		p.add(texto);
		
		boton = new JButton();
		boton.setText("Validar");
		boton.setPreferredSize(new Dimension(200,24));
		p.add(boton);
		
		return p;
	}

	
	public void actionPerformed(ActionEvent arg0) {//aqui metemos la accion que debe meter el boton
		String DNI=texto.getText();
		int letra;
		int b=Integer.parseInt(DNI);
		letra=b % 23;
		
		if (letra==0) {
			texto.setText(DNI+"T");
			}
		if (letra==1) {
			texto.setText(DNI+"R");
			}
		if (letra==2) {
			texto.setText(DNI+"W");
			}
		if (letra==3) {
			texto.setText(DNI+"A");
			}
		if (letra==4) {
			texto.setText(DNI+"G");
			}
		if (letra==5) {
			texto.setText(DNI+"M");
			}
		if (letra==6) {
			texto.setText(DNI+"Y");
			}
		if (letra==7) {
			texto.setText(DNI+"F");
			}
		if (letra==8) {
			texto.setText(DNI+"P");
			}
		if (letra==9) {
			texto.setText(DNI+"D");
			}
		if (letra==10) {
			texto.setText(DNI+"X");
			}
		if (letra==11) {
			texto.setText(DNI+"B");
			}
		if (letra==12) {
			texto.setText(DNI+"N");
			}
		if (letra==13) {
			texto.setText(DNI+"J");
			}
		if (letra==14) {
			texto.setText(DNI+"Z");
			}
		if (letra==15) {
			texto.setText(DNI+"S");
			}
		if (letra==16) {
			texto.setText(DNI+"Q");
			}
		if (letra==17) {
			texto.setText(DNI+"V");
			}
		if (letra==18) {
			texto.setText(DNI+"H");
			}
		if (letra==19) {
			texto.setText(DNI+"L");
			}
		if (letra==20) {
			texto.setText(DNI+"C");
			}
		if (letra==21) {
			texto.setText(DNI+"K");
			}
		if (letra==22) {
			texto.setText(DNI+"E");
			}
		
	}
	
	
}

