package UEmployeeFacultyStaff;

public abstract class UEmployee 
{
	private String fName, lName;
	private double salary;
	
	
	
	
	//Constructor
	public UEmployee(String fN, String lN)
	{
		fName = fN;
		lName = lN;
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
		
	public double getSalary()
	{
		return(salary);
	}
	
	
	
	
	public String toString()
	{
		return("Employee" + fName + " " + lName + "'s salary is: " + salary);
	}
}
