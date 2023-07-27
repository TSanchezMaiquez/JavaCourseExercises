package Swing;

import java.awt.Frame;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class WindowEvent {

	public static void main(String[] args) {
		
		MyFrame8 myFrame= new MyFrame8();
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
			
		//myFrame.addWindowListener(new WindowEvent2());
		myFrame.addWindowStateListener(new WindowEvent2());
		
	}

}
class MyFrame8 extends JFrame{
	
	public MyFrame8 (){
		
		this.setBounds(300, 300, 600, 350);
		this.setVisible(true);
	}

	
}
//Esta tercera clase informa de cualquier cambio que se realice en la ventana.
class WindowEvent2 implements WindowStateListener{

	@Override
	public void windowStateChanged(java.awt.event.WindowEvent e) {
		System.out.println("LA ventana ha cambiado de estado.");
		System.out.println("El numero indica el cambio que ha sufrido la ventana "+
		" el cual corresponde a la propiedad estatica correspondiente de la clase. \n"+e.getNewState());
	
	/*if(e.getNewState()==Frame.MAXIMIZED_BOTH)System.out.println("Ventana maximizada.");
	else if (e.getNewState()==Frame.ICONIFIED)System.out.println("Ventana minimizada");
	else System.out.println("Has hecho un cambio sin especificar.");*/
	}
	
}

/*class WindowEvent2 extends WindowAdapter {
	
	@Override
	public void windowClosed(java.awt.event.WindowEvent e) {
		System.out.println("Ventana cerrada. Programa cerrado.");
		
	}
	
	@Override
	public void windowOpened(java.awt.event.WindowEvent e) {
		
		System.out.println("Bienvenido.");
		
	}
}*/


//Al implementar esta interface estamos obligados a implementar muchos metodos que pueden ser innecesarios
// para evitar eso existe la clase WindowAdapter, que implementa 4 interface. Si heredados de esa clase
//tendremos acceso a todos los metodos de los que dispone pero solo implementaremos los que necesitemos.
/*class WindowEvent2 implements WindowListener {

	@Override
	public void windowOpened(java.awt.event.WindowEvent e) {
		
		System.out.println("Ventana abierta");
		
	}

	@Override
	public void windowClosing(java.awt.event.WindowEvent e) {
		System.out.println("La ventana se esta cerrando");
	}

	@Override
	public void windowClosed(java.awt.event.WindowEvent e) {
		System.out.println("Ventana cerrada");
		
	}

	@Override
	public void windowIconified(java.awt.event.WindowEvent e) {
		
		System.out.println("Ventana minimizada");
		
	}

	@Override
	public void windowDeiconified(java.awt.event.WindowEvent e) {
		System.out.println("Ventana restaurada tras minimizar");
		
	}

	@Override
	public void windowActivated(java.awt.event.WindowEvent e) {
		System.out.println("Ventana activada. Primer plano");
		
	}

	@Override
	public void windowDeactivated(java.awt.event.WindowEvent e) {
		
		System.out.println("Ventana desactivada. Segundo plano.");
		
	}
	
}*/