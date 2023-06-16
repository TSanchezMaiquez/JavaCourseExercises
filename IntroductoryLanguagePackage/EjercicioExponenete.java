package IntroductoryLanguagePackage;

import javax.swing.JOptionPane;

public class EjercicioExponenete {

	public static void main(String[] args) {
	
		int num1=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: ")), num2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero: "));
		
		System.out.println("El resultado de "+num1+ " elevado a "+ num2+ " es "+ Math.pow(num1, num2));
	}

}
