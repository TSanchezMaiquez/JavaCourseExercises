package IntroductoryLanguagePackage;
import javax.swing.JOptionPane;

public class AdivinaElNumero {

	public static void main(String[] args) {
		
		int aleatorio=(int)Math.random()*99+1;
		
		int num=Integer.parseInt(JOptionPane.showInputDialog("Adivina el número elegido. \nIntroduce un número: "));
			
		int contador=0;
		
			while (aleatorio!=num) {
				
				if (aleatorio>num)System.out.println("El número "+num+" es menor");
			else if (aleatorio<num)System.out.println("El número "+num+" es mayor");
			
				num=Integer.parseInt(JOptionPane.showInputDialog("Introduce otro número: "));
			contador++;
			
			}System.out.println("El numero elegido es correcto. Lo has adivinado a la "+ contador+ " vez.");
		
	}

}
