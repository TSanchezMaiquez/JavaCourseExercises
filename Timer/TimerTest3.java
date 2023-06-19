package Timer;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimerTest3 {

	public static void main(String[] args) {
		
		Watch2 myWatch = new Watch2 ();
		myWatch.runTime(3000, true);
		
		JOptionPane.showMessageDialog(null, "Press aceptar to finish");
		

	}

}

class Watch2{

	
	public void runTime(int interval, boolean sound) {
		
		class GiveMeTime implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				Date now = new Date();
				
				System.out.println("I Show the time every 3 seconds "+ now);
				
				if(sound) {
					Toolkit.getDefaultToolkit().beep();
				}
			}
			
		}
		
		
		ActionListener listen = new GiveMeTime();
		Timer myTemp = new Timer (interval, listen);
		
		myTemp.start();
	}
	

	
}
