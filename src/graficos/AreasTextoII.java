package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AreasTextoII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoPruebaArea mimarco=new MarcoPruebaArea();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}


class MarcoPruebaArea extends JFrame{
	
	public MarcoPruebaArea() {
		
		setBounds(500,300,500,350);
				
		setTitle("Probando Areas de Texto");
		
		setLayout(new BorderLayout());
		
		laminaBotones= new JPanel();
		
		botonInsertar=new JButton("Insertar");
		
		botonInsertar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				areaTexto.append("En un lugar de la mancha de cuyo nombre no quiero acordarme...");
			}
			
		
		});
		
		laminaBotones.add(botonInsertar);
		
		botonSaltoLinea= new JButton("Salto Linea");
		
		botonSaltoLinea.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				boolean saltar=!areaTexto.getLineWrap();	
				
				areaTexto.setLineWrap(saltar);
				/*
				if(saltar==true) {
					
					botonSaltoLinea.setText("Quitar salto");
					
				}else {
					
					botonSaltoLinea.setText("Salto Linea");
				}  */
				//utilizando el operador ternario en vez de if
				botonSaltoLinea.setText(saltar ? "Quitar salto" :"Salto Linea");
			}
			
		});
		
		laminaBotones.add(botonSaltoLinea);
		
		add(laminaBotones, BorderLayout.SOUTH);
		
		areaTexto= new JTextArea(8,20);
		
		laminaConBarras=new JScrollPane(areaTexto);
		
		add(laminaConBarras, BorderLayout.CENTER);
	}
	
	private JPanel laminaBotones;
	
	private JButton botonInsertar,botonSaltoLinea;
	
	private JTextArea areaTexto;
	
	private JScrollPane laminaConBarras;
		
}


