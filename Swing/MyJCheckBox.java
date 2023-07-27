package Swing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyJCheckBox {
	public static void main(String[] args) {
	MyFrame27 myframe = new MyFrame27();
	myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	myframe.setVisible(true);
}

}
class MyFrame27 extends JFrame{

public MyFrame27 () {
	this.setBounds(600,300, 600, 400);
	add(new MyPanel27());
	
}
}

class MyPanel27 extends JPanel {

	private JCheckBox blackCB, ItalicsCB;
	private JLabel text;
	
public MyPanel27() {
	
	setLayout(new BorderLayout());
	text = new JLabel("Hello");
	text.setFont(new Font("Curier", Font.PLAIN, 24));
	
	JPanel upper = new JPanel();
	JPanel lower = new JPanel();
	upper.add(text);
	
	
	blackCB= new JCheckBox("Negrita");
	ItalicsCB = new JCheckBox("Cursiva");
	
	blackCB.addActionListener(new CheckControl());
	ItalicsCB.addActionListener(new CheckControl());
	
	lower.add(blackCB, BorderLayout.SOUTH);
	lower.add(ItalicsCB, BorderLayout.SOUTH);
	
	add(upper, BorderLayout.NORTH);
	add(lower, BorderLayout.SOUTH);
	
	
	
	}
private class CheckControl implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		int black_italic=0;
		if(blackCB.isSelected()) black_italic+=Font.BOLD;
		if(ItalicsCB.isSelected()) black_italic+=Font.ITALIC;
		text.setFont(new Font("Courier",black_italic, 24));
		
		
	}
	
}
}