package Vehicle;

/*
Program: University.java          Date: November 5, 2024
Purpose: Create a Minivan class that includes additional members specific to a minivan
Author: Logan Yuen
School: CHHS
Course: Computer Science 30
*/

public class Minivan extends Vehicle
{
	private boolean hasSlidingDoors, hasEntertainmentScreen;
	
	
	//Constructor
	public Minivan(double FEC, double FEH, int SC, double CV, boolean HHS, boolean HCS, double MS, boolean HSD, boolean HES) 
	{
		super(FEC, FEH, SC, CV, HHS, HCS, MS);
		hasSlidingDoors = HSD;
		hasEntertainmentScreen = HES;
	}
	
	
	
	
	//Modifier methods
	public void setHasSlidingDoors(boolean HSD)
	{
		hasSlidingDoors = HSD;
	}
	public void setHasEntertainmentScreen(boolean HES)
	{
		hasEntertainmentScreen = HES;
	}

	
	//Accessor methods
    public boolean getHasSlidingDoors()
    {
    	return hasSlidingDoors;
    }
    public boolean getHasEntertainmentScreen()
    {
    	return hasEntertainmentScreen;
    }
    
    
    
    //Return object as string
    public String toString()
    {
    	return (super.toString()
    			+ "\nHas Sliding Doors: " + hasSlidingDoors
    			+ "\n Has Entertainment Screen: " + hasEntertainmentScreen);
    }

}