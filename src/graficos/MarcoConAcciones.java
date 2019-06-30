package graficos;
import javax.swing.*;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
public class MarcoConAcciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoAccion marco=new MarcoAccion();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco.setVisible(true);

	}

}

class MarcoAccion extends JFrame{
	
	public MarcoAccion() {
		
		setTitle("Prueba Acciones");
		
		setBounds(300,300,600,450);
		
		PanelAccion lamina= new PanelAccion();
		
		add(lamina);
		
		
	}
	
}


class PanelAccion extends JPanel{
	
	public PanelAccion() {
		
		AccionColor accionAmarillo=new AccionColor("Amarillo",new ImageIcon("src/graficos/imagen3.jpg"),Color.yellow);	
		AccionColor accionAzul=new AccionColor("Azul",new ImageIcon("src/graficos/imagen2.jpg"),Color.blue);		
		AccionColor accionRojo=new AccionColor("Rojo",new ImageIcon("src/graficos/imagen1.jpg"),Color.red);
		
		//otra posible forma de crear botones
		/*JButton botonAmarillo=new JButton(accionAmarillo);
		
		add(botonAmarillo);*/
		
		//la mejor forma y la mas rapida para crear botones
		add(new JButton(accionAmarillo));
		
		add(new JButton(accionAzul));
		
		add(new JButton(accionRojo));
		//asi teniamos los botones creados
		/*JButton botonAmarillo=new JButton("Amarillo");		
		JButton botonAzul=new JButton("Azul");		
		JButton botonRojo=new JButton("Rojo");
		
		add(botonAmarillo);	
		add(botonAzul);		
		add(botonRojo);*/
		
		//---------con Teclas del Teclado------------
		//Esta clase INPUTMAP proporciona un vinculo entre en evento y un objeto
		//Esto incula un evento con una cominacion de teclas
		InputMap mapaEntrada=getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);		
		//Esta clase KEYSTROKE representa una accion con una tecla de nuestro teclado
		//KeyStroke teclaAmarillo=KeyStroke.getKeyStroke("ctrl A");
		//otra manera mas simple seria....
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondo_amarillo");
		
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondo_azul");
		
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "fondo_rojo");
		//creo un mapa de accion
		ActionMap mapaAccion= getActionMap();
		//creamos un vinculo entre el nombre que le hemos dado a la accion con la acion en si misma
		mapaAccion.put("fondo_amarillo", accionAmarillo);
		
		mapaAccion.put("fondo_azul", accionAzul);
		
		mapaAccion.put("fondo_rojo", accionRojo);
		
		
		
	}
	
	private class AccionColor extends AbstractAction{

		public AccionColor(String nombre, Icon icono, Color color_boton) {
			
			putValue(Action.NAME, nombre);
			
			putValue(Action.SMALL_ICON, icono);
			
			putValue(Action.SHORT_DESCRIPTION,"Poner la lamina de color "+nombre);
			
			//        clave      +      valor
			putValue("color_de_fondo", color_boton);
			
			
		}
		public void actionPerformed(ActionEvent e) {
		
			Color c=(Color) getValue("color_de_fondo");
			
			setBackground(c);
			
			System.out.println("Nombre: "+getValue(Action.NAME)+" Descripcion: "+getValue(Action.SHORT_DESCRIPTION));
		}
		
	}
	
}





