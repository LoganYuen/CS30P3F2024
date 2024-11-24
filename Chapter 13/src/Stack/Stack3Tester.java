package Stack;
/*
Program: Stack2Tester.java          Date: November 19, 2024


Purpose: Create a Stack3Tester application that tests the Stack3 class.


Author: Logan Yuen
School: CHHS
Course: Computer Science 30
*/


public class Stack3Tester 
{
	public static void main(String[] args) 
	{
		//Create stack object
		Stack3 s3 = new Stack3();
		
		//Test push method
		s3.push("Pizza");
		s3.push("Hotdog");
		s3.push("Taco");
		
		//Test top and size methods
		System.out.println("Top of stack s3 is: " + s3.top());
		System.out.println("Items in stack s3: " + s3.size());
		
		//Test pop method
		s3.pop();
		
		System.out.println("Top of stack s3 is: " + s3.top());
		System.out.println("Items in stack s3: " + s3.size());
		
		//Test makeEmpty and isEmpty methods
		System.out.println("It's " + s3.isEmpty() + " that s3 is empty.");
		s3.makeEmpty();
		System.out.println("It's " + s3.isEmpty() + " that s3 is empty.");
		
		
		s3.push("Chicken");
		
		System.out.println("Top of stack s3 is: " + s3.top());
		System.out.println("Items in stack s3: " + s3.size());
		
	}
}
/* Screen Dump
Test Case 1:
Top of stack s3 is: Blue
Items in stack s3: 3
Top of stack s3 is: Green
Items in stack s3: 2
It's false that s3 is empty.
It's true that s3 is empty.
Top of stack s3 is: Orange
Items in stack s3: 1






Test Case 2:
Top of stack s3 is: Taco
Items in stack s3: 3
Top of stack s3 is: Hotdog
Items in stack s3: 2
It's false that s3 is empty.
It's true that s3 is empty.
Top of stack s3 is: Chicken
Items in stack s3: 1
*/