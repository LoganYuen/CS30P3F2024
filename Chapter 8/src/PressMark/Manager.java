package PressMark;

public class Manager extends Employee
{
	private double yearlySalary;
	
	
	//Constructor
	public Manager(String fN, String lN, double s)
	{
		super(fN, lN);
		yearlySalary = s;
	}
	
	//Accessor method for yearly salary
	public double getYearlySalary()
	{
		return (yearlySalary);
	}
	
	
	//return the manager pay for a specified person
	public double pay(double weeks)
	{
		double payEarned;
		
		payEarned = yearlySalary / 52 * weeks;
		
		return (payEarned);
	}
	
	public String toStreing()
	{
		return(super.toString() + ", Manager salary: " + yearlySalary);
	}
}
