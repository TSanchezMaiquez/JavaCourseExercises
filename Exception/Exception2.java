package Exception;


import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("¿Qué deseas hacer?");
		System.out.println("1. Introducir datos");
		System.out.println("2. Salir del programa");
		
		Scanner entrada=new Scanner (System.in);
		
		int decision=0;
		
		try {
			
		decision=entrada.nextInt();
		
		}catch (InputMismatchException e) {
			System.out.println("Introducción errónea");
			System.exit(0);
		}
		
		if (decision==1){				
			
			try {
			   pedirDatos();
			   
			}catch(InputMismatchException e) {
				System.out.println("Introducción errónea");
				e.printStackTrace();
			}
			
					
		}else{
			
			System.out.println("Adios");
			
			System.exit(0);
		}
		
		entrada.close();
		
		System.out.println("Hemos terminado");
		
	}
	
		static void pedirDatos() throws InputMismatchException  {			
		
			
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre, por favor");
		
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("Introduce edad, por favor");
		
		int edad=entrada.nextInt();	
			
		System.out.println("Hola " + nombre_usuario + ". El a�o que viene tendr�s " + (edad+1) + " a�os");		
		
		entrada.close();
			
		
		
	}
		
		
}

