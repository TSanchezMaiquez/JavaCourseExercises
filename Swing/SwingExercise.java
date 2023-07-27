package Swing;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingExercise {

	public static void main(String[] args) {
		MyFrameP myframe = new MyFrameP();
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe.setVisible(true);

	}

}
class MyFrameP extends JFrame{
	
	public MyFrameP() {
		this.setBounds(550, 300, 340, 180);
		add(new MyPanelP());
	}
}

class MyPanelP extends JPanel{
	
	private JLabel user, password, email;
	private JTextField campText1, campText2, campText3;
	
	public void paintComponent (Graphics g) {
		
		this.campText1= new JTextField();
		this.campText1.setBounds(140, 10, 150, 25);
		
		this.campText2= new JTextField();
		this.campText2.setBounds(140, 50, 150, 25);
		
		this.campText3= new JTextField();
		this.campText3.setBounds(140, 90, 150, 25);
		
		user=new JLabel("Nombre de usuario");
		this.user.setBounds(15, 10, 150, 20);
		
		password=new JLabel("Contraseña");
		this.password.setBounds(15, 50, 150, 20);
		
		email=new JLabel("Email");
		this.email.setBounds(15, 90, 150, 20);
		
		campText1.addFocusListener(new Focus());
		
	
		this.add(user);
		this.add(campText1);
		this.add(campText2);
		this.add(password);
		this.add(campText3);
		this.add(email);
		
		campText1.requestFocus();
	}
	class Focus implements FocusListener{

		@Override
		public void focusGained(FocusEvent e) {
			
			
		}

		@Override
		public void focusLost(FocusEvent e) {
			if(e.getSource()==campText1) {
				
				if(campText1.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null,"El campo usuario no puede estar vacio.");
					campText1.requestFocus();
				}else {
					campText2.addFocusListener(new Focus());
				}
			}
			else if(e.getSource()==campText2) {
				
				if(campText2.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null,"El campo usuario no puede estar vacio.");
					campText2.requestFocus();
				}
			}
		}
		
	}
}

