package Swing;

import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class JFrame1 {

	public static void main(String[] args) {
		
		/*JFrame myFrame = new JFrame();
		
		myFrame.setSize(600, 600);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLocation(520, 150);
		myFrame.setVisible(true);*/
		
		MyJFrame myFrame = new MyJFrame();
		
	}

}

class MyJFrame extends JFrame {
	
	public MyJFrame () {
		
		//this.setLocationRelativeTo(null);
		//setSize (600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setLocation(520, 150);
		this.setBounds(500, 250, 600,400);
		
			//you can't change the size manually
		//this.setResizable(false);
		
			//it opens in full screen
		//this.setExtendedState(Frame.MAXIMIZED_BOTH);
		
		this.setTitle("Ventana de prueba");
			//stored the system's default toolkit in the created variable
		Toolkit mySys = Toolkit.getDefaultToolkit();
		
		Image myIcon = mySys.getImage("C:\\Users\\yunni\\Desktop\\Curso Java\\CursoJava\\src\\Switch\\choc1.jpg");
		 //sets the image stored in myIcon as the current window icon
		this.setIconImage(myIcon);
		
		setVisible(true);
		
	}

	
}