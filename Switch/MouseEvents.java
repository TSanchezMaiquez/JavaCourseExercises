package Switch;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class MouseEvents {

	public static void main(String[] args) {
		myFrameA myframe = new myFrameA();
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe.addMouseListener(new MouseEventA());
	}

}

class myFrameA extends JFrame {
	
	public myFrameA() {
		this.setBounds(300, 300, 600, 350);
		this.setVisible(true);
	}
}
/*class MouseEventA implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("Estas arrastrando el raton");
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("Estas moviendo el raton");
		
	}
	
}*/
class MouseEventA extends MouseAdapter{
	//Aqui implemento los metodos que quiera de la interface MouseListener
	
	
	public void mousePressed(MouseEvent e) {
		System.out.println("Coordenada X: "+e.getX());
		System.out.println("Coordenada Y: "+e.getY());
		if(e.getModifiersEx()==1024) {
			System.out.println("El usuario ha pulsado el boton izquierdo del raton");
		}else if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK) {
			System.out.println("El usuario ha pulsado el boton derecho del raton");
		}
		
	}

}
/*class MouseEventA implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Has hecho click");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Has presionado");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Has soltado");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Has entrado");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Has salido");
		
	}
	
}*/