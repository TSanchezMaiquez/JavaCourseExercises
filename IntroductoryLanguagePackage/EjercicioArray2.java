package IntroductoryLanguagePackage;

import java.util.Scanner;

public class EjercicioArray2 {

	
	public static void main (String [] args) {
		
		Scanner kb = new Scanner (System.in);
		
		int [] values = new int [100];
		
	for(int i=0; i<values.length; i++) {
		values[i]=(int)(Math.random()*99+1);
	}
	for (int elements:values) {
		System.out.println(elements +"\t");
	}
	}
}
