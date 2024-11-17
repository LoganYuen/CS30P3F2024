package Account;

import java.util.Scanner;

/*
Program: Customer.java          Date: November 7, 2024
Purpose: Create a Customer class that stores information about a customer and allows a user to change that information.
Author: Logan Yuen
School: CHHS
Course: Computer Science 30
*/

public class Customer {
	private String firstName, lastName, street, city, province, postalCode;


	
	/**
	 * constructor
	 * pre: none
	 * post: A Customer object has been created. 
	 * Customer data has been initialized with parameters.
	 */
	public Customer(String fName, String lName, String str, String cit, String pro, String pos)
	{
		firstName = fName;
		lastName = lName;
		street = str;
		city = cit;
		province = pro;
		postalCode = pos;
	}
	

	
	
	//Asks user for their city and records it
	public void changeCity() 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What is your new city?: ");
		city = input.nextLine();
	}


	//Asks user for their street and records it
	public void changeStreet() 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What is your new street?: ");
		street = input.nextLine();
	}

	//Asks user for their province and records it
	public void changeProvince() 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What is your new province?: ");
		province = input.nextLine();
	}

	//Asks user for their postal code and records it
	public void changePostalCode() 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What is your new postal code?: ");
		postalCode = input.nextLine();
	}



	/** 
	 * Returns a String that represents the Customer object.
	 * pre: none
	 * post: A string representing the Customer object has 
	 * been returned.
	 */
	public String toString() {
		String custString;
		custString = firstName + " " + lastName + ": " + street + ", " + city + ", " + province + ", " + postalCode + "\n";
	 	return(custString);
	}

}
