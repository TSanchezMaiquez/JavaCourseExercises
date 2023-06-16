package IntroductoryLanguagePackage;

import javax.swing.JOptionPane;

public class joptionpane {

	public static void main(String[] args) {


		String nombre= JOptionPane.showInputDialog("Introduce tu nombre");
		int edad= Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
		
		
		System.out.println("Tu nombres es: "+nombre + "\nTu edad es: "+edad);
		
		
	}

}
