package Stack;
/*
Program: Stack2Tester.java          Date: November 19, 2024


Purpose: Create a Stack2Tester application that tests the Stack2 class.


Author: Logan Yuen
School: CHHS
Course: Computer Science 30
*/


public class Stack2Tester 
{
	public static void main(String[] args) 
	{
		//Create stack object
		Stack2 s2 = new Stack2(5);
		
		//Test push method
		s2.push("Cake");
		s2.push("Cookie");
		s2.push("Brownie");
		
		//Test top and size methods
		System.out.println("Top of stack s2 is: " + s2.top());
		System.out.println("Items in stack s2: " + s2.size());
		
		//Test pop method
		s2.pop();
		
		System.out.println("Top of stack s2 is: " + s2.top());
		System.out.println("Items in stack s2: " + s2.size());
		
		//Test makeEmpty and isEmpty methods
		System.out.println("It's " + s2.isEmpty() + " that s2 is empty.");
		s2.makeEmpty();
		System.out.println("It's " + s2.isEmpty() + " that s2 is empty.");
		
	}
}
/* Screen Dump
Test Case 1:
Top of stack s2 is: Yellow
Items in stack s2: 3
Top of stack s2 is: Green
Items in stack s2: 2
It's false that s2 is empty.
It's true that s2 is empty.





Test Case 2:
Top of stack s2 is: Brownie
Items in stack s2: 3
Top of stack s2 is: Cookie
Items in stack s2: 2
It's false that s2 is empty.
It's true that s2 is empty.
*/