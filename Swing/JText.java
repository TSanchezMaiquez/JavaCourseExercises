package Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JText {

	public static void main(String[] args) {
		
		MyFrame23 myframe = new MyFrame23();
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe.setVisible(true);

	}

}

class MyFrame23 extends JFrame {
	
	public MyFrame23 () {
		this.setBounds(600, 300, 600, 400);
		add(new MyPanel23());
	}
}
class MyPanel23 extends JPanel {
	JTextField textBox, textBox2;
	
	public MyPanel23 () {
		
		textBox = new JTextField(20);
		add(textBox);
		
		JButton button = new JButton ("Get text");
		button.addActionListener(new GetText());
		add(button);
		
		textBox2 = new JTextField(20);
		add(textBox2);
		
	}
	private class GetText implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			textBox2.setText(textBox.getText());
			
		}
		
	}
}