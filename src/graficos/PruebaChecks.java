package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaChecks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoChecks mimarco= new MarcoChecks();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoChecks extends JFrame{
	
	public MarcoChecks() {
		
		setBounds(550,300,550,350);
		
		setVisible(true);
		
		LaminaChecks miLamina= new LaminaChecks();
		
		add(miLamina);
		
		
	}
}

class LaminaChecks extends JPanel{
	
	public LaminaChecks() {
		
		setLayout(new BorderLayout());
		
		Font miletra= new Font("Serif", Font.PLAIN,24);
		
		texto= new JLabel("Rondalla los Amigos de Tarazona");
		
		texto.setFont(miletra);
		
		JPanel laminatexto= new JPanel();
		
		laminatexto.add(texto);
		
		add(laminatexto, BorderLayout.CENTER);
		
		check1= new JCheckBox("Negrita");
		
		check2= new JCheckBox("Cursiva");
		
		check1.addActionListener(new ManejaChecks());
		
		check2.addActionListener(new ManejaChecks());
		
		JPanel laminachecks= new JPanel();
		
		laminachecks.add(check1);
		
		laminachecks.add(check2);
		
		add(laminachecks, BorderLayout.SOUTH);
		
		
	}
	
	private class  ManejaChecks implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			int tipo=0;
			
			if(check1.isSelected()) tipo+=Font.BOLD;
			
			if(check2.isSelected()) tipo+=Font.ITALIC;
			
			texto.setFont(new Font("Serif",tipo,24));
			
		}
		
	}
	
	private JLabel texto;
	
	private JCheckBox check1,check2;
}