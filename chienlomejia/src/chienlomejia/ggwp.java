package chienlomejia;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Font;

public class ggwp {

	private JFrame frame;
	private JTextField txtGgwp;
	private JTextField txtEdiwow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ggwp window = new ggwp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ggwp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel wew = new JLabel(" fgdh");
		frame.getContentPane().add(wew, BorderLayout.NORTH);
		
		txtGgwp = new JTextField();
		txtGgwp.setBackground(new Color(255, 255, 0));
		txtGgwp.setText("ggwp");
		frame.getContentPane().add(txtGgwp, BorderLayout.CENTER);
		txtGgwp.setColumns(5);
		
		txtEdiwow = new JTextField();
		txtEdiwow.setText("ediwow");
		frame.getContentPane().add(txtEdiwow, BorderLayout.EAST);
		txtEdiwow.setColumns(10);
		
		JButton wew_1 = new JButton("chienlo");
		wew_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		wew_1.setForeground(new Color(0, 0, 0));
		wew_1.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				String label2 = this.txtGgwp.getText();
				this.txtEdiwow.setText(lebel2);
				
			}
		});
		wew_1.setBackground(new Color(255, 128, 0));
		frame.getContentPane().add(wew_1, BorderLayout.SOUTH);
	}

}
