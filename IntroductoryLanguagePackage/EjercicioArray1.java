package IntroductoryLanguagePackage;

import java.util.Scanner;

public class EjercicioArray1 {

	
	public static void main (String [] args) {
		
		Scanner kb = new Scanner (System.in);
		
		int [] values = new int [10];
		
		System.out.println("Introduce un total de 10 numeros enteros: ");
		
		for (int i=0; i<10; i++) {
		System.out.print((i+1)+"º numero: ");
		values[i]= kb.nextInt();
		
		}
		int negativos=0, positivos=0, cero=0;
		System.out.println("Los valores del array son: ");
		for (int j=0; j<10; j++) {
			if(values[j]==0) cero++;
			else if(values[j]<0) negativos++;
			else positivos++;		
			}
		for (int z=0; z<10; z++) {
			System.out.print((z+1)+"º="+values[z] +" ");
		}
		System.out.println();
		System.out.println();
		System.out.print("El total de valores negativos del array es: "+negativos+ "\nEl total del numeros positivos del array es: "+positivos+"\nEl total de ceros en el array es de: "+cero);
	}
}
