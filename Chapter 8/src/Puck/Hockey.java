package Puck;
/*
Program: Hockey.java          Date: October 31, 2024


Purpose: Create a Hockey application that tests the puck class.


Author: Logan Yuen
School: CHHS
Course: Computer Science 30
*/


import java.util.Scanner;


public class Hockey {

	public static void main(String[] args) 
	{
		//Declaration area
		Puck youthPuck = new Puck(4.2);
		Puck standardPuck = new Puck(5.4);
		double userWeight, newWeight;
	
		Scanner input = new Scanner(System.in);
		
		
		
		//Intro message
		System.out.println("A puck has a radius of " + youthPuck.getRadius()
		+ " And a thickness of " + youthPuck.getThickness()
		+ "\nThis program has 2 predetermined pucks with defined weights.\n"
		+ "You will be able to add your own puck and add a new weight for a replacement puck.\n"
		+ "The program will also compare your puck weights/division to the predetermined pucks and get their divisions.\n");
		
		
		
		//Get user's puck weight
		System.out.println("Please enter the weight of your puck (Standard 5oz to 5.5oz)(Youth 4oz to 4.5oz):");
		userWeight = input.nextDouble();
		Puck userPuck = new Puck(userWeight);
		
		
		//Test toString method
		System.out.println("\n" + userPuck);
		
		
		
		//Compare user puck to the predetermined pucks
		System.out.println("It is " + userPuck.equals(youthPuck) 
		+ " that your puck is in the same division as our youth puck and " 
		+ userPuck.equals(standardPuck) 
		+ " that it's in the same division as our standard puck.\n");
		
		
		
		//Get replacement puck weight
		System.out.println("Please enter a new weight for the replacement puck.");	
		newWeight = input.nextDouble();
		userPuck.setWeight(newWeight);
		
		//Get new puck's division
		System.out.println("This puck is in the division: " + userPuck.getDivision() + "\n");
		
		
		
		//Testing compareTo method for the youth puck
		if (userPuck.compareTo(youthPuck) == -1)
		{
			System.out.println("Your new puck weighs less than our youth puck.");	
		}
		else if (userPuck.compareTo(youthPuck) == 0)
		{
			System.out.println("Your new puck weighs the same as our youth puck.");	
		}
		else
		{
			System.out.println("Your new puck weighs more than our youth puck.");	
		}
		
		
		//Testing compareTo method for the standard puck
		if (userPuck.compareTo(standardPuck) == -1)
		{
			System.out.println("Your new puck also weighs less than our standard puck.");	
		}
		else if (userPuck.compareTo(standardPuck) == 0)
		{
			System.out.println("Your new puck also weighs the same as our standard puck.");	
		}
		else
		{
			System.out.println("Your new puck also weighs more than our standard puck.");	
		}
		
	}

}
/* Screen Dump
Test Case 1:
A puck has a radius of 1.5 And a thickness of 1.0
This program has 2 predetermined pucks with defined weights.
You will be able to add your own puck and add a new weight for a replacement puck.
The program will also compare your puck weights/division to the predetermined pucks and get their divisions.

Please enter the weight of your puck (Standard 5oz to 5.5oz)(Youth 4oz to 4.5oz):
5.35

This puck is standard with a weight of 5.35oz.
It is false that your puck is in the same division as our youth puck and true that it's in the same division as our standard puck.

Please enter a new weight for the replacement puck.
4.2
This puck is in the division: standard

Your new puck weighs the same as our youth puck.
Your new puck also weighs less than our standard puck.








Test Case 2:
A puck has a radius of 1.5 And a thickness of 1.0
This program has 2 predetermined pucks with defined weights.
You will be able to add your own puck and add a new weight for a replacement puck.
The program will also compare your puck weights/division to the predetermined pucks and get their divisions.

Please enter the weight of your puck (Standard 5oz to 5.5oz)(Youth 4oz to 4.5oz):
4.2

This puck is youth with a weight of 4.2oz.
It is true that your puck is in the same division as our youth puck and false that it's in the same division as our standard puck.

Please enter a new weight for the replacement puck.
5.3
This puck is in the division: youth

Your new puck weighs more than our youth puck.
Your new puck also weighs less than our standard puck.
*/
