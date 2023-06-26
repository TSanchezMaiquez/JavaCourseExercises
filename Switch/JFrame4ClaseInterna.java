package Switch;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrame4ClaseInterna {

	public static void main(String[] args) {
		
		TextFrame2 myFrame = new TextFrame2();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class TextFrame2 extends JFrame{
	
	public TextFrame2() {
		this.setBounds(400, 200, 600, 450);
		this.setTitle("Writing on frame");
		
		
		this.setVisible(true);
		
		add(new JPanel() {
			
			public void paintComponent (Graphics g) {
				super.paintComponent(g);
				
				this.setBackground(new Color (140, 29,199));
				
				g.setColor(new Color (242, 101, 190));					
				
				g.setFont(new Font ("Verdana", 3, 25));  //3:Bond+Italic
				g.drawString("First String", 20, 20);
				
				
				g.setColor(new Color (34, 216, 156));
				
				g.setFont(new Font ("Verdana", Font.BOLD, 25));
				g.drawString("Second String", 40, 40);
				
			}
		}); 
	}
}


