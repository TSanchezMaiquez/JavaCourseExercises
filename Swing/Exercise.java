package Swing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Exercise {

	public static void main(String[] args) {
		MyFrameE1 myFrame = new MyFrameE1();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);

	}

}
class MyFrameE1 extends JFrame{
	
	public MyFrameE1() {
		this.setBounds(400, 300, 550, 280);
		add(new MyPanelE1());
		
	}
}
class MyPanelE1 extends JPanel{
	
	private JLabel name, surname;
	private JTextField text1, text2;
	private JButton button1, button2;
	private JCheckBox option1, option2;
	private JRadioButton choice1, choice2; 
	private JTextArea myTextArea;
	private int count=0;
	
	public MyPanelE1() {
		
		setLayout(new BorderLayout());
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		
		name = new JLabel("name");
		panel1.add(name, BorderLayout.NORTH);
		
		text1 = new JTextField(15);
		panel1.add(text1, BorderLayout.NORTH);
		
		surname = new JLabel("Surname");
		panel1.add(surname, BorderLayout.NORTH);
		
		text2 = new JTextField(15);
		panel1.add(text2, BorderLayout.NORTH);
		
		add(panel1, BorderLayout.NORTH);
		
		myTextArea = new JTextArea(10,40);
		JScrollPane scrollPanel = new JScrollPane(myTextArea);
		myTextArea.setLineWrap(true);
		panel2.add(scrollPanel, BorderLayout.CENTER);
		
		add(panel2, BorderLayout.CENTER);
		
		button1 = new JButton("Button1");
		panel3.add(button1, BorderLayout.SOUTH);
		button1.addActionListener(new AllEventsControl());
		
		button2 = new JButton("Button2");
		panel3.add(button2, BorderLayout.SOUTH);
		button2.addActionListener(new AllEventsControl());
		
		option1 = new JCheckBox("Option 1");
		option1.setSelected(true);
		panel3.add(option1, BorderLayout.SOUTH);
		option1.addActionListener(new AllEventsControl());
		
		option2 = new JCheckBox("Option 2");
		panel3.add(option2, BorderLayout.SOUTH);
		option2.addActionListener(new AllEventsControl());
		
		ButtonGroup myGroup = new ButtonGroup();
		
		choice1 = new JRadioButton ("choice 1");
		panel3.add(choice1, BorderLayout.SOUTH);
		choice1.addActionListener(new AllEventsControl());
		
		choice2 = new JRadioButton ("choice 2");
		panel3.add(choice2, BorderLayout.SOUTH);
		choice2.addActionListener(new AllEventsControl());
		
		myGroup.add(choice1);
		myGroup.add(choice2);
		
		add(panel3, BorderLayout.SOUTH);
		
	}
	private class AllEventsControl implements ActionListener{
		 @Override
	        public void actionPerformed(ActionEvent e) {
	            StringBuilder total = new StringBuilder(myTextArea.getText());

	            if (count == 0) {
	                total.insert(0, text1.getText() + " " + text2.getText() + " is using the programme\n");
	                count++;
	            }

	            if (e.getSource() == button1) {
	                total.append("Button1 pressed\n");
	            } else if (e.getSource() == button2) {
	                total.append("Button2 pressed\n");
	            } else if (e.getSource() == option1) {
	            	if(option1.isSelected())
	                total.append("Option1 selected\n");
	            	else total.append("Option1 deselected\n");
	            } else if (e.getSource() == option2) {
	            	if(option2.isSelected())
		                total.append("Option2 selected\n");
		            else total.append("Option2 deselected\n");
	            } else if (e.getSource() == choice1) {
	                total.append("Choice1 selected\n");
	            } else if (e.getSource() == choice2) {
	                total.append("Choice2 selected\n");
	            }

	            myTextArea.setText(total.toString());
	        }
	    }
	}
