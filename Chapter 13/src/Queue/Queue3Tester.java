package Queue;
/*
Program: Queue3Tester.java          Date: November 22, 2024


Purpose: Create a Queue3Tester application that tests the Queue3 class.


Author: Logan Yuen
School: CHHS
Course: Computer Science 30
*/

public class Queue3Tester 
{
	public static void main(String[] args) 
	{
		//Create Queue2 object
		Queue3 q3 = new Queue3();
		
		
		//Test enqueue method
		System.out.println("Adding \"keyboard\", \"mouse\", \"monitor\", \"speakers\", and \"mousepad\" to queue.\n");
		q3.enqueue("keyboard");
		q3.enqueue("mouse");
		q3.enqueue("monitor");
		q3.enqueue("speakers");
		q3.enqueue("mousepad");
		
		
		//Test front and size methods
		System.out.println("Front of queue: " + q3.front());
		System.out.println("Items in queue: " + q3.size());
		
		
		//Test dequeue and for changes in the size method
		System.out.println("\nDequeueing front item: " + q3.dequeue());
		System.out.println("Items in queue: " + q3.size());
		
		
		//Test enqueue again
		System.out.println("\nAdding \"headphones\" to queue.");
		q3.enqueue("headphones");
		System.out.println("Front of queue: " + q3.front());
		System.out.println("Items in queue: " + q3.size());
		
		
		//Test dequeue again
		System.out.println("\nDequeueing front item: " + q3.dequeue());
		
		
		//Test enqueue again
		System.out.println("\nAdding \"desk\" to queue.");
		q3.enqueue("desk");
		System.out.println("Front of queue: " + q3.front());
		System.out.println("Items in queue: " + q3.size());
		
		
		//Test multiple dequeues
		System.out.println("\nDequeueing front item: " + q3.dequeue());
		System.out.println("Dequeueing front item: " + q3.dequeue());
		System.out.println("Dequeueing front item: " + q3.dequeue());
		System.out.println("Dequeueing front item: " + q3.dequeue());
		System.out.println("Front of queue: " + q3.front());
		System.out.println("Items in queue: " + q3.size());
		
		
		//Test dequeue again
		System.out.println("\nDequeueing front item: " + q3.dequeue());
		System.out.println("Items in queue: " + q3.size());
	}
}
/* Screen Dump
Test Case 1:
Adding "keyboard", "mouse", and "mousepad" to queue.

Front of queue: keyboard
Items in queue: 3

Dequeueing front item: keyboard
Items in queue: 2

Adding "headphones" to queue.
Front of queue: mouse
Items in queue: 3

Dequeueing front item: mouse

Adding "desk" to queue.
Front of queue: mousepad
Items in queue: 3

Dequeueing front item: mousepad
Dequeueing front item: headphones
Front of queue: desk
Items in queue: 1

Dequeueing front item: desk
Items in queue: 0





Test Case 2:
Adding "keyboard", "mouse", "monitor", "speakers", and "mousepad" to queue.

Front of queue: keyboard
Items in queue: 5

Dequeueing front item: keyboard
Items in queue: 4

Adding "headphones" to queue.
Front of queue: mouse
Items in queue: 5

Dequeueing front item: mouse

Adding "desk" to queue.
Front of queue: monitor
Items in queue: 5

Dequeueing front item: monitor
Dequeueing front item: speakers
Dequeueing front item: mousepad
Dequeueing front item: headphones
Front of queue: desk
Items in queue: 1

Dequeueing front item: desk
Items in queue: 0

*/

