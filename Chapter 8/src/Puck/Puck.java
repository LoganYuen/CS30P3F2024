package Puck;
public class Puck extends Disk implements Comparable
{
	public double MIN_STD_W = 5;
	public double MAX_STD_W = 5.5;
	public double MIN_YTH_W = 4;
	public double MAX_YTH_W = 4.5;
	
	private double weight;
	private boolean standard, youth;
	
	//Constructor
	public Puck(double w)
	{
		super(1.5, 1);
		weight = w;
		
		//Check if puck is standard
		if(weight >= MIN_STD_W && weight <= MAX_STD_W)
		{
			standard = true;
			youth = false;
		}
		//Puck is youth
		else
		{
			standard = false;
			youth = true;
		}
	}
	
	
	
	//Accessor method
	public double getWeight()
	{
	 	return(weight);
	}
	
	//Modifier method
	public void setWeight(double w)
	{
		weight = w;
	}
	
	
	
	//calculate and return division
	public String getDivision()
	{
		String div;
		
		if(standard)
		{
			div = "standard";
		}
		else
		{
			div = "youth";
		}
		return div;
	}
	
	
	
	
	//compare two objects and return boolean
	public boolean equals(Object obj)
	{
		Puck testObj = (Puck)obj;
		
		if(testObj.getDivision() == getDivision())
		{
			return(true);
		}
		else
		{
			return(false);
		}
	}
	
	
	
	//return object as string
	public String toString()
	{
		if (standard == true)
		{
			return"This puck is standard with a weight of " + weight + "oz.";
		}
		else
		{
			return"This puck is youth with a weight of " + weight + "oz.";
		}
	}
	
	//compare two objects and return int
	public int compareTo(Object p)
	{
		Puck testPuck = (Puck) p;
		
		
		
		if (weight == testPuck.getWeight())
		{
			return 0;
		}
		else if (weight < testPuck.getWeight())
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
}
