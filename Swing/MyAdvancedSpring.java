package Swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;

public class MyAdvancedSpring {

	public static void main(String[] args) {

		SpringFrame myFrame = new SpringFrame();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);

	}

}

class SpringFrame extends JFrame{
	
	public SpringFrame() {
		
		this.setBounds(300, 400, 1000, 350);
		this.add(new SpringPanel());
	}
}
class SpringPanel extends JPanel {

	public SpringPanel() {
		
		JButton button1 = new JButton ("Button 1");
		JButton button2 = new JButton ("Button 2");
		JButton button3 = new JButton ("Button 3");
		
		SpringLayout myLayout = new SpringLayout();
		setLayout(myLayout);
		
		add(button1);
		add(button2);
		add(button3);
		
		Spring mySpring = Spring.constant(0, 10, 100);
								// destino, objeto destino, muelle usado, origen, este layout
		myLayout.putConstraint(SpringLayout.WEST, button1, mySpring, SpringLayout.WEST, this);
		myLayout.putConstraint(SpringLayout.WEST, button2, mySpring, SpringLayout.EAST, button1);
		myLayout.putConstraint(SpringLayout.WEST, button3, mySpring, SpringLayout.EAST, button2);
		myLayout.putConstraint(SpringLayout.EAST, this, mySpring, SpringLayout.EAST, button3);
		
		
		
		
		}


	}