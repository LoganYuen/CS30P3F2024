package University;

/*
Program: Faculty.java          Date: November 1, 2024
Purpose: Create a Faculty class with members to store and return the department name.
Author: Logan Yuen
School: CHHS
Course: Computer Science 30
*/

public class Faculty extends UEmployee 
{
	private String department;
	
	
	//Constructor
	public Faculty(String fN, String lN, double s, String d)
	{
		super(fN, lN, s);
		department = d;
	}
	
	
	
	//Accessor method
	public String getDepartment()
	{
		return department;
	}
	
	//Modifier method
	public void setDepartment(String d)
	{
		department = d;
	}
	
	
	
	//Return object as string
	public String toString()
	{
		return super.toString() + " and the department they're in is: " + department;
	}
}
