package Skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class SemAvg {

	private JFrame frame;
	private JTextField gr1;
	private JTextField gr2;
	private JTextField gr3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SemAvg window = new SemAvg();
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
	public SemAvg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 348, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 332, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblGrade = new JLabel("Grade #2");
		lblGrade.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGrade.setBounds(10, 45, 68, 19);
		panel.add(lblGrade);
		
		JLabel lblNewLabel_1_1 = new JLabel("Grade #3");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(10, 75, 68, 19);
		panel.add(lblNewLabel_1_1);
		
		gr1 = new JTextField();
		gr1.setBounds(82, 16, 68, 20);
		panel.add(gr1);
		gr1.setColumns(10);
		
		gr2 = new JTextField();
		gr2.setColumns(10);
		gr2.setBounds(82, 46, 68, 20);
		panel.add(gr2);
		
		gr3 = new JTextField();
		gr3.setColumns(10);
		gr3.setBounds(82, 76, 68, 20);
		panel.add(gr3);
		
		JLabel disp = new JLabel("");
		disp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		disp.setBounds(172, 16, 150, 170);
		panel.add(disp);
		
		
		JLabel lblGrade_2 = new JLabel("Grade #1");
		lblGrade_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGrade_2.setBounds(10, 15, 68, 19);
		panel.add(lblGrade_2);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() 
		{
			
			
			public void actionPerformed(ActionEvent e) 
			{
				DecimalFormat dc = new DecimalFormat("0.00");
				
				double grTx1 = Double.parseDouble(gr1.getText());
				double grTx2 = Double.parseDouble(gr2.getText());
				double grTx3 = Double.parseDouble(gr3.getText());
				
				double average = (grTx1 + grTx2 + grTx3) / 3;
				
				disp.setText(dc.format(average));
				
			}
			
			
			
		});
		btnNewButton.setBounds(10, 119, 140, 50);
		panel.add(btnNewButton);
		

	}
}
