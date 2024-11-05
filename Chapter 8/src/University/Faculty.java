package University;

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
		return "The department that this faculty member is in is: " + department;
	}
}
