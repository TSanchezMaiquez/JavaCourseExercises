package Eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Evento1 {

	public static void main(String[] args) {
		
		MyFrame myFrame = new MyFrame();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;

	}

}
//En este caso el oyente son los colores
class MyFrame extends JFrame{

	public MyFrame() {
		this.setTitle("Botones y eventos");
		this.setBounds(300, 300, 800, 450);
		MyPanel myPanel = new MyPanel();
		this.add(myPanel);
		this.setVisible(true);
	}

}

class MyPanel extends JPanel{
	
	JButton button = new JButton ("azul");
	JButton buttonR = new JButton ("Rojo");
	JButton buttonG = new JButton ("Verde");
	
	public MyPanel () {
		
		this.add(button);
		this.add(buttonR);
		this.add(buttonG);
		
		JPanelColor Azul = new JPanelColor(Color.BLUE);
		JPanelColor rojo = new JPanelColor(Color.RED);
		JPanelColor verde = new JPanelColor(Color.GREEN);
		
		button.addActionListener(Azul);
		buttonR.addActionListener(rojo);
		buttonG.addActionListener(verde);
	}
	
	private class JPanelColor implements ActionListener{

		private Color JPanelColor;
		
		public JPanelColor(Color color) {
			JPanelColor=color;
			
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			setBackground(JPanelColor);
			
		}
		
	}
}

//En este caso el oyente es el JPanel
/*class MyFrame extends JFrame{
	
	public MyFrame() {
		this.setTitle("Botones y eventos");
		this.setBounds(300, 300, 800, 450);
		MyPanel myPanel = new MyPanel();
		this.add(myPanel);
		this.setVisible(true);
	}
}

class MyPanel extends JPanel implements ActionListener{
	
	JButton button = new JButton ("azul");
	JButton buttonR = new JButton ("Rojo");
	JButton buttonG = new JButton ("Verde");
	
	
	public MyPanel () {
		this.add(button);
		this.add(buttonR);
		this.add(buttonG);
		button.addActionListener(this);
		buttonR.addActionListener(this);
		buttonG.addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) this.setBackground(Color.BLUE);
		else if (e.getSource()==buttonR) this.setBackground(Color.RED);
		else this.setBackground(Color.GREEN);
		
	}
	
	
}*/