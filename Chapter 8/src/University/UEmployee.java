package University;

import java.text.NumberFormat;

/*
Program: University.java          Date: October 31, 2024
Purpose: Create a UEmployee class to contain variables for an employee's name and salary as well as methods to return them.
Author: Logan Yuen
School: CHHS
Course: Computer Science 30
*/

public abstract class UEmployee 
{
	private String fName, lName;
	private double salary;
	NumberFormat money = NumberFormat.getCurrencyInstance();
	
	
	
	//Constructor
	public UEmployee(String fN, String lN, double s)
	{
		fName = fN;
		lName = lN;
		salary = s;
	}
	
	
	
	
	//Accessor methods
	public String getFName()
	{
		return(fName);
	}
	
	public String getLName()
	{
		return(lName);
	}
		
	public String getSalary()
	{
		return(money.format(salary));
	}
	
	
	
	//Modifier methods
	public void setFName(String f)
	{
		fName = f;
	}
	
	public void setLName(String l)
	{
		lName = l;
	}
		
	public void setSalary(double s)
	{
		salary = s;
	}
	
	
	
	//Return object as string
	public String toString()
	{
		return "Employee " + fName + " " + lName + "'s salary is: " + money.format(salary);
	}
}
