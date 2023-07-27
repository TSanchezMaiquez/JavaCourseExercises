package Swing;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MyJSpinner {

	public static void main(String[] args) {
		
		TextFrame1 myFrame = new TextFrame1();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class TextFrame1 extends JFrame{
	
	public TextFrame1() {
		this.setBounds(400, 200, 600, 450);
		this.setTitle("Writing on frame");
		
		add(new FirstPanel1());
		
		this.setVisible(true);
		
		
	}
}

class FirstPanel1 extends JPanel{
	
	public FirstPanel1() {
		
		String month[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio"
				, "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};	
		//JSpinner control = new JSpinner(new SpinnerListModel(month));
		
		JSpinner control = new JSpinner(new SpinnerNumberModel(5, -5, 15, 1));
	
		control.setPreferredSize(new Dimension(90, 20));
		control.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				System.out.println(control.getValue());
				
			}
			
		});
		
		add(control);
		
	}

		
	
	
	
}
