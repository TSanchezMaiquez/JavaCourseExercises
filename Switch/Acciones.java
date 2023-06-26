package Switch;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Acciones {

	public static void main(String[] args) {
	MyFrameC myframe = new MyFrameC();
	myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class MyFrameC extends JFrame{
	
	public MyFrameC() {
		
		this.setBounds(300, 300, 500, 350);
		this.add(new MyPanelC());
		this.setVisible(true);
		
	}
}
class MyPanelC extends JPanel {
	
	public MyPanelC() {
		
		
		setColor redB = new setColor("Rojo", Color.RED);
		setColor greenB = new setColor("Verde", Color.GREEN);
		setColor blueB = new setColor("Azul", Color.BLUE);
		
		this.add(new JButton (redB));
		this.add(new JButton(greenB));
		this.add(new JButton (blueB));
		
		/*JButton redB = new JButton ("Rojo");
		JButton greenB = new JButton ("verde");
		JButton blueB = new JButton ("Azul");
		
		redB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.RED);	
			}	
		});
		greenB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.GREEN);	
			}	
		});
		blueB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.BLUE);	
			}
		});
		
		this.add(redB);
		this.add(greenB);
		this.add(blueB);*/
		
		
		
	}
class setColor extends AbstractAction{

	public setColor (String nombre, Color colorFondo) {
		
		putValue(Action.NAME, nombre);
		putValue(Action.SHORT_DESCRIPTION, "Pone la lamina de color "+nombre);
		putValue("Color_fondo_JPanel", colorFondo);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Color c=(Color) getValue("Color_fondo_JPanel");
		setBackground(c);
		System.out.println("Nombre: "+getValue(Action.NAME)+ "\nDescripcion: "
		+getValue(Action.SHORT_DESCRIPTION)+".\n");
	}

	
	
}
}
