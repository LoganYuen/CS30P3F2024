package University;

/*
Program: University.java          Date: November 1, 2024
Purpose: Create a Staff class to contain members for storing and returning the job title.
Author: Logan Yuen
School: CHHS
Course: Computer Science 30
*/

public class Staff extends UEmployee
{
	private String jobTitle;
	
	
	//Constructor
	public Staff(String fN, String lN, double s, String j)
	{
		super(fN, lN, s);
		jobTitle = j;
	}
	
	
	
	//Accessor method
	public String getJobTitle()
	{
		return jobTitle;
	}
	
	//Modifier method
	public void setJobTitle(String d)
	{
		jobTitle = d;
	}
	
	
	
	//Return object as string
	public String toString()
	{
		return super.toString() + " and the job they have is: " + jobTitle;
	}
}
