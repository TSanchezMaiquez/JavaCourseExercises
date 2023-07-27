package Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class MyJRadioButton {

	public static void main(String[] args) {
		MyFrame28 myframe = new MyFrame28();
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe.setVisible(true);
		}

	}
class MyFrame28 extends JFrame{

	public MyFrame28 () {
		this.setBounds(600,300, 600, 400);
		add(new MyPanel28());
		
		}
	}

class MyPanel28 extends JPanel {
		
		private JRadioButton button1, button2, button3;
		
		
	public MyPanel28() {
		
		ButtonGroup myGroup = new ButtonGroup();
		
		button1 = new JRadioButton("Masculino");
		button2 = new JRadioButton("Femenino");
		button3 = new JRadioButton("Neutro");
		
		button1.addActionListener(new RadioButtonControl());
		button2.addActionListener(new RadioButtonControl());
		
		myGroup.add(button1);
		myGroup.add(button2);
		myGroup.add(button3);
		
		add(button1);
		add(button2);
		add(button3);
		
		
		}
	private class RadioButtonControl implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(button1.isSelected()) {
				System.out.println("Has seleccionado masculino");
			}
			
			else if(e.getSource()==button2) System.out.println("Has selecionado femenino");
			
		}
		
	}
	
	}
