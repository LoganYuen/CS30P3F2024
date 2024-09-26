package Masterys;

import java.text.NumberFormat;

public class Account {
	private double balance;
	private Customer cust;
	private String acctID;
	
	
	
	public Account(double bal, String fName, String lName)
	{
		balance = bal;
		cust = new Customer(fName, lName);
		acctID = fName.substring(0,1) + lName;	
	}
	
	
	
	
	public Account(String ID)
	{
		balance = 0;
		cust = new Customer ("", "");
		acctID = ID;
	}
	
	
	
	
	public String getID()
	{
		return(acctID);
	}
	
	
	
	
	public double getBalance()
	{
		return(balance);
	}
	
	
	
	
	public void deposit(double amt)
	{
		balance += amt;
	}
	
	
	
	
	public String withdrawal(double amt)
	{
		if (amt <= balance)
		{
			balance -= amt;
			return("Withdrawal completed");
		}
		else
		{
			return("Not enough money in account");
		}
		
	}
	
	
	
	
	public boolean equals(Object acct)
	{
		Account textAcct = (Account)acct;
		if (acctID.equals(textAcct.acctID))
		{
			return(true);
		}
		else
		{
			return(false);
		}
	}
	
	
	
	
	public String toString()
	{
		String accountString;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		accountString = "Acount ID: " + acctID + "\n";
		accountString += cust.toString();
		accountString += "Current balance is " + money.format(balance);
		return(accountString);
	}
}
