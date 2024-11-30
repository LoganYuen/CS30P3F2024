package StackList;
/*
Program: StackListTester.java          Date: November 28, 2024


Purpose: Create a StackListTester application that tests the StackList class.


Author: Logan Yuen
School: CHHS
Course: Computer Science 30
*/


public class StackListTester 
{

	public static void main(String[] args) 
	{
		
		//Create stack object
		StackList sl = new StackList();
		
		//Test push method
		sl.push("Cake");
		sl.push("Cookie");
		sl.push("Brownie");
		
		//Test top and size methods
		System.out.println("Top of stack sl is: " + sl.top());
		System.out.println("Items in stack sl: " + sl.size());
		
		//Test pop method
		sl.pop();

		
		System.out.println("Top of stack sl is: " + sl.top());
		System.out.println("Items in stack sl: " + sl.size());
		
		//Test makeEmpty and isEmpty methods
		System.out.println("It's " + sl.isEmpty() + " that sl is empty.");
		sl.makeEmpty();
		System.out.println("It's " + sl.isEmpty() + " that sl is empty.");
		
		
		//Test push method again
		sl.push("Donut");
		sl.push("Cupcake");
		
		//Test top and size methods again
		System.out.println("Top of stack sl is: " + sl.top());
		System.out.println("Items in stack sl: " + sl.size());
		
	}
}
/* Screen Dump
Top of stack sl is: Brownie
Items in stack sl: 3
Top of stack sl is: Cookie
Items in stack sl: 2
It's false that sl is empty.
It's true that sl is empty.







Test Case 2:
Top of stack sl is: Brownie
Items in stack sl: 3
Top of stack sl is: Cookie
Items in stack sl: 2
It's false that sl is empty.
It's true that sl is empty.
Top of stack sl is: Cupcake
Items in stack sl: 2
*/

