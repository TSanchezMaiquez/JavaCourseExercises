package Layout;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layout1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FrameWithLayout miframe=new FrameWithLayout();
		
		miframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miframe.setVisible(true);

	}

}

class FrameWithLayout extends JFrame{
	
	
	public FrameWithLayout(){
		
		setTitle("Disposition");
		
		setBounds(600,350,600,300);
		
		PanelWithLayout mypanel=new PanelWithLayout();
		
		//FlowLayout disposition = new FlowLayout(FlowLayout.LEFT);
		//mypanel.setLayout(disposition);
		//mypanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		
		
		add(mypanel);
	
	}
	
}

class PanelWithLayout extends JPanel{
	
		public PanelWithLayout(){
			
			//Dependiendo del programa en el que estemos, será mejor 
			//implementar este Layout aqui o en Frame
			
			//setLayout(new FlowLayout(FlowLayout.CENTER));
			//setLayout(new FlowLayout(FlowLayout.CENTER, 50, 120));
			setLayout(new BorderLayout(10,10));
			
			
			
			add(new JButton("Yellow"), BorderLayout.NORTH);		
			add(new JButton("Red"), BorderLayout.SOUTH);		
			add(new JButton("Blue"), BorderLayout.WEST);				
			add(new JButton("Green"), BorderLayout.EAST);
			add(new JButton("Black"));	
		}
}

