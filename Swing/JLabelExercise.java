package Swing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JLabelExercise {

	public static void main(String[] args) {
		
		MyFrame24 myframe = new MyFrame24();
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe.setVisible(true);
	}

}
class MyFrame24 extends JFrame{
	
	public MyFrame24 () {
		this.setBounds(300,500, 300, 250);
		add(new MyPanel24());
		
	}
}

class MyPanel24 extends JPanel {
	
	JTextField textBox;
	JLabel text;
	
	public MyPanel24() {
		this.setLayout(new GridLayout(3,0));
		textBox = new JTextField();
		add(textBox);
		
		JButton button = new JButton("Check email");
		button.addActionListener(new GetText());
		add(button);
		
		text = new JLabel("");
		add(text);
	}
	
	private class GetText implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
			if(textBox.getText().matches(regex)) {
				text.setText("correcto");
			}else {
				text.setText("Incorrecto");
			}
				
		}
		
	}
}