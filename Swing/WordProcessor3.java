package Swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.InputEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.text.StyledEditorKit;
import java.awt.event.KeyEvent;


public class WordProcessor3 {

public static void main(String[] args) {
		
		MyFrameWP3 myFrame = new MyFrameWP3();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		

	}

}
class MyFrameWP3 extends JFrame {
	
	public MyFrameWP3 () {
		
		this.setBounds(500, 300, 550, 420);
		add (new MyPanelWP3());
	}
}
class MyPanelWP3 extends JPanel{
	JMenu font, style, size;
	JTextPane myArea;
	Font words;
	JButton barBold, barItalic, barUnderline, barBlue, barRed, barGreen, leftJ, centerJ, rightJ, justify;
	JToolBar bar;
	
	public MyPanelWP3() {
		
		setLayout (new BorderLayout());
		JPanel menuPanel = new JPanel();
		JMenuBar myBar = new JMenuBar();
		
		font = new JMenu ("Font");
		style = new JMenu ("Style");
		size = new JMenu ("Size");
		
		MenuConfig("Arial", "Font", "Arial", 9, 10,"");
		MenuConfig("Courier New", "Font", "Courier New", 9, 10,"");
		MenuConfig("Verdana", "Font", "Verdana", 9, 10,"");
		MenuConfig("Bold", "Style", "", Font.BOLD, 1,"C:\\Users\\yunni\\Desktop\\Curso Java\\CursoJava\\src\\Switch\\n.jpg");
		MenuConfig("Italian", "Style", "",Font.ITALIC, 1, "C:\\Users\\yunni\\Desktop\\Curso Java\\CursoJava\\src\\Switch\\i.jpg");
		
		ButtonGroup wordSize = new ButtonGroup();
		JRadioButtonMenuItem twelve = new JRadioButtonMenuItem("12");
		JRadioButtonMenuItem sixteen = new JRadioButtonMenuItem("16");
		JRadioButtonMenuItem eighteen = new JRadioButtonMenuItem("18");
		JRadioButtonMenuItem twenty = new JRadioButtonMenuItem("20");
		
		wordSize.add(twelve);
		wordSize.add(sixteen);
		wordSize.add(eighteen);
		wordSize.add(twenty);
		
		twelve.addActionListener(new StyledEditorKit.FontSizeAction("ChangeSize",12 ));
		sixteen.addActionListener(new StyledEditorKit.FontSizeAction("ChangeSize",16 ));
		eighteen.addActionListener(new StyledEditorKit.FontSizeAction("ChangeSize",18 ));
		twenty.addActionListener(new StyledEditorKit.FontSizeAction("ChangeSize",20 ));
		
		size.add(twelve);
		size.add(sixteen);
		size.add(eighteen);
		size.add(twenty);
		
		myBar.add(font);
		myBar.add(style);
		myBar.add(size);
		
		menuPanel.add(myBar);
		add(menuPanel, BorderLayout.NORTH);
		
		myArea = new JTextPane();
		add(myArea, BorderLayout.CENTER);
		
		JPopupMenu myPopup = new JPopupMenu();
		JMenuItem boldE = new JMenuItem ("Bold");
		JMenuItem italicE = new JMenuItem ("Italic");
		
		boldE.addActionListener(new StyledEditorKit.BoldAction());
		italicE.addActionListener(new StyledEditorKit.ItalicAction());
		
		myPopup.add(boldE);
		myPopup.add(italicE);
		
		myArea.setComponentPopupMenu(myPopup);
		
		bar = new JToolBar();
		
		BarConfig("C:\\Users\\yunni\\Desktop\\Curso Java\\CursoJava\\src\\Switch\\n.jpg").addActionListener(new StyledEditorKit.BoldAction());
		BarConfig("C:\\Users\\yunni\\Desktop\\Curso Java\\CursoJava\\src\\Switch\\i.jpg").addActionListener(new StyledEditorKit.ItalicAction());
		BarConfig("C:\\Users\\yunni\\Desktop\\Curso Java\\CursoJava\\src\\Switch\\s.jpg").addActionListener(new StyledEditorKit.UnderlineAction());
		
		bar.addSeparator();
		
		BarConfig("C:\\Users\\yunni\\Desktop\\Curso Java\\CursoJava\\src\\Switch\\blue.jpg").addActionListener(new StyledEditorKit.ForegroundAction("Pone_Azul", Color.BLUE));
		BarConfig("C:\\Users\\yunni\\Desktop\\Curso Java\\CursoJava\\src\\Switch\\red.jpg").addActionListener(new StyledEditorKit.ForegroundAction("Pone_Azul", Color.RED));
		BarConfig("C:\\Users\\yunni\\Desktop\\Curso Java\\CursoJava\\src\\Switch\\green.jpg").addActionListener(new StyledEditorKit.ForegroundAction("Pone_Azul", Color.GREEN));
		
		bar.addSeparator();
		
		BarConfig("C:\\Users\\yunni\\Desktop\\Curso Java\\CursoJava\\src\\Switch\\ji.jpg").addActionListener(new StyledEditorKit.AlignmentAction("Izquierda", 0));
		BarConfig("C:\\Users\\yunni\\Desktop\\Curso Java\\CursoJava\\src\\Switch\\jc.jpg").addActionListener(new StyledEditorKit.AlignmentAction("Centrado", 1));
		BarConfig("C:\\Users\\yunni\\Desktop\\Curso Java\\CursoJava\\src\\Switch\\jd.jpg").addActionListener(new StyledEditorKit.AlignmentAction("Derecha", 2));
		BarConfig("C:\\Users\\yunni\\Desktop\\Curso Java\\CursoJava\\src\\Switch\\j.jpg").addActionListener(new StyledEditorKit.AlignmentAction("Justificado", 3));
		
		bar.addSeparator();
		
		bar.setOrientation(1);
		add(bar, BorderLayout.WEST);
		
	}
	public JButton BarConfig(String ruta) {
		
		JButton button = new JButton (new ImageIcon(ruta));
		bar.add(button);
		
		return button;
	}
	public void MenuConfig (String sign, String menu, String wordType, int Styles, int sizes, String iconWay) {
		
		JMenuItem menuElement = new JMenuItem (sign, new ImageIcon(iconWay));
	
		if (menu== "Font") {
			font.add(menuElement);
			
		if(wordType == "Arial") {
			menuElement.addActionListener(new StyledEditorKit.FontFamilyAction("ChangeWord", "Arial"));
		}else if (wordType=="Courier New") {
			menuElement.addActionListener(new StyledEditorKit.FontFamilyAction("ChangeWord", "Courier New"));
		}else if(wordType== "Verdana") {
			menuElement.addActionListener(new StyledEditorKit.FontFamilyAction("ChangeWord", "Verdana"));
		}
	}else if(menu=="Style") {
		style.add(menuElement);
		
		if(Styles==Font.BOLD) {
			menuElement.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
			menuElement.addActionListener(new StyledEditorKit.BoldAction());
		}else if (Styles==Font.ITALIC) {
			menuElement.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));
			menuElement.addActionListener(new StyledEditorKit.ItalicAction());
		}
	}else if(menu=="size") {
		menuElement.addActionListener(new StyledEditorKit.FontSizeAction("ChangeSize", sizes));
	}
	}
}
