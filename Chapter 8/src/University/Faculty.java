package University;

public class Faculty extends UEmployee {
	private String department;
	
	public Faculty(String fN, String lN, double s, String d)
	{
		super(fN, lN, s);
		department = d;
	}
	
	public String getDepartment()
	{
		return department;
	}
	
	public void setDepartment(String d)
	{
		department = d;
	}
}
