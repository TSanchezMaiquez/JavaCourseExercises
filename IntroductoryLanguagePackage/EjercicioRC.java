package IntroductoryLanguagePackage;

import java.util.Scanner;

public class EjercicioRC {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner (System.in);
		
	System.out.print("Introduce un numero, por favor: ");
	int num=entrada.nextInt();
	
	System.out.println("La raiz cuadrada de "+num+" es "+ Math.sqrt(num));
	}

}
