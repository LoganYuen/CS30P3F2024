package Account;

import java.text.NumberFormat;
import java.util.Scanner;

/*
Program: Bank.java          Date: November 7, 2024
Purpose: Create client code to test the Account, PersonalAcct, and BusinessAcct classes
Author: Logan Yuen
School: CHHS
Course: Computer Science 30
*/

public class TestAccount 
{
	public static void main(String[] args) 
	{
		int acctType, balance, choice;
		String fName, lName, street, city, province, postalCode;
		
		Account acct;
		PersonalAcct userAcctPersonal = null;
		BusinessAcct userAcctBusiness = null;
		
		NumberFormat money = NumberFormat.getCurrencyInstance();
		Scanner input = new Scanner(System.in);
		
		
		//Check for user's account type
		System.out.println("Which account type would you like to set up?\n"
				+ "1. Personal account: You will be charged $2 if your balance goes below $100.\n"
				+ "2. Business account: You will be charged $10 if your balance goes below $500.\n");
		acctType = input.nextInt();
		input.nextLine();
		
		
		//Collect user's information
		System.out.println("What is your first name?:");
		fName = input.nextLine();
		
		System.out.println("What is your last name?:");
		lName = input.nextLine();
		
		System.out.println("What street do you live on?:");
		street = input.nextLine();
		
		System.out.println("What city do you live in?:");
		city = input.nextLine();
		
		System.out.println("What province do you live in?:");
		province = input.nextLine();
		
		System.out.println("What is your postal code?:");
		postalCode = input.nextLine();
		
		System.out.println("What would you like your starting balance to be?:");
		balance = input.nextInt();
		
	
		
		
		
		//Create different account objects
		if (acctType == 1)
		{
			userAcctPersonal = new PersonalAcct(balance, fName, lName, street, city, province, postalCode);
			System.out.println("Your account ID is: " + userAcctPersonal.getID());
			acct = userAcctPersonal;
		}
		else 
		{
			userAcctBusiness = new BusinessAcct(balance, fName, lName, street, city, province, postalCode);
			System.out.println("Your account ID is: " + userAcctBusiness.getID());
			acct = userAcctBusiness;
		}
		
		
		
		
		do
		{
			//Menu
			System.out.println("\nWhat would you like to do?\n"
					+ "1. View entire account.\n"
					+ "2. Change address.\n"
					+ "3. Deposit.\n"
					+ "4. Withdrawal.\n"
					+ "5. View ID.\n"
					+ "6. View Balance.\n"
					+ "7. Quit.\n");
			choice = input.nextInt();
			
			
			switch(choice)
			{
			//Display account info
			case 1:
					System.out.println(acct);
				break;
				
				
				
			//Change address
			case 2:
				if (acctType == 1)
				{
					userAcctPersonal.changeAddress();
				}
				else
				{
					userAcctBusiness.changeAddress();
				}
				break;
				
				
				
			//User deposits money to account
			case 3:
				System.out.println("How much would you like to deposit?: ");
				double depoAmt = input.nextDouble();
				
				
				if (acctType == 1)
				{
					userAcctPersonal.deposit(depoAmt);
				}
				else
				{
					userAcctBusiness.deposit(depoAmt);
				}
				break;
				
				
				
			//User withdraws money from the account
			case 4:
				System.out.println("How much would you like to withdrawal?: ");
				double withAmt = input.nextDouble();
				
				
				if (acctType == 1)
				{
					userAcctPersonal.withdrawal(withAmt);
				}
				else
				{
					userAcctBusiness.withdrawal(withAmt);
				}
				break;
				
				
				
			//Display ID
			case 5:
				System.out.println("ID: " + acct.getID());
				break;
				
				
				
			//Display balance
			case 6:
				System.out.println("Balance: " + money.format(acct.getBalance()));
				break;
			}
			
			
			//Make acct = to the actual value
			if (acctType == 1)
			{
				acct = userAcctPersonal;
			}
			else
			{
				acct = userAcctBusiness;
			}
		}while(choice != 7);
		
		
		//Check the user's balance
		if (acctType == 1)
		{
			userAcctPersonal.checkBal();
			System.out.println("Your balance is: " + money.format(userAcctPersonal.getBalance()));
		}
		else
		{
			userAcctBusiness.checkBal();
			System.out.println("Your balance is: " + money.format(userAcctBusiness.getBalance()));
		}
		
	}
}
/* Screen Dump
Test Case 1:
Which account type would you like to set up?
1. Personal account: You will be charged $2 if your balance goes below $100.
2. Business account: You will be charged $10 if your balance goes below $500.

1
What is your first name?:
Logan
What is your last name?:
Yuen
What street do you live on?:
Cool
What city do you live in?:
Calgary
What province do you live in?:
Alberta
What is your postal code?:
A1B 2C3
What would you like your starting balance to be?:
1000
Your account ID is: LYuen

What would you like to do?
1. View entire account.
2. Change adress.
3. Deposit.
4. Withdrawal.
5. View ID.
6. View Balance.
7. Quit.

1
This is a personal account: 
LYuen
Logan Yuen: Cool, Calgary, Alberta, A1B 2C3
Current balance is $1,000.00

What would you like to do?
1. View entire account.
2. Change adress.
3. Deposit.
4. Withdrawal.
5. View ID.
6. View Balance.
7. Quit.

2
What is your new street?: 
Blue
What is your new city?: 
Edmonton
What is your new province?: 
Alberta
What is your new postal code?: 
D4E 5F6

What would you like to do?
1. View entire account.
2. Change adress.
3. Deposit.
4. Withdrawal.
5. View ID.
6. View Balance.
7. Quit.

3
How much would you like to deposit?: 
100

What would you like to do?
1. View entire account.
2. Change adress.
3. Deposit.
4. Withdrawal.
5. View ID.
6. View Balance.
7. Quit.

1
This is a personal account: 
LYuen
Logan Yuen: Blue, Edmonton, Alberta, D4E 5F6
Current balance is $1,100.00

What would you like to do?
1. View entire account.
2. Change adress.
3. Deposit.
4. Withdrawal.
5. View ID.
6. View Balance.
7. Quit.

5
ID: LYuen

What would you like to do?
1. View entire account.
2. Change adress.
3. Deposit.
4. Withdrawal.
5. View ID.
6. View Balance.
7. Quit.

4
How much would you like to withdrawal?: 
1050

What would you like to do?
1. View entire account.
2. Change adress.
3. Deposit.
4. Withdrawal.
5. View ID.
6. View Balance.
7. Quit.

6
Balance: $50.00

What would you like to do?
1. View entire account.
2. Change adress.
3. Deposit.
4. Withdrawal.
5. View ID.
6. View Balance.
7. Quit.

7
Your personal account has fallen below the accepted balance.
Attempting to charge your account $2.
Your balance is: $48.0








Test Case 2:
Which account type would you like to set up?
1. Personal account: You will be charged $2 if your balance goes below $100.
2. Business account: You will be charged $10 if your balance goes below $500.

2
What is your first name?:
Bob
What is your last name?:
Dude
What street do you live on?:
Bad
What city do you live in?:
Town
What province do you live in?:
Nice
What is your postal code?:
acurate
What would you like your starting balance to be?:
500
Your account ID is: BDude

What would you like to do?
1. View entire account.
2. Change adress.
3. Deposit.
4. Withdrawal.
5. View ID.
6. View Balance.
7. Quit.

1
This is a business account: 
BDude
Bob Dude: Bad, Town, Nice, acurate
Current balance is $500.00

What would you like to do?
1. View entire account.
2. Change adress.
3. Deposit.
4. Withdrawal.
5. View ID.
6. View Balance.
7. Quit.

5
ID: BDude

What would you like to do?
1. View entire account.
2. Change adress.
3. Deposit.
4. Withdrawal.
5. View ID.
6. View Balance.
7. Quit.

7
Your balance is: $500.00


*/
