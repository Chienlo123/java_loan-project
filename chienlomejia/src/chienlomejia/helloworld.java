package chienlomejia;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;



import javax.swing.JButton;

public class helloworld {

	public static void main(String[] args) {
		
		
		JFrame frame= new JFrame();
		JPanel panel = new JPanel();
		JLabel LABEL = new JLabel("Well Play");
        
		//panel setting
		panel.setBounds(200,80,200,200);
		panel.setBackground(Color.gray);
		JButton button = new JButton("Click Here");
		
		//button settings
		button.setBackground(Color.green);
		button.setBounds(250,100,100,30);
		
		
		//frame settings
		frame.setSize(600,600); //dimension
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Chienlo Kyut");
		
		
		//label setting
		LABEL.setBounds(270,100,100,100);
		
		
		//frame setting
		frame.add(LABEL);
		frame.add(button);
		frame.add(panel);
		
		
		frame.setLayout(null); 
		frame.setVisible(true);
		
		
		
		
	}

}
