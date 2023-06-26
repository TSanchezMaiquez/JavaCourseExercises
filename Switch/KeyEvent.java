package Switch;

import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class KeyEvent {

	public static void main(String[] args) {
		MyFrame9 myFrame = new MyFrame9();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.addKeyListener( new KeyEvent2());
	}

	

}
class MyFrame9 extends JFrame {
	
	public MyFrame9() {
		this.setBounds(300, 300, 600,350);
		this.setVisible(true);
		
	}
	
}
class KeyEvent2 implements KeyListener{

	@Override
	public void keyTyped(java.awt.event.KeyEvent e) {
		System.out.println("Estas pulsando una tecla");
		
	}

	@Override
	public void keyPressed(java.awt.event.KeyEvent e) {
		//System.out.println("Has pulsado una tecla: "+e.getKeyChar()+ " "+ e.getKeyCode());
		if(e.getKeyCode()==e.VK_RIGHT) {
			System.out.println("Derecha");
		}
	}

	@Override
	public void keyReleased(java.awt.event.KeyEvent e) {
		//System.out.println("Has soltado una tecla");
		
	}
	
}
