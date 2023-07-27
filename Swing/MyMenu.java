package Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MyMenu {
	public static void main(String [] args) {
		
		MyFrameE myFrame = new MyFrameE();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		
	}
}
class MyFrameE extends JFrame{
	
	public MyFrameE() {
		
		setBounds(600, 300, 600, 400);
		add(new MyPanelE());
	}
}
class MyPanelE extends JPanel{
	
	public MyPanelE() {
		
		JMenuBar myMenuBar = new JMenuBar();
		
		JMenu file = new JMenu ("File");
		JMenu edition = new JMenu ("Edition");
		JMenu tool = new JMenu ("Tools");
		
		myMenuBar.add(file);
		myMenuBar.add(edition);
		myMenuBar.add(tool);
		
		//---------------------------
		
		JMenuItem save = new JMenuItem("Save");
		JMenuItem saveAs = new JMenuItem("Save as");
		
		saveAs.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Has pulsado en \"guardar como\"");
				
			}
			
		});
		
		file.add(save);
		file.add(saveAs);
		
		//--------------------------------
		
		JMenuItem cut = new JMenuItem("Cut");
		JMenuItem copy = new JMenuItem("Copy");
		JMenuItem paste = new JMenuItem("Paste");
		
		edition.add(cut);
		edition.add(copy);
		edition.add(paste);
		
		//--------------------------------------
		
		JMenuItem option = new JMenuItem("Options");
		JMenu preference = new JMenu ("Preferences");
		
		tool.add(option);
		tool.addSeparator();
		tool.add(preference);
		
		//---------------------------------------------
		
		JMenuItem general = new JMenuItem("General Preferences");
		JMenuItem help = new JMenuItem("Help");
		
		preference.add(general);
		preference.add(help);
		
		add(myMenuBar);
		
		
		
	}
}