package Skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class DivisibleBy3 {

	private JFrame frame;
	private JTextField input;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DivisibleBy3 window = new DivisibleBy3();
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
	public DivisibleBy3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 317, 170);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 291, 120);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		input = new JTextField();
		input.setFont(new Font("Tahoma", Font.PLAIN, 15));
		input.setBounds(145, 17, 134, 25);
		panel.add(input);
		input.setColumns(10);
		
		JLabel prompt = new JLabel("Enter an integer:");
		prompt.setFont(new Font("Tahoma", Font.BOLD, 15));
		prompt.setBounds(10, 17, 125, 25);
		panel.add(prompt);
		
		JLabel disp = new JLabel("");
		disp.setFont(new Font("Tahoma", Font.PLAIN, 11));
		disp.setBounds(137, 77, 142, 25);
		panel.add(disp);
		
		JButton button = new JButton("Check");
		button.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) 
			{
				int number = Integer.parseInt(input.getText());
				
				
				if (number % 3 == 0)
				{
					disp.setText("Number is divisible by 3.");
				}
				
				else
				{
					disp.setText("Number is NOT divisible by 3.");
				}
				
			
			}
			
			
		});
		
		button.setBounds(10, 72, 125, 37);
		panel.add(button);
		
	}
}
