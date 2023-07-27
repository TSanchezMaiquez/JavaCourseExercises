package Exception;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exception6 {

	static int figura;
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿De que figura quieres saber el área? \nCuadrado: Introduce 1 "
				+ "\nRectángulo: Introduce 2 \nTriángulo: Introduce 3 \nCírculo: Introduce 4");
		try {
		figura = entrada.nextInt();
		
		
		}catch(Exception e) {
			System.out.println("Error message");
		} finally {
			entrada.close();
		}
		
		
		
		switch (figura) {
		
		case 1:
			
			int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la medida de un lado"));
		
		
			System.out.println("El area de un cuadrado de lado " + base + " es " + Math.pow(base, 2));
			break;
			
		case 2:
			
			 base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la medida de la base"));
			 int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la medidad de la altura"));
			
			
			System.out.println("El area de un rectangulo de base " + base + " y altura " + altura + " es"
					+ "igual a " + base*altura);
			break;
			
		case 3:
			
			 base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la medida de la base"));
			 altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la medida de la altura"));

			
			System.out.println("El area de un triángulo de base " + base + " y altura " + altura + " es"
					+ "igual a " + (base*altura)/2);
			break;
			
		case 4:
			double radio=Double.parseDouble(JOptionPane.showInputDialog("Introduce el rádio del círculo"));
			//double areaC=radio*radio*Math.PI;
			
			System.out.print("El area de un círculo de rádio " + radio + " es igual a " );
			System.out.printf("%1.2f", radio*radio*Math.PI);
			break;
			
		default:
			System.out.println("La opción no es correcta");
			
			
		}
	}

}

