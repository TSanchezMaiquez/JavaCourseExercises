package Swing;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrame6Fuente {

	public static void main(String[] args) {
	
		MyFrame5 myFrame = new MyFrame5();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}

class MyFrame5 extends JFrame{

	public MyFrame5() {
		
		this.setBounds(300, 300, 800, 450);
		
		MyPanel5 myPanel = new MyPanel5();
		add(myPanel);
		
		this.setVisible(true);
		
	}
}

class MyPanel5 extends JPanel{
	
	private Image image;
	
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		
		File myImage = new File("C:\\Users\\yunni\\Desktop\\Curso Java\\CursoJava\\src\\Switch\\choc1.jpg");
		
		try {
			image=ImageIO.read(myImage);
		} catch (IOException e) {
			e.printStackTrace();
			}
		
		int anchuraImagen=image.getWidth(this);
		int alturaImagen=image.getHeight(this);
		
		g.drawImage(image, 0, 0, null);
		for (int i = 0; i < 800; i++) {
			for (int j = 0; j < 450; j++) {
						// Donde empieza(0,0), tamaño imagen, donde pintar la imagen copiada
				g.copyArea(0, 0, anchuraImagen, alturaImagen, anchuraImagen*i, alturaImagen*j);
			}
		}
	
		
		
		}
		
	
	
	

}