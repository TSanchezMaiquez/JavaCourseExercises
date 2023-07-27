package Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JTextAreaAndScrollPane {
	public static void main(String[] args) {
		
		MyFrame26 myframe = new MyFrame26();
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe.setVisible(true);
	}

}
class MyFrame26 extends JFrame{
	
	public MyFrame26 () {
		this.setBounds(600,300, 600, 400);
		add(new MyPanel26());
		
	}
}

class MyPanel26 extends JPanel {
	
	public MyPanel26() {
		
		JTextArea myTextArea = new JTextArea(7,25);
		JScrollPane scrollPanel = new JScrollPane(myTextArea);
		myTextArea.setLineWrap(true);
		add(scrollPanel);
		
		JButton button = new JButton ("Get text");
		
		button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(myTextArea.getText());
				
			}
			
		});

		add(button);
		}
	}
	

	

