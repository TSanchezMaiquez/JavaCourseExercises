package IntroductoryLanguagePackage;

import javax.swing.JOptionPane;

public class OperadorTernario {

	public static void main(String[] args) {
	/*
			int edad= Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad, por favor."));
			String mayor = (edad>18)?"Eres mayor de edad!":"Eres menor de edad.";
			System.out.println(mayor);
			
			int sueldo1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce sueldo trabajador 1: "));
			int sueldo2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce sueldo trabajador 2: "));
			
			int sueldoMayor=(sueldo1>sueldo2)?sueldo1:sueldo2;
			
			System.out.println("El sueldo mas alto es: "+sueldoMayor);*/
		
		
			int num= Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad, por favor."));
			String tipo= (num >0)? "":" no";
			System.out.println("el numero "+num+ tipo+" es positivo");
			
	}

}
