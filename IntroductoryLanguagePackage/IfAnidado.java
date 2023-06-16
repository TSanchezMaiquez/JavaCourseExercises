package IntroductoryLanguagePackage;

import javax.swing.JOptionPane;

public class IfAnidado {

	public static void main(String[] args) {
	
		
		int edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));

	if (edad>=18) {
		String carnet=JOptionPane.showInputDialog("¿Tienes carnet de conducir?");
		
		if(carnet.equalsIgnoreCase("si")) JOptionPane.showMessageDialog(null, "Felicidades, te has convertido en mi recadero");
		else  JOptionPane.showMessageDialog(null, "¿Y a que esperas para sacartelo?");
	 
		}else  JOptionPane.showMessageDialog(null, "Crece un poco mas, yogurin");
	
	}
}
