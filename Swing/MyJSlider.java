package Swing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class MyJSlider {

public static void main(String[] args) {
		
		/*JFrame myFrame = new JFrame();
		
		myFrame.setSize(600, 600);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLocation(520, 150);
		myFrame.setVisible(true);*/
		
		MyJFrame66 myFrame = new MyJFrame66();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
	}

}

class MyJFrame66 extends JFrame {
	
	public MyJFrame66 () {
	
		this.setBounds(500, 250, 600,400);
		add(new MyPanel66());
		
		
		
	}
}
class MyPanel66 extends JPanel{
	
	JLabel text1;
	JComboBox myCombo;
	JSlider mySlider;
	
	public MyPanel66() {
		
		setLayout (new BorderLayout());
		
		text1 = new JLabel ("Hello World");
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
		
		mySlider = new JSlider(8,44,26);
		mySlider.setMajorTickSpacing(12);
		mySlider.setMinorTickSpacing(2);
		mySlider.setPaintTicks(true);
		mySlider.setPaintLabels(true);
		
		mySlider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				text1.setFont(new Font((String) myCombo.getSelectedItem(), Font.PLAIN, mySlider.getValue()));
				
			}
			
		});
		
		upper.add(mySlider);
		
		
		add(upper, BorderLayout.NORTH);
	}
	private class EventCombo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
		
			text1.setFont(new Font((String) myCombo.getSelectedItem(), Font.PLAIN, mySlider.getValue()));
			
		}
		
	}
	
}
