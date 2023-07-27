package Swing;

import javax.swing.JFrame;

public class JFrame2 {

	public static void main(String[] args) {
		
		MyFrame2 myFrame1 = new MyFrame2(600,400,400,100);
		MyFrame2 myFrame2 = new MyFrame2(500, 300, 600, 300);
		MyFrame2 myFrame3= new MyFrame2(400, 200, 800, 500);
		
		
	}




}

class MyFrame2 extends JFrame{
	
	public MyFrame2(int tamA, int tamB, int locA, int locB) {
		
		this.setSize(tamA, tamB);
		this.setLocation(locA, locB);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}