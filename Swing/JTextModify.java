package Swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;


public class JTextModify {

	public static void main(String[] args) {
		
		MyFrame25 myframe = new MyFrame25();
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe.setVisible(true);
	}

}
class MyFrame25 extends JFrame{
	
	public MyFrame25 () {
		this.setBounds(600,300, 600, 400);
		add(new MyPanel25());
		
	}
}

class MyPanel25 extends JPanel {
	
	public MyPanel25() {
		
		JTextField textBox = new JTextField(20);
		Document myDocument=textBox.getDocument();
		myDocument.addDocumentListener(new ListenText());
		add(textBox);
	}
	
private class ListenText implements DocumentListener{

	@Override
	public void insertUpdate(DocumentEvent e) {
		System.out.println("Has introducido texto");
		
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		System.out.println("Has borrado texto");
		
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		
		
	}
	
}
	
}
