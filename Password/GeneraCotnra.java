package Password;

import javax.swing.JOptionPane;

public class GeneraCotnra {

	public static void main(String[] args) {
		
		int tamanioArray = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero de contraseñas: "));
		int longitudPass = Integer.parseInt(JOptionPane.showInputDialog("Introduce la longitud del password: "));
		CreaPassword ArrayPasswords [] = new CreaPassword [tamanioArray];
		for (int i=0; i<ArrayPasswords.length; i++) {
			ArrayPasswords[i] = new CreaPassword(longitudPass);
			
			System.out.println("Password: "+ ArrayPasswords[i].getPasswords() + " Longitud: "+ ArrayPasswords[i].getLongitud() 
					+ " caracteres " + " " + ArrayPasswords[i].esSegura());
		}

	}

}

class CreaPassword {
	
	private int longitud;
	private String password;
	
	public CreaPassword (int longitud) {
		this.longitud = longitud;
		password=generaPassword();
	}
	public int getLongitud() {
		return longitud;
	}
	public String getPasswords () {
		return password;
	}
	public String generaPassword () {
		String password="";
		for (int i = 0; i < longitud; i++) {
			int mayusMinus = ((int) Math.random()*3+1);
			if (mayusMinus==1) {
				char minusculas=(char)((int)(Math.random()*(123-97)+97));
				password+=minusculas;
			}else if (mayusMinus==2) {
				char mayusculas= (char)((int)(Math.random()*(58-48)+48));
				password+=mayusculas;
				
			}else {
				char numeros =(char)((int)(Math.random()*(58-48)+48));
				password+=numeros;
			}
			
		}
		return password;
	}
	public String esSegura() {
		int numeros=0;
		int minusculas=0;
		int mayusculas=0;
		
		for (int i = 0; i < password.length(); i++) {
			if (Character.isLowerCase(password.charAt(i))) {
				minusculas+=1;
			}else if(Character.isUpperCase(password.charAt(i))) {
				mayusculas+=1;
			}else {
				numeros+=1;
			}
		}
		if (numeros>=5 && minusculas>=1 && mayusculas>=2) {
			return "Contraseña segura";
			
		}else {
			return "Contraseña debil";
		}
	}
}
