package Exception;

import java.io.EOFException;

import javax.swing.JOptionPane;

public class Exception3 {

	public static void main(String[] args) {
	
		String mail=JOptionPane.showInputDialog("Insert mail");
		
		
			try {
				checkEmail(mail);
			} catch (ExceptionMailLength e) {
				
				
				System.out.println("The email is too short ");
				e.printStackTrace();
			}
			

	}

	
	static void checkEmail(String email) throws ExceptionMailLength {
		
		int arroba=0;
		boolean punto=false;
		
		if(email.length()<4) {
			
			throw new ExceptionMailLength("Email has less than 4 characteres");
		}
		
		for (int i = 0; i < email.length(); i++) {
			
			if(email.charAt(i)=='@') {
				arroba++;
			}
			if(email.charAt(i)=='.') {
				punto=true;
			}
		}
		if(arroba==1 && punto==true) {
			System.out.println("Correcta");
		}else {
			System.out.println("Icorrecta");
		}
	}
}
//RuntimeException: this exception doesn't force to implement a try-catch block, so if you want to force it the best
//option is exxtend Exception
class ExceptionMailLength extends Exception{
	
	public ExceptionMailLength() {}
	public ExceptionMailLength(String errorMessage) {
		super(errorMessage);
	}
	
}