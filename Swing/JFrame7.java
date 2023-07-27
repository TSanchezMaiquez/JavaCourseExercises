package Swing;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JFrame7 {

	public static void main(String[] args) {
	
		MyFrame4 myFrame = new MyFrame4();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}

class MyFrame4 extends JFrame{

	public MyFrame4() {
		
		this.setBounds(300, 300, 800, 400);
		
		MyPanel4 myPanel = new MyPanel4();
		add(myPanel);
		
		this.setVisible(true);
		
	}
}

class MyPanel4 extends JPanel{
	
	public MyPanel4() {
		fuenteElegida= JOptionPane.showInputDialog("Dime la fuente que quieres utilizar ");
		letraPresente=false;
		misFuentes= GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
	}
	private String fuenteElegida;
	boolean letraPresente;
	String [] misFuentes;
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		//Estamos haciendo un casting. Transformamos el objeto g en uno de Graphics"D y se almacena en g2
		Graphics2D g2 = (Graphics2D)g;
		
		Font miLetra;
		for(String nombreFuente: misFuentes) {
			if(nombreFuente.equals(fuenteElegida)) letraPresente=true;
		}
		
		if(letraPresente) miLetra= new Font(fuenteElegida, Font.BOLD, 25);
		else {
			g2.setPaint(Color.RED);
			g2.drawString("No se encontro el tipo especificado.", 10, 10);
			miLetra = new Font ("Arial", Font.BOLD, 25);
		}
		g2.setFont(miLetra);
		g2.setPaint(Color.BLUE);
		g2.drawString("Hola", 100, 100);
	}
	
}