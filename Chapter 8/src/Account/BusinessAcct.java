package Account;

/*
Program: BusinessAcct.java          Date: November 7, 2024
Purpose: Create a BusinessAcct class that requires a minimum balance of $500 otherwise the account is charged $10.
Author: Logan Yuen
School: CHHS
Course: Computer Science 30
*/

public class BusinessAcct extends Account
{
	//Constructor
	public BusinessAcct(double bal, String fName, String lName, String str, String cit, String pro, String pos)
	{
		super(bal, fName, lName, str, cit, pro, pos);
	}
	
	
	//Check if the business account has gone below the accepted balance.
	public void checkBal() 
	{
		if (super.getBalance() < 500)
		{
			System.out.println("Your business account has fallen below the accepted balance.\n"
					+ "Attempting to charge your account $10.");
			super.withdrawal(10);
		}
	}
	
	
	//Return object as String
	public String toString() 
	{
		return "This is a business account: \n" + super.toString();
	}
}