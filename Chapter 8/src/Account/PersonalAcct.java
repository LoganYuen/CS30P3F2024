package Account;

/*
Program: PersonalAcct.java          Date: November 7, 2024
Purpose: Create a PersonalAcct class that requires a minimum balance of $100 otherwise the account is charged $2.
Author: Logan Yuen
School: CHHS
Course: Computer Science 30
*/

public class PersonalAcct extends Account
{
	//Constructor
	public PersonalAcct(double bal, String fName, String lName, String str, String cit, String pro, String pos)
	{
		super(bal, fName, lName, str, cit, pro, pos);
	}
	
	
	//Check if the personal account has gone below the accepted balance.
	public void checkBal() 
	{
		if (super.getBalance() < 100)
		{
			System.out.println("Your personal account has fallen below the accepted balance.\n"
					+ "Attempting to charge your account $2.");
			super.withdrawal(2);
		}
	}
	
	
	//Return object as String
	public String toString() 
	{
		return "This is a personal account: \n" + super.toString();
	}
}
