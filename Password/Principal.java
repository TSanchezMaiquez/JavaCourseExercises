package Password;

import javax.swing.JOptionPane;

public class Principal { 

	public static void main(String[] args) {
		
		String contraseña = JOptionPane.showInputDialog("Introduce cuantas contraseñas quieres generar: ");
		int num = Integer.parseInt(contraseña);
		String longitud = JOptionPane.showInputDialog("¿Longitud de contraseñas?: ");
		int lngt = Integer.parseInt(longitud);
		Contraseña contrasenia = new Contraseña(num, lngt);
		
		String []contrasenias = contrasenia.getContraseña();
		
		for (int i = 0; i < contrasenias.length; i++) {
				System.out.println(contrasenias[i] + " "+contrasenia.comprobarContraseña(contrasenias[i]));
			
			
		}
	}

}
