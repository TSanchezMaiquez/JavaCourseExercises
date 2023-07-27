package Swing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class WordProcessor {

	public static void main(String[] args) {
		
		MyFrameWP myFrame = new MyFrameWP();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		

	}

}
class MyFrameWP extends JFrame{
	
	public MyFrameWP(){
		
		this.setBounds(600, 300, 600, 400);
		add(new MyPanelWP());
	}
}
class MyPanelWP extends JPanel{
	
	JTextPane myArea;
	JMenu font, style, size;
	
	
	public MyPanelWP () {
		
		setLayout(new BorderLayout());
		
		JPanel upper = new JPanel();
		
		JMenuBar myMenu = new JMenuBar();
		
		font = new JMenu ("Font");
		style = new JMenu ("Style");
		size = new JMenu ("Size");
		
		MenuConfig("Arial", "Font", "Arial", 1,12);
		MenuConfig("Verdana", "Font", "Verdana", 1,12);
		MenuConfig("Courier New", "Font", "Courier New", 1,12);
		
		myMenu.add(font);
		myMenu.add(style);
		myMenu.add(size);
		
		
		//------------------------------------------
		
		MenuConfig("Bond", "Style","", Font.BOLD, 12);
		MenuConfig("Italic", "Style", "", Font.ITALIC, 12);
		
		//-----------------------------------------
		
		MenuConfig ("12", "Size", "", 1, 12);
		MenuConfig ("16", "Size", "", 1, 16);
		MenuConfig ("18", "Size", "", 1, 18);
		MenuConfig ("20", "Size", "", 1, 20);
		
		//-----------------------------------------
		
		myArea = new JTextPane();
		
		
		add(myArea, BorderLayout.CENTER);
		upper.add(myMenu);
		add(upper, BorderLayout.NORTH);
		
	}
	
	public void MenuConfig(String rotulo, String menu, String fontType, int styles, int sizeItem) {
		
		JMenuItem menuItem = new JMenuItem(rotulo);
		
		if(menu =="Font") font.add(menuItem);
		else if (menu=="Style") style.add(menuItem);
		else if (menu=="Size") size.add(menuItem);
		
		menuItem.addActionListener(new EventManagement(rotulo, fontType, styles, sizeItem));
	}
	
	private class EventManagement implements ActionListener{
		
		String rotulo, fontType;
		int styles, sizeItems;
		Font currentFont;
		
		public EventManagement (String rotulo, String fontType, int styles, int sizeItems) {
		
			this.rotulo=rotulo;
			this.fontType=fontType;
			this.styles=styles;
			this.sizeItems=sizeItems;
	}

	@Override
public void actionPerformed(ActionEvent e) {
		
		currentFont= myArea.getFont();
		
		if(rotulo=="Arial" || rotulo =="Courier New" || rotulo=="Verdana") {
			
			styles=currentFont.getStyle();
			sizeItems=currentFont.getSize();
		}else if (rotulo=="Bond" || rotulo =="Italic" ) {
			if(currentFont.getStyle()==1 || currentFont.getStyle()==2) {
				styles=3;
			}
			fontType=currentFont.getFontName();
			sizeItems=currentFont.getSize();
		}else if (rotulo=="12" || rotulo =="16" || rotulo=="18" || rotulo =="20"){
			
			fontType=currentFont.getFontName();
			styles=currentFont.getStyle();
		}
			
		myArea.setFont (new Font (fontType, styles, sizeItems));
		
		
		}
	}
}
