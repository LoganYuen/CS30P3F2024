package Masterys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LocalBank {

	private JFrame frame;
	private JTextField acctNum;
	private JTextField amt;
	private JTextField fName;
	private JTextField lName;
	private JTextField bgBalance;
	
	Bank easySave = new Bank();
	private JLabel amtLabel;
	private JLabel fNameLabel;
	private JLabel lNameLabel;
	private JLabel bgBalanceLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LocalBank window = new LocalBank();
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
	public LocalBank() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 473);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 424, 423);
		frame.getContentPane().add(panel);
		
	
		


		
		acctNum = new JTextField();
		acctNum.setBounds(10, 70, 404, 23);
		acctNum.addMouseListener(new MouseAdapter() 
		{
			
			
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				acctNum.setText(null);
			}
		});
		panel.setLayout(null);
		panel.add(acctNum);
		acctNum.setColumns(10);
		
		amt = new JTextField();
		amt.setBounds(10, 119, 404, 23);
		amt.addMouseListener(new MouseAdapter() 
		{
			
			
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				amt.setText(null);
			}
		});
		amt.setColumns(10);
		panel.add(amt);
		
		fName = new JTextField();
		fName.setBounds(10, 167, 404, 23);
		fName.addMouseListener(new MouseAdapter() 
		{
			
			
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				fName.setText(null);
			}
		});
		fName.setColumns(10);
		panel.add(fName);
		
		lName = new JTextField();
		lName.setBounds(10, 215, 404, 23);
		lName.addMouseListener(new MouseAdapter() 
		{
			
			
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				lName.setText(null);
			}
		});
		lName.setColumns(10);
		panel.add(lName);
		
		bgBalance = new JTextField();
		bgBalance.setBounds(10, 269, 404, 23);
		bgBalance.addMouseListener(new MouseAdapter() 
		{
			
			
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				bgBalance.setText(null);
			}
		});
		bgBalance.setColumns(10);
		panel.add(bgBalance);
		
		JLabel acctNumLabel = new JLabel("Account number:");
		acctNumLabel.setBounds(10, 55, 125, 14);
		acctNumLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(acctNumLabel);
		
		JLabel amtLabel = new JLabel("Amount:");
		amtLabel.setBounds(10, 104, 125, 14);
		amtLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(amtLabel);
		
		JLabel fNameLabel = new JLabel("First name:");
		fNameLabel.setBounds(10, 153, 125, 14);
		fNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(fNameLabel);
		
		JLabel lNameLabel = new JLabel("Last name:");
		lNameLabel.setBounds(10, 201, 125, 14);
		lNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(lNameLabel);
		
		JLabel bgBalanceLabel = new JLabel("Beginning balance:");
		bgBalanceLabel.setBounds(10, 249, 125, 23);
		bgBalanceLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(bgBalanceLabel);
		
		JComboBox bankActivities = new JComboBox();
		bankActivities.setBounds(10, 11, 404, 33);
		bankActivities.addActionListener(new ActionListener() {
			
			
			
			public void actionPerformed(ActionEvent e) 
			{
				if (bankActivities.getItemCount() >= 6)	
				{
					bankActivities.removeItemAt(0);
				}
				
				
				
				if (bankActivities.getSelectedIndex() == 0)
				{
					acctNumLabel.setForeground(Color.red);
					amtLabel.setForeground(Color.red);
					fNameLabel.setForeground(Color.black);
					lNameLabel.setForeground(Color.black);
					bgBalanceLabel.setForeground(Color.black);
					
				}
				else if (bankActivities.getSelectedIndex() == 1)
				{
					acctNumLabel.setForeground(Color.red);
					amtLabel.setForeground(Color.red);
					fNameLabel.setForeground(Color.black);
					lNameLabel.setForeground(Color.black);
					bgBalanceLabel.setForeground(Color.black);
				}
				else if (bankActivities.getSelectedIndex() == 2)
				{
					acctNumLabel.setForeground(Color.red);
					amtLabel.setForeground(Color.black);
					fNameLabel.setForeground(Color.black);
					lNameLabel.setForeground(Color.black);
					bgBalanceLabel.setForeground(Color.black);
				}
				else if (bankActivities.getSelectedIndex() == 3)
				{
					acctNumLabel.setForeground(Color.black);
					amtLabel.setForeground(Color.black);
					fNameLabel.setForeground(Color.red);
					lNameLabel.setForeground(Color.red);
					bgBalanceLabel.setForeground(Color.red);
				}
				else if (bankActivities.getSelectedIndex() == 4)
				{
					acctNumLabel.setForeground(Color.red);
					amtLabel.setForeground(Color.black);
					fNameLabel.setForeground(Color.black);
					lNameLabel.setForeground(Color.black);
					bgBalanceLabel.setForeground(Color.black);
				}
				
			}
			
		});
		
		
		bankActivities.setFont(new Font("Tahoma", Font.PLAIN, 15));
		bankActivities.setModel(new DefaultComboBoxModel(new String[] {"Select an option", "Deposit", "Withdrawal", "Check balance", "Add an account", "Remove an Account"}));
		panel.add(bankActivities);
		
		JLabel acctInfo = new JLabel("");
		acctInfo.setBounds(10, 315, 404, 63);
		panel.add(acctInfo);	
		
		JButton btnNewButton = new JButton("Process Transaction");
		btnNewButton.setBounds(10, 389, 163, 34);
		btnNewButton.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) 
			{
				String amount, message;
				
				if (bankActivities.getSelectedIndex() == 0)
				{
					amount = amt.getText();
					message = easySave.transaction(1, acctNum.getText(), Double.parseDouble(amount));
					acctInfo.setText(message);
				}
				
				
				else if (bankActivities.getSelectedIndex() == 1)
				{
					amount = amt.getText();
					message = easySave.transaction(2, acctNum.getText(), Double.parseDouble(amount));
					acctInfo.setText(message);
				}
				
				
				else if (bankActivities.getSelectedIndex() == 2)
				{
					message = easySave.checkBalance(acctNum.getText());
					acctInfo.setText(message);
				}
				
				
				else if (bankActivities.getSelectedIndex() == 3)
				{
					
					amount = bgBalance.getText();
					message = easySave.addAccount(Double.parseDouble(amount), fName.getText(), lName.getText());
					acctInfo.setText("New Account ID: " + message);

				}
				
				
				else if (bankActivities.getSelectedIndex() == 4)
				{
					message = easySave.deleteAccount(acctNum.getText());
					acctInfo.setText(message);
				}
				
				acctNum.setText("");
				amt.setText("");
				fName.setText("");
				lName.setText("");
				bgBalance.setText("");
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(btnNewButton);
		

		

		

	}
}
