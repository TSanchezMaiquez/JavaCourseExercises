package IntroductoryLanguagePackage;

import java.util.Scanner;

public class Lenght_Y_ChartAt {

	public static void main(String[] args) {
	
		String cadena;
		System.out.print("Introduce un texto: ");
		Scanner entrada= new Scanner (System.in);
		cadena=entrada.nextLine();
		
		//guarad en ultima la longitud del texto introducido por consola y guardado en la variable cadena. Empieza a contar desde 1 y devuelve un int
		int ultima= cadena.length();
		
		
		System.out.println("La longitud del texto introducido es de: "+ cadena.length());
		
		/*CharAt: Cuenta los caracteres de un texto y te devuelve el caracter de la posicion que le hayas indicado. En el ejempo pongo (ultima-1) porque length empieza a contar con el valor 1 y charAt empieza a contar desde el valor 0*/
		System.out.println("La última posición de la cadena la ocupa el carácter: "+ cadena.charAt(ultima-1)+ " La primera posición la ocupa el character: "+cadena.charAt(0));
		
		entrada.close();
	}

}
