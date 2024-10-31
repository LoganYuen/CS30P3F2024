package Puck;

import java.util.Scanner;

public class Hockey {

	public static void main(String[] args) 
	{
		Puck youthPuck1 = new Puck(4);
		Puck youthPuck2 = new Puck(4.5);
		Puck youthPuck3 = new Puck(4.2);
		Puck standardPuck1 = new Puck(5);
		Puck standardPuck2 = new Puck(5.3);
		double userWeight;
	
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("This program has 5 predetermined pucks with defined weights.\n"
		+ "You will be able to add your own puck and change your it's weight."
		+ "The program will also compare several pucks weights, and find out what division they are in\n");
		
		
	
		System.out.println("Please enter the weight of your puck (Standard 5oz to 5.5oz)(Youth 4oz to 4.5oz):");
		userWeight = input.nextDouble();
		
		Puck userPuck = new Puck(userWeight);
		
		
		
		
	
		
	}

}
