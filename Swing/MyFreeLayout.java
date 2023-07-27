package Swing;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFreeLayout {

	public static void main(String[] args) {
		
		MyFreeFrame myFrame = new MyFreeFrame();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);

	}

}
class MyFreeFrame extends JFrame{
	
	public MyFreeFrame() {
		
		this.setBounds(450, 350, 350, 400);
		add(new MyFreePanel());
	}
}
class MyFreePanel extends JPanel{
	
	public MyFreePanel() {
		
		setLayout(new Columns());
		
		JLabel name = new JLabel("Name");
		JLabel subname = new JLabel("Subname");
		JLabel phoneN = new JLabel("PhoneN");
		
		
		JTextField nameF = new JTextField();
		JTextField subnameF = new JTextField();
		JTextField phoneNF = new JTextField();
		
		
		add(name);
		add(nameF);
		add(subname);
		add(subnameF);
		add(phoneN);
		add(phoneNF);
		
	}
}
class Columns implements LayoutManager{

	private int x=20;
	private int y=20;
	
	@Override
	public void addLayoutComponent(String name, Component comp) {
		
		
	}

	@Override
	public void removeLayoutComponent(Component comp) {
		
		
	}

	@Override
	public Dimension preferredLayoutSize(Container parent) {
		
		return null;
	}

	@Override
	public Dimension minimumLayoutSize(Container parent) {
		
		return null;
	}

	@Override
	public void layoutContainer(Container parent) {
		
		int n = parent.getComponentCount();
		
		for (int i = 0; i <n; i++) {
			
			//guarda componentes: botones, campos de texto....
			Component c = parent.getComponent(i);
			c.setBounds(x, y, 100, 20);
			x+=100;
			if(i%2!=0) {
				x=20;
				y+=40;
			}
		}
		
	}
	
	
}