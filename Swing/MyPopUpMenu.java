package Swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

public class MyPopUpMenu {

	public static void main(String[] args) {
		

		FramePM myFrame = new FramePM();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
	}

}

class FramePM extends JFrame{
	
	public FramePM () {
		
		this.setBounds(300, 300, 400, 300);
		add(new PanelPM());
	}
}

class PanelPM extends JPanel{
	
	public PanelPM () {
		
		JPopupMenu popup = new JPopupMenu();
		
		JMenuItem red = new JMenuItem("Red");
		JMenuItem blue = new JMenuItem("Blue");
		JMenuItem green = new JMenuItem("Green");
		
		red.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.RED);
			}
		});
		blue.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.BLUE);
			}
		});
		green.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.GREEN);
			}
		});
		
		popup.add(red);
		popup.add(blue);
		popup.add(green);
		
		setComponentPopupMenu(popup);
	}
}