package calculator;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculator {
	
	
	public static void main(String[] args) {
		MyFrame myframe = new MyFrame();
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe.setVisible(true);

	}

}
class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("Calculator");
		this.setBounds(550, 200, 340, 450);
		MyPanel mypanel = new MyPanel();
		add(mypanel);
		
	}
}

class MyPanel extends JPanel {
	
	private JPanel numeration;
	private JButton screen;
	private JPanel topPanel;
	private JButton result;
	private boolean start;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	
	public MyPanel() {
		
		start=true;
		setLayout(new BorderLayout());
		
	
		screen = new JButton("0");
		screen.setEnabled(false);
		screen.setPreferredSize(new Dimension(0, 80));
		Font myFont = new Font("Comic Sans MS", 3, 25);
		screen.setFont(myFont);

		result = new JButton("0");
		result.setEnabled(false);
		result.setPreferredSize(new Dimension(0, 60));
		Font resultFont = new Font("Comic Sans MS", 3, 18);
		result.setFont(resultFont);

		topPanel = new JPanel(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 1.0; // Permite que el botón se expanda horizontalmente
		topPanel.add(result, gbc);

		gbc.gridy = 1;
		topPanel.add(screen, gbc);

		add(topPanel, BorderLayout.NORTH);

		numeration = new JPanel();
		numeration.setLayout(new GridLayout(5, 4));

		createButton();

		add(numeration, BorderLayout.CENTER);
}
private void createButton() {
	    String[] buttons = {" % ","","","","7","8","9"," X ","6","5","4"," - ","1","2","3"," + ","0",".","="," / "};
	    for (int i = 0; i < buttons.length; i++) {
	        if (i == 1) {
	            ImageIcon icon = new ImageIcon("C:\\Users\\yunni\\Desktop\\Curso Java\\CursoJava\\src\\calculator\\!.png");
	            button1 = new JButton(buttons[i]);
	            button1.setIcon(icon);
	            button1.addActionListener(new InsertNumber());
	            numeration.add(button1);
	        } else if (i == 2) {
	            ImageIcon icon = new ImageIcon("C:\\Users\\yunni\\Desktop\\Curso Java\\CursoJava\\src\\calculator\\l.png");
	            button2 = new JButton(buttons[i]);
	            button2.setIcon(icon);
	            button2.addActionListener(new InsertNumber());
	            numeration.add(button2);
	        } else if (i == 3) {
	            ImageIcon icon = new ImageIcon("C:\\Users\\yunni\\Desktop\\Curso Java\\CursoJava\\src\\calculator\\del.png");
	            button3 = new JButton(icon);
	            button3.addActionListener(new InsertNumber());
	            numeration.add(button3);
	        } else {
	            JButton button = new JButton(buttons[i]);
	            button.addActionListener(new InsertNumber());
	            numeration.add(button);
	        }
	    }
}
private class InsertNumber implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			  String lastEnter = e.getActionCommand();
			  
			  Object source = e.getSource();

			  if (source == button1) {
				    String screenText = screen.getText();
				    String[] finalResult = screenText.split(" ");

				    if (finalResult.length == 1) {
				        double operation = Double.parseDouble(screenText) * Double.parseDouble(screenText);
				        screen.setText(operation + "");
				    } else {
				        double operation = Double.parseDouble(finalResult[finalResult.length - 1]) * Double.parseDouble(finalResult[finalResult.length - 1]);
				        screenText = screenText.substring(0, screenText.length() - finalResult[finalResult.length - 1].length()) + operation;
				        screen.setText(screenText);
				    }
				} else if (source == button2) {
				    String screenText = screen.getText();
				    String[] finalResult = screenText.split(" ");

				    if (finalResult.length == 1) {
				        double operation = Math.sqrt(Double.parseDouble(screenText));
				        DecimalFormat df = new DecimalFormat("#.##");
				        String text=(df.format(operation).replaceAll(",", "."));
				        screen.setText(text);
				    } else {
				        double operation = Math.sqrt(Double.parseDouble(finalResult[finalResult.length - 1]));
				        DecimalFormat df = new DecimalFormat("#.##");
				        screenText = screenText.substring(0, screenText.length() - finalResult[finalResult.length - 1].length()) + df.format(operation);
				        String text=(screenText.replaceAll(",", "."));
				        screen.setText(text);
				    }
				} else if (source == button3) {
			    	   String change = screen.getText();
			            if (!change.isEmpty()) {
			                change = change.substring(0, change.length() - 1);
			                screen.setText(change);
			            } 
			    } 
		       
			    else if(lastEnter.equals("=") ) {
					String [] finalResult=screen.getText().split(" ");
					FinalResult(finalResult);
					result.setText("Ans " +screen.getText());	
					
				}
		        else {
					if(start) {
					screen.setText(lastEnter);
					start=false;
					}
					else {
						screen.setText(screen.getText()+lastEnter);
					}
				}
		}
	
}
private void FinalResult (String [] fResult) {
	
	fResult=DeleteNull(fResult);
	double result=Double.parseDouble(fResult[0]);
	
	while(fResult.length!=1) {
		
		
		
		for (int i = 0; i < fResult.length; i++) {
			if(fResult[i].equals("%")) {
				if((i-2) >=0 && fResult[i-2].equals("-")) {
					result = Double.parseDouble(fResult[i - 3]) - (Double.parseDouble(fResult[i - 3]) * (Double.parseDouble(fResult[i - 1]) / 100));
					
					fResult[i-1]="";
					fResult[i-2]="";
					fResult[i-3]="";
					fResult[i]=result+"";
				}
				else if((i-2) >=0 && fResult[i-2].equals("+")) {
					result = Double.parseDouble(fResult[i - 3]) + (Double.parseDouble(fResult[i - 3]) * (Double.parseDouble(fResult[i - 1]) / 100));
					
					fResult[i-1]="";
					fResult[i-2]="";
					fResult[i-3]="";
					fResult[i]=result+"";
				}
				else {
					result= Double.parseDouble(fResult[i-1])/100;
					fResult[i-1]="";
					fResult[i]=result+"";
				}
			}
			fResult=DeleteNull(fResult);
		}
		
		for (int i = 0; i < fResult.length; i++) {
			if(fResult[i].equals("X")) {
				result= Double.parseDouble(fResult[i-1])*Double.parseDouble(fResult[i+1]);
				
				fResult[i+1]="";
				fResult[i-1]="";
				fResult[i]=result+"";
				
			}
			fResult=DeleteNull(fResult);
		}
		
		for (int i = 0; i < fResult.length; i++) {
			if(fResult[i].equals("/")) {
				result= Double.parseDouble(fResult[i-1])/Double.parseDouble(fResult[i+1]);
				
				fResult[i+1]="";
				fResult[i-1]="";
				fResult[i]=result+"";
			}
			fResult=DeleteNull(fResult);
		}
		
		for (int i = 0; i < fResult.length; i++) {
			if(fResult[i].equals("+")) {
				result= Double.parseDouble(fResult[i-1])+Double.parseDouble(fResult[i+1]);
				
				fResult[i+1]="";
				fResult[i-1]="";
				fResult[i]=result+"";
			}
			fResult=DeleteNull(fResult);
			}
		
		for (int i = 0; i < fResult.length; i++) {
			if(fResult[i].equals("-")) {
				result= Double.parseDouble(fResult[i-1])-Double.parseDouble(fResult[i+1]);
				
				fResult[i+1]="";
				fResult[i-1]="";
				fResult[i]=result+"";
			}
			fResult=DeleteNull(fResult);
			}
	}
	screen.setText(result+"");
		
}
private String [] DeleteNull(String [] fResult) {
	 ArrayList<String> temp = new ArrayList<>();

	    for (int i = 0; i < fResult.length; i++) {
	        if (!fResult[i].equals("")) {
	            temp.add(fResult[i]);
	        }
	    }
	    return temp.toArray(new String[0]);    
	}
}
