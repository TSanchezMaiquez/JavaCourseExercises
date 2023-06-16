package IntroductoryLanguagePackage;
import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		
		int edad;
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Por favor, introduce tu edad: ");
		edad=entrada.nextInt();
		
		System.out.println("Tu edad es de " + edad);

			entrada.close();
	}

}
