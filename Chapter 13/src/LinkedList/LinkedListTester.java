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

		list.addAtFront("Sachar");
		list.addAtFront("Osborne");
		list.addAtFront("Suess");
		System.out.println("List has " + list.size() + " items.");
		System.out.println(list);

		list.addAtEnd("Blume");
		list.addAtEnd("Dahl");
		System.out.println(list);

		list.makeEmpty();
		System.out.println("List has " + list.size() + " items.");
		System.out.println(list);
	}
}
/* Screen Dump







Test Case 2:

*/

