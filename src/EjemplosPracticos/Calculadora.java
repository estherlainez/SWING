package EjemplosPracticos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculadora {

	public static void main(String[] args) {
		
		Calculadora01 c=new Calculadora01();
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setVisible(true);
	}
	

}

	class Calculadora01 extends JFrame {
		private JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9, bDec, bMas, bMenos, bPor, bDiv, bIgual;
		private JButton bBorrar,b100,bme,bmod;//añadimos nuevos botones
		private JTextField Display;//para hacer el display donde aparecen los numeros marcados
		private JLabel Etiqueta;
		
		public String Acumulado="";//una cadena para acumular los numeros 
		public double a;//para guardar los numeros y hacer un numero entero ante de operar con el 
		public String operacion;
		public String memoria="";
		
		
	public Calculadora01 () {//constructor de la calculadora
			setBounds (600,350,600,300);
			setLayout (new BorderLayout());//le decimos que tipo de layout quieres que tenga
			//usamos el border porque queremos meter el display arriba y la calculadora en el centro
			
			Display = new JTextField();//con esto ponemos el displey en la zona norte
			add(Display, BorderLayout.NORTH);
			
			Etiqueta = new JLabel(); //con esto ponemos la etiqueta en la zona sur
			Etiqueta.setText("                                                             "
					+ " ESTHER LAINEZ");
			Etiqueta.setSize(100, 25);
			Etiqueta.setLocation (50,25);
			add(Etiqueta,BorderLayout.SOUTH);
			
			
			JPanel Teclado = crearTeclado();//
			add (Teclado, BorderLayout.CENTER);
			
				
			Boton0 cb0 = new Boton0(); //creamos estos botones para hacer el actionlistener y crear clases 
			Boton1 cb1 = new Boton1();
			Boton2 cb2 = new Boton2();
			Boton3 cb3 = new Boton3();
			Boton4 cb4 = new Boton4();
			Boton5 cb5 = new Boton5();
			Boton6 cb6 = new Boton6();
			Boton7 cb7 = new Boton7();
			Boton8 cb8 = new Boton8();
			Boton9 cb9 = new Boton9();
			BotonDec cbDec = new BotonDec();
			
			
			BotonIgual cbIgual = new BotonIgual ();
			BotonMas cbMas = new BotonMas();
			BotonMenos cbMenos = new BotonMenos();
			BotonPor cbPor = new BotonPor ();
			BotonDiv cbDiv = new BotonDiv();
			
			BotonMeMas cbMeMas = new BotonMeMas();
			BotonBorrar cbBorrar = new BotonBorrar();
			
		
			
			b0.addActionListener(cb0);//asociamos los botones a las clases que crearemos
			b1.addActionListener(cb1);
			b2.addActionListener(cb2);
			b3.addActionListener(cb3);
			b4.addActionListener(cb4);
			b5.addActionListener(cb5);
			b6.addActionListener(cb6);
			b7.addActionListener(cb7);
			b8.addActionListener(cb8);
			b9.addActionListener(cb9);
			bDec.addActionListener(cbDec);
			
			bIgual.addActionListener(cbIgual);
			bMas.addActionListener(cbMas);
			bMenos.addActionListener(cbMenos);
			bPor.addActionListener(cbPor);
			bDiv.addActionListener(cbDiv);
			
			bme.addActionListener(cbMeMas);
			bBorrar.addActionListener(cbBorrar);
	
		}
		
	private JPanel crearTeclado() {// creamos un metodo para meter en el border layout
			this.b0=new JButton("0");
			this.b1=new JButton("1");
			this.b2=new JButton("2");
			this.b3=new JButton("3");
			this.b4=new JButton("4");
			this.b5=new JButton("5");
			this.b6=new JButton("6");
			this.b7=new JButton("7");
			this.b8=new JButton("8");
			this.b9=new JButton("9");
			this.b0= new JButton("0");
			this.bDec= new JButton(",");
			this.bMas= new JButton("+");
			this.bMenos= new JButton("-");
			this.bPor= new JButton("x");
			this.bDiv= new JButton("/");
			this.bIgual= new JButton("=");
			this.bBorrar= new JButton("CE");
			this.bme= new JButton("M+");
			this.b100= new JButton("%");
			this.bmod= new JButton("MOD");
			
			JPanel p=new  JPanel (new GridLayout(5,4));//con esto le decimos que este panel sera en grid para meterlo en border.center
			
			p.add(bBorrar);
			p.add(bme);
			p.add(b100);
			p.add(bmod);
			p.add(bDec);
			
			p.add(b7);//añadimos los botones segun queramos que se muestren
			p.add(b8);
			p.add(b9);
			p.add(bDiv);
			p.add(b4);
			p.add(b5);
			p.add(b6);
			p.add(bPor);
			
			p.add(b1);
			p.add(b2);
			p.add(b3);
			p.add(bMenos);
			
			p.add(bDec);
			p.add(b0);
			p.add(bIgual);
			p.add(bMas);
			
			return p;
		}
	
		//clases internas ---------------
		
		class Boton0 implements ActionListener{//
			
			public void actionPerformed(ActionEvent arg0) {
				
				Acumulado=Display.getText()+"0";//le decimos que acumule 0 a lo ya acumulado
				Display.setText(Acumulado);//que lo muestre en el display
				
			}
		}
		//-------------------------
		class Boton1 implements ActionListener{
		
			public void actionPerformed(ActionEvent arg0) {
				
				Acumulado=Display.getText()+"1";
				Display.setText(Acumulado);
			}
		}
		//-------------------------
		class Boton2 implements ActionListener{
					
					public void actionPerformed(ActionEvent arg0) {
						
						Acumulado=Display.getText()+"2";
						Display.setText(Acumulado);
					}
				}
		//------------------
		class Boton3 implements ActionListener{
		
			public void actionPerformed(ActionEvent arg0) {
				
					Acumulado=Display.getText()+"3";
					Display.setText(Acumulado);
				}
			}
		//-------------------
		class Boton4 implements ActionListener{
			
				public void actionPerformed(ActionEvent arg0) {
					
						Acumulado=Display.getText()+"4";
						Display.setText(Acumulado);
					}
				}
		//-------------------
		class Boton5 implements ActionListener{
			
				public void actionPerformed(ActionEvent arg0) {
					
						Acumulado=Display.getText()+"5";
						Display.setText(Acumulado);
					}
				}
		//-------------------
		class Boton6 implements ActionListener{
			
				public void actionPerformed(ActionEvent arg0) {
					
						Acumulado=Display.getText()+"6";
						Display.setText(Acumulado);
					}
				}
		//-------------------
		class Boton7 implements ActionListener{
			
				public void actionPerformed(ActionEvent arg0) {
					
						Acumulado=Display.getText()+"7";
						Display.setText(Acumulado);
					}
				}
		//-------------------
		class Boton8 implements ActionListener{
			
				public void actionPerformed(ActionEvent arg0) {
					
						Acumulado=Display.getText()+"8";
						Display.setText(Acumulado);
					}
				}
		//-------------------
		class Boton9 implements ActionListener{
			
				public void actionPerformed(ActionEvent arg0) {
					
						Acumulado=Display.getText()+"9";
						Display.setText(Acumulado);
					}
				}
		//-------------------
		class BotonDec implements ActionListener {

			
			public void actionPerformed(ActionEvent arg0) {
				 
				Acumulado=Display.getText()+".";
				Display.setText(Acumulado);
				
			}
			
		}
		//-------------------
		class BotonMas implements ActionListener {
			
			public void actionPerformed(ActionEvent e) {
				
				Acumulado=Display.getText(); //cogemos lo que hay en el display
				a=(Double.parseDouble(Acumulado));//lo acumulado lo metemos en la variante a y transformamos a double
				operacion="+";//guardamos la operacion para usarla en el igual
				Display.setText("");//ponemos el display a 0
			}
			
		}
		//--------------------
		class BotonMenos implements ActionListener {
			
			public void actionPerformed(ActionEvent e) {
				
				Acumulado=Display.getText();
				a=(Double.parseDouble(Acumulado));
				operacion="-";
				Display.setText("");
			}
			
		}
		//--------------------
		class BotonPor implements ActionListener {
			
			public void actionPerformed(ActionEvent e) {
				
				Acumulado=Display.getText();
				a=(Double.parseDouble(Acumulado));
				operacion="*";
				Display.setText("");
			}
			
		}
		//--------------------
		class BotonDiv implements ActionListener {
			
			public void actionPerformed(ActionEvent e) {
				
				Acumulado=Display.getText();
				a=(Double.parseDouble(Acumulado));
				operacion="/";
				Display.setText("");
			}
			
		}
		//--------------------
		class BotonIgual implements ActionListener {
			
			public void actionPerformed(ActionEvent e) {
				
				Acumulado=Display.getText();//cogemos el acumulado
				Double b=(Double.parseDouble(Acumulado));//lo transformamos a double y lo metemos en b
				Double resultado=0.0;//creamos variable resultado y la ponemos a 0
				if (operacion.equals("+")) {
					resultado=a+b;
				}else {
					if (operacion.equals("-")) {
						resultado=a-b;
					}else {
						if (operacion.equals("*")) {
							resultado=a*b;
						}else {
							if (operacion.equals("/")) {
								resultado=a/b;
							}
						}
					}
				}
			Display.setText(String.valueOf(resultado));//mostramos el resultado en el display transformado a String
			}
			
		}
		//--------------------
		class BotonMeMas implements ActionListener {

			
			public void actionPerformed(ActionEvent e) {
				
				if (memoria=="") {
					memoria=Display.getText();
					
				}else {
					Display.setText(memoria);
				}
			}
			
		}
		//--------------------
	    class BotonBorrar implements ActionListener {

		
			public void actionPerformed(ActionEvent e) {
				
				Display.setText("");
				
			}
	    	
	    }
	}
	
	
