package Layout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layout2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FrameWithLayout2 miframe=new FrameWithLayout2();
		
		miframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miframe.setVisible(true);

	}

}

class FrameWithLayout2 extends JFrame{
	
	
	public FrameWithLayout2(){
		
		setTitle("Disposition");
		
		setBounds(600,350,600,300);
		
		PanelWithLayout2 mypanel=new PanelWithLayout2();
		
		PanelWithLayout3 mypanel2=new PanelWithLayout3();
		
		
		
		add(mypanel, BorderLayout.SOUTH);
		add(mypanel2, BorderLayout.NORTH);
		
	}
	
}

class PanelWithLayout2 extends JPanel{
	
		public PanelWithLayout2(){
			
			setLayout(new BorderLayout(0,0));
			
			
			
			add(new JButton("Blue"), BorderLayout.WEST);				
			add(new JButton("Green"), BorderLayout.EAST);
			add(new JButton("Black"));	
		}
}

class PanelWithLayout3 extends JPanel{
	 
	public PanelWithLayout3() {
		
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		add(new JButton("Yellow"));		
		add(new JButton("Red"));
	}
}