package Switch;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MultiListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyFrameD myframe=new MyFrameD();
		
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myframe.setVisible(true);

	}

}

class MyFrameD extends JFrame{
	
	public MyFrameD(){
		
		setTitle("Múltiples oyentes");
		
		setBounds(1200,100,300,200);
		
		MyPanelD panel=new MyPanelD();
		
		add(panel);
	}	
	
}

class MyPanelD extends JPanel{
	
	JButton closeB;
	
	public MyPanelD(){
		
		JButton newB=new JButton("New");
		
		add(newB);
		
		closeB=new JButton("Close all");
		
		add(closeB);	
		newB.addActionListener(new CreateFrame());	
		
		}		
	private class CreateFrame implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		
			NewFrame myframe = new NewFrame(closeB);
			myframe.setVisible(true);
			
		}
		
	}
		
	}

class NewFrame extends JFrame{
	
	private static int count=0;
	
	public NewFrame(JButton closeB) {
		
		count++;
		setTitle("Window "+ count);
		setBounds(50*count, 50*count, 350, 200);
		closeB.addActionListener(new CloseAll());
		
	}
	private class CloseAll implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
		
			dispose();
			count=0;
			
		}
		
	}
}