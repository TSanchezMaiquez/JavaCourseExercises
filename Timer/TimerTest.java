package Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimerTest {

	public static void main(String[] args) {
		
		//Temporizador myListener = new Temporizador();
										//Clase interna
		Timer myTimer = new Timer(3000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Date currentTime = new Date();
				System.out.println(currentTime);
				
			}
		});
		myTimer.start();
		
		JOptionPane.showMessageDialog(null,"Press aceptar to stop");

	}

}

/*class Temporizador implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Date currentTime = new Date();
		System.out.println(currentTime);
		
	}
	
	
}*/