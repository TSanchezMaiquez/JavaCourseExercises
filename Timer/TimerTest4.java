package Timer;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimerTest4 {

	public static void main(String[] args) {
		
		Watch3 myWatch = new Watch3 ();
		myWatch.runTime(3000, true);
		
		JOptionPane.showMessageDialog(null, "Press aceptar to finish");
		

	}

}

class Watch3{

	
	public void runTime(int interval, boolean sound) {
		
		Timer myTemp = new Timer (interval, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				Date now = new Date();
				
				System.out.println("I Show the time every 3 seconds "+ now);
				
				if(sound) {
					Toolkit.getDefaultToolkit().beep();
				}
				
			}
			
		});
		
		myTemp.start();
	}
	

	
}