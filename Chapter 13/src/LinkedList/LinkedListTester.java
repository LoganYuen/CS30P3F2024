package LinkedList;
/*
Program: LinkedListTester.java          Date: November 25, 2024


Purpose: Create a LinkedListTester application that tests the LinkedList class.


Author: Logan Yuen
School: CHHS
Course: Computer Science 30
*/

public class LinkedListTester 
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();

		//Test addAtfront, addAtEnd, and size methods
		list.addAtFront("12");
		list.addAtFront("23");
		list.addAtEnd("34");
		System.out.println("List has " + list.size() + " items.");
		System.out.println(list);

		
		//Test makeEmpty method
		list.makeEmpty();
		System.out.println("List has " + list.size() + " items.");
		System.out.println(list);
		
		
		//Test addAtfront and addAtEnd methods again
		list.addAtFront("45");
		list.addAtEnd("56");
		System.out.println("List has " + list.size() + " items.");
		System.out.println(list);
	}
}
/* Screen Dump
Test case 1:
List has 3 items.
Grayson
Kang
Logan

Grayson
Kang
Logan
Jack
Blueson

List has 0 items.
There are no items in list.






Test Case 2:
List has 3 items.
23
12
34

List has 0 items.
There are no items in list.
List has 2 items.
45
56
*/

