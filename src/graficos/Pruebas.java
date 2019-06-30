package graficos;

import java.awt.GraphicsEnvironment;

import javax.swing.*;
public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fuente=JOptionPane.showInputDialog("Introduce fuente");
		
		boolean estalafuente=false;
		
		//para saber los tipos de fuente que tenemos en nuestro ordenador
		String [] nombresDeFuentes=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		for(String nombredelafuente: nombresDeFuentes) {
			//para que recorra los tipos de fuente del ordenador
			//System.out.println(nombredelafuente);
			
			if(nombredelafuente.equals(fuente)) {
				estalafuente=true;
			}
			
		}
		
		if(estalafuente) {
			System.out.println("Fuente instalada");
		}else {
			System.out.println("Fuente no instalada");
		}
	}

}
