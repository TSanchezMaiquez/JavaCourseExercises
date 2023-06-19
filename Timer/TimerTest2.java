package Timer;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimerTest2 {

	public static void main(String[] args) {
		
		Watch myWatch = new Watch (3000, true);
		myWatch.runTime();
		
		JOptionPane.showMessageDialog(null, "Press aceptar to finish");
		

	}

}

class Watch{
	
	private int interval;
	private boolean sound;
	
	public Watch(int interval, boolean sound) {
		this.interval=interval;
		this.sound=sound;
	}
	
	public void runTime() {
		ActionListener listen = new GiveMeTime();
		Timer myTemp = new Timer (interval, listen);
		
		myTemp.start();
	}
	
	private class GiveMeTime implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			Date now = new Date();
			
			System.out.println("I Show the time every 3 seconds "+ now);
			
			if(sound) {
				Toolkit.getDefaultToolkit().beep();
			}
		}
		
	}
	
}