package Vehicle;

/*
Program: University.java          Date: November 4, 2024
Purpose: Create a Truck class that includes additional members specific to a truck
Author: Logan Yuen
School: CHHS
Course: Computer Science 30
*/

public class Truck extends Vehicle
{
	private double bedSize, towingCapacity;
	
	
	//Constructor
	public Truck(double FEC, double FEH, int SC, double CV, boolean HHS, boolean HCS, double MS, double BS, double TC) 
	{
		super(FEC, FEH, SC, CV, HHS, HCS, MS);
		bedSize = BS;
		towingCapacity = TC;
	}
	
	
	
	
	//Modifier methods
	public void setBedSize(double BS)
	{
		bedSize = BS;
	}
	public void setTowingCapacity(double TC)
	{
		towingCapacity = TC;
	}

	
	//Accessor methods
    public double getBedSize()
    {
    	return bedSize;
    }
    public double getTowingCapacity()
    {
    	return towingCapacity;
    }
    
    
    
    //Return object as string
    public String toString()
    {
    	return (super.toString()
    			+ "\nBed size: " + bedSize
    			+ "\nTowing Capacity: " + towingCapacity);
    }
    
}