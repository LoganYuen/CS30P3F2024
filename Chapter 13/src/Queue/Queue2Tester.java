package Queue;
/*
Program: Queue2Tester.java          Date: November 21, 2024


Purpose: Create a Queue2Tester application that tests the Queue2 class.


Author: Logan Yuen
School: CHHS
Course: Computer Science 30
*/

public class Queue2Tester 
{
	public static void main(String[] args) 
	{
		//Create Queue2 object
		Queue2 q2 = new Queue2(3);
		
		
		//Test enqueue method
		System.out.println("Adding \"red\", \"orange\", and \"yellow\" to queue.\n");
		q2.enqueue("red");
		q2.enqueue("orange");
		q2.enqueue("yellow");
		
		
		//Test front and size methods
		System.out.println("Front of queue: " + q2.front());
		System.out.println("Items in queue: " + q2.size());
		
		
		//Test dequeue and for changes in the size method
		System.out.println("\nDequeueing front item: " + q2.dequeue());
		System.out.println("Items in queue: " + q2.size());
		
		
		//Test enqueue again
		System.out.println("\nAdding \"purple\" to queue.");
		q2.enqueue("purple");
		System.out.println("Front of queue: " + q2.front());
		System.out.println("Items in queue: " + q2.size());
		
		
		//Test dequeue again
		System.out.println("\nDequeueing front item: " + q2.dequeue());
		
		
		//Test enqueue again
		System.out.println("\nAdding \"blue\" to queue.");
		q2.enqueue("blue");
		System.out.println("Front of queue: " + q2.front());
		System.out.println("Items in queue: " + q2.size());
		
		
		//Test multiple dequeues
		System.out.println("\nDequeueing front item: " + q2.dequeue());
		System.out.println("Dequeueing front item: " + q2.dequeue());
		System.out.println("Front of queue: " + q2.front());
		System.out.println("Items in queue: " + q2.size());
		
		
		//Test dequeue again
		System.out.println("\nDequeueing front item: " + q2.dequeue());
		System.out.println("Items in queue: " + q2.size());
	}
}
/* Screen Dump
Test Case 1:
Adding "red", "orange", and "yellow" to queue.

Front of queue: red
Items in queue: 3

Dequeueing front item: red
Items in queue: 2

Adding "purple" to queue.
Front of queue: orange
Items in queue: 3

Dequeueing front item: orange






Test Case 2:
Adding "red", "orange", and "yellow" to queue.

Front of queue: red
Items in queue: 3

Dequeueing front item: red
Items in queue: 2

Adding "purple" to queue.
Front of queue: orange
Items in queue: 3

Dequeueing front item: orange

Adding "blue" to queue.
Front of queue: yellow
Items in queue: 3

Dequeueing front item: yellow
Dequeueing front item: purple
Front of queue: blue
Items in queue: 1

Dequeueing front item: blue
Items in queue: 0
*/

