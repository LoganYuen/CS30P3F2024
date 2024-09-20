package Masterys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MetricConversion {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversion window = new MetricConversion();
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
	public MetricConversion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 321, 151);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 295, 101);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel prompt = new JLabel("Select a conversion type:");
		prompt.setFont(new Font("Tahoma", Font.BOLD, 15));
		prompt.setFont(new Font("Tahoma", Font.BOLD, 15));
		prompt.setBounds(23, 11, 248, 14);
		panel.add(prompt);
		
		JLabel disp = new JLabel("");
		disp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		disp.setBounds(23, 76, 248, 14);
		panel.add(disp);
		
		JComboBox conversion = new JComboBox();
		conversion.setModel(new DefaultComboBoxModel(new String[] {"Click here to select", "Inches to centimeters", "Feet to meters", "Gallons to liters", "Pounds to kilograms"}));
		conversion.addActionListener(new ActionListener() {
			
			
			
			public void actionPerformed(ActionEvent e) 
			{
				
				if (conversion.getItemCount() >= 5)	
				{
					conversion.removeItemAt(0);
				}
				
				switch(conversion.getSelectedIndex())
				{
					case 0:
						disp.setText("1 inch = 2.54 centimeters");
					break;
					
					case 1:
						disp.setText("1 foot = 0.3048 meters");
					break;
					
					case 2:
						disp.setText("1 gallon = 4.5461 liters");
					break;
					
					case 4:
						disp.setText("1 pound = 0.4536 kilograms");
					break;
				}
				
			}
			
		});
		
		
		conversion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		conversion.setBounds(23, 36, 248, 22);
		panel.add(conversion);
		
	}
}
