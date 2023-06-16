package IntroductoryLanguagePackage;

import javax.swing.JOptionPane;

public class Horoscopo {

	public static void main(String[] args) {
	
		System.out.println("¿Cual es tu horoscopo?");
		int mes= Integer.parseInt(JOptionPane.showInputDialog("Introduce tu mes de nacimiento: "));
		int dia= Integer.parseInt(JOptionPane.showInputDialog("Introduce tu día de nacimiento"));
		
		switch (mes) {
		case 1:
			
			if (dia<=20) System.out.println("Tu signo del zodiaco es capricornio");
			else System.out.println("Tu signo del zodiaco es acuario");
			break;
			
		case 2:
			if (dia<=18) System.out.println("Tu signo del zodiaco es acuario");
			else System.out.println("Tu signo del zodiaco es piscis");
			break;
		
		case 3:
			if (dia<=20) System.out.println("Tu signo del zodiaco es piscis");
			else System.out.println("Tu signo del zodiaco es aries");
			break;
			
		case 4:
			if (dia<=20) System.out.println("Tu signo del zodiaco es aries");
			else System.out.println("Tu signo del zodiaco es tauro");
			break;
			
		case 5:
			if (dia<=21) System.out.println("Tu signo del zodiaco es tauro");
			else System.out.println("Tu signo del zodiaco es geminis");
			break;
			
			
		case 6:
			if (dia<=21) System.out.println("Tu signo del zodiaco es geminis");
			else System.out.println("Tu signo del zodiaco es cancer");
			break;
			
		case 7:
			if (dia<=22) System.out.println("Tu signo del zodiaco es cancer");
			else System.out.println("Tu signo del zodiaco es leo");
			break;
			
		case 8:
			if (dia<=23) System.out.println("Tu signo del zodiaco es leo");
			else System.out.println("Tu signo del zodiaco es virgo");
			break;
			
		case 9:
			if (dia<=24) System.out.println("Tu signo del zodiaco es virgo");
			else System.out.println("Tu signo del zodiaco es libra");
			break;
			
		case 10:
			if (dia<=20) System.out.println("Tu signo del zodiaco es libra");
			else System.out.println("Tu signo del zodiaco es escorpio");
			break;
			
		case 11:
			if (dia<=20) System.out.println("Tu signo del zodiaco es escorpio");
			else System.out.println("Tu signo del zodiaco es sagitario");
			break;
			
		case 12:
			
			if (dia<=20) System.out.println("Tu signo del zodiaco es sagitario");
			else System.out.println("Tu signo del zodiaco es capricornio");
			break;
			
			default: System.out.println("Datos incorrectos");
		}
		

	}

}
