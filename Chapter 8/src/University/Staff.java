package University;

public class Staff extends UEmployee
{
	String jobTitle;
	
	
	public Staff(String fN, String lN, double s, String j)
	{
		super(fN, lN, s);
		jobTitle = j;
	}
	
	public String getDepartment()
	{
		return jobTitle;
	}
	
	public void setDepartment(String d)
	{
		jobTitle = d;
	}
	
	
	public String toString()
	{
		return "The job that this staff member has is: " + jobTitle;
	}
}
