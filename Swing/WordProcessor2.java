package Swing;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.text.StyledEditorKit;


public class WordProcessor2 {

public static void main(String[] args) {
		
		MyFrameWP2 myFrame = new MyFrameWP2();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		

	}

}
class MyFrameWP2 extends JFrame{
	
	public MyFrameWP2(){
		
		this.setBounds(600, 300, 600, 400);
		add(new MyPanelWP2());
	}
}
class MyPanelWP2 extends JPanel{
	
	JTextPane myArea;
	JMenu font, style, size;
	
	
	public MyPanelWP2 () {
		
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
		
		if(menu =="Font") {
			font.add(menuItem);
			menuItem.addActionListener(new StyledEditorKit.FontFamilyAction("ChangeWord", fontType));
		}
		else if (menu=="Style") {
			style.add(menuItem);
			if(styles==Font.BOLD) {
				menuItem.addActionListener(new StyledEditorKit.BoldAction());
			}else{
				menuItem.addActionListener(new StyledEditorKit.ItalicAction());
			}
		}else if (menu=="Size") {
			size.add(menuItem);
			menuItem.addActionListener(new StyledEditorKit.FontSizeAction("ChangeWord", sizeItem));
		}
	}
}