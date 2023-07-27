package flujoStreamsDeDatos;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Exercise {

	public static void main(String[] args) {

		
		ExerciseJF myFrame = new ExerciseJF();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
	}

}

class ExerciseJF extends JFrame{
	
	public ExerciseJF () {
		
		this.setBounds(300, 300, 500, 350);
		this.setTitle("File access and writing");
		add (new ExerciseJP());
	}
}

class ExerciseJP extends JPanel{
	
	JPanel southPanel;
	JTextArea myTextArea;
	
	public ExerciseJP() {
		
		this.setLayout(new BorderLayout());
		
		myTextArea = new JTextArea(7,25);
		JScrollPane scrollPanel = new JScrollPane(myTextArea);
		myTextArea.setLineWrap(true);
		add(scrollPanel, BorderLayout.CENTER);
		
		southPanel = new JPanel();
		
		addButton("Write");
		addButton("Delete");
		addButton("Read");
		
		add(southPanel, BorderLayout.SOUTH);
		
		
	}
	private void addButton(String name) {
		JButton button = new JButton(name);
		button.addActionListener(new checkButton());
		southPanel.add(button);
		
	}
	private class checkButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String lastEnter = e.getActionCommand();
			
			if(lastEnter.equals("Write")) {
				String text= myTextArea.getText();
				
				try {
					FileWriter writing = new FileWriter("C:\\Users\\yunni\\Desktop\\Curso Java\\CursoJava\\src\\flujoStreamsDeDatos\\NewStream.txt", true);
					writing.write("\n");
					for (int i = 0; i < text.length(); i++) {
						writing.write(text.charAt(i));
					}
					
					writing.close();
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if(lastEnter.equals("Delete")) {
				myTextArea.setText("");
			}
			if(lastEnter.equals("Read")) {
				String finaltext="";
				try {
					FileReader enter = new FileReader ("C:\\Users\\yunni\\Desktop\\Curso Java\\CursoJava\\src\\flujoStreamsDeDatos\\NewStream.txt");
					
					int character =0;
					while(character!=-1) {
						character=enter.read();
						char finalchar =(char)character;
						 finaltext+=finalchar;
					}
					enter.close();
					myTextArea.setText(finaltext);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
			
		}
		
	}
}