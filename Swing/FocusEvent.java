package Swing;

import java.awt.Graphics;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FocusEvent {

	public static void main(String[] args) {
		
		MyFrameB myframe = new MyFrameB();
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class MyFrameB extends JFrame {
	
	public MyFrameB() {
		this.setBounds(500, 300, 400, 250);
		this.add(new MyPanelB());
		this.setVisible(true);
	}
}
class MyPanelB extends JPanel {
	
	private JTextField campoText1, campoText2, campoText3;
	private JLabel etiq1, etiq2, etiq3;
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		
		campoText1=new JTextField();
		this.campoText1.setBounds(135, 10, 150, 20);
		
		etiq1=new JLabel("Nombre de usuario");
		this.etiq1.setBounds(15, 10, 150, 20);
		
		campoText2=new JTextField();
		this.campoText2.setBounds(135, 50, 150, 20);
		etiq2=new JLabel("Contraseña");
		this.etiq2.setBounds(15, 50, 150, 20);
		
		campoText3=new JTextField();
		this.campoText3.setBounds(135, 90, 150, 20);
		etiq3=new JLabel("Email");
		this.etiq3.setBounds(15, 90, 150, 20);
		
		
		
		this.add(campoText1);
		this.add(campoText2);
		this.add(campoText3);
		this.add(etiq1);
		this.add(etiq2);
		this.add(etiq3);
		
		
		FocusEventsB foco = new FocusEventsB();
		
		this.campoText1.addFocusListener(foco);
		this.campoText2.addFocusListener(foco);
		this.campoText3.addFocusListener(foco);
		
	}
	
class FocusEventsB implements FocusListener{

	@Override
	public void focusGained(java.awt.event.FocusEvent e) {
		
	}

	@Override
	public void focusLost(java.awt.event.FocusEvent e) {
		if (e.getSource()==campoText2) {
			String contra = campoText2.getText();
			if(contra.length()<5) {
				System.out.println("La contraseña tiene menos de 5 caracteres");
			}
			
		}
		else if (e.getSource()==campoText3) {
			
			String regex="^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
			//if(campoText3.getText().contains("@")) {
			if(campoText3.getText().matches(regex)) {
				System.out.println("Email correcto");
			}else System.out.println("Email incorrecto");
			
		}
		
	}
	
}


}

