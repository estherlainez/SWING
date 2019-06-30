package graficos;

import javax.swing.*;
import java.awt.*;

public class BotonesRadio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoRadio mimarco= new MarcoRadio();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoRadio extends JFrame{
	
	public MarcoRadio() {
		
		setBounds(550,300,550,350);
		
		setVisible(true);
		
		LaminaRadio miLamina= new LaminaRadio();
		
		add(miLamina);
		
		
	}
}

class LaminaRadio extends JPanel{
	
	public LaminaRadio() {
		//creo los 3 botones
		ButtonGroup migrupo1= new ButtonGroup();
		
		ButtonGroup migrupo2= new ButtonGroup();
		
		JRadioButton boton1=new JRadioButton("Azul",false);
		
		JRadioButton boton2=new JRadioButton("Rojo",true);
		
		JRadioButton boton3=new JRadioButton("Verde",false);
		
		JRadioButton boton4=new JRadioButton("Masculino",false);
		
		JRadioButton boton5=new JRadioButton("Femenino",false);
		
		//agrego los tres botones al grupo
		migrupo1.add(boton1);
		
		migrupo1.add(boton2);
		
		migrupo1.add(boton3);
		
		migrupo2.add(boton4);
		
		migrupo2.add(boton5);
		//agrego los botones a la lamina
		//el grupo nunca se puede agregar
		add(boton1);
		
		add(boton2);
		
		add(boton3);
		
		add(boton4);
		
		add(boton5);
		
		
	}
}	