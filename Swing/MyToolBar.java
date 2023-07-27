package Swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class MyToolBar {

	public static void main(String[] args) {
		
		FrameTB myFrame = new FrameTB();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
	}

}
class FrameTB extends JFrame{
	
	JPanel myPanel;
	
	public FrameTB() {
		
		this.setBounds(300, 300, 500, 350);
		
		myPanel = new JPanel();
		add(myPanel);
		
	
		setColor redB = new setColor("Rojo", Color.RED, new ImageIcon("C:\\Users\\yunni\\Desktop\\Curso Java\\CursoJava\\src\\Switch\\red.jpg"));
		setColor greenB = new setColor("Verde", Color.GREEN, new ImageIcon("C:\\Users\\yunni\\Desktop\\Curso Java\\CursoJava\\src\\Switch\\green.jpg"));
		setColor blueB = new setColor("Azul", Color.BLUE, new ImageIcon("C:\\Users\\yunni\\Desktop\\Curso Java\\CursoJava\\src\\Switch\\blue.jpg"));
		
		JToolBar myToolBar = new JToolBar();
		myToolBar.add(redB);
		myToolBar.add(greenB);
		myToolBar.add(blueB);
		
		add(myToolBar, BorderLayout.NORTH);
		
		
	}
	private class setColor extends AbstractAction{

		
		
		public setColor (String nombre, Color colorFondo, Icon icon) {
			
			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icon);
			putValue(Action.SMALL_ICON, icon);
			putValue(Action.SHORT_DESCRIPTION, "Change the panel colour to "+nombre);
			putValue("Color_fondo_JPanel", colorFondo);
			
			
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			
			Color c=(Color) getValue("Color_fondo_JPanel");
			myPanel.setBackground(c);
			System.out.println("Nombre: "+getValue(Action.NAME)+ "\nDescripcion: "
			+getValue(Action.SHORT_DESCRIPTION)+".\n");
		}

		
		
		}
	}