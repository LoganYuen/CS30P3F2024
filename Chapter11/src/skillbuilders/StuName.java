package skillbuilders;

import java.io.Serializable;

public class StuName implements Serializable
{
	private String fName, lName;
	
	
	
	public StuName(String fn, String ln)
	{
		fName = fn; 
		lName = ln;
	}
	
	
	
	public String toString() 
	{
		String stuString;
		
		stuString = "First name: " +  fName + " Last Name: " + lName;

		return(stuString);
	}
}
