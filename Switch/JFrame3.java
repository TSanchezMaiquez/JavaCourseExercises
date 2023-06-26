package Switch;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrame3 {

	public static void main(String[] args) {
		
		TextFrame myFrame = new TextFrame();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class TextFrame extends JFrame{
	
	public TextFrame() {
		this.setBounds(400, 200, 600, 450);
		this.setTitle("Writing on frame");
		
		FirstPanel mylamina = new FirstPanel();
		add(mylamina);
		
		this.setVisible(true);
		
		
	}
}

class FirstPanel extends JPanel{
	
	public FirstPanel() {
		this.setBackground(new Color (0));
	}
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		
		Color myColor = new Color (242, 101, 190);
		g.setColor(myColor);					
		Font myFont = new Font ("Verdana", 3, 25); //3:Bond+Italic
		g.setFont(myFont);
		g.drawString("First String", 20, 20);
		
		Color myColor2 = new Color (34, 216, 156);
		g.setColor(myColor2);
		Font myFont2 = new Font ("Verdana", Font.BOLD, 25);
		g.setFont(myFont2);
		g.drawString("Second String", 40, 40);
		
	}
	
	
}