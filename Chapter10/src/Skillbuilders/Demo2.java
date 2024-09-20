package Skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Demo2 {

	private JFrame frame;
	private JTextField fnt;
	private JTextField lnt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo2 window = new Demo2();
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
	public Demo2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		ImageIcon CH = new ImageIcon("C:\\Users\\1100062079\\git\\CS30P3F2024\\Chapter10\\src\\images\\chhs.png");
		ImageIcon pear = new ImageIcon("C:\\Users\\1100062079\\git\\CS30P3F2024\\Chapter10\\src\\images\\sus.png");
		ImageIcon Wes = new ImageIcon("C:\\Users\\1100062079\\git\\CS30P3F2024\\Chapter10\\src\\images\\sussy.png");
		
		
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 563, 442);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 532, 392);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		fnt = new JTextField();
		fnt.addMouseListener(new MouseAdapter() {
			@Override
			
			public void mouseClicked(MouseEvent e) 
			{
				fnt.setText("");
				
			}
			
			
		});
		fnt.setBounds(27, 23, 128, 20);
		fnt.setForeground(Color.GRAY);
		fnt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		fnt.setText("first name");
		panel.add(fnt);
		fnt.setColumns(10);
		
		lnt = new JTextField();
		lnt.addMouseListener(new MouseAdapter() {
			@Override
			
			public void mouseClicked(MouseEvent e) 
			{
				lnt.setText("");
			}
			
			
		});
		lnt.setBounds(190, 23, 128, 20);
		lnt.setForeground(Color.GRAY);
		lnt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lnt.setText("last name");
		lnt.setColumns(10);
		panel.add(lnt);
		
		JLabel img = new JLabel("");
		img.setBounds(27, 228, 291, 142);
		panel.add(img);
		
		JComboBox grades = new JComboBox();
		grades.setFont(new Font("Tahoma", Font.PLAIN, 16));
		grades.setModel(new DefaultComboBoxModel(new String[] {"Select Grade", "10", "11", "12"}));
		grades.setBounds(27, 54, 128, 36);
		panel.add(grades);
		
		JComboBox schools = new JComboBox();
		schools.setModel(new DefaultComboBoxModel(new String[] {"Select School", "CHHS", "Pearson", "Western"}));
		schools.setFont(new Font("Tahoma", Font.PLAIN, 16));
		schools.setBounds(190, 54, 128, 36);
		panel.add(schools);
		
		JTextArea disp = new JTextArea();
		disp.setFont(new Font("Monospaced", Font.PLAIN, 12));
		disp.setBounds(27, 101, 291, 116);
		panel.add(disp);
		
		JButton submit = new JButton("Submit");
		submit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		submit.setForeground(Color.RED);
		submit.addActionListener(new ActionListener() {
			
			
			
			public void actionPerformed(ActionEvent e) 
			{ 
				String grade = " ";
				String school = " ";
				String fn = fnt.getText();
				String ln = lnt.getText();
				
				//grades
				if(grades.getSelectedItem().equals("10"))
				{
					grade = "10";
				}
				else if(grades.getSelectedItem().equals("11"))
				{
					grade = "11";
				}
				else
				{
					grade = "12";
				}
				
				
				//schools
				if(schools.getSelectedItem().equals("CHHS"))
				{
					school = "CHHS";
					img.setIcon(CH);
				}
				else if(schools.getSelectedItem().equals("Pearson"))
				{
					school = "Pearson";
					img.setIcon(pear);
				}
				else
				{
					school = "Western";
					img.setIcon(Wes);
				}
				
				
				//Display the information
				disp.setText
				(
				fn + " " + 
				ln + " is in grade " +
				grade + " and goes to " +
				school
				);
				
				
			}
			
			
		});
		submit.setBounds(370, 24, 152, 237);
		panel.add(submit);
		
		
		
	}
}
