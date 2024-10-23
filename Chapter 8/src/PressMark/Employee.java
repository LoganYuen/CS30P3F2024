package PressMark;

public abstract class Employee 
{
	private String firstName, lastName;
	
	
	
	//Constructor
	public Employee(String fN, String lN)
	{
		firstName = fN;
		lastName = lN;
	}
	
	
	abstract double pay(double period);
	
	
	public String toString()
	{		
		return(firstName + " " + lastName);
	}
}
