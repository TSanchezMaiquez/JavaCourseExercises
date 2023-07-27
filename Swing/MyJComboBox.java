package Swing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyJComboBox {

	public static void main(String[] args) {
		
		/*JFrame myFrame = new JFrame();
		
		myFrame.setSize(600, 600);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLocation(520, 150);
		myFrame.setVisible(true);*/
		
		MyJFrame65 myFrame = new MyJFrame65();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
	}

}

class MyJFrame65 extends JFrame {
	
	public MyJFrame65 () {
	
		this.setBounds(500, 250, 600,400);
		add(new MyPanel65());
		
		
		
	}
}
class MyPanel65 extends JPanel{
	
	JLabel text1;
	JComboBox myCombo;
	
	public MyPanel65() {
		
		setLayout (new BorderLayout());
		
		text1 = new JLabel ("                                                   Hello World");
		text1.setFont(new Font("Serif", Font.PLAIN, 18));
		add(text1, BorderLayout.CENTER);
		
		JPanel upper= new JPanel();
		
		myCombo = new JComboBox();
		myCombo.addItem("Serif");
		myCombo.addItem("SansSerif");
		myCombo.addItem("Dialog");
		myCombo.addItem("Calibri");
		
		myCombo.addActionListener(new EventCombo());
		
		upper.add(myCombo);
		add(upper, BorderLayout.NORTH);
	}
	private class EventCombo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
		
			text1.setFont(new Font((String) myCombo.getSelectedItem(), Font.PLAIN, 18));
			
		}
		
	}
}