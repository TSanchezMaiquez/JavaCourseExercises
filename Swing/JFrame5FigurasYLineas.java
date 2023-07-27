package Swing;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrame5FigurasYLineas {

	public static void main(String[] args) {
	
		MyFrame3 myFrame = new MyFrame3();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}

class MyFrame3 extends JFrame{

	public MyFrame3() {
		
		this.setBounds(300, 300, 800, 400);
		
		MyPanel3 myPanel = new MyPanel3();
		myPanel.setBackground(Color.black);
		add(myPanel);
		
		this.setVisible(true);
		
	}
}

class MyPanel3 extends JPanel{
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		//Estamos haciendo un casting. Transformamos el objeto g en uno de Graphics"D y se almacena en g2
		Graphics2D g2 = (Graphics2D)g;
		
		Rectangle2D rectangle = new Rectangle2D.Double(100,100, 200, 150);
		float midash[] = {10.0f};
		
		BasicStroke miTrazo = new BasicStroke(4, BasicStroke.JOIN_BEVEL, BasicStroke.CAP_SQUARE, 15, midash, 0);
		
		g2.setPaint(new Color (100, 250, 40));
		g2.setStroke(miTrazo);
		g2.draw(rectangle);
		
		g2.setPaint(Color.MAGENTA);
		g2.fill(rectangle);
		
		/*g.drawRect(20, 20, 400, 100);
		g.drawLine(30, 30, 410, 30);
		g.fillRect(20, 200, 400, 100);*/
	}
}