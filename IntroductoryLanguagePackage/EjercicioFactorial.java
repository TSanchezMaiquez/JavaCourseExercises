package IntroductoryLanguagePackage;

import javax.swing.JOptionPane;

public class EjercicioFactorial {

	public static void main(String[] args) {
	 
		System.out.println("Vamos a calcular el factorial de un numero!");
		int num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
		long resultado=num;
		
		for(int i=(num-1); i>0; i--) {
			resultado=resultado*i;
			
		}System.out.println("El factorial del numero: "+ num+ " es: "+resultado);
	}

}
