package IntroductoryLanguagePackage;

import javax.swing.JOptionPane;

public class EjercicioBucleForEmail {

	public static void main(String[] args) {
		boolean valido=false;
		
		do {
		
		String email=JOptionPane.showInputDialog("Introduce tu email: ");
		int arroba=0;
		boolean punto=false;
		
		for (int i=0; i<email.length(); i++) {
			if (email.charAt(i)=='@') arroba++;
			
			if(email.charAt(i)=='.')punto=true;
			
		}
		if (arroba==1 && punto==true && email.length()>=4) valido=true;
		else JOptionPane.showMessageDialog(null, "email no valido");
		
		}while (valido==false);
		System.out.println("Email correcto!");
		

	}

}
