package IntroductoryLanguagePackage;
import javax.swing.JOptionPane;

public class CondicionaWhile {

	public static void main(String[] args) {
		
		String contraseña= "Yunna";
		String clave="";
		
		while (!clave.equals(contraseña)) {
			clave=JOptionPane.showInputDialog("Introduce tu contraseña:");
			
			if(clave!=contraseña) {
				System.out.println("Contraseña incorrecta");
			}
		}System.out.println("Contraseña correcta!");

	}

}
