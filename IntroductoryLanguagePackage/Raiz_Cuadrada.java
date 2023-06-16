package IntroductoryLanguagePackage;

import java.util.Scanner;

public class Raiz_Cuadrada {

	public static void main(String[] args) {
		
		double num, num1;
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		num=entrada.nextDouble();
		
		num1=Math.sqrt(num);
		
		System.out.println("La raíz cuadrada del número introducido es "+ num1);
		
		entrada.close();
	}

}
