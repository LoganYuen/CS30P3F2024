package Masterys;

public class Customer {
	private String firstName, lastName;
	
	
	
	
	public Customer(String fName, String lName)
	{
		firstName = fName;
		lastName = lName;
	}
	
	
	
	
	public String toString()
	{
		String custString;
		
		custString = ": " +firstName + " " + lastName + "'s ";
		return(custString);
	}
}
