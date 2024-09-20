package Masterys;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.lang.Math;
import java.awt.Color;
import java.awt.Font;

public class BreakAPlate {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakAPlate window = new BreakAPlate();
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
	public BreakAPlate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		ImageIcon placeholder = new ImageIcon("C:\\Users\\1100062079\\git\\CS30P3F2024\\Chapter10\\src\\images\\placeholder.gif");
		ImageIcon allBroke = new ImageIcon("C:\\Users\\1100062079\\git\\CS30P3F2024\\Chapter10\\src\\images\\plates_all_broken.gif");
		ImageIcon platesImg = new ImageIcon("C:\\Users\\1100062079\\git\\CS30P3F2024\\Chapter10\\src\\images\\plates.gif");
		ImageIcon sticker = new ImageIcon("C:\\Users\\1100062079\\git\\CS30P3F2024\\Chapter10\\src\\images\\sticker.gif");
		ImageIcon tiger = new ImageIcon("C:\\Users\\1100062079\\git\\CS30P3F2024\\Chapter10\\src\\images\\tiger_plush.gif");
		ImageIcon twoBroke = new ImageIcon("C:\\Users\\1100062079\\git\\CS30P3F2024\\Chapter10\\src\\images\\plates_two_broken.gif");

		
		
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 326);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 424, 276);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel prize = new JLabel("");
		prize.setHorizontalAlignment(SwingConstants.CENTER);
		prize.setBounds(127, 168, 170, 108);
		panel.add(prize);
		
		JLabel plates = new JLabel("");
		plates.setHorizontalAlignment(SwingConstants.CENTER);
		plates.setBounds(10, 11, 404, 82);
		panel.add(plates);
		
		JLabel disp = new JLabel("");
		disp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		disp.setHorizontalAlignment(SwingConstants.CENTER);
		disp.setBounds(92, 138, 239, 14);
		panel.add(disp);
		
		JButton button = new JButton("Play");
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBackground(new Color(223, 223, 223));
		button.addActionListener(new ActionListener() {
			
			
			
			public void actionPerformed(ActionEvent e) 
			{
				int win = (int)((2) * Math.random() + 1);
				button.setText("Play Again");

				
				if (win == 1)
				{
					prize.setIcon(sticker);
					disp.setText("You win: sticker");
					plates.setIcon(twoBroke);
				}
				else
				{
					prize.setIcon(tiger);
					disp.setText("You win: tiger plush");
					plates.setIcon(allBroke);
				}
			}
		});
		
		plates.setIcon(platesImg);
		
		button.setBounds(144, 104, 135, 34);
		panel.add(button);
		

		
		
	}
}
