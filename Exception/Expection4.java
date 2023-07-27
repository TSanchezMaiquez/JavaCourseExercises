package Exception;

import javax.swing.JOptionPane;

public class Expection4 {

	public static void main(String[] args) {
		
		int num=0;
		
		try {
			
		 num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero entre 1 y 100"));
		
		}catch(Exception e) {
			System.out.println("the entered value isn't valid");
		}
		
		try {
			checkNumber(num);
		} catch (ExitOfBounds e) {

			e.printStackTrace();
		}

	}
	
	static void checkNumber(int num) throws ExitOfBounds {
		
		if(num >=1 && num<=100) {
			System.out.println("The number is correct");
		}else{
			throw new ExitOfBounds("The number is out of bounds");
		}
	}
}
class ExitOfBounds extends Exception {
	
	public ExitOfBounds() {}
	public ExitOfBounds(String errorMessage) {
		super(errorMessage);
	}
}
