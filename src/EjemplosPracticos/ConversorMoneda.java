package EjemplosPracticos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ConversorMoneda {

	public static void main(String[] args) {

		Conversor c=new Conversor();
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setVisible(true);
		c.setTitle("Conversor Divisa");
	}

}

class Conversor extends JFrame {
	private JButton b0,B00,b1,b2,b3,b4,b5,b6,b7,b8,b9,bDec; 
	private JButton bEu,bDol,bBorrar;
	private JTextField Display;
	private JLabel etiqueta;
	
	private String Acumulado="";
	
	public Conversor () {//Constructor
		setBounds (600,350,600,300);
		setLayout (new BorderLayout());
		
		Display = new JTextField();
		Font fuente=new Font("Dialog", Font.ITALIC, 20);
		Display. setFont ( fuente ) ;
		add(Display,BorderLayout.NORTH);
		
		etiqueta = new JLabel(); 
		etiqueta.setText("                                                             "
				+ " JOSE ANTONIO BRUNA DEL CARMEN");
		etiqueta.setSize(100, 25);
		etiqueta.setLocation (50,25);
		add(etiqueta,BorderLayout.SOUTH);
		
//A�adimos el Panel que creamos mas abajo
		JPanel Teclado = crearTeclado();
		add(Teclado,BorderLayout.CENTER);
		
//Creamos botones para el ActionListener y para hacer clases internas		
		Boton0 cb0 = new Boton0();
		Boton00 cb00 = new Boton00();
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
		
		BotonEu cbEu = new BotonEu();
		BotonDol cbDol = new BotonDol();
		BotonBorrar cbBorrar = new BotonBorrar();
		
//Asociamos los botones a las clases internas		
		b0.addActionListener(cb0);
		B00.addActionListener(cb00);
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
		bEu.addActionListener(cbEu);
		bDol.addActionListener(cbDol);
		bBorrar.addActionListener(cbBorrar);
		
	}
	
//Creamos un metodo que metemos en el BorderLayout
	private JPanel crearTeclado() {
		this.b0=new JButton("0");
		b0.setBackground(new Color(139,125,123));
		b0.setForeground(Color.white);
		this.B00=new JButton("00");
		B00.setBackground(new Color(139,125,123));
		B00.setForeground(Color.white);
		this.b1=new JButton("1");
		b1.setBackground(new Color(139,125,123));
		b1.setForeground(Color.white);
		this.b2=new JButton("2");
		b2.setBackground(new Color(139,125,123));
		b2.setForeground(Color.white);
		this.b3=new JButton("3");
		b3.setBackground(new Color(139,125,123));
		b3.setForeground(Color.white);
		this.b4=new JButton("4");
		b4.setBackground(new Color(139,125,123));
		b4.setForeground(Color.white);
		this.b5=new JButton("5");
		b5.setBackground(new Color(139,125,123));
		b5.setForeground(Color.white);
		this.b6=new JButton("6");
		b6.setBackground(new Color(139,125,123));
		b6.setForeground(Color.white);
		this.b7=new JButton("7");
		b7.setBackground(new Color(139,125,123));
		b7.setForeground(Color.white);
		this.b8=new JButton("8");
		b8.setBackground(new Color(139,125,123));
		b8.setForeground(Color.white);
		this.b9=new JButton("9");
		b9.setBackground(new Color(139,125,123));
		b9.setForeground(Color.white);
		this.bDec= new JButton(",");
		bDec.setBackground(new Color(139,125,123));
		bDec.setForeground(Color.white);
		this.bEu=new JButton("€");
		bEu.setBackground(new Color(105,105,105));
		this.bDol=new JButton("$");
		bDol.setBackground(new Color(105,105,105));
		this.bBorrar=new JButton("CE");
		bBorrar.setBackground(new Color(105,105,105));
		
	
//Creamos el panel Grid para meterlo en el BorderLayout
		JPanel p=new JPanel(new GridLayout(5,3,3,3));
		
//A�adimos los botones segun queremos se muestren		
		p.add(bBorrar);
		p.add(bEu);
		p.add(bDol);
		
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(bDec);
		p.add(b0);
		p.add(B00);
		
		
		return p;
		
	}

//Creamos las clases internas 
	
	class Boton0 implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			
			Acumulado=Display.getText()+"0";
			Display.setText(Acumulado);
		}
	}
	
	class Boton00 implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			
			Acumulado=Display.getText()+"00";
			Display.setText(Acumulado);
		}
	}
	
	class Boton1 implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			
			Acumulado=Display.getText()+"1";
			Display.setText(Acumulado);
		}
	}

	class Boton2 implements ActionListener{

		
		public void actionPerformed(ActionEvent arg0) {
			
			Acumulado=Display.getText()+"2";
			Display.setText(Acumulado);
		}
	}
	
	class Boton3 implements ActionListener{
		
		public void actionPerformed(ActionEvent arg0) {
			
				Acumulado=Display.getText()+"3";
				Display.setText(Acumulado);
			}
		}

	class Boton4 implements ActionListener{
		
		public void actionPerformed(ActionEvent arg0) {
			
				Acumulado=Display.getText()+"4";
				Display.setText(Acumulado);
			}
		}

    class Boton5 implements ActionListener{
	
		public void actionPerformed(ActionEvent arg0) {
			
				Acumulado=Display.getText()+"5";
				Display.setText(Acumulado);
			}
		}

    class Boton6 implements ActionListener{
	
		public void actionPerformed(ActionEvent arg0) {
			
				Acumulado=Display.getText()+"6";
				Display.setText(Acumulado);
			}
		}

    class Boton7 implements ActionListener{
	
		public void actionPerformed(ActionEvent arg0) {
			
				Acumulado=Display.getText()+"7";
				Display.setText(Acumulado);
			}
		}

    class Boton8 implements ActionListener{
	
		public void actionPerformed(ActionEvent arg0) {
			
				Acumulado=Display.getText()+"8";
				Display.setText(Acumulado);
			}
		}

    class Boton9 implements ActionListener{
	
		public void actionPerformed(ActionEvent arg0) {
			
				Acumulado=Display.getText()+"9";
				Display.setText(Acumulado);
			}
		}

	class BotonDec implements ActionListener {

		
		public void actionPerformed(ActionEvent arg0) {
			 
			Acumulado=Display.getText()+".";
			Display.setText(Acumulado);
			
		}
		
	}
	
    class BotonBorrar implements ActionListener {

		
		public void actionPerformed(ActionEvent e) {
			
			Display.setText("");
			
		}
    	
    }

    class BotonEu implements ActionListener {
    	
    	public void actionPerformed(ActionEvent e) {
    		
    		Acumulado=Display.getText();
    		Double res=(Double.parseDouble(Acumulado));
    		Double Resultado=res/1.18;
    		
    		Display.setText(String.valueOf(Resultado));
    	}
    }
    
    class BotonDol implements ActionListener {
    	
    	public void actionPerformed(ActionEvent e) {
        		
    			Acumulado=Display.getText();
    			Double res=(Double.parseDouble(Acumulado));
    			Double Resultado=res*1.18;
    	
    			Display.setText(String.valueOf(Resultado));
    	}
    }
    

}