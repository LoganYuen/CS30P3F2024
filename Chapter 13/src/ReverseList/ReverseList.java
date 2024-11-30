package ReverseList;
/*
Program: ReverseList.java          Date: December 2, 2024


Purpose: Create a ReverseList application that uses a stack to reverse a set of integers entered by the user.


Author: Logan Yuen
School: CHHS
Course: Computer Science 30
*/

import java.util.Scanner;

public class ReverseList 
{
	public static void main(String[] args) 
	{
		//Initialization area
		int counter = -1;
		Stack reverseOut = new Stack(10);
		Scanner input = new Scanner(System.in);
		
		
		//Loop until the stack reaches 10 numbers
		while (counter < 9)
		{
			//Ask user for a number and add to the counter
			System.out.println("Enter a number (999 to quit): ");
			int newNum = input.nextInt();
			
			
			//Check if the user wants to quit
			if (newNum == 999)
			{
				break;
			}
			
			//Add a new number to the stack
			counter += 1;
			reverseOut.push(newNum);

		}
		
		
		
		//Display the user's numbers reversed
		System.out.print("The list reversed is: ");
		for (int i = -1; i < counter; i++)
		{
			System.out.print(reverseOut.pop() +  " ");
		}
	}
}
/* Screen Dump
Test case 1:
Enter a number (999 to quit): 
1
Enter a number (999 to quit): 
2
Enter a number (999 to quit): 
3
Enter a number (999 to quit): 
999
The list reversed is: 3 2 1 






Test Case 2:
Enter a number (999 to quit): 
10
Enter a number (999 to quit): 
9
Enter a number (999 to quit): 
8
Enter a number (999 to quit): 
7
Enter a number (999 to quit): 
6
Enter a number (999 to quit): 
5
Enter a number (999 to quit): 
4
Enter a number (999 to quit): 
3
Enter a number (999 to quit): 
2
Enter a number (999 to quit): 
1
The list reversed is: 1 2 3 4 5 6 7 8 9 10 
*/