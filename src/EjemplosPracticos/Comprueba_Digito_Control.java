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

public class Comprueba_Digito_Control {

	public static void main(String[] args) {
		Cuenta_Banco cb = new Cuenta_Banco();
		cb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//metemos esto aqui para que no de problemas de visibilidad
		cb.setVisible (true);

	}

}

class Cuenta_Banco extends JFrame implements ActionListener{
	
	//atributos
	JLabel etiqueta;
	JTextField tEntidad,tSucursal,tDigito,tCuenta;
	JButton boton;
	
	
	//constructor
	public Cuenta_Banco() {
		setTitle("Comprueba digito control de tu banco");
		setBounds (600,300,600,300);
		setLayout (new BorderLayout ());
		
		JPanel PCentro = new JPanel();
		PCentro = PanelCentro();
		add(PCentro,BorderLayout.CENTER);
		
		JPanel PSur = new JPanel ();
		PSur= PanelSur();
		add (PSur, BorderLayout.SOUTH);
		
		boton.addActionListener(this);
	}
	
	//metodos para borderlayout
	
	private JPanel PanelCentro() {
		JPanel p= new JPanel();
		
		tEntidad = new JTextField ();
		tEntidad.setText("");
		tEntidad.setPreferredSize(new Dimension(40,24));
		p.add(tEntidad);
		
		tSucursal = new JTextField ();
		tSucursal.setText("");
		tSucursal.setPreferredSize(new Dimension(40,24));
		p.add(tSucursal);
		
		tDigito = new JTextField ();
		tDigito.setText("");
		tDigito.setPreferredSize(new Dimension(20,24));
		p.add(tDigito);
		
		tCuenta = new JTextField ();
		tCuenta.setText("");
		tCuenta.setPreferredSize(new Dimension(100,24));
		p.add(tCuenta);
		
		boton = new JButton();
		boton.setText("Comprueba Digito Control");
		boton.setPreferredSize(new Dimension(200,24));
		p.add(boton);
		
		
		
		return p;
	}
	
	private JPanel PanelSur() {
		JPanel p= new JPanel();
		etiqueta = new JLabel();
		etiqueta.setText("BANCO SANTANDER");
		p.add(etiqueta);
		return p;
		
	}


	public void actionPerformed(ActionEvent arg0) {//aqui ponemos la accion que debe hacer el boton 
	
		int[] nEntidad=new int[4];
		int[] nSucursal=new int[4];
		int[] nCuenta=new int[10];
		int control1=0;
		int control2=0;
		
		String cadena = tEntidad.getText();//metemos los caracteres que pongas en el TextField en una variable
		char [] cad= cadena.toCharArray(); //trasnformar los caracteres de un string en array
		
		for(int i=0;i<4;i++) {//en cada posicion del array
			String c= Character.toString(cad[i]);
			nEntidad[i]=Integer.parseInt(c);//pasamos del array a entero
		}
		
		String cadena1 = tSucursal.getText();
		char [] cad1 = cadena1.toCharArray();
		
		for(int i=0;i<4;i++) {
			String c= Character.toString(cad1[i]);
			nSucursal[i]=Integer.parseInt(c);
		}
		
		String cadena2 = tCuenta.getText();
		char [] cad2 = cadena2.toCharArray();
		
		for(int i=0;i<10;i++) {
			String c= Character.toString(cad2[i]);
			nCuenta[i]=Integer.parseInt(c);
			
			//con esto sacamos el primer digito de control
			nEntidad[0]=nEntidad[0]*4;
			nEntidad[1]=nEntidad[1]*8;
			nEntidad[2]=nEntidad[2]*5;
			nEntidad[3]=nEntidad[3]*10;
			
			nSucursal[0]=nSucursal[0]*9;
			nSucursal[1]=nSucursal[1]*7;
			nSucursal[2]=nSucursal[2]*3;
			nSucursal[3]=nSucursal[3]*6;
			for(i=0;i<4;i++) {
				control1=control1+nEntidad[i]+nSucursal[i];
			}
			control1=control1%11;
			control1=11-control1;
			if (control1==10){
				control1=1;
			}
			
			//con esto el segundo digito de control
			nCuenta[0]=nCuenta[0]*1;
			nCuenta[1]=nCuenta[1]*2;
			nCuenta[2]=nCuenta[2]*4;
			nCuenta[3]=nCuenta[3]*8;
			nCuenta[4]=nCuenta[4]*5;
			nCuenta[5]=nCuenta[5]*10;
			nCuenta[6]=nCuenta[6]*9;
			nCuenta[7]=nCuenta[7]*7;
			nCuenta[8]=nCuenta[8]*3;
			nCuenta[9]=nCuenta[9]*6;
			for(i=0;i<10;i++) {
				control2=control2+nCuenta[i];
			}
			control2=control2%11;
			control2=11-control2;
			if (control2==10){
				control2=1;
			}
			String dg1 =Integer.toString(control1);
			String dg2 = Integer.toString(control2);
			tDigito.setText(dg1+dg2);
			
		}
	}
}