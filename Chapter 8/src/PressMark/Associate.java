package PressMark;

public class Associate extends Employee
{
	private double hourlyPayRate;
	
	//contrsuctor
	public Associate(String fn, String ln, double r)
	{
		super(fn,ln);
		hourlyPayRate = r;
	}
	
	
	
	public double pay(double hours)
	{
		double payEarned;
		
		if (hours > 40)
		{
			payEarned = ((hourlyPayRate * 40) + (hourlyPayRate *1.5) * (hours - 40));
		}
		else
		{
			payEarned = hourlyPayRate * hours;
		}
		
		return payEarned;
	}
	
	
	
	public String toString()
	{
		return(super.toString() + ", Associate pay rate: " + hourlyPayRate);
	}
}
