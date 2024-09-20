package Skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class LatinPlantNames {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LatinPlantNames window = new LatinPlantNames();
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
	public LatinPlantNames() {
		initialize();
	}
	
	
	


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 194, 194);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 168, 144);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel prompt = new JLabel("Select a plant name:");
		prompt.setBounds(10, 11, 141, 14);
		prompt.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(prompt);
		

		JLabel display = new JLabel("");
		display.setBounds(10, 67, 131, 14);
		display.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(display);
		
		String[] names = {"basil", "lavender", "parsley", "peppermint", "saffron", "sage"};
		
		JComboBox plantNames = new JComboBox(names);
		plantNames.setBounds(10, 36, 104, 20);
		plantNames.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				switch((String) plantNames.getSelectedItem())
				{
				case "basil":
					display.setText("Ocimum");
				break;
				
				case "lavender":
					display.setText("Lavandula spica");
				break;
				
				case "parsley":
					display.setText("Apium");
				break;
				
				case "peppermint":
					display.setText("Mentha piperita");
				break;
				
				case "saffron":
					display.setText("Crocus");
				break;
				
				case "sage":
					display.setText("Salvia");
				break;
					
				default:
					display.setText("");
				}
			}
		});
		plantNames.setModel(new DefaultComboBoxModel(new String[] {"basil", "lavender", "parsley", "peppermint", "saffron", "sage"}));
		plantNames.setSelectedIndex(0);
		plantNames.setFont(new Font("Arial", Font.ITALIC, 15));
		panel.add(plantNames);
		

		
		


		
		
	}
}
