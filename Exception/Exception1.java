package Exception;

import javax.swing.JOptionPane;

public class Exception1 {

	public static void main(String[] args) {
		int num=0;
		try {
			num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"El valor introducido no es un numero");
			System.exit(0);
		}
		
		
		if(num%2==0) JOptionPane.showMessageDialog(null, "El numero "+ num+ " es par");
		else JOptionPane.showMessageDialog(null, "El numero "+ num+ " es impar");
	}

}
