package IntroductoryLanguagePackage;

import java.util.Scanner;

public class EjercicioArray3 {

	
	public static void main (String [] args) {
		
		Scanner kb = new Scanner (System.in);
		
		int [] values = new int [10];
		
		System.out.println("Introduce un total de 10 numeros enteros: ");
		int addition=0;
		
		for (int i=0; i<10; i++) {
		System.out.print((i+1)+"º numero: ");
		values[i]= kb.nextInt();
		if(i%2!=0) addition=addition+values[i];
		}
		
		System.out.println("La media de los valores introducidos es de: "+addition/(values.length/2));
	}
}
