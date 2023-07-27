package Exception;

import javax.swing.JOptionPane;

public class Exception5 {

	public static void main(String[] args) {
		
		try {
			division();
		}catch(ArithmeticException e) {
			System.out.println("You have tried to divide by 0");
		}catch(NumberFormatException e) {
			System.out.println("The value entered isn't a number");
			System.out.println("exception: "+ e.getClass().getName());
		}

	}
static void division() {
	
	int num1= Integer.parseInt(JOptionPane.showInputDialog("Enter first number"));
	int num2= Integer.parseInt(JOptionPane.showInputDialog("Enter second number"));
	
	System.out.println("The result is "+ num1/num2);
}
}
