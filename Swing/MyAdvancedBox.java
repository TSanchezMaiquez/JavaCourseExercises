package Swing;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyAdvancedBox {

	public static void main(String[] args) {
		
		BoxFrame myFrame = new BoxFrame();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);

	}

}

class BoxFrame extends JFrame {

	public BoxFrame() {
		
		
		setTitle("Box disposition");
		setBounds(700, 400, 200, 200);
		
		JLabel userN = new JLabel("name");
		JTextField userC = new JTextField (10);
		//si se redimensiona la pantalla con este metodo el campo no cambia de tamaño
		userC.setMaximumSize(userC.getPreferredSize());
		
		Box userBox = Box.createHorizontalBox();
		userBox.add(userN);
		//distancia entre componentes
		userBox.add(Box.createHorizontalStrut(10));
		userBox.add(userC);
		
		
		JLabel passN = new JLabel("Password");
		JTextField passC = new JTextField (10);
		//si se redimensiona la pantalla con este metodo el campo no cambia de tamaño
		passC.setMaximumSize(userC.getPreferredSize());
		
		Box passwordBox = Box.createHorizontalBox();
		passwordBox.add(passN);
		//distancia entre componentes
		passwordBox.add(Box.createHorizontalStrut(10));
		passwordBox.add(passC); 
		
		
		JButton button1 = new JButton("Ok");
		JButton button2 = new JButton("Cancel");
		
		Box buttonBox = Box.createHorizontalBox();
		buttonBox.add(button1);
		buttonBox.add(Box.createGlue());
		buttonBox.add(button2);
		
		
		Box verticalBox = Box.createVerticalBox();
		
		verticalBox.add(userBox);
		verticalBox.add(passwordBox);
		verticalBox.add(buttonBox);
		
		this.add(verticalBox);
	}
	
}