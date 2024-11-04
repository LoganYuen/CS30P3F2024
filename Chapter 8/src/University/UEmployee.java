package University;

public abstract class UEmployee 
{
	private String fName, lName;
	private double salary;
	
	
	
	
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
		
	public double getSalary()
	{
		return(salary);
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
	
	
	
	
	public String toString()
	{
		return "Employee" + fName + " " + lName + "'s salary is: " + salary;
	}
}
