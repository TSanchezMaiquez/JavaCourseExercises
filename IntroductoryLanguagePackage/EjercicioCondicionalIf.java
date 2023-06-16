package IntroductoryLanguagePackage;

import javax.swing.JOptionPane;

public class EjercicioCondicionalIf {

	public static void main(String[] args) {
		
	int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura, por favor."));
	String sexo=JOptionPane.showInputDialog("Indica si eres hombre o mujer");
	
	if (sexo.equalsIgnoreCase("Mujer")) {
		System.out.println("Su peso ideal es de: "+ (altura-120)+" Kgs.");
		}else if (sexo.equalsIgnoreCase("hombre")) 
			System.out.println("Su peso ideal es de: "+(altura-110)+ "Kgs.");
		
		else System.out.println("los datos introducidos no son correctos");
			
	}
}
