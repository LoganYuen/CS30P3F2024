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
	boolean hasSlidingDoors;
	boolean hasEntertainmentScreen;
	
	public Minivan(double FEC, double FEH, int SC, double CV, boolean HHS, boolean HCS, double MS) 
	{
		super(FEC, FEH, SC, CV, HHS, HCS, MS);
		
	}

}