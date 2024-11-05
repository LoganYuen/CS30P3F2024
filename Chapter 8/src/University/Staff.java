package University;

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
	public String getDepartment()
	{
		return jobTitle;
	}
	
	//Modifier method
	public void setDepartment(String d)
	{
		jobTitle = d;
	}
	
	
	
	//Return object as string
	public String toString()
	{
		return "The job that this staff member has is: " + jobTitle;
	}
}
