package Layout;
import java.awt.FlowLayout;

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
			setLayout(new FlowLayout(FlowLayout.LEFT));
			
			add(new JButton("Yellow"));
			
			add(new JButton("Red"));	
			
			add(new JButton("Blue"));	
			
			
		}
}

