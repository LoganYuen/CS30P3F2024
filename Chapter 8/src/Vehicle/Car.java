package Vehicle;

/*
Program: University.java          Date: November 5, 2024
Purpose: Create a Car class that includes additional members specific to a car
Author: Logan Yuen
School: CHHS
Course: Computer  Science 30
*/

public class Car extends Vehicle
{
	boolean hasTrunkSensor, hasRoofRack;
	
	
	//Constructor
	public Car(double FEC, double FEH, int SC, double CV, boolean HHS, boolean HCS, double MS, boolean HTS, boolean HRR) 
	{
		super(FEC, FEH, SC, CV, HHS, HCS, MS);
		hasTrunkSensor = HTS;
		hasRoofRack = HRR;
	}
	
	
	
	
	//Modifier methods
	public void setHasTrunkSensor(boolean HTS)
	{
		hasTrunkSensor = HTS;
	}
	public void setHasRoofRack(boolean HRR)
	{
		hasRoofRack = HRR;
	}

	
	//Accessor methods
    public boolean getHasTrunkSensor()
    {
    	return hasTrunkSensor;
    }
    public boolean getHasRoofRack()
    {
    	return hasRoofRack;
    }
    
    
    
    //Return object as string
    public String toString()
    {
    	return (super.toString()
    			+ "\nHas trunk sensor: " + hasTrunkSensor
    			+ "\nHas roof rack: " + hasRoofRack);
    }

}